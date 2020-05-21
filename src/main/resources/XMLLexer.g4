/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/** XML lexer derived from ANTLR v4 ref guide book example */
lexer grammar XMLLexer;

// Default "mode": Everything OUTSIDE of a tag
COMMENT     :   '<!--' .*? '-->' ;
CDATA       :   '<![CDATA[' .*? ']]>' ;
/** Scarf all DTD stuff, Entity Declarations like <!ENTITY ...>,
 *  and Notation Declarations <!NOTATION ...>
 */
DTD         :   '<!' .*? '>'            -> skip ;
EntityRef   :   '&' Name ';' ;
CharRef     :   '&#' DIGIT+ ';'
            |   '&#x' HEXDIGIT+ ';'
            ;
SEA_WS      :   (' '|'\t'|'\r'? '\n')+ ;

OPEN        :   '<'                     -> pushMode(INSIDE) ;
XMLDeclOpen :   '<?xml' S               -> pushMode(INSIDE) ;
SPECIAL_OPEN:   '<?' Name               -> more, pushMode(PROC_INSTR) ;
OPEN_SCRIPT_TAG :  '<XMLScript>';
CLOSE_SCRIPT_TAG: '</XMLScript>';
OPEN_SCRIPT_BODY_TAG: '<body>';
CLOSE_SCRIPT_BODY_TAG: '</body>';
OPEN_CONSTANTS_TAG: '<constants>';
CLOSE_CONSTANTS_TAG: '</constants>';
OPEN_ALGORITHM_TAG: '<algorithm>';
CLOSE_ALGORITHM_TAG: '</algorithm>';
BRACKET_OPEN: '(' -> pushMode(ARGUMENTS);
IF: 'if' ->pushMode(CONDITION_OPERATOR);
ELSE: 'else';//->pushMode(ELSE_CONDITION);
TAG_VAR: 'tag' ->pushMode(TAG_VARIABLE_DECLARATION);
DOCUMENT_VAR: 'doc' -> pushMode(DOCUMENT_VARIABLE_DECLARATION);
ATTRIBUTE_VAR: 'attr' ->pushMode(ATTRIBUTE_VARIABLE);
FUNCTION_WORD: 'function' -> pushMode(FUNCTION);
FUNCTION_WORD_SHORT: 'func' -> pushMode(FUNCTION);
APPEND_OPERATOR_DECLARATION: 'append'->pushMode(APPEND_OPERATOR_MODE);
COMMON_OPEN_BLOCK: '{';
COMMON_CLOSE_BLOCK: '}';

mode DOCUMENT_VARIABLE_DECLARATION;
DOCUMENT: 'DOC';
DOCUMENT_WORD     :   [A-z0-9]+;
TABULATION_AND_SPACES: [ \t\r\n]+->skip;
VARIABLE_EQUALS: '=';
DOC_END_OF_DECLARATION: ';'->popMode;

mode TAG_VARIABLE_DECLARATION;
EMPTY_TAG : 'TAG';
TAG_WORD     :   [A-z0-9]+;
TAG_TABULATION_AND_SPACES: [ \t\r\n]+->skip;
TAG_VARIABLE_EQUALS: '=';
TAG_END_OF_DECLARATION: ';'->popMode;

mode ATTRIBUTE_VARIABLE;
ATTRIBUTE: 'ATTR';
ATTRIBUTE_WORD     :   [A-z0-9]+;
ATTRIBUTE_DELIMITER: ':';
ATTRIBUTE_TABULATION_AND_SPACES: [ \t\r\n]+->skip;
ATTRIBUTE_EQUALS: '=';
ATTRIBUTE_END_OF_DECLARATION: ';'->popMode;

mode FUNCTION;
FUNC_NAME: [A-z0-9]+;
FUNC_OPEN_CODE_BLOCK: '{';
FUNC_IGNORING_SYMBOLS_SPACES: [ \t\r\n]+->skip;
FUNC_CLOSE_CODE_BLOCK: '}'->popMode;

mode APPEND_OPERATOR_MODE;
APPEND_OPERATOR_IGNORING_SYMBOLS_SPACES: [ \t\r\n]+->skip;
APPEND_OPERATOR_WORD: [A-z0-9]+;
TO_SYMBOL: ':';
END_OF_OPERATOR: ';'->popMode;

mode CONDITION_OPERATOR;
CONDITION_WORD: [A-z0-9]+;
CONDITION_BRACKETS_OPEN: '(';
CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES: [ \t\r\n]+->skip;
CONDITION_BRACKETS_CLOSE: ')'->popMode;
HAS_CONDITION: 'has';
EQUALS_CONDITION: '==';
OPEN_BLOCK: '{';
CLOSE_BLOCK: '}';

mode ELSE_CONDITION;
ELSE_CONDITION_OPERATOR_IGNORING_SYMBOLS_SPACES: [ \t\r\n]+->skip;
ELSE_OPEN_BLOCK: '{';
ELSE_CLOSE_BLOCK: '}'->popMode;



mode ARGUMENTS;
BRACKET_CLOSE: ')'->popMode;
EXPRESSION_ARGUMENTS        :   ~[<&)]+;        // match any 16 bit char other than < and & and )






// ----------------- Everything INSIDE of a tag ---------------------
mode INSIDE;
TAG_DECLARATION: 'tag';
TAG_NAME_ATTR: 'name';
TAG_VALUE_ATTR: 'value';
CLOSE       :   '>'                     -> popMode ;
SPECIAL_CLOSE:  '?>'                    -> popMode ; // close <?xml...?>
SLASH_CLOSE :   '/>'                    -> popMode ;
SLASH       :   '/' ;
EQUALS      :   '=' ;
STRING      :   '"' ~[<"]* '"'
            |   '\'' ~[<']* '\''
            ;
Name        :   NameStartChar NameChar* ;
S           :   [ \t\r\n]               -> skip ;

fragment
HEXDIGIT    :   [a-fA-F0-9] ;

fragment
DIGIT       :   [0-9] ;

fragment
NameChar    :   NameStartChar
            |   '-' | '_' | '.' | DIGIT
            |   '\u00B7'
            |   '\u0300'..'\u036F'
            |   '\u203F'..'\u2040'
            ;

fragment
NameStartChar
            :   [:a-zA-Z]
            |   '\u2070'..'\u218F'
            |   '\u2C00'..'\u2FEF'
            |   '\u3001'..'\uD7FF'
            |   '\uF900'..'\uFDCF'
            |   '\uFDF0'..'\uFFFD'
            ;

// ----------------- Handle <? ... ?> ---------------------
mode PROC_INSTR;

PI          :   '?>'                    -> popMode ; // close <?...?>
IGNORE      :   .                       -> more ;


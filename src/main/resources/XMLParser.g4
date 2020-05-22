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

/** XML customBaseListener derived from ANTLR v4 ref guide book example */
parser grammar XMLParser;

options {tokenVocab=XMLLexer;}

tag: simple_tag|complex_tag;
tag_name_attr: TAG_NAME_ATTR EQUALS STRING;
tag_value_attr: TAG_VALUE_ATTR EQUALS STRING;

simple_tag: misc* OPEN TAG_DECLARATION tag_name_attr tag_value_attr attribute* SLASH_CLOSE misc*;

complex_tag: misc* OPEN TAG_DECLARATION tag_name_attr tag_value_attr attribute* CLOSE tag* complex_tag_close misc*;
complex_tag_close: misc* OPEN '/' TAG_DECLARATION CLOSE misc* ;

tagVariable: misc* TAG_VAR tagVariableName TAG_VARIABLE_EQUALS (tagVariableValue|EMPTY_TAG) TAG_END_OF_DECLARATION misc*;
documentVariable: misc* DOCUMENT_VAR docVariableName VARIABLE_EQUALS docVariableValue DOC_END_OF_DECLARATION misc*;
attrVariable: misc* ATTRIBUTE_VAR ATTRIBUTE_WORD ATTRIBUTE_EQUALS attrVariableValue ATTRIBUTE_END_OF_DECLARATION misc*;
tagVariableName: TAG_WORD;
tagVariableValue: TAG_WORD;
docVariableName: DOCUMENT_WORD;
docVariableValue: DOCUMENT_WORD;
attrVariableValue: attrName ATTRIBUTE_DELIMITER attrValue;
attrName: ATTRIBUTE_WORD;
attrValue: ATTRIBUTE_WORD;
variable: tagVariable|documentVariable|attrVariable;
operator: conditionOperator|appendOperator;

appendOperator: misc* APPEND_OPERATOR_DECLARATION appendOperatorChildName appendOperatorToWord appendOperatorParentName END_OF_OPERATOR;
appendOperatorChildName: APPEND_OPERATOR_WORD;
appendOperatorParentName: APPEND_OPERATOR_WORD;
appendOperatorToWord: TO_SYMBOL;

function: misc* (FUNCTION_WORD|FUNCTION_WORD_SHORT) FUNC_NAME FUNC_OPEN_CODE_BLOCK insideBlockCode? FUNC_CLOSE_CODE_BLOCK misc*;

conditionOperator: misc* IF misc* CONDITION_BRACKETS_OPEN misc* CONDITION_WORD conditionType CONDITION_WORD misc* CONDITION_BRACKETS_CLOSE ifCondition elseCondition? conditionExitFlag;
conditionType: EQUALS_CONDITION;
ifCondition: misc* COMMON_OPEN_BLOCK insideBlockCode? COMMON_CLOSE_BLOCK misc*;
conditionExitFlag: CONDITION_END;
elseCondition: ELSE misc* COMMON_OPEN_BLOCK  insideBlockCode? COMMON_CLOSE_BLOCK;

code: misc* (tagVariable|documentVariable|attrVariable|conditionOperator|function|appendOperator)* misc* ;
insideBlockCode: misc* (variable|operator)* misc*;
script: prolog? misc* scriptOpen constants scriptBodyOpen code? scriptBodyClose  scriptClose;

scriptOpen: misc* OPEN_SCRIPT_TAG misc*;
scriptClose: misc* CLOSE_SCRIPT_TAG misc*;
scriptBodyOpen: misc* OPEN_SCRIPT_BODY_TAG misc*;
scriptBodyClose: misc* CLOSE_SCRIPT_BODY_TAG misc*;
constants: OPEN_CONSTANTS_TAG (documentVariable|tagVariable|attrVariable)* CLOSE_CONSTANTS_TAG;
prolog      :   XMLDeclOpen attribute* SPECIAL_CLOSE ;


reference   :   EntityRef | CharRef ;

attribute   :   Name EQUALS STRING ; // Our STRING is AttValue in spec

/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata    :   EXPRESSION_ARGUMENTS | SEA_WS ;

misc        :   COMMENT | SEA_WS ;

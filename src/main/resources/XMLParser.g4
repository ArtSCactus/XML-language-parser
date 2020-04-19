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

conditionOperator: IF misc* BRACKET_OPEN  BRACKET_CLOSE misc* OPEN_BLOCK misc* CLOSE_BLOCK misc* ELSE misc* OPEN_BLOCK misc* CLOSE_BLOCK*;
cycleOperator: misc* FOR misc* BRACKET_OPEN BRACKET_CLOSE misc* OPEN_BLOCK misc* CLOSE_BLOCK misc*;

code: misc* (conditionOperator|cycleOperator)* misc* ;

script: prolog? misc* scriptOpen constants scriptBodyOpen scriptBodyClose code scriptClose;

scriptOpen: misc* OPEN_SCRIPT_TAG misc*;
scriptClose: misc* CLOSE_SCRIPT_TAG misc*;
scriptBodyOpen: misc* OPEN_SCRIPT_BODY_TAG misc*;
scriptBodyClose: misc* CLOSE_SCRIPT_BODY_TAG misc*;
constants: OPEN_CONSTANTS_TAG (complex_tag | simple_tag)* CLOSE_CONSTANTS_TAG;
prolog      :   XMLDeclOpen attribute* SPECIAL_CLOSE ;
//cycleOperatorExpression: (WORD misc* IN misc* WORD| NUMBER);


reference   :   EntityRef | CharRef ;

attribute   :   Name '=' STRING ; // Our STRING is AttValue in spec

/** ``All text that is not markup constitutes the character data of
 *  the document.''
 */
chardata    :   TEXT | SEA_WS ;

misc        :   COMMENT | SEA_WS ;

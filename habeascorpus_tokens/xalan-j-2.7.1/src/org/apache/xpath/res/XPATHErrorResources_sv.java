/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPATHErrorResources_sv.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPATHErrorResources_sv.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
/** * Set up error messages. * We build a two dimensional array of message keys and * message strings. In order to add a new message here, * you need to first add a Static string constant for the * Key and update the contents array with Key, Value pair * Also you need to update the count of messages(MAX_CODE)or * the count of warnings(MAX_WARNING) [ Information purpose only] * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Set up error messages. We build a two dimensional array of message keys and message strings. In order to add a new message here, you need to first add a Static string constant for the Key and update the contents array with Key, Value pair Also you need to update the count of messages(MAX_CODE)or the count of warnings(MAX_WARNING) [ Information purpose only] @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
XPATHErrorResources_sv	TokenNameIdentifier	 XPATH Error Resources sv
extends	TokenNameextends	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
{	TokenNameLBRACE	
/** Field MAX_CODE */	TokenNameCOMMENT_JAVADOC	 Field MAX_CODE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
=	TokenNameEQUAL	
108	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this is needed to keep track of the number of messages 	TokenNameCOMMENT_LINE	this is needed to keep track of the number of messages 
/** Field MAX_WARNING */	TokenNameCOMMENT_JAVADOC	 Field MAX_WARNING 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// this is needed to keep track of the number of warnings 	TokenNameCOMMENT_LINE	this is needed to keep track of the number of warnings 
/** Field MAX_OTHERS */	TokenNameCOMMENT_JAVADOC	 Field MAX_OTHERS 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_OTHERS	TokenNameIdentifier	 MAX  OTHERS
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Field MAX_MESSAGES */	TokenNameCOMMENT_JAVADOC	 Field MAX_MESSAGES 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_MESSAGES	TokenNameIdentifier	 MAX  MESSAGES
=	TokenNameEQUAL	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
+	TokenNamePLUS	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Error messages... 	TokenNameCOMMENT_LINE	Error messages... 
/** * Get the association list. * * @return The association list. */	TokenNameCOMMENT_JAVADOC	 Get the association list. * @return The association list. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getContents	TokenNameIdentifier	 get Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
/** Field ERROR0000 */	TokenNameCOMMENT_JAVADOC	 Field ERROR0000 
//public static final int ERROR0000 = 0; 	TokenNameCOMMENT_LINE	public static final int ERROR0000 = 0; 
{	TokenNameLBRACE	
"ERROR0000"	TokenNameStringLiteral	ERROR0000
,	TokenNameCOMMA	
"{0}"	TokenNameStringLiteral	{0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CURRENT_NOT_ALLOWED_IN_MATCH */	TokenNameCOMMENT_JAVADOC	 Field ER_CURRENT_NOT_ALLOWED_IN_MATCH 
//public static final int ER_CURRENT_NOT_ALLOWED_IN_MATCH = 1; 	TokenNameCOMMENT_LINE	public static final int ER_CURRENT_NOT_ALLOWED_IN_MATCH = 1; 
{	TokenNameLBRACE	
ER_CURRENT_NOT_ALLOWED_IN_MATCH	TokenNameIdentifier	 ER  CURRENT  NOT  ALLOWED  IN  MATCH
,	TokenNameCOMMA	
"Funktionen current() Šr inte tillŒten i ett matchningsmšnster!"	TokenNameStringLiteral	Funktionen current() Šr inte tillŒten i ett matchningsmšnster!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CURRENT_TAKES_NO_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_CURRENT_TAKES_NO_ARGS 
//public static final int ER_CURRENT_TAKES_NO_ARGS = 2; 	TokenNameCOMMENT_LINE	public static final int ER_CURRENT_TAKES_NO_ARGS = 2; 
{	TokenNameLBRACE	
ER_CURRENT_TAKES_NO_ARGS	TokenNameIdentifier	 ER  CURRENT  TAKES  NO  ARGS
,	TokenNameCOMMA	
"Funktionen current() tar inte emot argument!"	TokenNameStringLiteral	Funktionen current() tar inte emot argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_DOCUMENT_REPLACED */	TokenNameCOMMENT_JAVADOC	 Field ER_DOCUMENT_REPLACED 
//public static final int ER_DOCUMENT_REPLACED = 3; 	TokenNameCOMMENT_LINE	public static final int ER_DOCUMENT_REPLACED = 3; 
{	TokenNameLBRACE	
ER_DOCUMENT_REPLACED	TokenNameIdentifier	 ER  DOCUMENT  REPLACED
,	TokenNameCOMMA	
"Implementeringen av funktionen document() har ersatts av org.apache.xalan.xslt.FuncDocument!"	TokenNameStringLiteral	Implementeringen av funktionen document() har ersatts av org.apache.xalan.xslt.FuncDocument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CONTEXT_HAS_NO_OWNERDOC */	TokenNameCOMMENT_JAVADOC	 Field ER_CONTEXT_HAS_NO_OWNERDOC 
//public static final int ER_CONTEXT_HAS_NO_OWNERDOC = 4; 	TokenNameCOMMENT_LINE	public static final int ER_CONTEXT_HAS_NO_OWNERDOC = 4; 
{	TokenNameLBRACE	
ER_CONTEXT_HAS_NO_OWNERDOC	TokenNameIdentifier	 ER  CONTEXT  HAS  NO  OWNERDOC
,	TokenNameCOMMA	
"Kontext saknar Šgardokument!"	TokenNameStringLiteral	Kontext saknar Šgardokument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_LOCALNAME_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_LOCALNAME_HAS_TOO_MANY_ARGS 
//public static final int ER_LOCALNAME_HAS_TOO_MANY_ARGS = 5; 	TokenNameCOMMENT_LINE	public static final int ER_LOCALNAME_HAS_TOO_MANY_ARGS = 5; 
{	TokenNameLBRACE	
ER_LOCALNAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  LOCALNAME  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"local-name() har fšr mŒnga argument."	TokenNameStringLiteral	local-name() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NAMESPACEURI_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_NAMESPACEURI_HAS_TOO_MANY_ARGS 
//public static final int ER_NAMESPACEURI_HAS_TOO_MANY_ARGS = 6; 	TokenNameCOMMENT_LINE	public static final int ER_NAMESPACEURI_HAS_TOO_MANY_ARGS = 6; 
{	TokenNameLBRACE	
ER_NAMESPACEURI_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAMESPACEURI  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"namespace-uri() har fšr mŒnga argument."	TokenNameStringLiteral	namespace-uri() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS 
//public static final int ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS = 7; 	TokenNameCOMMENT_LINE	public static final int ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS = 7; 
{	TokenNameLBRACE	
ER_NORMALIZESPACE_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NORMALIZESPACE  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"normalize-space() har fšr mŒnga argument."	TokenNameStringLiteral	normalize-space() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NUMBER_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_NUMBER_HAS_TOO_MANY_ARGS 
//public static final int ER_NUMBER_HAS_TOO_MANY_ARGS = 8; 	TokenNameCOMMENT_LINE	public static final int ER_NUMBER_HAS_TOO_MANY_ARGS = 8; 
{	TokenNameLBRACE	
ER_NUMBER_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NUMBER  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"number() har fšr mŒnga argument."	TokenNameStringLiteral	number() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NAME_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_NAME_HAS_TOO_MANY_ARGS 
//public static final int ER_NAME_HAS_TOO_MANY_ARGS = 9; 	TokenNameCOMMENT_LINE	public static final int ER_NAME_HAS_TOO_MANY_ARGS = 9; 
{	TokenNameLBRACE	
ER_NAME_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  NAME  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"name() har fšr mŒnga argument."	TokenNameStringLiteral	name() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_STRING_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_STRING_HAS_TOO_MANY_ARGS 
//public static final int ER_STRING_HAS_TOO_MANY_ARGS = 10; 	TokenNameCOMMENT_LINE	public static final int ER_STRING_HAS_TOO_MANY_ARGS = 10; 
{	TokenNameLBRACE	
ER_STRING_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRING  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"string() har fšr mŒnga argument."	TokenNameStringLiteral	string() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_STRINGLENGTH_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_STRINGLENGTH_HAS_TOO_MANY_ARGS 
//public static final int ER_STRINGLENGTH_HAS_TOO_MANY_ARGS = 11; 	TokenNameCOMMENT_LINE	public static final int ER_STRINGLENGTH_HAS_TOO_MANY_ARGS = 11; 
{	TokenNameLBRACE	
ER_STRINGLENGTH_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  STRINGLENGTH  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"string.length() har fšr mŒnga argument."	TokenNameStringLiteral	string.length() har fšr mŒnga argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_TRANSLATE_TAKES_3_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_TRANSLATE_TAKES_3_ARGS 
//public static final int ER_TRANSLATE_TAKES_3_ARGS = 12; 	TokenNameCOMMENT_LINE	public static final int ER_TRANSLATE_TAKES_3_ARGS = 12; 
{	TokenNameLBRACE	
ER_TRANSLATE_TAKES_3_ARGS	TokenNameIdentifier	 ER  TRANSLATE  TAKES 3  ARGS
,	TokenNameCOMMA	
"Funktionen translate() tar emot tre argument!"	TokenNameStringLiteral	Funktionen translate() tar emot tre argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNPARSEDENTITYURI_TAKES_1_ARG */	TokenNameCOMMENT_JAVADOC	 Field ER_UNPARSEDENTITYURI_TAKES_1_ARG 
//public static final int ER_UNPARSEDENTITYURI_TAKES_1_ARG = 13; 	TokenNameCOMMENT_LINE	public static final int ER_UNPARSEDENTITYURI_TAKES_1_ARG = 13; 
{	TokenNameLBRACE	
ER_UNPARSEDENTITYURI_TAKES_1_ARG	TokenNameIdentifier	 ER  UNPARSEDENTITYURI  TAKES 1  ARG
,	TokenNameCOMMA	
"Funktionen unparsed-entity-uri borde ta emot ett argument!"	TokenNameStringLiteral	Funktionen unparsed-entity-uri borde ta emot ett argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NAMESPACEAXIS_NOT_IMPLEMENTED */	TokenNameCOMMENT_JAVADOC	 Field ER_NAMESPACEAXIS_NOT_IMPLEMENTED 
//public static final int ER_NAMESPACEAXIS_NOT_IMPLEMENTED = 14; 	TokenNameCOMMENT_LINE	public static final int ER_NAMESPACEAXIS_NOT_IMPLEMENTED = 14; 
{	TokenNameLBRACE	
ER_NAMESPACEAXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  NAMESPACEAXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
"Namespace-axel inte implementerad Šn!"	TokenNameStringLiteral	Namespace-axel inte implementerad Šn!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNKNOWN_AXIS */	TokenNameCOMMENT_JAVADOC	 Field ER_UNKNOWN_AXIS 
//public static final int ER_UNKNOWN_AXIS = 15; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_AXIS = 15; 
{	TokenNameLBRACE	
ER_UNKNOWN_AXIS	TokenNameIdentifier	 ER  UNKNOWN  AXIS
,	TokenNameCOMMA	
"okŠnd axel: {0}"	TokenNameStringLiteral	okŠnd axel: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNKNOWN_MATCH_OPERATION */	TokenNameCOMMENT_JAVADOC	 Field ER_UNKNOWN_MATCH_OPERATION 
//public static final int ER_UNKNOWN_MATCH_OPERATION = 16; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_MATCH_OPERATION = 16; 
{	TokenNameLBRACE	
ER_UNKNOWN_MATCH_OPERATION	TokenNameIdentifier	 ER  UNKNOWN  MATCH  OPERATION
,	TokenNameCOMMA	
"okŠnd matchningshandling!"	TokenNameStringLiteral	okŠnd matchningshandling!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_INCORRECT_ARG_LENGTH */	TokenNameCOMMENT_JAVADOC	 Field ER_INCORRECT_ARG_LENGTH 
//public static final int ER_INCORRECT_ARG_LENGTH = 17; 	TokenNameCOMMENT_LINE	public static final int ER_INCORRECT_ARG_LENGTH = 17; 
{	TokenNameLBRACE	
ER_INCORRECT_ARG_LENGTH	TokenNameIdentifier	 ER  INCORRECT  ARG  LENGTH
,	TokenNameCOMMA	
"Nodtests argumentlŠngd i processing-instruction() Šr inte korrekt!"	TokenNameStringLiteral	Nodtests argumentlŠngd i processing-instruction() Šr inte korrekt!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANT_CONVERT_TO_NUMBER */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_NUMBER 
//public static final int ER_CANT_CONVERT_TO_NUMBER = 18; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_NUMBER = 18; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_NUMBER	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NUMBER
,	TokenNameCOMMA	
"Kan inte konvertera {0} till ett nummer"	TokenNameStringLiteral	Kan inte konvertera {0} till ett nummer
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANT_CONVERT_TO_NODELIST */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_NODELIST 
//public static final int ER_CANT_CONVERT_TO_NODELIST = 19; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_NODELIST = 19; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_NODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  NODELIST
,	TokenNameCOMMA	
"Kan inte konvertera {0} till en NodeList!"	TokenNameStringLiteral	Kan inte konvertera {0} till en NodeList!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANT_CONVERT_TO_MUTABLENODELIST */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_MUTABLENODELIST 
//public static final int ER_CANT_CONVERT_TO_MUTABLENODELIST = 20; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_MUTABLENODELIST = 20; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_MUTABLENODELIST	TokenNameIdentifier	 ER  CANT  CONVERT  TO  MUTABLENODELIST
,	TokenNameCOMMA	
"Kan inte konvertera {0} till en NodeSetDTM!"	TokenNameStringLiteral	Kan inte konvertera {0} till en NodeSetDTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANT_CONVERT_TO_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_TYPE 
//public static final int ER_CANT_CONVERT_TO_TYPE = 21; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_TYPE = 21; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_TYPE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  TYPE
,	TokenNameCOMMA	
"Kan inte konvertera {0} till en type//{1}"	TokenNameStringLiteral	Kan inte konvertera {0} till en type//{1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EXPECTED_MATCH_PATTERN */	TokenNameCOMMENT_JAVADOC	 Field ER_EXPECTED_MATCH_PATTERN 
//public static final int ER_EXPECTED_MATCH_PATTERN = 22; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_MATCH_PATTERN = 22; 
{	TokenNameLBRACE	
ER_EXPECTED_MATCH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  MATCH  PATTERN
,	TokenNameCOMMA	
"Matchningsmšnster i getMatchScore fšrvŠntat!"	TokenNameStringLiteral	Matchningsmšnster i getMatchScore fšrvŠntat!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_COULDNOT_GET_VAR_NAMED */	TokenNameCOMMENT_JAVADOC	 Field ER_COULDNOT_GET_VAR_NAMED 
//public static final int ER_COULDNOT_GET_VAR_NAMED = 23; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNOT_GET_VAR_NAMED = 23; 
{	TokenNameLBRACE	
ER_COULDNOT_GET_VAR_NAMED	TokenNameIdentifier	 ER  COULDNOT  GET  VAR  NAMED
,	TokenNameCOMMA	
"Kunde inte hŠmta variabeln {0}"	TokenNameStringLiteral	Kunde inte hŠmta variabeln {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNKNOWN_OPCODE */	TokenNameCOMMENT_JAVADOC	 Field ER_UNKNOWN_OPCODE 
//public static final int ER_UNKNOWN_OPCODE = 24; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_OPCODE = 24; 
{	TokenNameLBRACE	
ER_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  UNKNOWN  OPCODE
,	TokenNameCOMMA	
"FEL! OkŠnd op-kod: {0}"	TokenNameStringLiteral	FEL! OkŠnd op-kod: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EXTRA_ILLEGAL_TOKENS */	TokenNameCOMMENT_JAVADOC	 Field ER_EXTRA_ILLEGAL_TOKENS 
//public static final int ER_EXTRA_ILLEGAL_TOKENS = 25; 	TokenNameCOMMENT_LINE	public static final int ER_EXTRA_ILLEGAL_TOKENS = 25; 
{	TokenNameLBRACE	
ER_EXTRA_ILLEGAL_TOKENS	TokenNameIdentifier	 ER  EXTRA  ILLEGAL  TOKENS
,	TokenNameCOMMA	
"Ytterligare otillŒtna tecken: {0}"	TokenNameStringLiteral	Ytterligare otillŒtna tecken: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EXPECTED_DOUBLE_QUOTE */	TokenNameCOMMENT_JAVADOC	 Field ER_EXPECTED_DOUBLE_QUOTE 
//public static final int ER_EXPECTED_DOUBLE_QUOTE = 26; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_DOUBLE_QUOTE = 26; 
{	TokenNameLBRACE	
ER_EXPECTED_DOUBLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  DOUBLE  QUOTE
,	TokenNameCOMMA	
"Litteral omges av fel sorts citationstecken... dubbla citationstecken fšrvŠntade!"	TokenNameStringLiteral	Litteral omges av fel sorts citationstecken... dubbla citationstecken fšrvŠntade!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EXPECTED_SINGLE_QUOTE */	TokenNameCOMMENT_JAVADOC	 Field ER_EXPECTED_SINGLE_QUOTE 
//public static final int ER_EXPECTED_SINGLE_QUOTE = 27; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_SINGLE_QUOTE = 27; 
{	TokenNameLBRACE	
ER_EXPECTED_SINGLE_QUOTE	TokenNameIdentifier	 ER  EXPECTED  SINGLE  QUOTE
,	TokenNameCOMMA	
"Litteral omges av fel sorts citationstecken... enkla citationstecken fšrvŠntade!"	TokenNameStringLiteral	Litteral omges av fel sorts citationstecken... enkla citationstecken fšrvŠntade!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EMPTY_EXPRESSION */	TokenNameCOMMENT_JAVADOC	 Field ER_EMPTY_EXPRESSION 
//public static final int ER_EMPTY_EXPRESSION = 28; 	TokenNameCOMMENT_LINE	public static final int ER_EMPTY_EXPRESSION = 28; 
{	TokenNameLBRACE	
ER_EMPTY_EXPRESSION	TokenNameIdentifier	 ER  EMPTY  EXPRESSION
,	TokenNameCOMMA	
"Tomt uttryck!"	TokenNameStringLiteral	Tomt uttryck!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EXPECTED_BUT_FOUND */	TokenNameCOMMENT_JAVADOC	 Field ER_EXPECTED_BUT_FOUND 
//public static final int ER_EXPECTED_BUT_FOUND = 29; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_BUT_FOUND = 29; 
{	TokenNameLBRACE	
ER_EXPECTED_BUT_FOUND	TokenNameIdentifier	 ER  EXPECTED  BUT  FOUND
,	TokenNameCOMMA	
"{0} fšrvŠntat, men hittade: {1}"	TokenNameStringLiteral	{0} fšrvŠntat, men hittade: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_INCORRECT_PROGRAMMER_ASSERTION */	TokenNameCOMMENT_JAVADOC	 Field ER_INCORRECT_PROGRAMMER_ASSERTION 
//public static final int ER_INCORRECT_PROGRAMMER_ASSERTION = 30; 	TokenNameCOMMENT_LINE	public static final int ER_INCORRECT_PROGRAMMER_ASSERTION = 30; 
{	TokenNameLBRACE	
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
,	TokenNameCOMMA	
"Programmerares fšrsŠkran Šr inte korrekt! - {0}"	TokenNameStringLiteral	Programmerares fšrsŠkran Šr inte korrekt! - {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL */	TokenNameCOMMENT_JAVADOC	 Field ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL 
//public static final int ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL = 31; 	TokenNameCOMMENT_LINE	public static final int ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL = 31; 
{	TokenNameLBRACE	
ER_BOOLEAN_ARG_NO_LONGER_OPTIONAL	TokenNameIdentifier	 ER  BOOLEAN  ARG  NO  LONGER  OPTIONAL
,	TokenNameCOMMA	
"boolean(...)-argument Šr inte lŠngre valfri med 19990709 XPath-utkast."	TokenNameStringLiteral	boolean(...)-argument Šr inte lŠngre valfri med 19990709 XPath-utkast.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG */	TokenNameCOMMENT_JAVADOC	 Field ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG 
//public static final int ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG = 32; 	TokenNameCOMMENT_LINE	public static final int ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG = 32; 
{	TokenNameLBRACE	
ER_FOUND_COMMA_BUT_NO_PRECEDING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  PRECEDING  ARG
,	TokenNameCOMMA	
"Hittade ',' men inget fšregŒende argument!"	TokenNameStringLiteral	Hittade ',' men inget fšregŒende argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG */	TokenNameCOMMENT_JAVADOC	 Field ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG 
//public static final int ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG = 33; 	TokenNameCOMMENT_LINE	public static final int ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG = 33; 
{	TokenNameLBRACE	
ER_FOUND_COMMA_BUT_NO_FOLLOWING_ARG	TokenNameIdentifier	 ER  FOUND  COMMA  BUT  NO  FOLLOWING  ARG
,	TokenNameCOMMA	
"Hittade ',' men inget efterfšljande argument!"	TokenNameStringLiteral	Hittade ',' men inget efterfšljande argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_PREDICATE_ILLEGAL_SYNTAX */	TokenNameCOMMENT_JAVADOC	 Field ER_PREDICATE_ILLEGAL_SYNTAX 
//public static final int ER_PREDICATE_ILLEGAL_SYNTAX = 34; 	TokenNameCOMMENT_LINE	public static final int ER_PREDICATE_ILLEGAL_SYNTAX = 34; 
{	TokenNameLBRACE	
ER_PREDICATE_ILLEGAL_SYNTAX	TokenNameIdentifier	 ER  PREDICATE  ILLEGAL  SYNTAX
,	TokenNameCOMMA	
"'..[predikat]' or '.[predikat]' Šr otillŒten syntax. AnvŠnd 'self::node()[predikat]' istŠllet."	TokenNameStringLiteral	'..[predikat]' or '.[predikat]' Šr otillŒten syntax. AnvŠnd 'self::node()[predikat]' istŠllet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_ILLEGAL_AXIS_NAME */	TokenNameCOMMENT_JAVADOC	 Field ER_ILLEGAL_AXIS_NAME 
//public static final int ER_ILLEGAL_AXIS_NAME = 35; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_AXIS_NAME = 35; 
{	TokenNameLBRACE	
ER_ILLEGAL_AXIS_NAME	TokenNameIdentifier	 ER  ILLEGAL  AXIS  NAME
,	TokenNameCOMMA	
"otillŒtet axel-namn: {0}"	TokenNameStringLiteral	otillŒtet axel-namn: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNKNOWN_NODETYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_UNKNOWN_NODETYPE 
//public static final int ER_UNKNOWN_NODETYPE = 36; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_NODETYPE = 36; 
{	TokenNameLBRACE	
ER_UNKNOWN_NODETYPE	TokenNameIdentifier	 ER  UNKNOWN  NODETYPE
,	TokenNameCOMMA	
"okŠnd nodtyp: {0}"	TokenNameStringLiteral	okŠnd nodtyp: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_PATTERN_LITERAL_NEEDS_BE_QUOTED */	TokenNameCOMMENT_JAVADOC	 Field ER_PATTERN_LITERAL_NEEDS_BE_QUOTED 
//public static final int ER_PATTERN_LITERAL_NEEDS_BE_QUOTED = 37; 	TokenNameCOMMENT_LINE	public static final int ER_PATTERN_LITERAL_NEEDS_BE_QUOTED = 37; 
{	TokenNameLBRACE	
ER_PATTERN_LITERAL_NEEDS_BE_QUOTED	TokenNameIdentifier	 ER  PATTERN  LITERAL  NEEDS  BE  QUOTED
,	TokenNameCOMMA	
"Mšnsterlitteral {0} mŒste sŠttas inom citationstecken!"	TokenNameStringLiteral	Mšnsterlitteral {0} mŒste sŠttas inom citationstecken!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_COULDNOT_BE_FORMATTED_TO_NUMBER */	TokenNameCOMMENT_JAVADOC	 Field ER_COULDNOT_BE_FORMATTED_TO_NUMBER 
//public static final int ER_COULDNOT_BE_FORMATTED_TO_NUMBER = 38; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNOT_BE_FORMATTED_TO_NUMBER = 38; 
{	TokenNameLBRACE	
ER_COULDNOT_BE_FORMATTED_TO_NUMBER	TokenNameIdentifier	 ER  COULDNOT  BE  FORMATTED  TO  NUMBER
,	TokenNameCOMMA	
"{0} kunde inte formateras till ett nummer"	TokenNameStringLiteral	{0} kunde inte formateras till ett nummer
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_COULDNOT_CREATE_XMLPROCESSORLIAISON */	TokenNameCOMMENT_JAVADOC	 Field ER_COULDNOT_CREATE_XMLPROCESSORLIAISON 
//public static final int ER_COULDNOT_CREATE_XMLPROCESSORLIAISON = 39; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNOT_CREATE_XMLPROCESSORLIAISON = 39; 
{	TokenNameLBRACE	
ER_COULDNOT_CREATE_XMLPROCESSORLIAISON	TokenNameIdentifier	 ER  COULDNOT  CREATE  XMLPROCESSORLIAISON
,	TokenNameCOMMA	
"Kunde inte skapa XML TransformerFactory Liaison: {0}"	TokenNameStringLiteral	Kunde inte skapa XML TransformerFactory Liaison: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_DIDNOT_FIND_XPATH_SELECT_EXP */	TokenNameCOMMENT_JAVADOC	 Field ER_DIDNOT_FIND_XPATH_SELECT_EXP 
//public static final int ER_DIDNOT_FIND_XPATH_SELECT_EXP = 40; 	TokenNameCOMMENT_LINE	public static final int ER_DIDNOT_FIND_XPATH_SELECT_EXP = 40; 
{	TokenNameLBRACE	
ER_DIDNOT_FIND_XPATH_SELECT_EXP	TokenNameIdentifier	 ER  DIDNOT  FIND  XPATH  SELECT  EXP
,	TokenNameCOMMA	
"Fel! Hittade inte xpath select-uttryck (-select)."	TokenNameStringLiteral	Fel! Hittade inte xpath select-uttryck (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH */	TokenNameCOMMENT_JAVADOC	 Field ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH 
//public static final int ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH = 41; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH = 41; 
{	TokenNameLBRACE	
ER_COULDNOT_FIND_ENDOP_AFTER_OPLOCATIONPATH	TokenNameIdentifier	 ER  COULDNOT  FIND  ENDOP  AFTER  OPLOCATIONPATH
,	TokenNameCOMMA	
"FEL! Hittade inte ENDOP efter OP_LOCATIONPATH"	TokenNameStringLiteral	FEL! Hittade inte ENDOP efter OP_LOCATIONPATH
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_ERROR_OCCURED */	TokenNameCOMMENT_JAVADOC	 Field ER_ERROR_OCCURED 
//public static final int ER_ERROR_OCCURED = 42; 	TokenNameCOMMENT_LINE	public static final int ER_ERROR_OCCURED = 42; 
{	TokenNameLBRACE	
ER_ERROR_OCCURED	TokenNameIdentifier	 ER  ERROR  OCCURED
,	TokenNameCOMMA	
"Fel intrŠffade!"	TokenNameStringLiteral	Fel intrŠffade!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_ILLEGAL_VARIABLE_REFERENCE */	TokenNameCOMMENT_JAVADOC	 Field ER_ILLEGAL_VARIABLE_REFERENCE 
//public static final int ER_ILLEGAL_VARIABLE_REFERENCE = 43; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_VARIABLE_REFERENCE = 43; 
{	TokenNameLBRACE	
ER_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 ER  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
"VariableReference angiven fšr variabel som Šr utanfšr sammanhanget eller som saknar definition! Namn = {0}"	TokenNameStringLiteral	VariableReference angiven fšr variabel som Šr utanfšr sammanhanget eller som saknar definition! Namn = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_AXES_NOT_ALLOWED */	TokenNameCOMMENT_JAVADOC	 Field ER_AXES_NOT_ALLOWED 
//public static final int ER_AXES_NOT_ALLOWED = 44; 	TokenNameCOMMENT_LINE	public static final int ER_AXES_NOT_ALLOWED = 44; 
{	TokenNameLBRACE	
ER_AXES_NOT_ALLOWED	TokenNameIdentifier	 ER  AXES  NOT  ALLOWED
,	TokenNameCOMMA	
"Enbart barn::- och attribut::- axlar Šr tillŒtna i matchningsmšnster! Regelvidriga axlar = {0}"	TokenNameStringLiteral	Enbart barn::- och attribut::- axlar Šr tillŒtna i matchningsmšnster! Regelvidriga axlar = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_KEY_HAS_TOO_MANY_ARGS */	TokenNameCOMMENT_JAVADOC	 Field ER_KEY_HAS_TOO_MANY_ARGS 
//public static final int ER_KEY_HAS_TOO_MANY_ARGS = 45; 	TokenNameCOMMENT_LINE	public static final int ER_KEY_HAS_TOO_MANY_ARGS = 45; 
{	TokenNameLBRACE	
ER_KEY_HAS_TOO_MANY_ARGS	TokenNameIdentifier	 ER  KEY  HAS  TOO  MANY  ARGS
,	TokenNameCOMMA	
"key() har ett felaktigt antal argument."	TokenNameStringLiteral	key() har ett felaktigt antal argument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_COUNT_TAKES_1_ARG */	TokenNameCOMMENT_JAVADOC	 Field ER_COUNT_TAKES_1_ARG 
//public static final int ER_COUNT_TAKES_1_ARG = 46; 	TokenNameCOMMENT_LINE	public static final int ER_COUNT_TAKES_1_ARG = 46; 
{	TokenNameLBRACE	
ER_COUNT_TAKES_1_ARG	TokenNameIdentifier	 ER  COUNT  TAKES 1  ARG
,	TokenNameCOMMA	
"Funktionen count borde ta emot ett argument!"	TokenNameStringLiteral	Funktionen count borde ta emot ett argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_COULDNOT_FIND_FUNCTION */	TokenNameCOMMENT_JAVADOC	 Field ER_COULDNOT_FIND_FUNCTION 
//public static final int ER_COULDNOT_FIND_FUNCTION = 47; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNOT_FIND_FUNCTION = 47; 
{	TokenNameLBRACE	
ER_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 ER  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
"Hittade inte funktionen: {0}"	TokenNameStringLiteral	Hittade inte funktionen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_UNSUPPORTED_ENCODING */	TokenNameCOMMENT_JAVADOC	 Field ER_UNSUPPORTED_ENCODING 
//public static final int ER_UNSUPPORTED_ENCODING = 48; 	TokenNameCOMMENT_LINE	public static final int ER_UNSUPPORTED_ENCODING = 48; 
{	TokenNameLBRACE	
ER_UNSUPPORTED_ENCODING	TokenNameIdentifier	 ER  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Ej understšdd kodning: {0}"	TokenNameStringLiteral	Ej understšdd kodning: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_PROBLEM_IN_DTM_NEXTSIBLING */	TokenNameCOMMENT_JAVADOC	 Field ER_PROBLEM_IN_DTM_NEXTSIBLING 
//public static final int ER_PROBLEM_IN_DTM_NEXTSIBLING = 49; 	TokenNameCOMMENT_LINE	public static final int ER_PROBLEM_IN_DTM_NEXTSIBLING = 49; 
{	TokenNameLBRACE	
ER_PROBLEM_IN_DTM_NEXTSIBLING	TokenNameIdentifier	 ER  PROBLEM  IN  DTM  NEXTSIBLING
,	TokenNameCOMMA	
"Problem intrŠffade i DTM i getNextSibling... fšrsšker ŒterhŠmta"	TokenNameStringLiteral	Problem intrŠffade i DTM i getNextSibling... fšrsšker ŒterhŠmta
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL */	TokenNameCOMMENT_JAVADOC	 Field ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL 
//public static final int ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL = 50; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL = 50; 
{	TokenNameLBRACE	
ER_CANNOT_WRITE_TO_EMPTYNODELISTIMPL	TokenNameIdentifier	 ER  CANNOT  WRITE  TO  EMPTYNODELISTIMPL
,	TokenNameCOMMA	
"Programmerarfel: EmptyNodeList kan inte skrivas till."	TokenNameStringLiteral	Programmerarfel: EmptyNodeList kan inte skrivas till.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_SETDOMFACTORY_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Field ER_SETDOMFACTORY_NOT_SUPPORTED 
//public static final int ER_SETDOMFACTORY_NOT_SUPPORTED = 51; 	TokenNameCOMMENT_LINE	public static final int ER_SETDOMFACTORY_NOT_SUPPORTED = 51; 
{	TokenNameLBRACE	
ER_SETDOMFACTORY_NOT_SUPPORTED	TokenNameIdentifier	 ER  SETDOMFACTORY  NOT  SUPPORTED
,	TokenNameCOMMA	
"setDOMFactory understšds inte av XPathContext!"	TokenNameStringLiteral	setDOMFactory understšds inte av XPathContext!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_PREFIX_MUST_RESOLVE */	TokenNameCOMMENT_JAVADOC	 Field ER_PREFIX_MUST_RESOLVE 
//public static final int ER_PREFIX_MUST_RESOLVE = 52; 	TokenNameCOMMENT_LINE	public static final int ER_PREFIX_MUST_RESOLVE = 52; 
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Prefix must resolve to a namespace: {0}"	TokenNameStringLiteral	Prefix must resolve to a namespace: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_PARSE_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Field ER_PARSE_NOT_SUPPORTED 
//public static final int ER_PARSE_NOT_SUPPORTED = 53; 	TokenNameCOMMENT_LINE	public static final int ER_PARSE_NOT_SUPPORTED = 53; 
{	TokenNameLBRACE	
ER_PARSE_NOT_SUPPORTED	TokenNameIdentifier	 ER  PARSE  NOT  SUPPORTED
,	TokenNameCOMMA	
"parse (InputSource source) understšds inte av XPathContext! Kan inte šppna {0}"	TokenNameStringLiteral	parse (InputSource source) understšds inte av XPathContext! Kan inte šppna {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_SAX_API_NOT_HANDLED */	TokenNameCOMMENT_JAVADOC	 Field ER_SAX_API_NOT_HANDLED 
//public static final int ER_SAX_API_NOT_HANDLED = 57; 	TokenNameCOMMENT_LINE	public static final int ER_SAX_API_NOT_HANDLED = 57; 
{	TokenNameLBRACE	
ER_SAX_API_NOT_HANDLED	TokenNameIdentifier	 ER  SAX  API  NOT  HANDLED
,	TokenNameCOMMA	
"SAX API-tecken(char ch[]... hanteras inte av DTM!"	TokenNameStringLiteral	SAX API-tecken(char ch[]... hanteras inte av DTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_IGNORABLE_WHITESPACE_NOT_HANDLED */	TokenNameCOMMENT_JAVADOC	 Field ER_IGNORABLE_WHITESPACE_NOT_HANDLED 
//public static final int ER_IGNORABLE_WHITESPACE_NOT_HANDLED = 58; 	TokenNameCOMMENT_LINE	public static final int ER_IGNORABLE_WHITESPACE_NOT_HANDLED = 58; 
{	TokenNameLBRACE	
ER_IGNORABLE_WHITESPACE_NOT_HANDLED	TokenNameIdentifier	 ER  IGNORABLE  WHITESPACE  NOT  HANDLED
,	TokenNameCOMMA	
"ignorableWhitespace(char ch[]... hanteras inte av DTM!"	TokenNameStringLiteral	ignorableWhitespace(char ch[]... hanteras inte av DTM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_DTM_CANNOT_HANDLE_NODES */	TokenNameCOMMENT_JAVADOC	 Field ER_DTM_CANNOT_HANDLE_NODES 
//public static final int ER_DTM_CANNOT_HANDLE_NODES = 59; 	TokenNameCOMMENT_LINE	public static final int ER_DTM_CANNOT_HANDLE_NODES = 59; 
{	TokenNameLBRACE	
ER_DTM_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  DTM  CANNOT  HANDLE  NODES
,	TokenNameCOMMA	
"DTMLiaison kan inte hantera noder av typen {0}"	TokenNameStringLiteral	DTMLiaison kan inte hantera noder av typen {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_XERCES_CANNOT_HANDLE_NODES */	TokenNameCOMMENT_JAVADOC	 Field ER_XERCES_CANNOT_HANDLE_NODES 
//public static final int ER_XERCES_CANNOT_HANDLE_NODES = 60; 	TokenNameCOMMENT_LINE	public static final int ER_XERCES_CANNOT_HANDLE_NODES = 60; 
{	TokenNameLBRACE	
ER_XERCES_CANNOT_HANDLE_NODES	TokenNameIdentifier	 ER  XERCES  CANNOT  HANDLE  NODES
,	TokenNameCOMMA	
"DOM2Helper kan inte hantera noder av typen {0}"	TokenNameStringLiteral	DOM2Helper kan inte hantera noder av typen {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_XERCES_PARSE_ERROR_DETAILS */	TokenNameCOMMENT_JAVADOC	 Field ER_XERCES_PARSE_ERROR_DETAILS 
//public static final int ER_XERCES_PARSE_ERROR_DETAILS = 61; 	TokenNameCOMMENT_LINE	public static final int ER_XERCES_PARSE_ERROR_DETAILS = 61; 
{	TokenNameLBRACE	
ER_XERCES_PARSE_ERROR_DETAILS	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR  DETAILS
,	TokenNameCOMMA	
"DOM2Helper.parse-fel: SystemID - {0} rad - {1}"	TokenNameStringLiteral	DOM2Helper.parse-fel: SystemID - {0} rad - {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_XERCES_PARSE_ERROR */	TokenNameCOMMENT_JAVADOC	 Field ER_XERCES_PARSE_ERROR 
//public static final int ER_XERCES_PARSE_ERROR = 62; 	TokenNameCOMMENT_LINE	public static final int ER_XERCES_PARSE_ERROR = 62; 
{	TokenNameLBRACE	
ER_XERCES_PARSE_ERROR	TokenNameIdentifier	 ER  XERCES  PARSE  ERROR
,	TokenNameCOMMA	
"DOM2Helper.parse-fel"	TokenNameStringLiteral	DOM2Helper.parse-fel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_INVALID_UTF16_SURROGATE */	TokenNameCOMMENT_JAVADOC	 Field ER_INVALID_UTF16_SURROGATE 
//public static final int ER_INVALID_UTF16_SURROGATE = 65; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_UTF16_SURROGATE = 65; 
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Ogiltigt UTF-16-surrogat upptŠckt: {0} ?"	TokenNameStringLiteral	Ogiltigt UTF-16-surrogat upptŠckt: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_OIERROR */	TokenNameCOMMENT_JAVADOC	 Field ER_OIERROR 
//public static final int ER_OIERROR = 66; 	TokenNameCOMMENT_LINE	public static final int ER_OIERROR = 66; 
{	TokenNameLBRACE	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
"IO-fel"	TokenNameStringLiteral	IO-fel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_CANNOT_CREATE_URL */	TokenNameCOMMENT_JAVADOC	 Field ER_CANNOT_CREATE_URL 
//public static final int ER_CANNOT_CREATE_URL = 67; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_CREATE_URL = 67; 
{	TokenNameLBRACE	
ER_CANNOT_CREATE_URL	TokenNameIdentifier	 ER  CANNOT  CREATE  URL
,	TokenNameCOMMA	
"Kan inte skapa url fšr: {0}"	TokenNameStringLiteral	Kan inte skapa url fšr: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_XPATH_READOBJECT */	TokenNameCOMMENT_JAVADOC	 Field ER_XPATH_READOBJECT 
//public static final int ER_XPATH_READOBJECT = 68; 	TokenNameCOMMENT_LINE	public static final int ER_XPATH_READOBJECT = 68; 
{	TokenNameLBRACE	
ER_XPATH_READOBJECT	TokenNameIdentifier	 ER  XPATH  READOBJECT
,	TokenNameCOMMA	
"I XPath.readObject: {0}"	TokenNameStringLiteral	I XPath.readObject: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_XPATH_READOBJECT */	TokenNameCOMMENT_JAVADOC	 Field ER_XPATH_READOBJECT 
//public static final int ER_FUNCTION_TOKEN_NOT_FOUND = 69; 	TokenNameCOMMENT_LINE	public static final int ER_FUNCTION_TOKEN_NOT_FOUND = 69; 
{	TokenNameLBRACE	
ER_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 ER  FUNCTION  TOKEN  NOT  FOUND
,	TokenNameCOMMA	
"funktionstecken saknas."	TokenNameStringLiteral	funktionstecken saknas.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Can not deal with XPath type: */	TokenNameCOMMENT_JAVADOC	 Can not deal with XPath type: 
//public static final int ER_CANNOT_DEAL_XPATH_TYPE = 71; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_DEAL_XPATH_TYPE = 71; 
{	TokenNameLBRACE	
ER_CANNOT_DEAL_XPATH_TYPE	TokenNameIdentifier	 ER  CANNOT  DEAL  XPATH  TYPE
,	TokenNameCOMMA	
"Kan inte hantera XPath-typ: {0}"	TokenNameStringLiteral	Kan inte hantera XPath-typ: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** This NodeSet is not mutable */	TokenNameCOMMENT_JAVADOC	 This NodeSet is not mutable 
//public static final int ER_NODESET_NOT_MUTABLE = 72; 	TokenNameCOMMENT_LINE	public static final int ER_NODESET_NOT_MUTABLE = 72; 
{	TokenNameLBRACE	
ER_NODESET_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESET  NOT  MUTABLE
,	TokenNameCOMMA	
"NodeSet Šr ofšrŠnderlig"	TokenNameStringLiteral	NodeSet Šr ofšrŠnderlig
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** This NodeSetDTM is not mutable */	TokenNameCOMMENT_JAVADOC	 This NodeSetDTM is not mutable 
//public static final int ER_NODESETDTM_NOT_MUTABLE = 73; 	TokenNameCOMMENT_LINE	public static final int ER_NODESETDTM_NOT_MUTABLE = 73; 
{	TokenNameLBRACE	
ER_NODESETDTM_NOT_MUTABLE	TokenNameIdentifier	 ER  NODESETDTM  NOT  MUTABLE
,	TokenNameCOMMA	
"NodeSetDTM Šr ofšrŠnderlig"	TokenNameStringLiteral	NodeSetDTM Šr ofšrŠnderlig
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Variable not resolvable: */	TokenNameCOMMENT_JAVADOC	 Variable not resolvable: 
//public static final int ER_VAR_NOT_RESOLVABLE = 74; 	TokenNameCOMMENT_LINE	public static final int ER_VAR_NOT_RESOLVABLE = 74; 
{	TokenNameLBRACE	
ER_VAR_NOT_RESOLVABLE	TokenNameIdentifier	 ER  VAR  NOT  RESOLVABLE
,	TokenNameCOMMA	
"Variabel ej lšsbar: {0}"	TokenNameStringLiteral	Variabel ej lšsbar: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Null error handler */	TokenNameCOMMENT_JAVADOC	 Null error handler 
//public static final int ER_NULL_ERROR_HANDLER = 75; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_ERROR_HANDLER = 75; 
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Null error handler"	TokenNameStringLiteral	Null error handler
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Programmer's assertion: unknown opcode */	TokenNameCOMMENT_JAVADOC	 Programmer's assertion: unknown opcode 
//public static final int ER_PROG_ASSERT_UNKNOWN_OPCODE = 76; 	TokenNameCOMMENT_LINE	public static final int ER_PROG_ASSERT_UNKNOWN_OPCODE = 76; 
{	TokenNameLBRACE	
ER_PROG_ASSERT_UNKNOWN_OPCODE	TokenNameIdentifier	 ER  PROG  ASSERT  UNKNOWN  OPCODE
,	TokenNameCOMMA	
"Programmerares fšrsŠkran: okŠnd op-kod: {0}"	TokenNameStringLiteral	Programmerares fšrsŠkran: okŠnd op-kod: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** 0 or 1 */	TokenNameCOMMENT_JAVADOC	 0 or 1 
//public static final int ER_ZERO_OR_ONE = 77; 	TokenNameCOMMENT_LINE	public static final int ER_ZERO_OR_ONE = 77; 
{	TokenNameLBRACE	
ER_ZERO_OR_ONE	TokenNameIdentifier	 ER  ZERO  OR  ONE
,	TokenNameCOMMA	
"0 eller 1"	TokenNameStringLiteral	0 eller 1
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** rtf() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 rtf() not supported by XRTreeFragSelectWrapper 
//public static final int ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER = 78; 	TokenNameCOMMENT_LINE	public static final int ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER = 78; 
{	TokenNameLBRACE	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"rtf() understšds inte av XRTreeFragSelectWrapper!"	TokenNameStringLiteral	rtf() understšds inte av XRTreeFragSelectWrapper!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** asNodeIterator() not supported by XRTreeFragSelectWrapper */	TokenNameCOMMENT_JAVADOC	 asNodeIterator() not supported by XRTreeFragSelectWrapper 
//public static final int ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER = 79; 	TokenNameCOMMENT_LINE	public static final int ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER = 79; 
{	TokenNameLBRACE	
ER_ASNODEITERATOR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  ASNODEITERATOR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
"asNodeIterator() understšds inte av XRTreeFragSelectWrapper!"	TokenNameStringLiteral	asNodeIterator() understšds inte av XRTreeFragSelectWrapper!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** fsb() not supported for XStringForChars */	TokenNameCOMMENT_JAVADOC	 fsb() not supported for XStringForChars 
//public static final int ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS = 80; 	TokenNameCOMMENT_LINE	public static final int ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS = 80; 
{	TokenNameLBRACE	
ER_FSB_NOT_SUPPORTED_XSTRINGFORCHARS	TokenNameIdentifier	 ER  FSB  NOT  SUPPORTED  XSTRINGFORCHARS
,	TokenNameCOMMA	
"fsb() understšds inte av XRStringForChars!"	TokenNameStringLiteral	fsb() understšds inte av XRStringForChars!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Could not find variable with the name of */	TokenNameCOMMENT_JAVADOC	 Could not find variable with the name of 
//public static final int ER_COULD_NOT_FIND_VAR = 81; 	TokenNameCOMMENT_LINE	public static final int ER_COULD_NOT_FIND_VAR = 81; 
{	TokenNameLBRACE	
ER_COULD_NOT_FIND_VAR	TokenNameIdentifier	 ER  COULD  NOT  FIND  VAR
,	TokenNameCOMMA	
"Hittade inte variabeln med namn {0}"	TokenNameStringLiteral	Hittade inte variabeln med namn {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** XStringForChars can not take a string for an argument */	TokenNameCOMMENT_JAVADOC	 XStringForChars can not take a string for an argument 
//public static final int ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING = 82; 	TokenNameCOMMENT_LINE	public static final int ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING = 82; 
{	TokenNameLBRACE	
ER_XSTRINGFORCHARS_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  XSTRINGFORCHARS  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
"XStringForChars kan inte ta en strŠng som argument"	TokenNameStringLiteral	XStringForChars kan inte ta en strŠng som argument
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** The FastStringBuffer argument can not be null */	TokenNameCOMMENT_JAVADOC	 The FastStringBuffer argument can not be null 
//public static final int ER_FASTSTRINGBUFFER_CANNOT_BE_NULL = 83; 	TokenNameCOMMENT_LINE	public static final int ER_FASTSTRINGBUFFER_CANNOT_BE_NULL = 83; 
{	TokenNameLBRACE	
ER_FASTSTRINGBUFFER_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FASTSTRINGBUFFER  CANNOT  BE  NULL
,	TokenNameCOMMA	
"FastStringBuffer-argumentet fŒr inte vara null"	TokenNameStringLiteral	FastStringBuffer-argumentet fŒr inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* MANTIS_XALAN CHANGE: BEGIN */	TokenNameCOMMENT_BLOCK	 MANTIS_XALAN CHANGE: BEGIN 
/** 2 or 3 */	TokenNameCOMMENT_JAVADOC	 2 or 3 
//public static final int ER_TWO_OR_THREE = 84; 	TokenNameCOMMENT_LINE	public static final int ER_TWO_OR_THREE = 84; 
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 eller 3"	TokenNameStringLiteral	2 eller 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Variable accessed before it is bound! */	TokenNameCOMMENT_JAVADOC	 Variable accessed before it is bound! 
//public static final int ER_VARIABLE_ACCESSED_BEFORE_BIND = 85; 	TokenNameCOMMENT_LINE	public static final int ER_VARIABLE_ACCESSED_BEFORE_BIND = 85; 
{	TokenNameLBRACE	
ER_VARIABLE_ACCESSED_BEFORE_BIND	TokenNameIdentifier	 ER  VARIABLE  ACCESSED  BEFORE  BIND
,	TokenNameCOMMA	
"Variabeln anvŠndes innan den bands!"	TokenNameStringLiteral	Variabeln anvŠndes innan den bands!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** XStringForFSB can not take a string for an argument! */	TokenNameCOMMENT_JAVADOC	 XStringForFSB can not take a string for an argument! 
//public static final int ER_FSB_CANNOT_TAKE_STRING = 86; 	TokenNameCOMMENT_LINE	public static final int ER_FSB_CANNOT_TAKE_STRING = 86; 
{	TokenNameLBRACE	
ER_FSB_CANNOT_TAKE_STRING	TokenNameIdentifier	 ER  FSB  CANNOT  TAKE  STRING
,	TokenNameCOMMA	
"XStringForFSB kan inte ha en strŠng som argument!"	TokenNameStringLiteral	XStringForFSB kan inte ha en strŠng som argument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Error! Setting the root of a walker to null! */	TokenNameCOMMENT_JAVADOC	 Error! Setting the root of a walker to null! 
//public static final int ER_SETTING_WALKER_ROOT_TO_NULL = 87; 	TokenNameCOMMENT_LINE	public static final int ER_SETTING_WALKER_ROOT_TO_NULL = 87; 
{	TokenNameLBRACE	
ER_SETTING_WALKER_ROOT_TO_NULL	TokenNameIdentifier	 ER  SETTING  WALKER  ROOT  TO  NULL
,	TokenNameCOMMA	
" !!!! Fel! Anger roten fšr en "walker" till null!!!"	TokenNameStringLiteral	 !!!! Fel! Anger roten fšr en "walker" till null!!!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** This NodeSetDTM can not iterate to a previous node! */	TokenNameCOMMENT_JAVADOC	 This NodeSetDTM can not iterate to a previous node! 
//public static final int ER_NODESETDTM_CANNOT_ITERATE = 88; 	TokenNameCOMMENT_LINE	public static final int ER_NODESETDTM_CANNOT_ITERATE = 88; 
{	TokenNameLBRACE	
ER_NODESETDTM_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  ITERATE
,	TokenNameCOMMA	
"Detta NodeSetDTM kan inte iterera till en tidigare nod!"	TokenNameStringLiteral	Detta NodeSetDTM kan inte iterera till en tidigare nod!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** This NodeSet can not iterate to a previous node! */	TokenNameCOMMENT_JAVADOC	 This NodeSet can not iterate to a previous node! 
//public static final int ER_NODESET_CANNOT_ITERATE = 89; 	TokenNameCOMMENT_LINE	public static final int ER_NODESET_CANNOT_ITERATE = 89; 
{	TokenNameLBRACE	
ER_NODESET_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESET  CANNOT  ITERATE
,	TokenNameCOMMA	
"Detta NodeSet kan inte iterera till en tidigare nod!"	TokenNameStringLiteral	Detta NodeSet kan inte iterera till en tidigare nod!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** This NodeSetDTM can not do indexing or counting functions! */	TokenNameCOMMENT_JAVADOC	 This NodeSetDTM can not do indexing or counting functions! 
//public static final int ER_NODESETDTM_CANNOT_INDEX = 90; 	TokenNameCOMMENT_LINE	public static final int ER_NODESETDTM_CANNOT_INDEX = 90; 
{	TokenNameLBRACE	
ER_NODESETDTM_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  INDEX
,	TokenNameCOMMA	
"Detta NodeSetDTM har inte funktioner fšr indexering och rŠkning!"	TokenNameStringLiteral	Detta NodeSetDTM har inte funktioner fšr indexering och rŠkning!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** This NodeSet can not do indexing or counting functions! */	TokenNameCOMMENT_JAVADOC	 This NodeSet can not do indexing or counting functions! 
//public static final int ER_NODESET_CANNOT_INDEX = 91; 	TokenNameCOMMENT_LINE	public static final int ER_NODESET_CANNOT_INDEX = 91; 
{	TokenNameLBRACE	
ER_NODESET_CANNOT_INDEX	TokenNameIdentifier	 ER  NODESET  CANNOT  INDEX
,	TokenNameCOMMA	
"Detta NodeSet har inte funktioner fšr indexering och rŠkning!"	TokenNameStringLiteral	Detta NodeSet har inte funktioner fšr indexering och rŠkning!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Can not call setShouldCacheNodes after nextNode has been called! */	TokenNameCOMMENT_JAVADOC	 Can not call setShouldCacheNodes after nextNode has been called! 
//public static final int ER_CANNOT_CALL_SETSHOULDCACHENODE = 92; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_CALL_SETSHOULDCACHENODE = 92; 
{	TokenNameLBRACE	
ER_CANNOT_CALL_SETSHOULDCACHENODE	TokenNameIdentifier	 ER  CANNOT  CALL  SETSHOULDCACHENODE
,	TokenNameCOMMA	
"Det gŒr inte att anropa setShouldCacheNodes efter att nextNode har anropats!"	TokenNameStringLiteral	Det gŒr inte att anropa setShouldCacheNodes efter att nextNode har anropats!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** {0} only allows {1} arguments */	TokenNameCOMMENT_JAVADOC	 {0} only allows {1} arguments 
//public static final int ER_ONLY_ALLOWS = 93; 	TokenNameCOMMENT_LINE	public static final int ER_ONLY_ALLOWS = 93; 
{	TokenNameLBRACE	
ER_ONLY_ALLOWS	TokenNameIdentifier	 ER  ONLY  ALLOWS
,	TokenNameCOMMA	
"{0} tillŒter bara {1} argument"	TokenNameStringLiteral	{0} tillŒter bara {1} argument
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Programmer's assertion in getNextStepPos: unknown stepType: {0} */	TokenNameCOMMENT_JAVADOC	 Programmer's assertion in getNextStepPos: unknown stepType: {0} 
//public static final int ER_UNKNOWN_STEP = 94; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_STEP = 94; 
{	TokenNameLBRACE	
ER_UNKNOWN_STEP	TokenNameIdentifier	 ER  UNKNOWN  STEP
,	TokenNameCOMMA	
"Programmerarkontroll i getNextStepPos: okŠnt steg Typ: {0}"	TokenNameStringLiteral	Programmerarkontroll i getNextStepPos: okŠnt steg Typ: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Note to translators: A relative location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A relative location path is a form of XPath expression. 
// The message indicates that such an expression was expected following the 	TokenNameCOMMENT_LINE	The message indicates that such an expression was expected following the 
// characters '/' or '//', but was not found. 	TokenNameCOMMENT_LINE	characters '/' or '//', but was not found. 
/** Problem with RelativeLocationPath */	TokenNameCOMMENT_JAVADOC	 Problem with RelativeLocationPath 
//public static final int ER_EXPECTED_REL_LOC_PATH = 95; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_REL_LOC_PATH = 95; 
{	TokenNameLBRACE	
ER_EXPECTED_REL_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  REL  LOC  PATH
,	TokenNameCOMMA	
"En relativ sškvŠg fšrvŠntades efter token '/' eller '//'."	TokenNameStringLiteral	En relativ sškvŠg fšrvŠntades efter token '/' eller '//'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location path is a form of XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location path is a form of XPath expression. 
// The message indicates that syntactically such an expression was expected,but 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected,but 
// the characters specified by the substitution text were encountered instead. 	TokenNameCOMMENT_LINE	the characters specified by the substitution text were encountered instead. 
/** Problem with LocationPath */	TokenNameCOMMENT_JAVADOC	 Problem with LocationPath 
//public static final int ER_EXPECTED_LOC_PATH = 96; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_LOC_PATH = 96; 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_PATH	TokenNameIdentifier	 ER  EXPECTED  LOC  PATH
,	TokenNameCOMMA	
"En plats fšrvŠntades, men fšljande token pŒtrŠffades: {0}"	TokenNameStringLiteral	En plats fšrvŠntades, men fšljande token pŒtrŠffades: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A location step is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A location step is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected 
// following the specified characters. 	TokenNameCOMMENT_LINE	following the specified characters. 
/** Problem with Step */	TokenNameCOMMENT_JAVADOC	 Problem with Step 
//public static final int ER_EXPECTED_LOC_STEP = 97; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_LOC_STEP = 97; 
{	TokenNameLBRACE	
ER_EXPECTED_LOC_STEP	TokenNameIdentifier	 ER  EXPECTED  LOC  STEP
,	TokenNameCOMMA	
"Ett platssteg fšrvŠntades efter token '/' eller '//'."	TokenNameStringLiteral	Ett platssteg fšrvŠntades efter token '/' eller '//'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A node test is part of an XPath expression that is 	TokenNameCOMMENT_LINE	Note to translators: A node test is part of an XPath expression that is 
// used to test for particular kinds of nodes. In this case, a node test that 	TokenNameCOMMENT_LINE	used to test for particular kinds of nodes. In this case, a node test that 
// consists of an NCName followed by a colon and an asterisk or that consists 	TokenNameCOMMENT_LINE	consists of an NCName followed by a colon and an asterisk or that consists 
// of a QName was expected, but was not found. 	TokenNameCOMMENT_LINE	of a QName was expected, but was not found. 
/** Problem with NodeTest */	TokenNameCOMMENT_JAVADOC	 Problem with NodeTest 
//public static final int ER_EXPECTED_NODE_TEST = 98; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_NODE_TEST = 98; 
{	TokenNameLBRACE	
ER_EXPECTED_NODE_TEST	TokenNameIdentifier	 ER  EXPECTED  NODE  TEST
,	TokenNameCOMMA	
"Ett nodtest som matchar antingen NCName:* eller QName fšrvŠntades."	TokenNameStringLiteral	Ett nodtest som matchar antingen NCName:* eller QName fšrvŠntades.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A step pattern is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A step pattern is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected, 
// but the specified character was found in the expression instead. 	TokenNameCOMMENT_LINE	but the specified character was found in the expression instead. 
/** Expected step pattern */	TokenNameCOMMENT_JAVADOC	 Expected step pattern 
//public static final int ER_EXPECTED_STEP_PATTERN = 99; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_STEP_PATTERN = 99; 
{	TokenNameLBRACE	
ER_EXPECTED_STEP_PATTERN	TokenNameIdentifier	 ER  EXPECTED  STEP  PATTERN
,	TokenNameCOMMA	
"Ett stegmšnster fšrvŠntades, men '/' pŒtrŠffades."	TokenNameStringLiteral	Ett stegmšnster fšrvŠntades, men '/' pŒtrŠffades.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: A relative path pattern is part of an XPath expression. 	TokenNameCOMMENT_LINE	Note to translators: A relative path pattern is part of an XPath expression. 
// The message indicates that syntactically such an expression was expected, 	TokenNameCOMMENT_LINE	The message indicates that syntactically such an expression was expected, 
// but was not found. 	TokenNameCOMMENT_LINE	but was not found. 
/** Expected relative path pattern */	TokenNameCOMMENT_JAVADOC	 Expected relative path pattern 
//public static final int ER_EXPECTED_REL_PATH_PATTERN = 100; 	TokenNameCOMMENT_LINE	public static final int ER_EXPECTED_REL_PATH_PATTERN = 100; 
{	TokenNameLBRACE	
ER_EXPECTED_REL_PATH_PATTERN	TokenNameIdentifier	 ER  EXPECTED  REL  PATH  PATTERN
,	TokenNameCOMMA	
"Ett mšnster fšr relativ sškvŠg fšrvŠntades."	TokenNameStringLiteral	Ett mšnster fšr relativ sškvŠg fšrvŠntades.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The substitution text is the name of a data type. The 	TokenNameCOMMENT_LINE	Note to translators: The substitution text is the name of a data type. The 
// message indicates that a value of a particular type could not be converted 	TokenNameCOMMENT_LINE	message indicates that a value of a particular type could not be converted 
// to a value of type string. 	TokenNameCOMMENT_LINE	to a value of type string. 
/** Field ER_CANT_CONVERT_TO_BOOLEAN */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_BOOLEAN 
//public static final int ER_CANT_CONVERT_TO_BOOLEAN = 103; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_BOOLEAN = 103; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_BOOLEAN	TokenNameIdentifier	 ER  CANT  CONVERT  TO  BOOLEAN
,	TokenNameCOMMA	
"Det gŒr inte att konvertera {0} till ett Booleskt vŠrde."	TokenNameStringLiteral	Det gŒr inte att konvertera {0} till ett Booleskt vŠrde.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and 	TokenNameCOMMENT_LINE	Note to translators: Do not translate ANY_UNORDERED_NODE_TYPE and 
// FIRST_ORDERED_NODE_TYPE. 	TokenNameCOMMENT_LINE	FIRST_ORDERED_NODE_TYPE. 
/** Field ER_CANT_CONVERT_TO_SINGLENODE */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_SINGLENODE 
//public static final int ER_CANT_CONVERT_TO_SINGLENODE = 104; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_SINGLENODE = 104; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_SINGLENODE	TokenNameIdentifier	 ER  CANT  CONVERT  TO  SINGLENODE
,	TokenNameCOMMA	
"Det gŒr inte att konvertera {0} till en enda nod. GŠller typerna ANY_UNORDERED_NODE_TYPE och FIRST_ORDERED_NODE_TYPE."	TokenNameStringLiteral	Det gŒr inte att konvertera {0} till en enda nod. GŠller typerna ANY_UNORDERED_NODE_TYPE och FIRST_ORDERED_NODE_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and 	TokenNameCOMMENT_LINE	Note to translators: Do not translate UNORDERED_NODE_SNAPSHOT_TYPE and 
// ORDERED_NODE_SNAPSHOT_TYPE. 	TokenNameCOMMENT_LINE	ORDERED_NODE_SNAPSHOT_TYPE. 
/** Field ER_CANT_GET_SNAPSHOT_LENGTH */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_GET_SNAPSHOT_LENGTH 
//public static final int ER_CANT_GET_SNAPSHOT_LENGTH = 105; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_GET_SNAPSHOT_LENGTH = 105; 
{	TokenNameLBRACE	
ER_CANT_GET_SNAPSHOT_LENGTH	TokenNameIdentifier	 ER  CANT  GET  SNAPSHOT  LENGTH
,	TokenNameCOMMA	
"Det gŒr inte att erhŒlla lŠngd fšr šgonblicksbild pŒ typ: {0}. GŠller typerna UNORDERED_NODE_SNAPSHOT_TYPE och ORDERED_NODE_SNAPSHOT_TYPE."	TokenNameStringLiteral	Det gŒr inte att erhŒlla lŠngd fšr šgonblicksbild pŒ typ: {0}. GŠller typerna UNORDERED_NODE_SNAPSHOT_TYPE och ORDERED_NODE_SNAPSHOT_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NON_ITERATOR_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_NON_ITERATOR_TYPE 
//public static final int ER_NON_ITERATOR_TYPE = 106; 	TokenNameCOMMENT_LINE	public static final int ER_NON_ITERATOR_TYPE = 106; 
{	TokenNameLBRACE	
ER_NON_ITERATOR_TYPE	TokenNameIdentifier	 ER  NON  ITERATOR  TYPE
,	TokenNameCOMMA	
"Det gŒr inte att iterera šver den icke itererbara typen: {0}"	TokenNameStringLiteral	Det gŒr inte att iterera šver den icke itererbara typen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message indicates that the document being operated 	TokenNameCOMMENT_LINE	Note to translators: This message indicates that the document being operated 
// upon changed, so the iterator object that was being used to traverse the 	TokenNameCOMMENT_LINE	upon changed, so the iterator object that was being used to traverse the 
// document has now become invalid. 	TokenNameCOMMENT_LINE	document has now become invalid. 
/** Field ER_DOC_MUTATED */	TokenNameCOMMENT_JAVADOC	 Field ER_DOC_MUTATED 
//public static final int ER_DOC_MUTATED = 107; 	TokenNameCOMMENT_LINE	public static final int ER_DOC_MUTATED = 107; 
{	TokenNameLBRACE	
ER_DOC_MUTATED	TokenNameIdentifier	 ER  DOC  MUTATED
,	TokenNameCOMMA	
"Dokumentet har Šndrats sedan resultatet genererades. Iterering ogiltig."	TokenNameStringLiteral	Dokumentet har Šndrats sedan resultatet genererades. Iterering ogiltig.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_INVALID_XPATH_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_INVALID_XPATH_TYPE 
//public static final int ER_INVALID_XPATH_TYPE = 108; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_XPATH_TYPE = 108; 
{	TokenNameLBRACE	
ER_INVALID_XPATH_TYPE	TokenNameIdentifier	 ER  INVALID  XPATH  TYPE
,	TokenNameCOMMA	
"Ogiltigt XPath-typargument: {0}"	TokenNameStringLiteral	Ogiltigt XPath-typargument: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_EMPTY_XPATH_RESULT */	TokenNameCOMMENT_JAVADOC	 Field ER_EMPTY_XPATH_RESULT 
//public static final int ER_EMPTY_XPATH_RESULT = 109; 	TokenNameCOMMENT_LINE	public static final int ER_EMPTY_XPATH_RESULT = 109; 
{	TokenNameLBRACE	
ER_EMPTY_XPATH_RESULT	TokenNameIdentifier	 ER  EMPTY  XPATH  RESULT
,	TokenNameCOMMA	
"Tomt XPath-resultatobjekt"	TokenNameStringLiteral	Tomt XPath-resultatobjekt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_INCOMPATIBLE_TYPES */	TokenNameCOMMENT_JAVADOC	 Field ER_INCOMPATIBLE_TYPES 
//public static final int ER_INCOMPATIBLE_TYPES = 110; 	TokenNameCOMMENT_LINE	public static final int ER_INCOMPATIBLE_TYPES = 110; 
{	TokenNameLBRACE	
ER_INCOMPATIBLE_TYPES	TokenNameIdentifier	 ER  INCOMPATIBLE  TYPES
,	TokenNameCOMMA	
"Den genererade typen: {0} kan inte bearbetas i den angivna typen: {1}"	TokenNameStringLiteral	Den genererade typen: {0} kan inte bearbetas i den angivna typen: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_NULL_RESOLVER */	TokenNameCOMMENT_JAVADOC	 Field ER_NULL_RESOLVER 
//public static final int ER_NULL_RESOLVER = 111; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_RESOLVER = 111; 
{	TokenNameLBRACE	
ER_NULL_RESOLVER	TokenNameIdentifier	 ER  NULL  RESOLVER
,	TokenNameCOMMA	
"Det gŒr inte att lšsa prefixet utan prefixlšsare."	TokenNameStringLiteral	Det gŒr inte att lšsa prefixet utan prefixlšsare.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The substitution text is the name of a data type. The 	TokenNameCOMMENT_LINE	Note to translators: The substitution text is the name of a data type. The 
// message indicates that a value of a particular type could not be converted 	TokenNameCOMMENT_LINE	message indicates that a value of a particular type could not be converted 
// to a value of type string. 	TokenNameCOMMENT_LINE	to a value of type string. 
/** Field ER_CANT_CONVERT_TO_STRING */	TokenNameCOMMENT_JAVADOC	 Field ER_CANT_CONVERT_TO_STRING 
//public static final int ER_CANT_CONVERT_TO_STRING = 112; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CONVERT_TO_STRING = 112; 
{	TokenNameLBRACE	
ER_CANT_CONVERT_TO_STRING	TokenNameIdentifier	 ER  CANT  CONVERT  TO  STRING
,	TokenNameCOMMA	
"Det gŒr inte att konvertera {0} till en strŠng."	TokenNameStringLiteral	Det gŒr inte att konvertera {0} till en strŠng.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: Do not translate snapshotItem, 	TokenNameCOMMENT_LINE	Note to translators: Do not translate snapshotItem, 
// UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE. 	TokenNameCOMMENT_LINE	UNORDERED_NODE_SNAPSHOT_TYPE and ORDERED_NODE_SNAPSHOT_TYPE. 
/** Field ER_NON_SNAPSHOT_TYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_NON_SNAPSHOT_TYPE 
//public static final int ER_NON_SNAPSHOT_TYPE = 113; 	TokenNameCOMMENT_LINE	public static final int ER_NON_SNAPSHOT_TYPE = 113; 
{	TokenNameLBRACE	
ER_NON_SNAPSHOT_TYPE	TokenNameIdentifier	 ER  NON  SNAPSHOT  TYPE
,	TokenNameCOMMA	
"Det gŒr inte att anropa snapshotItem pŒ typ: {0}. Metoden gŠller typerna UNORDERED_NODE_SNAPSHOT_TYPE och ORDERED_NODE_SNAPSHOT_TYPE."	TokenNameStringLiteral	Det gŒr inte att anropa snapshotItem pŒ typ: {0}. Metoden gŠller typerna UNORDERED_NODE_SNAPSHOT_TYPE och ORDERED_NODE_SNAPSHOT_TYPE.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: XPathEvaluator is a Java interface name. An 	TokenNameCOMMENT_LINE	Note to translators: XPathEvaluator is a Java interface name. An 
// XPathEvaluator is created with respect to a particular XML document, and in 	TokenNameCOMMENT_LINE	XPathEvaluator is created with respect to a particular XML document, and in 
// this case the expression represented by this object was being evaluated with 	TokenNameCOMMENT_LINE	this case the expression represented by this object was being evaluated with 
// respect to a context node from a different document. 	TokenNameCOMMENT_LINE	respect to a context node from a different document. 
/** Field ER_WRONG_DOCUMENT */	TokenNameCOMMENT_JAVADOC	 Field ER_WRONG_DOCUMENT 
//public static final int ER_WRONG_DOCUMENT = 114; 	TokenNameCOMMENT_LINE	public static final int ER_WRONG_DOCUMENT = 114; 
{	TokenNameLBRACE	
ER_WRONG_DOCUMENT	TokenNameIdentifier	 ER  WRONG  DOCUMENT
,	TokenNameCOMMA	
"Kontextnoden tillhšr inte dokumentet som Šr bundet till denna XPathEvaluator."	TokenNameStringLiteral	Kontextnoden tillhšr inte dokumentet som Šr bundet till denna XPathEvaluator.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The XPath expression cannot be evaluated with respect 	TokenNameCOMMENT_LINE	Note to translators: The XPath expression cannot be evaluated with respect 
// to this type of node. 	TokenNameCOMMENT_LINE	to this type of node. 
/** Field ER_WRONG_NODETYPE */	TokenNameCOMMENT_JAVADOC	 Field ER_WRONG_NODETYPE 
//public static final int ER_WRONG_NODETYPE = 115; 	TokenNameCOMMENT_LINE	public static final int ER_WRONG_NODETYPE = 115; 
{	TokenNameLBRACE	
ER_WRONG_NODETYPE	TokenNameIdentifier	 ER  WRONG  NODETYPE
,	TokenNameCOMMA	
"Kontextnoden kan inte hanteras."	TokenNameStringLiteral	Kontextnoden kan inte hanteras.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field ER_XPATH_ERROR */	TokenNameCOMMENT_JAVADOC	 Field ER_XPATH_ERROR 
//public static final int ER_XPATH_ERROR = 116; 	TokenNameCOMMENT_LINE	public static final int ER_XPATH_ERROR = 116; 
{	TokenNameLBRACE	
ER_XPATH_ERROR	TokenNameIdentifier	 ER  XPATH  ERROR
,	TokenNameCOMMA	
"OkŠnt fel i XPath."	TokenNameStringLiteral	OkŠnt fel i XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
/** Field WG_LOCALE_NAME_NOT_HANDLED */	TokenNameCOMMENT_JAVADOC	 Field WG_LOCALE_NAME_NOT_HANDLED 
//public static final int WG_LOCALE_NAME_NOT_HANDLED = 1; 	TokenNameCOMMENT_LINE	public static final int WG_LOCALE_NAME_NOT_HANDLED = 1; 
{	TokenNameLBRACE	
WG_LOCALE_NAME_NOT_HANDLED	TokenNameIdentifier	 WG  LOCALE  NAME  NOT  HANDLED
,	TokenNameCOMMA	
"locale-namnet i format-number-funktionen Šnnu inte hanterat!"	TokenNameStringLiteral	locale-namnet i format-number-funktionen Šnnu inte hanterat!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_PROPERTY_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Field WG_PROPERTY_NOT_SUPPORTED 
//public static final int WG_PROPERTY_NOT_SUPPORTED = 2; 	TokenNameCOMMENT_LINE	public static final int WG_PROPERTY_NOT_SUPPORTED = 2; 
{	TokenNameLBRACE	
WG_PROPERTY_NOT_SUPPORTED	TokenNameIdentifier	 WG  PROPERTY  NOT  SUPPORTED
,	TokenNameCOMMA	
"XSL-Egenskap understšds inte: {0}"	TokenNameStringLiteral	XSL-Egenskap understšds inte: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_DONT_DO_ANYTHING_WITH_NS */	TokenNameCOMMENT_JAVADOC	 Field WG_DONT_DO_ANYTHING_WITH_NS 
//public static final int WG_DONT_DO_ANYTHING_WITH_NS = 3; 	TokenNameCOMMENT_LINE	public static final int WG_DONT_DO_ANYTHING_WITH_NS = 3; 
{	TokenNameLBRACE	
WG_DONT_DO_ANYTHING_WITH_NS	TokenNameIdentifier	 WG  DONT  DO  ANYTHING  WITH  NS
,	TokenNameCOMMA	
"Gšr fšr nŠrvarande inte nŒgonting med namespace {0} i egenskap: {1}"	TokenNameStringLiteral	Gšr fšr nŠrvarande inte nŒgonting med namespace {0} i egenskap: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_SECURITY_EXCEPTION */	TokenNameCOMMENT_JAVADOC	 Field WG_SECURITY_EXCEPTION 
//public static final int WG_SECURITY_EXCEPTION = 4; 	TokenNameCOMMENT_LINE	public static final int WG_SECURITY_EXCEPTION = 4; 
{	TokenNameLBRACE	
WG_SECURITY_EXCEPTION	TokenNameIdentifier	 WG  SECURITY  EXCEPTION
,	TokenNameCOMMA	
"SecurityException vid fšrsšk att fŒ tillgŒng till XSL-systemegenskap: {0}"	TokenNameStringLiteral	SecurityException vid fšrsšk att fŒ tillgŒng till XSL-systemegenskap: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_QUO_NO_LONGER_DEFINED */	TokenNameCOMMENT_JAVADOC	 Field WG_QUO_NO_LONGER_DEFINED 
//public static final int WG_QUO_NO_LONGER_DEFINED = 5; 	TokenNameCOMMENT_LINE	public static final int WG_QUO_NO_LONGER_DEFINED = 5; 
{	TokenNameLBRACE	
WG_QUO_NO_LONGER_DEFINED	TokenNameIdentifier	 WG  QUO  NO  LONGER  DEFINED
,	TokenNameCOMMA	
"Gammal syntax: quo(...) Šr inte lŠngre definierad i XPath."	TokenNameStringLiteral	Gammal syntax: quo(...) Šr inte lŠngre definierad i XPath.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST */	TokenNameCOMMENT_JAVADOC	 Field WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST 
//public static final int WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST = 6; 	TokenNameCOMMENT_LINE	public static final int WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST = 6; 
{	TokenNameLBRACE	
WG_NEED_DERIVED_OBJECT_TO_IMPLEMENT_NODETEST	TokenNameIdentifier	 WG  NEED  DERIVED  OBJECT  TO  IMPLEMENT  NODETEST
,	TokenNameCOMMA	
"XPath behšver ett deriverat objekt fšr att implementera nodeTest!"	TokenNameStringLiteral	XPath behšver ett deriverat objekt fšr att implementera nodeTest!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_FUNCTION_TOKEN_NOT_FOUND */	TokenNameCOMMENT_JAVADOC	 Field WG_FUNCTION_TOKEN_NOT_FOUND 
//public static final int WG_FUNCTION_TOKEN_NOT_FOUND = 7; 	TokenNameCOMMENT_LINE	public static final int WG_FUNCTION_TOKEN_NOT_FOUND = 7; 
{	TokenNameLBRACE	
WG_FUNCTION_TOKEN_NOT_FOUND	TokenNameIdentifier	 WG  FUNCTION  TOKEN  NOT  FOUND
,	TokenNameCOMMA	
"funktionstecken saknas."	TokenNameStringLiteral	funktionstecken saknas.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_COULDNOT_FIND_FUNCTION */	TokenNameCOMMENT_JAVADOC	 Field WG_COULDNOT_FIND_FUNCTION 
//public static final int WG_COULDNOT_FIND_FUNCTION = 8; 	TokenNameCOMMENT_LINE	public static final int WG_COULDNOT_FIND_FUNCTION = 8; 
{	TokenNameLBRACE	
WG_COULDNOT_FIND_FUNCTION	TokenNameIdentifier	 WG  COULDNOT  FIND  FUNCTION
,	TokenNameCOMMA	
"Hittade inte funktion: {0}"	TokenNameStringLiteral	Hittade inte funktion: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_CANNOT_MAKE_URL_FROM */	TokenNameCOMMENT_JAVADOC	 Field WG_CANNOT_MAKE_URL_FROM 
//public static final int WG_CANNOT_MAKE_URL_FROM = 9; 	TokenNameCOMMENT_LINE	public static final int WG_CANNOT_MAKE_URL_FROM = 9; 
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Kan inte skapa URL frŒn: {0}"	TokenNameStringLiteral	Kan inte skapa URL frŒn: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_EXPAND_ENTITIES_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 Field WG_EXPAND_ENTITIES_NOT_SUPPORTED 
//public static final int WG_EXPAND_ENTITIES_NOT_SUPPORTED = 10; 	TokenNameCOMMENT_LINE	public static final int WG_EXPAND_ENTITIES_NOT_SUPPORTED = 10; 
{	TokenNameLBRACE	
WG_EXPAND_ENTITIES_NOT_SUPPORTED	TokenNameIdentifier	 WG  EXPAND  ENTITIES  NOT  SUPPORTED
,	TokenNameCOMMA	
"Alternativet -E understšds inte fšr DTM-tolk"	TokenNameStringLiteral	Alternativet -E understšds inte fšr DTM-tolk
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_ILLEGAL_VARIABLE_REFERENCE */	TokenNameCOMMENT_JAVADOC	 Field WG_ILLEGAL_VARIABLE_REFERENCE 
//public static final int WG_ILLEGAL_VARIABLE_REFERENCE = 11; 	TokenNameCOMMENT_LINE	public static final int WG_ILLEGAL_VARIABLE_REFERENCE = 11; 
{	TokenNameLBRACE	
WG_ILLEGAL_VARIABLE_REFERENCE	TokenNameIdentifier	 WG  ILLEGAL  VARIABLE  REFERENCE
,	TokenNameCOMMA	
"VariableReference angiven fšr variabel som Šr utanfšr sammanhanget eller som saknar definition! Namn = {0}"	TokenNameStringLiteral	VariableReference angiven fšr variabel som Šr utanfšr sammanhanget eller som saknar definition! Namn = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Field WG_UNSUPPORTED_ENCODING */	TokenNameCOMMENT_JAVADOC	 Field WG_UNSUPPORTED_ENCODING 
//public static final int WG_UNSUPPORTED_ENCODING = 12; 	TokenNameCOMMENT_LINE	public static final int WG_UNSUPPORTED_ENCODING = 12; 
{	TokenNameLBRACE	
WG_UNSUPPORTED_ENCODING	TokenNameIdentifier	 WG  UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Ej understšdd kodning: {0}"	TokenNameStringLiteral	Ej understšdd kodning: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Other miscellaneous text used inside the code... 	TokenNameCOMMENT_LINE	Other miscellaneous text used inside the code... 
{	TokenNameLBRACE	
"ui_language"	TokenNameStringLiteral	ui_language
,	TokenNameCOMMA	
"sv"	TokenNameStringLiteral	sv
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"help_language"	TokenNameStringLiteral	help_language
,	TokenNameCOMMA	
"sv"	TokenNameStringLiteral	sv
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"language"	TokenNameStringLiteral	language
,	TokenNameCOMMA	
"sv"	TokenNameStringLiteral	sv
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"BAD_CODE"	TokenNameStringLiteral	BAD_CODE
,	TokenNameCOMMA	
"Parameter till createMessage ligger utanfšr tillŒtet intervall"	TokenNameStringLiteral	Parameter till createMessage ligger utanfšr tillŒtet intervall
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Undantag utlšst vid messageFormat-anrop"	TokenNameStringLiteral	Undantag utlšst vid messageFormat-anrop
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version"	TokenNameStringLiteral	version
,	TokenNameCOMMA	
">>>>>>> Xalan Version"	TokenNameStringLiteral	>>>>>>> Xalan Version
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"version2"	TokenNameStringLiteral	version2
,	TokenNameCOMMA	
"<<<<<<<"	TokenNameStringLiteral	<<<<<<<
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"yes"	TokenNameStringLiteral	yes
,	TokenNameCOMMA	
"ja"	TokenNameStringLiteral	ja
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"line"	TokenNameStringLiteral	line
,	TokenNameCOMMA	
"Rad //"	TokenNameStringLiteral	Rad //
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Kolumn //"	TokenNameStringLiteral	Kolumn //
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor fŠrdig"	TokenNameStringLiteral	XSLProcessor fŠrdig
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xpath_option"	TokenNameStringLiteral	xpath_option
,	TokenNameCOMMA	
"xpath-alternativ"	TokenNameStringLiteral	xpath-alternativ
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
" [-in inputXMLURL]"	TokenNameStringLiteral	 [-in inputXMLURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionSelect"	TokenNameStringLiteral	optionSelect
,	TokenNameCOMMA	
"[-select xpath-uttryck]"	TokenNameStringLiteral	[-select xpath-uttryck]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionMatch"	TokenNameStringLiteral	optionMatch
,	TokenNameCOMMA	
" [-match matchningsmšnster (fšr matchningsdiagnostik)]"	TokenNameStringLiteral	 [-match matchningsmšnster (fšr matchningsdiagnostik)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionAnyExpr"	TokenNameStringLiteral	optionAnyExpr
,	TokenNameCOMMA	
"Eller bara ett xpath-uttryck kommer att gšra en diagnostik-dump"	TokenNameStringLiteral	Eller bara ett xpath-uttryck kommer att gšra en diagnostik-dump
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg1"	TokenNameStringLiteral	noParsermsg1
,	TokenNameCOMMA	
"XSL-Process misslyckades."	TokenNameStringLiteral	XSL-Process misslyckades.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg2"	TokenNameStringLiteral	noParsermsg2
,	TokenNameCOMMA	
"** Hittade inte tolk **"	TokenNameStringLiteral	** Hittade inte tolk **
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg3"	TokenNameStringLiteral	noParsermsg3
,	TokenNameCOMMA	
"VŠnligen kontrollera din classpath"	TokenNameStringLiteral	VŠnligen kontrollera din classpath
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Om du inte har IBMs XML-Tolk fšr Java, kan du ladda ner den frŒn"	TokenNameStringLiteral	Om du inte har IBMs XML-Tolk fšr Java, kan du ladda ner den frŒn
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"IBMs AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	IBMs AlphaWorks: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================= INFRASTRUCTURE ====================== 	TokenNameCOMMENT_LINE	================= INFRASTRUCTURE ====================== 
/** Field BAD_CODE */	TokenNameCOMMENT_JAVADOC	 Field BAD_CODE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_CODE	TokenNameIdentifier	 BAD  CODE
=	TokenNameEQUAL	
"DLIG_KOD"	TokenNameStringLiteral	DLIG_KOD
;	TokenNameSEMICOLON	
/** Field FORMAT_FAILED */	TokenNameCOMMENT_JAVADOC	 Field FORMAT_FAILED 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORMAT_FAILDE	TokenNameIdentifier	 FORMAT  FAILDE
=	TokenNameEQUAL	
"FORMATTERING_MISSLYCKADES"	TokenNameStringLiteral	FORMATTERING_MISSLYCKADES
;	TokenNameSEMICOLON	
/** Field ERROR_RESOURCES */	TokenNameCOMMENT_JAVADOC	 Field ERROR_RESOURCES 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_RESOURCES	TokenNameIdentifier	 ERROR  RESOURCES
=	TokenNameEQUAL	
"org.apache.xpath.res.XPATHErrorResources"	TokenNameStringLiteral	org.apache.xpath.res.XPATHErrorResources
;	TokenNameSEMICOLON	
/** Field ERROR_STRING */	TokenNameCOMMENT_JAVADOC	 Field ERROR_STRING 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_STRING	TokenNameIdentifier	 ERROR  STRING
=	TokenNameEQUAL	
"//fel"	TokenNameStringLiteral	//fel
;	TokenNameSEMICOLON	
/** Field ERROR_HEADER */	TokenNameCOMMENT_JAVADOC	 Field ERROR_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HEADER	TokenNameIdentifier	 ERROR  HEADER
=	TokenNameEQUAL	
"Fel: "	TokenNameStringLiteral	Fel: 
;	TokenNameSEMICOLON	
/** Field WARNING_HEADER */	TokenNameCOMMENT_JAVADOC	 Field WARNING_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Varning: "	TokenNameStringLiteral	Varning: 
;	TokenNameSEMICOLON	
/** Field XSL_HEADER */	TokenNameCOMMENT_JAVADOC	 Field XSL_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSL_HEADER	TokenNameIdentifier	 XSL  HEADER
=	TokenNameEQUAL	
"XSL "	TokenNameStringLiteral	XSL 
;	TokenNameSEMICOLON	
/** Field XML_HEADER */	TokenNameCOMMENT_JAVADOC	 Field XML_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_HEADER	TokenNameIdentifier	 XML  HEADER
=	TokenNameEQUAL	
"XML "	TokenNameStringLiteral	XML 
;	TokenNameSEMICOLON	
/** Field QUERY_HEADER */	TokenNameCOMMENT_JAVADOC	 Field QUERY_HEADER 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
QUERY_HEADER	TokenNameIdentifier	 QUERY  HEADER
=	TokenNameEQUAL	
"M…NSTER "	TokenNameStringLiteral	M…NSTER 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

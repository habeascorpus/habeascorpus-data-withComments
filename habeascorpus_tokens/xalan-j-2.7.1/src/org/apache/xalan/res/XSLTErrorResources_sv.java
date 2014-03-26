/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTErrorResources_sv.java 468641 2006-10-28 06:54:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTErrorResources_sv.java 468641 2006-10-28 06:54:42Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
/** * Set up error messages. * We build a two dimensional array of message keys and * message strings. In order to add a new message here, * you need to first add a String constant. And * you need to enter key , value pair as part of contents * Array. You also need to update MAX_CODE for error strings * and MAX_WARNING for warnings ( Needed for only information * purpose ) */	TokenNameCOMMENT_JAVADOC	 Set up error messages. We build a two dimensional array of message keys and message strings. In order to add a new message here, you need to first add a String constant. And you need to enter key , value pair as part of contents Array. You also need to update MAX_CODE for error strings and MAX_WARNING for warnings ( Needed for only information purpose ) 
public	TokenNamepublic	
class	TokenNameclass	
XSLTErrorResources_sv	TokenNameIdentifier	 XSLT Error Resources sv
extends	TokenNameextends	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
{	TokenNameLBRACE	
/** Maximum error messages, this is needed to keep track of the number of messages. */	TokenNameCOMMENT_JAVADOC	 Maximum error messages, this is needed to keep track of the number of messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_CODE	TokenNameIdentifier	 MAX  CODE
=	TokenNameEQUAL	
201	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum warnings, this is needed to keep track of the number of warnings. */	TokenNameCOMMENT_JAVADOC	 Maximum warnings, this is needed to keep track of the number of warnings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_WARNING	TokenNameIdentifier	 MAX  WARNING
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum misc strings. */	TokenNameCOMMENT_JAVADOC	 Maximum misc strings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_OTHERS	TokenNameIdentifier	 MAX  OTHERS
=	TokenNameEQUAL	
55	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Maximum total warnings and error messages. */	TokenNameCOMMENT_JAVADOC	 Maximum total warnings and error messages. 
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
/** Get the lookup table for error messages. * * @return The int to message lookup table. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages. * @return The int to message lookup table. 
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
/** Error message ID that has a null message, but takes in a single object. */	TokenNameCOMMENT_JAVADOC	 Error message ID that has a null message, but takes in a single object. 
//public static final int ERROR0000 = 0; 	TokenNameCOMMENT_LINE	public static final int ERROR0000 = 0; 
{	TokenNameLBRACE	
"ERROR0000"	TokenNameStringLiteral	ERROR0000
,	TokenNameCOMMA	
"{0}"	TokenNameStringLiteral	{0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_CURLYBRACE */	TokenNameCOMMENT_JAVADOC	 ER_NO_CURLYBRACE 
//public static final int ER_NO_CURLYBRACE = 1; 	TokenNameCOMMENT_LINE	public static final int ER_NO_CURLYBRACE = 1; 
{	TokenNameLBRACE	
ER_NO_CURLYBRACE	TokenNameIdentifier	 ER  NO  CURLYBRACE
,	TokenNameCOMMA	
"Fel: Kan inte ha '{' inuti uttryck"	TokenNameStringLiteral	Fel: Kan inte ha '{' inuti uttryck
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_ILLEGAL_ATTRIBUTE */	TokenNameCOMMENT_JAVADOC	 ER_ILLEGAL_ATTRIBUTE 
//public static final int ER_ILLEGAL_ATTRIBUTE = 2; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_ATTRIBUTE = 2; 
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} har ett otillåtet attribut: {1}"	TokenNameStringLiteral	{0} har ett otillåtet attribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NULL_SOURCENODE_APPLYIMPORTS */	TokenNameCOMMENT_JAVADOC	 ER_NULL_SOURCENODE_APPLYIMPORTS 
//public static final int ER_NULL_SOURCENODE_APPLYIMPORTS = 3; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_SOURCENODE_APPLYIMPORTS = 3; 
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_APPLYIMPORTS	TokenNameIdentifier	 ER  NULL  SOURCENODE  APPLYIMPORTS
,	TokenNameCOMMA	
"sourceNode är null i xsl:apply-imports!"	TokenNameStringLiteral	sourceNode är null i xsl:apply-imports!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANNOT_ADD */	TokenNameCOMMENT_JAVADOC	 ER_CANNOT_ADD 
//public static final int ER_CANNOT_ADD = 4; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_ADD = 4; 
{	TokenNameLBRACE	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
"Kan inte lägga {0} till {1}"	TokenNameStringLiteral	Kan inte lägga {0} till {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES */	TokenNameCOMMENT_JAVADOC	 ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES 
//public static final int ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES = 5; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES = 5; 
{	TokenNameLBRACE	
ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES	TokenNameIdentifier	 ER  NULL  SOURCENODE  HANDLEAPPLYTEMPLATES
,	TokenNameCOMMA	
"sourceNode är null i handleApplyTemplatesInstruction!"	TokenNameStringLiteral	sourceNode är null i handleApplyTemplatesInstruction!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_NAME_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NO_NAME_ATTRIB 
//public static final int ER_NO_NAME_ATTRIB = 6; 	TokenNameCOMMENT_LINE	public static final int ER_NO_NAME_ATTRIB = 6; 
{	TokenNameLBRACE	
ER_NO_NAME_ATTRIB	TokenNameIdentifier	 ER  NO  NAME  ATTRIB
,	TokenNameCOMMA	
"{0} måste ha ett namn-attribut."	TokenNameStringLiteral	{0} måste ha ett namn-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_TEMPLATE_NOT_FOUND */	TokenNameCOMMENT_JAVADOC	 ER_TEMPLATE_NOT_FOUND 
//public static final int ER_TEMPLATE_NOT_FOUND = 7; 	TokenNameCOMMENT_LINE	public static final int ER_TEMPLATE_NOT_FOUND = 7; 
{	TokenNameLBRACE	
ER_TEMPLATE_NOT_FOUND	TokenNameIdentifier	 ER  TEMPLATE  NOT  FOUND
,	TokenNameCOMMA	
"Hittade inte mallen med namn: {0}"	TokenNameStringLiteral	Hittade inte mallen med namn: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_RESOLVE_NAME_AVT */	TokenNameCOMMENT_JAVADOC	 ER_CANT_RESOLVE_NAME_AVT 
//public static final int ER_CANT_RESOLVE_NAME_AVT = 8; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_RESOLVE_NAME_AVT = 8; 
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NAME_AVT	TokenNameIdentifier	 ER  CANT  RESOLVE  NAME  AVT
,	TokenNameCOMMA	
"Kunde inte lösa namn-AVT i xsl:call-template."	TokenNameStringLiteral	Kunde inte lösa namn-AVT i xsl:call-template.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_REQUIRES_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_REQUIRES_ATTRIB 
//public static final int ER_REQUIRES_ATTRIB = 9; 	TokenNameCOMMENT_LINE	public static final int ER_REQUIRES_ATTRIB = 9; 
{	TokenNameLBRACE	
ER_REQUIRES_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ATTRIB
,	TokenNameCOMMA	
"{0} kräver attribut: {1}"	TokenNameStringLiteral	{0} kräver attribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MUST_HAVE_TEST_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_MUST_HAVE_TEST_ATTRIB 
//public static final int ER_MUST_HAVE_TEST_ATTRIB = 10; 	TokenNameCOMMENT_LINE	public static final int ER_MUST_HAVE_TEST_ATTRIB = 10; 
{	TokenNameLBRACE	
ER_MUST_HAVE_TEST_ATTRIB	TokenNameIdentifier	 ER  MUST  HAVE  TEST  ATTRIB
,	TokenNameCOMMA	
"{0} måste ha ett ''test''-attribut."	TokenNameStringLiteral	{0} måste ha ett ''test''-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_BAD_VAL_ON_LEVEL_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_BAD_VAL_ON_LEVEL_ATTRIB 
//public static final int ER_BAD_VAL_ON_LEVEL_ATTRIB = 11; 	TokenNameCOMMENT_LINE	public static final int ER_BAD_VAL_ON_LEVEL_ATTRIB = 11; 
{	TokenNameLBRACE	
ER_BAD_VAL_ON_LEVEL_ATTRIB	TokenNameIdentifier	 ER  BAD  VAL  ON  LEVEL  ATTRIB
,	TokenNameCOMMA	
"Dåligt värde på nivå-attribut: {0}"	TokenNameStringLiteral	Dåligt värde på nivå-attribut: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML */	TokenNameCOMMENT_JAVADOC	 ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML 
//public static final int ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML = 12; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML = 12; 
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"Namn på behandlande instruktion får inte vara 'xml'"	TokenNameStringLiteral	Namn på behandlande instruktion får inte vara 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME */	TokenNameCOMMENT_JAVADOC	 ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME 
//public static final int ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME = 13; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME = 13; 
{	TokenNameLBRACE	
ER_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 ER  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"Namn på behandlande instruktion måste vara ett giltigt NCNamn: {0}"	TokenNameStringLiteral	Namn på behandlande instruktion måste vara ett giltigt NCNamn: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NEED_MATCH_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NEED_MATCH_ATTRIB 
//public static final int ER_NEED_MATCH_ATTRIB = 14; 	TokenNameCOMMENT_LINE	public static final int ER_NEED_MATCH_ATTRIB = 14; 
{	TokenNameLBRACE	
ER_NEED_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} måste ha ett matchningsattribut om det har ett tillstånd."	TokenNameStringLiteral	{0} måste ha ett matchningsattribut om det har ett tillstånd.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NEED_NAME_OR_MATCH_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NEED_NAME_OR_MATCH_ATTRIB 
//public static final int ER_NEED_NAME_OR_MATCH_ATTRIB = 15; 	TokenNameCOMMENT_LINE	public static final int ER_NEED_NAME_OR_MATCH_ATTRIB = 15; 
{	TokenNameLBRACE	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
"{0} kräver antingen ett namn eller ett matchningsattribut."	TokenNameStringLiteral	{0} kräver antingen ett namn eller ett matchningsattribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_RESOLVE_NSPREFIX */	TokenNameCOMMENT_JAVADOC	 ER_CANT_RESOLVE_NSPREFIX 
//public static final int ER_CANT_RESOLVE_NSPREFIX = 16; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_RESOLVE_NSPREFIX = 16; 
{	TokenNameLBRACE	
ER_CANT_RESOLVE_NSPREFIX	TokenNameIdentifier	 ER  CANT  RESOLVE  NSPREFIX
,	TokenNameCOMMA	
"Kan inte lösa namnrymdsprefix: {0}"	TokenNameStringLiteral	Kan inte lösa namnrymdsprefix: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_ILLEGAL_VALUE */	TokenNameCOMMENT_JAVADOC	 ER_ILLEGAL_VALUE 
//public static final int ER_ILLEGAL_VALUE = 17; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_VALUE = 17; 
{	TokenNameLBRACE	
ER_ILLEGAL_VALUE	TokenNameIdentifier	 ER  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space har ett otillåtet värde: {0}"	TokenNameStringLiteral	xml:space har ett otillåtet värde: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_OWNERDOC */	TokenNameCOMMENT_JAVADOC	 ER_NO_OWNERDOC 
//public static final int ER_NO_OWNERDOC = 18; 	TokenNameCOMMENT_LINE	public static final int ER_NO_OWNERDOC = 18; 
{	TokenNameLBRACE	
ER_NO_OWNERDOC	TokenNameIdentifier	 ER  NO  OWNERDOC
,	TokenNameCOMMA	
"Barnnod saknar ägardokument!"	TokenNameStringLiteral	Barnnod saknar ägardokument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_ELEMTEMPLATEELEM_ERR */	TokenNameCOMMENT_JAVADOC	 ER_ELEMTEMPLATEELEM_ERR 
//public static final int ER_ELEMTEMPLATEELEM_ERR = 19; 	TokenNameCOMMENT_LINE	public static final int ER_ELEMTEMPLATEELEM_ERR = 19; 
{	TokenNameLBRACE	
ER_ELEMTEMPLATEELEM_ERR	TokenNameIdentifier	 ER  ELEMTEMPLATEELEM  ERR
,	TokenNameCOMMA	
"ElemTemplateElement-fel: {0}"	TokenNameStringLiteral	ElemTemplateElement-fel: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NULL_CHILD */	TokenNameCOMMENT_JAVADOC	 ER_NULL_CHILD 
//public static final int ER_NULL_CHILD = 20; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_CHILD = 20; 
{	TokenNameLBRACE	
ER_NULL_CHILD	TokenNameIdentifier	 ER  NULL  CHILD
,	TokenNameCOMMA	
"Försöker lägga till ett null-barn!"	TokenNameStringLiteral	Försöker lägga till ett null-barn!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NEED_SELECT_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NEED_SELECT_ATTRIB 
//public static final int ER_NEED_SELECT_ATTRIB = 21; 	TokenNameCOMMENT_LINE	public static final int ER_NEED_SELECT_ATTRIB = 21; 
{	TokenNameLBRACE	
ER_NEED_SELECT_ATTRIB	TokenNameIdentifier	 ER  NEED  SELECT  ATTRIB
,	TokenNameCOMMA	
"{0} kräver ett valattribut."	TokenNameStringLiteral	{0} kräver ett valattribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NEED_TEST_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NEED_TEST_ATTRIB 
//public static final int ER_NEED_TEST_ATTRIB = 22; 	TokenNameCOMMENT_LINE	public static final int ER_NEED_TEST_ATTRIB = 22; 
{	TokenNameLBRACE	
ER_NEED_TEST_ATTRIB	TokenNameIdentifier	 ER  NEED  TEST  ATTRIB
,	TokenNameCOMMA	
"xsl:when måste ha ett 'test'-attribut."	TokenNameStringLiteral	xsl:when måste ha ett 'test'-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NEED_NAME_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NEED_NAME_ATTRIB 
//public static final int ER_NEED_NAME_ATTRIB = 23; 	TokenNameCOMMENT_LINE	public static final int ER_NEED_NAME_ATTRIB = 23; 
{	TokenNameLBRACE	
ER_NEED_NAME_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:with-param måste ha ett 'namn'-attribut."	TokenNameStringLiteral	xsl:with-param måste ha ett 'namn'-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_CONTEXT_OWNERDOC */	TokenNameCOMMENT_JAVADOC	 ER_NO_CONTEXT_OWNERDOC 
//public static final int ER_NO_CONTEXT_OWNERDOC = 24; 	TokenNameCOMMENT_LINE	public static final int ER_NO_CONTEXT_OWNERDOC = 24; 
{	TokenNameLBRACE	
ER_NO_CONTEXT_OWNERDOC	TokenNameIdentifier	 ER  NO  CONTEXT  OWNERDOC
,	TokenNameCOMMA	
"Kontext saknar ägardokument!"	TokenNameStringLiteral	Kontext saknar ägardokument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_COULD_NOT_CREATE_XML_PROC_LIAISON */	TokenNameCOMMENT_JAVADOC	 ER_COULD_NOT_CREATE_XML_PROC_LIAISON 
//public static final int ER_COULD_NOT_CREATE_XML_PROC_LIAISON = 25; 	TokenNameCOMMENT_LINE	public static final int ER_COULD_NOT_CREATE_XML_PROC_LIAISON = 25; 
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_XML_PROC_LIAISON	TokenNameIdentifier	 ER  COULD  NOT  CREATE  XML  PROC  LIAISON
,	TokenNameCOMMA	
"Kunde inte skapa XML TransformerFactory Liaison: {0}"	TokenNameStringLiteral	Kunde inte skapa XML TransformerFactory Liaison: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESS_NOT_SUCCESSFUL */	TokenNameCOMMENT_JAVADOC	 ER_PROCESS_NOT_SUCCESSFUL 
//public static final int ER_PROCESS_NOT_SUCCESSFUL = 26; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESS_NOT_SUCCESSFUL = 26; 
{	TokenNameLBRACE	
ER_PROCESS_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESS  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan: Process misslyckades."	TokenNameStringLiteral	Xalan: Process misslyckades.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NOT_SUCCESSFUL */	TokenNameCOMMENT_JAVADOC	 ER_NOT_SUCCESSFUL 
//public static final int ER_NOT_SUCCESSFUL = 27; 	TokenNameCOMMENT_LINE	public static final int ER_NOT_SUCCESSFUL = 27; 
{	TokenNameLBRACE	
ER_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"Xalan: misslyckades."	TokenNameStringLiteral	Xalan: misslyckades.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_ENCODING_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 ER_ENCODING_NOT_SUPPORTED 
//public static final int ER_ENCODING_NOT_SUPPORTED = 28; 	TokenNameCOMMENT_LINE	public static final int ER_ENCODING_NOT_SUPPORTED = 28; 
{	TokenNameLBRACE	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
"Kodning inte understödd: {0}"	TokenNameStringLiteral	Kodning inte understödd: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_COULD_NOT_CREATE_TRACELISTENER */	TokenNameCOMMENT_JAVADOC	 ER_COULD_NOT_CREATE_TRACELISTENER 
//public static final int ER_COULD_NOT_CREATE_TRACELISTENER = 29; 	TokenNameCOMMENT_LINE	public static final int ER_COULD_NOT_CREATE_TRACELISTENER = 29; 
{	TokenNameLBRACE	
ER_COULD_NOT_CREATE_TRACELISTENER	TokenNameIdentifier	 ER  COULD  NOT  CREATE  TRACELISTENER
,	TokenNameCOMMA	
"Kunde inte skapa TraceListener: {0}"	TokenNameStringLiteral	Kunde inte skapa TraceListener: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_KEY_REQUIRES_NAME_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_KEY_REQUIRES_NAME_ATTRIB 
//public static final int ER_KEY_REQUIRES_NAME_ATTRIB = 30; 	TokenNameCOMMENT_LINE	public static final int ER_KEY_REQUIRES_NAME_ATTRIB = 30; 
{	TokenNameLBRACE	
ER_KEY_REQUIRES_NAME_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  NAME  ATTRIB
,	TokenNameCOMMA	
"xsl:key måste ha ett 'namn'-attribut."	TokenNameStringLiteral	xsl:key måste ha ett 'namn'-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_KEY_REQUIRES_MATCH_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_KEY_REQUIRES_MATCH_ATTRIB 
//public static final int ER_KEY_REQUIRES_MATCH_ATTRIB = 31; 	TokenNameCOMMENT_LINE	public static final int ER_KEY_REQUIRES_MATCH_ATTRIB = 31; 
{	TokenNameLBRACE	
ER_KEY_REQUIRES_MATCH_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  MATCH  ATTRIB
,	TokenNameCOMMA	
"xsl:key måste ha ett 'matcha'-attribut."	TokenNameStringLiteral	xsl:key måste ha ett 'matcha'-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_KEY_REQUIRES_USE_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_KEY_REQUIRES_USE_ATTRIB 
//public static final int ER_KEY_REQUIRES_USE_ATTRIB = 32; 	TokenNameCOMMENT_LINE	public static final int ER_KEY_REQUIRES_USE_ATTRIB = 32; 
{	TokenNameLBRACE	
ER_KEY_REQUIRES_USE_ATTRIB	TokenNameIdentifier	 ER  KEY  REQUIRES  USE  ATTRIB
,	TokenNameCOMMA	
"xsl:key måste ha ett 'använd'-attribut."	TokenNameStringLiteral	xsl:key måste ha ett 'använd'-attribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_REQUIRES_ELEMENTS_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_REQUIRES_ELEMENTS_ATTRIB 
//public static final int ER_REQUIRES_ELEMENTS_ATTRIB = 33; 	TokenNameCOMMENT_LINE	public static final int ER_REQUIRES_ELEMENTS_ATTRIB = 33; 
{	TokenNameLBRACE	
ER_REQUIRES_ELEMENTS_ATTRIB	TokenNameIdentifier	 ER  REQUIRES  ELEMENTS  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} kräver ett ''element''-attribut!"	TokenNameStringLiteral	(StylesheetHandler) {0} kräver ett ''element''-attribut!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISSING_PREFIX_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_MISSING_PREFIX_ATTRIB 
//public static final int ER_MISSING_PREFIX_ATTRIB = 34; 	TokenNameCOMMENT_LINE	public static final int ER_MISSING_PREFIX_ATTRIB = 34; 
{	TokenNameLBRACE	
ER_MISSING_PREFIX_ATTRIB	TokenNameIdentifier	 ER  MISSING  PREFIX  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} ''prefix''-attribut saknas"	TokenNameStringLiteral	(StylesheetHandler) {0} ''prefix''-attribut saknas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_BAD_STYLESHEET_URL */	TokenNameCOMMENT_JAVADOC	 ER_BAD_STYLESHEET_URL 
//public static final int ER_BAD_STYLESHEET_URL = 35; 	TokenNameCOMMENT_LINE	public static final int ER_BAD_STYLESHEET_URL = 35; 
{	TokenNameLBRACE	
ER_BAD_STYLESHEET_URL	TokenNameIdentifier	 ER  BAD  STYLESHEET  URL
,	TokenNameCOMMA	
"Stylesheet URL är dålig: {0}"	TokenNameStringLiteral	Stylesheet URL är dålig: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_FILE_NOT_FOUND */	TokenNameCOMMENT_JAVADOC	 ER_FILE_NOT_FOUND 
//public static final int ER_FILE_NOT_FOUND = 36; 	TokenNameCOMMENT_LINE	public static final int ER_FILE_NOT_FOUND = 36; 
{	TokenNameLBRACE	
ER_FILE_NOT_FOUND	TokenNameIdentifier	 ER  FILE  NOT  FOUND
,	TokenNameCOMMA	
"Stylesheet-fil saknas: {0}"	TokenNameStringLiteral	Stylesheet-fil saknas: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_IOEXCEPTION */	TokenNameCOMMENT_JAVADOC	 ER_IOEXCEPTION 
//public static final int ER_IOEXCEPTION = 37; 	TokenNameCOMMENT_LINE	public static final int ER_IOEXCEPTION = 37; 
{	TokenNameLBRACE	
ER_IOEXCEPTION	TokenNameIdentifier	 ER  IOEXCEPTION
,	TokenNameCOMMA	
"Fick IO-Undantag med stylesheet-fil: {0}"	TokenNameStringLiteral	Fick IO-Undantag med stylesheet-fil: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_HREF_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_NO_HREF_ATTRIB 
//public static final int ER_NO_HREF_ATTRIB = 38; 	TokenNameCOMMENT_LINE	public static final int ER_NO_HREF_ATTRIB = 38; 
{	TokenNameLBRACE	
ER_NO_HREF_ATTRIB	TokenNameIdentifier	 ER  NO  HREF  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) Hittade inte href-attribute för {0}"	TokenNameStringLiteral	(StylesheetHandler) Hittade inte href-attribute för {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_STYLESHEET_INCLUDES_ITSELF */	TokenNameCOMMENT_JAVADOC	 ER_STYLESHEET_INCLUDES_ITSELF 
//public static final int ER_STYLESHEET_INCLUDES_ITSELF = 39; 	TokenNameCOMMENT_LINE	public static final int ER_STYLESHEET_INCLUDES_ITSELF = 39; 
{	TokenNameLBRACE	
ER_STYLESHEET_INCLUDES_ITSELF	TokenNameIdentifier	 ER  STYLESHEET  INCLUDES  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0} inkluderar, direkt eller indirekt, sig själv!"	TokenNameStringLiteral	(StylesheetHandler) {0} inkluderar, direkt eller indirekt, sig själv!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESSINCLUDE_ERROR */	TokenNameCOMMENT_JAVADOC	 ER_PROCESSINCLUDE_ERROR 
//public static final int ER_PROCESSINCLUDE_ERROR = 40; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESSINCLUDE_ERROR = 40; 
{	TokenNameLBRACE	
ER_PROCESSINCLUDE_ERROR	TokenNameIdentifier	 ER  PROCESSINCLUDE  ERROR
,	TokenNameCOMMA	
"StylesheetHandler.processInclude-fel, {0}"	TokenNameStringLiteral	StylesheetHandler.processInclude-fel, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISSING_LANG_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_MISSING_LANG_ATTRIB 
//public static final int ER_MISSING_LANG_ATTRIB = 41; 	TokenNameCOMMENT_LINE	public static final int ER_MISSING_LANG_ATTRIB = 41; 
{	TokenNameLBRACE	
ER_MISSING_LANG_ATTRIB	TokenNameIdentifier	 ER  MISSING  LANG  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} ''lang''-attribut' saknas"	TokenNameStringLiteral	(StylesheetHandler) {0} ''lang''-attribut' saknas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISSING_CONTAINER_ELEMENT_COMPONENT */	TokenNameCOMMENT_JAVADOC	 ER_MISSING_CONTAINER_ELEMENT_COMPONENT 
//public static final int ER_MISSING_CONTAINER_ELEMENT_COMPONENT = 42; 	TokenNameCOMMENT_LINE	public static final int ER_MISSING_CONTAINER_ELEMENT_COMPONENT = 42; 
{	TokenNameLBRACE	
ER_MISSING_CONTAINER_ELEMENT_COMPONENT	TokenNameIdentifier	 ER  MISSING  CONTAINER  ELEMENT  COMPONENT
,	TokenNameCOMMA	
"(StylesheetHandler) felplacerade {0} element?? Saknar behållarelement ''komponent''"	TokenNameStringLiteral	(StylesheetHandler) felplacerade {0} element?? Saknar behållarelement ''komponent''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CAN_ONLY_OUTPUT_TO_ELEMENT */	TokenNameCOMMENT_JAVADOC	 ER_CAN_ONLY_OUTPUT_TO_ELEMENT 
//public static final int ER_CAN_ONLY_OUTPUT_TO_ELEMENT = 43; 	TokenNameCOMMENT_LINE	public static final int ER_CAN_ONLY_OUTPUT_TO_ELEMENT = 43; 
{	TokenNameLBRACE	
ER_CAN_ONLY_OUTPUT_TO_ELEMENT	TokenNameIdentifier	 ER  CAN  ONLY  OUTPUT  TO  ELEMENT
,	TokenNameCOMMA	
"Kan endast skicka utdata till ett Element, ett DocumentFragment, ett Document, eller en PrintWriter."	TokenNameStringLiteral	Kan endast skicka utdata till ett Element, ett DocumentFragment, ett Document, eller en PrintWriter.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESS_ERROR */	TokenNameCOMMENT_JAVADOC	 ER_PROCESS_ERROR 
//public static final int ER_PROCESS_ERROR = 44; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESS_ERROR = 44; 
{	TokenNameLBRACE	
ER_PROCESS_ERROR	TokenNameIdentifier	 ER  PROCESS  ERROR
,	TokenNameCOMMA	
"StylesheetRoot.process-fel"	TokenNameStringLiteral	StylesheetRoot.process-fel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_UNIMPLNODE_ERROR */	TokenNameCOMMENT_JAVADOC	 ER_UNIMPLNODE_ERROR 
//public static final int ER_UNIMPLNODE_ERROR = 45; 	TokenNameCOMMENT_LINE	public static final int ER_UNIMPLNODE_ERROR = 45; 
{	TokenNameLBRACE	
ER_UNIMPLNODE_ERROR	TokenNameIdentifier	 ER  UNIMPLNODE  ERROR
,	TokenNameCOMMA	
"UnImplNode-fel: {0}"	TokenNameStringLiteral	UnImplNode-fel: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_SELECT_EXPRESSION */	TokenNameCOMMENT_JAVADOC	 ER_NO_SELECT_EXPRESSION 
//public static final int ER_NO_SELECT_EXPRESSION = 46; 	TokenNameCOMMENT_LINE	public static final int ER_NO_SELECT_EXPRESSION = 46; 
{	TokenNameLBRACE	
ER_NO_SELECT_EXPRESSION	TokenNameIdentifier	 ER  NO  SELECT  EXPRESSION
,	TokenNameCOMMA	
"Fel! Hittade inte xpath select-uttryck (-select)."	TokenNameStringLiteral	Fel! Hittade inte xpath select-uttryck (-select).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANNOT_SERIALIZE_XSLPROCESSOR */	TokenNameCOMMENT_JAVADOC	 ER_CANNOT_SERIALIZE_XSLPROCESSOR 
//public static final int ER_CANNOT_SERIALIZE_XSLPROCESSOR = 47; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_SERIALIZE_XSLPROCESSOR = 47; 
{	TokenNameLBRACE	
ER_CANNOT_SERIALIZE_XSLPROCESSOR	TokenNameIdentifier	 ER  CANNOT  SERIALIZE  XSLPROCESSOR
,	TokenNameCOMMA	
"Kan inte serialisera en XSLProcessor!"	TokenNameStringLiteral	Kan inte serialisera en XSLProcessor!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_INPUT_STYLESHEET */	TokenNameCOMMENT_JAVADOC	 ER_NO_INPUT_STYLESHEET 
//public static final int ER_NO_INPUT_STYLESHEET = 48; 	TokenNameCOMMENT_LINE	public static final int ER_NO_INPUT_STYLESHEET = 48; 
{	TokenNameLBRACE	
ER_NO_INPUT_STYLESHEET	TokenNameIdentifier	 ER  NO  INPUT  STYLESHEET
,	TokenNameCOMMA	
"Stylesheet-indata ej angiven!"	TokenNameStringLiteral	Stylesheet-indata ej angiven!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_FAILED_PROCESS_STYLESHEET */	TokenNameCOMMENT_JAVADOC	 ER_FAILED_PROCESS_STYLESHEET 
//public static final int ER_FAILED_PROCESS_STYLESHEET = 49; 	TokenNameCOMMENT_LINE	public static final int ER_FAILED_PROCESS_STYLESHEET = 49; 
{	TokenNameLBRACE	
ER_FAILED_PROCESS_STYLESHEET	TokenNameIdentifier	 ER  FAILED  PROCESS  STYLESHEET
,	TokenNameCOMMA	
"Kunde inte behandla stylesheet!"	TokenNameStringLiteral	Kunde inte behandla stylesheet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_COULDNT_PARSE_DOC */	TokenNameCOMMENT_JAVADOC	 ER_COULDNT_PARSE_DOC 
//public static final int ER_COULDNT_PARSE_DOC = 50; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNT_PARSE_DOC = 50; 
{	TokenNameLBRACE	
ER_COULDNT_PARSE_DOC	TokenNameIdentifier	 ER  COULDNT  PARSE  DOC
,	TokenNameCOMMA	
"Kunde inte tolka {0} dokument!"	TokenNameStringLiteral	Kunde inte tolka {0} dokument!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_COULDNT_FIND_FRAGMENT */	TokenNameCOMMENT_JAVADOC	 ER_COULDNT_FIND_FRAGMENT 
//public static final int ER_COULDNT_FIND_FRAGMENT = 51; 	TokenNameCOMMENT_LINE	public static final int ER_COULDNT_FIND_FRAGMENT = 51; 
{	TokenNameLBRACE	
ER_COULDNT_FIND_FRAGMENT	TokenNameIdentifier	 ER  COULDNT  FIND  FRAGMENT
,	TokenNameCOMMA	
"Hittade inte fragment: {0}"	TokenNameStringLiteral	Hittade inte fragment: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NODE_NOT_ELEMENT */	TokenNameCOMMENT_JAVADOC	 ER_NODE_NOT_ELEMENT 
//public static final int ER_NODE_NOT_ELEMENT = 52; 	TokenNameCOMMENT_LINE	public static final int ER_NODE_NOT_ELEMENT = 52; 
{	TokenNameLBRACE	
ER_NODE_NOT_ELEMENT	TokenNameIdentifier	 ER  NODE  NOT  ELEMENT
,	TokenNameCOMMA	
"Nod som pekades på av fragment-identifierare var inte ett element: {0}"	TokenNameStringLiteral	Nod som pekades på av fragment-identifierare var inte ett element: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB 
//public static final int ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB = 53; 	TokenNameCOMMENT_LINE	public static final int ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB = 53; 
{	TokenNameLBRACE	
ER_FOREACH_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  FOREACH  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"for-each kräver antingen en matchning eller ett namnattribut."	TokenNameStringLiteral	for-each kräver antingen en matchning eller ett namnattribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB 
//public static final int ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB = 54; 	TokenNameCOMMENT_LINE	public static final int ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB = 54; 
{	TokenNameLBRACE	
ER_TEMPLATES_NEED_MATCH_OR_NAME_ATTRIB	TokenNameIdentifier	 ER  TEMPLATES  NEED  MATCH  OR  NAME  ATTRIB
,	TokenNameCOMMA	
"mallar kräver antingen en matchning eller ett namnattribut."	TokenNameStringLiteral	mallar kräver antingen en matchning eller ett namnattribut.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_CLONE_OF_DOCUMENT_FRAG */	TokenNameCOMMENT_JAVADOC	 ER_NO_CLONE_OF_DOCUMENT_FRAG 
//public static final int ER_NO_CLONE_OF_DOCUMENT_FRAG = 55; 	TokenNameCOMMENT_LINE	public static final int ER_NO_CLONE_OF_DOCUMENT_FRAG = 55; 
{	TokenNameLBRACE	
ER_NO_CLONE_OF_DOCUMENT_FRAG	TokenNameIdentifier	 ER  NO  CLONE  OF  DOCUMENT  FRAG
,	TokenNameCOMMA	
"Ingen klon av ett dokumentfragment!"	TokenNameStringLiteral	Ingen klon av ett dokumentfragment!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_CREATE_ITEM */	TokenNameCOMMENT_JAVADOC	 ER_CANT_CREATE_ITEM 
//public static final int ER_CANT_CREATE_ITEM = 56; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CREATE_ITEM = 56; 
{	TokenNameLBRACE	
ER_CANT_CREATE_ITEM	TokenNameIdentifier	 ER  CANT  CREATE  ITEM
,	TokenNameCOMMA	
"Kan inte skapa element i resultatträd: {0}"	TokenNameStringLiteral	Kan inte skapa element i resultatträd: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XMLSPACE_ILLEGAL_VALUE */	TokenNameCOMMENT_JAVADOC	 ER_XMLSPACE_ILLEGAL_VALUE 
//public static final int ER_XMLSPACE_ILLEGAL_VALUE = 57; 	TokenNameCOMMENT_LINE	public static final int ER_XMLSPACE_ILLEGAL_VALUE = 57; 
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VALUE	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VALUE
,	TokenNameCOMMA	
"xml:space i käll-XML har ett otillåtet värde: {0}"	TokenNameStringLiteral	xml:space i käll-XML har ett otillåtet värde: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_XSLKEY_DECLARATION */	TokenNameCOMMENT_JAVADOC	 ER_NO_XSLKEY_DECLARATION 
//public static final int ER_NO_XSLKEY_DECLARATION = 58; 	TokenNameCOMMENT_LINE	public static final int ER_NO_XSLKEY_DECLARATION = 58; 
{	TokenNameLBRACE	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
"Det finns ingen xsl:key-deklaration för {0}!"	TokenNameStringLiteral	Det finns ingen xsl:key-deklaration för {0}!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_CREATE_URL */	TokenNameCOMMENT_JAVADOC	 ER_CANT_CREATE_URL 
//public static final int ER_CANT_CREATE_URL = 59; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_CREATE_URL = 59; 
{	TokenNameLBRACE	
ER_CANT_CREATE_URL	TokenNameIdentifier	 ER  CANT  CREATE  URL
,	TokenNameCOMMA	
"Fel! Kan inte skapa url för: {0}"	TokenNameStringLiteral	Fel! Kan inte skapa url för: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XSLFUNCTIONS_UNSUPPORTED */	TokenNameCOMMENT_JAVADOC	 ER_XSLFUNCTIONS_UNSUPPORTED 
//public static final int ER_XSLFUNCTIONS_UNSUPPORTED = 60; 	TokenNameCOMMENT_LINE	public static final int ER_XSLFUNCTIONS_UNSUPPORTED = 60; 
{	TokenNameLBRACE	
ER_XSLFUNCTIONS_UNSUPPORTED	TokenNameIdentifier	 ER  XSLFUNCTIONS  UNSUPPORTED
,	TokenNameCOMMA	
"xsl:functions är inte understödd"	TokenNameStringLiteral	xsl:functions är inte understödd
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESSOR_ERROR */	TokenNameCOMMENT_JAVADOC	 ER_PROCESSOR_ERROR 
//public static final int ER_PROCESSOR_ERROR = 61; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESSOR_ERROR = 61; 
{	TokenNameLBRACE	
ER_PROCESSOR_ERROR	TokenNameIdentifier	 ER  PROCESSOR  ERROR
,	TokenNameCOMMA	
"XSLT TransformerFactory-Fel"	TokenNameStringLiteral	XSLT TransformerFactory-Fel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NOT_ALLOWED_INSIDE_STYLESHEET */	TokenNameCOMMENT_JAVADOC	 ER_NOT_ALLOWED_INSIDE_STYLESHEET 
//public static final int ER_NOT_ALLOWED_INSIDE_STYLESHEET = 62; 	TokenNameCOMMENT_LINE	public static final int ER_NOT_ALLOWED_INSIDE_STYLESHEET = 62; 
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_STYLESHEET	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  STYLESHEET
,	TokenNameCOMMA	
"(StylesheetHandler) {0} är inte tillåten inne i ett stylesheet!"	TokenNameStringLiteral	(StylesheetHandler) {0} är inte tillåten inne i ett stylesheet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_RESULTNS_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 ER_RESULTNS_NOT_SUPPORTED 
//public static final int ER_RESULTNS_NOT_SUPPORTED = 63; 	TokenNameCOMMENT_LINE	public static final int ER_RESULTNS_NOT_SUPPORTED = 63; 
{	TokenNameLBRACE	
ER_RESULTNS_NOT_SUPPORTED	TokenNameIdentifier	 ER  RESULTNS  NOT  SUPPORTED
,	TokenNameCOMMA	
"result-ns inte längre understödd! Använd xsl:output istället."	TokenNameStringLiteral	result-ns inte längre understödd! Använd xsl:output istället.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_DEFAULTSPACE_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 ER_DEFAULTSPACE_NOT_SUPPORTED 
//public static final int ER_DEFAULTSPACE_NOT_SUPPORTED = 64; 	TokenNameCOMMENT_LINE	public static final int ER_DEFAULTSPACE_NOT_SUPPORTED = 64; 
{	TokenNameLBRACE	
ER_DEFAULTSPACE_NOT_SUPPORTED	TokenNameIdentifier	 ER  DEFAULTSPACE  NOT  SUPPORTED
,	TokenNameCOMMA	
"default-space inte längre understödd! Använd xsl:strip-space eller xsl:preserve-space istället."	TokenNameStringLiteral	default-space inte längre understödd! Använd xsl:strip-space eller xsl:preserve-space istället.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_INDENTRESULT_NOT_SUPPORTED */	TokenNameCOMMENT_JAVADOC	 ER_INDENTRESULT_NOT_SUPPORTED 
//public static final int ER_INDENTRESULT_NOT_SUPPORTED = 65; 	TokenNameCOMMENT_LINE	public static final int ER_INDENTRESULT_NOT_SUPPORTED = 65; 
{	TokenNameLBRACE	
ER_INDENTRESULT_NOT_SUPPORTED	TokenNameIdentifier	 ER  INDENTRESULT  NOT  SUPPORTED
,	TokenNameCOMMA	
"indent-result inte längre understödd! Använd xsl:output istället."	TokenNameStringLiteral	indent-result inte längre understödd! Använd xsl:output istället.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_ILLEGAL_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_ILLEGAL_ATTRIB 
//public static final int ER_ILLEGAL_ATTRIB = 66; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_ATTRIB = 66; 
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIB	TokenNameIdentifier	 ER  ILLEGAL  ATTRIB
,	TokenNameCOMMA	
"(StylesheetHandler) {0} har ett otillåtet attribut: {1}"	TokenNameStringLiteral	(StylesheetHandler) {0} har ett otillåtet attribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_UNKNOWN_XSL_ELEM */	TokenNameCOMMENT_JAVADOC	 ER_UNKNOWN_XSL_ELEM 
//public static final int ER_UNKNOWN_XSL_ELEM = 67; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_XSL_ELEM = 67; 
{	TokenNameLBRACE	
ER_UNKNOWN_XSL_ELEM	TokenNameIdentifier	 ER  UNKNOWN  XSL  ELEM
,	TokenNameCOMMA	
"Okänt XSL-element: {0}"	TokenNameStringLiteral	Okänt XSL-element: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_BAD_XSLSORT_USE */	TokenNameCOMMENT_JAVADOC	 ER_BAD_XSLSORT_USE 
//public static final int ER_BAD_XSLSORT_USE = 68; 	TokenNameCOMMENT_LINE	public static final int ER_BAD_XSLSORT_USE = 68; 
{	TokenNameLBRACE	
ER_BAD_XSLSORT_USE	TokenNameIdentifier	 ER  BAD  XSLSORT  USE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:sort kan endast användas med xsl:apply-templates eller xsl:for-each."	TokenNameStringLiteral	(StylesheetHandler) xsl:sort kan endast användas med xsl:apply-templates eller xsl:for-each.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISPLACED_XSLWHEN */	TokenNameCOMMENT_JAVADOC	 ER_MISPLACED_XSLWHEN 
//public static final int ER_MISPLACED_XSLWHEN = 69; 	TokenNameCOMMENT_LINE	public static final int ER_MISPLACED_XSLWHEN = 69; 
{	TokenNameLBRACE	
ER_MISPLACED_XSLWHEN	TokenNameIdentifier	 ER  MISPLACED  XSLWHEN
,	TokenNameCOMMA	
"(StylesheetHandler) felplacerade xsl:when!"	TokenNameStringLiteral	(StylesheetHandler) felplacerade xsl:when!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE */	TokenNameCOMMENT_JAVADOC	 ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE 
//public static final int ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE = 70; 	TokenNameCOMMENT_LINE	public static final int ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE = 70; 
{	TokenNameLBRACE	
ER_XSLWHEN_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLWHEN  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:when härstammar inte från xsl:choose!"	TokenNameStringLiteral	(StylesheetHandler) xsl:when härstammar inte från xsl:choose!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISPLACED_XSLOTHERWISE */	TokenNameCOMMENT_JAVADOC	 ER_MISPLACED_XSLOTHERWISE 
//public static final int ER_MISPLACED_XSLOTHERWISE = 71; 	TokenNameCOMMENT_LINE	public static final int ER_MISPLACED_XSLOTHERWISE = 71; 
{	TokenNameLBRACE	
ER_MISPLACED_XSLOTHERWISE	TokenNameIdentifier	 ER  MISPLACED  XSLOTHERWISE
,	TokenNameCOMMA	
"(StylesheetHandler) felplacerade xsl:otherwise!"	TokenNameStringLiteral	(StylesheetHandler) felplacerade xsl:otherwise!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE */	TokenNameCOMMENT_JAVADOC	 ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE 
//public static final int ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE = 72; 	TokenNameCOMMENT_LINE	public static final int ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE = 72; 
{	TokenNameLBRACE	
ER_XSLOTHERWISE_NOT_PARENTED_BY_XSLCHOOSE	TokenNameIdentifier	 ER  XSLOTHERWISE  NOT  PARENTED  BY  XSLCHOOSE
,	TokenNameCOMMA	
"(StylesheetHandler) xsl:otherwise härstammar inte från xsl:choose!"	TokenNameStringLiteral	(StylesheetHandler) xsl:otherwise härstammar inte från xsl:choose!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NOT_ALLOWED_INSIDE_TEMPLATE */	TokenNameCOMMENT_JAVADOC	 ER_NOT_ALLOWED_INSIDE_TEMPLATE 
//public static final int ER_NOT_ALLOWED_INSIDE_TEMPLATE = 73; 	TokenNameCOMMENT_LINE	public static final int ER_NOT_ALLOWED_INSIDE_TEMPLATE = 73; 
{	TokenNameLBRACE	
ER_NOT_ALLOWED_INSIDE_TEMPLATE	TokenNameIdentifier	 ER  NOT  ALLOWED  INSIDE  TEMPLATE
,	TokenNameCOMMA	
"(StylesheetHandler) {0} är inte tillåten inne i en mall!"	TokenNameStringLiteral	(StylesheetHandler) {0} är inte tillåten inne i en mall!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_UNKNOWN_EXT_NS_PREFIX */	TokenNameCOMMENT_JAVADOC	 ER_UNKNOWN_EXT_NS_PREFIX 
//public static final int ER_UNKNOWN_EXT_NS_PREFIX = 74; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_EXT_NS_PREFIX = 74; 
{	TokenNameLBRACE	
ER_UNKNOWN_EXT_NS_PREFIX	TokenNameIdentifier	 ER  UNKNOWN  EXT  NS  PREFIX
,	TokenNameCOMMA	
"(StylesheetHandler) {0} utbyggnadsnamnrymdsprefix {1} okänt"	TokenNameStringLiteral	(StylesheetHandler) {0} utbyggnadsnamnrymdsprefix {1} okänt
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_IMPORTS_AS_FIRST_ELEM */	TokenNameCOMMENT_JAVADOC	 ER_IMPORTS_AS_FIRST_ELEM 
//public static final int ER_IMPORTS_AS_FIRST_ELEM = 75; 	TokenNameCOMMENT_LINE	public static final int ER_IMPORTS_AS_FIRST_ELEM = 75; 
{	TokenNameLBRACE	
ER_IMPORTS_AS_FIRST_ELEM	TokenNameIdentifier	 ER  IMPORTS  AS  FIRST  ELEM
,	TokenNameCOMMA	
"(StylesheetHandler) Imports kan endast förekomma som de första elementen i ett stylesheet!"	TokenNameStringLiteral	(StylesheetHandler) Imports kan endast förekomma som de första elementen i ett stylesheet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_IMPORTING_ITSELF */	TokenNameCOMMENT_JAVADOC	 ER_IMPORTING_ITSELF 
//public static final int ER_IMPORTING_ITSELF = 76; 	TokenNameCOMMENT_LINE	public static final int ER_IMPORTING_ITSELF = 76; 
{	TokenNameLBRACE	
ER_IMPORTING_ITSELF	TokenNameIdentifier	 ER  IMPORTING  ITSELF
,	TokenNameCOMMA	
"(StylesheetHandler) {0} importerar, direkt eller indirekt, sig själv!"	TokenNameStringLiteral	(StylesheetHandler) {0} importerar, direkt eller indirekt, sig själv!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XMLSPACE_ILLEGAL_VAL */	TokenNameCOMMENT_JAVADOC	 ER_XMLSPACE_ILLEGAL_VAL 
//public static final int ER_XMLSPACE_ILLEGAL_VAL = 77; 	TokenNameCOMMENT_LINE	public static final int ER_XMLSPACE_ILLEGAL_VAL = 77; 
{	TokenNameLBRACE	
ER_XMLSPACE_ILLEGAL_VAL	TokenNameIdentifier	 ER  XMLSPACE  ILLEGAL  VAL
,	TokenNameCOMMA	
"(StylesheetHandler) "	TokenNameStringLiteral	(StylesheetHandler) 
+	TokenNamePLUS	
"xml:space har ett otillåtet värde: {0}"	TokenNameStringLiteral	xml:space har ett otillåtet värde: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL */	TokenNameCOMMENT_JAVADOC	 ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL 
//public static final int ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL = 78; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL = 78; 
{	TokenNameLBRACE	
ER_PROCESSSTYLESHEET_NOT_SUCCESSFUL	TokenNameIdentifier	 ER  PROCESSSTYLESHEET  NOT  SUCCESSFUL
,	TokenNameCOMMA	
"processStylesheet misslyckades!"	TokenNameStringLiteral	processStylesheet misslyckades!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_SAX_EXCEPTION */	TokenNameCOMMENT_JAVADOC	 ER_SAX_EXCEPTION 
//public static final int ER_SAX_EXCEPTION = 79; 	TokenNameCOMMENT_LINE	public static final int ER_SAX_EXCEPTION = 79; 
{	TokenNameLBRACE	
ER_SAX_EXCEPTION	TokenNameIdentifier	 ER  SAX  EXCEPTION
,	TokenNameCOMMA	
"SAX-Undantag"	TokenNameStringLiteral	SAX-Undantag
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XSLT_ERROR */	TokenNameCOMMENT_JAVADOC	 ER_XSLT_ERROR 
//public static final int ER_XSLT_ERROR = 81; 	TokenNameCOMMENT_LINE	public static final int ER_XSLT_ERROR = 81; 
{	TokenNameLBRACE	
ER_XSLT_ERROR	TokenNameIdentifier	 ER  XSLT  ERROR
,	TokenNameCOMMA	
"XSLT-fel"	TokenNameStringLiteral	XSLT-fel
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CURRENCY_SIGN_ILLEGAL */	TokenNameCOMMENT_JAVADOC	 ER_CURRENCY_SIGN_ILLEGAL 
//public static final int ER_CURRENCY_SIGN_ILLEGAL = 82; 	TokenNameCOMMENT_LINE	public static final int ER_CURRENCY_SIGN_ILLEGAL = 82; 
{	TokenNameLBRACE	
ER_CURRENCY_SIGN_ILLEGAL	TokenNameIdentifier	 ER  CURRENCY  SIGN  ILLEGAL
,	TokenNameCOMMA	
"valutatecken är inte tillåtet i formatmönstersträng"	TokenNameStringLiteral	valutatecken är inte tillåtet i formatmönstersträng
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM */	TokenNameCOMMENT_JAVADOC	 ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM 
//public static final int ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM = 83; 	TokenNameCOMMENT_LINE	public static final int ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM = 83; 
{	TokenNameLBRACE	
ER_DOCUMENT_FUNCTION_INVALID_IN_STYLESHEET_DOM	TokenNameIdentifier	 ER  DOCUMENT  FUNCTION  INVALID  IN  STYLESHEET  DOM
,	TokenNameCOMMA	
"Dokumentfunktion inte understödd i Stylesheet DOM!"	TokenNameStringLiteral	Dokumentfunktion inte understödd i Stylesheet DOM!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER */	TokenNameCOMMENT_JAVADOC	 ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER 
//public static final int ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER = 84; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER = 84; 
{	TokenNameLBRACE	
ER_CANT_RESOLVE_PREFIX_OF_NON_PREFIX_RESOLVER	TokenNameIdentifier	 ER  CANT  RESOLVE  PREFIX  OF  NON  PREFIX  RESOLVER
,	TokenNameCOMMA	
"Kan inte lösa prefix i icke-Prefixlösare!"	TokenNameStringLiteral	Kan inte lösa prefix i icke-Prefixlösare!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_REDIRECT_COULDNT_GET_FILENAME */	TokenNameCOMMENT_JAVADOC	 ER_REDIRECT_COULDNT_GET_FILENAME 
//public static final int ER_REDIRECT_COULDNT_GET_FILENAME = 85; 	TokenNameCOMMENT_LINE	public static final int ER_REDIRECT_COULDNT_GET_FILENAME = 85; 
{	TokenNameLBRACE	
ER_REDIRECT_COULDNT_GET_FILENAME	TokenNameIdentifier	 ER  REDIRECT  COULDNT  GET  FILENAME
,	TokenNameCOMMA	
"Redirect extension: Hittade inte filnamn - fil eller valattribut måste returnera vald sträng."	TokenNameStringLiteral	Redirect extension: Hittade inte filnamn - fil eller valattribut måste returnera vald sträng.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT */	TokenNameCOMMENT_JAVADOC	 ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT 
//public static final int ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT = 86; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT = 86; 
{	TokenNameLBRACE	
ER_CANNOT_BUILD_FORMATTERLISTENER_IN_REDIRECT	TokenNameIdentifier	 ER  CANNOT  BUILD  FORMATTERLISTENER  IN  REDIRECT
,	TokenNameCOMMA	
"Kan inte bygga FormatterListener i Redirect extension!"	TokenNameStringLiteral	Kan inte bygga FormatterListener i Redirect extension!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX */	TokenNameCOMMENT_JAVADOC	 ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX 
//public static final int ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX = 87; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX = 87; 
{	TokenNameLBRACE	
ER_INVALID_PREFIX_IN_EXCLUDERESULTPREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX  IN  EXCLUDERESULTPREFIX
,	TokenNameCOMMA	
"Prefix i exkludera-resultat-prefix är inte giltig: {0}"	TokenNameStringLiteral	Prefix i exkludera-resultat-prefix är inte giltig: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISSING_NS_URI */	TokenNameCOMMENT_JAVADOC	 ER_MISSING_NS_URI 
//public static final int ER_MISSING_NS_URI = 88; 	TokenNameCOMMENT_LINE	public static final int ER_MISSING_NS_URI = 88; 
{	TokenNameLBRACE	
ER_MISSING_NS_URI	TokenNameIdentifier	 ER  MISSING  NS  URI
,	TokenNameCOMMA	
"Namnrymds-URI saknas för angivna prefix"	TokenNameStringLiteral	Namnrymds-URI saknas för angivna prefix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MISSING_ARG_FOR_OPTION */	TokenNameCOMMENT_JAVADOC	 ER_MISSING_ARG_FOR_OPTION 
//public static final int ER_MISSING_ARG_FOR_OPTION = 89; 	TokenNameCOMMENT_LINE	public static final int ER_MISSING_ARG_FOR_OPTION = 89; 
{	TokenNameLBRACE	
ER_MISSING_ARG_FOR_OPTION	TokenNameIdentifier	 ER  MISSING  ARG  FOR  OPTION
,	TokenNameCOMMA	
"Argument saknas för alternativ: {0}"	TokenNameStringLiteral	Argument saknas för alternativ: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_INVALID_OPTION */	TokenNameCOMMENT_JAVADOC	 ER_INVALID_OPTION 
//public static final int ER_INVALID_OPTION = 90; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_OPTION = 90; 
{	TokenNameLBRACE	
ER_INVALID_OPTION	TokenNameIdentifier	 ER  INVALID  OPTION
,	TokenNameCOMMA	
"Ogiltigt alternativ: {0}"	TokenNameStringLiteral	Ogiltigt alternativ: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_MALFORMED_FORMAT_STRING */	TokenNameCOMMENT_JAVADOC	 ER_MALFORMED_FORMAT_STRING 
//public static final int ER_MALFORMED_FORMAT_STRING = 91; 	TokenNameCOMMENT_LINE	public static final int ER_MALFORMED_FORMAT_STRING = 91; 
{	TokenNameLBRACE	
ER_MALFORMED_FORMAT_STRING	TokenNameIdentifier	 ER  MALFORMED  FORMAT  STRING
,	TokenNameCOMMA	
"Fel format på formatsträng: {0}"	TokenNameStringLiteral	Fel format på formatsträng: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_STYLESHEET_REQUIRES_VERSION_ATTRIB */	TokenNameCOMMENT_JAVADOC	 ER_STYLESHEET_REQUIRES_VERSION_ATTRIB 
//public static final int ER_STYLESHEET_REQUIRES_VERSION_ATTRIB = 92; 	TokenNameCOMMENT_LINE	public static final int ER_STYLESHEET_REQUIRES_VERSION_ATTRIB = 92; 
{	TokenNameLBRACE	
ER_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 ER  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet måste ha ett 'version'-attribut!"	TokenNameStringLiteral	xsl:stylesheet måste ha ett 'version'-attribut!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_ILLEGAL_ATTRIBUTE_VALUE */	TokenNameCOMMENT_JAVADOC	 ER_ILLEGAL_ATTRIBUTE_VALUE 
//public static final int ER_ILLEGAL_ATTRIBUTE_VALUE = 93; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_ATTRIBUTE_VALUE = 93; 
{	TokenNameLBRACE	
ER_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Attribut: {0} har ett otillåtet värde: {1}"	TokenNameStringLiteral	Attribut: {0} har ett otillåtet värde: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CHOOSE_REQUIRES_WHEN */	TokenNameCOMMENT_JAVADOC	 ER_CHOOSE_REQUIRES_WHEN 
//public static final int ER_CHOOSE_REQUIRES_WHEN = 94; 	TokenNameCOMMENT_LINE	public static final int ER_CHOOSE_REQUIRES_WHEN = 94; 
{	TokenNameLBRACE	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
,	TokenNameCOMMA	
"xsl:choose kräver ett xsl:when"	TokenNameStringLiteral	xsl:choose kräver ett xsl:when
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_NO_APPLY_IMPORT_IN_FOR_EACH */	TokenNameCOMMENT_JAVADOC	 ER_NO_APPLY_IMPORT_IN_FOR_EACH 
//public static final int ER_NO_APPLY_IMPORT_IN_FOR_EACH = 95; 	TokenNameCOMMENT_LINE	public static final int ER_NO_APPLY_IMPORT_IN_FOR_EACH = 95; 
{	TokenNameLBRACE	
ER_NO_APPLY_IMPORT_IN_FOR_EACH	TokenNameIdentifier	 ER  NO  APPLY  IMPORT  IN  FOR  EACH
,	TokenNameCOMMA	
"xsl:apply-imports inte tillåtet i ett xsl:for-each"	TokenNameStringLiteral	xsl:apply-imports inte tillåtet i ett xsl:for-each
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_USE_DTM_FOR_OUTPUT */	TokenNameCOMMENT_JAVADOC	 ER_CANT_USE_DTM_FOR_OUTPUT 
//public static final int ER_CANT_USE_DTM_FOR_OUTPUT = 96; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_USE_DTM_FOR_OUTPUT = 96; 
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_OUTPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  OUTPUT
,	TokenNameCOMMA	
"Kan inte använda DTMLiaison till en DOM utdatanod... skicka en org.apache.xpath.DOM2Helper istället!"	TokenNameStringLiteral	Kan inte använda DTMLiaison till en DOM utdatanod... skicka en org.apache.xpath.DOM2Helper istället!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANT_USE_DTM_FOR_INPUT */	TokenNameCOMMENT_JAVADOC	 ER_CANT_USE_DTM_FOR_INPUT 
//public static final int ER_CANT_USE_DTM_FOR_INPUT = 97; 	TokenNameCOMMENT_LINE	public static final int ER_CANT_USE_DTM_FOR_INPUT = 97; 
{	TokenNameLBRACE	
ER_CANT_USE_DTM_FOR_INPUT	TokenNameIdentifier	 ER  CANT  USE  DTM  FOR  INPUT
,	TokenNameCOMMA	
"Kan inte använda DTMLiaison till en DOM indatanod... skicka en org.apache.xpath.DOM2Helper istället!"	TokenNameStringLiteral	Kan inte använda DTMLiaison till en DOM indatanod... skicka en org.apache.xpath.DOM2Helper istället!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CALL_TO_EXT_FAILED */	TokenNameCOMMENT_JAVADOC	 ER_CALL_TO_EXT_FAILED 
//public static final int ER_CALL_TO_EXT_FAILED = 98; 	TokenNameCOMMENT_LINE	public static final int ER_CALL_TO_EXT_FAILED = 98; 
{	TokenNameLBRACE	
ER_CALL_TO_EXT_FAILED	TokenNameIdentifier	 ER  CALL  TO  EXT  FAILED
,	TokenNameCOMMA	
"Anrop till anslutningselement misslyckades: {0}"	TokenNameStringLiteral	Anrop till anslutningselement misslyckades: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_PREFIX_MUST_RESOLVE */	TokenNameCOMMENT_JAVADOC	 ER_PREFIX_MUST_RESOLVE 
//public static final int ER_PREFIX_MUST_RESOLVE = 99; 	TokenNameCOMMENT_LINE	public static final int ER_PREFIX_MUST_RESOLVE = 99; 
{	TokenNameLBRACE	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
"Prefix måste lösa till en mamnrymd: {0}"	TokenNameStringLiteral	Prefix måste lösa till en mamnrymd: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_INVALID_UTF16_SURROGATE */	TokenNameCOMMENT_JAVADOC	 ER_INVALID_UTF16_SURROGATE 
//public static final int ER_INVALID_UTF16_SURROGATE = 100; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_UTF16_SURROGATE = 100; 
{	TokenNameLBRACE	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
"Ogiltigt UTF-16-surrogat upptäckt: {0} ?"	TokenNameStringLiteral	Ogiltigt UTF-16-surrogat upptäckt: {0} ?
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_XSLATTRSET_USED_ITSELF */	TokenNameCOMMENT_JAVADOC	 ER_XSLATTRSET_USED_ITSELF 
//public static final int ER_XSLATTRSET_USED_ITSELF = 101; 	TokenNameCOMMENT_LINE	public static final int ER_XSLATTRSET_USED_ITSELF = 101; 
{	TokenNameLBRACE	
ER_XSLATTRSET_USED_ITSELF	TokenNameIdentifier	 ER  XSLATTRSET  USED  ITSELF
,	TokenNameCOMMA	
"xsl:attribute-set {0} använde sig självt, vilket kommer att orsaka en oändlig loop."	TokenNameStringLiteral	xsl:attribute-set {0} använde sig självt, vilket kommer att orsaka en oändlig loop.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_CANNOT_MIX_XERCESDOM */	TokenNameCOMMENT_JAVADOC	 ER_CANNOT_MIX_XERCESDOM 
//public static final int ER_CANNOT_MIX_XERCESDOM = 102; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_MIX_XERCESDOM = 102; 
{	TokenNameLBRACE	
ER_CANNOT_MIX_XERCESDOM	TokenNameIdentifier	 ER  CANNOT  MIX  XERCESDOM
,	TokenNameCOMMA	
"Kan inte blanda icke-Xerces-DOM-indata med Xerces-DOM-utdata!"	TokenNameStringLiteral	Kan inte blanda icke-Xerces-DOM-indata med Xerces-DOM-utdata!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_TOO_MANY_LISTENERS */	TokenNameCOMMENT_JAVADOC	 ER_TOO_MANY_LISTENERS 
//public static final int ER_TOO_MANY_LISTENERS = 103; 	TokenNameCOMMENT_LINE	public static final int ER_TOO_MANY_LISTENERS = 103; 
{	TokenNameLBRACE	
ER_TOO_MANY_LISTENERS	TokenNameIdentifier	 ER  TOO  MANY  LISTENERS
,	TokenNameCOMMA	
"addTraceListenersToStylesheet - TooManyListenersException"	TokenNameStringLiteral	addTraceListenersToStylesheet - TooManyListenersException
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_IN_ELEMTEMPLATEELEM_READOBJECT */	TokenNameCOMMENT_JAVADOC	 ER_IN_ELEMTEMPLATEELEM_READOBJECT 
//public static final int ER_IN_ELEMTEMPLATEELEM_READOBJECT = 104; 	TokenNameCOMMENT_LINE	public static final int ER_IN_ELEMTEMPLATEELEM_READOBJECT = 104; 
{	TokenNameLBRACE	
ER_IN_ELEMTEMPLATEELEM_READOBJECT	TokenNameIdentifier	 ER  IN  ELEMTEMPLATEELEM  READOBJECT
,	TokenNameCOMMA	
"I ElemTemplateElement.readObject: {0}"	TokenNameStringLiteral	I ElemTemplateElement.readObject: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_DUPLICATE_NAMED_TEMPLATE */	TokenNameCOMMENT_JAVADOC	 ER_DUPLICATE_NAMED_TEMPLATE 
//public static final int ER_DUPLICATE_NAMED_TEMPLATE = 105; 	TokenNameCOMMENT_LINE	public static final int ER_DUPLICATE_NAMED_TEMPLATE = 105; 
{	TokenNameLBRACE	
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
,	TokenNameCOMMA	
"Hittade mer än en mall med namnet: {0}"	TokenNameStringLiteral	Hittade mer än en mall med namnet: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** ER_INVALID_KEY_CALL */	TokenNameCOMMENT_JAVADOC	 ER_INVALID_KEY_CALL 
//public static final int ER_INVALID_KEY_CALL = 106; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_KEY_CALL = 106; 
{	TokenNameLBRACE	
ER_INVALID_KEY_CALL	TokenNameIdentifier	 ER  INVALID  KEY  CALL
,	TokenNameCOMMA	
"Ogiltigt funktionsanrop: rekursiva key()-anrop är inte tillåtna"	TokenNameStringLiteral	Ogiltigt funktionsanrop: rekursiva key()-anrop är inte tillåtna
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Variable is referencing itself */	TokenNameCOMMENT_JAVADOC	 Variable is referencing itself 
//public static final int ER_REFERENCING_ITSELF = 107; 	TokenNameCOMMENT_LINE	public static final int ER_REFERENCING_ITSELF = 107; 
{	TokenNameLBRACE	
ER_REFERENCING_ITSELF	TokenNameIdentifier	 ER  REFERENCING  ITSELF
,	TokenNameCOMMA	
"Variabel {0} hänvisar, direkt eller indirekt, till sig själv!"	TokenNameStringLiteral	Variabel {0} hänvisar, direkt eller indirekt, till sig själv!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Illegal DOMSource input */	TokenNameCOMMENT_JAVADOC	 Illegal DOMSource input 
//public static final int ER_ILLEGAL_DOMSOURCE_INPUT = 108; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_DOMSOURCE_INPUT = 108; 
{	TokenNameLBRACE	
ER_ILLEGAL_DOMSOURCE_INPUT	TokenNameIdentifier	 ER  ILLEGAL  DOMSOURCE  INPUT
,	TokenNameCOMMA	
"Indatanoden till en DOMSource för newTemplates får inte vara null!"	TokenNameStringLiteral	Indatanoden till en DOMSource för newTemplates får inte vara null!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Class not found for option */	TokenNameCOMMENT_JAVADOC	 Class not found for option 
//public static final int ER_CLASS_NOT_FOUND_FOR_OPTION = 109; 	TokenNameCOMMENT_LINE	public static final int ER_CLASS_NOT_FOUND_FOR_OPTION = 109; 
{	TokenNameLBRACE	
ER_CLASS_NOT_FOUND_FOR_OPTION	TokenNameIdentifier	 ER  CLASS  NOT  FOUND  FOR  OPTION
,	TokenNameCOMMA	
"Klassfil för alternativ {0} saknas"	TokenNameStringLiteral	Klassfil för alternativ {0} saknas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Required Element not found */	TokenNameCOMMENT_JAVADOC	 Required Element not found 
//public static final int ER_REQUIRED_ELEM_NOT_FOUND = 110; 	TokenNameCOMMENT_LINE	public static final int ER_REQUIRED_ELEM_NOT_FOUND = 110; 
{	TokenNameLBRACE	
ER_REQUIRED_ELEM_NOT_FOUND	TokenNameIdentifier	 ER  REQUIRED  ELEM  NOT  FOUND
,	TokenNameCOMMA	
"Nödvändigt element saknas: {0}"	TokenNameStringLiteral	Nödvändigt element saknas: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** InputStream cannot be null */	TokenNameCOMMENT_JAVADOC	 InputStream cannot be null 
//public static final int ER_INPUT_CANNOT_BE_NULL = 111; 	TokenNameCOMMENT_LINE	public static final int ER_INPUT_CANNOT_BE_NULL = 111; 
{	TokenNameLBRACE	
ER_INPUT_CANNOT_BE_NULL	TokenNameIdentifier	 ER  INPUT  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputStream får inte vara null"	TokenNameStringLiteral	InputStream får inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** URI cannot be null */	TokenNameCOMMENT_JAVADOC	 URI cannot be null 
//public static final int ER_URI_CANNOT_BE_NULL = 112; 	TokenNameCOMMENT_LINE	public static final int ER_URI_CANNOT_BE_NULL = 112; 
{	TokenNameLBRACE	
ER_URI_CANNOT_BE_NULL	TokenNameIdentifier	 ER  URI  CANNOT  BE  NULL
,	TokenNameCOMMA	
"URI får inte vara null"	TokenNameStringLiteral	URI får inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** File cannot be null */	TokenNameCOMMENT_JAVADOC	 File cannot be null 
//public static final int ER_FILE_CANNOT_BE_NULL = 113; 	TokenNameCOMMENT_LINE	public static final int ER_FILE_CANNOT_BE_NULL = 113; 
{	TokenNameLBRACE	
ER_FILE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  FILE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Fil får inte vara null"	TokenNameStringLiteral	Fil får inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** InputSource cannot be null */	TokenNameCOMMENT_JAVADOC	 InputSource cannot be null 
//public static final int ER_SOURCE_CANNOT_BE_NULL = 114; 	TokenNameCOMMENT_LINE	public static final int ER_SOURCE_CANNOT_BE_NULL = 114; 
{	TokenNameLBRACE	
ER_SOURCE_CANNOT_BE_NULL	TokenNameIdentifier	 ER  SOURCE  CANNOT  BE  NULL
,	TokenNameCOMMA	
"InputSource får inte vara null"	TokenNameStringLiteral	InputSource får inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Could not initialize BSF Manager */	TokenNameCOMMENT_JAVADOC	 Could not initialize BSF Manager 
//public static final int ER_CANNOT_INIT_BSFMGR = 116; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_INIT_BSFMGR = 116; 
{	TokenNameLBRACE	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
"Kan inte initialisera BSF Manager"	TokenNameStringLiteral	Kan inte initialisera BSF Manager
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Could not compile extension */	TokenNameCOMMENT_JAVADOC	 Could not compile extension 
//public static final int ER_CANNOT_CMPL_EXTENSN = 117; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_CMPL_EXTENSN = 117; 
{	TokenNameLBRACE	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
"Kunde inte kompilera anslutning"	TokenNameStringLiteral	Kunde inte kompilera anslutning
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Could not create extension */	TokenNameCOMMENT_JAVADOC	 Could not create extension 
//public static final int ER_CANNOT_CREATE_EXTENSN = 118; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_CREATE_EXTENSN = 118; 
{	TokenNameLBRACE	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
"Kunde inte skapa anslutning: {0} på grund av: {1}"	TokenNameStringLiteral	Kunde inte skapa anslutning: {0} på grund av: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Instance method call to method {0} requires an Object instance as first argument */	TokenNameCOMMENT_JAVADOC	 Instance method call to method {0} requires an Object instance as first argument 
//public static final int ER_INSTANCE_MTHD_CALL_REQUIRES = 119; 	TokenNameCOMMENT_LINE	public static final int ER_INSTANCE_MTHD_CALL_REQUIRES = 119; 
{	TokenNameLBRACE	
ER_INSTANCE_MTHD_CALL_REQUIRES	TokenNameIdentifier	 ER  INSTANCE  MTHD  CALL  REQUIRES
,	TokenNameCOMMA	
"Instansmetodanrop till metod {0} kräver en Objektinstans som första argument"	TokenNameStringLiteral	Instansmetodanrop till metod {0} kräver en Objektinstans som första argument
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Invalid element name specified */	TokenNameCOMMENT_JAVADOC	 Invalid element name specified 
//public static final int ER_INVALID_ELEMENT_NAME = 120; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_ELEMENT_NAME = 120; 
{	TokenNameLBRACE	
ER_INVALID_ELEMENT_NAME	TokenNameIdentifier	 ER  INVALID  ELEMENT  NAME
,	TokenNameCOMMA	
"Ogiltigt elementnamn angivet {0}"	TokenNameStringLiteral	Ogiltigt elementnamn angivet {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Element name method must be static */	TokenNameCOMMENT_JAVADOC	 Element name method must be static 
//public static final int ER_ELEMENT_NAME_METHOD_STATIC = 121; 	TokenNameCOMMENT_LINE	public static final int ER_ELEMENT_NAME_METHOD_STATIC = 121; 
{	TokenNameLBRACE	
ER_ELEMENT_NAME_METHOD_STATIC	TokenNameIdentifier	 ER  ELEMENT  NAME  METHOD  STATIC
,	TokenNameCOMMA	
"Elementnamnmetod måste vara static {0}"	TokenNameStringLiteral	Elementnamnmetod måste vara static {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Extension function {0} : {1} is unknown */	TokenNameCOMMENT_JAVADOC	 Extension function {0} : {1} is unknown 
//public static final int ER_EXTENSION_FUNC_UNKNOWN = 122; 	TokenNameCOMMENT_LINE	public static final int ER_EXTENSION_FUNC_UNKNOWN = 122; 
{	TokenNameLBRACE	
ER_EXTENSION_FUNC_UNKNOWN	TokenNameIdentifier	 ER  EXTENSION  FUNC  UNKNOWN
,	TokenNameCOMMA	
"Anslutningsfunktion {0} : {1} är okänd"	TokenNameStringLiteral	Anslutningsfunktion {0} : {1} är okänd
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** More than one best match for constructor for */	TokenNameCOMMENT_JAVADOC	 More than one best match for constructor for 
//public static final int ER_MORE_MATCH_CONSTRUCTOR = 123; 	TokenNameCOMMENT_LINE	public static final int ER_MORE_MATCH_CONSTRUCTOR = 123; 
{	TokenNameLBRACE	
ER_MORE_MATCH_CONSTRUCTOR	TokenNameIdentifier	 ER  MORE  MATCH  CONSTRUCTOR
,	TokenNameCOMMA	
"Fler än en bästa matchning för konstruktor för {0}"	TokenNameStringLiteral	Fler än en bästa matchning för konstruktor för {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** More than one best match for method */	TokenNameCOMMENT_JAVADOC	 More than one best match for method 
//public static final int ER_MORE_MATCH_METHOD = 124; 	TokenNameCOMMENT_LINE	public static final int ER_MORE_MATCH_METHOD = 124; 
{	TokenNameLBRACE	
ER_MORE_MATCH_METHOD	TokenNameIdentifier	 ER  MORE  MATCH  METHOD
,	TokenNameCOMMA	
"Fler än en bästa matchning för metod {0}"	TokenNameStringLiteral	Fler än en bästa matchning för metod {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** More than one best match for element method */	TokenNameCOMMENT_JAVADOC	 More than one best match for element method 
//public static final int ER_MORE_MATCH_ELEMENT = 125; 	TokenNameCOMMENT_LINE	public static final int ER_MORE_MATCH_ELEMENT = 125; 
{	TokenNameLBRACE	
ER_MORE_MATCH_ELEMENT	TokenNameIdentifier	 ER  MORE  MATCH  ELEMENT
,	TokenNameCOMMA	
"Fler än en bästa matchning för elementmetod {0}"	TokenNameStringLiteral	Fler än en bästa matchning för elementmetod {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Invalid context passed to evaluate */	TokenNameCOMMENT_JAVADOC	 Invalid context passed to evaluate 
//public static final int ER_INVALID_CONTEXT_PASSED = 126; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_CONTEXT_PASSED = 126; 
{	TokenNameLBRACE	
ER_INVALID_CONTEXT_PASSED	TokenNameIdentifier	 ER  INVALID  CONTEXT  PASSED
,	TokenNameCOMMA	
"Ogiltig kontext skickad för att utvärdera {0}"	TokenNameStringLiteral	Ogiltig kontext skickad för att utvärdera {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Pool already exists */	TokenNameCOMMENT_JAVADOC	 Pool already exists 
//public static final int ER_POOL_EXISTS = 127; 	TokenNameCOMMENT_LINE	public static final int ER_POOL_EXISTS = 127; 
{	TokenNameLBRACE	
ER_POOL_EXISTS	TokenNameIdentifier	 ER  POOL  EXISTS
,	TokenNameCOMMA	
"Pool finns redan"	TokenNameStringLiteral	Pool finns redan
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No driver Name specified */	TokenNameCOMMENT_JAVADOC	 No driver Name specified 
//public static final int ER_NO_DRIVER_NAME = 128; 	TokenNameCOMMENT_LINE	public static final int ER_NO_DRIVER_NAME = 128; 
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME	TokenNameIdentifier	 ER  NO  DRIVER  NAME
,	TokenNameCOMMA	
"Inget driver-namn angivet"	TokenNameStringLiteral	Inget driver-namn angivet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No URL specified */	TokenNameCOMMENT_JAVADOC	 No URL specified 
//public static final int ER_NO_URL = 129; 	TokenNameCOMMENT_LINE	public static final int ER_NO_URL = 129; 
{	TokenNameLBRACE	
ER_NO_URL	TokenNameIdentifier	 ER  NO  URL
,	TokenNameCOMMA	
"Ingen URL angiven"	TokenNameStringLiteral	Ingen URL angiven
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Pool size is less than one */	TokenNameCOMMENT_JAVADOC	 Pool size is less than one 
//public static final int ER_POOL_SIZE_LESSTHAN_ONE = 130; 	TokenNameCOMMENT_LINE	public static final int ER_POOL_SIZE_LESSTHAN_ONE = 130; 
{	TokenNameLBRACE	
ER_POOL_SIZE_LESSTHAN_ONE	TokenNameIdentifier	 ER  POOL  SIZE  LESSTHAN  ONE
,	TokenNameCOMMA	
"Poolstorlek är mindre än ett!"	TokenNameStringLiteral	Poolstorlek är mindre än ett!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Invalid driver name specified */	TokenNameCOMMENT_JAVADOC	 Invalid driver name specified 
//public static final int ER_INVALID_DRIVER = 131; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_DRIVER = 131; 
{	TokenNameLBRACE	
ER_INVALID_DRIVER	TokenNameIdentifier	 ER  INVALID  DRIVER
,	TokenNameCOMMA	
"Ogiltigt driver-namn angivet"	TokenNameStringLiteral	Ogiltigt driver-namn angivet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Did not find the stylesheet root */	TokenNameCOMMENT_JAVADOC	 Did not find the stylesheet root 
//public static final int ER_NO_STYLESHEETROOT = 132; 	TokenNameCOMMENT_LINE	public static final int ER_NO_STYLESHEETROOT = 132; 
{	TokenNameLBRACE	
ER_NO_STYLESHEETROOT	TokenNameIdentifier	 ER  NO  STYLESHEETROOT
,	TokenNameCOMMA	
"Hittade inte stylesheet-roten!"	TokenNameStringLiteral	Hittade inte stylesheet-roten!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Illegal value for xml:space */	TokenNameCOMMENT_JAVADOC	 Illegal value for xml:space 
//public static final int ER_ILLEGAL_XMLSPACE_VALUE = 133; 	TokenNameCOMMENT_LINE	public static final int ER_ILLEGAL_XMLSPACE_VALUE = 133; 
{	TokenNameLBRACE	
ER_ILLEGAL_XMLSPACE_VALUE	TokenNameIdentifier	 ER  ILLEGAL  XMLSPACE  VALUE
,	TokenNameCOMMA	
"Ogiltigt värde för xml:space"	TokenNameStringLiteral	Ogiltigt värde för xml:space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** processFromNode failed */	TokenNameCOMMENT_JAVADOC	 processFromNode failed 
//public static final int ER_PROCESSFROMNODE_FAILED = 134; 	TokenNameCOMMENT_LINE	public static final int ER_PROCESSFROMNODE_FAILED = 134; 
{	TokenNameLBRACE	
ER_PROCESSFROMNODE_FAILED	TokenNameIdentifier	 ER  PROCESSFROMNODE  FAILED
,	TokenNameCOMMA	
"processFromNode misslyckades"	TokenNameStringLiteral	processFromNode misslyckades
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** The resource [] could not load: */	TokenNameCOMMENT_JAVADOC	 The resource [] could not load: 
//public static final int ER_RESOURCE_COULD_NOT_LOAD = 135; 	TokenNameCOMMENT_LINE	public static final int ER_RESOURCE_COULD_NOT_LOAD = 135; 
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_LOAD	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  LOAD
,	TokenNameCOMMA	
"Resursen [ {0} ] kunde inte laddas: {1} {2} {3}"	TokenNameStringLiteral	Resursen [ {0} ] kunde inte laddas: {1} {2} {3}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Buffer size <=0 */	TokenNameCOMMENT_JAVADOC	 Buffer size <=0 
//public static final int ER_BUFFER_SIZE_LESSTHAN_ZERO = 136; 	TokenNameCOMMENT_LINE	public static final int ER_BUFFER_SIZE_LESSTHAN_ZERO = 136; 
{	TokenNameLBRACE	
ER_BUFFER_SIZE_LESSTHAN_ZERO	TokenNameIdentifier	 ER  BUFFER  SIZE  LESSTHAN  ZERO
,	TokenNameCOMMA	
"Bufferstorlek <=0"	TokenNameStringLiteral	Bufferstorlek <=0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Unknown error when calling extension */	TokenNameCOMMENT_JAVADOC	 Unknown error when calling extension 
//public static final int ER_UNKNOWN_ERROR_CALLING_EXTENSION = 137; 	TokenNameCOMMENT_LINE	public static final int ER_UNKNOWN_ERROR_CALLING_EXTENSION = 137; 
{	TokenNameLBRACE	
ER_UNKNOWN_ERROR_CALLING_EXTENSION	TokenNameIdentifier	 ER  UNKNOWN  ERROR  CALLING  EXTENSION
,	TokenNameCOMMA	
"Okänt fel vid anslutningsanrop"	TokenNameStringLiteral	Okänt fel vid anslutningsanrop
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Prefix {0} does not have a corresponding namespace declaration */	TokenNameCOMMENT_JAVADOC	 Prefix {0} does not have a corresponding namespace declaration 
//public static final int ER_NO_NAMESPACE_DECL = 138; 	TokenNameCOMMENT_LINE	public static final int ER_NO_NAMESPACE_DECL = 138; 
{	TokenNameLBRACE	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
"Prefix{0} har inte en motsvarande namnrymdsdeklaration"	TokenNameStringLiteral	Prefix{0} har inte en motsvarande namnrymdsdeklaration
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Element content not allowed for lang=javaclass */	TokenNameCOMMENT_JAVADOC	 Element content not allowed for lang=javaclass 
//public static final int ER_ELEM_CONTENT_NOT_ALLOWED = 139; 	TokenNameCOMMENT_LINE	public static final int ER_ELEM_CONTENT_NOT_ALLOWED = 139; 
{	TokenNameLBRACE	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
"Elementinnehåll är inte tillåtet för lang=javaclass {0}"	TokenNameStringLiteral	Elementinnehåll är inte tillåtet för lang=javaclass {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Stylesheet directed termination */	TokenNameCOMMENT_JAVADOC	 Stylesheet directed termination 
//public static final int ER_STYLESHEET_DIRECTED_TERMINATION = 140; 	TokenNameCOMMENT_LINE	public static final int ER_STYLESHEET_DIRECTED_TERMINATION = 140; 
{	TokenNameLBRACE	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
"Stylesheet-ledd avslutning"	TokenNameStringLiteral	Stylesheet-ledd avslutning
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** 1 or 2 */	TokenNameCOMMENT_JAVADOC	 1 or 2 
//public static final int ER_ONE_OR_TWO = 141; 	TokenNameCOMMENT_LINE	public static final int ER_ONE_OR_TWO = 141; 
{	TokenNameLBRACE	
ER_ONE_OR_TWO	TokenNameIdentifier	 ER  ONE  OR  TWO
,	TokenNameCOMMA	
"1 eller 2"	TokenNameStringLiteral	1 eller 2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** 2 or 3 */	TokenNameCOMMENT_JAVADOC	 2 or 3 
//public static final int ER_TWO_OR_THREE = 142; 	TokenNameCOMMENT_LINE	public static final int ER_TWO_OR_THREE = 142; 
{	TokenNameLBRACE	
ER_TWO_OR_THREE	TokenNameIdentifier	 ER  TWO  OR  THREE
,	TokenNameCOMMA	
"2 eller 3"	TokenNameStringLiteral	2 eller 3
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Could not load {0} (check CLASSPATH), now using just the defaults */	TokenNameCOMMENT_JAVADOC	 Could not load {0} (check CLASSPATH), now using just the defaults 
//public static final int ER_COULD_NOT_LOAD_RESOURCE = 143; 	TokenNameCOMMENT_LINE	public static final int ER_COULD_NOT_LOAD_RESOURCE = 143; 
{	TokenNameLBRACE	
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier	 ER  COULD  NOT  LOAD  RESOURCE
,	TokenNameCOMMA	
"Kunde inte ladda {0} (kontrollera CLASSPATH), använder nu enbart standard"	TokenNameStringLiteral	Kunde inte ladda {0} (kontrollera CLASSPATH), använder nu enbart standard
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Cannot initialize default templates */	TokenNameCOMMENT_JAVADOC	 Cannot initialize default templates 
//public static final int ER_CANNOT_INIT_DEFAULT_TEMPLATES = 144; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_INIT_DEFAULT_TEMPLATES = 144; 
{	TokenNameLBRACE	
ER_CANNOT_INIT_DEFAULT_TEMPLATES	TokenNameIdentifier	 ER  CANNOT  INIT  DEFAULT  TEMPLATES
,	TokenNameCOMMA	
"Kan inte initialisera standardmallar"	TokenNameStringLiteral	Kan inte initialisera standardmallar
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Result should not be null */	TokenNameCOMMENT_JAVADOC	 Result should not be null 
//public static final int ER_RESULT_NULL = 145; 	TokenNameCOMMENT_LINE	public static final int ER_RESULT_NULL = 145; 
{	TokenNameLBRACE	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
"Result borde inte vara null"	TokenNameStringLiteral	Result borde inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Result could not be set */	TokenNameCOMMENT_JAVADOC	 Result could not be set 
//public static final int ER_RESULT_COULD_NOT_BE_SET = 146; 	TokenNameCOMMENT_LINE	public static final int ER_RESULT_COULD_NOT_BE_SET = 146; 
{	TokenNameLBRACE	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
"Result kunde inte sättas"	TokenNameStringLiteral	Result kunde inte sättas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No output specified */	TokenNameCOMMENT_JAVADOC	 No output specified 
//public static final int ER_NO_OUTPUT_SPECIFIED = 147; 	TokenNameCOMMENT_LINE	public static final int ER_NO_OUTPUT_SPECIFIED = 147; 
{	TokenNameLBRACE	
ER_NO_OUTPUT_SPECIFIED	TokenNameIdentifier	 ER  NO  OUTPUT  SPECIFIED
,	TokenNameCOMMA	
"Ingen utdata angiven"	TokenNameStringLiteral	Ingen utdata angiven
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Can't transform to a Result of type */	TokenNameCOMMENT_JAVADOC	 Can't transform to a Result of type 
//public static final int ER_CANNOT_TRANSFORM_TO_RESULT_TYPE = 148; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_TRANSFORM_TO_RESULT_TYPE = 148; 
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_TO_RESULT_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  TO  RESULT  TYPE
,	TokenNameCOMMA	
"Kan inte omvandla till en Result av typ {0}"	TokenNameStringLiteral	Kan inte omvandla till en Result av typ {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Can't transform to a Source of type */	TokenNameCOMMENT_JAVADOC	 Can't transform to a Source of type 
//public static final int ER_CANNOT_TRANSFORM_SOURCE_TYPE = 149; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_TRANSFORM_SOURCE_TYPE = 149; 
{	TokenNameLBRACE	
ER_CANNOT_TRANSFORM_SOURCE_TYPE	TokenNameIdentifier	 ER  CANNOT  TRANSFORM  SOURCE  TYPE
,	TokenNameCOMMA	
"Kan inte omvandla en Source av typ {0}"	TokenNameStringLiteral	Kan inte omvandla en Source av typ {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Null content handler */	TokenNameCOMMENT_JAVADOC	 Null content handler 
//public static final int ER_NULL_CONTENT_HANDLER = 150; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_CONTENT_HANDLER = 150; 
{	TokenNameLBRACE	
ER_NULL_CONTENT_HANDLER	TokenNameIdentifier	 ER  NULL  CONTENT  HANDLER
,	TokenNameCOMMA	
"Innehållshanterare med värde null"	TokenNameStringLiteral	Innehållshanterare med värde null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Null error handler */	TokenNameCOMMENT_JAVADOC	 Null error handler 
//public static final int ER_NULL_ERROR_HANDLER = 151; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_ERROR_HANDLER = 151; 
{	TokenNameLBRACE	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
"Felhanterare med värde null"	TokenNameStringLiteral	Felhanterare med värde null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** parse can not be called if the ContentHandler has not been set */	TokenNameCOMMENT_JAVADOC	 parse can not be called if the ContentHandler has not been set 
//public static final int ER_CANNOT_CALL_PARSE = 152; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_CALL_PARSE = 152; 
{	TokenNameLBRACE	
ER_CANNOT_CALL_PARSE	TokenNameIdentifier	 ER  CANNOT  CALL  PARSE
,	TokenNameCOMMA	
"parse kan inte anropas om ContentHandler inte har satts"	TokenNameStringLiteral	parse kan inte anropas om ContentHandler inte har satts
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No parent for filter */	TokenNameCOMMENT_JAVADOC	 No parent for filter 
//public static final int ER_NO_PARENT_FOR_FILTER = 153; 	TokenNameCOMMENT_LINE	public static final int ER_NO_PARENT_FOR_FILTER = 153; 
{	TokenNameLBRACE	
ER_NO_PARENT_FOR_FILTER	TokenNameIdentifier	 ER  NO  PARENT  FOR  FILTER
,	TokenNameCOMMA	
"Ingen förälder till filter"	TokenNameStringLiteral	Ingen förälder till filter
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No stylesheet found in: {0}, media */	TokenNameCOMMENT_JAVADOC	 No stylesheet found in: {0}, media 
//public static final int ER_NO_STYLESHEET_IN_MEDIA = 154; 	TokenNameCOMMENT_LINE	public static final int ER_NO_STYLESHEET_IN_MEDIA = 154; 
{	TokenNameLBRACE	
ER_NO_STYLESHEET_IN_MEDIA	TokenNameIdentifier	 ER  NO  STYLESHEET  IN  MEDIA
,	TokenNameCOMMA	
"Stylesheet saknas i: {0}, media= {1}"	TokenNameStringLiteral	Stylesheet saknas i: {0}, media= {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** No xml-stylesheet PI found in */	TokenNameCOMMENT_JAVADOC	 No xml-stylesheet PI found in 
//public static final int ER_NO_STYLESHEET_PI = 155; 	TokenNameCOMMENT_LINE	public static final int ER_NO_STYLESHEET_PI = 155; 
{	TokenNameLBRACE	
ER_NO_STYLESHEET_PI	TokenNameIdentifier	 ER  NO  STYLESHEET  PI
,	TokenNameCOMMA	
"xml-stylesheet PI saknas i: {0}"	TokenNameStringLiteral	xml-stylesheet PI saknas i: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Not supported */	TokenNameCOMMENT_JAVADOC	 Not supported 
//public static final int ER_NOT_SUPPORTED = 171; 	TokenNameCOMMENT_LINE	public static final int ER_NOT_SUPPORTED = 171; 
{	TokenNameLBRACE	
ER_NOT_SUPPORTED	TokenNameIdentifier	 ER  NOT  SUPPORTED
,	TokenNameCOMMA	
"Understöds inte: {0}"	TokenNameStringLiteral	Understöds inte: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Value for property {0} should be a Boolean instance */	TokenNameCOMMENT_JAVADOC	 Value for property {0} should be a Boolean instance 
//public static final int ER_PROPERTY_VALUE_BOOLEAN = 177; 	TokenNameCOMMENT_LINE	public static final int ER_PROPERTY_VALUE_BOOLEAN = 177; 
{	TokenNameLBRACE	
ER_PROPERTY_VALUE_BOOLEAN	TokenNameIdentifier	 ER  PROPERTY  VALUE  BOOLEAN
,	TokenNameCOMMA	
"Värde på egenskap {0} borde vara en Boolesk instans"	TokenNameStringLiteral	Värde på egenskap {0} borde vara en Boolesk instans
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/* This key/message changed ,NEED ER_COULD_NOT_FIND_EXTERN_SCRIPT: Pending,Ramesh */	TokenNameCOMMENT_BLOCK	 This key/message changed ,NEED ER_COULD_NOT_FIND_EXTERN_SCRIPT: Pending,Ramesh 
/** src attribute not yet supported for */	TokenNameCOMMENT_JAVADOC	 src attribute not yet supported for 
//public static final int ER_SRC_ATTRIB_NOT_SUPPORTED = 195; 	TokenNameCOMMENT_LINE	public static final int ER_SRC_ATTRIB_NOT_SUPPORTED = 195; 
{	TokenNameLBRACE	
"ER_SRC_ATTRIB_NOT_SUPPORTED"	TokenNameStringLiteral	ER_SRC_ATTRIB_NOT_SUPPORTED
,	TokenNameCOMMA	
"src-attributet understöds ännu inte för {0}"	TokenNameStringLiteral	src-attributet understöds ännu inte för {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** The resource [] could not be found */	TokenNameCOMMENT_JAVADOC	 The resource [] could not be found 
//public static final int ER_RESOURCE_COULD_NOT_FIND = 196; 	TokenNameCOMMENT_LINE	public static final int ER_RESOURCE_COULD_NOT_FIND = 196; 
{	TokenNameLBRACE	
ER_RESOURCE_COULD_NOT_FIND	TokenNameIdentifier	 ER  RESOURCE  COULD  NOT  FIND
,	TokenNameCOMMA	
"Resursen [ {0} ] saknas. {1}"	TokenNameStringLiteral	Resursen [ {0} ] saknas. {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** output property not recognized: */	TokenNameCOMMENT_JAVADOC	 output property not recognized: 
//public static final int ER_OUTPUT_PROPERTY_NOT_RECOGNIZED = 197; 	TokenNameCOMMENT_LINE	public static final int ER_OUTPUT_PROPERTY_NOT_RECOGNIZED = 197; 
{	TokenNameLBRACE	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
"Utdata-egenskap känns inte igen: {0}"	TokenNameStringLiteral	Utdata-egenskap känns inte igen: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Failed creating ElemLiteralResult instance */	TokenNameCOMMENT_JAVADOC	 Failed creating ElemLiteralResult instance 
//public static final int ER_FAILED_CREATING_ELEMLITRSLT = 203; 	TokenNameCOMMENT_LINE	public static final int ER_FAILED_CREATING_ELEMLITRSLT = 203; 
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMLITRSLT	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMLITRSLT
,	TokenNameCOMMA	
"Kunde inte skapa instans av ElemLiteralResult"	TokenNameStringLiteral	Kunde inte skapa instans av ElemLiteralResult
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 	TokenNameCOMMENT_LINE	Earlier (JDK 1.4 XALAN 2.2-D11) at key code '204' the key name was ER_PRIORITY_NOT_PARSABLE 
// In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 	TokenNameCOMMENT_LINE	In latest Xalan code base key name is ER_VALUE_SHOULD_BE_NUMBER. This should also be taken care 
//in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 	TokenNameCOMMENT_LINE	in locale specific files like XSLTErrorResources_de.java, XSLTErrorResources_fr.java etc. 
//NOTE: Not only the key name but message has also been changed. - nb. 	TokenNameCOMMENT_LINE	NOTE: Not only the key name but message has also been changed. - nb. 
/** Priority value does not contain a parsable number */	TokenNameCOMMENT_JAVADOC	 Priority value does not contain a parsable number 
//public static final int ER_VALUE_SHOULD_BE_NUMBER = 204; 	TokenNameCOMMENT_LINE	public static final int ER_VALUE_SHOULD_BE_NUMBER = 204; 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_BE_NUMBER	TokenNameIdentifier	 ER  VALUE  SHOULD  BE  NUMBER
,	TokenNameCOMMA	
"Värdet för {0} bör innehålla en siffra som inte kan tolkas"	TokenNameStringLiteral	Värdet för {0} bör innehålla en siffra som inte kan tolkas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Value for {0} should equal 'yes' or 'no' */	TokenNameCOMMENT_JAVADOC	 Value for {0} should equal 'yes' or 'no' 
//public static final int ER_VALUE_SHOULD_EQUAL = 205; 	TokenNameCOMMENT_LINE	public static final int ER_VALUE_SHOULD_EQUAL = 205; 
{	TokenNameLBRACE	
ER_VALUE_SHOULD_EQUAL	TokenNameIdentifier	 ER  VALUE  SHOULD  EQUAL
,	TokenNameCOMMA	
"Värde på {0} borde motsvara ja eller nej"	TokenNameStringLiteral	Värde på {0} borde motsvara ja eller nej
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Failed calling {0} method */	TokenNameCOMMENT_JAVADOC	 Failed calling {0} method 
//public static final int ER_FAILED_CALLING_METHOD = 206; 	TokenNameCOMMENT_LINE	public static final int ER_FAILED_CALLING_METHOD = 206; 
{	TokenNameLBRACE	
ER_FAILED_CALLING_METHOD	TokenNameIdentifier	 ER  FAILED  CALLING  METHOD
,	TokenNameCOMMA	
" Kunde inte anropa metoden {0}"	TokenNameStringLiteral	 Kunde inte anropa metoden {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Failed creating ElemLiteralResult instance */	TokenNameCOMMENT_JAVADOC	 Failed creating ElemLiteralResult instance 
//public static final int ER_FAILED_CREATING_ELEMTMPL = 207; 	TokenNameCOMMENT_LINE	public static final int ER_FAILED_CREATING_ELEMTMPL = 207; 
{	TokenNameLBRACE	
ER_FAILED_CREATING_ELEMTMPL	TokenNameIdentifier	 ER  FAILED  CREATING  ELEMTMPL
,	TokenNameCOMMA	
"Kunde inte skapa instans av ElemTemplateElement"	TokenNameStringLiteral	Kunde inte skapa instans av ElemTemplateElement
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Characters are not allowed at this point in the document */	TokenNameCOMMENT_JAVADOC	 Characters are not allowed at this point in the document 
//public static final int ER_CHARS_NOT_ALLOWED = 208; 	TokenNameCOMMENT_LINE	public static final int ER_CHARS_NOT_ALLOWED = 208; 
{	TokenNameLBRACE	
ER_CHARS_NOT_ALLOWED	TokenNameIdentifier	 ER  CHARS  NOT  ALLOWED
,	TokenNameCOMMA	
"Tecken är inte tillåtna i dokumentet vid den här tidpunkten"	TokenNameStringLiteral	Tecken är inte tillåtna i dokumentet vid den här tidpunkten
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** attribute is not allowed on the element */	TokenNameCOMMENT_JAVADOC	 attribute is not allowed on the element 
//public static final int ER_ATTR_NOT_ALLOWED = 209; 	TokenNameCOMMENT_LINE	public static final int ER_ATTR_NOT_ALLOWED = 209; 
{	TokenNameLBRACE	
ER_ATTR_NOT_ALLOWED	TokenNameIdentifier	 ER  ATTR  NOT  ALLOWED
,	TokenNameCOMMA	
"Attributet "{0}" är inte tillåten i det {1} elementet!"	TokenNameStringLiteral	Attributet "{0}" är inte tillåten i det {1} elementet!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Bad value */	TokenNameCOMMENT_JAVADOC	 Bad value 
//public static final int ER_BAD_VALUE = 211; 	TokenNameCOMMENT_LINE	public static final int ER_BAD_VALUE = 211; 
{	TokenNameLBRACE	
ER_BAD_VALUE	TokenNameIdentifier	 ER  BAD  VALUE
,	TokenNameCOMMA	
"{0} dåligt värde {1} "	TokenNameStringLiteral	{0} dåligt värde {1} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** attribute value not found */	TokenNameCOMMENT_JAVADOC	 attribute value not found 
//public static final int ER_ATTRIB_VALUE_NOT_FOUND = 212; 	TokenNameCOMMENT_LINE	public static final int ER_ATTRIB_VALUE_NOT_FOUND = 212; 
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_FOUND	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  FOUND
,	TokenNameCOMMA	
"Attributet {0} saknas "	TokenNameStringLiteral	Attributet {0} saknas 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** attribute value not recognized */	TokenNameCOMMENT_JAVADOC	 attribute value not recognized 
//public static final int ER_ATTRIB_VALUE_NOT_RECOGNIZED = 213; 	TokenNameCOMMENT_LINE	public static final int ER_ATTRIB_VALUE_NOT_RECOGNIZED = 213; 
{	TokenNameLBRACE	
ER_ATTRIB_VALUE_NOT_RECOGNIZED	TokenNameIdentifier	 ER  ATTRIB  VALUE  NOT  RECOGNIZED
,	TokenNameCOMMA	
"Attributvärdet {0} känns inte igen "	TokenNameStringLiteral	Attributvärdet {0} känns inte igen 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Attempting to generate a namespace prefix with a null URI */	TokenNameCOMMENT_JAVADOC	 Attempting to generate a namespace prefix with a null URI 
//public static final int ER_NULL_URI_NAMESPACE = 216; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_URI_NAMESPACE = 216; 
{	TokenNameLBRACE	
ER_NULL_URI_NAMESPACE	TokenNameIdentifier	 ER  NULL  URI  NAMESPACE
,	TokenNameCOMMA	
"Försöker generera ett namnområdesprefix med en null-URI"	TokenNameStringLiteral	Försöker generera ett namnområdesprefix med en null-URI
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new ERROR keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
/** Attempting to generate a namespace prefix with a null URI */	TokenNameCOMMENT_JAVADOC	 Attempting to generate a namespace prefix with a null URI 
//public static final int ER_NUMBER_TOO_BIG = 217; 	TokenNameCOMMENT_LINE	public static final int ER_NUMBER_TOO_BIG = 217; 
{	TokenNameLBRACE	
ER_NUMBER_TOO_BIG	TokenNameIdentifier	 ER  NUMBER  TOO  BIG
,	TokenNameCOMMA	
"Försöker formatera en siffra som är större än det största långa heltalet"	TokenNameStringLiteral	Försöker formatera en siffra som är större än det största långa heltalet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//ER_CANNOT_FIND_SAX1_DRIVER 	TokenNameCOMMENT_LINE	ER_CANNOT_FIND_SAX1_DRIVER 
//public static final int ER_CANNOT_FIND_SAX1_DRIVER = 218; 	TokenNameCOMMENT_LINE	public static final int ER_CANNOT_FIND_SAX1_DRIVER = 218; 
{	TokenNameLBRACE	
ER_CANNOT_FIND_SAX1_DRIVER	TokenNameIdentifier	 ER  CANNOT  FIND  SA X1  DRIVER
,	TokenNameCOMMA	
"Det går inte att hitta SAX1-drivrutinen klass {0}"	TokenNameStringLiteral	Det går inte att hitta SAX1-drivrutinen klass {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//ER_SAX1_DRIVER_NOT_LOADED 	TokenNameCOMMENT_LINE	ER_SAX1_DRIVER_NOT_LOADED 
//public static final int ER_SAX1_DRIVER_NOT_LOADED = 219; 	TokenNameCOMMENT_LINE	public static final int ER_SAX1_DRIVER_NOT_LOADED = 219; 
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_LOADED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  LOADED
,	TokenNameCOMMA	
"SAX1-drivrutinen klass {0} hittades men kan inte laddas"	TokenNameStringLiteral	SAX1-drivrutinen klass {0} hittades men kan inte laddas
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//ER_SAX1_DRIVER_NOT_INSTANTIATED 	TokenNameCOMMENT_LINE	ER_SAX1_DRIVER_NOT_INSTANTIATED 
//public static final int ER_SAX1_DRIVER_NOT_INSTANTIATED = 220 ; 	TokenNameCOMMENT_LINE	public static final int ER_SAX1_DRIVER_NOT_INSTANTIATED = 220 ; 
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_INSTANTIATED	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  INSTANTIATED
,	TokenNameCOMMA	
"SAX1-drivrutinen klass {0} hittades men kan inte instansieras"	TokenNameStringLiteral	SAX1-drivrutinen klass {0} hittades men kan inte instansieras
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER 	TokenNameCOMMENT_LINE	ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER 
//public static final int ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER = 221; 	TokenNameCOMMENT_LINE	public static final int ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER = 221; 
{	TokenNameLBRACE	
ER_SAX1_DRIVER_NOT_IMPLEMENT_PARSER	TokenNameIdentifier	 ER  SA X1  DRIVER  NOT  IMPLEMENT  PARSER
,	TokenNameCOMMA	
"SAX1-drivrutinen klass {0} implementerar inte org.xml.sax.Parser"	TokenNameStringLiteral	SAX1-drivrutinen klass {0} implementerar inte org.xml.sax.Parser
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ER_PARSER_PROPERTY_NOT_SPECIFIED 	TokenNameCOMMENT_LINE	ER_PARSER_PROPERTY_NOT_SPECIFIED 
//public static final int ER_PARSER_PROPERTY_NOT_SPECIFIED = 222; 	TokenNameCOMMENT_LINE	public static final int ER_PARSER_PROPERTY_NOT_SPECIFIED = 222; 
{	TokenNameLBRACE	
ER_PARSER_PROPERTY_NOT_SPECIFIED	TokenNameIdentifier	 ER  PARSER  PROPERTY  NOT  SPECIFIED
,	TokenNameCOMMA	
"Systemegenskapen org.xml.sax.parser är inte angiven"	TokenNameStringLiteral	Systemegenskapen org.xml.sax.parser är inte angiven
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//ER_PARSER_ARG_CANNOT_BE_NULL 	TokenNameCOMMENT_LINE	ER_PARSER_ARG_CANNOT_BE_NULL 
//public static final int ER_PARSER_ARG_CANNOT_BE_NULL = 223 ; 	TokenNameCOMMENT_LINE	public static final int ER_PARSER_ARG_CANNOT_BE_NULL = 223 ; 
{	TokenNameLBRACE	
ER_PARSER_ARG_CANNOT_BE_NULL	TokenNameIdentifier	 ER  PARSER  ARG  CANNOT  BE  NULL
,	TokenNameCOMMA	
"Tolkningsargumentet får inte vara null"	TokenNameStringLiteral	Tolkningsargumentet får inte vara null
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ER_FEATURE 	TokenNameCOMMENT_LINE	ER_FEATURE 
//public static final int ER_FEATURE = 224; 	TokenNameCOMMENT_LINE	public static final int ER_FEATURE = 224; 
{	TokenNameLBRACE	
ER_FEATURE	TokenNameIdentifier	 ER  FEATURE
,	TokenNameCOMMA	
"Funktion:a {0}"	TokenNameStringLiteral	Funktion:a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ER_PROPERTY 	TokenNameCOMMENT_LINE	ER_PROPERTY 
//public static final int ER_PROPERTY = 225 ; 	TokenNameCOMMENT_LINE	public static final int ER_PROPERTY = 225 ; 
{	TokenNameLBRACE	
ER_PROPERTY	TokenNameIdentifier	 ER  PROPERTY
,	TokenNameCOMMA	
"Egenskap:a {0}"	TokenNameStringLiteral	Egenskap:a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ER_NULL_ENTITY_RESOLVER 	TokenNameCOMMENT_LINE	ER_NULL_ENTITY_RESOLVER 
//public static final int ER_NULL_ENTITY_RESOLVER = 226; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_ENTITY_RESOLVER = 226; 
{	TokenNameLBRACE	
ER_NULL_ENTITY_RESOLVER	TokenNameIdentifier	 ER  NULL  ENTITY  RESOLVER
,	TokenNameCOMMA	
"Nullenhetslösare"	TokenNameStringLiteral	Nullenhetslösare
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ER_NULL_DTD_HANDLER 	TokenNameCOMMENT_LINE	ER_NULL_DTD_HANDLER 
//public static final int ER_NULL_DTD_HANDLER = 227 ; 	TokenNameCOMMENT_LINE	public static final int ER_NULL_DTD_HANDLER = 227 ; 
{	TokenNameLBRACE	
ER_NULL_DTD_HANDLER	TokenNameIdentifier	 ER  NULL  DTD  HANDLER
,	TokenNameCOMMA	
"Null-DTD-hanterare"	TokenNameStringLiteral	Null-DTD-hanterare
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// No Driver Name Specified! 	TokenNameCOMMENT_LINE	No Driver Name Specified! 
//public static final int ER_NO_DRIVER_NAME_SPECIFIED = 228; 	TokenNameCOMMENT_LINE	public static final int ER_NO_DRIVER_NAME_SPECIFIED = 228; 
{	TokenNameLBRACE	
ER_NO_DRIVER_NAME_SPECIFIED	TokenNameIdentifier	 ER  NO  DRIVER  NAME  SPECIFIED
,	TokenNameCOMMA	
"Inget drivrutinsnamn är angett!"	TokenNameStringLiteral	Inget drivrutinsnamn är angett!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// No URL Specified! 	TokenNameCOMMENT_LINE	No URL Specified! 
//public static final int ER_NO_URL_SPECIFIED = 229; 	TokenNameCOMMENT_LINE	public static final int ER_NO_URL_SPECIFIED = 229; 
{	TokenNameLBRACE	
ER_NO_URL_SPECIFIED	TokenNameIdentifier	 ER  NO  URL  SPECIFIED
,	TokenNameCOMMA	
"Ingen URL har angetts!"	TokenNameStringLiteral	Ingen URL har angetts!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Pool size is less than 1! 	TokenNameCOMMENT_LINE	Pool size is less than 1! 
//public static final int ER_POOLSIZE_LESS_THAN_ONE = 230; 	TokenNameCOMMENT_LINE	public static final int ER_POOLSIZE_LESS_THAN_ONE = 230; 
{	TokenNameLBRACE	
ER_POOLSIZE_LESS_THAN_ONE	TokenNameIdentifier	 ER  POOLSIZE  LESS  THAN  ONE
,	TokenNameCOMMA	
"Poolstorleken är mindre än 1!"	TokenNameStringLiteral	Poolstorleken är mindre än 1!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Invalid Driver Name Specified! 	TokenNameCOMMENT_LINE	Invalid Driver Name Specified! 
//public static final int ER_INVALID_DRIVER_NAME = 231; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_DRIVER_NAME = 231; 
{	TokenNameLBRACE	
ER_INVALID_DRIVER_NAME	TokenNameIdentifier	 ER  INVALID  DRIVER  NAME
,	TokenNameCOMMA	
"Ett ogiltigt drivrutinsnamn har angetts!"	TokenNameStringLiteral	Ett ogiltigt drivrutinsnamn har angetts!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// ErrorListener 	TokenNameCOMMENT_LINE	ErrorListener 
//public static final int ER_ERRORLISTENER = 232; 	TokenNameCOMMENT_LINE	public static final int ER_ERRORLISTENER = 232; 
{	TokenNameLBRACE	
ER_ERRORLISTENER	TokenNameIdentifier	 ER  ERRORLISTENER
,	TokenNameCOMMA	
"ErrorListener"	TokenNameStringLiteral	ErrorListener
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Programmer's error! expr has no ElemTemplateElement parent! 	TokenNameCOMMENT_LINE	Programmer's error! expr has no ElemTemplateElement parent! 
//public static final int ER_ASSERT_NO_TEMPLATE_PARENT = 233; 	TokenNameCOMMENT_LINE	public static final int ER_ASSERT_NO_TEMPLATE_PARENT = 233; 
{	TokenNameLBRACE	
ER_ASSERT_NO_TEMPLATE_PARENT	TokenNameIdentifier	 ER  ASSERT  NO  TEMPLATE  PARENT
,	TokenNameCOMMA	
"Programmerarfel! expr har inget överordnat ElemTemplateElement!"	TokenNameStringLiteral	Programmerarfel! expr har inget överordnat ElemTemplateElement!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Programmer's assertion in RundundentExprEliminator: {0} 	TokenNameCOMMENT_LINE	Programmer's assertion in RundundentExprEliminator: {0} 
//public static final int ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR = 234; 	TokenNameCOMMENT_LINE	public static final int ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR = 234; 
{	TokenNameLBRACE	
ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR	TokenNameIdentifier	 ER  ASSERT  REDUNDENT  EXPR  ELIMINATOR
,	TokenNameCOMMA	
"Programmerarkontroll i RundundentExprEliminator: {0}"	TokenNameStringLiteral	Programmerarkontroll i RundundentExprEliminator: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// {0}is not allowed in this position in the stylesheet! 	TokenNameCOMMENT_LINE	{0}is not allowed in this position in the stylesheet! 
//public static final int ER_NOT_ALLOWED_IN_POSITION = 237; 	TokenNameCOMMENT_LINE	public static final int ER_NOT_ALLOWED_IN_POSITION = 237; 
{	TokenNameLBRACE	
ER_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"{0} är inte tillåten i denna position i formatmallen!"	TokenNameStringLiteral	{0} är inte tillåten i denna position i formatmallen!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Non-whitespace text is not allowed in this position in the stylesheet! 	TokenNameCOMMENT_LINE	Non-whitespace text is not allowed in this position in the stylesheet! 
//public static final int ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION = 238; 	TokenNameCOMMENT_LINE	public static final int ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION = 238; 
{	TokenNameLBRACE	
ER_NONWHITESPACE_NOT_ALLOWED_IN_POSITION	TokenNameIdentifier	 ER  NONWHITESPACE  NOT  ALLOWED  IN  POSITION
,	TokenNameCOMMA	
"Text utan blanksteg är inte tillåten i denna position i formatmallen!"	TokenNameStringLiteral	Text utan blanksteg är inte tillåten i denna position i formatmallen!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// This code is shared with warning codes. 	TokenNameCOMMENT_LINE	This code is shared with warning codes. 
// Illegal value: {1} used for CHAR attribute: {0}. An attribute of type CHAR must be only 1 character! 	TokenNameCOMMENT_LINE	Illegal value: {1} used for CHAR attribute: {0}. An attribute of type CHAR must be only 1 character! 
//public static final int INVALID_TCHAR = 239; 	TokenNameCOMMENT_LINE	public static final int INVALID_TCHAR = 239; 
// SystemId Unknown 	TokenNameCOMMENT_LINE	SystemId Unknown 
{	TokenNameLBRACE	
INVALID_TCHAR	TokenNameIdentifier	 INVALID  TCHAR
,	TokenNameCOMMA	
"Ogiltigt värde: {1} används för CHAR-attributet: {0}. Ett attribut av CHAR-typ får bara ha 1 tecken!"	TokenNameStringLiteral	Ogiltigt värde: {1} används för CHAR-attributet: {0}. Ett attribut av CHAR-typ får bara ha 1 tecken!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "QNAME" is the XML data-type of 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "QNAME" is the XML data-type of 
// the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
// INVALID_QNAME 	TokenNameCOMMENT_LINE	INVALID_QNAME 
//The following codes are shared with the warning codes... 	TokenNameCOMMENT_LINE	The following codes are shared with the warning codes... 
// Illegal value: {1} used for QNAME attribute: {0} 	TokenNameCOMMENT_LINE	Illegal value: {1} used for QNAME attribute: {0} 
//public static final int INVALID_QNAME = 242; 	TokenNameCOMMENT_LINE	public static final int INVALID_QNAME = 242; 
{	TokenNameLBRACE	
INVALID_QNAME	TokenNameIdentifier	 INVALID  QNAME
,	TokenNameCOMMA	
"Ogiltigt värde:a {1} används för QNAME-attributet:a {0}"	TokenNameStringLiteral	Ogiltigt värde:a {1} används för QNAME-attributet:a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "ENUM" is the XML data-type of 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "ENUM" is the XML data-type of 
// the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	the attribute, and should not be translated. The substitution text {1} is 
// the attribute value, {0} is the attribute name, and {2} is a list of valid 	TokenNameCOMMENT_LINE	the attribute value, {0} is the attribute name, and {2} is a list of valid 
// values. 	TokenNameCOMMENT_LINE	values. 
// INVALID_ENUM 	TokenNameCOMMENT_LINE	INVALID_ENUM 
// Illegal value:a {1} used for ENUM attribute:a {0}. Valid values are:a {2}. 	TokenNameCOMMENT_LINE	Illegal value:a {1} used for ENUM attribute:a {0}. Valid values are:a {2}. 
//public static final int INVALID_ENUM = 243; 	TokenNameCOMMENT_LINE	public static final int INVALID_ENUM = 243; 
{	TokenNameLBRACE	
INVALID_ENUM	TokenNameIdentifier	 INVALID  ENUM
,	TokenNameCOMMA	
"Ogiltigt värde:a {1} används för ENUM-attributet:a {0}. Giltiga värden är:a {2}."	TokenNameStringLiteral	Ogiltigt värde:a {1} används för ENUM-attributet:a {0}. Giltiga värden är:a {2}.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NMTOKEN" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
// INVALID_NMTOKEN 	TokenNameCOMMENT_LINE	INVALID_NMTOKEN 
// Illegal value:a {1} used for NMTOKEN attribute:a {0}. 	TokenNameCOMMENT_LINE	Illegal value:a {1} used for NMTOKEN attribute:a {0}. 
//public static final int INVALID_NMTOKEN = 244; 	TokenNameCOMMENT_LINE	public static final int INVALID_NMTOKEN = 244; 
{	TokenNameLBRACE	
INVALID_NMTOKEN	TokenNameIdentifier	 INVALID  NMTOKEN
,	TokenNameCOMMA	
"Ogiltigt värde:a {1} används för NMTOKEN-attributet:a {0} "	TokenNameStringLiteral	Ogiltigt värde:a {1} används för NMTOKEN-attributet:a {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "NCNAME" is the XML data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
// INVALID_NCNAME 	TokenNameCOMMENT_LINE	INVALID_NCNAME 
// Illegal value:a {1} used for NCNAME attribute:a {0}. 	TokenNameCOMMENT_LINE	Illegal value:a {1} used for NCNAME attribute:a {0}. 
//public static final int INVALID_NCNAME = 245; 	TokenNameCOMMENT_LINE	public static final int INVALID_NCNAME = 245; 
{	TokenNameLBRACE	
INVALID_NCNAME	TokenNameIdentifier	 INVALID  NCNAME
,	TokenNameCOMMA	
"Ogiltigt värde:a {1} används för NCNAME-attributet:a {0} "	TokenNameStringLiteral	Ogiltigt värde:a {1} används för NCNAME-attributet:a {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "boolean" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
// INVALID_BOOLEAN 	TokenNameCOMMENT_LINE	INVALID_BOOLEAN 
// Illegal value:a {1} used for boolean attribute:a {0}. 	TokenNameCOMMENT_LINE	Illegal value:a {1} used for boolean attribute:a {0}. 
//public static final int INVALID_BOOLEAN = 246; 	TokenNameCOMMENT_LINE	public static final int INVALID_BOOLEAN = 246; 
{	TokenNameLBRACE	
INVALID_BOOLEAN	TokenNameIdentifier	 INVALID  BOOLEAN
,	TokenNameCOMMA	
"Ogiltigt värde:a {1} används som Booleskt attribut:a {0} "	TokenNameStringLiteral	Ogiltigt värde:a {1} används som Booleskt attribut:a {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message is used if the value of 	TokenNameCOMMENT_LINE	Note to translators: The following message is used if the value of 
// an attribute in a stylesheet is invalid. "number" is the XSLT data-type 	TokenNameCOMMENT_LINE	an attribute in a stylesheet is invalid. "number" is the XSLT data-type 
// of the attribute, and should not be translated. The substitution text {1} is 	TokenNameCOMMENT_LINE	of the attribute, and should not be translated. The substitution text {1} is 
// the attribute value and {0} is the attribute name. 	TokenNameCOMMENT_LINE	the attribute value and {0} is the attribute name. 
// INVALID_NUMBER 	TokenNameCOMMENT_LINE	INVALID_NUMBER 
// Illegal value:a {1} used for number attribute:a {0}. 	TokenNameCOMMENT_LINE	Illegal value:a {1} used for number attribute:a {0}. 
//public static final int INVALID_NUMBER = 247; 	TokenNameCOMMENT_LINE	public static final int INVALID_NUMBER = 247; 
{	TokenNameLBRACE	
INVALID_NUMBER	TokenNameIdentifier	 INVALID  NUMBER
,	TokenNameCOMMA	
"Ogiltigt värde:a {1} används som sifferattribut:a {0} "	TokenNameStringLiteral	Ogiltigt värde:a {1} används som sifferattribut:a {0} 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// End of shared codes... 	TokenNameCOMMENT_LINE	End of shared codes... 
// Note to translators: A "match pattern" is a special form of XPath expression 	TokenNameCOMMENT_LINE	Note to translators: A "match pattern" is a special form of XPath expression 
// that is used for matching patterns. The substitution text is the name of 	TokenNameCOMMENT_LINE	that is used for matching patterns. The substitution text is the name of 
// a function. The message indicates that when this function is referenced in 	TokenNameCOMMENT_LINE	a function. The message indicates that when this function is referenced in 
// a match pattern, its argument must be a string literal (or constant.) 	TokenNameCOMMENT_LINE	a match pattern, its argument must be a string literal (or constant.) 
// ER_ARG_LITERAL - new error message for bugzilla //5202 	TokenNameCOMMENT_LINE	ER_ARG_LITERAL - new error message for bugzilla //5202 
// Argument to {0} in match pattern must be a literal. 	TokenNameCOMMENT_LINE	Argument to {0} in match pattern must be a literal. 
//public static final int ER_ARG_LITERAL = 248; 	TokenNameCOMMENT_LINE	public static final int ER_ARG_LITERAL = 248; 
{	TokenNameLBRACE	
ER_ARG_LITERAL	TokenNameIdentifier	 ER  ARG  LITERAL
,	TokenNameCOMMA	
"Argument för {0} i matchningsmönstret måste vara literalt."	TokenNameStringLiteral	Argument för {0} i matchningsmönstret måste vara literalt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable. A "global variable" is a variable that is accessible everywher 	TokenNameCOMMENT_LINE	a variable. A "global variable" is a variable that is accessible everywher 
// in the stylesheet. 	TokenNameCOMMENT_LINE	in the stylesheet. 
// ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_GLOBAL_VAR - new error message for bugzilla #790 
// Duplicate global variable declaration. 	TokenNameCOMMENT_LINE	Duplicate global variable declaration. 
//public static final int ER_DUPLICATE_GLOBAL_VAR = 249; 	TokenNameCOMMENT_LINE	public static final int ER_DUPLICATE_GLOBAL_VAR = 249; 
{	TokenNameLBRACE	
ER_DUPLICATE_GLOBAL_VAR	TokenNameIdentifier	 ER  DUPLICATE  GLOBAL  VAR
,	TokenNameCOMMA	
"Dubbel deklaration av global variabel."	TokenNameStringLiteral	Dubbel deklaration av global variabel.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: The following message indicates that two definitions of 	TokenNameCOMMENT_LINE	Note to translators: The following message indicates that two definitions of 
// a variable were encountered. 	TokenNameCOMMENT_LINE	a variable were encountered. 
// ER_DUPLICATE_VAR - new error message for bugzilla #790 	TokenNameCOMMENT_LINE	ER_DUPLICATE_VAR - new error message for bugzilla #790 
// Duplicate variable declaration. 	TokenNameCOMMENT_LINE	Duplicate variable declaration. 
//public static final int ER_DUPLICATE_VAR = 250; 	TokenNameCOMMENT_LINE	public static final int ER_DUPLICATE_VAR = 250; 
{	TokenNameLBRACE	
ER_DUPLICATE_VAR	TokenNameIdentifier	 ER  DUPLICATE  VAR
,	TokenNameCOMMA	
"Dubbel variabeldeklaration."	TokenNameStringLiteral	Dubbel variabeldeklaration.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "xsl:template, "name" and "match" are XSLT keywords 	TokenNameCOMMENT_LINE	Note to translators: "xsl:template, "name" and "match" are XSLT keywords 
// which must not be translated. 	TokenNameCOMMENT_LINE	which must not be translated. 
// ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 	TokenNameCOMMENT_LINE	ER_TEMPLATE_NAME_MATCH - new error message for bugzilla #789 
// xsl:template must have a name or match attribute (or both) 	TokenNameCOMMENT_LINE	xsl:template must have a name or match attribute (or both) 
//public static final int ER_TEMPLATE_NAME_MATCH = 251; 	TokenNameCOMMENT_LINE	public static final int ER_TEMPLATE_NAME_MATCH = 251; 
{	TokenNameLBRACE	
ER_TEMPLATE_NAME_MATCH	TokenNameIdentifier	 ER  TEMPLATE  NAME  MATCH
,	TokenNameCOMMA	
"xsl: en mall måste ha ett namn och ett matchningsattribut (eller både och)"	TokenNameStringLiteral	xsl: en mall måste ha ett namn och ett matchningsattribut (eller både och)
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "exclude-result-prefixes" is an XSLT keyword which 	TokenNameCOMMENT_LINE	Note to translators: "exclude-result-prefixes" is an XSLT keyword which 
// should not be translated. The message indicates that a namespace prefix 	TokenNameCOMMENT_LINE	should not be translated. The message indicates that a namespace prefix 
// encountered as part of the value of the exclude-result-prefixes attribute 	TokenNameCOMMENT_LINE	encountered as part of the value of the exclude-result-prefixes attribute 
// was in error. 	TokenNameCOMMENT_LINE	was in error. 
// ER_INVALID_PREFIX - new error message for bugzilla #788 	TokenNameCOMMENT_LINE	ER_INVALID_PREFIX - new error message for bugzilla #788 
// Prefix in exclude-result-prefixes is not valid:a {0} 	TokenNameCOMMENT_LINE	Prefix in exclude-result-prefixes is not valid:a {0} 
//public static final int ER_INVALID_PREFIX = 252; 	TokenNameCOMMENT_LINE	public static final int ER_INVALID_PREFIX = 252; 
{	TokenNameLBRACE	
ER_INVALID_PREFIX	TokenNameIdentifier	 ER  INVALID  PREFIX
,	TokenNameCOMMA	
"Prefix i exclude-result-prefixes är ogiltigt:a {0}"	TokenNameStringLiteral	Prefix i exclude-result-prefixes är ogiltigt:a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: An "attribute set" is a set of attributes that can be 	TokenNameCOMMENT_LINE	Note to translators: An "attribute set" is a set of attributes that can be 
// added to an element in the output document as a group. The message indicates 	TokenNameCOMMENT_LINE	added to an element in the output document as a group. The message indicates 
// that there was a reference to an attribute set named {0} that was never 	TokenNameCOMMENT_LINE	that there was a reference to an attribute set named {0} that was never 
// defined. 	TokenNameCOMMENT_LINE	defined. 
// ER_NO_ATTRIB_SET - new error message for bugzilla #782 	TokenNameCOMMENT_LINE	ER_NO_ATTRIB_SET - new error message for bugzilla #782 
// attribute-set named {0} does not exist 	TokenNameCOMMENT_LINE	attribute-set named {0} does not exist 
//public static final int ER_NO_ATTRIB_SET = 253; 	TokenNameCOMMENT_LINE	public static final int ER_NO_ATTRIB_SET = 253; 
{	TokenNameLBRACE	
ER_NO_ATTRIB_SET	TokenNameIdentifier	 ER  NO  ATTRIB  SET
,	TokenNameCOMMA	
"attributserien {0} finns inte"	TokenNameStringLiteral	attributserien {0} finns inte
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Warnings... 	TokenNameCOMMENT_LINE	Warnings... 
/** WG_FOUND_CURLYBRACE */	TokenNameCOMMENT_JAVADOC	 WG_FOUND_CURLYBRACE 
//public static final int WG_FOUND_CURLYBRACE = 1; 	TokenNameCOMMENT_LINE	public static final int WG_FOUND_CURLYBRACE = 1; 
{	TokenNameLBRACE	
WG_FOUND_CURLYBRACE	TokenNameIdentifier	 WG  FOUND  CURLYBRACE
,	TokenNameCOMMA	
"Hittade '}' men ingen attributmall är öppen!"	TokenNameStringLiteral	Hittade '}' men ingen attributmall är öppen!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR */	TokenNameCOMMENT_JAVADOC	 WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR 
//public static final int WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR = 2; 	TokenNameCOMMENT_LINE	public static final int WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR = 2; 
{	TokenNameLBRACE	
WG_COUNT_ATTRIB_MATCHES_NO_ANCESTOR	TokenNameIdentifier	 WG  COUNT  ATTRIB  MATCHES  NO  ANCESTOR
,	TokenNameCOMMA	
"Varning: räknarattribut matchar inte en förfäder in xsl:number! Target = {0}"	TokenNameStringLiteral	Varning: räknarattribut matchar inte en förfäder in xsl:number! Target = {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_EXPR_ATTRIB_CHANGED_TO_SELECT */	TokenNameCOMMENT_JAVADOC	 WG_EXPR_ATTRIB_CHANGED_TO_SELECT 
//public static final int WG_EXPR_ATTRIB_CHANGED_TO_SELECT = 3; 	TokenNameCOMMENT_LINE	public static final int WG_EXPR_ATTRIB_CHANGED_TO_SELECT = 3; 
{	TokenNameLBRACE	
WG_EXPR_ATTRIB_CHANGED_TO_SELECT	TokenNameIdentifier	 WG  EXPR  ATTRIB  CHANGED  TO  SELECT
,	TokenNameCOMMA	
"Gammal syntax: Namnet på 'expr'-attributet har ändrats till 'select'."	TokenNameStringLiteral	Gammal syntax: Namnet på 'expr'-attributet har ändrats till 'select'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_NO_LOCALE_IN_FORMATNUMBER */	TokenNameCOMMENT_JAVADOC	 WG_NO_LOCALE_IN_FORMATNUMBER 
//public static final int WG_NO_LOCALE_IN_FORMATNUMBER = 4; 	TokenNameCOMMENT_LINE	public static final int WG_NO_LOCALE_IN_FORMATNUMBER = 4; 
{	TokenNameLBRACE	
WG_NO_LOCALE_IN_FORMATNUMBER	TokenNameIdentifier	 WG  NO  LOCALE  IN  FORMATNUMBER
,	TokenNameCOMMA	
"Xalan hanterar ännu inte locale-namnet i funktionen format-number."	TokenNameStringLiteral	Xalan hanterar ännu inte locale-namnet i funktionen format-number.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_LOCALE_NOT_FOUND */	TokenNameCOMMENT_JAVADOC	 WG_LOCALE_NOT_FOUND 
//public static final int WG_LOCALE_NOT_FOUND = 5; 	TokenNameCOMMENT_LINE	public static final int WG_LOCALE_NOT_FOUND = 5; 
{	TokenNameLBRACE	
WG_LOCALE_NOT_FOUND	TokenNameIdentifier	 WG  LOCALE  NOT  FOUND
,	TokenNameCOMMA	
"Varning: Hittade inte locale för xml:lang{0}"	TokenNameStringLiteral	Varning: Hittade inte locale för xml:lang{0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_CANNOT_MAKE_URL_FROM */	TokenNameCOMMENT_JAVADOC	 WG_CANNOT_MAKE_URL_FROM 
//public static final int WG_CANNOT_MAKE_URL_FROM = 6; 	TokenNameCOMMENT_LINE	public static final int WG_CANNOT_MAKE_URL_FROM = 6; 
{	TokenNameLBRACE	
WG_CANNOT_MAKE_URL_FROM	TokenNameIdentifier	 WG  CANNOT  MAKE  URL  FROM
,	TokenNameCOMMA	
"Kan inte skapa URL från: {0}"	TokenNameStringLiteral	Kan inte skapa URL från: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_CANNOT_LOAD_REQUESTED_DOC */	TokenNameCOMMENT_JAVADOC	 WG_CANNOT_LOAD_REQUESTED_DOC 
//public static final int WG_CANNOT_LOAD_REQUESTED_DOC = 7; 	TokenNameCOMMENT_LINE	public static final int WG_CANNOT_LOAD_REQUESTED_DOC = 7; 
{	TokenNameLBRACE	
WG_CANNOT_LOAD_REQUESTED_DOC	TokenNameIdentifier	 WG  CANNOT  LOAD  REQUESTED  DOC
,	TokenNameCOMMA	
"Kan inte ladda begärd doc: {0}"	TokenNameStringLiteral	Kan inte ladda begärd doc: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_CANNOT_FIND_COLLATOR */	TokenNameCOMMENT_JAVADOC	 WG_CANNOT_FIND_COLLATOR 
//public static final int WG_CANNOT_FIND_COLLATOR = 8; 	TokenNameCOMMENT_LINE	public static final int WG_CANNOT_FIND_COLLATOR = 8; 
{	TokenNameLBRACE	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
"Hittade inte Collator för <sort xml:lang={0}"	TokenNameStringLiteral	Hittade inte Collator för <sort xml:lang={0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_FUNCTIONS_SHOULD_USE_URL */	TokenNameCOMMENT_JAVADOC	 WG_FUNCTIONS_SHOULD_USE_URL 
//public static final int WG_FUNCTIONS_SHOULD_USE_URL = 9; 	TokenNameCOMMENT_LINE	public static final int WG_FUNCTIONS_SHOULD_USE_URL = 9; 
{	TokenNameLBRACE	
WG_FUNCTIONS_SHOULD_USE_URL	TokenNameIdentifier	 WG  FUNCTIONS  SHOULD  USE  URL
,	TokenNameCOMMA	
"Gammal syntax: Funktionsinstruktionen borde använda en url av {0}"	TokenNameStringLiteral	Gammal syntax: Funktionsinstruktionen borde använda en url av {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ENCODING_NOT_SUPPORTED_USING_UTF8 */	TokenNameCOMMENT_JAVADOC	 WG_ENCODING_NOT_SUPPORTED_USING_UTF8 
//public static final int WG_ENCODING_NOT_SUPPORTED_USING_UTF8 = 10; 	TokenNameCOMMENT_LINE	public static final int WG_ENCODING_NOT_SUPPORTED_USING_UTF8 = 10; 
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_UTF8	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  UT F8
,	TokenNameCOMMA	
"kodning understöds inte: {0}, använder UTF-8"	TokenNameStringLiteral	kodning understöds inte: {0}, använder UTF-8
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ENCODING_NOT_SUPPORTED_USING_JAVA */	TokenNameCOMMENT_JAVADOC	 WG_ENCODING_NOT_SUPPORTED_USING_JAVA 
//public static final int WG_ENCODING_NOT_SUPPORTED_USING_JAVA = 11; 	TokenNameCOMMENT_LINE	public static final int WG_ENCODING_NOT_SUPPORTED_USING_JAVA = 11; 
{	TokenNameLBRACE	
WG_ENCODING_NOT_SUPPORTED_USING_JAVA	TokenNameIdentifier	 WG  ENCODING  NOT  SUPPORTED  USING  JAVA
,	TokenNameCOMMA	
"kodning understöds inte: {0}, använder Java {1}"	TokenNameStringLiteral	kodning understöds inte: {0}, använder Java {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_SPECIFICITY_CONFLICTS */	TokenNameCOMMENT_JAVADOC	 WG_SPECIFICITY_CONFLICTS 
//public static final int WG_SPECIFICITY_CONFLICTS = 12; 	TokenNameCOMMENT_LINE	public static final int WG_SPECIFICITY_CONFLICTS = 12; 
{	TokenNameLBRACE	
WG_SPECIFICITY_CONFLICTS	TokenNameIdentifier	 WG  SPECIFICITY  CONFLICTS
,	TokenNameCOMMA	
"Hittade specificitetskonflikter: {0} Senast hittade i stylesheet kommer att användas."	TokenNameStringLiteral	Hittade specificitetskonflikter: {0} Senast hittade i stylesheet kommer att användas.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_PARSING_AND_PREPARING */	TokenNameCOMMENT_JAVADOC	 WG_PARSING_AND_PREPARING 
//public static final int WG_PARSING_AND_PREPARING = 13; 	TokenNameCOMMENT_LINE	public static final int WG_PARSING_AND_PREPARING = 13; 
{	TokenNameLBRACE	
WG_PARSING_AND_PREPARING	TokenNameIdentifier	 WG  PARSING  AND  PREPARING
,	TokenNameCOMMA	
"========= Tolkar och förbereder {0} =========="	TokenNameStringLiteral	========= Tolkar och förbereder {0} ==========
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ATTR_TEMPLATE */	TokenNameCOMMENT_JAVADOC	 WG_ATTR_TEMPLATE 
//public static final int WG_ATTR_TEMPLATE = 14; 	TokenNameCOMMENT_LINE	public static final int WG_ATTR_TEMPLATE = 14; 
{	TokenNameLBRACE	
WG_ATTR_TEMPLATE	TokenNameIdentifier	 WG  ATTR  TEMPLATE
,	TokenNameCOMMA	
"Attributmall, {0}"	TokenNameStringLiteral	Attributmall, {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE */	TokenNameCOMMENT_JAVADOC	 WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE 
//public static final int WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE = 15; 	TokenNameCOMMENT_LINE	public static final int WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE = 15; 
{	TokenNameLBRACE	
WG_CONFLICT_BETWEEN_XSLSTRIPSPACE_AND_XSLPRESERVESPACE	TokenNameIdentifier	 WG  CONFLICT  BETWEEN  XSLSTRIPSPACE  AND  XSLPRESERVESPACE
,	TokenNameCOMMA	
"Matcha konflikter mellan xsl:strip-space och xsl:preserve-space"	TokenNameStringLiteral	Matcha konflikter mellan xsl:strip-space och xsl:preserve-space
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ATTRIB_NOT_HANDLED */	TokenNameCOMMENT_JAVADOC	 WG_ATTRIB_NOT_HANDLED 
//public static final int WG_ATTRIB_NOT_HANDLED = 16; 	TokenNameCOMMENT_LINE	public static final int WG_ATTRIB_NOT_HANDLED = 16; 
{	TokenNameLBRACE	
WG_ATTRIB_NOT_HANDLED	TokenNameIdentifier	 WG  ATTRIB  NOT  HANDLED
,	TokenNameCOMMA	
"Xalan hanterar ännu inte attributet {0}!"	TokenNameStringLiteral	Xalan hanterar ännu inte attributet {0}!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_NO_DECIMALFORMAT_DECLARATION */	TokenNameCOMMENT_JAVADOC	 WG_NO_DECIMALFORMAT_DECLARATION 
//public static final int WG_NO_DECIMALFORMAT_DECLARATION = 17; 	TokenNameCOMMENT_LINE	public static final int WG_NO_DECIMALFORMAT_DECLARATION = 17; 
{	TokenNameLBRACE	
WG_NO_DECIMALFORMAT_DECLARATION	TokenNameIdentifier	 WG  NO  DECIMALFORMAT  DECLARATION
,	TokenNameCOMMA	
"Deklaration saknas för decimalformat: {0}"	TokenNameStringLiteral	Deklaration saknas för decimalformat: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_OLD_XSLT_NS */	TokenNameCOMMENT_JAVADOC	 WG_OLD_XSLT_NS 
//public static final int WG_OLD_XSLT_NS = 18; 	TokenNameCOMMENT_LINE	public static final int WG_OLD_XSLT_NS = 18; 
{	TokenNameLBRACE	
WG_OLD_XSLT_NS	TokenNameIdentifier	 WG  OLD  XSLT  NS
,	TokenNameCOMMA	
"XSLT-Namnrymd saknas eller är inkorrekt "	TokenNameStringLiteral	XSLT-Namnrymd saknas eller är inkorrekt 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED */	TokenNameCOMMENT_JAVADOC	 WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED 
//public static final int WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED = 19; 	TokenNameCOMMENT_LINE	public static final int WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED = 19; 
{	TokenNameLBRACE	
WG_ONE_DEFAULT_XSLDECIMALFORMAT_ALLOWED	TokenNameIdentifier	 WG  ONE  DEFAULT  XSLDECIMALFORMAT  ALLOWED
,	TokenNameCOMMA	
"Endast en standarddeklaration av xsl:decimal-format är tillåten."	TokenNameStringLiteral	Endast en standarddeklaration av xsl:decimal-format är tillåten.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE */	TokenNameCOMMENT_JAVADOC	 WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE 
//public static final int WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE = 20; 	TokenNameCOMMENT_LINE	public static final int WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE = 20; 
{	TokenNameLBRACE	
WG_XSLDECIMALFORMAT_NAMES_MUST_BE_UNIQUE	TokenNameIdentifier	 WG  XSLDECIMALFORMAT  NAMES  MUST  BE  UNIQUE
,	TokenNameCOMMA	
"xsl:decimal-formatnamn måste vara unika. Namnet "{0}" har blivit duplicerat."	TokenNameStringLiteral	xsl:decimal-formatnamn måste vara unika. Namnet "{0}" har blivit duplicerat.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ILLEGAL_ATTRIBUTE */	TokenNameCOMMENT_JAVADOC	 WG_ILLEGAL_ATTRIBUTE 
//public static final int WG_ILLEGAL_ATTRIBUTE = 21; 	TokenNameCOMMENT_LINE	public static final int WG_ILLEGAL_ATTRIBUTE = 21; 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE
,	TokenNameCOMMA	
"{0} har ett otillåtet attribut: {1}"	TokenNameStringLiteral	{0} har ett otillåtet attribut: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_COULD_NOT_RESOLVE_PREFIX */	TokenNameCOMMENT_JAVADOC	 WG_COULD_NOT_RESOLVE_PREFIX 
//public static final int WG_COULD_NOT_RESOLVE_PREFIX = 22; 	TokenNameCOMMENT_LINE	public static final int WG_COULD_NOT_RESOLVE_PREFIX = 22; 
{	TokenNameLBRACE	
WG_COULD_NOT_RESOLVE_PREFIX	TokenNameIdentifier	 WG  COULD  NOT  RESOLVE  PREFIX
,	TokenNameCOMMA	
"Kan inte lösa namnrymdsprefix: {0}. Noden kommer att ignoreras."	TokenNameStringLiteral	Kan inte lösa namnrymdsprefix: {0}. Noden kommer att ignoreras.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_STYLESHEET_REQUIRES_VERSION_ATTRIB */	TokenNameCOMMENT_JAVADOC	 WG_STYLESHEET_REQUIRES_VERSION_ATTRIB 
//public static final int WG_STYLESHEET_REQUIRES_VERSION_ATTRIB = 23; 	TokenNameCOMMENT_LINE	public static final int WG_STYLESHEET_REQUIRES_VERSION_ATTRIB = 23; 
{	TokenNameLBRACE	
WG_STYLESHEET_REQUIRES_VERSION_ATTRIB	TokenNameIdentifier	 WG  STYLESHEET  REQUIRES  VERSION  ATTRIB
,	TokenNameCOMMA	
"xsl:stylesheet måste ha ett 'version'-attribut!"	TokenNameStringLiteral	xsl:stylesheet måste ha ett 'version'-attribut!
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ILLEGAL_ATTRIBUTE_NAME */	TokenNameCOMMENT_JAVADOC	 WG_ILLEGAL_ATTRIBUTE_NAME 
//public static final int WG_ILLEGAL_ATTRIBUTE_NAME = 24; 	TokenNameCOMMENT_LINE	public static final int WG_ILLEGAL_ATTRIBUTE_NAME = 24; 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_NAME	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  NAME
,	TokenNameCOMMA	
"Otillåtet attributnamn: {0}"	TokenNameStringLiteral	Otillåtet attributnamn: {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_ILLEGAL_ATTRIBUTE_VALUE */	TokenNameCOMMENT_JAVADOC	 WG_ILLEGAL_ATTRIBUTE_VALUE 
//public static final int WG_ILLEGAL_ATTRIBUTE_VALUE = 25; 	TokenNameCOMMENT_LINE	public static final int WG_ILLEGAL_ATTRIBUTE_VALUE = 25; 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_VALUE	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  VALUE
,	TokenNameCOMMA	
"Ogiltigt värde använt för attribut {0}: {1}"	TokenNameStringLiteral	Ogiltigt värde använt för attribut {0}: {1}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** WG_EMPTY_SECOND_ARG */	TokenNameCOMMENT_JAVADOC	 WG_EMPTY_SECOND_ARG 
//public static final int WG_EMPTY_SECOND_ARG = 26; 	TokenNameCOMMENT_LINE	public static final int WG_EMPTY_SECOND_ARG = 26; 
{	TokenNameLBRACE	
WG_EMPTY_SECOND_ARG	TokenNameIdentifier	 WG  EMPTY  SECOND  ARG
,	TokenNameCOMMA	
"Den resulterande nodmängden från dokumentfunktions andra argument är tomt. Det första argumentet kommer att användas."	TokenNameStringLiteral	Den resulterande nodmängden från dokumentfunktions andra argument är tomt. Det första argumentet kommer att användas.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new WARNING keys added in XALAN code base after Jdk 1.4 (Xalan 2.2-D11) 
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. 	TokenNameCOMMENT_LINE	and must not be translated. 
// WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML 	TokenNameCOMMENT_LINE	WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML 
/** WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML */	TokenNameCOMMENT_JAVADOC	 WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML 
//public static final int WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML = 27; 	TokenNameCOMMENT_LINE	public static final int WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML = 27; 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
"Värdet på attributet 'name' i xsl:processing-instruction får inte vara 'xml'"	TokenNameStringLiteral	Värdet på attributet 'name' i xsl:processing-instruction får inte vara 'xml'
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: "name" and "xsl:processing-instruction" are keywords 	TokenNameCOMMENT_LINE	Note to translators: "name" and "xsl:processing-instruction" are keywords 
// and must not be translated. "NCName" is an XML data-type and must not be 	TokenNameCOMMENT_LINE	and must not be translated. "NCName" is an XML data-type and must not be 
// translated. 	TokenNameCOMMENT_LINE	translated. 
// WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME 	TokenNameCOMMENT_LINE	WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME 
/** WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME */	TokenNameCOMMENT_JAVADOC	 WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME 
//public static final int WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME = 28; 	TokenNameCOMMENT_LINE	public static final int WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME = 28; 
{	TokenNameLBRACE	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
"Värdet på attributet ''name'' i xsl:processing-instruction måste vara ett giltigt NCName:a {0}"	TokenNameStringLiteral	Värdet på attributet ''name'' i xsl:processing-instruction måste vara ett giltigt NCName:a {0}
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Note to translators: This message is reported if the stylesheet that is 	TokenNameCOMMENT_LINE	Note to translators: This message is reported if the stylesheet that is 
// being processed attempted to construct an XML document with an attribute in a 	TokenNameCOMMENT_LINE	being processed attempted to construct an XML document with an attribute in a 
// place other than on an element. The substitution text specifies the name of 	TokenNameCOMMENT_LINE	place other than on an element. The substitution text specifies the name of 
// the attribute. 	TokenNameCOMMENT_LINE	the attribute. 
// WG_ILLEGAL_ATTRIBUTE_POSITION 	TokenNameCOMMENT_LINE	WG_ILLEGAL_ATTRIBUTE_POSITION 
/** WG_ILLEGAL_ATTRIBUTE_POSITION */	TokenNameCOMMENT_JAVADOC	 WG_ILLEGAL_ATTRIBUTE_POSITION 
//public static final int WG_ILLEGAL_ATTRIBUTE_POSITION = 29; 	TokenNameCOMMENT_LINE	public static final int WG_ILLEGAL_ATTRIBUTE_POSITION = 29; 
{	TokenNameLBRACE	
WG_ILLEGAL_ATTRIBUTE_POSITION	TokenNameIdentifier	 WG  ILLEGAL  ATTRIBUTE  POSITION
,	TokenNameCOMMA	
"Det går inte att lägga till attributet {0} efter undernoder eller innan ett element produceras. Attributet ignoreras."	TokenNameStringLiteral	Det går inte att lägga till attributet {0} efter undernoder eller innan ett element produceras. Attributet ignoreras.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 	TokenNameCOMMENT_LINE	WHY THERE IS A GAP B/W NUMBERS in the XSLTErrorResources properties file? 
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
"Parameter till createMessage ligger utanför tillåtet intervall"	TokenNameStringLiteral	Parameter till createMessage ligger utanför tillåtet intervall
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"FORMAT_FAILED"	TokenNameStringLiteral	FORMAT_FAILED
,	TokenNameCOMMA	
"Undantag utlöst vid messageFormat-anrop"	TokenNameStringLiteral	Undantag utlöst vid messageFormat-anrop
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
"Rad #"	TokenNameStringLiteral	Rad #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"column"	TokenNameStringLiteral	column
,	TokenNameCOMMA	
"Kolumn #"	TokenNameStringLiteral	Kolumn #
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xsldone"	TokenNameStringLiteral	xsldone
,	TokenNameCOMMA	
"XSLProcessor: färdig"	TokenNameStringLiteral	XSLProcessor: färdig
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"xslProc_option"	TokenNameStringLiteral	xslProc_option
,	TokenNameCOMMA	
"Xalan-J kommando linje Process klass alternativ:"	TokenNameStringLiteral	Xalan-J kommando linje Process klass alternativ:
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionIN"	TokenNameStringLiteral	optionIN
,	TokenNameCOMMA	
" -IN inputXMLURL"	TokenNameStringLiteral	 -IN inputXMLURL
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXSL"	TokenNameStringLiteral	optionXSL
,	TokenNameCOMMA	
" [-XSL XSLTransformationURL]"	TokenNameStringLiteral	 [-XSL XSLTransformationURL]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionOUT"	TokenNameStringLiteral	optionOUT
,	TokenNameCOMMA	
" [-OUT utdataFilnamn]"	TokenNameStringLiteral	 [-OUT utdataFilnamn]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCIN"	TokenNameStringLiteral	optionLXCIN
,	TokenNameCOMMA	
" [-LXCIN kompileratStylesheetFilnameIn]"	TokenNameStringLiteral	 [-LXCIN kompileratStylesheetFilnameIn]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLXCOUT"	TokenNameStringLiteral	optionLXCOUT
,	TokenNameCOMMA	
" [-LXCOUT kompileratStylesheetFilenameUt]"	TokenNameStringLiteral	 [-LXCOUT kompileratStylesheetFilenameUt]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARSER"	TokenNameStringLiteral	optionPARSER
,	TokenNameCOMMA	
" [-PARSER fullt kvalificerat klassnamn eller tolkförbindelse]"	TokenNameStringLiteral	 [-PARSER fullt kvalificerat klassnamn eller tolkförbindelse]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionE"	TokenNameStringLiteral	optionE
,	TokenNameCOMMA	
" [-E (Utöka inte enhetsreferenser)]"	TokenNameStringLiteral	 [-E (Utöka inte enhetsreferenser)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionV"	TokenNameStringLiteral	optionV
,	TokenNameCOMMA	
" [-E (Utöka inte enhetsreferenser)]"	TokenNameStringLiteral	 [-E (Utöka inte enhetsreferenser)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQC"	TokenNameStringLiteral	optionQC
,	TokenNameCOMMA	
" [-QC (Tysta Mönsterkonfliktvarningar)]"	TokenNameStringLiteral	 [-QC (Tysta Mönsterkonfliktvarningar)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionQ"	TokenNameStringLiteral	optionQ
,	TokenNameCOMMA	
" [-Q (Tyst Tillstånd)]"	TokenNameStringLiteral	 [-Q (Tyst Tillstånd)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLF"	TokenNameStringLiteral	optionLF
,	TokenNameCOMMA	
" [-LF (Använd radframmatning enbart på utdata {standard är CR/LF})]"	TokenNameStringLiteral	 [-LF (Använd radframmatning enbart på utdata {standard är CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCR"	TokenNameStringLiteral	optionCR
,	TokenNameCOMMA	
" [-CR (Använd vagnretur enbart på utdata {standard är CR/LF})]"	TokenNameStringLiteral	 [-CR (Använd vagnretur enbart på utdata {standard är CR/LF})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionESCAPE"	TokenNameStringLiteral	optionESCAPE
,	TokenNameCOMMA	
" [-ESCAPE (Vilka tecken är skiftningstecken {standard är <>&"'\r\n}]"	TokenNameStringLiteral	 [-ESCAPE (Vilka tecken är skiftningstecken {standard är <>&"'\r\n}]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINDENT"	TokenNameStringLiteral	optionINDENT
,	TokenNameCOMMA	
" [-INDENT (Bestäm antal blanksteg för att tabulera {standard är 0})]"	TokenNameStringLiteral	 [-INDENT (Bestäm antal blanksteg för att tabulera {standard är 0})]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTT"	TokenNameStringLiteral	optionTT
,	TokenNameCOMMA	
" [-TT (Spåra mallarna allt eftersom de blir anropade.)]"	TokenNameStringLiteral	 [-TT (Spåra mallarna allt eftersom de blir anropade.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTG"	TokenNameStringLiteral	optionTG
,	TokenNameCOMMA	
" [-TG (Spåra varje generationshändelse.)]"	TokenNameStringLiteral	 [-TG (Spåra varje generationshändelse.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTS"	TokenNameStringLiteral	optionTS
,	TokenNameCOMMA	
" [-TS (Spåra varje valhändelse.)]"	TokenNameStringLiteral	 [-TS (Spåra varje valhändelse.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTTC"	TokenNameStringLiteral	optionTTC
,	TokenNameCOMMA	
" [-TTC (Spåra mallbarnen allt eftersom de blir behandlade.)]"	TokenNameStringLiteral	 [-TTC (Spåra mallbarnen allt eftersom de blir behandlade.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTCLASS"	TokenNameStringLiteral	optionTCLASS
,	TokenNameCOMMA	
" [-TCLASS (TraceListener-klass för spårningsanslutningar.)]"	TokenNameStringLiteral	 [-TCLASS (TraceListener-klass för spårningsanslutningar.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionVALIDATE"	TokenNameStringLiteral	optionVALIDATE
,	TokenNameCOMMA	
" [-VALIDATE (Sätt om validering ska ske. Standard är att validering är avstängd)]"	TokenNameStringLiteral	 [-VALIDATE (Sätt om validering ska ske. Standard är att validering är avstängd)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionEDUMP"	TokenNameStringLiteral	optionEDUMP
,	TokenNameCOMMA	
" [-EDUMP {valfritt filnamn) (Gör stackdump vid fel.)]"	TokenNameStringLiteral	 [-EDUMP {valfritt filnamn) (Gör stackdump vid fel.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXML"	TokenNameStringLiteral	optionXML
,	TokenNameCOMMA	
" [-XML (Använd XML-formaterare och lägg till XML-huvud.)]"	TokenNameStringLiteral	 [-XML (Använd XML-formaterare och lägg till XML-huvud.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionTEXT"	TokenNameStringLiteral	optionTEXT
,	TokenNameCOMMA	
" [-XML (Använd enkel Text-formaterare.)]"	TokenNameStringLiteral	 [-XML (Använd enkel Text-formaterare.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionHTML"	TokenNameStringLiteral	optionHTML
,	TokenNameCOMMA	
" [-HTML (Använd HTML-formaterare)]"	TokenNameStringLiteral	 [-HTML (Använd HTML-formaterare)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionPARAM"	TokenNameStringLiteral	optionPARAM
,	TokenNameCOMMA	
" [-PARAM namn uttryck (Sätt en stylesheet-parameter)]"	TokenNameStringLiteral	 [-PARAM namn uttryck (Sätt en stylesheet-parameter)]
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
"Vänligen kontrollera din classpath"	TokenNameStringLiteral	Vänligen kontrollera din classpath
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg4"	TokenNameStringLiteral	noParsermsg4
,	TokenNameCOMMA	
"Om du inte har IBMs XML-Tolk för Java, kan du ladda ner den från"	TokenNameStringLiteral	Om du inte har IBMs XML-Tolk för Java, kan du ladda ner den från
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"noParsermsg5"	TokenNameStringLiteral	noParsermsg5
,	TokenNameCOMMA	
"IBM's AlphaWorks: http://www.alphaworks.ibm.com/formula/xml"	TokenNameStringLiteral	IBM's AlphaWorks: http://www.alphaworks.ibm.com/formula/xml
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionURIRESOLVER"	TokenNameStringLiteral	optionURIRESOLVER
,	TokenNameCOMMA	
" [-URIRESOLVER fullständigt klassnamn (URIResolver som ska användas för att lösa URI-er)]"	TokenNameStringLiteral	 [-URIRESOLVER fullständigt klassnamn (URIResolver som ska användas för att lösa URI-er)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionENTITYRESOLVER"	TokenNameStringLiteral	optionENTITYRESOLVER
,	TokenNameCOMMA	
" [-ENTITYRESOLVER fullständigt klassnamn (EntityResolver som ska användas för att lösa enheter)]"	TokenNameStringLiteral	 [-ENTITYRESOLVER fullständigt klassnamn (EntityResolver som ska användas för att lösa enheter)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionCONTENTHANDLER"	TokenNameStringLiteral	optionCONTENTHANDLER
,	TokenNameCOMMA	
" [-CONTENTRESOLVER fullständigt klassnamn (ContentHandler som ska användas för att serialisera utdata)]"	TokenNameStringLiteral	 [-CONTENTRESOLVER fullständigt klassnamn (ContentHandler som ska användas för att serialisera utdata)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionLINENUMBERS"	TokenNameStringLiteral	optionLINENUMBERS
,	TokenNameCOMMA	
" [-L använd radnummer i källdokument]"	TokenNameStringLiteral	 [-L använd radnummer i källdokument]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
//Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 	TokenNameCOMMENT_LINE	Following are the new options added in XSLTErrorResources.properties files after Jdk 1.4 (Xalan 2.2-D11) 
{	TokenNameLBRACE	
"optionMEDIA"	TokenNameStringLiteral	optionMEDIA
,	TokenNameCOMMA	
" [-MEDIA mediaType (använd medieattribut för att hitta en formatmall som är associerad med ett dokument.)]"	TokenNameStringLiteral	 [-MEDIA mediaType (använd medieattribut för att hitta en formatmall som är associerad med ett dokument.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionFLAVOR"	TokenNameStringLiteral	optionFLAVOR
,	TokenNameCOMMA	
" [-FLAVOR flavorName (Använd s2s=SAX eller d2d=DOM för transformationen.)] "	TokenNameStringLiteral	 [-FLAVOR flavorName (Använd s2s=SAX eller d2d=DOM för transformationen.)] 
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// Added by sboag/scurcuru; experimental 	TokenNameCOMMENT_LINE	Added by sboag/scurcuru; experimental 
{	TokenNameLBRACE	
"optionDIAG"	TokenNameStringLiteral	optionDIAG
,	TokenNameCOMMA	
" [-DIAG (Skriv ut totala transformationer, millisekunder.)]"	TokenNameStringLiteral	 [-DIAG (Skriv ut totala transformationer, millisekunder.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionINCREMENTAL"	TokenNameStringLiteral	optionINCREMENTAL
,	TokenNameCOMMA	
" [-INCREMENTAL (begär inkrementell DTM-konstruktion genom att ange http://xml.apache.org/xalan/features/incremental true.)]"	TokenNameStringLiteral	 [-INCREMENTAL (begär inkrementell DTM-konstruktion genom att ange http://xml.apache.org/xalan/features/incremental true.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionNOOPTIMIMIZE"	TokenNameStringLiteral	optionNOOPTIMIMIZE
,	TokenNameCOMMA	
" [-NOOPTIMIMIZE (begär ingen formatmallsoptimering genom att ange http://xml.apache.org/xalan/features/optimize false.)]"	TokenNameStringLiteral	 [-NOOPTIMIMIZE (begär ingen formatmallsoptimering genom att ange http://xml.apache.org/xalan/features/optimize false.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionRL"	TokenNameStringLiteral	optionRL
,	TokenNameCOMMA	
" [-RL recursionlimit (kontrollera numerisk gräns på formatmallens rekursionsdjup.)]"	TokenNameStringLiteral	 [-RL recursionlimit (kontrollera numerisk gräns på formatmallens rekursionsdjup.)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXO"	TokenNameStringLiteral	optionXO
,	TokenNameCOMMA	
" [-XO [transletName] (tilldela namnet till genererad translet)]"	TokenNameStringLiteral	 [-XO [transletName] (tilldela namnet till genererad translet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXD"	TokenNameStringLiteral	optionXD
,	TokenNameCOMMA	
" [-XD destinationDirectory (ange målkatalog för translet)]"	TokenNameStringLiteral	 [-XD destinationDirectory (ange målkatalog för translet)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXJ"	TokenNameStringLiteral	optionXJ
,	TokenNameCOMMA	
" [-XJ jarfile (paketerar transletklasserna i en jar-fil med namnet <jarfile>)]"	TokenNameStringLiteral	 [-XJ jarfile (paketerar transletklasserna i en jar-fil med namnet <jarfile>)]
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
"optionXP"	TokenNameStringLiteral	optionXP
,	TokenNameCOMMA	
" [-XP-paket (anger ett paketnamnsprefix för alla genererade transletklasser)]"	TokenNameStringLiteral	 [-XP-paket (anger ett paketnamnsprefix för alla genererade transletklasser)]
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================= INFRASTRUCTURE ====================== 	TokenNameCOMMENT_LINE	================= INFRASTRUCTURE ====================== 
/** String for use when a bad error code was encountered. */	TokenNameCOMMENT_JAVADOC	 String for use when a bad error code was encountered. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_CODE	TokenNameIdentifier	 BAD  CODE
=	TokenNameEQUAL	
"DÅLIG_KOD"	TokenNameStringLiteral	DÅLIG_KOD
;	TokenNameSEMICOLON	
/** String for use when formatting of the error string failed. */	TokenNameCOMMENT_JAVADOC	 String for use when formatting of the error string failed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORMAT_FAILED	TokenNameIdentifier	 FORMAT  FAILED
=	TokenNameEQUAL	
"FORMATERING_MISSLYCKADES"	TokenNameStringLiteral	FORMATERING_MISSLYCKADES
;	TokenNameSEMICOLON	
/** General error string. */	TokenNameCOMMENT_JAVADOC	 General error string. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_STRING	TokenNameIdentifier	 ERROR  STRING
=	TokenNameEQUAL	
"#fel"	TokenNameStringLiteral	#fel
;	TokenNameSEMICOLON	
/** String to prepend to error messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to error messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HEADER	TokenNameIdentifier	 ERROR  HEADER
=	TokenNameEQUAL	
"Fel: "	TokenNameStringLiteral	Fel: 
;	TokenNameSEMICOLON	
/** String to prepend to warning messages. */	TokenNameCOMMENT_JAVADOC	 String to prepend to warning messages. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARNING_HEADER	TokenNameIdentifier	 WARNING  HEADER
=	TokenNameEQUAL	
"Varning: "	TokenNameStringLiteral	Varning: 
;	TokenNameSEMICOLON	
/** String to specify the XSLT module. */	TokenNameCOMMENT_JAVADOC	 String to specify the XSLT module. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSL_HEADER	TokenNameIdentifier	 XSL  HEADER
=	TokenNameEQUAL	
"XSLT "	TokenNameStringLiteral	XSLT 
;	TokenNameSEMICOLON	
/** String to specify the XML parser module. */	TokenNameCOMMENT_JAVADOC	 String to specify the XML parser module. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_HEADER	TokenNameIdentifier	 XML  HEADER
=	TokenNameEQUAL	
"XML "	TokenNameStringLiteral	XML 
;	TokenNameSEMICOLON	
/** I don't think this is used any more. * @deprecated */	TokenNameCOMMENT_JAVADOC	 I don't think this is used any more. @deprecated 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
QUERY_HEADER	TokenNameIdentifier	 QUERY  HEADER
=	TokenNameEQUAL	
"MÖNSTER "	TokenNameStringLiteral	MÖNSTER 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

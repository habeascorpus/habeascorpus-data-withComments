/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ErrorMessages_no.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ErrorMessages_no.java 468649 2006-10-28 07:00:55Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ErrorMessages_no	TokenNameIdentifier	 Error Messages no
extends	TokenNameextends	
ErrorMessages	TokenNameIdentifier	 Error Messages
{	TokenNameLBRACE	
// Disse feilmeldingene maa korrespondere med konstantene som er definert 	TokenNameCOMMENT_LINE	Disse feilmeldingene maa korrespondere med konstantene som er definert 
// i kildekoden til {ErrorMsg. 	TokenNameCOMMENT_LINE	i kildekoden til {ErrorMsg. 
/** Get the lookup table for error messages. * * @return The message lookup table. */	TokenNameCOMMENT_JAVADOC	 Get the lookup table for error messages. * @return The message lookup table. 
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
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MULTIPLE_STYLESHEET_ERR	TokenNameIdentifier	 MULTIPLE  STYLESHEET  ERR
,	TokenNameCOMMA	
"En fil kan bare innehold ett stilark."	TokenNameStringLiteral	En fil kan bare innehold ett stilark.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_REDEF_ERR	TokenNameIdentifier	 TEMPLATE  REDEF  ERR
,	TokenNameCOMMA	
"<xsl:template> ''{0}'' er allerede definert i dette stilarket."	TokenNameStringLiteral	<xsl:template> ''{0}'' er allerede definert i dette stilarket.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TEMPLATE_UNDEF_ERR	TokenNameIdentifier	 TEMPLATE  UNDEF  ERR
,	TokenNameCOMMA	
"<xsl:template> ''{0}'' er ikke definert i dette stilarket."	TokenNameStringLiteral	<xsl:template> ''{0}'' er ikke definert i dette stilarket.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_REDEF_ERR	TokenNameIdentifier	 VARIABLE  REDEF  ERR
,	TokenNameCOMMA	
"Variabel ''{0}'' er allerede definert."	TokenNameStringLiteral	Variabel ''{0}'' er allerede definert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
VARIABLE_UNDEF_ERR	TokenNameIdentifier	 VARIABLE  UNDEF  ERR
,	TokenNameCOMMA	
"Variabel eller parameter ''{0}'' er ikke definert."	TokenNameStringLiteral	Variabel eller parameter ''{0}'' er ikke definert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CLASS_NOT_FOUND_ERR	TokenNameIdentifier	 CLASS  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Finner ikke klassen ''{0}''."	TokenNameStringLiteral	Finner ikke klassen ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
METHOD_NOT_FOUND_ERR	TokenNameIdentifier	 METHOD  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Finner ikke ekstern funksjon ''{0}'' (m� v e6re deklarert b�de 'static' og 'public')."	TokenNameStringLiteral	Finner ikke ekstern funksjon ''{0}'' (m� v e6re deklarert b�de 'static' og 'public').
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ARGUMENT_CONVERSION_ERR	TokenNameIdentifier	 ARGUMENT  CONVERSION  ERR
,	TokenNameCOMMA	
"Kan ikke konvertere argument/retur type i kall til funksjon ''{0}''"	TokenNameStringLiteral	Kan ikke konvertere argument/retur type i kall til funksjon ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_NOT_FOUND_ERR	TokenNameIdentifier	 FILE  NOT  FOUND  ERR
,	TokenNameCOMMA	
"Finner ikke fil eller URI ''{0}''."	TokenNameStringLiteral	Finner ikke fil eller URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INVALID_URI_ERR	TokenNameIdentifier	 INVALID  URI  ERR
,	TokenNameCOMMA	
"Ugyldig URI ''{0}''."	TokenNameStringLiteral	Ugyldig URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FILE_ACCESS_ERR	TokenNameIdentifier	 FILE  ACCESS  ERR
,	TokenNameCOMMA	
"Kan ikke �pne fil eller URI ''{0}''."	TokenNameStringLiteral	Kan ikke �pne fil eller URI ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_ROOT_ERR	TokenNameIdentifier	 MISSING  ROOT  ERR
,	TokenNameCOMMA	
"Forvented <xsl:stylesheet> eller <xsl:transform> element."	TokenNameStringLiteral	Forvented <xsl:stylesheet> eller <xsl:transform> element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NAMESPACE_UNDEF_ERR	TokenNameIdentifier	 NAMESPACE  UNDEF  ERR
,	TokenNameCOMMA	
"Prefiks ''{0}'' er ikke deklarert."	TokenNameStringLiteral	Prefiks ''{0}'' er ikke deklarert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FUNCTION_RESOLVE_ERR	TokenNameIdentifier	 FUNCTION  RESOLVE  ERR
,	TokenNameCOMMA	
"Kunne ikke resolvere kall til funksjon ''{0}''."	TokenNameStringLiteral	Kunne ikke resolvere kall til funksjon ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NEED_LITERAL_ERR	TokenNameIdentifier	 NEED  LITERAL  ERR
,	TokenNameCOMMA	
"Argument til ''{0}'' m� v e6re ordrett tekst."	TokenNameStringLiteral	Argument til ''{0}'' m� v e6re ordrett tekst.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XPATH_PARSER_ERR	TokenNameIdentifier	 XPATH  PARSER  ERR
,	TokenNameCOMMA	
"Kunne ikke tolke XPath uttrykk ''{0}''."	TokenNameStringLiteral	Kunne ikke tolke XPath uttrykk ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
REQUIRED_ATTR_ERR	TokenNameIdentifier	 REQUIRED  ATTR  ERR
,	TokenNameCOMMA	
"N�dvendig attributt ''{0}'' er ikke deklarert."	TokenNameStringLiteral	N�dvendig attributt ''{0}'' er ikke deklarert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHAR_ERR	TokenNameIdentifier	 ILLEGAL  CHAR  ERR
,	TokenNameCOMMA	
"Ugyldig bokstav/tegn ''{0}'' i XPath uttrykk."	TokenNameStringLiteral	Ugyldig bokstav/tegn ''{0}'' i XPath uttrykk.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_PI_ERR	TokenNameIdentifier	 ILLEGAL  PI  ERR
,	TokenNameCOMMA	
"Ugyldig navn ''{0}'' for prosesserings-instruksjon."	TokenNameStringLiteral	Ugyldig navn ''{0}'' for prosesserings-instruksjon.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_ATTRIBUTE_ERR	TokenNameIdentifier	 STRAY  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Attributt ''{0}'' utenfor element."	TokenNameStringLiteral	Attributt ''{0}'' utenfor element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTRIBUTE_ERR	TokenNameIdentifier	 ILLEGAL  ATTRIBUTE  ERR
,	TokenNameCOMMA	
"Ugyldig attributt ''{0}''."	TokenNameStringLiteral	Ugyldig attributt ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_INCLUDE_ERR	TokenNameIdentifier	 CIRCULAR  INCLUDE  ERR
,	TokenNameCOMMA	
"Sirkul  e6 import/include; stilark ''{0}'' er alt lest."	TokenNameStringLiteral	Sirkul  e6 import/include; stilark ''{0}'' er alt lest.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RESULT_TREE_SORT_ERR	TokenNameIdentifier	 RESULT  TREE  SORT  ERR
,	TokenNameCOMMA	
"Result-tre fragmenter kan ikke sorteres (<xsl:sort> elementer vil "	TokenNameStringLiteral	Result-tre fragmenter kan ikke sorteres (<xsl:sort> elementer vil 
+	TokenNamePLUS	
"bli ignorert). Du m� sortere nodene mens du bygger treet."	TokenNameStringLiteral	bli ignorert). Du m� sortere nodene mens du bygger treet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYMBOLS_REDEF_ERR	TokenNameIdentifier	 SYMBOLS  REDEF  ERR
,	TokenNameCOMMA	
"Formatterings-symboler ''{0}'' er alt definert."	TokenNameStringLiteral	Formatterings-symboler ''{0}'' er alt definert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSL_VERSION_ERR	TokenNameIdentifier	 XSL  VERSION  ERR
,	TokenNameCOMMA	
"XSL versjon ''{0}'' er ikke st�ttet av XSLTC."	TokenNameStringLiteral	XSL versjon ''{0}'' er ikke st�ttet av XSLTC.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier	 CIRCULAR  VARIABLE  ERR
,	TokenNameCOMMA	
"Sirkul e6r variabel/parameter referanse i ''{0}''."	TokenNameStringLiteral	Sirkul e6r variabel/parameter referanse i ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier	 ILLEGAL  BINARY  OP  ERR
,	TokenNameCOMMA	
"Ugyldig operator for bin e6rt uttrykk."	TokenNameStringLiteral	Ugyldig operator for bin e6rt uttrykk.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ARG_ERR	TokenNameIdentifier	 ILLEGAL  ARG  ERR
,	TokenNameCOMMA	
"Ugyldig parameter i funksjons-kall."	TokenNameStringLiteral	Ugyldig parameter i funksjons-kall.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DOCUMENT_ARG_ERR	TokenNameIdentifier	 DOCUMENT  ARG  ERR
,	TokenNameCOMMA	
"Andre argument til document() m� v e6re et node-sett."	TokenNameStringLiteral	Andre argument til document() m� v e6re et node-sett.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_WHEN_ERR	TokenNameIdentifier	 MISSING  WHEN  ERR
,	TokenNameCOMMA	
"Du m� deklarere minst ett <xsl:when> element innenfor <xsl:choose>."	TokenNameStringLiteral	Du m� deklarere minst ett <xsl:when> element innenfor <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MULTIPLE_OTHERWISE_ERR	TokenNameIdentifier	 MULTIPLE  OTHERWISE  ERR
,	TokenNameCOMMA	
"Kun ett <xsl:otherwise> element kan deklareres innenfor <xsl:choose>."	TokenNameStringLiteral	Kun ett <xsl:otherwise> element kan deklareres innenfor <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_OTHERWISE_ERR	TokenNameIdentifier	 STRAY  OTHERWISE  ERR
,	TokenNameCOMMA	
"<xsl:otherwise> kan kun benyttes innenfor <xsl:choose>."	TokenNameStringLiteral	<xsl:otherwise> kan kun benyttes innenfor <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_WHEN_ERR	TokenNameIdentifier	 STRAY  WHEN  ERR
,	TokenNameCOMMA	
"<xsl:when> kan kun benyttes innenfor <xsl:choose>."	TokenNameStringLiteral	<xsl:when> kan kun benyttes innenfor <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WHEN_ELEMENT_ERR	TokenNameIdentifier	 WHEN  ELEMENT  ERR
,	TokenNameCOMMA	
"Kun <xsl:when> og <xsl:otherwise> kan benyttes innenfor <xsl:choose>."	TokenNameStringLiteral	Kun <xsl:when> og <xsl:otherwise> kan benyttes innenfor <xsl:choose>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNNAMED_ATTRIBSET_ERR	TokenNameIdentifier	 UNNAMED  ATTRIBSET  ERR
,	TokenNameCOMMA	
"<xsl:attribute-set> element manger 'name' attributt."	TokenNameStringLiteral	<xsl:attribute-set> element manger 'name' attributt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_CHILD_ERR	TokenNameIdentifier	 ILLEGAL  CHILD  ERR
,	TokenNameCOMMA	
"Ugyldig element."	TokenNameStringLiteral	Ugyldig element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ELEM_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ELEM  NAME  ERR
,	TokenNameCOMMA	
"''{0}'' er ikke et gyldig navn for et element."	TokenNameStringLiteral	''{0}'' er ikke et gyldig navn for et element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_ATTR_NAME_ERR	TokenNameIdentifier	 ILLEGAL  ATTR  NAME  ERR
,	TokenNameCOMMA	
"''{0}'' er ikke et gyldig navn for et attributt."	TokenNameStringLiteral	''{0}'' er ikke et gyldig navn for et attributt.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_TEXT_NODE_ERR	TokenNameIdentifier	 ILLEGAL  TEXT  NODE  ERR
,	TokenNameCOMMA	
"Du kan ikke plassere tekst utenfor et <xsl:stylesheet> element."	TokenNameStringLiteral	Du kan ikke plassere tekst utenfor et <xsl:stylesheet> element.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX_PARSER_CONFIG_ERR	TokenNameIdentifier	 SAX  PARSER  CONFIG  ERR
,	TokenNameCOMMA	
"JAXP parser er ikke korrekt konfigurert."	TokenNameStringLiteral	JAXP parser er ikke korrekt konfigurert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
INTERNAL_ERR	TokenNameIdentifier	 INTERNAL  ERR
,	TokenNameCOMMA	
"XSLTC-intern feil: ''{0}''"	TokenNameStringLiteral	XSLTC-intern feil: ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_XSL_ERR	TokenNameIdentifier	 UNSUPPORTED  XSL  ERR
,	TokenNameCOMMA	
"St�tter ikke XSL element ''{0}''."	TokenNameStringLiteral	St�tter ikke XSL element ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_EXT_ERR	TokenNameIdentifier	 UNSUPPORTED  EXT  ERR
,	TokenNameCOMMA	
"XSLTC st�tter ikke utvidet funksjon ''{0}''."	TokenNameStringLiteral	XSLTC st�tter ikke utvidet funksjon ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_URI_ERR	TokenNameIdentifier	 MISSING  XSLT  URI  ERR
,	TokenNameCOMMA	
"Dette dokumentet er ikke et XSL stilark "	TokenNameStringLiteral	Dette dokumentet er ikke et XSL stilark 
+	TokenNamePLUS	
"(xmlns:xsl='http://www.w3.org/1999/XSL/Transform' er ikke deklarert)."	TokenNameStringLiteral	(xmlns:xsl='http://www.w3.org/1999/XSL/Transform' er ikke deklarert).
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
MISSING_XSLT_TARGET_ERR	TokenNameIdentifier	 MISSING  XSLT  TARGET  ERR
,	TokenNameCOMMA	
"Kan ikke finne stilark ved navn ''{0}'' i dette dokumentet."	TokenNameStringLiteral	Kan ikke finne stilark ved navn ''{0}'' i dette dokumentet.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_IMPLEMENTED_ERR	TokenNameIdentifier	 NOT  IMPLEMENTED  ERR
,	TokenNameCOMMA	
"Ikke implementert/gjenkjent: ''{0}''."	TokenNameStringLiteral	Ikke implementert/gjenkjent: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NOT_STYLESHEET_ERR	TokenNameIdentifier	 NOT  STYLESHEET  ERR
,	TokenNameCOMMA	
"Dokumentet inneholder ikke et XSL stilark"	TokenNameStringLiteral	Dokumentet inneholder ikke et XSL stilark
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ELEMENT_PARSE_ERR	TokenNameIdentifier	 ELEMENT  PARSE  ERR
,	TokenNameCOMMA	
"Kan ikke tolke element ''{0}''"	TokenNameStringLiteral	Kan ikke tolke element ''{0}''
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
KEY_USE_ATTR_ERR	TokenNameIdentifier	 KEY  USE  ATTR  ERR
,	TokenNameCOMMA	
"'use'-attributtet i <xsl:key> m� v e6re node, node-sett, tekst eller nummer."	TokenNameStringLiteral	'use'-attributtet i <xsl:key> m� v e6re node, node-sett, tekst eller nummer.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTPUT_VERSION_ERR	TokenNameIdentifier	 OUTPUT  VERSION  ERR
,	TokenNameCOMMA	
"Det genererte XML dokumentet m� gis versjon 1.0"	TokenNameStringLiteral	Det genererte XML dokumentet m� gis versjon 1.0
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_RELAT_OP_ERR	TokenNameIdentifier	 ILLEGAL  RELAT  OP  ERR
,	TokenNameCOMMA	
"Ugyldig operator for relasjons-uttrykk."	TokenNameStringLiteral	Ugyldig operator for relasjons-uttrykk.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTRIBSET_UNDEF_ERR	TokenNameIdentifier	 ATTRIBSET  UNDEF  ERR
,	TokenNameCOMMA	
"Finner ikke <xsl:attribute-set> element med navn ''{0}''."	TokenNameStringLiteral	Finner ikke <xsl:attribute-set> element med navn ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ATTR_VAL_TEMPLATE_ERR	TokenNameIdentifier	 ATTR  VAL  TEMPLATE  ERR
,	TokenNameCOMMA	
"Kan ikke tolke attributt ''{0}''."	TokenNameStringLiteral	Kan ikke tolke attributt ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNKNOWN_SIG_TYPE_ERR	TokenNameIdentifier	 UNKNOWN  SIG  TYPE  ERR
,	TokenNameCOMMA	
"Ukjent data-type i signatur for klassen ''{0}''."	TokenNameStringLiteral	Ukjent data-type i signatur for klassen ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
"Kan ikke oversette mellom data-type ''{0}'' og ''{1}''."	TokenNameStringLiteral	Kan ikke oversette mellom data-type ''{0}'' og ''{1}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_TRANSLET_CLASS_ERR	TokenNameIdentifier	 NO  TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Dette Templates objected inneholder ingen translet klasse definisjon."	TokenNameStringLiteral	Dette Templates objected inneholder ingen translet klasse definisjon.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
NO_MAIN_TRANSLET_ERR	TokenNameIdentifier	 NO  MAIN  TRANSLET  ERR
,	TokenNameCOMMA	
"Dette Templates objected inneholder ingen klasse ved navn ''{0}''."	TokenNameStringLiteral	Dette Templates objected inneholder ingen klasse ved navn ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_CLASS_ERR	TokenNameIdentifier	 TRANSLET  CLASS  ERR
,	TokenNameCOMMA	
"Kan ikke laste translet-klasse ''{0}''."	TokenNameStringLiteral	Kan ikke laste translet-klasse ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSLET_OBJECT_ERR	TokenNameIdentifier	 TRANSLET  OBJECT  ERR
,	TokenNameCOMMA	
"Translet klassen er lastet man kan instansieres."	TokenNameStringLiteral	Translet klassen er lastet man kan instansieres.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
,	TokenNameCOMMA	
"ErrorListener for ''{0}'' fors�kt satt til 'null'."	TokenNameStringLiteral	ErrorListener for ''{0}'' fors�kt satt til 'null'.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_SOURCE_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  SOURCE  ERR
,	TokenNameCOMMA	
"Kun StreamSource, SAXSource og DOMSOurce er st�ttet av XSLTC"	TokenNameStringLiteral	Kun StreamSource, SAXSource og DOMSOurce er st�ttet av XSLTC
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_SOURCE_ERR	TokenNameIdentifier	 JAXP  NO  SOURCE  ERR
,	TokenNameCOMMA	
"Source objekt sendt til ''{0}'' har intet innhold."	TokenNameStringLiteral	Source objekt sendt til ''{0}'' har intet innhold.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
,	TokenNameCOMMA	
"Kan ikke kompilere stilark."	TokenNameStringLiteral	Kan ikke kompilere stilark.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
,	TokenNameCOMMA	
"TransformerFactory gjenkjenner ikke attributtet ''{0}''."	TokenNameStringLiteral	TransformerFactory gjenkjenner ikke attributtet ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_RESULT_ERR	TokenNameIdentifier	 JAXP  SET  RESULT  ERR
,	TokenNameCOMMA	
"setResult() m� kalles f�r startDocument()."	TokenNameStringLiteral	setResult() m� kalles f�r startDocument().
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_TRANSLET_ERR	TokenNameIdentifier	 JAXP  NO  TRANSLET  ERR
,	TokenNameCOMMA	
"Transformer objektet inneholder ikken noen translet instans."	TokenNameStringLiteral	Transformer objektet inneholder ikken noen translet instans.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_HANDLER_ERR	TokenNameIdentifier	 JAXP  NO  HANDLER  ERR
,	TokenNameCOMMA	
"Ingen 'handler' er satt for � ta imot generert dokument."	TokenNameStringLiteral	Ingen 'handler' er satt for � ta imot generert dokument.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_NO_RESULT_ERR	TokenNameIdentifier	 JAXP  NO  RESULT  ERR
,	TokenNameCOMMA	
"Result objektet sendt til ''{0}'' er ikke gyldig."	TokenNameStringLiteral	Result objektet sendt til ''{0}'' er ikke gyldig.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNKNOWN_PROP_ERR	TokenNameIdentifier	 JAXP  UNKNOWN  PROP  ERR
,	TokenNameCOMMA	
"Fors�ker � lese ugyldig attributt ''{0}'' fra Transformer."	TokenNameStringLiteral	Fors�ker � lese ugyldig attributt ''{0}'' fra Transformer.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SAX2DOM_ADAPTER_ERR	TokenNameIdentifier	 SA X2 DOM  ADAPTER  ERR
,	TokenNameCOMMA	
"Kan ikke instansiere SAX2DOM adapter: ''{0}''."	TokenNameStringLiteral	Kan ikke instansiere SAX2DOM adapter: ''{0}''.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSLTC_SOURCE_ERR	TokenNameIdentifier	 XSLTC  SOURCE  ERR
,	TokenNameCOMMA	
"XSLTCSource.build() kalt uten at 'systemId' er definert."	TokenNameStringLiteral	XSLTCSource.build() kalt uten at 'systemId' er definert.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_STDIN_ERR	TokenNameIdentifier	 COMPILE  STDIN  ERR
,	TokenNameCOMMA	
"Du kan ikke bruke -i uten � ogs� angi klasse-navn med -o."	TokenNameStringLiteral	Du kan ikke bruke -i uten � ogs� angi klasse-navn med -o.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
COMPILE_USAGE_STR	TokenNameIdentifier	 COMPILE  USAGE  STR
,	TokenNameCOMMA	
"Bruk: "	TokenNameStringLiteral	Bruk: 
+	TokenNamePLUS	
" xsltc [-o <klasse>] [-d <katalog>] [-j <arkiv>] "	TokenNameStringLiteral	 xsltc [-o <klasse>] [-d <katalog>] [-j <arkiv>] 
+	TokenNamePLUS	
" [-p <pakke>] [-x] [-s] [-u] <stilark>|-i "	TokenNameStringLiteral	 [-p <pakke>] [-x] [-s] [-u] <stilark>|-i 
+	TokenNamePLUS	
" Der: <klasse> er navnet du vil gi den kompilerte java klassen. "	TokenNameStringLiteral	 Der: <klasse> er navnet du vil gi den kompilerte java klassen. 
+	TokenNamePLUS	
" <stilark> er ett eller flere XSL stilark, eller dersom -u "	TokenNameStringLiteral	 <stilark> er ett eller flere XSL stilark, eller dersom -u 
+	TokenNamePLUS	
" er benyttet, en eller flere URL'er til stilark. "	TokenNameStringLiteral	 er benyttet, en eller flere URL'er til stilark. 
+	TokenNamePLUS	
" <katalog> katalog der klasse filer vil plasseres. "	TokenNameStringLiteral	 <katalog> katalog der klasse filer vil plasseres. 
+	TokenNamePLUS	
" <arkiv> er en JAR-fil der klassene vil plasseres "	TokenNameStringLiteral	 <arkiv> er en JAR-fil der klassene vil plasseres 
+	TokenNamePLUS	
" <pakke> er an Java 'package' klassene vil legges i. "	TokenNameStringLiteral	 <pakke> er an Java 'package' klassene vil legges i. 
+	TokenNamePLUS	
" Annet: "	TokenNameStringLiteral	 Annet: 
+	TokenNamePLUS	
" -i tvinger kompilatoren til � lese fra stdin. "	TokenNameStringLiteral	 -i tvinger kompilatoren til � lese fra stdin. 
+	TokenNamePLUS	
" -o ignoreres dersom flere enn ett silark kompileres. "	TokenNameStringLiteral	 -o ignoreres dersom flere enn ett silark kompileres. 
+	TokenNamePLUS	
" -x sl�r p� debug meldinger. "	TokenNameStringLiteral	 -x sl�r p� debug meldinger. 
+	TokenNamePLUS	
" -s blokkerer alle kall til System.exit()."	TokenNameStringLiteral	 -s blokkerer alle kall til System.exit().
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_USAGE_STR	TokenNameIdentifier	 TRANSFORM  USAGE  STR
,	TokenNameCOMMA	
"Bruk: "	TokenNameStringLiteral	Bruk: 
+	TokenNamePLUS	
" xslt [-j <arkiv>] {-u <url> | <dokument>} <klasse> "	TokenNameStringLiteral	 xslt [-j <arkiv>] {-u <url> | <dokument>} <klasse> 
+	TokenNamePLUS	
" [<param>=<verdi> ...] "	TokenNameStringLiteral	 [<param>=<verdi> ...] 
+	TokenNamePLUS	
" Der: <dokument> er XML dokumentet som skal behandles. "	TokenNameStringLiteral	 Der: <dokument> er XML dokumentet som skal behandles. 
+	TokenNamePLUS	
" <url> er en URL til XML dokumentet som skal behandles. "	TokenNameStringLiteral	 <url> er en URL til XML dokumentet som skal behandles. 
+	TokenNamePLUS	
" <klasse> er Java klassen som skal benyttes. "	TokenNameStringLiteral	 <klasse> er Java klassen som skal benyttes. 
+	TokenNamePLUS	
" <arkiv> er en JAR-fil som klassen leses fra. "	TokenNameStringLiteral	 <arkiv> er en JAR-fil som klassen leses fra. 
+	TokenNamePLUS	
" Annet: "	TokenNameStringLiteral	 Annet: 
+	TokenNamePLUS	
" -x sl�r p� debug meldinger. "	TokenNameStringLiteral	 -x sl�r p� debug meldinger. 
+	TokenNamePLUS	
" -s blokkerer alle kall til System.exit()."	TokenNameStringLiteral	 -s blokkerer alle kall til System.exit().
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_SORT_ERR	TokenNameIdentifier	 STRAY  SORT  ERR
,	TokenNameCOMMA	
"<xsl:sort> kan bare brukes under <xsl:for-each> eller <xsl:apply-templates>."	TokenNameStringLiteral	<xsl:sort> kan bare brukes under <xsl:for-each> eller <xsl:apply-templates>.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
UNSUPPORTED_ENCODING	TokenNameIdentifier	 UNSUPPORTED  ENCODING
,	TokenNameCOMMA	
"Karaktersett ''{0}'' er ikke st�ttet av denne JVM."	TokenNameStringLiteral	Karaktersett ''{0}'' er ikke st�ttet av denne JVM.
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"Syntax error in ''{0}''."	TokenNameStringLiteral	Syntax error in ''{0}''.
}	TokenNameRBRACE	
// TODO: How do you say "syntax error" in norwegian? 	TokenNameCOMMENT_LINE	TODO: How do you say "syntax error" in norwegian? 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

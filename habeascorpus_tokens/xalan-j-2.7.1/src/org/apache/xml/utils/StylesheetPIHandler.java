/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StylesheetPIHandler.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StylesheetPIHandler.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
URIResolver	TokenNameIdentifier	 URI Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
/** * Search for the xml-stylesheet processing instructions in an XML document. * @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a> */	TokenNameCOMMENT_JAVADOC	 Search for the xml-stylesheet processing instructions in an XML document. @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a> 
public	TokenNamepublic	
class	TokenNameclass	
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
{	TokenNameLBRACE	
/** The baseID of the document being processed. */	TokenNameCOMMENT_JAVADOC	 The baseID of the document being processed. 
String	TokenNameIdentifier	 String
m_baseID	TokenNameIdentifier	 m base ID
;	TokenNameSEMICOLON	
/** The desired media criteria. */	TokenNameCOMMENT_JAVADOC	 The desired media criteria. 
String	TokenNameIdentifier	 String
m_media	TokenNameIdentifier	 m media
;	TokenNameSEMICOLON	
/** The desired title criteria. */	TokenNameCOMMENT_JAVADOC	 The desired title criteria. 
String	TokenNameIdentifier	 String
m_title	TokenNameIdentifier	 m title
;	TokenNameSEMICOLON	
/** The desired character set criteria. */	TokenNameCOMMENT_JAVADOC	 The desired character set criteria. 
String	TokenNameIdentifier	 String
m_charset	TokenNameIdentifier	 m charset
;	TokenNameSEMICOLON	
/** A list of SAXSource objects that match the criteria. */	TokenNameCOMMENT_JAVADOC	 A list of SAXSource objects that match the criteria. 
Vector	TokenNameIdentifier	 Vector
m_stylesheets	TokenNameIdentifier	 m stylesheets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add code to use a URIResolver. Patch from Dmitri Ilyin. 	TokenNameCOMMENT_LINE	Add code to use a URIResolver. Patch from Dmitri Ilyin. 
/** * The object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 The object that implements the URIResolver interface, or null. 
URIResolver	TokenNameIdentifier	 URI Resolver
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
/** * Get the object that will be used to resolve URIs in href * in xml-stylesheet processing instruction. * * @param resolver An object that implements the URIResolver interface, * or null. */	TokenNameCOMMENT_JAVADOC	 Get the object that will be used to resolve URIs in href in xml-stylesheet processing instruction. * @param resolver An object that implements the URIResolver interface, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the object that will be used to resolve URIs in href * in xml-stylesheet processing instruction. * * @return The URIResolver that was set with setURIResolver. */	TokenNameCOMMENT_JAVADOC	 Get the object that will be used to resolve URIs in href in xml-stylesheet processing instruction. * @return The URIResolver that was set with setURIResolver. 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a StylesheetPIHandler instance that will search * for xml-stylesheet PIs based on the given criteria. * * @param baseID The base ID of the XML document, needed to resolve * relative IDs. * @param media The desired media criteria. * @param title The desired title criteria. * @param charset The desired character set criteria. */	TokenNameCOMMENT_JAVADOC	 Construct a StylesheetPIHandler instance that will search for xml-stylesheet PIs based on the given criteria. * @param baseID The base ID of the XML document, needed to resolve relative IDs. @param media The desired media criteria. @param title The desired title criteria. @param charset The desired character set criteria. 
public	TokenNamepublic	
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseID	TokenNameIdentifier	 base ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_baseID	TokenNameIdentifier	 m base ID
=	TokenNameEQUAL	
baseID	TokenNameIdentifier	 base ID
;	TokenNameSEMICOLON	
m_media	TokenNameIdentifier	 m media
=	TokenNameEQUAL	
media	TokenNameIdentifier	 media
;	TokenNameSEMICOLON	
m_title	TokenNameIdentifier	 m title
=	TokenNameEQUAL	
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
m_charset	TokenNameIdentifier	 m charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the last stylesheet found that match the constraints. * * @return Source object that references the last stylesheet reference * that matches the constraints. */	TokenNameCOMMENT_JAVADOC	 Return the last stylesheet found that match the constraints. * @return Source object that references the last stylesheet reference that matches the constraints. 
public	TokenNamepublic	
Source	TokenNameIdentifier	 Source
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
)	TokenNameRPAREN	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handle the xml-stylesheet processing instruction. * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none is supplied. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#processingInstruction * @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a> */	TokenNameCOMMENT_JAVADOC	 Handle the xml-stylesheet processing instruction. * @param target The processing instruction target. @param data The processing instruction data, or null if none is supplied. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#processingInstruction @see <a href="http://www.w3.org/TR/xml-stylesheet/">Associating Style Sheets with XML documents, Version 1.0</a> 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml-stylesheet"	TokenNameStringLiteral	xml-stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CDATA #REQUIRED 	TokenNameCOMMENT_LINE	CDATA #REQUIRED 
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CDATA #REQUIRED 	TokenNameCOMMENT_LINE	CDATA #REQUIRED 
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CDATA #IMPLIED 	TokenNameCOMMENT_LINE	CDATA #IMPLIED 
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CDATA #IMPLIED 	TokenNameCOMMENT_LINE	CDATA #IMPLIED 
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CDATA #IMPLIED 	TokenNameCOMMENT_LINE	CDATA #IMPLIED 
boolean	TokenNameboolean	
alternate	TokenNameIdentifier	 alternate
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// (yes|no) "no" 	TokenNameCOMMENT_LINE	(yes|no) "no" 
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
" = "	TokenNameStringLiteral	 = 
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lookedAhead	TokenNameIdentifier	 looked Ahead
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lookedAhead	TokenNameIdentifier	 looked Ahead
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
lookedAhead	TokenNameIdentifier	 looked Ahead
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the href value has parameters to be passed to a 	TokenNameCOMMENT_LINE	If the href value has parameters to be passed to a 
// servlet(something like "foobar?id=12..."), 	TokenNameCOMMENT_LINE	servlet(something like "foobar?id=12..."), 
// we want to make sure we get them added to 	TokenNameCOMMENT_LINE	we want to make sure we get them added to 
// the href value. Without this check, we would move on 	TokenNameCOMMENT_LINE	the href value. Without this check, we would move on 
// to try to process another attribute and that would be 	TokenNameCOMMENT_LINE	to try to process another attribute and that would be 
// wrong. 	TokenNameCOMMENT_LINE	wrong. 
// We need to set lookedAhead here to flag that we 	TokenNameCOMMENT_LINE	We need to set lookedAhead here to flag that we 
// already have the next token. 	TokenNameCOMMENT_LINE	already have the next token. 
while	TokenNamewhile	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
href	TokenNameIdentifier	 href
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
+	TokenNamePLUS	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lookedAhead	TokenNameIdentifier	 looked Ahead
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
href	TokenNameIdentifier	 href
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
href	TokenNameIdentifier	 href
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Add code to use a URIResolver. Patch from Dmitri Ilyin. 	TokenNameCOMMENT_LINE	Add code to use a URIResolver. Patch from Dmitri Ilyin. 
if	TokenNameif	
(	TokenNameLPAREN	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
m_baseID	TokenNameIdentifier	 m base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
m_baseID	TokenNameIdentifier	 m base ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
SAXSource	TokenNameIdentifier	 SAX Source
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"media"	TokenNameStringLiteral	media
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"charset"	TokenNameStringLiteral	charset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"alternate"	TokenNameStringLiteral	alternate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
alternate	TokenNameIdentifier	 alternate
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"text/xsl"	TokenNameStringLiteral	text/xsl
)	TokenNameRPAREN	
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"text/xml"	TokenNameStringLiteral	text/xml
)	TokenNameRPAREN	
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"application/xml+xslt"	TokenNameStringLiteral	application/xml+xslt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_media	TokenNameIdentifier	 m media
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
media	TokenNameIdentifier	 media
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
media	TokenNameIdentifier	 media
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_media	TokenNameIdentifier	 m media
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_charset	TokenNameIdentifier	 m charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_charset	TokenNameIdentifier	 m charset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_title	TokenNameIdentifier	 m title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
title	TokenNameIdentifier	 title
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m_title	TokenNameIdentifier	 m title
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_stylesheets	TokenNameIdentifier	 m stylesheets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The spec notes that "The xml-stylesheet processing instruction is allowed only in the prolog of an XML document.", * so, at least for right now, I'm going to go ahead an throw a TransformerException * in order to stop the parse. * * @param namespaceURI The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param qName The qualified name (with prefix). * @param atts The specified or defaulted attributes. * * @throws StopParseException since there can be no valid xml-stylesheet processing * instructions past the first element. */	TokenNameCOMMENT_JAVADOC	 The spec notes that "The xml-stylesheet processing instruction is allowed only in the prolog of an XML document.", so, at least for right now, I'm going to go ahead an throw a TransformerException in order to stop the parse. * @param namespaceURI The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param qName The qualified name (with prefix). @param atts The specified or defaulted attributes. * @throws StopParseException since there can be no valid xml-stylesheet processing instructions past the first element. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
StopParseException	TokenNameIdentifier	 Stop Parse Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Added additional getter and setter methods for the Base Id * to fix bugzilla bug 24187 * */	TokenNameCOMMENT_JAVADOC	 Added additional getter and setter methods for the Base Id to fix bugzilla bug 24187 
public	TokenNamepublic	
void	TokenNamevoid	
setBaseId	TokenNameIdentifier	 set Base Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseId	TokenNameIdentifier	 base Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_baseID	TokenNameIdentifier	 m base ID
=	TokenNameEQUAL	
baseId	TokenNameIdentifier	 base Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseId	TokenNameIdentifier	 get Base Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_baseID	TokenNameIdentifier	 m base ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

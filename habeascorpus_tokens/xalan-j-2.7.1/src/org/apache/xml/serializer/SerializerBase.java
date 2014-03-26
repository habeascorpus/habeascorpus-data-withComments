/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerBase.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerBase.java 471981 2006-11-07 04:28:00Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
MsgKey	TokenNameIdentifier	 Msg Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Utils	TokenNameIdentifier	 Utils
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
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
/** * This class acts as a base class for the XML "serializers" * and the stream serializers. * It contains a number of common fields and methods. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class acts as a base class for the XML "serializers" and the stream serializers. It contains a number of common fields and methods. * @xsl.usage internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SerializerBase	TokenNameIdentifier	 Serializer Base
implements	TokenNameimplements	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
,	TokenNameCOMMA	
SerializerConstants	TokenNameIdentifier	 Serializer Constants
{	TokenNameLBRACE	
SerializerBase	TokenNameIdentifier	 Serializer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The name of the package that this class is in. * <p> * Not a public API. */	TokenNameCOMMENT_JAVADOC	 The name of the package that this class is in. <p> Not a public API. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PKG_NAME	TokenNameIdentifier	 PKG  NAME
;	TokenNameSEMICOLON	
/** * The same as the name of the package that this class is in * except that '.' are replaced with '/'. * <p> * Not a public API. */	TokenNameCOMMENT_JAVADOC	 The same as the name of the package that this class is in except that '.' are replaced with '/'. <p> Not a public API. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PKG_PATH	TokenNameIdentifier	 PKG  PATH
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fullyQualifiedName	TokenNameIdentifier	 fully Qualified Name
=	TokenNameEQUAL	
SerializerBase	TokenNameIdentifier	 Serializer Base
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDot	TokenNameIdentifier	 last Dot
=	TokenNameEQUAL	
fullyQualifiedName	TokenNameIdentifier	 fully Qualified Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastDot	TokenNameIdentifier	 last Dot
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
=	TokenNameEQUAL	
fullyQualifiedName	TokenNameIdentifier	 fully Qualified Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastDot	TokenNameIdentifier	 last Dot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
PKG_NAME	TokenNameIdentifier	 PKG  NAME
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PKG_PATH	TokenNameIdentifier	 PKG  PATH
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To fire off the end element trace event * @param name Name of element */	TokenNameCOMMENT_JAVADOC	 To fire off the end element trace event @param name Name of element 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEndElem	TokenNameIdentifier	 fire End Elem
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENDELEMENT	TokenNameIdentifier	 EVENTTYPE  ENDELEMENT
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the characters trace event * @param chars content of characters * @param start starting index of characters to output * @param length number of characters to output */	TokenNameCOMMENT_JAVADOC	 Report the characters trace event @param chars content of characters @param start starting index of characters to output @param length number of characters to output 
protected	TokenNameprotected	
void	TokenNamevoid	
fireCharEvent	TokenNameIdentifier	 fire Char Event
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  CHARACTERS
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * true if we still need to call startDocumentInternal() */	TokenNameCOMMENT_JAVADOC	 true if we still need to call startDocumentInternal() 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** True if a trailing "]]>" still needs to be written to be * written out. Used to merge adjacent CDATA sections */	TokenNameCOMMENT_JAVADOC	 True if a trailing "]]>" still needs to be written to be written out. Used to merge adjacent CDATA sections 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * All the attributes of the current element, collected from * startPrefixMapping() calls, or addAddtribute() calls, or * from the SAX attributes in a startElement() call. */	TokenNameCOMMENT_JAVADOC	 All the attributes of the current element, collected from startPrefixMapping() calls, or addAddtribute() calls, or from the SAX attributes in a startElement() call. 
protected	TokenNameprotected	
AttributesImplSerializer	TokenNameIdentifier	 Attributes Impl Serializer
m_attributes	TokenNameIdentifier	 m attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributesImplSerializer	TokenNameIdentifier	 Attributes Impl Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells if we're in an EntityRef event. */	TokenNameCOMMENT_JAVADOC	 Tells if we're in an EntityRef event. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** This flag is set while receiving events from the external DTD */	TokenNameCOMMENT_JAVADOC	 This flag is set while receiving events from the external DTD 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The System ID for the doc type. */	TokenNameCOMMENT_JAVADOC	 The System ID for the doc type. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_doctypeSystem	TokenNameIdentifier	 m doctype System
;	TokenNameSEMICOLON	
/** * The public ID for the doc type. */	TokenNameCOMMENT_JAVADOC	 The public ID for the doc type. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_doctypePublic	TokenNameIdentifier	 m doctype Public
;	TokenNameSEMICOLON	
/** * Flag to tell that we need to add the doctype decl, which we can't do * until the first element is encountered. */	TokenNameCOMMENT_JAVADOC	 Flag to tell that we need to add the doctype decl, which we can't do until the first element is encountered. 
boolean	TokenNameboolean	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Tells if we should write the XML declaration. */	TokenNameCOMMENT_JAVADOC	 Tells if we should write the XML declaration. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_shouldNotWriteXMLHeader	TokenNameIdentifier	 m should Not Write XML Header
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The standalone value for the doctype. */	TokenNameCOMMENT_JAVADOC	 The standalone value for the doctype. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_standalone	TokenNameIdentifier	 m standalone
;	TokenNameSEMICOLON	
/** * True if standalone was specified. */	TokenNameCOMMENT_JAVADOC	 True if standalone was specified. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_standaloneWasSpecified	TokenNameIdentifier	 m standalone Was Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Flag to tell if indenting (pretty-printing) is on. */	TokenNameCOMMENT_JAVADOC	 Flag to tell if indenting (pretty-printing) is on. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_doIndent	TokenNameIdentifier	 m do Indent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Amount to indent. */	TokenNameCOMMENT_JAVADOC	 Amount to indent. 
protected	TokenNameprotected	
int	TokenNameint	
m_indentAmount	TokenNameIdentifier	 m indent Amount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Tells the XML version, for writing out to the XML decl. */	TokenNameCOMMENT_JAVADOC	 Tells the XML version, for writing out to the XML decl. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_version	TokenNameIdentifier	 m version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The mediatype. Not used right now. */	TokenNameCOMMENT_JAVADOC	 The mediatype. Not used right now. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_mediatype	TokenNameIdentifier	 m mediatype
;	TokenNameSEMICOLON	
/** * The transformer that was around when this output handler was created (if * any). */	TokenNameCOMMENT_JAVADOC	 The transformer that was around when this output handler was created (if any). 
private	TokenNameprivate	
Transformer	TokenNameIdentifier	 Transformer
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
/** * Namespace support, that keeps track of currently defined * prefix/uri mappings. As processed elements come and go, so do * the associated mappings for that element. */	TokenNameCOMMENT_JAVADOC	 Namespace support, that keeps track of currently defined prefix/uri mappings. As processed elements come and go, so do the associated mappings for that element. 
protected	TokenNameprotected	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
m_prefixMap	TokenNameIdentifier	 m prefix Map
;	TokenNameSEMICOLON	
/** * Handle for firing generate events. This interface may be implemented * by the referenced transformer object. */	TokenNameCOMMENT_JAVADOC	 Handle for firing generate events. This interface may be implemented by the referenced transformer object. 
protected	TokenNameprotected	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
m_tracer	TokenNameIdentifier	 m tracer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SourceLocator	TokenNameIdentifier	 Source Locator
m_sourceLocator	TokenNameIdentifier	 m source Locator
;	TokenNameSEMICOLON	
/** * The writer to send output to. This field is only used in the ToStream * serializers, but exists here just so that the fireStartDoc() and * other fire... methods can flush this writer when tracing. */	TokenNameCOMMENT_JAVADOC	 The writer to send output to. This field is only used in the ToStream serializers, but exists here just so that the fireStartDoc() and other fire... methods can flush this writer when tracing. 
protected	TokenNameprotected	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
m_writer	TokenNameIdentifier	 m writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to "stack frame" corresponding to * the current element. Such a frame is pushed at a startElement() * and popped at an endElement(). This frame contains information about * the element, such as its namespace URI. */	TokenNameCOMMENT_JAVADOC	 A reference to "stack frame" corresponding to the current element. Such a frame is pushed at a startElement() and popped at an endElement(). This frame contains information about the element, such as its namespace URI. 
protected	TokenNameprotected	
ElemContext	TokenNameIdentifier	 Elem Context
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
new	TokenNamenew	
ElemContext	TokenNameIdentifier	 Elem Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A utility buffer for converting Strings passed to * character() methods to character arrays. * Reusing this buffer means not creating a new character array * everytime and it runs faster. */	TokenNameCOMMENT_JAVADOC	 A utility buffer for converting Strings passed to character() methods to character arrays. Reusing this buffer means not creating a new character array everytime and it runs faster. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_charsBuff	TokenNameIdentifier	 m chars Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
60	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * A utility buffer for converting Strings passed to * attribute methods to character arrays. * Reusing this buffer means not creating a new character array * everytime and it runs faster. */	TokenNameCOMMENT_JAVADOC	 A utility buffer for converting Strings passed to attribute methods to character arrays. Reusing this buffer means not creating a new character array everytime and it runs faster. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_attrBuff	TokenNameIdentifier	 m attr Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
30	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Receive notification of a comment. * * @see ExtendedLexicalHandler#comment(String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of a comment. * @see ExtendedLexicalHandler#comment(String) 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_docIsEmpty	TokenNameIdentifier	 m doc Is Empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
m_charsBuff	TokenNameIdentifier	 m chars Buff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_charsBuff	TokenNameIdentifier	 m chars Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If at runtime, when the qname of the attribute is * known, another prefix is specified for the attribute, then we can * patch or hack the name with this method. For * a qname of the form "ns?:otherprefix:name", this function patches the * qname by simply ignoring "otherprefix". * TODO: This method is a HACK! We do not have access to the * XML file, it sometimes generates a NS prefix of the form "ns?" for * an attribute. */	TokenNameCOMMENT_JAVADOC	 If at runtime, when the qname of the attribute is known, another prefix is specified for the attribute, then we can patch or hack the name with this method. For a qname of the form "ns?:otherprefix:name", this function patches the qname by simply ignoring "otherprefix". TODO: This method is a HACK! We do not have access to the XML file, it sometimes generates a NS prefix of the form "ns?" for an attribute. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
patchName	TokenNameIdentifier	 patch Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lastColon	TokenNameIdentifier	 last Colon
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastColon	TokenNameIdentifier	 last Colon
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
firstColon	TokenNameIdentifier	 first Colon
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstColon	TokenNameIdentifier	 first Colon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastColon	TokenNameIdentifier	 last Colon
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If uri is "" then ignore prefix 	TokenNameCOMMENT_LINE	If uri is "" then ignore prefix 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
firstColon	TokenNameIdentifier	 first Colon
!=	TokenNameNOT_EQUAL	
lastColon	TokenNameIdentifier	 last Colon
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of a qualified name. If the name has no prefix, * then it works as the identity (SAX2). * @param qname the qualified name * @return the name, but excluding any prefix and colon. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of a qualified name. If the name has no prefix, then it works as the identity (SAX2). @param qname the qualified name @return the name, but excluding any prefix and colon. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive an object for locating the origin of SAX document events. * * @param locator An object that can return the location of any SAX document * event. * * Receive an object for locating the origin of SAX document events. * * <p>SAX parsers are strongly encouraged (though not absolutely * required) to supply a locator: if it does so, it must supply * the locator to the application by invoking this method before * invoking any of the other methods in the DocumentHandler * interface.</p> * * <p>The locator allows the application to determine the end * position of any document-related event, even if the parser is * not reporting an error. Typically, the application will * use this information for reporting its own errors (such as * character content that does not match an application's * business rules). The information returned by the locator * is probably not sufficient for use with a search engine.</p> * * <p>Note that the locator will return correct information only * during the invocation of the events in this interface. The * application should not attempt to use it at any other time.</p> */	TokenNameCOMMENT_JAVADOC	 Receive an object for locating the origin of SAX document events. * @param locator An object that can return the location of any SAX document event. * Receive an object for locating the origin of SAX document events. * <p>SAX parsers are strongly encouraged (though not absolutely required) to supply a locator: if it does so, it must supply the locator to the application by invoking this method before invoking any of the other methods in the DocumentHandler interface.</p> * <p>The locator allows the application to determine the end position of any document-related event, even if the parser is not reporting an error. Typically, the application will use this information for reporting its own errors (such as character content that does not match an application's business rules). The information returned by the locator is probably not sufficient for use with a search engine.</p> * <p>Note that the locator will return correct information only during the invocation of the events in this interface. The application should not attempt to use it at any other time.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// I don't do anything with this yet. 	TokenNameCOMMENT_LINE	I don't do anything with this yet. 
}	TokenNameRBRACE	
/** * Adds the given attribute to the set of collected attributes , but only if * there is a currently open element. * * An element is currently open if a startElement() notification has * occured but the start of the element has not yet been written to the * output. In the stream case this means that we have not yet been forced * to close the elements opening tag by another notification, such as a * character notification. * * @param uri the URI of the attribute * @param localName the local name of the attribute * @param rawName the qualified name of the attribute * @param type the type of the attribute (probably CDATA) * @param value the value of the attribute * @param XSLAttribute true if this attribute is coming from an xsl:attriute element * @see ExtendedContentHandler#addAttribute(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 Adds the given attribute to the set of collected attributes , but only if there is a currently open element. * An element is currently open if a startElement() notification has occured but the start of the element has not yet been written to the output. In the stream case this means that we have not yet been forced to close the elements opening tag by another notification, such as a character notification. * @param uri the URI of the attribute @param localName the local name of the attribute @param rawName the qualified name of the attribute @param type the type of the attribute (probably CDATA) @param value the value of the attribute @param XSLAttribute true if this attribute is coming from an xsl:attriute element @see ExtendedContentHandler#addAttribute(String, String, String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
XSLAttribute	TokenNameIdentifier	 XSL Attribute
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
XSLAttribute	TokenNameIdentifier	 XSL Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the given attribute to the set of attributes, even if there is * no currently open element. This is useful if a SAX startPrefixMapping() * should need to add an attribute before the element name is seen. * * @param uri the URI of the attribute * @param localName the local name of the attribute * @param rawName the qualified name of the attribute * @param type the type of the attribute (probably CDATA) * @param value the value of the attribute * @param XSLAttribute true if this attribute is coming from an xsl:attribute element * @return true if the attribute was added, * false if an existing value was replaced. */	TokenNameCOMMENT_JAVADOC	 Adds the given attribute to the set of attributes, even if there is no currently open element. This is useful if a SAX startPrefixMapping() should need to add an attribute before the element name is seen. * @param uri the URI of the attribute @param localName the local name of the attribute @param rawName the qualified name of the attribute @param type the type of the attribute (probably CDATA) @param value the value of the attribute @param XSLAttribute true if this attribute is coming from an xsl:attribute element @return true if the attribute was added, false if an existing value was replaced. 
public	TokenNamepublic	
boolean	TokenNameboolean	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
XSLAttribute	TokenNameIdentifier	 XSL Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
was_added	TokenNameIdentifier	 was added
;	TokenNameSEMICOLON	
// final int index = 	TokenNameCOMMENT_LINE	final int index = 
// (localName == null || uri == null) ? 	TokenNameCOMMENT_LINE	(localName == null || uri == null) ? 
// m_attributes.getIndex(rawName):m_attributes.getIndex(uri, localName); 	TokenNameCOMMENT_LINE	m_attributes.getIndex(rawName):m_attributes.getIndex(uri, localName); 
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// if (localName == null || uri == null){ 	TokenNameCOMMENT_LINE	if (localName == null || uri == null){ 
// index = m_attributes.getIndex(rawName); 	TokenNameCOMMENT_LINE	index = m_attributes.getIndex(rawName); 
// } 	TokenNameCOMMENT_LINE	} 
// else { 	TokenNameCOMMENT_LINE	else { 
// index = m_attributes.getIndex(uri, localName); 	TokenNameCOMMENT_LINE	index = m_attributes.getIndex(uri, localName); 
// } 	TokenNameCOMMENT_LINE	} 
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* We've seen the attribute before. * We may have a null uri or localName, but all * we really want to re-set is the value anyway. */	TokenNameCOMMENT_BLOCK	 We've seen the attribute before. We may have a null uri or localName, but all we really want to re-set is the value anyway. 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
was_added	TokenNameIdentifier	 was added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the attribute doesn't exist yet, create it 	TokenNameCOMMENT_LINE	the attribute doesn't exist yet, create it 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
was_added	TokenNameIdentifier	 was added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
was_added	TokenNameIdentifier	 was added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the given attribute to the set of collected attributes, * but only if there is a currently open element. * * @param name the attribute's qualified name * @param value the value of the attribute */	TokenNameCOMMENT_JAVADOC	 Adds the given attribute to the set of collected attributes, but only if there is a currently open element. * @param name the attribute's qualified name @param value the value of the attribute 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
patchedName	TokenNameIdentifier	 patched Name
=	TokenNameEQUAL	
patchName	TokenNameIdentifier	 patch Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
patchedName	TokenNameIdentifier	 patched Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
patchedName	TokenNameIdentifier	 patched Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
patchedName	TokenNameIdentifier	 patched Name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the given xsl:attribute to the set of collected attributes, * but only if there is a currently open element. * * @param name the attribute's qualified name (prefix:localName) * @param value the value of the attribute * @param uri the URI that the prefix of the name points to */	TokenNameCOMMENT_JAVADOC	 Adds the given xsl:attribute to the set of collected attributes, but only if there is a currently open element. * @param name the attribute's qualified name (prefix:localName) @param value the value of the attribute @param uri the URI that the prefix of the name points to 
public	TokenNamepublic	
void	TokenNamevoid	
addXSLAttribute	TokenNameIdentifier	 add XSL Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
patchedName	TokenNameIdentifier	 patched Name
=	TokenNameEQUAL	
patchName	TokenNameIdentifier	 patch Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
patchedName	TokenNameIdentifier	 patched Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
patchedName	TokenNameIdentifier	 patched Name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add the given attributes to the currently collected ones. These * attributes are always added, regardless of whether on not an element * is currently open. * @param atts List of attributes to add to this list */	TokenNameCOMMENT_JAVADOC	 Add the given attributes to the currently collected ones. These attributes are always added, regardless of whether on not an element is currently open. @param atts List of attributes to add to this list 
public	TokenNamepublic	
void	TokenNamevoid	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
int	TokenNameint	
nAtts	TokenNameIdentifier	 n Atts
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nAtts	TokenNameIdentifier	 n Atts
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a {@link ContentHandler} interface into this serializer. * If the serializer does not support the {@link ContentHandler} * interface, it should return null. * * @return A {@link ContentHandler} interface into this serializer, * or null if the serializer is not SAX 2 capable * @throws IOException An I/O exception occured */	TokenNameCOMMENT_JAVADOC	 Return a {@link ContentHandler} interface into this serializer. If the serializer does not support the {@link ContentHandler} interface, it should return null. * @return A {@link ContentHandler} interface into this serializer, or null if the serializer is not SAX 2 capable @throws IOException An I/O exception occured 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of an entity. * * @param name The name of the entity that is ending. * @throws org.xml.sax.SAXException The application may raise an exception. * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the end of an entity. * @param name The name of the entity that is ending. @throws org.xml.sax.SAXException The application may raise an exception. @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"[dtd]"	TokenNameStringLiteral	[dtd]
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fireEndEntity	TokenNameIdentifier	 fire End Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flush and close the underlying java.io.Writer. This method applies to * ToStream serializers, not ToSAXHandler serializers. * @see ToStream */	TokenNameCOMMENT_JAVADOC	 Flush and close the underlying java.io.Writer. This method applies to ToStream serializers, not ToSAXHandler serializers. @see ToStream 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing (base behavior) 	TokenNameCOMMENT_LINE	do nothing (base behavior) 
}	TokenNameRBRACE	
/** * Initialize global variables */	TokenNameCOMMENT_JAVADOC	 Initialize global variables 
protected	TokenNameprotected	
void	TokenNamevoid	
initCDATA	TokenNameIdentifier	 init CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CDATA stack 	TokenNameCOMMENT_LINE	CDATA stack 
// _cdataStack = new Stack(); 	TokenNameCOMMENT_LINE	_cdataStack = new Stack(); 
// _cdataStack.push(new Integer(-1)); // push dummy value 	TokenNameCOMMENT_LINE	_cdataStack.push(new Integer(-1)); // push dummy value 
}	TokenNameRBRACE	
/** * Returns the character encoding to be used in the output document. * @return the character encoding to be used in the output document. */	TokenNameCOMMENT_JAVADOC	 Returns the character encoding to be used in the output document. @return the character encoding to be used in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the character encoding coming from the xsl:output encoding stylesheet attribute. * @param m_encoding the character encoding */	TokenNameCOMMENT_JAVADOC	 Sets the character encoding coming from the xsl:output encoding stylesheet attribute. @param m_encoding the character encoding 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value coming from the xsl:output omit-xml-declaration stylesheet attribute * @param b true if the XML declaration is to be omitted from the output * document. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output omit-xml-declaration stylesheet attribute @param b true if the XML declaration is to be omitted from the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
?	TokenNameQUESTION	
"yes"	TokenNameStringLiteral	yes
:	TokenNameCOLON	
"no"	TokenNameStringLiteral	no
;	TokenNameSEMICOLON	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the XML declaration is to be omitted from the output * document. */	TokenNameCOMMENT_JAVADOC	 @return true if the XML declaration is to be omitted from the output document. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_shouldNotWriteXMLHeader	TokenNameIdentifier	 m should Not Write XML Header
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the previously set value of the value to be used as the public * identifier in the document type declaration (DTD). * *@return the public identifier to be used in the DOCTYPE declaration in the * output document. */	TokenNameCOMMENT_JAVADOC	 Returns the previously set value of the value to be used as the public identifier in the document type declaration (DTD). *@return the public identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_doctypePublic	TokenNameIdentifier	 m doctype Public
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the value coming from the xsl:output doctype-public stylesheet attribute. * @param doctypePublic the public identifier to be used in the DOCTYPE * declaration in the output document. */	TokenNameCOMMENT_JAVADOC	 Set the value coming from the xsl:output doctype-public stylesheet attribute. @param doctypePublic the public identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
,	TokenNameCOMMA	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the previously set value of the value to be used * as the system identifier in the document type declaration (DTD). * @return the system identifier to be used in the DOCTYPE declaration in * the output document. * */	TokenNameCOMMENT_JAVADOC	 Returns the previously set value of the value to be used as the system identifier in the document type declaration (DTD). @return the system identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_doctypeSystem	TokenNameIdentifier	 m doctype System
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the value coming from the xsl:output doctype-system stylesheet attribute. * @param doctypeSystem the system identifier to be used in the DOCTYPE * declaration in the output document. */	TokenNameCOMMENT_JAVADOC	 Set the value coming from the xsl:output doctype-system stylesheet attribute. @param doctypeSystem the system identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
,	TokenNameCOMMA	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties * @param doctypeSystem the system identifier to be used in the DOCTYPE * declaration in the output document. * @param doctypePublic the public identifier to be used in the DOCTYPE * declaration in the output document. */	TokenNameCOMMENT_JAVADOC	 Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties @param doctypeSystem the system identifier to be used in the DOCTYPE declaration in the output document. @param doctypePublic the public identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
,	TokenNameCOMMA	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
,	TokenNameCOMMA	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value coming from the xsl:output standalone stylesheet attribute. * @param standalone a value of "yes" indicates that the * <code>standalone</code> delaration is to be included in the output * document. This method remembers if the value was explicitly set using * this method, verses if the value is the default value. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output standalone stylesheet attribute. @param standalone a value of "yes" indicates that the <code>standalone</code> delaration is to be included in the output document. This method remembers if the value was explicitly set using this method, verses if the value is the default value. 
public	TokenNamepublic	
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
,	TokenNameCOMMA	
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the XSL standalone attribute, but does not remember if this is a * default or explicite setting. * @param standalone "yes" | "no" */	TokenNameCOMMENT_JAVADOC	 Sets the XSL standalone attribute, but does not remember if this is a default or explicite setting. @param standalone "yes" | "no" 
protected	TokenNameprotected	
void	TokenNamevoid	
setStandaloneInternal	TokenNameIdentifier	 set Standalone Internal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_standalone	TokenNameIdentifier	 m standalone
=	TokenNameEQUAL	
"yes"	TokenNameStringLiteral	yes
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_standalone	TokenNameIdentifier	 m standalone
=	TokenNameEQUAL	
"no"	TokenNameStringLiteral	no
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the XSL standalone attribute * @return a value of "yes" if the <code>standalone</code> delaration is to * be included in the output document. * @see XSLOutputAttributes#getStandalone() */	TokenNameCOMMENT_JAVADOC	 Gets the XSL standalone attribute @return a value of "yes" if the <code>standalone</code> delaration is to be included in the output document. @see XSLOutputAttributes#getStandalone() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_standalone	TokenNameIdentifier	 m standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the output document should be indented to visually * indicate its structure. */	TokenNameCOMMENT_JAVADOC	 @return true if the output document should be indented to visually indicate its structure. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_doIndent	TokenNameIdentifier	 m do Indent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the mediatype the media-type or MIME type associated with the output * document. * @return the mediatype the media-type or MIME type associated with the * output document. */	TokenNameCOMMENT_JAVADOC	 Gets the mediatype the media-type or MIME type associated with the output document. @return the mediatype the media-type or MIME type associated with the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mediatype	TokenNameIdentifier	 m mediatype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the version of the output format. * @return the version of the output format. */	TokenNameCOMMENT_JAVADOC	 Gets the version of the output format. @return the version of the output format. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_version	TokenNameIdentifier	 m version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value coming from the xsl:output version attribute. * @param version the version of the output format. * @see SerializationHandler#setVersion(String) */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output version attribute. @param version the version of the output format. @see SerializationHandler#setVersion(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value coming from the xsl:output media-type stylesheet attribute. * @param mediaType the non-null media-type or MIME type associated with the * output document. * @see javax.xml.transform.OutputKeys#MEDIA_TYPE * @see SerializationHandler#setMediaType(String) */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output media-type stylesheet attribute. @param mediaType the non-null media-type or MIME type associated with the output document. @see javax.xml.transform.OutputKeys#MEDIA_TYPE @see SerializationHandler#setMediaType(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediaType	TokenNameIdentifier	 media Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
,	TokenNameCOMMA	
mediaType	TokenNameIdentifier	 media Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the number of spaces to indent for each indentation level. */	TokenNameCOMMENT_JAVADOC	 @return the number of spaces to indent for each indentation level. 
public	TokenNamepublic	
int	TokenNameint	
getIndentAmount	TokenNameIdentifier	 get Indent Amount
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_indentAmount	TokenNameIdentifier	 m indent Amount
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the indentation amount. * @param m_indentAmount The m_indentAmount to set */	TokenNameCOMMENT_JAVADOC	 Sets the indentation amount. @param m_indentAmount The m_indentAmount to set 
public	TokenNamepublic	
void	TokenNamevoid	
setIndentAmount	TokenNameIdentifier	 set Indent Amount
(	TokenNameLPAREN	
int	TokenNameint	
m_indentAmount	TokenNameIdentifier	 m indent Amount
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_indentAmount	TokenNameIdentifier	 m indent Amount
=	TokenNameEQUAL	
m_indentAmount	TokenNameIdentifier	 m indent Amount
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value coming from the xsl:output indent stylesheet * attribute. * @param doIndent true if the output document should be indented to * visually indicate its structure. * @see XSLOutputAttributes#setIndent(boolean) */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output indent stylesheet attribute. @param doIndent true if the output document should be indented to visually indicate its structure. @see XSLOutputAttributes#setIndent(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doIndent	TokenNameIdentifier	 do Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
doIndent	TokenNameIdentifier	 do Indent
?	TokenNameQUESTION	
"yes"	TokenNameStringLiteral	yes
:	TokenNameCOLON	
"no"	TokenNameStringLiteral	no
;	TokenNameSEMICOLON	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used when a prefix/uri namespace mapping * is indicated after the element was started with a * startElement() and before and endElement(). * startPrefixMapping(prefix,uri) would be used before the * startElement() call. * @param uri the URI of the namespace * @param prefix the prefix associated with the given URI. * * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) */	TokenNameCOMMENT_JAVADOC	 This method is used when a prefix/uri namespace mapping is indicated after the element was started with a startElement() and before and endElement(). startPrefixMapping(prefix,uri) would be used before the startElement() call. @param uri the URI of the namespace @param prefix the prefix associated with the given URI. * @see ExtendedContentHandler#namespaceAfterStartElement(String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// default behavior is to do nothing 	TokenNameCOMMENT_LINE	default behavior is to do nothing 
}	TokenNameRBRACE	
/** * Return a {@link DOMSerializer} interface into this serializer. If the * serializer does not support the {@link DOMSerializer} interface, it should * return null. * * @return A {@link DOMSerializer} interface into this serializer, or null * if the serializer is not DOM capable * @throws IOException An I/O exception occured * @see Serializer#asDOMSerializer() */	TokenNameCOMMENT_JAVADOC	 Return a {@link DOMSerializer} interface into this serializer. If the serializer does not support the {@link DOMSerializer} interface, it should return null. * @return A {@link DOMSerializer} interface into this serializer, or null if the serializer is not DOM capable @throws IOException An I/O exception occured @see Serializer#asDOMSerializer() 
public	TokenNamepublic	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if two strings are equal, without worry if the first string is null. * * @param p String reference, which may be null. * @param t String reference, which may be null. * * @return true if strings are equal. */	TokenNameCOMMENT_JAVADOC	 Tell if two strings are equal, without worry if the first string is null. * @param p String reference, which may be null. @param t String reference, which may be null. * @return true if strings are equal. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
subPartMatch	TokenNameIdentifier	 sub Part Match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of a qualified name. * If the name has no prefix, * then it works as the identity (SAX2). * * @param qname a qualified name * @return returns the prefix of the qualified name, * or null if there is no prefix. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of a qualified name. If the name has no prefix, then it works as the identity (SAX2). * @param qname a qualified name @return returns the prefix of the qualified name, or null if there is no prefix. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//return (col > 0) ? qname.substring(0,col) : ""; 	TokenNameCOMMENT_LINE	return (col > 0) ? qname.substring(0,col) : ""; 
}	TokenNameRBRACE	
/** * Some users of the serializer may need the current namespace mappings * @return the current namespace mappings (prefix/uri) * @see ExtendedContentHandler#getNamespaceMappings() */	TokenNameCOMMENT_JAVADOC	 Some users of the serializer may need the current namespace mappings @return the current namespace mappings (prefix/uri) @see ExtendedContentHandler#getNamespaceMappings() 
public	TokenNamepublic	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_prefixMap	TokenNameIdentifier	 m prefix Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the prefix currently pointing to the given URI (if any). * @param namespaceURI the uri of the namespace in question * @return a prefix pointing to the given URI (if any). * @see ExtendedContentHandler#getPrefix(String) */	TokenNameCOMMENT_JAVADOC	 Returns the prefix currently pointing to the given URI (if any). @param namespaceURI the uri of the namespace in question @return a prefix pointing to the given URI (if any). @see ExtendedContentHandler#getPrefix(String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URI of an element or attribute. Note that default namespaces * do not apply directly to attributes. * @param qname a qualified name * @param isElement true if the qualified name is the name of * an element. * @return returns the namespace URI associated with the qualified name. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of an element or attribute. Note that default namespaces do not apply directly to attributes. @param qname a qualified name @param isElement true if the qualified name is the name of an element. @return returns the namespace URI associated with the qualified name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
int	TokenNameint	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
:	TokenNameCOLON	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isElement	TokenNameIdentifier	 is Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_prefixMap	TokenNameIdentifier	 m prefix Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLNS_PREFIX	TokenNameIdentifier	 XMLNS  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_NAMESPACE_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  PREFIX
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URI of prefix (if any) * * @param prefix the prefix whose URI is searched for * @return the namespace URI currently associated with the * prefix, null if the prefix is undefined. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of prefix (if any) * @param prefix the prefix whose URI is searched for @return the namespace URI currently associated with the prefix, null if the prefix is undefined. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURIFromPrefix	TokenNameIdentifier	 get Namespace URI From Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_prefixMap	TokenNameIdentifier	 m prefix Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Entity reference event. * * @param name Name of entity * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Entity reference event. * @param name Name of entity * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fireEntityReference	TokenNameIdentifier	 fire Entity Reference
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transformer associated with this serializer * @param t the transformer associated with this serializer. * @see SerializationHandler#setTransformer(Transformer) */	TokenNameCOMMENT_JAVADOC	 Sets the transformer associated with this serializer @param t the transformer associated with this serializer. @see SerializationHandler#setTransformer(Transformer) 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
// If this transformer object implements the SerializerTrace interface 	TokenNameCOMMENT_LINE	If this transformer object implements the SerializerTrace interface 
// then assign m_tracer to the transformer object so it can be used 	TokenNameCOMMENT_LINE	then assign m_tracer to the transformer object so it can be used 
// to fire trace events. 	TokenNameCOMMENT_LINE	to fire trace events. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
instanceof	TokenNameinstanceof	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
)	TokenNameRPAREN	
m_transformer	TokenNameIdentifier	 m transformer
)	TokenNameRPAREN	
.	TokenNameDOT	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_tracer	TokenNameIdentifier	 m tracer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
)	TokenNameRPAREN	
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_tracer	TokenNameIdentifier	 m tracer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the transformer associated with this serializer * @return returns the transformer associated with this serializer. * @see SerializationHandler#getTransformer() */	TokenNameCOMMENT_JAVADOC	 Gets the transformer associated with this serializer @return returns the transformer associated with this serializer. @see SerializationHandler#getTransformer() 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method gets the nodes value as a String and uses that String as if * it were an input character notification. * @param node the Node to serialize * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 This method gets the nodes value as a String and uses that String as if it were an input character notification. @param node the Node to serialize @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
m_charsBuff	TokenNameIdentifier	 m chars Buff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_charsBuff	TokenNameIdentifier	 m chars Buff
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ErrorHandler#error(SAXParseException) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ErrorHandler#error(SAXParseException) 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ErrorHandler#fatalError(SAXParseException) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ErrorHandler#fatalError(SAXParseException) 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ErrorHandler#warning(SAXParseException) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ErrorHandler#warning(SAXParseException) 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * To fire off start entity trace event * @param name Name of entity */	TokenNameCOMMENT_JAVADOC	 To fire off start entity trace event @param name Name of entity 
protected	TokenNameprotected	
void	TokenNamevoid	
fireStartEntity	TokenNameIdentifier	 fire Start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENTITYREF	TokenNameIdentifier	 EVENTTYPE  ENTITYREF
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the characters event * @param chars content of characters * @param start starting index of characters to output * @param length number of characters to output */	TokenNameCOMMENT_JAVADOC	 Report the characters event @param chars content of characters @param start starting index of characters to output @param length number of characters to output 
// protected void fireCharEvent(char[] chars, int start, int length) 	TokenNameCOMMENT_LINE	protected void fireCharEvent(char[] chars, int start, int length) 
// throws org.xml.sax.SAXException 	TokenNameCOMMENT_LINE	throws org.xml.sax.SAXException 
// { 	TokenNameCOMMENT_LINE	{ 
// if (m_tracer != null) 	TokenNameCOMMENT_LINE	if (m_tracer != null) 
// m_tracer.fireGenerateEvent(SerializerTrace.EVENTTYPE_CHARACTERS, chars, start,length); 	TokenNameCOMMENT_LINE	m_tracer.fireGenerateEvent(SerializerTrace.EVENTTYPE_CHARACTERS, chars, start,length); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
/** * This method is only used internally when flushing the writer from the * various fire...() trace events. Due to the writer being wrapped with * SerializerTraceWriter it may cause the flush of these trace events: * EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS * EVENTTYPE_OUTPUT_CHARACTERS * which trace the output written to the output stream. * */	TokenNameCOMMENT_JAVADOC	 This method is only used internally when flushing the writer from the various fire...() trace events. Due to the writer being wrapped with SerializerTraceWriter it may cause the flush of these trace events: EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS EVENTTYPE_OUTPUT_CHARACTERS which trace the output written to the output stream. 
private	TokenNameprivate	
void	TokenNamevoid	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the CDATA trace event * @param chars content of CDATA * @param start starting index of characters to output * @param length number of characters to output */	TokenNameCOMMENT_JAVADOC	 Report the CDATA trace event @param chars content of CDATA @param start starting index of characters to output @param length number of characters to output 
protected	TokenNameprotected	
void	TokenNamevoid	
fireCDATAEvent	TokenNameIdentifier	 fire CDATA Event
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_CDATA	TokenNameIdentifier	 EVENTTYPE  CDATA
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the comment trace event * @param chars content of comment * @param start starting index of comment to output * @param length number of characters to output */	TokenNameCOMMENT_JAVADOC	 Report the comment trace event @param chars content of comment @param start starting index of comment to output @param length number of characters to output 
protected	TokenNameprotected	
void	TokenNamevoid	
fireCommentEvent	TokenNameIdentifier	 fire Comment Event
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_COMMENT	TokenNameIdentifier	 EVENTTYPE  COMMENT
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To fire off end entity trace event * @param name Name of entity */	TokenNameCOMMENT_JAVADOC	 To fire off end entity trace event @param name Name of entity 
public	TokenNamepublic	
void	TokenNamevoid	
fireEndEntity	TokenNameIdentifier	 fire End Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we do not need to handle this. 	TokenNameCOMMENT_LINE	we do not need to handle this. 
}	TokenNameRBRACE	
/** * To fire off start document trace event */	TokenNameCOMMENT_JAVADOC	 To fire off start document trace event 
protected	TokenNameprotected	
void	TokenNamevoid	
fireStartDoc	TokenNameIdentifier	 fire Start Doc
(	TokenNameLPAREN	
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_STARTDOCUMENT	TokenNameIdentifier	 EVENTTYPE  STARTDOCUMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To fire off end document trace event */	TokenNameCOMMENT_JAVADOC	 To fire off end document trace event 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEndDoc	TokenNameIdentifier	 fire End Doc
(	TokenNameLPAREN	
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENDDOCUMENT	TokenNameIdentifier	 EVENTTYPE  ENDDOCUMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the start element trace event. This trace method needs to be * called just before the attributes are cleared. * * @param elemName the qualified name of the element * */	TokenNameCOMMENT_JAVADOC	 Report the start element trace event. This trace method needs to be called just before the attributes are cleared. * @param elemName the qualified name of the element 
protected	TokenNameprotected	
void	TokenNamevoid	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_STARTELEMENT	TokenNameIdentifier	 EVENTTYPE  STARTELEMENT
,	TokenNameCOMMA	
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
m_attributes	TokenNameIdentifier	 m attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To fire off the end element event * @param name Name of element */	TokenNameCOMMENT_JAVADOC	 To fire off the end element event @param name Name of element 
// protected void fireEndElem(String name) 	TokenNameCOMMENT_LINE	protected void fireEndElem(String name) 
// throws org.xml.sax.SAXException 	TokenNameCOMMENT_LINE	throws org.xml.sax.SAXException 
// { 	TokenNameCOMMENT_LINE	{ 
// if (m_tracer != null) 	TokenNameCOMMENT_LINE	if (m_tracer != null) 
// m_tracer.fireGenerateEvent(SerializerTrace.EVENTTYPE_ENDELEMENT,name, (Attributes)null); 	TokenNameCOMMENT_LINE	m_tracer.fireGenerateEvent(SerializerTrace.EVENTTYPE_ENDELEMENT,name, (Attributes)null); 
// } 	TokenNameCOMMENT_LINE	} 
/** * To fire off the PI trace event * @param name Name of PI */	TokenNameCOMMENT_JAVADOC	 To fire off the PI trace event @param name Name of PI 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEscapingEvent	TokenNameIdentifier	 fire Escaping Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_PI	TokenNameIdentifier	 EVENTTYPE  PI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To fire off the entity reference trace event * @param name Name of entity reference */	TokenNameCOMMENT_JAVADOC	 To fire off the entity reference trace event @param name Name of entity reference 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEntityReference	TokenNameIdentifier	 fire Entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushMyWriter	TokenNameIdentifier	 flush My Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENTITYREF	TokenNameIdentifier	 EVENTTYPE  ENTITYREF
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Attributes	TokenNameIdentifier	 Attributes
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of a document. * This method is never a self generated call, * but only called externally. * * <p>The SAX parser will invoke this method only once, before any * other methods in this interface or in DTDHandler (except for * setDocumentLocator).</p> * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of a document. This method is never a self generated call, but only called externally. * <p>The SAX parser will invoke this method only once, before any other methods in this interface or in DTDHandler (except for setDocumentLocator).</p> * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
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
// if we do get called with startDocument(), handle it right away 	TokenNameCOMMENT_LINE	if we do get called with startDocument(), handle it right away 
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method handles what needs to be done at a startDocument() call, * whether from an external caller, or internally called in the * serializer. For historical reasons the serializer is flexible to * startDocument() not always being called. * Even if no external call is * made into startDocument() this method will always be called as a self * generated internal startDocument, it handles what needs to be done at a * startDocument() call. * * This method exists just to make sure that startDocument() is only ever * called from an external caller, which in principle is just a matter of * style. * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 This method handles what needs to be done at a startDocument() call, whether from an external caller, or internally called in the serializer. For historical reasons the serializer is flexible to startDocument() not always being called. Even if no external call is made into startDocument() this method will always be called as a self generated internal startDocument, it handles what needs to be done at a startDocument() call. * This method exists just to make sure that startDocument() is only ever called from an external caller, which in principle is just a matter of style. * @throws SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
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
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fireStartDoc	TokenNameIdentifier	 fire Start Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used to set the source locator, which might be used to * generated an error message. * @param locator the source locator * * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator) */	TokenNameCOMMENT_JAVADOC	 This method is used to set the source locator, which might be used to generated an error message. @param locator the source locator * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator) 
public	TokenNamepublic	
void	TokenNamevoid	
setSourceLocator	TokenNameIdentifier	 set Source Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sourceLocator	TokenNameIdentifier	 m source Locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used only by TransformerSnapshotImpl to restore the serialization * to a previous state. * * @param mappings NamespaceMappings */	TokenNameCOMMENT_JAVADOC	 Used only by TransformerSnapshotImpl to restore the serialization to a previous state. * @param mappings NamespaceMappings 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaceMappings	TokenNameIdentifier	 set Namespace Mappings
(	TokenNameLPAREN	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
mappings	TokenNameIdentifier	 mappings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixMap	TokenNameIdentifier	 m prefix Map
=	TokenNameEQUAL	
mappings	TokenNameIdentifier	 mappings
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetSerializerBase	TokenNameIdentifier	 reset Serializer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset all of the fields owned by SerializerBase * */	TokenNameCOMMENT_JAVADOC	 Reset all of the fields owned by SerializerBase 
private	TokenNameprivate	
void	TokenNamevoid	
resetSerializerBase	TokenNameIdentifier	 reset Serializer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_docIsEmpty	TokenNameIdentifier	 m doc Is Empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_doctypePublic	TokenNameIdentifier	 m doctype Public
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_doctypeSystem	TokenNameIdentifier	 m doctype System
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_doIndent	TokenNameIdentifier	 m do Indent
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
new	TokenNamenew	
ElemContext	TokenNameIdentifier	 Elem Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_indentAmount	TokenNameIdentifier	 m indent Amount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_mediatype	TokenNameIdentifier	 m mediatype
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_OutputProps	TokenNameIdentifier	 m  Output Props
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_OutputProps	TokenNameIdentifier	 m  Output Props
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_prefixMap	TokenNameIdentifier	 m prefix Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_shouldNotWriteXMLHeader	TokenNameIdentifier	 m should Not Write XML Header
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_sourceLocator	TokenNameIdentifier	 m source Locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_standalone	TokenNameIdentifier	 m standalone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_standaloneWasSpecified	TokenNameIdentifier	 m standalone Was Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_tracer	TokenNameIdentifier	 m tracer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_version	TokenNameIdentifier	 m version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// don't set writer to null, so that it might be re-used 	TokenNameCOMMENT_LINE	don't set writer to null, so that it might be re-used 
//this.m_writer = null; 	TokenNameCOMMENT_LINE	this.m_writer = null; 
}	TokenNameRBRACE	
/** * Returns true if the serializer is used for temporary output rather than * final output. * * This concept is made clear in the XSLT 2.0 draft. */	TokenNameCOMMENT_JAVADOC	 Returns true if the serializer is used for temporary output rather than final output. * This concept is made clear in the XSLT 2.0 draft. 
final	TokenNamefinal	
boolean	TokenNameboolean	
inTemporaryOutputState	TokenNameIdentifier	 in Temporary Output State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* This is a hack. We should really be letting the serializer know * that it is in temporary output state with an explicit call, but * from a pragmatic point of view (for now anyways) having no output * encoding at all, not even the default UTF-8 indicates that the serializer * is being used for temporary RTF. */	TokenNameCOMMENT_BLOCK	 This is a hack. We should really be letting the serializer know that it is in temporary output state with an explicit call, but from a pragmatic point of view (for now anyways) having no output encoding at all, not even the default UTF-8 indicates that the serializer is being used for temporary RTF. 
return	TokenNamereturn	
(	TokenNameLPAREN	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method adds an attribute the the current element, * but should not be used for an xsl:attribute child. * @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 This method adds an attribute the the current element, but should not be used for an xsl:attribute child. @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// This method just provides a definition to satisfy the interface 	TokenNameCOMMENT_LINE	This method just provides a definition to satisfy the interface 
// A particular sub-class of SerializerBase provides the implementation (if desired) 	TokenNameCOMMENT_LINE	A particular sub-class of SerializerBase provides the implementation (if desired) 
}	TokenNameRBRACE	
/** * @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg2	TokenNameIdentifier	 arg2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// This method just provides a definition to satisfy the interface 	TokenNameCOMMENT_LINE	This method just provides a definition to satisfy the interface 
// A particular sub-class of SerializerBase provides the implementation (if desired) 	TokenNameCOMMENT_LINE	A particular sub-class of SerializerBase provides the implementation (if desired) 
}	TokenNameRBRACE	
/** * If set to false the serializer does not expand DTD entities, * but leaves them as is, the default value is true. */	TokenNameCOMMENT_JAVADOC	 If set to false the serializer does not expand DTD entities, but leaves them as is, the default value is true. 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDEntityExpansion	TokenNameIdentifier	 set DTD Entity Expansion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expand	TokenNameIdentifier	 expand
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This method just provides a definition to satisfy the interface 	TokenNameCOMMENT_LINE	This method just provides a definition to satisfy the interface 
// A particular sub-class of SerializerBase provides the implementation (if desired) 	TokenNameCOMMENT_LINE	A particular sub-class of SerializerBase provides the implementation (if desired) 
}	TokenNameRBRACE	
/** * The CDATA section names stored in a whitespace separateed list with * each element being a word of the form "{uri}localName" This list * comes from the cdata-section-elements attribute. * * This field replaces m_cdataSectionElements Vector. */	TokenNameCOMMENT_JAVADOC	 The CDATA section names stored in a whitespace separateed list with each element being a word of the form "{uri}localName" This list comes from the cdata-section-elements attribute. * This field replaces m_cdataSectionElements Vector. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
m_docIsEmpty	TokenNameIdentifier	 m doc Is Empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
initCdataElems	TokenNameIdentifier	 init Cdata Elems
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// true if we are in the middle of a pair of curly braces that delimit a URI 	TokenNameCOMMENT_LINE	true if we are in the middle of a pair of curly braces that delimit a URI 
boolean	TokenNameboolean	
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// true if we found a URI but haven't yet processed the local name 	TokenNameCOMMENT_LINE	true if we found a URI but haven't yet processed the local name 
boolean	TokenNameboolean	
foundURI	TokenNameIdentifier	 found URI
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// parse through string, breaking on whitespaces. I do this instead 	TokenNameCOMMENT_LINE	parse through string, breaking on whitespaces. I do this instead 
// of a tokenizer so I can track whitespace inside of curly brackets, 	TokenNameCOMMENT_LINE	of a tokenizer so I can track whitespace inside of curly brackets, 
// which theoretically shouldn't happen if they contain legal URLs. 	TokenNameCOMMENT_LINE	which theoretically shouldn't happen if they contain legal URLs. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inCurly	TokenNameIdentifier	 in Curly
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundURI	TokenNameIdentifier	 found URI
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
addCDATAElement	TokenNameIdentifier	 add CDATA Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foundURI	TokenNameIdentifier	 found URI
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add whitespace to the URI 	TokenNameCOMMENT_LINE	add whitespace to the URI 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
// starting a URI 	TokenNameCOMMENT_LINE	starting a URI 
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we just ended a URI, add the URI to the vector 	TokenNameCOMMENT_LINE	we just ended a URI, add the URI to the vector 
foundURI	TokenNameIdentifier	 found URI
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// append non-whitespace, non-curly to current URI or localName being gathered. 	TokenNameCOMMENT_LINE	append non-whitespace, non-curly to current URI or localName being gathered. 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We have one last localName to process. 	TokenNameCOMMENT_LINE	We have one last localName to process. 
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundURI	TokenNameIdentifier	 found URI
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
addCDATAElement	TokenNameIdentifier	 add CDATA Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
addCDATAElement	TokenNameIdentifier	 add CDATA Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if nothing has been sent to this result tree yet. * <p> * This is not a public API. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Return true if nothing has been sent to this result tree yet. <p> This is not a public API. * @xsl.usage internal 
public	TokenNamepublic	
boolean	TokenNameboolean	
documentIsEmpty	TokenNameIdentifier	 document Is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we haven't called startDocument() yet, then this document is empty 	TokenNameCOMMENT_LINE	If we haven't called startDocument() yet, then this document is empty 
return	TokenNamereturn	
m_docIsEmpty	TokenNameIdentifier	 m doc Is Empty
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if the current element in m_elemContext * is a CDATA section. * CDATA sections are specified in the <xsl:output> attribute * cdata-section-names or in the JAXP equivalent property. * In any case the format of the value of such a property is: * <pre> * "{uri1}localName1 {uri2}localName2 . . . " * </pre> * * <p> * This method is not a public API, but is only used internally by the serializer. */	TokenNameCOMMENT_JAVADOC	 Return true if the current element in m_elemContext is a CDATA section. CDATA sections are specified in the <xsl:output> attribute cdata-section-names or in the JAXP equivalent property. In any case the format of the value of such a property is: <pre> "{uri1}localName1 {uri2}localName2 . . . " </pre> * <p> This method is not a public API, but is only used internally by the serializer. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isCdataSection	TokenNameIdentifier	 is Cdata Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
=	TokenNameEQUAL	
getElementURI	TokenNameIdentifier	 get Element URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
;	TokenNameSEMICOLON	
// leave URI as "", meaning in no namespace 	TokenNameCOMMENT_LINE	leave URI as "", meaning in no namespace 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We were told the URI was "", yet the name has a prefix since the name is longer than the localname. 	TokenNameCOMMENT_LINE	We were told the URI was "", yet the name has a prefix since the name is longer than the localname. 
// So we will fix that incorrect information here. 	TokenNameCOMMENT_LINE	So we will fix that incorrect information here. 
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
=	TokenNameEQUAL	
getElementURI	TokenNameIdentifier	 get Element URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Before this call m_elementContext.m_elementURI is null, * which means it is not yet known. After this call it * is non-null, but possibly "" meaning that it is in the * default namespace. * * @return The URI of the element, never null, but possibly "". */	TokenNameCOMMENT_JAVADOC	 Before this call m_elementContext.m_elementURI is null, which means it is not yet known. After this call it is non-null, but possibly "" meaning that it is in the default namespace. * @return The URI of the element, never null, but possibly "". 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getElementURI	TokenNameIdentifier	 get Element URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// At this point in processing we have received all the 	TokenNameCOMMENT_LINE	At this point in processing we have received all the 
// namespace mappings 	TokenNameCOMMENT_LINE	namespace mappings 
// As we still don't know the elements namespace, 	TokenNameCOMMENT_LINE	As we still don't know the elements namespace, 
// we now figure it out. 	TokenNameCOMMENT_LINE	we now figure it out. 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no prefix so lookup the URI of the default namespace 	TokenNameCOMMENT_LINE	no prefix so lookup the URI of the default namespace 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We didn't find the namespace for the 	TokenNameCOMMENT_LINE	We didn't find the namespace for the 
// prefix ... ouch, that shouldn't happen. 	TokenNameCOMMENT_LINE	prefix ... ouch, that shouldn't happen. 
// This is a hack, we really don't know 	TokenNameCOMMENT_LINE	This is a hack, we really don't know 
// the namespace 	TokenNameCOMMENT_LINE	the namespace 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of an output property, * the explicit value, if any, otherwise the * default value, if any, otherwise null. */	TokenNameCOMMENT_JAVADOC	 Get the value of an output property, the explicit value, if any, otherwise the default value, if any, otherwise null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
getOutputPropertyNonDefault	TokenNameIdentifier	 get Output Property Non Default
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no explicit value, try to get the default value 	TokenNameCOMMENT_LINE	If no explicit value, try to get the default value 
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
getOutputPropertyDefault	TokenNameIdentifier	 get Output Property Default
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of an output property, * not the default value. If there is a default * value, but no non-default value this method * will return null. * <p> * */	TokenNameCOMMENT_JAVADOC	 Get the value of an output property, not the default value. If there is a default value, but no non-default value this method will return null. <p> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputPropertyNonDefault	TokenNameIdentifier	 get Output Property Non Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProp	TokenNameIdentifier	 get Prop
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a {@link DOM3Serializer} interface into this serializer. If the * serializer does not support the {@link DOM3Serializer} interface, it should * return null. * * @return A {@link DOM3Serializer} interface into this serializer, or null * if the serializer is not DOM capable * @throws IOException An I/O exception occured * @see org.apache.xml.serializer.Serializer#asDOM3Serializer() */	TokenNameCOMMENT_JAVADOC	 Return a {@link DOM3Serializer} interface into this serializer. If the serializer does not support the {@link DOM3Serializer} interface, it should return null. * @return A {@link DOM3Serializer} interface into this serializer, or null if the serializer is not DOM capable @throws IOException An I/O exception occured @see org.apache.xml.serializer.Serializer#asDOM3Serializer() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
asDOM3Serializer	TokenNameIdentifier	 as DO M3 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
DOM3SerializerImpl	TokenNameIdentifier	 DO M3 Serializer Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the default value of an xsl:output property, * which would be null only if no default value exists * for the property. */	TokenNameCOMMENT_JAVADOC	 Get the default value of an xsl:output property, which would be null only if no default value exists for the property. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputPropertyDefault	TokenNameIdentifier	 get Output Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProp	TokenNameIdentifier	 get Prop
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value for the output property, typically from * an xsl:output element, but this does not change what * the default value is. */	TokenNameCOMMENT_JAVADOC	 Set the value for the output property, typically from an xsl:output element, but this does not change what the default value is. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProp	TokenNameIdentifier	 set Prop
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the default value for an output property, but this does * not impact any explicitly set value. */	TokenNameCOMMENT_JAVADOC	 Set the default value for an output property, but this does not impact any explicitly set value. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputPropertyDefault	TokenNameIdentifier	 set Output Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProp	TokenNameIdentifier	 set Prop
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A mapping of keys to explicitly set values, for example if * and <xsl:output/> has an "encoding" attribute, this * map will have what that attribute maps to. */	TokenNameCOMMENT_JAVADOC	 A mapping of keys to explicitly set values, for example if and <xsl:output/> has an "encoding" attribute, this map will have what that attribute maps to. 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
m_OutputProps	TokenNameIdentifier	 m  Output Props
;	TokenNameSEMICOLON	
/** * A mapping of keys to default values, for example if * the default value of the encoding is "UTF-8" then this * map will have that "encoding" maps to "UTF-8". */	TokenNameCOMMENT_JAVADOC	 A mapping of keys to default values, for example if the default value of the encoding is "UTF-8" then this map will have that "encoding" maps to "UTF-8". 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
getOutputPropDefaultKeys	TokenNameIdentifier	 get Output Prop Default Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Set	TokenNameIdentifier	 Set
getOutputPropKeys	TokenNameIdentifier	 get Output Prop Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_OutputProps	TokenNameIdentifier	 m  Output Props
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getProp	TokenNameIdentifier	 get Prop
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_OutputProps	TokenNameIdentifier	 m  Output Props
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_OutputProps	TokenNameIdentifier	 m  Output Props
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_OutputProps	TokenNameIdentifier	 m  Output Props
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param name The name of the property, e.g. "{http://myprop}indent-tabs" or "indent". * @param val The value of the property, e.g. "4" * @param defaultVal true if this is a default value being set for the property as * opposed to a user define on, set say explicitly in the stylesheet or via JAXP */	TokenNameCOMMENT_JAVADOC	 * @param name The name of the property, e.g. "{http://myprop}indent-tabs" or "indent". @param val The value of the property, e.g. "4" @param defaultVal true if this is a default value being set for the property as opposed to a user define on, set say explicitly in the stylesheet or via JAXP 
void	TokenNamevoid	
setProp	TokenNameIdentifier	 set Prop
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
boolean	TokenNameboolean	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_OutputProps	TokenNameIdentifier	 m  Output Props
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_OutputProps	TokenNameIdentifier	 m  Output Props
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
m_OutputPropsDefault	TokenNameIdentifier	 m  Output Props Default
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initCdataElems	TokenNameIdentifier	 init Cdata Elems
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldVal	TokenNameIdentifier	 old Val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_OutputProps	TokenNameIdentifier	 m  Output Props
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newVal	TokenNameIdentifier	 new Val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldVal	TokenNameIdentifier	 old Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
newVal	TokenNameIdentifier	 new Val
=	TokenNameEQUAL	
oldVal	TokenNameIdentifier	 old Val
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
else	TokenNameelse	
newVal	TokenNameIdentifier	 new Val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
m_OutputProps	TokenNameIdentifier	 m  Output Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
newVal	TokenNameIdentifier	 new Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_OutputProps	TokenNameIdentifier	 m  Output Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the first char of the local name * @param name Either a local name, or a local name * preceeded by a uri enclosed in curly braces. */	TokenNameCOMMENT_JAVADOC	 Get the first char of the local name @param name Either a local name, or a local name preceeded by a uri enclosed in curly braces. 
static	TokenNamestatic	
char	TokenNamechar	
getFirstCharLocName	TokenNameIdentifier	 get First Char Loc Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

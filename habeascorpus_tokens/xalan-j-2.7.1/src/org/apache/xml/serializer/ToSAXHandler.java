/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToSAXHandler.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToSAXHandler.java 468654 2006-10-28 07:09:23Z minchau $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
ErrorHandler	TokenNameIdentifier	 Error Handler
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** * This class is used to provide a base behavior to be inherited * by other To...SAXHandler serializers. * * This class is not a public API. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is used to provide a base behavior to be inherited by other To...SAXHandler serializers. * This class is not a public API. * @xsl.usage internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
extends	TokenNameextends	
SerializerBase	TokenNameIdentifier	 Serializer Base
{	TokenNameLBRACE	
public	TokenNamepublic	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
hdlr	TokenNameIdentifier	 hdlr
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lex	TokenNameIdentifier	 lex
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
hdlr	TokenNameIdentifier	 hdlr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLexHandler	TokenNameIdentifier	 set Lex Handler
(	TokenNameLPAREN	
lex	TokenNameIdentifier	 lex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ToSAXHandler	TokenNameIdentifier	 To SAX Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Underlying SAX handler. Taken from XSLTC */	TokenNameCOMMENT_JAVADOC	 Underlying SAX handler. Taken from XSLTC 
protected	TokenNameprotected	
ContentHandler	TokenNameIdentifier	 Content Handler
m_saxHandler	TokenNameIdentifier	 m sax Handler
;	TokenNameSEMICOLON	
/** * Underlying LexicalHandler. Taken from XSLTC */	TokenNameCOMMENT_JAVADOC	 Underlying LexicalHandler. Taken from XSLTC 
protected	TokenNameprotected	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
m_lexHandler	TokenNameIdentifier	 m lex Handler
;	TokenNameSEMICOLON	
/** * A startPrefixMapping() call on a ToSAXHandler will pass that call * on to the wrapped ContentHandler, but should we also mirror these calls * with matching attributes, if so this field is true. * For example if this field is true then a call such as * startPrefixMapping("prefix1","uri1") will also cause the additional * internally generated attribute xmlns:prefix1="uri1" to be effectively added * to the attributes passed to the wrapped ContentHandler. */	TokenNameCOMMENT_JAVADOC	 A startPrefixMapping() call on a ToSAXHandler will pass that call on to the wrapped ContentHandler, but should we also mirror these calls with matching attributes, if so this field is true. For example if this field is true then a call such as startPrefixMapping("prefix1","uri1") will also cause the additional internally generated attribute xmlns:prefix1="uri1" to be effectively added to the attributes passed to the wrapped ContentHandler. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_shouldGenerateNSAttribute	TokenNameIdentifier	 m should Generate NS Attribute
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** If this is true, then the content handler wrapped by this * serializer implements the TransformState interface which * will give the content handler access to the state of * the transform. */	TokenNameCOMMENT_JAVADOC	 If this is true, then the content handler wrapped by this serializer implements the TransformState interface which will give the content handler access to the state of the transform. 
protected	TokenNameprotected	
TransformStateSetter	TokenNameIdentifier	 Transform State Setter
m_state	TokenNameIdentifier	 m state
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Pass callback to the SAX Handler */	TokenNameCOMMENT_JAVADOC	 Pass callback to the SAX Handler 
protected	TokenNameprotected	
void	TokenNamevoid	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxHandler	TokenNameIdentifier	 m sax Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do nothing. * @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String) */	TokenNameCOMMENT_JAVADOC	 Do nothing. @see org.xml.sax.ext.LexicalHandler#startDTD(String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
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
// do nothing for now 	TokenNameCOMMENT_LINE	do nothing for now 
}	TokenNameRBRACE	
/** * Receive notification of character data. * * @param characters The string of characters to process. * * @throws org.xml.sax.SAXException * * @see ExtendedContentHandler#characters(String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * @param characters The string of characters to process. * @throws org.xml.sax.SAXException * @see ExtendedContentHandler#characters(String) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
characters	TokenNameIdentifier	 characters
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a comment. * * @see ExtendedLexicalHandler#comment(String) */	TokenNameCOMMENT_JAVADOC	 Receive notification of a comment. * @see ExtendedLexicalHandler#comment(String) 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore if a lexical handler has not been set 	TokenNameCOMMENT_LINE	Ignore if a lexical handler has not been set 
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
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
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lexHandler	TokenNameIdentifier	 m lex Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to fire off comment event 	TokenNameCOMMENT_LINE	time to fire off comment event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireCommentEvent	TokenNameIdentifier	 fire Comment Event
(	TokenNameLPAREN	
m_charsBuff	TokenNameIdentifier	 m chars Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do nothing as this is an abstract class. All subclasses will need to * define their behavior if it is different. * @see org.xml.sax.ContentHandler#processingInstruction(String, String) */	TokenNameCOMMENT_JAVADOC	 Do nothing as this is an abstract class. All subclasses will need to define their behavior if it is different. @see org.xml.sax.ContentHandler#processingInstruction(String, String) 
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
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Redefined in SAXXMLOutput 	TokenNameCOMMENT_LINE	Redefined in SAXXMLOutput 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Redefined in SAXXMLOutput 	TokenNameCOMMENT_LINE	Redefined in SAXXMLOutput 
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element, although this is a * SAX method additional namespace or attribute information can occur before * or after this call, that is associated with this element. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement * @see org.xml.sax.ContentHandler#endElement * @see org.xml.sax.AttributeList * * @throws org.xml.sax.SAXException * * @see org.xml.sax.ContentHandler#startElement(String,String,String,Attributes) */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element, although this is a SAX method additional namespace or attribute information can occur before or after this call, that is associated with this element. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement @see org.xml.sax.ContentHandler#endElement @see org.xml.sax.AttributeList * @throws org.xml.sax.SAXException * @see org.xml.sax.ContentHandler#startElement(String,String,String,Attributes) 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
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
Attributes	TokenNameIdentifier	 Attributes
arg3	TokenNameIdentifier	 arg3
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_state	TokenNameIdentifier	 m state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_state	TokenNameIdentifier	 m state
.	TokenNameDOT	
resetState	TokenNameIdentifier	 reset State
(	TokenNameLPAREN	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fire off the start element event 	TokenNameCOMMENT_LINE	fire off the start element event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the LexicalHandler. * @param _lexHandler The LexicalHandler to set */	TokenNameCOMMENT_JAVADOC	 Sets the LexicalHandler. @param _lexHandler The LexicalHandler to set 
public	TokenNamepublic	
void	TokenNamevoid	
setLexHandler	TokenNameIdentifier	 set Lex Handler
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
_lexHandler	TokenNameIdentifier	 lex Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_lexHandler	TokenNameIdentifier	 m lex Handler
=	TokenNameEQUAL	
_lexHandler	TokenNameIdentifier	 lex Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the SAX ContentHandler. * @param _saxHandler The ContentHandler to set */	TokenNameCOMMENT_JAVADOC	 Sets the SAX ContentHandler. @param _saxHandler The ContentHandler to set 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
_saxHandler	TokenNameIdentifier	 sax Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_saxHandler	TokenNameIdentifier	 m sax Handler
=	TokenNameEQUAL	
_saxHandler	TokenNameIdentifier	 sax Handler
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_lexHandler	TokenNameIdentifier	 m lex Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_saxHandler	TokenNameIdentifier	 sax Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we are not overwriting an existing LexicalHandler, and _saxHandler 	TokenNameCOMMENT_LINE	we are not overwriting an existing LexicalHandler, and _saxHandler 
// is also implements LexicalHandler, so lets use it 	TokenNameCOMMENT_LINE	is also implements LexicalHandler, so lets use it 
m_lexHandler	TokenNameIdentifier	 m lex Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
_saxHandler	TokenNameIdentifier	 sax Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Does nothing. The setting of CDATA section elements has an impact on * stream serializers. * @see SerializationHandler#setCdataSectionElements(java.util.Vector) */	TokenNameCOMMENT_JAVADOC	 Does nothing. The setting of CDATA section elements has an impact on stream serializers. @see SerializationHandler#setCdataSectionElements(java.util.Vector) 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
/** Set whether or not namespace declarations (e.g. * xmlns:foo) should appear as attributes of * elements * @param doOutputNSAttr whether or not namespace declarations * should appear as attributes */	TokenNameCOMMENT_JAVADOC	 Set whether or not namespace declarations (e.g. xmlns:foo) should appear as attributes of elements @param doOutputNSAttr whether or not namespace declarations should appear as attributes 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldOutputNSAttr	TokenNameIdentifier	 set Should Output NS Attr
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doOutputNSAttr	TokenNameIdentifier	 do Output NS Attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_shouldGenerateNSAttribute	TokenNameIdentifier	 m should Generate NS Attribute
=	TokenNameEQUAL	
doOutputNSAttr	TokenNameIdentifier	 do Output NS Attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if namespace declarations from calls such as * startPrefixMapping("prefix1","uri1") should * also be mirrored with self generated additional attributes of elements * that declare the namespace, for example the attribute xmlns:prefix1="uri1" */	TokenNameCOMMENT_JAVADOC	 Returns true if namespace declarations from calls such as startPrefixMapping("prefix1","uri1") should also be mirrored with self generated additional attributes of elements that declare the namespace, for example the attribute xmlns:prefix1="uri1" 
boolean	TokenNameboolean	
getShouldOutputNSAttr	TokenNameIdentifier	 get Should Output NS Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_shouldGenerateNSAttribute	TokenNameIdentifier	 m should Generate NS Attribute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method flushes any pending events, which can be startDocument() * closing the opening tag of an element, or closing an open CDATA section. */	TokenNameCOMMENT_JAVADOC	 This method flushes any pending events, which can be startDocument() closing the opening tag of an element, or closing an open CDATA section. 
public	TokenNamepublic	
void	TokenNamevoid	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pass in a reference to a TransformState object, which * can be used during SAX ContentHandler events to obtain * information about he state of the transformation. This * method will be called before each startDocument event. * * @param ts A reference to a TransformState object */	TokenNameCOMMENT_JAVADOC	 Pass in a reference to a TransformState object, which can be used during SAX ContentHandler events to obtain information about he state of the transformation. This method will be called before each startDocument event. * @param ts A reference to a TransformState object 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformState	TokenNameIdentifier	 set Transform State
(	TokenNameLPAREN	
TransformStateSetter	TokenNameIdentifier	 Transform State Setter
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_state	TokenNameIdentifier	 m state
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receives notification that an element starts, but attributes are not * fully known yet. * * @param uri the URI of the namespace of the element (optional) * @param localName the element name, but without prefix (optional) * @param qName the element name, with prefix, if any (required) * * @see ExtendedContentHandler#startElement(String, String, String) */	TokenNameCOMMENT_JAVADOC	 Receives notification that an element starts, but attributes are not fully known yet. * @param uri the URI of the namespace of the element (optional) @param localName the element name, but without prefix (optional) @param qName the element name, with prefix, if any (required) * @see ExtendedContentHandler#startElement(String, String, String) 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_state	TokenNameIdentifier	 m state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_state	TokenNameIdentifier	 m state
.	TokenNameDOT	
resetState	TokenNameIdentifier	 reset State
(	TokenNameLPAREN	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fire off the start element event 	TokenNameCOMMENT_LINE	fire off the start element event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An element starts, but attributes are not fully known yet. * * @param qName the element name, with prefix (if any). * @see ExtendedContentHandler#startElement(String) */	TokenNameCOMMENT_JAVADOC	 An element starts, but attributes are not fully known yet. * @param qName the element name, with prefix (if any). @see ExtendedContentHandler#startElement(String) 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_state	TokenNameIdentifier	 m state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_state	TokenNameIdentifier	 m state
.	TokenNameDOT	
resetState	TokenNameIdentifier	 reset State
(	TokenNameLPAREN	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fire off the start element event 	TokenNameCOMMENT_LINE	fire off the start element event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method gets the node's value as a String and uses that String as if * it were an input character notification. * @param node the Node to serialize * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 This method gets the node's value as a String and uses that String as if it were an input character notification. @param node the Node to serialize @throws org.xml.sax.SAXException 
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
// remember the current node 	TokenNameCOMMENT_LINE	remember the current node 
if	TokenNameif	
(	TokenNameLPAREN	
m_state	TokenNameIdentifier	 m state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_state	TokenNameIdentifier	 m state
.	TokenNameDOT	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the node's value as a String and use that String as if 	TokenNameCOMMENT_LINE	Get the node's value as a String and use that String as if 
// it were an input character notification. 	TokenNameCOMMENT_LINE	it were an input character notification. 
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
this	TokenNamethis	
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
super	TokenNamesuper	
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_saxHandler	TokenNameIdentifier	 m sax Handler
instanceof	TokenNameinstanceof	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
m_saxHandler	TokenNameIdentifier	 m sax Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
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
super	TokenNamesuper	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_saxHandler	TokenNameIdentifier	 m sax Handler
instanceof	TokenNameinstanceof	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
m_saxHandler	TokenNameIdentifier	 m sax Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
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
super	TokenNamesuper	
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_saxHandler	TokenNameIdentifier	 m sax Handler
instanceof	TokenNameinstanceof	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
m_saxHandler	TokenNameIdentifier	 m sax Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try's to reset the super class and reset this class for * re-use, so that you don't need to create a new serializer * (mostly for performance reasons). * * @return true if the class was successfuly reset. * @see Serializer#reset() */	TokenNameCOMMENT_JAVADOC	 Try's to reset the super class and reset this class for re-use, so that you don't need to create a new serializer (mostly for performance reasons). * @return true if the class was successfuly reset. @see Serializer#reset() 
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
wasReset	TokenNameIdentifier	 was Reset
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetToSAXHandler	TokenNameIdentifier	 reset To SAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wasReset	TokenNameIdentifier	 was Reset
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
wasReset	TokenNameIdentifier	 was Reset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset all of the fields owned by ToSAXHandler class * */	TokenNameCOMMENT_JAVADOC	 Reset all of the fields owned by ToSAXHandler class 
private	TokenNameprivate	
void	TokenNamevoid	
resetToSAXHandler	TokenNameIdentifier	 reset To SAX Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_lexHandler	TokenNameIdentifier	 m lex Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_saxHandler	TokenNameIdentifier	 m sax Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_state	TokenNameIdentifier	 m state
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_shouldGenerateNSAttribute	TokenNameIdentifier	 m should Generate NS Attribute
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a unique attribute */	TokenNameCOMMENT_JAVADOC	 Add a unique attribute 
public	TokenNamepublic	
void	TokenNamevoid	
addUniqueAttribute	TokenNameIdentifier	 add Unique Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToStream.java 475894 2006-11-16 19:43:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToStream.java 475894 2006-11-16 19:43:59Z minchau $ 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EmptyStackException	TokenNameIdentifier	 Empty Stack Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
ErrorListener	TokenNameIdentifier	 Error Listener
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
Transformer	TokenNameIdentifier	 Transformer
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
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
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This abstract class is a base class for other stream * serializers (xml, html, text ...) that write output to a stream. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This abstract class is a base class for other stream serializers (xml, html, text ...) that write output to a stream. * @xsl.usage internal 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
ToStream	TokenNameIdentifier	 To Stream
extends	TokenNameextends	
SerializerBase	TokenNameIdentifier	 Serializer Base
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMENT_BEGIN	TokenNameIdentifier	 COMMENT  BEGIN
=	TokenNameEQUAL	
"<!--"	TokenNameStringLiteral	<!--
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMENT_END	TokenNameIdentifier	 COMMENT  END
=	TokenNameEQUAL	
"-->"	TokenNameStringLiteral	-->
;	TokenNameSEMICOLON	
/** Stack to keep track of disabling output escaping. */	TokenNameCOMMENT_JAVADOC	 Stack to keep track of disabling output escaping. 
protected	TokenNameprotected	
BoolStack	TokenNameIdentifier	 Bool Stack
m_disableOutputEscapingStates	TokenNameIdentifier	 m disable Output Escaping States
=	TokenNameEQUAL	
new	TokenNamenew	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The encoding information associated with this serializer. * Although initially there is no encoding, * there is a dummy EncodingInfo object that will say * that every character is in the encoding. This is useful * for a serializer that is in temporary output state and has * no associated encoding. A serializer in final output state * will have an encoding, and will worry about whether * single chars or surrogate pairs of high/low chars form * characters in the output encoding. */	TokenNameCOMMENT_JAVADOC	 The encoding information associated with this serializer. Although initially there is no encoding, there is a dummy EncodingInfo object that will say that every character is in the encoding. This is useful for a serializer that is in temporary output state and has no associated encoding. A serializer in final output state will have an encoding, and will worry about whether single chars or surrogate pairs of high/low chars form characters in the output encoding. 
EncodingInfo	TokenNameIdentifier	 Encoding Info
m_encodingInfo	TokenNameIdentifier	 m encoding Info
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Stack to keep track of whether or not we need to * preserve whitespace. * * Used to push/pop values used for the field m_ispreserve, but * m_ispreserve is only relevant if m_doIndent is true. * If m_doIndent is false this field has no impact. * */	TokenNameCOMMENT_JAVADOC	 Stack to keep track of whether or not we need to preserve whitespace. * Used to push/pop values used for the field m_ispreserve, but m_ispreserve is only relevant if m_doIndent is true. If m_doIndent is false this field has no impact. 
protected	TokenNameprotected	
BoolStack	TokenNameIdentifier	 Bool Stack
m_preserves	TokenNameIdentifier	 m preserves
=	TokenNameEQUAL	
new	TokenNamenew	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * State flag to tell if preservation of whitespace * is important. * * Used only in shouldIndent() but only if m_doIndent is true. * If m_doIndent is false this flag has no impact. * */	TokenNameCOMMENT_JAVADOC	 State flag to tell if preservation of whitespace is important. * Used only in shouldIndent() but only if m_doIndent is true. If m_doIndent is false this flag has no impact. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * State flag that tells if the previous node processed * was text, so we can tell if we should preserve whitespace. * * Used in endDocument() and shouldIndent() but * only if m_doIndent is true. * If m_doIndent is false this flag has no impact. */	TokenNameCOMMENT_JAVADOC	 State flag that tells if the previous node processed was text, so we can tell if we should preserve whitespace. * Used in endDocument() and shouldIndent() but only if m_doIndent is true. If m_doIndent is false this flag has no impact. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s_systemLineSep	TokenNameIdentifier	 s system Line Sep
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
SecuritySupport	TokenNameIdentifier	 Security Support
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s_systemLineSep	TokenNameIdentifier	 s system Line Sep
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The system line separator for writing out line breaks. * The default value is from the system property, * but this value can be set through the xsl:output * extension attribute xalan:line-separator. */	TokenNameCOMMENT_JAVADOC	 The system line separator for writing out line breaks. The default value is from the system property, but this value can be set through the xsl:output extension attribute xalan:line-separator. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_lineSep	TokenNameIdentifier	 m line Sep
=	TokenNameEQUAL	
s_systemLineSep	TokenNameIdentifier	 s system Line Sep
;	TokenNameSEMICOLON	
/** * True if the the system line separator is to be used. */	TokenNameCOMMENT_JAVADOC	 True if the the system line separator is to be used. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * The length of the line seperator, since the write is done * one character at a time. */	TokenNameCOMMENT_JAVADOC	 The length of the line seperator, since the write is done one character at a time. 
protected	TokenNameprotected	
int	TokenNameint	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
=	TokenNameEQUAL	
m_lineSep	TokenNameIdentifier	 m line Sep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** * Map that tells which characters should have special treatment, and it * provides character to entity name lookup. */	TokenNameCOMMENT_JAVADOC	 Map that tells which characters should have special treatment, and it provides character to entity name lookup. 
protected	TokenNameprotected	
CharInfo	TokenNameIdentifier	 Char Info
m_charInfo	TokenNameIdentifier	 m char Info
;	TokenNameSEMICOLON	
/** True if we control the buffer, and we should flush the output on endDocument. */	TokenNameCOMMENT_JAVADOC	 True if we control the buffer, and we should flush the output on endDocument. 
boolean	TokenNameboolean	
m_shouldFlush	TokenNameIdentifier	 m should Flush
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Add space before '/>' for XHTML. */	TokenNameCOMMENT_JAVADOC	 Add space before '/>' for XHTML. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_spaceBeforeClose	TokenNameIdentifier	 m space Before Close
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Flag to signal that a newline should be added. * * Used only in indent() which is called only if m_doIndent is true. * If m_doIndent is false this flag has no impact. */	TokenNameCOMMENT_JAVADOC	 Flag to signal that a newline should be added. * Used only in indent() which is called only if m_doIndent is true. If m_doIndent is false this flag has no impact. 
boolean	TokenNameboolean	
m_startNewLine	TokenNameIdentifier	 m start New Line
;	TokenNameSEMICOLON	
/** * Tells if we're in an internal document type subset. */	TokenNameCOMMENT_JAVADOC	 Tells if we're in an internal document type subset. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_inDoctype	TokenNameIdentifier	 m in Doctype
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Flag to quickly tell if the encoding is UTF8. */	TokenNameCOMMENT_JAVADOC	 Flag to quickly tell if the encoding is UTF8. 
boolean	TokenNameboolean	
m_isUTF8	TokenNameIdentifier	 m is UT F8
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * remembers if we are in between the startCDATA() and endCDATA() callbacks */	TokenNameCOMMENT_JAVADOC	 remembers if we are in between the startCDATA() and endCDATA() callbacks 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_cdataStartCalled	TokenNameIdentifier	 m cdata Start Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * If this flag is true DTD entity references are not left as-is, * which is exiting older behavior. */	TokenNameCOMMENT_JAVADOC	 If this flag is true DTD entity references are not left as-is, which is exiting older behavior. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_expandDTDEntities	TokenNameIdentifier	 m expand DTD Entities
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
ToStream	TokenNameIdentifier	 To Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * This helper method to writes out "]]>" when closing a CDATA section. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 This helper method to writes out "]]>" when closing a CDATA section. * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
closeCDATA	TokenNameIdentifier	 close CDATA
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
try	TokenNametry	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
CDATA_DELIMITER_CLOSE	TokenNameIdentifier	 CDATA  DELIMITER  CLOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write out a CDATA section closing "]]>" 	TokenNameCOMMENT_LINE	write out a CDATA section closing "]]>" 
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Remember that we have done so. 	TokenNameCOMMENT_LINE	Remember that we have done so. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Serializes the DOM node. Throws an exception only if an I/O * exception occured while serializing. * * @param node Node to serialize. * @throws IOException An I/O exception occured while serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the DOM node. Throws an exception only if an I/O exception occured while serializing. * @param node Node to serialize. @throws IOException An I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
TreeWalker	TokenNameIdentifier	 Tree Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
new	TokenNamenew	
TreeWalker	TokenNameIdentifier	 Tree Walker
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Taken from XSLTC */	TokenNameCOMMENT_JAVADOC	 Taken from XSLTC 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_escaping	TokenNameIdentifier	 m escaping
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Flush the formatter's result stream. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Flush the formatter's result stream. * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
flushWriter	TokenNameIdentifier	 flush Writer
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
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
instanceof	TokenNameinstanceof	
WriterToUTF8Buffered	TokenNameIdentifier	 Writer To UT F8 Buffered
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_shouldFlush	TokenNameIdentifier	 m should Flush
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WriterToUTF8Buffered	TokenNameIdentifier	 Writer To UT F8 Buffered
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WriterToUTF8Buffered	TokenNameIdentifier	 Writer To UT F8 Buffered
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
.	TokenNameDOT	
flushBuffer	TokenNameIdentifier	 flush Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
instanceof	TokenNameinstanceof	
WriterToASCI	TokenNameIdentifier	 Writer To ASCI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_shouldFlush	TokenNameIdentifier	 m should Flush
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Flush always. 	TokenNameCOMMENT_LINE	Flush always. 
// Not a great thing if the writer was created 	TokenNameCOMMENT_LINE	Not a great thing if the writer was created 
// by this class, but don't have a choice. 	TokenNameCOMMENT_LINE	by this class, but don't have a choice. 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
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
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
m_outputStream	TokenNameIdentifier	 m output Stream
;	TokenNameSEMICOLON	
/** * Get the output stream where the events will be serialized to. * * @return reference to the result stream, or null of only a writer was * set. */	TokenNameCOMMENT_JAVADOC	 Get the output stream where the events will be serialized to. * @return reference to the result stream, or null of only a writer was set. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_outputStream	TokenNameIdentifier	 m output Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Implement DeclHandler 	TokenNameCOMMENT_LINE	Implement DeclHandler 
/** * Report an element type declaration. * * <p>The content model will consist of the string "EMPTY", the * string "ANY", or a parenthesised group, optionally followed * by an occurrence indicator. The model will be normalized so * that all whitespace is removed,and will include the enclosing * parentheses.</p> * * @param name The element type name. * @param model The content model as a normalized string. * @exception SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an element type declaration. * <p>The content model will consist of the string "EMPTY", the string "ANY", or a parenthesised group, optionally followed by an occurrence indicator. The model will be normalized so that all whitespace is removed,and will include the enclosing parentheses.</p> * @param name The element type name. @param model The content model as a normalized string. @exception SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Do not inline external DTD 	TokenNameCOMMENT_LINE	Do not inline external DTD 
if	TokenNameif	
(	TokenNameLPAREN	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ELEMENT "	TokenNameStringLiteral	<!ELEMENT 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report an internal entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param value The replacement text of the entity. * @exception SAXException The application may raise an exception. * @see #externalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report an internal entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param value The replacement text of the entity. @exception SAXException The application may raise an exception. @see #externalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Do not inline external DTD 	TokenNameCOMMENT_LINE	Do not inline external DTD 
if	TokenNameif	
(	TokenNameLPAREN	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputEntityDecl	TokenNameIdentifier	 output Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Output the doc type declaration. * * @param name non-null reference to document type name. * NEEDSDOC @param value * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Output the doc type declaration. * @param name non-null reference to document type name. NEEDSDOC @param value * @throws org.xml.sax.SAXException 
void	TokenNamevoid	
outputEntityDecl	TokenNameIdentifier	 output Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ENTITY "	TokenNameStringLiteral	<!ENTITY 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ""	TokenNameStringLiteral	 "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Output a system-dependent line break. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Output a system-dependent line break. * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
outputLineSep	TokenNameIdentifier	 output Line Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
getFirstCharLocName	TokenNameIdentifier	 get First Char Loc Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cdataSectionNames	TokenNameIdentifier	 cdata Section Names
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
addCdataSectionElements	TokenNameIdentifier	 add Cdata Section Elements
(	TokenNameLPAREN	
cdataSectionNames	TokenNameIdentifier	 cdata Section Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_doctypeSystem	TokenNameIdentifier	 m doctype System
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_doctypePublic	TokenNameIdentifier	 m doctype Public
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-//W3C//DTD XHTML"	TokenNameStringLiteral	-//W3C//DTD XHTML
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_spaceBeforeClose	TokenNameIdentifier	 m space Before Close
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
newEncoding	TokenNameIdentifier	 new Encoding
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
possible_encoding	TokenNameIdentifier	 possible encoding
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getMimeEncoding	TokenNameIdentifier	 get Mime Encoding
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
possible_encoding	TokenNameIdentifier	 possible encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the encoding is being set, try to get the 	TokenNameCOMMENT_LINE	if the encoding is being set, try to get the 
// preferred 	TokenNameCOMMENT_LINE	preferred 
// mime-name and set it too. 	TokenNameCOMMENT_LINE	mime-name and set it too. 
super	TokenNamesuper	
.	TokenNameDOT	
setProp	TokenNameIdentifier	 set Prop
(	TokenNameLPAREN	
"mime-name"	TokenNameStringLiteral	mime-name
,	TokenNameCOMMA	
possible_encoding	TokenNameIdentifier	 possible encoding
,	TokenNameCOMMA	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
oldExplicitEncoding	TokenNameIdentifier	 old Explicit Encoding
=	TokenNameEQUAL	
getOutputPropertyNonDefault	TokenNameIdentifier	 get Output Property Non Default
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
oldDefaultEncoding	TokenNameIdentifier	 old Default Encoding
=	TokenNameEQUAL	
getOutputPropertyDefault	TokenNameIdentifier	 get Output Property Default
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
defaultVal	TokenNameIdentifier	 default Val
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
oldDefaultEncoding	TokenNameIdentifier	 old Default Encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
oldDefaultEncoding	TokenNameIdentifier	 old Default Encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
newEncoding	TokenNameIdentifier	 new Encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
defaultVal	TokenNameIdentifier	 default Val
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
oldExplicitEncoding	TokenNameIdentifier	 old Explicit Encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
oldExplicitEncoding	TokenNameIdentifier	 old Explicit Encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
newEncoding	TokenNameIdentifier	 new Encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are trying to change the default or the non-default setting of the encoding to a different value 	TokenNameCOMMENT_LINE	We are trying to change the default or the non-default setting of the encoding to a different value 
// from what it was 	TokenNameCOMMENT_LINE	from what it was 
EncodingInfo	TokenNameIdentifier	 Encoding Info
encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
newEncoding	TokenNameIdentifier	 new Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newEncoding	TokenNameIdentifier	 new Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
encodingInfo	TokenNameIdentifier	 encoding Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We tried to get an EncodingInfo for Object for the given 	TokenNameCOMMENT_LINE	We tried to get an EncodingInfo for Object for the given 
// encoding, but it came back with an internall null name 	TokenNameCOMMENT_LINE	encoding, but it came back with an internall null name 
// so the encoding is not supported by the JDK, issue a message. 	TokenNameCOMMENT_LINE	so the encoding is not supported by the JDK, issue a message. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_ENCODING_NOT_SUPPORTED	TokenNameIdentifier	 ER  ENCODING  NOT  SUPPORTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newEncoding	TokenNameIdentifier	 new Encoding
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg2	TokenNameIdentifier	 msg2
=	TokenNameEQUAL	
"Warning: encoding ""	TokenNameStringLiteral	Warning: encoding "
+	TokenNamePLUS	
newEncoding	TokenNameIdentifier	 new Encoding
+	TokenNamePLUS	
"" not supported, using "	TokenNameStringLiteral	" not supported, using 
+	TokenNamePLUS	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Prepare to issue the warning message 	TokenNameCOMMENT_LINE	Prepare to issue the warning message 
final	TokenNamefinal	
Transformer	TokenNameIdentifier	 Transformer
tran	TokenNameIdentifier	 tran
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tran	TokenNameIdentifier	 tran
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ErrorListener	TokenNameIdentifier	 Error Listener
errHandler	TokenNameIdentifier	 err Handler
=	TokenNameEQUAL	
tran	TokenNameIdentifier	 tran
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Issue the warning message 	TokenNameCOMMENT_LINE	Issue the warning message 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
errHandler	TokenNameIdentifier	 err Handler
&&	TokenNameAND_AND	
m_sourceLocator	TokenNameIdentifier	 m source Locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
m_sourceLocator	TokenNameIdentifier	 m source Locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg2	TokenNameIdentifier	 msg2
,	TokenNameCOMMA	
m_sourceLocator	TokenNameIdentifier	 m source Locator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg2	TokenNameIdentifier	 msg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg2	TokenNameIdentifier	 msg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// We said we are using UTF-8, so use it 	TokenNameCOMMENT_LINE	We said we are using UTF-8, so use it 
newEncoding	TokenNameIdentifier	 new Encoding
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
// to store the modified value into the properties a little later 	TokenNameCOMMENT_LINE	to store the modified value into the properties a little later 
encodingInfo	TokenNameIdentifier	 encoding Info
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getEncodingInfo	TokenNameIdentifier	 get Encoding Info
(	TokenNameLPAREN	
newEncoding	TokenNameIdentifier	 new Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The encoding was good, or was forced to UTF-8 above 	TokenNameCOMMENT_LINE	The encoding was good, or was forced to UTF-8 above 
// If there is already a non-default set encoding and we 	TokenNameCOMMENT_LINE	If there is already a non-default set encoding and we 
// are trying to set the default encoding, skip the this block 	TokenNameCOMMENT_LINE	are trying to set the default encoding, skip the this block 
// as the non-default value is already the one to use. 	TokenNameCOMMENT_LINE	as the non-default value is already the one to use. 
if	TokenNameif	
(	TokenNameLPAREN	
defaultVal	TokenNameIdentifier	 default Val
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
oldExplicitEncoding	TokenNameIdentifier	 old Explicit Encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_encodingInfo	TokenNameIdentifier	 m encoding Info
=	TokenNameEQUAL	
encodingInfo	TokenNameIdentifier	 encoding Info
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newEncoding	TokenNameIdentifier	 new Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_isUTF8	TokenNameIdentifier	 m is UT F8
=	TokenNameEQUAL	
newEncoding	TokenNameIdentifier	 new Encoding
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if there was a previously set OutputStream 	TokenNameCOMMENT_LINE	if there was a previously set OutputStream 
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Writer	TokenNameIdentifier	 Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the writer was previously set, but 	TokenNameCOMMENT_LINE	If the writer was previously set, but 
// set by the user, or if the new encoding is the same 	TokenNameCOMMENT_LINE	set by the user, or if the new encoding is the same 
// as the old encoding, skip this block 	TokenNameCOMMENT_LINE	as the old encoding, skip this block 
String	TokenNameIdentifier	 String
oldEncoding	TokenNameIdentifier	 old Encoding
=	TokenNameEQUAL	
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
m_writer_set_by_user	TokenNameIdentifier	 m writer set by user
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
newEncoding	TokenNameIdentifier	 new Encoding
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
oldEncoding	TokenNameIdentifier	 old Encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make the change of encoding in our internal 	TokenNameCOMMENT_LINE	Make the change of encoding in our internal 
// table, then call setOutputStreamInternal 	TokenNameCOMMENT_LINE	table, then call setOutputStreamInternal 
// which will stomp on the old Writer (if any) 	TokenNameCOMMENT_LINE	which will stomp on the old Writer (if any) 
// with a new Writer with the new encoding. 	TokenNameCOMMENT_LINE	with a new Writer with the new encoding. 
super	TokenNamesuper	
.	TokenNameDOT	
setProp	TokenNameIdentifier	 set Prop
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOutputStreamInternal	TokenNameIdentifier	 set Output Stream Internal
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_INDENT_AMOUNT	TokenNameIdentifier	 S  KEY  INDENT  AMOUNT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIndentAmount	TokenNameIdentifier	 set Indent Amount
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
"yes"	TokenNameStringLiteral	yes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_doIndent	TokenNameIdentifier	 m do Indent
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_LINE_SEPARATOR	TokenNameIdentifier	 S  KEY  LINE  SEPARATOR
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lineSep	TokenNameIdentifier	 m line Sep
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
=	TokenNameEQUAL	
m_lineSep	TokenNameIdentifier	 m line Sep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mediatype	TokenNameIdentifier	 m mediatype
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'o'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
"yes"	TokenNameStringLiteral	yes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_shouldNotWriteXMLHeader	TokenNameIdentifier	 m should Not Write XML Header
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// if standalone was explicitly specified 	TokenNameCOMMENT_LINE	if standalone was explicitly specified 
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setStandaloneInternal	TokenNameIdentifier	 set Standalone Internal
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_standaloneWasSpecified	TokenNameIdentifier	 m standalone Was Specified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setStandaloneInternal	TokenNameIdentifier	 set Standalone Internal
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_version	TokenNameIdentifier	 m version
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setProp	TokenNameIdentifier	 set Prop
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
defaultVal	TokenNameIdentifier	 default Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Specifies an output format for this serializer. It the * serializer has already been associated with an output format, * it will switch to the new format. This method should not be * called while the serializer is in the process of serializing * a document. * * @param format The output format to use */	TokenNameCOMMENT_JAVADOC	 Specifies an output format for this serializer. It the serializer has already been associated with an output format, it will switch to the new format. This method should not be called while the serializer is in the process of serializing a document. * @param format The output format to use 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
shouldFlush	TokenNameIdentifier	 should Flush
=	TokenNameEQUAL	
m_shouldFlush	TokenNameIdentifier	 m should Flush
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set the default values first, 	TokenNameCOMMENT_LINE	Set the default values first, 
// and the non-default values after that, 	TokenNameCOMMENT_LINE	and the non-default values after that, 
// just in case there is some unexpected 	TokenNameCOMMENT_LINE	just in case there is some unexpected 
// residual values left over from over-ridden default values 	TokenNameCOMMENT_LINE	residual values left over from over-ridden default values 
Enumeration	TokenNameIdentifier	 Enumeration
propNames	TokenNameIdentifier	 prop Names
;	TokenNameSEMICOLON	
propNames	TokenNameIdentifier	 prop Names
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
propNames	TokenNameIdentifier	 prop Names
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
propNames	TokenNameIdentifier	 prop Names
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the value, possibly a default value 	TokenNameCOMMENT_LINE	Get the value, possibly a default value 
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the non-default value (if any). 	TokenNameCOMMENT_LINE	Get the non-default value (if any). 
String	TokenNameIdentifier	 String
explicitValue	TokenNameIdentifier	 explicit Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
explicitValue	TokenNameIdentifier	 explicit Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is a default value 	TokenNameCOMMENT_LINE	This is a default value 
this	TokenNamethis	
.	TokenNameDOT	
setOutputPropertyDefault	TokenNameIdentifier	 set Output Property Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
explicitValue	TokenNameIdentifier	 explicit Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is an explicit non-default value 	TokenNameCOMMENT_LINE	This is an explicit non-default value 
this	TokenNamethis	
.	TokenNameDOT	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
explicitValue	TokenNameIdentifier	 explicit Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Access this only from the Hashtable level... we don't want to 	TokenNameCOMMENT_LINE	Access this only from the Hashtable level... we don't want to 
// get default properties. 	TokenNameCOMMENT_LINE	get default properties. 
String	TokenNameIdentifier	 String
entitiesFileName	TokenNameIdentifier	 entities File Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_ENTITIES	TokenNameIdentifier	 S  KEY  ENTITIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
entitiesFileName	TokenNameIdentifier	 entities File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_charInfo	TokenNameIdentifier	 m char Info
=	TokenNameEQUAL	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
getCharInfo	TokenNameIdentifier	 get Char Info
(	TokenNameLPAREN	
entitiesFileName	TokenNameIdentifier	 entities File Name
,	TokenNameCOMMA	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_shouldFlush	TokenNameIdentifier	 m should Flush
=	TokenNameEQUAL	
shouldFlush	TokenNameIdentifier	 should Flush
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the output format for this serializer. * * @return The output format in use */	TokenNameCOMMENT_JAVADOC	 Returns the output format for this serializer. * @return The output format in use 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getOutputPropDefaultKeys	TokenNameIdentifier	 get Output Prop Default Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
getOutputPropertyDefault	TokenNameIdentifier	 get Output Property Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getOutputPropKeys	TokenNameIdentifier	 get Output Prop Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
getOutputPropertyNonDefault	TokenNameIdentifier	 get Output Property Non Default
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies a writer to which the document should be serialized. * This method should not be called while the serializer is in * the process of serializing a document. * * @param writer The output writer stream */	TokenNameCOMMENT_JAVADOC	 Specifies a writer to which the document should be serialized. This method should not be called while the serializer is in the process of serializing a document. * @param writer The output writer stream 
public	TokenNamepublic	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_writer_set_by_user	TokenNameIdentifier	 m writer set by user
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setByUser	TokenNameIdentifier	 set By User
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer_set_by_user	TokenNameIdentifier	 m writer set by user
=	TokenNameEQUAL	
setByUser	TokenNameIdentifier	 set By User
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
// if we are tracing events we need to trace what 	TokenNameCOMMENT_LINE	if we are tracing events we need to trace what 
// characters are written to the output writer. 	TokenNameCOMMENT_LINE	characters are written to the output writer. 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
noTracerYet	TokenNameIdentifier	 no Tracer Yet
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
Writer	TokenNameIdentifier	 Writer
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
w2	TokenNameIdentifier	 w2
instanceof	TokenNameinstanceof	
WriterChain	TokenNameIdentifier	 Writer Chain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
w2	TokenNameIdentifier	 w2
instanceof	TokenNameinstanceof	
SerializerTraceWriter	TokenNameIdentifier	 Serializer Trace Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
noTracerYet	TokenNameIdentifier	 no Tracer Yet
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WriterChain	TokenNameIdentifier	 Writer Chain
)	TokenNameRPAREN	
w2	TokenNameIdentifier	 w2
)	TokenNameRPAREN	
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
noTracerYet	TokenNameIdentifier	 no Tracer Yet
)	TokenNameRPAREN	
m_writer	TokenNameIdentifier	 m writer
=	TokenNameEQUAL	
new	TokenNamenew	
SerializerTraceWriter	TokenNameIdentifier	 Serializer Trace Writer
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
m_tracer	TokenNameIdentifier	 m tracer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set if the operating systems end-of-line line separator should * be used when serializing. If set false NL character * (decimal 10) is left alone, otherwise the new-line will be replaced on * output with the systems line separator. For example on UNIX this is * NL, while on Windows it is two characters, CR NL, where CR is the * carriage-return (decimal 13). * * @param use_sytem_line_break True if an input NL is replaced with the * operating systems end-of-line separator. * @return The previously set value of the serializer. */	TokenNameCOMMENT_JAVADOC	 Set if the operating systems end-of-line line separator should be used when serializing. If set false NL character (decimal 10) is left alone, otherwise the new-line will be replaced on output with the systems line separator. For example on UNIX this is NL, while on Windows it is two characters, CR NL, where CR is the carriage-return (decimal 13). * @param use_sytem_line_break True if an input NL is replaced with the operating systems end-of-line separator. @return The previously set value of the serializer. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setLineSepUse	TokenNameIdentifier	 set Line Sep Use
(	TokenNameLPAREN	
boolean	TokenNameboolean	
use_sytem_line_break	TokenNameIdentifier	 use sytem line break
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
;	TokenNameSEMICOLON	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
=	TokenNameEQUAL	
use_sytem_line_break	TokenNameIdentifier	 use sytem line break
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specifies an output stream to which the document should be * serialized. This method should not be called while the * serializer is in the process of serializing a document. * <p> * The encoding specified in the output properties is used, or * if no encoding was specified, the default for the selected * output method. * * @param output The output stream */	TokenNameCOMMENT_JAVADOC	 Specifies an output stream to which the document should be serialized. This method should not be called while the serializer is in the process of serializing a document. <p> The encoding specified in the output properties is used, or if no encoding was specified, the default for the selected output method. * @param output The output stream 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOutputStreamInternal	TokenNameIdentifier	 set Output Stream Internal
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setOutputStreamInternal	TokenNameIdentifier	 set Output Stream Internal
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setByUser	TokenNameIdentifier	 set By User
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_outputStream	TokenNameIdentifier	 m output Stream
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We wrap the OutputStream with a writer, but 	TokenNameCOMMENT_LINE	We wrap the OutputStream with a writer, but 
// not one set by the user 	TokenNameCOMMENT_LINE	not one set by the user 
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
new	TokenNamenew	
WriterToUTF8Buffered	TokenNameIdentifier	 Writer To UT F8 Buffered
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"WINDOWS-1250"	TokenNameStringLiteral	WINDOWS-1250
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"ASCII"	TokenNameStringLiteral	ASCII
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
new	TokenNamenew	
WriterToASCI	TokenNameIdentifier	 Writer To ASCI
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Writer	TokenNameIdentifier	 Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
uee	TokenNameIdentifier	 uee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: encoding ""	TokenNameStringLiteral	Warning: encoding "
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
+	TokenNamePLUS	
"" not supported"	TokenNameStringLiteral	" not supported
+	TokenNamePLUS	
", using "	TokenNameStringLiteral	, using 
+	TokenNamePLUS	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
DEFAULT_MIME_ENCODING	TokenNameIdentifier	 DEFAULT  MIME  ENCODING
;	TokenNameSEMICOLON	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We can't really get here, UTF-8 is always supported 	TokenNameCOMMENT_LINE	We can't really get here, UTF-8 is always supported 
// This try-catch exists to make the compiler happy 	TokenNameCOMMENT_LINE	This try-catch exists to make the compiler happy 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// don't have any encoding, but we have an OutputStream 	TokenNameCOMMENT_LINE	don't have any encoding, but we have an OutputStream 
Writer	TokenNameIdentifier	 Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setEscaping(boolean) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setEscaping(boolean) 
public	TokenNamepublic	
boolean	TokenNameboolean	
setEscaping	TokenNameIdentifier	 set Escaping
(	TokenNameLPAREN	
boolean	TokenNameboolean	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
m_escaping	TokenNameIdentifier	 m escaping
;	TokenNameSEMICOLON	
m_escaping	TokenNameIdentifier	 m escaping
=	TokenNameEQUAL	
escape	TokenNameIdentifier	 escape
;	TokenNameSEMICOLON	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Might print a newline character and the indentation amount * of the given depth. * * @param depth the indentation depth (element nesting depth) * * @throws org.xml.sax.SAXException if an error occurs during writing. */	TokenNameCOMMENT_JAVADOC	 Might print a newline character and the indentation amount of the given depth. * @param depth the indentation depth (element nesting depth) * @throws org.xml.sax.SAXException if an error occurs during writing. 
protected	TokenNameprotected	
void	TokenNamevoid	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_startNewLine	TokenNameIdentifier	 m start New Line
)	TokenNameRPAREN	
outputLineSep	TokenNameIdentifier	 output Line Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* For m_indentAmount > 0 this extra test might be slower * but Xalan's default value is 0, so this extra test * will run faster in that situation. */	TokenNameCOMMENT_BLOCK	 For m_indentAmount > 0 this extra test might be slower but Xalan's default value is 0, so this extra test will run faster in that situation. 
if	TokenNameif	
(	TokenNameLPAREN	
m_indentAmount	TokenNameIdentifier	 m indent Amount
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
*	TokenNameMULTIPLY	
m_indentAmount	TokenNameIdentifier	 m indent Amount
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indent at the current element nesting depth. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Indent at the current element nesting depth. @throws IOException 
protected	TokenNameprotected	
void	TokenNamevoid	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints <var>n</var> spaces. * @param n Number of spaces to print. * * @throws org.xml.sax.SAXException if an error occurs when writing. */	TokenNameCOMMENT_JAVADOC	 Prints <var>n</var> spaces. @param n Number of spaces to print. * @throws org.xml.sax.SAXException if an error occurs when writing. 
private	TokenNameprivate	
void	TokenNamevoid	
printSpace	TokenNameIdentifier	 print Space
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report an attribute type declaration. * * <p>Only the effective (first) declaration for an attribute will * be reported. The type will be one of the strings "CDATA", * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", * "ENTITIES", or "NOTATION", or a parenthesized token group with * the separator "|" and all whitespace removed.</p> * * @param eName The name of the associated element. * @param aName The name of the attribute. * @param type A string representing the attribute type. * @param valueDefault A string representing the attribute default * ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if * none of these applies. * @param value A string representing the attribute's default value, * or null if there is none. * @exception SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an attribute type declaration. * <p>Only the effective (first) declaration for an attribute will be reported. The type will be one of the strings "CDATA", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", or "NOTATION", or a parenthesized token group with the separator "|" and all whitespace removed.</p> * @param eName The name of the associated element. @param aName The name of the attribute. @param type A string representing the attribute type. @param valueDefault A string representing the attribute default ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if none of these applies. @param value A string representing the attribute's default value, or null if there is none. @exception SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Do not inline external DTD 	TokenNameCOMMENT_LINE	Do not inline external DTD 
if	TokenNameif	
(	TokenNameLPAREN	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ATTLIST "	TokenNameStringLiteral	<!ATTLIST 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
eName	TokenNameIdentifier	 e Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
aName	TokenNameIdentifier	 a Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueDefault	TokenNameIdentifier	 value Default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
valueDefault	TokenNameIdentifier	 value Default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//writer.write(" "); 	TokenNameCOMMENT_LINE	writer.write(" "); 
//writer.write(value); 	TokenNameCOMMENT_LINE	writer.write(value); 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the character stream where the events will be serialized to. * * @return Reference to the result Writer, or null. */	TokenNameCOMMENT_JAVADOC	 Get the character stream where the events will be serialized to. * @return Reference to the result Writer, or null. 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report a parsed external entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param publicId The declared public identifier of the entity, or * null if none was declared. * @param systemId The declared system identifier of the entity. * @exception SAXException The application may raise an exception. * @see #internalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report a parsed external entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param publicId The declared public identifier of the entity, or null if none was declared. @param systemId The declared system identifier of the entity. @exception SAXException The application may raise an exception. @see #internalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ENTITY "	TokenNameStringLiteral	<!ENTITY 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" PUBLIC ""	TokenNameStringLiteral	 PUBLIC "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" SYSTEM ""	TokenNameStringLiteral	 SYSTEM "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"" >"	TokenNameStringLiteral	" >
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO Auto-generated catch block 	TokenNameCOMMENT_LINE	TODO Auto-generated catch block 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if this character can be written without escaping. */	TokenNameCOMMENT_JAVADOC	 Tell if this character can be written without escaping. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is the old/fast code here, but is this 	TokenNameCOMMENT_LINE	This is the old/fast code here, but is this 
// correct for all encodings? 	TokenNameCOMMENT_LINE	correct for all encodings? 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_SPACE	TokenNameIdentifier	 S  SPACE
||	TokenNameOR_OR	
(	TokenNameLPAREN	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
||	TokenNameOR_OR	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_CARRIAGERETURN	TokenNameIdentifier	 S  CARRIAGERETURN
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
||	TokenNameOR_OR	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_HORIZONAL_TAB	TokenNameIdentifier	 S  HORIZONAL  TAB
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_encodingInfo	TokenNameIdentifier	 m encoding Info
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Once a surrogate has been detected, write out the pair of * characters if it is in the encoding, or if there is no * encoding, otherwise write out an entity reference * of the value of the unicode code point of the character * represented by the high/low surrogate pair. * <p> * An exception is thrown if there is no low surrogate in the pair, * because the array ends unexpectely, or if the low char is there * but its value is such that it is not a low surrogate. * * @param c the first (high) part of the surrogate, which * must be confirmed before calling this method. * @param ch Character array. * @param i position Where the surrogate was detected. * @param end The end index of the significant characters. * @return 0 if the pair of characters was written out as-is, * the unicode code point of the character represented by * the surrogate pair if an entity reference with that value * was written out. * * @throws IOException * @throws org.xml.sax.SAXException if invalid UTF-16 surrogate detected. */	TokenNameCOMMENT_JAVADOC	 Once a surrogate has been detected, write out the pair of characters if it is in the encoding, or if there is no encoding, otherwise write out an entity reference of the value of the unicode code point of the character represented by the high/low surrogate pair. <p> An exception is thrown if there is no low surrogate in the pair, because the array ends unexpectely, or if the low char is there but its value is such that it is not a low surrogate. * @param c the first (high) part of the surrogate, which must be confirmed before calling this method. @param ch Character array. @param i position Where the surrogate was detected. @param end The end index of the significant characters. @return 0 if the pair of characters was written out as-is, the unicode code point of the character represented by the surrogate pair if an entity reference with that value was written out. * @throws IOException @throws org.xml.sax.SAXException if invalid UTF-16 surrogate detected. 
protected	TokenNameprotected	
int	TokenNameint	
writeUTF16Surrogate	TokenNameIdentifier	 write UT F16 Surrogate
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isLowUTF16Surrogate	TokenNameIdentifier	 is Low UT F16 Surrogate
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
// If we make it to here we have a valid high, low surrogate pair 	TokenNameCOMMENT_LINE	If we make it to here we have a valid high, low surrogate pair 
if	TokenNameif	
(	TokenNameLPAREN	
m_encodingInfo	TokenNameIdentifier	 m encoding Info
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the character formed by the surrogate pair 	TokenNameCOMMENT_LINE	If the character formed by the surrogate pair 
// is in the encoding, so just write it out 	TokenNameCOMMENT_LINE	is in the encoding, so just write it out 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Don't know what to do with this char, it is 	TokenNameCOMMENT_LINE	Don't know what to do with this char, it is 
// not in the encoding and not a high char in 	TokenNameCOMMENT_LINE	not in the encoding and not a high char in 
// a surrogate pair, so write out as an entity ref 	TokenNameCOMMENT_LINE	a surrogate pair, so write out as an entity ref 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* The output encoding is known, * so somthing is wrong. */	TokenNameCOMMENT_BLOCK	 The output encoding is known, so somthing is wrong. 
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not in the encoding, so write out a character reference 	TokenNameCOMMENT_LINE	not in the encoding, so write out a character reference 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* The output encoding is not known, * so just write it out as-is. */	TokenNameCOMMENT_BLOCK	 The output encoding is not known, so just write it out as-is. 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// non-zero only if character reference was written out. 	TokenNameCOMMENT_LINE	non-zero only if character reference was written out. 
return	TokenNamereturn	
codePoint	TokenNameIdentifier	 code Point
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handle one of the default entities, return false if it * is not a default entity. * * @param ch character to be escaped. * @param i index into character array. * @param chars non-null reference to character array. * @param len length of chars. * @param fromTextNode true if the characters being processed * are from a text node, false if they are from an attribute value * @param escLF true if the linefeed should be escaped. * * @return i+1 if the character was written, else i. * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Handle one of the default entities, return false if it is not a default entity. * @param ch character to be escaped. @param i index into character array. @param chars non-null reference to character array. @param len length of chars. @param fromTextNode true if the characters being processed are from a text node, false if they are from an attribute value @param escLF true if the linefeed should be escaped. * @return i+1 if the character was written, else i. * @throws java.io.IOException 
int	TokenNameint	
accumDefaultEntity	TokenNameIdentifier	 accum Default Entity
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fromTextNode	TokenNameIdentifier	 from Text Node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
escLF	TokenNameIdentifier	 esc LF
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
escLF	TokenNameIdentifier	 esc LF
&&	TokenNameAND_AND	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if this is text node character and a special one of those, 	TokenNameCOMMENT_LINE	if this is text node character and a special one of those, 
// or if this is a character from attribute value and a special one of those 	TokenNameCOMMENT_LINE	or if this is a character from attribute value and a special one of those 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fromTextNode	TokenNameIdentifier	 from Text Node
&&	TokenNameAND_AND	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapTextChar	TokenNameIdentifier	 should Map Text Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
fromTextNode	TokenNameIdentifier	 from Text Node
&&	TokenNameAND_AND	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapAttrChar	TokenNameIdentifier	 should Map Attr Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
outputStringForChar	TokenNameIdentifier	 output String For Char
=	TokenNameEQUAL	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
getOutputStringForChar	TokenNameIdentifier	 get Output String For Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
outputStringForChar	TokenNameIdentifier	 output String For Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputStringForChar	TokenNameIdentifier	 output String For Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Normalize the characters, but don't escape. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @param isCData true if a CDATA block should be built around the characters. * @param useSystemLineSeparator true if the operating systems * end-of-line separator should be output rather than a new-line character. * * @throws IOException * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Normalize the characters, but don't escape. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @param isCData true if a CDATA block should be built around the characters. @param useSystemLineSeparator true if the operating systems end-of-line separator should be output rather than a new-line character. * @throws IOException @throws org.xml.sax.SAXException 
void	TokenNamevoid	
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isCData	TokenNameIdentifier	 is C Data
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useSystemLineSeparator	TokenNameIdentifier	 use System Line Separator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
useSystemLineSeparator	TokenNameIdentifier	 use System Line Separator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isCData	TokenNameIdentifier	 is C Data
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (i != 0) 	TokenNameCOMMENT_LINE	if (i != 0) 
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This needs to go into a function... 	TokenNameCOMMENT_LINE	This needs to go into a function... 
if	TokenNameif	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isHighUTF16Surrogate	TokenNameIdentifier	 is High UT F16 Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeUTF16Surrogate	TokenNameIdentifier	 write UT F16 Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// process two input characters 	TokenNameCOMMENT_LINE	process two input characters 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
intStr	TokenNameIdentifier	 int Str
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
intStr	TokenNameIdentifier	 int Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if ((i != 0) && (i < (end - 1))) 	TokenNameCOMMENT_LINE	if ((i != 0) && (i < (end - 1))) 
// if (!m_cdataTagOpen && (i < (end - 1))) 	TokenNameCOMMENT_LINE	if (!m_cdataTagOpen && (i < (end - 1))) 
// { 	TokenNameCOMMENT_LINE	{ 
// writer.write(CDATA_DELIMITER_OPEN); 	TokenNameCOMMENT_LINE	writer.write(CDATA_DELIMITER_OPEN); 
// m_cdataTagOpen = true; 	TokenNameCOMMENT_LINE	m_cdataTagOpen = true; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isCData	TokenNameIdentifier	 is C Data
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
CDATA_CONTINUE	TokenNameIdentifier	 CDATA  CONTINUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isCData	TokenNameIdentifier	 is C Data
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
CDATA_DELIMITER_OPEN	TokenNameIdentifier	 CDATA  DELIMITER  OPEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This needs to go into a function... 	TokenNameCOMMENT_LINE	This needs to go into a function... 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isHighUTF16Surrogate	TokenNameIdentifier	 is High UT F16 Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeUTF16Surrogate	TokenNameIdentifier	 write UT F16 Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// process two input characters 	TokenNameCOMMENT_LINE	process two input characters 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
intStr	TokenNameIdentifier	 int Str
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
intStr	TokenNameIdentifier	 int Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Ends an un-escaping section. * * @see #startNonEscaping * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Ends an un-escaping section. * @see #startNonEscaping * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endNonEscaping	TokenNameIdentifier	 end Non Escaping
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
m_disableOutputEscapingStates	TokenNameIdentifier	 m disable Output Escaping States
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Starts an un-escaping section. All characters printed within an un- * escaping section are printed as is, without escaping special characters * into entity references. Only XML and HTML serializers need to support * this method. * <p> The contents of the un-escaping section will be delivered through the * regular <tt>characters</tt> event. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Starts an un-escaping section. All characters printed within an un- escaping section are printed as is, without escaping special characters into entity references. Only XML and HTML serializers need to support this method. <p> The contents of the un-escaping section will be delivered through the regular <tt>characters</tt> event. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startNonEscaping	TokenNameIdentifier	 start Non Escaping
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
m_disableOutputEscapingStates	TokenNameIdentifier	 m disable Output Escaping States
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of cdata. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of cdata. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
final	TokenNamefinal	
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
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
old_start	TokenNameIdentifier	 old start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
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
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
writeCDataBrackets	TokenNameIdentifier	 write C Data Brackets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Write out the CDATA opening delimiter only if * we are supposed to, and if we are not already in * the middle of a CDATA section */	TokenNameCOMMENT_BLOCK	 Write out the CDATA opening delimiter only if we are supposed to, and if we are not already in the middle of a CDATA section 
if	TokenNameif	
(	TokenNameLPAREN	
writeCDataBrackets	TokenNameIdentifier	 write C Data Brackets
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
CDATA_DELIMITER_OPEN	TokenNameIdentifier	 CDATA  DELIMITER  OPEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// writer.write(ch, start, length); 	TokenNameCOMMENT_LINE	writer.write(ch, start, length); 
if	TokenNameif	
(	TokenNameLPAREN	
isEscapingDisabled	TokenNameIdentifier	 is Escaping Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charactersRaw	TokenNameIdentifier	 characters Raw
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* used to always write out CDATA closing delimiter here, * but now we delay, so that we can merge CDATA sections on output. * need to write closing delimiter later */	TokenNameCOMMENT_BLOCK	 used to always write out CDATA closing delimiter here, but now we delay, so that we can merge CDATA sections on output. need to write closing delimiter later 
if	TokenNameif	
(	TokenNameLPAREN	
writeCDataBrackets	TokenNameIdentifier	 write C Data Brackets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* if the CDATA section ends with ] don't leave it open * as there is a chance that an adjacent CDATA sections * starts with ]>. * We don't want to merge ]] with > , or ] with ]> */	TokenNameCOMMENT_BLOCK	 if the CDATA section ends with ] don't leave it open as there is a chance that an adjacent CDATA sections starts with ]>. We don't want to merge ]] with > , or ] with ]> 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// time to fire off CDATA event 	TokenNameCOMMENT_LINE	time to fire off CDATA event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireCDATAEvent	TokenNameIdentifier	 fire CDATA Event
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
old_start	TokenNameIdentifier	 old start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
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
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_OIERROR	TokenNameIdentifier	 ER  OIERROR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"IO error", ioe); 	TokenNameCOMMENT_LINE	"IO error", ioe); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if the character escaping should be disabled for the current state. * * @return true if the character escaping should be disabled. */	TokenNameCOMMENT_JAVADOC	 Tell if the character escaping should be disabled for the current state. * @return true if the character escaping should be disabled. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isEscapingDisabled	TokenNameIdentifier	 is Escaping Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_disableOutputEscapingStates	TokenNameIdentifier	 m disable Output Escaping States
.	TokenNameDOT	
peekOrFalse	TokenNameIdentifier	 peek Or False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If available, when the disable-output-escaping attribute is used, * output raw text without escaping. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 If available, when the disable-output-escaping attribute is used, output raw text without escaping. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
charactersRaw	TokenNameIdentifier	 characters Raw
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
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
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of character data. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param chars The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param chars The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
final	TokenNamefinal	
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
// It does not make sense to continue with rest of the method if the number of 	TokenNameCOMMENT_LINE	It does not make sense to continue with rest of the method if the number of 
// characters to read from array is 0. 	TokenNameCOMMENT_LINE	characters to read from array is 0. 
// Section 7.6.1 of XSLT 1.0 (http://www.w3.org/TR/xslt#value-of) suggest no text node 	TokenNameCOMMENT_LINE	Section 7.6.1 of XSLT 1.0 (http://www.w3.org/TR/xslt#value-of) suggest no text node 
// is created if string is empty. 	TokenNameCOMMENT_LINE	is created if string is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_expandDTDEntities	TokenNameIdentifier	 m expand DTD Entities
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
m_docIsEmpty	TokenNameIdentifier	 m doc Is Empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataStartCalled	TokenNameIdentifier	 m cdata Start Called
||	TokenNameOR_OR	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* either due to startCDATA() being called or due to * cdata-section-elements atribute, we need this as cdata */	TokenNameCOMMENT_BLOCK	 either due to startCDATA() being called or due to cdata-section-elements atribute, we need this as cdata 
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_disableOutputEscapingStates	TokenNameIdentifier	 m disable Output Escaping States
.	TokenNameDOT	
peekOrFalse	TokenNameIdentifier	 peek Or False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_escaping	TokenNameIdentifier	 m escaping
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charactersRaw	TokenNameIdentifier	 characters Raw
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to fire off characters generation event 	TokenNameCOMMENT_LINE	time to fire off characters generation event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireCharEvent	TokenNameIdentifier	 fire Char Event
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
startClean	TokenNameIdentifier	 start Clean
;	TokenNameSEMICOLON	
// skip any leading whitspace 	TokenNameCOMMENT_LINE	skip any leading whitspace 
// don't go off the end and use a hand inlined version 	TokenNameCOMMENT_LINE	don't go off the end and use a hand inlined version 
// of isWhitespace(ch) 	TokenNameCOMMENT_LINE	of isWhitespace(ch) 
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// last non-clean character that was processed 	TokenNameCOMMENT_LINE	last non-clean character that was processed 
// that was processed 	TokenNameCOMMENT_LINE	that was processed 
final	TokenNamefinal	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isAllWhitespace	TokenNameIdentifier	 is All Whitespace
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// process any leading whitspace 	TokenNameCOMMENT_LINE	process any leading whitspace 
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
&&	TokenNameAND_AND	
isAllWhitespace	TokenNameIdentifier	 is All Whitespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapTextChar	TokenNameIdentifier	 should Map Text Char
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The character is supposed to be replaced by a String 	TokenNameCOMMENT_LINE	The character is supposed to be replaced by a String 
// so write out the clean whitespace characters accumulated 	TokenNameCOMMENT_LINE	so write out the clean whitespace characters accumulated 
// so far 	TokenNameCOMMENT_LINE	so far 
// then the String. 	TokenNameCOMMENT_LINE	then the String. 
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
outputStringForChar	TokenNameIdentifier	 output String For Char
=	TokenNameEQUAL	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
getOutputStringForChar	TokenNameIdentifier	 get Output String For Char
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputStringForChar	TokenNameIdentifier	 output String For Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We can't say that everything we are writing out is 	TokenNameCOMMENT_LINE	We can't say that everything we are writing out is 
// all whitespace, we just wrote out a String. 	TokenNameCOMMENT_LINE	all whitespace, we just wrote out a String. 
isAllWhitespace	TokenNameIdentifier	 is All Whitespace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// mark the last non-clean 	TokenNameCOMMENT_LINE	mark the last non-clean 
// character processed 	TokenNameCOMMENT_LINE	character processed 
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The character is clean, but is it a whitespace ? 	TokenNameCOMMENT_LINE	The character is clean, but is it a whitespace ? 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Any other whitespace to consider? 	TokenNameCOMMENT_LINE	TODO: Any other whitespace to consider? 
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_SPACE	TokenNameIdentifier	 S  SPACE
:	TokenNameCOLON	
// Just accumulate the clean whitespace 	TokenNameCOMMENT_LINE	Just accumulate the clean whitespace 
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
:	TokenNameCOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
processLineFeed	TokenNameIdentifier	 process Line Feed
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_CARRIAGERETURN	TokenNameIdentifier	 S  CARRIAGERETURN
:	TokenNameCOLON	
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#13;"	TokenNameStringLiteral	&#13;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_HORIZONAL_TAB	TokenNameIdentifier	 S  HORIZONAL  TAB
:	TokenNameCOLON	
// Just accumulate the clean whitespace 	TokenNameCOMMENT_LINE	Just accumulate the clean whitespace 
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// The character was clean, but not a whitespace 	TokenNameCOMMENT_LINE	The character was clean, but not a whitespace 
// so break the loop to continue with this character 	TokenNameCOMMENT_LINE	so break the loop to continue with this character 
// (we don't increment index i !!) 	TokenNameCOMMENT_LINE	(we don't increment index i !!) 
isAllWhitespace	TokenNameIdentifier	 is All Whitespace
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* If there is some non-whitespace, mark that we may need * to preserve this. This is only important if we have indentation on. */	TokenNameCOMMENT_BLOCK	 If there is some non-whitespace, mark that we may need to preserve this. This is only important if we have indentation on. 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
||	TokenNameOR_OR	
!	TokenNameNOT	
isAllWhitespace	TokenNameIdentifier	 is All Whitespace
)	TokenNameRPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapTextChar	TokenNameIdentifier	 should Map Text Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The character is supposed to be replaced by a String 	TokenNameCOMMENT_LINE	The character is supposed to be replaced by a String 
// e.g. '&' --> "&amp;" 	TokenNameCOMMENT_LINE	e.g. '&' --> "&amp;" 
// e.g. '<' --> "&lt;" 	TokenNameCOMMENT_LINE	e.g. '<' --> "&lt;" 
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
outputStringForChar	TokenNameIdentifier	 output String For Char
=	TokenNameEQUAL	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
getOutputStringForChar	TokenNameIdentifier	 get Output String For Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputStringForChar	TokenNameIdentifier	 output String For Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Range 0x00 through 0x1F inclusive 	TokenNameCOMMENT_LINE	Range 0x00 through 0x1F inclusive 
// 	TokenNameCOMMENT_LINE	 
// This covers the non-whitespace control characters 	TokenNameCOMMENT_LINE	This covers the non-whitespace control characters 
// in the range 0x1 to 0x1F inclusive. 	TokenNameCOMMENT_LINE	in the range 0x1 to 0x1F inclusive. 
// It also covers the whitespace control characters in the same way: 	TokenNameCOMMENT_LINE	It also covers the whitespace control characters in the same way: 
// 0x9 TAB 	TokenNameCOMMENT_LINE	0x9 TAB 
// 0xA NEW LINE 	TokenNameCOMMENT_LINE	0xA NEW LINE 
// 0xD CARRIAGE RETURN 	TokenNameCOMMENT_LINE	0xD CARRIAGE RETURN 
// 	TokenNameCOMMENT_LINE	 
// We also cover 0x0 ... It isn't valid 	TokenNameCOMMENT_LINE	We also cover 0x0 ... It isn't valid 
// but we will output "&#0;" 	TokenNameCOMMENT_LINE	but we will output "&#0;" 
// The default will handle this just fine, but this 	TokenNameCOMMENT_LINE	The default will handle this just fine, but this 
// is a little performance boost to handle the more 	TokenNameCOMMENT_LINE	is a little performance boost to handle the more 
// common TAB, NEW-LINE, CARRIAGE-RETURN 	TokenNameCOMMENT_LINE	common TAB, NEW-LINE, CARRIAGE-RETURN 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_HORIZONAL_TAB	TokenNameIdentifier	 S  HORIZONAL  TAB
:	TokenNameCOLON	
// Leave whitespace TAB as a real character 	TokenNameCOMMENT_LINE	Leave whitespace TAB as a real character 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
:	TokenNameCOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
processLineFeed	TokenNameIdentifier	 process Line Feed
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
,	TokenNameCOMMA	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_CARRIAGERETURN	TokenNameIdentifier	 S  CARRIAGERETURN
:	TokenNameCOLON	
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#13;"	TokenNameStringLiteral	&#13;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// Leave whitespace carriage return as a real character 	TokenNameCOMMENT_LINE	Leave whitespace carriage return as a real character 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Range 0x20 through 0x7E inclusive 	TokenNameCOMMENT_LINE	Range 0x20 through 0x7E inclusive 
// Normal ASCII chars, do nothing, just add it to 	TokenNameCOMMENT_LINE	Normal ASCII chars, do nothing, just add it to 
// the clean characters 	TokenNameCOMMENT_LINE	the clean characters 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x9F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Range 0x7F through 0x9F inclusive 	TokenNameCOMMENT_LINE	Range 0x7F through 0x9F inclusive 
// More control characters, including NEL (0x85) 	TokenNameCOMMENT_LINE	More control characters, including NEL (0x85) 
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINE_SEPARATOR	TokenNameIdentifier	 S  LINE  SEPARATOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LINE SEPARATOR 	TokenNameCOMMENT_LINE	LINE SEPARATOR 
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#8232;"	TokenNameStringLiteral	&#8232;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_encodingInfo	TokenNameIdentifier	 m encoding Info
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the character is in the encoding, and 	TokenNameCOMMENT_LINE	If the character is in the encoding, and 
// not in the normal ASCII range, we also 	TokenNameCOMMENT_LINE	not in the normal ASCII range, we also 
// just leave it get added on to the clean characters 	TokenNameCOMMENT_LINE	just leave it get added on to the clean characters 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is a fallback plan, we should never get here 	TokenNameCOMMENT_LINE	This is a fallback plan, we should never get here 
// but if the character wasn't previously handled 	TokenNameCOMMENT_LINE	but if the character wasn't previously handled 
// (i.e. isn't in the encoding, etc.) then what 	TokenNameCOMMENT_LINE	(i.e. isn't in the encoding, etc.) then what 
// should we do? We choose to write out an entity 	TokenNameCOMMENT_LINE	should we do? We choose to write out an entity 
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we've reached the end. Any clean characters at the 	TokenNameCOMMENT_LINE	we've reached the end. Any clean characters at the 
// end of the array than need to be written out? 	TokenNameCOMMENT_LINE	end of the array than need to be written out? 
startClean	TokenNameIdentifier	 start Clean
=	TokenNameEQUAL	
lastDirtyCharProcessed	TokenNameIdentifier	 last Dirty Char Processed
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
startClean	TokenNameIdentifier	 start Clean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lengthClean	TokenNameIdentifier	 length Clean
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
startClean	TokenNameIdentifier	 start Clean
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
startClean	TokenNameIdentifier	 start Clean
,	TokenNameCOMMA	
lengthClean	TokenNameIdentifier	 length Clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// For indentation purposes, mark that we've just writen text out 	TokenNameCOMMENT_LINE	For indentation purposes, mark that we've just writen text out 
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// time to fire off characters generation event 	TokenNameCOMMENT_LINE	time to fire off characters generation event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireCharEvent	TokenNameIdentifier	 fire Char Event
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
processLineFeed	TokenNameIdentifier	 process Line Feed
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
lastProcessed	TokenNameIdentifier	 last Processed
,	TokenNameCOMMA	
final	TokenNamefinal	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
||	TokenNameOR_OR	
(	TokenNameLPAREN	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_lineSep	TokenNameIdentifier	 m line Sep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are leaving the new-line alone, and it is just 	TokenNameCOMMENT_LINE	We are leaving the new-line alone, and it is just 
// being added to the 'clean' characters, 	TokenNameCOMMENT_LINE	being added to the 'clean' characters, 
// so the last dirty character processed remains unchanged 	TokenNameCOMMENT_LINE	so the last dirty character processed remains unchanged 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
lastProcessed	TokenNameIdentifier	 last Processed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastProcessed	TokenNameIdentifier	 last Processed
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastProcessed	TokenNameIdentifier	 last Processed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeOutCleanChars	TokenNameIdentifier	 write Out Clean Chars
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
lastProcessed	TokenNameIdentifier	 last Processed
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
startClean	TokenNameIdentifier	 start Clean
;	TokenNameSEMICOLON	
startClean	TokenNameIdentifier	 start Clean
=	TokenNameEQUAL	
lastProcessed	TokenNameIdentifier	 last Processed
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startClean	TokenNameIdentifier	 start Clean
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lengthClean	TokenNameIdentifier	 length Clean
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
startClean	TokenNameIdentifier	 start Clean
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
startClean	TokenNameIdentifier	 start Clean
,	TokenNameCOMMA	
lengthClean	TokenNameIdentifier	 length Clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method checks if a given character is between C0 or C1 range * of Control characters. * This method is added to support Control Characters for XML 1.1 * If a given character is TAB (0x09), LF (0x0A) or CR (0x0D), this method * return false. Since they are whitespace characters, no special processing is needed. * * @param ch * @return boolean */	TokenNameCOMMENT_JAVADOC	 This method checks if a given character is between C0 or C1 range of Control characters. This method is added to support Control Characters for XML 1.1 If a given character is TAB (0x09), LF (0x0A) or CR (0x0D), this method return false. Since they are whitespace characters, no special processing is needed. * @param ch @return boolean 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isCharacterInC0orC1Range	TokenNameIdentifier	 is Character In C0or C1 Range
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x7F	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x9F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x01	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method checks if a given character either NEL (0x85) or LSEP (0x2028) * These are new end of line charcters added in XML 1.1. These characters must be * written as Numeric Character References (NCR) in XML 1.1 output document. * * @param ch * @return boolean */	TokenNameCOMMENT_JAVADOC	 This method checks if a given character either NEL (0x85) or LSEP (0x2028) These are new end of line charcters added in XML 1.1. These characters must be written as Numeric Character References (NCR) in XML 1.1 output document. * @param ch @return boolean 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isNELorLSEPCharacter	TokenNameIdentifier	 is NE Lor LSEP Character
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a dirty character and any preeceding clean characters * that were not yet processed. * @param chars array of characters being processed * @param end one (1) beyond the last character * in chars to be processed * @param i the index of the dirty character * @param ch the character in chars[i] * @param lastDirty the last dirty character previous to i * @param fromTextNode true if the characters being processed are * from a text node, false if they are from an attribute value. * @return the index of the last character processed */	TokenNameCOMMENT_JAVADOC	 Process a dirty character and any preeceding clean characters that were not yet processed. @param chars array of characters being processed @param end one (1) beyond the last character in chars to be processed @param i the index of the dirty character @param ch the character in chars[i] @param lastDirty the last dirty character previous to i @param fromTextNode true if the characters being processed are from a text node, false if they are from an attribute value. @return the index of the last character processed 
private	TokenNameprivate	
int	TokenNameint	
processDirty	TokenNameIdentifier	 process Dirty
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
lastDirty	TokenNameIdentifier	 last Dirty
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fromTextNode	TokenNameIdentifier	 from Text Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
startClean	TokenNameIdentifier	 start Clean
=	TokenNameEQUAL	
lastDirty	TokenNameIdentifier	 last Dirty
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// if we have some clean characters accumulated 	TokenNameCOMMENT_LINE	if we have some clean characters accumulated 
// process them before the dirty one. 	TokenNameCOMMENT_LINE	process them before the dirty one. 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
startClean	TokenNameIdentifier	 start Clean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lengthClean	TokenNameIdentifier	 length Clean
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
startClean	TokenNameIdentifier	 start Clean
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
startClean	TokenNameIdentifier	 start Clean
,	TokenNameCOMMA	
lengthClean	TokenNameIdentifier	 length Clean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// process the "dirty" character 	TokenNameCOMMENT_LINE	process the "dirty" character 
if	TokenNameif	
(	TokenNameLPAREN	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
fromTextNode	TokenNameIdentifier	 from Text Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
startClean	TokenNameIdentifier	 start Clean
=	TokenNameEQUAL	
accumDefaultEscape	TokenNameIdentifier	 accum Default Escape
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
fromTextNode	TokenNameIdentifier	 from Text Node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startClean	TokenNameIdentifier	 start Clean
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return the index of the last character that we just processed 	TokenNameCOMMENT_LINE	Return the index of the last character that we just processed 
// which is a dirty character. 	TokenNameCOMMENT_LINE	which is a dirty character. 
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of character data. * * @param s The string of characters to process. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * @param s The string of characters to process. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
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
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_expandDTDEntities	TokenNameIdentifier	 m expand DTD Entities
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
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
s	TokenNameIdentifier	 s
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
/** * Escape and writer.write a character. * * @param ch character to be escaped. * @param i index into character array. * @param chars non-null reference to character array. * @param len length of chars. * @param fromTextNode true if the characters being processed are * from a text node, false if the characters being processed are from * an attribute value. * @param escLF true if the linefeed should be escaped. * * @return i+1 if a character was written, i+2 if two characters * were written out, else return i. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Escape and writer.write a character. * @param ch character to be escaped. @param i index into character array. @param chars non-null reference to character array. @param len length of chars. @param fromTextNode true if the characters being processed are from a text node, false if the characters being processed are from an attribute value. @param escLF true if the linefeed should be escaped. * @return i+1 if a character was written, i+2 if two characters were written out, else return i. * @throws org.xml.sax.SAXException 
private	TokenNameprivate	
int	TokenNameint	
accumDefaultEscape	TokenNameIdentifier	 accum Default Escape
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fromTextNode	TokenNameIdentifier	 from Text Node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
escLF	TokenNameIdentifier	 esc LF
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
accumDefaultEntity	TokenNameIdentifier	 accum Default Entity
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
fromTextNode	TokenNameIdentifier	 from Text Node
,	TokenNameCOMMA	
escLF	TokenNameIdentifier	 esc LF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isHighUTF16Surrogate	TokenNameIdentifier	 is High UT F16 Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should be the UTF-16 low surrogate of the hig/low pair. 	TokenNameCOMMENT_LINE	Should be the UTF-16 low surrogate of the hig/low pair. 
char	TokenNamechar	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// Unicode code point formed from the high/low pair. 	TokenNameCOMMENT_LINE	Unicode code point formed from the high/low pair. 
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Invalid UTF-16 surrogate detected: " 	TokenNameCOMMENT_LINE	"Invalid UTF-16 surrogate detected: " 
//+Integer.toHexString(ch)+ " ?"); 	TokenNameCOMMENT_LINE	+Integer.toHexString(ch)+ " ?"); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
isLowUTF16Surrogate	TokenNameIdentifier	 is Low UT F16 Surrogate
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Invalid UTF-16 surrogate detected: " 	TokenNameCOMMENT_LINE	"Invalid UTF-16 surrogate detected: " 
//+Integer.toHexString(ch)+" "+Integer.toHexString(next)); 	TokenNameCOMMENT_LINE	+Integer.toHexString(ch)+" "+Integer.toHexString(next)); 
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// count the two characters that went into writing out this entity 	TokenNameCOMMENT_LINE	count the two characters that went into writing out this entity 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* This if check is added to support control characters in XML 1.1. * If a character is a Control Character within C0 and C1 range, it is desirable * to write it out as Numeric Character Reference(NCR) regardless of XML Version * being used for output document. */	TokenNameCOMMENT_BLOCK	 This if check is added to support control characters in XML 1.1. If a character is a Control Character within C0 and C1 range, it is desirable to write it out as Numeric Character Reference(NCR) regardless of XML Version being used for output document. 
if	TokenNameif	
(	TokenNameLPAREN	
isCharacterInC0orC1Range	TokenNameIdentifier	 is Character In C0or C1 Range
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
isNELorLSEPCharacter	TokenNameIdentifier	 is NE Lor LSEP Character
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
escapingNotNeeded	TokenNameIdentifier	 escaping Not Needed
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fromTextNode	TokenNameIdentifier	 from Text Node
&&	TokenNameAND_AND	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapTextChar	TokenNameIdentifier	 should Map Text Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
fromTextNode	TokenNameIdentifier	 from Text Node
&&	TokenNameAND_AND	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapAttrChar	TokenNameIdentifier	 should Map Attr Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// count the single character that was processed 	TokenNameCOMMENT_LINE	count the single character that was processed 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element, although this is a * SAX method additional namespace or attribute information can occur before * or after this call, that is associated with this element. * * * @param namespaceURI The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param name The element type name. * @param atts The attributes attached to the element, if any. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement * @see org.xml.sax.ContentHandler#endElement * @see org.xml.sax.AttributeList * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element, although this is a SAX method additional namespace or attribute information can occur before or after this call, that is associated with this element. * @param namespaceURI The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param name The element type name. @param atts The attributes attached to the element, if any. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement @see org.xml.sax.ContentHandler#endElement @see org.xml.sax.AttributeList * @throws org.xml.sax.SAXException 
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
name	TokenNameIdentifier	 name
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
if	TokenNameif	
(	TokenNameLPAREN	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
m_docIsEmpty	TokenNameIdentifier	 m doc Is Empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* before we over-write the current elementLocalName etc. * lets close out the old one (if we still need to) */	TokenNameCOMMENT_BLOCK	 before we over-write the current elementLocalName etc. lets close out the old one (if we still need to) 
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
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ensurePrefixIsDeclared	TokenNameIdentifier	 ensure Prefix Is Declared
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_startNewLine	TokenNameIdentifier	 m start New Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// process the attributes now, because after this SAX call they might be gone 	TokenNameCOMMENT_LINE	process the attributes now, because after this SAX call they might be gone 
if	TokenNameif	
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addAttributes	TokenNameIdentifier	 add Attributes
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element, additional * namespace or attribute information can occur before or after this call, * that is associated with this element. * * * @param elementNamespaceURI The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param elementLocalName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param elementName The element type name. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement * @see org.xml.sax.ContentHandler#endElement * @see org.xml.sax.AttributeList * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element, additional namespace or attribute information can occur before or after this call, that is associated with this element. * @param elementNamespaceURI The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param elementLocalName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param elementName The element type name. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement @see org.xml.sax.ContentHandler#endElement @see org.xml.sax.AttributeList * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementNamespaceURI	TokenNameIdentifier	 element Namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementLocalName	TokenNameIdentifier	 element Local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
elementNamespaceURI	TokenNameIdentifier	 element Namespace URI
,	TokenNameCOMMA	
elementLocalName	TokenNameIdentifier	 element Local Name
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Output the doc type declaration. * * @param name non-null reference to document type name. * NEEDSDOC @param closeDecl * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Output the doc type declaration. * @param name non-null reference to document type name. NEEDSDOC @param closeDecl * @throws java.io.IOException 
void	TokenNamevoid	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
closeDecl	TokenNameIdentifier	 close Decl
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!DOCTYPE "	TokenNameStringLiteral	<!DOCTYPE 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doctypePublic	TokenNameIdentifier	 doctype Public
=	TokenNameEQUAL	
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" PUBLIC ""	TokenNameStringLiteral	 PUBLIC "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
doctypeSystem	TokenNameIdentifier	 doctype System
=	TokenNameEQUAL	
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
doctypePublic	TokenNameIdentifier	 doctype Public
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" SYSTEM ""	TokenNameStringLiteral	 SYSTEM "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ""	TokenNameStringLiteral	 "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
doctypeSystem	TokenNameIdentifier	 doctype System
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
closeDecl	TokenNameIdentifier	 close Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"">"	TokenNameStringLiteral	">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeDecl	TokenNameIdentifier	 close Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// done closing 	TokenNameCOMMENT_LINE	done closing 
}	TokenNameRBRACE	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process the attributes, which means to write out the currently * collected attributes to the writer. The attributes are not * cleared by this method * * @param writer the writer to write processed attributes to. * @param nAttrs the number of attributes in m_attributes * to be processed * * @throws java.io.IOException * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Process the attributes, which means to write out the currently collected attributes to the writer. The attributes are not cleared by this method * @param writer the writer to write processed attributes to. @param nAttrs the number of attributes in m_attributes to be processed * @throws java.io.IOException @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* real SAX attributes are not passed in, so process the * attributes that were collected after the startElement call. * _attribVector is a "cheap" list for Stream serializer output * accumulated over a series of calls to attribute(name,value) */	TokenNameCOMMENT_BLOCK	 real SAX attributes are not passed in, so process the attributes that were collected after the startElement call. _attribVector is a "cheap" list for Stream serializer output accumulated over a series of calls to attribute(name,value) 
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getEncoding	TokenNameIdentifier	 get Encoding
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
nAttrs	TokenNameIdentifier	 n Attrs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// elementAt is JDK 1.1.8 	TokenNameCOMMENT_LINE	elementAt is JDK 1.1.8 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writeAttrString	TokenNameIdentifier	 write Attr String
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the specified <var>string</var> after substituting <VAR>specials</VAR>, * and UTF-16 surrogates for chracter references <CODE>&amp;#xnn</CODE>. * * @param string String to convert to XML format. * @param encoding CURRENTLY NOT IMPLEMENTED. * * @throws java.io.IOException */	TokenNameCOMMENT_JAVADOC	 Returns the specified <var>string</var> after substituting <VAR>specials</VAR>, and UTF-16 surrogates for chracter references <CODE>&amp;#xnn</CODE>. * @param string String to convert to XML format. @param encoding CURRENTLY NOT IMPLEMENTED. * @throws java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
writeAttrString	TokenNameIdentifier	 write Attr String
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
m_attrBuff	TokenNameIdentifier	 m attr Buff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attrBuff	TokenNameIdentifier	 m attr Buff
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
string	TokenNameIdentifier	 string
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
m_attrBuff	TokenNameIdentifier	 m attr Buff
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stringChars	TokenNameIdentifier	 string Chars
=	TokenNameEQUAL	
m_attrBuff	TokenNameIdentifier	 m attr Buff
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
stringChars	TokenNameIdentifier	 string Chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_charInfo	TokenNameIdentifier	 m char Info
.	TokenNameDOT	
shouldMapAttrChar	TokenNameIdentifier	 should Map Attr Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The character is supposed to be replaced by a String 	TokenNameCOMMENT_LINE	The character is supposed to be replaced by a String 
// e.g. '&' --> "&amp;" 	TokenNameCOMMENT_LINE	e.g. '&' --> "&amp;" 
// e.g. '<' --> "&lt;" 	TokenNameCOMMENT_LINE	e.g. '<' --> "&lt;" 
accumDefaultEscape	TokenNameIdentifier	 accum Default Escape
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
stringChars	TokenNameIdentifier	 string Chars
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0x0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x1F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Range 0x00 through 0x1F inclusive 	TokenNameCOMMENT_LINE	Range 0x00 through 0x1F inclusive 
// This covers the non-whitespace control characters 	TokenNameCOMMENT_LINE	This covers the non-whitespace control characters 
// in the range 0x1 to 0x1F inclusive. 	TokenNameCOMMENT_LINE	in the range 0x1 to 0x1F inclusive. 
// It also covers the whitespace control characters in the same way: 	TokenNameCOMMENT_LINE	It also covers the whitespace control characters in the same way: 
// 0x9 TAB 	TokenNameCOMMENT_LINE	0x9 TAB 
// 0xA NEW LINE 	TokenNameCOMMENT_LINE	0xA NEW LINE 
// 0xD CARRIAGE RETURN 	TokenNameCOMMENT_LINE	0xD CARRIAGE RETURN 
// 	TokenNameCOMMENT_LINE	 
// We also cover 0x0 ... It isn't valid 	TokenNameCOMMENT_LINE	We also cover 0x0 ... It isn't valid 
// but we will output "&#0;" 	TokenNameCOMMENT_LINE	but we will output "&#0;" 
// The default will handle this just fine, but this 	TokenNameCOMMENT_LINE	The default will handle this just fine, but this 
// is a little performance boost to handle the more 	TokenNameCOMMENT_LINE	is a little performance boost to handle the more 
// common TAB, NEW-LINE, CARRIAGE-RETURN 	TokenNameCOMMENT_LINE	common TAB, NEW-LINE, CARRIAGE-RETURN 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_HORIZONAL_TAB	TokenNameIdentifier	 S  HORIZONAL  TAB
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#9;"	TokenNameStringLiteral	&#9;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#10;"	TokenNameStringLiteral	&#10;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_CARRIAGERETURN	TokenNameIdentifier	 S  CARRIAGERETURN
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#13;"	TokenNameStringLiteral	&#13;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x7F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Range 0x20 through 0x7E inclusive 	TokenNameCOMMENT_LINE	Range 0x20 through 0x7E inclusive 
// Normal ASCII chars 	TokenNameCOMMENT_LINE	Normal ASCII chars 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0x9F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Range 0x7F through 0x9F inclusive 	TokenNameCOMMENT_LINE	Range 0x7F through 0x9F inclusive 
// More control characters 	TokenNameCOMMENT_LINE	More control characters 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINE_SEPARATOR	TokenNameIdentifier	 S  LINE  SEPARATOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// LINE SEPARATOR 	TokenNameCOMMENT_LINE	LINE SEPARATOR 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#8232;"	TokenNameStringLiteral	&#8232;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_encodingInfo	TokenNameIdentifier	 m encoding Info
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the character is in the encoding, and 	TokenNameCOMMENT_LINE	If the character is in the encoding, and 
// not in the normal ASCII range, we also 	TokenNameCOMMENT_LINE	not in the normal ASCII range, we also 
// just write it out 	TokenNameCOMMENT_LINE	just write it out 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This is a fallback plan, we should never get here 	TokenNameCOMMENT_LINE	This is a fallback plan, we should never get here 
// but if the character wasn't previously handled 	TokenNameCOMMENT_LINE	but if the character wasn't previously handled 
// (i.e. isn't in the encoding, etc.) then what 	TokenNameCOMMENT_LINE	(i.e. isn't in the encoding, etc.) then what 
// should we do? We choose to write out a character ref 	TokenNameCOMMENT_LINE	should we do? We choose to write out a character ref 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * * @param namespaceURI The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param name The element type name * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param namespaceURI The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param name The element type name @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
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
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// namespaces declared at the current depth are no longer valid 	TokenNameCOMMENT_LINE	namespaces declared at the current depth are no longer valid 
// so get rid of them 	TokenNameCOMMENT_LINE	so get rid of them 
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
popNamespaces	TokenNameIdentifier	 pop Namespaces
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nAttrs	TokenNameIdentifier	 n Attrs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear attributes object for re-use with next element 	TokenNameCOMMENT_LINE	clear attributes object for re-use with next element 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_spaceBeforeClose	TokenNameIdentifier	 m space Before Close
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" />"	TokenNameStringLiteral	 />
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* don't need to pop cdataSectionState because * this element ended so quickly that we didn't get * to push the state. */	TokenNameCOMMENT_BLOCK	 don't need to pop cdataSectionState because this element ended so quickly that we didn't get to push the state. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
&&	TokenNameAND_AND	
m_doIndent	TokenNameIdentifier	 m do Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
false	TokenNamefalse	
:	TokenNameCOLON	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// fire off the end element event 	TokenNameCOMMENT_LINE	fire off the end element event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEndElem	TokenNameIdentifier	 fire End Elem
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_prev	TokenNameIdentifier	 m prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * @param name The element type name * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. @param name The element type name @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
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
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Begin the scope of a prefix-URI Namespace mapping * just before another element is about to start. * This call will close any open tags so that the prefix mapping * will not apply to the current element, but the up comming child. * * @see org.xml.sax.ContentHandler#startPrefixMapping * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI the prefix is mapped to. * * @throws org.xml.sax.SAXException The client may throw * an exception during processing. * */	TokenNameCOMMENT_JAVADOC	 Begin the scope of a prefix-URI Namespace mapping just before another element is about to start. This call will close any open tags so that the prefix mapping will not apply to the current element, but the up comming child. * @see org.xml.sax.ContentHandler#startPrefixMapping * @param prefix The Namespace prefix being declared. @param uri The Namespace URI the prefix is mapped to. * @throws org.xml.sax.SAXException The client may throw an exception during processing. 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
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
// the "true" causes the flush of any open tags 	TokenNameCOMMENT_LINE	the "true" causes the flush of any open tags 
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handle a prefix/uri mapping, which is associated with a startElement() * that is soon to follow. Need to close any open start tag to make * sure than any name space attributes due to this event are associated wih * the up comming element, not the current one. * @see ExtendedContentHandler#startPrefixMapping * * @param prefix The Namespace prefix being declared. * @param uri The Namespace URI the prefix is mapped to. * @param shouldFlush true if any open tags need to be closed first, this * will impact which element the mapping applies to (open parent, or its up * comming child) * @return returns true if the call made a change to the current * namespace information, false if it did not change anything, e.g. if the * prefix/namespace mapping was already in scope from before. * * @throws org.xml.sax.SAXException The client may throw * an exception during processing. * * */	TokenNameCOMMENT_JAVADOC	 Handle a prefix/uri mapping, which is associated with a startElement() that is soon to follow. Need to close any open start tag to make sure than any name space attributes due to this event are associated wih the up comming element, not the current one. @see ExtendedContentHandler#startPrefixMapping * @param prefix The Namespace prefix being declared. @param uri The Namespace URI the prefix is mapped to. @param shouldFlush true if any open tags need to be closed first, this will impact which element the mapping applies to (open parent, or its up comming child) @return returns true if the call made a change to the current namespace information, false if it did not change anything, e.g. if the prefix/namespace mapping was already in scope from before. * @throws org.xml.sax.SAXException The client may throw an exception during processing. * 
public	TokenNamepublic	
boolean	TokenNameboolean	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldFlush	TokenNameIdentifier	 should Flush
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
/* Remember the mapping, and at what depth it was declared * This is one greater than the current depth because these * mappings will apply to the next depth. This is in * consideration that startElement() will soon be called */	TokenNameCOMMENT_BLOCK	 Remember the mapping, and at what depth it was declared This is one greater than the current depth because these mappings will apply to the next depth. This is in consideration that startElement() will soon be called 
boolean	TokenNameboolean	
pushed	TokenNameIdentifier	 pushed
;	TokenNameSEMICOLON	
int	TokenNameint	
pushDepth	TokenNameIdentifier	 push Depth
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldFlush	TokenNameIdentifier	 should Flush
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the prefix mapping applies to the child element (one deeper) 	TokenNameCOMMENT_LINE	the prefix mapping applies to the child element (one deeper) 
pushDepth	TokenNameIdentifier	 push Depth
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the prefix mapping applies to the current element 	TokenNameCOMMENT_LINE	the prefix mapping applies to the current element 
pushDepth	TokenNameIdentifier	 push Depth
=	TokenNameEQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pushed	TokenNameIdentifier	 pushed
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
pushNamespace	TokenNameIdentifier	 push Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
pushDepth	TokenNameIdentifier	 push Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pushed	TokenNameIdentifier	 pushed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Brian M.: don't know if we really needto do this. The * callers of this object should have injected both * startPrefixMapping and the attributes. We are * just covering our butt here. */	TokenNameCOMMENT_BLOCK	 Brian M.: don't know if we really needto do this. The callers of this object should have injected both startPrefixMapping and the attributes. We are just covering our butt here. 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// hack for XSLTC attribset16 test 	TokenNameCOMMENT_LINE	hack for XSLTC attribset16 test 
{	TokenNameLBRACE	
// that maps ns1 prefix to "" URI 	TokenNameCOMMENT_LINE	that maps ns1 prefix to "" URI 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
/* for something like xmlns:abc="w3.pretend.org" * the uri is the value, that is why we pass it in the * value, or 5th slot of addAttributeAlways() */	TokenNameCOMMENT_BLOCK	 for something like xmlns:abc="w3.pretend.org" the uri is the value, that is why we pass it in the value, or 5th slot of addAttributeAlways() 
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pushed	TokenNameIdentifier	 pushed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of an XML comment anywhere in the document. This * callback will be used for comments inside or outside the document * element, including comments in the external DTD subset (if read). * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws org.xml.sax.SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of an XML comment anywhere in the document. This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read). @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws org.xml.sax.SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
int	TokenNameint	
start_old	TokenNameIdentifier	 start old
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
else	TokenNameelse	
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
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
wasDash	TokenNameIdentifier	 was Dash
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
COMMENT_BEGIN	TokenNameIdentifier	 COMMENT  BEGIN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Detect occurrences of two consecutive dashes, handle as necessary. 	TokenNameCOMMENT_LINE	Detect occurrences of two consecutive dashes, handle as necessary. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wasDash	TokenNameIdentifier	 was Dash
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" -"	TokenNameStringLiteral	 -
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wasDash	TokenNameIdentifier	 was Dash
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we have some chars in the comment 	TokenNameCOMMENT_LINE	if we have some chars in the comment 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Output the remaining characters (if any) 	TokenNameCOMMENT_LINE	Output the remaining characters (if any) 
final	TokenNamefinal	
int	TokenNameint	
remainingChars	TokenNameIdentifier	 remaining Chars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainingChars	TokenNameIdentifier	 remaining Chars
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
remainingChars	TokenNameIdentifier	 remaining Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Protect comment end from a single trailing dash 	TokenNameCOMMENT_LINE	Protect comment end from a single trailing dash 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
COMMENT_END	TokenNameIdentifier	 COMMENT  END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Don't write out any indentation whitespace now, * because there may be non-whitespace text after this. * * Simply mark that at this point if we do decide * to indent that we should * add a newline on the end of the current line before * the indentation at the start of the next line. */	TokenNameCOMMENT_BLOCK	 Don't write out any indentation whitespace now, because there may be non-whitespace text after this. * Simply mark that at this point if we do decide to indent that we should add a newline on the end of the current line before the indentation at the start of the next line. 
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// time to generate comment event 	TokenNameCOMMENT_LINE	time to generate comment event 
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
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start_old	TokenNameIdentifier	 start old
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of a CDATA section. * @throws org.xml.sax.SAXException The application may raise an exception. * * @see #startCDATA */	TokenNameCOMMENT_JAVADOC	 Report the end of a CDATA section. @throws org.xml.sax.SAXException The application may raise an exception. * @see #startCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
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
m_cdataTagOpen	TokenNameIdentifier	 m cdata Tag Open
)	TokenNameRPAREN	
closeCDATA	TokenNameIdentifier	 close CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cdataStartCalled	TokenNameIdentifier	 m cdata Start Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the end of DTD declarations. * @throws org.xml.sax.SAXException The application may raise an exception. * @see #startDTD */	TokenNameCOMMENT_JAVADOC	 Report the end of DTD declarations. @throws org.xml.sax.SAXException The application may raise an exception. @see #startDTD 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
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
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_inDoctype	TokenNameIdentifier	 m in Doctype
)	TokenNameRPAREN	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"]>"	TokenNameStringLiteral	]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * End the scope of a prefix-URI Namespace mapping. * @see org.xml.sax.ContentHandler#endPrefixMapping * * @param prefix The prefix that was being mapping. * @throws org.xml.sax.SAXException The client may throw * an exception during processing. */	TokenNameCOMMENT_JAVADOC	 End the scope of a prefix-URI Namespace mapping. @see org.xml.sax.ContentHandler#endPrefixMapping * @param prefix The prefix that was being mapping. @throws org.xml.sax.SAXException The client may throw an exception during processing. 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
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
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
/** * Receive notification of ignorable whitespace in element content. * * Not sure how to get this invoked quite yet. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #characters * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * Not sure how to get this invoked quite yet. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #characters * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a skipped entity. * @see org.xml.sax.ContentHandler#skippedEntity * * @param name The name of the skipped entity. If it is a * parameter entity, the name will begin with '%', * and if it is the external DTD subset, it will be the string * "[dtd]". * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping * another exception. */	TokenNameCOMMENT_JAVADOC	 Receive notification of a skipped entity. @see org.xml.sax.ContentHandler#skippedEntity * @param name The name of the skipped entity. If it is a parameter entity, the name will begin with '%', and if it is the external DTD subset, it will be the string "[dtd]". @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
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
// TODO: Should handle 	TokenNameCOMMENT_LINE	TODO: Should handle 
}	TokenNameRBRACE	
/** * Report the start of a CDATA section. * * @throws org.xml.sax.SAXException The application may raise an exception. * @see #endCDATA */	TokenNameCOMMENT_JAVADOC	 Report the start of a CDATA section. * @throws org.xml.sax.SAXException The application may raise an exception. @see #endCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
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
m_cdataStartCalled	TokenNameIdentifier	 m cdata Start Called
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report the beginning of an entity. * * The start and end of the document entity are not reported. * The start and end of the external DTD subset are reported * using the pseudo-name "[dtd]". All other events must be * properly nested within start/end entity events. * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @throws org.xml.sax.SAXException The application may raise an exception. * @see #endEntity * @see org.xml.sax.ext.DeclHandler#internalEntityDecl * @see org.xml.sax.ext.DeclHandler#externalEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report the beginning of an entity. * The start and end of the document entity are not reported. The start and end of the external DTD subset are reported using the pseudo-name "[dtd]". All other events must be properly nested within start/end entity events. * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @throws org.xml.sax.SAXException The application may raise an exception. @see #endEntity @see org.xml.sax.ext.DeclHandler#internalEntityDecl @see org.xml.sax.ext.DeclHandler#externalEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_expandDTDEntities	TokenNameIdentifier	 m expand DTD Entities
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_inExternalDTD	TokenNameIdentifier	 m in External DTD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Only leave the entity as-is if * we've been told not to expand them * and this is not the magic [dtd] name. */	TokenNameCOMMENT_BLOCK	 Only leave the entity as-is if we've been told not to expand them and this is not the magic [dtd] name. 
startNonEscaping	TokenNameIdentifier	 start Non Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
"&"	TokenNameStringLiteral	&
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endNonEscaping	TokenNameIdentifier	 end Non Escaping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_inEntityRef	TokenNameIdentifier	 m in Entity Ref
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For the enclosing elements starting tag write out * out any attributes followed by ">" * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 For the enclosing elements starting tag write out out any attributes followed by ">" * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
closeStartTag	TokenNameIdentifier	 close Start Tag
(	TokenNameLPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
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
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nAttrs	TokenNameIdentifier	 n Attrs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clear attributes object for re-use with next element 	TokenNameCOMMENT_LINE	clear attributes object for re-use with next element 
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* whether Xalan or XSLTC, we have the prefix mappings now, so * lets determine if the current element is specified in the cdata- * section-elements list. */	TokenNameCOMMENT_BLOCK	 whether Xalan or XSLTC, we have the prefix mappings now, so lets determine if the current element is specified in the cdata- section-elements list. 
if	TokenNameif	
(	TokenNameLPAREN	
m_CdataElems	TokenNameIdentifier	 m  Cdata Elems
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
=	TokenNameEQUAL	
isCdataSection	TokenNameIdentifier	 is Cdata Section
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_doIndent	TokenNameIdentifier	 m do Indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_ispreserve	TokenNameIdentifier	 m ispreserve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the start of DTD declarations, if any. * * Any declarations are assumed to be in the internal subset unless * otherwise indicated. * * @param name The document type name. * @param publicId The declared public identifier for the * external DTD subset, or null if none was declared. * @param systemId The declared system identifier for the * external DTD subset, or null if none was declared. * @throws org.xml.sax.SAXException The application may raise an * exception. * @see #endDTD * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the start of DTD declarations, if any. * Any declarations are assumed to be in the internal subset unless otherwise indicated. * @param name The document type name. @param publicId The declared public identifier for the external DTD subset, or null if none was declared. @param systemId The declared system identifier for the external DTD subset, or null if none was declared. @throws org.xml.sax.SAXException The application may raise an exception. @see #endDTD @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
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
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
m_inDoctype	TokenNameIdentifier	 m in Doctype
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the m_indentAmount. * @return int */	TokenNameCOMMENT_JAVADOC	 Returns the m_indentAmount. @return int 
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
/** * Sets the m_indentAmount. * * @param m_indentAmount The m_indentAmount to set */	TokenNameCOMMENT_JAVADOC	 Sets the m_indentAmount. * @param m_indentAmount The m_indentAmount to set 
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
/** * Tell if, based on space preservation constraints and the doIndent property, * if an indent should occur. * * @return True if an indent should occur. */	TokenNameCOMMENT_JAVADOC	 Tell if, based on space preservation constraints and the doIndent property, if an indent should occur. * @return True if an indent should occur. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldIndent	TokenNameIdentifier	 should Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_doIndent	TokenNameIdentifier	 m do Indent
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_ispreserve	TokenNameIdentifier	 m ispreserve
&&	TokenNameAND_AND	
!	TokenNameNOT	
m_isprevtext	TokenNameIdentifier	 m isprevtext
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the list of qname properties with the specified key in the * property list. If the key is not found in this property list, the default * property list, and its defaults, recursively, are then checked. The * method returns <code>null</code> if the property is not found. * * @param key the property key. * @param props the list of properties to search in. * * Sets the vector of local-name/URI pairs of the cdata section elements * specified in the cdata-section-elements property. * * This method is essentially a copy of getQNameProperties() from * OutputProperties. Eventually this method should go away and a call * to setCdataSectionElements(Vector v) should be made directly. */	TokenNameCOMMENT_JAVADOC	 Searches for the list of qname properties with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @param props the list of properties to search in. * Sets the vector of local-name/URI pairs of the cdata section elements specified in the cdata-section-elements property. * This method is essentially a copy of getQNameProperties() from OutputProperties. Eventually this method should go away and a call to setCdataSectionElements(Vector v) should be made directly. 
private	TokenNameprivate	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Vector of URI/LocalName pairs 	TokenNameCOMMENT_LINE	Vector of URI/LocalName pairs 
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inCurly	TokenNameIdentifier	 in Curly
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
l	TokenNameIdentifier	 l
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
addCdataSectionElement	TokenNameIdentifier	 add Cdata Section Element
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
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
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
addCdataSectionElement	TokenNameIdentifier	 add Cdata Section Element
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// call the official, public method to set the collected names 	TokenNameCOMMENT_LINE	call the official, public method to set the collected names 
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a URI/LocalName pair of strings to the list. * * @param URI_and_localName String of the form "{uri}local" or "local" * * @return a QName object */	TokenNameCOMMENT_JAVADOC	 Adds a URI/LocalName pair of strings to the list. * @param URI_and_localName String of the form "{uri}local" or "local" * @return a QName object 
private	TokenNameprivate	
void	TokenNamevoid	
addCdataSectionElement	TokenNameIdentifier	 add Cdata Section Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
URI_and_localName	TokenNameIdentifier	 URI and local Name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
URI_and_localName	TokenNameIdentifier	 URI and local Name
,	TokenNameCOMMA	
"{}"	TokenNameStringLiteral	{}
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add null URI and the local name 	TokenNameCOMMENT_LINE	add null URI and the local name 
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// add URI, then local name 	TokenNameCOMMENT_LINE	add URI, then local name 
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Remembers the cdata sections specified in the cdata-section-elements. * The "official way to set URI and localName pairs. * This method should be used by both Xalan and XSLTC. * * @param URI_and_localNames a vector of pairs of Strings (URI/local) */	TokenNameCOMMENT_JAVADOC	 Remembers the cdata sections specified in the cdata-section-elements. The "official way to set URI and localName pairs. This method should be used by both Xalan and XSLTC. * @param URI_and_localNames a vector of pairs of Strings (URI/local) 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// convert to the new way. 	TokenNameCOMMENT_LINE	convert to the new way. 
if	TokenNameif	
(	TokenNameLPAREN	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// whitspace separated "{uri1}local1 {uri2}local2 ..." 	TokenNameCOMMENT_LINE	whitspace separated "{uri1}local1 {uri2}local2 ..." 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If there is no URI don't put this in, just the localName then. 	TokenNameCOMMENT_LINE	If there is no URI don't put this in, just the localName then. 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
initCdataElems	TokenNameIdentifier	 init Cdata Elems
(	TokenNameLPAREN	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes sure that the namespace URI for the given qualified attribute name * is declared. * @param ns the namespace URI * @param rawName the qualified name * @return returns null if no action is taken, otherwise it returns the * prefix used in declaring the namespace. * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 Makes sure that the namespace URI for the given qualified attribute name is declared. @param ns the namespace URI @param rawName the qualified name @return returns null if no action is taken, otherwise it returns the prefix used in declaring the namespace. @throws SAXException 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
ensureAttributesNamespaceIsDeclared	TokenNameIdentifier	 ensure Attributes Namespace Is Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
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
ns	TokenNameIdentifier	 ns
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// extract the prefix in front of the raw name 	TokenNameCOMMENT_LINE	extract the prefix in front of the raw name 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefixFromRawName	TokenNameIdentifier	 prefix From Raw Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have a prefix, lets see if it maps to a namespace 	TokenNameCOMMENT_LINE	we have a prefix, lets see if it maps to a namespace 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefixFromRawName	TokenNameIdentifier	 prefix From Raw Name
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
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the prefix in the raw name is already maps to the given namespace uri 	TokenNameCOMMENT_LINE	the prefix in the raw name is already maps to the given namespace uri 
// so we don't need to do anything 	TokenNameCOMMENT_LINE	so we don't need to do anything 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The uri does not map to the prefix in the raw name, 	TokenNameCOMMENT_LINE	The uri does not map to the prefix in the raw name, 
// so lets make the mapping. 	TokenNameCOMMENT_LINE	so lets make the mapping. 
this	TokenNamethis	
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefixFromRawName	TokenNameIdentifier	 prefix From Raw Name
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
,	TokenNameCOMMA	
prefixFromRawName	TokenNameIdentifier	 prefix From Raw Name
,	TokenNameCOMMA	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefixFromRawName	TokenNameIdentifier	 prefix From Raw Name
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prefixFromRawName	TokenNameIdentifier	 prefix From Raw Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we don't have a prefix in the raw name. 	TokenNameCOMMENT_LINE	we don't have a prefix in the raw name. 
// Does the URI map to a prefix already? 	TokenNameCOMMENT_LINE	Does the URI map to a prefix already? 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// uri is not associated with a prefix, 	TokenNameCOMMENT_LINE	uri is not associated with a prefix, 
// so lets generate a new prefix to use 	TokenNameCOMMENT_LINE	so lets generate a new prefix to use 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
generateNextPrefix	TokenNameIdentifier	 generate Next Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
ensurePrefixIsDeclared	TokenNameIdentifier	 ensure Prefix Is Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
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
ns	TokenNameIdentifier	 ns
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
no_prefix	TokenNameIdentifier	 no prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
no_prefix	TokenNameIdentifier	 no prefix
)	TokenNameRPAREN	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
foundURI	TokenNameIdentifier	 found URI
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
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
foundURI	TokenNameIdentifier	 found URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
foundURI	TokenNameIdentifier	 found URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bugzilla1133: Generate attribute as well as namespace event. 	TokenNameCOMMENT_LINE	Bugzilla1133: Generate attribute as well as namespace event. 
// SAX does expect both. 	TokenNameCOMMENT_LINE	SAX does expect both. 
this	TokenNamethis	
.	TokenNameDOT	
addAttributeAlways	TokenNameIdentifier	 add Attribute Always
(	TokenNameLPAREN	
"http://www.w3.org/2000/xmlns/"	TokenNameStringLiteral	http://www.w3.org/2000/xmlns/
,	TokenNameCOMMA	
no_prefix	TokenNameIdentifier	 no prefix
?	TokenNameQUESTION	
"xmlns"	TokenNameStringLiteral	xmlns
:	TokenNameCOLON	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
// local name 	TokenNameCOMMENT_LINE	local name 
no_prefix	TokenNameIdentifier	 no prefix
?	TokenNameQUESTION	
"xmlns"	TokenNameStringLiteral	xmlns
:	TokenNameCOLON	
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// qname 	TokenNameCOMMENT_LINE	qname 
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// what? me worry? 	TokenNameCOMMENT_LINE	what? me worry? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this method is really only useful in the ToSAXHandler classes but it is 	TokenNameCOMMENT_LINE	this method is really only useful in the ToSAXHandler classes but it is 
// in the interface. If the method defined here is ever called 	TokenNameCOMMENT_LINE	in the interface. If the method defined here is ever called 
// we are probably in trouble. 	TokenNameCOMMENT_LINE	we are probably in trouble. 
}	TokenNameRBRACE	
/** * Adds the given attribute to the set of attributes, even if there is * no currently open element. This is useful if a SAX startPrefixMapping() * should need to add an attribute before the element name is seen. * * This method is a copy of its super classes method, except that some * tracing of events is done. This is so the tracing is only done for * stream serializers, not for SAX ones. * * @param uri the URI of the attribute * @param localName the local name of the attribute * @param rawName the qualified name of the attribute * @param type the type of the attribute (probably CDATA) * @param value the value of the attribute * @param xslAttribute true if this attribute is coming from an xsl:attribute element. * @return true if the attribute value was added, * false if the attribute already existed and the value was * replaced with the new value. */	TokenNameCOMMENT_JAVADOC	 Adds the given attribute to the set of attributes, even if there is no currently open element. This is useful if a SAX startPrefixMapping() should need to add an attribute before the element name is seen. * This method is a copy of its super classes method, except that some tracing of events is done. This is so the tracing is only done for stream serializers, not for SAX ones. * @param uri the URI of the attribute @param localName the local name of the attribute @param rawName the qualified name of the attribute @param type the type of the attribute (probably CDATA) @param value the value of the attribute @param xslAttribute true if this attribute is coming from an xsl:attribute element. @return true if the attribute value was added, false if the attribute already existed and the value was replaced with the new value. 
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
xslAttribute	TokenNameIdentifier	 xsl Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
was_added	TokenNameIdentifier	 was added
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
localName	TokenNameIdentifier	 local Name
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
String	TokenNameIdentifier	 String
old_value	TokenNameIdentifier	 old value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
old_value	TokenNameIdentifier	 old value
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
old_value	TokenNameIdentifier	 old value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
old_value	TokenNameIdentifier	 old value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* We've seen the attribute before. * We may have a null uri or localName, but all we really * want to re-set is the value anyway. */	TokenNameCOMMENT_BLOCK	 We've seen the attribute before. We may have a null uri or localName, but all we really want to re-set is the value anyway. 
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
if	TokenNameif	
(	TokenNameLPAREN	
old_value	TokenNameIdentifier	 old value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// the attribute doesn't exist yet, create it 	TokenNameCOMMENT_LINE	the attribute doesn't exist yet, create it 
if	TokenNameif	
(	TokenNameLPAREN	
xslAttribute	TokenNameIdentifier	 xsl Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * This attribute is from an xsl:attribute element so we take some care in * adding it, e.g. * <elem1 foo:attr1="1" xmlns:foo="uri1"> * <xsl:attribute name="foo:attr2">2</xsl:attribute> * </elem1> * * We are adding attr1 and attr2 both as attributes of elem1, * and this code is adding attr2 (the xsl:attribute ). * We could have a collision with the prefix like in the example above. */	TokenNameCOMMENT_BLOCK	 This attribute is from an xsl:attribute element so we take some care in adding it, e.g. <elem1 foo:attr1="1" xmlns:foo="uri1"> <xsl:attribute name="foo:attr2">2</xsl:attribute> </elem1> * We are adding attr1 and attr2 both as attributes of elem1, and this code is adding attr2 (the xsl:attribute ). We could have a collision with the prefix like in the example above. 
// In the example above, is there a prefix like foo ? 	TokenNameCOMMENT_LINE	In the example above, is there a prefix like foo ? 
final	TokenNamefinal	
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
rawName	TokenNameIdentifier	 raw Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colonIndex	TokenNameIdentifier	 colon Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
.	TokenNameDOT	
MappingRecord	TokenNameIdentifier	 Mapping Record
existing_mapping	TokenNameIdentifier	 existing mapping
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
getMappingFromPrefix	TokenNameIdentifier	 get Mapping From Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Before adding this attribute (foo:attr2), * is the prefix for it (foo) already mapped at the current depth? */	TokenNameCOMMENT_BLOCK	 Before adding this attribute (foo:attr2), is the prefix for it (foo) already mapped at the current depth? 
if	TokenNameif	
(	TokenNameLPAREN	
existing_mapping	TokenNameIdentifier	 existing mapping
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
existing_mapping	TokenNameIdentifier	 existing mapping
.	TokenNameDOT	
m_declarationDepth	TokenNameIdentifier	 m declaration Depth
==	TokenNameEQUAL_EQUAL	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
&&	TokenNameAND_AND	
!	TokenNameNOT	
existing_mapping	TokenNameIdentifier	 existing mapping
.	TokenNameDOT	
m_uri	TokenNameIdentifier	 m uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * There is an existing mapping of this prefix, * it differs from the one we need, * and unfortunately it is at the current depth so we * can not over-ride it. */	TokenNameCOMMENT_BLOCK	 There is an existing mapping of this prefix, it differs from the one we need, and unfortunately it is at the current depth so we can not over-ride it. 
/* * Are we lucky enough that an existing other prefix maps to this URI ? */	TokenNameCOMMENT_BLOCK	 Are we lucky enough that an existing other prefix maps to this URI ? 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
lookupPrefix	TokenNameIdentifier	 lookup Prefix
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* Unfortunately there is no existing prefix that happens to map to ours, * so to avoid a prefix collision we must generated a new prefix to use. * This is OK because the prefix URI mapping * defined in the xsl:attribute is short in scope, * just the xsl:attribute element itself, * and at this point in serialization the body of the * xsl:attribute, if any, is just a String. Right? * . . . I sure hope so - Brian M. */	TokenNameCOMMENT_BLOCK	 Unfortunately there is no existing prefix that happens to map to ours, so to avoid a prefix collision we must generated a new prefix to use. This is OK because the prefix URI mapping defined in the xsl:attribute is short in scope, just the xsl:attribute element itself, and at this point in serialization the body of the xsl:attribute, if any, is just a String. Right? . . . I sure hope so - Brian M. 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_prefixMap	TokenNameIdentifier	 m prefix Map
.	TokenNameDOT	
generateNextPrefix	TokenNameIdentifier	 generate Next Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
':'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
/* This is our last chance to make sure the namespace for this * attribute is declared, especially if we just generated an alternate * prefix to avoid a collision (the new prefix/rawName will go out of scope * soon and be lost ... last chance here. */	TokenNameCOMMENT_BLOCK	 This is our last chance to make sure the namespace for this attribute is declared, especially if we just generated an alternate prefix to avoid a collision (the new prefix/rawName will go out of scope soon and be lost ... last chance here. 
String	TokenNameIdentifier	 String
prefixUsed	TokenNameIdentifier	 prefix Used
=	TokenNameEQUAL	
ensureAttributesNamespaceIsDeclared	TokenNameIdentifier	 ensure Attributes Namespace Is Declared
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO Auto-generated catch block 	TokenNameCOMMENT_LINE	TODO Auto-generated catch block 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
was_added	TokenNameIdentifier	 was added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To fire off the pseudo characters of attributes, as they currently * exist. This method should be called everytime an attribute is added, * or when an attribute value is changed, or an element is created. */	TokenNameCOMMENT_JAVADOC	 To fire off the pseudo characters of attributes, as they currently exist. This method should be called everytime an attribute is added, or when an attribute value is changed, or an element is created. 
protected	TokenNameprotected	
void	TokenNamevoid	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// flush out the "<elemName" if not already flushed 	TokenNameCOMMENT_LINE	flush out the "<elemName" if not already flushed 
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make a StringBuffer to write the name="value" pairs to. 	TokenNameCOMMENT_LINE	make a StringBuffer to write the name="value" pairs to. 
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttrs	TokenNameIdentifier	 n Attrs
=	TokenNameEQUAL	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nAttrs	TokenNameIdentifier	 n Attrs
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make a writer that internally appends to the same 	TokenNameCOMMENT_LINE	make a writer that internally appends to the same 
// StringBuffer 	TokenNameCOMMENT_LINE	StringBuffer 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
ToStream	TokenNameIdentifier	 To Stream
.	TokenNameDOT	
WritertoStringBuffer	TokenNameIdentifier	 Writerto String Buffer
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processAttributes	TokenNameIdentifier	 process Attributes
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
nAttrs	TokenNameIdentifier	 n Attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't clear the attributes! 	TokenNameCOMMENT_LINE	Don't clear the attributes! 
// We only want to see what would be written out 	TokenNameCOMMENT_LINE	We only want to see what would be written out 
// at this point, we don't want to loose them. 	TokenNameCOMMENT_LINE	at this point, we don't want to loose them. 
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the potential > after the attributes. 	TokenNameCOMMENT_LINE	the potential > after the attributes. 
// convert the StringBuffer to a char array and 	TokenNameCOMMENT_LINE	convert the StringBuffer to a char array and 
// emit the trace event that these characters "might" 	TokenNameCOMMENT_LINE	emit the trace event that these characters "might" 
// be written 	TokenNameCOMMENT_LINE	be written 
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_tracer	TokenNameIdentifier	 m tracer
.	TokenNameDOT	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_OUTPUT_PSEUDO_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  OUTPUT  PSEUDO  CHARACTERS
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore ? 	TokenNameCOMMENT_LINE	ignore ? 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore ? 	TokenNameCOMMENT_LINE	ignore ? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This inner class is used only to collect attribute values * written by the method writeAttrString() into a string buffer. * In this manner trace events, and the real writing of attributes will use * the same code. */	TokenNameCOMMENT_JAVADOC	 This inner class is used only to collect attribute values written by the method writeAttrString() into a string buffer. In this manner trace events, and the real writing of attributes will use the same code. 
private	TokenNameprivate	
class	TokenNameclass	
WritertoStringBuffer	TokenNameIdentifier	 Writerto String Buffer
extends	TokenNameextends	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
{	TokenNameLBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
m_stringbuf	TokenNameIdentifier	 m stringbuf
;	TokenNameSEMICOLON	
/** * @see java.io.Writer#write(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see java.io.Writer#write(char[], int, int) 
WritertoStringBuffer	TokenNameIdentifier	 Writerto String Buffer
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stringbuf	TokenNameIdentifier	 m stringbuf
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
int	TokenNameint	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
int	TokenNameint	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
m_stringbuf	TokenNameIdentifier	 m stringbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.io.Writer#flush() */	TokenNameCOMMENT_JAVADOC	 @see java.io.Writer#flush() 
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see java.io.Writer#close() */	TokenNameCOMMENT_JAVADOC	 @see java.io.Writer#close() 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stringbuf	TokenNameIdentifier	 m stringbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stringbuf	TokenNameIdentifier	 m stringbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setTransformer(Transformer) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setTransformer(Transformer) 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
instanceof	TokenNameinstanceof	
SerializerTraceWriter	TokenNameIdentifier	 Serializer Trace Writer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setWriterInternal	TokenNameIdentifier	 set Writer Internal
(	TokenNameLPAREN	
new	TokenNamenew	
SerializerTraceWriter	TokenNameIdentifier	 Serializer Trace Writer
(	TokenNameLPAREN	
m_writer	TokenNameIdentifier	 m writer
,	TokenNameCOMMA	
m_tracer	TokenNameIdentifier	 m tracer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try's to reset the super class and reset this class for * re-use, so that you don't need to create a new serializer * (mostly for performance reasons). * * @return true if the class was successfuly reset. */	TokenNameCOMMENT_JAVADOC	 Try's to reset the super class and reset this class for re-use, so that you don't need to create a new serializer (mostly for performance reasons). * @return true if the class was successfuly reset. 
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
resetToStream	TokenNameIdentifier	 reset To Stream
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
/** * Reset all of the fields owned by ToStream class * */	TokenNameCOMMENT_JAVADOC	 Reset all of the fields owned by ToStream class 
private	TokenNameprivate	
void	TokenNamevoid	
resetToStream	TokenNameIdentifier	 reset To Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_cdataStartCalled	TokenNameIdentifier	 m cdata Start Called
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* The stream is being reset. It is one of * ToXMLStream, ToHTMLStream ... and this type can't be changed * so neither should m_charInfo which is associated with the * type of Stream. Just leave m_charInfo as-is for the next re-use. * */	TokenNameCOMMENT_BLOCK	 The stream is being reset. It is one of ToXMLStream, ToHTMLStream ... and this type can't be changed so neither should m_charInfo which is associated with the type of Stream. Just leave m_charInfo as-is for the next re-use. 
// this.m_charInfo = null; // don't set to null 	TokenNameCOMMENT_LINE	this.m_charInfo = null; // don't set to null 
this	TokenNamethis	
.	TokenNameDOT	
m_disableOutputEscapingStates	TokenNameIdentifier	 m disable Output Escaping States
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this.m_encodingInfo = null; // don't set to null 	TokenNameCOMMENT_LINE	this.m_encodingInfo = null; // don't set to null 
this	TokenNamethis	
.	TokenNameDOT	
m_escaping	TokenNameIdentifier	 m escaping
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Leave m_format alone for now - Brian M. 	TokenNameCOMMENT_LINE	Leave m_format alone for now - Brian M. 
// this.m_format = null; 	TokenNameCOMMENT_LINE	this.m_format = null; 
this	TokenNamethis	
.	TokenNameDOT	
m_expandDTDEntities	TokenNameIdentifier	 m expand DTD Entities
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_inDoctype	TokenNameIdentifier	 m in Doctype
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_ispreserve	TokenNameIdentifier	 m ispreserve
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_isprevtext	TokenNameIdentifier	 m isprevtext
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_isUTF8	TokenNameIdentifier	 m is UT F8
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// ?? used anywhere ?? 	TokenNameCOMMENT_LINE	?? used anywhere ?? 
this	TokenNamethis	
.	TokenNameDOT	
m_lineSep	TokenNameIdentifier	 m line Sep
=	TokenNameEQUAL	
s_systemLineSep	TokenNameIdentifier	 s system Line Sep
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
=	TokenNameEQUAL	
s_systemLineSep	TokenNameIdentifier	 s system Line Sep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// this.m_outputStream = null; // Don't reset it may be re-used 	TokenNameCOMMENT_LINE	this.m_outputStream = null; // Don't reset it may be re-used 
this	TokenNamethis	
.	TokenNameDOT	
m_preserves	TokenNameIdentifier	 m preserves
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_shouldFlush	TokenNameIdentifier	 m should Flush
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_spaceBeforeClose	TokenNameIdentifier	 m space Before Close
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_startNewLine	TokenNameIdentifier	 m start New Line
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_writer_set_by_user	TokenNameIdentifier	 m writer set by user
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the character encoding coming from the xsl:output encoding stylesheet attribute. * @param encoding the character encoding */	TokenNameCOMMENT_JAVADOC	 Sets the character encoding coming from the xsl:output encoding stylesheet attribute. @param encoding the character encoding 
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
/** * Simple stack for boolean values. * * This class is a copy of the one in org.apache.xml.utils. * It exists to cut the serializers dependancy on that package. * A minor changes from that package are: * doesn't implement Clonable * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Simple stack for boolean values. * This class is a copy of the one in org.apache.xml.utils. It exists to cut the serializers dependancy on that package. A minor changes from that package are: doesn't implement Clonable * @xsl.usage internal 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BoolStack	TokenNameIdentifier	 Bool Stack
{	TokenNameLBRACE	
/** Array of boolean values */	TokenNameCOMMENT_JAVADOC	 Array of boolean values 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Array size allocated */	TokenNameCOMMENT_JAVADOC	 Array size allocated 
private	TokenNameprivate	
int	TokenNameint	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
;	TokenNameSEMICOLON	
/** Index into the array of booleans */	TokenNameCOMMENT_JAVADOC	 Index into the array of booleans 
private	TokenNameprivate	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a IntVector, using the given block size. * * @param size array size to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a IntVector, using the given block size. * @param size array size to allocate 
public	TokenNamepublic	
BoolStack	TokenNameIdentifier	 Bool Stack
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Current length of the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Current length of the list 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_index	TokenNameIdentifier	 m index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the stack. * */	TokenNameCOMMENT_JAVADOC	 Clears the stack. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pushes an item onto the top of this stack. * * * @param val the boolean to be pushed onto this stack. * @return the <code>item</code> argument. */	TokenNameCOMMENT_JAVADOC	 Pushes an item onto the top of this stack. * @param val the boolean to be pushed onto this stack. @return the <code>item</code> argument. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
==	TokenNameEQUAL_EQUAL	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the object at the top of this stack and returns that * object as the value of this function. * * @return The object at the top of this stack. * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Removes the object at the top of this stack and returns that object as the value of this function. * @return The object at the top of this stack. @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the object at the top of this stack and returns the * next object at the top as the value of this function. * * * @return Next object to the top or false if none there */	TokenNameCOMMENT_JAVADOC	 Removes the object at the top of this stack and returns the next object at the top as the value of this function. * @return Next object to the top or false if none there 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
popAndTop	TokenNameIdentifier	 pop And Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the item at the top of this stack * * * @param b Object to set at the top of this stack */	TokenNameCOMMENT_JAVADOC	 Set the item at the top of this stack * @param b Object to set at the top of this stack 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. * * @return the object at the top of this stack. * @throws EmptyStackException if this stack is empty. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. * @return the object at the top of this stack. @throws EmptyStackException if this stack is empty. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. If the stack is empty, it returns false. * * @return the object at the top of this stack. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. If the stack is empty, it returns false. * @return the object at the top of this stack. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
peekOrFalse	TokenNameIdentifier	 peek Or False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Looks at the object at the top of this stack without removing it * from the stack. If the stack is empty, it returns true. * * @return the object at the top of this stack. */	TokenNameCOMMENT_JAVADOC	 Looks at the object at the top of this stack without removing it from the stack. If the stack is empty, it returns true. * @return the object at the top of this stack. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
peekOrTrue	TokenNameIdentifier	 peek Or True
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_values	TokenNameIdentifier	 m values
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this stack is empty. * * @return <code>true</code> if this stack is empty; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if this stack is empty. * @return <code>true</code> if this stack is empty; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_index	TokenNameIdentifier	 m index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Grows the size of the stack * */	TokenNameCOMMENT_JAVADOC	 Grows the size of the stack 
private	TokenNameprivate	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
newVector	TokenNameIdentifier	 new Vector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
m_allocatedSize	TokenNameIdentifier	 m allocated Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_values	TokenNameIdentifier	 m values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newVector	TokenNameIdentifier	 new Vector
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_index	TokenNameIdentifier	 m index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
=	TokenNameEQUAL	
newVector	TokenNameIdentifier	 new Vector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Implement DTDHandler 	TokenNameCOMMENT_LINE	Implement DTDHandler 
/** * If this method is called, the serializer is used as a * DTDHandler, which changes behavior how the serializer * handles document entities. * @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 If this method is called, the serializer is used as a DTDHandler, which changes behavior how the serializer handles document entities. @see org.xml.sax.DTDHandler#notationDecl(java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pubID	TokenNameIdentifier	 pub ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sysID	TokenNameIdentifier	 sys ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// TODO Auto-generated method stub 	TokenNameCOMMENT_LINE	TODO Auto-generated method stub 
try	TokenNametry	
{	TokenNameLBRACE	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!NOTATION "	TokenNameStringLiteral	<!NOTATION 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pubID	TokenNameIdentifier	 pub ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" PUBLIC ""	TokenNameStringLiteral	 PUBLIC "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
pubID	TokenNameIdentifier	 pub ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" SYSTEM ""	TokenNameStringLiteral	 SYSTEM "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sysID	TokenNameIdentifier	 sys ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"" >"	TokenNameStringLiteral	" >
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO Auto-generated catch block 	TokenNameCOMMENT_LINE	TODO Auto-generated catch block 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If this method is called, the serializer is used as a * DTDHandler, which changes behavior how the serializer * handles document entities. * @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 If this method is called, the serializer is used as a DTDHandler, which changes behavior how the serializer handles document entities. @see org.xml.sax.DTDHandler#unparsedEntityDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pubID	TokenNameIdentifier	 pub ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sysID	TokenNameIdentifier	 sys ID
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// TODO Auto-generated method stub 	TokenNameCOMMENT_LINE	TODO Auto-generated method stub 
try	TokenNametry	
{	TokenNameLBRACE	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<!ENTITY "	TokenNameStringLiteral	<!ENTITY 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pubID	TokenNameIdentifier	 pub ID
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" PUBLIC ""	TokenNameStringLiteral	 PUBLIC "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
pubID	TokenNameIdentifier	 pub ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" SYSTEM ""	TokenNameStringLiteral	 SYSTEM "
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sysID	TokenNameIdentifier	 sys ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"" NDATA "	TokenNameStringLiteral	" NDATA 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" >"	TokenNameStringLiteral	 >
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_writer	TokenNameIdentifier	 m writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO Auto-generated catch block 	TokenNameCOMMENT_LINE	TODO Auto-generated catch block 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A private helper method to output the * @throws SAXException * @throws IOException */	TokenNameCOMMENT_JAVADOC	 A private helper method to output the @throws SAXException @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
DTDprolog	TokenNameIdentifier	 DT Dprolog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
m_writer	TokenNameIdentifier	 m writer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputDocTypeDecl	TokenNameIdentifier	 output Doc Type Decl
(	TokenNameLPAREN	
m_elemContext	TokenNameIdentifier	 m elem Context
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToOutputDocTypeDecl	TokenNameIdentifier	 m need To Output Doc Type Decl
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_inDoctype	TokenNameIdentifier	 m in Doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
m_lineSep	TokenNameIdentifier	 m line Sep
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_inDoctype	TokenNameIdentifier	 m in Doctype
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If set to false the serializer does not expand DTD entities, * but leaves them as is, the default value is true; */	TokenNameCOMMENT_JAVADOC	 If set to false the serializer does not expand DTD entities, but leaves them as is, the default value is true; 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDEntityExpansion	TokenNameIdentifier	 set DTD Entity Expansion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expand	TokenNameIdentifier	 expand
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_expandDTDEntities	TokenNameIdentifier	 m expand DTD Entities
=	TokenNameEQUAL	
expand	TokenNameIdentifier	 expand
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the end of line characters to be used during serialization * @param eolChars A character array corresponding to the characters to be used. */	TokenNameCOMMENT_JAVADOC	 Sets the end of line characters to be used during serialization @param eolChars A character array corresponding to the characters to be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setNewLine	TokenNameIdentifier	 set New Line
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eolChars	TokenNameIdentifier	 eol Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lineSep	TokenNameIdentifier	 m line Sep
=	TokenNameEQUAL	
eolChars	TokenNameIdentifier	 eol Chars
;	TokenNameSEMICOLON	
m_lineSepLen	TokenNameIdentifier	 m line Sep Len
=	TokenNameEQUAL	
eolChars	TokenNameIdentifier	 eol Chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remembers the cdata sections specified in the cdata-section-elements by appending the given * cdata section elements to the list. This method can be called multiple times, but once an * element is put in the list of cdata section elements it can not be removed. * This method should be used by both Xalan and XSLTC. * * @param URI_and_localNames a whitespace separated list of element names, each element * is a URI in curly braces (optional) and a local name. An example of such a parameter is: * "{http://company.com}price {myURI2}book chapter" */	TokenNameCOMMENT_JAVADOC	 Remembers the cdata sections specified in the cdata-section-elements by appending the given cdata section elements to the list. This method can be called multiple times, but once an element is put in the list of cdata section elements it can not be removed. This method should be used by both Xalan and XSLTC. * @param URI_and_localNames a whitespace separated list of element names, each element is a URI in curly braces (optional) and a local name. An example of such a parameter is: "{http://company.com}price {myURI2}book chapter" 
public	TokenNamepublic	
void	TokenNamevoid	
addCdataSectionElements	TokenNameIdentifier	 add Cdata Section Elements
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
initCdataElems	TokenNameIdentifier	 init Cdata Elems
(	TokenNameLPAREN	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
=	TokenNameEQUAL	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_StringOfCDATASections	TokenNameIdentifier	 m  String Of CDATA Sections
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

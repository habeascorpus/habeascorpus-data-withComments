/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ToTextStream.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ToTextStream.java 468654 2006-10-28 07:09:23Z minchau $ 
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
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This class is not a public API. * It is only public because it is used in other packages. * This class converts SAX or SAX-like calls to a * serialized document for xsl:output method of "text". * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is not a public API. It is only public because it is used in other packages. This class converts SAX or SAX-like calls to a serialized document for xsl:output method of "text". @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ToTextStream	TokenNameIdentifier	 To Text Stream
extends	TokenNameextends	
ToStream	TokenNameIdentifier	 To Stream
{	TokenNameLBRACE	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ToTextStream	TokenNameIdentifier	 To Text Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of a document. * * <p>The SAX parser will invoke this method only once, before any * other methods in this interface or in DTDHandler (except for * setDocumentLocator).</p> * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of a document. * <p>The SAX parser will invoke this method only once, before any other methods in this interface or in DTDHandler (except for setDocumentLocator).</p> * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
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
super	TokenNamesuper	
.	TokenNameDOT	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// No action for the moment. 	TokenNameCOMMENT_LINE	No action for the moment. 
}	TokenNameRBRACE	
/** * Receive notification of the end of a document. * * <p>The SAX parser will invoke this method only once, and it will * be the last method invoked during the parse. The parser shall * not invoke this method until it has either abandoned parsing * (because of an unrecoverable error) or reached the end of * input.</p> * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of a document. * <p>The SAX parser will invoke this method only once, and it will be the last method invoked during the parse. The parser shall not invoke this method until it has either abandoned parsing (because of an unrecoverable error) or reached the end of input.</p> * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushWriter	TokenNameIdentifier	 flush Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEndDoc	TokenNameIdentifier	 fire End Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of an element. * * <p>The Parser will invoke this method at the beginning of every * element in the XML document; there will be a corresponding * endElement() event for every startElement() event (even when the * element is empty). All of the element's content will be * reported, in order, before the corresponding endElement() * event.</p> * * <p>If the element name has a namespace prefix, the prefix will * still be attached. Note that the attribute list provided will * contain only attributes with explicit values (specified or * defaulted): #IMPLIED attributes will be omitted.</p> * * * @param namespaceURI The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param name The qualified name (with prefix), or the * empty string if qualified names are not available. * @param atts The attributes attached to the element, if any. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #endElement * @see org.xml.sax.AttributeList * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of an element. * <p>The Parser will invoke this method at the beginning of every element in the XML document; there will be a corresponding endElement() event for every startElement() event (even when the element is empty). All of the element's content will be reported, in order, before the corresponding endElement() event.</p> * <p>If the element name has a namespace prefix, the prefix will still be attached. Note that the attribute list provided will contain only attributes with explicit values (specified or defaulted): #IMPLIED attributes will be omitted.</p> * @param namespaceURI The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param name The qualified name (with prefix), or the empty string if qualified names are not available. @param atts The attributes attached to the element, if any. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #endElement @see org.xml.sax.AttributeList * @throws org.xml.sax.SAXException 
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
// time to fire off startElement event 	TokenNameCOMMENT_LINE	time to fire off startElement event 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * <p>The SAX parser will invoke this method at the end of every * element in the XML document; there will be a corresponding * startElement() event for every endElement() event (even when the * element is empty).</p> * * <p>If the element name has a namespace prefix, the prefix will * still be attached to the name.</p> * * * @param namespaceURI The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param name The qualified name (with prefix), or the * empty string if qualified names are not available. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * <p>The SAX parser will invoke this method at the end of every element in the XML document; there will be a corresponding startElement() event for every endElement() event (even when the element is empty).</p> * <p>If the element name has a namespace prefix, the prefix will still be attached to the name.</p> * @param namespaceURI The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param name The qualified name (with prefix), or the empty string if qualified names are not available. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
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
}	TokenNameRBRACE	
/** * Receive notification of character data. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive notification of character data. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inTemporaryOutputState	TokenNameIdentifier	 in Temporary Output State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* leave characters un-processed as we are * creating temporary output, the output generated by * this serializer will be input to a final serializer * later on and it will do the processing in final * output state (not temporary output state). * * A "temporary" ToTextStream serializer is used to * evaluate attribute value templates (for example), * and the result of evaluating such a thing * is fed into a final serializer later on. */	TokenNameCOMMENT_BLOCK	 leave characters un-processed as we are creating temporary output, the output generated by this serializer will be input to a final serializer later on and it will do the processing in final output state (not temporary output state). * A "temporary" ToTextStream serializer is used to evaluate attribute value templates (for example), and the result of evaluating such a thing is fed into a final serializer later on. 
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
else	TokenNameelse	
{	TokenNameLBRACE	
// In final output state we do process the characters! 	TokenNameCOMMENT_LINE	In final output state we do process the characters! 
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * If available, when the disable-output-escaping attribute is used, * output raw text without escaping. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 If available, when the disable-output-escaping attribute is used, output raw text without escaping. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
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
try	TokenNametry	
{	TokenNameLBRACE	
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
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
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Normalize the characters, but don't escape. Different from * SerializerToXML#writeNormalizedChars because it does not attempt to do * XML escaping at all. * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @param useLineSep true if the operating systems * end-of-line separator should be output rather than a new-line character. * * @throws IOException * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Normalize the characters, but don't escape. Different from SerializerToXML#writeNormalizedChars because it does not attempt to do XML escaping at all. * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @param useLineSep true if the operating systems end-of-line separator should be output rather than a new-line character. * @throws IOException @throws org.xml.sax.SAXException 
void	TokenNamevoid	
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
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
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
useLineSep	TokenNameIdentifier	 use Line Sep
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
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
getEncoding	TokenNameIdentifier	 get Encoding
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
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/* copy a few "constants" before the loop for performance */	TokenNameCOMMENT_BLOCK	 copy a few "constants" before the loop for performance 
final	TokenNamefinal	
char	TokenNamechar	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
=	TokenNameEQUAL	
CharInfo	TokenNameIdentifier	 Char Info
.	TokenNameDOT	
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
;	TokenNameSEMICOLON	
// This for() loop always increments i by one at the end 	TokenNameCOMMENT_LINE	This for() loop always increments i by one at the end 
// of the loop. Additional increments of i adjust for when 	TokenNameCOMMENT_LINE	of the loop. Additional increments of i adjust for when 
// two input characters (a high/low UTF16 surrogate pair) 	TokenNameCOMMENT_LINE	two input characters (a high/low UTF16 surrogate pair) 
// are processed. 	TokenNameCOMMENT_LINE	are processed. 
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
final	TokenNamefinal	
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
S_LINEFEED	TokenNameIdentifier	 S  LINEFEED
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
&&	TokenNameAND_AND	
useLineSep	TokenNameIdentifier	 use Line Sep
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
// one input char processed 	TokenNameCOMMENT_LINE	one input char processed 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_encodingInfo	TokenNameIdentifier	 m encoding Info
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// one input char processed 	TokenNameCOMMENT_LINE	one input char processed 
}	TokenNameRBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
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
if	TokenNameif	
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// I think we can just emit the message, 	TokenNameCOMMENT_LINE	I think we can just emit the message, 
// not crash and burn. 	TokenNameCOMMENT_LINE	not crash and burn. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
integralValue	TokenNameIdentifier	 integral Value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
integralValue	TokenNameIdentifier	 integral Value
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Older behavior was to throw the message, 	TokenNameCOMMENT_LINE	Older behavior was to throw the message, 
//but newer gentler behavior is to write a message to System.err 	TokenNameCOMMENT_LINE	but newer gentler behavior is to write a message to System.err 
//throw new SAXException(msg); 	TokenNameCOMMENT_LINE	throw new SAXException(msg); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// two input chars processed 	TokenNameCOMMENT_LINE	two input chars processed 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Don't know what to do with this char, it is 	TokenNameCOMMENT_LINE	Don't know what to do with this char, it is 
// not in the encoding and not a high char in 	TokenNameCOMMENT_LINE	not in the encoding and not a high char in 
// a surrogate pair, so write out as an entity ref 	TokenNameCOMMENT_LINE	a surrogate pair, so write out as an entity ref 
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* The output encoding is known, * so somthing is wrong. */	TokenNameCOMMENT_BLOCK	 The output encoding is known, so somthing is wrong. 
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
c	TokenNameIdentifier	 c
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
// I think we can just emit the message, 	TokenNameCOMMENT_LINE	I think we can just emit the message, 
// not crash and burn. 	TokenNameCOMMENT_LINE	not crash and burn. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
integralValue	TokenNameIdentifier	 integral Value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
ER_ILLEGAL_CHARACTER	TokenNameIdentifier	 ER  ILLEGAL  CHARACTER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
integralValue	TokenNameIdentifier	 integral Value
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Older behavior was to throw the message, 	TokenNameCOMMENT_LINE	Older behavior was to throw the message, 
//but newer gentler behavior is to write a message to System.err 	TokenNameCOMMENT_LINE	but newer gentler behavior is to write a message to System.err 
//throw new SAXException(msg); 	TokenNameCOMMENT_LINE	throw new SAXException(msg); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
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
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// one input char was processed 	TokenNameCOMMENT_LINE	one input char was processed 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of cdata. * * <p>The Parser will call this method to report each chunk of * character data. SAX parsers may return all contiguous character * data in a single chunk, or they may split it into several * chunks; however, all of the characters in any single event * must come from the same external entity, so that the Locator * provides useful information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * <p>Note that some parsers will report whitespace using the * ignorableWhitespace() method rather than this one (validating * parsers must do so).</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #ignorableWhitespace * @see org.xml.sax.Locator */	TokenNameCOMMENT_JAVADOC	 Receive notification of cdata. * <p>The Parser will call this method to report each chunk of character data. SAX parsers may return all contiguous character data in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * <p>Note that some parsers will report whitespace using the ignorableWhitespace() method rather than this one (validating parsers must do so).</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #ignorableWhitespace @see org.xml.sax.Locator 
public	TokenNamepublic	
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
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
start	TokenNameIdentifier	 start
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
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of ignorable whitespace in element content. * * <p>Validating Parsers must use this method to report each chunk * of ignorable whitespace (see the W3C XML 1.0 recommendation, * section 2.10): non-validating parsers may also use this method * if they are capable of parsing and using content models.</p> * * <p>SAX parsers may return all contiguous whitespace in a single * chunk, or they may split it into several chunks; however, all of * the characters in any single event must come from the same * external entity, so that the Locator provides useful * information.</p> * * <p>The application must not attempt to read from the array * outside of the specified range.</p> * * @param ch The characters from the XML document. * @param start The start position in the array. * @param length The number of characters to read from the array. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * @see #characters * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of ignorable whitespace in element content. * <p>Validating Parsers must use this method to report each chunk of ignorable whitespace (see the W3C XML 1.0 recommendation, section 2.10): non-validating parsers may also use this method if they are capable of parsing and using content models.</p> * <p>SAX parsers may return all contiguous whitespace in a single chunk, or they may split it into several chunks; however, all of the characters in any single event must come from the same external entity, so that the Locator provides useful information.</p> * <p>The application must not attempt to read from the array outside of the specified range.</p> * @param ch The characters from the XML document. @param start The start position in the array. @param length The number of characters to read from the array. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. @see #characters * @throws org.xml.sax.SAXException 
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
try	TokenNametry	
{	TokenNameLBRACE	
writeNormalizedChars	TokenNameIdentifier	 write Normalized Chars
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
m_lineSepUse	TokenNameIdentifier	 m line Sep Use
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
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Receive notification of a processing instruction. * * <p>The Parser will invoke this method once for each processing * instruction found: note that processing instructions may occur * before or after the main document element.</p> * * <p>A SAX parser should never report an XML declaration (XML 1.0, * section 2.8) or a text declaration (XML 1.0, section 4.3.1) * using this method.</p> * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none was supplied. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notification of a processing instruction. * <p>The Parser will invoke this method once for each processing instruction found: note that processing instructions may occur before or after the main document element.</p> * <p>A SAX parser should never report an XML declaration (XML 1.0, section 2.8) or a text declaration (XML 1.0, section 4.3.1) using this method.</p> * @param target The processing instruction target. @param data The processing instruction data, or null if none was supplied. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. * @throws org.xml.sax.SAXException 
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
// flush anything pending first 	TokenNameCOMMENT_LINE	flush anything pending first 
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEscapingEvent	TokenNameIdentifier	 fire Escaping Event
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when a Comment is to be constructed. * Note that Xalan will normally invoke the other version of this method. * %REVIEW% In fact, is this one ever needed, or was it a mistake? * * @param data The comment data. * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Called when a Comment is to be constructed. Note that Xalan will normally invoke the other version of this method. %REVIEW% In fact, is this one ever needed, or was it a mistake? * @param data The comment data. @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
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
/** * Report an XML comment anywhere in the document. * * This callback will be used for comments inside or outside the * document element, including comments in the external DTD * subset (if read). * * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws org.xml.sax.SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an XML comment anywhere in the document. * This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read). * @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws org.xml.sax.SAXException The application may raise an exception. 
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
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notivication of a entityReference. * * @param name non-null reference to the name of the entity. * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Receive notivication of a entityReference. * @param name non-null reference to the name of the entity. * @throws org.xml.sax.SAXException 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
fireEntityReference	TokenNameIdentifier	 fire Entity Reference
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addAttribute(String, String, String, String, String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttribute(String, String, String, String, String) 
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
{	TokenNameLBRACE	
// do nothing, just forget all about the attribute 	TokenNameCOMMENT_LINE	do nothing, just forget all about the attribute 
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#endCDATA() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#endCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#endElement(String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#endElement(String) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
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
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From XSLTC */	TokenNameCOMMENT_JAVADOC	 From XSLTC 
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
if	TokenNameif	
(	TokenNameLPAREN	
m_needToCallStartDocument	TokenNameIdentifier	 m need To Call Start Document
)	TokenNameRPAREN	
startDocumentInternal	TokenNameIdentifier	 start Document Internal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// time to fire off startlement event. 	TokenNameCOMMENT_LINE	time to fire off startlement event. 
if	TokenNameif	
(	TokenNameLPAREN	
m_tracer	TokenNameIdentifier	 m tracer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fireStartElem	TokenNameIdentifier	 fire Start Elem
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firePseudoAttributes	TokenNameIdentifier	 fire Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From XSLTC */	TokenNameCOMMENT_JAVADOC	 From XSLTC 
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
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
characters	TokenNameIdentifier	 characters
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
characters	TokenNameIdentifier	 characters
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
/** * From XSLTC */	TokenNameCOMMENT_JAVADOC	 From XSLTC 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing, forget about the attribute 	TokenNameCOMMENT_LINE	do nothing, forget about the attribute 
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
// do nothing, forget about the attribute 	TokenNameCOMMENT_LINE	do nothing, forget about the attribute 
}	TokenNameRBRACE	
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
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// no namespace support for HTML 	TokenNameCOMMENT_LINE	no namespace support for HTML 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flushPending	TokenNameIdentifier	 flush Pending
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	

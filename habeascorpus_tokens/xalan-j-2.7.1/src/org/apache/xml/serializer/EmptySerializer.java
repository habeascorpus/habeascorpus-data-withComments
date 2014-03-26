/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: EmptySerializer.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: EmptySerializer.java 471981 2006-11-07 04:28:00Z minchau $ 
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
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
Vector	TokenNameIdentifier	 Vector
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
/** * This class is an adapter class. Its only purpose is to be extended and * for that extended class to over-ride all methods that are to be used. * * This class is not a public API, it is only public because it is used * across package boundaries. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is an adapter class. Its only purpose is to be extended and for that extended class to over-ride all methods that are to be used. * This class is not a public API, it is only public because it is used across package boundaries. * @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
EmptySerializer	TokenNameIdentifier	 Empty Serializer
implements	TokenNameimplements	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERR	TokenNameIdentifier	 ERR
=	TokenNameEQUAL	
"EmptySerializer method not over-ridden"	TokenNameStringLiteral	EmptySerializer method not over-ridden
;	TokenNameSEMICOLON	
/** * @see SerializationHandler#asContentHandler() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#asContentHandler() 
protected	TokenNameprotected	
void	TokenNamevoid	
couldThrowIOException	TokenNameIdentifier	 could Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// don't do anything. 	TokenNameCOMMENT_LINE	don't do anything. 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// don't do anything. 	TokenNameCOMMENT_LINE	don't do anything. 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// don't do anything. 	TokenNameCOMMENT_LINE	don't do anything. 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemQName	TokenNameIdentifier	 elem Q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// don't do anything. 	TokenNameCOMMENT_LINE	don't do anything. 
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
couldThrowException	TokenNameIdentifier	 could Throw Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// don't do anything. 	TokenNameCOMMENT_LINE	don't do anything. 
}	TokenNameRBRACE	
void	TokenNamevoid	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw new RuntimeException(err); 	TokenNameCOMMENT_LINE	throw new RuntimeException(err); 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#asContentHandler() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#asContentHandler() 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
couldThrowIOException	TokenNameIdentifier	 could Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setContentHandler(org.xml.sax.ContentHandler) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setContentHandler(org.xml.sax.ContentHandler) 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#close() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#close() 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#getOutputFormat() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#getOutputFormat() 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getOutputFormat	TokenNameIdentifier	 get Output Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#getOutputStream() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#getOutputStream() 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#getWriter() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#getWriter() 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#reset() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#reset() 
public	TokenNamepublic	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#serialize(org.w3c.dom.Node) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#serialize(org.w3c.dom.Node) 
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
couldThrowIOException	TokenNameIdentifier	 could Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setCdataSectionElements(java.util.Vector) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setCdataSectionElements(java.util.Vector) 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setEscaping(boolean) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setEscaping(boolean) 
public	TokenNamepublic	
boolean	TokenNameboolean	
setEscaping	TokenNameIdentifier	 set Escaping
(	TokenNameLPAREN	
boolean	TokenNameboolean	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setIndent(boolean) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setIndent(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setIndentAmount(int) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setIndentAmount(int) 
public	TokenNamepublic	
void	TokenNamevoid	
setIndentAmount	TokenNameIdentifier	 set Indent Amount
(	TokenNameLPAREN	
int	TokenNameint	
spaces	TokenNameIdentifier	 spaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setOutputFormat(java.util.Properties) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setOutputFormat(java.util.Properties) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setOutputStream(java.io.OutputStream) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setOutputStream(java.io.OutputStream) 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setVersion(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setVersion(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setWriter(java.io.Writer) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setWriter(java.io.Writer) 
public	TokenNamepublic	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setTransformer(javax.xml.transform.Transformer) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setTransformer(javax.xml.transform.Transformer) 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#getTransformer() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#getTransformer() 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#flushPending() */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#flushPending() 
public	TokenNamepublic	
void	TokenNamevoid	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addAttributes(org.xml.sax.Attributes) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttributes(org.xml.sax.Attributes) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String) 
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
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#characters(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#characters(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#endElement(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#endElement(java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#startDocument() */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#startDocument() 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#startElement(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#startElement(java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#namespaceAfterStartElement(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#namespaceAfterStartElement(java.lang.String, java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#startPrefixMapping(java.lang.String, java.lang.String, boolean) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#startPrefixMapping(java.lang.String, java.lang.String, boolean) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#entityReference(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#entityReference(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#getNamespaceMappings() */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#getNamespaceMappings() 
public	TokenNamepublic	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#getPrefix(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#getPrefix(java.lang.String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#getNamespaceURI(java.lang.String, boolean) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#getNamespaceURI(java.lang.String, boolean) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#getNamespaceURIFromPrefix(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#getNamespaceURIFromPrefix(java.lang.String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURIFromPrefix	TokenNameIdentifier	 get Namespace URI From Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#setDocumentLocator(org.xml.sax.Locator) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#setDocumentLocator(org.xml.sax.Locator) 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#endDocument() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endDocument() 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#startPrefixMapping(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#startPrefixMapping(java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#endPrefixMapping(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endPrefixMapping(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#endElement(java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#characters(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#characters(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
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
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#ignorableWhitespace(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
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
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#processingInstruction(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#processingInstruction(java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ContentHandler#skippedEntity(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ContentHandler#skippedEntity(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedLexicalHandler#comment(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedLexicalHandler#comment(java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#startDTD(java.lang.String, java.lang.String, java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#endDTD() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#endDTD() 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#startEntity(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#startEntity(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#endEntity(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#endEntity(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#startCDATA() */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#startCDATA() 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.LexicalHandler#comment(char[], int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
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
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getDoctypePublic() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getDoctypePublic() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getDoctypeSystem() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getDoctypeSystem() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getEncoding() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getEncoding() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getIndent() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getIndent() 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getIndentAmount() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getIndentAmount() 
public	TokenNamepublic	
int	TokenNameint	
getIndentAmount	TokenNameIdentifier	 get Indent Amount
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getMediaType() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getMediaType() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getOmitXMLDeclaration() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getOmitXMLDeclaration() 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getStandalone() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getStandalone() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#getVersion() */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#getVersion() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setCdataSectionElements */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setCdataSectionElements 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
couldThrowException	TokenNameIdentifier	 could Throw Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setDoctype(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setDoctype(java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
system	TokenNameIdentifier	 system
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pub	TokenNameIdentifier	 pub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setDoctypePublic(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setDoctypePublic(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setDoctypeSystem(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setDoctypeSystem(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setEncoding(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setEncoding(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setMediaType(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setMediaType(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediatype	TokenNameIdentifier	 mediatype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setOmitXMLDeclaration(boolean) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setOmitXMLDeclaration(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLOutputAttributes#setStandalone(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see XSLOutputAttributes#setStandalone(java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#elementDecl(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#elementDecl(java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#attributeDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#attributeDecl(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
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
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg4	TokenNameIdentifier	 arg4
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#internalEntityDecl(java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#internalEntityDecl(java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ext.DeclHandler#externalEntityDecl(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ext.DeclHandler#externalEntityDecl(java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException) 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException) 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException) */	TokenNameCOMMENT_JAVADOC	 @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException) 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see Serializer#asDOMSerializer() */	TokenNameCOMMENT_JAVADOC	 @see Serializer#asDOMSerializer() 
public	TokenNamepublic	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
couldThrowIOException	TokenNameIdentifier	 could Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setNamespaceMappings(NamespaceMappings) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setNamespaceMappings(NamespaceMappings) 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaceMappings	TokenNameIdentifier	 set Namespace Mappings
(	TokenNameLPAREN	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
mappings	TokenNameIdentifier	 mappings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#setSourceLocator(javax.xml.transform.SourceLocator) 
public	TokenNamepublic	
void	TokenNamevoid	
setSourceLocator	TokenNameIdentifier	 set Source Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addUniqueAttribute(java.lang.String, java.lang.String, int) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addUniqueAttribute(java.lang.String, java.lang.String, int) 
public	TokenNamepublic	
void	TokenNamevoid	
addUniqueAttribute	TokenNameIdentifier	 add Unique Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#characters(org.w3c.dom.Node) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#characters(org.w3c.dom.Node) 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addXSLAttribute(java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addXSLAttribute(java.lang.String, java.lang.String, java.lang.String) 
public	TokenNamepublic	
void	TokenNamevoid	
addXSLAttribute	TokenNameIdentifier	 add XSL Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see ExtendedContentHandler#addAttribute(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
couldThrowSAXException	TokenNameIdentifier	 could Throw SAX Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see SerializationHandler#setDTDEntityExpansion(boolean) */	TokenNameCOMMENT_JAVADOC	 @see SerializationHandler#setDTDEntityExpansion(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDEntityExpansion	TokenNameIdentifier	 set DTD Entity Expansion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expand	TokenNameIdentifier	 expand
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputPropertyDefault	TokenNameIdentifier	 get Output Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
aMethodIsCalled	TokenNameIdentifier	 a Method Is Called
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xml.serializer.Serializer#asDOM3Serializer() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.serializer.Serializer#asDOM3Serializer() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
asDOM3Serializer	TokenNameIdentifier	 as DO M3 Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
couldThrowIOException	TokenNameIdentifier	 could Throw IO Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

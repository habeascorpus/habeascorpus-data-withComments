/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** * This class represents a generic input of a <tt>Transcoder</tt>. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: TranscoderInput.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a generic input of a <tt>Transcoder</tt>. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: TranscoderInput.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
{	TokenNameLBRACE	
/** * The optional XML reader to receive SAX events. */	TokenNameCOMMENT_JAVADOC	 The optional XML reader to receive SAX events. 
protected	TokenNameprotected	
XMLReader	TokenNameIdentifier	 XML Reader
xmlReader	TokenNameIdentifier	 xml Reader
;	TokenNameSEMICOLON	
/** * The optional input has a byte stream. */	TokenNameCOMMENT_JAVADOC	 The optional input has a byte stream. 
protected	TokenNameprotected	
InputStream	TokenNameIdentifier	 Input Stream
istream	TokenNameIdentifier	 istream
;	TokenNameSEMICOLON	
/** * The optional input as a character stream. */	TokenNameCOMMENT_JAVADOC	 The optional input as a character stream. 
protected	TokenNameprotected	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
/** * The optional input as XML Document. */	TokenNameCOMMENT_JAVADOC	 The optional input as XML Document. 
protected	TokenNameprotected	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The optional input as a URI. */	TokenNameCOMMENT_JAVADOC	 The optional input as a URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>TranscoderInput</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>TranscoderInput</tt>. 
public	TokenNamepublic	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderInput</tt> with the specified * XML reader. * @param xmlReader the XML reader of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderInput</tt> with the specified XML reader. @param xmlReader the XML reader of this transcoder input 
public	TokenNamepublic	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
xmlReader	TokenNameIdentifier	 xml Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xmlReader	TokenNameIdentifier	 xml Reader
=	TokenNameEQUAL	
xmlReader	TokenNameIdentifier	 xml Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderInput</tt> with the specified * byte stream input. * @param istream the byte stream of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderInput</tt> with the specified byte stream input. @param istream the byte stream of this transcoder input 
public	TokenNamepublic	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
istream	TokenNameIdentifier	 istream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
istream	TokenNameIdentifier	 istream
=	TokenNameEQUAL	
istream	TokenNameIdentifier	 istream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderInput</tt> with the specified * character stream. * @param reader the character stream of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderInput</tt> with the specified character stream. @param reader the character stream of this transcoder input 
public	TokenNamepublic	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderInput</tt> with the specified Document. * @param document the Document of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderInput</tt> with the specified Document. @param document the Document of this transcoder input 
public	TokenNamepublic	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderInput</tt> with the specified uri. * @param uri the URI of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderInput</tt> with the specified uri. @param uri the URI of this transcoder input 
public	TokenNamepublic	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the input of this transcoder input with the specified * XML reader. * @param xmlReader the XML reader of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Sets the input of this transcoder input with the specified XML reader. @param xmlReader the XML reader of this transcoder input 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLReader	TokenNameIdentifier	 set XML Reader
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
xmlReader	TokenNameIdentifier	 xml Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xmlReader	TokenNameIdentifier	 xml Reader
=	TokenNameEQUAL	
xmlReader	TokenNameIdentifier	 xml Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the XML reader of this transcoder or null if none was * supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the XML reader of this transcoder or null if none was supplied. 
public	TokenNamepublic	
XMLReader	TokenNameIdentifier	 XML Reader
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlReader	TokenNameIdentifier	 xml Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the input of this transcoder input with the specified * byte stream. * @param istream the byte stream of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Sets the input of this transcoder input with the specified byte stream. @param istream the byte stream of this transcoder input 
public	TokenNamepublic	
void	TokenNamevoid	
setInputStream	TokenNameIdentifier	 set Input Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
istream	TokenNameIdentifier	 istream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
istream	TokenNameIdentifier	 istream
=	TokenNameEQUAL	
istream	TokenNameIdentifier	 istream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the input of this transcoder as a byte stream or null * if none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the input of this transcoder as a byte stream or null if none was supplied. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
istream	TokenNameIdentifier	 istream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the input of this transcoder input with the specified * character stream. * @param reader the character stream of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Sets the input of this transcoder input with the specified character stream. @param reader the character stream of this transcoder input 
public	TokenNamepublic	
void	TokenNamevoid	
setReader	TokenNameIdentifier	 set Reader
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the input of this transcoder as a character stream or null * if none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the input of this transcoder as a character stream or null if none was supplied. 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the input of this transcoder input with the specified * document. * @param document the document of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Sets the input of this transcoder input with the specified document. @param document the document of this transcoder input 
public	TokenNamepublic	
void	TokenNamevoid	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the input of this transcoder as a document or null if * none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the input of this transcoder as a document or null if none was supplied. 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the input of this transcoder input with the specified URI. * @param uri the URI of this transcoder input */	TokenNameCOMMENT_JAVADOC	 Sets the input of this transcoder input with the specified URI. @param uri the URI of this transcoder input 
public	TokenNamepublic	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the input of this transcoder as a URI or null if none * was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the input of this transcoder as a URI or null if none was supplied. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
XMLFilter	TokenNameIdentifier	 XML Filter
;	TokenNameSEMICOLON	
/** * This class represents a single output for a <tt>Transcoder</tt>. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: TranscoderOutput.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a single output for a <tt>Transcoder</tt>. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: TranscoderOutput.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
{	TokenNameLBRACE	
/** * The optional XML filter where to send SAX events. */	TokenNameCOMMENT_JAVADOC	 The optional XML filter where to send SAX events. 
protected	TokenNameprotected	
XMLFilter	TokenNameIdentifier	 XML Filter
xmlFilter	TokenNameIdentifier	 xml Filter
;	TokenNameSEMICOLON	
/** * The optional output has a byte stream. */	TokenNameCOMMENT_JAVADOC	 The optional output has a byte stream. 
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
;	TokenNameSEMICOLON	
/** * The optional output as a character stream. */	TokenNameCOMMENT_JAVADOC	 The optional output as a character stream. 
protected	TokenNameprotected	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
/** * The optional output as XML Document. */	TokenNameCOMMENT_JAVADOC	 The optional output as XML Document. 
protected	TokenNameprotected	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * The optional output as a URI. */	TokenNameCOMMENT_JAVADOC	 The optional output as a URI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>TranscoderOutput</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>TranscoderOutput</tt>. 
public	TokenNamepublic	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderOutput</tt> with the specified * XML filter. * @param xmlFilter the XML filter of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderOutput</tt> with the specified XML filter. @param xmlFilter the XML filter of this transcoder output 
public	TokenNamepublic	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
XMLFilter	TokenNameIdentifier	 XML Filter
xmlFilter	TokenNameIdentifier	 xml Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xmlFilter	TokenNameIdentifier	 xml Filter
=	TokenNameEQUAL	
xmlFilter	TokenNameIdentifier	 xml Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderOutput</tt> with the specified * byte stream output. * @param ostream the byte stream of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderOutput</tt> with the specified byte stream output. @param ostream the byte stream of this transcoder output 
public	TokenNamepublic	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
ostream	TokenNameIdentifier	 ostream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderOutput</tt> with the specified * character stream. * @param writer the character stream of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderOutput</tt> with the specified character stream. @param writer the character stream of this transcoder output 
public	TokenNamepublic	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new <tt>TranscoderOutput</tt> with the specified Document. * @param document the Document of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderOutput</tt> with the specified Document. @param document the Document of this transcoder output 
public	TokenNamepublic	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
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
/** * Constructs a new <tt>TranscoderOutput</tt> with the specified uri. * @param uri the URI of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Constructs a new <tt>TranscoderOutput</tt> with the specified uri. @param uri the URI of this transcoder output 
public	TokenNamepublic	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
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
/** * Sets the output of this transcoder output with the specified * XML filter. * @param xmlFilter the XML filter of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Sets the output of this transcoder output with the specified XML filter. @param xmlFilter the XML filter of this transcoder output 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLFilter	TokenNameIdentifier	 set XML Filter
(	TokenNameLPAREN	
XMLFilter	TokenNameIdentifier	 XML Filter
xmlFilter	TokenNameIdentifier	 xml Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xmlFilter	TokenNameIdentifier	 xml Filter
=	TokenNameEQUAL	
xmlFilter	TokenNameIdentifier	 xml Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the output of this transcoder as a XML filter or null * if none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the output of this transcoder as a XML filter or null if none was supplied. 
public	TokenNamepublic	
XMLFilter	TokenNameIdentifier	 XML Filter
getXMLFilter	TokenNameIdentifier	 get XML Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlFilter	TokenNameIdentifier	 xml Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the output of this transcoder output with the specified * byte stream. * @param ostream the byte stream of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Sets the output of this transcoder output with the specified byte stream. @param ostream the byte stream of this transcoder output 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputStream	TokenNameIdentifier	 set Output Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
ostream	TokenNameIdentifier	 ostream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the output of this transcoder as a byte stream or null * if none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the output of this transcoder as a byte stream or null if none was supplied. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ostream	TokenNameIdentifier	 ostream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the output of this transcoder output with the specified * character stream. * @param writer the character stream of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Sets the output of this transcoder output with the specified character stream. @param writer the character stream of this transcoder output 
public	TokenNamepublic	
void	TokenNamevoid	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the output of this transcoder as a character stream or null * if none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the output of this transcoder as a character stream or null if none was supplied. 
public	TokenNamepublic	
Writer	TokenNameIdentifier	 Writer
getWriter	TokenNameIdentifier	 get Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the output of this transcoder output with the specified * document. * @param document the document of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Sets the output of this transcoder output with the specified document. @param document the document of this transcoder output 
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
/** * Returns the output of this transcoder as a document or null if * none was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the output of this transcoder as a document or null if none was supplied. 
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
/** * Sets the output of this transcoder output with the specified URI. * @param uri the URI of this transcoder output */	TokenNameCOMMENT_JAVADOC	 Sets the output of this transcoder output with the specified URI. @param uri the URI of this transcoder output 
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
/** * Returns the output of this transcoder as a URI or null if none * was supplied. */	TokenNameCOMMENT_JAVADOC	 Returns the output of this transcoder as a URI or null if none was supplied. 
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

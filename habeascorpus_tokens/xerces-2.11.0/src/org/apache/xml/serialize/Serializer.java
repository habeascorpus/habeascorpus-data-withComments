/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
DocumentHandler	TokenNameIdentifier	 Document Handler
;	TokenNameSEMICOLON	
/** * Interface for a DOM serializer implementation, factory for DOM and SAX * serializers, and static methods for serializing DOM documents. * <p> * To serialize a document using SAX events, create a compatible serializer * and pass it around as a {@link * org.xml.sax.DocumentHandler}. If an I/O error occurs while serializing, it will * be thrown by {@link DocumentHandler#endDocument}. The SAX serializer * may also be used as {@link org.xml.sax.DTDHandler}, {@link org.xml.sax.ext.DeclHandler} and * {@link org.xml.sax.ext.LexicalHandler}. * <p> * To serialize a DOM document or DOM element, create a compatible * serializer and call it's {@link * DOMSerializer#serialize(Document)} or {@link DOMSerializer#serialize(Element)} methods. * Both methods would produce a full XML document, to serizlie only * the portion of the document use {@link OutputFormat#setOmitXMLDeclaration} * and specify no document type. * <p> * The {@link OutputFormat} dictates what underlying serialized is used * to serialize the document based on the specified method. If the output * format or method are missing, the default is an XML serializer with * UTF-8 encoding and now indentation. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more * information. * @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a> * @see DocumentHandler * @see ContentHandler * @see OutputFormat * @see DOMSerializer */	TokenNameCOMMENT_JAVADOC	 Interface for a DOM serializer implementation, factory for DOM and SAX serializers, and static methods for serializing DOM documents. <p> To serialize a document using SAX events, create a compatible serializer and pass it around as a {@link org.xml.sax.DocumentHandler}. If an I/O error occurs while serializing, it will be thrown by {@link DocumentHandler#endDocument}. The SAX serializer may also be used as {@link org.xml.sax.DTDHandler}, {@link org.xml.sax.ext.DeclHandler} and {@link org.xml.sax.ext.LexicalHandler}. <p> To serialize a DOM document or DOM element, create a compatible serializer and call it's {@link DOMSerializer#serialize(Document)} or {@link DOMSerializer#serialize(Element)} methods. Both methods would produce a full XML document, to serizlie only the portion of the document use {@link OutputFormat#setOmitXMLDeclaration} and specify no document type. <p> The {@link OutputFormat} dictates what underlying serialized is used to serialize the document based on the specified method. If the output format or method are missing, the default is an XML serializer with UTF-8 encoding and now indentation. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a> @see DocumentHandler @see ContentHandler @see OutputFormat @see DOMSerializer 
public	TokenNamepublic	
interface	TokenNameinterface	
Serializer	TokenNameIdentifier	 Serializer
{	TokenNameLBRACE	
/** * Specifies an output stream to which the document should be * serialized. This method should not be called while the * serializer is in the process of serializing a document. */	TokenNameCOMMENT_JAVADOC	 Specifies an output stream to which the document should be serialized. This method should not be called while the serializer is in the process of serializing a document. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputByteStream	TokenNameIdentifier	 set Output Byte Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Specifies a writer to which the document should be serialized. * This method should not be called while the serializer is in * the process of serializing a document. */	TokenNameCOMMENT_JAVADOC	 Specifies a writer to which the document should be serialized. This method should not be called while the serializer is in the process of serializing a document. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputCharStream	TokenNameIdentifier	 set Output Char Stream
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Specifies an output format for this serializer. It the * serializer has already been associated with an output format, * it will switch to the new format. This method should not be * called while the serializer is in the process of serializing * a document. * * @param format The output format to use */	TokenNameCOMMENT_JAVADOC	 Specifies an output format for this serializer. It the serializer has already been associated with an output format, it will switch to the new format. This method should not be called while the serializer is in the process of serializing a document. * @param format The output format to use 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a {@link DocumentHandler} interface into this serializer. * If the serializer does not support the {@link DocumentHandler} * interface, it should return null. */	TokenNameCOMMENT_JAVADOC	 Return a {@link DocumentHandler} interface into this serializer. If the serializer does not support the {@link DocumentHandler} interface, it should return null. 
public	TokenNamepublic	
DocumentHandler	TokenNameIdentifier	 Document Handler
asDocumentHandler	TokenNameIdentifier	 as Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Return a {@link ContentHandler} interface into this serializer. * If the serializer does not support the {@link ContentHandler} * interface, it should return null. */	TokenNameCOMMENT_JAVADOC	 Return a {@link ContentHandler} interface into this serializer. If the serializer does not support the {@link ContentHandler} interface, it should return null. 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
asContentHandler	TokenNameIdentifier	 as Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Return a {@link DOMSerializer} interface into this serializer. * If the serializer does not support the {@link DOMSerializer} * interface, it should return null. */	TokenNameCOMMENT_JAVADOC	 Return a {@link DOMSerializer} interface into this serializer. If the serializer does not support the {@link DOMSerializer} interface, it should return null. 
public	TokenNamepublic	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
asDOMSerializer	TokenNameIdentifier	 as DOM Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

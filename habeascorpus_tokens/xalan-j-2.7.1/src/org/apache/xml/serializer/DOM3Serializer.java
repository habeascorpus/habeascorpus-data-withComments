/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id$ */	TokenNameCOMMENT_BLOCK	 $Id$ 
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
;	TokenNameSEMICOLON	
/** * This interface is not intended to be used * by an end user, but rather by an XML parser that is implementing the DOM * Level 3 Load and Save APIs. * <p> * * See the DOM Level 3 Load and Save interface at <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/load-save.html#LS-LSSerializer">LSSeializer</a>. * * For a list of configuration parameters for DOM Level 3 see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMConfiguration">DOMConfiguration</a>. * For additional configuration parameters available with the DOM Level 3 Load and Save API LSSerializer see * <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/load-save.html#LS-LSSerializer-config">LSerializer config</a>. * <p> * The following example uses a DOM3Serializer indirectly, through an an XML * parser that uses this class as part of its implementation of the DOM Level 3 * Load and Save APIs, and is the prefered way to serialize with DOM Level 3 APIs. * <p> * Example: * <pre> * public class TestDOM3 { * * public static void main(String args[]) throws Exception { * // Get document to serialize * TestDOM3 test = new TestDOM3(); * * // Serialize using standard DOM Level 3 Load/Save APIs * System.out.println(test.testDOM3LS()); * } * * public org.w3c.dom.Document getDocument() throws Exception { * // Create a simple DOM Document. * javax.xml.parsers.DocumentBuilderFactory factory = * javax.xml.parsers.DocumentBuilderFactory.newInstance(); * javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder(); * byte[] bytes = "<parent><child/></parent>".getBytes(); * java.io.InputStream is = new java.io.ByteArrayInputStream(bytes); * org.w3c.dom.Document doc = builder.parse(is); * return doc; * } * * // * // This method uses standard DOM Level 3 Load Save APIs: * // org.w3c.dom.bootstrap.DOMImplementationRegistry * // org.w3c.dom.ls.DOMImplementationLS * // org.w3c.dom.ls.DOMImplementationLS * // org.w3c.dom.ls.LSSerializer * // org.w3c.dom.DOMConfiguration * // * // The only thing non-standard in this method is the value set for the * // name of the class implementing the DOM Level 3 Load Save APIs, * // which in this case is: * // org.apache.xerces.dom.DOMImplementationSourceImpl * // * * public String testDOM3LS() throws Exception { * * // Get a simple DOM Document that will be serialized. * org.w3c.dom.Document docToSerialize = getDocument(); * * // Get a factory (DOMImplementationLS) for creating a Load and Save object. * org.w3c.dom.ls.DOMImplementationLS impl = * (org.w3c.dom.ls.DOMImplementationLS) * org.w3c.dom.bootstrap.DOMImplementationRegistry.newInstance().getDOMImplementation("LS"); * * // Use the factory to create an object (LSSerializer) used to * // write out or save the document. * org.w3c.dom.ls.LSSerializer writer = impl.createLSSerializer(); * org.w3c.dom.DOMConfiguration config = writer.getDomConfig(); * config.setParameter("format-pretty-print", Boolean.TRUE); * * // Use the LSSerializer to write out or serialize the document to a String. * String serializedXML = writer.writeToString(docToSerialize); * return serializedXML; * } * * } // end of class TestDOM3 * </pre> * * @see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMConfiguration">DOMConfiguration</a> * @see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/load-save.html#LS-LSSerializer-config">LSSerializer</a> * @see org.apache.xml.serializer.Serializer * @see org.apache.xml.serializer.DOMSerializer * * @xsl.usage advanced * */	TokenNameCOMMENT_JAVADOC	 This interface is not intended to be used by an end user, but rather by an XML parser that is implementing the DOM Level 3 Load and Save APIs. <p> * See the DOM Level 3 Load and Save interface at <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/load-save.html#LS-LSSerializer">LSSeializer</a>. * For a list of configuration parameters for DOM Level 3 see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMConfiguration">DOMConfiguration</a>. For additional configuration parameters available with the DOM Level 3 Load and Save API LSSerializer see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/load-save.html#LS-LSSerializer-config">LSerializer config</a>. <p> The following example uses a DOM3Serializer indirectly, through an an XML parser that uses this class as part of its implementation of the DOM Level 3 Load and Save APIs, and is the prefered way to serialize with DOM Level 3 APIs. <p> Example: <pre> public class TestDOM3 { * public static void main(String args[]) throws Exception { // Get document to serialize TestDOM3 test = new TestDOM3(); * // Serialize using standard DOM Level 3 Load/Save APIs System.out.println(test.testDOM3LS()); } * public org.w3c.dom.Document getDocument() throws Exception { // Create a simple DOM Document. javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance(); javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder(); byte[] bytes = "<parent><child/></parent>".getBytes(); java.io.InputStream is = new java.io.ByteArrayInputStream(bytes); org.w3c.dom.Document doc = builder.parse(is); return doc; } * // // This method uses standard DOM Level 3 Load Save APIs: // org.w3c.dom.bootstrap.DOMImplementationRegistry // org.w3c.dom.ls.DOMImplementationLS // org.w3c.dom.ls.DOMImplementationLS // org.w3c.dom.ls.LSSerializer // org.w3c.dom.DOMConfiguration // // The only thing non-standard in this method is the value set for the // name of the class implementing the DOM Level 3 Load Save APIs, // which in this case is: // org.apache.xerces.dom.DOMImplementationSourceImpl // * public String testDOM3LS() throws Exception { * // Get a simple DOM Document that will be serialized. org.w3c.dom.Document docToSerialize = getDocument(); * // Get a factory (DOMImplementationLS) for creating a Load and Save object. org.w3c.dom.ls.DOMImplementationLS impl = (org.w3c.dom.ls.DOMImplementationLS) org.w3c.dom.bootstrap.DOMImplementationRegistry.newInstance().getDOMImplementation("LS"); * // Use the factory to create an object (LSSerializer) used to // write out or save the document. org.w3c.dom.ls.LSSerializer writer = impl.createLSSerializer(); org.w3c.dom.DOMConfiguration config = writer.getDomConfig(); config.setParameter("format-pretty-print", Boolean.TRUE); * // Use the LSSerializer to write out or serialize the document to a String. String serializedXML = writer.writeToString(docToSerialize); return serializedXML; } * } // end of class TestDOM3 </pre> * @see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#DOMConfiguration">DOMConfiguration</a> @see <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-LS-20040407/load-save.html#LS-LSSerializer-config">LSSerializer</a> @see org.apache.xml.serializer.Serializer @see org.apache.xml.serializer.DOMSerializer * @xsl.usage advanced 
public	TokenNamepublic	
interface	TokenNameinterface	
DOM3Serializer	TokenNameIdentifier	 DO M3 Serializer
{	TokenNameLBRACE	
/** * Serializes the Level 3 DOM node. Throws an exception only if an I/O * exception occured while serializing. * * This interface is a public API. * * @param node the Level 3 DOM node to serialize * @throws IOException if an I/O exception occured while serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the Level 3 DOM node. Throws an exception only if an I/O exception occured while serializing. * This interface is a public API. * @param node the Level 3 DOM node to serialize @throws IOException if an I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serializeDOM3	TokenNameIdentifier	 serialize DO M3
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Sets a DOMErrorHandler on the DOM Level 3 Serializer. * * This interface is a public API. * * @param handler the Level 3 DOMErrorHandler */	TokenNameCOMMENT_JAVADOC	 Sets a DOMErrorHandler on the DOM Level 3 Serializer. * This interface is a public API. * @param handler the Level 3 DOMErrorHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a DOMErrorHandler set on the DOM Level 3 Serializer. * * This interface is a public API. * * @return A Level 3 DOMErrorHandler */	TokenNameCOMMENT_JAVADOC	 Returns a DOMErrorHandler set on the DOM Level 3 Serializer. * This interface is a public API. * @return A Level 3 DOMErrorHandler 
public	TokenNamepublic	
DOMErrorHandler	TokenNameIdentifier	 DOM Error Handler
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets a LSSerializerFilter on the DOM Level 3 Serializer to filter nodes * during serialization. * * This interface is a public API. * * @param filter the Level 3 LSSerializerFilter */	TokenNameCOMMENT_JAVADOC	 Sets a LSSerializerFilter on the DOM Level 3 Serializer to filter nodes during serialization. * This interface is a public API. * @param filter the Level 3 LSSerializerFilter 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeFilter	TokenNameIdentifier	 set Node Filter
(	TokenNameLPAREN	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a LSSerializerFilter set on the DOM Level 3 Serializer to filter nodes * during serialization. * * This interface is a public API. * * @return The Level 3 LSSerializerFilter */	TokenNameCOMMENT_JAVADOC	 Returns a LSSerializerFilter set on the DOM Level 3 Serializer to filter nodes during serialization. * This interface is a public API. * @return The Level 3 LSSerializerFilter 
public	TokenNamepublic	
LSSerializerFilter	TokenNameIdentifier	 LS Serializer Filter
getNodeFilter	TokenNameIdentifier	 get Node Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the end-of-line sequence of characters to be used during serialization * @param newLine The end-of-line sequence of characters to be used during serialization */	TokenNameCOMMENT_JAVADOC	 Sets the end-of-line sequence of characters to be used during serialization @param newLine The end-of-line sequence of characters to be used during serialization 
public	TokenNamepublic	
void	TokenNamevoid	
setNewLine	TokenNameIdentifier	 set New Line
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

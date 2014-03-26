/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMSerializer.java 475350 2006-11-15 18:39:15Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMSerializer.java 475350 2006-11-15 18:39:15Z minchau $ 
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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * Interface for a DOM serializer implementation. * <p> * The DOMSerializer is a facet of a serializer and is obtained from the * asDOMSerializer() method of the ({@link Serializer}) interface. * A serializer may or may not support a DOM serializer, if it does not then the * return value from asDOMSerializer() is null. * <p> * Example: * <pre> * // Create a document to be serialized * org.w3c.dom.Document doc = ...; * * // Create a Serializer that will be used * // to serialize the document * org.apache.xml.serializer.Serializer ser = ...; * * // Set the Writer to write output to, and * // serialize the DOM using that Serializer * java.io.StringWriter sw = new java.io.StringWriter(); * ser.setWriter(sw); * DOMSerialzier dser = ser.asDOMSerializer(); * dser.serialize(doc); * * // Write out the serialized XML in the String. * System.out.println(sw.toString()); * </pre> * * @see OutputPropertiesFactory * @see SerializerFactory * @see Serializer * * @xsl.usage general * */	TokenNameCOMMENT_JAVADOC	 Interface for a DOM serializer implementation. <p> The DOMSerializer is a facet of a serializer and is obtained from the asDOMSerializer() method of the ({@link Serializer}) interface. A serializer may or may not support a DOM serializer, if it does not then the return value from asDOMSerializer() is null. <p> Example: <pre> // Create a document to be serialized org.w3c.dom.Document doc = ...; * // Create a Serializer that will be used // to serialize the document org.apache.xml.serializer.Serializer ser = ...; * // Set the Writer to write output to, and // serialize the DOM using that Serializer java.io.StringWriter sw = new java.io.StringWriter(); ser.setWriter(sw); DOMSerialzier dser = ser.asDOMSerializer(); dser.serialize(doc); * // Write out the serialized XML in the String. System.out.println(sw.toString()); </pre> * @see OutputPropertiesFactory @see SerializerFactory @see Serializer * @xsl.usage general 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
{	TokenNameLBRACE	
/** * Serializes the DOM node. Throws an exception only if an I/O * exception occured while serializing. * * This interface is a public API. * * @param node the DOM node to serialize * @throws IOException if an I/O exception occured while serializing */	TokenNameCOMMENT_JAVADOC	 Serializes the DOM node. Throws an exception only if an I/O exception occured while serializing. * This interface is a public API. * @param node the DOM node to serialize @throws IOException if an I/O exception occured while serializing 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

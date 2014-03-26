/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
/** * An interface for encoders that do a pretty encoding of ZIP * filenames. * * <p>There are mostly two implementations, one that uses java.nio * {@link java.nio.charset.Charset Charset} and one implementation, * which copes with simple 8 bit charsets, because java-1.4 did not * support Cp437 in java.nio.</p> * * <p>The main reason for defining an own encoding layer comes from * the problems with {@link java.lang.String#getBytes(String) * String.getBytes}, which encodes unknown characters as ASCII * quotation marks ('?'). Quotation marks are per definition an * invalid filename on some operating systems like Windows, which * leads to ignored ZIP entries.</p> * * <p>All implementations should implement this interface in a * reentrant way.</p> */	TokenNameCOMMENT_JAVADOC	 An interface for encoders that do a pretty encoding of ZIP filenames. * <p>There are mostly two implementations, one that uses java.nio {@link java.nio.charset.Charset Charset} and one implementation, which copes with simple 8 bit charsets, because java-1.4 did not support Cp437 in java.nio.</p> * <p>The main reason for defining an own encoding layer comes from the problems with {@link java.lang.String#getBytes(String) String.getBytes}, which encodes unknown characters as ASCII quotation marks ('?'). Quotation marks are per definition an invalid filename on some operating systems like Windows, which leads to ignored ZIP entries.</p> * <p>All implementations should implement this interface in a reentrant way.</p> 
interface	TokenNameinterface	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
{	TokenNameLBRACE	
/** * Check, whether the given string may be losslessly encoded using this * encoding. * * @param name A filename or ZIP comment. * @return Whether the given name may be encoded with out any losses. */	TokenNameCOMMENT_JAVADOC	 Check, whether the given string may be losslessly encoded using this encoding. * @param name A filename or ZIP comment. @return Whether the given name may be encoded with out any losses. 
boolean	TokenNameboolean	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Encode a filename or a comment to a byte array suitable for * storing it to a serialized zip entry. * * <p>Examples for CP 437 (in pseudo-notation, right hand side is * C-style notation):</p> * <pre> * encode("Û…Š	TokenNameCOMMENT_JAVADOC	 
ByteBuffer	TokenNameIdentifier	 Byte Buffer
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * @param data The byte values to decode. * @return The decoded string. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 @param data The byte values to decode. @return The decoded string. @throws IOException 
String	TokenNameIdentifier	 String
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

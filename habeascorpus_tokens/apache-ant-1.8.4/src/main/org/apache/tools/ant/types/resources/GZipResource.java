/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
GZIPOutputStream	TokenNameIdentifier	 GZIP Output Stream
;	TokenNameSEMICOLON	
/** * A GZip compressed resource. * * <p>Wraps around another resource, delegates all queries to that * other resource but uncompresses/compresses streams on the fly.</p> * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 A GZip compressed resource. * <p>Wraps around another resource, delegates all queries to that other resource but uncompresses/compresses streams on the fly.</p> * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
GZipResource	TokenNameIdentifier	 G Zip Resource
extends	TokenNameextends	
CompressedResource	TokenNameIdentifier	 Compressed Resource
{	TokenNameLBRACE	
/** A no-arg constructor */	TokenNameCOMMENT_JAVADOC	 A no-arg constructor 
public	TokenNamepublic	
GZipResource	TokenNameIdentifier	 G Zip Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor with another resource to wrap. * @param other the resource to wrap. */	TokenNameCOMMENT_JAVADOC	 Constructor with another resource to wrap. @param other the resource to wrap. 
public	TokenNamepublic	
GZipResource	TokenNameIdentifier	 G Zip Resource
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceCollection	TokenNameIdentifier	 Resource Collection
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decompress on the fly using java.util.zip.GZIPInputStream. * @param in the stream to wrap. * @return the wrapped stream. * @throws IOException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Decompress on the fly using java.util.zip.GZIPInputStream. @param in the stream to wrap. @return the wrapped stream. @throws IOException if there is a problem. 
protected	TokenNameprotected	
InputStream	TokenNameIdentifier	 Input Stream
wrapStream	TokenNameIdentifier	 wrap Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compress on the fly using java.util.zip.GZIPOutStream. * @param out the stream to wrap. * @return the wrapped stream. * @throws IOException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Compress on the fly using java.util.zip.GZIPOutStream. @param out the stream to wrap. @return the wrapped stream. @throws IOException if there is a problem. 
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
wrapStream	TokenNameIdentifier	 wrap Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GZIPOutputStream	TokenNameIdentifier	 GZIP Output Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the compression method. * @return the string "GZip". */	TokenNameCOMMENT_JAVADOC	 Get the name of the compression method. @return the string "GZip". 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getCompressionName	TokenNameIdentifier	 get Compression Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"GZip"	TokenNameStringLiteral	GZip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

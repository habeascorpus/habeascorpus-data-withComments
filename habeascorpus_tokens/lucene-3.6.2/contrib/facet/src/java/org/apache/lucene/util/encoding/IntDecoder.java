package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Decodes integers from a set {@link InputStream}. For re-usability, the * decoder's input stream can be set by ({@link #reInit(InputStream)}). * By design, Decoders are NOT thread-safe. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Decodes integers from a set {@link InputStream}. For re-usability, the decoder's input stream can be set by ({@link #reInit(InputStream)}). By design, Decoders are NOT thread-safe. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IntDecoder	TokenNameIdentifier	 Int Decoder
{	TokenNameLBRACE	
/** A special long value which is used to indicate end-of-stream has reached. */	TokenNameCOMMENT_JAVADOC	 A special long value which is used to indicate end-of-stream has reached. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
EOS	TokenNameIdentifier	 EOS
=	TokenNameEQUAL	
0x100000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Input stream from which the encoded bytes are read */	TokenNameCOMMENT_JAVADOC	 Input stream from which the encoded bytes are read 
protected	TokenNameprotected	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** Sets the input stream from which the encoded data is read. */	TokenNameCOMMENT_JAVADOC	 Sets the input stream from which the encoded data is read. 
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decodes data received from the input stream, and returns one decoded * integer. If end of stream is reached, {@link #EOS} is returned. * * @return one decoded integer as long or {@link #EOS} if end-of-stream * reached. * @throws IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Decodes data received from the input stream, and returns one decoded integer. If end of stream is reached, {@link #EOS} is returned. * @return one decoded integer as long or {@link #EOS} if end-of-stream reached. @throws IOException if an I/O error occurs 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

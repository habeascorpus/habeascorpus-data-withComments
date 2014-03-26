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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Encodes integers to a set {@link OutputStream}. Extending classes need to * override {@link #encode(int)} to encode the value using their encoding * algorithm. The default implementation of {@link #close()} closes the set * {@link OutputStream}. * <p> * The default {@link #IntEncoder() constructor} is provided for convenience * only. One must call {@link #reInit(OutputStream)} before calling * {@link #encode(int)} or {@link #close()}. * <p> * For convenience, each encoder implements {@link #createMatchingDecoder()} for * easy access to the matching decoder. * <p> * <b>NOTE:</b> some implementations may buffer the encoded values in memory * (such as {@link IntEncoderFilter} implementations) and encoding will happen * only upon calling {@link #close()}. Therefore it is important to always call * {@link #close()} on the encoder at hand. * <p> * <b>NOTE:</b> encoders are usually not thread safe, unless specifically * documented otherwise by an implementation. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Encodes integers to a set {@link OutputStream}. Extending classes need to override {@link #encode(int)} to encode the value using their encoding algorithm. The default implementation of {@link #close()} closes the set {@link OutputStream}. <p> The default {@link #IntEncoder() constructor} is provided for convenience only. One must call {@link #reInit(OutputStream)} before calling {@link #encode(int)} or {@link #close()}. <p> For convenience, each encoder implements {@link #createMatchingDecoder()} for easy access to the matching decoder. <p> <b>NOTE:</b> some implementations may buffer the encoded values in memory (such as {@link IntEncoderFilter} implementations) and encoding will happen only upon calling {@link #close()}. Therefore it is important to always call {@link #close()} on the encoder at hand. <p> <b>NOTE:</b> encoders are usually not thread safe, unless specifically documented otherwise by an implementation. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IntEncoder	TokenNameIdentifier	 Int Encoder
{	TokenNameLBRACE	
protected	TokenNameprotected	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor, provided here for robustness: if in the future a * constructor with parameters will be added, this might break custom * implementations of this class which call this implicit constructor. So we * make it explicit to avoid any such issue in the future. */	TokenNameCOMMENT_JAVADOC	 Default constructor, provided here for robustness: if in the future a constructor with parameters will be added, this might break custom implementations of this class which call this implicit constructor. So we make it explicit to avoid any such issue in the future. 
public	TokenNamepublic	
IntEncoder	TokenNameIdentifier	 Int Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Instructs the encoder to finish the encoding process. This method closes * the output stream which was specified by {@link #reInit(OutputStream) * reInit}. An implementation may do here additional cleanup required to * complete the encoding, such as flushing internal buffers, etc.<br> * Once this method was called, no further calls to {@link #encode(int) * encode} should be made before first calling {@link #reInit(OutputStream) * reInit}. * <p> * <b>NOTE:</b> overriding classes should make sure they either call * <code>super.close()</code> or close the output stream themselves. */	TokenNameCOMMENT_JAVADOC	 Instructs the encoder to finish the encoding process. This method closes the output stream which was specified by {@link #reInit(OutputStream) reInit}. An implementation may do here additional cleanup required to complete the encoding, such as flushing internal buffers, etc.<br> Once this method was called, no further calls to {@link #encode(int) encode} should be made before first calling {@link #reInit(OutputStream) reInit}. <p> <b>NOTE:</b> overriding classes should make sure they either call <code>super.close()</code> or close the output stream themselves. 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Encodes an integer to the output stream given in * {@link #reInit(OutputStream) reInit} */	TokenNameCOMMENT_JAVADOC	 Encodes an integer to the output stream given in {@link #reInit(OutputStream) reInit} 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns an {@link IntDecoder} which matches this encoder. Every encoder * must return an {@link IntDecoder} and <code>null</code> is not a valid * value. If an encoder is just a filter, it should at least return its * wrapped encoder's matching decoder. * <p> * <b>NOTE:</b> this method should create a new instance of the matching * decoder and leave the instance sharing to the caller. Returning the same * instance over and over is risky because encoders and decoders are not * thread safe. */	TokenNameCOMMENT_JAVADOC	 Returns an {@link IntDecoder} which matches this encoder. Every encoder must return an {@link IntDecoder} and <code>null</code> is not a valid value. If an encoder is just a filter, it should at least return its wrapped encoder's matching decoder. <p> <b>NOTE:</b> this method should create a new instance of the matching decoder and leave the instance sharing to the caller. Returning the same instance over and over is risky because encoders and decoders are not thread safe. 
public	TokenNamepublic	
abstract	TokenNameabstract	
IntDecoder	TokenNameIdentifier	 Int Decoder
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reinitializes the encoder with the give {@link OutputStream}. For * re-usability it can be changed without the need to reconstruct a new * object. * <p> * <b>NOTE:</b> after calling {@link #close()}, one <u><i>must</i></u> call * this method even if the output stream itself hasn't changed. An example * case is that the output stream wraps a byte[], and the output stream itself * is reset, but its instance hasn't changed. Some implementations of * {@link IntEncoder} may write some metadata about themselves to the output * stream, and therefore it is imperative that one calls this method before * encoding any data. */	TokenNameCOMMENT_JAVADOC	 Reinitializes the encoder with the give {@link OutputStream}. For re-usability it can be changed without the need to reconstruct a new object. <p> <b>NOTE:</b> after calling {@link #close()}, one <u><i>must</i></u> call this method even if the output stream itself hasn't changed. An example case is that the output stream wraps a byte[], and the output stream itself is reset, but its instance hasn't changed. Some implementations of {@link IntEncoder} may write some metadata about themselves to the output stream, and therefore it is imperative that one calls this method before encoding any data. 
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

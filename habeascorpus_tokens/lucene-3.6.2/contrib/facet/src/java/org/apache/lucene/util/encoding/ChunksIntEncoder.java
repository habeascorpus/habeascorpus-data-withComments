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
/** * An {@link IntEncoder} which encodes values in chunks. Implementations of this * class assume the data which needs encoding consists of small, consecutive * values, and therefore the encoder is able to compress them better. You can * read more on the two implementations {@link FourFlagsIntEncoder} and * {@link EightFlagsIntEncoder}. * <p> * Extensions of this class need to implement {@link #encode(int)} in order to * build the proper indicator (flags). When enough values were accumulated * (typically the batch size), extensions can call {@link #encodeChunk()} to * flush the indicator and the rest of the values. * <p> * <b>NOTE:</b> flags encoders do not accept values &le; 0 (zero) in their * {@link #encode(int)}. For performance reasons they do not check that * condition, however if such value is passed the result stream may be corrupt * or an exception will be thrown. Also, these encoders perform the best when * there are many consecutive small values (depends on the encoder * implementation). If that is not the case, the encoder will occupy 1 more byte * for every <i>batch</i> number of integers, over whatever * {@link VInt8IntEncoder} would have occupied. Therefore make sure to check * whether your data fits into the conditions of the specific encoder. * <p> * For the reasons mentioned above, these encoders are usually chained with * {@link UniqueValuesIntEncoder} and {@link DGapIntEncoder} in the following * manner: <code><pre> * IntEncoder fourFlags = * new SortingEncoderFilter(new UniqueValuesIntEncoder(new DGapIntEncoder(new FlagsIntEncoderImpl()))); * </code></pre> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link IntEncoder} which encodes values in chunks. Implementations of this class assume the data which needs encoding consists of small, consecutive values, and therefore the encoder is able to compress them better. You can read more on the two implementations {@link FourFlagsIntEncoder} and {@link EightFlagsIntEncoder}. <p> Extensions of this class need to implement {@link #encode(int)} in order to build the proper indicator (flags). When enough values were accumulated (typically the batch size), extensions can call {@link #encodeChunk()} to flush the indicator and the rest of the values. <p> <b>NOTE:</b> flags encoders do not accept values &le; 0 (zero) in their {@link #encode(int)}. For performance reasons they do not check that condition, however if such value is passed the result stream may be corrupt or an exception will be thrown. Also, these encoders perform the best when there are many consecutive small values (depends on the encoder implementation). If that is not the case, the encoder will occupy 1 more byte for every <i>batch</i> number of integers, over whatever {@link VInt8IntEncoder} would have occupied. Therefore make sure to check whether your data fits into the conditions of the specific encoder. <p> For the reasons mentioned above, these encoders are usually chained with {@link UniqueValuesIntEncoder} and {@link DGapIntEncoder} in the following manner: <code><pre> IntEncoder fourFlags = new SortingEncoderFilter(new UniqueValuesIntEncoder(new DGapIntEncoder(new FlagsIntEncoderImpl()))); </code></pre> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ChunksIntEncoder	TokenNameIdentifier	 Chunks Int Encoder
extends	TokenNameextends	
IntEncoder	TokenNameIdentifier	 Int Encoder
{	TokenNameLBRACE	
/** Holds the values which must be encoded, outside the indicator. */	TokenNameCOMMENT_JAVADOC	 Holds the values which must be encoded, outside the indicator. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encodeQueue	TokenNameIdentifier	 encode Queue
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
encodeQueueSize	TokenNameIdentifier	 encode Queue Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Encoder used to encode values outside the indicator. */	TokenNameCOMMENT_JAVADOC	 Encoder used to encode values outside the indicator. 
protected	TokenNameprotected	
final	TokenNamefinal	
IntEncoder	TokenNameIdentifier	 Int Encoder
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
new	TokenNamenew	
VInt8IntEncoder	TokenNameIdentifier	 V Int8 Int Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Represents bits flag byte. */	TokenNameCOMMENT_JAVADOC	 Represents bits flag byte. 
protected	TokenNameprotected	
int	TokenNameint	
indicator	TokenNameIdentifier	 indicator
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Counts the current ordinal of the encoded value. */	TokenNameCOMMENT_JAVADOC	 Counts the current ordinal of the encoded value. 
protected	TokenNameprotected	
byte	TokenNamebyte	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ChunksIntEncoder	TokenNameIdentifier	 Chunks Int Encoder
(	TokenNameLPAREN	
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encodeQueue	TokenNameIdentifier	 encode Queue
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunkSize	TokenNameIdentifier	 chunk Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Encodes the values of the current chunk. First it writes the indicator, and * then it encodes the values outside the indicator. */	TokenNameCOMMENT_JAVADOC	 Encodes the values of the current chunk. First it writes the indicator, and then it encodes the values outside the indicator. 
protected	TokenNameprotected	
void	TokenNamevoid	
encodeChunk	TokenNameIdentifier	 encode Chunk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
indicator	TokenNameIdentifier	 indicator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
encodeQueueSize	TokenNameIdentifier	 encode Queue Size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
encodeQueue	TokenNameIdentifier	 encode Queue
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encodeQueueSize	TokenNameIdentifier	 encode Queue Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indicator	TokenNameIdentifier	 indicator
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
ordinal	TokenNameIdentifier	 ordinal
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encodeChunk	TokenNameIdentifier	 encode Chunk
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indicator	TokenNameIdentifier	 indicator
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
encodeQueueSize	TokenNameIdentifier	 encode Queue Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

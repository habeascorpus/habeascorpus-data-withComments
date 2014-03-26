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
/** * An {@link IntEncoderFilter} which encodes the gap between the given values, * rather than the values themselves. This encoder usually yields better * encoding performance space-wise (i.e., the final encoded values consume less * space) if the values are 'close' to each other. * <p> * <b>NOTE:</b> this encoder assumes the values are given to * {@link #encode(int)} in an ascending sorted manner, which ensures only * positive values are encoded and thus yields better performance. If you are * not sure whether the values are sorted or not, it is possible to chain this * encoder with {@link SortingIntEncoder} to ensure the values will be * sorted before encoding. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link IntEncoderFilter} which encodes the gap between the given values, rather than the values themselves. This encoder usually yields better encoding performance space-wise (i.e., the final encoded values consume less space) if the values are 'close' to each other. <p> <b>NOTE:</b> this encoder assumes the values are given to {@link #encode(int)} in an ascending sorted manner, which ensures only positive values are encoded and thus yields better performance. If you are not sure whether the values are sorted or not, it is possible to chain this encoder with {@link SortingIntEncoder} to ensure the values will be sorted before encoding. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DGapIntEncoder	TokenNameIdentifier	 D Gap Int Encoder
extends	TokenNameextends	
IntEncoderFilter	TokenNameIdentifier	 Int Encoder Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Initializes with the given encoder. */	TokenNameCOMMENT_JAVADOC	 Initializes with the given encoder. 
public	TokenNamepublic	
DGapIntEncoder	TokenNameIdentifier	 D Gap Int Encoder
(	TokenNameLPAREN	
IntEncoder	TokenNameIdentifier	 Int Encoder
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
IntDecoder	TokenNameIdentifier	 Int Decoder
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DGapIntDecoder	TokenNameIdentifier	 D Gap Int Decoder
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
super	TokenNamesuper	
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"DGap ("	TokenNameStringLiteral	DGap (
+	TokenNamePLUS	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

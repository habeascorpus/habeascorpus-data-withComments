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
/** * An {@link IntEncoderFilter} which ensures only unique values are encoded. The * implementation assumes the values given to {@link #encode(int)} are sorted. * If this is not the case, you can chain this encoder with * {@link SortingIntEncoder}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link IntEncoderFilter} which ensures only unique values are encoded. The implementation assumes the values given to {@link #encode(int)} are sorted. If this is not the case, you can chain this encoder with {@link SortingIntEncoder}. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UniqueValuesIntEncoder	TokenNameIdentifier	 Unique Values Int Encoder
extends	TokenNameextends	
IntEncoderFilter	TokenNameIdentifier	 Int Encoder Filter
{	TokenNameLBRACE	
/** * Denotes an illegal value which we can use to init 'prev' to. Since all * encoded values are integers, this value is init to MAX_INT+1 and is of type * long. Therefore we are guaranteed not to get this value in encode. */	TokenNameCOMMENT_JAVADOC	 Denotes an illegal value which we can use to init 'prev' to. Since all encoded values are integers, this value is init to MAX_INT+1 and is of type long. Therefore we are guaranteed not to get this value in encode. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ILLEGAL_VALUE	TokenNameIdentifier	 ILLEGAL  VALUE
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
ILLEGAL_VALUE	TokenNameIdentifier	 ILLEGAL  VALUE
;	TokenNameSEMICOLON	
/** Constructs a new instance with the given encoder. */	TokenNameCOMMENT_JAVADOC	 Constructs a new instance with the given encoder. 
public	TokenNamepublic	
UniqueValuesIntEncoder	TokenNameIdentifier	 Unique Values Int Encoder
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
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
encoder	TokenNameIdentifier	 encoder
.	TokenNameDOT	
createMatchingDecoder	TokenNameIdentifier	 create Matching Decoder
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
super	TokenNamesuper	
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
ILLEGAL_VALUE	TokenNameIdentifier	 ILLEGAL  VALUE
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
"Unique ("	TokenNameStringLiteral	Unique (
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

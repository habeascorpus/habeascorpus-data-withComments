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
/** * An {@link IntDecoder} which wraps another {@link IntDecoder} and reverts the * d-gap that was encoded by {@link DGapIntEncoder}. The wrapped decoder * performs the actual decoding, while this class simply adds the decoded value * to the previous value. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link IntDecoder} which wraps another {@link IntDecoder} and reverts the d-gap that was encoded by {@link DGapIntEncoder}. The wrapped decoder performs the actual decoding, while this class simply adds the decoded value to the previous value. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DGapIntDecoder	TokenNameIdentifier	 D Gap Int Decoder
extends	TokenNameextends	
IntDecoder	TokenNameIdentifier	 Int Decoder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DGapIntDecoder	TokenNameIdentifier	 D Gap Int Decoder
(	TokenNameLPAREN	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
decoder	TokenNameIdentifier	 decoder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
decode	TokenNameIdentifier	 decode
=	TokenNameEQUAL	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
decode	TokenNameIdentifier	 decode
==	TokenNameEQUAL_EQUAL	
EOS	TokenNameIdentifier	 EOS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EOS	TokenNameIdentifier	 EOS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
prev	TokenNameIdentifier	 prev
+=	TokenNamePLUS_EQUAL	
decode	TokenNameIdentifier	 decode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
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
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A simple stream decoder which can decode values encoded with * {@link SimpleIntEncoder}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A simple stream decoder which can decode values encoded with {@link SimpleIntEncoder}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SimpleIntDecoder	TokenNameIdentifier	 Simple Int Decoder
extends	TokenNameextends	
IntDecoder	TokenNameIdentifier	 Int Decoder
{	TokenNameLBRACE	
/** * reusable buffer - allocated only once as this is not a thread-safe object */	TokenNameCOMMENT_JAVADOC	 reusable buffer - allocated only once as this is not a thread-safe object 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
// we need exactly 4 bytes to decode an int in this decoder impl, otherwise, throw an exception 	TokenNameCOMMENT_LINE	we need exactly 4 bytes to decode an int in this decoder impl, otherwise, throw an exception 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nRead	TokenNameIdentifier	 n Read
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nRead	TokenNameIdentifier	 n Read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
(	TokenNameLPAREN	
"Need 4 bytes for decoding an int, got only "	TokenNameStringLiteral	Need 4 bytes for decoding an int, got only 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
EOS	TokenNameIdentifier	 EOS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
nRead	TokenNameIdentifier	 n Read
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
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
"Simple"	TokenNameStringLiteral	Simple
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

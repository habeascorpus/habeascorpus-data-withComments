package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Payload	TokenNameIdentifier	 Payload
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
CharBuffer	TokenNameIdentifier	 Char Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
Charset	TokenNameIdentifier	 Charset
;	TokenNameSEMICOLON	
/** * Does nothing other than convert the char array to a byte array using the specified encoding. * **/	TokenNameCOMMENT_JAVADOC	 Does nothing other than convert the char array to a byte array using the specified encoding. *
public	TokenNamepublic	
class	TokenNameclass	
IdentityEncoder	TokenNameIdentifier	 Identity Encoder
extends	TokenNameextends	
AbstractEncoder	TokenNameIdentifier	 Abstract Encoder
implements	TokenNameimplements	
PayloadEncoder	TokenNameIdentifier	 Payload Encoder
{	TokenNameLBRACE	
protected	TokenNameprotected	
Charset	TokenNameIdentifier	 Charset
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
Charset	TokenNameIdentifier	 Charset
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** @deprecated This field is no longer used. Use {@link #charset} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated This field is no longer used. Use {@link #charset} instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
charsetName	TokenNameIdentifier	 charset Name
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IdentityEncoder	TokenNameIdentifier	 Identity Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
IdentityEncoder	TokenNameIdentifier	 Identity Encoder
(	TokenNameLPAREN	
Charset	TokenNameIdentifier	 Charset
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
// @deprecated, remove this in 4.0: 	TokenNameCOMMENT_LINE	@deprecated, remove this in 4.0: 
charsetName	TokenNameIdentifier	 charset Name
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Payload	TokenNameIdentifier	 Payload
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
CharBuffer	TokenNameIdentifier	 Char Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
hasArray	TokenNameIdentifier	 has Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Payload	TokenNameIdentifier	 Payload
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// normally it should always have an array, but who knows? 	TokenNameCOMMENT_LINE	normally it should always have an array, but who knows? 
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Payload	TokenNameIdentifier	 Payload
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

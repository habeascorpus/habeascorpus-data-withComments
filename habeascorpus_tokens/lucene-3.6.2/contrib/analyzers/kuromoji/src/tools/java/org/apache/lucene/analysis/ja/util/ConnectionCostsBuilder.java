package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ConnectionCostsBuilder	TokenNameIdentifier	 Connection Costs Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
ConnectionCostsBuilder	TokenNameIdentifier	 Connection Costs Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ConnectionCostsWriter	TokenNameIdentifier	 Connection Costs Writer
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
inputStream	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Charset	TokenNameIdentifier	 Charset
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
Charset	TokenNameIdentifier	 Charset
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
newDecoder	TokenNameIdentifier	 new Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
onMalformedInput	TokenNameIdentifier	 on Malformed Input
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
.	TokenNameDOT	
onUnmappableCharacter	TokenNameIdentifier	 on Unmappable Character
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
streamReader	TokenNameIdentifier	 stream Reader
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
lineReader	TokenNameIdentifier	 line Reader
=	TokenNameEQUAL	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
streamReader	TokenNameIdentifier	 stream Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
lineReader	TokenNameIdentifier	 line Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dimensions	TokenNameIdentifier	 dimensions
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s+"	TokenNameStringLiteral	\s+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
dimensions	TokenNameIdentifier	 dimensions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
forwardSize	TokenNameIdentifier	 forward Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
dimensions	TokenNameIdentifier	 dimensions
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
backwardSize	TokenNameIdentifier	 backward Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
dimensions	TokenNameIdentifier	 dimensions
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
forwardSize	TokenNameIdentifier	 forward Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
backwardSize	TokenNameIdentifier	 backward Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ConnectionCostsWriter	TokenNameIdentifier	 Connection Costs Writer
costs	TokenNameIdentifier	 costs
=	TokenNameEQUAL	
new	TokenNamenew	
ConnectionCostsWriter	TokenNameIdentifier	 Connection Costs Writer
(	TokenNameLPAREN	
forwardSize	TokenNameIdentifier	 forward Size
,	TokenNameCOMMA	
backwardSize	TokenNameIdentifier	 backward Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
lineReader	TokenNameIdentifier	 line Reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\s+"	TokenNameStringLiteral	\s+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
forwardId	TokenNameIdentifier	 forward Id
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
backwardId	TokenNameIdentifier	 backward Id
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
costs	TokenNameIdentifier	 costs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
forwardId	TokenNameIdentifier	 forward Id
,	TokenNameCOMMA	
backwardId	TokenNameIdentifier	 backward Id
,	TokenNameCOMMA	
cost	TokenNameIdentifier	 cost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
costs	TokenNameIdentifier	 costs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

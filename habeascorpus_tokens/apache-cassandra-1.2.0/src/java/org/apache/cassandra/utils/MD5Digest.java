/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * The result of the computation of an MD5 digest. * * A MD5 is really just a byte[] but arrays are a no go as map keys. We could * wrap it in a ByteBuffer but: * 1. MD5Digest is a more explicit name than ByteBuffer to represent a md5. * 2. Using our own class allows to use our FastByteComparison for equals. */	TokenNameCOMMENT_JAVADOC	 The result of the computation of an MD5 digest. * A MD5 is really just a byte[] but arrays are a no go as map keys. We could wrap it in a ByteBuffer but: 1. MD5Digest is a more explicit name than ByteBuffer to represent a md5. 2. Using our own class allows to use our FastByteComparison for equals. 
public	TokenNamepublic	
class	TokenNameclass	
MD5Digest	TokenNameIdentifier	 M D5 Digest
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MD5Digest	TokenNameIdentifier	 M D5 Digest
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MD5Digest	TokenNameIdentifier	 M D5 Digest
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MD5Digest	TokenNameIdentifier	 M D5 Digest
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MD5Digest	TokenNameIdentifier	 M D5 Digest
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toHash	TokenNameIdentifier	 to Hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MD5Digest	TokenNameIdentifier	 M D5 Digest
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
threadLocalMD5Digest	TokenNameIdentifier	 thread Local M D5 Digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
toHash	TokenNameIdentifier	 to Hash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
MD5Digest	TokenNameIdentifier	 M D5 Digest
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
toHash	TokenNameIdentifier	 to Hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
toHash	TokenNameIdentifier	 to Hash
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
MD5Digest	TokenNameIdentifier	 M D5 Digest
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
MD5Digest	TokenNameIdentifier	 M D5 Digest
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MD5Digest	TokenNameIdentifier	 M D5 Digest
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
// handles nulls properly 	TokenNameCOMMENT_LINE	handles nulls properly 
return	TokenNamereturn	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
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
Hex	TokenNameIdentifier	 Hex
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

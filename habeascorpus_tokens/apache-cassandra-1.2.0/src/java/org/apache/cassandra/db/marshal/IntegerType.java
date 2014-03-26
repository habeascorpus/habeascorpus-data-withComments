/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
.	TokenNameDOT	
JdbcInteger	TokenNameIdentifier	 Jdbc Integer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IntegerType	TokenNameIdentifier	 Integer Type
extends	TokenNameextends	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IntegerType	TokenNameIdentifier	 Integer Type
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerType	TokenNameIdentifier	 Integer Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
findMostSignificantByte	TokenNameIdentifier	 find Most Significant Byte
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b0	TokenNameIdentifier	 b0
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b1	TokenNameIdentifier	 b1
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b1	TokenNameIdentifier	 b1
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IntegerType	TokenNameIdentifier	 Integer Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* singleton */	TokenNameCOMMENT_BLOCK	 singleton 
}	TokenNameRBRACE	
public	TokenNamepublic	
BigInteger	TokenNameIdentifier	 Big Integer
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcInteger	TokenNameIdentifier	 Jdbc Integer
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcInteger	TokenNameIdentifier	 Jdbc Integer
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
lhs	TokenNameIdentifier	 lhs
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lhsLen	TokenNameIdentifier	 lhs Len
=	TokenNameEQUAL	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rhsLen	TokenNameIdentifier	 rhs Len
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lhsLen	TokenNameIdentifier	 lhs Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
rhsLen	TokenNameIdentifier	 rhs Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsLen	TokenNameIdentifier	 rhs Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lhsMsbIdx	TokenNameIdentifier	 lhs Msb Idx
=	TokenNameEQUAL	
findMostSignificantByte	TokenNameIdentifier	 find Most Significant Byte
(	TokenNameLPAREN	
lhs	TokenNameIdentifier	 lhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rhsMsbIdx	TokenNameIdentifier	 rhs Msb Idx
=	TokenNameEQUAL	
findMostSignificantByte	TokenNameIdentifier	 find Most Significant Byte
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//diffs contain number of "meaningful" bytes (i.e. ignore padding) 	TokenNameCOMMENT_LINE	diffs contain number of "meaningful" bytes (i.e. ignore padding) 
int	TokenNameint	
lhsLenDiff	TokenNameIdentifier	 lhs Len Diff
=	TokenNameEQUAL	
lhsLen	TokenNameIdentifier	 lhs Len
-	TokenNameMINUS	
lhsMsbIdx	TokenNameIdentifier	 lhs Msb Idx
;	TokenNameSEMICOLON	
int	TokenNameint	
rhsLenDiff	TokenNameIdentifier	 rhs Len Diff
=	TokenNameEQUAL	
rhsLen	TokenNameIdentifier	 rhs Len
-	TokenNameMINUS	
rhsMsbIdx	TokenNameIdentifier	 rhs Msb Idx
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
lhsMsb	TokenNameIdentifier	 lhs Msb
=	TokenNameEQUAL	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
lhsMsbIdx	TokenNameIdentifier	 lhs Msb Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
rhsMsb	TokenNameIdentifier	 rhs Msb
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rhsMsbIdx	TokenNameIdentifier	 rhs Msb Idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* + - * ----------- * + | -d | 1 | * LHS ----------- * - | -1 | d | * ----------- * RHS * * d = difference of length in significant bytes */	TokenNameCOMMENT_BLOCK	 + - ----------- + | -d | 1 | LHS ----------- - | -1 | d | ----------- RHS * d = difference of length in significant bytes 
if	TokenNameif	
(	TokenNameLPAREN	
lhsLenDiff	TokenNameIdentifier	 lhs Len Diff
!=	TokenNameNOT_EQUAL	
rhsLenDiff	TokenNameIdentifier	 rhs Len Diff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lhsMsb	TokenNameIdentifier	 lhs Msb
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
rhsMsb	TokenNameIdentifier	 rhs Msb
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
rhsLenDiff	TokenNameIdentifier	 rhs Len Diff
-	TokenNameMINUS	
lhsLenDiff	TokenNameIdentifier	 lhs Len Diff
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rhsMsb	TokenNameIdentifier	 rhs Msb
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lhsLenDiff	TokenNameIdentifier	 lhs Len Diff
-	TokenNameMINUS	
rhsLenDiff	TokenNameIdentifier	 rhs Len Diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// msb uses signed comparison 	TokenNameCOMMENT_LINE	msb uses signed comparison 
if	TokenNameif	
(	TokenNameLPAREN	
lhsMsb	TokenNameIdentifier	 lhs Msb
!=	TokenNameNOT_EQUAL	
rhsMsb	TokenNameIdentifier	 rhs Msb
)	TokenNameRPAREN	
return	TokenNamereturn	
lhsMsb	TokenNameIdentifier	 lhs Msb
-	TokenNameMINUS	
rhsMsb	TokenNameIdentifier	 rhs Msb
;	TokenNameSEMICOLON	
lhsMsbIdx	TokenNameIdentifier	 lhs Msb Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
rhsMsbIdx	TokenNameIdentifier	 rhs Msb Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// remaining bytes are compared unsigned 	TokenNameCOMMENT_LINE	remaining bytes are compared unsigned 
while	TokenNamewhile	
(	TokenNameLPAREN	
lhsMsbIdx	TokenNameIdentifier	 lhs Msb Idx
<	TokenNameLESS	
lhsLen	TokenNameIdentifier	 lhs Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lhsMsb	TokenNameIdentifier	 lhs Msb
=	TokenNameEQUAL	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
lhsMsbIdx	TokenNameIdentifier	 lhs Msb Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhsMsb	TokenNameIdentifier	 rhs Msb
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
rhsMsbIdx	TokenNameIdentifier	 rhs Msb Idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lhsMsb	TokenNameIdentifier	 lhs Msb
!=	TokenNameNOT_EQUAL	
rhsMsb	TokenNameIdentifier	 rhs Msb
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
lhsMsb	TokenNameIdentifier	 lhs Msb
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
rhsMsb	TokenNameIdentifier	 rhs Msb
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JdbcInteger	TokenNameIdentifier	 Jdbc Integer
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
// Return an empty ByteBuffer for an empty string. 	TokenNameCOMMENT_LINE	Return an empty ByteBuffer for an empty string. 
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
integerType	TokenNameIdentifier	 integer Type
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
integerType	TokenNameIdentifier	 integer Type
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"unable to make int from '%s'"	TokenNameStringLiteral	unable to make int from '%s'
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
integerType	TokenNameIdentifier	 integer Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
// no invalid integers. 	TokenNameCOMMENT_LINE	no invalid integers. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	

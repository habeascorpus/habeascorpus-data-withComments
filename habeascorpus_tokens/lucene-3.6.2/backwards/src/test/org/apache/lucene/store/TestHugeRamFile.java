package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** Test huge RAMFile with more than Integer.MAX_VALUE bytes. */	TokenNameCOMMENT_JAVADOC	 Test huge RAMFile with more than Integer.MAX_VALUE bytes. 
public	TokenNamepublic	
class	TokenNameclass	
TestHugeRamFile	TokenNameIdentifier	 Test Huge Ram File
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
/** Fake a huge ram file by using the same byte buffer for all * buffers under maxint. */	TokenNameCOMMENT_JAVADOC	 Fake a huge ram file by using the same byte buffer for all buffers under maxint. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DenseRAMFile	TokenNameIdentifier	 Dense RAM File
extends	TokenNameextends	
RAMFile	TokenNameIdentifier	 RAM File
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
singleBuffers	TokenNameIdentifier	 single Buffers
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBuffer	TokenNameIdentifier	 new Buffer
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
capacity	TokenNameIdentifier	 capacity
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
<=	TokenNameLESS_EQUAL	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// below maxint we reuse buffers 	TokenNameCOMMENT_LINE	below maxint we reuse buffers 
byte	TokenNamebyte	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
singleBuffers	TokenNameIdentifier	 single Buffers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//System.out.println("allocate: "+size); 	TokenNameCOMMENT_LINE	System.out.println("allocate: "+size); 
singleBuffers	TokenNameIdentifier	 single Buffers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("allocate: "+size); System.out.flush(); 	TokenNameCOMMENT_LINE	System.out.println("allocate: "+size); System.out.flush(); 
return	TokenNamereturn	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Test huge RAMFile with more than Integer.MAX_VALUE bytes. (LUCENE-957) */	TokenNameCOMMENT_JAVADOC	 Test huge RAMFile with more than Integer.MAX_VALUE bytes. (LUCENE-957) 
public	TokenNamepublic	
void	TokenNamevoid	
testHugeFile	TokenNameIdentifier	 test Huge File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
DenseRAMFile	TokenNameIdentifier	 Dense RAM File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
DenseRAMFile	TokenNameIdentifier	 Dense RAM File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// output part 	TokenNameCOMMENT_LINE	output part 
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b1	TokenNameIdentifier	 b1
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b2	TokenNameIdentifier	 b2
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
RAMOutputStream	TokenNameIdentifier	 RAM Output Stream
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x0007F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x0003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"output length must match"	TokenNameStringLiteral	output length must match
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"output length must match"	TokenNameStringLiteral	output length must match
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("after writing b1's, length = "+out.length()+" (MAX_VALUE="+MAX_VALUE+")"); 	TokenNameCOMMENT_LINE	System.out.println("after writing b1's, length = "+out.length()+" (MAX_VALUE="+MAX_VALUE+")"); 
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
long	TokenNamelong	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
L	TokenNameIdentifier	 L
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b2	TokenNameIdentifier	 b2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"output length must match"	TokenNameStringLiteral	output length must match
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// input part 	TokenNameCOMMENT_LINE	input part 
RAMInputStream	TokenNameIdentifier	 RAM Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
RAMInputStream	TokenNameIdentifier	 RAM Input Stream
(	TokenNameLPAREN	
"testcase"	TokenNameStringLiteral	testcase
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"input length must match"	TokenNameStringLiteral	input length must match
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("input length = "+in.length()+" % 1024 = "+in.length()%1024); 	TokenNameCOMMENT_LINE	System.out.println("input length = "+in.length()+" % 1024 = "+in.length()%1024); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
L	TokenNameIdentifier	 L
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
(	TokenNameLPAREN	
L	TokenNameIdentifier	 L
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
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
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
bt	TokenNameIdentifier	 bt
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x0003F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"must read same value that was written! j="	TokenNameStringLiteral	must read same value that was written! j=
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" i="	TokenNameStringLiteral	 i=
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
bt	TokenNameIdentifier	 bt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
textui	TokenNameIdentifier	 textui
.	TokenNameDOT	
TestRunner	TokenNameIdentifier	 Test Runner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestSortedVIntList	TokenNameIdentifier	 Test Sorted V Int List
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** Main for running test case by itself. */	TokenNameCOMMENT_JAVADOC	 Main for running test case by itself. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestRunner	TokenNameIdentifier	 Test Runner
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
TestSortedVIntList	TokenNameIdentifier	 Test Sorted V Int List
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
tstIterator	TokenNameIdentifier	 tst Iterator
(	TokenNameLPAREN	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
vintList	TokenNameIdentifier	 vint List
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// DocNrSkipper should not skip to same document. 	TokenNameCOMMENT_LINE	DocNrSkipper should not skip to same document. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
vintList	TokenNameIdentifier	 vint List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"No end of Matcher at: "	TokenNameStringLiteral	No end of Matcher at: 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"End of Matcher"	TokenNameStringLiteral	End of Matcher
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
tstVIntList	TokenNameIdentifier	 tst V Int List
(	TokenNameLPAREN	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
vintList	TokenNameIdentifier	 vint List
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
int	TokenNameint	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Size"	TokenNameStringLiteral	Size
,	TokenNameCOMMA	
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
vintList	TokenNameIdentifier	 vint List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Byte size"	TokenNameStringLiteral	Byte size
,	TokenNameCOMMA	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
,	TokenNameCOMMA	
vintList	TokenNameIdentifier	 vint List
.	TokenNameDOT	
getByteSize	TokenNameIdentifier	 get Byte Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstIterator	TokenNameIdentifier	 tst Iterator
(	TokenNameLPAREN	
vintList	TokenNameIdentifier	 vint List
,	TokenNameCOMMA	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tstViaBitSet	TokenNameIdentifier	 tst Via Bit Set
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
int	TokenNameint	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
MAX_INT_FOR_BITSET	TokenNameIdentifier	 MAX  INT  FOR  BITSET
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
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
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
MAX_INT_FOR_BITSET	TokenNameIdentifier	 MAX  INT  FOR  BITSET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// BitSet takes too much memory 	TokenNameCOMMENT_LINE	BitSet takes too much memory 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// BitSet cannot store duplicate. 	TokenNameCOMMENT_LINE	BitSet cannot store duplicate. 
}	TokenNameRBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
svil	TokenNameIdentifier	 svil
=	TokenNameEQUAL	
new	TokenNamenew	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstVIntList	TokenNameIdentifier	 tst V Int List
(	TokenNameLPAREN	
svil	TokenNameIdentifier	 svil
,	TokenNameCOMMA	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstVIntList	TokenNameIdentifier	 tst V Int List
(	TokenNameLPAREN	
new	TokenNamenew	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
svil	TokenNameIdentifier	 svil
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VB1	TokenNameIdentifier	 V B1
=	TokenNameEQUAL	
0x7F	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VB2	TokenNameIdentifier	 V B2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VB1	TokenNameIdentifier	 V B1
<<	TokenNameLEFT_SHIFT	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
)	TokenNameRPAREN	
|	TokenNameOR	
VB1	TokenNameIdentifier	 V B1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VB3	TokenNameIdentifier	 V B3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VB2	TokenNameIdentifier	 V B2
<<	TokenNameLEFT_SHIFT	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
)	TokenNameRPAREN	
|	TokenNameOR	
VB1	TokenNameIdentifier	 V B1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VB4	TokenNameIdentifier	 V B4
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VB3	TokenNameIdentifier	 V B3
<<	TokenNameLEFT_SHIFT	
BIT_SHIFT	TokenNameIdentifier	 BIT  SHIFT
)	TokenNameRPAREN	
|	TokenNameOR	
VB1	TokenNameIdentifier	 V B1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
vIntByteSize	TokenNameIdentifier	 v Int Byte Size
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
VB1	TokenNameIdentifier	 V B1
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
VB2	TokenNameIdentifier	 V B2
)	TokenNameRPAREN	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
VB3	TokenNameIdentifier	 V B3
)	TokenNameRPAREN	
return	TokenNamereturn	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
VB4	TokenNameIdentifier	 V B4
)	TokenNameRPAREN	
return	TokenNamereturn	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
vIntListByteSize	TokenNameIdentifier	 v Int List Byte Size
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
byteSize	TokenNameIdentifier	 byte Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byteSize	TokenNameIdentifier	 byte Size
+=	TokenNamePLUS_EQUAL	
vIntByteSize	TokenNameIdentifier	 v Int Byte Size
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
byteSize	TokenNameIdentifier	 byte Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
=	TokenNameEQUAL	
vIntListByteSize	TokenNameIdentifier	 v Int List Byte Size
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
tstVIntList	TokenNameIdentifier	 tst V Int List
(	TokenNameLPAREN	
new	TokenNamenew	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstViaBitSet	TokenNameIdentifier	 tst Via Bit Set
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
,	TokenNameCOMMA	
expectedByteSize	TokenNameIdentifier	 expected Byte Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tstIllegalArgExc	TokenNameIdentifier	 tst Illegal Arg Exc
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected IllegalArgumentException"	TokenNameStringLiteral	Expected IllegalArgumentException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fibArray	TokenNameIdentifier	 fib Array
(	TokenNameLPAREN	
int	TokenNameint	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fib	TokenNameIdentifier	 fib
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fib	TokenNameIdentifier	 fib
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
fib	TokenNameIdentifier	 fib
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fib	TokenNameIdentifier	 fib
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fib	TokenNameIdentifier	 fib
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
fib	TokenNameIdentifier	 fib
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fib	TokenNameIdentifier	 fib
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reverseDiffs	TokenNameIdentifier	 reverse Diffs
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// reverse the order of the successive differences 	TokenNameCOMMENT_LINE	reverse the order of the successive differences 
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test01	TokenNameIdentifier	 test01
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test02	TokenNameIdentifier	 test02
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test04a	TokenNameIdentifier	 test04a
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB2	TokenNameIdentifier	 V B2
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test04b	TokenNameIdentifier	 test04b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB2	TokenNameIdentifier	 V B2
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test04c	TokenNameIdentifier	 test04c
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB2	TokenNameIdentifier	 V B2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test05	TokenNameIdentifier	 test05
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
fibArray	TokenNameIdentifier	 fib Array
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// includes duplicate value 1 	TokenNameCOMMENT_LINE	includes duplicate value 1 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test05b	TokenNameIdentifier	 test05b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
reverseDiffs	TokenNameIdentifier	 reverse Diffs
(	TokenNameLPAREN	
fibArray	TokenNameIdentifier	 fib Array
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test06	TokenNameIdentifier	 test06
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
fibArray	TokenNameIdentifier	 fib Array
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no duplicates, size 46 exceeds max int. 	TokenNameCOMMENT_LINE	no duplicates, size 46 exceeds max int. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test06b	TokenNameIdentifier	 test06b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
reverseDiffs	TokenNameIdentifier	 reverse Diffs
(	TokenNameLPAREN	
fibArray	TokenNameIdentifier	 fib Array
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
45	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test07a	TokenNameIdentifier	 test07a
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB3	TokenNameIdentifier	 V B3
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test07b	TokenNameIdentifier	 test07b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB3	TokenNameIdentifier	 V B3
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test07c	TokenNameIdentifier	 test07c
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB3	TokenNameIdentifier	 V B3
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test08a	TokenNameIdentifier	 test08a
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB4	TokenNameIdentifier	 V B4
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test08b	TokenNameIdentifier	 test08b
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB4	TokenNameIdentifier	 V B4
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test08c	TokenNameIdentifier	 test08c
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstInts	TokenNameIdentifier	 tst Ints
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
VB4	TokenNameIdentifier	 V B4
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test10	TokenNameIdentifier	 test10
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstIllegalArgExc	TokenNameIdentifier	 tst Illegal Arg Exc
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test11	TokenNameIdentifier	 test11
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstIllegalArgExc	TokenNameIdentifier	 tst Illegal Arg Exc
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test12	TokenNameIdentifier	 test12
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tstIllegalArgExc	TokenNameIdentifier	 tst Illegal Arg Exc
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test13Allocation	TokenNameIdentifier	 test13 Allocation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// SortedVIntList initial byte size is 128 	TokenNameCOMMENT_LINE	SortedVIntList initial byte size is 128 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
107	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tstIterator	TokenNameIdentifier	 tst Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
SortedVIntList	TokenNameIdentifier	 Sorted V Int List
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

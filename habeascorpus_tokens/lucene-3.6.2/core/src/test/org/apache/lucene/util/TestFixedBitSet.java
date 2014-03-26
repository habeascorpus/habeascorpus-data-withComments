/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
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
TestFixedBitSet	TokenNameIdentifier	 Test Fixed Bit Set
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
void	TokenNamevoid	
doGet	TokenNameIdentifier	 do Get
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"mismatch: BitSet=["	TokenNameStringLiteral	mismatch: BitSet=[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
doNextSetBit	TokenNameIdentifier	 do Next Set Bit
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
<	TokenNameLESS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
doPrevSetBit	TokenNameIdentifier	 do Prev Set Bit
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
aa	TokenNameIdentifier	 aa
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
// aa = a.prevSetBit(aa-1); 	TokenNameCOMMENT_LINE	aa = a.prevSetBit(aa-1); 
aa	TokenNameIdentifier	 aa
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aa	TokenNameIdentifier	 aa
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
prevSetBit	TokenNameIdentifier	 prev Set Bit
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
prevSetBit	TokenNameIdentifier	 prev Set Bit
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// test interleaving different FixedBitSetIterator.next()/skipTo() 	TokenNameCOMMENT_LINE	test interleaving different FixedBitSetIterator.next()/skipTo() 
void	TokenNamevoid	
doIterate	TokenNameIdentifier	 do Iterate
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
doIterate1	TokenNameIdentifier	 do Iterate1
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
doIterate2	TokenNameIdentifier	 do Iterate2
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
doIterate1	TokenNameIdentifier	 do Iterate1
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
<	TokenNameLESS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
:	TokenNameCOLON	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
doIterate2	TokenNameIdentifier	 do Iterate2
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
:	TokenNameCOLON	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
doRandomSets	TokenNameIdentifier	 do Random Sets
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
,	TokenNameCOMMA	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
null	TokenNamenull	
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
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
BitSet	TokenNameIdentifier	 Bit Set
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test the various ways of setting bits 	TokenNameCOMMENT_LINE	test the various ways of setting bits 
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nOper	TokenNameIdentifier	 n Oper
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
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
nOper	TokenNameIdentifier	 n Oper
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
getAndSet	TokenNameIdentifier	 get And Set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// test that the various ways of accessing the bits are equivalent 	TokenNameCOMMENT_LINE	test that the various ways of accessing the bits are equivalent 
doGet	TokenNameIdentifier	 do Get
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test ranges, including possible extension 	TokenNameCOMMENT_LINE	test ranges, including possible extension 
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
;	TokenNameSEMICOLON	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toIndex	TokenNameIdentifier	 to Index
=	TokenNameEQUAL	
fromIndex	TokenNameIdentifier	 from Index
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doIterate	TokenNameIdentifier	 do Iterate
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a problem here is from flip or doIterate 	TokenNameCOMMENT_LINE	a problem here is from flip or doIterate 
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toIndex	TokenNameIdentifier	 to Index
=	TokenNameEQUAL	
fromIndex	TokenNameIdentifier	 from Index
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doNextSetBit	TokenNameIdentifier	 do Next Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a problem here is from clear() or nextSetBit 	TokenNameCOMMENT_LINE	a problem here is from clear() or nextSetBit 
doPrevSetBit	TokenNameIdentifier	 do Prev Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toIndex	TokenNameIdentifier	 to Index
=	TokenNameEQUAL	
fromIndex	TokenNameIdentifier	 from Index
+	TokenNamePLUS	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa	TokenNameIdentifier	 aa
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doNextSetBit	TokenNameIdentifier	 do Next Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a problem here is from set() or nextSetBit 	TokenNameCOMMENT_LINE	a problem here is from set() or nextSetBit 
doPrevSetBit	TokenNameIdentifier	 do Prev Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
b0	TokenNameIdentifier	 b0
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
a_and	TokenNameIdentifier	 a and
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a_and	TokenNameIdentifier	 a and
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
a_or	TokenNameIdentifier	 a or
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a_or	TokenNameIdentifier	 a or
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
a_andn	TokenNameIdentifier	 a andn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a_andn	TokenNameIdentifier	 a andn
.	TokenNameDOT	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b_and	TokenNameIdentifier	 b and
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b_and	TokenNameIdentifier	 b and
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b_and	TokenNameIdentifier	 b and
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b_or	TokenNameIdentifier	 b or
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b_or	TokenNameIdentifier	 b or
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b_andn	TokenNameIdentifier	 b andn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b_andn	TokenNameIdentifier	 b andn
.	TokenNameDOT	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a_or	TokenNameIdentifier	 a or
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b_or	TokenNameIdentifier	 b or
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doIterate	TokenNameIdentifier	 do Iterate
(	TokenNameLPAREN	
a_and	TokenNameIdentifier	 a and
,	TokenNameCOMMA	
b_and	TokenNameIdentifier	 b and
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doIterate	TokenNameIdentifier	 do Iterate
(	TokenNameLPAREN	
a_or	TokenNameIdentifier	 a or
,	TokenNameCOMMA	
b_or	TokenNameIdentifier	 b or
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doIterate	TokenNameIdentifier	 do Iterate
(	TokenNameLPAREN	
a_andn	TokenNameIdentifier	 a andn
,	TokenNameCOMMA	
b_andn	TokenNameIdentifier	 b andn
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a_and	TokenNameIdentifier	 a and
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b_and	TokenNameIdentifier	 b and
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a_or	TokenNameIdentifier	 a or
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b_or	TokenNameIdentifier	 b or
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a_andn	TokenNameIdentifier	 a andn
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b_andn	TokenNameIdentifier	 b andn
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
b0	TokenNameIdentifier	 b0
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// large enough to flush obvious bugs, small enough to run in <.5 sec as part of a 	TokenNameCOMMENT_LINE	large enough to flush obvious bugs, small enough to run in <.5 sec as part of a 
// larger testsuite. 	TokenNameCOMMENT_LINE	larger testsuite. 
public	TokenNamepublic	
void	TokenNamevoid	
testSmall	TokenNameIdentifier	 test Small
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
doRandomSets	TokenNameIdentifier	 do Random Sets
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doRandomSets	TokenNameIdentifier	 do Random Sets
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// uncomment to run a bigger test (~2 minutes). 	TokenNameCOMMENT_LINE	uncomment to run a bigger test (~2 minutes). 
/* public void testBig() { doRandomSets(2000,200000, 1); doRandomSets(2000,200000, 2); } */	TokenNameCOMMENT_BLOCK	 public void testBig() { doRandomSets(2000,200000, 1); doRandomSets(2000,200000, 2); } 
public	TokenNamepublic	
void	TokenNamevoid	
testEquals	TokenNameIdentifier	 test Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This test can't handle numBits==0: 	TokenNameCOMMENT_LINE	This test can't handle numBits==0: 
final	TokenNamefinal	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// try different type of object 	TokenNameCOMMENT_LINE	try different type of object 
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHashCodeEquals	TokenNameIdentifier	 test Hash Code Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This test can't handle numBits==0: 	TokenNameCOMMENT_LINE	This test can't handle numBits==0: 
final	TokenNamefinal	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSmallBitSets	TokenNameIdentifier	 test Small Bit Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure size 0-10 bit sets are OK: 	TokenNameCOMMENT_LINE	Make sure size 0-10 bit sets are OK: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numBits	TokenNameIdentifier	 num Bits
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numBits	TokenNameIdentifier	 num Bits
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
makeFixedBitSet	TokenNameIdentifier	 make Fixed Bit Set
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bs	TokenNameIdentifier	 bs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
BitSet	TokenNameIdentifier	 Bit Set
makeBitSet	TokenNameIdentifier	 make Bit Set
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bs	TokenNameIdentifier	 bs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bs	TokenNameIdentifier	 bs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkPrevSetBitArray	TokenNameIdentifier	 check Prev Set Bit Array
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
makeFixedBitSet	TokenNameIdentifier	 make Fixed Bit Set
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
numBits	TokenNameIdentifier	 num Bits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BitSet	TokenNameIdentifier	 Bit Set
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
makeBitSet	TokenNameIdentifier	 make Bit Set
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doPrevSetBit	TokenNameIdentifier	 do Prev Set Bit
(	TokenNameLPAREN	
bs	TokenNameIdentifier	 bs
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPrevSetBit	TokenNameIdentifier	 test Prev Set Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkPrevSetBitArray	TokenNameIdentifier	 check Prev Set Bit Array
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkPrevSetBitArray	TokenNameIdentifier	 check Prev Set Bit Array
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkPrevSetBitArray	TokenNameIdentifier	 check Prev Set Bit Array
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

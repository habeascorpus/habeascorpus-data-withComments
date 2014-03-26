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
TestOpenBitSet	TokenNameIdentifier	 Test Open Bit Set
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
void	TokenNamevoid	
doGet	TokenNameIdentifier	 do Get
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
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
doGetFast	TokenNameIdentifier	 do Get Fast
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
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
fastGet	TokenNameIdentifier	 fast Get
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
fastGet	TokenNameIdentifier	 fast Get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
doNextSetBitLong	TokenNameIdentifier	 do Next Set Bit Long
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
prevSetBit	TokenNameIdentifier	 prev Set Bit
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
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
doPrevSetBitLong	TokenNameIdentifier	 do Prev Set Bit Long
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
prevSetBit	TokenNameIdentifier	 prev Set Bit
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
// test interleaving different OpenBitSetIterator.next()/skipTo() 	TokenNameCOMMENT_LINE	test interleaving different OpenBitSetIterator.next()/skipTo() 
void	TokenNamevoid	
doIterate	TokenNameIdentifier	 do Iterate
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
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
doIterate2	TokenNameIdentifier	 do Iterate2
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
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
{	TokenNameLBRACE	
BitSet	TokenNameIdentifier	 Bit Set
a0	TokenNameIdentifier	 a0
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
fastSet	TokenNameIdentifier	 fast Set
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
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
fastSet	TokenNameIdentifier	 fast Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
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
fastClear	TokenNameIdentifier	 fast Clear
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
fastClear	TokenNameIdentifier	 fast Clear
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
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
fastFlip	TokenNameIdentifier	 fast Flip
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
flipAndGet	TokenNameIdentifier	 flip And Get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
flipAndGet	TokenNameIdentifier	 flip And Get
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
val2	TokenNameIdentifier	 val2
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
fastFlip	TokenNameIdentifier	 fast Flip
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
flipAndGet	TokenNameIdentifier	 flip And Get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
flipAndGet	TokenNameIdentifier	 flip And Get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
fastClear	TokenNameIdentifier	 fast Clear
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
doGetFast	TokenNameIdentifier	 do Get Fast
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
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
+	TokenNamePLUS	
80	TokenNameIntegerLiteral	
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
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
+	TokenNamePLUS	
80	TokenNameIntegerLiteral	
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
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
doNextSetBitLong	TokenNameIdentifier	 do Next Set Bit Long
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doPrevSetBit	TokenNameIdentifier	 do Prev Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doPrevSetBitLong	TokenNameIdentifier	 do Prev Set Bit Long
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
+	TokenNamePLUS	
80	TokenNameIntegerLiteral	
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
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
doNextSetBitLong	TokenNameIdentifier	 do Next Set Bit Long
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doPrevSetBit	TokenNameIdentifier	 do Prev Set Bit
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doPrevSetBitLong	TokenNameIdentifier	 do Prev Set Bit Long
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
a0	TokenNameIdentifier	 a0
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
a_xor	TokenNameIdentifier	 a xor
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
a_xor	TokenNameIdentifier	 a xor
.	TokenNameDOT	
xor	TokenNameIdentifier	 xor
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b_and	TokenNameIdentifier	 b and
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b_or	TokenNameIdentifier	 b or
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b_xor	TokenNameIdentifier	 b xor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b_xor	TokenNameIdentifier	 b xor
.	TokenNameDOT	
xor	TokenNameIdentifier	 xor
(	TokenNameLPAREN	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b_andn	TokenNameIdentifier	 b andn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
a_xor	TokenNameIdentifier	 a xor
,	TokenNameCOMMA	
b_xor	TokenNameIdentifier	 b xor
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
a_xor	TokenNameIdentifier	 a xor
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
b_xor	TokenNameIdentifier	 b xor
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
// test non-mutating popcounts 	TokenNameCOMMENT_LINE	test non-mutating popcounts 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b_and	TokenNameIdentifier	 b and
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
.	TokenNameDOT	
intersectionCount	TokenNameIdentifier	 intersection Count
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b_or	TokenNameIdentifier	 b or
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
.	TokenNameDOT	
unionCount	TokenNameIdentifier	 union Count
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b_xor	TokenNameIdentifier	 b xor
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
.	TokenNameDOT	
xorCount	TokenNameIdentifier	 xor Count
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b_andn	TokenNameIdentifier	 b andn
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
.	TokenNameDOT	
andNotCount	TokenNameIdentifier	 and Not Count
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
b0	TokenNameIdentifier	 b0
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
1111	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
2222	TokenNameIntegerLiteral	
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
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
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
10	TokenNameIntegerLiteral	
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
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2221	TokenNameIntegerLiteral	
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
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2221	TokenNameIntegerLiteral	
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bs1	TokenNameIdentifier	 bs1
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bs2	TokenNameIdentifier	 bs2
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bs1	TokenNameIdentifier	 bs1
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bs2	TokenNameIdentifier	 bs2
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bs1	TokenNameIdentifier	 bs1
,	TokenNameCOMMA	
bs2	TokenNameIdentifier	 bs2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
bs1	TokenNameIdentifier	 bs1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bs2	TokenNameIdentifier	 bs2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
makeOpenBitSet	TokenNameIdentifier	 make Open Bit Set
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bs	TokenNameIdentifier	 bs
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
=	TokenNameEQUAL	
makeOpenBitSet	TokenNameIdentifier	 make Open Bit Set
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

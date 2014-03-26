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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
/** * This is a very fast, non-cryptographic hash suitable for general hash-based * lookup. See http://murmurhash.googlepages.com/ for more details. * * hash32() and hash64() are MurmurHash 2.0. * hash3_x64_128() is MurmurHash 3.0. * * <p> * The C version of MurmurHash 2.0 found at that site was ported to Java by * Andrzej Bialecki (ab at getopt org). * </p> */	TokenNameCOMMENT_JAVADOC	 This is a very fast, non-cryptographic hash suitable for general hash-based lookup. See http://murmurhash.googlepages.com/ for more details. * hash32() and hash64() are MurmurHash 2.0. hash3_x64_128() is MurmurHash 3.0. * <p> The C version of MurmurHash 2.0 found at that site was ported to Java by Andrzej Bialecki (ab at getopt org). </p> 
public	TokenNamepublic	
class	TokenNameclass	
MurmurHash	TokenNameIdentifier	 Murmur Hash
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
hash32	TokenNameIdentifier	 hash32
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
int	TokenNameint	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0x5bd1e995	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
seed	TokenNameIdentifier	 seed
^	TokenNameXOR	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
len_4	TokenNameIdentifier	 len 4
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
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
len_4	TokenNameIdentifier	 len 4
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i_4	TokenNameIdentifier	 i 4
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_4	TokenNameIdentifier	 i 4
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
|	TokenNameOR	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_4	TokenNameIdentifier	 i 4
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
|	TokenNameOR	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_4	TokenNameIdentifier	 i 4
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
|	TokenNameOR	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_4	TokenNameIdentifier	 i 4
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
*=	TokenNameMULTIPLY_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
*=	TokenNameMULTIPLY_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
*=	TokenNameMULTIPLY_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// avoid calculating modulo 	TokenNameCOMMENT_LINE	avoid calculating modulo 
int	TokenNameint	
len_m	TokenNameIdentifier	 len m
=	TokenNameEQUAL	
len_4	TokenNameIdentifier	 len 4
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
len_m	TokenNameIdentifier	 len m
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
h	TokenNameIdentifier	 h
*=	TokenNameMULTIPLY_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
h	TokenNameIdentifier	 h
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
*=	TokenNameMULTIPLY_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
h	TokenNameIdentifier	 h
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
hash2_64	TokenNameIdentifier	 hash2 64
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
m64	TokenNameIdentifier	 m64
=	TokenNameEQUAL	
0xc6a4a7935bd1e995L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
r64	TokenNameIdentifier	 r64
=	TokenNameEQUAL	
47	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
h64	TokenNameIdentifier	 h64
=	TokenNameEQUAL	
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
&	TokenNameAND	
0xffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
m64	TokenNameIdentifier	 m64
*	TokenNameMULTIPLY	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lenLongs	TokenNameIdentifier	 len Longs
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
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
lenLongs	TokenNameIdentifier	 len Longs
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i_8	TokenNameIdentifier	 i 8
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
k64	TokenNameIdentifier	 k64
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
56	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k64	TokenNameIdentifier	 k64
*=	TokenNameMULTIPLY_EQUAL	
m64	TokenNameIdentifier	 m64
;	TokenNameSEMICOLON	
k64	TokenNameIdentifier	 k64
^=	TokenNameXOR_EQUAL	
k64	TokenNameIdentifier	 k64
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
r64	TokenNameIdentifier	 r64
;	TokenNameSEMICOLON	
k64	TokenNameIdentifier	 k64
*=	TokenNameMULTIPLY_EQUAL	
m64	TokenNameIdentifier	 m64
;	TokenNameSEMICOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
k64	TokenNameIdentifier	 k64
;	TokenNameSEMICOLON	
h64	TokenNameIdentifier	 h64
*=	TokenNameMULTIPLY_EQUAL	
m64	TokenNameIdentifier	 m64
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
rem	TokenNameIdentifier	 rem
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
&	TokenNameAND	
0x7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
rem	TokenNameIdentifier	 rem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
rem	TokenNameIdentifier	 rem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h64	TokenNameIdentifier	 h64
*=	TokenNameMULTIPLY_EQUAL	
m64	TokenNameIdentifier	 m64
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
h64	TokenNameIdentifier	 h64
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
r64	TokenNameIdentifier	 r64
;	TokenNameSEMICOLON	
h64	TokenNameIdentifier	 h64
*=	TokenNameMULTIPLY_EQUAL	
m64	TokenNameIdentifier	 m64
;	TokenNameSEMICOLON	
h64	TokenNameIdentifier	 h64
^=	TokenNameXOR_EQUAL	
h64	TokenNameIdentifier	 h64
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
r64	TokenNameIdentifier	 r64
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h64	TokenNameIdentifier	 h64
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
long	TokenNamelong	
getblock	TokenNameIdentifier	 getblock
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i_8	TokenNameIdentifier	 i 8
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
blockOffset	TokenNameIdentifier	 block Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i_8	TokenNameIdentifier	 i 8
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
40	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockOffset	TokenNameIdentifier	 block Offset
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
56	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
long	TokenNamelong	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
long	TokenNamelong	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<<	TokenNameLEFT_SHIFT	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
long	TokenNamelong	
fmix	TokenNameIdentifier	 fmix
(	TokenNameLPAREN	
long	TokenNamelong	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
*=	TokenNameMULTIPLY_EQUAL	
0xff51afd7ed558ccdL	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
*=	TokenNameMULTIPLY_EQUAL	
0xc4ceb9fe1a85ec53L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
^=	TokenNameXOR_EQUAL	
k	TokenNameIdentifier	 k
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash3_x64_128	TokenNameIdentifier	 hash3 x64 128
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
nblocks	TokenNameIdentifier	 nblocks
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Process as 128-bit blocks. 	TokenNameCOMMENT_LINE	Process as 128-bit blocks. 
long	TokenNamelong	
h1	TokenNameIdentifier	 h1
=	TokenNameEQUAL	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
long	TokenNamelong	
h2	TokenNameIdentifier	 h2
=	TokenNameEQUAL	
seed	TokenNameIdentifier	 seed
;	TokenNameSEMICOLON	
long	TokenNamelong	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
0x87c37b91114253d5L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
0x4cf5ad432745937fL	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//---------- 	TokenNameCOMMENT_LINE	---------- 
// body 	TokenNameCOMMENT_LINE	body 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nblocks	TokenNameIdentifier	 nblocks
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
getblock	TokenNameIdentifier	 getblock
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
getblock	TokenNameIdentifier	 getblock
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
*=	TokenNameMULTIPLY_EQUAL	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
*=	TokenNameMULTIPLY_EQUAL	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
^=	TokenNameXOR_EQUAL	
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
=	TokenNameEQUAL	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
h1	TokenNameIdentifier	 h1
,	TokenNameCOMMA	
27	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
+=	TokenNamePLUS_EQUAL	
h2	TokenNameIdentifier	 h2
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
=	TokenNameEQUAL	
h1	TokenNameIdentifier	 h1
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0x52dce729	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
*=	TokenNameMULTIPLY_EQUAL	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
*=	TokenNameMULTIPLY_EQUAL	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
^=	TokenNameXOR_EQUAL	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
=	TokenNameEQUAL	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
h2	TokenNameIdentifier	 h2
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
+=	TokenNamePLUS_EQUAL	
h1	TokenNameIdentifier	 h1
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
=	TokenNameEQUAL	
h2	TokenNameIdentifier	 h2
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0x38495ab5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//---------- 	TokenNameCOMMENT_LINE	---------- 
// tail 	TokenNameCOMMENT_LINE	tail 
// Advance offset to the unprocessed tail of the data. 	TokenNameCOMMENT_LINE	Advance offset to the unprocessed tail of the data. 
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
nblocks	TokenNameIdentifier	 nblocks
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
&	TokenNameAND	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
15	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
14	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
14	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
13	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
12	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
11	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
9	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k2	TokenNameIdentifier	 k2
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
*=	TokenNameMULTIPLY_EQUAL	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
*=	TokenNameMULTIPLY_EQUAL	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
^=	TokenNameXOR_EQUAL	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
56	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
k1	TokenNameIdentifier	 k1
^=	TokenNameXOR_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
*=	TokenNameMULTIPLY_EQUAL	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
rotl64	TokenNameIdentifier	 rotl64
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
*=	TokenNameMULTIPLY_EQUAL	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
^=	TokenNameXOR_EQUAL	
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//---------- 	TokenNameCOMMENT_LINE	---------- 
// finalization 	TokenNameCOMMENT_LINE	finalization 
h1	TokenNameIdentifier	 h1
^=	TokenNameXOR_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
^=	TokenNameXOR_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
+=	TokenNamePLUS_EQUAL	
h2	TokenNameIdentifier	 h2
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
+=	TokenNamePLUS_EQUAL	
h1	TokenNameIdentifier	 h1
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
=	TokenNameEQUAL	
fmix	TokenNameIdentifier	 fmix
(	TokenNameLPAREN	
h1	TokenNameIdentifier	 h1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
=	TokenNameEQUAL	
fmix	TokenNameIdentifier	 fmix
(	TokenNameLPAREN	
h2	TokenNameIdentifier	 h2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h1	TokenNameIdentifier	 h1
+=	TokenNamePLUS_EQUAL	
h2	TokenNameIdentifier	 h2
;	TokenNameSEMICOLON	
h2	TokenNameIdentifier	 h2
+=	TokenNamePLUS_EQUAL	
h1	TokenNameIdentifier	 h1
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
h1	TokenNameIdentifier	 h1
,	TokenNameCOMMA	
h2	TokenNameIdentifier	 h2
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

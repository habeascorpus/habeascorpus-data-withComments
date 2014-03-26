package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
grouping	TokenNameIdentifier	 grouping
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * A native int set where one value is reserved to mean "EMPTY" * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A native int set where one value is reserved to mean "EMPTY" * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
emptyVal	TokenNameIdentifier	 empty Val
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
rehashCount	TokenNameIdentifier	 rehash Count
;	TokenNameSEMICOLON	
// the count at which a rehash should be done 	TokenNameCOMMENT_LINE	the count at which a rehash should be done 
/** * * @param size The minimum number of elements this set should be able to hold without re-hashing (i.e. the slots are guaranteed not to change) * @param emptyVal The integer value to use for EMPTY */	TokenNameCOMMENT_JAVADOC	 * @param size The minimum number of elements this set should be able to hold without re-hashing (i.e. the slots are guaranteed not to change) @param emptyVal The integer value to use for EMPTY 
public	TokenNamepublic	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
int	TokenNameint	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
emptyVal	TokenNameIdentifier	 empty Val
=	TokenNameEQUAL	
emptyVal	TokenNameIdentifier	 empty Val
;	TokenNameSEMICOLON	
int	TokenNameint	
tsize	TokenNameIdentifier	 tsize
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nextHighestPowerOfTwo	TokenNameIdentifier	 next Highest Power Of Two
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rehashCount	TokenNameIdentifier	 rehash Count
=	TokenNameEQUAL	
tsize	TokenNameIdentifier	 tsize
-	TokenNameMINUS	
(	TokenNameLPAREN	
tsize	TokenNameIdentifier	 tsize
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
rehashCount	TokenNameIdentifier	 rehash Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should be able to hold "size" w/o rehashing 	TokenNameCOMMENT_LINE	should be able to hold "size" w/o rehashing 
tsize	TokenNameIdentifier	 tsize
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rehashCount	TokenNameIdentifier	 rehash Count
=	TokenNameEQUAL	
tsize	TokenNameIdentifier	 tsize
-	TokenNameMINUS	
(	TokenNameLPAREN	
tsize	TokenNameIdentifier	 tsize
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
tsize	TokenNameIdentifier	 tsize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
emptyVal	TokenNameIdentifier	 empty Val
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the slot for this key */	TokenNameCOMMENT_JAVADOC	 returns the slot for this key 
public	TokenNamepublic	
int	TokenNameint	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
||	TokenNameOR_OR	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
int	TokenNameint	
increment	TokenNameIdentifier	 increment
=	TokenNameEQUAL	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
increment	TokenNameIdentifier	 increment
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
key	TokenNameIdentifier	 key
&&	TokenNameAND_AND	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** returns the slot for this key, or -slot-1 if not found */	TokenNameCOMMENT_JAVADOC	 returns the slot for this key, or -slot-1 if not found 
public	TokenNamepublic	
int	TokenNameint	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
increment	TokenNameIdentifier	 increment
=	TokenNameEQUAL	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
>>	TokenNameRIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
increment	TokenNameIdentifier	 increment
)	TokenNameRPAREN	
&	TokenNameAND	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
rehashCount	TokenNameIdentifier	 rehash Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldKeys	TokenNameIdentifier	 old Keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
emptyVal	TokenNameIdentifier	 empty Val
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
emptyVal	TokenNameIdentifier	 empty Val
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
oldKeys	TokenNameIdentifier	 old Keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
oldKeys	TokenNameIdentifier	 old Keys
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
emptyVal	TokenNameIdentifier	 empty Val
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSlot	TokenNameIdentifier	 new Slot
=	TokenNameEQUAL	
getSlot	TokenNameIdentifier	 get Slot
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
newSlot	TokenNameIdentifier	 new Slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rehashCount	TokenNameIdentifier	 rehash Count
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
-	TokenNameMINUS	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

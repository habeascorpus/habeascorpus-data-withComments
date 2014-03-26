package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
writercache	TokenNameIdentifier	 writercache
.	TokenNameDOT	
cl2o	TokenNameIdentifier	 cl2o
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This is a very efficient LabelToOrdinal implementation that uses a * CharBlockArray to store all labels and a configurable number of HashArrays to * reference the labels. * <p> * Since the HashArrays don't handle collisions, a {@link CollisionMap} is used * to store the colliding labels. * <p> * This data structure grows by adding a new HashArray whenever the number of * collisions in the {@link CollisionMap} exceeds {@code loadFactor} * * {@link #getMaxOrdinal()}. Growing also includes reinserting all colliding * labels into the HashArrays to possibly reduce the number of collisions. * * For setting the {@code loadFactor} see * {@link #CompactLabelToOrdinal(int, float, int)}. * * <p> * This data structure has a much lower memory footprint (~30%) compared to a * Java HashMap<String, Integer>. It also only uses a small fraction of objects * a HashMap would use, thus limiting the GC overhead. Ingestion speed was also * ~50% faster compared to a HashMap for 3M unique labels. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This is a very efficient LabelToOrdinal implementation that uses a CharBlockArray to store all labels and a configurable number of HashArrays to reference the labels. <p> Since the HashArrays don't handle collisions, a {@link CollisionMap} is used to store the colliding labels. <p> This data structure grows by adding a new HashArray whenever the number of collisions in the {@link CollisionMap} exceeds {@code loadFactor} * {@link #getMaxOrdinal()}. Growing also includes reinserting all colliding labels into the HashArrays to possibly reduce the number of collisions. * For setting the {@code loadFactor} see {@link #CompactLabelToOrdinal(int, float, int)}. * <p> This data structure has a much lower memory footprint (~30%) compared to a Java HashMap<String, Integer>. It also only uses a small fraction of objects a HashMap would use, thus limiting the GC overhead. Ingestion speed was also ~50% faster compared to a HashMap for 3M unique labels. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
extends	TokenNameextends	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
DefaultLoadFactor	TokenNameIdentifier	 Default Load Factor
=	TokenNameEQUAL	
0.15f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
TerminatorChar	TokenNameIdentifier	 Terminator Char
=	TokenNameEQUAL	
0xffff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
Collision	TokenNameIdentifier	 Collision
=	TokenNameEQUAL	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashArray	TokenNameIdentifier	 Hash Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hashArrays	TokenNameIdentifier	 hash Arrays
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CollisionMap	TokenNameIdentifier	 Collision Map
collisionMap	TokenNameIdentifier	 collision Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharBlockArray	TokenNameIdentifier	 Char Block Array
labelRepository	TokenNameIdentifier	 label Repository
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
sizeOfMap	TokenNameIdentifier	 size Of Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
int	TokenNameint	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
=	TokenNameEQUAL	
new	TokenNamenew	
HashArray	TokenNameIdentifier	 Hash Array
[	TokenNameLBRACKET	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
determineCapacity	TokenNameIdentifier	 determine Capacity
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
)	TokenNameRPAREN	
,	TokenNameCOMMA	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
=	TokenNameEQUAL	
new	TokenNamenew	
CollisionMap	TokenNameIdentifier	 Collision Map
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
int	TokenNameint	
determineCapacity	TokenNameIdentifier	 determine Capacity
(	TokenNameLPAREN	
int	TokenNameint	
minCapacity	TokenNameIdentifier	 min Capacity
,	TokenNameCOMMA	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
minCapacity	TokenNameIdentifier	 min Capacity
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
<	TokenNameLESS	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
capacity	TokenNameIdentifier	 capacity
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labelRepository	TokenNameIdentifier	 label Repository
=	TokenNameEQUAL	
new	TokenNamenew	
CharBlockArray	TokenNameIdentifier	 Char Block Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
//can't happen 	TokenNameCOMMENT_LINE	can't happen 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
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
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
HashArray	TokenNameIdentifier	 Hash Array
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
/=	TokenNameDIVIDE_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
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
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
prevVal	TokenNameIdentifier	 prev Val
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevVal	TokenNameIdentifier	 prev Val
!=	TokenNameNOT_EQUAL	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Label already exists: "	TokenNameStringLiteral	Label already exists: 
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" prev ordinal "	TokenNameStringLiteral	 prev ordinal 
+	TokenNamePLUS	
prevVal	TokenNameIdentifier	 prev Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
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
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
prevVal	TokenNameIdentifier	 prev Val
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevVal	TokenNameIdentifier	 prev Val
!=	TokenNameNOT_EQUAL	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Label already exists: "	TokenNameStringLiteral	Label already exists: 
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
+	TokenNamePLUS	
" prev ordinal "	TokenNameStringLiteral	 prev ordinal 
+	TokenNamePLUS	
prevVal	TokenNameIdentifier	 prev Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
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
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
!=	TokenNameNOT_EQUAL	
Collision	TokenNameIdentifier	 Collision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
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
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
!=	TokenNameNOT_EQUAL	
Collision	TokenNameIdentifier	 Collision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashArray	TokenNameIdentifier	 Hash Array
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*=	TokenNameMULTIPLY_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
HashArray	TokenNameIdentifier	 Hash Array
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sourceOffsetArray	TokenNameIdentifier	 source Offset Array
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sourceCidsArray	TokenNameIdentifier	 source Cids Array
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
sourceOffsetArray	TokenNameIdentifier	 source Offset Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
sourceOffsetArray	TokenNameIdentifier	 source Offset Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetOffsetArray	TokenNameIdentifier	 target Offset Array
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targetCidsArray	TokenNameIdentifier	 target Cids Array
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
;	TokenNameSEMICOLON	
int	TokenNameint	
newIndex	TokenNameIdentifier	 new Index
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
sourceOffsetArray	TokenNameIdentifier	 source Offset Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
targetOffsetArray	TokenNameIdentifier	 target Offset Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetOffsetArray	TokenNameIdentifier	 target Offset Array
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetOffsetArray	TokenNameIdentifier	 target Offset Array
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sourceOffsetArray	TokenNameIdentifier	 source Offset Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
targetCidsArray	TokenNameIdentifier	 target Cids Array
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sourceCidsArray	TokenNameIdentifier	 source Cids Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sourceOffsetArray	TokenNameIdentifier	 source Offset Array
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addLabelOffset	TokenNameIdentifier	 add Label Offset
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
CollisionMap	TokenNameIdentifier	 Collision Map
oldCollisionMap	TokenNameIdentifier	 old Collision Map
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
=	TokenNameEQUAL	
new	TokenNamenew	
CollisionMap	TokenNameIdentifier	 Collision Map
(	TokenNameLPAREN	
oldCollisionMap	TokenNameIdentifier	 old Collision Map
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CollisionMap	TokenNameIdentifier	 Collision Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
oldCollisionMap	TokenNameIdentifier	 old Collision Map
.	TokenNameDOT	
entryIterator	TokenNameIdentifier	 entry Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CollisionMap	TokenNameIdentifier	 Collision Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addLabelOffset	TokenNameIdentifier	 add Label Offset
(	TokenNameLPAREN	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
HashArray	TokenNameIdentifier	 Hash Array
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen - LabelRepository.append() never throws an 	TokenNameCOMMENT_LINE	can't happen - LabelRepository.append() never throws an 
// exception 	TokenNameCOMMENT_LINE	exception 
}	TokenNameRBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
HashArray	TokenNameIdentifier	 Hash Array
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen - LabelRepository.append() never throws an 	TokenNameCOMMENT_LINE	can't happen - LabelRepository.append() never throws an 
// exception 	TokenNameCOMMENT_LINE	exception 
}	TokenNameRBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addLabelOffset	TokenNameIdentifier	 add Label Offset
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
int	TokenNameint	
knownOffset	TokenNameIdentifier	 known Offset
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
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addLabelOffsetToHashArray	TokenNameIdentifier	 add Label Offset To Hash Array
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
knownOffset	TokenNameIdentifier	 known Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
addLabelOffset	TokenNameIdentifier	 add Label Offset
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
knownOffset	TokenNameIdentifier	 known Offset
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
addLabelOffsetToHashArray	TokenNameIdentifier	 add Label Offset To Hash Array
(	TokenNameLPAREN	
HashArray	TokenNameIdentifier	 Hash Array
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
int	TokenNameint	
knownOffset	TokenNameIdentifier	 known Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
knownOffset	TokenNameIdentifier	 known Offset
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
HashArray	TokenNameIdentifier	 Hash Array
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Collision	TokenNameIdentifier	 Collision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
HashArray	TokenNameIdentifier	 Hash Array
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Collision	TokenNameIdentifier	 Collision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns index for hash code h. */	TokenNameCOMMENT_JAVADOC	 Returns index for hash code h. 
static	TokenNamestatic	
int	TokenNameint	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
int	TokenNameint	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
&	TokenNameAND	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// static int stringHashCode(String label) { 	TokenNameCOMMENT_LINE	static int stringHashCode(String label) { 
// int len = label.length(); 	TokenNameCOMMENT_LINE	int len = label.length(); 
// int hash = 0; 	TokenNameCOMMENT_LINE	int hash = 0; 
// int i; 	TokenNameCOMMENT_LINE	int i; 
// for (i = 0; i < len; ++i) 	TokenNameCOMMENT_LINE	for (i = 0; i < len; ++i) 
// hash = 33 * hash + label.charAt(i); 	TokenNameCOMMENT_LINE	hash = 33 * hash + label.charAt(i); 
// 	TokenNameCOMMENT_LINE	 
// hash = hash ^ ((hash >>> 20) ^ (hash >>> 12)); 	TokenNameCOMMENT_LINE	hash = hash ^ ((hash >>> 20) ^ (hash >>> 12)); 
// hash = hash ^ (hash >>> 7) ^ (hash >>> 4); 	TokenNameCOMMENT_LINE	hash = hash ^ (hash >>> 7) ^ (hash >>> 4); 
// 	TokenNameCOMMENT_LINE	 
// return hash; 	TokenNameCOMMENT_LINE	return hash; 
// 	TokenNameCOMMENT_LINE	 
// } 	TokenNameCOMMENT_LINE	} 
static	TokenNamestatic	
int	TokenNameint	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
int	TokenNameint	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
int	TokenNameint	
stringHashCode	TokenNameIdentifier	 string Hash Code
(	TokenNameLPAREN	
CharBlockArray	TokenNameIdentifier	 Char Block Array
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
CategoryPath	TokenNameIdentifier	 Category Path
.	TokenNameDOT	
hashCodeOfSerialized	TokenNameIdentifier	 hash Code Of Serialized
(	TokenNameLPAREN	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public static boolean equals(CharSequence label, CharBlockArray array, 	TokenNameCOMMENT_LINE	public static boolean equals(CharSequence label, CharBlockArray array, 
// int offset) { 	TokenNameCOMMENT_LINE	int offset) { 
// // CONTINUE HERE 	TokenNameCOMMENT_LINE	// CONTINUE HERE 
// int len = label.length(); 	TokenNameCOMMENT_LINE	int len = label.length(); 
// int bi = array.blockIndex(offset); 	TokenNameCOMMENT_LINE	int bi = array.blockIndex(offset); 
// CharBlockArray.Block b = array.blocks.get(bi); 	TokenNameCOMMENT_LINE	CharBlockArray.Block b = array.blocks.get(bi); 
// int index = array.indexInBlock(offset); 	TokenNameCOMMENT_LINE	int index = array.indexInBlock(offset); 
// 	TokenNameCOMMENT_LINE	 
// for (int i = 0; i < len; i++) { 	TokenNameCOMMENT_LINE	for (int i = 0; i < len; i++) { 
// if (label.charAt(i) != b.chars[index]) { 	TokenNameCOMMENT_LINE	if (label.charAt(i) != b.chars[index]) { 
// return false; 	TokenNameCOMMENT_LINE	return false; 
// } 	TokenNameCOMMENT_LINE	} 
// index++; 	TokenNameCOMMENT_LINE	index++; 
// if (index == b.length) { 	TokenNameCOMMENT_LINE	if (index == b.length) { 
// b = array.blocks.get(++bi); 	TokenNameCOMMENT_LINE	b = array.blocks.get(++bi); 
// index = 0; 	TokenNameCOMMENT_LINE	index = 0; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// return b.chars[index] == TerminatorChar; 	TokenNameCOMMENT_LINE	return b.chars[index] == TerminatorChar; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Returns an estimate of the amount of memory used by this table. Called only in * this package. Memory is consumed mainly by three structures: the hash arrays, * label repository and collision map. */	TokenNameCOMMENT_JAVADOC	 Returns an estimate of the amount of memory used by this table. Called only in this package. Memory is consumed mainly by three structures: the hash arrays, label repository and collision map. 
int	TokenNameint	
getMemoryUsage	TokenNameIdentifier	 get Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
memoryUsage	TokenNameIdentifier	 memory Usage
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// HashArray capacity is instance-specific. 	TokenNameCOMMENT_LINE	HashArray capacity is instance-specific. 
for	TokenNamefor	
(	TokenNameLPAREN	
HashArray	TokenNameIdentifier	 Hash Array
ha	TokenNameIdentifier	 ha
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Each has 2 capacity-length arrays of ints. 	TokenNameCOMMENT_LINE	Each has 2 capacity-length arrays of ints. 
memoryUsage	TokenNameIdentifier	 memory Usage
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
ha	TokenNameIdentifier	 ha
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All blocks are the same size. 	TokenNameCOMMENT_LINE	All blocks are the same size. 
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
// Each block has room for blockSize UTF-16 chars. 	TokenNameCOMMENT_LINE	Each block has room for blockSize UTF-16 chars. 
int	TokenNameint	
actualBlockSize	TokenNameIdentifier	 actual Block Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
memoryUsage	TokenNameIdentifier	 memory Usage
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
actualBlockSize	TokenNameIdentifier	 actual Block Size
;	TokenNameSEMICOLON	
memoryUsage	TokenNameIdentifier	 memory Usage
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Two int values for array as a whole. 	TokenNameCOMMENT_LINE	Two int values for array as a whole. 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
memoryUsage	TokenNameIdentifier	 memory Usage
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
.	TokenNameDOT	
getMemoryUsage	TokenNameIdentifier	 get Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
memoryUsage	TokenNameIdentifier	 memory Usage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens the file and reloads the CompactLabelToOrdinal. The file it expects * is generated from the {@link #flush()} command. */	TokenNameCOMMENT_JAVADOC	 Opens the file and reloads the CompactLabelToOrdinal. The file it expects is generated from the {@link #flush()} command. 
static	TokenNamestatic	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
int	TokenNameint	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
/** * Part of the file is the labelRepository, which needs to be rehashed * and label offsets re-added to the object. I am unsure as to why we * can't just store these off in the file as well, but in keeping with * the spirit of the original code, I did it this way. (ssuppe) */	TokenNameCOMMENT_JAVADOC	 Part of the file is the labelRepository, which needs to be rehashed and label offsets re-added to the object. I am unsure as to why we can't just store these off in the file as well, but in keeping with the spirit of the original code, I did it this way. (ssuppe) 
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
l2o	TokenNameIdentifier	 l2o
=	TokenNameEQUAL	
new	TokenNamenew	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
=	TokenNameEQUAL	
new	TokenNamenew	
HashArray	TokenNameIdentifier	 Hash Array
[	TokenNameLBRACKET	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
DataInputStream	TokenNameIdentifier	 Data Input Stream
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TaxiReader needs to load the "counter" or occupancy (L2O) to know 	TokenNameCOMMENT_LINE	TaxiReader needs to load the "counter" or occupancy (L2O) to know 
// the next unique facet. we used to load the delimiter too, but 	TokenNameCOMMENT_LINE	the next unique facet. we used to load the delimiter too, but 
// never used it. 	TokenNameCOMMENT_LINE	never used it. 
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
determineCapacity	TokenNameIdentifier	 determine Capacity
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
hashArrays	TokenNameIdentifier	 hash Arrays
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now read the chars 	TokenNameCOMMENT_LINE	now read the chars 
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
=	TokenNameEQUAL	
CharBlockArray	TokenNameIdentifier	 Char Block Array
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
collisionMap	TokenNameIdentifier	 collision Map
=	TokenNameEQUAL	
new	TokenNamenew	
CollisionMap	TokenNameIdentifier	 Collision Map
(	TokenNameLPAREN	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Calculate hash on the fly based on how CategoryPath hashes 	TokenNameCOMMENT_LINE	Calculate hash on the fly based on how CategoryPath hashes 
// itself. Maybe in the future we can call some static based methods 	TokenNameCOMMENT_LINE	itself. Maybe in the future we can call some static based methods 
// in CategoryPath so that this doesn't break again? I don't like 	TokenNameCOMMENT_LINE	in CategoryPath so that this doesn't break again? I don't like 
// having code in two different places... 	TokenNameCOMMENT_LINE	having code in two different places... 
int	TokenNameint	
cid	TokenNameIdentifier	 cid
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Skip the initial offset, it's the CategoryPath(0,0), which isn't 	TokenNameCOMMENT_LINE	Skip the initial offset, it's the CategoryPath(0,0), which isn't 
// a hashed value. 	TokenNameCOMMENT_LINE	a hashed value. 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastStartOffset	TokenNameIdentifier	 last Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// This loop really relies on a well-formed input (assumes pretty blindly 	TokenNameCOMMENT_LINE	This loop really relies on a well-formed input (assumes pretty blindly 
// that array offsets will work). Since the initial file is machine 	TokenNameCOMMENT_LINE	that array offsets will work). Since the initial file is machine 
// generated, I think this should be OK. 	TokenNameCOMMENT_LINE	generated, I think this should be OK. 
while	TokenNamewhile	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First component is numcomponents, so we initialize the hash 	TokenNameCOMMENT_LINE	First component is numcomponents, so we initialize the hash 
// to this 	TokenNameCOMMENT_LINE	to this 
int	TokenNameint	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
// If ncomponents is 0, then we are done? 	TokenNameCOMMENT_LINE	If ncomponents is 0, then we are done? 
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// usedchars is always the last member of the 'ends' array 	TokenNameCOMMENT_LINE	usedchars is always the last member of the 'ends' array 
// in serialization. Rather than rebuild the entire array, 	TokenNameCOMMENT_LINE	in serialization. Rather than rebuild the entire array, 
// assign usedchars to the last value we read in. This will 	TokenNameCOMMENT_LINE	assign usedchars to the last value we read in. This will 
// be slightly more memory efficient. 	TokenNameCOMMENT_LINE	be slightly more memory efficient. 
int	TokenNameint	
usedchars	TokenNameIdentifier	 usedchars
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
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usedchars	TokenNameIdentifier	 usedchars
=	TokenNameEQUAL	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Hash the usedchars for this label 	TokenNameCOMMENT_LINE	Hash the usedchars for this label 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now that we've hashed the components of the label, do the 	TokenNameCOMMENT_LINE	Now that we've hashed the components of the label, do the 
// final part of the hash algorithm. 	TokenNameCOMMENT_LINE	final part of the hash algorithm. 
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the label, and let's keep going 	TokenNameCOMMENT_LINE	Add the label, and let's keep going 
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
addLabelOffset	TokenNameIdentifier	 add Label Offset
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
lastStartOffset	TokenNameIdentifier	 last Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cid	TokenNameIdentifier	 cid
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lastStartOffset	TokenNameIdentifier	 last Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Invalid file format. Cannot deserialize."	TokenNameStringLiteral	Invalid file format. Cannot deserialize.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
*	TokenNameMULTIPLY	
l2o	TokenNameIdentifier	 l2o
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
l2o	TokenNameIdentifier	 l2o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
dos	TokenNameIdentifier	 dos
=	TokenNameEQUAL	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write the labelRepository 	TokenNameCOMMENT_LINE	write the labelRepository 
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Closes the data output stream 	TokenNameCOMMENT_LINE	Closes the data output stream 
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
HashArray	TokenNameIdentifier	 Hash Array
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cids	TokenNameIdentifier	 cids
;	TokenNameSEMICOLON	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
HashArray	TokenNameIdentifier	 Hash Array
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cids	TokenNameIdentifier	 cids
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

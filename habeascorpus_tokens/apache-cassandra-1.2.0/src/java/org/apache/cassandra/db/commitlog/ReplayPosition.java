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
commitlog	TokenNameIdentifier	 commitlog
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Function	TokenNameIdentifier	 Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Iterables	TokenNameIdentifier	 Iterables
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
Ordering	TokenNameIdentifier	 Ordering
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ISerializer	TokenNameIdentifier	 I Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
SSTableReader	TokenNameIdentifier	 SS Table Reader
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ReplayPosition	TokenNameIdentifier	 Replay Position
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ReplayPositionSerializer	TokenNameIdentifier	 Replay Position Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
ReplayPositionSerializer	TokenNameIdentifier	 Replay Position Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NONE is used for SSTables that are streamed from other nodes and thus have no relationship 	TokenNameCOMMENT_LINE	NONE is used for SSTables that are streamed from other nodes and thus have no relationship 
// with our local commitlog. The values satisfy the critera that 	TokenNameCOMMENT_LINE	with our local commitlog. The values satisfy the critera that 
// - no real commitlog segment will have the given id 	TokenNameCOMMENT_LINE	- no real commitlog segment will have the given id 
// - it will sort before any real replayposition, so it will be effectively ignored by getReplayPosition 	TokenNameCOMMENT_LINE	- it will sort before any real replayposition, so it will be effectively ignored by getReplayPosition 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ReplayPosition	TokenNameIdentifier	 Replay Position
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
new	TokenNamenew	
ReplayPosition	TokenNameIdentifier	 Replay Position
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Convenience method to compute the replay position for a group of SSTables. * @param sstables * @return the most recent (highest) replay position */	TokenNameCOMMENT_JAVADOC	 Convenience method to compute the replay position for a group of SSTables. @param sstables @return the most recent (highest) replay position 
public	TokenNamepublic	
static	TokenNamestatic	
ReplayPosition	TokenNameIdentifier	 Replay Position
getReplayPosition	TokenNameIdentifier	 get Replay Position
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
SSTableReader	TokenNameIdentifier	 SS Table Reader
>	TokenNameGREATER	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Iterables	TokenNameIdentifier	 Iterables
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
sstables	TokenNameIdentifier	 sstables
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
Function	TokenNameIdentifier	 Function
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
,	TokenNameCOMMA	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
Function	TokenNameIdentifier	 Function
<	TokenNameLESS	
SSTableReader	TokenNameIdentifier	 SS Table Reader
,	TokenNameCOMMA	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ReplayPosition	TokenNameIdentifier	 Replay Position
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
getReplayPosition	TokenNameIdentifier	 get Replay Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Ordering	TokenNameIdentifier	 Ordering
<	TokenNameLESS	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
ordering	TokenNameIdentifier	 ordering
=	TokenNameEQUAL	
Ordering	TokenNameIdentifier	 Ordering
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ordering	TokenNameIdentifier	 ordering
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
Iterables	TokenNameIdentifier	 Iterables
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
sstables	TokenNameIdentifier	 sstables
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ReplayPosition	TokenNameIdentifier	 Replay Position
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
!=	TokenNameNOT_EQUAL	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReplayPosition	TokenNameIdentifier	 Replay Position
(	TokenNameLPAREN	
long	TokenNamelong	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
assert	TokenNameassert	
position	TokenNameIdentifier	 position
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ReplayPosition	TokenNameIdentifier	 Replay Position
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segment	TokenNameIdentifier	 segment
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
^	TokenNameXOR	
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
"ReplayPosition("	TokenNameStringLiteral	ReplayPosition(
+	TokenNamePLUS	
"segmentId="	TokenNameStringLiteral	segmentId=
+	TokenNamePLUS	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
", position="	TokenNameStringLiteral	, position=
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ReplayPositionSerializer	TokenNameIdentifier	 Replay Position Serializer
implements	TokenNameimplements	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
ReplayPosition	TokenNameIdentifier	 Replay Position
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
rp	TokenNameIdentifier	 rp
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ReplayPosition	TokenNameIdentifier	 Replay Position
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ReplayPosition	TokenNameIdentifier	 Replay Position
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

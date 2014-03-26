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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
SyntaxException	TokenNameIdentifier	 Syntax Exception
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
IColumn	TokenNameIdentifier	 I Column
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
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
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
RangeTombstone	TokenNameIdentifier	 Range Tombstone
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
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
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
IndexInfo	TokenNameIdentifier	 Index Info
;	TokenNameSEMICOLON	
/** * Specifies a Comparator for a specific type of ByteBuffer. * * Note that empty ByteBuffer are used to represent "start at the beginning" * or "stop at the end" arguments to get_slice, so the Comparator * should always handle those values even if they normally do not * represent a valid ByteBuffer for the type being compared. */	TokenNameCOMMENT_JAVADOC	 Specifies a Comparator for a specific type of ByteBuffer. * Note that empty ByteBuffer are used to represent "start at the beginning" or "stop at the end" arguments to get_slice, so the Comparator should always handle those values even if they normally do not represent a valid ByteBuffer for the type being compared. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
indexComparator	TokenNameIdentifier	 index Comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
indexReverseComparator	TokenNameIdentifier	 index Reverse Comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columnComparator	TokenNameIdentifier	 column Comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columnReverseComparator	TokenNameIdentifier	 column Reverse Comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
onDiskAtomComparator	TokenNameIdentifier	 on Disk Atom Comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
reverseComparator	TokenNameIdentifier	 reverse Comparator
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexComparator	TokenNameIdentifier	 index Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
IndexInfo	TokenNameIdentifier	 Index Info
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
IndexInfo	TokenNameIdentifier	 Index Info
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
lastName	TokenNameIdentifier	 last Name
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
lastName	TokenNameIdentifier	 last Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
indexReverseComparator	TokenNameIdentifier	 index Reverse Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IndexInfo	TokenNameIdentifier	 Index Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
IndexInfo	TokenNameIdentifier	 Index Info
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
IndexInfo	TokenNameIdentifier	 Index Info
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
firstName	TokenNameIdentifier	 first Name
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
firstName	TokenNameIdentifier	 first Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
columnComparator	TokenNameIdentifier	 column Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
columnReverseComparator	TokenNameIdentifier	 column Reverse Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
onDiskAtomComparator	TokenNameIdentifier	 on Disk Atom Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
instanceof	TokenNameinstanceof	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
instanceof	TokenNameinstanceof	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
c1	TokenNameIdentifier	 c1
;	TokenNameSEMICOLON	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
c2	TokenNameIdentifier	 c2
;	TokenNameSEMICOLON	
int	TokenNameint	
comp2	TokenNameIdentifier	 comp2
=	TokenNameEQUAL	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comp2	TokenNameIdentifier	 comp2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
comp2	TokenNameIdentifier	 comp2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
instanceof	TokenNameinstanceof	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
reverseComparator	TokenNameIdentifier	 reverse Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
AbstractType	TokenNameIdentifier	 Abstract Type
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** get a string representation of the bytes suitable for log messages */	TokenNameCOMMENT_JAVADOC	 get a string representation of the bytes suitable for log messages 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** get a byte representation of the given string. */	TokenNameCOMMENT_JAVADOC	 get a byte representation of the given string. 
public	TokenNamepublic	
abstract	TokenNameabstract	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
;	TokenNameSEMICOLON	
/* validate that the byte array is a valid sequence for the type we are supposed to be comparing */	TokenNameCOMMENT_BLOCK	 validate that the byte array is a valid sequence for the type we are supposed to be comparing 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
;	TokenNameSEMICOLON	
/** @deprecated use reverseComparator field instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use reverseComparator field instead 
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
getReverseComparator	TokenNameIdentifier	 get Reverse Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverseComparator	TokenNameIdentifier	 reverse Comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* convenience method */	TokenNameCOMMENT_BLOCK	 convenience method 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
names	TokenNameIdentifier	 names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* convenience method */	TokenNameCOMMENT_BLOCK	 convenience method 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnsString	TokenNameIdentifier	 get Columns String
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
:	TokenNameCOLON	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCommutative	TokenNameIdentifier	 is Commutative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
parseDefaultParameters	TokenNameIdentifier	 parse Default Parameters
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
baseType	TokenNameIdentifier	 base Type
,	TokenNameCOMMA	
TypeParser	TokenNameIdentifier	 Type Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getKeyValueParameters	TokenNameIdentifier	 get Key Value Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"reversed"	TokenNameStringLiteral	reversed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reversed	TokenNameIdentifier	 reversed
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
reversed	TokenNameIdentifier	 reversed
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
reversed	TokenNameIdentifier	 reversed
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ReversedType	TokenNameIdentifier	 Reversed Type
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
baseType	TokenNameIdentifier	 base Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseType	TokenNameIdentifier	 base Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if this comparator is compatible with the provided * previous comparator, that is if previous can safely be replaced by this. * A comparator cn should be compatible with a previous one cp if forall columns c1 and c2, * if cn.validate(c1) and cn.validate(c2) and cn.compare(c1, c2) == v, * then cp.validate(c1) and cp.validate(c2) and cp.compare(c1, c2) == v. * * Note that a type should be compatible with at least itself and when in * doubt, keep the default behavior of not being compatible with any other comparator! */	TokenNameCOMMENT_JAVADOC	 Returns true if this comparator is compatible with the provided previous comparator, that is if previous can safely be replaced by this. A comparator cn should be compatible with a previous one cp if forall columns c1 and c2, if cn.validate(c1) and cn.validate(c2) and cn.compare(c1, c2) == v, then cp.validate(c1) and cp.validate(c2) and cp.compare(c1, c2) == v. * Note that a type should be compatible with at least itself and when in doubt, keep the default behavior of not being compatible with any other comparator! 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
previous	TokenNameIdentifier	 previous
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An alternative comparison function used by CollectionsType in conjunction with CompositeType. * * This comparator is only called to compare components of a CompositeType. It gets the value of the * previous component as argument (or null if it's the first component of the composite). * * Unless you're doing something very similar to CollectionsType, you shouldn't override this. */	TokenNameCOMMENT_JAVADOC	 An alternative comparison function used by CollectionsType in conjunction with CompositeType. * This comparator is only called to compare components of a CompositeType. It gets the value of the previous component as argument (or null if it's the first component of the composite). * Unless you're doing something very similar to CollectionsType, you shouldn't override this. 
public	TokenNamepublic	
int	TokenNameint	
compareCollectionMembers	TokenNameIdentifier	 compare Collection Members
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An alternative validation function used by CollectionsType in conjunction with CompositeType. * * This is similar to the compare function above. */	TokenNameCOMMENT_JAVADOC	 An alternative validation function used by CollectionsType in conjunction with CompositeType. * This is similar to the compare function above. 
public	TokenNamepublic	
void	TokenNamevoid	
validateCollectionMember	TokenNameIdentifier	 validate Collection Member
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This must be overriden by subclasses if necessary so that for any * AbstractType, this == TypeParser.parse(toString()). * * Note that for backwards compatibility this includes the full classname. * For CQL purposes the short name is fine. */	TokenNameCOMMENT_JAVADOC	 This must be overriden by subclasses if necessary so that for any AbstractType, this == TypeParser.parse(toString()). * Note that for backwards compatibility this includes the full classname. For CQL purposes the short name is fine. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

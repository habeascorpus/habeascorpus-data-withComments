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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * A class avoiding class duplication between CompositeType and * DynamicCompositeType. * Those two differs only in that for DynamicCompositeType, the comparators * are in the encoded column name at the front of each component. */	TokenNameCOMMENT_JAVADOC	 A class avoiding class duplication between CompositeType and DynamicCompositeType. Those two differs only in that for DynamicCompositeType, the comparators are in the encoded column name at the front of each component. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCompositeType	TokenNameIdentifier	 Abstract Composite Type
extends	TokenNameextends	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
{	TokenNameLBRACE	
// changes bb position 	TokenNameCOMMENT_LINE	changes bb position 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getShortLength	TokenNameIdentifier	 get Short Length
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
|	TokenNameOR	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// changes bb position 	TokenNameCOMMENT_LINE	changes bb position 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
putShortLength	TokenNameIdentifier	 put Short Length
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// changes bb position 	TokenNameCOMMENT_LINE	changes bb position 
protected	TokenNameprotected	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// changes bb position 	TokenNameCOMMENT_LINE	changes bb position 
protected	TokenNameprotected	
static	TokenNamestatic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
getWithShortLength	TokenNameIdentifier	 get With Short Length
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getShortLength	TokenNameIdentifier	 get Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
o2	TokenNameIdentifier	 o2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb1	TokenNameIdentifier	 bb1
=	TokenNameEQUAL	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb2	TokenNameIdentifier	 bb2
=	TokenNameEQUAL	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bb1	TokenNameIdentifier	 bb1
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bb2	TokenNameIdentifier	 bb2
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
bb1	TokenNameIdentifier	 bb1
,	TokenNameCOMMA	
bb2	TokenNameIdentifier	 bb2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value1	TokenNameIdentifier	 value1
=	TokenNameEQUAL	
getWithShortLength	TokenNameIdentifier	 get With Short Length
(	TokenNameLPAREN	
bb1	TokenNameIdentifier	 bb1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value2	TokenNameIdentifier	 value2
=	TokenNameEQUAL	
getWithShortLength	TokenNameIdentifier	 get With Short Length
(	TokenNameLPAREN	
bb2	TokenNameIdentifier	 bb2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compareCollectionMembers	TokenNameIdentifier	 compare Collection Members
(	TokenNameLPAREN	
value1	TokenNameIdentifier	 value1
,	TokenNameCOMMA	
value2	TokenNameIdentifier	 value2
,	TokenNameCOMMA	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
value1	TokenNameIdentifier	 value1
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
bb1	TokenNameIdentifier	 bb1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
bb2	TokenNameIdentifier	 bb2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// b1 == 0 	TokenNameCOMMENT_LINE	b1 == 0 
if	TokenNameif	
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
b2	TokenNameIdentifier	 b2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bb1	TokenNameIdentifier	 bb1
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
bb2	TokenNameIdentifier	 bb2
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
// bb1.remaining() > 0 && bb2.remaining() == 0 	TokenNameCOMMENT_LINE	bb1.remaining() > 0 && bb2.remaining() == 0 
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split a composite column names into it's components. */	TokenNameCOMMENT_JAVADOC	 Split a composite column names into it's components. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWithShortLength	TokenNameIdentifier	 get With Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip end-of-component 	TokenNameCOMMENT_LINE	skip end-of-component 
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CompositeComponent	TokenNameIdentifier	 Composite Component
{	TokenNameLBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompositeComponent	TokenNameIdentifier	 Composite Component
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CompositeComponent	TokenNameIdentifier	 Composite Component
>	TokenNameGREATER	
deconstruct	TokenNameIdentifier	 deconstruct
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CompositeComponent	TokenNameIdentifier	 Composite Component
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CompositeComponent	TokenNameIdentifier	 Composite Component
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getWithShortLength	TokenNameIdentifier	 get With Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CompositeComponent	TokenNameIdentifier	 Composite Component
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore; not relevant here 	TokenNameCOMMENT_LINE	Ignore; not relevant here 
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Escapes all occurences of the ':' character from the input, replacing them by "\:". * Furthermore, if the last character is '\' or '!', a '!' is appended. */	TokenNameCOMMENT_BLOCK	 Escapes all occurences of the ':' character from the input, replacing them by "\:". Furthermore, if the last character is '\' or '!', a '!' is appended. 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
,	TokenNameCOMMA	
"\\:"	TokenNameStringLiteral	\\:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
'!'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
res	TokenNameIdentifier	 res
+	TokenNamePLUS	
'!'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Reverses the effect of espace(). * Replaces all occurences of "\:" by ":" and remove last character if it is '!'. */	TokenNameCOMMENT_BLOCK	 Reverses the effect of espace(). Replaces all occurences of "\:" by ":" and remove last character if it is '!'. 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
unescape	TokenNameIdentifier	 unescape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\:"	TokenNameStringLiteral	\\:
,	TokenNameCOMMA	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
==	TokenNameEQUAL_EQUAL	
'!'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Split the input on character ':', unless the previous character is '\'. */	TokenNameCOMMENT_BLOCK	 Split the input on character ':', unless the previous character is '\'. 
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
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
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
':'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
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
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
getAndAppendComparator	TokenNameIdentifier	 get And Append Comparator
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getWithShortLength	TokenNameIdentifier	 get With Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":!"	TokenNameStringLiteral	:!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
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
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
>	TokenNameGREATER	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
>	TokenNameGREATER	
(	TokenNameLPAREN	
parts	TokenNameIdentifier	 parts
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalLength	TokenNameIdentifier	 total Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lastByteIsOne	TokenNameIdentifier	 last Byte Is One
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
:	TokenNameCOLON	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastByteIsOne	TokenNameIdentifier	 last Byte Is One
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
parseComparator	TokenNameIdentifier	 parse Comparator
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getAbstractType	TokenNameIdentifier	 get Abstract Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getRemainingPart	TokenNameIdentifier	 get Remaining Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
unescape	TokenNameIdentifier	 unescape
(	TokenNameLPAREN	
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalLength	TokenNameIdentifier	 total Length
+=	TokenNamePLUS_EQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getComparatorSerializedSize	TokenNameIdentifier	 get Comparator Serialized Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
totalLength	TokenNameIdentifier	 total Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
component	TokenNameIdentifier	 component
:	TokenNameCOLON	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
serializeComparator	TokenNameIdentifier	 serialize Comparator
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
putShortLength	TokenNameIdentifier	 put Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// it's ok to consume component as we won't use it anymore 	TokenNameCOMMENT_LINE	it's ok to consume component as we won't use it anymore 
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastByteIsOne	TokenNameIdentifier	 last Byte Is One
)	TokenNameRPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bb	TokenNameIdentifier	 bb
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
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
validateComparator	TokenNameIdentifier	 validate Comparator
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Not enough bytes to read value size of component "	TokenNameStringLiteral	Not enough bytes to read value size of component 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getShortLength	TokenNameIdentifier	 get Short Length
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Not enough bytes to read value of component "	TokenNameStringLiteral	Not enough bytes to read value of component 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
validateCollectionMember	TokenNameIdentifier	 validate Collection Member
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Not enough bytes to read the end-of-component byte of component"	TokenNameStringLiteral	Not enough bytes to read the end-of-component byte of component
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bb	TokenNameIdentifier	 bb
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Invalid bytes remaining after an end-of-component at component"	TokenNameStringLiteral	Invalid bytes remaining after an end-of-component at component
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the comparator for the given component. static CompositeType will consult * @param i DynamicCompositeType will read the type information from @param bb * @param bb name of type definition */	TokenNameCOMMENT_JAVADOC	 @return the comparator for the given component. static CompositeType will consult @param i DynamicCompositeType will read the type information from @param bb @param bb name of type definition 
abstract	TokenNameabstract	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds DynamicCompositeType type information from @param bb1 to @param bb2. * @param i is ignored. */	TokenNameCOMMENT_JAVADOC	 Adds DynamicCompositeType type information from @param bb1 to @param bb2. @param i is ignored. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb1	TokenNameIdentifier	 bb1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb2	TokenNameIdentifier	 bb2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds type information from @param bb to @param sb. @param i is ignored. */	TokenNameCOMMENT_JAVADOC	 Adds type information from @param bb to @param sb. @param i is ignored. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getAndAppendComparator	TokenNameIdentifier	 get And Append Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
,	TokenNameCOMMA	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Like getComparator, but validates that @param i does not exceed the defined range */	TokenNameCOMMENT_JAVADOC	 Like getComparator, but validates that @param i does not exceed the defined range 
abstract	TokenNameabstract	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
validateComparator	TokenNameIdentifier	 validate Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
;	TokenNameSEMICOLON	
/** * Used by fromString */	TokenNameCOMMENT_JAVADOC	 Used by fromString 
abstract	TokenNameabstract	
protected	TokenNameprotected	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
parseComparator	TokenNameIdentifier	 parse Comparator
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
interface	TokenNameinterface	
ParsedComparator	TokenNameIdentifier	 Parsed Comparator
{	TokenNameLBRACE	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getAbstractType	TokenNameIdentifier	 get Abstract Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getRemainingPart	TokenNameIdentifier	 get Remaining Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
getComparatorSerializedSize	TokenNameIdentifier	 get Comparator Serialized Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
serializeComparator	TokenNameIdentifier	 serialize Comparator
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
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
*	TokenNameMULTIPLY	
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
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MapType	TokenNameIdentifier	 Map Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
CollectionType	TokenNameIdentifier	 Collection Type
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
// interning instances 	TokenNameCOMMENT_LINE	interning instances 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
,	TokenNameCOMMA	
MapType	TokenNameIdentifier	 Map Type
>	TokenNameGREATER	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
,	TokenNameCOMMA	
MapType	TokenNameIdentifier	 Map Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
MapType	TokenNameIdentifier	 Map Type
<	TokenNameLESS	
?	TokenNameQUESTION	
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
TypeParser	TokenNameIdentifier	 Type Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getTypeParameters	TokenNameIdentifier	 get Type Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"MapType takes exactly 2 type parameters"	TokenNameStringLiteral	MapType takes exactly 2 type parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
MapType	TokenNameIdentifier	 Map Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
<	TokenNameLESS	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MapType	TokenNameIdentifier	 Map Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MapType	TokenNameIdentifier	 Map Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
MapType	TokenNameIdentifier	 Map Type
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
MAP	TokenNameIdentifier	 MAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
nameComparator	TokenNameIdentifier	 name Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
valueComparator	TokenNameIdentifier	 value Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sk	TokenNameIdentifier	 sk
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
datak	TokenNameIdentifier	 datak
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
sk	TokenNameIdentifier	 sk
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
datak	TokenNameIdentifier	 datak
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
kbb	TokenNameIdentifier	 kbb
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
datak	TokenNameIdentifier	 datak
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
kbb	TokenNameIdentifier	 kbb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sv	TokenNameIdentifier	 sv
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
getShort	TokenNameIdentifier	 get Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
datav	TokenNameIdentifier	 datav
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
sv	TokenNameIdentifier	 sv
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
datav	TokenNameIdentifier	 datav
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
vbb	TokenNameIdentifier	 vbb
=	TokenNameEQUAL	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
datav	TokenNameIdentifier	 datav
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
vbb	TokenNameIdentifier	 vbb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
kbb	TokenNameIdentifier	 kbb
)	TokenNameRPAREN	
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
vbb	TokenNameIdentifier	 vbb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BufferUnderflowException	TokenNameIdentifier	 Buffer Underflow Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
"Not enough bytes to read a map"	TokenNameStringLiteral	Not enough bytes to read a map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Layout is: {@code <n><sk_1><k_1><sv_1><v_1>...<sk_n><k_n><sv_n><v_n> } * where: * n is the number of elements * sk_i is the number of bytes composing the ith key k_i * k_i is the sk_i bytes composing the ith key * sv_i is the number of bytes composing the ith value v_i * v_i is the sv_i bytes composing the ith value */	TokenNameCOMMENT_JAVADOC	 Layout is: {@code <n><sk_1><k_1><sv_1><v_1>...<sk_n><k_n><sv_n><v_n> } where: n is the number of elements sk_i is the number of bytes composing the ith key k_i k_i is the sk_i bytes composing the ith key sv_i is the number of bytes composing the ith value v_i v_i is the sv_i bytes composing the ith value 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
bbs	TokenNameIdentifier	 bbs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bbk	TokenNameIdentifier	 bbk
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bbv	TokenNameIdentifier	 bbv
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bbs	TokenNameIdentifier	 bbs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bbk	TokenNameIdentifier	 bbk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bbs	TokenNameIdentifier	 bbs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bbv	TokenNameIdentifier	 bbv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bbk	TokenNameIdentifier	 bbk
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bbv	TokenNameIdentifier	 bbv
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pack	TokenNameIdentifier	 pack
(	TokenNameLPAREN	
bbs	TokenNameIdentifier	 bbs
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
appendToStringBuilder	TokenNameIdentifier	 append To String Builder
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
stringifyTypeParameters	TokenNameIdentifier	 stringify Type Parameters
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the same output than decompose, but from the internal representation. */	TokenNameCOMMENT_JAVADOC	 Creates the same output than decompose, but from the internal representation. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
bbs	TokenNameIdentifier	 bbs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
p	TokenNameIdentifier	 p
:	TokenNameCOLON	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bbs	TokenNameIdentifier	 bbs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bbs	TokenNameIdentifier	 bbs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pack	TokenNameIdentifier	 pack
(	TokenNameLPAREN	
bbs	TokenNameIdentifier	 bbs
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

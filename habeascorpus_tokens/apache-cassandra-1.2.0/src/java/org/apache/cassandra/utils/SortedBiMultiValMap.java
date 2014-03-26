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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedMap	TokenNameIdentifier	 Sorted Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
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
SortedSetMultimap	TokenNameIdentifier	 Sorted Set Multimap
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
TreeMultimap	TokenNameIdentifier	 Tree Multimap
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
extends	TokenNameextends	
BiMultiValMap	TokenNameIdentifier	 Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
(	TokenNameLPAREN	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
forwardMap	TokenNameIdentifier	 forward Map
,	TokenNameCOMMA	
SortedSetMultimap	TokenNameIdentifier	 Sorted Set Multimap
<	TokenNameLESS	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
reverseMap	TokenNameIdentifier	 reverse Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
forwardMap	TokenNameIdentifier	 forward Map
,	TokenNameCOMMA	
reverseMap	TokenNameIdentifier	 reverse Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TreeMultimap	TokenNameIdentifier	 Tree Multimap
.	TokenNameDOT	
<	TokenNameLESS	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keyComparator	TokenNameIdentifier	 key Comparator
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
valueComparator	TokenNameIdentifier	 value Comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyComparator	TokenNameIdentifier	 key Comparator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
keyComparator	TokenNameIdentifier	 key Comparator
=	TokenNameEQUAL	
defaultComparator	TokenNameIdentifier	 default Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueComparator	TokenNameIdentifier	 value Comparator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
valueComparator	TokenNameIdentifier	 value Comparator
=	TokenNameEQUAL	
defaultComparator	TokenNameIdentifier	 default Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
keyComparator	TokenNameIdentifier	 key Comparator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TreeMultimap	TokenNameIdentifier	 Tree Multimap
.	TokenNameDOT	
<	TokenNameLESS	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
valueComparator	TokenNameIdentifier	 value Comparator
,	TokenNameCOMMA	
keyComparator	TokenNameIdentifier	 key Comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
BiMultiValMap	TokenNameIdentifier	 Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
.	TokenNameDOT	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMap	TokenNameIdentifier	 new Map
.	TokenNameDOT	
forwardMap	TokenNameIdentifier	 forward Map
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMap	TokenNameIdentifier	 new Map
.	TokenNameDOT	
reverseMap	TokenNameIdentifier	 reverse Map
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
inverse	TokenNameIdentifier	 inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
BiMultiValMap	TokenNameIdentifier	 Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keyComparator	TokenNameIdentifier	 key Comparator
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
valueComparator	TokenNameIdentifier	 value Comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedBiMultiValMap	TokenNameIdentifier	 Sorted Bi Multi Val Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
keyComparator	TokenNameIdentifier	 key Comparator
,	TokenNameCOMMA	
valueComparator	TokenNameIdentifier	 value Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMap	TokenNameIdentifier	 new Map
.	TokenNameDOT	
forwardMap	TokenNameIdentifier	 forward Map
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMap	TokenNameIdentifier	 new Map
.	TokenNameDOT	
reverseMap	TokenNameIdentifier	 reverse Map
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
inverse	TokenNameIdentifier	 inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
defaultComparator	TokenNameIdentifier	 default Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

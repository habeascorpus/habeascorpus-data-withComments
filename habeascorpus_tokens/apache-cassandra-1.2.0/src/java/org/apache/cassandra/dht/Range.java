/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ObjectUtils	TokenNameIdentifier	 Object Utils
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
RowPosition	TokenNameIdentifier	 Row Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
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
/** * A representation of the range that a node is responsible for on the DHT ring. * * A Range is responsible for the tokens between (left, right]. * * Used by the partitioner and by map/reduce by-token range scans. */	TokenNameCOMMENT_JAVADOC	 A representation of the range that a node is responsible for on the DHT ring. * A Range is responsible for the tokens between (left, right]. * Used by the partitioner and by map/reduce by-token range scans. 
public	TokenNamepublic	
class	TokenNameclass	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
extends	TokenNameextends	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * We are wrapping around, so the interval is (a,b] where a >= b, * then we have 3 cases which hold for any given token k: * (1) a < k -- return true * (2) k <= b -- return true * (3) b < k <= a -- return false */	TokenNameCOMMENT_BLOCK	 We are wrapping around, so the interval is (a,b] where a >= b, then we have 3 cases which hold for any given token k: (1) a < k -- return true (2) k <= b -- return true (3) b < k <= a -- return false 
if	TokenNameif	
(	TokenNameLPAREN	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * This is the range (a, b] where a < b. */	TokenNameCOMMENT_BLOCK	 This is the range (a, b] where a < b. 
return	TokenNamereturn	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// full ring always contains all other ranges 	TokenNameCOMMENT_LINE	full ring always contains all other ranges 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
thiswraps	TokenNameIdentifier	 thiswraps
=	TokenNameEQUAL	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
thatwraps	TokenNameIdentifier	 thatwraps
=	TokenNameEQUAL	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thiswraps	TokenNameIdentifier	 thiswraps
==	TokenNameEQUAL_EQUAL	
thatwraps	TokenNameIdentifier	 thatwraps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
thiswraps	TokenNameIdentifier	 thiswraps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wrapping might contain non-wrapping 	TokenNameCOMMENT_LINE	wrapping might contain non-wrapping 
// that is contained if both its tokens are in one of our wrap segments 	TokenNameCOMMENT_LINE	that is contained if both its tokens are in one of our wrap segments 
return	TokenNamereturn	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// (thatwraps) 	TokenNameCOMMENT_LINE	(thatwraps) 
// non-wrapping cannot contain wrapping 	TokenNameCOMMENT_LINE	non-wrapping cannot contain wrapping 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helps determine if a given point on the DHT ring is contained * in the range in question. * @param point point in question * @return true if the point contains within the range else false. */	TokenNameCOMMENT_JAVADOC	 Helps determine if a given point on the DHT ring is contained in the range in question. @param point point in question @return true if the point contains within the range else false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param that range to check for intersection * @return true if the given range intersects with this range. */	TokenNameCOMMENT_JAVADOC	 @param that range to check for intersection @return true if the given range intersects with this range. 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intersectionWith	TokenNameIdentifier	 intersection With
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// implemented for cleanup compaction membership test, so only Range + Bounds are supported for now 	TokenNameCOMMENT_LINE	implemented for cleanup compaction membership test, so only Range + Bounds are supported for now 
if	TokenNameif	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
instanceof	TokenNameinstanceof	
Range	TokenNameIdentifier	 Range
)	TokenNameRPAREN	
return	TokenNamereturn	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
)	TokenNameRPAREN	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
instanceof	TokenNameinstanceof	
Bounds	TokenNameIdentifier	 Bounds
)	TokenNameRPAREN	
return	TokenNamereturn	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Bounds	TokenNameIdentifier	 Bounds
)	TokenNameRPAREN	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Intersection is only supported for Bounds and Range objects; found "	TokenNameStringLiteral	Intersection is only supported for Bounds and Range objects; found 
+	TokenNamePLUS	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param that range to check for intersection * @return true if the given range intersects with this range. */	TokenNameCOMMENT_JAVADOC	 @param that range to check for intersection @return true if the given range intersects with this range. 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Bounds	TokenNameIdentifier	 Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
rangeSet	TokenNameIdentifier	 range Set
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
...	TokenNameELLIPSIS	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
rangeSet	TokenNameIdentifier	 range Set
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param that * @return the intersection of the two Ranges. this can be two disjoint Ranges if one is wrapping and one is not. * say you have nodes G and M, with query range (D,T]; the intersection is (M-T] and (D-G]. * If there is no intersection, an empty list is returned. */	TokenNameCOMMENT_JAVADOC	 @param that @return the intersection of the two Ranges. this can be two disjoint Ranges if one is wrapping and one is not. say you have nodes G and M, with query range (D,T]; the intersection is (M-T] and (D-G]. If there is no intersection, an empty list is returned. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
intersectionWith	TokenNameIdentifier	 intersection With
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
rangeSet	TokenNameIdentifier	 range Set
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
rangeSet	TokenNameIdentifier	 range Set
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
thiswraps	TokenNameIdentifier	 thiswraps
=	TokenNameEQUAL	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
thatwraps	TokenNameIdentifier	 thatwraps
=	TokenNameEQUAL	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
thiswraps	TokenNameIdentifier	 thiswraps
&&	TokenNameAND_AND	
!	TokenNameNOT	
thatwraps	TokenNameIdentifier	 thatwraps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// neither wraps. the straightforward case. 	TokenNameCOMMENT_LINE	neither wraps. the straightforward case. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rangeSet	TokenNameIdentifier	 range Set
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
ObjectUtils	TokenNameIdentifier	 Object Utils
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
ObjectUtils	TokenNameIdentifier	 Object Utils
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thiswraps	TokenNameIdentifier	 thiswraps
&&	TokenNameAND_AND	
thatwraps	TokenNameIdentifier	 thatwraps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the starts are the same, one contains the other, which we have already ruled out. 	TokenNameCOMMENT_LINE	if the starts are the same, one contains the other, which we have already ruled out. 
assert	TokenNameassert	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// two wrapping ranges always intersect. 	TokenNameCOMMENT_LINE	two wrapping ranges always intersect. 
// since we have already determined that neither this nor that contains the other, we have 2 cases, 	TokenNameCOMMENT_LINE	since we have already determined that neither this nor that contains the other, we have 2 cases, 
// and mirror images of those case. 	TokenNameCOMMENT_LINE	and mirror images of those case. 
// (1) both of that's (1, 2] endpoints lie in this's (A, B] right segment: 	TokenNameCOMMENT_LINE	(1) both of that's (1, 2] endpoints lie in this's (A, B] right segment: 
// ---------B--------A--1----2------> 	TokenNameCOMMENT_LINE	---------B--------A--1----2------> 
// (2) only that's start endpoint lies in this's right segment: 	TokenNameCOMMENT_LINE	(2) only that's start endpoint lies in this's right segment: 
// ---------B----1---A-------2------> 	TokenNameCOMMENT_LINE	---------B----1---A-------2------> 
// or, we have the same cases on the left segement, which we can handle by swapping this and that. 	TokenNameCOMMENT_LINE	or, we have the same cases on the left segement, which we can handle by swapping this and that. 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
intersectionBothWrapping	TokenNameIdentifier	 intersection Both Wrapping
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
:	TokenNameCOLON	
intersectionBothWrapping	TokenNameIdentifier	 intersection Both Wrapping
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thiswraps	TokenNameIdentifier	 thiswraps
&&	TokenNameAND_AND	
!	TokenNameNOT	
thatwraps	TokenNameIdentifier	 thatwraps
)	TokenNameRPAREN	
return	TokenNamereturn	
intersectionOneWrapping	TokenNameIdentifier	 intersection One Wrapping
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
!	TokenNameNOT	
thiswraps	TokenNameIdentifier	 thiswraps
&&	TokenNameAND_AND	
thatwraps	TokenNameIdentifier	 thatwraps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
intersectionOneWrapping	TokenNameIdentifier	 intersection One Wrapping
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
intersectionBothWrapping	TokenNameIdentifier	 intersection Both Wrapping
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
intersection	TokenNameIdentifier	 intersection
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
intersection	TokenNameIdentifier	 intersection
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
intersection	TokenNameIdentifier	 intersection
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
intersection	TokenNameIdentifier	 intersection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
intersectionOneWrapping	TokenNameIdentifier	 intersection One Wrapping
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
wrapping	TokenNameIdentifier	 wrapping
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
intersection	TokenNameIdentifier	 intersection
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
intersection	TokenNameIdentifier	 intersection
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// need the extra compareto here because ranges are asymmetrical; wrapping.left _is not_ contained by the wrapping range 	TokenNameCOMMENT_LINE	need the extra compareto here because ranges are asymmetrical; wrapping.left _is not_ contained by the wrapping range 
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
intersection	TokenNameIdentifier	 intersection
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
wrapping	TokenNameIdentifier	 wrapping
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
intersection	TokenNameIdentifier	 intersection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
,	TokenNameCOMMA	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
||	TokenNameOR_OR	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the split would have no effect on the range 	TokenNameCOMMENT_LINE	Check if the split would have no effect on the range 
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
||	TokenNameOR_OR	
position	TokenNameIdentifier	 position
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
lb	TokenNameIdentifier	 lb
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
lb	TokenNameIdentifier	 lb
,	TokenNameCOMMA	
rb	TokenNameIdentifier	 rb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
minValue	TokenNameIdentifier	 min Value
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
unwrapped	TokenNameIdentifier	 unwrapped
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unwrapped	TokenNameIdentifier	 unwrapped
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
minValue	TokenNameIdentifier	 min Value
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unwrapped	TokenNameIdentifier	 unwrapped
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
minValue	TokenNameIdentifier	 min Value
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
unwrapped	TokenNameIdentifier	 unwrapped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if the given range is a wrap around. */	TokenNameCOMMENT_JAVADOC	 Tells if the given range is a wrap around. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
boolean	TokenNameboolean	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * If the range represented by the "this" pointer * is a wrap around then it is the smaller one. */	TokenNameCOMMENT_BLOCK	 If the range represented by the "this" pointer is a wrap around then it is the smaller one. 
if	TokenNameif	
(	TokenNameLPAREN	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subtracts a portion of this range. * @param contained The range to subtract from this. It must be totally * contained by this range. * @return An ArrayList of the Ranges left after subtracting contained * from this. */	TokenNameCOMMENT_JAVADOC	 Subtracts a portion of this range. @param contained The range to subtract from this. It must be totally contained by this range. @return An ArrayList of the Ranges left after subtracting contained from this. 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
subtractContained	TokenNameIdentifier	 subtract Contained
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
contained	TokenNameIdentifier	 contained
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
difference	TokenNameIdentifier	 difference
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
contained	TokenNameIdentifier	 contained
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
difference	TokenNameIdentifier	 difference
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
contained	TokenNameIdentifier	 contained
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
contained	TokenNameIdentifier	 contained
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
difference	TokenNameIdentifier	 difference
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
contained	TokenNameIdentifier	 contained
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
difference	TokenNameIdentifier	 difference
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
differenceToFetch	TokenNameIdentifier	 difference To Fetch
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate set of the difference ranges of given two ranges * (as current (A, B] and rhs is (C, D]) * which node will need to fetch when moving to a given new token * * @param rhs range to calculate difference * @return set of difference ranges */	TokenNameCOMMENT_JAVADOC	 Calculate set of the difference ranges of given two ranges (as current (A, B] and rhs is (C, D]) which node will need to fetch when moving to a given new token * @param rhs range to calculate difference @return set of difference ranges 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
differenceToFetch	TokenNameIdentifier	 difference To Fetch
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
intersectionSet	TokenNameIdentifier	 intersection Set
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
intersectionWith	TokenNameIdentifier	 intersection With
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intersectionSet	TokenNameIdentifier	 intersection Set
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Range	TokenNameIdentifier	 Range
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intersections	TokenNameIdentifier	 intersections
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
[	TokenNameLBRACKET	
intersectionSet	TokenNameIdentifier	 intersection Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
intersectionSet	TokenNameIdentifier	 intersection Set
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
intersections	TokenNameIdentifier	 intersections
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intersections	TokenNameIdentifier	 intersections
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
subtractContained	TokenNameIdentifier	 subtract Contained
(	TokenNameLPAREN	
intersections	TokenNameIdentifier	 intersections
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// intersections.length must be 2 	TokenNameCOMMENT_LINE	intersections.length must be 2 
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
intersections	TokenNameIdentifier	 intersections
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
second	TokenNameIdentifier	 second
=	TokenNameEQUAL	
intersections	TokenNameIdentifier	 intersections
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
subtractContained	TokenNameIdentifier	 subtract Contained
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Because there are two intersections, subtracting only one of them 	TokenNameCOMMENT_LINE	Because there are two intersections, subtracting only one of them 
// will yield a single Range. 	TokenNameCOMMENT_LINE	will yield a single Range. 
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
single	TokenNameIdentifier	 single
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
single	TokenNameIdentifier	 single
.	TokenNameDOT	
subtractContained	TokenNameIdentifier	 subtract Contained
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
boolean	TokenNameboolean	
isInRanges	TokenNameIdentifier	 is In Ranges
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
ranges	TokenNameIdentifier	 ranges
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
:	TokenNameCOLON	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Range	TokenNameIdentifier	 Range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rhs	TokenNameIdentifier	 rhs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
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
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getOpeningString	TokenNameIdentifier	 get Opening String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getClosingString	TokenNameIdentifier	 get Closing String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A copy of the given list of with all ranges unwrapped, sorted by left bound and with overlapping bounds merged. */	TokenNameCOMMENT_JAVADOC	 @return A copy of the given list of with all ranges unwrapped, sorted by left bound and with overlapping bounds merged. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// unwrap all 	TokenNameCOMMENT_LINE	unwrap all 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
:	TokenNameCOLON	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sort by left 	TokenNameCOMMENT_LINE	sort by left 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
b1	TokenNameIdentifier	 b1
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
b2	TokenNameIdentifier	 b2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
b1	TokenNameIdentifier	 b1
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
b2	TokenNameIdentifier	 b2
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deoverlap 	TokenNameCOMMENT_LINE	deoverlap 
return	TokenNamereturn	
deoverlap	TokenNameIdentifier	 deoverlap
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a list of unwrapped ranges sorted by left position, return an * equivalent list of ranges but with no overlapping ranges. */	TokenNameCOMMENT_JAVADOC	 Given a list of unwrapped ranges sorted by left position, return an equivalent list of ranges but with no overlapping ranges. 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
deoverlap	TokenNameIdentifier	 deoverlap
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ranges	TokenNameIdentifier	 ranges
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
minValue	TokenNameIdentifier	 min Value
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If current goes to the end of the ring, we're done 	TokenNameCOMMENT_LINE	If current goes to the end of the ring, we're done 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If one range is the full range, we return only that 	TokenNameCOMMENT_LINE	If one range is the full range, we return only that 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if next left is equal to current right, we do not intersect per se, but replacing (A, B] and (B, C] by (A, C] is 	TokenNameCOMMENT_LINE	if next left is equal to current right, we do not intersect per se, but replacing (A, B] and (B, C] by (A, C] is 
// legit, and since this avoid special casing and will result in more "optimal" ranges, we do the transformation 	TokenNameCOMMENT_LINE	legit, and since this avoid special casing and will result in more "optimal" ranges, we do the transformation 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We do overlap 	TokenNameCOMMENT_LINE	We do overlap 
// (we've handled current.right.equals(min) already) 	TokenNameCOMMENT_LINE	(we've handled current.right.equals(min) already) 
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
||	TokenNameOR_OR	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute a range of keys corresponding to a given range of token. */	TokenNameCOMMENT_JAVADOC	 Compute a range of keys corresponding to a given range of token. 
public	TokenNamepublic	
static	TokenNamestatic	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
makeRowRange	TokenNameIdentifier	 make Row Range
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
maxKeyBound	TokenNameIdentifier	 max Key Bound
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
maxKeyBound	TokenNameIdentifier	 max Key Bound
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
toRowBounds	TokenNameIdentifier	 to Row Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
?	TokenNameQUESTION	
makeRowRange	TokenNameIdentifier	 make Row Range
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
toTokenBounds	TokenNameIdentifier	 to Token Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

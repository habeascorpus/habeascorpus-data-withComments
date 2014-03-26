/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
tier	TokenNameIdentifier	 tier
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
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
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
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
FieldCache	TokenNameIdentifier	 Field Cache
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
Filter	TokenNameIdentifier	 Filter
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
DocIdSet	TokenNameIdentifier	 Doc Id Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
DistanceUtils	TokenNameIdentifier	 Distance Utils
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
extends	TokenNameextends	
DistanceFilter	TokenNameIdentifier	 Distance Filter
{	TokenNameLBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
latField	TokenNameIdentifier	 lat Field
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lngField	TokenNameIdentifier	 lng Field
;	TokenNameSEMICOLON	
int	TokenNameint	
nextOffset	TokenNameIdentifier	 next Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Provide a distance filter based from a center point with a radius * in miles. * @param startingFilter Filter to start from * @param lat * @param lng * @param miles * @param latField * @param lngField */	TokenNameCOMMENT_JAVADOC	 Provide a distance filter based from a center point with a radius in miles. @param startingFilter Filter to start from @param lat @param lng @param miles @param latField @param lngField 
public	TokenNamepublic	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
startingFilter	TokenNameIdentifier	 starting Filter
,	TokenNameCOMMA	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
double	TokenNamedouble	
miles	TokenNameIdentifier	 miles
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
latField	TokenNameIdentifier	 lat Field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lngField	TokenNameIdentifier	 lng Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
startingFilter	TokenNameIdentifier	 starting Filter
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
latField	TokenNameIdentifier	 lat Field
=	TokenNameEQUAL	
latField	TokenNameIdentifier	 lat Field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lngField	TokenNameIdentifier	 lng Field
=	TokenNameEQUAL	
lngField	TokenNameIdentifier	 lng Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latIndex	TokenNameIdentifier	 lat Index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
latField	TokenNameIdentifier	 lat Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lngIndex	TokenNameIdentifier	 lng Index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
lngField	TokenNameIdentifier	 lng Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
nextDocBase	TokenNameIdentifier	 next Doc Base
;	TokenNameSEMICOLON	
nextDocBase	TokenNameIdentifier	 next Doc Base
+=	TokenNamePLUS_EQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
FilteredDocIdSet	TokenNameIdentifier	 Filtered Doc Id Set
(	TokenNameLPAREN	
startingFilter	TokenNameIdentifier	 starting Filter
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
latIndex	TokenNameIdentifier	 lat Index
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
lngIndex	TokenNameIdentifier	 lng Index
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// round off lat / longs if necessary 	TokenNameCOMMENT_LINE	round off lat / longs if necessary 
// x = DistanceHandler.getPrecision(x, precise); 	TokenNameCOMMENT_LINE	x = DistanceHandler.getPrecision(x, precise); 
// y = DistanceHandler.getPrecision(y, precise); 	TokenNameCOMMENT_LINE	y = DistanceHandler.getPrecision(y, precise); 
String	TokenNameIdentifier	 String
ck	TokenNameIdentifier	 ck
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
cachedDistance	TokenNameIdentifier	 cached Distance
=	TokenNameEQUAL	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ck	TokenNameIdentifier	 ck
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cachedDistance	TokenNameIdentifier	 cached Distance
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
cachedDistance	TokenNameIdentifier	 cached Distance
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
DistanceUtils	TokenNameIdentifier	 Distance Utils
.	TokenNameDOT	
getDistanceMi	TokenNameIdentifier	 get Distance Mi
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ck	TokenNameIdentifier	 ck
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Save distances, so they can be pulled for 	TokenNameCOMMENT_LINE	Save distances, so they can be pulled for 
// sorting after filtering is done: 	TokenNameCOMMENT_LINE	sorting after filtering is done: 
distances	TokenNameIdentifier	 distances
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
docBase	TokenNameIdentifier	 doc Base
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. 
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
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
startingFilter	TokenNameIdentifier	 starting Filter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
startingFilter	TokenNameIdentifier	 starting Filter
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lat	TokenNameIdentifier	 lat
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lng	TokenNameIdentifier	 lng
||	TokenNameOR_OR	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
latField	TokenNameIdentifier	 lat Field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
latField	TokenNameIdentifier	 lat Field
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
lngField	TokenNameIdentifier	 lng Field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
lngField	TokenNameIdentifier	 lng Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object.*/	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
startingFilter	TokenNameIdentifier	 starting Filter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
latField	TokenNameIdentifier	 lat Field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
^=	TokenNameXOR_EQUAL	
lngField	TokenNameIdentifier	 lng Field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

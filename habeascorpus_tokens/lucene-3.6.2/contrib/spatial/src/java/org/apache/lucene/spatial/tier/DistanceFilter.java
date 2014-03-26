/** Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
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
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
tier	TokenNameIdentifier	 tier
.	TokenNameDOT	
DistanceHandler	TokenNameIdentifier	 Distance Handler
.	TokenNameDOT	
Precision	TokenNameIdentifier	 Precision
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DistanceFilter	TokenNameIdentifier	 Distance Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
final	TokenNamefinal	
protected	TokenNameprotected	
Filter	TokenNameIdentifier	 Filter
startingFilter	TokenNameIdentifier	 starting Filter
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Precision	TokenNameIdentifier	 Precision
precise	TokenNameIdentifier	 precise
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distances	TokenNameIdentifier	 distances
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
nextDocBase	TokenNameIdentifier	 next Doc Base
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
;	TokenNameSEMICOLON	
/** Filters the startingFilter by precise distance * checking filter */	TokenNameCOMMENT_JAVADOC	 Filters the startingFilter by precise distance checking filter 
public	TokenNamepublic	
DistanceFilter	TokenNameIdentifier	 Distance Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
startingFilter	TokenNameIdentifier	 starting Filter
,	TokenNameCOMMA	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startingFilter	TokenNameIdentifier	 starting Filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"please provide a non-null startingFilter; you can use QueryWrapperFilter(MatchAllDocsQuery) as a no-op filter"	TokenNameStringLiteral	please provide a non-null startingFilter; you can use QueryWrapperFilter(MatchAllDocsQuery) as a no-op filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startingFilter	TokenNameIdentifier	 starting Filter
=	TokenNameEQUAL	
startingFilter	TokenNameIdentifier	 starting Filter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
// NOTE: neither of the distance filters use precision 	TokenNameCOMMENT_LINE	NOTE: neither of the distance filters use precision 
// now - if we turn that on, we'll need to pass top 	TokenNameCOMMENT_LINE	now - if we turn that on, we'll need to pass top 
// reader into here 	TokenNameCOMMENT_LINE	reader into here 
// setPrecision(reader.maxDoc()); 	TokenNameCOMMENT_LINE	setPrecision(reader.maxDoc()); 
/* store calculated distances for reuse by other components */	TokenNameCOMMENT_BLOCK	 store calculated distances for reuse by other components 
distances	TokenNameIdentifier	 distances
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create an intermediate cache to avoid recomputing 	TokenNameCOMMENT_LINE	create an intermediate cache to avoid recomputing 
// distances for the same point 	TokenNameCOMMENT_LINE	distances for the same point 
// TODO: Why is this a WeakHashMap? 	TokenNameCOMMENT_LINE	TODO: Why is this a WeakHashMap? 
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** needed for deserialization, because the cache is transient */	TokenNameCOMMENT_JAVADOC	 needed for deserialization, because the cache is transient 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
distanceLookupCache	TokenNameIdentifier	 distance Lookup Cache
=	TokenNameEQUAL	
new	TokenNamenew	
WeakHashMap	TokenNameIdentifier	 Weak Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
getDistances	TokenNameIdentifier	 get Distances
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
distances	TokenNameIdentifier	 distances
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
distances	TokenNameIdentifier	 distances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDistances	TokenNameIdentifier	 set Distances
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
distances	TokenNameIdentifier	 distances
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
distances	TokenNameIdentifier	 distances
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** You must call this before re-using this DistanceFilter * across searches */	TokenNameCOMMENT_JAVADOC	 You must call this before re-using this DistanceFilter across searches 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextDocBase	TokenNameIdentifier	 next Doc Base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns a hash code value for this object.*/	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* private void setPrecision(int maxDocs) { precise = Precision.EXACT; if (maxDocs > 1000 && distance > 10) { precise = Precision.TWENTYFEET; } if (maxDocs > 10000 && distance > 10){ precise = Precision.TWOHUNDREDFEET; } } */	TokenNameCOMMENT_BLOCK	 private void setPrecision(int maxDocs) { precise = Precision.EXACT; if (maxDocs > 1000 && distance > 10) { precise = Precision.TWENTYFEET; } if (maxDocs > 10000 && distance > 10){ precise = Precision.TWOHUNDREDFEET; } } 
}	TokenNameRBRACE	

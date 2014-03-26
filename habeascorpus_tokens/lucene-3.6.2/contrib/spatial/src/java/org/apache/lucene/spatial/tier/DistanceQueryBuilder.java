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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
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
ChainedFilter	TokenNameIdentifier	 Chained Filter
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
Query	TokenNameIdentifier	 Query
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
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
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
geohash	TokenNameIdentifier	 geohash
.	TokenNameDOT	
GeoHashDistanceFilter	TokenNameIdentifier	 Geo Hash Distance Filter
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DistanceQueryBuilder	TokenNameIdentifier	 Distance Query Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
miles	TokenNameIdentifier	 miles
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DistanceFilter	TokenNameIdentifier	 Distance Filter
distanceFilter	TokenNameIdentifier	 distance Filter
;	TokenNameSEMICOLON	
/** * Create a distance query using * a boundary box wrapper around a more precise * DistanceFilter. * * @param lat The latitude to search around * @param lng the Longitude to search around * @param miles The radius to search within * @param latField The name of the field containing the latitude * @param lngField The name of the field containing the longitude * @param tierFieldPrefix The prefix of the tier * @param needPrecise if true, then distance is calculated in addition to tier info * @param minTierIndexed The minimum tier level indexed * @param maxTierIndexed The maximum tier level indexed */	TokenNameCOMMENT_JAVADOC	 Create a distance query using a boundary box wrapper around a more precise DistanceFilter. * @param lat The latitude to search around @param lng the Longitude to search around @param miles The radius to search within @param latField The name of the field containing the latitude @param lngField The name of the field containing the longitude @param tierFieldPrefix The prefix of the tier @param needPrecise if true, then distance is calculated in addition to tier info @param minTierIndexed The minimum tier level indexed @param maxTierIndexed The maximum tier level indexed 
public	TokenNamepublic	
DistanceQueryBuilder	TokenNameIdentifier	 Distance Query Builder
(	TokenNameLPAREN	
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
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tierFieldPrefix	TokenNameIdentifier	 tier Field Prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
needPrecise	TokenNameIdentifier	 need Precise
,	TokenNameCOMMA	
int	TokenNameint	
minTierIndexed	TokenNameIdentifier	 min Tier Indexed
,	TokenNameCOMMA	
int	TokenNameint	
maxTierIndexed	TokenNameIdentifier	 max Tier Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
miles	TokenNameIdentifier	 miles
=	TokenNameEQUAL	
miles	TokenNameIdentifier	 miles
;	TokenNameSEMICOLON	
CartesianPolyFilterBuilder	TokenNameIdentifier	 Cartesian Poly Filter Builder
cpf	TokenNameIdentifier	 cpf
=	TokenNameEQUAL	
new	TokenNamenew	
CartesianPolyFilterBuilder	TokenNameIdentifier	 Cartesian Poly Filter Builder
(	TokenNameLPAREN	
tierFieldPrefix	TokenNameIdentifier	 tier Field Prefix
,	TokenNameCOMMA	
minTierIndexed	TokenNameIdentifier	 min Tier Indexed
,	TokenNameCOMMA	
maxTierIndexed	TokenNameIdentifier	 max Tier Indexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
cartesianFilter	TokenNameIdentifier	 cartesian Filter
=	TokenNameEQUAL	
cpf	TokenNameIdentifier	 cpf
.	TokenNameDOT	
getBoundingArea	TokenNameIdentifier	 get Bounding Area
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* create precise distance filter */	TokenNameCOMMENT_BLOCK	 create precise distance filter 
if	TokenNameif	
(	TokenNameLPAREN	
needPrecise	TokenNameIdentifier	 need Precise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
new	TokenNamenew	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
(	TokenNameLPAREN	
cartesianFilter	TokenNameIdentifier	 cartesian Filter
,	TokenNameCOMMA	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
,	TokenNameCOMMA	
latField	TokenNameIdentifier	 lat Field
,	TokenNameCOMMA	
lngField	TokenNameIdentifier	 lng Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
cartesianFilter	TokenNameIdentifier	 cartesian Filter
;	TokenNameSEMICOLON	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a distance query using * a boundary box wrapper around a more precise * DistanceFilter. * * @param lat * @param lng * @param miles */	TokenNameCOMMENT_JAVADOC	 Create a distance query using a boundary box wrapper around a more precise DistanceFilter. * @param lat @param lng @param miles 
public	TokenNamepublic	
DistanceQueryBuilder	TokenNameIdentifier	 Distance Query Builder
(	TokenNameLPAREN	
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
geoHashFieldPrefix	TokenNameIdentifier	 geo Hash Field Prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tierFieldPrefix	TokenNameIdentifier	 tier Field Prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
needPrecise	TokenNameIdentifier	 need Precise
,	TokenNameCOMMA	
int	TokenNameint	
minTierIndexed	TokenNameIdentifier	 min Tier Indexed
,	TokenNameCOMMA	
int	TokenNameint	
maxTierIndexed	TokenNameIdentifier	 max Tier Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
miles	TokenNameIdentifier	 miles
=	TokenNameEQUAL	
miles	TokenNameIdentifier	 miles
;	TokenNameSEMICOLON	
CartesianPolyFilterBuilder	TokenNameIdentifier	 Cartesian Poly Filter Builder
cpf	TokenNameIdentifier	 cpf
=	TokenNameEQUAL	
new	TokenNamenew	
CartesianPolyFilterBuilder	TokenNameIdentifier	 Cartesian Poly Filter Builder
(	TokenNameLPAREN	
tierFieldPrefix	TokenNameIdentifier	 tier Field Prefix
,	TokenNameCOMMA	
minTierIndexed	TokenNameIdentifier	 min Tier Indexed
,	TokenNameCOMMA	
maxTierIndexed	TokenNameIdentifier	 max Tier Indexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
cartesianFilter	TokenNameIdentifier	 cartesian Filter
=	TokenNameEQUAL	
cpf	TokenNameIdentifier	 cpf
.	TokenNameDOT	
getBoundingArea	TokenNameIdentifier	 get Bounding Area
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* create precise distance filter */	TokenNameCOMMENT_BLOCK	 create precise distance filter 
if	TokenNameif	
(	TokenNameLPAREN	
needPrecise	TokenNameIdentifier	 need Precise
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
new	TokenNamenew	
GeoHashDistanceFilter	TokenNameIdentifier	 Geo Hash Distance Filter
(	TokenNameLPAREN	
cartesianFilter	TokenNameIdentifier	 cartesian Filter
,	TokenNameCOMMA	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
miles	TokenNameIdentifier	 miles
,	TokenNameCOMMA	
geoHashFieldPrefix	TokenNameIdentifier	 geo Hash Field Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
cartesianFilter	TokenNameIdentifier	 cartesian Filter
;	TokenNameSEMICOLON	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a distance query using * a boundary box wrapper around a more precise * DistanceFilter. */	TokenNameCOMMENT_JAVADOC	 Create a distance query using a boundary box wrapper around a more precise DistanceFilter. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
distanceFilter	TokenNameIdentifier	 distance Filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distanceFilter	TokenNameIdentifier	 distance Filter
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Chain the Query (as filter) with our distance filter 	TokenNameCOMMENT_LINE	Chain the Query (as filter) with our distance filter 
if	TokenNameif	
(	TokenNameLPAREN	
distanceFilter	TokenNameIdentifier	 distance Filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distanceFilter	TokenNameIdentifier	 distance Filter
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
qf	TokenNameIdentifier	 qf
=	TokenNameEQUAL	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ChainedFilter	TokenNameIdentifier	 Chained Filter
(	TokenNameLPAREN	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
qf	TokenNameIdentifier	 qf
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
}	TokenNameRBRACE	
,	TokenNameCOMMA	
ChainedFilter	TokenNameIdentifier	 Chained Filter
.	TokenNameDOT	
AND	TokenNameIdentifier	 AND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DistanceFilter	TokenNameIdentifier	 Distance Filter
getDistanceFilter	TokenNameIdentifier	 get Distance Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
distanceFilter	TokenNameIdentifier	 distance Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ConstantScoreQuery	TokenNameIdentifier	 Constant Score Query
(	TokenNameLPAREN	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLat	TokenNameIdentifier	 get Lat
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lat	TokenNameIdentifier	 lat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLng	TokenNameIdentifier	 get Lng
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lng	TokenNameIdentifier	 lng
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getMiles	TokenNameIdentifier	 get Miles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
miles	TokenNameIdentifier	 miles
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
"DistanceQuery lat: "	TokenNameStringLiteral	DistanceQuery lat: 
+	TokenNamePLUS	
lat	TokenNameIdentifier	 lat
+	TokenNamePLUS	
" lng: "	TokenNameStringLiteral	 lng: 
+	TokenNamePLUS	
lng	TokenNameIdentifier	 lng
+	TokenNamePLUS	
" miles: "	TokenNameStringLiteral	 miles: 
+	TokenNamePLUS	
miles	TokenNameIdentifier	 miles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
geohash	TokenNameIdentifier	 geohash
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
/** * Tests for {@link GeoHashUtils} */	TokenNameCOMMENT_JAVADOC	 Tests for {@link GeoHashUtils} 
public	TokenNamepublic	
class	TokenNameclass	
TestGeoHashUtils	TokenNameIdentifier	 Test Geo Hash Utils
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * Pass condition: lat=42.6, lng=-5.6 should be encoded as "ezs42e44yx96", * lat=57.64911 lng=10.40744 should be encoded as "u4pruydqqvj8" */	TokenNameCOMMENT_JAVADOC	 Pass condition: lat=42.6, lng=-5.6 should be encoded as "ezs42e44yx96", lat=57.64911 lng=10.40744 should be encoded as "u4pruydqqvj8" 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEncode	TokenNameIdentifier	 test Encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
42.6	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5.6	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ezs42e44yx96"	TokenNameStringLiteral	ezs42e44yx96
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
57.64911	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
10.40744	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"u4pruydqqvj8"	TokenNameStringLiteral	u4pruydqqvj8
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass condition: lat=52.3738007, lng=4.8909347 should be encoded and then * decoded within 0.00001 of the original value */	TokenNameCOMMENT_JAVADOC	 Pass condition: lat=52.3738007, lng=4.8909347 should be encoded and then decoded within 0.00001 of the original value 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDecodePreciseLongitudeLatitude	TokenNameIdentifier	 test Decode Precise Longitude Latitude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
52.3738007	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.8909347	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latitudeLongitude	TokenNameIdentifier	 latitude Longitude
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
52.3738007	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
latitudeLongitude	TokenNameIdentifier	 latitude Longitude
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.00001D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4.8909347	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
latitudeLongitude	TokenNameIdentifier	 latitude Longitude
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.00001D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass condition: lat=84.6, lng=10.5 should be encoded and then decoded * within 0.00001 of the original value */	TokenNameCOMMENT_JAVADOC	 Pass condition: lat=84.6, lng=10.5 should be encoded and then decoded within 0.00001 of the original value 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDecodeImpreciseLongitudeLatitude	TokenNameIdentifier	 test Decode Imprecise Longitude Latitude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
84.6	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
10.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latitudeLongitude	TokenNameIdentifier	 latitude Longitude
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
84.6	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
latitudeLongitude	TokenNameIdentifier	 latitude Longitude
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.00001D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
latitudeLongitude	TokenNameIdentifier	 latitude Longitude
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.00001D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * see https://issues.apache.org/jira/browse/LUCENE-1815 for details */	TokenNameCOMMENT_BLOCK	 see https://issues.apache.org/jira/browse/LUCENE-1815 for details 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDecodeEncode	TokenNameIdentifier	 test Decode Encode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
geoHash	TokenNameIdentifier	 geo Hash
=	TokenNameEQUAL	
"u173zq37x014"	TokenNameStringLiteral	u173zq37x014
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
geoHash	TokenNameIdentifier	 geo Hash
,	TokenNameCOMMA	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
52.3738007	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
4.8909347	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decode	TokenNameIdentifier	 decode
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
geoHash	TokenNameIdentifier	 geo Hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
52.37380061d	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.000001d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4.8909343d	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.000001d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
geoHash	TokenNameIdentifier	 geo Hash
,	TokenNameCOMMA	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
geoHash	TokenNameIdentifier	 geo Hash
=	TokenNameEQUAL	
"u173"	TokenNameStringLiteral	u173
;	TokenNameSEMICOLON	
decode	TokenNameIdentifier	 decode
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
"u173"	TokenNameStringLiteral	u173
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
geoHash	TokenNameIdentifier	 geo Hash
=	TokenNameEQUAL	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
geoHash	TokenNameIdentifier	 geo Hash
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.000001d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
decode	TokenNameIdentifier	 decode
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
geoHash	TokenNameIdentifier	 geo Hash
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0.000001d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

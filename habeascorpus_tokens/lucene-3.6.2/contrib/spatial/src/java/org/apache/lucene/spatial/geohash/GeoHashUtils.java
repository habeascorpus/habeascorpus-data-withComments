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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Utilities for encoding and decoding geohashes. Based on * <a href="http://en.wikipedia.org/wiki/Geohash">http://en.wikipedia.org/wiki/Geohash</a>. */	TokenNameCOMMENT_JAVADOC	 Utilities for encoding and decoding geohashes. Based on <a href="http://en.wikipedia.org/wiki/Geohash">http://en.wikipedia.org/wiki/Geohash</a>. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BASE_32	TokenNameIdentifier	 BASE 32
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'0'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'1'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'2'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'3'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'4'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'5'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'6'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'7'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'8'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'9'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'b'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'c'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'd'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'f'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'g'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'h'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'j'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'k'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'm'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'p'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'q'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
't'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'u'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'w'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'x'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'y'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'z'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
DECODE_MAP	TokenNameIdentifier	 DECODE  MAP
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PRECISION	TokenNameIdentifier	 PRECISION
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BITS	TokenNameIdentifier	 BITS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
BASE_32	TokenNameIdentifier	 BASE 32
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DECODE_MAP	TokenNameIdentifier	 DECODE  MAP
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
BASE_32	TokenNameIdentifier	 BASE 32
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
GeoHashUtils	TokenNameIdentifier	 Geo Hash Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Encodes the given latitude and longitude into a geohash * * @param latitude Latitude to encode * @param longitude Longitude to encode * @return Geohash encoding of the longitude and latitude */	TokenNameCOMMENT_JAVADOC	 Encodes the given latitude and longitude into a geohash * @param latitude Latitude to encode @param longitude Longitude to encode @return Geohash encoding of the longitude and latitude 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latInterval	TokenNameIdentifier	 lat Interval
=	TokenNameEQUAL	
{	TokenNameLBRACE	
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
90.0	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lngInterval	TokenNameIdentifier	 lng Interval
=	TokenNameEQUAL	
{	TokenNameLBRACE	
-	TokenNameMINUS	
180.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
180.0	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
geohash	TokenNameIdentifier	 geohash
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isEven	TokenNameIdentifier	 is Even
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
geohash	TokenNameIdentifier	 geohash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
PRECISION	TokenNameIdentifier	 PRECISION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEven	TokenNameIdentifier	 is Even
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
longitude	TokenNameIdentifier	 longitude
>	TokenNameGREATER	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
|=	TokenNameOR_EQUAL	
BITS	TokenNameIdentifier	 BITS
[	TokenNameLBRACKET	
bit	TokenNameIdentifier	 bit
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
latitude	TokenNameIdentifier	 latitude
>	TokenNameGREATER	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
|=	TokenNameOR_EQUAL	
BITS	TokenNameIdentifier	 BITS
[	TokenNameLBRACKET	
bit	TokenNameIdentifier	 bit
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
isEven	TokenNameIdentifier	 is Even
=	TokenNameEQUAL	
!	TokenNameNOT	
isEven	TokenNameIdentifier	 is Even
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bit	TokenNameIdentifier	 bit
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bit	TokenNameIdentifier	 bit
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
geohash	TokenNameIdentifier	 geohash
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
BASE_32	TokenNameIdentifier	 BASE 32
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
geohash	TokenNameIdentifier	 geohash
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decodes the given geohash into a latitude and longitude * * @param geohash Geohash to deocde * @return Array with the latitude at index 0, and longitude at index 1 */	TokenNameCOMMENT_JAVADOC	 Decodes the given geohash into a latitude and longitude * @param geohash Geohash to deocde @return Array with the latitude at index 0, and longitude at index 1 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
geohash	TokenNameIdentifier	 geohash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
latInterval	TokenNameIdentifier	 lat Interval
=	TokenNameEQUAL	
{	TokenNameLBRACE	
-	TokenNameMINUS	
90.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
90.0	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lngInterval	TokenNameIdentifier	 lng Interval
=	TokenNameEQUAL	
{	TokenNameLBRACE	
-	TokenNameMINUS	
180.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
180.0	TokenNameDoubleLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isEven	TokenNameIdentifier	 is Even
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
latitude	TokenNameIdentifier	 latitude
;	TokenNameSEMICOLON	
double	TokenNamedouble	
longitude	TokenNameIdentifier	 longitude
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
geohash	TokenNameIdentifier	 geohash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
DECODE_MAP	TokenNameIdentifier	 DECODE  MAP
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
geohash	TokenNameIdentifier	 geohash
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
:	TokenNameCOLON	
BITS	TokenNameIdentifier	 BITS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isEven	TokenNameIdentifier	 is Even
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cd	TokenNameIdentifier	 cd
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cd	TokenNameIdentifier	 cd
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
isEven	TokenNameIdentifier	 is Even
=	TokenNameEQUAL	
!	TokenNameNOT	
isEven	TokenNameIdentifier	 is Even
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
latitude	TokenNameIdentifier	 latitude
=	TokenNameEQUAL	
(	TokenNameLPAREN	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
latInterval	TokenNameIdentifier	 lat Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
longitude	TokenNameIdentifier	 longitude
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
lngInterval	TokenNameIdentifier	 lng Interval
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2D	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
latitude	TokenNameIdentifier	 latitude
,	TokenNameCOMMA	
longitude	TokenNameIdentifier	 longitude
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
geometry	TokenNameIdentifier	 geometry
;	TokenNameSEMICOLON	
/** * Enum representing difference distance units, currently only kilometers and * miles */	TokenNameCOMMENT_JAVADOC	 Enum representing difference distance units, currently only kilometers and miles 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
enum	TokenNameenum	
DistanceUnits	TokenNameIdentifier	 Distance Units
{	TokenNameLBRACE	
MILES	TokenNameIdentifier	 MILES
(	TokenNameLPAREN	
"miles"	TokenNameStringLiteral	miles
,	TokenNameCOMMA	
3959	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24902	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
(	TokenNameLPAREN	
"km"	TokenNameStringLiteral	km
,	TokenNameCOMMA	
6371	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40076	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MILES_KILOMETRES_RATIO	TokenNameIdentifier	 MILES  KILOMETRES  RATIO
=	TokenNameEQUAL	
1.609344	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
earthCircumference	TokenNameIdentifier	 earth Circumference
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
earthRadius	TokenNameIdentifier	 earth Radius
;	TokenNameSEMICOLON	
/** * Creates a new DistanceUnit that represents the given unit * * @param unit Distance unit in String form * @param earthRadius Radius of the Earth in the specific distance unit * @param earthCircumfence Circumference of the Earth in the specific distance unit */	TokenNameCOMMENT_JAVADOC	 Creates a new DistanceUnit that represents the given unit * @param unit Distance unit in String form @param earthRadius Radius of the Earth in the specific distance unit @param earthCircumfence Circumference of the Earth in the specific distance unit 
DistanceUnits	TokenNameIdentifier	 Distance Units
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
double	TokenNamedouble	
earthRadius	TokenNameIdentifier	 earth Radius
,	TokenNameCOMMA	
double	TokenNamedouble	
earthCircumfence	TokenNameIdentifier	 earth Circumfence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unit	TokenNameIdentifier	 unit
=	TokenNameEQUAL	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
earthCircumference	TokenNameIdentifier	 earth Circumference
=	TokenNameEQUAL	
earthCircumfence	TokenNameIdentifier	 earth Circumfence
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
earthRadius	TokenNameIdentifier	 earth Radius
=	TokenNameEQUAL	
earthRadius	TokenNameIdentifier	 earth Radius
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the DistanceUnit which represents the given unit * * @param unit Unit whose DistanceUnit should be found * @return DistanceUnit representing the unit * @throws IllegalArgumentException if no DistanceUnit which represents the given unit is found */	TokenNameCOMMENT_JAVADOC	 Returns the DistanceUnit which represents the given unit * @param unit Unit whose DistanceUnit should be found @return DistanceUnit representing the unit @throws IllegalArgumentException if no DistanceUnit which represents the given unit is found 
public	TokenNamepublic	
static	TokenNamestatic	
DistanceUnits	TokenNameIdentifier	 Distance Units
findDistanceUnit	TokenNameIdentifier	 find Distance Unit
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
MILES	TokenNameIdentifier	 MILES
.	TokenNameDOT	
getUnit	TokenNameIdentifier	 get Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
||	TokenNameOR_OR	
unit	TokenNameIdentifier	 unit
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"mi"	TokenNameStringLiteral	mi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MILES	TokenNameIdentifier	 MILES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
.	TokenNameDOT	
getUnit	TokenNameIdentifier	 get Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Unknown distance unit "	TokenNameStringLiteral	Unknown distance unit 
+	TokenNamePLUS	
unit	TokenNameIdentifier	 unit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the given distance in given DistanceUnit, to a distance in the unit represented by {@code this} * * @param distance Distance to convert * @param from Unit to convert the distance from * @return Given distance converted to the distance in the given unit */	TokenNameCOMMENT_JAVADOC	 Converts the given distance in given DistanceUnit, to a distance in the unit represented by {@code this} * @param distance Distance to convert @param from Unit to convert the distance from @return Given distance converted to the distance in the given unit 
public	TokenNamepublic	
double	TokenNamedouble	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
double	TokenNamedouble	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
MILES	TokenNameIdentifier	 MILES
)	TokenNameRPAREN	
?	TokenNameQUESTION	
distance	TokenNameIdentifier	 distance
/	TokenNameDIVIDE	
MILES_KILOMETRES_RATIO	TokenNameIdentifier	 MILES  KILOMETRES  RATIO
:	TokenNameCOLON	
distance	TokenNameIdentifier	 distance
*	TokenNameMULTIPLY	
MILES_KILOMETRES_RATIO	TokenNameIdentifier	 MILES  KILOMETRES  RATIO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the string representation of the distance unit * * @return String representation of the distance unit */	TokenNameCOMMENT_JAVADOC	 Returns the string representation of the distance unit * @return String representation of the distance unit 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnit	TokenNameIdentifier	 get Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unit	TokenNameIdentifier	 unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <a href="http://en.wikipedia.org/wiki/Earth_radius">average earth radius</a> * * @return the average earth radius */	TokenNameCOMMENT_JAVADOC	 Returns the <a href="http://en.wikipedia.org/wiki/Earth_radius">average earth radius</a> * @return the average earth radius 
public	TokenNamepublic	
double	TokenNamedouble	
earthRadius	TokenNameIdentifier	 earth Radius
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
earthRadius	TokenNameIdentifier	 earth Radius
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <a href="http://www.lyberty.com/encyc/articles/earth.html">circumference of the Earth</a> * * @return the circumference of the Earth */	TokenNameCOMMENT_JAVADOC	 Returns the <a href="http://www.lyberty.com/encyc/articles/earth.html">circumference of the Earth</a> * @return the circumference of the Earth 
public	TokenNamepublic	
double	TokenNamedouble	
earthCircumference	TokenNameIdentifier	 earth Circumference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
earthCircumference	TokenNameIdentifier	 earth Circumference
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

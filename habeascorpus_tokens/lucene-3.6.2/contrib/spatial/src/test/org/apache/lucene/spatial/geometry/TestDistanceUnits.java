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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Tests for {@link org.apache.lucene.spatial.geometry.DistanceUnits} */	TokenNameCOMMENT_JAVADOC	 Tests for {@link org.apache.lucene.spatial.geometry.DistanceUnits} 
public	TokenNamepublic	
class	TokenNameclass	
TestDistanceUnits	TokenNameIdentifier	 Test Distance Units
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * Pass condition: When finding the DistanceUnit for "km", KILOMETRES is found. When finding the DistanceUnit for * "miles", MILES is found. */	TokenNameCOMMENT_JAVADOC	 Pass condition: When finding the DistanceUnit for "km", KILOMETRES is found. When finding the DistanceUnit for "miles", MILES is found. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFindDistanceUnit	TokenNameIdentifier	 test Find Distance Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
findDistanceUnit	TokenNameIdentifier	 find Distance Unit
(	TokenNameLPAREN	
"km"	TokenNameStringLiteral	km
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
findDistanceUnit	TokenNameIdentifier	 find Distance Unit
(	TokenNameLPAREN	
"miles"	TokenNameStringLiteral	miles
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass condition: Searching for the DistanceUnit of an unknown unit "mls" should throw an IllegalArgumentException. */	TokenNameCOMMENT_JAVADOC	 Pass condition: Searching for the DistanceUnit of an unknown unit "mls" should throw an IllegalArgumentException. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFindDistanceUnit_unknownUnit	TokenNameIdentifier	 test Find Distance Unit unknown Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
findDistanceUnit	TokenNameIdentifier	 find Distance Unit
(	TokenNameLPAREN	
"mls"	TokenNameStringLiteral	mls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"IllegalArgumentException should have been thrown"	TokenNameStringLiteral	IllegalArgumentException should have been thrown
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Expected 	TokenNameCOMMENT_LINE	Expected 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pass condition: Converting between the same units should not change the value. Converting from MILES to KILOMETRES * involves multiplying the distance by the ratio, and converting from KILOMETRES to MILES involves dividing by the ratio */	TokenNameCOMMENT_JAVADOC	 Pass condition: Converting between the same units should not change the value. Converting from MILES to KILOMETRES involves multiplying the distance by the ratio, and converting from KILOMETRES to MILES involves dividing by the ratio 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testConvert	TokenNameIdentifier	 test Convert
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
.	TokenNameDOT	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
.	TokenNameDOT	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
1.609344	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
.	TokenNameDOT	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
1.609344	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
MILES	TokenNameIdentifier	 MILES
.	TokenNameDOT	
convert	TokenNameIdentifier	 convert
(	TokenNameLPAREN	
10.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
DistanceUnits	TokenNameIdentifier	 Distance Units
.	TokenNameDOT	
KILOMETERS	TokenNameIdentifier	 KILOMETERS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0D	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

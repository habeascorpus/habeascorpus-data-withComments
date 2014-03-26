package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
Artifact	TokenNameIdentifier	 Artifact
;	TokenNameSEMICOLON	
/** * Tests version range construction. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Tests version range construction. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
VersionRangeTest	TokenNameIdentifier	 Version Range Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
=	TokenNameEQUAL	
"check number of restrictions"	TokenNameStringLiteral	check number of restrictions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
=	TokenNameEQUAL	
"check upper bound"	TokenNameStringLiteral	check upper bound
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
=	TokenNameEQUAL	
"check upper bound is inclusive"	TokenNameStringLiteral	check upper bound is inclusive
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
=	TokenNameEQUAL	
"check lower bound"	TokenNameStringLiteral	check lower bound
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
=	TokenNameEQUAL	
"check lower bound is inclusive"	TokenNameStringLiteral	check lower bound is inclusive
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
=	TokenNameEQUAL	
"check version recommended"	TokenNameStringLiteral	check version recommended
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
=	TokenNameEQUAL	
"check selected version known"	TokenNameStringLiteral	check selected version known
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
=	TokenNameEQUAL	
"check selected version"	TokenNameStringLiteral	check selected version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testRange	TokenNameIdentifier	 test Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
,	TokenNameCOMMA	
OverConstrainedVersionException	TokenNameIdentifier	 Over Constrained Version Exception
{	TokenNameLBRACE	
Artifact	TokenNameIdentifier	 Artifact
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
VersionRange	TokenNameIdentifier	 Version Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.0]"	TokenNameStringLiteral	(,1.0]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Restriction	TokenNameIdentifier	 Restriction
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0]"	TokenNameStringLiteral	[1.0]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.3]"	TokenNameStringLiteral	[1.2,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,2.0)"	TokenNameStringLiteral	[1.0,2.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.5,)"	TokenNameStringLiteral	[1.5,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.0],[1.2,)"	TokenNameStringLiteral	(,1.0],[1.2,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION_KNOWN	TokenNameIdentifier	 CHECK  SELECTED  VERSION  KNOWN
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
isSelectedVersionKnown	TokenNameIdentifier	 is Selected Version Known
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_SELECTED_VERSION	TokenNameIdentifier	 CHECK  SELECTED  VERSION
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
getSelectedVersion	TokenNameIdentifier	 get Selected Version
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,)"	TokenNameStringLiteral	[1.0,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.1-SNAPSHOT]"	TokenNameStringLiteral	[1.0,1.1-SNAPSHOT]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[5.0.9.0,5.0.10.0)"	TokenNameStringLiteral	[5.0.9.0,5.0.10.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"5.0.9.0"	TokenNameStringLiteral	5.0.9.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidRanges	TokenNameIdentifier	 test Invalid Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"(1.0)"	TokenNameStringLiteral	(1.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"[1.0)"	TokenNameStringLiteral	[1.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"(1.0]"	TokenNameStringLiteral	(1.0]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"(1.0,1.0]"	TokenNameStringLiteral	(1.0,1.0]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"[1.0,1.0)"	TokenNameStringLiteral	[1.0,1.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"(1.0,1.0)"	TokenNameStringLiteral	(1.0,1.0)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"[1.1,1.0]"	TokenNameStringLiteral	[1.1,1.0]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"[1.0,1.2),1.3"	TokenNameStringLiteral	[1.0,1.2),1.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// overlap 	TokenNameCOMMENT_LINE	overlap 
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"[1.0,1.2),(1.1,1.3]"	TokenNameStringLiteral	[1.0,1.2),(1.1,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// overlap 	TokenNameCOMMENT_LINE	overlap 
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"[1.1,1.3),(1.0,1.2]"	TokenNameStringLiteral	[1.1,1.3),(1.0,1.2]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ordering 	TokenNameCOMMENT_LINE	ordering 
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
"(1.1,1.2],[1.0,1.1)"	TokenNameStringLiteral	(1.1,1.2],[1.0,1.1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIntersections	TokenNameIdentifier	 test Intersections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionRange	TokenNameIdentifier	 Version Range
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VersionRange	TokenNameIdentifier	 Version Range
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: current policy is to retain the original version - is this correct, do we need strategies or is that handled elsewhere? 	TokenNameCOMMENT_LINE	TODO: current policy is to retain the original version - is this correct, do we need strategies or is that handled elsewhere? 
// assertEquals( CHECK_VERSION_RECOMMENDATION, "1.1", mergedRange.getRecommendedVersion().toString() ); 	TokenNameCOMMENT_LINE	assertEquals( CHECK_VERSION_RECOMMENDATION, "1.1", mergedRange.getRecommendedVersion().toString() ); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Restriction	TokenNameIdentifier	 Restriction
>	TokenNameGREATER	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Restriction	TokenNameIdentifier	 Restriction
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range2	TokenNameIdentifier	 range2
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range1	TokenNameIdentifier	 range1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: test reversed restrictions on all below 	TokenNameCOMMENT_LINE	TODO: test reversed restrictions on all below 
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,)"	TokenNameStringLiteral	[1.0,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,)"	TokenNameStringLiteral	[1.1,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1]"	TokenNameStringLiteral	[1.1]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.1,)"	TokenNameStringLiteral	(1.1,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,)"	TokenNameStringLiteral	[1.2,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.2]"	TokenNameStringLiteral	(,1.2]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.1]"	TokenNameStringLiteral	(,1.1]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.1)"	TokenNameStringLiteral	(,1.1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.0]"	TokenNameStringLiteral	(,1.0]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.0], [1.1,)"	TokenNameStringLiteral	(,1.0], [1.1,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.0], [1.1,)"	TokenNameStringLiteral	(,1.0], [1.1,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.0.5"	TokenNameStringLiteral	1.0.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.1), (1.1,)"	TokenNameStringLiteral	(,1.1), (1.1,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.3]"	TokenNameStringLiteral	[1.1,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.1,)"	TokenNameStringLiteral	(1.1,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.3)"	TokenNameStringLiteral	(,1.3)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.3]"	TokenNameStringLiteral	[1.2,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.3]"	TokenNameStringLiteral	[1.1,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,)"	TokenNameStringLiteral	[1.2,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.3]"	TokenNameStringLiteral	(,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.4]"	TokenNameStringLiteral	[1.2,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.2,1.3]"	TokenNameStringLiteral	(1.2,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.2,1.3)"	TokenNameStringLiteral	(1.2,1.3)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.3)"	TokenNameStringLiteral	[1.2,1.3)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.1]"	TokenNameStringLiteral	[1.0,1.1]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.1)"	TokenNameStringLiteral	[1.0,1.1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1]"	TokenNameStringLiteral	[1.1]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.4]"	TokenNameStringLiteral	[1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2),(1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2),(1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.1,1.4)"	TokenNameStringLiteral	(1.1,1.4)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2),(1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2),(1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.1,1.4)"	TokenNameStringLiteral	(1.1,1.4)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.1),(1.4,)"	TokenNameStringLiteral	(,1.1),(1.4,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4]"	TokenNameStringLiteral	[1.1,1.4]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(,1.1],[1.4,)"	TokenNameStringLiteral	(,1.1],[1.4,)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"(1.1,1.4)"	TokenNameStringLiteral	(1.1,1.4)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[,1.1],[1.4,]"	TokenNameStringLiteral	[,1.1],[1.4,]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.3]"	TokenNameStringLiteral	[1.2,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4],[1.6,]"	TokenNameStringLiteral	[1.1,1.4],[1.6,]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.5]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.5]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4],[1.5,]"	TokenNameStringLiteral	[1.1,1.4],[1.5,]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2],[1.3,1.7]"	TokenNameStringLiteral	[1.0,1.2],[1.3,1.7]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.1,1.4],[1.5,1.6]"	TokenNameStringLiteral	[1.1,1.4],[1.5,1.6]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.3"	TokenNameStringLiteral	1.3
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.4"	TokenNameStringLiteral	1.4
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restriction	TokenNameIdentifier	 restriction
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Restriction	TokenNameIdentifier	 Restriction
)	TokenNameRPAREN	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_LOWER_BOUND	TokenNameIdentifier	 CHECK  LOWER  BOUND
,	TokenNameCOMMA	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_LOWER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  LOWER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isLowerBoundInclusive	TokenNameIdentifier	 is Lower Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_UPPER_BOUND	TokenNameIdentifier	 CHECK  UPPER  BOUND
,	TokenNameCOMMA	
"1.6"	TokenNameStringLiteral	1.6
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
CHECK_UPPER_BOUND_INCLUSIVE	TokenNameIdentifier	 CHECK  UPPER  BOUND  INCLUSIVE
,	TokenNameCOMMA	
restriction	TokenNameIdentifier	 restriction
.	TokenNameDOT	
isUpperBoundInclusive	TokenNameIdentifier	 is Upper Bound Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test restricting empty sets 	TokenNameCOMMENT_LINE	test restricting empty sets 
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[,1.1],[1.4,]"	TokenNameStringLiteral	[,1.1],[1.4,]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.3]"	TokenNameStringLiteral	[1.2,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range1	TokenNameIdentifier	 range1
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[,1.1],[1.4,]"	TokenNameStringLiteral	[,1.1],[1.4,]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.2,1.3]"	TokenNameStringLiteral	[1.2,1.3]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range2	TokenNameIdentifier	 range2
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedRange	TokenNameIdentifier	 merged Range
=	TokenNameEQUAL	
range1	TokenNameIdentifier	 range1
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
CHECK_VERSION_RECOMMENDATION	TokenNameIdentifier	 CHECK  VERSION  RECOMMENDATION
,	TokenNameCOMMA	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRecommendedVersion	TokenNameIdentifier	 get Recommended Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restrictions	TokenNameIdentifier	 restrictions
=	TokenNameEQUAL	
mergedRange	TokenNameIdentifier	 merged Range
.	TokenNameDOT	
getRestrictions	TokenNameIdentifier	 get Restrictions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
CHECK_NUM_RESTRICTIONS	TokenNameIdentifier	 CHECK  NUM  RESTRICTIONS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
restrictions	TokenNameIdentifier	 restrictions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReleaseRangeBoundsContainsSnapshots	TokenNameIdentifier	 test Release Range Bounds Contains Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2]"	TokenNameStringLiteral	[1.0,1.2]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.2-SNAPSHOT"	TokenNameStringLiteral	1.2-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSnapshotRangeBoundsCanContainSnapshots	TokenNameIdentifier	 test Snapshot Range Bounds Can Contain Snapshots
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0,1.2-SNAPSHOT]"	TokenNameStringLiteral	[1.0,1.2-SNAPSHOT]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.2-SNAPSHOT"	TokenNameStringLiteral	1.2-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"[1.0-SNAPSHOT,1.2]"	TokenNameStringLiteral	[1.0-SNAPSHOT,1.2]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.1-SNAPSHOT"	TokenNameStringLiteral	1.1-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSnapshotSoftVersionCanContainSnapshot	TokenNameIdentifier	 test Snapshot Soft Version Can Contain Snapshot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkInvalidRange	TokenNameIdentifier	 check Invalid Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Version "	TokenNameStringLiteral	Version 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" should have failed to construct"	TokenNameStringLiteral	 should have failed to construct
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContains	TokenNameIdentifier	 test Contains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
actualVersion	TokenNameIdentifier	 actual Version
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultArtifactVersion	TokenNameIdentifier	 Default Artifact Version
(	TokenNameLPAREN	
"2.0.5"	TokenNameStringLiteral	2.0.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"2.0.5"	TokenNameStringLiteral	2.0.5
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"2.0.4"	TokenNameStringLiteral	2.0.4
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0.5]"	TokenNameStringLiteral	[2.0.5]
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0.6,)"	TokenNameStringLiteral	[2.0.6,)
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0.6]"	TokenNameStringLiteral	[2.0.6]
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0,2.1]"	TokenNameStringLiteral	[2.0,2.1]
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0,2.0.3]"	TokenNameStringLiteral	[2.0,2.0.3]
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0,2.0.5]"	TokenNameStringLiteral	[2.0,2.0.5]
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
"[2.0,2.0.5)"	TokenNameStringLiteral	[2.0,2.0.5)
,	TokenNameCOMMA	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
enforceVersion	TokenNameIdentifier	 enforce Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requiredVersionRange	TokenNameIdentifier	 required Version Range
,	TokenNameCOMMA	
ArtifactVersion	TokenNameIdentifier	 Artifact Version
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidVersionSpecificationException	TokenNameIdentifier	 Invalid Version Specification Exception
{	TokenNameLBRACE	
VersionRange	TokenNameIdentifier	 Version Range
vr	TokenNameIdentifier	 vr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
vr	TokenNameIdentifier	 vr
=	TokenNameEQUAL	
VersionRange	TokenNameIdentifier	 Version Range
.	TokenNameDOT	
createFromVersionSpec	TokenNameIdentifier	 create From Version Spec
(	TokenNameLPAREN	
requiredVersionRange	TokenNameIdentifier	 required Version Range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
vr	TokenNameIdentifier	 vr
.	TokenNameDOT	
containsVersion	TokenNameIdentifier	 contains Version
(	TokenNameLPAREN	
actualVersion	TokenNameIdentifier	 actual Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOrder0	TokenNameIdentifier	 test Order0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assertTrue( new DefaultArtifactVersion( "1.0-alpha10" ).compareTo( new DefaultArtifactVersion( "1.0-alpha1" ) ) > 0 ); 	TokenNameCOMMENT_LINE	assertTrue( new DefaultArtifactVersion( "1.0-alpha10" ).compareTo( new DefaultArtifactVersion( "1.0-alpha1" ) ) > 0 ); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	

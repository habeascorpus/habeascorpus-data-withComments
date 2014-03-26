/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * class to look at how we expand properties */	TokenNameCOMMENT_JAVADOC	 class to look at how we expand properties 
public	TokenNamepublic	
class	TokenNameclass	
PropertyExpansionTest	TokenNameIdentifier	 Property Expansion Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
PropertyExpansionTest	TokenNameIdentifier	 Property Expansion Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * we bind to an existing test file because we are too lazy to write our * own, and we don't really care what it is */	TokenNameCOMMENT_JAVADOC	 we bind to an existing test file because we are too lazy to write our own, and we don't really care what it is 
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/immutable.xml"	TokenNameStringLiteral	src/etc/testcases/core/immutable.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * run through the test cases of expansion */	TokenNameCOMMENT_JAVADOC	 run through the test cases of expansion 
public	TokenNamepublic	
void	TokenNamevoid	
testPropertyExpansion	TokenNameIdentifier	 test Property Expansion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
,	TokenNameCOMMA	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$-"	TokenNameStringLiteral	$$-
,	TokenNameCOMMA	
"$-"	TokenNameStringLiteral	$-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$"	TokenNameStringLiteral	$$
,	TokenNameCOMMA	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"expanded"	TokenNameStringLiteral	expanded
,	TokenNameCOMMA	
"EXPANDED"	TokenNameStringLiteral	EXPANDED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"a${expanded}b"	TokenNameStringLiteral	a${expanded}b
,	TokenNameCOMMA	
"aEXPANDEDb"	TokenNameStringLiteral	aEXPANDEDb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"${expanded}${expanded}"	TokenNameStringLiteral	${expanded}${expanded}
,	TokenNameCOMMA	
"EXPANDEDEXPANDED"	TokenNameStringLiteral	EXPANDEDEXPANDED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$$"	TokenNameStringLiteral	$$$
,	TokenNameCOMMA	
"$$"	TokenNameStringLiteral	$$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$$$-"	TokenNameStringLiteral	$$$$-
,	TokenNameCOMMA	
"$$-"	TokenNameStringLiteral	$$-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"Class$$subclass"	TokenNameStringLiteral	Class$$subclass
,	TokenNameCOMMA	
"Class$subclass"	TokenNameStringLiteral	Class$subclass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * new things we want */	TokenNameCOMMENT_JAVADOC	 new things we want 
public	TokenNamepublic	
void	TokenNamevoid	
testDollarPassthru	TokenNameIdentifier	 test Dollar Passthru
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$-"	TokenNameStringLiteral	$-
,	TokenNameCOMMA	
"$-"	TokenNameStringLiteral	$-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"Class$subclass"	TokenNameStringLiteral	Class$subclass
,	TokenNameCOMMA	
"Class$subclass"	TokenNameStringLiteral	Class$subclass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$$-"	TokenNameStringLiteral	$$$-
,	TokenNameCOMMA	
"$$-"	TokenNameStringLiteral	$$-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$$$$"	TokenNameStringLiteral	$$$$$
,	TokenNameCOMMA	
"$$$"	TokenNameStringLiteral	$$$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"${unassigned.property}"	TokenNameStringLiteral	${unassigned.property}
,	TokenNameCOMMA	
"${unassigned.property}"	TokenNameStringLiteral	${unassigned.property}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"a$b"	TokenNameStringLiteral	a$b
,	TokenNameCOMMA	
"a$b"	TokenNameStringLiteral	a$b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$}}"	TokenNameStringLiteral	$}}
,	TokenNameCOMMA	
"$}}"	TokenNameStringLiteral	$}}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * old things we dont want; not a test no more */	TokenNameCOMMENT_JAVADOC	 old things we dont want; not a test no more 
public	TokenNamepublic	
void	TokenNamevoid	
oldtestQuirkyLegacyBehavior	TokenNameIdentifier	 oldtest Quirky Legacy Behavior
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"Class$subclass"	TokenNameStringLiteral	Class$subclass
,	TokenNameCOMMA	
"Classsubclass"	TokenNameStringLiteral	Classsubclass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$$$-"	TokenNameStringLiteral	$$$-
,	TokenNameCOMMA	
"$-"	TokenNameStringLiteral	$-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"a$b"	TokenNameStringLiteral	a$b
,	TokenNameCOMMA	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
"$}}"	TokenNameStringLiteral	$}}
,	TokenNameCOMMA	
"}}"	TokenNameStringLiteral	}}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * little helper method to validate stuff */	TokenNameCOMMENT_JAVADOC	 little helper method to validate stuff 
private	TokenNameprivate	
void	TokenNamevoid	
assertExpandsTo	TokenNameIdentifier	 assert Expands To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//end class 	TokenNameCOMMENT_LINE	end class 
}	TokenNameRBRACE	

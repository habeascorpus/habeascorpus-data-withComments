/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
;	TokenNameSEMICOLON	
/** * An Ant version condition. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 An Ant version condition. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
AntVersion	TokenNameIdentifier	 Ant Version
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
atLeast	TokenNameIdentifier	 at Least
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
exactly	TokenNameIdentifier	 exactly
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
propertyname	TokenNameIdentifier	 propertyname
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Run as a task. * @throws BuildException if an error occurs. */	TokenNameCOMMENT_JAVADOC	 Run as a task. @throws BuildException if an error occurs. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyname	TokenNameIdentifier	 propertyname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"'property' must be set."	TokenNameStringLiteral	'property' must be set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
exactly	TokenNameIdentifier	 exactly
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If condition values are set, evaluate the condition 	TokenNameCOMMENT_LINE	If condition values are set, evaluate the condition 
if	TokenNameif	
(	TokenNameLPAREN	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
propertyname	TokenNameIdentifier	 propertyname
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Raw task 	TokenNameCOMMENT_LINE	Raw task 
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
propertyname	TokenNameIdentifier	 propertyname
,	TokenNameCOMMA	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Evalute the condition. * @return true if the condition is true. * @throws BuildException if an error occurs. */	TokenNameCOMMENT_JAVADOC	 Evalute the condition. @return true if the condition is true. @throws BuildException if an error occurs. 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
atLeast	TokenNameIdentifier	 at Least
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
isGreaterThanOrEqual	TokenNameIdentifier	 is Greater Than Or Equal
(	TokenNameLPAREN	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
exactly	TokenNameIdentifier	 exactly
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
exactly	TokenNameIdentifier	 exactly
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//default 	TokenNameCOMMENT_LINE	default 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
exactly	TokenNameIdentifier	 exactly
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one of atleast or exactly may be set."	TokenNameStringLiteral	Only one of atleast or exactly may be set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
atLeast	TokenNameIdentifier	 at Least
&&	TokenNameAND_AND	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
exactly	TokenNameIdentifier	 exactly
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"One of atleast or exactly must be set."	TokenNameStringLiteral	One of atleast or exactly must be set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
atLeast	TokenNameIdentifier	 at Least
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The 'atleast' attribute is not a Dewey Decimal eg 1.1.0 : "	TokenNameStringLiteral	The 'atleast' attribute is not a Dewey Decimal eg 1.1.0 : 
+	TokenNamePLUS	
atLeast	TokenNameIdentifier	 at Least
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
exactly	TokenNameIdentifier	 exactly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The 'exactly' attribute is not a Dewey Decimal eg 1.1.0 : "	TokenNameStringLiteral	The 'exactly' attribute is not a Dewey Decimal eg 1.1.0 : 
+	TokenNamePLUS	
exactly	TokenNameIdentifier	 exactly
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
versionString	TokenNameIdentifier	 version String
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ant.version"	TokenNameStringLiteral	ant.version
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundFirstDigit	TokenNameIdentifier	 found First Digit
=	TokenNameEQUAL	
false	TokenNamefalse	
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
versionString	TokenNameIdentifier	 version String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foundFirstDigit	TokenNameIdentifier	 found First Digit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
foundFirstDigit	TokenNameIdentifier	 found First Digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
versionString	TokenNameIdentifier	 version String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
foundFirstDigit	TokenNameIdentifier	 found First Digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the atleast attribute. * @return the atleast attribute. */	TokenNameCOMMENT_JAVADOC	 Get the atleast attribute. @return the atleast attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAtLeast	TokenNameIdentifier	 get At Least
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
atLeast	TokenNameIdentifier	 at Least
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the atleast attribute. * This is of the form major.minor.point. * For example 1.7.0. * @param atLeast the version to check against. */	TokenNameCOMMENT_JAVADOC	 Set the atleast attribute. This is of the form major.minor.point. For example 1.7.0. @param atLeast the version to check against. 
public	TokenNamepublic	
void	TokenNamevoid	
setAtLeast	TokenNameIdentifier	 set At Least
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
atLeast	TokenNameIdentifier	 at Least
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
atLeast	TokenNameIdentifier	 at Least
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the exactly attribute. * @return the exactly attribute. */	TokenNameCOMMENT_JAVADOC	 Get the exactly attribute. @return the exactly attribute. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExactly	TokenNameIdentifier	 get Exactly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exactly	TokenNameIdentifier	 exactly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the exactly attribute. * This is of the form major.minor.point. * For example 1.7.0. * @param exactly the version to check against. */	TokenNameCOMMENT_JAVADOC	 Set the exactly attribute. This is of the form major.minor.point. For example 1.7.0. @param exactly the version to check against. 
public	TokenNamepublic	
void	TokenNamevoid	
setExactly	TokenNameIdentifier	 set Exactly
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
exactly	TokenNameIdentifier	 exactly
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
exactly	TokenNameIdentifier	 exactly
=	TokenNameEQUAL	
exactly	TokenNameIdentifier	 exactly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the property to hold the ant version. * @return the name of the property. */	TokenNameCOMMENT_JAVADOC	 Get the name of the property to hold the ant version. @return the name of the property. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
propertyname	TokenNameIdentifier	 propertyname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the property to hold the ant version. * @param propertyname the name of the property. */	TokenNameCOMMENT_JAVADOC	 Set the name of the property to hold the ant version. @param propertyname the name of the property. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyname	TokenNameIdentifier	 propertyname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
propertyname	TokenNameIdentifier	 propertyname
=	TokenNameEQUAL	
propertyname	TokenNameIdentifier	 propertyname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

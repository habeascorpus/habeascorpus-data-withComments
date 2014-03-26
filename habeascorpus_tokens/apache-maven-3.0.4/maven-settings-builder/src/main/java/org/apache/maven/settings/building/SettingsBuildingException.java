package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
building	TokenNameIdentifier	 building
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Signals one ore more errors during settings building. The settings builder tries to collect as many problems as * possible before eventually failing to provide callers with rich error information. Use {@link #getProblems()} to * query the details of the failure. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Signals one ore more errors during settings building. The settings builder tries to collect as many problems as possible before eventually failing to provide callers with rich error information. Use {@link #getProblems()} to query the details of the failure. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
SettingsBuildingException	TokenNameIdentifier	 Settings Building Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
/** * Creates a new exception with the specified problems. * * @param problems The problems that causes this exception, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new exception with the specified problems. * @param problems The problems that causes this exception, may be {@code null}. 
public	TokenNamepublic	
SettingsBuildingException	TokenNameIdentifier	 Settings Building Exception
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
toMessage	TokenNameIdentifier	 to Message
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the problems that caused this exception. * * @return The problems that caused this exception, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the problems that caused this exception. * @return The problems that caused this exception, never {@code null}. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toMessage	TokenNameIdentifier	 to Message
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
" problem was "	TokenNameStringLiteral	 problem was 
:	TokenNameCOLON	
" problems were "	TokenNameStringLiteral	 problems were 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"encountered while building the effective settings"	TokenNameStringLiteral	encountered while building the effective settings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SettingsProblem	TokenNameIdentifier	 Settings Problem
problem	TokenNameIdentifier	 problem
:	TokenNameCOLON	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
getSeverity	TokenNameIdentifier	 get Severity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" @ "	TokenNameStringLiteral	 @ 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

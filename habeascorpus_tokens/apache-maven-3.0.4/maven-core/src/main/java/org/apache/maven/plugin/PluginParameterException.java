package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PluginParameterException	TokenNameIdentifier	 Plugin Parameter Exception
extends	TokenNameextends	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PluginParameterException	TokenNameIdentifier	 Plugin Parameter Exception
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"The parameters "	TokenNameStringLiteral	The parameters 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
+	TokenNamePLUS	
" for goal "	TokenNameStringLiteral	 for goal 
+	TokenNamePLUS	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
getRoleHint	TokenNameIdentifier	 get Role Hint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" are missing or invalid"	TokenNameStringLiteral	 are missing or invalid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mojo	TokenNameIdentifier	 mojo
=	TokenNameEQUAL	
mojo	TokenNameIdentifier	 mojo
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
parameter	TokenNameIdentifier	 parameter
:	TokenNameCOLON	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mojo	TokenNameIdentifier	 mojo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
decomposeParameterIntoUserInstructions	TokenNameIdentifier	 decompose Parameter Into User Instructions
(	TokenNameLPAREN	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
,	TokenNameCOMMA	
Parameter	TokenNameIdentifier	 Parameter
param	TokenNameIdentifier	 param
,	TokenNameCOMMA	
StringBuilder	TokenNameIdentifier	 String Builder
messageBuffer	TokenNameIdentifier	 message Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
isEditable	TokenNameIdentifier	 is Editable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Inside the definition for plugin '"	TokenNameStringLiteral	Inside the definition for plugin '
+	TokenNamePLUS	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' specify the following: <configuration> ... <"	TokenNameStringLiteral	' specify the following: <configuration> ... <
+	TokenNamePLUS	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
">VALUE</"	TokenNameStringLiteral	>VALUE</
+	TokenNamePLUS	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"> </configuration>"	TokenNameStringLiteral	> </configuration>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getAlias	TokenNameIdentifier	 get Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isNotEmpty	TokenNameIdentifier	 is Not Empty
(	TokenNameLPAREN	
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
alias	TokenNameIdentifier	 alias
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" -OR- <configuration> ... <"	TokenNameStringLiteral	 -OR- <configuration> ... <
+	TokenNamePLUS	
alias	TokenNameIdentifier	 alias
+	TokenNamePLUS	
">VALUE</"	TokenNameStringLiteral	>VALUE</
+	TokenNamePLUS	
alias	TokenNameIdentifier	 alias
+	TokenNamePLUS	
"> </configuration> "	TokenNameStringLiteral	> </configuration> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
isEditable	TokenNameIdentifier	 is Editable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" -OR- "	TokenNameStringLiteral	 -OR- 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//addParameterUsageInfo( expression, messageBuffer ); 	TokenNameCOMMENT_LINE	addParameterUsageInfo( expression, messageBuffer ); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
buildDiagnosticMessage	TokenNameIdentifier	 build Diagnostic Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
messageBuffer	TokenNameIdentifier	 message Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
=	TokenNameEQUAL	
getMojoDescriptor	TokenNameIdentifier	 get Mojo Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"One or more required plugin parameters are invalid/missing for '"	TokenNameStringLiteral	One or more required plugin parameters are invalid/missing for '
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGoalPrefix	TokenNameIdentifier	 get Goal Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"' "	TokenNameStringLiteral	' 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parameter	TokenNameIdentifier	 Parameter
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decomposeParameterIntoUserInstructions	TokenNameIdentifier	 decompose Parameter Into User Instructions
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
,	TokenNameCOMMA	
messageBuffer	TokenNameIdentifier	 message Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
messageBuffer	TokenNameIdentifier	 message Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

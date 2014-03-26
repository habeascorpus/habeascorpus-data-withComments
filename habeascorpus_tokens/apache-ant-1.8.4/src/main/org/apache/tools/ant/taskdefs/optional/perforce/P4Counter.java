/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Portions of this software are based upon public domain software * originally written at the National Center for Supercomputing Applications, * University of Illinois, Urbana-Champaign. */	TokenNameCOMMENT_BLOCK	 Portions of this software are based upon public domain software originally written at the National Center for Supercomputing Applications, University of Illinois, Urbana-Champaign. 
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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
perforce	TokenNameIdentifier	 perforce
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
/** * Obtains or sets the value of a counter. * * <p> When used in its base form * (where only the counter name is provided), the counter value will be * printed to the output stream. When the value is provided, the counter * will be set to the value provided. When a property name is provided, * the property will be filled with the value of the counter. You may * not specify to both get and set the value of the counter in the same * Task. * </p> * <P> * The user performing this task must have Perforce &quot;review&quot; permissions * as defined by Perforce protections in order for this task to succeed. </P> * Example Usage:<br> * &lt;p4counter name="${p4.counter}" property=${p4.change}"/&gt; * * @ant.task category="scm" */	TokenNameCOMMENT_JAVADOC	 Obtains or sets the value of a counter. * <p> When used in its base form (where only the counter name is provided), the counter value will be printed to the output stream. When the value is provided, the counter will be set to the value provided. When a property name is provided, the property will be filled with the value of the counter. You may not specify to both get and set the value of the counter in the same Task. </p> <P> The user performing this task must have Perforce &quot;review&quot; permissions as defined by Perforce protections in order for this task to succeed. </P> Example Usage:<br> &lt;p4counter name="${p4.counter}" property=${p4.change}"/&gt; * @ant.task category="scm" 
public	TokenNamepublic	
class	TokenNameclass	
P4Counter	TokenNameIdentifier	 P4 Counter
extends	TokenNameextends	
P4Base	TokenNameIdentifier	 P4 Base
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * name of the counter */	TokenNameCOMMENT_JAVADOC	 name of the counter 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * name of an optional property */	TokenNameCOMMENT_JAVADOC	 name of an optional property 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * flag telling whether the value of the counter should be set */	TokenNameCOMMENT_JAVADOC	 flag telling whether the value of the counter should be set 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldSetValue	TokenNameIdentifier	 should Set Value
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * flag telling whether a property should be set */	TokenNameCOMMENT_JAVADOC	 flag telling whether a property should be set 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldSetProperty	TokenNameIdentifier	 should Set Property
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * new value for the counter */	TokenNameCOMMENT_JAVADOC	 new value for the counter 
public	TokenNamepublic	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * The name of the counter; required * @param counter name of the counter */	TokenNameCOMMENT_JAVADOC	 The name of the counter; required @param counter name of the counter 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
counter	TokenNameIdentifier	 counter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The new value for the counter; optional. * @param value new value for the counter */	TokenNameCOMMENT_JAVADOC	 The new value for the counter; optional. @param value new value for the counter 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
shouldSetValue	TokenNameIdentifier	 should Set Value
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A property to be set with the value of the counter * @param property the name of a property to set with the value * of the counter */	TokenNameCOMMENT_JAVADOC	 A property to be set with the value of the counter @param property the name of a property to set with the value of the counter 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
shouldSetProperty	TokenNameIdentifier	 should Set Property
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * again, properties are mutable in this tsk * @throws BuildException if the required parameters are not supplied. */	TokenNameCOMMENT_JAVADOC	 again, properties are mutable in this tsk @throws BuildException if the required parameters are not supplied. 
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
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No counter specified to retrieve"	TokenNameStringLiteral	No counter specified to retrieve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldSetValue	TokenNameIdentifier	 should Set Value
&&	TokenNameAND_AND	
shouldSetProperty	TokenNameIdentifier	 should Set Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot both set the value of the property and retrieve the "	TokenNameStringLiteral	Cannot both set the value of the property and retrieve the 
+	TokenNamePLUS	
"value of the property."	TokenNameStringLiteral	value of the property.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
"counter "	TokenNameStringLiteral	counter 
+	TokenNamePLUS	
P4CmdOpts	TokenNameIdentifier	 P4 Cmd Opts
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
shouldSetProperty	TokenNameIdentifier	 should Set Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE kirk@radik.com 04-April-2001 -- If you put in the -s, you 	TokenNameCOMMENT_LINE	NOTE kirk@radik.com 04-April-2001 -- If you put in the -s, you 
// have to start running through regular expressions here. Much easier 	TokenNameCOMMENT_LINE	have to start running through regular expressions here. Much easier 
// to just not include the scripting information than to try to add it 	TokenNameCOMMENT_LINE	to just not include the scripting information than to try to add it 
// and strip it later. 	TokenNameCOMMENT_LINE	and strip it later. 
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
"-s "	TokenNameStringLiteral	-s 
+	TokenNamePLUS	
command	TokenNameIdentifier	 command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldSetValue	TokenNameIdentifier	 should Set Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldSetProperty	TokenNameIdentifier	 should Set Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
myProj	TokenNameIdentifier	 my Proj
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
P4Handler	TokenNameIdentifier	 P4 Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"P4Counter retrieved line ""	TokenNameStringLiteral	P4Counter retrieved line "
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
myProj	TokenNameIdentifier	 my Proj
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Perforce error. "	TokenNameStringLiteral	Perforce error. 
+	TokenNamePLUS	
"Could not retrieve counter value."	TokenNameStringLiteral	Could not retrieve counter value.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
execP4Command	TokenNameIdentifier	 exec P4 Command
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
/** * Simple comparison condition. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 Simple comparison condition. * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
Equals	TokenNameIdentifier	 Equals
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REQUIRED	TokenNameIdentifier	 REQUIRED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
|	TokenNameOR	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
,	TokenNameCOMMA	
arg2	TokenNameIdentifier	 arg2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
forcestring	TokenNameIdentifier	 forcestring
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the first argument * @param arg1 the first argument. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Set the first argument @param arg1 the first argument. @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setArg1	TokenNameIdentifier	 set Arg1
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setArg1	TokenNameIdentifier	 set Arg1
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setArg1Internal	TokenNameIdentifier	 set Arg1 Internal
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the first string * * @param a1 the first string */	TokenNameCOMMENT_JAVADOC	 Set the first string * @param a1 the first string 
public	TokenNamepublic	
void	TokenNamevoid	
setArg1	TokenNameIdentifier	 set Arg1
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setArg1Internal	TokenNameIdentifier	 set Arg1 Internal
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setArg1Internal	TokenNameIdentifier	 set Arg1 Internal
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
arg1	TokenNameIdentifier	 arg1
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the second argument * @param arg2 the second argument. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Set the second argument @param arg2 the second argument. @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setArg2	TokenNameIdentifier	 set Arg2
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setArg2	TokenNameIdentifier	 set Arg2
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setArg2Internal	TokenNameIdentifier	 set Arg2 Internal
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the second string * * @param a2 the second string */	TokenNameCOMMENT_JAVADOC	 Set the second string * @param a2 the second string 
public	TokenNamepublic	
void	TokenNamevoid	
setArg2	TokenNameIdentifier	 set Arg2
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setArg2Internal	TokenNameIdentifier	 set Arg2 Internal
(	TokenNameLPAREN	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setArg2Internal	TokenNameIdentifier	 set Arg2 Internal
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
arg2	TokenNameIdentifier	 arg2
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
|=	TokenNameOR_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Should we want to trim the arguments before comparing them? * @param b if true trim the arguments * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Should we want to trim the arguments before comparing them? @param b if true trim the arguments @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
setTrim	TokenNameIdentifier	 set Trim
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Should the comparison be case sensitive? * @param b if true use a case sensitive comparison (this is the * default) * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Should the comparison be case sensitive? @param b if true use a case sensitive comparison (this is the default) @since Ant 1.5 
public	TokenNamepublic	
void	TokenNamevoid	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to force string comparisons for non-equal, non-string objects. * This allows object properties (legal in Ant 1.8.x+) to be compared as strings. * @param forcestring value to set * @since Ant 1.8.1 */	TokenNameCOMMENT_JAVADOC	 Set whether to force string comparisons for non-equal, non-string objects. This allows object properties (legal in Ant 1.8.x+) to be compared as strings. @param forcestring value to set @since Ant 1.8.1 
public	TokenNamepublic	
void	TokenNamevoid	
setForcestring	TokenNameIdentifier	 set Forcestring
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forcestring	TokenNameIdentifier	 forcestring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
forcestring	TokenNameIdentifier	 forcestring
=	TokenNameEQUAL	
forcestring	TokenNameIdentifier	 forcestring
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the two strings are equal * @exception BuildException if the attributes are not set correctly */	TokenNameCOMMENT_JAVADOC	 @return true if the two strings are equal @exception BuildException if the attributes are not set correctly 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
&	TokenNameAND	
REQUIRED	TokenNameIdentifier	 REQUIRED
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
REQUIRED	TokenNameIdentifier	 REQUIRED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"both arg1 and arg2 are required in equals"	TokenNameStringLiteral	both arg1 and arg2 are required in equals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
==	TokenNameEQUAL_EQUAL	
arg2	TokenNameIdentifier	 arg2
||	TokenNameOR_OR	
arg1	TokenNameIdentifier	 arg1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
forcestring	TokenNameIdentifier	 forcestring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
arg1	TokenNameIdentifier	 arg1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
arg1	TokenNameIdentifier	 arg1
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
?	TokenNameQUESTION	
arg1	TokenNameIdentifier	 arg1
:	TokenNameCOLON	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
arg2	TokenNameIdentifier	 arg2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
arg2	TokenNameIdentifier	 arg2
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
?	TokenNameQUESTION	
arg2	TokenNameIdentifier	 arg2
:	TokenNameCOLON	
arg2	TokenNameIdentifier	 arg2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
&&	TokenNameAND_AND	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg2	TokenNameIdentifier	 arg2
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
&&	TokenNameAND_AND	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg2	TokenNameIdentifier	 arg2
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg1	TokenNameIdentifier	 arg1
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
&&	TokenNameAND_AND	
arg2	TokenNameIdentifier	 arg2
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg1	TokenNameIdentifier	 arg1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
arg2	TokenNameIdentifier	 arg2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
caseSensitive	TokenNameIdentifier	 case Sensitive
?	TokenNameQUESTION	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
:	TokenNameCOLON	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

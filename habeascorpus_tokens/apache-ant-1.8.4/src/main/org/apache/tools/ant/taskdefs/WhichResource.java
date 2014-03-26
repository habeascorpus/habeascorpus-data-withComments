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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Reference	TokenNameIdentifier	 Reference
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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
/** * Find a class or resource on the supplied classpath, or the * system classpath if none is supplied. The named property is set if * the item can be found. For example * <pre> * &lt;whichresource resource="/log4j.properties" * property="log4j.url" &gt; * </pre> * @since Ant 1.6 * @ant.attribute.group name="oneof" description="Exactly one of these two" */	TokenNameCOMMENT_JAVADOC	 Find a class or resource on the supplied classpath, or the system classpath if none is supplied. The named property is set if the item can be found. For example <pre> &lt;whichresource resource="/log4j.properties" property="log4j.url" &gt; </pre> @since Ant 1.6 @ant.attribute.group name="oneof" description="Exactly one of these two" 
public	TokenNamepublic	
class	TokenNameclass	
WhichResource	TokenNameIdentifier	 Which Resource
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * our classpath */	TokenNameCOMMENT_JAVADOC	 our classpath 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
/** * class to look for */	TokenNameCOMMENT_JAVADOC	 class to look for 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
/** * resource to look for */	TokenNameCOMMENT_JAVADOC	 resource to look for 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
/** * property to set */	TokenNameCOMMENT_JAVADOC	 property to set 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
/** * Set the classpath to be used for this compilation. * @param cp the classpath to be used. */	TokenNameCOMMENT_JAVADOC	 Set the classpath to be used for this compilation. @param cp the classpath to be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a path to the classpath. * @return a classpath to be configured. */	TokenNameCOMMENT_JAVADOC	 Adds a path to the classpath. @return a classpath to be configured. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to use by reference. * * @param r a reference to an existing classpath. * @since Ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 Set the classpath to use by reference. * @param r a reference to an existing classpath. @since Ant 1.7.1 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathRef	TokenNameIdentifier	 set Classpath Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * validate */	TokenNameCOMMENT_JAVADOC	 validate 
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
setcount	TokenNameIdentifier	 setcount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setcount	TokenNameIdentifier	 setcount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setcount	TokenNameIdentifier	 setcount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
setcount	TokenNameIdentifier	 setcount
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"One of classname or resource must"	TokenNameStringLiteral	One of classname or resource must
+	TokenNamePLUS	
" be specified"	TokenNameStringLiteral	 be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
setcount	TokenNameIdentifier	 setcount
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one of classname or resource can"	TokenNameStringLiteral	Only one of classname or resource can
+	TokenNamePLUS	
" be specified"	TokenNameStringLiteral	 be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No property defined"	TokenNameStringLiteral	No property defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * execute it * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 execute it @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"using user supplied classpath: "	TokenNameStringLiteral	using user supplied classpath: 
+	TokenNamePLUS	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"only"	TokenNameStringLiteral	only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"using system classpath: "	TokenNameStringLiteral	using system classpath: 
+	TokenNamePLUS	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
.	TokenNameDOT	
newAntClassLoader	TokenNameIdentifier	 new Ant Class Loader
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCoreLoader	TokenNameIdentifier	 get Core Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//convert a class name into a resource 	TokenNameCOMMENT_LINE	convert a class name into a resource 
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"One of class or resource is required"	TokenNameStringLiteral	One of class or resource is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Searching for "	TokenNameStringLiteral	Searching for 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//set the property 	TokenNameCOMMENT_LINE	set the property 
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * name the resource to look for * @param resource the name of the resource to look for. * @ant.attribute group="oneof" */	TokenNameCOMMENT_JAVADOC	 name the resource to look for @param resource the name of the resource to look for. @ant.attribute group="oneof" 
public	TokenNamepublic	
void	TokenNamevoid	
setResource	TokenNameIdentifier	 set Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * name the class to look for * @param classname the name of the class to look for. * @ant.attribute group="oneof" */	TokenNameCOMMENT_JAVADOC	 name the class to look for @param classname the name of the class to look for. @ant.attribute group="oneof" 
public	TokenNamepublic	
void	TokenNamevoid	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the property to fill with the URL of the resource or class * @param property the property to be set. * @ant.attribute group="required" */	TokenNameCOMMENT_JAVADOC	 the property to fill with the URL of the resource or class @param property the property to be set. @ant.attribute group="required" 
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	

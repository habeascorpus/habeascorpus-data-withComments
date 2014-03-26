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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
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
/** * Selector that selects files by forwarding the request on to other classes. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Selector that selects files by forwarding the request on to other classes. * @since 1.5 
public	TokenNamepublic	
class	TokenNameclass	
ExtendSelector	TokenNameIdentifier	 Extend Selector
extends	TokenNameextends	
BaseSelector	TokenNameIdentifier	 Base Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileSelector	TokenNameIdentifier	 File Selector
dynselector	TokenNameIdentifier	 dynselector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
paramVec	TokenNameIdentifier	 param Vec
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
ExtendSelector	TokenNameIdentifier	 Extend Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the classname of the custom selector. * * @param classname is the class which implements this selector */	TokenNameCOMMENT_JAVADOC	 Sets the classname of the custom selector. * @param classname is the class which implements this selector 
public	TokenNamepublic	
void	TokenNamevoid	
setClassname	TokenNameIdentifier	 set Classname
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
/** * Instantiates the identified custom selector class. */	TokenNameCOMMENT_JAVADOC	 Instantiates the identified custom selector class. 
public	TokenNamepublic	
void	TokenNamevoid	
selectorCreate	TokenNameIdentifier	 selector Create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Memory-Leak in line below 	TokenNameCOMMENT_LINE	Memory-Leak in line below 
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
al	TokenNameIdentifier	 al
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
al	TokenNameIdentifier	 al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dynselector	TokenNameIdentifier	 dynselector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProjectReference	TokenNameIdentifier	 set Project Reference
(	TokenNameLPAREN	
dynselector	TokenNameIdentifier	 dynselector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfexcept	TokenNameIdentifier	 cnfexcept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Selector "	TokenNameStringLiteral	Selector 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
" not initialized, no such class"	TokenNameStringLiteral	 not initialized, no such class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
iexcept	TokenNameIdentifier	 iexcept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Selector "	TokenNameStringLiteral	Selector 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
" not initialized, could not create class"	TokenNameStringLiteral	 not initialized, could not create class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
iaexcept	TokenNameIdentifier	 iaexcept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Selector "	TokenNameStringLiteral	Selector 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
" not initialized, class not accessible"	TokenNameStringLiteral	 not initialized, class not accessible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"There is no classname specified"	TokenNameStringLiteral	There is no classname specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create new parameters to pass to custom selector. * * @param p The new Parameter object */	TokenNameCOMMENT_JAVADOC	 Create new parameters to pass to custom selector. * @param p The new Parameter object 
public	TokenNamepublic	
void	TokenNamevoid	
addParam	TokenNameIdentifier	 add Param
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paramVec	TokenNameIdentifier	 param Vec
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to load the classname specified using an attribute. * @param classpath the classpath to use */	TokenNameCOMMENT_JAVADOC	 Set the classpath to load the classname specified using an attribute. @param classpath the classpath to use 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Specify the classpath to use to load the Selector (nested element). * @return a classpath to be configured */	TokenNameCOMMENT_JAVADOC	 Specify the classpath to use to load the Selector (nested element). @return a classpath to be configured 
public	TokenNamepublic	
final	TokenNamefinal	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
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
this	TokenNamethis	
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classpath * @return the classpath */	TokenNameCOMMENT_JAVADOC	 Get the classpath @return the classpath 
public	TokenNamepublic	
final	TokenNamefinal	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classpath to use for loading a custom selector by using * a reference. * @param r a reference to the classpath */	TokenNameCOMMENT_JAVADOC	 Set the classpath to use for loading a custom selector by using a reference. @param r a reference to the classpath 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathref	TokenNameIdentifier	 set Classpathref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * These are errors specific to ExtendSelector only. If there are * errors in the custom selector, it should throw a BuildException * when isSelected() is called. */	TokenNameCOMMENT_JAVADOC	 These are errors specific to ExtendSelector only. If there are errors in the custom selector, it should throw a BuildException when isSelected() is called. 
public	TokenNamepublic	
void	TokenNamevoid	
verifySettings	TokenNameIdentifier	 verify Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Creation is done here rather than in isSelected() because some 	TokenNameCOMMENT_LINE	Creation is done here rather than in isSelected() because some 
// containers may do a validation pass before running isSelected(), 	TokenNameCOMMENT_LINE	containers may do a validation pass before running isSelected(), 
// but we need to check for the existence of the created class. 	TokenNameCOMMENT_LINE	but we need to check for the existence of the created class. 
if	TokenNameif	
(	TokenNameLPAREN	
dynselector	TokenNameIdentifier	 dynselector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectorCreate	TokenNameIdentifier	 selector Create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"The classname attribute is required"	TokenNameStringLiteral	The classname attribute is required
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dynselector	TokenNameIdentifier	 dynselector
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Internal Error: The custom selector was not created"	TokenNameStringLiteral	Internal Error: The custom selector was not created
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
dynselector	TokenNameIdentifier	 dynselector
instanceof	TokenNameinstanceof	
ExtendFileSelector	TokenNameIdentifier	 Extend File Selector
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
paramVec	TokenNameIdentifier	 param Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
"Cannot set parameters on custom selector that does not "	TokenNameStringLiteral	Cannot set parameters on custom selector that does not 
+	TokenNamePLUS	
"implement ExtendFileSelector"	TokenNameStringLiteral	implement ExtendFileSelector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Allows the custom selector to choose whether to select a file. This * is also where the Parameters are passed to the custom selector, * since we know we must have them all by now. And since we must know * both classpath and classname, creating the class is deferred to here * as well. * @param basedir The the base directory. * @param filename The name of the file to check. * @param file A File object for this filename. * @return whether the file should be selected or not. * @exception BuildException if an error occurs. */	TokenNameCOMMENT_JAVADOC	 Allows the custom selector to choose whether to select a file. This is also where the Parameters are passed to the custom selector, since we know we must have them all by now. And since we must know both classpath and classname, creating the class is deferred to here as well. @param basedir The the base directory. @param filename The name of the file to check. @param file A File object for this filename. @return whether the file should be selected or not. @exception BuildException if an error occurs. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
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
paramVec	TokenNameIdentifier	 param Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
dynselector	TokenNameIdentifier	 dynselector
instanceof	TokenNameinstanceof	
ExtendFileSelector	TokenNameIdentifier	 Extend File Selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramArray	TokenNameIdentifier	 param Array
=	TokenNameEQUAL	
new	TokenNamenew	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
paramVec	TokenNameIdentifier	 param Vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
paramVec	TokenNameIdentifier	 param Vec
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
paramArray	TokenNameIdentifier	 param Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We know that dynselector must be non-null if no error message 	TokenNameCOMMENT_LINE	We know that dynselector must be non-null if no error message 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendFileSelector	TokenNameIdentifier	 Extend File Selector
)	TokenNameRPAREN	
dynselector	TokenNameIdentifier	 dynselector
)	TokenNameRPAREN	
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
paramArray	TokenNameIdentifier	 param Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dynselector	TokenNameIdentifier	 dynselector
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

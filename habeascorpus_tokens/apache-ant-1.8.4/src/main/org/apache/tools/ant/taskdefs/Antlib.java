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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
ComponentHelper	TokenNameIdentifier	 Component Helper
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
ProjectHelper	TokenNameIdentifier	 Project Helper
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
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
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
TaskContainer	TokenNameIdentifier	 Task Container
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
UnknownElement	TokenNameIdentifier	 Unknown Element
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
URLResource	TokenNameIdentifier	 URL Resource
;	TokenNameSEMICOLON	
/** * Antlib task. It does not * occur in an ant build file. It is the root element * an antlib xml file. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Antlib task. It does not occur in an ant build file. It is the root element an antlib xml file. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
Antlib	TokenNameIdentifier	 Antlib
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
implements	TokenNameimplements	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Static 	TokenNameCOMMENT_LINE	Static 
// 	TokenNameCOMMENT_LINE	 
/** The name of this task */	TokenNameCOMMENT_JAVADOC	 The name of this task 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAG	TokenNameIdentifier	 TAG
=	TokenNameEQUAL	
"antlib"	TokenNameStringLiteral	antlib
;	TokenNameSEMICOLON	
/** * Static method to read an ant lib definition from * a url. * * @param project the current project * @param antlibUrl the url to read the definitions from * @param uri the uri that the antlib is to be placed in * @return the ant lib task */	TokenNameCOMMENT_JAVADOC	 Static method to read an ant lib definition from a url. * @param project the current project @param antlibUrl the url to read the definitions from @param uri the uri that the antlib is to be placed in @return the ant lib task 
public	TokenNamepublic	
static	TokenNamestatic	
Antlib	TokenNameIdentifier	 Antlib
createAntlib	TokenNameIdentifier	 create Antlib
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
antlibUrl	TokenNameIdentifier	 antlib Url
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if we can contact the URL 	TokenNameCOMMENT_LINE	Check if we can contact the URL 
try	TokenNametry	
{	TokenNameLBRACE	
antlibUrl	TokenNameIdentifier	 antlib Url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to find "	TokenNameStringLiteral	Unable to find 
+	TokenNamePLUS	
antlibUrl	TokenNameIdentifier	 antlib Url
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ComponentHelper	TokenNameIdentifier	 Component Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
ComponentHelper	TokenNameIdentifier	 Component Helper
.	TokenNameDOT	
getComponentHelper	TokenNameIdentifier	 get Component Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
enterAntLib	TokenNameIdentifier	 enter Ant Lib
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URLResource	TokenNameIdentifier	 URL Resource
antlibResource	TokenNameIdentifier	 antlib Resource
=	TokenNameEQUAL	
new	TokenNamenew	
URLResource	TokenNameIdentifier	 URL Resource
(	TokenNameLPAREN	
antlibUrl	TokenNameIdentifier	 antlib Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Should be safe to parse 	TokenNameCOMMENT_LINE	Should be safe to parse 
ProjectHelper	TokenNameIdentifier	 Project Helper
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
PROJECTHELPER_REFERENCE	TokenNameIdentifier	 PROJECTHELPER  REFERENCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
instanceof	TokenNameinstanceof	
ProjectHelper	TokenNameIdentifier	 Project Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
canParseAntlibDescriptor	TokenNameIdentifier	 can Parse Antlib Descriptor
(	TokenNameLPAREN	
antlibResource	TokenNameIdentifier	 antlib Resource
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
helperRepository	TokenNameIdentifier	 helper Repository
=	TokenNameEQUAL	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
helperRepository	TokenNameIdentifier	 helper Repository
.	TokenNameDOT	
getProjectHelperForAntlib	TokenNameIdentifier	 get Project Helper For Antlib
(	TokenNameLPAREN	
antlibResource	TokenNameIdentifier	 antlib Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnknownElement	TokenNameIdentifier	 Unknown Element
ue	TokenNameIdentifier	 ue
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseAntlibDescriptor	TokenNameIdentifier	 parse Antlib Descriptor
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
antlibResource	TokenNameIdentifier	 antlib Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check name is "antlib" 	TokenNameCOMMENT_LINE	Check name is "antlib" 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TAG	TokenNameIdentifier	 TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unexpected tag "	TokenNameStringLiteral	Unexpected tag 
+	TokenNamePLUS	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" expecting "	TokenNameStringLiteral	 expecting 
+	TokenNamePLUS	
TAG	TokenNameIdentifier	 TAG
,	TokenNameCOMMA	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Antlib	TokenNameIdentifier	 Antlib
antlib	TokenNameIdentifier	 antlib
=	TokenNameEQUAL	
new	TokenNamenew	
Antlib	TokenNameIdentifier	 Antlib
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
antlib	TokenNameIdentifier	 antlib
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
antlib	TokenNameIdentifier	 antlib
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
antlib	TokenNameIdentifier	 antlib
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
"antlib"	TokenNameStringLiteral	antlib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
antlib	TokenNameIdentifier	 antlib
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
antlib	TokenNameIdentifier	 antlib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
antlib	TokenNameIdentifier	 antlib
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
exitAntLib	TokenNameIdentifier	 exit Ant Lib
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Instance 	TokenNameCOMMENT_LINE	Instance 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the class loader for this antlib. * This class loader is used for any tasks that * derive from Definer. * * @param classLoader the class loader */	TokenNameCOMMENT_JAVADOC	 Set the class loader for this antlib. This class loader is used for any tasks that derive from Definer. * @param classLoader the class loader 
protected	TokenNameprotected	
void	TokenNamevoid	
setClassLoader	TokenNameIdentifier	 set Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the URI for this antlib. * @param uri the namespace uri */	TokenNameCOMMENT_JAVADOC	 Set the URI for this antlib. @param uri the namespace uri 
protected	TokenNameprotected	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
Antlib	TokenNameIdentifier	 Antlib
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a task to the list of tasks * * @param nestedTask Nested task to execute in antlib */	TokenNameCOMMENT_JAVADOC	 add a task to the list of tasks * @param nestedTask Nested task to execute in antlib 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the nested tasks, setting the classloader for * any tasks that derive from Definer. */	TokenNameCOMMENT_JAVADOC	 Execute the nested tasks, setting the classloader for any tasks that derive from Definer. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnknownElement	TokenNameIdentifier	 Unknown Element
ue	TokenNameIdentifier	 ue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
configuredObject	TokenNameIdentifier	 configured Object
=	TokenNameEQUAL	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getRealThing	TokenNameIdentifier	 get Real Thing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
configuredObject	TokenNameIdentifier	 configured Object
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
configuredObject	TokenNameIdentifier	 configured Object
instanceof	TokenNameinstanceof	
AntlibDefinition	TokenNameIdentifier	 Antlib Definition
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid task in antlib "	TokenNameStringLiteral	Invalid task in antlib 
+	TokenNamePLUS	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
configuredObject	TokenNameIdentifier	 configured Object
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not "	TokenNameStringLiteral	 does not 
+	TokenNamePLUS	
"extend org.apache.tools.ant.taskdefs.AntlibDefinition"	TokenNameStringLiteral	extend org.apache.tools.ant.taskdefs.AntlibDefinition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AntlibDefinition	TokenNameIdentifier	 Antlib Definition
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AntlibDefinition	TokenNameIdentifier	 Antlib Definition
)	TokenNameRPAREN	
configuredObject	TokenNameIdentifier	 configured Object
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
setAntlibClassLoader	TokenNameIdentifier	 set Antlib Class Loader
(	TokenNameLPAREN	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

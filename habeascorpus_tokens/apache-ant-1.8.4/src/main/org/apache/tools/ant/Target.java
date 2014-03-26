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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
LocalProperties	TokenNameIdentifier	 Local Properties
;	TokenNameSEMICOLON	
/** * Class to implement a target object with required parameters. * * <p>If you are creating Targets programmatically, make sure you set * the Location to a useful value. In particular all targets should * have different location values.</p> */	TokenNameCOMMENT_JAVADOC	 Class to implement a target object with required parameters. * <p>If you are creating Targets programmatically, make sure you set the Location to a useful value. In particular all targets should have different location values.</p> 
public	TokenNamepublic	
class	TokenNameclass	
Target	TokenNameIdentifier	 Target
implements	TokenNameimplements	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
/** Name of this target. */	TokenNameCOMMENT_JAVADOC	 Name of this target. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** The "if" condition to test on execution. */	TokenNameCOMMENT_JAVADOC	 The "if" condition to test on execution. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ifCondition	TokenNameIdentifier	 if Condition
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** The "unless" condition to test on execution. */	TokenNameCOMMENT_JAVADOC	 The "unless" condition to test on execution. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
unlessCondition	TokenNameIdentifier	 unless Condition
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** List of targets this target is dependent on. */	TokenNameCOMMENT_JAVADOC	 List of targets this target is dependent on. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
/*<String>*/	TokenNameCOMMENT_BLOCK	<String>
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Children of this target (tasks and data types). */	TokenNameCOMMENT_JAVADOC	 Children of this target (tasks and data types). 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Since Ant 1.6.2 
private	TokenNameprivate	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
UNKNOWN_LOCATION	TokenNameIdentifier	 UNKNOWN  LOCATION
;	TokenNameSEMICOLON	
/** Project this target belongs to. */	TokenNameCOMMENT_JAVADOC	 Project this target belongs to. 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** Description of this target, if any. */	TokenNameCOMMENT_JAVADOC	 Description of this target, if any. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Target	TokenNameIdentifier	 Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//empty 	TokenNameCOMMENT_LINE	empty 
}	TokenNameRBRACE	
/** * Cloning constructor. * @param other the Target to clone. */	TokenNameCOMMENT_JAVADOC	 Cloning constructor. @param other the Target to clone. 
public	TokenNamepublic	
Target	TokenNameIdentifier	 Target
(	TokenNameLPAREN	
Target	TokenNameIdentifier	 Target
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ifCondition	TokenNameIdentifier	 if Condition
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ifCondition	TokenNameIdentifier	 if Condition
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unlessCondition	TokenNameIdentifier	 unless Condition
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
unlessCondition	TokenNameIdentifier	 unless Condition
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
dependencies	TokenNameIdentifier	 dependencies
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
// The children are added to after this cloning 	TokenNameCOMMENT_LINE	The children are added to after this cloning 
this	TokenNamethis	
.	TokenNameDOT	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the project this target belongs to. * * @param project The project this target belongs to. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the project this target belongs to. * @param project The project this target belongs to. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the project this target belongs to. * * @return The project this target belongs to, or <code>null</code> if * the project has not been set yet. */	TokenNameCOMMENT_JAVADOC	 Returns the project this target belongs to. * @return The project this target belongs to, or <code>null</code> if the project has not been set yet. 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the location of this target's definition. * * @param location <code>Location</code> * @since 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Sets the location of this target's definition. * @param location <code>Location</code> @since 1.6.2 
public	TokenNamepublic	
void	TokenNamevoid	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the location of this target's definition. * * @return <code>Location</code> * @since 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Get the location of this target's definition. * @return <code>Location</code> @since 1.6.2 
public	TokenNamepublic	
Location	TokenNameIdentifier	 Location
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the list of targets this target is dependent on. * The targets themselves are not resolved at this time. * * @param depS A comma-separated list of targets this target * depends on. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the list of targets this target is dependent on. The targets themselves are not resolved at this time. * @param depS A comma-separated list of targets this target depends on. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setDepends	TokenNameIdentifier	 set Depends
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
depS	TokenNameIdentifier	 dep S
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
parseDepends	TokenNameIdentifier	 parse Depends
(	TokenNameLPAREN	
depS	TokenNameIdentifier	 dep S
,	TokenNameCOMMA	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"depends"	TokenNameStringLiteral	depends
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
/*<String>*/	TokenNameCOMMENT_BLOCK	<String>
parseDepends	TokenNameIdentifier	 parse Depends
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
depends	TokenNameIdentifier	 depends
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
targetName	TokenNameIdentifier	 target Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depends	TokenNameIdentifier	 depends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
depends	TokenNameIdentifier	 depends
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure the dependency is not empty string 	TokenNameCOMMENT_LINE	Make sure the dependency is not empty string 
if	TokenNameif	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
||	TokenNameOR_OR	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Syntax Error: "	TokenNameStringLiteral	Syntax Error: 
+	TokenNamePLUS	
attributeName	TokenNameIdentifier	 attribute Name
+	TokenNamePLUS	
" attribute of target ""	TokenNameStringLiteral	 attribute of target "
+	TokenNamePLUS	
targetName	TokenNameIdentifier	 target Name
+	TokenNamePLUS	
"" contains an empty string."	TokenNameStringLiteral	" contains an empty string.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure that depends attribute does not 	TokenNameCOMMENT_LINE	Make sure that depends attribute does not 
// end in a , 	TokenNameCOMMENT_LINE	end in a , 
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Syntax Error: "	TokenNameStringLiteral	Syntax Error: 
+	TokenNamePLUS	
attributeName	TokenNameIdentifier	 attribute Name
+	TokenNamePLUS	
" attribute for target ""	TokenNameStringLiteral	 attribute for target "
+	TokenNamePLUS	
targetName	TokenNameIdentifier	 target Name
+	TokenNamePLUS	
"" ends with a "," "	TokenNameStringLiteral	" ends with a "," 
+	TokenNamePLUS	
"character"	TokenNameStringLiteral	character
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name of this target. * * @param name The name of this target. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the name of this target. * @param name The name of this target. Should not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of this target. * * @return the name of this target, or <code>null</code> if the * name has not been set yet. */	TokenNameCOMMENT_JAVADOC	 Returns the name of this target. * @return the name of this target, or <code>null</code> if the name has not been set yet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a task to this target. * * @param task The task to be added. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a task to this target. * @param task The task to be added. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the wrapper for a data type element to this target. * * @param r The wrapper for the data type element to be added. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds the wrapper for a data type element to this target. * @param r The wrapper for the data type element to be added. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addDataType	TokenNameIdentifier	 add Data Type
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current set of tasks to be executed by this target. * * @return an array of the tasks currently within this target */	TokenNameCOMMENT_JAVADOC	 Returns the current set of tasks to be executed by this target. * @return an array of the tasks currently within this target 
public	TokenNamepublic	
Task	TokenNameIdentifier	 Task
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTasks	TokenNameIdentifier	 get Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
tasks	TokenNameIdentifier	 tasks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Task	TokenNameIdentifier	 Task
[	TokenNameLBRACKET	
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a dependency to this target. * * @param dependency The name of a target this target is dependent on. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a dependency to this target. * @param dependency The name of a target this target is dependent on. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dependencies	TokenNameIdentifier	 dependencies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumeration of the dependencies of this target. * * @return an enumeration of the dependencies of this target (enumeration of String) */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the dependencies of this target. * @return an enumeration of the dependencies of this target (enumeration of String) 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
dependencies	TokenNameIdentifier	 dependencies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
:	TokenNameCOLON	
dependencies	TokenNameIdentifier	 dependencies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does this target depend on the named target? * @param other the other named target. * @return true if the target does depend on the named target * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Does this target depend on the named target? @param other the other named target. @return true if the target does depend on the named target @since Ant 1.6 
public	TokenNamepublic	
boolean	TokenNameboolean	
dependsOn	TokenNameIdentifier	 depends On
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getTargets	TokenNameIdentifier	 get Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
topoSort	TokenNameIdentifier	 topo Sort
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the "if" condition to test on execution. This is the * name of a property to test for existence - if the property * is not set, the task will not execute. The property goes * through property substitution once before testing, so if * property <code>foo</code> has value <code>bar</code>, setting * the "if" condition to <code>${foo}_x</code> will mean that the * task will only execute if property <code>bar_x</code> is set. * * @param property The property condition to test on execution. * May be <code>null</code>, in which case * no "if" test is performed. */	TokenNameCOMMENT_JAVADOC	 Sets the "if" condition to test on execution. This is the name of a property to test for existence - if the property is not set, the task will not execute. The property goes through property substitution once before testing, so if property <code>foo</code> has value <code>bar</code>, setting the "if" condition to <code>${foo}_x</code> will mean that the task will only execute if property <code>bar_x</code> is set. * @param property The property condition to test on execution. May be <code>null</code>, in which case no "if" test is performed. 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ifCondition	TokenNameIdentifier	 if Condition
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the "if" property condition of this target. * * @return the "if" property condition or <code>null</code> if no * "if" condition had been defined. * @since 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Returns the "if" property condition of this target. * @return the "if" property condition or <code>null</code> if no "if" condition had been defined. @since 1.6.2 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIf	TokenNameIdentifier	 get If
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
ifCondition	TokenNameIdentifier	 if Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the "unless" condition to test on execution. This is the * name of a property to test for existence - if the property * is set, the task will not execute. The property goes * through property substitution once before testing, so if * property <code>foo</code> has value <code>bar</code>, setting * the "unless" condition to <code>${foo}_x</code> will mean that the * task will only execute if property <code>bar_x</code> isn't set. * * @param property The property condition to test on execution. * May be <code>null</code>, in which case * no "unless" test is performed. */	TokenNameCOMMENT_JAVADOC	 Sets the "unless" condition to test on execution. This is the name of a property to test for existence - if the property is set, the task will not execute. The property goes through property substitution once before testing, so if property <code>foo</code> has value <code>bar</code>, setting the "unless" condition to <code>${foo}_x</code> will mean that the task will only execute if property <code>bar_x</code> isn't set. * @param property The property condition to test on execution. May be <code>null</code>, in which case no "unless" test is performed. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unlessCondition	TokenNameIdentifier	 unless Condition
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the "unless" property condition of this target. * * @return the "unless" property condition or <code>null</code> * if no "unless" condition had been defined. * @since 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Returns the "unless" property condition of this target. * @return the "unless" property condition or <code>null</code> if no "unless" condition had been defined. @since 1.6.2 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnless	TokenNameIdentifier	 get Unless
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
unlessCondition	TokenNameIdentifier	 unless Condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the description of this target. * * @param description The description for this target. * May be <code>null</code>, indicating that no * description is available. */	TokenNameCOMMENT_JAVADOC	 Sets the description of this target. * @param description The description for this target. May be <code>null</code>, indicating that no description is available. 
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the description of this target. * * @return the description of this target, or <code>null</code> if no * description is available. */	TokenNameCOMMENT_JAVADOC	 Returns the description of this target. * @return the description of this target, or <code>null</code> if no description is available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of this target. * * @return the name of this target, or <code>null</code> if the * name has not been set yet. */	TokenNameCOMMENT_JAVADOC	 Returns the name of this target. * @return the name of this target, or <code>null</code> if the name has not been set yet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the target if the "if" and "unless" conditions are * satisfied. Dependency checking should be done before calling this * method, as it does no checking of its own. If either the "if" * or "unless" test prevents this target from being executed, a verbose * message is logged giving the reason. It is recommended that clients * of this class call performTasks rather than this method so that * appropriate build events are fired. * * @exception BuildException if any of the tasks fail or if a data type * configuration fails. * * @see #performTasks() * @see #setIf(String) * @see #setUnless(String) */	TokenNameCOMMENT_JAVADOC	 Executes the target if the "if" and "unless" conditions are satisfied. Dependency checking should be done before calling this method, as it does no checking of its own. If either the "if" or "unless" test prevents this target from being executed, a verbose message is logged giving the reason. It is recommended that clients of this class call performTasks rather than this method so that appropriate build events are fired. * @exception BuildException if any of the tasks fail or if a data type configuration fails. * @see #performTasks() @see #setIf(String) @see #setUnless(String) 
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
!	TokenNameNOT	
testIfAllows	TokenNameIdentifier	 test If Allows
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"Skipped because property '"	TokenNameStringLiteral	Skipped because property '
+	TokenNamePLUS	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' not set."	TokenNameStringLiteral	' not set.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
testUnlessAllows	TokenNameIdentifier	 test Unless Allows
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"Skipped because property '"	TokenNameStringLiteral	Skipped because property '
+	TokenNamePLUS	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' set."	TokenNameStringLiteral	' set.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LocalProperties	TokenNameIdentifier	 Local Properties
localProperties	TokenNameIdentifier	 local Properties
=	TokenNameEQUAL	
LocalProperties	TokenNameIdentifier	 Local Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localProperties	TokenNameIdentifier	 local Properties
.	TokenNameDOT	
enterScope	TokenNameIdentifier	 enter Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// use index-based approach to avoid ConcurrentModificationExceptions; 	TokenNameCOMMENT_LINE	use index-based approach to avoid ConcurrentModificationExceptions; 
// also account for growing target children 	TokenNameCOMMENT_LINE	also account for growing target children 
// do not optimize this loop by replacing children.size() by a variable 	TokenNameCOMMENT_LINE	do not optimize this loop by replacing children.size() by a variable 
// as children can be added dynamically as in RhinoScriptTest where a target is adding work for itself 	TokenNameCOMMENT_LINE	as children can be added dynamically as in RhinoScriptTest where a target is adding work for itself 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
perform	TokenNameIdentifier	 perform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
localProperties	TokenNameIdentifier	 local Properties
.	TokenNameDOT	
exitScope	TokenNameIdentifier	 exit Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Performs the tasks within this target (if the conditions are met), * firing target started/target finished messages around a call to * execute. * * @see #execute() */	TokenNameCOMMENT_JAVADOC	 Performs the tasks within this target (if the conditions are met), firing target started/target finished messages around a call to execute. * @see #execute() 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
performTasks	TokenNameIdentifier	 perform Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RuntimeException	TokenNameIdentifier	 Runtime Exception
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
fireTargetStarted	TokenNameIdentifier	 fire Target Started
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
exc	TokenNameIdentifier	 exc
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
exc	TokenNameIdentifier	 exc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
fireTargetFinished	TokenNameIdentifier	 fire Target Finished
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Replaces all occurrences of the given task in the list * of children with the replacement data type wrapper. * * @param el The task to replace. * Must not be <code>null</code>. * @param o The data type wrapper to replace <code>el</code> with. */	TokenNameCOMMENT_JAVADOC	 Replaces all occurrences of the given task in the list of children with the replacement data type wrapper. * @param el The task to replace. Must not be <code>null</code>. @param o The data type wrapper to replace <code>el</code> with. 
void	TokenNamevoid	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
el	TokenNameIdentifier	 el
,	TokenNameCOMMA	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Replaces all occurrences of the given task in the list * of children with the replacement task. * * @param el The task to replace. * Must not be <code>null</code>. * @param o The task to replace <code>el</code> with. */	TokenNameCOMMENT_JAVADOC	 Replaces all occurrences of the given task in the list of children with the replacement task. * @param el The task to replace. Must not be <code>null</code>. @param o The task to replace <code>el</code> with. 
void	TokenNamevoid	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
el	TokenNameIdentifier	 el
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests whether or not the "if" condition allows the execution of this target. * * @return whether or not the "if" condition is satisfied. If no * condition (or an empty condition) has been set, * <code>true</code> is returned. * * @see #setIf(String) */	TokenNameCOMMENT_JAVADOC	 Tests whether or not the "if" condition allows the execution of this target. * @return whether or not the "if" condition is satisfied. If no condition (or an empty condition) has been set, <code>true</code> is returned. * @see #setIf(String) 
private	TokenNameprivate	
boolean	TokenNameboolean	
testIfAllows	TokenNameIdentifier	 test If Allows
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
propertyHelper	TokenNameIdentifier	 property Helper
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
ifCondition	TokenNameIdentifier	 if Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
propertyHelper	TokenNameIdentifier	 property Helper
.	TokenNameDOT	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether or not the "unless" condition allows the execution of this target. * * @return whether or not the "unless" condition is satisfied. If no * condition (or an empty condition) has been set, * <code>true</code> is returned. * * @see #setUnless(String) */	TokenNameCOMMENT_JAVADOC	 Tests whether or not the "unless" condition allows the execution of this target. * @return whether or not the "unless" condition is satisfied. If no condition (or an empty condition) has been set, <code>true</code> is returned. * @see #setUnless(String) 
private	TokenNameprivate	
boolean	TokenNameboolean	
testUnlessAllows	TokenNameIdentifier	 test Unless Allows
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
propertyHelper	TokenNameIdentifier	 property Helper
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
unlessCondition	TokenNameIdentifier	 unless Condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
propertyHelper	TokenNameIdentifier	 property Helper
.	TokenNameDOT	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

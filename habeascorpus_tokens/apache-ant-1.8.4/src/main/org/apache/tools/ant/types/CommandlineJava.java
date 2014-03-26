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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
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
LinkedList	TokenNameIdentifier	 Linked List
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
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * A representation of a Java command line that is * a composite of 2 <tt>Commandline</tt>s. One is used for the * vm/options and one for the classname/arguments. It provides * specific methods for a Java command line. * */	TokenNameCOMMENT_JAVADOC	 A representation of a Java command line that is a composite of 2 <tt>Commandline</tt>s. One is used for the vm/options and one for the classname/arguments. It provides specific methods for a Java command line. 
public	TokenNamepublic	
class	TokenNameclass	
CommandlineJava	TokenNameIdentifier	 Commandline Java
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * commands to the JVM */	TokenNameCOMMENT_JAVADOC	 commands to the JVM 
private	TokenNameprivate	
Commandline	TokenNameIdentifier	 Commandline
vmCommand	TokenNameIdentifier	 vm Command
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * actual java commands */	TokenNameCOMMENT_JAVADOC	 actual java commands 
private	TokenNameprivate	
Commandline	TokenNameIdentifier	 Commandline
javaCommand	TokenNameIdentifier	 java Command
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * properties to add using -D */	TokenNameCOMMENT_JAVADOC	 properties to add using -D 
private	TokenNameprivate	
SysProperties	TokenNameIdentifier	 Sys Properties
sysProperties	TokenNameIdentifier	 sys Properties
=	TokenNameEQUAL	
new	TokenNamenew	
SysProperties	TokenNameIdentifier	 Sys Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
bootclasspath	TokenNameIdentifier	 bootclasspath
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
vmVersion	TokenNameIdentifier	 vm Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
maxMemory	TokenNameIdentifier	 max Memory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * any assertions to make? Currently only supported in forked JVMs */	TokenNameCOMMENT_JAVADOC	 any assertions to make? Currently only supported in forked JVMs 
private	TokenNameprivate	
Assertions	TokenNameIdentifier	 Assertions
assertions	TokenNameIdentifier	 assertions
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Indicate whether it will execute a jar file or not, in this case * the first vm option must be a -jar and the 'executable' is a jar file. */	TokenNameCOMMENT_JAVADOC	 Indicate whether it will execute a jar file or not, in this case the first vm option must be a -jar and the 'executable' is a jar file. 
private	TokenNameprivate	
boolean	TokenNameboolean	
executeJar	TokenNameIdentifier	 execute Jar
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Whether system properties and bootclasspath shall be cloned. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Whether system properties and bootclasspath shall be cloned. @since Ant 1.7 
private	TokenNameprivate	
boolean	TokenNameboolean	
cloneVm	TokenNameIdentifier	 clone Vm
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Specialized Environment class for System properties. */	TokenNameCOMMENT_JAVADOC	 Specialized Environment class for System properties. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SysProperties	TokenNameIdentifier	 Sys Properties
extends	TokenNameextends	
Environment	TokenNameIdentifier	 Environment
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** the system properties. */	TokenNameCOMMENT_JAVADOC	 the system properties. 
Properties	TokenNameIdentifier	 Properties
sys	TokenNameIdentifier	 sys
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
propertySets	TokenNameIdentifier	 property Sets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the properties as an array; this is an override of the * superclass, as it evaluates all the properties. * @return the array of definitions; may be null. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Get the properties as an array; this is an override of the superclass, as it evaluates all the properties. @return the array of definitions; may be null. @throws BuildException on error. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getVariables	TokenNameIdentifier	 get Variables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
definitions	TokenNameIdentifier	 definitions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListIterator	TokenNameIdentifier	 List Iterator
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
definitions	TokenNameIdentifier	 definitions
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDefinitionsToList	TokenNameIdentifier	 add Definitions To List
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
definitions	TokenNameIdentifier	 definitions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
definitions	TokenNameIdentifier	 definitions
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
definitions	TokenNameIdentifier	 definitions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add all definitions (including property sets) to a list. * @param listIt list iterator supporting add method. */	TokenNameCOMMENT_JAVADOC	 Add all definitions (including property sets) to a list. @param listIt list iterator supporting add method. 
public	TokenNamepublic	
void	TokenNamevoid	
addDefinitionsToList	TokenNameIdentifier	 add Definitions To List
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
listIt	TokenNameIdentifier	 list It
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getVariables	TokenNameIdentifier	 get Variables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listIt	TokenNameIdentifier	 list It
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-D"	TokenNameStringLiteral	-D
+	TokenNamePLUS	
props	TokenNameIdentifier	 props
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Properties	TokenNameIdentifier	 Properties
propertySetProperties	TokenNameIdentifier	 property Set Properties
=	TokenNameEQUAL	
mergePropertySets	TokenNameIdentifier	 merge Property Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
propertySetProperties	TokenNameIdentifier	 property Set Properties
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
propertySetProperties	TokenNameIdentifier	 property Set Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listIt	TokenNameIdentifier	 list It
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-D"	TokenNameStringLiteral	-D
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the size of the sysproperties instance. This merges all * property sets, so is not an O(1) operation. * @return the size of the sysproperties instance. */	TokenNameCOMMENT_JAVADOC	 Get the size of the sysproperties instance. This merges all property sets, so is not an O(1) operation. @return the size of the sysproperties instance. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
mergePropertySets	TokenNameIdentifier	 merge Property Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cache the system properties and set the system properties to the * new values. * @throws BuildException if Security prevented this operation. */	TokenNameCOMMENT_JAVADOC	 Cache the system properties and set the system properties to the new values. @throws BuildException if Security prevented this operation. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystem	TokenNameIdentifier	 set System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sys	TokenNameIdentifier	 sys
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
sys	TokenNameIdentifier	 sys
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
sys	TokenNameIdentifier	 sys
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
mergePropertySets	TokenNameIdentifier	 merge Property Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot modify system properties"	TokenNameStringLiteral	Cannot modify system properties
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Restore the system properties to the cached value. * @throws BuildException if Security prevented this operation, or * there were no system properties to restore. */	TokenNameCOMMENT_JAVADOC	 Restore the system properties to the cached value. @throws BuildException if Security prevented this operation, or there were no system properties to restore. 
public	TokenNamepublic	
void	TokenNamevoid	
restoreSystem	TokenNameIdentifier	 restore System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sys	TokenNameIdentifier	 sys
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unbalanced nesting of SysProperties"	TokenNameStringLiteral	Unbalanced nesting of SysProperties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
sys	TokenNameIdentifier	 sys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sys	TokenNameIdentifier	 sys
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot modify system properties"	TokenNameStringLiteral	Cannot modify system properties
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a deep clone. * @return a cloned instance of SysProperties. * @exception CloneNotSupportedException for signature. */	TokenNameCOMMENT_JAVADOC	 Create a deep clone. @return a cloned instance of SysProperties. @exception CloneNotSupportedException for signature. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SysProperties	TokenNameIdentifier	 Sys Properties
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SysProperties	TokenNameIdentifier	 Sys Properties
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
variables	TokenNameIdentifier	 variables
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
propertySets	TokenNameIdentifier	 property Sets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
propertySets	TokenNameIdentifier	 property Sets
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a propertyset to the total set. * @param ps the new property set. */	TokenNameCOMMENT_JAVADOC	 Add a propertyset to the total set. @param ps the new property set. 
public	TokenNamepublic	
void	TokenNamevoid	
addSyspropertyset	TokenNameIdentifier	 add Syspropertyset
(	TokenNameLPAREN	
PropertySet	TokenNameIdentifier	 Property Set
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
propertySets	TokenNameIdentifier	 property Sets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a propertyset to the total set. * @param ps the new property set. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Add a propertyset to the total set. @param ps the new property set. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
addSysproperties	TokenNameIdentifier	 add Sysproperties
(	TokenNameLPAREN	
SysProperties	TokenNameIdentifier	 Sys Properties
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertySets	TokenNameIdentifier	 property Sets
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
propertySets	TokenNameIdentifier	 property Sets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge all property sets into a single Properties object. * @return the merged object. */	TokenNameCOMMENT_JAVADOC	 Merge all property sets into a single Properties object. @return the merged object. 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
mergePropertySets	TokenNameIdentifier	 merge Property Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
propertySets	TokenNameIdentifier	 property Sets
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertySet	TokenNameIdentifier	 Property Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PropertySet	TokenNameIdentifier	 Property Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructor uses the VM we are running on now. */	TokenNameCOMMENT_JAVADOC	 Constructor uses the VM we are running on now. 
public	TokenNamepublic	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setVm	TokenNameIdentifier	 set Vm
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJreExecutable	TokenNameIdentifier	 get Jre Executable
(	TokenNameLPAREN	
"java"	TokenNameStringLiteral	java
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setVmversion	TokenNameIdentifier	 set Vmversion
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJavaVersion	TokenNameIdentifier	 get Java Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new argument to the java program. * @return an argument to be configured. */	TokenNameCOMMENT_JAVADOC	 Create a new argument to the java program. @return an argument to be configured. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new JVM argument. * @return an argument to be configured. */	TokenNameCOMMENT_JAVADOC	 Create a new JVM argument. @return an argument to be configured. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vmCommand	TokenNameIdentifier	 vm Command
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a system property. * @param sysp a property to be set in the JVM. */	TokenNameCOMMENT_JAVADOC	 Add a system property. @param sysp a property to be set in the JVM. 
public	TokenNamepublic	
void	TokenNamevoid	
addSysproperty	TokenNameIdentifier	 add Sysproperty
(	TokenNameLPAREN	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
addVariable	TokenNameIdentifier	 add Variable
(	TokenNameLPAREN	
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a set of system properties. * @param sysp a set of properties. */	TokenNameCOMMENT_JAVADOC	 Add a set of system properties. @param sysp a set of properties. 
public	TokenNamepublic	
void	TokenNamevoid	
addSyspropertyset	TokenNameIdentifier	 add Syspropertyset
(	TokenNameLPAREN	
PropertySet	TokenNameIdentifier	 Property Set
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
addSyspropertyset	TokenNameIdentifier	 add Syspropertyset
(	TokenNameLPAREN	
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a set of system properties. * @param sysp a set of properties. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Add a set of system properties. @param sysp a set of properties. @since Ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
addSysproperties	TokenNameIdentifier	 add Sysproperties
(	TokenNameLPAREN	
SysProperties	TokenNameIdentifier	 Sys Properties
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
addSysproperties	TokenNameIdentifier	 add Sysproperties
(	TokenNameLPAREN	
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the executable used to start the new JVM. * @param vm the executable to use. */	TokenNameCOMMENT_JAVADOC	 Set the executable used to start the new JVM. @param vm the executable to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setVm	TokenNameIdentifier	 set Vm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
vm	TokenNameIdentifier	 vm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vmCommand	TokenNameIdentifier	 vm Command
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
vm	TokenNameIdentifier	 vm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the JVM version required. * @param value the version required. */	TokenNameCOMMENT_JAVADOC	 Set the JVM version required. @param value the version required. 
public	TokenNamepublic	
void	TokenNamevoid	
setVmversion	TokenNameIdentifier	 set Vmversion
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vmVersion	TokenNameIdentifier	 vm Version
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether system properties will be copied to the cloned VM--as * well as the bootclasspath unless you have explicitly specified * a bootclasspath. * @param cloneVm if true copy the system properties. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Set whether system properties will be copied to the cloned VM--as well as the bootclasspath unless you have explicitly specified a bootclasspath. @param cloneVm if true copy the system properties. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setCloneVm	TokenNameIdentifier	 set Clone Vm
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cloneVm	TokenNameIdentifier	 clone Vm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cloneVm	TokenNameIdentifier	 clone Vm
=	TokenNameEQUAL	
cloneVm	TokenNameIdentifier	 clone Vm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current assertions. * @return assertions or null. */	TokenNameCOMMENT_JAVADOC	 Get the current assertions. @return assertions or null. 
public	TokenNamepublic	
Assertions	TokenNameIdentifier	 Assertions
getAssertions	TokenNameIdentifier	 get Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
assertions	TokenNameIdentifier	 assertions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an assertion set to the command. * @param assertions assertions to make. */	TokenNameCOMMENT_JAVADOC	 Add an assertion set to the command. @param assertions assertions to make. 
public	TokenNamepublic	
void	TokenNamevoid	
setAssertions	TokenNameIdentifier	 set Assertions
(	TokenNameLPAREN	
Assertions	TokenNameIdentifier	 Assertions
assertions	TokenNameIdentifier	 assertions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
assertions	TokenNameIdentifier	 assertions
=	TokenNameEQUAL	
assertions	TokenNameIdentifier	 assertions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a jar file to execute via the -jar option. * @param jarpathname the pathname of the jar to execute. */	TokenNameCOMMENT_JAVADOC	 Set a jar file to execute via the -jar option. @param jarpathname the pathname of the jar to execute. 
public	TokenNamepublic	
void	TokenNamevoid	
setJar	TokenNameIdentifier	 set Jar
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jarpathname	TokenNameIdentifier	 jarpathname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
jarpathname	TokenNameIdentifier	 jarpathname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeJar	TokenNameIdentifier	 execute Jar
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the jar to be run. * @return the pathname of the jar file to run via -jar option * or <tt>null</tt> if there is no jar to run. * @see #getClassname() */	TokenNameCOMMENT_JAVADOC	 Get the name of the jar to be run. @return the pathname of the jar file to run via -jar option or <tt>null</tt> if there is no jar to run. @see #getClassname() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJar	TokenNameIdentifier	 get Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executeJar	TokenNameIdentifier	 execute Jar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classname to execute. * @param classname the fully qualified classname. */	TokenNameCOMMENT_JAVADOC	 Set the classname to execute. @param classname the fully qualified classname. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeJar	TokenNameIdentifier	 execute Jar
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the class to be run. * @return the name of the class to run or <tt>null</tt> if there is no class. * @see #getJar() */	TokenNameCOMMENT_JAVADOC	 Get the name of the class to be run. @return the name of the class to run or <tt>null</tt> if there is no class. @see #getJar() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassname	TokenNameIdentifier	 get Classname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
executeJar	TokenNameIdentifier	 execute Jar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
getExecutable	TokenNameIdentifier	 get Executable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a classpath. * @param p the project to use to create the path. * @return a path to be configured. */	TokenNameCOMMENT_JAVADOC	 Create a classpath. @param p the project to use to create the path. @return a path to be configured. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
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
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a boot classpath. * @param p the project to use to create the path. * @return a path to be configured. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Create a boot classpath. @param p the project to use to create the path. @return a path to be configured. @since Ant 1.6 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createBootclasspath	TokenNameIdentifier	 create Bootclasspath
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bootclasspath	TokenNameIdentifier	 bootclasspath
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bootclasspath	TokenNameIdentifier	 bootclasspath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bootclasspath	TokenNameIdentifier	 bootclasspath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the vm version. * @return the vm version. */	TokenNameCOMMENT_JAVADOC	 Get the vm version. @return the vm version. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVmversion	TokenNameIdentifier	 get Vmversion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
vmVersion	TokenNameIdentifier	 vm Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the command line to run a Java vm. * @return the list of all arguments necessary to run the vm. */	TokenNameCOMMENT_JAVADOC	 Get the command line to run a Java vm. @return the list of all arguments necessary to run the vm. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//create the list 	TokenNameCOMMENT_LINE	create the list 
List	TokenNameIdentifier	 List
commands	TokenNameIdentifier	 commands
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
=	TokenNameEQUAL	
commands	TokenNameIdentifier	 commands
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fill it 	TokenNameCOMMENT_LINE	fill it 
addCommandsToList	TokenNameIdentifier	 add Commands To List
(	TokenNameLPAREN	
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//convert to an array 	TokenNameCOMMENT_LINE	convert to an array 
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
commands	TokenNameIdentifier	 commands
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
commands	TokenNameIdentifier	 commands
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add all the commands to a list identified by the iterator passed in. * @param listIterator an iterator that supports the add method. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Add all the commands to a list identified by the iterator passed in. @param listIterator an iterator that supports the add method. @since Ant 1.6 
private	TokenNameprivate	
void	TokenNamevoid	
addCommandsToList	TokenNameIdentifier	 add Commands To List
(	TokenNameLPAREN	
final	TokenNamefinal	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//create the command to run Java, including user specified options 	TokenNameCOMMENT_LINE	create the command to run Java, including user specified options 
getActualVMCommand	TokenNameIdentifier	 get Actual VM Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addCommandToList	TokenNameIdentifier	 add Command To List
(	TokenNameLPAREN	
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// properties are part of the vm options... 	TokenNameCOMMENT_LINE	properties are part of the vm options... 
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
addDefinitionsToList	TokenNameIdentifier	 add Definitions To List
(	TokenNameLPAREN	
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isCloneVm	TokenNameIdentifier	 is Clone Vm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SysProperties	TokenNameIdentifier	 Sys Properties
clonedSysProperties	TokenNameIdentifier	 cloned Sys Properties
=	TokenNameEQUAL	
new	TokenNamenew	
SysProperties	TokenNameIdentifier	 Sys Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertySet	TokenNameIdentifier	 Property Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
new	TokenNamenew	
PropertySet	TokenNameIdentifier	 Property Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertySet	TokenNameIdentifier	 Property Set
.	TokenNameDOT	
BuiltinPropertySetName	TokenNameIdentifier	 Builtin Property Set Name
sys	TokenNameIdentifier	 sys
=	TokenNameEQUAL	
new	TokenNamenew	
PropertySet	TokenNameIdentifier	 Property Set
.	TokenNameDOT	
BuiltinPropertySetName	TokenNameIdentifier	 Builtin Property Set Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sys	TokenNameIdentifier	 sys
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"system"	TokenNameStringLiteral	system
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
appendBuiltin	TokenNameIdentifier	 append Builtin
(	TokenNameLPAREN	
sys	TokenNameIdentifier	 sys
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedSysProperties	TokenNameIdentifier	 cloned Sys Properties
.	TokenNameDOT	
addSyspropertyset	TokenNameIdentifier	 add Syspropertyset
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedSysProperties	TokenNameIdentifier	 cloned Sys Properties
.	TokenNameDOT	
addDefinitionsToList	TokenNameIdentifier	 add Definitions To List
(	TokenNameLPAREN	
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//boot classpath 	TokenNameCOMMENT_LINE	boot classpath 
Path	TokenNameIdentifier	 Path
bcp	TokenNameIdentifier	 bcp
=	TokenNameEQUAL	
calculateBootclasspath	TokenNameIdentifier	 calculate Bootclasspath
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bcp	TokenNameIdentifier	 bcp
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listIterator	TokenNameIdentifier	 list Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-Xbootclasspath:"	TokenNameStringLiteral	-Xbootclasspath:
+	TokenNamePLUS	
bcp	TokenNameIdentifier	 bcp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//main classpath 	TokenNameCOMMENT_LINE	main classpath 
if	TokenNameif	
(	TokenNameLPAREN	
haveClasspath	TokenNameIdentifier	 have Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listIterator	TokenNameIdentifier	 list Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-classpath"	TokenNameStringLiteral	-classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listIterator	TokenNameIdentifier	 list Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now any assertions are added 	TokenNameCOMMENT_LINE	now any assertions are added 
if	TokenNameif	
(	TokenNameLPAREN	
getAssertions	TokenNameIdentifier	 get Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getAssertions	TokenNameIdentifier	 get Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
applyAssertions	TokenNameIdentifier	 apply Assertions
(	TokenNameLPAREN	
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// JDK usage command line says that -jar must be the first option, as there is 	TokenNameCOMMENT_LINE	JDK usage command line says that -jar must be the first option, as there is 
// a bug in JDK < 1.4 that forces the jvm type to be specified as the first 	TokenNameCOMMENT_LINE	a bug in JDK < 1.4 that forces the jvm type to be specified as the first 
// option, it is appended here as specified in the docs even though there is 	TokenNameCOMMENT_LINE	option, it is appended here as specified in the docs even though there is 
// in fact no order. 	TokenNameCOMMENT_LINE	in fact no order. 
if	TokenNameif	
(	TokenNameLPAREN	
executeJar	TokenNameIdentifier	 execute Jar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listIterator	TokenNameIdentifier	 list Iterator
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-jar"	TokenNameStringLiteral	-jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this is the classname to run as well as its arguments. 	TokenNameCOMMENT_LINE	this is the classname to run as well as its arguments. 
// in case of 'executeJar', the executable is a jar file. 	TokenNameCOMMENT_LINE	in case of 'executeJar', the executable is a jar file. 
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
addCommandToList	TokenNameIdentifier	 add Command To List
(	TokenNameLPAREN	
listIterator	TokenNameIdentifier	 list Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Specify max memory of the JVM. * -mx or -Xmx depending on VM version. * @param max the string to pass to the jvm to specifiy the max memory. */	TokenNameCOMMENT_JAVADOC	 Specify max memory of the JVM. -mx or -Xmx depending on VM version. @param max the string to pass to the jvm to specifiy the max memory. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxmemory	TokenNameIdentifier	 set Maxmemory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxMemory	TokenNameIdentifier	 max Memory
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a string description. * @return the command line as a string. */	TokenNameCOMMENT_JAVADOC	 Get a string description. @return the command line as a string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the command and arguments suitable for * verbose output before a call to <code>Runtime.exec(String[])<code>. * @return the description string. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the command and arguments suitable for verbose output before a call to <code>Runtime.exec(String[])<code>. @return the description string. @since Ant 1.5 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String that describes the java command and arguments * for in-VM executions. * * <p>The class name is the executable in this context.</p> * @return the description string. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return a String that describes the java command and arguments for in-VM executions. * <p>The class name is the executable in this context.</p> @return the description string. @since Ant 1.5 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
describeJavaCommand	TokenNameIdentifier	 describe Java Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
describeCommand	TokenNameIdentifier	 describe Command
(	TokenNameLPAREN	
getJavaCommand	TokenNameIdentifier	 get Java Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the VM command parameters, including memory settings. * @return the VM command parameters. */	TokenNameCOMMENT_JAVADOC	 Get the VM command parameters, including memory settings. @return the VM command parameters. 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
getActualVMCommand	TokenNameIdentifier	 get Actual VM Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
actualVMCommand	TokenNameIdentifier	 actual VM Command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
)	TokenNameRPAREN	
vmCommand	TokenNameIdentifier	 vm Command
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxMemory	TokenNameIdentifier	 max Memory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vmVersion	TokenNameIdentifier	 vm Version
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actualVMCommand	TokenNameIdentifier	 actual VM Command
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-mx"	TokenNameStringLiteral	-mx
+	TokenNamePLUS	
maxMemory	TokenNameIdentifier	 max Memory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
actualVMCommand	TokenNameIdentifier	 actual VM Command
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Xmx"	TokenNameStringLiteral	-Xmx
+	TokenNamePLUS	
maxMemory	TokenNameIdentifier	 max Memory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
actualVMCommand	TokenNameIdentifier	 actual VM Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size of the java command line. This is a fairly intensive * operation, as it has to evaluate the size of many components. * @return the total number of arguments in the java command line. * @see #getCommandline() * @deprecated since 1.7. * Please dont use this, it effectively creates the * entire command. */	TokenNameCOMMENT_JAVADOC	 Get the size of the java command line. This is a fairly intensive operation, as it has to evaluate the size of many components. @return the total number of arguments in the java command line. @see #getCommandline() @deprecated since 1.7. Please dont use this, it effectively creates the entire command. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
getActualVMCommand	TokenNameIdentifier	 get Actual VM Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cloned system properties 	TokenNameCOMMENT_LINE	cloned system properties 
if	TokenNameif	
(	TokenNameLPAREN	
isCloneVm	TokenNameIdentifier	 is Clone Vm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// classpath is "-classpath <classpath>" -> 2 args 	TokenNameCOMMENT_LINE	classpath is "-classpath <classpath>" -> 2 args 
if	TokenNameif	
(	TokenNameLPAREN	
haveClasspath	TokenNameIdentifier	 have Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bootclasspath is "-Xbootclasspath:<classpath>" -> 1 arg 	TokenNameCOMMENT_LINE	bootclasspath is "-Xbootclasspath:<classpath>" -> 1 arg 
if	TokenNameif	
(	TokenNameLPAREN	
calculateBootclasspath	TokenNameIdentifier	 calculate Bootclasspath
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// jar execution requires an additional -jar option 	TokenNameCOMMENT_LINE	jar execution requires an additional -jar option 
if	TokenNameif	
(	TokenNameLPAREN	
executeJar	TokenNameIdentifier	 execute Jar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//assertions take up space too 	TokenNameCOMMENT_LINE	assertions take up space too 
if	TokenNameif	
(	TokenNameLPAREN	
getAssertions	TokenNameIdentifier	 get Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
getAssertions	TokenNameIdentifier	 get Assertions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Java command to be used. * @return the java command--not a clone. */	TokenNameCOMMENT_JAVADOC	 Get the Java command to be used. @return the java command--not a clone. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
getJavaCommand	TokenNameIdentifier	 get Java Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
javaCommand	TokenNameIdentifier	 java Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the VM command, including memory. * @return A deep clone of the instance's VM command, with memory settings added. */	TokenNameCOMMENT_JAVADOC	 Get the VM command, including memory. @return A deep clone of the instance's VM command, with memory settings added. 
public	TokenNamepublic	
Commandline	TokenNameIdentifier	 Commandline
getVmCommand	TokenNameIdentifier	 get Vm Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getActualVMCommand	TokenNameIdentifier	 get Actual VM Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classpath for the command. * @return the classpath or null. */	TokenNameCOMMENT_JAVADOC	 Get the classpath for the command. @return the classpath or null. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the boot classpath. * @return boot classpath or null. */	TokenNameCOMMENT_JAVADOC	 Get the boot classpath. @return boot classpath or null. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getBootclasspath	TokenNameIdentifier	 get Bootclasspath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bootclasspath	TokenNameIdentifier	 bootclasspath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cache current system properties and set them to those in this * Java command. * @throws BuildException if Security prevented this operation. */	TokenNameCOMMENT_JAVADOC	 Cache current system properties and set them to those in this Java command. @throws BuildException if Security prevented this operation. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
setSystem	TokenNameIdentifier	 set System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restore the cached system properties. * @throws BuildException if Security prevented this operation, or * there was no system properties to restore */	TokenNameCOMMENT_JAVADOC	 Restore the cached system properties. @throws BuildException if Security prevented this operation, or there was no system properties to restore 
public	TokenNamepublic	
void	TokenNamevoid	
restoreSystemProperties	TokenNameIdentifier	 restore System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
restoreSystem	TokenNameIdentifier	 restore System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the system properties object. * @return The system properties object. */	TokenNameCOMMENT_JAVADOC	 Get the system properties object. @return The system properties object. 
public	TokenNamepublic	
SysProperties	TokenNameIdentifier	 Sys Properties
getSystemProperties	TokenNameIdentifier	 get System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sysProperties	TokenNameIdentifier	 sys Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deep clone the object. * @return a CommandlineJava object. * @throws BuildException if anything went wrong. * @throws CloneNotSupportedException never. */	TokenNameCOMMENT_JAVADOC	 Deep clone the object. @return a CommandlineJava object. @throws BuildException if anything went wrong. @throws CloneNotSupportedException never. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
CommandlineJava	TokenNameIdentifier	 Commandline Java
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CommandlineJava	TokenNameIdentifier	 Commandline Java
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
vmCommand	TokenNameIdentifier	 vm Command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
)	TokenNameRPAREN	
vmCommand	TokenNameIdentifier	 vm Command
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
javaCommand	TokenNameIdentifier	 java Command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
)	TokenNameRPAREN	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
sysProperties	TokenNameIdentifier	 sys Properties
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SysProperties	TokenNameIdentifier	 Sys Properties
)	TokenNameRPAREN	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bootclasspath	TokenNameIdentifier	 bootclasspath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
bootclasspath	TokenNameIdentifier	 bootclasspath
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
bootclasspath	TokenNameIdentifier	 bootclasspath
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
assertions	TokenNameIdentifier	 assertions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
assertions	TokenNameIdentifier	 assertions
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Assertions	TokenNameIdentifier	 Assertions
)	TokenNameRPAREN	
assertions	TokenNameIdentifier	 assertions
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clear out the java arguments. */	TokenNameCOMMENT_JAVADOC	 Clear out the java arguments. 
public	TokenNamepublic	
void	TokenNamevoid	
clearJavaArgs	TokenNameIdentifier	 clear Java Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
javaCommand	TokenNameIdentifier	 java Command
.	TokenNameDOT	
clearArgs	TokenNameIdentifier	 clear Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether the classpath has been specified, and whether it shall * really be used or be nulled by build.sysclasspath. * @return true if the classpath is to be used. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Determine whether the classpath has been specified, and whether it shall really be used or be nulled by build.sysclasspath. @return true if the classpath is to be used. @since Ant 1.6 
public	TokenNamepublic	
boolean	TokenNameboolean	
haveClasspath	TokenNameIdentifier	 have Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
fullClasspath	TokenNameIdentifier	 full Classpath
=	TokenNameEQUAL	
classpath	TokenNameIdentifier	 classpath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fullClasspath	TokenNameIdentifier	 full Classpath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fullClasspath	TokenNameIdentifier	 full Classpath
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine whether the bootclasspath has been specified, and whether it * shall really be used (build.sysclasspath could be set or the VM may not * support it). * * @param log whether to log a warning if a bootclasspath has been * specified but will be ignored. * @return true if the bootclasspath is to be used. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Determine whether the bootclasspath has been specified, and whether it shall really be used (build.sysclasspath could be set or the VM may not support it). * @param log whether to log a warning if a bootclasspath has been specified but will be ignored. @return true if the bootclasspath is to be used. @since Ant 1.6 
protected	TokenNameprotected	
boolean	TokenNameboolean	
haveBootclasspath	TokenNameIdentifier	 have Bootclasspath
(	TokenNameLPAREN	
boolean	TokenNameboolean	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
calculateBootclasspath	TokenNameIdentifier	 calculate Bootclasspath
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate the bootclasspath based on the bootclasspath * specified, the build.sysclasspath and ant.build.clonevm magic * properties as well as the cloneVm attribute. * @param log whether to write messages to the log. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Calculate the bootclasspath based on the bootclasspath specified, the build.sysclasspath and ant.build.clonevm magic properties as well as the cloneVm attribute. @param log whether to write messages to the log. @since Ant 1.7 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
calculateBootclasspath	TokenNameIdentifier	 calculate Bootclasspath
(	TokenNameLPAREN	
boolean	TokenNameboolean	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vmVersion	TokenNameIdentifier	 vm Version
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bootclasspath	TokenNameIdentifier	 bootclasspath
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bootclasspath	TokenNameIdentifier	 bootclasspath
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Ignoring bootclasspath as "	TokenNameStringLiteral	Ignoring bootclasspath as 
+	TokenNamePLUS	
"the target VM doesn't support it."	TokenNameStringLiteral	the target VM doesn't support it.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
bootclasspath	TokenNameIdentifier	 bootclasspath
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// even with no user-supplied bootclasspath 	TokenNameCOMMENT_LINE	even with no user-supplied bootclasspath 
// build.sysclasspath could be set to something other than 	TokenNameCOMMENT_LINE	build.sysclasspath could be set to something other than 
// "ignore" and thus create one 	TokenNameCOMMENT_LINE	"ignore" and thus create one 
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
concatSystemBootClasspath	TokenNameIdentifier	 concat System Boot Classpath
(	TokenNameLPAREN	
isCloneVm	TokenNameIdentifier	 is Clone Vm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"last"	TokenNameStringLiteral	last
:	TokenNameCOLON	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out whether either of the cloneVm attribute or the magic property * ant.build.clonevm has been set. * @return <code>boolean</code>. * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Find out whether either of the cloneVm attribute or the magic property ant.build.clonevm has been set. @return <code>boolean</code>. @since 1.7 
private	TokenNameprivate	
boolean	TokenNameboolean	
isCloneVm	TokenNameIdentifier	 is Clone Vm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cloneVm	TokenNameIdentifier	 clone Vm
||	TokenNameOR_OR	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ant.build.clonevm"	TokenNameStringLiteral	ant.build.clonevm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

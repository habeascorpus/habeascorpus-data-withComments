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
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
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
/** * The preset definition task generates a new definition * based on a current definition with some attributes or * elements preset. * <pre> * &lt;presetdef name="my.javac"&gt; * &lt;javac deprecation="${deprecation}" debug="${debug}"/&gt; * &lt;/presetdef&gt; * &lt;my.javac srcdir="src" destdir="classes"/&gt; * </pre> * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 The preset definition task generates a new definition based on a current definition with some attributes or elements preset. <pre> &lt;presetdef name="my.javac"&gt; &lt;javac deprecation="${deprecation}" debug="${debug}"/&gt; &lt;/presetdef&gt; &lt;my.javac srcdir="src" destdir="classes"/&gt; </pre> * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
PreSetDef	TokenNameIdentifier	 Pre Set Def
extends	TokenNameextends	
AntlibDefinition	TokenNameIdentifier	 Antlib Definition
implements	TokenNameimplements	
TaskContainer	TokenNameIdentifier	 Task Container
{	TokenNameLBRACE	
private	TokenNameprivate	
UnknownElement	TokenNameIdentifier	 Unknown Element
nestedTask	TokenNameIdentifier	 nested Task
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Set the name of this definition. * @param name the name of the definition. */	TokenNameCOMMENT_JAVADOC	 Set the name of this definition. @param name the name of the definition. 
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
/** * Add a nested task to predefine attributes and elements on. * @param nestedTask Nested task/type to extend. */	TokenNameCOMMENT_JAVADOC	 Add a nested task to predefine attributes and elements on. @param nestedTask Nested task/type to extend. 
public	TokenNamepublic	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nestedTask	TokenNameIdentifier	 nested Task
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one nested element allowed"	TokenNameStringLiteral	Only one nested element allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
instanceof	TokenNameinstanceof	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"addTask called with a task that is not an unknown element"	TokenNameStringLiteral	addTask called with a task that is not an unknown element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nestedTask	TokenNameIdentifier	 nested Task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
nestedTask	TokenNameIdentifier	 nested Task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make a new definition. */	TokenNameCOMMENT_JAVADOC	 Make a new definition. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing nested element"	TokenNameStringLiteral	Missing nested element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Name not specified"	TokenNameStringLiteral	Name not specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ComponentHelper	TokenNameIdentifier	 Component Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
ComponentHelper	TokenNameIdentifier	 Component Helper
.	TokenNameDOT	
getComponentHelper	TokenNameIdentifier	 get Component Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
componentName	TokenNameIdentifier	 component Name
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
nestedTask	TokenNameIdentifier	 nested Task
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
nestedTask	TokenNameIdentifier	 nested Task
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getDefinition	TokenNameIdentifier	 get Definition
(	TokenNameLPAREN	
componentName	TokenNameIdentifier	 component Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to find typedef "	TokenNameStringLiteral	Unable to find typedef 
+	TokenNamePLUS	
componentName	TokenNameIdentifier	 component Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
newDef	TokenNameIdentifier	 new Def
=	TokenNameEQUAL	
new	TokenNamenew	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
,	TokenNameCOMMA	
nestedTask	TokenNameIdentifier	 nested Task
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newDef	TokenNameIdentifier	 new Def
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
addDataTypeDefinition	TokenNameIdentifier	 add Data Type Definition
(	TokenNameLPAREN	
newDef	TokenNameIdentifier	 new Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"defining preset "	TokenNameStringLiteral	defining preset 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class contains the unknown element and the object * that is predefined. * @see AntTypeDefinition */	TokenNameCOMMENT_JAVADOC	 This class contains the unknown element and the object that is predefined. @see AntTypeDefinition 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
extends	TokenNameextends	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
{	TokenNameLBRACE	
private	TokenNameprivate	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnknownElement	TokenNameIdentifier	 Unknown Element
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
/** * Creates a new <code>PresetDefinition</code> instance. * * @param parent The parent of this predefinition. * @param el The predefined attributes, nested elements and text. */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>PresetDefinition</code> instance. * @param parent The parent of this predefinition. @param el The predefined attributes, nested elements and text. 
public	TokenNamepublic	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
(	TokenNameLPAREN	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
UnknownElement	TokenNameIdentifier	 Unknown Element
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
applyPreSet	TokenNameIdentifier	 apply Pre Set
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
el	TokenNameIdentifier	 el
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override so that it is not allowed. * * @param clazz a <code>Class</code> value. */	TokenNameCOMMENT_JAVADOC	 Override so that it is not allowed. * @param clazz a <code>Class</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Not supported"	TokenNameStringLiteral	Not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override so that it is not allowed. * * @param className a <code>String</code> value. */	TokenNameCOMMENT_JAVADOC	 Override so that it is not allowed. * @param className a <code>String</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Not supported"	TokenNameStringLiteral	Not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classname of the definition. * @return the name of the class of this definition. */	TokenNameCOMMENT_JAVADOC	 Get the classname of the definition. @return the name of the class of this definition. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the adapter class for this definition. * NOT Supported * @param adapterClass the adapterClass. */	TokenNameCOMMENT_JAVADOC	 Set the adapter class for this definition. NOT Supported @param adapterClass the adapterClass. 
public	TokenNamepublic	
void	TokenNamevoid	
setAdapterClass	TokenNameIdentifier	 set Adapter Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
adapterClass	TokenNameIdentifier	 adapter Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Not supported"	TokenNameStringLiteral	Not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the assignable class for this definition. * NOT SUPPORTED * @param adaptToClass the assignable class. */	TokenNameCOMMENT_JAVADOC	 Set the assignable class for this definition. NOT SUPPORTED @param adaptToClass the assignable class. 
public	TokenNamepublic	
void	TokenNamevoid	
setAdaptToClass	TokenNameIdentifier	 set Adapt To Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
adaptToClass	TokenNameIdentifier	 adapt To Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Not supported"	TokenNameStringLiteral	Not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classloader to use to create an instance * of the definition. * NOT SUPPORTED * @param classLoader the classLoader. */	TokenNameCOMMENT_JAVADOC	 Set the classloader to use to create an instance of the definition. NOT SUPPORTED @param classLoader the classLoader. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassLoader	TokenNameIdentifier	 set Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Not supported"	TokenNameStringLiteral	Not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the classloader for this definition. * @return the classloader for this definition. */	TokenNameCOMMENT_JAVADOC	 Get the classloader for this definition. @return the classloader for this definition. 
public	TokenNamepublic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the exposed class for this definition. * @param project the current project. * @return the exposed class. */	TokenNameCOMMENT_JAVADOC	 Get the exposed class for this definition. @param project the current project. @return the exposed class. 
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getExposedClass	TokenNameIdentifier	 get Exposed Class
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getExposedClass	TokenNameIdentifier	 get Exposed Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the definition class. * @param project the current project. * @return the type of the definition. */	TokenNameCOMMENT_JAVADOC	 Get the definition class. @param project the current project. @return the type of the definition. 
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the attributes are correct. * @param project the current project. */	TokenNameCOMMENT_JAVADOC	 Check if the attributes are correct. @param project the current project. 
public	TokenNamepublic	
void	TokenNamevoid	
checkClass	TokenNameIdentifier	 check Class
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
checkClass	TokenNameIdentifier	 check Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an instance of the definition. The instance may be wrapped * in a proxy class. This is a special version of create for * IntrospectionHelper and UnknownElement. * @param project the current project. * @return the created object. */	TokenNameCOMMENT_JAVADOC	 Create an instance of the definition. The instance may be wrapped in a proxy class. This is a special version of create for IntrospectionHelper and UnknownElement. @param project the current project. @return the created object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the preset values. * @return the predefined attributes, elements and text as * an UnknownElement. */	TokenNameCOMMENT_JAVADOC	 Get the preset values. @return the predefined attributes, elements and text as an UnknownElement. 
public	TokenNamepublic	
UnknownElement	TokenNameIdentifier	 Unknown Element
getPreSets	TokenNameIdentifier	 get Pre Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fake create an object, used by IntrospectionHelper and UnknownElement * to see that this is a predefined object. * * @param project the current project. * @return this object. */	TokenNameCOMMENT_JAVADOC	 Fake create an object, used by IntrospectionHelper and UnknownElement to see that this is a predefined object. * @param project the current project. @return this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equality method for this definition. * * @param other another definition. * @param project the current project. * @return true if the definitions are the same. */	TokenNameCOMMENT_JAVADOC	 Equality method for this definition. * @param other another definition. @param project the current project. @return true if the definitions are the same. 
public	TokenNamepublic	
boolean	TokenNameboolean	
sameDefinition	TokenNameIdentifier	 same Definition
(	TokenNameLPAREN	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
sameDefinition	TokenNameIdentifier	 same Definition
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
similar	TokenNameIdentifier	 similar
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similar method for this definition. * * @param other another definition. * @param project the current project. * @return true if the definitions are similar. */	TokenNameCOMMENT_JAVADOC	 Similar method for this definition. * @param other another definition. @param project the current project. @return true if the definitions are similar. 
public	TokenNamepublic	
boolean	TokenNameboolean	
similarDefinition	TokenNameIdentifier	 similar Definition
(	TokenNameLPAREN	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
similarDefinition	TokenNameIdentifier	 similar Definition
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
similar	TokenNameIdentifier	 similar
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

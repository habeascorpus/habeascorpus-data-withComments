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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
/** * This class contains all the information * on a particular ant type, * the classname, adaptor and the class * it should be assignable from. * This type replaces the task/datatype split * of pre ant 1.6. * */	TokenNameCOMMENT_JAVADOC	 This class contains all the information on a particular ant type, the classname, adaptor and the class it should be assignable from. This type replaces the task/datatype split of pre ant 1.6. 
public	TokenNamepublic	
class	TokenNameclass	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
adapterClass	TokenNameIdentifier	 adapter Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
adaptToClass	TokenNameIdentifier	 adapt To Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLoader	TokenNameIdentifier	 Class Loader
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
restrict	TokenNameIdentifier	 restrict
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the restrict attribute. * @param restrict the value to set. */	TokenNameCOMMENT_JAVADOC	 Set the restrict attribute. @param restrict the value to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setRestrict	TokenNameIdentifier	 set Restrict
(	TokenNameLPAREN	
boolean	TokenNameboolean	
restrict	TokenNameIdentifier	 restrict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
=	TokenNameEQUAL	
restrict	TokenNameIdentifier	 restrict
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the restrict attribute. * @return the restrict attribute. */	TokenNameCOMMENT_JAVADOC	 Get the restrict attribute. @return the restrict attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRestrict	TokenNameIdentifier	 is Restrict
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
restrict	TokenNameIdentifier	 restrict
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the definition's name. * @param name the name of the definition. */	TokenNameCOMMENT_JAVADOC	 Set the definition's name. @param name the name of the definition. 
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
/** * Return the definition's name. * @return the name of the definition. */	TokenNameCOMMENT_JAVADOC	 Return the definition's name. @return the name of the definition. 
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
/** * Set the class of the definition. * As a side-effect may set the classloader and classname. * @param clazz the class of this definition. */	TokenNameCOMMENT_JAVADOC	 Set the class of the definition. As a side-effect may set the classloader and classname. @param clazz the class of this definition. 
public	TokenNamepublic	
void	TokenNamevoid	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classLoader	TokenNameIdentifier	 class Loader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classname of the definition. * @param className the classname of this definition. */	TokenNameCOMMENT_JAVADOC	 Set the classname of the definition. @param className the classname of this definition. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
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
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the adapter class for this definition. * This class is used to adapt the definitions class if * required. * @param adapterClass the adapterClass. */	TokenNameCOMMENT_JAVADOC	 Set the adapter class for this definition. This class is used to adapt the definitions class if required. @param adapterClass the adapterClass. 
public	TokenNamepublic	
void	TokenNamevoid	
setAdapterClass	TokenNameIdentifier	 set Adapter Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
adapterClass	TokenNameIdentifier	 adapter Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
adapterClass	TokenNameIdentifier	 adapter Class
=	TokenNameEQUAL	
adapterClass	TokenNameIdentifier	 adapter Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the assignable class for this definition. * @param adaptToClass the assignable class. */	TokenNameCOMMENT_JAVADOC	 Set the assignable class for this definition. @param adaptToClass the assignable class. 
public	TokenNamepublic	
void	TokenNamevoid	
setAdaptToClass	TokenNameIdentifier	 set Adapt To Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
adaptToClass	TokenNameIdentifier	 adapt To Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
adaptToClass	TokenNameIdentifier	 adapt To Class
=	TokenNameEQUAL	
adaptToClass	TokenNameIdentifier	 adapt To Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the classloader to use to create an instance * of the definition. * @param classLoader the ClassLoader. */	TokenNameCOMMENT_JAVADOC	 Set the classloader to use to create an instance of the definition. @param classLoader the ClassLoader. 
public	TokenNamepublic	
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
/** * Get the classloader for this definition. * @return the classloader for this definition. */	TokenNameCOMMENT_JAVADOC	 Get the classloader for this definition. @return the classloader for this definition. 
public	TokenNamepublic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classLoader	TokenNameIdentifier	 class Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the exposed class for this * definition. This will be a proxy class * (adapted class) if there is an adapter * class and the definition class is not * assignable from the assignable class. * @param project the current project. * @return the exposed class - may return null if unable to load the class */	TokenNameCOMMENT_JAVADOC	 Get the exposed class for this definition. This will be a proxy class (adapted class) if there is an adapter class and the definition class is not assignable from the assignable class. @param project the current project. @return the exposed class - may return null if unable to load the class 
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getExposedClass	TokenNameIdentifier	 get Exposed Class
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
adaptToClass	TokenNameIdentifier	 adapt To Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
adaptToClass	TokenNameIdentifier	 adapt To Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
adapterClass	TokenNameIdentifier	 adapter Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
:	TokenNameCOLON	
adapterClass	TokenNameIdentifier	 adapter Class
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
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
innerGetTypeClass	TokenNameIdentifier	 inner Get Type Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
ncdfe	TokenNameIdentifier	 ncdfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Could not load a dependent class ("	TokenNameStringLiteral	Could not load a dependent class (
+	TokenNamePLUS	
ncdfe	TokenNameIdentifier	 ncdfe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") for type "	TokenNameStringLiteral	) for type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Could not load class ("	TokenNameStringLiteral	Could not load class (
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
") for type "	TokenNameStringLiteral	) for type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try and load a class, with no attempt to catch any fault. * @return the class that implements this component * @throws ClassNotFoundException if the class cannot be found. * @throws NoClassDefFoundError if the there is an error * finding the class. */	TokenNameCOMMENT_JAVADOC	 Try and load a class, with no attempt to catch any fault. @return the class that implements this component @throws ClassNotFoundException if the class cannot be found. @throws NoClassDefFoundError if the there is an error finding the class. 
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
innerGetTypeClass	TokenNameIdentifier	 inner Get Type Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classLoader	TokenNameIdentifier	 class Loader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
classLoader	TokenNameIdentifier	 class Loader
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an instance of the definition. * The instance may be wrapped in a proxy class. * @param project the current project. * @return the created object. */	TokenNameCOMMENT_JAVADOC	 Create an instance of the definition. The instance may be wrapped in a proxy class. @param project the current project. @return the created object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
icreate	TokenNameIdentifier	 icreate
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a component object based on * its definition. * @return the component as an <code>Object</code>. */	TokenNameCOMMENT_JAVADOC	 Create a component object based on its definition. @return the component as an <code>Object</code>. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
icreate	TokenNameIdentifier	 icreate
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
createAndSet	TokenNameIdentifier	 create And Set
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
adapterClass	TokenNameIdentifier	 adapter Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
adaptToClass	TokenNameIdentifier	 adapt To Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
adaptToClass	TokenNameIdentifier	 adapt To Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TypeAdapter	TokenNameIdentifier	 Type Adapter
adapterObject	TokenNameIdentifier	 adapter Object
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
createAndSet	TokenNameIdentifier	 create And Set
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
adapterClass	TokenNameIdentifier	 adapter Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
adapterObject	TokenNameIdentifier	 adapter Object
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
adapterObject	TokenNameIdentifier	 adapter Object
.	TokenNameDOT	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
adapterObject	TokenNameIdentifier	 adapter Object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the attributes are correct. * <dl> * <li>if the class can be created.</li> * <li>if an adapter class can be created</li> * <li>if the type is assignable from adapto</li> * <li>if the type can be used with the adapter class</li> * </dl> * @param project the current project. */	TokenNameCOMMENT_JAVADOC	 Checks if the attributes are correct. <dl> <li>if the class can be created.</li> <li>if an adapter class can be created</li> <li>if the type is assignable from adapto</li> <li>if the type can be used with the adapter class</li> </dl> @param project the current project. 
public	TokenNamepublic	
void	TokenNamevoid	
checkClass	TokenNameIdentifier	 check Class
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to create class for "	TokenNameStringLiteral	Unable to create class for 
+	TokenNamePLUS	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check adapter 	TokenNameCOMMENT_LINE	check adapter 
if	TokenNameif	
(	TokenNameLPAREN	
adapterClass	TokenNameIdentifier	 adapter Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
adaptToClass	TokenNameIdentifier	 adapt To Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
adaptToClass	TokenNameIdentifier	 adapt To Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TypeAdapter	TokenNameIdentifier	 Type Adapter
adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
createAndSet	TokenNameIdentifier	 create And Set
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
adapterClass	TokenNameIdentifier	 adapter Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
adapter	TokenNameIdentifier	 adapter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to create adapter object"	TokenNameStringLiteral	Unable to create adapter object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
checkProxyClass	TokenNameIdentifier	 check Proxy Class
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the constructor of the definition * and invoke it. * @return the instantiated <code>Object</code>. */	TokenNameCOMMENT_JAVADOC	 Get the constructor of the definition and invoke it. @return the instantiated <code>Object</code>. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
createAndSet	TokenNameIdentifier	 create And Set
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
innerCreateAndSet	TokenNameIdentifier	 inner Create And Set
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not create type "	TokenNameStringLiteral	Could not create type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
ncdfe	TokenNameIdentifier	 ncdfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"Type "	TokenNameStringLiteral	Type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": A class needed by class "	TokenNameStringLiteral	: A class needed by class 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" cannot be found: "	TokenNameStringLiteral	 cannot be found: 
+	TokenNamePLUS	
ncdfe	TokenNameIdentifier	 ncdfe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
ncdfe	TokenNameIdentifier	 ncdfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not create type "	TokenNameStringLiteral	Could not create type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" as the class "	TokenNameStringLiteral	 as the class 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" has no compatible constructor"	TokenNameStringLiteral	 has no compatible constructor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not create type "	TokenNameStringLiteral	Could not create type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" as the class "	TokenNameStringLiteral	 as the class 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" is abstract"	TokenNameStringLiteral	 is abstract
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not create type "	TokenNameStringLiteral	Could not create type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" as the constructor "	TokenNameStringLiteral	 as the constructor 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" is not accessible"	TokenNameStringLiteral	 is not accessible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not create type "	TokenNameStringLiteral	Could not create type 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" due to "	TokenNameStringLiteral	 due to 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Inner implementation of the {@link #createAndSet(Project, Class)} logic, with no * exception catching * @param newclass class to create * @param project the project to use * @return a newly constructed and bound instance. * @throws NoSuchMethodException no good construtor. * @throws InstantiationException cannot initialize the object. * @throws IllegalAccessException cannot access the object. * @throws InvocationTargetException error in invocation. */	TokenNameCOMMENT_JAVADOC	 Inner implementation of the {@link #createAndSet(Project, Class)} logic, with no exception catching @param newclass class to create @param project the project to use @return a newly constructed and bound instance. @throws NoSuchMethodException no good construtor. @throws InstantiationException cannot initialize the object. @throws IllegalAccessException cannot access the object. @throws InvocationTargetException error in invocation. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
innerCreateAndSet	TokenNameIdentifier	 inner Create And Set
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
newclass	TokenNameIdentifier	 newclass
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
,	TokenNameCOMMA	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
{	TokenNameLBRACE	
Constructor	TokenNameIdentifier	 Constructor
ctor	TokenNameIdentifier	 ctor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
noArg	TokenNameIdentifier	 no Arg
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// DataType can have a "no arg" constructor or take a single 	TokenNameCOMMENT_LINE	DataType can have a "no arg" constructor or take a single 
// Project argument. 	TokenNameCOMMENT_LINE	Project argument. 
try	TokenNametry	
{	TokenNameLBRACE	
ctor	TokenNameIdentifier	 ctor
=	TokenNameEQUAL	
newclass	TokenNameIdentifier	 newclass
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
noArg	TokenNameIdentifier	 no Arg
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nse	TokenNameIdentifier	 nse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//can throw the same exception, if there is no this(Project) ctor. 	TokenNameCOMMENT_LINE	can throw the same exception, if there is no this(Project) ctor. 
ctor	TokenNameIdentifier	 ctor
=	TokenNameEQUAL	
newclass	TokenNameIdentifier	 newclass
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
noArg	TokenNameIdentifier	 no Arg
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now we instantiate 	TokenNameCOMMENT_LINE	now we instantiate 
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
ctor	TokenNameIdentifier	 ctor
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
noArg	TokenNameIdentifier	 no Arg
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//set up project references. 	TokenNameCOMMENT_LINE	set up project references. 
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProjectReference	TokenNameIdentifier	 set Project Reference
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equality method for this definition (assumes the names are the same). * * @param other another definition. * @param project the project the definition. * @return true if the definitions are the same. */	TokenNameCOMMENT_JAVADOC	 Equality method for this definition (assumes the names are the same). * @param other another definition. @param project the project the definition. @return true if the definitions are the same. 
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
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getTypeClass	TokenNameIdentifier	 get Type Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getExposedClass	TokenNameIdentifier	 get Exposed Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getExposedClass	TokenNameIdentifier	 get Exposed Class
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
==	TokenNameEQUAL_EQUAL	
restrict	TokenNameIdentifier	 restrict
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
adapterClass	TokenNameIdentifier	 adapter Class
==	TokenNameEQUAL_EQUAL	
adapterClass	TokenNameIdentifier	 adapter Class
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
adaptToClass	TokenNameIdentifier	 adapt To Class
==	TokenNameEQUAL_EQUAL	
adaptToClass	TokenNameIdentifier	 adapt To Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similar definition; * used to compare two definitions defined twice with the same * name and the same types. * The classloader may be different but have the same * path so #sameDefinition cannot * be used. * @param other the definition to compare to. * @param project the current project. * @return true if the definitions are the same. */	TokenNameCOMMENT_JAVADOC	 Similar definition; used to compare two definitions defined twice with the same name and the same types. The classloader may be different but have the same path so #sameDefinition cannot be used. @param other the definition to compare to. @param project the current project. @return true if the definitions are the same. 
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
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
extractClassname	TokenNameIdentifier	 extract Classname
(	TokenNameLPAREN	
adapterClass	TokenNameIdentifier	 adapter Class
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
extractClassname	TokenNameIdentifier	 extract Classname
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
adapterClass	TokenNameIdentifier	 adapter Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
extractClassname	TokenNameIdentifier	 extract Classname
(	TokenNameLPAREN	
adaptToClass	TokenNameIdentifier	 adapt To Class
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
extractClassname	TokenNameIdentifier	 extract Classname
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
adaptToClass	TokenNameIdentifier	 adapt To Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
restrict	TokenNameIdentifier	 restrict
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
restrict	TokenNameIdentifier	 restrict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// all the names are the same: check if the class path of the loader 	TokenNameCOMMENT_LINE	all the names are the same: check if the class path of the loader 
// is the same 	TokenNameCOMMENT_LINE	is the same 
ClassLoader	TokenNameIdentifier	 Class Loader
oldLoader	TokenNameIdentifier	 old Loader
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
newLoader	TokenNameIdentifier	 new Loader
=	TokenNameEQUAL	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldLoader	TokenNameIdentifier	 old Loader
==	TokenNameEQUAL_EQUAL	
newLoader	TokenNameIdentifier	 new Loader
||	TokenNameOR_OR	
(	TokenNameLPAREN	
oldLoader	TokenNameIdentifier	 old Loader
instanceof	TokenNameinstanceof	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
&&	TokenNameAND_AND	
newLoader	TokenNameIdentifier	 new Loader
instanceof	TokenNameinstanceof	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
oldLoader	TokenNameIdentifier	 old Loader
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
)	TokenNameRPAREN	
newLoader	TokenNameIdentifier	 new Loader
)	TokenNameRPAREN	
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
extractClassname	TokenNameIdentifier	 extract Classname
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"<null>"	TokenNameStringLiteral	<null>
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

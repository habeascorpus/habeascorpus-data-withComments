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
util	TokenNameIdentifier	 util
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
MagicNames	TokenNameIdentifier	 Magic Names
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
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/** * Offers some helper methods on the Path structure in ant. * * <p>The basic idea behind this utility class is to use it from inside the * different Ant objects (and user defined objects) that need classLoading * for their operation. * Normally those would have a setClasspathRef() {for the @classpathref} * and/or a createClasspath() {for the nested &lt;classpath&gt;} * Typically one would have in your Ant Task or DataType</p> * * <pre><code> * ClasspathUtils.Delegate cpDelegate; * * public void init() { * this.cpDelegate = ClasspathUtils.getDelegate(this); * super.init(); * } * * public void setClasspathRef(Reference r) { * this.cpDelegate.setClasspathRef(r); * } * * public Path createClasspath() { * return this.cpDelegate.createClasspath(); * } * * public void setClassname(String fqcn) { * this.cpDelegate.setClassname(fqcn); * } * </code></pre> * * <p>At execution time, when you actually need the classloading * you can just:</p> * * <pre><code> * Object o = this.cpDelegate.newInstance(); * </code></pre> * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Offers some helper methods on the Path structure in ant. * <p>The basic idea behind this utility class is to use it from inside the different Ant objects (and user defined objects) that need classLoading for their operation. Normally those would have a setClasspathRef() {for the @classpathref} and/or a createClasspath() {for the nested &lt;classpath&gt;} Typically one would have in your Ant Task or DataType</p> * <pre><code> ClasspathUtils.Delegate cpDelegate; * public void init() { this.cpDelegate = ClasspathUtils.getDelegate(this); super.init(); } * public void setClasspathRef(Reference r) { this.cpDelegate.setClasspathRef(r); } * public Path createClasspath() { return this.cpDelegate.createClasspath(); } * public void setClassname(String fqcn) { this.cpDelegate.setClassname(fqcn); } </code></pre> * <p>At execution time, when you actually need the classloading you can just:</p> * <pre><code> Object o = this.cpDelegate.newInstance(); </code></pre> * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
{	TokenNameLBRACE	
/** * Name of the magic property that controls classloader reuse in Ant 1.4. */	TokenNameCOMMENT_JAVADOC	 Name of the magic property that controls classloader reuse in Ant 1.4. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REUSE_LOADER_REF	TokenNameIdentifier	 REUSE  LOADER  REF
=	TokenNameEQUAL	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_CLASSPATH_REUSE_LOADER	TokenNameIdentifier	 REFID  CLASSPATH  REUSE  LOADER
;	TokenNameSEMICOLON	
/** * Convenience overloaded version of {@link * #getClassLoaderForPath(Project, Reference, boolean)}. * * <p>Assumes the logical 'false' for the reverseLoader.</p> * * @param p the project * @param ref the reference * @return The class loader */	TokenNameCOMMENT_JAVADOC	 Convenience overloaded version of {@link #getClassLoaderForPath(Project, Reference, boolean)}. * <p>Assumes the logical 'false' for the reverseLoader.</p> * @param p the project @param ref the reference @return The class loader 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience overloaded version of {@link #getClassLoaderForPath(Project, Path, * String, boolean)}. * * <p>Delegates to the other one after extracting the referenced * Path from the Project. This checks also that the passed * Reference is pointing to a Path all right.</p> * @param p current Ant project * @param ref Reference to Path structure * @param reverseLoader if set to true this new loader will take * precedence over its parent (which is contra the regular * classloader behaviour) * @return The class loader */	TokenNameCOMMENT_JAVADOC	 Convenience overloaded version of {@link #getClassLoaderForPath(Project, Path, String, boolean)}. * <p>Delegates to the other one after extracting the referenced Path from the Project. This checks also that the passed Reference is pointing to a Path all right.</p> @param p current Ant project @param ref Reference to Path structure @param reverseLoader if set to true this new loader will take precedence over its parent (which is contra the regular classloader behaviour) @return The class loader 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Reference	TokenNameIdentifier	 Reference
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pathId	TokenNameIdentifier	 path Id
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
pathId	TokenNameIdentifier	 path Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
instanceof	TokenNameinstanceof	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The specified classpathref "	TokenNameStringLiteral	The specified classpathref 
+	TokenNamePLUS	
pathId	TokenNameIdentifier	 path Id
+	TokenNamePLUS	
" does not reference a Path."	TokenNameStringLiteral	 does not reference a Path.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
loaderId	TokenNameIdentifier	 loader Id
=	TokenNameEQUAL	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_CLASSPATH_LOADER_PREFIX	TokenNameIdentifier	 REFID  CLASSPATH  LOADER  PREFIX
+	TokenNamePLUS	
pathId	TokenNameIdentifier	 path Id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
loaderId	TokenNameIdentifier	 loader Id
,	TokenNameCOMMA	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience overloaded version of {@link * #getClassLoaderForPath(Project, Path, String, boolean)}. * * <p>Assumes the logical 'false' for the reverseLoader.</p> * * @param p current Ant project * @param path the path * @param loaderId the loader id string * @return The class loader */	TokenNameCOMMENT_JAVADOC	 Convenience overloaded version of {@link #getClassLoaderForPath(Project, Path, String, boolean)}. * <p>Assumes the logical 'false' for the reverseLoader.</p> * @param p current Ant project @param path the path @param loaderId the loader id string @return The class loader 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
loaderId	TokenNameIdentifier	 loader Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
loaderId	TokenNameIdentifier	 loader Id
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience overloaded version of {@link * #getClassLoaderForPath(Project, Path, String, boolean, boolean)}. * * <p>Sets value for 'reuseLoader' to true if the magic property * has been set.</p> * * @param p the project * @param path the path * @param loaderId the loader id string * @param reverseLoader if set to true this new loader will take * precedence over its parent (which is contra the regular * classloader behaviour) * @return The class loader */	TokenNameCOMMENT_JAVADOC	 Convenience overloaded version of {@link #getClassLoaderForPath(Project, Path, String, boolean, boolean)}. * <p>Sets value for 'reuseLoader' to true if the magic property has been set.</p> * @param p the project @param path the path @param loaderId the loader id string @param reverseLoader if set to true this new loader will take precedence over its parent (which is contra the regular classloader behaviour) @return The class loader 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
loaderId	TokenNameIdentifier	 loader Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
loaderId	TokenNameIdentifier	 loader Id
,	TokenNameCOMMA	
reverseLoader	TokenNameIdentifier	 reverse Loader
,	TokenNameCOMMA	
isMagicPropertySet	TokenNameIdentifier	 is Magic Property Set
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a classloader that loads classes from the classpath * defined in the path argument. * * <p>Based on the setting of the magic property * 'ant.reuse.loader' this will try to reuse the previously * created loader with that id, and of course store it there upon * creation.</p> * @param p Ant Project where the handled components are living in. * @param path Path object to be used as classpath for this classloader * @param loaderId identification for this Loader, * @param reverseLoader if set to true this new loader will take * precedence over its parent (which is contra the regular * classloader behaviour) * @param reuseLoader if true reuse the loader if it is found * @return ClassLoader that uses the Path as its classpath. */	TokenNameCOMMENT_JAVADOC	 Gets a classloader that loads classes from the classpath defined in the path argument. * <p>Based on the setting of the magic property 'ant.reuse.loader' this will try to reuse the previously created loader with that id, and of course store it there upon creation.</p> @param p Ant Project where the handled components are living in. @param path Path object to be used as classpath for this classloader @param loaderId identification for this Loader, @param reverseLoader if set to true this new loader will take precedence over its parent (which is contra the regular classloader behaviour) @param reuseLoader if true reuse the loader if it is found @return ClassLoader that uses the Path as its classpath. 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
loaderId	TokenNameIdentifier	 loader Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reuseLoader	TokenNameIdentifier	 reuse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// magic property 	TokenNameCOMMENT_LINE	magic property 
if	TokenNameif	
(	TokenNameLPAREN	
loaderId	TokenNameIdentifier	 loader Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
reuseLoader	TokenNameIdentifier	 reuse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
reusedLoader	TokenNameIdentifier	 reused Loader
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
loaderId	TokenNameIdentifier	 loader Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reusedLoader	TokenNameIdentifier	 reused Loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
reusedLoader	TokenNameIdentifier	 reused Loader
instanceof	TokenNameinstanceof	
ClassLoader	TokenNameIdentifier	 Class Loader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The specified loader id "	TokenNameStringLiteral	The specified loader id 
+	TokenNamePLUS	
loaderId	TokenNameIdentifier	 loader Id
+	TokenNamePLUS	
" does not reference a class loader"	TokenNameStringLiteral	 does not reference a class loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
)	TokenNameRPAREN	
reusedLoader	TokenNameIdentifier	 reused Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
getUniqueClassLoaderForPath	TokenNameIdentifier	 get Unique Class Loader For Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loaderId	TokenNameIdentifier	 loader Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
reuseLoader	TokenNameIdentifier	 reuse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
loaderId	TokenNameIdentifier	 loader Id
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cl	TokenNameIdentifier	 cl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a fresh, different, previously unused classloader that uses the * passed path as its classpath. * * <p>This method completely ignores the ant.reuse.loader magic * property and should be used with caution.</p> * @param p Ant Project where the handled components are living in. * @param path the classpath for this loader * @param reverseLoader if set to true this new loader will take * precedence over its parent (which is contra the regular * classloader behaviour) * @return The fresh, different, previously unused class loader. */	TokenNameCOMMENT_JAVADOC	 Gets a fresh, different, previously unused classloader that uses the passed path as its classpath. * <p>This method completely ignores the ant.reuse.loader magic property and should be used with caution.</p> @param p Ant Project where the handled components are living in. @param path the classpath for this loader @param reverseLoader if set to true this new loader will take precedence over its parent (which is contra the regular classloader behaviour) @return The fresh, different, previously unused class loader. 
public	TokenNamepublic	
static	TokenNamestatic	
ClassLoader	TokenNameIdentifier	 Class Loader
getUniqueClassLoaderForPath	TokenNameIdentifier	 get Unique Class Loader For Path
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
setParentFirst	TokenNameIdentifier	 set Parent First
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
addJavaLibraries	TokenNameIdentifier	 add Java Libraries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
acl	TokenNameIdentifier	 acl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a fresh object instance of the specified classname. * * <p> This uses the userDefinedLoader to load the specified class, * and then makes an instance using the default no-argument constructor. * </p> * * @param className the full qualified class name to load. * @param userDefinedLoader the classloader to use. * @return The fresh object instance * @throws BuildException when loading or instantiation failed. */	TokenNameCOMMENT_JAVADOC	 Creates a fresh object instance of the specified classname. * <p> This uses the userDefinedLoader to load the specified class, and then makes an instance using the default no-argument constructor. </p> * @param className the full qualified class name to load. @param userDefinedLoader the classloader to use. @return The fresh object instance @throws BuildException when loading or instantiation failed. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
userDefinedLoader	TokenNameIdentifier	 user Defined Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
userDefinedLoader	TokenNameIdentifier	 user Defined Loader
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a fresh object instance of the specified classname. * * <p> This uses the userDefinedLoader to load the specified class, * and then makes an instance using the default no-argument constructor. * </p> * * @param className the full qualified class name to load. * @param userDefinedLoader the classloader to use. * @param expectedType the Class that the result should be assignment * compatible with. (No ClassCastException will be thrown in case * the result of this method is casted to the expectedType) * @return The fresh object instance * @throws BuildException when loading or instantiation failed. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Creates a fresh object instance of the specified classname. * <p> This uses the userDefinedLoader to load the specified class, and then makes an instance using the default no-argument constructor. </p> * @param className the full qualified class name to load. @param userDefinedLoader the classloader to use. @param expectedType the Class that the result should be assignment compatible with. (No ClassCastException will be thrown in case the result of this method is casted to the expectedType) @return The fresh object instance @throws BuildException when loading or instantiation failed. @since Ant 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
userDefinedLoader	TokenNameIdentifier	 user Defined Loader
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
expectedType	TokenNameIdentifier	 expected Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
userDefinedLoader	TokenNameIdentifier	 user Defined Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
expectedType	TokenNameIdentifier	 expected Type
.	TokenNameDOT	
isInstance	TokenNameIdentifier	 is Instance
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Class of unexpected Type: "	TokenNameStringLiteral	Class of unexpected Type: 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" expected :"	TokenNameStringLiteral	 expected :
+	TokenNamePLUS	
expectedType	TokenNameIdentifier	 expected Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Class not found: "	TokenNameStringLiteral	Class not found: 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not instantiate "	TokenNameStringLiteral	Could not instantiate 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
". Specified class should have a no "	TokenNameStringLiteral	. Specified class should have a no 
+	TokenNamePLUS	
"argument constructor."	TokenNameStringLiteral	argument constructor.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
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
"Could not instantiate "	TokenNameStringLiteral	Could not instantiate 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
". Specified class should have a "	TokenNameStringLiteral	. Specified class should have a 
+	TokenNamePLUS	
"public constructor."	TokenNameStringLiteral	public constructor.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LinkageError	TokenNameIdentifier	 Linkage Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Class "	TokenNameStringLiteral	Class 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" could not be loaded because of an invalid dependency."	TokenNameStringLiteral	 could not be loaded because of an invalid dependency.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Obtains a delegate that helps out with classic classpath configuration. * * @param component your projectComponent that needs the assistence * @return the helper, delegate. * @see ClasspathUtils.Delegate */	TokenNameCOMMENT_JAVADOC	 Obtains a delegate that helps out with classic classpath configuration. * @param component your projectComponent that needs the assistence @return the helper, delegate. @see ClasspathUtils.Delegate 
public	TokenNamepublic	
static	TokenNamestatic	
Delegate	TokenNameIdentifier	 Delegate
getDelegate	TokenNameIdentifier	 get Delegate
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Delegate	TokenNameIdentifier	 Delegate
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks for the magic property that enables class loader reuse * for <taskdef> and <typedef> in Ant 1.5 and earlier. */	TokenNameCOMMENT_JAVADOC	 Checks for the magic property that enables class loader reuse for <taskdef> and <typedef> in Ant 1.5 and earlier. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isMagicPropertySet	TokenNameIdentifier	 is Magic Property Set
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
REUSE_LOADER_REF	TokenNameIdentifier	 REUSE  LOADER  REF
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegate that helps out any specific ProjectComponent that needs * dynamic classloading. * * <p>Ant ProjectComponents that need a to be able to dynamically load * Classes and instantiate them often expose the following ant syntax * sugar: </p> * * <ul><li> nested &lt;classpath&gt; </li> * <li> attribute @classpathref </li> * <li> attribute @classname </li></ul> * * <p> This class functions as a delegate handling the configuration * issues for this recurring pattern. Its usage pattern, as the name * suggests, is delegation rather than inheritance. </p> * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Delegate that helps out any specific ProjectComponent that needs dynamic classloading. * <p>Ant ProjectComponents that need a to be able to dynamically load Classes and instantiate them often expose the following ant syntax sugar: </p> * <ul><li> nested &lt;classpath&gt; </li> <li> attribute @classpathref </li> <li> attribute @classname </li></ul> * <p> This class functions as a delegate handling the configuration issues for this recurring pattern. Its usage pattern, as the name suggests, is delegation rather than inheritance. </p> * @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Delegate	TokenNameIdentifier	 Delegate
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ProjectComponent	TokenNameIdentifier	 Project Component
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classpathId	TokenNameIdentifier	 classpath Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
loaderId	TokenNameIdentifier	 loader Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Construct a Delegate * @param component the ProjectComponent this delegate is for. */	TokenNameCOMMENT_JAVADOC	 Construct a Delegate @param component the ProjectComponent this delegate is for. 
Delegate	TokenNameIdentifier	 Delegate
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is a Delegate method handling the @classpath attribute. * * <p>This attribute can set a path to add to the classpath.</p> * * @param classpath the path to use for the classpath. */	TokenNameCOMMENT_JAVADOC	 This method is a Delegate method handling the @classpath attribute. * <p>This attribute can set a path to add to the classpath.</p> * @param classpath the path to use for the classpath. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
/** * Delegate method handling the &lt;classpath&gt; tag. * * <p>This nested path-like structure can set a path to add to the * classpath.</p> * * @return the created path. */	TokenNameCOMMENT_JAVADOC	 Delegate method handling the &lt;classpath&gt; tag. * <p>This nested path-like structure can set a path to add to the classpath.</p> * @return the created path. 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
component	TokenNameIdentifier	 component
.	TokenNameDOT	
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
/** * Delegate method handling the @classname attribute. * * <p>This attribute sets the full qualified class name of the class * to load and instantiate.</p> * * @param fcqn the name of the class to load. */	TokenNameCOMMENT_JAVADOC	 Delegate method handling the @classname attribute. * <p>This attribute sets the full qualified class name of the class to load and instantiate.</p> * @param fcqn the name of the class to load. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fcqn	TokenNameIdentifier	 fcqn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
fcqn	TokenNameIdentifier	 fcqn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegate method handling the @classpathref attribute. * * <p>This attribute can add a referenced path-like structure to the * classpath.</p> * * @param r the reference to the classpath. */	TokenNameCOMMENT_JAVADOC	 Delegate method handling the @classpathref attribute. * <p>This attribute can add a referenced path-like structure to the classpath.</p> * @param r the reference to the classpath. 
public	TokenNamepublic	
void	TokenNamevoid	
setClasspathref	TokenNameIdentifier	 set Classpathref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classpathId	TokenNameIdentifier	 classpath Id
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
/** * Delegate method handling the @reverseLoader attribute. * * <p>This attribute can set a boolean indicating that the used * classloader should NOT follow the classical parent-first scheme. * </p> * * <p>By default this is supposed to be false.</p> * * <p>Caution: this behaviour is contradictory to the normal way * classloaders work. Do not let your ProjectComponent use it if * you are not really sure.</p> * * @param reverseLoader if true reverse the order of looking up a class. */	TokenNameCOMMENT_JAVADOC	 Delegate method handling the @reverseLoader attribute. * <p>This attribute can set a boolean indicating that the used classloader should NOT follow the classical parent-first scheme. </p> * <p>By default this is supposed to be false.</p> * <p>Caution: this behaviour is contradictory to the normal way classloaders work. Do not let your ProjectComponent use it if you are not really sure.</p> * @param reverseLoader if true reverse the order of looking up a class. 
public	TokenNamepublic	
void	TokenNamevoid	
setReverseLoader	TokenNameIdentifier	 set Reverse Loader
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reverseLoader	TokenNameIdentifier	 reverse Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reverseLoader	TokenNameIdentifier	 reverse Loader
=	TokenNameEQUAL	
reverseLoader	TokenNameIdentifier	 reverse Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the loaderRef. * @param r the reference to the loader. */	TokenNameCOMMENT_JAVADOC	 Sets the loaderRef. @param r the reference to the loader. 
public	TokenNamepublic	
void	TokenNamevoid	
setLoaderRef	TokenNameIdentifier	 set Loader Ref
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
loaderId	TokenNameIdentifier	 loader Id
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds or creates the classloader for this object. * @return The class loader. */	TokenNameCOMMENT_JAVADOC	 Finds or creates the classloader for this object. @return The class loader. 
public	TokenNamepublic	
ClassLoader	TokenNameIdentifier	 Class Loader
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassLoaderForPath	TokenNameIdentifier	 get Class Loader For Path
(	TokenNameLPAREN	
getContextProject	TokenNameIdentifier	 get Context Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
getClassLoadId	TokenNameIdentifier	 get Class Load Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reverseLoader	TokenNameIdentifier	 reverse Loader
,	TokenNameCOMMA	
loaderId	TokenNameIdentifier	 loader Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
isMagicPropertySet	TokenNameIdentifier	 is Magic Property Set
(	TokenNameLPAREN	
getContextProject	TokenNameIdentifier	 get Context Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The project of the ProjectComponent we are working for. */	TokenNameCOMMENT_JAVADOC	 The project of the ProjectComponent we are working for. 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
getContextProject	TokenNameIdentifier	 get Context Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes the loaderId based on the configuration of the component. * @return a loader identifier. */	TokenNameCOMMENT_JAVADOC	 Computes the loaderId based on the configuration of the component. @return a loader identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassLoadId	TokenNameIdentifier	 get Class Load Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loaderId	TokenNameIdentifier	 loader Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
classpathId	TokenNameIdentifier	 classpath Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_CLASSPATH_LOADER_PREFIX	TokenNameIdentifier	 REFID  CLASSPATH  LOADER  PREFIX
+	TokenNamePLUS	
classpathId	TokenNameIdentifier	 classpath Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
loaderId	TokenNameIdentifier	 loader Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper method obtaining a fresh instance of the class specified * in the @classname and using the specified classpath. * * @return the fresh instantiated object. */	TokenNameCOMMENT_JAVADOC	 Helper method obtaining a fresh instance of the class specified in the @classname and using the specified classpath. * @return the fresh instantiated object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ClasspathUtils	TokenNameIdentifier	 Classpath Utils
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The classpath. * @return the classpath. */	TokenNameCOMMENT_JAVADOC	 The classpath. @return the classpath. 
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
/** * Get the reverseLoader setting. * @return true if looking up in reverse order. */	TokenNameCOMMENT_JAVADOC	 Get the reverseLoader setting. @return true if looking up in reverse order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverseLoader	TokenNameIdentifier	 is Reverse Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverseLoader	TokenNameIdentifier	 reverse Loader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//TODO no methods yet for getClassname 	TokenNameCOMMENT_LINE	TODO no methods yet for getClassname 
//TODO no method for newInstance using a reverse-classloader 	TokenNameCOMMENT_LINE	TODO no method for newInstance using a reverse-classloader 
}	TokenNameRBRACE	
}	TokenNameRBRACE	

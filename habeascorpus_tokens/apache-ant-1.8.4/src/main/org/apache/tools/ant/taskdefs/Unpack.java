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
File	TokenNameIdentifier	 File
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
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
ResourceCollection	TokenNameIdentifier	 Resource Collection
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
FileProvider	TokenNameIdentifier	 File Provider
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
FileResource	TokenNameIdentifier	 File Resource
;	TokenNameSEMICOLON	
/** * Abstract Base class for unpack tasks. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Abstract Base class for unpack tasks. * @since Ant 1.5 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Unpack	TokenNameIdentifier	 Unpack
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Resource	TokenNameIdentifier	 Resource
srcResource	TokenNameIdentifier	 src Resource
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * @deprecated since 1.5.x. * setSrc(String) is deprecated and is replaced with * setSrc(File) to make Ant's Introspection * mechanism do the work and also to encapsulate operations on * the type in its own class. * @ant.attribute ignore="true" * @param src a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 @deprecated since 1.5.x. setSrc(String) is deprecated and is replaced with setSrc(File) to make Ant's Introspection mechanism do the work and also to encapsulate operations on the type in its own class. @ant.attribute ignore="true" @param src a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - The setSrc(String) method has been deprecated."	TokenNameStringLiteral	DEPRECATED - The setSrc(String) method has been deprecated.
+	TokenNamePLUS	
" Use setSrc(File) instead."	TokenNameStringLiteral	 Use setSrc(File) instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated since 1.5.x. * setDest(String) is deprecated and is replaced with * setDest(File) to make Ant's Introspection * mechanism do the work and also to encapsulate operations on * the type in its own class. * @ant.attribute ignore="true" * @param dest a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 @deprecated since 1.5.x. setDest(String) is deprecated and is replaced with setDest(File) to make Ant's Introspection mechanism do the work and also to encapsulate operations on the type in its own class. @ant.attribute ignore="true" @param dest a <code>String</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setDest	TokenNameIdentifier	 set Dest
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"DEPRECATED - The setDest(String) method has been deprecated."	TokenNameStringLiteral	DEPRECATED - The setDest(String) method has been deprecated.
+	TokenNamePLUS	
" Use setDest(File) instead."	TokenNameStringLiteral	 Use setDest(File) instead.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDest	TokenNameIdentifier	 set Dest
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The file to expand; required. * @param src file to expand */	TokenNameCOMMENT_JAVADOC	 The file to expand; required. @param src file to expand 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSrcResource	TokenNameIdentifier	 set Src Resource
(	TokenNameLPAREN	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The resource to expand; required. * @param src resource to expand */	TokenNameCOMMENT_JAVADOC	 The resource to expand; required. @param src resource to expand 
public	TokenNamepublic	
void	TokenNamevoid	
setSrcResource	TokenNameIdentifier	 set Src Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"the archive "	TokenNameStringLiteral	the archive 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"the archive "	TokenNameStringLiteral	the archive 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" can't be a directory"	TokenNameStringLiteral	 can't be a directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileProvider	TokenNameIdentifier	 File Provider
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
supportsNonFileResources	TokenNameIdentifier	 supports Non File Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The source "	TokenNameStringLiteral	The source 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not a FileSystem "	TokenNameStringLiteral	 is not a FileSystem 
+	TokenNamePLUS	
"Only FileSystem resources are"	TokenNameStringLiteral	Only FileSystem resources are
+	TokenNamePLUS	
" supported."	TokenNameStringLiteral	 supported.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcResource	TokenNameIdentifier	 src Resource
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the source Archive resource. * @param a the archive as a single element Resource collection. */	TokenNameCOMMENT_JAVADOC	 Set the source Archive resource. @param a the archive as a single element Resource collection. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"only single argument resource collections"	TokenNameStringLiteral	only single argument resource collections
+	TokenNamePLUS	
" are supported as archives"	TokenNameStringLiteral	 are supported as archives
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setSrcResource	TokenNameIdentifier	 set Src Resource
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The destination file or directory; optional. * @param dest destination file or directory */	TokenNameCOMMENT_JAVADOC	 The destination file or directory; optional. @param dest destination file or directory 
public	TokenNamepublic	
void	TokenNamevoid	
setDest	TokenNameIdentifier	 set Dest
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcResource	TokenNameIdentifier	 src Resource
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No Src specified"	TokenNameStringLiteral	No Src specified
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
defaultExtension	TokenNameIdentifier	 default Extension
=	TokenNameEQUAL	
getDefaultExtension	TokenNameIdentifier	 get Default Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createDestFile	TokenNameIdentifier	 create Dest File
(	TokenNameLPAREN	
defaultExtension	TokenNameIdentifier	 default Extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createDestFile	TokenNameIdentifier	 create Dest File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultExtension	TokenNameIdentifier	 default Extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sourceName	TokenNameIdentifier	 source Name
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
sourceName	TokenNameIdentifier	 source Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defaultExtension	TokenNameIdentifier	 default Extension
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
defaultExtension	TokenNameIdentifier	 default Extension
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
defaultExtension	TokenNameIdentifier	 default Extension
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
sourceName	TokenNameIdentifier	 source Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
defaultExtension	TokenNameIdentifier	 default Extension
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
sourceName	TokenNameIdentifier	 source Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
defaultExtension	TokenNameIdentifier	 default Extension
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
sourceName	TokenNameIdentifier	 source Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Execute the task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
savedDest	TokenNameIdentifier	 saved Dest
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
// may be altered in validate 	TokenNameCOMMENT_LINE	may be altered in validate 
try	TokenNametry	
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
savedDest	TokenNameIdentifier	 saved Dest
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the extension. * This is to be overridden by subclasses. * @return the default extension. */	TokenNameCOMMENT_JAVADOC	 Get the extension. This is to be overridden by subclasses. @return the default extension. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getDefaultExtension	TokenNameIdentifier	 get Default Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Do the uncompressing. * This is to be overridden by subclasses. */	TokenNameCOMMENT_JAVADOC	 Do the uncompressing. This is to be overridden by subclasses. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether this task can deal with non-file resources. * * <p>This implementation returns false.</p> * @return false for this task. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Whether this task can deal with non-file resources. * <p>This implementation returns false.</p> @return false for this task. @since Ant 1.7 
protected	TokenNameprotected	
boolean	TokenNameboolean	
supportsNonFileResources	TokenNameIdentifier	 supports Non File Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

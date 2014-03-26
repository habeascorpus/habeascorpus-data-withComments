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
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceCollection	TokenNameIdentifier	 Resource Collection
;	TokenNameSEMICOLON	
/** * Abstract class that delegates all reading methods of Resource to * its wrapped resource and deals with reference handling. * * <p>Overwrites all setters to throw exceptions.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Abstract class that delegates all reading methods of Resource to its wrapped resource and deals with reference handling. * <p>Overwrites all setters to throw exceptions.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ResourceDecorator	TokenNameIdentifier	 Resource Decorator
extends	TokenNameextends	
Resource	TokenNameIdentifier	 Resource
{	TokenNameLBRACE	
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
/** no arg constructor */	TokenNameCOMMENT_JAVADOC	 no arg constructor 
protected	TokenNameprotected	
ResourceDecorator	TokenNameIdentifier	 Resource Decorator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor with another resource to wrap. * @param other the resource to wrap. */	TokenNameCOMMENT_JAVADOC	 Constructor with another resource to wrap. @param other the resource to wrap. 
protected	TokenNameprotected	
ResourceDecorator	TokenNameIdentifier	 Resource Decorator
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the resource to wrap using a single-element collection. * @param a the resource to wrap as a single element Resource collection. */	TokenNameCOMMENT_JAVADOC	 Sets the resource to wrap using a single-element collection. @param a the resource to wrap as a single element Resource collection. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkChildrenAllowed	TokenNameIdentifier	 check Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you must not specify more than one"	TokenNameStringLiteral	you must not specify more than one
+	TokenNamePLUS	
" resource"	TokenNameStringLiteral	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
" are supported"	TokenNameStringLiteral	 are supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the resource. * @return the name of the wrapped resource. */	TokenNameCOMMENT_JAVADOC	 Get the name of the resource. @return the name of the wrapped resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The exists attribute tells whether a file exists. * @return true if this resource exists. */	TokenNameCOMMENT_JAVADOC	 The exists attribute tells whether a file exists. @return true if this resource exists. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells the modification time in milliseconds since 01.01.1970 . * * @return 0 if the resource does not exist to mirror the behavior * of {@link java.io.File File}. */	TokenNameCOMMENT_JAVADOC	 Tells the modification time in milliseconds since 01.01.1970 . * @return 0 if the resource does not exist to mirror the behavior of {@link java.io.File File}. 
public	TokenNamepublic	
long	TokenNamelong	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if the resource is a directory. * @return boolean flag indicating if the resource is a directory. */	TokenNameCOMMENT_JAVADOC	 Tells if the resource is a directory. @return boolean flag indicating if the resource is a directory. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size of this Resource. * @return the size, as a long, 0 if the Resource does not exist (for * compatibility with java.io.File), or UNKNOWN_SIZE if not known. */	TokenNameCOMMENT_JAVADOC	 Get the size of this Resource. @return the size, as a long, 0 if the Resource does not exist (for compatibility with java.io.File), or UNKNOWN_SIZE if not known. 
public	TokenNamepublic	
long	TokenNamelong	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an InputStream for the Resource. * @return an InputStream containing this Resource's content. * @throws IOException if unable to provide the content of this * Resource as a stream. * @throws UnsupportedOperationException if InputStreams are not * supported for this Resource type. */	TokenNameCOMMENT_JAVADOC	 Get an InputStream for the Resource. @return an InputStream containing this Resource's content. @throws IOException if unable to provide the content of this Resource as a stream. @throws UnsupportedOperationException if InputStreams are not supported for this Resource type. 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an OutputStream for the Resource. * @return an OutputStream to which content can be written. * @throws IOException if unable to provide the content of this * Resource as a stream. * @throws UnsupportedOperationException if OutputStreams are not * supported for this Resource type. */	TokenNameCOMMENT_JAVADOC	 Get an OutputStream for the Resource. @return an OutputStream to which content can be written. @throws IOException if unable to provide the content of this Resource as a stream. @throws UnsupportedOperationException if OutputStreams are not supported for this Resource type. 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return whether this Resource is a FileProvider. */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return whether this Resource is a FileProvider. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overrides the base version. * @param r the Reference to set. */	TokenNameCOMMENT_JAVADOC	 Overrides the base version. @param r the Reference to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
ResourceDecorator	TokenNameIdentifier	 Resource Decorator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ResourceDecorator	TokenNameIdentifier	 Resource Decorator
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the hash code for this Resource. * @return hash code as int. */	TokenNameCOMMENT_JAVADOC	 Get the hash code for this Resource. @return hash code as int. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * De-references refids if any, ensures a wrapped resource has * been specified. */	TokenNameCOMMENT_JAVADOC	 De-references refids if any, ensures a wrapped resource has been specified. 
protected	TokenNameprotected	
final	TokenNamefinal	
Resource	TokenNameIdentifier	 Resource
getResource	TokenNameIdentifier	 get Resource
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
return	TokenNamereturn	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"no resource specified"	TokenNameStringLiteral	no resource specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resource	TokenNameIdentifier	 resource
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
final	TokenNamefinal	
Stack	TokenNameIdentifier	 Stack
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// disable modification 	TokenNameCOMMENT_LINE	disable modification 
/** * Overridden, not allowed to set the name of the resource. * @param name not used. * @throws BuildException always. */	TokenNameCOMMENT_JAVADOC	 Overridden, not allowed to set the name of the resource. @param name not used. @throws BuildException always. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you can't change the name of a "	TokenNameStringLiteral	you can't change the name of a 
+	TokenNamePLUS	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the exists attribute. * @param exists if true, this resource exists. */	TokenNameCOMMENT_JAVADOC	 Set the exists attribute. @param exists if true, this resource exists. 
public	TokenNamepublic	
void	TokenNamevoid	
setExists	TokenNameIdentifier	 set Exists
(	TokenNameLPAREN	
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you can't change the exists state of a "	TokenNameStringLiteral	you can't change the exists state of a 
+	TokenNamePLUS	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override setLastModified. * @param lastmodified not used. * @throws BuildException always. */	TokenNameCOMMENT_JAVADOC	 Override setLastModified. @param lastmodified not used. @throws BuildException always. 
public	TokenNamepublic	
void	TokenNamevoid	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
long	TokenNamelong	
lastmodified	TokenNameIdentifier	 lastmodified
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you can't change the timestamp of a "	TokenNameStringLiteral	you can't change the timestamp of a 
+	TokenNamePLUS	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override setDirectory. * @param directory not used. * @throws BuildException always. */	TokenNameCOMMENT_JAVADOC	 Override setDirectory. @param directory not used. @throws BuildException always. 
public	TokenNamepublic	
void	TokenNamevoid	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
boolean	TokenNameboolean	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you can't change the directory state of a "	TokenNameStringLiteral	you can't change the directory state of a 
+	TokenNamePLUS	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override setSize. * @param size not used. * @throws BuildException always. */	TokenNameCOMMENT_JAVADOC	 Override setSize. @param size not used. @throws BuildException always. 
public	TokenNamepublic	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you can't change the size of a "	TokenNameStringLiteral	you can't change the size of a 
+	TokenNamePLUS	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

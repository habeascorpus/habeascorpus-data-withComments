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
Iterator	TokenNameIdentifier	 Iterator
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
Mapper	TokenNameIdentifier	 Mapper
;	TokenNameSEMICOLON	
/** * A <code>FileNameMapper</code> that contains * other <code>FileNameMapper</code>s. * @see FileNameMapper */	TokenNameCOMMENT_JAVADOC	 A <code>FileNameMapper</code> that contains other <code>FileNameMapper</code>s. @see FileNameMapper 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ContainerMapper	TokenNameIdentifier	 Container Mapper
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
mappers	TokenNameIdentifier	 mappers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a <code>Mapper</code>. * @param mapper the <code>Mapper</code> to add. */	TokenNameCOMMENT_JAVADOC	 Add a <code>Mapper</code>. @param mapper the <code>Mapper</code> to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredMapper	TokenNameIdentifier	 add Configured Mapper
(	TokenNameLPAREN	
Mapper	TokenNameIdentifier	 Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An add configured version of the add method. * This class used to contain an add method and an * addConfiguredMapper method. Dur to ordering, * the add method was always called first. This * addConfigued method has been added to allow * chaining to work correctly. * @param fileNameMapper a <code>FileNameMapper</code>. */	TokenNameCOMMENT_JAVADOC	 An add configured version of the add method. This class used to contain an add method and an addConfiguredMapper method. Dur to ordering, the add method was always called first. This addConfigued method has been added to allow chaining to work correctly. @param fileNameMapper a <code>FileNameMapper</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a <code>FileNameMapper</code>. * @param fileNameMapper a <code>FileNameMapper</code>. * @throws IllegalArgumentException if attempting to add this * <code>ContainerMapper</code> to itself, or if the specified * <code>FileNameMapper</code> is itself a <code>ContainerMapper</code> * that contains this <code>ContainerMapper</code>. */	TokenNameCOMMENT_JAVADOC	 Add a <code>FileNameMapper</code>. @param fileNameMapper a <code>FileNameMapper</code>. @throws IllegalArgumentException if attempting to add this <code>ContainerMapper</code> to itself, or if the specified <code>FileNameMapper</code> is itself a <code>ContainerMapper</code> that contains this <code>ContainerMapper</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
instanceof	TokenNameinstanceof	
ContainerMapper	TokenNameIdentifier	 Container Mapper
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ContainerMapper	TokenNameIdentifier	 Container Mapper
)	TokenNameRPAREN	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Circular mapper containment condition detected"	TokenNameStringLiteral	Circular mapper containment condition detected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mappers	TokenNameIdentifier	 mappers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return <code>true</code> if this <code>ContainerMapper</code> or any of * its sub-elements contains the specified <code>FileNameMapper</code>. * @param fileNameMapper the <code>FileNameMapper</code> to search for. * @return <code>boolean</code>. */	TokenNameCOMMENT_JAVADOC	 Return <code>true</code> if this <code>ContainerMapper</code> or any of its sub-elements contains the specified <code>FileNameMapper</code>. @param fileNameMapper the <code>FileNameMapper</code> to search for. @return <code>boolean</code>. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
mappers	TokenNameIdentifier	 mappers
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
&&	TokenNameAND_AND	
!	TokenNameNOT	
foundit	TokenNameIdentifier	 foundit
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
)	TokenNameRPAREN	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
foundit	TokenNameIdentifier	 foundit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
||	TokenNameOR_OR	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
instanceof	TokenNameinstanceof	
ContainerMapper	TokenNameIdentifier	 Container Mapper
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ContainerMapper	TokenNameIdentifier	 Container Mapper
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
foundit	TokenNameIdentifier	 foundit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the <code>List</code> of <code>FileNameMapper</code>s. * @return <code>List</code>. */	TokenNameCOMMENT_JAVADOC	 Get the <code>List</code> of <code>FileNameMapper</code>s. @return <code>List</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
List	TokenNameIdentifier	 List
getMappers	TokenNameIdentifier	 get Mappers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
mappers	TokenNameIdentifier	 mappers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empty implementation. * @param ignore ignored. */	TokenNameCOMMENT_JAVADOC	 Empty implementation. @param ignore ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Empty 	TokenNameCOMMENT_LINE	Empty 
}	TokenNameRBRACE	
/** * Empty implementation. * @param ignore ignored. */	TokenNameCOMMENT_JAVADOC	 Empty implementation. @param ignore ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Empty 	TokenNameCOMMENT_LINE	Empty 
}	TokenNameRBRACE	
}	TokenNameRBRACE	

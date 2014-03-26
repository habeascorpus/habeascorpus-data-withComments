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
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
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
PatternSet	TokenNameIdentifier	 Pattern Set
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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
FileSelector	TokenNameIdentifier	 File Selector
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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
AbstractSelectorContainer	TokenNameIdentifier	 Abstract Selector Container
;	TokenNameSEMICOLON	
/** * ResourceCollection implementation; like AbstractFileSet with absolute paths. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 ResourceCollection implementation; like AbstractFileSet with absolute paths. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Files	TokenNameIdentifier	 Files
extends	TokenNameextends	
AbstractSelectorContainer	TokenNameIdentifier	 Abstract Selector Container
implements	TokenNameimplements	
ResourceCollection	TokenNameIdentifier	 Resource Collection
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
EMPTY_ITERATOR	TokenNameIdentifier	 EMPTY  ITERATOR
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PatternSet	TokenNameIdentifier	 Pattern Set
defaultPatterns	TokenNameIdentifier	 default Patterns
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
additionalPatterns	TokenNameIdentifier	 additional Patterns
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
followSymlinks	TokenNameIdentifier	 follow Symlinks
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/* cached DirectoryScanner instance */	TokenNameCOMMENT_BLOCK	 cached DirectoryScanner instance 
private	TokenNameprivate	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Construct a new <code>Files</code> collection. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>Files</code> collection. 
public	TokenNamepublic	
Files	TokenNameIdentifier	 Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new <code>Files</code> collection, shallowly cloned * from the specified <code>Files</code>. * @param f the <code>Files</code> to use as a template. */	TokenNameCOMMENT_JAVADOC	 Construct a new <code>Files</code> collection, shallowly cloned from the specified <code>Files</code>. @param f the <code>Files</code> to use as a template. 
protected	TokenNameprotected	
Files	TokenNameIdentifier	 Files
(	TokenNameLPAREN	
Files	TokenNameIdentifier	 Files
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defaultPatterns	TokenNameIdentifier	 default Patterns
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
defaultPatterns	TokenNameIdentifier	 default Patterns
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
additionalPatterns	TokenNameIdentifier	 additional Patterns
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
additionalPatterns	TokenNameIdentifier	 additional Patterns
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
followSymlinks	TokenNameIdentifier	 follow Symlinks
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
followSymlinks	TokenNameIdentifier	 follow Symlinks
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
ds	TokenNameIdentifier	 ds
;	TokenNameSEMICOLON	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make this instance in effect a reference to another instance. * * <p>You must not set another attribute or nest elements inside * this element if you make it a reference.</p> * @param r the <code>Reference</code> to use. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Make this instance in effect a reference to another instance. * <p>You must not set another attribute or nest elements inside this element if you make it a reference.</p> @param r the <code>Reference</code> to use. @throws BuildException if there is a problem. 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
defaultPatterns	TokenNameIdentifier	 default Patterns
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
!	TokenNameNOT	
additionalPatterns	TokenNameIdentifier	 additional Patterns
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
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
hasSelectors	TokenNameIdentifier	 has Selectors
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
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a nested patternset. * @return <code>PatternSet</code>. */	TokenNameCOMMENT_JAVADOC	 Create a nested patternset. @return <code>PatternSet</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
PatternSet	TokenNameIdentifier	 Pattern Set
createPatternSet	TokenNameIdentifier	 create Pattern Set
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
PatternSet	TokenNameIdentifier	 Pattern Set
patterns	TokenNameIdentifier	 patterns
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
additionalPatterns	TokenNameIdentifier	 additional Patterns
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
patterns	TokenNameIdentifier	 patterns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
patterns	TokenNameIdentifier	 patterns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a name entry to the include list. * @return <code>PatternSet.NameEntry</code>. */	TokenNameCOMMENT_JAVADOC	 Add a name entry to the include list. @return <code>PatternSet.NameEntry</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
PatternSet	TokenNameIdentifier	 Pattern Set
.	TokenNameDOT	
NameEntry	TokenNameIdentifier	 Name Entry
createInclude	TokenNameIdentifier	 create Include
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
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a name entry to the include files list. * @return <code>PatternSet.NameEntry</code>. */	TokenNameCOMMENT_JAVADOC	 Add a name entry to the include files list. @return <code>PatternSet.NameEntry</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
PatternSet	TokenNameIdentifier	 Pattern Set
.	TokenNameDOT	
NameEntry	TokenNameIdentifier	 Name Entry
createIncludesFile	TokenNameIdentifier	 create Includes File
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
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
createIncludesFile	TokenNameIdentifier	 create Includes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a name entry to the exclude list. * @return <code>PatternSet.NameEntry</code>. */	TokenNameCOMMENT_JAVADOC	 Add a name entry to the exclude list. @return <code>PatternSet.NameEntry</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
PatternSet	TokenNameIdentifier	 Pattern Set
.	TokenNameDOT	
NameEntry	TokenNameIdentifier	 Name Entry
createExclude	TokenNameIdentifier	 create Exclude
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
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a name entry to the excludes files list. * @return <code>PatternSet.NameEntry</code>. */	TokenNameCOMMENT_JAVADOC	 Add a name entry to the excludes files list. @return <code>PatternSet.NameEntry</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
PatternSet	TokenNameIdentifier	 Pattern Set
.	TokenNameDOT	
NameEntry	TokenNameIdentifier	 Name Entry
createExcludesFile	TokenNameIdentifier	 create Excludes File
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
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
createExcludesFile	TokenNameIdentifier	 create Excludes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append <code>includes</code> to the current list of include * patterns. * * <p>Patterns may be separated by a comma or a space.</p> * * @param includes the <code>String</code> containing the include patterns. */	TokenNameCOMMENT_JAVADOC	 Append <code>includes</code> to the current list of include patterns. * <p>Patterns may be separated by a comma or a space.</p> * @param includes the <code>String</code> containing the include patterns. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append <code>includes</code> to the current list of include * patterns. * * @param includes array containing the include patterns. */	TokenNameCOMMENT_JAVADOC	 Append <code>includes</code> to the current list of include patterns. * @param includes array containing the include patterns. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
appendIncludes	TokenNameIdentifier	 append Includes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
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
includes	TokenNameIdentifier	 includes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
includes	TokenNameIdentifier	 includes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append <code>excludes</code> to the current list of exclude * patterns. * * <p>Patterns may be separated by a comma or a space.</p> * * @param excludes the <code>String</code> containing the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Append <code>excludes</code> to the current list of exclude patterns. * <p>Patterns may be separated by a comma or a space.</p> * @param excludes the <code>String</code> containing the exclude patterns. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append <code>excludes</code> to the current list of include * patterns. * * @param excludes array containing the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Append <code>excludes</code> to the current list of include patterns. * @param excludes array containing the exclude patterns. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
appendExcludes	TokenNameIdentifier	 append Excludes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
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
excludes	TokenNameIdentifier	 excludes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
excludes	TokenNameIdentifier	 excludes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the <code>File</code> containing the includes patterns. * * @param incl <code>File</code> instance. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Set the <code>File</code> containing the includes patterns. * @param incl <code>File</code> instance. @throws BuildException if there is a problem. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setIncludesfile	TokenNameIdentifier	 set Includesfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
incl	TokenNameIdentifier	 incl
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
setIncludesfile	TokenNameIdentifier	 set Includesfile
(	TokenNameLPAREN	
incl	TokenNameIdentifier	 incl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the <code>File</code> containing the excludes patterns. * * @param excl <code>File</code> instance. * @throws BuildException if there is a problem. */	TokenNameCOMMENT_JAVADOC	 Set the <code>File</code> containing the excludes patterns. * @param excl <code>File</code> instance. @throws BuildException if there is a problem. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setExcludesfile	TokenNameIdentifier	 set Excludesfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
excl	TokenNameIdentifier	 excl
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
setExcludesfile	TokenNameIdentifier	 set Excludesfile
(	TokenNameLPAREN	
excl	TokenNameIdentifier	 excl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether default exclusions should be used or not. * * @param useDefaultExcludes <code>boolean</code>. */	TokenNameCOMMENT_JAVADOC	 Set whether default exclusions should be used or not. * @param useDefaultExcludes <code>boolean</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setDefaultexcludes	TokenNameIdentifier	 set Defaultexcludes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
=	TokenNameEQUAL	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether default exclusions should be used or not. * @return the defaultexclusions value. */	TokenNameCOMMENT_JAVADOC	 Get whether default exclusions should be used or not. @return the defaultexclusions value. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
getDefaultexcludes	TokenNameIdentifier	 get Defaultexcludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultexcludes	TokenNameIdentifier	 get Defaultexcludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set case-sensitivity of the Files collection. * * @param caseSensitive <code>boolean</code>. */	TokenNameCOMMENT_JAVADOC	 Set case-sensitivity of the Files collection. * @param caseSensitive <code>boolean</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
caseSensitive	TokenNameIdentifier	 case Sensitive
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out if this Files collection is case-sensitive. * * @return <code>boolean</code> indicating whether the Files * collection is case-sensitive. */	TokenNameCOMMENT_JAVADOC	 Find out if this Files collection is case-sensitive. * @return <code>boolean</code> indicating whether the Files collection is case-sensitive. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
caseSensitive	TokenNameIdentifier	 case Sensitive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether or not symbolic links should be followed. * * @param followSymlinks whether or not symbolic links should be followed. */	TokenNameCOMMENT_JAVADOC	 Set whether or not symbolic links should be followed. * @param followSymlinks whether or not symbolic links should be followed. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
boolean	TokenNameboolean	
followSymlinks	TokenNameIdentifier	 follow Symlinks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
followSymlinks	TokenNameIdentifier	 follow Symlinks
=	TokenNameEQUAL	
followSymlinks	TokenNameIdentifier	 follow Symlinks
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out whether symbolic links should be followed. * * @return <code>boolean</code> indicating whether symbolic links * should be followed. */	TokenNameCOMMENT_JAVADOC	 Find out whether symbolic links should be followed. * @return <code>boolean</code> indicating whether symbolic links should be followed. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
isFollowSymlinks	TokenNameIdentifier	 is Follow Symlinks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isFollowSymlinks	TokenNameIdentifier	 is Follow Symlinks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
followSymlinks	TokenNameIdentifier	 follow Symlinks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return an Iterator of Resources. */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return an Iterator of Resources. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
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
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ensureDirectoryScannerSetup	TokenNameIdentifier	 ensure Directory Scanner Setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fct	TokenNameIdentifier	 fct
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dct	TokenNameIdentifier	 dct
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirsCount	TokenNameIdentifier	 get Included Dirs Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fct	TokenNameIdentifier	 fct
+	TokenNamePLUS	
dct	TokenNameIdentifier	 dct
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
EMPTY_ITERATOR	TokenNameIdentifier	 EMPTY  ITERATOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FileResourceIterator	TokenNameIdentifier	 File Resource Iterator
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
FileResourceIterator	TokenNameIdentifier	 File Resource Iterator
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fct	TokenNameIdentifier	 fct
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addFiles	TokenNameIdentifier	 add Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dct	TokenNameIdentifier	 dct
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addFiles	TokenNameIdentifier	 add Files
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fulfill the ResourceCollection contract. * @return number of elements as int. */	TokenNameCOMMENT_JAVADOC	 Fulfill the ResourceCollection contract. @return number of elements as int. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
size	TokenNameIdentifier	 size
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
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ensureDirectoryScannerSetup	TokenNameIdentifier	 ensure Directory Scanner Setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedFilesCount	TokenNameIdentifier	 get Included Files Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
getIncludedDirsCount	TokenNameIdentifier	 get Included Dirs Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out whether this Files collection has patterns. * * @return whether any patterns are in this container. */	TokenNameCOMMENT_JAVADOC	 Find out whether this Files collection has patterns. * @return whether any patterns are in this container. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
hasPatterns	TokenNameIdentifier	 has Patterns
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
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
defaultPatterns	TokenNameIdentifier	 default Patterns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
additionalPatterns	TokenNameIdentifier	 additional Patterns
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
if	TokenNameif	
(	TokenNameLPAREN	
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new selector into this container. * * @param selector the new <code>FileSelector</code> to add. */	TokenNameCOMMENT_JAVADOC	 Add a new selector into this container. * @param selector the new <code>FileSelector</code> to add. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
selector	TokenNameIdentifier	 selector
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
super	TokenNamesuper	
.	TokenNameDOT	
appendSelector	TokenNameIdentifier	 append Selector
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format this Files collection as a String. * @return a descriptive <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Format this Files collection as a String. @return a descriptive <code>String</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
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
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
pathSeparatorChar	TokenNameIdentifier	 path Separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a deep clone of this instance, except for the nested selectors * (the list of selectors is a shallow clone of this instance's list). * @return a cloned Object. */	TokenNameCOMMENT_JAVADOC	 Create a deep clone of this instance, except for the nested selectors (the list of selectors is a shallow clone of this instance's list). @return a cloned Object. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
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
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Files	TokenNameIdentifier	 Files
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Files	TokenNameIdentifier	 Files
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
defaultPatterns	TokenNameIdentifier	 default Patterns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
defaultPatterns	TokenNameIdentifier	 default Patterns
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
additionalPatterns	TokenNameIdentifier	 additional Patterns
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
additionalPatterns	TokenNameIdentifier	 additional Patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
additionalPatterns	TokenNameIdentifier	 additional Patterns
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
PatternSet	TokenNameIdentifier	 Pattern Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
additionalPatterns	TokenNameIdentifier	 additional Patterns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the merged include patterns for this Files collection. * @param p Project instance. * @return the include patterns of the default pattern set and all * nested patternsets. */	TokenNameCOMMENT_JAVADOC	 Get the merged include patterns for this Files collection. @param p Project instance. @return the include patterns of the default pattern set and all nested patternsets. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergeIncludes	TokenNameIdentifier	 merge Includes
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergePatterns	TokenNameIdentifier	 merge Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the merged exclude patterns for this Files collection. * @param p Project instance. * @return the exclude patterns of the default pattern set and all * nested patternsets. */	TokenNameCOMMENT_JAVADOC	 Get the merged exclude patterns for this Files collection. @param p Project instance. @return the exclude patterns of the default pattern set and all nested patternsets. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergeExcludes	TokenNameIdentifier	 merge Excludes
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergePatterns	TokenNameIdentifier	 merge Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the merged patterns for this Files collection. * @param p Project instance. * @return the default patternset merged with the additional sets * in a new PatternSet instance. */	TokenNameCOMMENT_JAVADOC	 Get the merged patterns for this Files collection. @param p Project instance. @return the default patternset merged with the additional sets in a new PatternSet instance. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
PatternSet	TokenNameIdentifier	 Pattern Set
mergePatterns	TokenNameIdentifier	 merge Patterns
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
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
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
mergePatterns	TokenNameIdentifier	 merge Patterns
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternSet	TokenNameIdentifier	 Pattern Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
defaultPatterns	TokenNameIdentifier	 default Patterns
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
additionalPatterns	TokenNameIdentifier	 additional Patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
additionalPatterns	TokenNameIdentifier	 additional Patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Always returns true. * @return true indicating that all elements of a Files collection * will be FileResources. */	TokenNameCOMMENT_JAVADOC	 Always returns true. @return true indicating that all elements of a Files collection will be FileResources. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform the check for circular references and return the * referenced Files collection. * @return <code>FileCollection</code>. */	TokenNameCOMMENT_JAVADOC	 Perform the check for circular references and return the referenced Files collection. @return <code>FileCollection</code>. 
protected	TokenNameprotected	
Files	TokenNameIdentifier	 Files
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Files	TokenNameIdentifier	 Files
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
ensureDirectoryScannerSetup	TokenNameIdentifier	 ensure Directory Scanner Setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ds	TokenNameIdentifier	 ds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ds	TokenNameIdentifier	 ds
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryScanner	TokenNameIdentifier	 Directory Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternSet	TokenNameIdentifier	 Pattern Set
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
mergePatterns	TokenNameIdentifier	 merge Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setSelectors	TokenNameIdentifier	 set Selectors
(	TokenNameLPAREN	
getSelectors	TokenNameIdentifier	 get Selectors
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useDefaultExcludes	TokenNameIdentifier	 use Default Excludes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
addDefaultExcludes	TokenNameIdentifier	 add Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ds	TokenNameIdentifier	 ds
.	TokenNameDOT	
setFollowSymlinks	TokenNameIdentifier	 set Follow Symlinks
(	TokenNameLPAREN	
followSymlinks	TokenNameIdentifier	 follow Symlinks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasPatterns	TokenNameIdentifier	 has Patterns
(	TokenNameLPAREN	
PatternSet	TokenNameIdentifier	 Pattern Set
ps	TokenNameIdentifier	 ps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
includePatterns	TokenNameIdentifier	 include Patterns
=	TokenNameEQUAL	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excludePatterns	TokenNameIdentifier	 exclude Patterns
=	TokenNameEQUAL	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
includePatterns	TokenNameIdentifier	 include Patterns
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
includePatterns	TokenNameIdentifier	 include Patterns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
includePatterns	TokenNameIdentifier	 include Patterns
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
excludePatterns	TokenNameIdentifier	 exclude Patterns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

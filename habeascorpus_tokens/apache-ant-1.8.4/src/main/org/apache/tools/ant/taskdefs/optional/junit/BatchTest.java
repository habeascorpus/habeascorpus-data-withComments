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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
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
Enumeration	TokenNameIdentifier	 Enumeration
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
Vector	TokenNameIdentifier	 Vector
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
FileSet	TokenNameIdentifier	 File Set
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
Resources	TokenNameIdentifier	 Resources
;	TokenNameSEMICOLON	
/** * <p> Create then run <code>JUnitTest</code>'s based on the list of files * given by the fileset attribute. * * <p> Every <code>.java</code> or <code>.class</code> file in the fileset is * assumed to be a testcase. * A <code>JUnitTest</code> is created for each of these named classes with * basic setup inherited from the parent <code>BatchTest</code>. * * @see JUnitTest */	TokenNameCOMMENT_JAVADOC	 <p> Create then run <code>JUnitTest</code>'s based on the list of files given by the fileset attribute. * <p> Every <code>.java</code> or <code>.class</code> file in the fileset is assumed to be a testcase. A <code>JUnitTest</code> is created for each of these named classes with basic setup inherited from the parent <code>BatchTest</code>. * @see JUnitTest 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BatchTest	TokenNameIdentifier	 Batch Test
extends	TokenNameextends	
BaseTest	TokenNameIdentifier	 Base Test
{	TokenNameLBRACE	
/** the reference to the project */	TokenNameCOMMENT_JAVADOC	 the reference to the project 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** the list of filesets containing the testcase filename rules */	TokenNameCOMMENT_JAVADOC	 the list of filesets containing the testcase filename rules 
private	TokenNameprivate	
Resources	TokenNameIdentifier	 Resources
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
new	TokenNamenew	
Resources	TokenNameIdentifier	 Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * create a new batchtest instance * @param project the project it depends on. */	TokenNameCOMMENT_JAVADOC	 create a new batchtest instance @param project the project it depends on. 
public	TokenNamepublic	
BatchTest	TokenNameIdentifier	 Batch Test
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
setCache	TokenNameIdentifier	 set Cache
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new fileset instance to this batchtest. Whatever the fileset is, * only filename that are <tt>.java</tt> or <tt>.class</tt> will be * considered as 'candidates'. * @param fs the new fileset containing the rules to get the testcases. */	TokenNameCOMMENT_JAVADOC	 Add a new fileset instance to this batchtest. Whatever the fileset is, only filename that are <tt>.java</tt> or <tt>.class</tt> will be considered as 'candidates'. @param fs the new fileset containing the rules to get the testcases. 
public	TokenNamepublic	
void	TokenNamevoid	
addFileSet	TokenNameIdentifier	 add File Set
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this one is here because the changes to support ResourceCollections 	TokenNameCOMMENT_LINE	this one is here because the changes to support ResourceCollections 
// have broken Magic's JUnitTestTask. 	TokenNameCOMMENT_LINE	have broken Magic's JUnitTestTask. 
// 	TokenNameCOMMENT_LINE	 
// The task adds a FileSet to a BatchTest instance using the 	TokenNameCOMMENT_LINE	The task adds a FileSet to a BatchTest instance using the 
// Java API and without telling the FileSet about its project 	TokenNameCOMMENT_LINE	Java API and without telling the FileSet about its project 
// instance. The original code would pass in project on the 	TokenNameCOMMENT_LINE	instance. The original code would pass in project on the 
// call to getDirectoryScanner - which is now hidden deep into 	TokenNameCOMMENT_LINE	call to getDirectoryScanner - which is now hidden deep into 
// Resources.iterator() and not reachable. 	TokenNameCOMMENT_LINE	Resources.iterator() and not reachable. 
if	TokenNameif	
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a new ResourceCollection instance to this * batchtest. Whatever the collection is, only names that are * <tt>.java</tt> or <tt>.class</tt> will be considered as * 'candidates'. * @param rc the new ResourceCollection containing the rules to * get the testcases. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Add a new ResourceCollection instance to this batchtest. Whatever the collection is, only names that are <tt>.java</tt> or <tt>.class</tt> will be considered as 'candidates'. @param rc the new ResourceCollection containing the rules to get the testcases. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return all <tt>JUnitTest</tt> instances obtain by applying the fileset rules. * @return an enumeration of all elements of this batchtest that are * a <tt>JUnitTest</tt> instance. */	TokenNameCOMMENT_JAVADOC	 Return all <tt>JUnitTest</tt> instances obtain by applying the fileset rules. @return an enumeration of all elements of this batchtest that are a <tt>JUnitTest</tt> instance. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JUnitTest	TokenNameIdentifier	 J Unit Test
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tests	TokenNameIdentifier	 tests
=	TokenNameEQUAL	
createAllJUnitTest	TokenNameIdentifier	 create All J Unit Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Enumerations	TokenNameIdentifier	 Enumerations
.	TokenNameDOT	
fromArray	TokenNameIdentifier	 from Array
(	TokenNameLPAREN	
tests	TokenNameIdentifier	 tests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenient method to merge the <tt>JUnitTest</tt>s of this batchtest * to a <tt>Vector</tt>. * @param v the vector to which should be added all individual tests of this * batch test. */	TokenNameCOMMENT_JAVADOC	 Convenient method to merge the <tt>JUnitTest</tt>s of this batchtest to a <tt>Vector</tt>. @param v the vector to which should be added all individual tests of this batch test. 
void	TokenNamevoid	
addTestsTo	TokenNameIdentifier	 add Tests To
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JUnitTest	TokenNameIdentifier	 J Unit Test
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tests	TokenNameIdentifier	 tests
=	TokenNameEQUAL	
createAllJUnitTest	TokenNameIdentifier	 create All J Unit Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tests	TokenNameIdentifier	 tests
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create all <tt>JUnitTest</tt>s based on the filesets. Each instance * is configured to match this instance properties. * @return the array of all <tt>JUnitTest</tt>s that belongs to this batch. */	TokenNameCOMMENT_JAVADOC	 Create all <tt>JUnitTest</tt>s based on the filesets. Each instance is configured to match this instance properties. @return the array of all <tt>JUnitTest</tt>s that belongs to this batch. 
private	TokenNameprivate	
JUnitTest	TokenNameIdentifier	 J Unit Test
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createAllJUnitTest	TokenNameIdentifier	 create All J Unit Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filenames	TokenNameIdentifier	 filenames
=	TokenNameEQUAL	
getFilenames	TokenNameIdentifier	 get Filenames
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JUnitTest	TokenNameIdentifier	 J Unit Test
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tests	TokenNameIdentifier	 tests
=	TokenNameEQUAL	
new	TokenNamenew	
JUnitTest	TokenNameIdentifier	 J Unit Test
[	TokenNameLBRACKET	
filenames	TokenNameIdentifier	 filenames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
tests	TokenNameIdentifier	 tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
javaToClass	TokenNameIdentifier	 java To Class
(	TokenNameLPAREN	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tests	TokenNameIdentifier	 tests
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
createJUnitTest	TokenNameIdentifier	 create J Unit Test
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tests	TokenNameIdentifier	 tests
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Iterate over all filesets and return the filename of all files * that end with <tt>.java</tt> or <tt>.class</tt>. This is to avoid * wrapping a <tt>JUnitTest</tt> over an xml file for example. A Testcase * is obviously a java file (compiled or not). * @return an array of filenames without their extension. As they should * normally be taken from their root, filenames should match their fully * qualified class name (If it is not the case it will fail when running the test). * For the class <tt>org/apache/Whatever.class</tt> it will return <tt>org/apache/Whatever</tt>. */	TokenNameCOMMENT_JAVADOC	 Iterate over all filesets and return the filename of all files that end with <tt>.java</tt> or <tt>.class</tt>. This is to avoid wrapping a <tt>JUnitTest</tt> over an xml file for example. A Testcase is obviously a java file (compiled or not). @return an array of filenames without their extension. As they should normally be taken from their root, filenames should match their fully qualified class name (If it is not the case it will fail when running the test). For the class <tt>org/apache/Whatever.class</tt> it will return <tt>org/apache/Whatever</tt>. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFilenames	TokenNameIdentifier	 get Filenames
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pathname	TokenNameIdentifier	 pathname
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pathname	TokenNameIdentifier	 pathname
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".java"	TokenNameStringLiteral	.java
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
pathname	TokenNameIdentifier	 pathname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pathname	TokenNameIdentifier	 pathname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
".java"	TokenNameStringLiteral	.java
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
pathname	TokenNameIdentifier	 pathname
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
pathname	TokenNameIdentifier	 pathname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pathname	TokenNameIdentifier	 pathname
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
".class"	TokenNameStringLiteral	.class
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenient method to convert a pathname without extension to a * fully qualified classname. For example <tt>org/apache/Whatever</tt> will * be converted to <tt>org.apache.Whatever</tt> * @param filename the filename to "convert" to a classname. * @return the classname matching the filename. */	TokenNameCOMMENT_JAVADOC	 Convenient method to convert a pathname without extension to a fully qualified classname. For example <tt>org/apache/Whatever</tt> will be converted to <tt>org.apache.Whatever</tt> @param filename the filename to "convert" to a classname. @return the classname matching the filename. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
javaToClass	TokenNameIdentifier	 java To Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a <tt>JUnitTest</tt> that has the same property as this * <tt>BatchTest</tt> instance. * @param classname the name of the class that should be run as a * <tt>JUnitTest</tt>. It must be a fully qualified name. * @return the <tt>JUnitTest</tt> over the given classname. */	TokenNameCOMMENT_JAVADOC	 Create a <tt>JUnitTest</tt> that has the same property as this <tt>BatchTest</tt> instance. @param classname the name of the class that should be run as a <tt>JUnitTest</tt>. It must be a fully qualified name. @return the <tt>JUnitTest</tt> over the given classname. 
private	TokenNameprivate	
JUnitTest	TokenNameIdentifier	 J Unit Test
createJUnitTest	TokenNameIdentifier	 create J Unit Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JUnitTest	TokenNameIdentifier	 J Unit Test
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
new	TokenNamenew	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setHaltonerror	TokenNameIdentifier	 set Haltonerror
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
haltOnError	TokenNameIdentifier	 halt On Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setHaltonfailure	TokenNameIdentifier	 set Haltonfailure
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
haltOnFail	TokenNameIdentifier	 halt On Fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setFiltertrace	TokenNameIdentifier	 set Filtertrace
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
filtertrace	TokenNameIdentifier	 filtertrace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setFork	TokenNameIdentifier	 set Fork
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fork	TokenNameIdentifier	 fork
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
getIfCondition	TokenNameIdentifier	 get If Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
getUnlessCondition	TokenNameIdentifier	 get Unless Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
destDir	TokenNameIdentifier	 dest Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setFailureProperty	TokenNameIdentifier	 set Failure Property
(	TokenNameLPAREN	
failureProperty	TokenNameIdentifier	 failure Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
setErrorProperty	TokenNameIdentifier	 set Error Property
(	TokenNameLPAREN	
errorProperty	TokenNameIdentifier	 error Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
addFormatter	TokenNameIdentifier	 add Formatter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FormatterElement	TokenNameIdentifier	 Formatter Element
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
depend	TokenNameIdentifier	 depend
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
InputStream	TokenNameIdentifier	 Input Stream
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
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
FileUtils	TokenNameIdentifier	 File Utils
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
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
AbstractAnalyzer	TokenNameIdentifier	 Abstract Analyzer
;	TokenNameSEMICOLON	
/** * An analyzer which uses the depend task's bytecode classes to analyze * dependencies * */	TokenNameCOMMENT_JAVADOC	 An analyzer which uses the depend task's bytecode classes to analyze dependencies 
public	TokenNamepublic	
class	TokenNameclass	
AntAnalyzer	TokenNameIdentifier	 Ant Analyzer
extends	TokenNameextends	
AbstractAnalyzer	TokenNameIdentifier	 Abstract Analyzer
{	TokenNameLBRACE	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
AntAnalyzer	TokenNameIdentifier	 Ant Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Determine the dependencies of the configured root classes. * * @param files a vector to be populated with the files which contain * the dependency classes * @param classes a vector to be populated with the names of the * dependency classes. */	TokenNameCOMMENT_JAVADOC	 Determine the dependencies of the configured root classes. * @param files a vector to be populated with the files which contain the dependency classes @param classes a vector to be populated with the names of the dependency classes. 
protected	TokenNameprotected	
void	TokenNamevoid	
determineDependencies	TokenNameIdentifier	 determine Dependencies
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
classes	TokenNameIdentifier	 classes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we get the root classes and build up a set of 	TokenNameCOMMENT_LINE	we get the root classes and build up a set of 
// classes upon which they depend 	TokenNameCOMMENT_LINE	classes upon which they depend 
Hashtable	TokenNameIdentifier	 Hashtable
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
containers	TokenNameIdentifier	 containers
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
toAnalyze	TokenNameIdentifier	 to Analyze
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getRootClasses	TokenNameIdentifier	 get Root Classes
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
classname	TokenNameIdentifier	 classname
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
toAnalyze	TokenNameIdentifier	 to Analyze
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxCount	TokenNameIdentifier	 max Count
=	TokenNameEQUAL	
isClosureRequired	TokenNameIdentifier	 is Closure Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
MAX_LOOPS	TokenNameIdentifier	 MAX  LOOPS
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
analyzedDeps	TokenNameIdentifier	 analyzed Deps
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
toAnalyze	TokenNameIdentifier	 to Analyze
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
<	TokenNameLESS	
maxCount	TokenNameIdentifier	 max Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
analyzedDeps	TokenNameIdentifier	 analyzed Deps
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
toAnalyze	TokenNameIdentifier	 to Analyze
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
classname	TokenNameIdentifier	 classname
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
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
getClassContainer	TokenNameIdentifier	 get Class Container
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
containers	TokenNameIdentifier	 containers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipFile	TokenNameIdentifier	 Zip File
zipFile	TokenNameIdentifier	 zip File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
inStream	TokenNameIdentifier	 in Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inStream	TokenNameIdentifier	 in Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
zipFile	TokenNameIdentifier	 zip File
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
entryName	TokenNameIdentifier	 entry Name
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
entryName	TokenNameIdentifier	 entry Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inStream	TokenNameIdentifier	 in Stream
=	TokenNameEQUAL	
zipFile	TokenNameIdentifier	 zip File
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ClassFile	TokenNameIdentifier	 Class File
classFile	TokenNameIdentifier	 class File
=	TokenNameEQUAL	
new	TokenNamenew	
ClassFile	TokenNameIdentifier	 Class File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classFile	TokenNameIdentifier	 class File
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
dependencyList	TokenNameIdentifier	 dependency List
=	TokenNameEQUAL	
classFile	TokenNameIdentifier	 class File
.	TokenNameDOT	
getClassRefs	TokenNameIdentifier	 get Class Refs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
depEnum	TokenNameIdentifier	 dep Enum
=	TokenNameEQUAL	
dependencyList	TokenNameIdentifier	 dependency List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
depEnum	TokenNameIdentifier	 dep Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
dependency	TokenNameIdentifier	 dependency
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
depEnum	TokenNameIdentifier	 dep Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
analyzedDeps	TokenNameIdentifier	 analyzed Deps
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
,	TokenNameCOMMA	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
inStream	TokenNameIdentifier	 in Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zipFile	TokenNameIdentifier	 zip File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zipFile	TokenNameIdentifier	 zip File
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
toAnalyze	TokenNameIdentifier	 to Analyze
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now recover all the dependencies collected and add to the list. 	TokenNameCOMMENT_LINE	now recover all the dependencies collected and add to the list. 
Enumeration	TokenNameIdentifier	 Enumeration
depsEnum	TokenNameIdentifier	 deps Enum
=	TokenNameEQUAL	
analyzedDeps	TokenNameIdentifier	 analyzed Deps
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
depsEnum	TokenNameIdentifier	 deps Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
depsEnum	TokenNameIdentifier	 deps Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toAnalyze	TokenNameIdentifier	 to Analyze
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// pick up the last round of dependencies that were determined 	TokenNameCOMMENT_LINE	pick up the last round of dependencies that were determined 
Enumeration	TokenNameIdentifier	 Enumeration
depsEnum	TokenNameIdentifier	 deps Enum
=	TokenNameEQUAL	
analyzedDeps	TokenNameIdentifier	 analyzed Deps
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
depsEnum	TokenNameIdentifier	 deps Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
depsEnum	TokenNameIdentifier	 deps Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
containers	TokenNameIdentifier	 containers
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
classes	TokenNameIdentifier	 classes
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
dependencies	TokenNameIdentifier	 dependencies
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
classes	TokenNameIdentifier	 classes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Indicate if this analyzer can determine dependent files. * * @return true if the analyzer provides dependency file information. */	TokenNameCOMMENT_JAVADOC	 Indicate if this analyzer can determine dependent files. * @return true if the analyzer provides dependency file information. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
supportsFileDependencies	TokenNameIdentifier	 supports File Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

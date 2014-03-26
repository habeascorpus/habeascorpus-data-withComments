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
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
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
IOException	TokenNameIdentifier	 IO Exception
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
ClassParser	TokenNameIdentifier	 Class Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
JavaClass	TokenNameIdentifier	 Java Class
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
AbstractAnalyzer	TokenNameIdentifier	 Abstract Analyzer
;	TokenNameSEMICOLON	
/** * A dependency analyzer which returns superclass and superinterface * dependencies. * */	TokenNameCOMMENT_JAVADOC	 A dependency analyzer which returns superclass and superinterface dependencies. 
public	TokenNamepublic	
class	TokenNameclass	
AncestorAnalyzer	TokenNameIdentifier	 Ancestor Analyzer
extends	TokenNameextends	
AbstractAnalyzer	TokenNameIdentifier	 Abstract Analyzer
{	TokenNameLBRACE	
/** * Default constructor * * Causes the BCEL classes to load to ensure BCEL dependencies can * be satisfied */	TokenNameCOMMENT_JAVADOC	 Default constructor * Causes the BCEL classes to load to ensure BCEL dependencies can be satisfied 
public	TokenNamepublic	
AncestorAnalyzer	TokenNameIdentifier	 Ancestor Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// force BCEL classes to load now 	TokenNameCOMMENT_LINE	force BCEL classes to load now 
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
ClassParser	TokenNameIdentifier	 Class Parser
(	TokenNameLPAREN	
"force"	TokenNameStringLiteral	force
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// all released versions of BCEL may throw an IOException 	TokenNameCOMMENT_LINE	all released versions of BCEL may throw an IOException 
// here, but BCEL's trunk does no longer declare to do so 	TokenNameCOMMENT_LINE	here, but BCEL's trunk does no longer declare to do so 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
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
// ignore IOException like we've always done 	TokenNameCOMMENT_LINE	ignore IOException like we've always done 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determine the dependencies of the configured root classes. * * @param files a vector to be populated with the files which contain * the dependency classes * @param classes a vector to be populated with the names of the * depencency classes. */	TokenNameCOMMENT_JAVADOC	 Determine the dependencies of the configured root classes. * @param files a vector to be populated with the files which contain the dependency classes @param classes a vector to be populated with the names of the depencency classes. 
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
Hashtable	TokenNameIdentifier	 Hashtable
nextAnalyze	TokenNameIdentifier	 next Analyze
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
2	TokenNameIntegerLiteral	
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
nextAnalyze	TokenNameIdentifier	 next Analyze
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
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
ClassParser	TokenNameIdentifier	 Class Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
ClassParser	TokenNameIdentifier	 Class Parser
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
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
ClassParser	TokenNameIdentifier	 Class Parser
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JavaClass	TokenNameIdentifier	 Java Class
javaClass	TokenNameIdentifier	 java Class
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
interfaces	TokenNameIdentifier	 interfaces
=	TokenNameEQUAL	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
getInterfaceNames	TokenNameIdentifier	 get Interface Names
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
interfaces	TokenNameIdentifier	 interfaces
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
interfaceName	TokenNameIdentifier	 interface Name
=	TokenNameEQUAL	
interfaces	TokenNameIdentifier	 interfaces
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
interfaceName	TokenNameIdentifier	 interface Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextAnalyze	TokenNameIdentifier	 next Analyze
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
interfaceName	TokenNameIdentifier	 interface Name
,	TokenNameCOMMA	
interfaceName	TokenNameIdentifier	 interface Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
isClass	TokenNameIdentifier	 is Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
superClass	TokenNameIdentifier	 super Class
=	TokenNameEQUAL	
javaClass	TokenNameIdentifier	 java Class
.	TokenNameDOT	
getSuperclassName	TokenNameIdentifier	 get Superclass Name
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
superClass	TokenNameIdentifier	 super Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextAnalyze	TokenNameIdentifier	 next Analyze
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
superClass	TokenNameIdentifier	 super Class
,	TokenNameCOMMA	
superClass	TokenNameIdentifier	 super Class
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
Hashtable	TokenNameIdentifier	 Hashtable
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
toAnalyze	TokenNameIdentifier	 to Analyze
;	TokenNameSEMICOLON	
toAnalyze	TokenNameIdentifier	 to Analyze
=	TokenNameEQUAL	
nextAnalyze	TokenNameIdentifier	 next Analyze
;	TokenNameSEMICOLON	
nextAnalyze	TokenNameIdentifier	 next Analyze
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
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

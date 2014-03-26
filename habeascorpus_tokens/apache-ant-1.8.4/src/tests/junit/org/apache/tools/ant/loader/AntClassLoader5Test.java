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
loader	TokenNameIdentifier	 loader
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CollectionUtils	TokenNameIdentifier	 Collection Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
AntClassLoader5Test	TokenNameIdentifier	 Ant Class Loader5 Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Asserts that getResources won't return resources that cannot be * seen by AntClassLoader but by ClassLoader.this.parent. * * @see https://issues.apache.org/bugzilla/show_bug.cgi?id=46752 */	TokenNameCOMMENT_JAVADOC	 Asserts that getResources won't return resources that cannot be seen by AntClassLoader but by ClassLoader.this.parent. * @see https://issues.apache.org/bugzilla/show_bug.cgi?id=46752 
public	TokenNamepublic	
void	TokenNamevoid	
testGetResources	TokenNameIdentifier	 test Get Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
new	TokenNamenew	
AntClassLoader5	TokenNameIdentifier	 Ant Class Loader5
(	TokenNameLPAREN	
new	TokenNamenew	
EmptyLoader	TokenNameIdentifier	 Empty Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// double check using system classloader as parent 	TokenNameCOMMENT_LINE	double check using system classloader as parent 
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
new	TokenNamenew	
AntClassLoader5	TokenNameIdentifier	 Ant Class Loader5
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetResourcesUsingFactory	TokenNameIdentifier	 test Get Resources Using Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
acl	TokenNameIdentifier	 acl
=	TokenNameEQUAL	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
.	TokenNameDOT	
newAntClassLoader	TokenNameIdentifier	 new Ant Class Loader
(	TokenNameLPAREN	
new	TokenNamenew	
EmptyLoader	TokenNameIdentifier	 Empty Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
acl	TokenNameIdentifier	 acl
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
"META-INF/MANIFEST.MF"	TokenNameStringLiteral	META-INF/MANIFEST.MF
)	TokenNameRPAREN	
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
EmptyLoader	TokenNameIdentifier	 Empty Loader
extends	TokenNameextends	
ClassLoader	TokenNameIdentifier	 Class Loader
{	TokenNameLBRACE	
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CollectionUtils	TokenNameIdentifier	 Collection Utils
.	TokenNameDOT	
EmptyEnumeration	TokenNameIdentifier	 Empty Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

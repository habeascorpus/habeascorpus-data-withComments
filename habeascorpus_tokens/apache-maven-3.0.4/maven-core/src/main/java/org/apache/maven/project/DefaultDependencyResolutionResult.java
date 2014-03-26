package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
Dependency	TokenNameIdentifier	 Dependency
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
graph	TokenNameIdentifier	 graph
.	TokenNameDOT	
DependencyNode	TokenNameIdentifier	 Dependency Node
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
class	TokenNameclass	
DefaultDependencyResolutionResult	TokenNameIdentifier	 Default Dependency Resolution Result
implements	TokenNameimplements	
DependencyResolutionResult	TokenNameIdentifier	 Dependency Resolution Result
{	TokenNameLBRACE	
private	TokenNameprivate	
DependencyNode	TokenNameIdentifier	 Dependency Node
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
dependencies	TokenNameIdentifier	 dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
resolvedDependencies	TokenNameIdentifier	 resolved Dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
unresolvedDependencies	TokenNameIdentifier	 unresolved Dependencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
collectionErrors	TokenNameIdentifier	 collection Errors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>>	TokenNameRIGHT_SHIFT	
resolutionErrors	TokenNameIdentifier	 resolution Errors
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DependencyNode	TokenNameIdentifier	 Dependency Node
getDependencyGraph	TokenNameIdentifier	 get Dependency Graph
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDependencyGraph	TokenNameIdentifier	 set Dependency Graph
(	TokenNameLPAREN	
DependencyNode	TokenNameIdentifier	 Dependency Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dependencies	TokenNameIdentifier	 dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
getResolvedDependencies	TokenNameIdentifier	 get Resolved Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resolvedDependencies	TokenNameIdentifier	 resolved Dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addResolvedDependency	TokenNameIdentifier	 add Resolved Dependency
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolvedDependencies	TokenNameIdentifier	 resolved Dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dependency	TokenNameIdentifier	 Dependency
>	TokenNameGREATER	
getUnresolvedDependencies	TokenNameIdentifier	 get Unresolved Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unresolvedDependencies	TokenNameIdentifier	 unresolved Dependencies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
getCollectionErrors	TokenNameIdentifier	 get Collection Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
collectionErrors	TokenNameIdentifier	 collection Errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCollectionErrors	TokenNameIdentifier	 set Collection Errors
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
exceptions	TokenNameIdentifier	 exceptions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exceptions	TokenNameIdentifier	 exceptions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collectionErrors	TokenNameIdentifier	 collection Errors
=	TokenNameEQUAL	
exceptions	TokenNameIdentifier	 exceptions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collectionErrors	TokenNameIdentifier	 collection Errors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
getResolutionErrors	TokenNameIdentifier	 get Resolution Errors
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
resolutionErrors	TokenNameIdentifier	 resolution Errors
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
errors	TokenNameIdentifier	 errors
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
errors	TokenNameIdentifier	 errors
:	TokenNameCOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setResolutionErrors	TokenNameIdentifier	 set Resolution Errors
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dependencies	TokenNameIdentifier	 dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unresolvedDependencies	TokenNameIdentifier	 unresolved Dependencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolutionErrors	TokenNameIdentifier	 resolution Errors
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
,	TokenNameCOMMA	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

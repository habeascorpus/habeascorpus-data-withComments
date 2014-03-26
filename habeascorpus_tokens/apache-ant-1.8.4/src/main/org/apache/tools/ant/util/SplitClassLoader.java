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
Path	TokenNameIdentifier	 Path
;	TokenNameSEMICOLON	
/** * Specialized classloader for tasks that need finer grained control * over which classes are to be loaded via Ant's classloader and which * should not even if they are available. */	TokenNameCOMMENT_JAVADOC	 Specialized classloader for tasks that need finer grained control over which classes are to be loaded via Ant's classloader and which should not even if they are available. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SplitClassLoader	TokenNameIdentifier	 Split Class Loader
extends	TokenNameextends	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitClasses	TokenNameIdentifier	 split Classes
;	TokenNameSEMICOLON	
/** * @param splitClasses classes contained herin will not be loaded * via Ant's classloader */	TokenNameCOMMENT_JAVADOC	 @param splitClasses classes contained herin will not be loaded via Ant's classloader 
public	TokenNamepublic	
SplitClassLoader	TokenNameIdentifier	 Split Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitClasses	TokenNameIdentifier	 split Classes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
splitClasses	TokenNameIdentifier	 split Classes
=	TokenNameEQUAL	
splitClasses	TokenNameIdentifier	 split Classes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// forceLoadClass is not convenient here since it would not 	TokenNameCOMMENT_LINE	forceLoadClass is not convenient here since it would not 
// properly deal with inner classes of these classes. 	TokenNameCOMMENT_LINE	properly deal with inner classes of these classes. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
Class	TokenNameIdentifier	 Class
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
boolean	TokenNameboolean	
resolve	TokenNameIdentifier	 resolve
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
theClass	TokenNameIdentifier	 the Class
=	TokenNameEQUAL	
findLoadedClass	TokenNameIdentifier	 find Loaded Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theClass	TokenNameIdentifier	 the Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
theClass	TokenNameIdentifier	 the Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSplit	TokenNameIdentifier	 is Split
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theClass	TokenNameIdentifier	 the Class
=	TokenNameEQUAL	
findClass	TokenNameIdentifier	 find Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resolve	TokenNameIdentifier	 resolve
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolveClass	TokenNameIdentifier	 resolve Class
(	TokenNameLPAREN	
theClass	TokenNameIdentifier	 the Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
theClass	TokenNameIdentifier	 the Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
resolve	TokenNameIdentifier	 resolve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isSplit	TokenNameIdentifier	 is Split
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
simplename	TokenNameIdentifier	 simplename
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
splitClasses	TokenNameIdentifier	 split Classes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
simplename	TokenNameIdentifier	 simplename
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
splitClasses	TokenNameIdentifier	 split Classes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
simplename	TokenNameIdentifier	 simplename
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
splitClasses	TokenNameIdentifier	 split Classes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
'$'	TokenNameCharacterLiteral	
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
}	TokenNameRBRACE	

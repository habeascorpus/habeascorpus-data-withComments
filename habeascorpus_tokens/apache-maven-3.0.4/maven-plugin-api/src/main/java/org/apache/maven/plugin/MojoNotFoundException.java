package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MojoNotFoundException	TokenNameIdentifier	 Mojo Not Found Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MojoNotFoundException	TokenNameIdentifier	 Mojo Not Found Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
toMessage	TokenNameIdentifier	 to Message
(	TokenNameLPAREN	
goal	TokenNameIdentifier	 goal
,	TokenNameCOMMA	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
goal	TokenNameIdentifier	 goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
getPluginDescriptor	TokenNameIdentifier	 get Plugin Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toMessage	TokenNameIdentifier	 to Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
,	TokenNameCOMMA	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Could not find goal '"	TokenNameStringLiteral	Could not find goal '
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
goal	TokenNameIdentifier	 goal
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" in plugin "	TokenNameStringLiteral	 in plugin 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" among available goals "	TokenNameStringLiteral	 among available goals 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
>	TokenNameGREATER	
mojos	TokenNameIdentifier	 mojos
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
.	TokenNameDOT	
getMojos	TokenNameIdentifier	 get Mojos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojos	TokenNameIdentifier	 mojos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
mojos	TokenNameIdentifier	 mojos
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojo	TokenNameIdentifier	 mojo
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
.	TokenNameDOT	
getGoal	TokenNameIdentifier	 get Goal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

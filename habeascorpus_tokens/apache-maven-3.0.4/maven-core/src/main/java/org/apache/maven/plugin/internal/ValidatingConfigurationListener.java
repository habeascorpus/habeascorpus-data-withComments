package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
ConfigurationListener	TokenNameIdentifier	 Configuration Listener
;	TokenNameSEMICOLON	
/** * A configuration listener to help validate the plugin configuration. For instance, check for required but missing * parameters. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A configuration listener to help validate the plugin configuration. For instance, check for required but missing parameters. * @author Benjamin Bentmann 
class	TokenNameclass	
ValidatingConfigurationListener	TokenNameIdentifier	 Validating Configuration Listener
implements	TokenNameimplements	
ConfigurationListener	TokenNameIdentifier	 Configuration Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
mojo	TokenNameIdentifier	 mojo
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConfigurationListener	TokenNameIdentifier	 Configuration Listener
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
missingParameters	TokenNameIdentifier	 missing Parameters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ValidatingConfigurationListener	TokenNameIdentifier	 Validating Configuration Listener
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
mojo	TokenNameIdentifier	 mojo
,	TokenNameCOMMA	
MojoDescriptor	TokenNameIdentifier	 Mojo Descriptor
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
,	TokenNameCOMMA	
ConfigurationListener	TokenNameIdentifier	 Configuration Listener
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mojo	TokenNameIdentifier	 mojo
=	TokenNameEQUAL	
mojo	TokenNameIdentifier	 mojo
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
missingParameters	TokenNameIdentifier	 missing Parameters
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Parameter	TokenNameIdentifier	 Parameter
param	TokenNameIdentifier	 param
:	TokenNameCOLON	
mojoDescriptor	TokenNameIdentifier	 mojo Descriptor
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
missingParameters	TokenNameIdentifier	 missing Parameters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Parameter	TokenNameIdentifier	 Parameter
>	TokenNameGREATER	
getMissingParameters	TokenNameIdentifier	 get Missing Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
missingParameters	TokenNameIdentifier	 missing Parameters
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
notifyFieldChangeUsingSetter	TokenNameIdentifier	 notify Field Change Using Setter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
notifyFieldChangeUsingSetter	TokenNameIdentifier	 notify Field Change Using Setter
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
notifyFieldChangeUsingReflection	TokenNameIdentifier	 notify Field Change Using Reflection
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
notifyFieldChangeUsingReflection	TokenNameIdentifier	 notify Field Change Using Reflection
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mojo	TokenNameIdentifier	 mojo
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
missingParameters	TokenNameIdentifier	 missing Parameters
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

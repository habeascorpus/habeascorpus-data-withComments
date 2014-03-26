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
condition	TokenNameIdentifier	 condition
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
ComponentHelper	TokenNameIdentifier	 Component Helper
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
ProjectHelper	TokenNameIdentifier	 Project Helper
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
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
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
/** * looks for a task or other Ant type that exists. Existence is defined as * the type is defined, and its implementation class is present. This * will work for datatypes and preset, script and macro definitions. */	TokenNameCOMMENT_JAVADOC	 looks for a task or other Ant type that exists. Existence is defined as the type is defined, and its implementation class is present. This will work for datatypes and preset, script and macro definitions. 
public	TokenNamepublic	
class	TokenNameclass	
TypeFound	TokenNameIdentifier	 Type Found
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** * the task or other type to look for * @param name the name of the type */	TokenNameCOMMENT_JAVADOC	 the task or other type to look for @param name the name of the type 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The URI for this definition. * @param uri the namespace URI. If this is not set, use the * default ant namespace. */	TokenNameCOMMENT_JAVADOC	 The URI for this definition. @param uri the namespace URI. If this is not set, use the default ant namespace. 
public	TokenNamepublic	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test for a task or other ant type existing in the current project * @param typename the name of the type * @return true if the typename exists */	TokenNameCOMMENT_JAVADOC	 test for a task or other ant type existing in the current project @param typename the name of the type @return true if the typename exists 
protected	TokenNameprotected	
boolean	TokenNameboolean	
doesTypeExist	TokenNameIdentifier	 does Type Exist
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typename	TokenNameIdentifier	 typename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ComponentHelper	TokenNameIdentifier	 Component Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
ComponentHelper	TokenNameIdentifier	 Component Helper
.	TokenNameDOT	
getComponentHelper	TokenNameIdentifier	 get Component Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
componentName	TokenNameIdentifier	 component Name
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
typename	TokenNameIdentifier	 typename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getDefinition	TokenNameIdentifier	 get Definition
(	TokenNameLPAREN	
componentName	TokenNameIdentifier	 component Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now verify that the class has an implementation 	TokenNameCOMMENT_LINE	now verify that the class has an implementation 
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getExposedClass	TokenNameIdentifier	 get Exposed Class
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
diagnoseCreationFailure	TokenNameIdentifier	 diagnose Creation Failure
(	TokenNameLPAREN	
componentName	TokenNameIdentifier	 component Name
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is this condition true? * @return true if the condition is true * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 Is this condition true? @return true if the condition is true @exception BuildException if an error occurs 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No type specified"	TokenNameStringLiteral	No type specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doesTypeExist	TokenNameIdentifier	 does Type Exist
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

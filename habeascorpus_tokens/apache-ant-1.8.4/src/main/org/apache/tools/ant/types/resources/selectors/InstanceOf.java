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
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
/** * InstanceOf ResourceSelector. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 InstanceOf ResourceSelector. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
InstanceOf	TokenNameIdentifier	 Instance Of
implements	TokenNameimplements	
ResourceSelector	TokenNameIdentifier	 Resource Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ONE_ONLY	TokenNameIdentifier	 ONE  ONLY
=	TokenNameEQUAL	
"Exactly one of class|type must be set."	TokenNameStringLiteral	Exactly one of class|type must be set.
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** * Set the Project instance for this InstanceOf selector. * @param p the Project instance used for type comparisons. */	TokenNameCOMMENT_JAVADOC	 Set the Project instance for this InstanceOf selector. @param p the Project instance used for type comparisons. 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the class to compare against. * @param c the class. */	TokenNameCOMMENT_JAVADOC	 Set the class to compare against. @param c the class. 
public	TokenNamepublic	
void	TokenNamevoid	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The class attribute has already been set."	TokenNameStringLiteral	The class attribute has already been set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Ant type to compare against. * @param s the type name. */	TokenNameCOMMENT_JAVADOC	 Set the Ant type to compare against. @param s the type name. 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the URI in which the Ant type, if specified, should be defined. * @param u the URI. */	TokenNameCOMMENT_JAVADOC	 Set the URI in which the Ant type, if specified, should be defined. @param u the URI. 
public	TokenNamepublic	
void	TokenNamevoid	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the comparison class. * @return the Class object. */	TokenNameCOMMENT_JAVADOC	 Get the comparison class. @return the Class object. 
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getCheckClass	TokenNameIdentifier	 get Check Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the comparison type. * @return the String typename. */	TokenNameCOMMENT_JAVADOC	 Get the comparison type. @return the String typename. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type's URI. * @return the String URI. */	TokenNameCOMMENT_JAVADOC	 Get the type's URI. @return the String URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if this Resource is selected. * @param r the Resource to check. * @return whether the Resource was selected. * @throws BuildException if an error occurs. */	TokenNameCOMMENT_JAVADOC	 Return true if this Resource is selected. @param r the Resource to check. @return whether the Resource was selected. @throws BuildException if an error occurs. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ONE_ONLY	TokenNameIdentifier	 ONE  ONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No project set for InstanceOf ResourceSelector; "	TokenNameStringLiteral	No project set for InstanceOf ResourceSelector; 
+	TokenNamePLUS	
"the type attribute is invalid."	TokenNameStringLiteral	the type attribute is invalid.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AntTypeDefinition	TokenNameIdentifier	 Ant Type Definition
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
ComponentHelper	TokenNameIdentifier	 Component Helper
.	TokenNameDOT	
getComponentHelper	TokenNameIdentifier	 get Component Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefinition	TokenNameIdentifier	 get Definition
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"type "	TokenNameStringLiteral	type 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" not found."	TokenNameStringLiteral	 not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
innerGetTypeClass	TokenNameIdentifier	 inner Get Type Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
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
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

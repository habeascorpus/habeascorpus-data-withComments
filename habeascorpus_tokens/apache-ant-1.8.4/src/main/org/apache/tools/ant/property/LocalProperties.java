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
property	TokenNameIdentifier	 property
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
PropertyHelper	TokenNameIdentifier	 Property Helper
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
MagicNames	TokenNameIdentifier	 Magic Names
;	TokenNameSEMICOLON	
/** * Thread local class containing local properties. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Thread local class containing local properties. @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
LocalProperties	TokenNameIdentifier	 Local Properties
extends	TokenNameextends	
InheritableThreadLocal	TokenNameIdentifier	 Inheritable Thread Local
implements	TokenNameimplements	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
PropertySetter	TokenNameIdentifier	 Property Setter
{	TokenNameLBRACE	
/** * Get a localproperties for the given project. * @param project the project to retieve the localproperties for. * @return the localproperties. */	TokenNameCOMMENT_JAVADOC	 Get a localproperties for the given project. @param project the project to retieve the localproperties for. @return the localproperties. 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
LocalProperties	TokenNameIdentifier	 Local Properties
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalProperties	TokenNameIdentifier	 Local Properties
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalProperties	TokenNameIdentifier	 Local Properties
)	TokenNameRPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_LOCAL_PROPERTIES	TokenNameIdentifier	 REFID  LOCAL  PROPERTIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
LocalProperties	TokenNameIdentifier	 Local Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_LOCAL_PROPERTIES	TokenNameIdentifier	 REFID  LOCAL  PROPERTIES
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// Thread stuff 	TokenNameCOMMENT_LINE	Thread stuff 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Construct a new LocalProperties object. */	TokenNameCOMMENT_JAVADOC	 Construct a new LocalProperties object. 
private	TokenNameprivate	
LocalProperties	TokenNameIdentifier	 Local Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the initial value. * @return a new localproperties stack. */	TokenNameCOMMENT_JAVADOC	 Get the initial value. @return a new localproperties stack. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
)	TokenNameRPAREN	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// Local property adding and scoping 	TokenNameCOMMENT_LINE	Local property adding and scoping 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Add a local property to the current scope. * @param property the property name to add. */	TokenNameCOMMENT_JAVADOC	 Add a local property to the current scope. @param property the property name to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addLocal	TokenNameIdentifier	 add Local
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addLocal	TokenNameIdentifier	 add Local
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** enter the scope */	TokenNameCOMMENT_JAVADOC	 enter the scope 
public	TokenNamepublic	
void	TokenNamevoid	
enterScope	TokenNameIdentifier	 enter Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
enterScope	TokenNameIdentifier	 enter Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** exit the scope */	TokenNameCOMMENT_JAVADOC	 exit the scope 
public	TokenNamepublic	
void	TokenNamevoid	
exitScope	TokenNameIdentifier	 exit Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exitScope	TokenNameIdentifier	 exit Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// Copy - used in parallel to make a new stack 	TokenNameCOMMENT_LINE	Copy - used in parallel to make a new stack 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Copy the stack for a parallel thread. * To be called from the parallel thread itself. */	TokenNameCOMMENT_JAVADOC	 Copy the stack for a parallel thread. To be called from the parallel thread itself. 
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// PropertyHelper delegate methods 	TokenNameCOMMENT_LINE	PropertyHelper delegate methods 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Evaluate a property. * @param property the property's String "identifier". * @param helper the invoking PropertyHelper. * @return Object value. */	TokenNameCOMMENT_JAVADOC	 Evaluate a property. @param property the property's String "identifier". @param helper the invoking PropertyHelper. @return Object value. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
helper	TokenNameIdentifier	 helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
helper	TokenNameIdentifier	 helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a *new" property. * @param property the property's String "identifier". * @param value the value to set. * @param propertyHelper the invoking PropertyHelper. * @return true if this entity 'owns' the property. */	TokenNameCOMMENT_JAVADOC	 Set a *new" property. @param property the property's String "identifier". @param value the value to set. @param propertyHelper the invoking PropertyHelper. @return true if this entity 'owns' the property. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setNew	TokenNameIdentifier	 set New
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNew	TokenNameIdentifier	 set New
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a property. * @param property the property's String "identifier". * @param value the value to set. * @param propertyHelper the invoking PropertyHelper. * @return true if this entity 'owns' the property. */	TokenNameCOMMENT_JAVADOC	 Set a property. @param property the property's String "identifier". @param value the value to set. @param propertyHelper the invoking PropertyHelper. @return true if this entity 'owns' the property. 
public	TokenNamepublic	
boolean	TokenNameboolean	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
PreSetDef	TokenNameIdentifier	 Pre Set Def
;	TokenNameSEMICOLON	
/** * Wrapper class that holds all the information necessary to create a task * or data type that did not exist when Ant started, or one which * has had its definition updated to use a different implementation class. * */	TokenNameCOMMENT_JAVADOC	 Wrapper class that holds all the information necessary to create a task or data type that did not exist when Ant started, or one which has had its definition updated to use a different implementation class. 
public	TokenNamepublic	
class	TokenNameclass	
UnknownElement	TokenNameIdentifier	 Unknown Element
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * Holds the name of the task/type or nested child element of a * task/type that hasn't been defined at parser time or has * been redefined since original creation. */	TokenNameCOMMENT_JAVADOC	 Holds the name of the task/type or nested child element of a task/type that hasn't been defined at parser time or has been redefined since original creation. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
;	TokenNameSEMICOLON	
/** * Holds the namespace of the element. */	TokenNameCOMMENT_JAVADOC	 Holds the namespace of the element. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Holds the namespace qname of the element. */	TokenNameCOMMENT_JAVADOC	 Holds the namespace qname of the element. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
/** * The real object after it has been loaded. */	TokenNameCOMMENT_JAVADOC	 The real object after it has been loaded. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
realThing	TokenNameIdentifier	 real Thing
;	TokenNameSEMICOLON	
/** * List of child elements (UnknownElements). */	TokenNameCOMMENT_JAVADOC	 List of child elements (UnknownElements). 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
/*<UnknownElement>*/	TokenNameCOMMENT_BLOCK	<UnknownElement>
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Specifies if a predefined definition has been done */	TokenNameCOMMENT_JAVADOC	 Specifies if a predefined definition has been done 
private	TokenNameprivate	
boolean	TokenNameboolean	
presetDefed	TokenNameIdentifier	 preset Defed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Creates an UnknownElement for the given element name. * * @param elementName The name of the unknown element. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Creates an UnknownElement for the given element name. * @param elementName The name of the unknown element. Must not be <code>null</code>. 
public	TokenNamepublic	
UnknownElement	TokenNameIdentifier	 Unknown Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
elementName	TokenNameIdentifier	 element Name
=	TokenNameEQUAL	
elementName	TokenNameIdentifier	 element Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the list of nested UnknownElements for this UnknownElement. */	TokenNameCOMMENT_JAVADOC	 @return the list of nested UnknownElements for this UnknownElement. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name of the XML element which generated this unknown * element. * * @return the name of the XML element which generated this unknown * element. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the XML element which generated this unknown element. * @return the name of the XML element which generated this unknown element. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elementName	TokenNameIdentifier	 element Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the namespace of the XML element associated with this component. * * @return Namespace URI used in the xmlns declaration. */	TokenNameCOMMENT_JAVADOC	 Return the namespace of the XML element associated with this component. * @return Namespace URI used in the xmlns declaration. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the namespace of the XML element associated with this component. * This method is typically called by the XML processor. * If the namespace is "ant:current", the component helper * is used to get the current antlib uri. * * @param namespace URI used in the xmlns declaration. */	TokenNameCOMMENT_JAVADOC	 Set the namespace of the XML element associated with this component. This method is typically called by the XML processor. If the namespace is "ant:current", the component helper is used to get the current antlib uri. * @param namespace URI used in the xmlns declaration. 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
ANT_CURRENT_URI	TokenNameIdentifier	 ANT  CURRENT  URI
)	TokenNameRPAREN	
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
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getCurrentAntlibUri	TokenNameIdentifier	 get Current Antlib Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the qname of the XML element associated with this component. * * @return namespace Qname used in the element declaration. */	TokenNameCOMMENT_JAVADOC	 Return the qname of the XML element associated with this component. * @return namespace Qname used in the element declaration. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the namespace qname of the XML element. * This method is typically called by the XML processor. * * @param qname the qualified name of the element */	TokenNameCOMMENT_JAVADOC	 Set the namespace qname of the XML element. This method is typically called by the XML processor. * @param qname the qualified name of the element 
public	TokenNamepublic	
void	TokenNamevoid	
setQName	TokenNameIdentifier	 set Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the RuntimeConfigurable instance for this UnknownElement, containing * the configuration information. * * @return the configuration info. */	TokenNameCOMMENT_JAVADOC	 Get the RuntimeConfigurable instance for this UnknownElement, containing the configuration information. * @return the configuration info. 
public	TokenNamepublic	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the real object instance and child elements, then configures * the attributes and text of the real object. This unknown element * is then replaced with the real object in the containing target's list * of children. * * @exception BuildException if the configuration fails */	TokenNameCOMMENT_JAVADOC	 Creates the real object instance and child elements, then configures the attributes and text of the real object. This unknown element is then replaced with the real object in the containing target's list of children. * @exception BuildException if the configuration fails 
public	TokenNamepublic	
void	TokenNamevoid	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
makeObject	TokenNameIdentifier	 make Object
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Configure the given object from this UnknownElement * * @param realObject the real object this UnknownElement is representing. * */	TokenNameCOMMENT_JAVADOC	 Configure the given object from this UnknownElement * @param realObject the real object this UnknownElement is representing. 
public	TokenNamepublic	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
realObject	TokenNameIdentifier	 real Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realThing	TokenNameIdentifier	 real Thing
=	TokenNameEQUAL	
realObject	TokenNameIdentifier	 real Object
;	TokenNameSEMICOLON	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setRuntimeConfigurableWrapper	TokenNameIdentifier	 set Runtime Configurable Wrapper
(	TokenNameLPAREN	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For Script example that modifies id'ed tasks in other 	TokenNameCOMMENT_LINE	For Script example that modifies id'ed tasks in other 
// targets to work. *very* Ugly 	TokenNameCOMMENT_LINE	targets to work. *very* Ugly 
// The reference is replaced by RuntimeConfigurable 	TokenNameCOMMENT_LINE	The reference is replaced by RuntimeConfigurable 
if	TokenNameif	
(	TokenNameLPAREN	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// configure attributes of the object and it's children. If it is 	TokenNameCOMMENT_LINE	configure attributes of the object and it's children. If it is 
// a task container, defer the configuration till the task container 	TokenNameCOMMENT_LINE	a task container, defer the configuration till the task container 
// attempts to use the task 	TokenNameCOMMENT_LINE	attempts to use the task 
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
handleChildren	TokenNameIdentifier	 handle Children
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
,	TokenNameCOMMA	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles output sent to System.out by this task or its real task. * * @param output The output to log. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Handles output sent to System.out by this task or its real task. * @param output The output to log. Should not be <code>null</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleOutput	TokenNameIdentifier	 handle Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delegate to realThing if present and if it as task. * @see Task#handleInput(byte[], int, int) * @param buffer the buffer into which data is to be read. * @param offset the offset into the buffer at which data is stored. * @param length the amount of data to read. * * @return the number of bytes read. * * @exception IOException if the data cannot be read. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Delegate to realThing if present and if it as task. @see Task#handleInput(byte[], int, int) @param buffer the buffer into which data is to be read. @param offset the offset into the buffer at which data is stored. @param length the amount of data to read. * @return the number of bytes read. * @exception IOException if the data cannot be read. @since Ant 1.6 
protected	TokenNameprotected	
int	TokenNameint	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
handleInput	TokenNameIdentifier	 handle Input
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles output sent to System.out by this task or its real task. * * @param output The output to log. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Handles output sent to System.out by this task or its real task. * @param output The output to log. Should not be <code>null</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleFlush	TokenNameIdentifier	 handle Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles error output sent to System.err by this task or its real task. * * @param output The error output to log. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Handles error output sent to System.err by this task or its real task. * @param output The error output to log. Should not be <code>null</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleErrorOutput	TokenNameIdentifier	 handle Error Output
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Handles error output sent to System.err by this task or its real task. * * @param output The error output to log. Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Handles error output sent to System.err by this task or its real task. * @param output The error output to log. Should not be <code>null</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleErrorFlush	TokenNameIdentifier	 handle Error Flush
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Executes the real object if it's a task. If it's not a task * (e.g. a data type) then this method does nothing. */	TokenNameCOMMENT_JAVADOC	 Executes the real object if it's a task. If it's not a task (e.g. a data type) then this method does nothing. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// plain impossible to get here, maybeConfigure should 	TokenNameCOMMENT_LINE	plain impossible to get here, maybeConfigure should 
// have thrown an exception. 	TokenNameCOMMENT_LINE	have thrown an exception. 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not create task of type: "	TokenNameStringLiteral	Could not create task of type: 
+	TokenNamePLUS	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// Finished executing the task 	TokenNameCOMMENT_LINE	Finished executing the task 
// null it (unless it has an ID) to allow 	TokenNameCOMMENT_LINE	null it (unless it has an ID) to allow 
// GC do its job 	TokenNameCOMMENT_LINE	GC do its job 
// If this UE is used again, a new "realthing" will be made 	TokenNameCOMMENT_LINE	If this UE is used again, a new "realthing" will be made 
if	TokenNameif	
(	TokenNameLPAREN	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realThing	TokenNameIdentifier	 real Thing
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds a child element to this element. * * @param child The child element to add. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a child element to this element. * @param child The child element to add. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates child elements, creates children of the children * (recursively), and sets attributes of the child elements. * * @param parent The configured object for the parent. * Must not be <code>null</code>. * * @param parentWrapper The wrapper containing child wrappers * to be configured. Must not be <code>null</code> * if there are any children. * * @exception BuildException if the children cannot be configured. */	TokenNameCOMMENT_JAVADOC	 Creates child elements, creates children of the children (recursively), and sets attributes of the child elements. * @param parent The configured object for the parent. Must not be <code>null</code>. * @param parentWrapper The wrapper containing child wrappers to be configured. Must not be <code>null</code> if there are any children. * @exception BuildException if the children cannot be configured. 
protected	TokenNameprotected	
void	TokenNamevoid	
handleChildren	TokenNameIdentifier	 handle Children
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
parentWrapper	TokenNameIdentifier	 parent Wrapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
.	TokenNameDOT	
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
parentUri	TokenNameIdentifier	 parent Uri
=	TokenNameEQUAL	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
parentClass	TokenNameIdentifier	 parent Class
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parentClass	TokenNameIdentifier	 parent Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
childWrapper	TokenNameIdentifier	 child Wrapper
=	TokenNameEQUAL	
parentWrapper	TokenNameIdentifier	 parent Wrapper
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnknownElement	TokenNameIdentifier	 Unknown Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
handleChild	TokenNameIdentifier	 handle Child
(	TokenNameLPAREN	
parentUri	TokenNameIdentifier	 parent Uri
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
childWrapper	TokenNameIdentifier	 child Wrapper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
TaskContainer	TokenNameIdentifier	 Task Container
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
throwNotSupported	TokenNameIdentifier	 throw Not Supported
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// a task container - anything could happen - just add the 	TokenNameCOMMENT_LINE	a task container - anything could happen - just add the 
// child to the container 	TokenNameCOMMENT_LINE	child to the container 
TaskContainer	TokenNameIdentifier	 Task Container
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TaskContainer	TokenNameIdentifier	 Task Container
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedElementException	TokenNameIdentifier	 Unsupported Element Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
parentWrapper	TokenNameIdentifier	 parent Wrapper
.	TokenNameDOT	
getElementTag	TokenNameIdentifier	 get Element Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the nested ""	TokenNameStringLiteral	 doesn't support the nested "
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" element."	TokenNameStringLiteral	" element.
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return the component name - uses ProjectHelper#genComponentName() */	TokenNameCOMMENT_JAVADOC	 @return the component name - uses ProjectHelper#genComponentName() 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getComponentName	TokenNameIdentifier	 get Component Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is used then the realobject of the UE is a PreSetDefinition. * This is also used when a presetdef is used on a presetdef * The attributes, elements and text are applied to this * UE. * * @param u an UnknownElement containing the attributes, elements and text */	TokenNameCOMMENT_JAVADOC	 This is used then the realobject of the UE is a PreSetDefinition. This is also used when a presetdef is used on a presetdef The attributes, elements and text are applied to this UE. * @param u an UnknownElement containing the attributes, elements and text 
public	TokenNamepublic	
void	TokenNamevoid	
applyPreSet	TokenNameIdentifier	 apply Pre Set
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
presetDefed	TokenNameIdentifier	 preset Defed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Do the runtime 	TokenNameCOMMENT_LINE	Do the runtime 
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
applyPreSet	TokenNameIdentifier	 apply Pre Set
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
newChildren	TokenNameIdentifier	 new Children
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newChildren	TokenNameIdentifier	 new Children
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newChildren	TokenNameIdentifier	 new Children
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
newChildren	TokenNameIdentifier	 new Children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
presetDefed	TokenNameIdentifier	 preset Defed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a named task or data type. If the real object is a task, * it is configured up to the init() stage. * * @param ue The unknown element to create the real object for. * Must not be <code>null</code>. * @param w Ignored in this implementation. * * @return the task or data type represented by the given unknown element. */	TokenNameCOMMENT_JAVADOC	 Creates a named task or data type. If the real object is a task, it is configured up to the init() stage. * @param ue The unknown element to create the real object for. Must not be <code>null</code>. @param w Ignored in this implementation. * @return the task or data type represented by the given unknown element. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
makeObject	TokenNameIdentifier	 make Object
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
ue	TokenNameIdentifier	 ue
,	TokenNameCOMMA	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
w	TokenNameIdentifier	 w
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
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getComponentName	TokenNameIdentifier	 get Component Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
createComponent	TokenNameIdentifier	 create Component
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
,	TokenNameCOMMA	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
getNotFoundException	TokenNameIdentifier	 get Not Found Exception
(	TokenNameLPAREN	
"task or type"	TokenNameStringLiteral	task or type
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
PreSetDef	TokenNameIdentifier	 Pre Set Def
.	TokenNameDOT	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PreSetDef	TokenNameIdentifier	 Pre Set Def
.	TokenNameDOT	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PreSetDef	TokenNameIdentifier	 Pre Set Def
.	TokenNameDOT	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
getNotFoundException	TokenNameIdentifier	 get Not Found Exception
(	TokenNameLPAREN	
"preset "	TokenNameStringLiteral	preset 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getPreSets	TokenNameIdentifier	 get Pre Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getComponentName	TokenNameIdentifier	 get Component Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
applyPreSet	TokenNameIdentifier	 apply Pre Set
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getPreSets	TokenNameIdentifier	 get Pre Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
makeObject	TokenNameIdentifier	 make Object
(	TokenNameLPAREN	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a named task and configures it up to the init() stage. * * @param ue The UnknownElement to create the real task for. * Must not be <code>null</code>. * @param w Ignored. * * @return the task specified by the given unknown element, or * <code>null</code> if the task name is not recognised. */	TokenNameCOMMENT_JAVADOC	 Creates a named task and configures it up to the init() stage. * @param ue The UnknownElement to create the real task for. Must not be <code>null</code>. @param w Ignored. * @return the task specified by the given unknown element, or <code>null</code> if the task name is not recognised. 
protected	TokenNameprotected	
Task	TokenNameIdentifier	 Task
makeTask	TokenNameIdentifier	 make Task
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
ue	TokenNameIdentifier	 ue
,	TokenNameCOMMA	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
ue	TokenNameIdentifier	 ue
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// UnknownElement always has an associated target 	TokenNameCOMMENT_LINE	UnknownElement always has an associated target 
task	TokenNameIdentifier	 task
.	TokenNameDOT	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a very verbose exception for when a task/data type cannot * be found. * * @param what The kind of thing being created. For example, when * a task name could not be found, this would be * <code>"task"</code>. Should not be <code>null</code>. * @param name The name of the element which could not be found. * Should not be <code>null</code>. * * @return a detailed description of what might have caused the problem. */	TokenNameCOMMENT_JAVADOC	 Returns a very verbose exception for when a task/data type cannot be found. * @param what The kind of thing being created. For example, when a task name could not be found, this would be <code>"task"</code>. Should not be <code>null</code>. @param name The name of the element which could not be found. Should not be <code>null</code>. * @return a detailed description of what might have caused the problem. 
protected	TokenNameprotected	
BuildException	TokenNameIdentifier	 Build Exception
getNotFoundException	TokenNameIdentifier	 get Not Found Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
what	TokenNameIdentifier	 what
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
diagnoseCreationFailure	TokenNameIdentifier	 diagnose Creation Failure
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
what	TokenNameIdentifier	 what
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the name to use in logging messages. * * @return the name to use in logging messages. */	TokenNameCOMMENT_JAVADOC	 Returns the name to use in logging messages. * @return the name to use in logging messages. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return elementName; 	TokenNameCOMMENT_LINE	return elementName; 
return	TokenNamereturn	
realThing	TokenNameIdentifier	 real Thing
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
.	TokenNameDOT	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the task instance after it has been created and if it is a task. * * @return a task instance or <code>null</code> if the real object is not * a task. */	TokenNameCOMMENT_JAVADOC	 Returns the task instance after it has been created and if it is a task. * @return a task instance or <code>null</code> if the real object is not a task. 
public	TokenNamepublic	
Task	TokenNameIdentifier	 Task
getTask	TokenNameIdentifier	 get Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realThing	TokenNameIdentifier	 real Thing
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realThing	TokenNameIdentifier	 real Thing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the configured object * * @return the real thing whatever it is * * @since ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Return the configured object * @return the real thing whatever it is * @since ant 1.6 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getRealThing	TokenNameIdentifier	 get Real Thing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
realThing	TokenNameIdentifier	 real Thing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the configured object * @param realThing the configured object * @since ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Set the configured object @param realThing the configured object @since ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setRealThing	TokenNameIdentifier	 set Real Thing
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
realThing	TokenNameIdentifier	 real Thing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
realThing	TokenNameIdentifier	 real Thing
=	TokenNameEQUAL	
realThing	TokenNameIdentifier	 real Thing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Try to create a nested element of <code>parent</code> for the * given tag. * * @return whether the creation has been successful */	TokenNameCOMMENT_JAVADOC	 Try to create a nested element of <code>parent</code> for the given tag. * @return whether the creation has been successful 
private	TokenNameprivate	
boolean	TokenNameboolean	
handleChild	TokenNameIdentifier	 handle Child
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
parentUri	TokenNameIdentifier	 parent Uri
,	TokenNameCOMMA	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
ih	TokenNameIdentifier	 ih
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
UnknownElement	TokenNameIdentifier	 Unknown Element
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
childWrapper	TokenNameIdentifier	 child Wrapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
childName	TokenNameIdentifier	 child Name
=	TokenNameEQUAL	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
genComponentName	TokenNameIdentifier	 gen Component Name
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
supportsNestedElement	TokenNameIdentifier	 supports Nested Element
(	TokenNameLPAREN	
parentUri	TokenNameIdentifier	 parent Uri
,	TokenNameCOMMA	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
Creator	TokenNameIdentifier	 Creator
creator	TokenNameIdentifier	 creator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
creator	TokenNameIdentifier	 creator
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementCreator	TokenNameIdentifier	 get Element Creator
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parentUri	TokenNameIdentifier	 parent Uri
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
childName	TokenNameIdentifier	 child Name
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedElementException	TokenNameIdentifier	 Unsupported Element Exception
use	TokenNameIdentifier	 use
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
use	TokenNameIdentifier	 use
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// can't trust supportsNestedElement for dynamic elements 	TokenNameCOMMENT_LINE	can't trust supportsNestedElement for dynamic elements 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
creator	TokenNameIdentifier	 creator
.	TokenNameDOT	
setPolyType	TokenNameIdentifier	 set Poly Type
(	TokenNameLPAREN	
childWrapper	TokenNameIdentifier	 child Wrapper
.	TokenNameDOT	
getPolyType	TokenNameIdentifier	 get Poly Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
realChild	TokenNameIdentifier	 real Child
=	TokenNameEQUAL	
creator	TokenNameIdentifier	 creator
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
realChild	TokenNameIdentifier	 real Child
instanceof	TokenNameinstanceof	
PreSetDef	TokenNameIdentifier	 Pre Set Def
.	TokenNameDOT	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PreSetDef	TokenNameIdentifier	 Pre Set Def
.	TokenNameDOT	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PreSetDef	TokenNameIdentifier	 Pre Set Def
.	TokenNameDOT	
PreSetDefinition	TokenNameIdentifier	 Pre Set Definition
)	TokenNameRPAREN	
realChild	TokenNameIdentifier	 real Child
;	TokenNameSEMICOLON	
realChild	TokenNameIdentifier	 real Child
=	TokenNameEQUAL	
creator	TokenNameIdentifier	 creator
.	TokenNameDOT	
getRealObject	TokenNameIdentifier	 get Real Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
applyPreSet	TokenNameIdentifier	 apply Pre Set
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getPreSets	TokenNameIdentifier	 get Pre Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
childWrapper	TokenNameIdentifier	 child Wrapper
.	TokenNameDOT	
setCreator	TokenNameIdentifier	 set Creator
(	TokenNameLPAREN	
creator	TokenNameIdentifier	 creator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childWrapper	TokenNameIdentifier	 child Wrapper
.	TokenNameDOT	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
realChild	TokenNameIdentifier	 real Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
realChild	TokenNameIdentifier	 real Child
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Task	TokenNameIdentifier	 Task
childTask	TokenNameIdentifier	 child Task
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
realChild	TokenNameIdentifier	 real Child
;	TokenNameSEMICOLON	
childTask	TokenNameIdentifier	 child Task
.	TokenNameDOT	
setRuntimeConfigurableWrapper	TokenNameIdentifier	 set Runtime Configurable Wrapper
(	TokenNameLPAREN	
childWrapper	TokenNameIdentifier	 child Wrapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childTask	TokenNameIdentifier	 child Task
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childTask	TokenNameIdentifier	 child Task
.	TokenNameDOT	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
childName	TokenNameIdentifier	 child Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realChild	TokenNameIdentifier	 real Child
instanceof	TokenNameinstanceof	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
realChild	TokenNameIdentifier	 real Child
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
childWrapper	TokenNameIdentifier	 child Wrapper
.	TokenNameDOT	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
handleChildren	TokenNameIdentifier	 handle Children
(	TokenNameLPAREN	
realChild	TokenNameIdentifier	 real Child
,	TokenNameCOMMA	
childWrapper	TokenNameIdentifier	 child Wrapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
creator	TokenNameIdentifier	 creator
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * like contents equals, but ignores project * @param obj the object to check against * @return true if this unknownelement has the same contents the other */	TokenNameCOMMENT_JAVADOC	 like contents equals, but ignores project @param obj the object to check against @return true if this unknownelement has the same contents the other 
public	TokenNamepublic	
boolean	TokenNameboolean	
similar	TokenNameIdentifier	 similar
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnknownElement	TokenNameIdentifier	 Unknown Element
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
// Are the names the same ? 	TokenNameCOMMENT_LINE	Are the names the same ? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
equalsString	TokenNameIdentifier	 equals String
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Are attributes the same ? 	TokenNameCOMMENT_LINE	Are attributes the same ? 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Is the text the same? 	TokenNameCOMMENT_LINE	Is the text the same? 
// Need to use equals on the string and not 	TokenNameCOMMENT_LINE	Need to use equals on the string and not 
// on the stringbuffer as equals on the string buffer 	TokenNameCOMMENT_LINE	on the stringbuffer as equals on the string buffer 
// does not compare the contents. 	TokenNameCOMMENT_LINE	does not compare the contents. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Are the sub elements the same ? 	TokenNameCOMMENT_LINE	Are the sub elements the same ? 
final	TokenNamefinal	
int	TokenNameint	
childrenSize	TokenNameIdentifier	 children Size
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childrenSize	TokenNameIdentifier	 children Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
childrenSize	TokenNameIdentifier	 children Size
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
childrenSize	TokenNameIdentifier	 children Size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnknownElement	TokenNameIdentifier	 Unknown Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
similar	TokenNameIdentifier	 similar
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
equalsString	TokenNameIdentifier	 equals String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
:	TokenNameCOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make a copy of the unknown element and set it in the new project. * @param newProject the project to create the UE in. * @return the copied UE. */	TokenNameCOMMENT_JAVADOC	 Make a copy of the unknown element and set it in the new project. @param newProject the project to create the UE in. @return the copied UE. 
public	TokenNamepublic	
UnknownElement	TokenNameIdentifier	 Unknown Element
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
newProject	TokenNameIdentifier	 new Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnknownElement	TokenNameIdentifier	 Unknown Element
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownElement	TokenNameIdentifier	 Unknown Element
(	TokenNameLPAREN	
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
newProject	TokenNameIdentifier	 new Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setQName	TokenNameIdentifier	 set Q Name
(	TokenNameLPAREN	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Target	TokenNameIdentifier	 Target
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Target	TokenNameIdentifier	 Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
setOwningTarget	TokenNameIdentifier	 set Owning Target
(	TokenNameLPAREN	
getOwningTarget	TokenNameIdentifier	 get Owning Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
copyRC	TokenNameIdentifier	 copy RC
=	TokenNameEQUAL	
new	TokenNamenew	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyRC	TokenNameIdentifier	 copy RC
.	TokenNameDOT	
setPolyType	TokenNameIdentifier	 set Poly Type
(	TokenNameLPAREN	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPolyType	TokenNameIdentifier	 get Poly Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyRC	TokenNameIdentifier	 copy RC
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
copyRC	TokenNameIdentifier	 copy RC
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
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
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnknownElement	TokenNameIdentifier	 Unknown Element
ueChild	TokenNameIdentifier	 ue Child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnknownElement	TokenNameIdentifier	 Unknown Element
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnknownElement	TokenNameIdentifier	 Unknown Element
copyChild	TokenNameIdentifier	 copy Child
=	TokenNameEQUAL	
ueChild	TokenNameIdentifier	 ue Child
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
newProject	TokenNameIdentifier	 new Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyRC	TokenNameIdentifier	 copy RC
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
copyChild	TokenNameIdentifier	 copy Child
.	TokenNameDOT	
getWrapper	TokenNameIdentifier	 get Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
copyChild	TokenNameIdentifier	 copy Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

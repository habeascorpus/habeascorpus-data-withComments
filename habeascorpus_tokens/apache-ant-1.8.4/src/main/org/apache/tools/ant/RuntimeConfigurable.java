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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
Collections	TokenNameIdentifier	 Collections
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
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
MacroDef	TokenNameIdentifier	 Macro Def
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
MacroInstance	TokenNameIdentifier	 Macro Instance
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
AttributeList	TokenNameIdentifier	 Attribute List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AttributeListImpl	TokenNameIdentifier	 Attribute List Impl
;	TokenNameSEMICOLON	
/** * Wrapper class that holds the attributes of an element, its children, and * any text within it. It then takes care of configuring that element at * runtime. */	TokenNameCOMMENT_JAVADOC	 Wrapper class that holds the attributes of an element, its children, and any text within it. It then takes care of configuring that element at runtime. 
public	TokenNamepublic	
class	TokenNameclass	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Serialization version */	TokenNameCOMMENT_JAVADOC	 Serialization version 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Empty Hashtable. */	TokenNameCOMMENT_JAVADOC	 Empty Hashtable. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
EMPTY_HASHTABLE	TokenNameIdentifier	 EMPTY  HASHTABLE
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Name of the element to configure. */	TokenNameCOMMENT_JAVADOC	 Name of the element to configure. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
elementTag	TokenNameIdentifier	 element Tag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** List of child element wrappers. */	TokenNameCOMMENT_JAVADOC	 List of child element wrappers. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
/*<RuntimeConfigurable>*/	TokenNameCOMMENT_BLOCK	<RuntimeConfigurable>
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The element to configure. It is only used during * maybeConfigure. */	TokenNameCOMMENT_JAVADOC	 The element to configure. It is only used during maybeConfigure. 
private	TokenNameprivate	
transient	TokenNametransient	
Object	TokenNameIdentifier	 Object
wrappedObject	TokenNameIdentifier	 wrapped Object
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the creator used to make the wrapped object */	TokenNameCOMMENT_JAVADOC	 the creator used to make the wrapped object 
private	TokenNameprivate	
transient	TokenNametransient	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
Creator	TokenNameIdentifier	 Creator
creator	TokenNameIdentifier	 creator
;	TokenNameSEMICOLON	
/** * XML attributes for the element. * @deprecated since 1.6.x */	TokenNameCOMMENT_JAVADOC	 XML attributes for the element. @deprecated since 1.6.x 
private	TokenNameprivate	
transient	TokenNametransient	
AttributeList	TokenNameIdentifier	 Attribute List
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
/** Attribute names and values. While the XML spec doesn't require * preserving the order ( AFAIK ), some ant tests do rely on the * exact order. * The only exception to this order is the treatment of * refid. A number of datatypes check if refid is set * when other attributes are set. This check will not * work if the build script has the other attribute before * the "refid" attribute, so now (ANT 1.7) the refid * attribute will be processed first. */	TokenNameCOMMENT_JAVADOC	 Attribute names and values. While the XML spec doesn't require preserving the order ( AFAIK ), some ant tests do rely on the exact order. The only exception to this order is the treatment of refid. A number of datatypes check if refid is set when other attributes are set. This check will not work if the build script has the other attribute before the "refid" attribute, so now (ANT 1.7) the refid attribute will be processed first. 
private	TokenNameprivate	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
/*<String, String>*/	TokenNameCOMMENT_BLOCK	<String, String>
attributeMap	TokenNameIdentifier	 attribute Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Text appearing within the element. */	TokenNameCOMMENT_JAVADOC	 Text appearing within the element. 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Indicates if the wrapped object has been configured */	TokenNameCOMMENT_JAVADOC	 Indicates if the wrapped object has been configured 
private	TokenNameprivate	
boolean	TokenNameboolean	
proxyConfigured	TokenNameIdentifier	 proxy Configured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** the polymorphic type */	TokenNameCOMMENT_JAVADOC	 the polymorphic type 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
polyType	TokenNameIdentifier	 poly Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the "id" of this Element if it has one */	TokenNameCOMMENT_JAVADOC	 the "id" of this Element if it has one 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Sole constructor creating a wrapper for the specified object. * * @param proxy The element to configure. Must not be <code>null</code>. * @param elementTag The tag name generating this element. */	TokenNameCOMMENT_JAVADOC	 Sole constructor creating a wrapper for the specified object. * @param proxy The element to configure. Must not be <code>null</code>. @param elementTag The tag name generating this element. 
public	TokenNamepublic	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
proxy	TokenNameIdentifier	 proxy
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementTag	TokenNameIdentifier	 element Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setElementTag	TokenNameIdentifier	 set Element Tag
(	TokenNameLPAREN	
elementTag	TokenNameIdentifier	 element Tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Most likely an UnknownElement 	TokenNameCOMMENT_LINE	Most likely an UnknownElement 
if	TokenNameif	
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
instanceof	TokenNameinstanceof	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
)	TokenNameRPAREN	
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
.	TokenNameDOT	
setRuntimeConfigurableWrapper	TokenNameIdentifier	 set Runtime Configurable Wrapper
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the element to configure. * * @param proxy The element to configure. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the element to configure. * @param proxy The element to configure. Must not be <code>null</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrappedObject	TokenNameIdentifier	 wrapped Object
=	TokenNameEQUAL	
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
proxyConfigured	TokenNameIdentifier	 proxy Configured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the creator of the element to be configured * used to store the element in the parent. * * @param creator the creator object. */	TokenNameCOMMENT_JAVADOC	 Sets the creator of the element to be configured used to store the element in the parent. * @param creator the creator object. 
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setCreator	TokenNameIdentifier	 set Creator
(	TokenNameLPAREN	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
Creator	TokenNameIdentifier	 Creator
creator	TokenNameIdentifier	 creator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
creator	TokenNameIdentifier	 creator
=	TokenNameEQUAL	
creator	TokenNameIdentifier	 creator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the object for which this RuntimeConfigurable holds the configuration * information. * * @return the object whose configure is held by this instance. */	TokenNameCOMMENT_JAVADOC	 Get the object for which this RuntimeConfigurable holds the configuration information. * @return the object whose configure is held by this instance. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wrappedObject	TokenNameIdentifier	 wrapped Object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the id for this element. * @return the id. */	TokenNameCOMMENT_JAVADOC	 Returns the id for this element. @return the id. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the polymorphic type for this element. * @return the ant component type name, null if not set. */	TokenNameCOMMENT_JAVADOC	 Get the polymorphic type for this element. @return the ant component type name, null if not set. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getPolyType	TokenNameIdentifier	 get Poly Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
polyType	TokenNameIdentifier	 poly Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the polymorphic type for this element. * @param polyType the ant component type name, null if not set. */	TokenNameCOMMENT_JAVADOC	 Set the polymorphic type for this element. @param polyType the ant component type name, null if not set. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setPolyType	TokenNameIdentifier	 set Poly Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
polyType	TokenNameIdentifier	 poly Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
polyType	TokenNameIdentifier	 poly Type
=	TokenNameEQUAL	
polyType	TokenNameIdentifier	 poly Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the attributes for the wrapped element. * * @deprecated since 1.6.x. * @param attributes List of attributes defined in the XML for this * element. May be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the attributes for the wrapped element. * @deprecated since 1.6.x. @param attributes List of attributes defined in the XML for this element. May be <code>null</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setAttributes	TokenNameIdentifier	 set Attributes
(	TokenNameLPAREN	
AttributeList	TokenNameIdentifier	 Attribute List
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeListImpl	TokenNameIdentifier	 Attribute List Impl
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set an attribute to a given value. * * @param name the name of the attribute. * @param value the attribute's value. */	TokenNameCOMMENT_JAVADOC	 Set an attribute to a given value. * @param name the name of the attribute. @param value the attribute's value. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
ANT_TYPE	TokenNameIdentifier	 ANT  TYPE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
polyType	TokenNameIdentifier	 poly Type
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributeMap	TokenNameIdentifier	 attribute Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributeMap	TokenNameIdentifier	 attribute Map
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"refid"	TokenNameStringLiteral	refid
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
newAttributeMap	TokenNameIdentifier	 new Attribute Map
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newAttributeMap	TokenNameIdentifier	 new Attribute Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newAttributeMap	TokenNameIdentifier	 new Attribute Map
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
attributeMap	TokenNameIdentifier	 attribute Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeMap	TokenNameIdentifier	 attribute Map
=	TokenNameEQUAL	
newAttributeMap	TokenNameIdentifier	 new Attribute Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Delete an attribute. Not for the faint of heart. * @param name the name of the attribute to be removed. */	TokenNameCOMMENT_JAVADOC	 Delete an attribute. Not for the faint of heart. @param name the name of the attribute to be removed. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the attribute map. * * @return Attribute name to attribute value map. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Return the attribute map. * @return Attribute name to attribute value map. @since Ant 1.6 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Hashtable	TokenNameIdentifier	 Hashtable
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
attributeMap	TokenNameIdentifier	 attribute Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
EMPTY_HASHTABLE	TokenNameIdentifier	 EMPTY  HASHTABLE
:	TokenNameCOLON	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
attributeMap	TokenNameIdentifier	 attribute Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of attributes for the wrapped element. * * @deprecated Deprecated since Ant 1.6 in favor of {@link #getAttributeMap}. * @return An AttributeList representing the attributes defined in the * XML for this element. May be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the list of attributes for the wrapped element. * @deprecated Deprecated since Ant 1.6 in favor of {@link #getAttributeMap}. @return An AttributeList representing the attributes defined in the XML for this element. May be <code>null</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
AttributeList	TokenNameIdentifier	 Attribute List
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a child element to the wrapped element. * * @param child The child element wrapper to add to this one. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds a child element to the wrapped element. * @param child The child element wrapper to add to this one. Must not be <code>null</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addChild	TokenNameIdentifier	 add Child
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the child wrapper at the specified position within the list. * * @param index The index of the child to return. * * @return The child wrapper at position <code>index</code> within the * list. */	TokenNameCOMMENT_JAVADOC	 Returns the child wrapper at the specified position within the list. * @param index The index of the child to return. * @return The child wrapper at position <code>index</code> within the list. 
synchronized	TokenNamesynchronized	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumeration of all child wrappers. * @return an enumeration of the child wrappers. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of all child wrappers. @return an enumeration of the child wrappers. @since Ant 1.6 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Enumeration	TokenNameIdentifier	 Enumeration
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
CollectionUtils	TokenNameIdentifier	 Collection Utils
.	TokenNameDOT	
EmptyEnumeration	TokenNameIdentifier	 Empty Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
enumeration	TokenNameIdentifier	 enumeration
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds characters from #PCDATA areas to the wrapped element. * * @param data Text to add to the wrapped element. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Adds characters from #PCDATA areas to the wrapped element. * @param data Text to add to the wrapped element. Should not be <code>null</code>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
:	TokenNameCOLON	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds characters from #PCDATA areas to the wrapped element. * * @param buf A character array of the text within the element. * Must not be <code>null</code>. * @param start The start element in the array. * @param count The number of characters to read from the array. * */	TokenNameCOMMENT_JAVADOC	 Adds characters from #PCDATA areas to the wrapped element. * @param buf A character array of the text within the element. Must not be <code>null</code>. @param start The start element in the array. @param count The number of characters to read from the array. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
:	TokenNameCOLON	
characters	TokenNameIdentifier	 characters
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the text content of this element. Various text chunks are * concatenated, there is no way ( currently ) of keeping track of * multiple fragments. * * @return the text content of this element. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Get the text content of this element. Various text chunks are concatenated, there is no way ( currently ) of keeping track of multiple fragments. * @return the text content of this element. @since Ant 1.6 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
StringBuffer	TokenNameIdentifier	 String Buffer
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
characters	TokenNameIdentifier	 characters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the element tag. * @param elementTag The tag name generating this element. */	TokenNameCOMMENT_JAVADOC	 Set the element tag. @param elementTag The tag name generating this element. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setElementTag	TokenNameIdentifier	 set Element Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementTag	TokenNameIdentifier	 element Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
elementTag	TokenNameIdentifier	 element Tag
=	TokenNameEQUAL	
elementTag	TokenNameIdentifier	 element Tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the tag name of the wrapped element. * * @return The tag name of the wrapped element. This is unlikely * to be <code>null</code>, but may be. */	TokenNameCOMMENT_JAVADOC	 Returns the tag name of the wrapped element. * @return The tag name of the wrapped element. This is unlikely to be <code>null</code>, but may be. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getElementTag	TokenNameIdentifier	 get Element Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elementTag	TokenNameIdentifier	 element Tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Configures the wrapped element and all its children. * The attributes and text for the wrapped element are configured, * and then each child is configured and added. Each time the * wrapper is configured, the attributes and text for it are * reset. * * If the element has an <code>id</code> attribute, a reference * is added to the project as well. * * @param p The project containing the wrapped element. * Must not be <code>null</code>. * * @exception BuildException if the configuration fails, for instance due * to invalid attributes or children, or text being added to * an element which doesn't accept it. */	TokenNameCOMMENT_JAVADOC	 Configures the wrapped element and all its children. The attributes and text for the wrapped element are configured, and then each child is configured and added. Each time the wrapper is configured, the attributes and text for it are reset. * If the element has an <code>id</code> attribute, a reference is added to the project as well. * @param p The project containing the wrapped element. Must not be <code>null</code>. * @exception BuildException if the configuration fails, for instance due to invalid attributes or children, or text being added to an element which doesn't accept it. 
public	TokenNamepublic	
void	TokenNamevoid	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Configures the wrapped element. The attributes and text for * the wrapped element are configured. Each time the wrapper is * configured, the attributes and text for it are reset. * * If the element has an <code>id</code> attribute, a reference * is added to the project as well. * * @param p The project containing the wrapped element. * Must not be <code>null</code>. * * @param configureChildren ignored. * * @exception BuildException if the configuration fails, for instance due * to invalid attributes , or text being added to * an element which doesn't accept it. */	TokenNameCOMMENT_JAVADOC	 Configures the wrapped element. The attributes and text for the wrapped element are configured. Each time the wrapper is configured, the attributes and text for it are reset. * If the element has an <code>id</code> attribute, a reference is added to the project as well. * @param p The project containing the wrapped element. Must not be <code>null</code>. * @param configureChildren ignored. * @exception BuildException if the configuration fails, for instance due to invalid attributes , or text being added to an element which doesn't accept it. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
boolean	TokenNameboolean	
configureChildren	TokenNameIdentifier	 configure Children
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
proxyConfigured	TokenNameIdentifier	 proxy Configured
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Configure the object 	TokenNameCOMMENT_LINE	Configure the object 
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
wrappedObject	TokenNameIdentifier	 wrapped Object
instanceof	TokenNameinstanceof	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TypeAdapter	TokenNameIdentifier	 Type Adapter
)	TokenNameRPAREN	
wrappedObject	TokenNameIdentifier	 wrapped Object
)	TokenNameRPAREN	
.	TokenNameDOT	
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
wrappedObject	TokenNameIdentifier	 wrapped Object
;	TokenNameSEMICOLON	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributeMap	TokenNameIdentifier	 attribute Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
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
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reflect these into the target, defer for 	TokenNameCOMMENT_LINE	reflect these into the target, defer for 
// MacroInstance where properties are expanded for the 	TokenNameCOMMENT_LINE	MacroInstance where properties are expanded for the 
// nested sequential 	TokenNameCOMMENT_LINE	nested sequential 
Object	TokenNameIdentifier	 Object
attrValue	TokenNameIdentifier	 attr Value
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
instanceof	TokenNameinstanceof	
MacroInstance	TokenNameIdentifier	 Macro Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MacroInstance	TokenNameIdentifier	 Macro Instance
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
.	TokenNameDOT	
getMacroDef	TokenNameIdentifier	 get Macro Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MacroDef	TokenNameIdentifier	 Macro Def
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MacroDef	TokenNameIdentifier	 Macro Def
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
isDoubleExpanding	TokenNameIdentifier	 is Double Expanding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrValue	TokenNameIdentifier	 attr Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedAttributeException	TokenNameIdentifier	 Unsupported Attribute Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// id attribute must be set externally 	TokenNameCOMMENT_LINE	id attribute must be set externally 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getElementTag	TokenNameIdentifier	 get Element Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getElementTag	TokenNameIdentifier	 get Element Tag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the ""	TokenNameStringLiteral	 doesn't support the "
+	TokenNamePLUS	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" attribute"	TokenNameStringLiteral	" attribute
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that this is an not supported attribute type 	TokenNameCOMMENT_LINE	Assume that this is an not supported attribute type 
// thrown for example by a dymanic attribute task 	TokenNameCOMMENT_LINE	thrown for example by a dymanic attribute task 
// Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
wrappedObject	TokenNameIdentifier	 wrapped Object
,	TokenNameCOMMA	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
wrappedObject	TokenNameIdentifier	 wrapped Object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
proxyConfigured	TokenNameIdentifier	 proxy Configured
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reconfigure the element, even if it has already been configured. * * @param p the project instance for this configuration. */	TokenNameCOMMENT_JAVADOC	 Reconfigure the element, even if it has already been configured. * @param p the project instance for this configuration. 
public	TokenNamepublic	
void	TokenNamevoid	
reconfigure	TokenNameIdentifier	 reconfigure
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
proxyConfigured	TokenNameIdentifier	 proxy Configured
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
maybeConfigure	TokenNameIdentifier	 maybe Configure
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Apply presets, attributes and text are set if not currently set. * Nested elements are prepended. * * @param r a <code>RuntimeConfigurable</code> value. */	TokenNameCOMMENT_JAVADOC	 Apply presets, attributes and text are set if not currently set. Nested elements are prepended. * @param r a <code>RuntimeConfigurable</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
applyPreSet	TokenNameIdentifier	 apply Pre Set
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Attributes 	TokenNameCOMMENT_LINE	Attributes 
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
attributeMap	TokenNameIdentifier	 attribute Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
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
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributeMap	TokenNameIdentifier	 attribute Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
attributeMap	TokenNameIdentifier	 attribute Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// poly type 	TokenNameCOMMENT_LINE	poly type 
polyType	TokenNameIdentifier	 poly Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
polyType	TokenNameIdentifier	 poly Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
polyType	TokenNameIdentifier	 poly Type
:	TokenNameCOLON	
polyType	TokenNameIdentifier	 poly Type
;	TokenNameSEMICOLON	
// Children (this is a shadow of UnknownElement#children) 	TokenNameCOMMENT_LINE	Children (this is a shadow of UnknownElement#children) 
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
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
r	TokenNameIdentifier	 r
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
// Text 	TokenNameCOMMENT_LINE	Text 
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

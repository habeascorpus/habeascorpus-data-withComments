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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParsePosition	TokenNameIdentifier	 Parse Position
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
HashSet	TokenNameIdentifier	 Hash Set
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Collection	TokenNameIdentifier	 Collection
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
NullReturn	TokenNameIdentifier	 Null Return
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
GetProperty	TokenNameIdentifier	 Get Property
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
ParseNextProperty	TokenNameIdentifier	 Parse Next Property
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
PropertyExpander	TokenNameIdentifier	 Property Expander
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
property	TokenNameIdentifier	 property
.	TokenNameDOT	
ParseProperties	TokenNameIdentifier	 Parse Properties
;	TokenNameSEMICOLON	
/* ISSUES: - ns param. It could be used to provide "namespaces" for properties, which may be more flexible. - Object value. In ant1.5 String is used for Properties - but it would be nice to support generic Objects (the property remains immutable - you can't change the associated object). This will also allow JSP-EL style setting using the Object if an attribute contains only the property (name="${property}" could avoid Object->String->Object conversion) - Currently we "chain" only for get and set property (probably most users will only need that - if they need more they can replace the top helper). Need to discuss this and find if we need more. */	TokenNameCOMMENT_BLOCK	 ISSUES: - ns param. It could be used to provide "namespaces" for properties, which may be more flexible. - Object value. In ant1.5 String is used for Properties - but it would be nice to support generic Objects (the property remains immutable - you can't change the associated object). This will also allow JSP-EL style setting using the Object if an attribute contains only the property (name="${property}" could avoid Object->String->Object conversion) - Currently we "chain" only for get and set property (probably most users will only need that - if they need more they can replace the top helper). Need to discuss this and find if we need more. 
/* update for impending Ant 1.8.0: - I can't see any reason for ns and would like to deprecate it. - Replacing chaining with delegates for certain behavioral aspects. - Object value seems valuable as outlined. */	TokenNameCOMMENT_BLOCK	 update for impending Ant 1.8.0: - I can't see any reason for ns and would like to deprecate it. - Replacing chaining with delegates for certain behavioral aspects. - Object value seems valuable as outlined. 
/** * Deals with properties - substitution, dynamic properties, etc. * * <p>This code has been heavily restructured for Ant 1.8.0. It is * expected that custom PropertyHelper implementation that used the * older chaining mechanism of Ant 1.6 won't work in all cases, and * its usage is deprecated. The preferred way to customize Ant's * property handling is by {@link #add adding} {@link * PropertyHelper.Delegate delegates} of the appropriate subinterface * and have this implementation use them.</p> * * <p>When {@link #parseProperties expanding a string that may contain * properties} this class will delegate the actual parsing to {@link * org.apache.tools.ant.property.ParseProperties#parseProperties * parseProperties} inside the ParseProperties class which in turn * uses the {@link org.apache.tools.ant.property.PropertyExpander * PropertyExpander delegates} to find properties inside the string * and this class to expand the propertiy names found into the * corresponding values.</p> * * <p>When {@link #getProperty looking up a property value} this class * will first consult all {@link PropertyHelper.PropertyEvaluator * PropertyEvaluator} delegates and fall back to an internal map of * "project properties" if no evaluator matched the property name.</p> * * <p>When {@link #setProperty setting a property value} this class * will first consult all {@link PropertyHelper.PropertySetter * PropertySetter} delegates and fall back to an internal map of * "project properties" if no setter matched the property name.</p> * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Deals with properties - substitution, dynamic properties, etc. * <p>This code has been heavily restructured for Ant 1.8.0. It is expected that custom PropertyHelper implementation that used the older chaining mechanism of Ant 1.6 won't work in all cases, and its usage is deprecated. The preferred way to customize Ant's property handling is by {@link #add adding} {@link PropertyHelper.Delegate delegates} of the appropriate subinterface and have this implementation use them.</p> * <p>When {@link #parseProperties expanding a string that may contain properties} this class will delegate the actual parsing to {@link org.apache.tools.ant.property.ParseProperties#parseProperties parseProperties} inside the ParseProperties class which in turn uses the {@link org.apache.tools.ant.property.PropertyExpander PropertyExpander delegates} to find properties inside the string and this class to expand the propertiy names found into the corresponding values.</p> * <p>When {@link #getProperty looking up a property value} this class will first consult all {@link PropertyHelper.PropertyEvaluator PropertyEvaluator} delegates and fall back to an internal map of "project properties" if no evaluator matched the property name.</p> * <p>When {@link #setProperty setting a property value} this class will first consult all {@link PropertyHelper.PropertySetter PropertySetter} delegates and fall back to an internal map of "project properties" if no setter matched the property name.</p> * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
PropertyHelper	TokenNameIdentifier	 Property Helper
implements	TokenNameimplements	
GetProperty	TokenNameIdentifier	 Get Property
{	TokenNameLBRACE	
// -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// The property delegate interfaces 	TokenNameCOMMENT_LINE	The property delegate interfaces 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------- 
/** * Marker interface for a PropertyHelper delegate. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Marker interface for a PropertyHelper delegate. @since Ant 1.8.0 
public	TokenNamepublic	
interface	TokenNameinterface	
Delegate	TokenNameIdentifier	 Delegate
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Looks up a property's value based on its name. * * <p>Can be used to look up properties in a different storage * than the project instance (like local properties for example) * or to implement custom "protocols" like Ant's * <code>${toString:refid}</code> syntax.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Looks up a property's value based on its name. * <p>Can be used to look up properties in a different storage than the project instance (like local properties for example) or to implement custom "protocols" like Ant's <code>${toString:refid}</code> syntax.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
interface	TokenNameinterface	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
extends	TokenNameextends	
Delegate	TokenNameIdentifier	 Delegate
{	TokenNameLBRACE	
/** * Evaluate a property. * * @param property the property's String "identifier". * @param propertyHelper the invoking PropertyHelper. * @return null if the property name could not be found, an * instance of {@link org.apache.tools.ant.property.NullReturn * NullReturn} to indicate a property with a name that can be * matched but a value of <code>null</code> and the property's * value otherwise. */	TokenNameCOMMENT_JAVADOC	 Evaluate a property. * @param property the property's String "identifier". @param propertyHelper the invoking PropertyHelper. @return null if the property name could not be found, an instance of {@link org.apache.tools.ant.property.NullReturn NullReturn} to indicate a property with a name that can be matched but a value of <code>null</code> and the property's value otherwise. 
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets or overrides a property. * * <p>Can be used to store properties in a different storage than * the project instance (like local properties for example).</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets or overrides a property. * <p>Can be used to store properties in a different storage than the project instance (like local properties for example).</p> * @since Ant 1.8.0 
public	TokenNamepublic	
interface	TokenNameinterface	
PropertySetter	TokenNameIdentifier	 Property Setter
extends	TokenNameextends	
Delegate	TokenNameIdentifier	 Delegate
{	TokenNameLBRACE	
/** * Set a *new" property. * * <p>Should not replace the value of an existing property.</p> * * @param property the property's String "identifier". * @param value the value to set. * @param propertyHelper the invoking PropertyHelper. * @return true if this entity 'owns' the property. */	TokenNameCOMMENT_JAVADOC	 Set a *new" property. * <p>Should not replace the value of an existing property.</p> * @param property the property's String "identifier". @param value the value to set. @param propertyHelper the invoking PropertyHelper. @return true if this entity 'owns' the property. 
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
;	TokenNameSEMICOLON	
/** * Set a property. * * <p>May replace the value of an existing property.</p> * * @param property the property's String "identifier". * @param value the value to set. * @param propertyHelper the invoking PropertyHelper. * @return true if this entity 'owns' the property. */	TokenNameCOMMENT_JAVADOC	 Set a property. * <p>May replace the value of an existing property.</p> * @param property the property's String "identifier". @param value the value to set. @param propertyHelper the invoking PropertyHelper. @return true if this entity 'owns' the property. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// The predefined property delegates 	TokenNameCOMMENT_LINE	The predefined property delegates 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
TO_STRING	TokenNameIdentifier	 TO  STRING
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX	TokenNameIdentifier	 PREFIX
=	TokenNameEQUAL	
"toString:"	TokenNameStringLiteral	toString:
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
PREFIX_LEN	TokenNameIdentifier	 PREFIX  LEN
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PREFIX	TokenNameIdentifier	 PREFIX
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyHelper	TokenNameIdentifier	 property Helper
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
propertyHelper	TokenNameIdentifier	 property Helper
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
PREFIX_LEN	TokenNameIdentifier	 PREFIX  LEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
PropertyExpander	TokenNameIdentifier	 Property Expander
DEFAULT_EXPANDER	TokenNameIdentifier	 DEFAULT  EXPANDER
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyExpander	TokenNameIdentifier	 Property Expander
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
parsePropertyName	TokenNameIdentifier	 parse Property Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
ParseNextProperty	TokenNameIdentifier	 Parse Next Property
notUsed	TokenNameIdentifier	 not Used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//directly check near, triggering characters: 	TokenNameCOMMENT_LINE	directly check near, triggering characters: 
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
'$'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
'{'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//defer to String.indexOf() for protracted check: 	TokenNameCOMMENT_LINE	defer to String.indexOf() for protracted check: 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Syntax error in property: "	TokenNameStringLiteral	Syntax error in property: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
end	TokenNameIdentifier	 end
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** dummy */	TokenNameCOMMENT_JAVADOC	 dummy 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
PropertyExpander	TokenNameIdentifier	 Property Expander
SKIP_DOUBLE_DOLLAR	TokenNameIdentifier	 SKIP  DOUBLE  DOLLAR
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyExpander	TokenNameIdentifier	 Property Expander
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:LineLengthCheck OFF see too long 	TokenNameCOMMENT_LINE	CheckStyle:LineLengthCheck OFF see too long 
/** * {@inheritDoc} * @see org.apache.tools.ant.property.PropertyExpander#parsePropertyName(java.lang.String, java.text.ParsePosition, org.apache.tools.ant.PropertyHelper) */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} @see org.apache.tools.ant.property.PropertyExpander#parsePropertyName(java.lang.String, java.text.ParsePosition, org.apache.tools.ant.PropertyHelper) 
// CheckStyle:LineLengthCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:LineLengthCheck ON 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
parsePropertyName	TokenNameIdentifier	 parse Property Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
ParseNextProperty	TokenNameIdentifier	 Parse Next Property
notUsed	TokenNameIdentifier	 not Used
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* check for $$; if found, advance by one-- * this expander is at the bottom of the stack * and will thus be the last consulted, * so the next thing that ParseProperties will do * is advance the parse position beyond the second $ */	TokenNameCOMMENT_BLOCK	 check for $$; if found, advance by one-- this expander is at the bottom of the stack and will thus be the last consulted, so the next thing that ParseProperties will do is advance the parse position beyond the second $ 
if	TokenNameif	
(	TokenNameLPAREN	
'$'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
'$'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.8.0 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
FROM_REF	TokenNameIdentifier	 FROM  REF
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX	TokenNameIdentifier	 PREFIX
=	TokenNameEQUAL	
"ant.refid:"	TokenNameStringLiteral	ant.refid:
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
PREFIX_LEN	TokenNameIdentifier	 PREFIX  LEN
=	TokenNameEQUAL	
PREFIX	TokenNameIdentifier	 PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
helper	TokenNameIdentifier	 helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
PREFIX	TokenNameIdentifier	 PREFIX
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
PREFIX_LEN	TokenNameIdentifier	 PREFIX  LEN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PropertyHelper	TokenNameIdentifier	 Property Helper
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
delegates	TokenNameIdentifier	 delegates
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Project properties map (usually String to String). */	TokenNameCOMMENT_JAVADOC	 Project properties map (usually String to String). 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Map of "user" properties (as created in the Ant task, for example). * Note that these key/value pairs are also always put into the * project properties, so only the project properties need to be queried. */	TokenNameCOMMENT_JAVADOC	 Map of "user" properties (as created in the Ant task, for example). Note that these key/value pairs are also always put into the project properties, so only the project properties need to be queried. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
userProperties	TokenNameIdentifier	 user Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Map of inherited "user" properties - that are those "user" * properties that have been created by tasks and not been set * from the command line or a GUI tool. */	TokenNameCOMMENT_JAVADOC	 Map of inherited "user" properties - that are those "user" properties that have been created by tasks and not been set from the command line or a GUI tool. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
inheritedProperties	TokenNameIdentifier	 inherited Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
protected	TokenNameprotected	
PropertyHelper	TokenNameIdentifier	 Property Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FROM_REF	TokenNameIdentifier	 FROM  REF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
TO_STRING	TokenNameIdentifier	 TO  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SKIP_DOUBLE_DOLLAR	TokenNameIdentifier	 SKIP  DOUBLE  DOLLAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DEFAULT_EXPANDER	TokenNameIdentifier	 DEFAULT  EXPANDER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// Some helper static methods to get and set properties 	TokenNameCOMMENT_LINE	Some helper static methods to get and set properties 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------- 
/** * A helper static method to get a property * from a particular project. * @param project the project in question. * @param name the property name * @return the value of the property if present, null otherwise. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 A helper static method to get a property from a particular project. @param project the project in question. @param name the property name @return the value of the property if present, null otherwise. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A helper static method to set a property * from a particular project. * @param project the project in question. * @param name the property name * @param value the value to use. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 A helper static method to set a property from a particular project. @param project the project in question. @param name the property name @param value the value to use. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A helper static method to set a new property * from a particular project. * @param project the project in question. * @param name the property name * @param value the value to use. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 A helper static method to set a new property from a particular project. @param project the project in question. @param name the property name @param value the value to use. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//override facility for subclasses to put custom hashtables in 	TokenNameCOMMENT_LINE	override facility for subclasses to put custom hashtables in 
// -------------------- Hook management -------------------- 	TokenNameCOMMENT_LINE	-------------------- Hook management -------------------- 
/** * Set the project for which this helper is performing property resolution. * * @param p the project instance. */	TokenNameCOMMENT_JAVADOC	 Set the project for which this helper is performing property resolution. * @param p the project instance. 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get this PropertyHelper's Project. * @return Project */	TokenNameCOMMENT_JAVADOC	 Get this PropertyHelper's Project. @return Project 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prior to Ant 1.8.0 there have been 2 ways to hook into property handling: * * - you can replace the main PropertyHelper. The replacement is required * to support the same semantics (of course :-) * * - you can chain a property helper capable of storing some properties. * Again, you are required to respect the immutability semantics (at * least for non-dynamic properties) * * <p>As of Ant 1.8.0 this method is never invoked by any code * inside of Ant itself.</p> * * @param next the next property helper in the chain. * @deprecated use the delegate mechanism instead */	TokenNameCOMMENT_JAVADOC	 Prior to Ant 1.8.0 there have been 2 ways to hook into property handling: * - you can replace the main PropertyHelper. The replacement is required to support the same semantics (of course :-) * - you can chain a property helper capable of storing some properties. Again, you are required to respect the immutability semantics (at least for non-dynamic properties) * <p>As of Ant 1.8.0 this method is never invoked by any code inside of Ant itself.</p> * @param next the next property helper in the chain. @deprecated use the delegate mechanism instead 
public	TokenNamepublic	
void	TokenNamevoid	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
PropertyHelper	TokenNameIdentifier	 Property Helper
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next property helper in the chain. * * <p>As of Ant 1.8.0 this method is never invoked by any code * inside of Ant itself except the {@link #setPropertyHook * setPropertyHook} and {@link #getPropertyHook getPropertyHook} * methods in this class.</p> * * @return the next property helper. * @deprecated use the delegate mechanism instead */	TokenNameCOMMENT_JAVADOC	 Get the next property helper in the chain. * <p>As of Ant 1.8.0 this method is never invoked by any code inside of Ant itself except the {@link #setPropertyHook setPropertyHook} and {@link #getPropertyHook getPropertyHook} methods in this class.</p> * @return the next property helper. @deprecated use the delegate mechanism instead 
public	TokenNamepublic	
PropertyHelper	TokenNameIdentifier	 Property Helper
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory method to create a property processor. * Users can provide their own or replace it using "ant.PropertyHelper" * reference. User tasks can also add themselves to the chain, and provide * dynamic properties. * * @param project the project for which the property helper is required. * * @return the project's property helper. */	TokenNameCOMMENT_JAVADOC	 Factory method to create a property processor. Users can provide their own or replace it using "ant.PropertyHelper" reference. User tasks can also add themselves to the chain, and provide dynamic properties. * @param project the project for which the property helper is required. * @return the project's property helper. 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
PropertyHelper	TokenNameIdentifier	 Property Helper
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PropertyHelper	TokenNameIdentifier	 Property Helper
)	TokenNameRPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_PROPERTY_HELPER	TokenNameIdentifier	 REFID  PROPERTY  HELPER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
helper	TokenNameIdentifier	 helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyHelper	TokenNameIdentifier	 Property Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
MagicNames	TokenNameIdentifier	 Magic Names
.	TokenNameDOT	
REFID_PROPERTY_HELPER	TokenNameIdentifier	 REFID  PROPERTY  HELPER
,	TokenNameCOMMA	
helper	TokenNameIdentifier	 helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
helper	TokenNameIdentifier	 helper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the {@link PropertyExpander expanders}. * @since Ant 1.8.0 * @return the expanders. */	TokenNameCOMMENT_JAVADOC	 Get the {@link PropertyExpander expanders}. @since Ant 1.8.0 @return the expanders. 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
getExpanders	TokenNameIdentifier	 get Expanders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
PropertyExpander	TokenNameIdentifier	 Property Expander
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- Methods to override -------------------- 	TokenNameCOMMENT_LINE	-------------------- Methods to override -------------------- 
/** * Sets a property. Any existing property of the same name * is overwritten, unless it is a user property. * * If all helpers return false, the property will be saved in * the default properties table by setProperty. * * <p>As of Ant 1.8.0 this method is never invoked by any code * inside of Ant itself.</p> * * @param ns The namespace that the property is in (currently * not used. * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. * @param inherited True if this property is inherited (an [sub]ant[call] property). * @param user True if this property is a user property. * @param isNew True is this is a new property. * @return true if this helper has stored the property, false if it * couldn't. Each helper should delegate to the next one (unless it * has a good reason not to). * @deprecated PropertyHelper chaining is deprecated. */	TokenNameCOMMENT_JAVADOC	 Sets a property. Any existing property of the same name is overwritten, unless it is a user property. * If all helpers return false, the property will be saved in the default properties table by setProperty. * <p>As of Ant 1.8.0 this method is never invoked by any code inside of Ant itself.</p> * @param ns The namespace that the property is in (currently not used. @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. @param inherited True if this property is inherited (an [sub]ant[call] property). @param user True if this property is a user property. @param isNew True is this is a new property. @return true if this helper has stored the property, false if it couldn't. Each helper should delegate to the next one (unless it has a good reason not to). @deprecated PropertyHelper chaining is deprecated. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setPropertyHook	TokenNameIdentifier	 set Property Hook
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inherited	TokenNameIdentifier	 inherited
,	TokenNameCOMMA	
boolean	TokenNameboolean	
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isNew	TokenNameIdentifier	 is New
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
subst	TokenNameIdentifier	 subst
=	TokenNameEQUAL	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPropertyHook	TokenNameIdentifier	 set Property Hook
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
inherited	TokenNameIdentifier	 inherited
,	TokenNameCOMMA	
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
isNew	TokenNameIdentifier	 is New
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If next has handled the property 	TokenNameCOMMENT_LINE	If next has handled the property 
if	TokenNameif	
(	TokenNameLPAREN	
subst	TokenNameIdentifier	 subst
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
/** * Get a property. If all hooks return null, the default * tables will be used. * * <p>As of Ant 1.8.0 this method is never invoked by any code * inside of Ant itself.</p> * * @param ns namespace of the sought property. * @param name name of the sought property. * @param user True if this is a user property. * @return The property, if returned by a hook, or null if none. * @deprecated PropertyHelper chaining is deprecated. */	TokenNameCOMMENT_JAVADOC	 Get a property. If all hooks return null, the default tables will be used. * <p>As of Ant 1.8.0 this method is never invoked by any code inside of Ant itself.</p> * @param ns namespace of the sought property. @param name name of the sought property. @param user True if this is a user property. @return The property, if returned by a hook, or null if none. @deprecated PropertyHelper chaining is deprecated. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getPropertyHook	TokenNameIdentifier	 get Property Hook
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPropertyHook	TokenNameIdentifier	 get Property Hook
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Experimental/Testing, will be removed 	TokenNameCOMMENT_LINE	Experimental/Testing, will be removed 
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"toString:"	TokenNameStringLiteral	toString:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"toString:"	TokenNameStringLiteral	toString:
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- Optional methods -------------------- 	TokenNameCOMMENT_LINE	-------------------- Optional methods -------------------- 
// You can override those methods if you want to optimize or 	TokenNameCOMMENT_LINE	You can override those methods if you want to optimize or 
// do advanced things (like support a special syntax). 	TokenNameCOMMENT_LINE	do advanced things (like support a special syntax). 
// The methods do not chain - you should use them when embedding ant 	TokenNameCOMMENT_LINE	The methods do not chain - you should use them when embedding ant 
// (by replacing the main helper) 	TokenNameCOMMENT_LINE	(by replacing the main helper) 
/** * Parses a string containing <code>${xxx}</code> style property * references into two lists. The first list is a collection * of text fragments, while the other is a set of string property names. * <code>null</code> entries in the first list indicate a property * reference from the second list. * * <p>Delegates to {@link #parsePropertyStringDefault * parsePropertyStringDefault}.</p> * * <p>As of Ant 1.8.0 this method is never invoked by any code * inside of Ant itself except {ProjectHelper#parsePropertyString * ProjectHelper.parsePropertyString}.</p> * * @param value Text to parse. Must not be <code>null</code>. * @param fragments List to add text fragments to. * Must not be <code>null</code>. * @param propertyRefs List to add property names to. * Must not be <code>null</code>. * * @exception BuildException if the string contains an opening * <code>${</code> without a closing * <code>}</code> * @deprecated use the other mechanisms of this class instead */	TokenNameCOMMENT_JAVADOC	 Parses a string containing <code>${xxx}</code> style property references into two lists. The first list is a collection of text fragments, while the other is a set of string property names. <code>null</code> entries in the first list indicate a property reference from the second list. * <p>Delegates to {@link #parsePropertyStringDefault parsePropertyStringDefault}.</p> * <p>As of Ant 1.8.0 this method is never invoked by any code inside of Ant itself except {ProjectHelper#parsePropertyString ProjectHelper.parsePropertyString}.</p> * @param value Text to parse. Must not be <code>null</code>. @param fragments List to add text fragments to. Must not be <code>null</code>. @param propertyRefs List to add property names to. Must not be <code>null</code>. * @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> @deprecated use the other mechanisms of this class instead 
public	TokenNamepublic	
void	TokenNamevoid	
parsePropertyString	TokenNameIdentifier	 parse Property String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
fragments	TokenNameIdentifier	 fragments
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
propertyRefs	TokenNameIdentifier	 property Refs
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
parsePropertyStringDefault	TokenNameIdentifier	 parse Property String Default
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
fragments	TokenNameIdentifier	 fragments
,	TokenNameCOMMA	
propertyRefs	TokenNameIdentifier	 property Refs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces <code>${xxx}</code> style constructions in the given value * with the string value of the corresponding data types. * * <p>Delegates to the one-arg version, completely ignoring the ns * and keys parameters.</p> * * @param ns The namespace for the property. * @param value The string to be scanned for property references. * May be <code>null</code>, in which case this * method returns immediately with no effect. * @param keys Mapping (String to String) of property names to their * values. If <code>null</code>, only project properties will * be used. * * @exception BuildException if the string contains an opening * <code>${</code> without a closing * <code>}</code> * @return the original string with the properties replaced, or * <code>null</code> if the original string is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Replaces <code>${xxx}</code> style constructions in the given value with the string value of the corresponding data types. * <p>Delegates to the one-arg version, completely ignoring the ns and keys parameters.</p> * @param ns The namespace for the property. @param value The string to be scanned for property references. May be <code>null</code>, in which case this method returns immediately with no effect. @param keys Mapping (String to String) of property names to their values. If <code>null</code>, only project properties will be used. * @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> @return the original string with the properties replaced, or <code>null</code> if the original string is <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces <code>${xxx}</code> style constructions in the given value * with the string value of the corresponding data types. * * @param value The string to be scanned for property references. * May be <code>null</code>, in which case this * method returns immediately with no effect. * * @exception BuildException if the string contains an opening * <code>${</code> without a closing * <code>}</code> * @return the original string with the properties replaced, or * <code>null</code> if the original string is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Replaces <code>${xxx}</code> style constructions in the given value with the string value of the corresponding data types. * @param value The string to be scanned for property references. May be <code>null</code>, in which case this method returns immediately with no effect. * @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> @return the original string with the properties replaced, or <code>null</code> if the original string is <code>null</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
?	TokenNameQUESTION	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
:	TokenNameCOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Decode properties from a String representation. If the entire * contents of the String resolve to a single property, that value * is returned. Otherwise a String is returned. * * @param value The string to be scanned for property references. * May be <code>null</code>, in which case this * method returns immediately with no effect. * * @exception BuildException if the string contains an opening * <code>${</code> without a closing * <code>}</code> * @return the original string with the properties replaced, or * <code>null</code> if the original string is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Decode properties from a String representation. If the entire contents of the String resolve to a single property, that value is returned. Otherwise a String is returned. * @param value The string to be scanned for property references. May be <code>null</code>, in which case this method returns immediately with no effect. * @exception BuildException if the string contains an opening <code>${</code> without a closing <code>}</code> @return the original string with the properties replaced, or <code>null</code> if the original string is <code>null</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParseProperties	TokenNameIdentifier	 Parse Properties
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getExpanders	TokenNameIdentifier	 get Expanders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether a String contains replaceable properties. * @param value the String to check. * @return <code>true</code> if <code>value</code> contains property notation. */	TokenNameCOMMENT_JAVADOC	 Learn whether a String contains replaceable properties. @param value the String to check. @return <code>true</code> if <code>value</code> contains property notation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsProperties	TokenNameIdentifier	 contains Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParseProperties	TokenNameIdentifier	 Parse Properties
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getExpanders	TokenNameIdentifier	 get Expanders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsProperties	TokenNameIdentifier	 contains Properties
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- Default implementation -------------------- 	TokenNameCOMMENT_LINE	-------------------- Default implementation -------------------- 
// Methods used to support the default behavior and provide backward 	TokenNameCOMMENT_LINE	Methods used to support the default behavior and provide backward 
// compatibility. Some will be deprecated, you should avoid calling them. 	TokenNameCOMMENT_LINE	compatibility. Some will be deprecated, you should avoid calling them. 
/** * Default implementation of setProperty. Will be called from Project. * This is the original 1.5 implementation, with calls to the hook * added. * * <p>Delegates to the three-arg version, completely ignoring the * ns parameter.</p> * * @param ns The namespace for the property (currently not used). * @param name The name of the property. * @param value The value to set the property to. * @param verbose If this is true output extra log messages. * @return true if the property is set. * @deprecated namespaces are unnecessary. */	TokenNameCOMMENT_JAVADOC	 Default implementation of setProperty. Will be called from Project. This is the original 1.5 implementation, with calls to the hook added. * <p>Delegates to the three-arg version, completely ignoring the ns parameter.</p> * @param ns The namespace for the property (currently not used). @param name The name of the property. @param value The value to set the property to. @param verbose If this is true output extra log messages. @return true if the property is set. @deprecated namespaces are unnecessary. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Default implementation of setProperty. Will be called from Project. * @param name The name of the property. * @param value The value to set the property to. * @param verbose If this is true output extra log messages. * @return true if the property is set. */	TokenNameCOMMENT_JAVADOC	 Default implementation of setProperty. Will be called from Project. @param name The name of the property. @param value The value to set the property to. @param verbose If this is true output extra log messages. @return true if the property is set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
PropertySetter	TokenNameIdentifier	 Property Setter
.	TokenNameDOT	
class	TokenNameclass	
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
PropertySetter	TokenNameIdentifier	 Property Setter
setter	TokenNameIdentifier	 setter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PropertySetter	TokenNameIdentifier	 Property Setter
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setter	TokenNameIdentifier	 setter
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// user (CLI) properties take precedence 	TokenNameCOMMENT_LINE	user (CLI) properties take precedence 
if	TokenNameif	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Override ignored for user property ""	TokenNameStringLiteral	Override ignored for user property "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Overriding previous definition of property ""	TokenNameStringLiteral	Overriding previous definition of property "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting project property: "	TokenNameStringLiteral	Setting project property: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets a property if no value currently exists. If the property * exists already, a message is logged and the method returns with * no other effect. * * <p>Delegates to the two-arg version, completely ignoring the * ns parameter.</p> * * @param ns The namespace for the property (currently not used). * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. * @since Ant 1.6 * @deprecated namespaces are unnecessary. */	TokenNameCOMMENT_JAVADOC	 Sets a property if no value currently exists. If the property exists already, a message is logged and the method returns with no other effect. * <p>Delegates to the two-arg version, completely ignoring the ns parameter.</p> * @param ns The namespace for the property (currently not used). @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. @since Ant 1.6 @deprecated namespaces are unnecessary. 
public	TokenNamepublic	
void	TokenNamevoid	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a property if no value currently exists. If the property * exists already, a message is logged and the method returns with * no other effect. * * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets a property if no value currently exists. If the property exists already, a message is logged and the method returns with no other effect. * @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
PropertySetter	TokenNameIdentifier	 Property Setter
.	TokenNameDOT	
class	TokenNameclass	
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
PropertySetter	TokenNameIdentifier	 Property Setter
setter	TokenNameIdentifier	 setter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PropertySetter	TokenNameIdentifier	 Property Setter
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setter	TokenNameIdentifier	 setter
.	TokenNameDOT	
setNew	TokenNameIdentifier	 set New
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Override ignored for property ""	TokenNameStringLiteral	Override ignored for property "
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting project property: "	TokenNameStringLiteral	Setting project property: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets a user property, which cannot be overwritten by * set/unset property calls. Any previous value is overwritten. * * <p>Delegates to the two-arg version, completely ignoring the * ns parameter.</p> * * @param ns The namespace for the property (currently not used). * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. * @deprecated namespaces are unnecessary. */	TokenNameCOMMENT_JAVADOC	 Sets a user property, which cannot be overwritten by set/unset property calls. Any previous value is overwritten. * <p>Delegates to the two-arg version, completely ignoring the ns parameter.</p> * @param ns The namespace for the property (currently not used). @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. @deprecated namespaces are unnecessary. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a user property, which cannot be overwritten by * set/unset property calls. Any previous value is overwritten. * * <p>Does <code>not</code> consult any delegates.</p> * * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets a user property, which cannot be overwritten by set/unset property calls. Any previous value is overwritten. * <p>Does <code>not</code> consult any delegates.</p> * @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting ro project property: "	TokenNameStringLiteral	Setting ro project property: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets an inherited user property, which cannot be overwritten by set/unset * property calls. Any previous value is overwritten. Also marks * these properties as properties that have not come from the * command line. * * <p>Delegates to the two-arg version, completely ignoring the * ns parameter.</p> * * @param ns The namespace for the property (currently not used). * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. * @deprecated namespaces are unnecessary. */	TokenNameCOMMENT_JAVADOC	 Sets an inherited user property, which cannot be overwritten by set/unset property calls. Any previous value is overwritten. Also marks these properties as properties that have not come from the command line. * <p>Delegates to the two-arg version, completely ignoring the ns parameter.</p> * @param ns The namespace for the property (currently not used). @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. @deprecated namespaces are unnecessary. 
public	TokenNamepublic	
void	TokenNamevoid	
setInheritedProperty	TokenNameIdentifier	 set Inherited Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setInheritedProperty	TokenNameIdentifier	 set Inherited Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets an inherited user property, which cannot be overwritten by set/unset * property calls. Any previous value is overwritten. Also marks * these properties as properties that have not come from the * command line. * * <p>Does <code>not</code> consult any delegates.</p> * * @param name The name of property to set. * Must not be <code>null</code>. * @param value The new value of the property. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets an inherited user property, which cannot be overwritten by set/unset property calls. Any previous value is overwritten. Also marks these properties as properties that have not come from the command line. * <p>Does <code>not</code> consult any delegates.</p> * @param name The name of property to set. Must not be <code>null</code>. @param value The new value of the property. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setInheritedProperty	TokenNameIdentifier	 set Inherited Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Setting ro project property: "	TokenNameStringLiteral	Setting ro project property: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inheritedProperties	TokenNameIdentifier	 inherited Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// -------------------- Getting properties -------------------- 	TokenNameCOMMENT_LINE	-------------------- Getting properties -------------------- 
/** * Returns the value of a property, if it is set. You can override * this method in order to plug your own storage. * * <p>Delegates to the one-arg version ignoring the ns parameter.</p> * * @param ns The namespace for the property (currently not used). * @param name The name of the property. * May be <code>null</code>, in which case * the return value is also <code>null</code>. * @return the property value, or <code>null</code> for no match * or if a <code>null</code> name is provided. * @deprecated namespaces are unnecessary. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a property, if it is set. You can override this method in order to plug your own storage. * <p>Delegates to the one-arg version ignoring the ns parameter.</p> * @param ns The namespace for the property (currently not used). @param name The name of the property. May be <code>null</code>, in which case the return value is also <code>null</code>. @return the property value, or <code>null</code> for no match or if a <code>null</code> name is provided. @deprecated namespaces are unnecessary. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a property, if it is set. * * <p>This is the method that is invoked by {Project#getProperty * Project.getProperty}.</p> * * <p>You can override this method in order to plug your own * storage but the recommended approach is to add your own * implementation of {@link PropertyEvaluator PropertyEvaluator} * instead.</p> * * @param name The name of the property. * May be <code>null</code>, in which case * the return value is also <code>null</code>. * @return the property value, or <code>null</code> for no match * or if a <code>null</code> name is provided. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a property, if it is set. * <p>This is the method that is invoked by {Project#getProperty Project.getProperty}.</p> * <p>You can override this method in order to plug your own storage but the recommended approach is to add your own implementation of {@link PropertyEvaluator PropertyEvaluator} instead.</p> * @param name The name of the property. May be <code>null</code>, in which case the return value is also <code>null</code>. @return the property value, or <code>null</code> for no match or if a <code>null</code> name is provided. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
.	TokenNameDOT	
class	TokenNameclass	
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
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PropertyEvaluator	TokenNameIdentifier	 Property Evaluator
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
NullReturn	TokenNameIdentifier	 Null Return
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a user property, if it is set. * * <p>Delegates to the one-arg version ignoring the ns parameter.</p> * * @param ns The namespace for the property (currently not used). * @param name The name of the property. * May be <code>null</code>, in which case * the return value is also <code>null</code>. * @return the property value, or <code>null</code> for no match * or if a <code>null</code> name is provided. * @deprecated namespaces are unnecessary. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a user property, if it is set. * <p>Delegates to the one-arg version ignoring the ns parameter.</p> * @param ns The namespace for the property (currently not used). @param name The name of the property. May be <code>null</code>, in which case the return value is also <code>null</code>. @return the property value, or <code>null</code> for no match or if a <code>null</code> name is provided. @deprecated namespaces are unnecessary. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserProperty	TokenNameIdentifier	 get User Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getUserProperty	TokenNameIdentifier	 get User Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a user property, if it is set. * * <p>Does <code>not</code> consult any delegates.</p> * * @param name The name of the property. * May be <code>null</code>, in which case * the return value is also <code>null</code>. * @return the property value, or <code>null</code> for no match * or if a <code>null</code> name is provided. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a user property, if it is set. * <p>Does <code>not</code> consult any delegates.</p> * @param name The name of the property. May be <code>null</code>, in which case the return value is also <code>null</code>. @return the property value, or <code>null</code> for no match or if a <code>null</code> name is provided. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getUserProperty	TokenNameIdentifier	 get User Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- Access to property tables -------------------- 	TokenNameCOMMENT_LINE	-------------------- Access to property tables -------------------- 
// This is used to support ant call and similar tasks. It should be 	TokenNameCOMMENT_LINE	This is used to support ant call and similar tasks. It should be 
// deprecated, it is possible to use a better (more efficient) 	TokenNameCOMMENT_LINE	deprecated, it is possible to use a better (more efficient) 
// mechanism to preserve the context. 	TokenNameCOMMENT_LINE	mechanism to preserve the context. 
/** * Returns a copy of the properties table. * * <p>Does not contain properties held by implementations of * delegates (like local properties).</p> * * @return a hashtable containing all properties (including user properties). */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the properties table. * <p>Does not contain properties held by implementations of delegates (like local properties).</p> * @return a hashtable containing all properties (including user properties). 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//avoid concurrent modification: 	TokenNameCOMMENT_LINE	avoid concurrent modification: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// There is a better way to save the context. This shouldn't 	TokenNameCOMMENT_LINE	There is a better way to save the context. This shouldn't 
// delegate to next, it's for backward compatibility only. 	TokenNameCOMMENT_LINE	delegate to next, it's for backward compatibility only. 
}	TokenNameRBRACE	
/** * Returns a copy of the user property hashtable * * <p>Does not contain properties held by implementations of * delegates (like local properties).</p> * * @return a hashtable containing just the user properties */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the user property hashtable * <p>Does not contain properties held by implementations of delegates (like local properties).</p> * @return a hashtable containing just the user properties 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getUserProperties	TokenNameIdentifier	 get User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//avoid concurrent modification: 	TokenNameCOMMENT_LINE	avoid concurrent modification: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a copy of the inherited property hashtable * * <p>Does not contain properties held by implementations of * delegates (like local properties).</p> * * @return a hashtable containing just the inherited properties */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the inherited property hashtable * <p>Does not contain properties held by implementations of delegates (like local properties).</p> * @return a hashtable containing just the inherited properties 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getInheritedProperties	TokenNameIdentifier	 get Inherited Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//avoid concurrent modification: 	TokenNameCOMMENT_LINE	avoid concurrent modification: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
inheritedProperties	TokenNameIdentifier	 inherited Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
inheritedProperties	TokenNameIdentifier	 inherited Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * special back door for subclasses, internal access to the hashtables * @return the live hashtable of all properties */	TokenNameCOMMENT_JAVADOC	 special back door for subclasses, internal access to the hashtables @return the live hashtable of all properties 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
getInternalProperties	TokenNameIdentifier	 get Internal Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
properties	TokenNameIdentifier	 properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * special back door for subclasses, internal access to the hashtables * * @return the live hashtable of user properties */	TokenNameCOMMENT_JAVADOC	 special back door for subclasses, internal access to the hashtables * @return the live hashtable of user properties 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
getInternalUserProperties	TokenNameIdentifier	 get Internal User Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userProperties	TokenNameIdentifier	 user Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * special back door for subclasses, internal access to the hashtables * * @return the live hashtable inherited properties */	TokenNameCOMMENT_JAVADOC	 special back door for subclasses, internal access to the hashtables * @return the live hashtable inherited properties 
protected	TokenNameprotected	
Hashtable	TokenNameIdentifier	 Hashtable
getInternalInheritedProperties	TokenNameIdentifier	 get Internal Inherited Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inheritedProperties	TokenNameIdentifier	 inherited Properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies all user properties that have not been set on the * command line or a GUI tool from this instance to the Project * instance given as the argument. * * <p>To copy all "user" properties, you will also have to call * {@link #copyUserProperties copyUserProperties}.</p> * * <p>Does not copy properties held by implementations of * delegates (like local properties).</p> * * @param other the project to copy the properties to. Must not be null. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Copies all user properties that have not been set on the command line or a GUI tool from this instance to the Project instance given as the argument. * <p>To copy all "user" properties, you will also have to call {@link #copyUserProperties copyUserProperties}.</p> * <p>Does not copy properties held by implementations of delegates (like local properties).</p> * @param other the project to copy the properties to. Must not be null. * @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
copyInheritedProperties	TokenNameIdentifier	 copy Inherited Properties
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//avoid concurrent modification: 	TokenNameCOMMENT_LINE	avoid concurrent modification: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
inheritedProperties	TokenNameIdentifier	 inherited Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
inheritedProperties	TokenNameIdentifier	 inherited Properties
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getUserProperty	TokenNameIdentifier	 get User Property
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
inheritedProperties	TokenNameIdentifier	 inherited Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setInheritedProperty	TokenNameIdentifier	 set Inherited Property
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copies all user properties that have been set on the command * line or a GUI tool from this instance to the Project instance * given as the argument. * * <p>To copy all "user" properties, you will also have to call * {@link #copyInheritedProperties copyInheritedProperties}.</p> * * <p>Does not copy properties held by implementations of * delegates (like local properties).</p> * * @param other the project to copy the properties to. Must not be null. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Copies all user properties that have been set on the command line or a GUI tool from this instance to the Project instance given as the argument. * <p>To copy all "user" properties, you will also have to call {@link #copyInheritedProperties copyInheritedProperties}.</p> * <p>Does not copy properties held by implementations of delegates (like local properties).</p> * @param other the project to copy the properties to. Must not be null. * @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
copyUserProperties	TokenNameIdentifier	 copy User Properties
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//avoid concurrent modification: 	TokenNameCOMMENT_LINE	avoid concurrent modification: 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
userProperties	TokenNameIdentifier	 user Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inheritedProperties	TokenNameIdentifier	 inherited Properties
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
userProperties	TokenNameIdentifier	 user Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// -------------------- Property parsing -------------------- 	TokenNameCOMMENT_LINE	-------------------- Property parsing -------------------- 
// Moved from ProjectHelper. You can override the static method - 	TokenNameCOMMENT_LINE	Moved from ProjectHelper. You can override the static method - 
// this is used for backward compatibility (for code that calls 	TokenNameCOMMENT_LINE	this is used for backward compatibility (for code that calls 
// the parse method in ProjectHelper). 	TokenNameCOMMENT_LINE	the parse method in ProjectHelper). 
/** * Default parsing method. It is here only to support backward compatibility * for the static ProjectHelper.parsePropertyString(). */	TokenNameCOMMENT_JAVADOC	 Default parsing method. It is here only to support backward compatibility for the static ProjectHelper.parsePropertyString(). 
static	TokenNamestatic	
void	TokenNamevoid	
parsePropertyStringDefault	TokenNameIdentifier	 parse Property String Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
fragments	TokenNameIdentifier	 fragments
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
propertyRefs	TokenNameIdentifier	 property Refs
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
//search for the next instance of $ from the 'prev' position 	TokenNameCOMMENT_LINE	search for the next instance of $ from the 'prev' position 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if there was any text before this, add it as a fragment 	TokenNameCOMMENT_LINE	if there was any text before this, add it as a fragment 
//TODO, this check could be modified to go if pos>prev; 	TokenNameCOMMENT_LINE	TODO, this check could be modified to go if pos>prev; 
//seems like this current version could stick empty strings 	TokenNameCOMMENT_LINE	seems like this current version could stick empty strings 
//into the list 	TokenNameCOMMENT_LINE	into the list 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if we are at the end of the string, we tack on a $ 	TokenNameCOMMENT_LINE	if we are at the end of the string, we tack on a $ 
//then move past it 	TokenNameCOMMENT_LINE	then move past it 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//peek ahead to see if the next char is a property or not 	TokenNameCOMMENT_LINE	peek ahead to see if the next char is a property or not 
//not a property: insert the char as a literal 	TokenNameCOMMENT_LINE	not a property: insert the char as a literal 
/* fragments.addElement(value.substring(pos + 1, pos + 2)); prev = pos + 2; */	TokenNameCOMMENT_BLOCK	 fragments.addElement(value.substring(pos + 1, pos + 2)); prev = pos + 2; 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'$'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//backwards compatibility two $ map to one mode 	TokenNameCOMMENT_LINE	backwards compatibility two $ map to one mode 
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//new behaviour: $X maps to $X for all values of X!='$' 	TokenNameCOMMENT_LINE	new behaviour: $X maps to $X for all values of X!='$' 
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//property found, extract its name or bail on a typo 	TokenNameCOMMENT_LINE	property found, extract its name or bail on a typo 
int	TokenNameint	
endName	TokenNameIdentifier	 end Name
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endName	TokenNameIdentifier	 end Name
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Syntax error in property: "	TokenNameStringLiteral	Syntax error in property: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
endName	TokenNameIdentifier	 end Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertyRefs	TokenNameIdentifier	 property Refs
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
endName	TokenNameIdentifier	 end Name
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//no more $ signs found 	TokenNameCOMMENT_LINE	no more $ signs found 
//if there is any tail to the file, append it 	TokenNameCOMMENT_LINE	if there is any tail to the file, append it 
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
<	TokenNameLESS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragments	TokenNameIdentifier	 fragments
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add the specified delegate object to this PropertyHelper. * Delegates are processed in LIFO order. * @param delegate the delegate to add. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Add the specified delegate object to this PropertyHelper. Delegates are processed in LIFO order. @param delegate the delegate to add. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Delegate	TokenNameIdentifier	 Delegate
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
delegates	TokenNameIdentifier	 delegates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
getDelegateInterfaces	TokenNameIdentifier	 get Delegate Interfaces
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
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
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
delegates	TokenNameIdentifier	 delegates
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delegates	TokenNameIdentifier	 delegates
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the Collection of delegates of the specified type. * * @param type * delegate type. * @return Collection. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Get the Collection of delegates of the specified type. * @param type delegate type. @return Collection. @since Ant 1.8.0 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
getDelegates	TokenNameIdentifier	 get Delegates
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
delegates	TokenNameIdentifier	 delegates
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
:	TokenNameCOLON	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get all Delegate interfaces (excluding Delegate itself) from the specified Delegate. * @param d the Delegate to inspect. * @return Set<Class> * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Get all Delegate interfaces (excluding Delegate itself) from the specified Delegate. @param d the Delegate to inspect. @return Set<Class> @since Ant 1.8.0 
protected	TokenNameprotected	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
getDelegateInterfaces	TokenNameIdentifier	 get Delegate Interfaces
(	TokenNameLPAREN	
Delegate	TokenNameIdentifier	 Delegate
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ifs	TokenNameIdentifier	 ifs
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getInterfaces	TokenNameIdentifier	 get Interfaces
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
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ifs	TokenNameIdentifier	 ifs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Delegate	TokenNameIdentifier	 Delegate
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
ifs	TokenNameIdentifier	 ifs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ifs	TokenNameIdentifier	 ifs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Delegate	TokenNameIdentifier	 Delegate
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the given object can be interpreted as a true/false value, * turn it into a matching Boolean - otherwise return null. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 If the given object can be interpreted as a true/false value, turn it into a matching Boolean - otherwise return null. @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
Boolean	TokenNameIdentifier	 Boolean
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"off"	TokenNameStringLiteral	off
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"false"	TokenNameStringLiteral	false
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"no"	TokenNameStringLiteral	no
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the object is null or an empty string. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Returns true if the object is null or an empty string. * @since Ant 1.8.0 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
nullOrEmpty	TokenNameIdentifier	 null Or Empty
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the value can be interpreted as a true value or * cannot be interpreted as a false value and a property of the * value's name exists. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Returns true if the value can be interpreted as a true value or cannot be interpreted as a false value and a property of the value's name exists. @since Ant 1.8.0 
private	TokenNameprivate	
boolean	TokenNameboolean	
evalAsBooleanOrPropertyName	TokenNameIdentifier	 eval As Boolean Or Property Name
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Boolean	TokenNameIdentifier	 Boolean
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the value is null or an empty string, can be * interpreted as a true value or cannot be interpreted as a false * value and a property of the value's name exists. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Returns true if the value is null or an empty string, can be interpreted as a true value or cannot be interpreted as a false value and a property of the value's name exists. @since Ant 1.8.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nullOrEmpty	TokenNameIdentifier	 null Or Empty
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
||	TokenNameOR_OR	
evalAsBooleanOrPropertyName	TokenNameIdentifier	 eval As Boolean Or Property Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the value is null or an empty string, can be * interpreted as a false value or cannot be interpreted as a true * value and a property of the value's name doesn't exist. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Returns true if the value is null or an empty string, can be interpreted as a false value or cannot be interpreted as a true value and a property of the value's name doesn't exist. @since Ant 1.8.0 
public	TokenNamepublic	
boolean	TokenNameboolean	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nullOrEmpty	TokenNameIdentifier	 null Or Empty
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
evalAsBooleanOrPropertyName	TokenNameIdentifier	 eval As Boolean Or Property Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

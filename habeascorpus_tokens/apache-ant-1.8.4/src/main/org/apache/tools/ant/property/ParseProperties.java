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
Collection	TokenNameIdentifier	 Collection
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Parse properties using a collection of expanders. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Parse properties using a collection of expanders. * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
ParseProperties	TokenNameIdentifier	 Parse Properties
implements	TokenNameimplements	
ParseNextProperty	TokenNameIdentifier	 Parse Next Property
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
GetProperty	TokenNameIdentifier	 Get Property
getProperty	TokenNameIdentifier	 get Property
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
expanders	TokenNameIdentifier	 expanders
;	TokenNameSEMICOLON	
/** * Constructor with a getProperty. * @param project the current Ant project. * @param expanders a sequence of expanders * @param getProperty property resolver. */	TokenNameCOMMENT_JAVADOC	 Constructor with a getProperty. @param project the current Ant project. @param expanders a sequence of expanders @param getProperty property resolver. 
public	TokenNamepublic	
ParseProperties	TokenNameIdentifier	 Parse Properties
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
expanders	TokenNameIdentifier	 expanders
,	TokenNameCOMMA	
GetProperty	TokenNameIdentifier	 Get Property
getProperty	TokenNameIdentifier	 get Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expanders	TokenNameIdentifier	 expanders
=	TokenNameEQUAL	
expanders	TokenNameIdentifier	 expanders
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
=	TokenNameEQUAL	
getProperty	TokenNameIdentifier	 get Property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the project. * @return the current Ant project. */	TokenNameCOMMENT_JAVADOC	 Get the project. @return the current Ant project. 
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
/** * Decode properties from a String representation. * * <ul> * * <li>This implementation starts parsing the <code>value</code> * parameter (unsurprisingly) at the beginning and asks each * {@link PropertyExpander PropertyExpander} whether there is a * property reference at that point. PropertyExpanders return * the name of a property they may find and may advance the parse * position.</li> * * <li>If the PropertyExpander returns <code>null</code> the * method continues with the next PropertyExpander, otherwise it * tries to look up the property's value using the configured * {@link GetProperty GetProperty} instance.</li> * * <li>Once all PropertyExpanders have been consulted, the parse * position is advanced by one character and the process repeated * until <code>value</code> is exhausted.</li> * * </ul> * * <p>If the entire contents of <code>value</code> resolves to a * single property, the looked up property value is returned. * Otherwise a String is returned that concatenates the * non-property parts of <code>value</code> and the expanded * values of the properties that have been found.</p> * * @param value The string to be scanned for property references. * May be <code>null</code>, in which case this * method returns immediately with no effect. * * @return the original string with the properties replaced, or * <code>null</code> if the original string is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Decode properties from a String representation. * <ul> * <li>This implementation starts parsing the <code>value</code> parameter (unsurprisingly) at the beginning and asks each {@link PropertyExpander PropertyExpander} whether there is a property reference at that point. PropertyExpanders return the name of a property they may find and may advance the parse position.</li> * <li>If the PropertyExpander returns <code>null</code> the method continues with the next PropertyExpander, otherwise it tries to look up the property's value using the configured {@link GetProperty GetProperty} instance.</li> * <li>Once all PropertyExpanders have been consulted, the parse position is advanced by one character and the process repeated until <code>value</code> is exhausted.</li> * </ul> * <p>If the entire contents of <code>value</code> resolves to a single property, the looked up property value is returned. Otherwise a String is returned that concatenates the non-property parts of <code>value</code> and the expanded values of the properties that have been found.</p> * @param value The string to be scanned for property references. May be <code>null</code>, in which case this method returns immediately with no effect. * @return the original string with the properties replaced, or <code>null</code> if the original string is <code>null</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
new	TokenNamenew	
ParsePosition	TokenNameIdentifier	 Parse Position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
parseNextProperty	TokenNameIdentifier	 parse Next Property
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
parseNextProperty	TokenNameIdentifier	 parse Next Property
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether a String contains replaceable properties. * * <p>Uses the configured {@link PropertyExpander * PropertyExpanders} and scans through the string. Returns true * as soon as any expander finds a property.</p> * * @param value the String to check. * @return <code>true</code> if <code>value</code> contains property notation. */	TokenNameCOMMENT_JAVADOC	 Learn whether a String contains replaceable properties. * <p>Uses the configured {@link PropertyExpander PropertyExpanders} and scans through the string. Returns true as soon as any expander finds a property.</p> * @param value the String to check. @return <code>true</code> if <code>value</code> contains property notation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsProperties	TokenNameIdentifier	 contains Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
new	TokenNamenew	
ParsePosition	TokenNameIdentifier	 Parse Position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parsePropertyName	TokenNameIdentifier	 parse Property Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return any property that can be parsed from the specified position * in the specified String. * * <p>Uses the configured {@link PropertyExpander * PropertyExpanders} and {@link GetProperty GetProperty} * instance .</p> * * @param value String to parse * @param pos ParsePosition * @return Object or null if no property is at the current * location. If a property reference has been found but the * property doesn't expand to a value, the property's name is * returned. */	TokenNameCOMMENT_JAVADOC	 Return any property that can be parsed from the specified position in the specified String. * <p>Uses the configured {@link PropertyExpander PropertyExpanders} and {@link GetProperty GetProperty} instance .</p> * @param value String to parse @param pos ParsePosition @return Object or null if no property is at the current location. If a property reference has been found but the property doesn't expand to a value, the property's name is returned. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
parseNextProperty	TokenNameIdentifier	 parse Next Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// early exit, can't find any property here, no need to 	TokenNameCOMMENT_LINE	early exit, can't find any property here, no need to 
// consult all the delegates. 	TokenNameCOMMENT_LINE	consult all the delegates. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
parsePropertyName	TokenNameIdentifier	 parse Property Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
"Property ""	TokenNameStringLiteral	Property "
+	TokenNamePLUS	
propertyName	TokenNameIdentifier	 property Name
+	TokenNamePLUS	
"" has not been set"	TokenNameStringLiteral	" has not been set
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
parsePropertyName	TokenNameIdentifier	 parse Property Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ParsePosition	TokenNameIdentifier	 Parse Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
expanders	TokenNameIdentifier	 expanders
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
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PropertyExpander	TokenNameIdentifier	 Property Expander
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
parsePropertyName	TokenNameIdentifier	 parse Property Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
propertyName	TokenNameIdentifier	 property Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProperty	TokenNameIdentifier	 get Property
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

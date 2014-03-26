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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Set	TokenNameIdentifier	 Set
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
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Class to resolve properties in a map. This class is explicitly not threadsafe. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Class to resolve properties in a map. This class is explicitly not threadsafe. @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
ResolvePropertyMap	TokenNameIdentifier	 Resolve Property Map
implements	TokenNameimplements	
GetProperty	TokenNameIdentifier	 Get Property
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
seen	TokenNameIdentifier	 seen
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ParseProperties	TokenNameIdentifier	 Parse Properties
parseProperties	TokenNameIdentifier	 parse Properties
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
GetProperty	TokenNameIdentifier	 Get Property
master	TokenNameIdentifier	 master
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
// whether properties of the value side of the map should be 	TokenNameCOMMENT_LINE	whether properties of the value side of the map should be 
// expanded 	TokenNameCOMMENT_LINE	expanded 
private	TokenNameprivate	
boolean	TokenNameboolean	
prefixValues	TokenNameIdentifier	 prefix Values
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// whether the current getProperty call is expanding the key side 	TokenNameCOMMENT_LINE	whether the current getProperty call is expanding the key side 
// of the map 	TokenNameCOMMENT_LINE	of the map 
private	TokenNameprivate	
boolean	TokenNameboolean	
expandingLHS	TokenNameIdentifier	 expanding LHS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Constructor with a master getproperty and a collection of expanders. * @param project the current ant project. * @param master the master property holder (usually PropertyHelper) * @param expanders a collection of expanders (usually from PropertyHelper). */	TokenNameCOMMENT_JAVADOC	 Constructor with a master getproperty and a collection of expanders. @param project the current ant project. @param master the master property holder (usually PropertyHelper) @param expanders a collection of expanders (usually from PropertyHelper). 
public	TokenNamepublic	
ResolvePropertyMap	TokenNameIdentifier	 Resolve Property Map
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
GetProperty	TokenNameIdentifier	 Get Property
master	TokenNameIdentifier	 master
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
expanders	TokenNameIdentifier	 expanders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
master	TokenNameIdentifier	 master
=	TokenNameEQUAL	
master	TokenNameIdentifier	 master
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
=	TokenNameEQUAL	
new	TokenNamenew	
ParseProperties	TokenNameIdentifier	 Parse Properties
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
expanders	TokenNameIdentifier	 expanders
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of a property if it is set. * @param name name of the property. * @return the property value, or null for no match or for name being null. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a property if it is set. @param name name of the property. @return the property value, or null for no match or for name being null. 
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
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Property "	TokenNameStringLiteral	Property 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" was circularly "	TokenNameStringLiteral	 was circularly 
+	TokenNamePLUS	
"defined."	TokenNameStringLiteral	defined.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// If the property we are looking up is a key in the map 	TokenNameCOMMENT_LINE	If the property we are looking up is a key in the map 
// (first call into this method from resolveAllProperties) 	TokenNameCOMMENT_LINE	(first call into this method from resolveAllProperties) 
// or we've been asked to prefix the value side (later 	TokenNameCOMMENT_LINE	or we've been asked to prefix the value side (later 
// recursive calls via the GetProperty interface) the 	TokenNameCOMMENT_LINE	recursive calls via the GetProperty interface) the 
// prefix must be prepended when looking up the property 	TokenNameCOMMENT_LINE	prefix must be prepended when looking up the property 
// outside of the map. 	TokenNameCOMMENT_LINE	outside of the map. 
String	TokenNameIdentifier	 String
fullKey	TokenNameIdentifier	 full Key
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
expandingLHS	TokenNameIdentifier	 expanding LHS
||	TokenNameOR_OR	
prefixValues	TokenNameIdentifier	 prefix Values
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullKey	TokenNameIdentifier	 full Key
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
masterValue	TokenNameIdentifier	 master Value
=	TokenNameEQUAL	
master	TokenNameIdentifier	 master
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
fullKey	TokenNameIdentifier	 full Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masterValue	TokenNameIdentifier	 master Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the property already has a value outside of the 	TokenNameCOMMENT_LINE	If the property already has a value outside of the 
// map, use that value to enforce property 	TokenNameCOMMENT_LINE	map, use that value to enforce property 
// immutability. 	TokenNameCOMMENT_LINE	immutability. 
return	TokenNamereturn	
masterValue	TokenNameIdentifier	 master Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expandingLHS	TokenNameIdentifier	 expanding LHS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// will recurse into this method for each property 	TokenNameCOMMENT_LINE	will recurse into this method for each property 
// reference found in the map's value 	TokenNameCOMMENT_LINE	reference found in the map's value 
return	TokenNamereturn	
parseProperties	TokenNameIdentifier	 parse Properties
.	TokenNameDOT	
parseProperties	TokenNameIdentifier	 parse Properties
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The action method - resolves all the properties in a map. * @param map the map to resolve properties in. * @deprecated since Ant 1.8.2, use the three-arg method instead. */	TokenNameCOMMENT_JAVADOC	 The action method - resolves all the properties in a map. @param map the map to resolve properties in. @deprecated since Ant 1.8.2, use the three-arg method instead. 
public	TokenNamepublic	
void	TokenNamevoid	
resolveAllProperties	TokenNameIdentifier	 resolve All Properties
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolveAllProperties	TokenNameIdentifier	 resolve All Properties
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The action method - resolves all the properties in a map. * @param map the map to resolve properties in. * @param prefix the prefix the properties defined inside the map * will finally receive - may be null. * @deprecated since Ant 1.8.2, use the three-arg method instead. */	TokenNameCOMMENT_JAVADOC	 The action method - resolves all the properties in a map. @param map the map to resolve properties in. @param prefix the prefix the properties defined inside the map will finally receive - may be null. @deprecated since Ant 1.8.2, use the three-arg method instead. 
public	TokenNamepublic	
void	TokenNamevoid	
resolveAllProperties	TokenNameIdentifier	 resolve All Properties
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolveAllProperties	TokenNameIdentifier	 resolve All Properties
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The action method - resolves all the properties in a map. * @param map the map to resolve properties in. * @param prefix the prefix the properties defined inside the map * will finally receive - may be null. * @param prefixValues - whether the prefix will be applied * to properties on the value side of the map as well. */	TokenNameCOMMENT_JAVADOC	 The action method - resolves all the properties in a map. @param map the map to resolve properties in. @param prefix the prefix the properties defined inside the map will finally receive - may be null. @param prefixValues - whether the prefix will be applied to properties on the value side of the map as well. 
public	TokenNamepublic	
void	TokenNamevoid	
resolveAllProperties	TokenNameIdentifier	 resolve All Properties
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
prefixValues	TokenNameIdentifier	 prefix Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The map, prefix and prefixValues flag get used in the 	TokenNameCOMMENT_LINE	The map, prefix and prefixValues flag get used in the 
// getProperty callback 	TokenNameCOMMENT_LINE	getProperty callback 
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefixValues	TokenNameIdentifier	 prefix Values
=	TokenNameEQUAL	
prefixValues	TokenNameIdentifier	 prefix Values
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
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
expandingLHS	TokenNameIdentifier	 expanding LHS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
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
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

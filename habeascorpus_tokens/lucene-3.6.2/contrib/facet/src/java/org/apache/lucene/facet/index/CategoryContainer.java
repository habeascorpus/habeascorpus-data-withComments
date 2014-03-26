package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
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
HashMap	TokenNameIdentifier	 Hash Map
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
CategoryProperty	TokenNameIdentifier	 Category Property
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A container to add categories which are to be introduced to * {@link CategoryDocumentBuilder#setCategories(Iterable)}. Categories can be * added with Properties. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A container to add categories which are to be introduced to {@link CategoryDocumentBuilder#setCategories(Iterable)}. Categories can be added with Properties. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CategoryContainer	TokenNameIdentifier	 Category Container
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
protected	TokenNameprotected	
transient	TokenNametransient	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
,	TokenNameCOMMA	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
CategoryContainer	TokenNameIdentifier	 Category Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
,	TokenNameCOMMA	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a category. * * @param categoryPath * The path of the category. * @return The {@link CategoryAttribute} of the category. */	TokenNameCOMMENT_JAVADOC	 Add a category. * @param categoryPath The path of the category. @return The {@link CategoryAttribute} of the category. 
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mapCategoryAttribute	TokenNameIdentifier	 map Category Attribute
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a category with a property. * * @param categoryPath * The path of the category. * @param property * The property to associate to the category. * @return The {@link CategoryAttribute} of the category. */	TokenNameCOMMENT_JAVADOC	 Add a category with a property. * @param categoryPath The path of the category. @param property The property to associate to the category. @return The {@link CategoryAttribute} of the category. 
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
CategoryProperty	TokenNameIdentifier	 Category Property
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * This method is a special case of addCategory with multiple * properties, but it is kept here for two reasons: 1) Using the array * version has some performance cost, and 2) it is expected that most * calls will be for this version (single property). */	TokenNameCOMMENT_BLOCK	 This method is a special case of addCategory with multiple properties, but it is kept here for two reasons: 1) Using the array version has some performance cost, and 2) it is expected that most calls will be for this version (single property). 
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
mapCategoryAttribute	TokenNameIdentifier	 map Category Attribute
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ca	TokenNameIdentifier	 ca
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a category with multiple properties. * * @param categoryPath * The path of the category. * @param properties * The properties to associate to the category. * @return The {@link CategoryAttribute} of the category. */	TokenNameCOMMENT_JAVADOC	 Add a category with multiple properties. * @param categoryPath The path of the category. @param properties The properties to associate to the category. @return The {@link CategoryAttribute} of the category. 
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
CategoryProperty	TokenNameIdentifier	 Category Property
...	TokenNameELLIPSIS	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
mapCategoryAttribute	TokenNameIdentifier	 map Category Attribute
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryProperty	TokenNameIdentifier	 Category Property
attribute	TokenNameIdentifier	 attribute
:	TokenNameCOLON	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ca	TokenNameIdentifier	 ca
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an entire {@link CategoryAttribute}. * * @param categoryAttribute * The {@link CategoryAttribute} to add. * @return The {@link CategoryAttribute} of the category (could be different * from the one provided). */	TokenNameCOMMENT_JAVADOC	 Add an entire {@link CategoryAttribute}. * @param categoryAttribute The {@link CategoryAttribute} to add. @return The {@link CategoryAttribute} of the category (could be different from the one provided). 
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
categoryAttribute	TokenNameIdentifier	 category Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
mapCategoryAttribute	TokenNameIdentifier	 map Category Attribute
(	TokenNameLPAREN	
categoryAttribute	TokenNameIdentifier	 category Attribute
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
propertyClasses	TokenNameIdentifier	 property Classes
=	TokenNameEQUAL	
categoryAttribute	TokenNameIdentifier	 category Attribute
.	TokenNameDOT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>	TokenNameGREATER	
propertyClass	TokenNameIdentifier	 property Class
:	TokenNameCOLON	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
categoryAttribute	TokenNameIdentifier	 category Attribute
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyClass	TokenNameIdentifier	 property Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ca	TokenNameIdentifier	 ca
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the {@link CategoryAttribute} object for a specific * {@link CategoryPath}, from the map. */	TokenNameCOMMENT_JAVADOC	 Get the {@link CategoryAttribute} object for a specific {@link CategoryPath}, from the map. 
private	TokenNameprivate	
final	TokenNamefinal	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
mapCategoryAttribute	TokenNameIdentifier	 map Category Attribute
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ca	TokenNameIdentifier	 ca
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the {@link CategoryAttribute} this container has for a certain * category, or {@code null} if the category is not in the container. * * @param categoryPath * The category path of the requested category. */	TokenNameCOMMENT_JAVADOC	 Get the {@link CategoryAttribute} this container has for a certain category, or {@code null} if the category is not in the container. * @param categoryPath The category path of the requested category. 
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
getCategoryAttribute	TokenNameIdentifier	 get Category Attribute
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove all categories. */	TokenNameCOMMENT_JAVADOC	 Remove all categories. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add the categories from another {@link CategoryContainer} to this one. */	TokenNameCOMMENT_JAVADOC	 Add the categories from another {@link CategoryContainer} to this one. 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
CategoryContainer	TokenNameIdentifier	 Category Container
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
categoryAttribute	TokenNameIdentifier	 category Attribute
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
categoryAttribute	TokenNameIdentifier	 category Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the number of categories in the container. * * @return The number of categories in the container. */	TokenNameCOMMENT_JAVADOC	 Get the number of categories in the container. * @return The number of categories in the container. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"CategoryContainer"	TokenNameStringLiteral	CategoryContainer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
:	TokenNameCOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serialize object content to given {@link ObjectOutputStream} */	TokenNameCOMMENT_JAVADOC	 Serialize object content to given {@link ObjectOutputStream} 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
defaultWriteObject	TokenNameIdentifier	 default Write Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write the number of categories 	TokenNameCOMMENT_LINE	write the number of categories 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write the category attributes 	TokenNameCOMMENT_LINE	write the category attributes 
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
:	TokenNameCOLON	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
serializeCategoryAttribute	TokenNameIdentifier	 serialize Category Attribute
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Serialize each of the {@link CategoryAttribute}s to the given * {@link ObjectOutputStream}.<br> * NOTE: {@link CategoryProperty}s are {@link Serializable}, but do not * assume that Lucene's {@link Attribute}s are as well * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Serialize each of the {@link CategoryAttribute}s to the given {@link ObjectOutputStream}.<br> NOTE: {@link CategoryProperty}s are {@link Serializable}, but do not assume that Lucene's {@link Attribute}s are as well @throws IOException 
protected	TokenNameprotected	
void	TokenNamevoid	
serializeCategoryAttribute	TokenNameIdentifier	 serialize Category Attribute
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
propertyClasses	TokenNameIdentifier	 property Classes
=	TokenNameEQUAL	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
:	TokenNameCOLON	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Deserialize object from given {@link ObjectInputStream} */	TokenNameCOMMENT_JAVADOC	 Deserialize object from given {@link ObjectInputStream} 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
,	TokenNameCOMMA	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deserializeCategoryAttribute	TokenNameIdentifier	 deserialize Category Attribute
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * De-Serialize each of the {@link CategoryAttribute}s from the given * {@link ObjectInputStream}. */	TokenNameCOMMENT_JAVADOC	 De-Serialize each of the {@link CategoryAttribute}s from the given {@link ObjectInputStream}. 
protected	TokenNameprotected	
void	TokenNamevoid	
deserializeCategoryAttribute	TokenNameIdentifier	 deserialize Category Attribute
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nProperties	TokenNameIdentifier	 n Properties
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nProperties	TokenNameIdentifier	 n Properties
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nProperties	TokenNameIdentifier	 n Properties
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryProperty	TokenNameIdentifier	 Category Property
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryProperty	TokenNameIdentifier	 Category Property
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
CategoryContainer	TokenNameIdentifier	 Category Container
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CategoryContainer	TokenNameIdentifier	 Category Container
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryContainer	TokenNameIdentifier	 Category Container
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

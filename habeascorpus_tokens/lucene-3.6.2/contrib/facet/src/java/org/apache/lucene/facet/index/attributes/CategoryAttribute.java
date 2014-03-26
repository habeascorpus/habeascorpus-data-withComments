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
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An attribute which contains for a certain category the {@link CategoryPath} * and additional properties. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An attribute which contains for a certain category the {@link CategoryPath} and additional properties. * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** * Set the content of this {@link CategoryAttribute} from another * {@link CategoryAttribute} object. * * @param other * The {@link CategoryAttribute} to take the content from. */	TokenNameCOMMENT_JAVADOC	 Set the content of this {@link CategoryAttribute} from another {@link CategoryAttribute} object. * @param other The {@link CategoryAttribute} to take the content from. 
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the category path value of this attribute. * * @param cp * A category path. May not be null. */	TokenNameCOMMENT_JAVADOC	 Sets the category path value of this attribute. * @param cp A category path. May not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setCategoryPath	TokenNameIdentifier	 set Category Path
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the value of this attribute: a category path. * * @return The category path last assigned to this attribute, or null if * none has been assigned. */	TokenNameCOMMENT_JAVADOC	 Returns the value of this attribute: a category path. * @return The category path last assigned to this attribute, or null if none has been assigned. 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add a property. The property can be later retrieved using * {@link #getProperty(Class)} with this property class .<br> * Adding multiple properties of the same class is forbidden. * * @param property * The property to add. * @throws UnsupportedOperationException * When attempting to add a property of a class that was added * before and merge is prohibited. */	TokenNameCOMMENT_JAVADOC	 Add a property. The property can be later retrieved using {@link #getProperty(Class)} with this property class .<br> Adding multiple properties of the same class is forbidden. * @param property The property to add. @throws UnsupportedOperationException When attempting to add a property of a class that was added before and merge is prohibited. 
public	TokenNamepublic	
void	TokenNamevoid	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
CategoryProperty	TokenNameIdentifier	 Category Property
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
;	TokenNameSEMICOLON	
/** * Get a property of a certain property class. * * @param propertyClass * The required property class. * @return The property of the given class, or null if no such property * exists. */	TokenNameCOMMENT_JAVADOC	 Get a property of a certain property class. * @param propertyClass The required property class. @return The property of the given class, or null if no such property exists. 
public	TokenNamepublic	
CategoryProperty	TokenNameIdentifier	 Category Property
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>	TokenNameGREATER	
propertyClass	TokenNameIdentifier	 property Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a property of one of given property classes. * * @param propertyClasses * The property classes. * @return A property matching one of the given classes, or null if no such * property exists. */	TokenNameCOMMENT_JAVADOC	 Get a property of one of given property classes. * @param propertyClasses The property classes. @return A property matching one of the given classes, or null if no such property exists. 
public	TokenNamepublic	
CategoryProperty	TokenNameIdentifier	 Category Property
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get all the active property classes. * * @return A set containing the active property classes, or {@code null} if * there are no properties. */	TokenNameCOMMENT_JAVADOC	 Get all the active property classes. * @return A set containing the active property classes, or {@code null} if there are no properties. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Clone this {@link CategoryAttribute}. * * @return A clone of this {@link CategoryAttribute}. */	TokenNameCOMMENT_JAVADOC	 Clone this {@link CategoryAttribute}. * @return A clone of this {@link CategoryAttribute}. 
public	TokenNamepublic	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Resets this attribute to its initial value: a null category path and no * properties. */	TokenNameCOMMENT_JAVADOC	 Resets this attribute to its initial value: a null category path and no properties. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Clear all properties. */	TokenNameCOMMENT_JAVADOC	 Clear all properties. 
public	TokenNamepublic	
void	TokenNamevoid	
clearProperties	TokenNameIdentifier	 clear Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Remove an property of a certain property class. * * @param propertyClass * The required property class. */	TokenNameCOMMENT_JAVADOC	 Remove an property of a certain property class. * @param propertyClass The required property class. 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>	TokenNameGREATER	
propertyClass	TokenNameIdentifier	 property Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

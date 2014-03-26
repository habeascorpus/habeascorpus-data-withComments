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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
FacetException	TokenNameIdentifier	 Facet Exception
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
DummyProperty	TokenNameIdentifier	 Dummy Property
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryAttributeImplTest	TokenNameIdentifier	 Category Attribute Impl Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCategoryPath	TokenNameIdentifier	 test Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Category Path should be null"	TokenNameStringLiteral	Category Path should be null
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
setCategoryPath	TokenNameIdentifier	 set Category Path
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong Category Path"	TokenNameStringLiteral	Wrong Category Path
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
setCategoryPath	TokenNameIdentifier	 set Category Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Category Path should be null"	TokenNameStringLiteral	Category Path should be null
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong Category Path"	TokenNameStringLiteral	Wrong Category Path
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testProperties	TokenNameIdentifier	 test Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
FacetException	TokenNameIdentifier	 Facet Exception
{	TokenNameLBRACE	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca	TokenNameIdentifier	 ca
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Attribute should be null"	TokenNameStringLiteral	Attribute should be null
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DummyProperty	TokenNameIdentifier	 Dummy Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Attribute classes should be null"	TokenNameStringLiteral	Attribute classes should be null
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DummyProperty should be in properties"	TokenNameStringLiteral	DummyProperty should be in properties
,	TokenNameCOMMA	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DummyProperty	TokenNameIdentifier	 Dummy Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Attribute classes should contain 1 element"	TokenNameStringLiteral	Attribute classes should contain 1 element
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
failed	TokenNameIdentifier	 failed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Two DummyAttributes added to the same CategoryAttribute"	TokenNameStringLiteral	Two DummyAttributes added to the same CategoryAttribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
clearProperties	TokenNameIdentifier	 clear Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Attribute classes should be null"	TokenNameStringLiteral	Attribute classes should be null
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DummyProperty should be in properties"	TokenNameStringLiteral	DummyProperty should be in properties
,	TokenNameCOMMA	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DummyProperty	TokenNameIdentifier	 Dummy Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
DummyProperty	TokenNameIdentifier	 Dummy Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DummyProperty should not be in properties"	TokenNameStringLiteral	DummyProperty should not be in properties
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DummyProperty	TokenNameIdentifier	 Dummy Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Attribute classes should be null"	TokenNameStringLiteral	Attribute classes should be null
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getPropertyClasses	TokenNameIdentifier	 get Property Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
propertyClasses	TokenNameIdentifier	 property Classes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
CategoryProperty	TokenNameIdentifier	 Category Property
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"No property expected when no classes given"	TokenNameStringLiteral	No property expected when no classes given
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertyClasses	TokenNameIdentifier	 property Classes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DummyProperty	TokenNameIdentifier	 Dummy Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DummyProperty should be in properties"	TokenNameStringLiteral	DummyProperty should be in properties
,	TokenNameCOMMA	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertyClasses	TokenNameIdentifier	 property Classes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
OrdinalProperty	TokenNameIdentifier	 Ordinal Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"DummyProperty should be in properties"	TokenNameStringLiteral	DummyProperty should be in properties
,	TokenNameCOMMA	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertyClasses	TokenNameIdentifier	 property Classes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propertyClasses	TokenNameIdentifier	 property Classes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
OrdinalProperty	TokenNameIdentifier	 Ordinal Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"No ordinal property expected"	TokenNameStringLiteral	No ordinal property expected
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
ca	TokenNameIdentifier	 ca
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyClasses	TokenNameIdentifier	 property Classes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCloneCopyToAndSet	TokenNameIdentifier	 test Clone Copy To And Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
FacetException	TokenNameIdentifier	 Facet Exception
{	TokenNameLBRACE	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
ca1	TokenNameIdentifier	 ca1
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
setCategoryPath	TokenNameIdentifier	 set Category Path
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
addProperty	TokenNameIdentifier	 add Property
(	TokenNameLPAREN	
new	TokenNamenew	
DummyProperty	TokenNameIdentifier	 Dummy Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryAttribute	TokenNameIdentifier	 Category Attribute
ca2	TokenNameIdentifier	 ca2
=	TokenNameEQUAL	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Error in cloning"	TokenNameStringLiteral	Error in cloning
,	TokenNameCOMMA	
ca1	TokenNameIdentifier	 ca1
,	TokenNameCOMMA	
ca2	TokenNameIdentifier	 ca2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
ca3	TokenNameIdentifier	 ca3
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryAttributeImpl	TokenNameIdentifier	 Category Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"Should not be the same"	TokenNameStringLiteral	Should not be the same
,	TokenNameCOMMA	
ca1	TokenNameIdentifier	 ca1
,	TokenNameCOMMA	
ca3	TokenNameIdentifier	 ca3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca1	TokenNameIdentifier	 ca1
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
ca3	TokenNameIdentifier	 ca3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Error in cloning"	TokenNameStringLiteral	Error in cloning
,	TokenNameCOMMA	
ca1	TokenNameIdentifier	 ca1
,	TokenNameCOMMA	
ca3	TokenNameIdentifier	 ca3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca2	TokenNameIdentifier	 ca2
.	TokenNameDOT	
setCategoryPath	TokenNameIdentifier	 set Category Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"Should not be the same"	TokenNameStringLiteral	Should not be the same
,	TokenNameCOMMA	
ca1	TokenNameIdentifier	 ca1
,	TokenNameCOMMA	
ca2	TokenNameIdentifier	 ca2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ca2	TokenNameIdentifier	 ca2
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ca3	TokenNameIdentifier	 ca3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Error in cloning"	TokenNameStringLiteral	Error in cloning
,	TokenNameCOMMA	
ca1	TokenNameIdentifier	 ca1
,	TokenNameCOMMA	
ca2	TokenNameIdentifier	 ca2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

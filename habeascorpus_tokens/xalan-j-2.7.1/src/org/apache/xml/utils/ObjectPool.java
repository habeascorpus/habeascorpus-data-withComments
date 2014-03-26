/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ObjectPool.java 475981 2006-11-16 23:35:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ObjectPool.java 475981 2006-11-16 23:35:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
/** * Pool of object of a given type to pick from to help memory usage * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Pool of object of a given type to pick from to help memory usage @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ObjectPool	TokenNameIdentifier	 Object Pool
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8519013691660936643L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Type of objects in this pool. * @serial */	TokenNameCOMMENT_JAVADOC	 Type of objects in this pool. @serial 
private	TokenNameprivate	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
objectType	TokenNameIdentifier	 object Type
;	TokenNameSEMICOLON	
/** Stack of given objects this points to. * @serial */	TokenNameCOMMENT_JAVADOC	 Stack of given objects this points to. @serial 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
freeStack	TokenNameIdentifier	 free Stack
;	TokenNameSEMICOLON	
/** * Constructor ObjectPool * * @param type Type of objects for this pool */	TokenNameCOMMENT_JAVADOC	 Constructor ObjectPool * @param type Type of objects for this pool 
public	TokenNamepublic	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
objectType	TokenNameIdentifier	 object Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
freeStack	TokenNameIdentifier	 free Stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor ObjectPool * * @param className Fully qualified name of the type of objects for this pool. */	TokenNameCOMMENT_JAVADOC	 Constructor ObjectPool * @param className Fully qualified name of the type of objects for this pool. 
public	TokenNamepublic	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
objectType	TokenNameIdentifier	 object Type
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
freeStack	TokenNameIdentifier	 free Stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor ObjectPool * * * @param type Type of objects for this pool * @param size Size of vector to allocate */	TokenNameCOMMENT_JAVADOC	 Constructor ObjectPool * @param type Type of objects for this pool @param size Size of vector to allocate 
public	TokenNamepublic	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
objectType	TokenNameIdentifier	 object Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
freeStack	TokenNameIdentifier	 free Stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor ObjectPool * */	TokenNameCOMMENT_JAVADOC	 Constructor ObjectPool 
public	TokenNamepublic	
ObjectPool	TokenNameIdentifier	 Object Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
objectType	TokenNameIdentifier	 object Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
freeStack	TokenNameIdentifier	 free Stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of the given object in this pool if available * * * @return an instance of the given object if available or null */	TokenNameCOMMENT_JAVADOC	 Get an instance of the given object in this pool if available * @return an instance of the given object if available or null 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
getInstanceIfFree	TokenNameIdentifier	 get Instance If Free
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if the pool is empty. 	TokenNameCOMMENT_LINE	Check if the pool is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove object from end of free pool. 	TokenNameCOMMENT_LINE	Remove object from end of free pool. 
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of the given object in this pool * * * @return An instance of the given object */	TokenNameCOMMENT_JAVADOC	 Get an instance of the given object in this pool * @return An instance of the given object 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if the pool is empty. 	TokenNameCOMMENT_LINE	Check if the pool is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a new object if so. 	TokenNameCOMMENT_LINE	Create a new object if so. 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
objectType	TokenNameIdentifier	 object Type
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Throw unchecked exception for error in pool configuration. 	TokenNameCOMMENT_LINE	Throw unchecked exception for error in pool configuration. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_EXCEPTION_CREATING_POOL	TokenNameIdentifier	 ER  EXCEPTION  CREATING  POOL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"exception creating new instance for pool"); 	TokenNameCOMMENT_LINE	"exception creating new instance for pool"); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Remove object from end of free pool. 	TokenNameCOMMENT_LINE	Remove object from end of free pool. 
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add an instance of the given object to the pool * * * @param obj Object to add. */	TokenNameCOMMENT_JAVADOC	 Add an instance of the given object to the pool * @param obj Object to add. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
freeInstance	TokenNameIdentifier	 free Instance
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure the object is of the correct type. 	TokenNameCOMMENT_LINE	Make sure the object is of the correct type. 
// Remove safety. -sb 	TokenNameCOMMENT_LINE	Remove safety. -sb 
// if (objectType.isInstance(obj)) 	TokenNameCOMMENT_LINE	if (objectType.isInstance(obj)) 
// { 	TokenNameCOMMENT_LINE	{ 
freeStack	TokenNameIdentifier	 free Stack
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// throw new IllegalArgumentException("argument type invalid for pool"); 	TokenNameCOMMENT_LINE	throw new IllegalArgumentException("argument type invalid for pool"); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: IteratorPool.java 475981 2006-11-16 23:35:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: IteratorPool.java 475981 2006-11-16 23:35:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
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
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
;	TokenNameSEMICOLON	
/** * Pool of object of a given type to pick from to help memory usage * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Pool of object of a given type to pick from to help memory usage @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IteratorPool	TokenNameIdentifier	 Iterator Pool
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
460927331149566998L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Type of objects in this pool. */	TokenNameCOMMENT_JAVADOC	 Type of objects in this pool. 
private	TokenNameprivate	
final	TokenNamefinal	
DTMIterator	TokenNameIdentifier	 DTM Iterator
m_orig	TokenNameIdentifier	 m orig
;	TokenNameSEMICOLON	
/** * Stack of given objects this points to. */	TokenNameCOMMENT_JAVADOC	 Stack of given objects this points to. 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
m_freeStack	TokenNameIdentifier	 m free Stack
;	TokenNameSEMICOLON	
/** * Constructor IteratorPool * * @param original The original iterator from which all others will be cloned. */	TokenNameCOMMENT_JAVADOC	 Constructor IteratorPool * @param original The original iterator from which all others will be cloned. 
public	TokenNamepublic	
IteratorPool	TokenNameIdentifier	 Iterator Pool
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_orig	TokenNameIdentifier	 m orig
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
;	TokenNameSEMICOLON	
m_freeStack	TokenNameIdentifier	 m free Stack
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of the given object in this pool * * @return An instance of the given object */	TokenNameCOMMENT_JAVADOC	 Get an instance of the given object in this pool * @return An instance of the given object 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getInstanceOrThrow	TokenNameIdentifier	 get Instance Or Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
// Check if the pool is empty. 	TokenNameCOMMENT_LINE	Check if the pool is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
m_freeStack	TokenNameIdentifier	 m free Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create a new object if so. 	TokenNameCOMMENT_LINE	Create a new object if so. 
return	TokenNamereturn	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_orig	TokenNameIdentifier	 m orig
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Remove object from end of free pool. 	TokenNameCOMMENT_LINE	Remove object from end of free pool. 
DTMIterator	TokenNameIdentifier	 DTM Iterator
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_freeStack	TokenNameIdentifier	 m free Stack
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
m_freeStack	TokenNameIdentifier	 m free Stack
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
/** * Get an instance of the given object in this pool * * @return An instance of the given object */	TokenNameCOMMENT_JAVADOC	 Get an instance of the given object in this pool * @return An instance of the given object 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if the pool is empty. 	TokenNameCOMMENT_LINE	Check if the pool is empty. 
if	TokenNameif	
(	TokenNameLPAREN	
m_freeStack	TokenNameIdentifier	 m free Stack
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
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_orig	TokenNameIdentifier	 m orig
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Remove object from end of free pool. 	TokenNameCOMMENT_LINE	Remove object from end of free pool. 
DTMIterator	TokenNameIdentifier	 DTM Iterator
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_freeStack	TokenNameIdentifier	 m free Stack
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
m_freeStack	TokenNameIdentifier	 m free Stack
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
DTMIterator	TokenNameIdentifier	 DTM Iterator
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_freeStack	TokenNameIdentifier	 m free Stack
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

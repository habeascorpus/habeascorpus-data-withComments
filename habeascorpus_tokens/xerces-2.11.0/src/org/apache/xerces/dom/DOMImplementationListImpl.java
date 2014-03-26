/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementationList	TokenNameIdentifier	 DOM Implementation List
;	TokenNameSEMICOLON	
/** * <p>This class implements the DOM Level 3 Core interface DOMImplementationList.</p> * * @xerces.internal * * @author Neil Delima, IBM * @since DOM Level 3 Core */	TokenNameCOMMENT_JAVADOC	 <p>This class implements the DOM Level 3 Core interface DOMImplementationList.</p> * @xerces.internal * @author Neil Delima, IBM @since DOM Level 3 Core 
public	TokenNamepublic	
class	TokenNameclass	
DOMImplementationListImpl	TokenNameIdentifier	 DOM Implementation List Impl
implements	TokenNameimplements	
DOMImplementationList	TokenNameIdentifier	 DOM Implementation List
{	TokenNameLBRACE	
// A collection of DOMImplementations 	TokenNameCOMMENT_LINE	A collection of DOMImplementations 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
fImplementations	TokenNameIdentifier	 f Implementations
;	TokenNameSEMICOLON	
/** * Construct an empty list of DOMImplementations */	TokenNameCOMMENT_JAVADOC	 Construct an empty list of DOMImplementations 
public	TokenNamepublic	
DOMImplementationListImpl	TokenNameIdentifier	 DOM Implementation List Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fImplementations	TokenNameIdentifier	 f Implementations
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a list of DOMImplementations from an ArrayList */	TokenNameCOMMENT_JAVADOC	 Construct a list of DOMImplementations from an ArrayList 
public	TokenNamepublic	
DOMImplementationListImpl	TokenNameIdentifier	 DOM Implementation List Impl
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fImplementations	TokenNameIdentifier	 f Implementations
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a list of DOMImplementations from a Vector */	TokenNameCOMMENT_JAVADOC	 Construct a list of DOMImplementations from a Vector 
public	TokenNamepublic	
DOMImplementationListImpl	TokenNameIdentifier	 DOM Implementation List Impl
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fImplementations	TokenNameIdentifier	 f Implementations
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the indexth item in the collection. * * @param index The index of the DOMImplemetation from the list to return. */	TokenNameCOMMENT_JAVADOC	 Returns the indexth item in the collection. * @param index The index of the DOMImplemetation from the list to return. 
public	TokenNamepublic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
)	TokenNameRPAREN	
fImplementations	TokenNameIdentifier	 f Implementations
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of DOMImplementations in the list. * * @return An integer indicating the number of DOMImplementations. */	TokenNameCOMMENT_JAVADOC	 Returns the number of DOMImplementations in the list. * @return An integer indicating the number of DOMImplementations. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fImplementations	TokenNameIdentifier	 f Implementations
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

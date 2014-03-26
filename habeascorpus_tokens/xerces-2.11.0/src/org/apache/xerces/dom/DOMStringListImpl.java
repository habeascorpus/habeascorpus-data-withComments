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
DOMStringList	TokenNameIdentifier	 DOM String List
;	TokenNameSEMICOLON	
/** * DOM Level 3 * * This class implements the DOM Level 3 Core interface DOMStringList. * * @xerces.internal * * @author Neil Delima, IBM */	TokenNameCOMMENT_JAVADOC	 DOM Level 3 * This class implements the DOM Level 3 Core interface DOMStringList. * @xerces.internal * @author Neil Delima, IBM 
public	TokenNamepublic	
class	TokenNameclass	
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
implements	TokenNameimplements	
DOMStringList	TokenNameIdentifier	 DOM String List
{	TokenNameLBRACE	
// A collection of DOMString values 	TokenNameCOMMENT_LINE	A collection of DOMString values 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
fStrings	TokenNameIdentifier	 f Strings
;	TokenNameSEMICOLON	
/** * Construct an empty list of DOMStringListImpl */	TokenNameCOMMENT_JAVADOC	 Construct an empty list of DOMStringListImpl 
public	TokenNamepublic	
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DOMStringListImpl from an ArrayList */	TokenNameCOMMENT_JAVADOC	 Construct a DOMStringListImpl from an ArrayList 
public	TokenNamepublic	
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DOMStringListImpl from a Vector */	TokenNameCOMMENT_JAVADOC	 Construct a DOMStringListImpl from a Vector 
public	TokenNamepublic	
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.DOMStringList#item(int) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.DOMStringList#item(int) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
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
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fStrings	TokenNameIdentifier	 f Strings
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
/** * @see org.w3c.dom.DOMStringList#getLength() */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.DOMStringList#getLength() 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fStrings	TokenNameIdentifier	 f Strings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.w3c.dom.DOMStringList#contains(String) */	TokenNameCOMMENT_JAVADOC	 @see org.w3c.dom.DOMStringList#contains(String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fStrings	TokenNameIdentifier	 f Strings
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * DOM Internal: * Add a <code>DOMString</code> to the list. * * @param param A string to add to the list */	TokenNameCOMMENT_JAVADOC	 DOM Internal: Add a <code>DOMString</code> to the list. * @param param A string to add to the list 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

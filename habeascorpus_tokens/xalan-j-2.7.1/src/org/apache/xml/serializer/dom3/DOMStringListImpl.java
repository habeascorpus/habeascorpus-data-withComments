/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: $ */	TokenNameCOMMENT_BLOCK	 $Id: $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
//import org.apache.xerces.dom3.DOMStringList; 	TokenNameCOMMENT_LINE	import org.apache.xerces.dom3.DOMStringList; 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMStringList	TokenNameIdentifier	 DOM String List
;	TokenNameSEMICOLON	
/** * This class implemets the DOM Level 3 Core interface DOMStringList. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class implemets the DOM Level 3 Core interface DOMStringList. * @xsl.usage internal 
final	TokenNamefinal	
class	TokenNameclass	
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
implements	TokenNameimplements	
DOMStringList	TokenNameIdentifier	 DOM String List
{	TokenNameLBRACE	
//A collection of DOMString values 	TokenNameCOMMENT_LINE	A collection of DOMString values 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
fStrings	TokenNameIdentifier	 f Strings
;	TokenNameSEMICOLON	
/** * Construct an empty list of DOMStringListImpl */	TokenNameCOMMENT_JAVADOC	 Construct an empty list of DOMStringListImpl 
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an empty list of DOMStringListImpl */	TokenNameCOMMENT_JAVADOC	 Construct an empty list of DOMStringListImpl 
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an empty list of DOMStringListImpl */	TokenNameCOMMENT_JAVADOC	 Construct an empty list of DOMStringListImpl 
DOMStringListImpl	TokenNameIdentifier	 DOM String List Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStrings	TokenNameIdentifier	 f Strings
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.dom3.DOMStringList#item(int) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.dom3.DOMStringList#item(int) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fStrings	TokenNameIdentifier	 f Strings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.dom3.DOMStringList#getLength() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.dom3.DOMStringList#getLength() 
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
/** * @see org.apache.xerces.dom3.DOMStringList#contains(String) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.dom3.DOMStringList#contains(String) 
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
/** * DOM Internal: * Add a <code>DOMString</code> to the list. * * @param domString A string to add to the list */	TokenNameCOMMENT_JAVADOC	 DOM Internal: Add a <code>DOMString</code> to the list. * @param domString A string to add to the list 
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

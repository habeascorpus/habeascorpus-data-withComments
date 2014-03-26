/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * The <code>ShortList</code> is an immutable ordered collection of * <code>unsigned short</code>. */	TokenNameCOMMENT_JAVADOC	 The <code>ShortList</code> is an immutable ordered collection of <code>unsigned short</code>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ShortList	TokenNameIdentifier	 Short List
extends	TokenNameextends	
List	TokenNameIdentifier	 List
{	TokenNameLBRACE	
/** * The number of <code>unsigned short</code>s in the list. The range of * valid child object indices is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>unsigned short</code>s in the list. The range of valid child object indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Checks if the <code>unsigned short</code> <code>item</code> is a * member of this list. * @param item <code>unsigned short</code> whose presence in this list * is to be tested. * @return True if this list contains the <code>unsigned short</code> * <code>item</code>. */	TokenNameCOMMENT_JAVADOC	 Checks if the <code>unsigned short</code> <code>item</code> is a member of this list. @param item <code>unsigned short</code> whose presence in this list is to be tested. @return True if this list contains the <code>unsigned short</code> <code>item</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
short	TokenNameshort	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the <code>index</code>th item in the collection. The index * starts at 0. * @param index index into the collection. * @return The <code>unsigned short</code> at the <code>index</code>th * position in the <code>ShortList</code>. * @exception XSException * INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the * number of objects in the list. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. The index starts at 0. @param index index into the collection. @return The <code>unsigned short</code> at the <code>index</code>th position in the <code>ShortList</code>. @exception XSException INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the number of objects in the list. 
public	TokenNamepublic	
short	TokenNameshort	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

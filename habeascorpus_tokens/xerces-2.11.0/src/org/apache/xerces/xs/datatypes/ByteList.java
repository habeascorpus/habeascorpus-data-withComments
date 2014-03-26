/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
datatypes	TokenNameIdentifier	 datatypes
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * <p>The <code>ByteList</code> is an immutable ordered collection of * <code>byte</code>.</p> * * @author Ankit Pasricha, IBM * * @version $Id: ByteList.java 1024038 2010-10-18 22:06:35Z sandygao $ */	TokenNameCOMMENT_JAVADOC	 <p>The <code>ByteList</code> is an immutable ordered collection of <code>byte</code>.</p> * @author Ankit Pasricha, IBM * @version $Id: ByteList.java 1024038 2010-10-18 22:06:35Z sandygao $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ByteList	TokenNameIdentifier	 Byte List
extends	TokenNameextends	
List	TokenNameIdentifier	 List
{	TokenNameLBRACE	
/** * The number of <code>byte</code>s in the list. The range of * valid child object indices is 0 to <code>length-1</code> inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>byte</code>s in the list. The range of valid child object indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Checks if the <code>byte</code> <code>item</code> is a * member of this list. * @param item <code>byte</code> whose presence in this list * is to be tested. * @return True if this list contains the <code>byte</code> * <code>item</code>. */	TokenNameCOMMENT_JAVADOC	 Checks if the <code>byte</code> <code>item</code> is a member of this list. @param item <code>byte</code> whose presence in this list is to be tested. @return True if this list contains the <code>byte</code> <code>item</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
byte	TokenNamebyte	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the <code>index</code>th item in the collection. The index * starts at 0. * @param index index into the collection. * @return The <code>byte</code> at the <code>index</code>th * position in the <code>ByteList</code>. * @exception XSException * INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the * number of objects in the list or less than zero. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection. The index starts at 0. @param index index into the collection. @return The <code>byte</code> at the <code>index</code>th position in the <code>ByteList</code>. @exception XSException INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the number of objects in the list or less than zero. 
public	TokenNamepublic	
byte	TokenNamebyte	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * Construct and return a byte array for bytes contained in this list. */	TokenNameCOMMENT_JAVADOC	 Construct and return a byte array for bytes contained in this list. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * This class is used, via a pool managed on CoreDocumentImpl, in ParentNode to * improve performance of the NodeList accessors, getLength() and item(i). * * @xerces.internal * * @author Arnaud Le Hors, IBM * * @version $Id: NodeListCache.java 447266 2006-09-18 05:57:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is used, via a pool managed on CoreDocumentImpl, in ParentNode to improve performance of the NodeList accessors, getLength() and item(i). * @xerces.internal * @author Arnaud Le Hors, IBM * @version $Id: NodeListCache.java 447266 2006-09-18 05:57:49Z mrglavas $ 
class	TokenNameclass	
NodeListCache	TokenNameIdentifier	 Node List Cache
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
7927529254918631002L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Cached node list length. */	TokenNameCOMMENT_JAVADOC	 Cached node list length. 
int	TokenNameint	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Last requested node index. */	TokenNameCOMMENT_JAVADOC	 Last requested node index. 
int	TokenNameint	
fChildIndex	TokenNameIdentifier	 f Child Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Last requested node. */	TokenNameCOMMENT_JAVADOC	 Last requested node. 
ChildNode	TokenNameIdentifier	 Child Node
fChild	TokenNameIdentifier	 f Child
;	TokenNameSEMICOLON	
/** Owner of this cache */	TokenNameCOMMENT_JAVADOC	 Owner of this cache 
ParentNode	TokenNameIdentifier	 Parent Node
fOwner	TokenNameIdentifier	 f Owner
;	TokenNameSEMICOLON	
/** Pointer to the next object on the list, only meaningful when actully stored in the free list. */	TokenNameCOMMENT_JAVADOC	 Pointer to the next object on the list, only meaningful when actully stored in the free list. 
NodeListCache	TokenNameIdentifier	 Node List Cache
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
NodeListCache	TokenNameIdentifier	 Node List Cache
(	TokenNameLPAREN	
ParentNode	TokenNameIdentifier	 Parent Node
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fOwner	TokenNameIdentifier	 f Owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

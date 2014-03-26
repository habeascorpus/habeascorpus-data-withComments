/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: VariableSafeAbsRef.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: VariableSafeAbsRef.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
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
DTMManager	TokenNameIdentifier	 DTM Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * This is a "smart" variable reference that is used in situations where * an absolute path is optimized into a variable reference, but may * be used in some situations where the document context may have changed. * For instance, in select="document(doc/@href)//name[//salary &gt; 7250]", the * root in the predicate will be different for each node in the set. While * this is easy to detect statically in this case, in other cases static * detection would be very hard or impossible. So, this class does a dynamic check * to make sure the document context of the referenced variable is the same as * the current document context, and, if it is not, execute the referenced variable's * expression with the current context instead. */	TokenNameCOMMENT_JAVADOC	 This is a "smart" variable reference that is used in situations where an absolute path is optimized into a variable reference, but may be used in some situations where the document context may have changed. For instance, in select="document(doc/@href)//name[//salary &gt; 7250]", the root in the predicate will be different for each node in the set. While this is easy to detect statically in this case, in other cases static detection would be very hard or impossible. So, this class does a dynamic check to make sure the document context of the referenced variable is the same as the current document context, and, if it is not, execute the referenced variable's expression with the current context instead. 
public	TokenNamepublic	
class	TokenNameclass	
VariableSafeAbsRef	TokenNameIdentifier	 Variable Safe Abs Ref
extends	TokenNameextends	
Variable	TokenNameIdentifier	 Variable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
9174661990819967452L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Dereference the variable, and return the reference value. Note that lazy * evaluation will occur. If a variable within scope is not found, a warning * will be sent to the error listener, and an empty nodeset will be returned. * * * @param xctxt The runtime execution context. * * @return The evaluated variable, or an empty nodeset if not found. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Dereference the variable, and return the reference value. Note that lazy evaluation will occur. If a variable within scope is not found, a warning will be sent to the error listener, and an empty nodeset will be returned. * @param xctxt The runtime execution context. * @return The evaluated variable, or an empty nodeset if not found. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
boolean	TokenNameboolean	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
xns	TokenNameIdentifier	 xns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmMgr	TokenNameIdentifier	 dtm Mgr
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtmMgr	TokenNameIdentifier	 dtm Mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
xns	TokenNameIdentifier	 xns
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
dtmMgr	TokenNameIdentifier	 dtm Mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
xns	TokenNameIdentifier	 xns
.	TokenNameDOT	
getContainedIter	TokenNameIdentifier	 get Contained Iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xns	TokenNameIdentifier	 xns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
asIterator	TokenNameIdentifier	 as Iterator
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
xns	TokenNameIdentifier	 xns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

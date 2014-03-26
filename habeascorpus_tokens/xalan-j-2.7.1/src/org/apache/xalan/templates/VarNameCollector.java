/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: VarNameCollector.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: VarNameCollector.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
;	TokenNameSEMICOLON	
/** * This class visits variable refs in an XPath and collects their QNames. */	TokenNameCOMMENT_JAVADOC	 This class visits variable refs in an XPath and collects their QNames. 
public	TokenNamepublic	
class	TokenNameclass	
VarNameCollector	TokenNameIdentifier	 Var Name Collector
extends	TokenNameextends	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
m_refs	TokenNameIdentifier	 m refs
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the list for a fresh visitation and collection. */	TokenNameCOMMENT_JAVADOC	 Reset the list for a fresh visitation and collection. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_refs	TokenNameIdentifier	 m refs
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//.clear(); 	TokenNameCOMMENT_LINE	.clear(); 
}	TokenNameRBRACE	
/** * Get the number of variable references that were collected. * @return the size of the list. */	TokenNameCOMMENT_JAVADOC	 Get the number of variable references that were collected. @return the size of the list. 
public	TokenNamepublic	
int	TokenNameint	
getVarCount	TokenNameIdentifier	 get Var Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_refs	TokenNameIdentifier	 m refs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the given qualified name occurs in * the list of qualified names collected. * * @param refName Must be a valid qualified name. * @return true if the list contains the qualified name. */	TokenNameCOMMENT_JAVADOC	 Tell if the given qualified name occurs in the list of qualified names collected. * @param refName Must be a valid qualified name. @return true if the list contains the qualified name. 
boolean	TokenNameboolean	
doesOccur	TokenNameIdentifier	 does Occur
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
refName	TokenNameIdentifier	 ref Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_refs	TokenNameIdentifier	 m refs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
refName	TokenNameIdentifier	 ref Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a variable reference. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param var The variable reference object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a variable reference. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param var The variable reference object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitVariableRef	TokenNameIdentifier	 visit Variable Ref
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Variable	TokenNameIdentifier	 Variable
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_refs	TokenNameIdentifier	 m refs
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

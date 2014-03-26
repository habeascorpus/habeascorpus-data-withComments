/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: KeyManager.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: KeyManager.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
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
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
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
/** * This class manages the key tables. */	TokenNameCOMMENT_JAVADOC	 This class manages the key tables. 
public	TokenNamepublic	
class	TokenNameclass	
KeyManager	TokenNameIdentifier	 Key Manager
{	TokenNameLBRACE	
/** * Table of tables of element keys. * @see org.apache.xalan.transformer.KeyTable */	TokenNameCOMMENT_JAVADOC	 Table of tables of element keys. @see org.apache.xalan.transformer.KeyTable 
private	TokenNameprivate	
transient	TokenNametransient	
Vector	TokenNameIdentifier	 Vector
m_key_tables	TokenNameIdentifier	 m key tables
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Given a valid element key, return the corresponding node list. * * @param xctxt The XPath runtime state * @param doc The document node * @param name The key element name * @param ref The key value we're looking for * @param nscontext The prefix resolver for the execution context * * @return A nodelist of nodes mathing the given key * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Given a valid element key, return the corresponding node list. * @param xctxt The XPath runtime state @param doc The document node @param name The key element name @param ref The key value we're looking for @param nscontext The prefix resolver for the execution context * @return A nodelist of nodes mathing the given key * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XNodeSet	TokenNameIdentifier	 X Node Set
getNodeSetDTMByKey	TokenNameIdentifier	 get Node Set DTM By Key
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nscontext	TokenNameIdentifier	 nscontext
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
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
nscontext	TokenNameIdentifier	 nscontext
;	TokenNameSEMICOLON	
// yuck -sb 	TokenNameCOMMENT_LINE	yuck -sb 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeysComposed	TokenNameIdentifier	 get Keys Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundDoc	TokenNameIdentifier	 found Doc
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_key_tables	TokenNameIdentifier	 m key tables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_key_tables	TokenNameIdentifier	 m key tables
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
nKeyTables	TokenNameIdentifier	 n Key Tables
=	TokenNameEQUAL	
m_key_tables	TokenNameIdentifier	 m key tables
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nKeyTables	TokenNameIdentifier	 n Key Tables
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyTable	TokenNameIdentifier	 Key Table
kt	TokenNameIdentifier	 kt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyTable	TokenNameIdentifier	 Key Table
)	TokenNameRPAREN	
m_key_tables	TokenNameIdentifier	 m key tables
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kt	TokenNameIdentifier	 kt
.	TokenNameDOT	
getKeyTableName	TokenNameIdentifier	 get Key Table Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
kt	TokenNameIdentifier	 kt
.	TokenNameDOT	
getDocKey	TokenNameIdentifier	 get Doc Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
kt	TokenNameIdentifier	 kt
.	TokenNameDOT	
getNodeSetDTMByKey	TokenNameIdentifier	 get Node Set DTM By Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundDoc	TokenNameIdentifier	 found Doc
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
foundDoc	TokenNameIdentifier	 found Doc
/* && m_needToBuildKeysTable */	TokenNameCOMMENT_BLOCK	 && m_needToBuildKeysTable 
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyTable	TokenNameIdentifier	 Key Table
kt	TokenNameIdentifier	 kt
=	TokenNameEQUAL	
new	TokenNamenew	
KeyTable	TokenNameIdentifier	 Key Table
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
nscontext	TokenNameIdentifier	 nscontext
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getKeysComposed	TokenNameIdentifier	 get Keys Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_key_tables	TokenNameIdentifier	 m key tables
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
kt	TokenNameIdentifier	 kt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
kt	TokenNameIdentifier	 kt
.	TokenNameDOT	
getDocKey	TokenNameIdentifier	 get Doc Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundDoc	TokenNameIdentifier	 found Doc
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
kt	TokenNameIdentifier	 kt
.	TokenNameDOT	
getNodeSetDTMByKey	TokenNameIdentifier	 get Node Set DTM By Key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nl	TokenNameIdentifier	 nl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

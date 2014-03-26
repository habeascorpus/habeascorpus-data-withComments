/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
Selector	TokenNameIdentifier	 Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
SimpleSelector	TokenNameIdentifier	 Simple Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class provides an implementation for the * {@link org.w3c.css.sac.DescendantSelector} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSDescendantSelector.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation for the {@link org.w3c.css.sac.DescendantSelector} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSDescendantSelector.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
CSSDescendantSelector	TokenNameIdentifier	 CSS Descendant Selector
extends	TokenNameextends	
AbstractDescendantSelector	TokenNameIdentifier	 Abstract Descendant Selector
{	TokenNameLBRACE	
/** * Creates a new CSSDescendantSelector object. */	TokenNameCOMMENT_JAVADOC	 Creates a new CSSDescendantSelector object. 
public	TokenNamepublic	
CSSDescendantSelector	TokenNameIdentifier	 CSS Descendant Selector
(	TokenNameLPAREN	
Selector	TokenNameIdentifier	 Selector
ancestor	TokenNameIdentifier	 ancestor
,	TokenNameCOMMA	
SimpleSelector	TokenNameIdentifier	 Simple Selector
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
,	TokenNameCOMMA	
simple	TokenNameIdentifier	 simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.Selector#getSelectorType()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.Selector#getSelectorType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getSelectorType	TokenNameIdentifier	 get Selector Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SAC_DESCENDANT_SELECTOR	TokenNameIdentifier	 SAC  DESCENDANT  SELECTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this selector matches the given element. */	TokenNameCOMMENT_JAVADOC	 Tests whether this selector matches the given element. 
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudoE	TokenNameIdentifier	 pseudo E
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
)	TokenNameRPAREN	
getAncestorSelector	TokenNameIdentifier	 get Ancestor Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
)	TokenNameRPAREN	
getSimpleSelector	TokenNameIdentifier	 get Simple Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
pseudoE	TokenNameIdentifier	 pseudo E
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fills the given set with the attribute names found in this selector. */	TokenNameCOMMENT_JAVADOC	 Fills the given set with the attribute names found in this selector. 
public	TokenNamepublic	
void	TokenNamevoid	
fillAttributeSet	TokenNameIdentifier	 fill Attribute Set
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtendedSelector	TokenNameIdentifier	 Extended Selector
)	TokenNameRPAREN	
getSimpleSelector	TokenNameIdentifier	 get Simple Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fillAttributeSet	TokenNameIdentifier	 fill Attribute Set
(	TokenNameLPAREN	
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a representation of the selector. */	TokenNameCOMMENT_JAVADOC	 Returns a representation of the selector. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAncestorSelector	TokenNameIdentifier	 get Ancestor Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getSimpleSelector	TokenNameIdentifier	 get Simple Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLElement	TokenNameIdentifier	 HTML Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLOptionElement	TokenNameIdentifier	 HTML Option Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLSelectElement	TokenNameIdentifier	 HTML Select Element
;	TokenNameSEMICOLON	
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@openxml.org">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLOptionElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@openxml.org">Assaf Arkin</a> @see org.w3c.dom.html.HTMLOptionElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLOptionElementImpl	TokenNameIdentifier	 HTML Option Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLOptionElement	TokenNameIdentifier	 HTML Option Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4486774554137530907L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
getDefaultSelected	TokenNameIdentifier	 get Default Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ! NOT FULLY IMPLEMENTED ! 	TokenNameCOMMENT_LINE	! NOT FULLY IMPLEMENTED ! 
return	TokenNamereturn	
getBinary	TokenNameIdentifier	 get Binary
(	TokenNameLPAREN	
"default-selected"	TokenNameStringLiteral	default-selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultSelected	TokenNameIdentifier	 set Default Selected
(	TokenNameLPAREN	
boolean	TokenNameboolean	
defaultSelected	TokenNameIdentifier	 default Selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ! NOT FULLY IMPLEMENTED ! 	TokenNameCOMMENT_LINE	! NOT FULLY IMPLEMENTED ! 
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"default-selected"	TokenNameStringLiteral	default-selected
,	TokenNameCOMMA	
defaultSelected	TokenNameIdentifier	 default Selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find the Text nodes contained within this element and return their 	TokenNameCOMMENT_LINE	Find the Text nodes contained within this element and return their 
// concatenated value. Required to go around comments, entities, etc. 	TokenNameCOMMENT_LINE	concatenated value. Required to go around comments, entities, etc. 
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
instanceof	TokenNameinstanceof	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// Delete all the nodes and replace them with a single Text node. 	TokenNameCOMMENT_LINE	Delete all the nodes and replace them with a single Text node. 
// This is the only approach that can handle comments and other nodes. 	TokenNameCOMMENT_LINE	This is the only approach that can handle comments and other nodes. 
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// Locate the parent SELECT. Note that this OPTION might be inside a 	TokenNameCOMMENT_LINE	Locate the parent SELECT. Note that this OPTION might be inside a 
// OPTGROUP inside the SELECT. Or it might not have a parent SELECT. 	TokenNameCOMMENT_LINE	OPTGROUP inside the SELECT. Or it might not have a parent SELECT. 
// Everything is possible. If no parent is found, return -1. 	TokenNameCOMMENT_LINE	Everything is possible. If no parent is found, return -1. 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
HTMLSelectElement	TokenNameIdentifier	 HTML Select Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use getElementsByTagName() which creates a snapshot of all the 	TokenNameCOMMENT_LINE	Use getElementsByTagName() which creates a snapshot of all the 
// OPTION elements under the SELECT. Access to the returned NodeList 	TokenNameCOMMENT_LINE	OPTION elements under the SELECT. Access to the returned NodeList 
// is very fast and the snapshot solves many synchronization problems. 	TokenNameCOMMENT_LINE	is very fast and the snapshot solves many synchronization problems. 
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLElement	TokenNameIdentifier	 HTML Element
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
.	TokenNameDOT	
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
// Locate the parent SELECT. Note that this OPTION might be inside a 	TokenNameCOMMENT_LINE	Locate the parent SELECT. Note that this OPTION might be inside a 
// OPTGROUP inside the SELECT. Or it might not have a parent SELECT. 	TokenNameCOMMENT_LINE	OPTGROUP inside the SELECT. Or it might not have a parent SELECT. 
// Everything is possible. If no parent is found, just return. 	TokenNameCOMMENT_LINE	Everything is possible. If no parent is found, just return. 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
HTMLSelectElement	TokenNameIdentifier	 HTML Select Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use getElementsByTagName() which creates a snapshot of all the 	TokenNameCOMMENT_LINE	Use getElementsByTagName() which creates a snapshot of all the 
// OPTION elements under the SELECT. Access to the returned NodeList 	TokenNameCOMMENT_LINE	OPTION elements under the SELECT. Access to the returned NodeList 
// is very fast and the snapshot solves many synchronization problems. 	TokenNameCOMMENT_LINE	is very fast and the snapshot solves many synchronization problems. 
// Make sure this OPTION is not replacing itself. 	TokenNameCOMMENT_LINE	Make sure this OPTION is not replacing itself. 
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLElement	TokenNameIdentifier	 HTML Element
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
.	TokenNameDOT	
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove this OPTION from its parent. Place this OPTION right 	TokenNameCOMMENT_LINE	Remove this OPTION from its parent. Place this OPTION right 
// before indexed OPTION underneath it's direct parent (might 	TokenNameCOMMENT_LINE	before indexed OPTION underneath it's direct parent (might 
// be an OPTGROUP). 	TokenNameCOMMENT_LINE	be an OPTGROUP). 
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getDisabled	TokenNameIdentifier	 get Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBinary	TokenNameIdentifier	 get Binary
(	TokenNameLPAREN	
"disabled"	TokenNameStringLiteral	disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDisabled	TokenNameIdentifier	 set Disabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
disabled	TokenNameIdentifier	 disabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"disabled"	TokenNameStringLiteral	disabled
,	TokenNameCOMMA	
disabled	TokenNameIdentifier	 disabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capitalize	TokenNameIdentifier	 capitalize
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"label"	TokenNameStringLiteral	label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"label"	TokenNameStringLiteral	label
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getSelected	TokenNameIdentifier	 get Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBinary	TokenNameIdentifier	 get Binary
(	TokenNameLPAREN	
"selected"	TokenNameStringLiteral	selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"selected"	TokenNameStringLiteral	selected
,	TokenNameCOMMA	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor requires owner document. * * @param owner The owner HTML document */	TokenNameCOMMENT_JAVADOC	 Constructor requires owner document. * @param owner The owner HTML document 
public	TokenNamepublic	
HTMLOptionElementImpl	TokenNameIdentifier	 HTML Option Element Impl
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

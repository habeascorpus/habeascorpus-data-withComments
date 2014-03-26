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
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLCollection	TokenNameIdentifier	 HTML Collection
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
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLSelectElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.html.HTMLSelectElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLSelectElementImpl	TokenNameIdentifier	 HTML Select Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLSelectElement	TokenNameIdentifier	 HTML Select Element
,	TokenNameCOMMA	
HTMLFormControl	TokenNameIdentifier	 HTML Form Control
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6998282711006968187L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
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
public	TokenNamepublic	
int	TokenNameint	
getSelectedIndex	TokenNameIdentifier	 get Selected Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeList	TokenNameIdentifier	 Node List
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// Use getElementsByTagName() which creates a snapshot of all the 	TokenNameCOMMENT_LINE	Use getElementsByTagName() which creates a snapshot of all the 
// OPTION elements under this SELECT. Access to the returned NodeList 	TokenNameCOMMENT_LINE	OPTION elements under this SELECT. Access to the returned NodeList 
// is very fast and the snapshot solves many synchronization problems. 	TokenNameCOMMENT_LINE	is very fast and the snapshot solves many synchronization problems. 
// Locate the first selected OPTION and return its index. Note that 	TokenNameCOMMENT_LINE	Locate the first selected OPTION and return its index. Note that 
// the OPTION might be under an OPTGROUP. 	TokenNameCOMMENT_LINE	the OPTION might be under an OPTGROUP. 
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLOptionElement	TokenNameIdentifier	 HTML Option Element
)	TokenNameRPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSelected	TokenNameIdentifier	 get Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSelectedIndex	TokenNameIdentifier	 set Selected Index
(	TokenNameLPAREN	
int	TokenNameint	
selectedIndex	TokenNameIdentifier	 selected Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeList	TokenNameIdentifier	 Node List
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// Use getElementsByTagName() which creates a snapshot of all the 	TokenNameCOMMENT_LINE	Use getElementsByTagName() which creates a snapshot of all the 
// OPTION elements under this SELECT. Access to the returned NodeList 	TokenNameCOMMENT_LINE	OPTION elements under this SELECT. Access to the returned NodeList 
// is very fast and the snapshot solves many synchronization problems. 	TokenNameCOMMENT_LINE	is very fast and the snapshot solves many synchronization problems. 
// Change the select so all OPTIONs are off, except for the 	TokenNameCOMMENT_LINE	Change the select so all OPTIONs are off, except for the 
// selectIndex-th one. 	TokenNameCOMMENT_LINE	selectIndex-th one. 
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLOptionElementImpl	TokenNameIdentifier	 HTML Option Element Impl
)	TokenNameRPAREN	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
selectedIndex	TokenNameIdentifier	 selected Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HTMLCollection	TokenNameIdentifier	 HTML Collection
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_options	TokenNameIdentifier	 options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
.	TokenNameDOT	
OPTION	TokenNameIdentifier	 OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
boolean	TokenNameboolean	
getMultiple	TokenNameIdentifier	 get Multiple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBinary	TokenNameIdentifier	 get Binary
(	TokenNameLPAREN	
"multiple"	TokenNameStringLiteral	multiple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMultiple	TokenNameIdentifier	 set Multiple
(	TokenNameLPAREN	
boolean	TokenNameboolean	
multiple	TokenNameIdentifier	 multiple
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"multiple"	TokenNameStringLiteral	multiple
,	TokenNameCOMMA	
multiple	TokenNameIdentifier	 multiple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"size"	TokenNameStringLiteral	size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"size"	TokenNameStringLiteral	size
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTabIndex	TokenNameIdentifier	 get Tab Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getInteger	TokenNameIdentifier	 get Integer
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"tabindex"	TokenNameStringLiteral	tabindex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTabIndex	TokenNameIdentifier	 set Tab Index
(	TokenNameLPAREN	
int	TokenNameint	
tabIndex	TokenNameIdentifier	 tab Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"tabindex"	TokenNameStringLiteral	tabindex
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
tabIndex	TokenNameIdentifier	 tab Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
HTMLElement	TokenNameIdentifier	 HTML Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
HTMLElement	TokenNameIdentifier	 HTML Element
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeList	TokenNameIdentifier	 Node List
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
removed	TokenNameIdentifier	 removed
;	TokenNameSEMICOLON	
// Use getElementsByTagName() which creates a snapshot of all the 	TokenNameCOMMENT_LINE	Use getElementsByTagName() which creates a snapshot of all the 
// OPTION elements under this SELECT. Access to the returned NodeList 	TokenNameCOMMENT_LINE	OPTION elements under this SELECT. Access to the returned NodeList 
// is very fast and the snapshot solves many synchronization problems. 	TokenNameCOMMENT_LINE	is very fast and the snapshot solves many synchronization problems. 
// Remove the indexed OPTION from it's parent, this might be this 	TokenNameCOMMENT_LINE	Remove the indexed OPTION from it's parent, this might be this 
// SELECT or an OPTGROUP. 	TokenNameCOMMENT_LINE	SELECT or an OPTGROUP. 
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
"OPTION"	TokenNameStringLiteral	OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removed	TokenNameIdentifier	 removed
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
removed	TokenNameIdentifier	 removed
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
removed	TokenNameIdentifier	 removed
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
removed	TokenNameIdentifier	 removed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
blur	TokenNameIdentifier	 blur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No scripting in server-side DOM. This method is moot. 	TokenNameCOMMENT_LINE	No scripting in server-side DOM. This method is moot. 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
focus	TokenNameIdentifier	 focus
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No scripting in server-side DOM. This method is moot. 	TokenNameCOMMENT_LINE	No scripting in server-side DOM. This method is moot. 
}	TokenNameRBRACE	
/** * Explicit implementation of getChildNodes() to avoid problems with * overriding the getLength() method hidden in the super class. */	TokenNameCOMMENT_JAVADOC	 Explicit implementation of getChildNodes() to avoid problems with overriding the getLength() method hidden in the super class. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getChildNodesUnoptimized	TokenNameIdentifier	 get Child Nodes Unoptimized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Explicit implementation of cloneNode() to ensure that cache used * for getOptions() gets cleared. */	TokenNameCOMMENT_JAVADOC	 Explicit implementation of cloneNode() to ensure that cache used for getOptions() gets cleared. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLSelectElementImpl	TokenNameIdentifier	 HTML Select Element Impl
clonedNode	TokenNameIdentifier	 cloned Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HTMLSelectElementImpl	TokenNameIdentifier	 HTML Select Element Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedNode	TokenNameIdentifier	 cloned Node
.	TokenNameDOT	
_options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clonedNode	TokenNameIdentifier	 cloned Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor requires owner document. * * @param owner The owner HTML document */	TokenNameCOMMENT_JAVADOC	 Constructor requires owner document. * @param owner The owner HTML document 
public	TokenNamepublic	
HTMLSelectElementImpl	TokenNameIdentifier	 HTML Select Element Impl
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
private	TokenNameprivate	
HTMLCollection	TokenNameIdentifier	 HTML Collection
_options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

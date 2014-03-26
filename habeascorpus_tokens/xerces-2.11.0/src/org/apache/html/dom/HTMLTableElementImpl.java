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
HTMLTableCaptionElement	TokenNameIdentifier	 HTML Table Caption Element
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
HTMLTableElement	TokenNameIdentifier	 HTML Table Element
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
HTMLTableRowElement	TokenNameIdentifier	 HTML Table Row Element
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
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
;	TokenNameSEMICOLON	
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLAnchorElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.html.HTMLAnchorElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLTableElementImpl	TokenNameIdentifier	 HTML Table Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLTableElement	TokenNameIdentifier	 HTML Table Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1824053099870917532L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
HTMLTableCaptionElement	TokenNameIdentifier	 HTML Table Caption Element
getCaption	TokenNameIdentifier	 get Caption
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
HTMLTableCaptionElement	TokenNameIdentifier	 HTML Table Caption Element
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"CAPTION"	TokenNameStringLiteral	CAPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
HTMLTableCaptionElement	TokenNameIdentifier	 HTML Table Caption Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setCaption	TokenNameIdentifier	 set Caption
(	TokenNameLPAREN	
HTMLTableCaptionElement	TokenNameIdentifier	 HTML Table Caption Element
caption	TokenNameIdentifier	 caption
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
caption	TokenNameIdentifier	 caption
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
caption	TokenNameIdentifier	 caption
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"CAPTION"	TokenNameStringLiteral	CAPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HTM016 Argument 'caption' is not an element of type <CAPTION>."	TokenNameStringLiteral	HTM016 Argument 'caption' is not an element of type <CAPTION>.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteCaption	TokenNameIdentifier	 delete Caption
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
caption	TokenNameIdentifier	 caption
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
caption	TokenNameIdentifier	 caption
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
HTMLElement	TokenNameIdentifier	 HTML Element
createCaption	TokenNameIdentifier	 create Caption
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLElement	TokenNameIdentifier	 HTML Element
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
getCaption	TokenNameIdentifier	 get Caption
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLTableCaptionElementImpl	TokenNameIdentifier	 HTML Table Caption Element Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"CAPTION"	TokenNameStringLiteral	CAPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteCaption	TokenNameIdentifier	 delete Caption
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
getCaption	TokenNameIdentifier	 get Caption
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
getTHead	TokenNameIdentifier	 get T Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"THEAD"	TokenNameStringLiteral	THEAD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setTHead	TokenNameIdentifier	 set T Head
(	TokenNameLPAREN	
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
tHead	TokenNameIdentifier	 t Head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tHead	TokenNameIdentifier	 t Head
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
tHead	TokenNameIdentifier	 t Head
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"THEAD"	TokenNameStringLiteral	THEAD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HTM017 Argument 'tHead' is not an element of type <THEAD>."	TokenNameStringLiteral	HTM017 Argument 'tHead' is not an element of type <THEAD>.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteTHead	TokenNameIdentifier	 delete T Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tHead	TokenNameIdentifier	 t Head
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
tHead	TokenNameIdentifier	 t Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
HTMLElement	TokenNameIdentifier	 HTML Element
createTHead	TokenNameIdentifier	 create T Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLElement	TokenNameIdentifier	 HTML Element
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
getTHead	TokenNameIdentifier	 get T Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLTableSectionElementImpl	TokenNameIdentifier	 HTML Table Section Element Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"THEAD"	TokenNameStringLiteral	THEAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteTHead	TokenNameIdentifier	 delete T Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
getTHead	TokenNameIdentifier	 get T Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
getTFoot	TokenNameIdentifier	 get T Foot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
&&	TokenNameAND_AND	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"TFOOT"	TokenNameStringLiteral	TFOOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setTFoot	TokenNameIdentifier	 set T Foot
(	TokenNameLPAREN	
HTMLTableSectionElement	TokenNameIdentifier	 HTML Table Section Element
tFoot	TokenNameIdentifier	 t Foot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tFoot	TokenNameIdentifier	 t Foot
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
tFoot	TokenNameIdentifier	 t Foot
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"TFOOT"	TokenNameStringLiteral	TFOOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HTM018 Argument 'tFoot' is not an element of type <TFOOT>."	TokenNameStringLiteral	HTM018 Argument 'tFoot' is not an element of type <TFOOT>.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteTFoot	TokenNameIdentifier	 delete T Foot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tFoot	TokenNameIdentifier	 t Foot
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
tFoot	TokenNameIdentifier	 t Foot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
HTMLElement	TokenNameIdentifier	 HTML Element
createTFoot	TokenNameIdentifier	 create T Foot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLElement	TokenNameIdentifier	 HTML Element
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
getTFoot	TokenNameIdentifier	 get T Foot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
section	TokenNameIdentifier	 section
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLTableSectionElementImpl	TokenNameIdentifier	 HTML Table Section Element Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"TFOOT"	TokenNameStringLiteral	TFOOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
section	TokenNameIdentifier	 section
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
section	TokenNameIdentifier	 section
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteTFoot	TokenNameIdentifier	 delete T Foot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
getTFoot	TokenNameIdentifier	 get T Foot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HTMLCollection	TokenNameIdentifier	 HTML Collection
getRows	TokenNameIdentifier	 get Rows
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_rows	TokenNameIdentifier	 rows
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
.	TokenNameDOT	
ROW	TokenNameIdentifier	 ROW
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HTMLCollection	TokenNameIdentifier	 HTML Collection
getTBodies	TokenNameIdentifier	 get T Bodies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_bodies	TokenNameIdentifier	 bodies
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_bodies	TokenNameIdentifier	 bodies
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
.	TokenNameDOT	
TBODY	TokenNameIdentifier	 TBODY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_bodies	TokenNameIdentifier	 bodies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capitalize	TokenNameIdentifier	 capitalize
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"align"	TokenNameStringLiteral	align
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAlign	TokenNameIdentifier	 set Align
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"align"	TokenNameStringLiteral	align
,	TokenNameCOMMA	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBgColor	TokenNameIdentifier	 get Bg Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"bgcolor"	TokenNameStringLiteral	bgcolor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBgColor	TokenNameIdentifier	 set Bg Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
bgColor	TokenNameIdentifier	 bg Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"bgcolor"	TokenNameStringLiteral	bgcolor
,	TokenNameCOMMA	
bgColor	TokenNameIdentifier	 bg Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBorder	TokenNameIdentifier	 get Border
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"border"	TokenNameStringLiteral	border
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
border	TokenNameIdentifier	 border
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"border"	TokenNameStringLiteral	border
,	TokenNameCOMMA	
border	TokenNameIdentifier	 border
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCellPadding	TokenNameIdentifier	 get Cell Padding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"cellpadding"	TokenNameStringLiteral	cellpadding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCellPadding	TokenNameIdentifier	 set Cell Padding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cellPadding	TokenNameIdentifier	 cell Padding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"cellpadding"	TokenNameStringLiteral	cellpadding
,	TokenNameCOMMA	
cellPadding	TokenNameIdentifier	 cell Padding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCellSpacing	TokenNameIdentifier	 get Cell Spacing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"cellspacing"	TokenNameStringLiteral	cellspacing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCellSpacing	TokenNameIdentifier	 set Cell Spacing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cellSpacing	TokenNameIdentifier	 cell Spacing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"cellspacing"	TokenNameStringLiteral	cellspacing
,	TokenNameCOMMA	
cellSpacing	TokenNameIdentifier	 cell Spacing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFrame	TokenNameIdentifier	 get Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capitalize	TokenNameIdentifier	 capitalize
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"frame"	TokenNameStringLiteral	frame
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFrame	TokenNameIdentifier	 set Frame
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"frame"	TokenNameStringLiteral	frame
,	TokenNameCOMMA	
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRules	TokenNameIdentifier	 get Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capitalize	TokenNameIdentifier	 capitalize
(	TokenNameLPAREN	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"rules"	TokenNameStringLiteral	rules
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRules	TokenNameIdentifier	 set Rules
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"rules"	TokenNameStringLiteral	rules
,	TokenNameCOMMA	
rules	TokenNameIdentifier	 rules
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSummary	TokenNameIdentifier	 get Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"summary"	TokenNameStringLiteral	summary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSummary	TokenNameIdentifier	 set Summary
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
summary	TokenNameIdentifier	 summary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"summary"	TokenNameStringLiteral	summary
,	TokenNameCOMMA	
summary	TokenNameIdentifier	 summary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"width"	TokenNameStringLiteral	width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"width"	TokenNameStringLiteral	width
,	TokenNameCOMMA	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
HTMLElement	TokenNameIdentifier	 HTML Element
insertRow	TokenNameIdentifier	 insert Row
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLTableRowElementImpl	TokenNameIdentifier	 HTML Table Row Element Impl
newRow	TokenNameIdentifier	 new Row
;	TokenNameSEMICOLON	
newRow	TokenNameIdentifier	 new Row
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLTableRowElementImpl	TokenNameIdentifier	 HTML Table Row Element Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"TR"	TokenNameStringLiteral	TR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//newRow.insertCell( 0 ); 	TokenNameCOMMENT_LINE	newRow.insertCell( 0 ); 
insertRowX	TokenNameIdentifier	 insert Row X
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
newRow	TokenNameIdentifier	 new Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newRow	TokenNameIdentifier	 new Row
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
insertRowX	TokenNameIdentifier	 insert Row X
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
HTMLTableRowElementImpl	TokenNameIdentifier	 HTML Table Row Element Impl
newRow	TokenNameIdentifier	 new Row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
lastSection	TokenNameIdentifier	 last Section
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
HTMLTableRowElement	TokenNameIdentifier	 HTML Table Row Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newRow	TokenNameIdentifier	 new Row
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
instanceof	TokenNameinstanceof	
HTMLTableSectionElementImpl	TokenNameIdentifier	 HTML Table Section Element Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastSection	TokenNameIdentifier	 last Section
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLTableSectionElementImpl	TokenNameIdentifier	 HTML Table Section Element Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
insertRowX	TokenNameIdentifier	 insert Row X
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
newRow	TokenNameIdentifier	 new Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
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
if	TokenNameif	
(	TokenNameLPAREN	
lastSection	TokenNameIdentifier	 last Section
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
lastSection	TokenNameIdentifier	 last Section
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newRow	TokenNameIdentifier	 new Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newRow	TokenNameIdentifier	 new Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
deleteRow	TokenNameIdentifier	 delete Row
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
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
HTMLTableRowElement	TokenNameIdentifier	 HTML Table Row Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
instanceof	TokenNameinstanceof	
HTMLTableSectionElementImpl	TokenNameIdentifier	 HTML Table Section Element Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTMLTableSectionElementImpl	TokenNameIdentifier	 HTML Table Section Element Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
deleteRowX	TokenNameIdentifier	 delete Row X
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
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
}	TokenNameRBRACE	
/** * Explicit implementation of cloneNode() to ensure that cache used * for getRows() and getTBodies() gets cleared. */	TokenNameCOMMENT_JAVADOC	 Explicit implementation of cloneNode() to ensure that cache used for getRows() and getTBodies() gets cleared. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLTableElementImpl	TokenNameIdentifier	 HTML Table Element Impl
clonedNode	TokenNameIdentifier	 cloned Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HTMLTableElementImpl	TokenNameIdentifier	 HTML Table Element Impl
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
_rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
clonedNode	TokenNameIdentifier	 cloned Node
.	TokenNameDOT	
_bodies	TokenNameIdentifier	 bodies
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clonedNode	TokenNameIdentifier	 cloned Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor requires owner document. * * @param owner The owner HTML document */	TokenNameCOMMENT_JAVADOC	 Constructor requires owner document. * @param owner The owner HTML document 
public	TokenNamepublic	
HTMLTableElementImpl	TokenNameIdentifier	 HTML Table Element Impl
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
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
_rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HTMLCollectionImpl	TokenNameIdentifier	 HTML Collection Impl
_bodies	TokenNameIdentifier	 bodies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

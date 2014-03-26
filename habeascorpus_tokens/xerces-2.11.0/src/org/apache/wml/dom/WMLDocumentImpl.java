/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
.	TokenNameDOT	
WMLDocument	TokenNameIdentifier	 WML Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentImpl	TokenNameIdentifier	 Document Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ElementImpl	TokenNameIdentifier	 Element Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentType	TokenNameIdentifier	 Document Type
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
/** * @xerces.internal * @version $Id: WMLDocumentImpl.java 890457 2009-12-14 19:47:46Z mrglavas $ * @author <a href="mailto:david@topware.com.tw">David Li</a> */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Id: WMLDocumentImpl.java 890457 2009-12-14 19:47:46Z mrglavas $ @author <a href="mailto:david@topware.com.tw">David Li</a> 
public	TokenNamepublic	
class	TokenNameclass	
WMLDocumentImpl	TokenNameIdentifier	 WML Document Impl
extends	TokenNameextends	
DocumentImpl	TokenNameIdentifier	 Document Impl
implements	TokenNameimplements	
WMLDocument	TokenNameIdentifier	 WML Document
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6582904849512384104L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_elementTypesWML	TokenNameIdentifier	 element Types WML
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_elemClassSigWML	TokenNameIdentifier	 elem Class Sig WML
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
WMLDocumentImpl	TokenNameIdentifier	 WML Document Impl
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
elemClass	TokenNameIdentifier	 elem Class
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
cnst	TokenNameIdentifier	 cnst
;	TokenNameSEMICOLON	
elemClass	TokenNameIdentifier	 elem Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elemClass	TokenNameIdentifier	 elem Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cnst	TokenNameIdentifier	 cnst
=	TokenNameEQUAL	
elemClass	TokenNameIdentifier	 elem Class
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
_elemClassSigWML	TokenNameIdentifier	 elem Class Sig WML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
cnst	TokenNameIdentifier	 cnst
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
this	TokenNamethis	
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
thrw	TokenNameIdentifier	 thrw
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
except	TokenNameIdentifier	 except
instanceof	TokenNameinstanceof	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
)	TokenNameRPAREN	
thrw	TokenNameIdentifier	 thrw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
)	TokenNameRPAREN	
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
thrw	TokenNameIdentifier	 thrw
=	TokenNameEQUAL	
except	TokenNameIdentifier	 except
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Exception "	TokenNameStringLiteral	Exception 
+	TokenNamePLUS	
thrw	TokenNameIdentifier	 thrw
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
thrw	TokenNameIdentifier	 thrw
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Tag '"	TokenNameStringLiteral	Tag '
+	TokenNamePLUS	
tagName	TokenNameIdentifier	 tag Name
+	TokenNamePLUS	
"' associated with an Element class that failed to construct."	TokenNameStringLiteral	' associated with an Element class that failed to construct.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
WMLElementImpl	TokenNameIdentifier	 WML Element Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see CoreDocumentImpl#canRenameElements() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see CoreDocumentImpl#canRenameElements() 
protected	TokenNameprotected	
boolean	TokenNameboolean	
canRenameElements	TokenNameIdentifier	 can Rename Elements
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newNamespaceURI	TokenNameIdentifier	 new Namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newNodeName	TokenNameIdentifier	 new Node Name
,	TokenNameCOMMA	
ElementImpl	TokenNameIdentifier	 Element Impl
el	TokenNameIdentifier	 el
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check whether a class change is required 	TokenNameCOMMENT_LINE	check whether a class change is required 
return	TokenNamereturn	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
newNodeName	TokenNameIdentifier	 new Node Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
_elementTypesWML	TokenNameIdentifier	 element Types WML
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
WMLBElementImpl	TokenNameIdentifier	 WMLB Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"noop"	TokenNameStringLiteral	noop
,	TokenNameCOMMA	
WMLNoopElementImpl	TokenNameIdentifier	 WML Noop Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
WMLAElementImpl	TokenNameIdentifier	 WMLA Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"setvar"	TokenNameStringLiteral	setvar
,	TokenNameCOMMA	
WMLSetvarElementImpl	TokenNameIdentifier	 WML Setvar Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"access"	TokenNameStringLiteral	access
,	TokenNameCOMMA	
WMLAccessElementImpl	TokenNameIdentifier	 WML Access Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"strong"	TokenNameStringLiteral	strong
,	TokenNameCOMMA	
WMLStrongElementImpl	TokenNameIdentifier	 WML Strong Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"postfield"	TokenNameStringLiteral	postfield
,	TokenNameCOMMA	
WMLPostfieldElementImpl	TokenNameIdentifier	 WML Postfield Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"do"	TokenNameStringLiteral	do
,	TokenNameCOMMA	
WMLDoElementImpl	TokenNameIdentifier	 WML Do Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"wml"	TokenNameStringLiteral	wml
,	TokenNameCOMMA	
WMLWmlElementImpl	TokenNameIdentifier	 WML Wml Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"tr"	TokenNameStringLiteral	tr
,	TokenNameCOMMA	
WMLTrElementImpl	TokenNameIdentifier	 WML Tr Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"go"	TokenNameStringLiteral	go
,	TokenNameCOMMA	
WMLGoElementImpl	TokenNameIdentifier	 WML Go Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"big"	TokenNameStringLiteral	big
,	TokenNameCOMMA	
WMLBigElementImpl	TokenNameIdentifier	 WML Big Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"anchor"	TokenNameStringLiteral	anchor
,	TokenNameCOMMA	
WMLAnchorElementImpl	TokenNameIdentifier	 WML Anchor Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"timer"	TokenNameStringLiteral	timer
,	TokenNameCOMMA	
WMLTimerElementImpl	TokenNameIdentifier	 WML Timer Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"small"	TokenNameStringLiteral	small
,	TokenNameCOMMA	
WMLSmallElementImpl	TokenNameIdentifier	 WML Small Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"optgroup"	TokenNameStringLiteral	optgroup
,	TokenNameCOMMA	
WMLOptgroupElementImpl	TokenNameIdentifier	 WML Optgroup Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"head"	TokenNameStringLiteral	head
,	TokenNameCOMMA	
WMLHeadElementImpl	TokenNameIdentifier	 WML Head Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"td"	TokenNameStringLiteral	td
,	TokenNameCOMMA	
WMLTdElementImpl	TokenNameIdentifier	 WML Td Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"fieldset"	TokenNameStringLiteral	fieldset
,	TokenNameCOMMA	
WMLFieldsetElementImpl	TokenNameIdentifier	 WML Fieldset Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"img"	TokenNameStringLiteral	img
,	TokenNameCOMMA	
WMLImgElementImpl	TokenNameIdentifier	 WML Img Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"refresh"	TokenNameStringLiteral	refresh
,	TokenNameCOMMA	
WMLRefreshElementImpl	TokenNameIdentifier	 WML Refresh Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"onevent"	TokenNameStringLiteral	onevent
,	TokenNameCOMMA	
WMLOneventElementImpl	TokenNameIdentifier	 WML Onevent Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"input"	TokenNameStringLiteral	input
,	TokenNameCOMMA	
WMLInputElementImpl	TokenNameIdentifier	 WML Input Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"prev"	TokenNameStringLiteral	prev
,	TokenNameCOMMA	
WMLPrevElementImpl	TokenNameIdentifier	 WML Prev Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"table"	TokenNameStringLiteral	table
,	TokenNameCOMMA	
WMLTableElementImpl	TokenNameIdentifier	 WML Table Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"meta"	TokenNameStringLiteral	meta
,	TokenNameCOMMA	
WMLMetaElementImpl	TokenNameIdentifier	 WML Meta Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"template"	TokenNameStringLiteral	template
,	TokenNameCOMMA	
WMLTemplateElementImpl	TokenNameIdentifier	 WML Template Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"br"	TokenNameStringLiteral	br
,	TokenNameCOMMA	
WMLBrElementImpl	TokenNameIdentifier	 WML Br Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"option"	TokenNameStringLiteral	option
,	TokenNameCOMMA	
WMLOptionElementImpl	TokenNameIdentifier	 WML Option Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"u"	TokenNameStringLiteral	u
,	TokenNameCOMMA	
WMLUElementImpl	TokenNameIdentifier	 WMLU Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"p"	TokenNameStringLiteral	p
,	TokenNameCOMMA	
WMLPElementImpl	TokenNameIdentifier	 WMLP Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"select"	TokenNameStringLiteral	select
,	TokenNameCOMMA	
WMLSelectElementImpl	TokenNameIdentifier	 WML Select Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"em"	TokenNameStringLiteral	em
,	TokenNameCOMMA	
WMLEmElementImpl	TokenNameIdentifier	 WML Em Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
WMLIElementImpl	TokenNameIdentifier	 WMLI Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elementTypesWML	TokenNameIdentifier	 element Types WML
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"card"	TokenNameStringLiteral	card
,	TokenNameCOMMA	
WMLCardElementImpl	TokenNameIdentifier	 WML Card Element Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* DOM level 2 */	TokenNameCOMMENT_BLOCK	 DOM level 2 
public	TokenNamepublic	
WMLDocumentImpl	TokenNameIdentifier	 WML Document Impl
(	TokenNameLPAREN	
DocumentType	TokenNameIdentifier	 Document Type
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doctype	TokenNameIdentifier	 doctype
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

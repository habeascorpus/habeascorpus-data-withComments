/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
CSSEngine	TokenNameIdentifier	 CSS Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
DocumentCSS	TokenNameIdentifier	 Document CSS
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSStyleDeclaration	TokenNameIdentifier	 CSS Style Declaration
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
DOMImplementation	TokenNameIdentifier	 DOM Implementation
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
stylesheets	TokenNameIdentifier	 stylesheets
.	TokenNameDOT	
StyleSheetList	TokenNameIdentifier	 Style Sheet List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
views	TokenNameIdentifier	 views
.	TokenNameDOT	
DocumentView	TokenNameIdentifier	 Document View
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
views	TokenNameIdentifier	 views
.	TokenNameDOT	
AbstractView	TokenNameIdentifier	 Abstract View
;	TokenNameSEMICOLON	
/** * A Document that supports CSS styling. * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: AbstractStylableDocument.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A Document that supports CSS styling. * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: AbstractStylableDocument.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractStylableDocument	TokenNameIdentifier	 Abstract Stylable Document
extends	TokenNameextends	
AbstractDocument	TokenNameIdentifier	 Abstract Document
implements	TokenNameimplements	
DocumentCSS	TokenNameIdentifier	 Document CSS
,	TokenNameCOMMA	
DocumentView	TokenNameIdentifier	 Document View
{	TokenNameLBRACE	
/** * The default view. */	TokenNameCOMMENT_JAVADOC	 The default view. 
protected	TokenNameprotected	
transient	TokenNametransient	
AbstractView	TokenNameIdentifier	 Abstract View
defaultView	TokenNameIdentifier	 default View
;	TokenNameSEMICOLON	
/** * The CSS engine. */	TokenNameCOMMENT_JAVADOC	 The CSS engine. 
protected	TokenNameprotected	
transient	TokenNametransient	
CSSEngine	TokenNameIdentifier	 CSS Engine
cssEngine	TokenNameIdentifier	 css Engine
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractStylableDocument	TokenNameIdentifier	 Abstract Stylable Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new document. */	TokenNameCOMMENT_JAVADOC	 Creates a new document. 
protected	TokenNameprotected	
AbstractStylableDocument	TokenNameIdentifier	 Abstract Stylable Document
(	TokenNameLPAREN	
DocumentType	TokenNameIdentifier	 Document Type
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
dt	TokenNameIdentifier	 dt
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the CSS engine. */	TokenNameCOMMENT_JAVADOC	 Sets the CSS engine. 
public	TokenNamepublic	
void	TokenNamevoid	
setCSSEngine	TokenNameIdentifier	 set CSS Engine
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cssEngine	TokenNameIdentifier	 css Engine
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS engine. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS engine. 
public	TokenNamepublic	
CSSEngine	TokenNameIdentifier	 CSS Engine
getCSSEngine	TokenNameIdentifier	 get CSS Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cssEngine	TokenNameIdentifier	 css Engine
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DocumentStyle ///////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	DocumentStyle ///////////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.stylesheets.DocumentStyle#getStyleSheets()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.stylesheets.DocumentStyle#getStyleSheets()}. 
public	TokenNamepublic	
StyleSheetList	TokenNameIdentifier	 Style Sheet List
getStyleSheets	TokenNameIdentifier	 get Style Sheets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
" !!! Not implemented"	TokenNameStringLiteral	 !!! Not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DocumentView /////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	DocumentView /////////////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link DocumentView#getDefaultView()}. * @return a ViewCSS object. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link DocumentView#getDefaultView()}. @return a ViewCSS object. 
public	TokenNamepublic	
AbstractView	TokenNameIdentifier	 Abstract View
getDefaultView	TokenNameIdentifier	 get Default View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultView	TokenNameIdentifier	 default View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
)	TokenNameRPAREN	
implementation	TokenNameIdentifier	 implementation
;	TokenNameSEMICOLON	
defaultView	TokenNameIdentifier	 default View
=	TokenNameEQUAL	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
createViewCSS	TokenNameIdentifier	 create View CSS
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
defaultView	TokenNameIdentifier	 default View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the view CSS. */	TokenNameCOMMENT_JAVADOC	 Clears the view CSS. 
public	TokenNamepublic	
void	TokenNamevoid	
clearViewCSS	TokenNameIdentifier	 clear View CSS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultView	TokenNameIdentifier	 default View
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cssEngine	TokenNameIdentifier	 css Engine
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cssEngine	TokenNameIdentifier	 css Engine
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// DocumentCSS //////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	DocumentCSS //////////////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements * {@link DocumentCSS#getOverrideStyle(Element,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link DocumentCSS#getOverrideStyle(Element,String)}. 
public	TokenNamepublic	
CSSStyleDeclaration	TokenNameIdentifier	 CSS Style Declaration
getOverrideStyle	TokenNameIdentifier	 get Override Style
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudoElt	TokenNameIdentifier	 pseudo Elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
" !!! Not implemented"	TokenNameStringLiteral	 !!! Not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

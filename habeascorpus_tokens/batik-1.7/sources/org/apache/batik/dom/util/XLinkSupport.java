/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
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
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class provides support for XLink features. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: XLinkSupport.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for XLink features. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: XLinkSupport.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XLinkSupport	TokenNameIdentifier	 X Link Support
implements	TokenNameimplements	
XMLConstants	TokenNameIdentifier	 XML Constants
{	TokenNameLBRACE	
/** * Returns the value of the 'xlink:type' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:type' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkType	TokenNameIdentifier	 get X Link Type
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:type' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:type' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkType	TokenNameIdentifier	 set X Link Type
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"simple"	TokenNameStringLiteral	simple
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"extended"	TokenNameStringLiteral	extended
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"locator"	TokenNameStringLiteral	locator
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"arc"	TokenNameStringLiteral	arc
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"xlink:type='"	TokenNameStringLiteral	xlink:type='
+	TokenNamePLUS	
str	TokenNameIdentifier	 str
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the 'xlink:role' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:role' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkRole	TokenNameIdentifier	 get X Link Role
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"role"	TokenNameStringLiteral	role
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:role' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:role' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkRole	TokenNameIdentifier	 set X Link Role
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"role"	TokenNameStringLiteral	role
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the 'xlink:arcrole' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:arcrole' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkArcRole	TokenNameIdentifier	 get X Link Arc Role
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"arcrole"	TokenNameStringLiteral	arcrole
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:arcrole' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:arcrole' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkArcRole	TokenNameIdentifier	 set X Link Arc Role
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"arcrole"	TokenNameStringLiteral	arcrole
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the 'xlink:title' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:title' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkTitle	TokenNameIdentifier	 get X Link Title
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"title"	TokenNameStringLiteral	title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:title' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:title' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkTitle	TokenNameIdentifier	 set X Link Title
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"title"	TokenNameStringLiteral	title
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the 'xlink:show' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:show' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkShow	TokenNameIdentifier	 get X Link Show
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"show"	TokenNameStringLiteral	show
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:show' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:show' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkShow	TokenNameIdentifier	 set X Link Show
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"new"	TokenNameStringLiteral	new
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"replace"	TokenNameStringLiteral	replace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"embed"	TokenNameStringLiteral	embed
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"xlink:show='"	TokenNameStringLiteral	xlink:show='
+	TokenNamePLUS	
str	TokenNameIdentifier	 str
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"show"	TokenNameStringLiteral	show
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the 'xlink:actuate' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:actuate' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkActuate	TokenNameIdentifier	 get X Link Actuate
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"actuate"	TokenNameStringLiteral	actuate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:actuate' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:actuate' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkActuate	TokenNameIdentifier	 set X Link Actuate
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"onReplace"	TokenNameStringLiteral	onReplace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"onLoad"	TokenNameStringLiteral	onLoad
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
SYNTAX_ERR	TokenNameIdentifier	 SYNTAX  ERR
,	TokenNameCOMMA	
"xlink:actuate='"	TokenNameStringLiteral	xlink:actuate='
+	TokenNamePLUS	
str	TokenNameIdentifier	 str
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"actuate"	TokenNameStringLiteral	actuate
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the 'xlink:href' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the 'xlink:href' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier	 XLINK  HREF  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the 'xlink:href' attribute of the given element. */	TokenNameCOMMENT_JAVADOC	 Sets the value of the 'xlink:href' attribute of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXLinkHref	TokenNameIdentifier	 set X Link Href
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
XLINK_HREF_ATTRIBUTE	TokenNameIdentifier	 XLINK  HREF  ATTRIBUTE
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

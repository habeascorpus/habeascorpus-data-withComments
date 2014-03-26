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
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLLinkElement	TokenNameIdentifier	 HTML Link Element
;	TokenNameSEMICOLON	
/** * @xerces.internal * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.html.HTMLLinkElement * @see org.apache.xerces.dom.ElementImpl */	TokenNameCOMMENT_JAVADOC	 @xerces.internal @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.html.HTMLLinkElement @see org.apache.xerces.dom.ElementImpl 
public	TokenNamepublic	
class	TokenNameclass	
HTMLLinkElementImpl	TokenNameIdentifier	 HTML Link Element Impl
extends	TokenNameextends	
HTMLElementImpl	TokenNameIdentifier	 HTML Element Impl
implements	TokenNameimplements	
HTMLLinkElement	TokenNameIdentifier	 HTML Link Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
874345520063418879L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
getCharset	TokenNameIdentifier	 get Charset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"charset"	TokenNameStringLiteral	charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCharset	TokenNameIdentifier	 set Charset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"charset"	TokenNameStringLiteral	charset
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHref	TokenNameIdentifier	 get Href
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHref	TokenNameIdentifier	 set Href
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
,	TokenNameCOMMA	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHreflang	TokenNameIdentifier	 get Hreflang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"hreflang"	TokenNameStringLiteral	hreflang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHreflang	TokenNameIdentifier	 set Hreflang
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
hreflang	TokenNameIdentifier	 hreflang
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"hreflang"	TokenNameStringLiteral	hreflang
,	TokenNameCOMMA	
hreflang	TokenNameIdentifier	 hreflang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMedia	TokenNameIdentifier	 get Media
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"media"	TokenNameStringLiteral	media
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMedia	TokenNameIdentifier	 set Media
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"media"	TokenNameStringLiteral	media
,	TokenNameCOMMA	
media	TokenNameIdentifier	 media
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRel	TokenNameIdentifier	 get Rel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"rel"	TokenNameStringLiteral	rel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRel	TokenNameIdentifier	 set Rel
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rel	TokenNameIdentifier	 rel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"rel"	TokenNameStringLiteral	rel
,	TokenNameCOMMA	
rel	TokenNameIdentifier	 rel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRev	TokenNameIdentifier	 get Rev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"rev"	TokenNameStringLiteral	rev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRev	TokenNameIdentifier	 set Rev
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rev	TokenNameIdentifier	 rev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"rev"	TokenNameStringLiteral	rev
,	TokenNameCOMMA	
rev	TokenNameIdentifier	 rev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"target"	TokenNameStringLiteral	target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"target"	TokenNameStringLiteral	target
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor requires owner document. * * @param owner The owner HTML document */	TokenNameCOMMENT_JAVADOC	 Constructor requires owner document. * @param owner The owner HTML document 
public	TokenNamepublic	
HTMLLinkElementImpl	TokenNameIdentifier	 HTML Link Element Impl
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

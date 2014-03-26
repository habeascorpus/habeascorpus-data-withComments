/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
DocumentLoader	TokenNameIdentifier	 Document Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
URIResolver	TokenNameIdentifier	 URI Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractNode	TokenNameIdentifier	 Abstract Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xbl	TokenNameIdentifier	 xbl
.	TokenNameDOT	
NodeXBL	TokenNameIdentifier	 Node XBL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xbl	TokenNameIdentifier	 xbl
.	TokenNameDOT	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDocument	TokenNameIdentifier	 SVG Document
;	TokenNameSEMICOLON	
/** * A URIResolver for SVG 1.2 documents. This is to allow resolution of * fragment IDs within shadow trees to work properly. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVG12URIResolver.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A URIResolver for SVG 1.2 documents. This is to allow resolution of fragment IDs within shadow trees to work properly. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVG12URIResolver.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVG12URIResolver	TokenNameIdentifier	 SV G12 URI Resolver
extends	TokenNameextends	
URIResolver	TokenNameIdentifier	 URI Resolver
{	TokenNameLBRACE	
/** * Creates a new SVG12URIResolver object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVG12URIResolver object. 
public	TokenNamepublic	
SVG12URIResolver	TokenNameIdentifier	 SV G12 URI Resolver
(	TokenNameLPAREN	
SVGDocument	TokenNameIdentifier	 SVG Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
DocumentLoader	TokenNameIdentifier	 Document Loader
dl	TokenNameIdentifier	 dl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
dl	TokenNameIdentifier	 dl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the base URI of the referer element. */	TokenNameCOMMENT_JAVADOC	 Returns the base URI of the referer element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getRefererBaseURI	TokenNameIdentifier	 get Referer Base URI
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractNode	TokenNameIdentifier	 Abstract Node
aref	TokenNameIdentifier	 aref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aref	TokenNameIdentifier	 aref
.	TokenNameDOT	
getXblBoundElement	TokenNameIdentifier	 get Xbl Bound Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
aref	TokenNameIdentifier	 aref
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the node referenced by the given fragment identifier. * This is called when the whole URI just contains a fragment identifier * and there is no XML Base URI in effect. * @param frag the URI fragment * @param ref the context element from which to resolve the URI fragment */	TokenNameCOMMENT_JAVADOC	 Returns the node referenced by the given fragment identifier. This is called when the whole URI just contains a fragment identifier and there is no XML Base URI in effect. @param frag the URI fragment @param ref the context element from which to resolve the URI fragment 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
getNodeByFragment	TokenNameIdentifier	 get Node By Fragment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
frag	TokenNameIdentifier	 frag
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeXBL	TokenNameIdentifier	 Node XBL
refx	TokenNameIdentifier	 refx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeXBL	TokenNameIdentifier	 Node XBL
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
NodeXBL	TokenNameIdentifier	 Node XBL
boundElt	TokenNameIdentifier	 bound Elt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeXBL	TokenNameIdentifier	 Node XBL
)	TokenNameRPAREN	
refx	TokenNameIdentifier	 refx
.	TokenNameDOT	
getXblBoundElement	TokenNameIdentifier	 get Xbl Bound Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
boundElt	TokenNameIdentifier	 bound Elt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
shadow	TokenNameIdentifier	 shadow
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XBLShadowTreeElement	TokenNameIdentifier	 XBL Shadow Tree Element
)	TokenNameRPAREN	
boundElt	TokenNameIdentifier	 bound Elt
.	TokenNameDOT	
getXblShadowTree	TokenNameIdentifier	 get Xbl Shadow Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
shadow	TokenNameIdentifier	 shadow
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
refx	TokenNameIdentifier	 refx
.	TokenNameDOT	
getXblDefinitions	TokenNameIdentifier	 get Xbl Definitions
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
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getNodeByFragment	TokenNameIdentifier	 get Node By Fragment
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

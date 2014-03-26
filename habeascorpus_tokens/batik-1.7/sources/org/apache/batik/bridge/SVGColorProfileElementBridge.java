/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
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
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
/** * This class bridges an SVG <tt>color-profile</tt> element with an * <tt>ICC_ColorSpace</tt> object. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGColorProfileElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class bridges an SVG <tt>color-profile</tt> element with an <tt>ICC_ColorSpace</tt> object. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGColorProfileElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGColorProfileElementBridge	TokenNameIdentifier	 SVG Color Profile Element Bridge
extends	TokenNameextends	
AbstractSVGBridge	TokenNameIdentifier	 Abstract SVG Bridge
implements	TokenNameimplements	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * Profile cache */	TokenNameCOMMENT_JAVADOC	 Profile cache 
public	TokenNamepublic	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
NamedProfileCache	TokenNameIdentifier	 Named Profile Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns 'colorProfile'. */	TokenNameCOMMENT_JAVADOC	 Returns 'colorProfile'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_COLOR_PROFILE_TAG	TokenNameIdentifier	 SVG  COLOR  PROFILE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an ICC_ColorSpace according to the specified parameters. * * @param ctx the bridge context to use * @param paintedElement element on which the color is painted * @param iccProfileName name of the profile that should be loaded * that could be a color-profile element or an @color-profile * CSS rule */	TokenNameCOMMENT_JAVADOC	 Creates an ICC_ColorSpace according to the specified parameters. * @param ctx the bridge context to use @param paintedElement element on which the color is painted @param iccProfileName name of the profile that should be loaded that could be a color-profile element or an @color-profile CSS rule 
public	TokenNamepublic	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
createICCColorSpaceExt	TokenNameIdentifier	 create ICC Color Space Ext
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
iccProfileName	TokenNameIdentifier	 icc Profile Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if there is one if the cache. 	TokenNameCOMMENT_LINE	Check if there is one if the cache. 
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
request	TokenNameIdentifier	 request
(	TokenNameLPAREN	
iccProfileName	TokenNameIdentifier	 icc Profile Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// todo locale?? 	TokenNameCOMMENT_LINE	todo locale?? 
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cs	TokenNameIdentifier	 cs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// There was no cached copies for the profile. Load it now. 	TokenNameCOMMENT_LINE	There was no cached copies for the profile. Load it now. 
// Search for a color-profile element with specific name 	TokenNameCOMMENT_LINE	Search for a color-profile element with specific name 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
paintedElement	TokenNameIdentifier	 painted Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getElementsByTagNameNS	TokenNameIdentifier	 get Elements By Tag Name NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_COLOR_PROFILE_TAG	TokenNameIdentifier	 SVG  COLOR  PROFILE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
null	TokenNamenull	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
profileNode	TokenNameIdentifier	 profile Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nameAttr	TokenNameIdentifier	 name Attr
=	TokenNameEQUAL	
profileNode	TokenNameIdentifier	 profile Node
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  NAME  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iccProfileName	TokenNameIdentifier	 icc Profile Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
nameAttr	TokenNameIdentifier	 name Attr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
profile	TokenNameIdentifier	 profile
=	TokenNameEQUAL	
profileNode	TokenNameIdentifier	 profile Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Now that we have a profile element, 	TokenNameCOMMENT_LINE	Now that we have a profile element, 
// try to load the corresponding ICC profile xlink:href 	TokenNameCOMMENT_LINE	try to load the corresponding ICC profile xlink:href 
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
profile	TokenNameIdentifier	 profile
)	TokenNameRPAREN	
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
pDocURL	TokenNameIdentifier	 p Doc URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pDocURL	TokenNameIdentifier	 p Doc URL
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
pDocURL	TokenNameIdentifier	 p Doc URL
,	TokenNameCOMMA	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
ERR_URI_MALFORMED	TokenNameIdentifier	 ERR  URI  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
checkLoadExternalResource	TokenNameIdentifier	 check Load External Resource
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
pDocURL	TokenNameIdentifier	 p Doc URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioEx	TokenNameIdentifier	 io Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
ioEx	TokenNameIdentifier	 io Ex
,	TokenNameCOMMA	
ERR_URI_IO	TokenNameIdentifier	 ERR  URI  IO
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ??? IS THAT AN ERROR FOR THE SVG SPEC ??? 	TokenNameCOMMENT_LINE	??? IS THAT AN ERROR FOR THE SVG SPEC ??? 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
secEx	TokenNameIdentifier	 sec Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
paintedElement	TokenNameIdentifier	 painted Element
,	TokenNameCOMMA	
secEx	TokenNameIdentifier	 sec Ex
,	TokenNameCOMMA	
ERR_URI_UNSECURE	TokenNameIdentifier	 ERR  URI  UNSECURE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
href	TokenNameIdentifier	 href
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Extract the rendering intent from profile element 	TokenNameCOMMENT_LINE	Extract the rendering intent from profile element 
int	TokenNameint	
intent	TokenNameIdentifier	 intent
=	TokenNameEQUAL	
convertIntent	TokenNameIdentifier	 convert Intent
(	TokenNameLPAREN	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
new	TokenNamenew	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add profile to cache 	TokenNameCOMMENT_LINE	Add profile to cache 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
iccProfileName	TokenNameIdentifier	 icc Profile Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cs	TokenNameIdentifier	 cs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
convertIntent	TokenNameIdentifier	 convert Intent
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
intent	TokenNameIdentifier	 intent
=	TokenNameEQUAL	
profile	TokenNameIdentifier	 profile
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
.	TokenNameDOT	
AUTO	TokenNameIdentifier	 AUTO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_PERCEPTUAL_VALUE	TokenNameIdentifier	 SVG  PERCEPTUAL  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
.	TokenNameDOT	
PERCEPTUAL	TokenNameIdentifier	 PERCEPTUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
.	TokenNameDOT	
AUTO	TokenNameIdentifier	 AUTO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_RELATIVE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  RELATIVE  COLORIMETRIC  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
.	TokenNameDOT	
RELATIVE_COLORIMETRIC	TokenNameIdentifier	 RELATIVE  COLORIMETRIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_ABSOLUTE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  ABSOLUTE  COLORIMETRIC  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
.	TokenNameDOT	
ABSOLUTE_COLORIMETRIC	TokenNameIdentifier	 ABSOLUTE  COLORIMETRIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_SATURATION_VALUE	TokenNameIdentifier	 SVG  SATURATION  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
.	TokenNameDOT	
SATURATION	TokenNameIdentifier	 SATURATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
profile	TokenNameIdentifier	 profile
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
intent	TokenNameIdentifier	 intent
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

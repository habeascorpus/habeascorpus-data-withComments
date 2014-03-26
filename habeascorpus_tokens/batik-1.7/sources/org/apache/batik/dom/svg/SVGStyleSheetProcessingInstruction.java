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
svg	TokenNameIdentifier	 svg
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSStyleSheetNode	TokenNameIdentifier	 CSS Style Sheet Node
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
StyleSheet	TokenNameIdentifier	 Style Sheet
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
AbstractDocument	TokenNameIdentifier	 Abstract Document
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
StyleSheetFactory	TokenNameIdentifier	 Style Sheet Factory
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
StyleSheetProcessingInstruction	TokenNameIdentifier	 Style Sheet Processing Instruction
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
HashTable	TokenNameIdentifier	 Hash Table
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
DOMException	TokenNameIdentifier	 DOM Exception
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
/** * This class provides an implementation of the 'xml-stylesheet' processing * instructions. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGStyleSheetProcessingInstruction.java 579230 2007-09-25 12:52:48Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the 'xml-stylesheet' processing instructions. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGStyleSheetProcessingInstruction.java 579230 2007-09-25 12:52:48Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGStyleSheetProcessingInstruction	TokenNameIdentifier	 SVG Style Sheet Processing Instruction
extends	TokenNameextends	
StyleSheetProcessingInstruction	TokenNameIdentifier	 Style Sheet Processing Instruction
implements	TokenNameimplements	
CSSStyleSheetNode	TokenNameIdentifier	 CSS Style Sheet Node
{	TokenNameLBRACE	
/** * The style-sheet. */	TokenNameCOMMENT_JAVADOC	 The style-sheet. 
protected	TokenNameprotected	
StyleSheet	TokenNameIdentifier	 Style Sheet
styleSheet	TokenNameIdentifier	 style Sheet
;	TokenNameSEMICOLON	
/** * Creates a new ProcessingInstruction object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ProcessingInstruction object. 
protected	TokenNameprotected	
SVGStyleSheetProcessingInstruction	TokenNameIdentifier	 SVG Style Sheet Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new ProcessingInstruction object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ProcessingInstruction object. 
public	TokenNamepublic	
SVGStyleSheetProcessingInstruction	TokenNameIdentifier	 SVG Style Sheet Processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
StyleSheetFactory	TokenNameIdentifier	 Style Sheet Factory
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URI of the referenced stylesheet. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of the referenced stylesheet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStyleSheetURI	TokenNameIdentifier	 get Style Sheet URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
svgDoc	TokenNameIdentifier	 svg Doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
svgDoc	TokenNameIdentifier	 svg Doc
.	TokenNameDOT	
getParsedURL	TokenNameIdentifier	 get Parsed URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getPseudoAttributes	TokenNameIdentifier	 get Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the associated style-sheet. */	TokenNameCOMMENT_JAVADOC	 Returns the associated style-sheet. 
public	TokenNamepublic	
StyleSheet	TokenNameIdentifier	 Style Sheet
getCSSStyleSheet	TokenNameIdentifier	 get CSS Style Sheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
styleSheet	TokenNameIdentifier	 style Sheet
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashTable	TokenNameIdentifier	 Hash Table
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
getPseudoAttributes	TokenNameIdentifier	 get Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"type"	TokenNameStringLiteral	type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"text/css"	TokenNameStringLiteral	text/css
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"media"	TokenNameStringLiteral	media
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"href"	TokenNameStringLiteral	href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
alternate	TokenNameIdentifier	 alternate
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"alternate"	TokenNameStringLiteral	alternate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGOMDocument	TokenNameIdentifier	 SVGOM Document
)	TokenNameRPAREN	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
durl	TokenNameIdentifier	 durl
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getParsedURL	TokenNameIdentifier	 get Parsed URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
burl	TokenNameIdentifier	 burl
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
durl	TokenNameIdentifier	 durl
,	TokenNameCOMMA	
href	TokenNameIdentifier	 href
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CSSEngine	TokenNameIdentifier	 CSS Engine
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getCSSEngine	TokenNameIdentifier	 get CSS Engine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleSheet	TokenNameIdentifier	 style Sheet
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
parseStyleSheet	TokenNameIdentifier	 parse Style Sheet
(	TokenNameLPAREN	
burl	TokenNameIdentifier	 burl
,	TokenNameCOMMA	
media	TokenNameIdentifier	 media
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleSheet	TokenNameIdentifier	 style Sheet
.	TokenNameDOT	
setAlternate	TokenNameIdentifier	 set Alternate
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
alternate	TokenNameIdentifier	 alternate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleSheet	TokenNameIdentifier	 style Sheet
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
styleSheet	TokenNameIdentifier	 style Sheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.ProcessingInstruction#setData(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.ProcessingInstruction#setData(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleSheet	TokenNameIdentifier	 style Sheet
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGStyleSheetProcessingInstruction	TokenNameIdentifier	 SVG Style Sheet Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

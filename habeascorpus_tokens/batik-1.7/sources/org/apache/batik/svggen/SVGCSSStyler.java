/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
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
NamedNodeMap	TokenNameIdentifier	 Named Node Map
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
/** * This utility class converts a standard SVG document that uses * attribute into one that uses the CSS style attribute instead. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGCSSStyler.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This utility class converts a standard SVG document that uses attribute into one that uses the CSS style attribute instead. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGCSSStyler.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGCSSStyler	TokenNameIdentifier	 SVGCSS Styler
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
CSS_PROPERTY_VALUE_SEPARATOR	TokenNameIdentifier	 CSS  PROPERTY  VALUE  SEPARATOR
=	TokenNameEQUAL	
':'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
CSS_RULE_SEPARATOR	TokenNameIdentifier	 CSS  RULE  SEPARATOR
=	TokenNameEQUAL	
';'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
SPACE	TokenNameIdentifier	 SPACE
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Invoking this method removes all the styling attributes * (such as 'fill' or 'fill-opacity') from the input element * and its descendant and replaces them with their CSS2 * property counterparts. * * @param node SVG Node to be converted to use style */	TokenNameCOMMENT_JAVADOC	 Invoking this method removes all the styling attributes (such as 'fill' or 'fill-opacity') from the input element and its descendant and replaces them with their CSS2 property counterparts. * @param node SVG Node to be converted to use style 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
style	TokenNameIdentifier	 style
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Has to be an Element, as it has attributes 	TokenNameCOMMENT_LINE	Has to be an Element, as it has attributes 
// According to spec. 	TokenNameCOMMENT_LINE	According to spec. 
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nAttr	TokenNameIdentifier	 n Attr
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
toBeRemoved	TokenNameIdentifier	 to Be Removed
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
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
nAttr	TokenNameIdentifier	 n Attr
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
SVGStylingAttributes	TokenNameIdentifier	 SVG Styling Attributes
.	TokenNameDOT	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Found new style attribute"); 	TokenNameCOMMENT_LINE	System.out.println("Found new style attribute"); 
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSS_PROPERTY_VALUE_SEPARATOR	TokenNameIdentifier	 CSS  PROPERTY  VALUE  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSS_RULE_SEPARATOR	TokenNameIdentifier	 CSS  RULE  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SPACE	TokenNameIdentifier	 SPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toBeRemoved	TokenNameIdentifier	 to Be Removed
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There were some styling attributes 	TokenNameCOMMENT_LINE	There were some styling attributes 
// System.out.println("Setting style attribute on node: " + styleAttrBuffer.toString().trim()); 	TokenNameCOMMENT_LINE	System.out.println("Setting style attribute on node: " + styleAttrBuffer.toString().trim()); 
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  STYLE  ATTRIBUTE
,	TokenNameCOMMA	
styleAttrBuffer	TokenNameIdentifier	 style Attr Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
toBeRemoved	TokenNameIdentifier	 to Be Removed
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
toBeRemoved	TokenNameIdentifier	 to Be Removed
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// else 	TokenNameCOMMENT_LINE	else 
// System.out.println("NO STYLE PROPERTIES"); 	TokenNameCOMMENT_LINE	System.out.println("NO STYLE PROPERTIES"); 
}	TokenNameRBRACE	
// Now, process child elements 	TokenNameCOMMENT_LINE	Now, process child elements 
NodeList	TokenNameIdentifier	 Node List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nChildren	TokenNameIdentifier	 n Children
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
nChildren	TokenNameIdentifier	 n Children
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
style	TokenNameIdentifier	 style
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

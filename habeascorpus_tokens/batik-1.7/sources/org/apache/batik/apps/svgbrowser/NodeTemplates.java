/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
SVGConstants	TokenNameIdentifier	 SVG Constants
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
/** * Provides basic xml representation and description for most commonly used * nodes. * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Provides basic xml representation and description for most commonly used nodes. * @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
NodeTemplates	TokenNameIdentifier	 Node Templates
{	TokenNameLBRACE	
// Node template descriptions provide basic information on node properties, 	TokenNameCOMMENT_LINE	Node template descriptions provide basic information on node properties, 
// such as: xml represenation (suffix "Value"), element name 	TokenNameCOMMENT_LINE	such as: xml represenation (suffix "Value"), element name 
// (suffix "Name"), element type (suffix "Type"), element category 	TokenNameCOMMENT_LINE	(suffix "Name"), element type (suffix "Type"), element category 
// (suffix "Category"), element description (suffix "Description"). 	TokenNameCOMMENT_LINE	(suffix "Category"), element description (suffix "Description"). 
// Base node name on which these suffixes are appended is read from the 	TokenNameCOMMENT_LINE	Base node name on which these suffixes are appended is read from the 
// class members ending with "MemberName". 	TokenNameCOMMENT_LINE	class members ending with "MemberName". 
// Example: 	TokenNameCOMMENT_LINE	Example: 
// public static String rectMemberName = "rectElement"; 	TokenNameCOMMENT_LINE	public static String rectMemberName = "rectElement"; 
// Other class members that describe this node should be declared as: 	TokenNameCOMMENT_LINE	Other class members that describe this node should be declared as: 
// rectElementValue = "...", rectElementType = "...", rectElementName = 	TokenNameCOMMENT_LINE	rectElementValue = "...", rectElementType = "...", rectElementName = 
// "...", rectElementCategory = "..." and rectElementDescription = "..." 	TokenNameCOMMENT_LINE	"...", rectElementCategory = "..." and rectElementDescription = "..." 
// Suffixes 	TokenNameCOMMENT_LINE	Suffixes 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALUE	TokenNameIdentifier	 VALUE
=	TokenNameEQUAL	
"Value"	TokenNameStringLiteral	Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
"Name"	TokenNameStringLiteral	Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE	TokenNameIdentifier	 TYPE
=	TokenNameEQUAL	
"Type"	TokenNameStringLiteral	Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DESCRIPTION	TokenNameIdentifier	 DESCRIPTION
=	TokenNameEQUAL	
"Description"	TokenNameStringLiteral	Description
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CATEGORY	TokenNameIdentifier	 CATEGORY
=	TokenNameEQUAL	
"Category"	TokenNameStringLiteral	Category
;	TokenNameSEMICOLON	
// Categories 	TokenNameCOMMENT_LINE	Categories 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
=	TokenNameEQUAL	
"Basic Shapes"	TokenNameStringLiteral	Basic Shapes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LINKING	TokenNameIdentifier	 LINKING
=	TokenNameEQUAL	
"Linking"	TokenNameStringLiteral	Linking
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
"Text"	TokenNameStringLiteral	Text
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANIMATION	TokenNameIdentifier	 ANIMATION
=	TokenNameEQUAL	
"Animation"	TokenNameStringLiteral	Animation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLIP_MASK_COMPOSITE	TokenNameIdentifier	 CLIP  MASK  COMPOSITE
=	TokenNameEQUAL	
"Clipping, Masking and Compositing"	TokenNameStringLiteral	Clipping, Masking and Compositing
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COLOR	TokenNameIdentifier	 COLOR
=	TokenNameEQUAL	
"Color"	TokenNameStringLiteral	Color
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INTERACTIVITY	TokenNameIdentifier	 INTERACTIVITY
=	TokenNameEQUAL	
"Interactivity"	TokenNameStringLiteral	Interactivity
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FONTS	TokenNameIdentifier	 FONTS
=	TokenNameEQUAL	
"Fonts"	TokenNameStringLiteral	Fonts
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
=	TokenNameEQUAL	
"Document Structure"	TokenNameStringLiteral	Document Structure
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
=	TokenNameEQUAL	
"Filter Effects"	TokenNameStringLiteral	Filter Effects
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXTENSIBILITY	TokenNameIdentifier	 EXTENSIBILITY
=	TokenNameEQUAL	
"Extensibility"	TokenNameStringLiteral	Extensibility
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GRADIENTS_AND_PATTERNS	TokenNameIdentifier	 GRADIENTS  AND  PATTERNS
=	TokenNameEQUAL	
"Gradients and Patterns"	TokenNameStringLiteral	Gradients and Patterns
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PAINTING	TokenNameIdentifier	 PAINTING
=	TokenNameEQUAL	
"Painting: Filling, Stroking and Marker Symbols"	TokenNameStringLiteral	Painting: Filling, Stroking and Marker Symbols
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
METADATA	TokenNameIdentifier	 METADATA
=	TokenNameEQUAL	
"Metadata"	TokenNameStringLiteral	Metadata
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PATHS	TokenNameIdentifier	 PATHS
=	TokenNameEQUAL	
"Paths"	TokenNameStringLiteral	Paths
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCRIPTING	TokenNameIdentifier	 SCRIPTING
=	TokenNameEQUAL	
"Scripting"	TokenNameStringLiteral	Scripting
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STYLING	TokenNameIdentifier	 STYLING
=	TokenNameEQUAL	
"Styling"	TokenNameStringLiteral	Styling
;	TokenNameSEMICOLON	
// Maps 	TokenNameCOMMENT_LINE	Maps 
/** * Map with node template wrappers. */	TokenNameCOMMENT_JAVADOC	 Map with node template wrappers. 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
nodeTemplatesMap	TokenNameIdentifier	 node Templates Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * List with all node categories. */	TokenNameCOMMENT_JAVADOC	 List with all node categories. 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
categoriesList	TokenNameIdentifier	 categories List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Rect element 	TokenNameCOMMENT_LINE	Rect element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
rectMemberName	TokenNameIdentifier	 rect Member Name
=	TokenNameEQUAL	
"rectElement"	TokenNameStringLiteral	rectElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
rectElementValue	TokenNameIdentifier	 rect Element Value
=	TokenNameEQUAL	
"<rect width="0" height="0"/>"	TokenNameStringLiteral	<rect width="0" height="0"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
rectElementName	TokenNameIdentifier	 rect Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
rectElementType	TokenNameIdentifier	 rect Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
rectElementCategory	TokenNameIdentifier	 rect Element Category
=	TokenNameEQUAL	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
rectElementDescription	TokenNameIdentifier	 rect Element Description
=	TokenNameEQUAL	
"Rect"	TokenNameStringLiteral	Rect
;	TokenNameSEMICOLON	
// Circle element 	TokenNameCOMMENT_LINE	Circle element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
circleMemberName	TokenNameIdentifier	 circle Member Name
=	TokenNameEQUAL	
"circleElement"	TokenNameStringLiteral	circleElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
circleElementValue	TokenNameIdentifier	 circle Element Value
=	TokenNameEQUAL	
"<circle r="0"/>"	TokenNameStringLiteral	<circle r="0"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
circleElementName	TokenNameIdentifier	 circle Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_CIRCLE_TAG	TokenNameIdentifier	 SVG  CIRCLE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
circleElementType	TokenNameIdentifier	 circle Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
circleElementCategory	TokenNameIdentifier	 circle Element Category
=	TokenNameEQUAL	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
circleElementDescription	TokenNameIdentifier	 circle Element Description
=	TokenNameEQUAL	
"Circle"	TokenNameStringLiteral	Circle
;	TokenNameSEMICOLON	
// Line element 	TokenNameCOMMENT_LINE	Line element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lineElementMemberName	TokenNameIdentifier	 line Element Member Name
=	TokenNameEQUAL	
"lineElement"	TokenNameStringLiteral	lineElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lineElementName	TokenNameIdentifier	 line Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_LINE_TAG	TokenNameIdentifier	 SVG  LINE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lineElementValue	TokenNameIdentifier	 line Element Value
=	TokenNameEQUAL	
"<line x1="0" y1="0" x2="0" y2="0"/>"	TokenNameStringLiteral	<line x1="0" y1="0" x2="0" y2="0"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
lineElementType	TokenNameIdentifier	 line Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lineElementCategory	TokenNameIdentifier	 line Element Category
=	TokenNameEQUAL	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lineElementDescription	TokenNameIdentifier	 line Element Description
=	TokenNameEQUAL	
"Text"	TokenNameStringLiteral	Text
;	TokenNameSEMICOLON	
// Path element 	TokenNameCOMMENT_LINE	Path element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pathElementMemberName	TokenNameIdentifier	 path Element Member Name
=	TokenNameEQUAL	
"pathElement"	TokenNameStringLiteral	pathElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pathElementName	TokenNameIdentifier	 path Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_PATH_TAG	TokenNameIdentifier	 SVG  PATH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pathElementValue	TokenNameIdentifier	 path Element Value
=	TokenNameEQUAL	
"<path d="M0,0"/>"	TokenNameStringLiteral	<path d="M0,0"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
pathElementType	TokenNameIdentifier	 path Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pathElementCategory	TokenNameIdentifier	 path Element Category
=	TokenNameEQUAL	
PATHS	TokenNameIdentifier	 PATHS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pathElementDescription	TokenNameIdentifier	 path Element Description
=	TokenNameEQUAL	
"Path"	TokenNameStringLiteral	Path
;	TokenNameSEMICOLON	
// G element 	TokenNameCOMMENT_LINE	G element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
groupElementMemberName	TokenNameIdentifier	 group Element Member Name
=	TokenNameEQUAL	
"groupElement"	TokenNameStringLiteral	groupElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
groupElementName	TokenNameIdentifier	 group Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
groupElementValue	TokenNameIdentifier	 group Element Value
=	TokenNameEQUAL	
"<g/>"	TokenNameStringLiteral	<g/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
groupElementType	TokenNameIdentifier	 group Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
groupElementCategory	TokenNameIdentifier	 group Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
groupElementDescription	TokenNameIdentifier	 group Element Description
=	TokenNameEQUAL	
"Group"	TokenNameStringLiteral	Group
;	TokenNameSEMICOLON	
// Ellipse element 	TokenNameCOMMENT_LINE	Ellipse element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ellipseElementMemberName	TokenNameIdentifier	 ellipse Element Member Name
=	TokenNameEQUAL	
"ellipseElement"	TokenNameStringLiteral	ellipseElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ellipseElementName	TokenNameIdentifier	 ellipse Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ELLIPSE_TAG	TokenNameIdentifier	 SVG  ELLIPSE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ellipseElementValue	TokenNameIdentifier	 ellipse Element Value
=	TokenNameEQUAL	
"<ellipse/>"	TokenNameStringLiteral	<ellipse/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
ellipseElementType	TokenNameIdentifier	 ellipse Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ellipseElementCategory	TokenNameIdentifier	 ellipse Element Category
=	TokenNameEQUAL	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ellipseElementDescription	TokenNameIdentifier	 ellipse Element Description
=	TokenNameEQUAL	
"Ellipse"	TokenNameStringLiteral	Ellipse
;	TokenNameSEMICOLON	
// Image element 	TokenNameCOMMENT_LINE	Image element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
imageElementMemberName	TokenNameIdentifier	 image Element Member Name
=	TokenNameEQUAL	
"imageElement"	TokenNameStringLiteral	imageElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
imageElementName	TokenNameIdentifier	 image Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_IMAGE_TAG	TokenNameIdentifier	 SVG  IMAGE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
imageElementValue	TokenNameIdentifier	 image Element Value
=	TokenNameEQUAL	
"<image xlink:href="file/c://"/>"	TokenNameStringLiteral	<image xlink:href="file/c://"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
imageElementType	TokenNameIdentifier	 image Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
imageElementCategory	TokenNameIdentifier	 image Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
imageElementDescription	TokenNameIdentifier	 image Element Description
=	TokenNameEQUAL	
"Image"	TokenNameStringLiteral	Image
;	TokenNameSEMICOLON	
// Polygon element 	TokenNameCOMMENT_LINE	Polygon element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polygonElementMemberName	TokenNameIdentifier	 polygon Element Member Name
=	TokenNameEQUAL	
"polygonElement"	TokenNameStringLiteral	polygonElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polygonElementName	TokenNameIdentifier	 polygon Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_POLYGON_TAG	TokenNameIdentifier	 SVG  POLYGON  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polygonElementValue	TokenNameIdentifier	 polygon Element Value
=	TokenNameEQUAL	
"<polygon/>"	TokenNameStringLiteral	<polygon/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
polygonElementType	TokenNameIdentifier	 polygon Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polygonElementCategory	TokenNameIdentifier	 polygon Element Category
=	TokenNameEQUAL	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polygonElementDescription	TokenNameIdentifier	 polygon Element Description
=	TokenNameEQUAL	
"Polygon"	TokenNameStringLiteral	Polygon
;	TokenNameSEMICOLON	
// Polyline element 	TokenNameCOMMENT_LINE	Polyline element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polylineElementMemberName	TokenNameIdentifier	 polyline Element Member Name
=	TokenNameEQUAL	
"polylineElement"	TokenNameStringLiteral	polylineElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polylineElementName	TokenNameIdentifier	 polyline Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_POLYLINE_TAG	TokenNameIdentifier	 SVG  POLYLINE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polylineElementValue	TokenNameIdentifier	 polyline Element Value
=	TokenNameEQUAL	
"<polyline/>"	TokenNameStringLiteral	<polyline/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
polylineElementType	TokenNameIdentifier	 polyline Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polylineElementCategory	TokenNameIdentifier	 polyline Element Category
=	TokenNameEQUAL	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
polylineElementDescription	TokenNameIdentifier	 polyline Element Description
=	TokenNameEQUAL	
"Polyline"	TokenNameStringLiteral	Polyline
;	TokenNameSEMICOLON	
// Text element 	TokenNameCOMMENT_LINE	Text element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textElementMemberName	TokenNameIdentifier	 text Element Member Name
=	TokenNameEQUAL	
"textElement"	TokenNameStringLiteral	textElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textElementName	TokenNameIdentifier	 text Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_TEXT_TAG	TokenNameIdentifier	 SVG  TEXT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textElementValue	TokenNameIdentifier	 text Element Value
=	TokenNameEQUAL	
"<text> </text>"	TokenNameStringLiteral	<text> </text>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
textElementType	TokenNameIdentifier	 text Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textElementCategory	TokenNameIdentifier	 text Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textElementDescription	TokenNameIdentifier	 text Element Description
=	TokenNameEQUAL	
"Text"	TokenNameStringLiteral	Text
;	TokenNameSEMICOLON	
// TRef element 	TokenNameCOMMENT_LINE	TRef element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tRefElementMemberName	TokenNameIdentifier	 t Ref Element Member Name
=	TokenNameEQUAL	
"tRefElement"	TokenNameStringLiteral	tRefElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tRefElementName	TokenNameIdentifier	 t Ref Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_TREF_TAG	TokenNameIdentifier	 SVG  TREF  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tRefElementValue	TokenNameIdentifier	 t Ref Element Value
=	TokenNameEQUAL	
"<tref/>"	TokenNameStringLiteral	<tref/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
tRefElementType	TokenNameIdentifier	 t Ref Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tRefElementCategory	TokenNameIdentifier	 t Ref Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tRefElementDescription	TokenNameIdentifier	 t Ref Element Description
=	TokenNameEQUAL	
"TRef"	TokenNameStringLiteral	TRef
;	TokenNameSEMICOLON	
// TSpan element 	TokenNameCOMMENT_LINE	TSpan element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tspanElementMemberName	TokenNameIdentifier	 tspan Element Member Name
=	TokenNameEQUAL	
"tspanElement"	TokenNameStringLiteral	tspanElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tspanElementName	TokenNameIdentifier	 tspan Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_TSPAN_TAG	TokenNameIdentifier	 SVG  TSPAN  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tspanElementValue	TokenNameIdentifier	 tspan Element Value
=	TokenNameEQUAL	
"<tspan/>"	TokenNameStringLiteral	<tspan/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
tspanElementType	TokenNameIdentifier	 tspan Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tspanElementCategory	TokenNameIdentifier	 tspan Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
tspanElementDescription	TokenNameIdentifier	 tspan Element Description
=	TokenNameEQUAL	
"TSpan"	TokenNameStringLiteral	TSpan
;	TokenNameSEMICOLON	
// TextPath element 	TokenNameCOMMENT_LINE	TextPath element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textPathElementMemberName	TokenNameIdentifier	 text Path Element Member Name
=	TokenNameEQUAL	
"textPathElement"	TokenNameStringLiteral	textPathElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textPathElementName	TokenNameIdentifier	 text Path Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_TEXT_PATH_TAG	TokenNameIdentifier	 SVG  TEXT  PATH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textPathElementValue	TokenNameIdentifier	 text Path Element Value
=	TokenNameEQUAL	
"<textPath/>"	TokenNameStringLiteral	<textPath/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
textPathElementType	TokenNameIdentifier	 text Path Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textPathElementCategory	TokenNameIdentifier	 text Path Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textPathElementDescription	TokenNameIdentifier	 text Path Element Description
=	TokenNameEQUAL	
"TextPath"	TokenNameStringLiteral	TextPath
;	TokenNameSEMICOLON	
// Svg element 	TokenNameCOMMENT_LINE	Svg element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
svgElementMemberName	TokenNameIdentifier	 svg Element Member Name
=	TokenNameEQUAL	
"svgElement"	TokenNameStringLiteral	svgElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
svgElementName	TokenNameIdentifier	 svg Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SVG_TAG	TokenNameIdentifier	 SVG  SVG  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
svgElementValue	TokenNameIdentifier	 svg Element Value
=	TokenNameEQUAL	
"<svg/>"	TokenNameStringLiteral	<svg/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
svgElementType	TokenNameIdentifier	 svg Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
svgElementCategory	TokenNameIdentifier	 svg Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
svgElementDescription	TokenNameIdentifier	 svg Element Description
=	TokenNameEQUAL	
"svg"	TokenNameStringLiteral	svg
;	TokenNameSEMICOLON	
// FeBlend element 	TokenNameCOMMENT_LINE	FeBlend element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feBlendElementMemberName	TokenNameIdentifier	 fe Blend Element Member Name
=	TokenNameEQUAL	
"feBlendElement"	TokenNameStringLiteral	feBlendElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feBlendElementName	TokenNameIdentifier	 fe Blend Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_BLEND_TAG	TokenNameIdentifier	 SVG  FE  BLEND  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feBlendElementValue	TokenNameIdentifier	 fe Blend Element Value
=	TokenNameEQUAL	
"<feBlend/>"	TokenNameStringLiteral	<feBlend/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feBlendElementType	TokenNameIdentifier	 fe Blend Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feBlendElementCategory	TokenNameIdentifier	 fe Blend Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feBlendElementDescription	TokenNameIdentifier	 fe Blend Element Description
=	TokenNameEQUAL	
"FeBlend"	TokenNameStringLiteral	FeBlend
;	TokenNameSEMICOLON	
// FeColorMatrix element 	TokenNameCOMMENT_LINE	FeColorMatrix element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feColorMatrixElementMemberName	TokenNameIdentifier	 fe Color Matrix Element Member Name
=	TokenNameEQUAL	
"feColorMatrixElement"	TokenNameStringLiteral	feColorMatrixElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feColorMatrixElementName	TokenNameIdentifier	 fe Color Matrix Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_COLOR_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  COLOR  MATRIX  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feColorMatrixElementValue	TokenNameIdentifier	 fe Color Matrix Element Value
=	TokenNameEQUAL	
"<feColorMatrix/>"	TokenNameStringLiteral	<feColorMatrix/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feColorMatrixElementType	TokenNameIdentifier	 fe Color Matrix Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feColorMatrixElementCategory	TokenNameIdentifier	 fe Color Matrix Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feColorMatrixElementDescription	TokenNameIdentifier	 fe Color Matrix Element Description
=	TokenNameEQUAL	
"FeColorMatrix"	TokenNameStringLiteral	FeColorMatrix
;	TokenNameSEMICOLON	
// FeComponentTransfer element 	TokenNameCOMMENT_LINE	FeComponentTransfer element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feComponentTransferElementMemberName	TokenNameIdentifier	 fe Component Transfer Element Member Name
=	TokenNameEQUAL	
"feComponentTransferElement"	TokenNameStringLiteral	feComponentTransferElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feComponentTransferElementName	TokenNameIdentifier	 fe Component Transfer Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_COMPONENT_TRANSFER_TAG	TokenNameIdentifier	 SVG  FE  COMPONENT  TRANSFER  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feComponentTransferElementValue	TokenNameIdentifier	 fe Component Transfer Element Value
=	TokenNameEQUAL	
"<feComponentTransfer/>"	TokenNameStringLiteral	<feComponentTransfer/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feComponentTransferElementType	TokenNameIdentifier	 fe Component Transfer Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feComponentTransferElementCategory	TokenNameIdentifier	 fe Component Transfer Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feComponentTransferElementDescription	TokenNameIdentifier	 fe Component Transfer Element Description
=	TokenNameEQUAL	
"FeComponentTransfer"	TokenNameStringLiteral	FeComponentTransfer
;	TokenNameSEMICOLON	
// FeComposite element 	TokenNameCOMMENT_LINE	FeComposite element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feCompositeElementMemberName	TokenNameIdentifier	 fe Composite Element Member Name
=	TokenNameEQUAL	
"feCompositeElement"	TokenNameStringLiteral	feCompositeElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feCompositeElementName	TokenNameIdentifier	 fe Composite Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_COMPOSITE_TAG	TokenNameIdentifier	 SVG  FE  COMPOSITE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feCompositeElementValue	TokenNameIdentifier	 fe Composite Element Value
=	TokenNameEQUAL	
"<feComposite/>"	TokenNameStringLiteral	<feComposite/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feCompositeElementType	TokenNameIdentifier	 fe Composite Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feCompositeElementCategory	TokenNameIdentifier	 fe Composite Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feCompositeElementDescription	TokenNameIdentifier	 fe Composite Element Description
=	TokenNameEQUAL	
"FeComposite"	TokenNameStringLiteral	FeComposite
;	TokenNameSEMICOLON	
// FeConvolveMatrix element 	TokenNameCOMMENT_LINE	FeConvolveMatrix element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feConvolveMatrixElementMemberName	TokenNameIdentifier	 fe Convolve Matrix Element Member Name
=	TokenNameEQUAL	
"feConvolveMatrixElement"	TokenNameStringLiteral	feConvolveMatrixElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feConvolveMatrixElementName	TokenNameIdentifier	 fe Convolve Matrix Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_CONVOLVE_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  CONVOLVE  MATRIX  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feConvolveMatrixElementValue	TokenNameIdentifier	 fe Convolve Matrix Element Value
=	TokenNameEQUAL	
"<feConvolveMatrix/>"	TokenNameStringLiteral	<feConvolveMatrix/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feConvolveMatrixElementType	TokenNameIdentifier	 fe Convolve Matrix Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feConvolveMatrixElementCategory	TokenNameIdentifier	 fe Convolve Matrix Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feConvolveMatrixElementDescription	TokenNameIdentifier	 fe Convolve Matrix Element Description
=	TokenNameEQUAL	
"FeConvolveMatrix"	TokenNameStringLiteral	FeConvolveMatrix
;	TokenNameSEMICOLON	
// FeDiffuseLighting element 	TokenNameCOMMENT_LINE	FeDiffuseLighting element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDiffuseLightingElementMemberName	TokenNameIdentifier	 fe Diffuse Lighting Element Member Name
=	TokenNameEQUAL	
"feDiffuseLightingElement"	TokenNameStringLiteral	feDiffuseLightingElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDiffuseLightingElementName	TokenNameIdentifier	 fe Diffuse Lighting Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_DIFFUSE_LIGHTING_TAG	TokenNameIdentifier	 SVG  FE  DIFFUSE  LIGHTING  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDiffuseLightingElementValue	TokenNameIdentifier	 fe Diffuse Lighting Element Value
=	TokenNameEQUAL	
"<feDiffuseLighting/>"	TokenNameStringLiteral	<feDiffuseLighting/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feDiffuseLightingElementType	TokenNameIdentifier	 fe Diffuse Lighting Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDiffuseLightingElementCategory	TokenNameIdentifier	 fe Diffuse Lighting Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDiffuseLightingElementDescription	TokenNameIdentifier	 fe Diffuse Lighting Element Description
=	TokenNameEQUAL	
"FeDiffuseLighting"	TokenNameStringLiteral	FeDiffuseLighting
;	TokenNameSEMICOLON	
// FeDisplacementMap element 	TokenNameCOMMENT_LINE	FeDisplacementMap element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDisplacementMapElementMemberName	TokenNameIdentifier	 fe Displacement Map Element Member Name
=	TokenNameEQUAL	
"feDisplacementMapElement"	TokenNameStringLiteral	feDisplacementMapElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDisplacementMapElementName	TokenNameIdentifier	 fe Displacement Map Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_DISPLACEMENT_MAP_TAG	TokenNameIdentifier	 SVG  FE  DISPLACEMENT  MAP  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDisplacementMapElementValue	TokenNameIdentifier	 fe Displacement Map Element Value
=	TokenNameEQUAL	
"<feDisplacementMap/>"	TokenNameStringLiteral	<feDisplacementMap/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feDisplacementMapElementType	TokenNameIdentifier	 fe Displacement Map Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDisplacementMapElementCategory	TokenNameIdentifier	 fe Displacement Map Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDisplacementMapElementDescription	TokenNameIdentifier	 fe Displacement Map Element Description
=	TokenNameEQUAL	
"FeDisplacementMap"	TokenNameStringLiteral	FeDisplacementMap
;	TokenNameSEMICOLON	
// FeDistantLight element 	TokenNameCOMMENT_LINE	FeDistantLight element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDistantLightElementMemberName	TokenNameIdentifier	 fe Distant Light Element Member Name
=	TokenNameEQUAL	
"feDistantLightElement"	TokenNameStringLiteral	feDistantLightElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDistantLightElementName	TokenNameIdentifier	 fe Distant Light Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_DISTANT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  DISTANT  LIGHT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDistantLightElementValue	TokenNameIdentifier	 fe Distant Light Element Value
=	TokenNameEQUAL	
"<feDistantLight/>"	TokenNameStringLiteral	<feDistantLight/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feDistantLightElementType	TokenNameIdentifier	 fe Distant Light Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDistantLightElementCategory	TokenNameIdentifier	 fe Distant Light Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feDistantLightElementDescription	TokenNameIdentifier	 fe Distant Light Element Description
=	TokenNameEQUAL	
"FeDistantLight"	TokenNameStringLiteral	FeDistantLight
;	TokenNameSEMICOLON	
// FeFlood element 	TokenNameCOMMENT_LINE	FeFlood element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFloodElementMemberName	TokenNameIdentifier	 fe Flood Element Member Name
=	TokenNameEQUAL	
"feFloodElement"	TokenNameStringLiteral	feFloodElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFloodElementName	TokenNameIdentifier	 fe Flood Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_FLOOD_TAG	TokenNameIdentifier	 SVG  FE  FLOOD  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFloodElementValue	TokenNameIdentifier	 fe Flood Element Value
=	TokenNameEQUAL	
"<feFlood/>"	TokenNameStringLiteral	<feFlood/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feFloodElementType	TokenNameIdentifier	 fe Flood Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFloodElementCategory	TokenNameIdentifier	 fe Flood Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFloodElementDescription	TokenNameIdentifier	 fe Flood Element Description
=	TokenNameEQUAL	
"FeFlood"	TokenNameStringLiteral	FeFlood
;	TokenNameSEMICOLON	
// FeFuncA element 	TokenNameCOMMENT_LINE	FeFuncA element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncAElementMemberName	TokenNameIdentifier	 fe Func A Element Member Name
=	TokenNameEQUAL	
"feFuncAElement"	TokenNameStringLiteral	feFuncAElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncAElementName	TokenNameIdentifier	 fe Func A Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_FUNC_A_TAG	TokenNameIdentifier	 SVG  FE  FUNC  A  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncAElementValue	TokenNameIdentifier	 fe Func A Element Value
=	TokenNameEQUAL	
"<feFuncA/>"	TokenNameStringLiteral	<feFuncA/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feFuncAElementType	TokenNameIdentifier	 fe Func A Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncAElementCategory	TokenNameIdentifier	 fe Func A Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncAElementDescription	TokenNameIdentifier	 fe Func A Element Description
=	TokenNameEQUAL	
"FeFuncA"	TokenNameStringLiteral	FeFuncA
;	TokenNameSEMICOLON	
// FeFuncB element 	TokenNameCOMMENT_LINE	FeFuncB element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncBElementMemberName	TokenNameIdentifier	 fe Func B Element Member Name
=	TokenNameEQUAL	
"feFuncBElement"	TokenNameStringLiteral	feFuncBElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncBElementName	TokenNameIdentifier	 fe Func B Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_FUNC_B_TAG	TokenNameIdentifier	 SVG  FE  FUNC  B  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncBElementValue	TokenNameIdentifier	 fe Func B Element Value
=	TokenNameEQUAL	
"<feFuncB/>"	TokenNameStringLiteral	<feFuncB/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feFuncBElementType	TokenNameIdentifier	 fe Func B Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncBElementCategory	TokenNameIdentifier	 fe Func B Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncBElementDescription	TokenNameIdentifier	 fe Func B Element Description
=	TokenNameEQUAL	
"FeFuncB"	TokenNameStringLiteral	FeFuncB
;	TokenNameSEMICOLON	
// FeFuncG element 	TokenNameCOMMENT_LINE	FeFuncG element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncGElementMemberName	TokenNameIdentifier	 fe Func G Element Member Name
=	TokenNameEQUAL	
"feFuncGElement"	TokenNameStringLiteral	feFuncGElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncGElementName	TokenNameIdentifier	 fe Func G Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_FUNC_G_TAG	TokenNameIdentifier	 SVG  FE  FUNC  G  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncGElementValue	TokenNameIdentifier	 fe Func G Element Value
=	TokenNameEQUAL	
"<feFuncG/>"	TokenNameStringLiteral	<feFuncG/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feFuncGElementType	TokenNameIdentifier	 fe Func G Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncGElementCategory	TokenNameIdentifier	 fe Func G Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncGElementDescription	TokenNameIdentifier	 fe Func G Element Description
=	TokenNameEQUAL	
"FeFuncG"	TokenNameStringLiteral	FeFuncG
;	TokenNameSEMICOLON	
// FeFuncR element 	TokenNameCOMMENT_LINE	FeFuncR element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncRElementMemberName	TokenNameIdentifier	 fe Func R Element Member Name
=	TokenNameEQUAL	
"feFuncRElement"	TokenNameStringLiteral	feFuncRElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncRElementName	TokenNameIdentifier	 fe Func R Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_FUNC_R_TAG	TokenNameIdentifier	 SVG  FE  FUNC  R  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncRElementValue	TokenNameIdentifier	 fe Func R Element Value
=	TokenNameEQUAL	
"<feFuncR/>"	TokenNameStringLiteral	<feFuncR/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feFuncRElementType	TokenNameIdentifier	 fe Func R Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncRElementCategory	TokenNameIdentifier	 fe Func R Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feFuncRElementDescription	TokenNameIdentifier	 fe Func R Element Description
=	TokenNameEQUAL	
"FeFuncR"	TokenNameStringLiteral	FeFuncR
;	TokenNameSEMICOLON	
// FeGaussianBlur element 	TokenNameCOMMENT_LINE	FeGaussianBlur element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feGaussianBlurElementMemberName	TokenNameIdentifier	 fe Gaussian Blur Element Member Name
=	TokenNameEQUAL	
"feGaussianBlurElement"	TokenNameStringLiteral	feGaussianBlurElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feGaussianBlurElementName	TokenNameIdentifier	 fe Gaussian Blur Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_GAUSSIAN_BLUR_TAG	TokenNameIdentifier	 SVG  FE  GAUSSIAN  BLUR  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feGaussianBlurElementValue	TokenNameIdentifier	 fe Gaussian Blur Element Value
=	TokenNameEQUAL	
"<feGaussianBlur/>"	TokenNameStringLiteral	<feGaussianBlur/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feGaussianBlurElementType	TokenNameIdentifier	 fe Gaussian Blur Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feGaussianBlurElementCategory	TokenNameIdentifier	 fe Gaussian Blur Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feGaussianBlurElementDescription	TokenNameIdentifier	 fe Gaussian Blur Element Description
=	TokenNameEQUAL	
"FeGaussianBlur"	TokenNameStringLiteral	FeGaussianBlur
;	TokenNameSEMICOLON	
// FeImage element 	TokenNameCOMMENT_LINE	FeImage element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feImageElementMemberName	TokenNameIdentifier	 fe Image Element Member Name
=	TokenNameEQUAL	
"feImageElement"	TokenNameStringLiteral	feImageElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feImageElementName	TokenNameIdentifier	 fe Image Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_IMAGE_TAG	TokenNameIdentifier	 SVG  FE  IMAGE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feImageElementValue	TokenNameIdentifier	 fe Image Element Value
=	TokenNameEQUAL	
"<feImage/>"	TokenNameStringLiteral	<feImage/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feImageElementType	TokenNameIdentifier	 fe Image Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feImageElementCategory	TokenNameIdentifier	 fe Image Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feImageElementDescription	TokenNameIdentifier	 fe Image Element Description
=	TokenNameEQUAL	
"FeImage"	TokenNameStringLiteral	FeImage
;	TokenNameSEMICOLON	
// FeMerge element 	TokenNameCOMMENT_LINE	FeMerge element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeElementMemberName	TokenNameIdentifier	 fe Merge Element Member Name
=	TokenNameEQUAL	
"feImageElement"	TokenNameStringLiteral	feImageElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeElementName	TokenNameIdentifier	 fe Merge Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_MERGE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeElementValue	TokenNameIdentifier	 fe Merge Element Value
=	TokenNameEQUAL	
"<feMerge/>"	TokenNameStringLiteral	<feMerge/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feMergeElementType	TokenNameIdentifier	 fe Merge Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeElementCategory	TokenNameIdentifier	 fe Merge Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeElementDescription	TokenNameIdentifier	 fe Merge Element Description
=	TokenNameEQUAL	
"FeMerge"	TokenNameStringLiteral	FeMerge
;	TokenNameSEMICOLON	
// FeMergeNode element 	TokenNameCOMMENT_LINE	FeMergeNode element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeNodeElementMemberName	TokenNameIdentifier	 fe Merge Node Element Member Name
=	TokenNameEQUAL	
"feMergeNodeElement"	TokenNameStringLiteral	feMergeNodeElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeNodeElementName	TokenNameIdentifier	 fe Merge Node Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_MERGE_NODE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  NODE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeNodeElementValue	TokenNameIdentifier	 fe Merge Node Element Value
=	TokenNameEQUAL	
"<feMergeNode/>"	TokenNameStringLiteral	<feMergeNode/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feMergeNodeElementType	TokenNameIdentifier	 fe Merge Node Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeNodeElementCategory	TokenNameIdentifier	 fe Merge Node Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMergeNodeElementDescription	TokenNameIdentifier	 fe Merge Node Element Description
=	TokenNameEQUAL	
"FeMergeNode"	TokenNameStringLiteral	FeMergeNode
;	TokenNameSEMICOLON	
// FeMorphology element 	TokenNameCOMMENT_LINE	FeMorphology element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMorphologyElementMemberName	TokenNameIdentifier	 fe Morphology Element Member Name
=	TokenNameEQUAL	
"feMorphologyElement"	TokenNameStringLiteral	feMorphologyElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMorphologyElementName	TokenNameIdentifier	 fe Morphology Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_MORPHOLOGY_TAG	TokenNameIdentifier	 SVG  FE  MORPHOLOGY  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMorphologyElementValue	TokenNameIdentifier	 fe Morphology Element Value
=	TokenNameEQUAL	
"<feMorphology/>"	TokenNameStringLiteral	<feMorphology/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feMorphologyElementType	TokenNameIdentifier	 fe Morphology Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMorphologyElementCategory	TokenNameIdentifier	 fe Morphology Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feMorphologyElementDescription	TokenNameIdentifier	 fe Morphology Element Description
=	TokenNameEQUAL	
"FeMorphology"	TokenNameStringLiteral	FeMorphology
;	TokenNameSEMICOLON	
// FeOffset element 	TokenNameCOMMENT_LINE	FeOffset element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feOffsetElementMemberName	TokenNameIdentifier	 fe Offset Element Member Name
=	TokenNameEQUAL	
"feMorphologyElement"	TokenNameStringLiteral	feMorphologyElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feOffsetElementName	TokenNameIdentifier	 fe Offset Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_OFFSET_TAG	TokenNameIdentifier	 SVG  FE  OFFSET  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feOffsetElementValue	TokenNameIdentifier	 fe Offset Element Value
=	TokenNameEQUAL	
"<feOffset/>"	TokenNameStringLiteral	<feOffset/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feOffsetElementType	TokenNameIdentifier	 fe Offset Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feOffsetElementCategory	TokenNameIdentifier	 fe Offset Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feOffsetElementDescription	TokenNameIdentifier	 fe Offset Element Description
=	TokenNameEQUAL	
"FeOffset"	TokenNameStringLiteral	FeOffset
;	TokenNameSEMICOLON	
// FePointLight element 	TokenNameCOMMENT_LINE	FePointLight element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fePointLightElementMemberName	TokenNameIdentifier	 fe Point Light Element Member Name
=	TokenNameEQUAL	
"fePointLightElement"	TokenNameStringLiteral	fePointLightElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fePointLightElementName	TokenNameIdentifier	 fe Point Light Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_POINT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  POINT  LIGHT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fePointLightElementValue	TokenNameIdentifier	 fe Point Light Element Value
=	TokenNameEQUAL	
"<fePointLight/>"	TokenNameStringLiteral	<fePointLight/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fePointLightElementType	TokenNameIdentifier	 fe Point Light Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fePointLightElementCategory	TokenNameIdentifier	 fe Point Light Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fePointLightElementDescription	TokenNameIdentifier	 fe Point Light Element Description
=	TokenNameEQUAL	
"FePointLight"	TokenNameStringLiteral	FePointLight
;	TokenNameSEMICOLON	
// FeSpecularLighting element 	TokenNameCOMMENT_LINE	FeSpecularLighting element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpecularLightingElementMemberName	TokenNameIdentifier	 fe Specular Lighting Element Member Name
=	TokenNameEQUAL	
"fePointLightElement"	TokenNameStringLiteral	fePointLightElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpecularLightingElementName	TokenNameIdentifier	 fe Specular Lighting Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_SPECULAR_LIGHTING_TAG	TokenNameIdentifier	 SVG  FE  SPECULAR  LIGHTING  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpecularLightingElementValue	TokenNameIdentifier	 fe Specular Lighting Element Value
=	TokenNameEQUAL	
"<feSpecularLighting/>"	TokenNameStringLiteral	<feSpecularLighting/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feSpecularLightingElementType	TokenNameIdentifier	 fe Specular Lighting Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpecularLightingElementCategory	TokenNameIdentifier	 fe Specular Lighting Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpecularLightingElementDescription	TokenNameIdentifier	 fe Specular Lighting Element Description
=	TokenNameEQUAL	
"FeSpecularLighting"	TokenNameStringLiteral	FeSpecularLighting
;	TokenNameSEMICOLON	
// FeSpotLight element 	TokenNameCOMMENT_LINE	FeSpotLight element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpotLightElementMemberName	TokenNameIdentifier	 fe Spot Light Element Member Name
=	TokenNameEQUAL	
"feSpotLightElement"	TokenNameStringLiteral	feSpotLightElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpotLightElementName	TokenNameIdentifier	 fe Spot Light Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_SPOT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpotLightElementValue	TokenNameIdentifier	 fe Spot Light Element Value
=	TokenNameEQUAL	
"<feSpotLight/>"	TokenNameStringLiteral	<feSpotLight/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feSpotLightElementType	TokenNameIdentifier	 fe Spot Light Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpotLightElementCategory	TokenNameIdentifier	 fe Spot Light Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feSpotLightElementDescription	TokenNameIdentifier	 fe Spot Light Element Description
=	TokenNameEQUAL	
"FeSpotLight"	TokenNameStringLiteral	FeSpotLight
;	TokenNameSEMICOLON	
// FeTile element 	TokenNameCOMMENT_LINE	FeTile element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTileElementMemberName	TokenNameIdentifier	 fe Tile Element Member Name
=	TokenNameEQUAL	
"feTileElement"	TokenNameStringLiteral	feTileElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTileElementName	TokenNameIdentifier	 fe Tile Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_TILE_TAG	TokenNameIdentifier	 SVG  FE  TILE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTileElementValue	TokenNameIdentifier	 fe Tile Element Value
=	TokenNameEQUAL	
"<feTile/>"	TokenNameStringLiteral	<feTile/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feTileElementType	TokenNameIdentifier	 fe Tile Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTileElementCategory	TokenNameIdentifier	 fe Tile Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTileElementDescription	TokenNameIdentifier	 fe Tile Element Description
=	TokenNameEQUAL	
"FeTile"	TokenNameStringLiteral	FeTile
;	TokenNameSEMICOLON	
// FeTurbulence element 	TokenNameCOMMENT_LINE	FeTurbulence element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTurbulenceElementMemberName	TokenNameIdentifier	 fe Turbulence Element Member Name
=	TokenNameEQUAL	
"feTurbulenceElement"	TokenNameStringLiteral	feTurbulenceElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTurbulenceElementName	TokenNameIdentifier	 fe Turbulence Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FE_TURBULENCE_TAG	TokenNameIdentifier	 SVG  FE  TURBULENCE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTurbulenceElementValue	TokenNameIdentifier	 fe Turbulence Element Value
=	TokenNameEQUAL	
"<feTurbulence/>"	TokenNameStringLiteral	<feTurbulence/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
feTurbulenceElementType	TokenNameIdentifier	 fe Turbulence Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTurbulenceElementCategory	TokenNameIdentifier	 fe Turbulence Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
feTurbulenceElementDescription	TokenNameIdentifier	 fe Turbulence Element Description
=	TokenNameEQUAL	
"FeTurbulence"	TokenNameStringLiteral	FeTurbulence
;	TokenNameSEMICOLON	
// Filter element 	TokenNameCOMMENT_LINE	Filter element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
filterElementMemberName	TokenNameIdentifier	 filter Element Member Name
=	TokenNameEQUAL	
"filterElement"	TokenNameStringLiteral	filterElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
filterElementName	TokenNameIdentifier	 filter Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FILTER_TAG	TokenNameIdentifier	 SVG  FILTER  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
filterElementValue	TokenNameIdentifier	 filter Element Value
=	TokenNameEQUAL	
"<filter/>"	TokenNameStringLiteral	<filter/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
filterElementType	TokenNameIdentifier	 filter Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
filterElementCategory	TokenNameIdentifier	 filter Element Category
=	TokenNameEQUAL	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
filterElementDescription	TokenNameIdentifier	 filter Element Description
=	TokenNameEQUAL	
"Filter"	TokenNameStringLiteral	Filter
;	TokenNameSEMICOLON	
// // Text node 	TokenNameCOMMENT_LINE	// Text node 
// public static String textNodeMemberName = "textNode"; 	TokenNameCOMMENT_LINE	public static String textNodeMemberName = "textNode"; 
// 	TokenNameCOMMENT_LINE	 
// public static String textNodeName = "textNode"; 	TokenNameCOMMENT_LINE	public static String textNodeName = "textNode"; 
// 	TokenNameCOMMENT_LINE	 
// public static String textNodeValue = " "; 	TokenNameCOMMENT_LINE	public static String textNodeValue = " "; 
// 	TokenNameCOMMENT_LINE	 
// public static short textNodeType = Node.TEXT_NODE; 	TokenNameCOMMENT_LINE	public static short textNodeType = Node.TEXT_NODE; 
// 	TokenNameCOMMENT_LINE	 
// public static String textNodeCategory = METADATA; 	TokenNameCOMMENT_LINE	public static String textNodeCategory = METADATA; 
// 	TokenNameCOMMENT_LINE	 
// public static String textNodeDescription = "Text node"; 	TokenNameCOMMENT_LINE	public static String textNodeDescription = "Text node"; 
// 	TokenNameCOMMENT_LINE	 
// // CDataSection node 	TokenNameCOMMENT_LINE	// CDataSection node 
// public static String cdataSectionNodeMemberName = "cdataSectionNode"; 	TokenNameCOMMENT_LINE	public static String cdataSectionNodeMemberName = "cdataSectionNode"; 
// 	TokenNameCOMMENT_LINE	 
// public static String cdataSectionNodeName = "cdataSectionNode"; 	TokenNameCOMMENT_LINE	public static String cdataSectionNodeName = "cdataSectionNode"; 
// 	TokenNameCOMMENT_LINE	 
// public static String cdataSectionNodeValue = " "; 	TokenNameCOMMENT_LINE	public static String cdataSectionNodeValue = " "; 
// 	TokenNameCOMMENT_LINE	 
// public static short cdataSectionNodeType = Node.CDATA_SECTION_NODE; 	TokenNameCOMMENT_LINE	public static short cdataSectionNodeType = Node.CDATA_SECTION_NODE; 
// 	TokenNameCOMMENT_LINE	 
// public static String cdataSectionNodeCategory = METADATA; 	TokenNameCOMMENT_LINE	public static String cdataSectionNodeCategory = METADATA; 
// 	TokenNameCOMMENT_LINE	 
// public static String cdataSectionNodeDescription = "CDataSection"; 	TokenNameCOMMENT_LINE	public static String cdataSectionNodeDescription = "CDataSection"; 
// 	TokenNameCOMMENT_LINE	 
// // Comment node 	TokenNameCOMMENT_LINE	// Comment node 
// public static String commentNodeMemberName = "commentNode"; 	TokenNameCOMMENT_LINE	public static String commentNodeMemberName = "commentNode"; 
// 	TokenNameCOMMENT_LINE	 
// public static String commentNodeName = "commentNode"; 	TokenNameCOMMENT_LINE	public static String commentNodeName = "commentNode"; 
// 	TokenNameCOMMENT_LINE	 
// public static String commentNodeValue = " "; 	TokenNameCOMMENT_LINE	public static String commentNodeValue = " "; 
// 	TokenNameCOMMENT_LINE	 
// public static short commentNodeType = Node.COMMENT_NODE; 	TokenNameCOMMENT_LINE	public static short commentNodeType = Node.COMMENT_NODE; 
// 	TokenNameCOMMENT_LINE	 
// public static String commentNodeCategory = METADATA; 	TokenNameCOMMENT_LINE	public static String commentNodeCategory = METADATA; 
// 	TokenNameCOMMENT_LINE	 
// public static String commentNodeDescription = "CommentNode"; 	TokenNameCOMMENT_LINE	public static String commentNodeDescription = "CommentNode"; 
// A element 	TokenNameCOMMENT_LINE	A element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
aElementMemberName	TokenNameIdentifier	 a Element Member Name
=	TokenNameEQUAL	
"aElement"	TokenNameStringLiteral	aElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
aElementName	TokenNameIdentifier	 a Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_A_TAG	TokenNameIdentifier	 SVG  A  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
aElementValue	TokenNameIdentifier	 a Element Value
=	TokenNameEQUAL	
"<a/>"	TokenNameStringLiteral	<a/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
aElementType	TokenNameIdentifier	 a Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
aElementCategory	TokenNameIdentifier	 a Element Category
=	TokenNameEQUAL	
LINKING	TokenNameIdentifier	 LINKING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
aElementDescription	TokenNameIdentifier	 a Element Description
=	TokenNameEQUAL	
"A"	TokenNameStringLiteral	A
;	TokenNameSEMICOLON	
// AltGlyph element 	TokenNameCOMMENT_LINE	AltGlyph element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphElementMemberName	TokenNameIdentifier	 alt Glyph Element Member Name
=	TokenNameEQUAL	
"altGlyphElement"	TokenNameStringLiteral	altGlyphElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphElementName	TokenNameIdentifier	 alt Glyph Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ALT_GLYPH_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphElementValue	TokenNameIdentifier	 alt Glyph Element Value
=	TokenNameEQUAL	
"<altGlyph/>"	TokenNameStringLiteral	<altGlyph/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
altGlyphElementType	TokenNameIdentifier	 alt Glyph Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphElementCategory	TokenNameIdentifier	 alt Glyph Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphElementDescription	TokenNameIdentifier	 alt Glyph Element Description
=	TokenNameEQUAL	
"AltGlyph"	TokenNameStringLiteral	AltGlyph
;	TokenNameSEMICOLON	
// AltGlyphDef element 	TokenNameCOMMENT_LINE	AltGlyphDef element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphDefElementMemberName	TokenNameIdentifier	 alt Glyph Def Element Member Name
=	TokenNameEQUAL	
"altGlyphDefElement"	TokenNameStringLiteral	altGlyphDefElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphDefElementName	TokenNameIdentifier	 alt Glyph Def Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ALT_GLYPH_DEF_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  DEF  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphDefElementValue	TokenNameIdentifier	 alt Glyph Def Element Value
=	TokenNameEQUAL	
"<altGlyphDef/>"	TokenNameStringLiteral	<altGlyphDef/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
altGlyphDefElementType	TokenNameIdentifier	 alt Glyph Def Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphDefElementCategory	TokenNameIdentifier	 alt Glyph Def Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphDefElementDescription	TokenNameIdentifier	 alt Glyph Def Element Description
=	TokenNameEQUAL	
"AltGlyphDef"	TokenNameStringLiteral	AltGlyphDef
;	TokenNameSEMICOLON	
// AltGlyphItem element 	TokenNameCOMMENT_LINE	AltGlyphItem element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphItemElementMemberName	TokenNameIdentifier	 alt Glyph Item Element Member Name
=	TokenNameEQUAL	
"altGlyphItemElement"	TokenNameStringLiteral	altGlyphItemElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphItemElementName	TokenNameIdentifier	 alt Glyph Item Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ALT_GLYPH_ITEM_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  ITEM  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphItemElementValue	TokenNameIdentifier	 alt Glyph Item Element Value
=	TokenNameEQUAL	
"<altGlyphItem/>"	TokenNameStringLiteral	<altGlyphItem/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
altGlyphItemElementType	TokenNameIdentifier	 alt Glyph Item Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphItemElementCategory	TokenNameIdentifier	 alt Glyph Item Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
altGlyphItemElementDescription	TokenNameIdentifier	 alt Glyph Item Element Description
=	TokenNameEQUAL	
"AltGlyphItem"	TokenNameStringLiteral	AltGlyphItem
;	TokenNameSEMICOLON	
// ClipPath element 	TokenNameCOMMENT_LINE	ClipPath element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
clipPathElementMemberName	TokenNameIdentifier	 clip Path Element Member Name
=	TokenNameEQUAL	
"clipPathElement"	TokenNameStringLiteral	clipPathElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
clipPathElementName	TokenNameIdentifier	 clip Path Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_CLIP_PATH_TAG	TokenNameIdentifier	 SVG  CLIP  PATH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
clipPathElementValue	TokenNameIdentifier	 clip Path Element Value
=	TokenNameEQUAL	
"<clipPath/>"	TokenNameStringLiteral	<clipPath/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
clipPathElementType	TokenNameIdentifier	 clip Path Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
clipPathElementCategory	TokenNameIdentifier	 clip Path Element Category
=	TokenNameEQUAL	
CLIP_MASK_COMPOSITE	TokenNameIdentifier	 CLIP  MASK  COMPOSITE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
clipPathElementDescription	TokenNameIdentifier	 clip Path Element Description
=	TokenNameEQUAL	
"ClipPath"	TokenNameStringLiteral	ClipPath
;	TokenNameSEMICOLON	
// ColorProfile element 	TokenNameCOMMENT_LINE	ColorProfile element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
colorProfileElementMemberName	TokenNameIdentifier	 color Profile Element Member Name
=	TokenNameEQUAL	
"colorProfileElement"	TokenNameStringLiteral	colorProfileElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
colorProfileElementName	TokenNameIdentifier	 color Profile Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_COLOR_PROFILE_TAG	TokenNameIdentifier	 SVG  COLOR  PROFILE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
colorProfileElementValue	TokenNameIdentifier	 color Profile Element Value
=	TokenNameEQUAL	
"<color-profile/>"	TokenNameStringLiteral	<color-profile/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
colorProfileElementType	TokenNameIdentifier	 color Profile Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
colorProfileElementCategory	TokenNameIdentifier	 color Profile Element Category
=	TokenNameEQUAL	
COLOR	TokenNameIdentifier	 COLOR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
colorProfileElementDescription	TokenNameIdentifier	 color Profile Element Description
=	TokenNameEQUAL	
"ColorProfile"	TokenNameStringLiteral	ColorProfile
;	TokenNameSEMICOLON	
// Cursor element 	TokenNameCOMMENT_LINE	Cursor element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cursorElementMemberName	TokenNameIdentifier	 cursor Element Member Name
=	TokenNameEQUAL	
"cursorElement"	TokenNameStringLiteral	cursorElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cursorElementName	TokenNameIdentifier	 cursor Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_CURSOR_TAG	TokenNameIdentifier	 SVG  CURSOR  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cursorElementValue	TokenNameIdentifier	 cursor Element Value
=	TokenNameEQUAL	
"<cursor/>"	TokenNameStringLiteral	<cursor/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
cursorElementType	TokenNameIdentifier	 cursor Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cursorElementCategory	TokenNameIdentifier	 cursor Element Category
=	TokenNameEQUAL	
INTERACTIVITY	TokenNameIdentifier	 INTERACTIVITY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cursorElementDescription	TokenNameIdentifier	 cursor Element Description
=	TokenNameEQUAL	
"Cursor"	TokenNameStringLiteral	Cursor
;	TokenNameSEMICOLON	
// DefinitionSrc element 	TokenNameCOMMENT_LINE	DefinitionSrc element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
definitionSrcElementMemberName	TokenNameIdentifier	 definition Src Element Member Name
=	TokenNameEQUAL	
"definitionSrcElement"	TokenNameStringLiteral	definitionSrcElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
definitionSrcElementName	TokenNameIdentifier	 definition Src Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_DEFINITION_SRC_TAG	TokenNameIdentifier	 SVG  DEFINITION  SRC  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
definitionSrcElementValue	TokenNameIdentifier	 definition Src Element Value
=	TokenNameEQUAL	
"<definition-src/>"	TokenNameStringLiteral	<definition-src/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
definitionSrcElementType	TokenNameIdentifier	 definition Src Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
definitionSrcElementCategory	TokenNameIdentifier	 definition Src Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
definitionSrcElementDescription	TokenNameIdentifier	 definition Src Element Description
=	TokenNameEQUAL	
"DefinitionSrc"	TokenNameStringLiteral	DefinitionSrc
;	TokenNameSEMICOLON	
// Defs element 	TokenNameCOMMENT_LINE	Defs element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defsElementMemberName	TokenNameIdentifier	 defs Element Member Name
=	TokenNameEQUAL	
"defsElement"	TokenNameStringLiteral	defsElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defsElementName	TokenNameIdentifier	 defs Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_DEFS_TAG	TokenNameIdentifier	 SVG  DEFS  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defsElementValue	TokenNameIdentifier	 defs Element Value
=	TokenNameEQUAL	
"<defs/>"	TokenNameStringLiteral	<defs/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
defsElementType	TokenNameIdentifier	 defs Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defsElementCategory	TokenNameIdentifier	 defs Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defsElementDescription	TokenNameIdentifier	 defs Element Description
=	TokenNameEQUAL	
"Defs"	TokenNameStringLiteral	Defs
;	TokenNameSEMICOLON	
// Desc element 	TokenNameCOMMENT_LINE	Desc element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
descElementMemberName	TokenNameIdentifier	 desc Element Member Name
=	TokenNameEQUAL	
"descElement"	TokenNameStringLiteral	descElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
descElementName	TokenNameIdentifier	 desc Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_DESC_TAG	TokenNameIdentifier	 SVG  DESC  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
descElementValue	TokenNameIdentifier	 desc Element Value
=	TokenNameEQUAL	
"<desc/>"	TokenNameStringLiteral	<desc/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
descElementType	TokenNameIdentifier	 desc Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
descElementCategory	TokenNameIdentifier	 desc Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
descElementDescription	TokenNameIdentifier	 desc Element Description
=	TokenNameEQUAL	
"Desc"	TokenNameStringLiteral	Desc
;	TokenNameSEMICOLON	
// ForeignObject element 	TokenNameCOMMENT_LINE	ForeignObject element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
foreignObjectElementMemberName	TokenNameIdentifier	 foreign Object Element Member Name
=	TokenNameEQUAL	
"foreignObjectElement"	TokenNameStringLiteral	foreignObjectElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
foreignObjectElementName	TokenNameIdentifier	 foreign Object Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FOREIGN_OBJECT_TAG	TokenNameIdentifier	 SVG  FOREIGN  OBJECT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
foreignObjectElementValue	TokenNameIdentifier	 foreign Object Element Value
=	TokenNameEQUAL	
"<foreignObject/>"	TokenNameStringLiteral	<foreignObject/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
foreignObjectElementType	TokenNameIdentifier	 foreign Object Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
foreignObjectElementCategory	TokenNameIdentifier	 foreign Object Element Category
=	TokenNameEQUAL	
EXTENSIBILITY	TokenNameIdentifier	 EXTENSIBILITY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
foreignObjectElementDescription	TokenNameIdentifier	 foreign Object Element Description
=	TokenNameEQUAL	
"ForeignObject"	TokenNameStringLiteral	ForeignObject
;	TokenNameSEMICOLON	
// Glyph element 	TokenNameCOMMENT_LINE	Glyph element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphElementMemberName	TokenNameIdentifier	 glyph Element Member Name
=	TokenNameEQUAL	
"glyphElement"	TokenNameStringLiteral	glyphElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphElementName	TokenNameIdentifier	 glyph Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphElementValue	TokenNameIdentifier	 glyph Element Value
=	TokenNameEQUAL	
"<glyph/>"	TokenNameStringLiteral	<glyph/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
glyphElementType	TokenNameIdentifier	 glyph Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphElementCategory	TokenNameIdentifier	 glyph Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphElementDescription	TokenNameIdentifier	 glyph Element Description
=	TokenNameEQUAL	
"Glyph"	TokenNameStringLiteral	Glyph
;	TokenNameSEMICOLON	
// GlyphRef element 	TokenNameCOMMENT_LINE	GlyphRef element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphRefElementMemberName	TokenNameIdentifier	 glyph Ref Element Member Name
=	TokenNameEQUAL	
"glyphRefElement"	TokenNameStringLiteral	glyphRefElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphRefElementName	TokenNameIdentifier	 glyph Ref Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_GLYPH_REF_TAG	TokenNameIdentifier	 SVG  GLYPH  REF  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphRefElementValue	TokenNameIdentifier	 glyph Ref Element Value
=	TokenNameEQUAL	
"<glyphRef/>"	TokenNameStringLiteral	<glyphRef/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
glyphRefElementType	TokenNameIdentifier	 glyph Ref Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphRefElementCategory	TokenNameIdentifier	 glyph Ref Element Category
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
glyphRefElementDescription	TokenNameIdentifier	 glyph Ref Element Description
=	TokenNameEQUAL	
"GlyphRef"	TokenNameStringLiteral	GlyphRef
;	TokenNameSEMICOLON	
// Hkern element 	TokenNameCOMMENT_LINE	Hkern element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
hkernElementMemberName	TokenNameIdentifier	 hkern Element Member Name
=	TokenNameEQUAL	
"hkernElement"	TokenNameStringLiteral	hkernElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
hkernElementName	TokenNameIdentifier	 hkern Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_HKERN_TAG	TokenNameIdentifier	 SVG  HKERN  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
hkernElementValue	TokenNameIdentifier	 hkern Element Value
=	TokenNameEQUAL	
"<hkern/>"	TokenNameStringLiteral	<hkern/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
hkernElementType	TokenNameIdentifier	 hkern Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
hkernElementCategory	TokenNameIdentifier	 hkern Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
hkernElementDescription	TokenNameIdentifier	 hkern Element Description
=	TokenNameEQUAL	
"Hkern"	TokenNameStringLiteral	Hkern
;	TokenNameSEMICOLON	
// LinearGradient element 	TokenNameCOMMENT_LINE	LinearGradient element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
linearGradientElementMemberName	TokenNameIdentifier	 linear Gradient Element Member Name
=	TokenNameEQUAL	
"linearGradientElement"	TokenNameStringLiteral	linearGradientElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
linearGradientElementName	TokenNameIdentifier	 linear Gradient Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_LINEAR_GRADIENT_TAG	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
linearGradientElementValue	TokenNameIdentifier	 linear Gradient Element Value
=	TokenNameEQUAL	
"<linearGradient/>"	TokenNameStringLiteral	<linearGradient/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
linearGradientElementType	TokenNameIdentifier	 linear Gradient Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
linearGradientElementCategory	TokenNameIdentifier	 linear Gradient Element Category
=	TokenNameEQUAL	
GRADIENTS_AND_PATTERNS	TokenNameIdentifier	 GRADIENTS  AND  PATTERNS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
linearGradientElementDescription	TokenNameIdentifier	 linear Gradient Element Description
=	TokenNameEQUAL	
"LinearGradient"	TokenNameStringLiteral	LinearGradient
;	TokenNameSEMICOLON	
// Marker element 	TokenNameCOMMENT_LINE	Marker element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
markerElementMemberName	TokenNameIdentifier	 marker Element Member Name
=	TokenNameEQUAL	
"markerElement"	TokenNameStringLiteral	markerElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
markerElementName	TokenNameIdentifier	 marker Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_MARKER_TAG	TokenNameIdentifier	 SVG  MARKER  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
markerElementValue	TokenNameIdentifier	 marker Element Value
=	TokenNameEQUAL	
"<marker/>"	TokenNameStringLiteral	<marker/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
markerElementType	TokenNameIdentifier	 marker Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
markerElementCategory	TokenNameIdentifier	 marker Element Category
=	TokenNameEQUAL	
PAINTING	TokenNameIdentifier	 PAINTING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
markerElementDescription	TokenNameIdentifier	 marker Element Description
=	TokenNameEQUAL	
"Marker"	TokenNameStringLiteral	Marker
;	TokenNameSEMICOLON	
// Mask element 	TokenNameCOMMENT_LINE	Mask element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
maskElementMemberName	TokenNameIdentifier	 mask Element Member Name
=	TokenNameEQUAL	
"maskElement"	TokenNameStringLiteral	maskElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
maskElementName	TokenNameIdentifier	 mask Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_MASK_TAG	TokenNameIdentifier	 SVG  MASK  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
maskElementValue	TokenNameIdentifier	 mask Element Value
=	TokenNameEQUAL	
"<mask/>"	TokenNameStringLiteral	<mask/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
maskElementType	TokenNameIdentifier	 mask Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
maskElementCategory	TokenNameIdentifier	 mask Element Category
=	TokenNameEQUAL	
CLIP_MASK_COMPOSITE	TokenNameIdentifier	 CLIP  MASK  COMPOSITE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
maskElementDescription	TokenNameIdentifier	 mask Element Description
=	TokenNameEQUAL	
"Mask"	TokenNameStringLiteral	Mask
;	TokenNameSEMICOLON	
// Metadata element 	TokenNameCOMMENT_LINE	Metadata element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
metadataElementMemberName	TokenNameIdentifier	 metadata Element Member Name
=	TokenNameEQUAL	
"metadataElement"	TokenNameStringLiteral	metadataElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
metadataElementName	TokenNameIdentifier	 metadata Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_METADATA_TAG	TokenNameIdentifier	 SVG  METADATA  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
metadataElementValue	TokenNameIdentifier	 metadata Element Value
=	TokenNameEQUAL	
"<metadata/>"	TokenNameStringLiteral	<metadata/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
metadataElementType	TokenNameIdentifier	 metadata Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
metadataElementCategory	TokenNameIdentifier	 metadata Element Category
=	TokenNameEQUAL	
METADATA	TokenNameIdentifier	 METADATA
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
metadataElementDescription	TokenNameIdentifier	 metadata Element Description
=	TokenNameEQUAL	
"Metadata"	TokenNameStringLiteral	Metadata
;	TokenNameSEMICOLON	
// MissingGlyph element 	TokenNameCOMMENT_LINE	MissingGlyph element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
missingGlyphElementMemberName	TokenNameIdentifier	 missing Glyph Element Member Name
=	TokenNameEQUAL	
"missingGlyphElement"	TokenNameStringLiteral	missingGlyphElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
missingGlyphElementName	TokenNameIdentifier	 missing Glyph Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_MISSING_GLYPH_TAG	TokenNameIdentifier	 SVG  MISSING  GLYPH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
missingGlyphElementValue	TokenNameIdentifier	 missing Glyph Element Value
=	TokenNameEQUAL	
"<missing-glyph/>"	TokenNameStringLiteral	<missing-glyph/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
missingGlyphElementType	TokenNameIdentifier	 missing Glyph Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
missingGlyphElementCategory	TokenNameIdentifier	 missing Glyph Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
missingGlyphElementDescription	TokenNameIdentifier	 missing Glyph Element Description
=	TokenNameEQUAL	
"MissingGlyph"	TokenNameStringLiteral	MissingGlyph
;	TokenNameSEMICOLON	
// Mpath element 	TokenNameCOMMENT_LINE	Mpath element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
mpathElementMemberName	TokenNameIdentifier	 mpath Element Member Name
=	TokenNameEQUAL	
"mpathElement"	TokenNameStringLiteral	mpathElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
mpathElementName	TokenNameIdentifier	 mpath Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_MPATH_TAG	TokenNameIdentifier	 SVG  MPATH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
mpathElementValue	TokenNameIdentifier	 mpath Element Value
=	TokenNameEQUAL	
"<mpath/>"	TokenNameStringLiteral	<mpath/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
mpathElementType	TokenNameIdentifier	 mpath Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
mpathElementCategory	TokenNameIdentifier	 mpath Element Category
=	TokenNameEQUAL	
ANIMATION	TokenNameIdentifier	 ANIMATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
mpathElementDescription	TokenNameIdentifier	 mpath Element Description
=	TokenNameEQUAL	
"Mpath"	TokenNameStringLiteral	Mpath
;	TokenNameSEMICOLON	
// Pattern element 	TokenNameCOMMENT_LINE	Pattern element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
patternElementMemberName	TokenNameIdentifier	 pattern Element Member Name
=	TokenNameEQUAL	
"patternElement"	TokenNameStringLiteral	patternElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
patternElementName	TokenNameIdentifier	 pattern Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_PATTERN_TAG	TokenNameIdentifier	 SVG  PATTERN  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
patternElementValue	TokenNameIdentifier	 pattern Element Value
=	TokenNameEQUAL	
"<pattern/>"	TokenNameStringLiteral	<pattern/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
patternElementType	TokenNameIdentifier	 pattern Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
patternElementCategory	TokenNameIdentifier	 pattern Element Category
=	TokenNameEQUAL	
GRADIENTS_AND_PATTERNS	TokenNameIdentifier	 GRADIENTS  AND  PATTERNS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
patternElementDescription	TokenNameIdentifier	 pattern Element Description
=	TokenNameEQUAL	
"Pattern"	TokenNameStringLiteral	Pattern
;	TokenNameSEMICOLON	
// RadialGradient element 	TokenNameCOMMENT_LINE	RadialGradient element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
radialGradientElementMemberName	TokenNameIdentifier	 radial Gradient Element Member Name
=	TokenNameEQUAL	
"radialGradientElement"	TokenNameStringLiteral	radialGradientElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
radialGradientElementName	TokenNameIdentifier	 radial Gradient Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_RADIAL_GRADIENT_TAG	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
radialGradientElementValue	TokenNameIdentifier	 radial Gradient Element Value
=	TokenNameEQUAL	
"<radialGradient/>"	TokenNameStringLiteral	<radialGradient/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
radialGradientElementType	TokenNameIdentifier	 radial Gradient Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
radialGradientElementCategory	TokenNameIdentifier	 radial Gradient Element Category
=	TokenNameEQUAL	
GRADIENTS_AND_PATTERNS	TokenNameIdentifier	 GRADIENTS  AND  PATTERNS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
radialGradientElementDescription	TokenNameIdentifier	 radial Gradient Element Description
=	TokenNameEQUAL	
"RadialGradient"	TokenNameStringLiteral	RadialGradient
;	TokenNameSEMICOLON	
// Script element 	TokenNameCOMMENT_LINE	Script element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
scriptElementMemberName	TokenNameIdentifier	 script Element Member Name
=	TokenNameEQUAL	
"scriptElement"	TokenNameStringLiteral	scriptElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
scriptElementName	TokenNameIdentifier	 script Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SCRIPT_TAG	TokenNameIdentifier	 SVG  SCRIPT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
scriptElementValue	TokenNameIdentifier	 script Element Value
=	TokenNameEQUAL	
"<script/>"	TokenNameStringLiteral	<script/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
scriptElementType	TokenNameIdentifier	 script Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
scriptElementCategory	TokenNameIdentifier	 script Element Category
=	TokenNameEQUAL	
SCRIPTING	TokenNameIdentifier	 SCRIPTING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
scriptElementDescription	TokenNameIdentifier	 script Element Description
=	TokenNameEQUAL	
"script"	TokenNameStringLiteral	script
;	TokenNameSEMICOLON	
// Set element 	TokenNameCOMMENT_LINE	Set element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
setElementMemberName	TokenNameIdentifier	 set Element Member Name
=	TokenNameEQUAL	
"setElement"	TokenNameStringLiteral	setElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
setElementName	TokenNameIdentifier	 set Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SET_TAG	TokenNameIdentifier	 SVG  SET  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
setElementValue	TokenNameIdentifier	 set Element Value
=	TokenNameEQUAL	
"<set attributeName="fill" from="white" to="black" dur="1s"/>"	TokenNameStringLiteral	<set attributeName="fill" from="white" to="black" dur="1s"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
setElementType	TokenNameIdentifier	 set Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
setElementCategory	TokenNameIdentifier	 set Element Category
=	TokenNameEQUAL	
ANIMATION	TokenNameIdentifier	 ANIMATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
setElementDescription	TokenNameIdentifier	 set Element Description
=	TokenNameEQUAL	
"set"	TokenNameStringLiteral	set
;	TokenNameSEMICOLON	
// Stop element 	TokenNameCOMMENT_LINE	Stop element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stopElementMemberName	TokenNameIdentifier	 stop Element Member Name
=	TokenNameEQUAL	
"stopElement"	TokenNameStringLiteral	stopElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stopElementName	TokenNameIdentifier	 stop Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_STOP_TAG	TokenNameIdentifier	 SVG  STOP  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stopElementValue	TokenNameIdentifier	 stop Element Value
=	TokenNameEQUAL	
"<stop/>"	TokenNameStringLiteral	<stop/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
stopElementType	TokenNameIdentifier	 stop Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stopElementCategory	TokenNameIdentifier	 stop Element Category
=	TokenNameEQUAL	
GRADIENTS_AND_PATTERNS	TokenNameIdentifier	 GRADIENTS  AND  PATTERNS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stopElementDescription	TokenNameIdentifier	 stop Element Description
=	TokenNameEQUAL	
"Stop"	TokenNameStringLiteral	Stop
;	TokenNameSEMICOLON	
// Style element 	TokenNameCOMMENT_LINE	Style element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
styleElementMemberName	TokenNameIdentifier	 style Element Member Name
=	TokenNameEQUAL	
"styleElement"	TokenNameStringLiteral	styleElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
styleElementName	TokenNameIdentifier	 style Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_STYLE_TAG	TokenNameIdentifier	 SVG  STYLE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
styleElementValue	TokenNameIdentifier	 style Element Value
=	TokenNameEQUAL	
"<style/>"	TokenNameStringLiteral	<style/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
styleElementType	TokenNameIdentifier	 style Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
styleElementCategory	TokenNameIdentifier	 style Element Category
=	TokenNameEQUAL	
STYLING	TokenNameIdentifier	 STYLING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
styleElementDescription	TokenNameIdentifier	 style Element Description
=	TokenNameEQUAL	
"Style"	TokenNameStringLiteral	Style
;	TokenNameSEMICOLON	
// Switch element 	TokenNameCOMMENT_LINE	Switch element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
switchElementMemberName	TokenNameIdentifier	 switch Element Member Name
=	TokenNameEQUAL	
"switchElement"	TokenNameStringLiteral	switchElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
switchElementName	TokenNameIdentifier	 switch Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SWITCH_TAG	TokenNameIdentifier	 SVG  SWITCH  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
switchElementValue	TokenNameIdentifier	 switch Element Value
=	TokenNameEQUAL	
"<switch/>"	TokenNameStringLiteral	<switch/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
switchElementType	TokenNameIdentifier	 switch Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
switchElementCategory	TokenNameIdentifier	 switch Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
switchElementDescription	TokenNameIdentifier	 switch Element Description
=	TokenNameEQUAL	
"Switch"	TokenNameStringLiteral	Switch
;	TokenNameSEMICOLON	
// Symbol element 	TokenNameCOMMENT_LINE	Symbol element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
symbolElementMemberName	TokenNameIdentifier	 symbol Element Member Name
=	TokenNameEQUAL	
"symbolElement"	TokenNameStringLiteral	symbolElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
symbolElementName	TokenNameIdentifier	 symbol Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SYMBOL_TAG	TokenNameIdentifier	 SVG  SYMBOL  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
symbolElementValue	TokenNameIdentifier	 symbol Element Value
=	TokenNameEQUAL	
"<symbol/>"	TokenNameStringLiteral	<symbol/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
symbolElementType	TokenNameIdentifier	 symbol Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
symbolElementCategory	TokenNameIdentifier	 symbol Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
symbolElementDescription	TokenNameIdentifier	 symbol Element Description
=	TokenNameEQUAL	
"Symbol"	TokenNameStringLiteral	Symbol
;	TokenNameSEMICOLON	
// Title element 	TokenNameCOMMENT_LINE	Title element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
titleElementMemberName	TokenNameIdentifier	 title Element Member Name
=	TokenNameEQUAL	
"titleElement"	TokenNameStringLiteral	titleElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
titleElementName	TokenNameIdentifier	 title Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_TITLE_TAG	TokenNameIdentifier	 SVG  TITLE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
titleElementValue	TokenNameIdentifier	 title Element Value
=	TokenNameEQUAL	
"<title/>"	TokenNameStringLiteral	<title/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
titleElementType	TokenNameIdentifier	 title Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
titleElementCategory	TokenNameIdentifier	 title Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
titleElementDescription	TokenNameIdentifier	 title Element Description
=	TokenNameEQUAL	
"Title"	TokenNameStringLiteral	Title
;	TokenNameSEMICOLON	
// Use element 	TokenNameCOMMENT_LINE	Use element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
useElementMemberName	TokenNameIdentifier	 use Element Member Name
=	TokenNameEQUAL	
"useElement"	TokenNameStringLiteral	useElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
useElementName	TokenNameIdentifier	 use Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_USE_TAG	TokenNameIdentifier	 SVG  USE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
useElementValue	TokenNameIdentifier	 use Element Value
=	TokenNameEQUAL	
"<use/>"	TokenNameStringLiteral	<use/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
useElementType	TokenNameIdentifier	 use Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
useElementCategory	TokenNameIdentifier	 use Element Category
=	TokenNameEQUAL	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
useElementDescription	TokenNameIdentifier	 use Element Description
=	TokenNameEQUAL	
"Use"	TokenNameStringLiteral	Use
;	TokenNameSEMICOLON	
// View element 	TokenNameCOMMENT_LINE	View element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
viewElementMemberName	TokenNameIdentifier	 view Element Member Name
=	TokenNameEQUAL	
"viewElement"	TokenNameStringLiteral	viewElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
viewElementName	TokenNameIdentifier	 view Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_VIEW_TAG	TokenNameIdentifier	 SVG  VIEW  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
viewElementValue	TokenNameIdentifier	 view Element Value
=	TokenNameEQUAL	
"<view/>"	TokenNameStringLiteral	<view/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
viewElementType	TokenNameIdentifier	 view Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
viewElementCategory	TokenNameIdentifier	 view Element Category
=	TokenNameEQUAL	
LINKING	TokenNameIdentifier	 LINKING
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
viewElementDescription	TokenNameIdentifier	 view Element Description
=	TokenNameEQUAL	
"View"	TokenNameStringLiteral	View
;	TokenNameSEMICOLON	
// Vkern element 	TokenNameCOMMENT_LINE	Vkern element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
vkernElementMemberName	TokenNameIdentifier	 vkern Element Member Name
=	TokenNameEQUAL	
"vkernElement"	TokenNameStringLiteral	vkernElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
vkernElementName	TokenNameIdentifier	 vkern Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_VKERN_TAG	TokenNameIdentifier	 SVG  VKERN  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
vkernElementValue	TokenNameIdentifier	 vkern Element Value
=	TokenNameEQUAL	
"<vkern/>"	TokenNameStringLiteral	<vkern/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
vkernElementType	TokenNameIdentifier	 vkern Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
vkernElementCategory	TokenNameIdentifier	 vkern Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
vkernElementDescription	TokenNameIdentifier	 vkern Element Description
=	TokenNameEQUAL	
"Vkern"	TokenNameStringLiteral	Vkern
;	TokenNameSEMICOLON	
// Font element 	TokenNameCOMMENT_LINE	Font element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontElementMemberName	TokenNameIdentifier	 font Element Member Name
=	TokenNameEQUAL	
"fontElement"	TokenNameStringLiteral	fontElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontElementName	TokenNameIdentifier	 font Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FONT_TAG	TokenNameIdentifier	 SVG  FONT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontElementValue	TokenNameIdentifier	 font Element Value
=	TokenNameEQUAL	
"<font/>"	TokenNameStringLiteral	<font/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fontElementType	TokenNameIdentifier	 font Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontElementCategory	TokenNameIdentifier	 font Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontElementDescription	TokenNameIdentifier	 font Element Description
=	TokenNameEQUAL	
"Font"	TokenNameStringLiteral	Font
;	TokenNameSEMICOLON	
// FontFace element 	TokenNameCOMMENT_LINE	FontFace element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceElementMemberName	TokenNameIdentifier	 font Face Element Member Name
=	TokenNameEQUAL	
"fontFaceElement"	TokenNameStringLiteral	fontFaceElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceElementName	TokenNameIdentifier	 font Face Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceElementValue	TokenNameIdentifier	 font Face Element Value
=	TokenNameEQUAL	
"<font-face/>"	TokenNameStringLiteral	<font-face/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fontFaceElementType	TokenNameIdentifier	 font Face Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceElementCategory	TokenNameIdentifier	 font Face Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceElementDescription	TokenNameIdentifier	 font Face Element Description
=	TokenNameEQUAL	
"FontFace"	TokenNameStringLiteral	FontFace
;	TokenNameSEMICOLON	
// FontFaceFormat element 	TokenNameCOMMENT_LINE	FontFaceFormat element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceFormatElementMemberName	TokenNameIdentifier	 font Face Format Element Member Name
=	TokenNameEQUAL	
"fontFaceFormatElement"	TokenNameStringLiteral	fontFaceFormatElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceFormatElementName	TokenNameIdentifier	 font Face Format Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FONT_FACE_FORMAT_TAG	TokenNameIdentifier	 SVG  FONT  FACE  FORMAT  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceFormatElementValue	TokenNameIdentifier	 font Face Format Element Value
=	TokenNameEQUAL	
"<font-face-format/>"	TokenNameStringLiteral	<font-face-format/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fontFaceFormatElementType	TokenNameIdentifier	 font Face Format Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceFormatElementCategory	TokenNameIdentifier	 font Face Format Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceFormatElementDescription	TokenNameIdentifier	 font Face Format Element Description
=	TokenNameEQUAL	
"FontFaceFormat"	TokenNameStringLiteral	FontFaceFormat
;	TokenNameSEMICOLON	
// FontFaceName element 	TokenNameCOMMENT_LINE	FontFaceName element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceNameElementMemberName	TokenNameIdentifier	 font Face Name Element Member Name
=	TokenNameEQUAL	
"fontFaceNameElement"	TokenNameStringLiteral	fontFaceNameElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceNameElementName	TokenNameIdentifier	 font Face Name Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FONT_FACE_NAME_TAG	TokenNameIdentifier	 SVG  FONT  FACE  NAME  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceNameElementValue	TokenNameIdentifier	 font Face Name Element Value
=	TokenNameEQUAL	
"<font-face-name/>"	TokenNameStringLiteral	<font-face-name/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fontFaceNameElementType	TokenNameIdentifier	 font Face Name Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceNameElementCategory	TokenNameIdentifier	 font Face Name Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceNameElementDescription	TokenNameIdentifier	 font Face Name Element Description
=	TokenNameEQUAL	
"FontFaceName"	TokenNameStringLiteral	FontFaceName
;	TokenNameSEMICOLON	
// FontFaceSrc element 	TokenNameCOMMENT_LINE	FontFaceSrc element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceSrcElementMemberName	TokenNameIdentifier	 font Face Src Element Member Name
=	TokenNameEQUAL	
"fontFaceSrcElement"	TokenNameStringLiteral	fontFaceSrcElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceSrcElementName	TokenNameIdentifier	 font Face Src Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FONT_FACE_SRC_TAG	TokenNameIdentifier	 SVG  FONT  FACE  SRC  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceSrcElementValue	TokenNameIdentifier	 font Face Src Element Value
=	TokenNameEQUAL	
"<font-face-src/>"	TokenNameStringLiteral	<font-face-src/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fontFaceSrcElementType	TokenNameIdentifier	 font Face Src Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceSrcElementCategory	TokenNameIdentifier	 font Face Src Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceSrcElementDescription	TokenNameIdentifier	 font Face Src Element Description
=	TokenNameEQUAL	
"FontFaceSrc"	TokenNameStringLiteral	FontFaceSrc
;	TokenNameSEMICOLON	
// FontFaceUri element 	TokenNameCOMMENT_LINE	FontFaceUri element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceUriElementMemberName	TokenNameIdentifier	 font Face Uri Element Member Name
=	TokenNameEQUAL	
"fontFaceUriElement"	TokenNameStringLiteral	fontFaceUriElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceUriElementName	TokenNameIdentifier	 font Face Uri Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_FONT_FACE_URI_TAG	TokenNameIdentifier	 SVG  FONT  FACE  URI  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceUriElementValue	TokenNameIdentifier	 font Face Uri Element Value
=	TokenNameEQUAL	
"<font-face-uri/>"	TokenNameStringLiteral	<font-face-uri/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
fontFaceUriElementType	TokenNameIdentifier	 font Face Uri Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceUriElementCategory	TokenNameIdentifier	 font Face Uri Element Category
=	TokenNameEQUAL	
FONTS	TokenNameIdentifier	 FONTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fontFaceUriElementDescription	TokenNameIdentifier	 font Face Uri Element Description
=	TokenNameEQUAL	
"FontFaceUri"	TokenNameStringLiteral	FontFaceUri
;	TokenNameSEMICOLON	
// Animate element 	TokenNameCOMMENT_LINE	Animate element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateElementMemberName	TokenNameIdentifier	 animate Element Member Name
=	TokenNameEQUAL	
"fontFaceUriElement"	TokenNameStringLiteral	fontFaceUriElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateElementName	TokenNameIdentifier	 animate Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ANIMATE_TAG	TokenNameIdentifier	 SVG  ANIMATE  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateElementValue	TokenNameIdentifier	 animate Element Value
=	TokenNameEQUAL	
"<animate attributeName="fill" from="white" to="black" dur="1s"/>"	TokenNameStringLiteral	<animate attributeName="fill" from="white" to="black" dur="1s"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
animateElementType	TokenNameIdentifier	 animate Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateElementCategory	TokenNameIdentifier	 animate Element Category
=	TokenNameEQUAL	
ANIMATION	TokenNameIdentifier	 ANIMATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateElementDescription	TokenNameIdentifier	 animate Element Description
=	TokenNameEQUAL	
"Animate"	TokenNameStringLiteral	Animate
;	TokenNameSEMICOLON	
// AnimateColor element 	TokenNameCOMMENT_LINE	AnimateColor element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateColorElementMemberName	TokenNameIdentifier	 animate Color Element Member Name
=	TokenNameEQUAL	
"animateColorElement"	TokenNameStringLiteral	animateColorElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateColorElementName	TokenNameIdentifier	 animate Color Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ANIMATE_COLOR_TAG	TokenNameIdentifier	 SVG  ANIMATE  COLOR  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateColorElementValue	TokenNameIdentifier	 animate Color Element Value
=	TokenNameEQUAL	
"<animateColor attributeName="fill" from="white" to="black" dur="1s"/>"	TokenNameStringLiteral	<animateColor attributeName="fill" from="white" to="black" dur="1s"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
animateColorElementType	TokenNameIdentifier	 animate Color Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateColorElementCategory	TokenNameIdentifier	 animate Color Element Category
=	TokenNameEQUAL	
ANIMATION	TokenNameIdentifier	 ANIMATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateColorElementDescription	TokenNameIdentifier	 animate Color Element Description
=	TokenNameEQUAL	
"AnimateColor"	TokenNameStringLiteral	AnimateColor
;	TokenNameSEMICOLON	
// AnimateMotion element 	TokenNameCOMMENT_LINE	AnimateMotion element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateMotionElementMemberName	TokenNameIdentifier	 animate Motion Element Member Name
=	TokenNameEQUAL	
"animateMotionElement"	TokenNameStringLiteral	animateMotionElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateMotionElementName	TokenNameIdentifier	 animate Motion Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ANIMATE_MOTION_TAG	TokenNameIdentifier	 SVG  ANIMATE  MOTION  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateMotionElementValue	TokenNameIdentifier	 animate Motion Element Value
=	TokenNameEQUAL	
"<animateMotion dur="1s" path="M0,0"/>"	TokenNameStringLiteral	<animateMotion dur="1s" path="M0,0"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
animateMotionElementType	TokenNameIdentifier	 animate Motion Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateMotionElementCategory	TokenNameIdentifier	 animate Motion Element Category
=	TokenNameEQUAL	
ANIMATION	TokenNameIdentifier	 ANIMATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateMotionElementDescription	TokenNameIdentifier	 animate Motion Element Description
=	TokenNameEQUAL	
"AnimateMotion"	TokenNameStringLiteral	AnimateMotion
;	TokenNameSEMICOLON	
// AnimateTransform element 	TokenNameCOMMENT_LINE	AnimateTransform element 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateTransformElementMemberName	TokenNameIdentifier	 animate Transform Element Member Name
=	TokenNameEQUAL	
"animateTransformElement"	TokenNameStringLiteral	animateTransformElement
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateTransformElementName	TokenNameIdentifier	 animate Transform Element Name
=	TokenNameEQUAL	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ANIMATE_TRANSFORM_TAG	TokenNameIdentifier	 SVG  ANIMATE  TRANSFORM  TAG
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateTransformElementValue	TokenNameIdentifier	 animate Transform Element Value
=	TokenNameEQUAL	
"<animateTransform attributeName="transform" type="rotate" from="0" to="0" dur="1s"/>"	TokenNameStringLiteral	<animateTransform attributeName="transform" type="rotate" from="0" to="0" dur="1s"/>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
animateTransformElementType	TokenNameIdentifier	 animate Transform Element Type
=	TokenNameEQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateTransformElementCategory	TokenNameIdentifier	 animate Transform Element Category
=	TokenNameEQUAL	
ANIMATION	TokenNameIdentifier	 ANIMATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
animateTransformElementDescription	TokenNameIdentifier	 animate Transform Element Description
=	TokenNameEQUAL	
"AnimateTransform"	TokenNameStringLiteral	AnimateTransform
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
NodeTemplates	TokenNameIdentifier	 Node Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Initialize categories 	TokenNameCOMMENT_LINE	Initialize categories 
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
DOCUMENT_STRUCTURE	TokenNameIdentifier	 DOCUMENT  STRUCTURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
STYLING	TokenNameIdentifier	 STYLING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
PATHS	TokenNameIdentifier	 PATHS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BASIC_SHAPES	TokenNameIdentifier	 BASIC  SHAPES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
PAINTING	TokenNameIdentifier	 PAINTING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
COLOR	TokenNameIdentifier	 COLOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
GRADIENTS_AND_PATTERNS	TokenNameIdentifier	 GRADIENTS  AND  PATTERNS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CLIP_MASK_COMPOSITE	TokenNameIdentifier	 CLIP  MASK  COMPOSITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FILTER_EFFECTS	TokenNameIdentifier	 FILTER  EFFECTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
INTERACTIVITY	TokenNameIdentifier	 INTERACTIVITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
LINKING	TokenNameIdentifier	 LINKING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SCRIPTING	TokenNameIdentifier	 SCRIPTING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ANIMATION	TokenNameIdentifier	 ANIMATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FONTS	TokenNameIdentifier	 FONTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
METADATA	TokenNameIdentifier	 METADATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
categoriesList	TokenNameIdentifier	 categories List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
EXTENSIBILITY	TokenNameIdentifier	 EXTENSIBILITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Initialize templates 	TokenNameCOMMENT_LINE	Initialize templates 
initializeTemplates	TokenNameIdentifier	 initialize Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes node templates. */	TokenNameCOMMENT_JAVADOC	 Initializes node templates. 
private	TokenNameprivate	
void	TokenNamevoid	
initializeTemplates	TokenNameIdentifier	 initialize Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaredFields	TokenNameIdentifier	 get Declared Fields
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
currentField	TokenNameIdentifier	 current Field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentField	TokenNameIdentifier	 current Field
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
&&	TokenNameAND_AND	
currentField	TokenNameIdentifier	 current Field
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"MemberName"	TokenNameStringLiteral	MemberName
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isAccessible	TokenNameIdentifier	 is Accessible
=	TokenNameEQUAL	
currentField	TokenNameIdentifier	 current Field
.	TokenNameDOT	
isAccessible	TokenNameIdentifier	 is Accessible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentField	TokenNameIdentifier	 current Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseFieldName	TokenNameIdentifier	 base Field Name
=	TokenNameEQUAL	
currentField	TokenNameIdentifier	 current Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeValue	TokenNameIdentifier	 node Value
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
baseFieldName	TokenNameIdentifier	 base Field Name
+	TokenNamePLUS	
VALUE	TokenNameIdentifier	 VALUE
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
baseFieldName	TokenNameIdentifier	 base Field Name
+	TokenNamePLUS	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Short	TokenNameIdentifier	 Short
)	TokenNameRPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
baseFieldName	TokenNameIdentifier	 base Field Name
+	TokenNamePLUS	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
shortValue	TokenNameIdentifier	 short Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeDescription	TokenNameIdentifier	 node Description
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
baseFieldName	TokenNameIdentifier	 base Field Name
+	TokenNamePLUS	
DESCRIPTION	TokenNameIdentifier	 DESCRIPTION
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeCategory	TokenNameIdentifier	 node Category
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
baseFieldName	TokenNameIdentifier	 base Field Name
+	TokenNamePLUS	
CATEGORY	TokenNameIdentifier	 CATEGORY
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeTemplateDescriptor	TokenNameIdentifier	 Node Template Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
new	TokenNamenew	
NodeTemplateDescriptor	TokenNameIdentifier	 Node Template Descriptor
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
nodeValue	TokenNameIdentifier	 node Value
,	TokenNameCOMMA	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
nodeCategory	TokenNameIdentifier	 node Category
,	TokenNameCOMMA	
nodeDescription	TokenNameIdentifier	 node Description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeTemplatesMap	TokenNameIdentifier	 node Templates Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentField	TokenNameIdentifier	 current Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
isAccessible	TokenNameIdentifier	 is Accessible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchFieldException	TokenNameIdentifier	 No Such Field Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wrapper for a node template. Provides the information on the node */	TokenNameCOMMENT_JAVADOC	 Wrapper for a node template. Provides the information on the node 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NodeTemplateDescriptor	TokenNameIdentifier	 Node Template Descriptor
{	TokenNameLBRACE	
/** * Node name. */	TokenNameCOMMENT_JAVADOC	 Node name. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Node xml representation. */	TokenNameCOMMENT_JAVADOC	 Node xml representation. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
xmlValue	TokenNameIdentifier	 xml Value
;	TokenNameSEMICOLON	
/** * Node type. */	TokenNameCOMMENT_JAVADOC	 Node type. 
private	TokenNameprivate	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Node category. */	TokenNameCOMMENT_JAVADOC	 Node category. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
/** * Short node description. */	TokenNameCOMMENT_JAVADOC	 Short node description. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
NodeTemplateDescriptor	TokenNameIdentifier	 Node Template Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
xmlValue	TokenNameIdentifier	 xml Value
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
xmlValue	TokenNameIdentifier	 xml Value
=	TokenNameEQUAL	
xmlValue	TokenNameIdentifier	 xml Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCategory	TokenNameIdentifier	 set Category
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
category	TokenNameIdentifier	 category
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
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
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXmlValue	TokenNameIdentifier	 get Xml Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlValue	TokenNameIdentifier	 xml Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setXmlValue	TokenNameIdentifier	 set Xml Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xmlValue	TokenNameIdentifier	 xml Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xmlValue	TokenNameIdentifier	 xml Value
=	TokenNameEQUAL	
xmlValue	TokenNameIdentifier	 xml Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the categories list. * * @return categoriesList */	TokenNameCOMMENT_JAVADOC	 Gets the categories list. * @return categoriesList 
public	TokenNamepublic	
ArrayList	TokenNameIdentifier	 Array List
getCategories	TokenNameIdentifier	 get Categories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
categoriesList	TokenNameIdentifier	 categories List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Map of objects describing node templates. * * @return nodeTemplatesMap */	TokenNameCOMMENT_JAVADOC	 Map of objects describing node templates. * @return nodeTemplatesMap 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getNodeTemplatesMap	TokenNameIdentifier	 get Node Templates Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodeTemplatesMap	TokenNameIdentifier	 node Templates Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

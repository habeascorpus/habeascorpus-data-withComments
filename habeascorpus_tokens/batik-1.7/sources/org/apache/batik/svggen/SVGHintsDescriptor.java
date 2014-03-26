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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Describes a set of SVG hints * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGHintsDescriptor.java 475477 2006-11-15 22:44:28Z cam $ * @see org.apache.batik.svggen.SVGRenderingHints */	TokenNameCOMMENT_JAVADOC	 Describes a set of SVG hints * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGHintsDescriptor.java 475477 2006-11-15 22:44:28Z cam $ @see org.apache.batik.svggen.SVGRenderingHints 
public	TokenNamepublic	
class	TokenNameclass	
SVGHintsDescriptor	TokenNameIdentifier	 SVG Hints Descriptor
implements	TokenNameimplements	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
,	TokenNameCOMMA	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
colorInterpolation	TokenNameIdentifier	 color Interpolation
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
colorRendering	TokenNameIdentifier	 color Rendering
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
textRendering	TokenNameIdentifier	 text Rendering
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
shapeRendering	TokenNameIdentifier	 shape Rendering
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
imageRendering	TokenNameIdentifier	 image Rendering
;	TokenNameSEMICOLON	
/** * Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
SVGHintsDescriptor	TokenNameIdentifier	 SVG Hints Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
colorInterpolation	TokenNameIdentifier	 color Interpolation
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
colorRendering	TokenNameIdentifier	 color Rendering
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
textRendering	TokenNameIdentifier	 text Rendering
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
shapeRendering	TokenNameIdentifier	 shape Rendering
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
imageRendering	TokenNameIdentifier	 image Rendering
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
colorInterpolation	TokenNameIdentifier	 color Interpolation
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
colorRendering	TokenNameIdentifier	 color Rendering
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
textRendering	TokenNameIdentifier	 text Rendering
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
shapeRendering	TokenNameIdentifier	 shape Rendering
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
imageRendering	TokenNameIdentifier	 image Rendering
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_HINT_NULL	TokenNameIdentifier	 ERR  HINT  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
colorInterpolation	TokenNameIdentifier	 color Interpolation
=	TokenNameEQUAL	
colorInterpolation	TokenNameIdentifier	 color Interpolation
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
colorRendering	TokenNameIdentifier	 color Rendering
=	TokenNameEQUAL	
colorRendering	TokenNameIdentifier	 color Rendering
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
textRendering	TokenNameIdentifier	 text Rendering
=	TokenNameEQUAL	
textRendering	TokenNameIdentifier	 text Rendering
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shapeRendering	TokenNameIdentifier	 shape Rendering
=	TokenNameEQUAL	
shapeRendering	TokenNameIdentifier	 shape Rendering
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
imageRendering	TokenNameIdentifier	 image Rendering
=	TokenNameEQUAL	
imageRendering	TokenNameIdentifier	 image Rendering
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrMap	TokenNameIdentifier	 attr Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_COLOR_INTERPOLATION_ATTRIBUTE	TokenNameIdentifier	 SVG  COLOR  INTERPOLATION  ATTRIBUTE
,	TokenNameCOMMA	
colorInterpolation	TokenNameIdentifier	 color Interpolation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_COLOR_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  COLOR  RENDERING  ATTRIBUTE
,	TokenNameCOMMA	
colorRendering	TokenNameIdentifier	 color Rendering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_TEXT_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  TEXT  RENDERING  ATTRIBUTE
,	TokenNameCOMMA	
textRendering	TokenNameIdentifier	 text Rendering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_SHAPE_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  SHAPE  RENDERING  ATTRIBUTE
,	TokenNameCOMMA	
shapeRendering	TokenNameIdentifier	 shape Rendering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_IMAGE_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  IMAGE  RENDERING  ATTRIBUTE
,	TokenNameCOMMA	
imageRendering	TokenNameIdentifier	 image Rendering
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
defSet	TokenNameIdentifier	 def Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defSet	TokenNameIdentifier	 def Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defSet	TokenNameIdentifier	 def Set
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defSet	TokenNameIdentifier	 def Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

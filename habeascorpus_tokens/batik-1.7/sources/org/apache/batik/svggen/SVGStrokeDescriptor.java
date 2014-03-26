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
/** * Used to represent an SVG Paint. This can be achieved with * to values: an SVG paint value and an SVG opacity value * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGStrokeDescriptor.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Used to represent an SVG Paint. This can be achieved with to values: an SVG paint value and an SVG opacity value * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGStrokeDescriptor.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGStrokeDescriptor	TokenNameIdentifier	 SVG Stroke Descriptor
implements	TokenNameimplements	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
,	TokenNameCOMMA	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
strokeWidth	TokenNameIdentifier	 stroke Width
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
capStyle	TokenNameIdentifier	 cap Style
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
joinStyle	TokenNameIdentifier	 join Style
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
miterLimit	TokenNameIdentifier	 miter Limit
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dashArray	TokenNameIdentifier	 dash Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
dashOffset	TokenNameIdentifier	 dash Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGStrokeDescriptor	TokenNameIdentifier	 SVG Stroke Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
strokeWidth	TokenNameIdentifier	 stroke Width
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
capStyle	TokenNameIdentifier	 cap Style
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
joinStyle	TokenNameIdentifier	 join Style
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
miterLimit	TokenNameIdentifier	 miter Limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dashArray	TokenNameIdentifier	 dash Array
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dashOffset	TokenNameIdentifier	 dash Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strokeWidth	TokenNameIdentifier	 stroke Width
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
capStyle	TokenNameIdentifier	 cap Style
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
joinStyle	TokenNameIdentifier	 join Style
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
miterLimit	TokenNameIdentifier	 miter Limit
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dashArray	TokenNameIdentifier	 dash Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
dashOffset	TokenNameIdentifier	 dash Offset
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_STROKE_NULL	TokenNameIdentifier	 ERR  STROKE  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokeWidth	TokenNameIdentifier	 stroke Width
=	TokenNameEQUAL	
strokeWidth	TokenNameIdentifier	 stroke Width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
capStyle	TokenNameIdentifier	 cap Style
=	TokenNameEQUAL	
capStyle	TokenNameIdentifier	 cap Style
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
joinStyle	TokenNameIdentifier	 join Style
=	TokenNameEQUAL	
joinStyle	TokenNameIdentifier	 join Style
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
miterLimit	TokenNameIdentifier	 miter Limit
=	TokenNameEQUAL	
miterLimit	TokenNameIdentifier	 miter Limit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dashArray	TokenNameIdentifier	 dash Array
=	TokenNameEQUAL	
dashArray	TokenNameIdentifier	 dash Array
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dashOffset	TokenNameIdentifier	 dash Offset
=	TokenNameEQUAL	
dashOffset	TokenNameIdentifier	 dash Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getStrokeWidth	TokenNameIdentifier	 get Stroke Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strokeWidth	TokenNameIdentifier	 stroke Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getCapStyle	TokenNameIdentifier	 get Cap Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
capStyle	TokenNameIdentifier	 cap Style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getJoinStyle	TokenNameIdentifier	 get Join Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
joinStyle	TokenNameIdentifier	 join Style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getMiterLimit	TokenNameIdentifier	 get Miter Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
miterLimit	TokenNameIdentifier	 miter Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getDashArray	TokenNameIdentifier	 get Dash Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dashArray	TokenNameIdentifier	 dash Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getDashOffset	TokenNameIdentifier	 get Dash Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dashOffset	TokenNameIdentifier	 dash Offset
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
SVG_STROKE_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
strokeWidth	TokenNameIdentifier	 stroke Width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_LINECAP_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  LINECAP  ATTRIBUTE
,	TokenNameCOMMA	
capStyle	TokenNameIdentifier	 cap Style
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_LINEJOIN_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  LINEJOIN  ATTRIBUTE
,	TokenNameCOMMA	
joinStyle	TokenNameIdentifier	 join Style
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_MITERLIMIT_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  MITERLIMIT  ATTRIBUTE
,	TokenNameCOMMA	
miterLimit	TokenNameIdentifier	 miter Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_DASHARRAY_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  DASHARRAY  ATTRIBUTE
,	TokenNameCOMMA	
dashArray	TokenNameIdentifier	 dash Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_DASHOFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  DASHOFFSET  ATTRIBUTE
,	TokenNameCOMMA	
dashOffset	TokenNameIdentifier	 dash Offset
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

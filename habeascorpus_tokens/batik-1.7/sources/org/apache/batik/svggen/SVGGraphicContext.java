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
Map	TokenNameIdentifier	 Map
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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
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
/** * Represents the SVG equivalent of a Java 2D API graphic * context attribute. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGGraphicContext.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Represents the SVG equivalent of a Java 2D API graphic context attribute. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGGraphicContext.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
implements	TokenNameimplements	
SVGConstants	TokenNameIdentifier	 SVG Constants
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
// this properties can only be set of leaf nodes => 	TokenNameCOMMENT_LINE	this properties can only be set of leaf nodes => 
// if they have default values they can be ignored 	TokenNameCOMMENT_LINE	if they have default values they can be ignored 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
leafOnlyAttributes	TokenNameIdentifier	 leaf Only Attributes
=	TokenNameEQUAL	
{	TokenNameLBRACE	
SVG_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  OPACITY  ATTRIBUTE
,	TokenNameCOMMA	
SVG_FILTER_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  ATTRIBUTE
,	TokenNameCOMMA	
SVG_CLIP_PATH_ATTRIBUTE	TokenNameIdentifier	 SVG  CLIP  PATH  ATTRIBUTE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
defaultValues	TokenNameIdentifier	 default Values
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
groupContext	TokenNameIdentifier	 group Context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
graphicElementContext	TokenNameIdentifier	 graphic Element Context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformStack	TokenNameIdentifier	 transform Stack
;	TokenNameSEMICOLON	
/** * @param context Set of style attributes in this context. * @param transformStack Sequence of transforms that where * applied to create the context's current transform. */	TokenNameCOMMENT_JAVADOC	 @param context Set of style attributes in this context. @param transformStack Sequence of transforms that where applied to create the context's current transform. 
public	TokenNamepublic	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_MAP_NULL	TokenNameIdentifier	 ERR  MAP  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformStack	TokenNameIdentifier	 transform Stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_TRANS_NULL	TokenNameIdentifier	 ERR  TRANS  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transformStack	TokenNameIdentifier	 transform Stack
=	TokenNameEQUAL	
transformStack	TokenNameIdentifier	 transform Stack
;	TokenNameSEMICOLON	
computeGroupAndGraphicElementContext	TokenNameIdentifier	 compute Group And Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param groupContext Set of attributes that apply to group * @param graphicElementContext Set of attributes that apply to * elements but not to groups (e.g., opacity, filter). * @param transformStack Sequence of transforms that where * applied to create the context's current transform. */	TokenNameCOMMENT_JAVADOC	 @param groupContext Set of attributes that apply to group @param graphicElementContext Set of attributes that apply to elements but not to groups (e.g., opacity, filter). @param transformStack Sequence of transforms that where applied to create the context's current transform. 
public	TokenNamepublic	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
groupContext	TokenNameIdentifier	 group Context
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
graphicElementContext	TokenNameIdentifier	 graphic Element Context
,	TokenNameCOMMA	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupContext	TokenNameIdentifier	 group Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_MAP_NULL	TokenNameIdentifier	 ERR  MAP  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformStack	TokenNameIdentifier	 transform Stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_TRANS_NULL	TokenNameIdentifier	 ERR  TRANS  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupContext	TokenNameIdentifier	 group Context
=	TokenNameEQUAL	
groupContext	TokenNameIdentifier	 group Context
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
=	TokenNameEQUAL	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transformStack	TokenNameIdentifier	 transform Stack
=	TokenNameEQUAL	
transformStack	TokenNameIdentifier	 transform Stack
;	TokenNameSEMICOLON	
computeContext	TokenNameIdentifier	 compute Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return set of all attributes. */	TokenNameCOMMENT_JAVADOC	 @return set of all attributes. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return set of attributes that can be set on a group */	TokenNameCOMMENT_JAVADOC	 @return set of attributes that can be set on a group 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupContext	TokenNameIdentifier	 group Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return set of attributes that can be set on leaf node */	TokenNameCOMMENT_JAVADOC	 @return set of attributes that can be set on leaf node 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getGraphicElementContext	TokenNameIdentifier	 get Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return set of TransformStackElement for this context */	TokenNameCOMMENT_JAVADOC	 @return set of TransformStackElement for this context 
public	TokenNamepublic	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformStack	TokenNameIdentifier	 transform Stack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
computeContext	TokenNameIdentifier	 compute Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
groupContext	TokenNameIdentifier	 group Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
computeGroupAndGraphicElementContext	TokenNameIdentifier	 compute Group And Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupContext	TokenNameIdentifier	 group Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now, move attributes that only apply to 	TokenNameCOMMENT_LINE	Now, move attributes that only apply to 
// leaf elements to a separate map. 	TokenNameCOMMENT_LINE	leaf elements to a separate map. 
// 	TokenNameCOMMENT_LINE	 
groupContext	TokenNameIdentifier	 group Context
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
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
leafOnlyAttributes	TokenNameIdentifier	 leaf Only Attributes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
attrValue	TokenNameIdentifier	 attr Value
=	TokenNameEQUAL	
groupContext	TokenNameIdentifier	 group Context
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
leafOnlyAttributes	TokenNameIdentifier	 leaf Only Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrValue	TokenNameIdentifier	 attr Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attrValue	TokenNameIdentifier	 attr Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
defaultValues	TokenNameIdentifier	 default Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
graphicElementContext	TokenNameIdentifier	 graphic Element Context
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
leafOnlyAttributes	TokenNameIdentifier	 leaf Only Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groupContext	TokenNameIdentifier	 group Context
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
leafOnlyAttributes	TokenNameIdentifier	 leaf Only Attributes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

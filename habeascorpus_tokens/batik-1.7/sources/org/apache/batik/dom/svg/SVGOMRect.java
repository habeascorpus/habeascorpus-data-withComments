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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGRect	TokenNameIdentifier	 SVG Rect
;	TokenNameSEMICOLON	
/** * An implementation of {@link SVGRect} that is not associated with an * attribute. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: SVGOMRect.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An implementation of {@link SVGRect} that is not associated with an attribute. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: SVGOMRect.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMRect	TokenNameIdentifier	 SVGOM Rect
implements	TokenNameimplements	
SVGRect	TokenNameIdentifier	 SVG Rect
{	TokenNameLBRACE	
/** * The rect's x coordinate. */	TokenNameCOMMENT_JAVADOC	 The rect's x coordinate. 
protected	TokenNameprotected	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The rect's y coordinate. */	TokenNameCOMMENT_JAVADOC	 The rect's y coordinate. 
protected	TokenNameprotected	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * The rect's width. */	TokenNameCOMMENT_JAVADOC	 The rect's width. 
protected	TokenNameprotected	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
/** * The rect's height. */	TokenNameCOMMENT_JAVADOC	 The rect's height. 
protected	TokenNameprotected	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMRect with all values set to zero. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMRect with all values set to zero. 
public	TokenNamepublic	
SVGOMRect	TokenNameIdentifier	 SVGOM Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMRect with the specified position and dimensions. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMRect with the specified position and dimensions. 
public	TokenNamepublic	
SVGOMRect	TokenNameIdentifier	 SVGOM Rect
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getX()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getY()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getWidth()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getWidth()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setWidth(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setWidth(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
float	TokenNamefloat	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#getHeight()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#getHeight()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGRect#setHeight(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGRect#setHeight(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

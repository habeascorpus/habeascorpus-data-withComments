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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Context class for svg:svg elements. * * Eventually this interface will likely have a number of other * methods but for now it will have methods to do intersection * and enclosure checking. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: SVGSVGContext.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Context class for svg:svg elements. * Eventually this interface will likely have a number of other methods but for now it will have methods to do intersection and enclosure checking. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: SVGSVGContext.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGSVGContext	TokenNameIdentifier	 SVGSVG Context
extends	TokenNameextends	
SVGContext	TokenNameIdentifier	 SVG Context
{	TokenNameLBRACE	
/** * Returns a List of all the DOM elements that intersect * <tt>svgRect</tt> that are below <tt>end</tt> in the * rendering order. */	TokenNameCOMMENT_JAVADOC	 Returns a List of all the DOM elements that intersect <tt>svgRect</tt> that are below <tt>end</tt> in the rendering order. 
List	TokenNameIdentifier	 List
getIntersectionList	TokenNameIdentifier	 get Intersection List
(	TokenNameLPAREN	
SVGRect	TokenNameIdentifier	 SVG Rect
svgRect	TokenNameIdentifier	 svg Rect
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a List of all the DOM elements that are encosed in * <tt>svgRect</tt> that are below <tt>end</tt> in the * rendering order. */	TokenNameCOMMENT_JAVADOC	 Returns a List of all the DOM elements that are encosed in <tt>svgRect</tt> that are below <tt>end</tt> in the rendering order. 
List	TokenNameIdentifier	 List
getEnclosureList	TokenNameIdentifier	 get Enclosure List
(	TokenNameLPAREN	
SVGRect	TokenNameIdentifier	 SVG Rect
rect	TokenNameIdentifier	 rect
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the given DOM element intersects * <tt>svgRect</tt>. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given DOM element intersects <tt>svgRect</tt>. 
boolean	TokenNameboolean	
checkIntersection	TokenNameIdentifier	 check Intersection
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
SVGRect	TokenNameIdentifier	 SVG Rect
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the given DOM element is enclosed in the * <tt>svgRect</tt>. */	TokenNameCOMMENT_JAVADOC	 Returns true if the given DOM element is enclosed in the <tt>svgRect</tt>. 
boolean	TokenNameboolean	
checkEnclosure	TokenNameIdentifier	 check Enclosure
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
SVGRect	TokenNameIdentifier	 SVG Rect
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to inform the user agent that the text selection should be * cleared. */	TokenNameCOMMENT_JAVADOC	 Used to inform the user agent that the text selection should be cleared. 
void	TokenNamevoid	
deselectAll	TokenNameIdentifier	 deselect All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Suspends redrawing of the canvas for the given number of milliseconds. */	TokenNameCOMMENT_JAVADOC	 Suspends redrawing of the canvas for the given number of milliseconds. 
int	TokenNameint	
suspendRedraw	TokenNameIdentifier	 suspend Redraw
(	TokenNameLPAREN	
int	TokenNameint	
max_wait_milliseconds	TokenNameIdentifier	 max wait milliseconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Unsuspends redrawing of the canvas. */	TokenNameCOMMENT_JAVADOC	 Unsuspends redrawing of the canvas. 
boolean	TokenNameboolean	
unsuspendRedraw	TokenNameIdentifier	 unsuspend Redraw
(	TokenNameLPAREN	
int	TokenNameint	
suspend_handle_id	TokenNameIdentifier	 suspend handle id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Unsuspends redrawing of the canvas. */	TokenNameCOMMENT_JAVADOC	 Unsuspends redrawing of the canvas. 
void	TokenNamevoid	
unsuspendRedrawAll	TokenNameIdentifier	 unsuspend Redraw All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Forces an immediate redraw of the canvas. */	TokenNameCOMMENT_JAVADOC	 Forces an immediate redraw of the canvas. 
void	TokenNamevoid	
forceRedraw	TokenNameIdentifier	 force Redraw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Pauses animations in the document. */	TokenNameCOMMENT_JAVADOC	 Pauses animations in the document. 
void	TokenNamevoid	
pauseAnimations	TokenNameIdentifier	 pause Animations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Unpauses animations in the document. */	TokenNameCOMMENT_JAVADOC	 Unpauses animations in the document. 
void	TokenNamevoid	
unpauseAnimations	TokenNameIdentifier	 unpause Animations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether animations are currently paused. */	TokenNameCOMMENT_JAVADOC	 Returns whether animations are currently paused. 
boolean	TokenNameboolean	
animationsPaused	TokenNameIdentifier	 animations Paused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the current document time. */	TokenNameCOMMENT_JAVADOC	 Returns the current document time. 
float	TokenNamefloat	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the current document time. */	TokenNameCOMMENT_JAVADOC	 Sets the current document time. 
void	TokenNamevoid	
setCurrentTime	TokenNameIdentifier	 set Current Time
(	TokenNameLPAREN	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

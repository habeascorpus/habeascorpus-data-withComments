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
smil	TokenNameIdentifier	 smil
.	TokenNameDOT	
ElementTimeControl	TokenNameIdentifier	 Element Time Control
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
SVGElement	TokenNameIdentifier	 SVG Element
;	TokenNameSEMICOLON	
/** * Context class for SVG animation elements to support extra methods. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGAnimationContext.java 580685 2007-09-30 09:07:29Z cam $ */	TokenNameCOMMENT_JAVADOC	 Context class for SVG animation elements to support extra methods. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGAnimationContext.java 580685 2007-09-30 09:07:29Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
extends	TokenNameextends	
SVGContext	TokenNameIdentifier	 SVG Context
,	TokenNameCOMMA	
ElementTimeControl	TokenNameIdentifier	 Element Time Control
{	TokenNameLBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGAnimationElement#getTargetElement()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGAnimationElement#getTargetElement()}. 
SVGElement	TokenNameIdentifier	 SVG Element
getTargetElement	TokenNameIdentifier	 get Target Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGAnimationElement#getStartTime()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGAnimationElement#getStartTime()}. 
float	TokenNamefloat	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGAnimationElement#getCurrentTime()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGAnimationElement#getCurrentTime()}. 
float	TokenNamefloat	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGAnimationElement#getSimpleDuration()}. With the * difference that an indefinite simple duration is returned as * {@link org.apache.batik.anim.timing.TimedElement#INDEFINITE}, rather than * throwing an exception. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGAnimationElement#getSimpleDuration()}. With the difference that an indefinite simple duration is returned as {@link org.apache.batik.anim.timing.TimedElement#INDEFINITE}, rather than throwing an exception. 
float	TokenNamefloat	
getSimpleDuration	TokenNameIdentifier	 get Simple Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the time that the document would seek to if this animation * element were hyperlinked to, or <code>NaN</code> if there is no * such begin time. */	TokenNameCOMMENT_JAVADOC	 Returns the time that the document would seek to if this animation element were hyperlinked to, or <code>NaN</code> if there is no such begin time. 
float	TokenNamefloat	
getHyperlinkBeginTime	TokenNameIdentifier	 get Hyperlink Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

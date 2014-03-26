/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Define SVG constants, such as tag names, attribute names and URI * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGConstants.java 598513 2007-11-27 04:21:10Z cam $ */	TokenNameCOMMENT_JAVADOC	 Define SVG constants, such as tag names, attribute names and URI * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGConstants.java 598513 2007-11-27 04:21:10Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGConstants	TokenNameIdentifier	 SVG Constants
extends	TokenNameextends	
CSSConstants	TokenNameIdentifier	 CSS Constants
,	TokenNameCOMMA	
XMLConstants	TokenNameIdentifier	 XML Constants
{	TokenNameLBRACE	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG general 	TokenNameCOMMENT_LINE	SVG general 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
SVG_PUBLIC_ID	TokenNameIdentifier	 SVG  PUBLIC  ID
=	TokenNameEQUAL	
"-//W3C//DTD SVG 1.0//EN"	TokenNameStringLiteral	-//W3C//DTD SVG 1.0//EN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SYSTEM_ID	TokenNameIdentifier	 SVG  SYSTEM  ID
=	TokenNameEQUAL	
"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd"	TokenNameStringLiteral	http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
=	TokenNameEQUAL	
"http://www.w3.org/2000/svg"	TokenNameStringLiteral	http://www.w3.org/2000/svg
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VERSION	TokenNameIdentifier	 SVG  VERSION
=	TokenNameEQUAL	
"1.0"	TokenNameStringLiteral	1.0
;	TokenNameSEMICOLON	
////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////////// 
// Events type and attributes 	TokenNameCOMMENT_LINE	Events type and attributes 
////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	//////////////////////////////////////////////////////////////////////// 
/** * The event type for MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for MouseEvent. 
String	TokenNameIdentifier	 String
SVG_MOUSEEVENTS_EVENT_TYPE	TokenNameIdentifier	 SVG  MOUSEEVENTS  EVENT  TYPE
=	TokenNameEQUAL	
"MouseEvents"	TokenNameStringLiteral	MouseEvents
;	TokenNameSEMICOLON	
/** * The event type for UIEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for UIEvent. 
String	TokenNameIdentifier	 String
SVG_UIEVENTS_EVENT_TYPE	TokenNameIdentifier	 SVG  UIEVENTS  EVENT  TYPE
=	TokenNameEQUAL	
"UIEvents"	TokenNameStringLiteral	UIEvents
;	TokenNameSEMICOLON	
/** * The event type for SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGEVENTS_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGEVENTS  EVENT  TYPE
=	TokenNameEQUAL	
"SVGEvents"	TokenNameStringLiteral	SVGEvents
;	TokenNameSEMICOLON	
/** * The event type for KeyEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for KeyEvent. 
String	TokenNameIdentifier	 String
SVG_KEYEVENTS_EVENT_TYPE	TokenNameIdentifier	 SVG  KEYEVENTS  EVENT  TYPE
=	TokenNameEQUAL	
"KeyEvents"	TokenNameStringLiteral	KeyEvents
;	TokenNameSEMICOLON	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
/** * The event type for 'keydown' KeyEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'keydown' KeyEvent. 
String	TokenNameIdentifier	 String
SVG_KEYDOWN_EVENT_TYPE	TokenNameIdentifier	 SVG  KEYDOWN  EVENT  TYPE
=	TokenNameEQUAL	
"keydown"	TokenNameStringLiteral	keydown
;	TokenNameSEMICOLON	
/** * The event type for 'keypress' KeyEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'keypress' KeyEvent. 
String	TokenNameIdentifier	 String
SVG_KEYPRESS_EVENT_TYPE	TokenNameIdentifier	 SVG  KEYPRESS  EVENT  TYPE
=	TokenNameEQUAL	
"keypress"	TokenNameStringLiteral	keypress
;	TokenNameSEMICOLON	
/** * The event type for 'keyup' KeyEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'keyup' KeyEvent. 
String	TokenNameIdentifier	 String
SVG_KEYUP_EVENT_TYPE	TokenNameIdentifier	 SVG  KEYUP  EVENT  TYPE
=	TokenNameEQUAL	
"keyup"	TokenNameStringLiteral	keyup
;	TokenNameSEMICOLON	
/** * The event type for 'click' MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'click' MouseEvent. 
String	TokenNameIdentifier	 String
SVG_CLICK_EVENT_TYPE	TokenNameIdentifier	 SVG  CLICK  EVENT  TYPE
=	TokenNameEQUAL	
"click"	TokenNameStringLiteral	click
;	TokenNameSEMICOLON	
/** * The event type for 'mouseup' MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'mouseup' MouseEvent. 
String	TokenNameIdentifier	 String
SVG_MOUSEUP_EVENT_TYPE	TokenNameIdentifier	 SVG  MOUSEUP  EVENT  TYPE
=	TokenNameEQUAL	
"mouseup"	TokenNameStringLiteral	mouseup
;	TokenNameSEMICOLON	
/** * The event type for 'mousedown' MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'mousedown' MouseEvent. 
String	TokenNameIdentifier	 String
SVG_MOUSEDOWN_EVENT_TYPE	TokenNameIdentifier	 SVG  MOUSEDOWN  EVENT  TYPE
=	TokenNameEQUAL	
"mousedown"	TokenNameStringLiteral	mousedown
;	TokenNameSEMICOLON	
/** * The event type for 'mousemove' MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'mousemove' MouseEvent. 
String	TokenNameIdentifier	 String
SVG_MOUSEMOVE_EVENT_TYPE	TokenNameIdentifier	 SVG  MOUSEMOVE  EVENT  TYPE
=	TokenNameEQUAL	
"mousemove"	TokenNameStringLiteral	mousemove
;	TokenNameSEMICOLON	
/** * The event type for 'mouseout' MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'mouseout' MouseEvent. 
String	TokenNameIdentifier	 String
SVG_MOUSEOUT_EVENT_TYPE	TokenNameIdentifier	 SVG  MOUSEOUT  EVENT  TYPE
=	TokenNameEQUAL	
"mouseout"	TokenNameStringLiteral	mouseout
;	TokenNameSEMICOLON	
/** * The event type for 'mouseover' MouseEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'mouseover' MouseEvent. 
String	TokenNameIdentifier	 String
SVG_MOUSEOVER_EVENT_TYPE	TokenNameIdentifier	 SVG  MOUSEOVER  EVENT  TYPE
=	TokenNameEQUAL	
"mouseover"	TokenNameStringLiteral	mouseover
;	TokenNameSEMICOLON	
/** * The event type for 'DOMFocusIn' UIEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'DOMFocusIn' UIEvent. 
String	TokenNameIdentifier	 String
SVG_DOMFOCUSIN_EVENT_TYPE	TokenNameIdentifier	 SVG  DOMFOCUSIN  EVENT  TYPE
=	TokenNameEQUAL	
"DOMFocusIn"	TokenNameStringLiteral	DOMFocusIn
;	TokenNameSEMICOLON	
/** * The event type for 'DOMFocusOut' UIEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'DOMFocusOut' UIEvent. 
String	TokenNameIdentifier	 String
SVG_DOMFOCUSOUT_EVENT_TYPE	TokenNameIdentifier	 SVG  DOMFOCUSOUT  EVENT  TYPE
=	TokenNameEQUAL	
"DOMFocusOut"	TokenNameStringLiteral	DOMFocusOut
;	TokenNameSEMICOLON	
/** * The event type for 'DOMActivate' UIEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'DOMActivate' UIEvent. 
String	TokenNameIdentifier	 String
SVG_DOMACTIVATE_EVENT_TYPE	TokenNameIdentifier	 SVG  DOMACTIVATE  EVENT  TYPE
=	TokenNameEQUAL	
"DOMActivate"	TokenNameStringLiteral	DOMActivate
;	TokenNameSEMICOLON	
/** * The event type for 'SVGLoad' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGLoad' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGLOAD_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGLOAD  EVENT  TYPE
=	TokenNameEQUAL	
"SVGLoad"	TokenNameStringLiteral	SVGLoad
;	TokenNameSEMICOLON	
/** * The event type for 'SVGUnload' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGUnload' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGUNLOAD_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGUNLOAD  EVENT  TYPE
=	TokenNameEQUAL	
"SVGUnload"	TokenNameStringLiteral	SVGUnload
;	TokenNameSEMICOLON	
/** * The event type for 'SVGAbort' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGAbort' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGABORT_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGABORT  EVENT  TYPE
=	TokenNameEQUAL	
"SVGAbort"	TokenNameStringLiteral	SVGAbort
;	TokenNameSEMICOLON	
/** * The event type for 'SVGError' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGError' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGERROR_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGERROR  EVENT  TYPE
=	TokenNameEQUAL	
"SVGError"	TokenNameStringLiteral	SVGError
;	TokenNameSEMICOLON	
/** * The event type for 'SVGResize' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGResize' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGRESIZE_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGRESIZE  EVENT  TYPE
=	TokenNameEQUAL	
"SVGResize"	TokenNameStringLiteral	SVGResize
;	TokenNameSEMICOLON	
/** * The event type for 'SVGScroll' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGScroll' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGSCROLL_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGSCROLL  EVENT  TYPE
=	TokenNameEQUAL	
"SVGScroll"	TokenNameStringLiteral	SVGScroll
;	TokenNameSEMICOLON	
/** * The event type for 'SVGZoom' SVGEvent. */	TokenNameCOMMENT_JAVADOC	 The event type for 'SVGZoom' SVGEvent. 
String	TokenNameIdentifier	 String
SVG_SVGZOOM_EVENT_TYPE	TokenNameIdentifier	 SVG  SVGZOOM  EVENT  TYPE
=	TokenNameEQUAL	
"SVGZoom"	TokenNameStringLiteral	SVGZoom
;	TokenNameSEMICOLON	
// --------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------------------- 
/** * The 'onkeyup' attribute name of type KeyEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onkeyup' attribute name of type KeyEvents. 
String	TokenNameIdentifier	 String
SVG_ONKEYUP_ATTRIBUTE	TokenNameIdentifier	 SVG  ONKEYUP  ATTRIBUTE
=	TokenNameEQUAL	
"onkeyup"	TokenNameStringLiteral	onkeyup
;	TokenNameSEMICOLON	
/** * The 'onkeydown' attribute name of type KeyEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onkeydown' attribute name of type KeyEvents. 
String	TokenNameIdentifier	 String
SVG_ONKEYDOWN_ATTRIBUTE	TokenNameIdentifier	 SVG  ONKEYDOWN  ATTRIBUTE
=	TokenNameEQUAL	
"onkeydown"	TokenNameStringLiteral	onkeydown
;	TokenNameSEMICOLON	
/** * The 'onkeypress' attribute name of type KeyEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onkeypress' attribute name of type KeyEvents. 
String	TokenNameIdentifier	 String
SVG_ONKEYPRESS_ATTRIBUTE	TokenNameIdentifier	 SVG  ONKEYPRESS  ATTRIBUTE
=	TokenNameEQUAL	
"onkeypress"	TokenNameStringLiteral	onkeypress
;	TokenNameSEMICOLON	
/** * The 'onabort' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onabort' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONABORT_ATTRIBUTE	TokenNameIdentifier	 SVG  ONABORT  ATTRIBUTE
=	TokenNameEQUAL	
"onabort"	TokenNameStringLiteral	onabort
;	TokenNameSEMICOLON	
/** * The 'onabort' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onabort' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONACTIVATE_ATTRIBUTE	TokenNameIdentifier	 SVG  ONACTIVATE  ATTRIBUTE
=	TokenNameEQUAL	
"onactivate"	TokenNameStringLiteral	onactivate
;	TokenNameSEMICOLON	
/** * The 'onbegin' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onbegin' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONBEGIN_ATTRIBUTE	TokenNameIdentifier	 SVG  ONBEGIN  ATTRIBUTE
=	TokenNameEQUAL	
"onbegin"	TokenNameStringLiteral	onbegin
;	TokenNameSEMICOLON	
/** * The 'onclick' attribute name of type MouseEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onclick' attribute name of type MouseEvents. 
String	TokenNameIdentifier	 String
SVG_ONCLICK_ATTRIBUTE	TokenNameIdentifier	 SVG  ONCLICK  ATTRIBUTE
=	TokenNameEQUAL	
"onclick"	TokenNameStringLiteral	onclick
;	TokenNameSEMICOLON	
/** * The 'onend' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onend' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONEND_ATTRIBUTE	TokenNameIdentifier	 SVG  ONEND  ATTRIBUTE
=	TokenNameEQUAL	
"onend"	TokenNameStringLiteral	onend
;	TokenNameSEMICOLON	
/** * The 'onerror' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onerror' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONERROR_ATTRIBUTE	TokenNameIdentifier	 SVG  ONERROR  ATTRIBUTE
=	TokenNameEQUAL	
"onerror"	TokenNameStringLiteral	onerror
;	TokenNameSEMICOLON	
/** * The 'onfocusin' attribute name of type UIEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onfocusin' attribute name of type UIEvents. 
String	TokenNameIdentifier	 String
SVG_ONFOCUSIN_ATTRIBUTE	TokenNameIdentifier	 SVG  ONFOCUSIN  ATTRIBUTE
=	TokenNameEQUAL	
"onfocusin"	TokenNameStringLiteral	onfocusin
;	TokenNameSEMICOLON	
/** * The 'onfocusout' attribute name of type UIEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onfocusout' attribute name of type UIEvents. 
String	TokenNameIdentifier	 String
SVG_ONFOCUSOUT_ATTRIBUTE	TokenNameIdentifier	 SVG  ONFOCUSOUT  ATTRIBUTE
=	TokenNameEQUAL	
"onfocusout"	TokenNameStringLiteral	onfocusout
;	TokenNameSEMICOLON	
/** * The 'onload' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onload' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONLOAD_ATTRIBUTE	TokenNameIdentifier	 SVG  ONLOAD  ATTRIBUTE
=	TokenNameEQUAL	
"onload"	TokenNameStringLiteral	onload
;	TokenNameSEMICOLON	
/** * The 'onmousedown' attribute name of type MouseEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onmousedown' attribute name of type MouseEvents. 
String	TokenNameIdentifier	 String
SVG_ONMOUSEDOWN_ATTRIBUTE	TokenNameIdentifier	 SVG  ONMOUSEDOWN  ATTRIBUTE
=	TokenNameEQUAL	
"onmousedown"	TokenNameStringLiteral	onmousedown
;	TokenNameSEMICOLON	
/** * The 'onmousemove' attribute name of type MouseEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onmousemove' attribute name of type MouseEvents. 
String	TokenNameIdentifier	 String
SVG_ONMOUSEMOVE_ATTRIBUTE	TokenNameIdentifier	 SVG  ONMOUSEMOVE  ATTRIBUTE
=	TokenNameEQUAL	
"onmousemove"	TokenNameStringLiteral	onmousemove
;	TokenNameSEMICOLON	
/** * The 'onmouseout' attribute name of type MouseEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onmouseout' attribute name of type MouseEvents. 
String	TokenNameIdentifier	 String
SVG_ONMOUSEOUT_ATTRIBUTE	TokenNameIdentifier	 SVG  ONMOUSEOUT  ATTRIBUTE
=	TokenNameEQUAL	
"onmouseout"	TokenNameStringLiteral	onmouseout
;	TokenNameSEMICOLON	
/** * The 'onmouseover' attribute name of type MouseEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onmouseover' attribute name of type MouseEvents. 
String	TokenNameIdentifier	 String
SVG_ONMOUSEOVER_ATTRIBUTE	TokenNameIdentifier	 SVG  ONMOUSEOVER  ATTRIBUTE
=	TokenNameEQUAL	
"onmouseover"	TokenNameStringLiteral	onmouseover
;	TokenNameSEMICOLON	
/** * The 'onmouseup' attribute name of type MouseEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onmouseup' attribute name of type MouseEvents. 
String	TokenNameIdentifier	 String
SVG_ONMOUSEUP_ATTRIBUTE	TokenNameIdentifier	 SVG  ONMOUSEUP  ATTRIBUTE
=	TokenNameEQUAL	
"onmouseup"	TokenNameStringLiteral	onmouseup
;	TokenNameSEMICOLON	
/** * The 'onrepeat' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onrepeat' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONREPEAT_ATTRIBUTE	TokenNameIdentifier	 SVG  ONREPEAT  ATTRIBUTE
=	TokenNameEQUAL	
"onrepeat"	TokenNameStringLiteral	onrepeat
;	TokenNameSEMICOLON	
/** * The 'onresize' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onresize' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONRESIZE_ATTRIBUTE	TokenNameIdentifier	 SVG  ONRESIZE  ATTRIBUTE
=	TokenNameEQUAL	
"onresize"	TokenNameStringLiteral	onresize
;	TokenNameSEMICOLON	
/** * The 'onscroll' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onscroll' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONSCROLL_ATTRIBUTE	TokenNameIdentifier	 SVG  ONSCROLL  ATTRIBUTE
=	TokenNameEQUAL	
"onscroll"	TokenNameStringLiteral	onscroll
;	TokenNameSEMICOLON	
/** * The 'onunload' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onunload' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONUNLOAD_ATTRIBUTE	TokenNameIdentifier	 SVG  ONUNLOAD  ATTRIBUTE
=	TokenNameEQUAL	
"onunload"	TokenNameStringLiteral	onunload
;	TokenNameSEMICOLON	
/** * The 'onzoom' attribute name of type SVGEvents. */	TokenNameCOMMENT_JAVADOC	 The 'onzoom' attribute name of type SVGEvents. 
String	TokenNameIdentifier	 String
SVG_ONZOOM_ATTRIBUTE	TokenNameIdentifier	 SVG  ONZOOM  ATTRIBUTE
=	TokenNameEQUAL	
"onzoom"	TokenNameStringLiteral	onzoom
;	TokenNameSEMICOLON	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG features 	TokenNameCOMMENT_LINE	SVG features 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG 1.0 feature strings 	TokenNameCOMMENT_LINE	SVG 1.0 feature strings 
String	TokenNameIdentifier	 String
SVG_ORG_W3C_SVG_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  FEATURE
=	TokenNameEQUAL	
"org.w3c.svg"	TokenNameStringLiteral	org.w3c.svg
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_SVG_STATIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  STATIC  FEATURE
=	TokenNameEQUAL	
"org.w3c.svg.static"	TokenNameStringLiteral	org.w3c.svg.static
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_SVG_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  ANIMATION  FEATURE
=	TokenNameEQUAL	
"org.w3c.svg.animation"	TokenNameStringLiteral	org.w3c.svg.animation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_SVG_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  DYNAMIC  FEATURE
=	TokenNameEQUAL	
"org.w3c.svg.dynamic"	TokenNameStringLiteral	org.w3c.svg.dynamic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_SVG_ALL_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  SVG  ALL  FEATURE
=	TokenNameEQUAL	
"org.w3c.svg.all"	TokenNameStringLiteral	org.w3c.svg.all
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_DOM_SVG_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  FEATURE
=	TokenNameEQUAL	
"org.w3c.dom.svg"	TokenNameStringLiteral	org.w3c.dom.svg
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_DOM_SVG_STATIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  STATIC  FEATURE
=	TokenNameEQUAL	
"org.w3c.dom.svg.static"	TokenNameStringLiteral	org.w3c.dom.svg.static
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_DOM_SVG_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  ANIMATION  FEATURE
=	TokenNameEQUAL	
"org.w3c.dom.svg.animation"	TokenNameStringLiteral	org.w3c.dom.svg.animation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_DOM_SVG_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  DYNAMIC  FEATURE
=	TokenNameEQUAL	
"org.w3c.dom.svg.dynamic"	TokenNameStringLiteral	org.w3c.dom.svg.dynamic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORG_W3C_DOM_SVG_ALL_FEATURE	TokenNameIdentifier	 SVG  ORG  W3 C  DOM  SVG  ALL  FEATURE
=	TokenNameEQUAL	
"org.w3c.dom.svg.all"	TokenNameStringLiteral	org.w3c.dom.svg.all
;	TokenNameSEMICOLON	
// SVG 1.1 feature strings 	TokenNameCOMMENT_LINE	SVG 1.1 feature strings 
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVG"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVG
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_DOM_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVGDOM"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVGDOM
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_STATIC_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  STATIC  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVG-static"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVG-static
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_DOM_STATIC_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  STATIC  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVGDOM-static"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVGDOM-static
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  ANIMATION  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVG-animation"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVG-animation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_DOM_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  ANIMATION  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVGDOM-animation"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVGDOM-animation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DYNAMIC  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVG-dynamic"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVG-dynamic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SVG_DOM_DYNAMIC_FEATURE	TokenNameIdentifier	 SVG  SV G11  SVG  DOM  DYNAMIC  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#SVGDOM-dynamic"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#SVGDOM-dynamic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_CORE_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  CORE  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#CoreAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#CoreAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_STRUCTURE_FEATURE	TokenNameIdentifier	 SVG  SV G11  STRUCTURE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Structure"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Structure
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_STRUCTURE_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  STRUCTURE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicStructure"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicStructure
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_CONTAINER_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  CONTAINER  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#ContainerAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#ContainerAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_CONDITIONAL_PROCESSING_FEATURE	TokenNameIdentifier	 SVG  SV G11  CONDITIONAL  PROCESSING  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#ConditionalProcessing"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#ConditionalProcessing
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_IMAGE_FEATURE	TokenNameIdentifier	 SVG  SV G11  IMAGE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Image"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Image
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_STYLE_FEATURE	TokenNameIdentifier	 SVG  SV G11  STYLE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Style"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Style
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_VIEWPORT_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  VIEWPORT  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#ViewportAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#ViewportAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SHAPE_FEATURE	TokenNameIdentifier	 SVG  SV G11  SHAPE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Shape"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Shape
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_TEXT_FEATURE	TokenNameIdentifier	 SVG  SV G11  TEXT  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Text"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Text
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_TEXT_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  TEXT  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicText"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicText
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_PAINT_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  PAINT  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#PaintAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#PaintAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_PAINT_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  PAINT  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicPaintAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicPaintAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_OPACITY_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  OPACITY  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#OpacityAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#OpacityAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_GRAPHICS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  GRAPHICS  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#GraphicsAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#GraphicsAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_GRAPHICS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  GRAPHICS  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicGraphicsAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicGraphicsAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_MARKER_FEATURE	TokenNameIdentifier	 SVG  SV G11  MARKER  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Marker"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Marker
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_COLOR_PROFILE_FEATURE	TokenNameIdentifier	 SVG  SV G11  COLOR  PROFILE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#ColorProfile"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#ColorProfile
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_GRADIENT_FEATURE	TokenNameIdentifier	 SVG  SV G11  GRADIENT  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Gradient"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Gradient
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_PATTERN_FEATURE	TokenNameIdentifier	 SVG  SV G11  PATTERN  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Pattern"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Pattern
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_CLIP_FEATURE	TokenNameIdentifier	 SVG  SV G11  CLIP  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Clip"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Clip
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_CLIP_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  CLIP  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicClip"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicClip
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_MASK_FEATURE	TokenNameIdentifier	 SVG  SV G11  MASK  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Mask"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Mask
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_FILTER_FEATURE	TokenNameIdentifier	 SVG  SV G11  FILTER  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Filter"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Filter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_FILTER_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  FILTER  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicFilter"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicFilter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_DOCUMENT_EVENTS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  DOCUMENT  EVENTS  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#DocumentEventsAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#DocumentEventsAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_GRAPHICAL_EVENTS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  GRAPHICAL  EVENTS  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#GraphicalEventsAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#GraphicalEventsAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_ANIMATION_EVENTS_ATTRIBUTE_FEATURE	TokenNameIdentifier	 SVG  SV G11  ANIMATION  EVENTS  ATTRIBUTE  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#AnimationEventsAttribute"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#AnimationEventsAttribute
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_CURSOR_FEATURE	TokenNameIdentifier	 SVG  SV G11  CURSOR  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Cursor"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Cursor
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_HYPERLINKING_FEATURE	TokenNameIdentifier	 SVG  SV G11  HYPERLINKING  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Hyperlinking"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Hyperlinking
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_XLINK_FEATURE	TokenNameIdentifier	 SVG  SV G11  XLINK  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Xlink"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Xlink
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_EXTERNAL_RESOURCES_REQUIRED_FEATURE	TokenNameIdentifier	 SVG  SV G11  EXTERNAL  RESOURCES  REQUIRED  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#ExternalResourcesRequired"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#ExternalResourcesRequired
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_VIEW_FEATURE	TokenNameIdentifier	 SVG  SV G11  VIEW  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#View"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#View
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_SCRIPT_FEATURE	TokenNameIdentifier	 SVG  SV G11  SCRIPT  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Script"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Script
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_ANIMATION_FEATURE	TokenNameIdentifier	 SVG  SV G11  ANIMATION  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Animation"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Animation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_FONT_FEATURE	TokenNameIdentifier	 SVG  SV G11  FONT  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Font"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Font
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_BASIC_FONT_FEATURE	TokenNameIdentifier	 SVG  SV G11  BASIC  FONT  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#BasicFont"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#BasicFont
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG11_EXTENSIBILITY_FEATURE	TokenNameIdentifier	 SVG  SV G11  EXTENSIBILITY  FEATURE
=	TokenNameEQUAL	
"http://www.w3.org/TR/SVG11/feature#Extensibility"	TokenNameStringLiteral	http://www.w3.org/TR/SVG11/feature#Extensibility
;	TokenNameSEMICOLON	
// TODO SVG 1.2 feature strings 	TokenNameCOMMENT_LINE	TODO SVG 1.2 feature strings 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG tags 	TokenNameCOMMENT_LINE	SVG tags 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
SVG_A_TAG	TokenNameIdentifier	 SVG  A  TAG
=	TokenNameEQUAL	
"a"	TokenNameStringLiteral	a
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ALT_GLYPH_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  TAG
=	TokenNameEQUAL	
"altGlyph"	TokenNameStringLiteral	altGlyph
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ALT_GLYPH_DEF_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  DEF  TAG
=	TokenNameEQUAL	
"altGlyphDef"	TokenNameStringLiteral	altGlyphDef
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ALT_GLYPH_ITEM_TAG	TokenNameIdentifier	 SVG  ALT  GLYPH  ITEM  TAG
=	TokenNameEQUAL	
"altGlyphItem"	TokenNameStringLiteral	altGlyphItem
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ANIMATE_TAG	TokenNameIdentifier	 SVG  ANIMATE  TAG
=	TokenNameEQUAL	
"animate"	TokenNameStringLiteral	animate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ANIMATE_COLOR_TAG	TokenNameIdentifier	 SVG  ANIMATE  COLOR  TAG
=	TokenNameEQUAL	
"animateColor"	TokenNameStringLiteral	animateColor
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ANIMATE_MOTION_TAG	TokenNameIdentifier	 SVG  ANIMATE  MOTION  TAG
=	TokenNameEQUAL	
"animateMotion"	TokenNameStringLiteral	animateMotion
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ANIMATE_TRANSFORM_TAG	TokenNameIdentifier	 SVG  ANIMATE  TRANSFORM  TAG
=	TokenNameEQUAL	
"animateTransform"	TokenNameStringLiteral	animateTransform
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CIRCLE_TAG	TokenNameIdentifier	 SVG  CIRCLE  TAG
=	TokenNameEQUAL	
"circle"	TokenNameStringLiteral	circle
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CLIP_PATH_TAG	TokenNameIdentifier	 SVG  CLIP  PATH  TAG
=	TokenNameEQUAL	
"clipPath"	TokenNameStringLiteral	clipPath
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COLOR_PROFILE_TAG	TokenNameIdentifier	 SVG  COLOR  PROFILE  TAG
=	TokenNameEQUAL	
"color-profile"	TokenNameStringLiteral	color-profile
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CURSOR_TAG	TokenNameIdentifier	 SVG  CURSOR  TAG
=	TokenNameEQUAL	
"cursor"	TokenNameStringLiteral	cursor
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DEFINITION_SRC_TAG	TokenNameIdentifier	 SVG  DEFINITION  SRC  TAG
=	TokenNameEQUAL	
"definition-src"	TokenNameStringLiteral	definition-src
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DEFS_TAG	TokenNameIdentifier	 SVG  DEFS  TAG
=	TokenNameEQUAL	
"defs"	TokenNameStringLiteral	defs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DESC_TAG	TokenNameIdentifier	 SVG  DESC  TAG
=	TokenNameEQUAL	
"desc"	TokenNameStringLiteral	desc
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ELLIPSE_TAG	TokenNameIdentifier	 SVG  ELLIPSE  TAG
=	TokenNameEQUAL	
"ellipse"	TokenNameStringLiteral	ellipse
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_BLEND_TAG	TokenNameIdentifier	 SVG  FE  BLEND  TAG
=	TokenNameEQUAL	
"feBlend"	TokenNameStringLiteral	feBlend
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COLOR_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  COLOR  MATRIX  TAG
=	TokenNameEQUAL	
"feColorMatrix"	TokenNameStringLiteral	feColorMatrix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPONENT_TRANSFER_TAG	TokenNameIdentifier	 SVG  FE  COMPONENT  TRANSFER  TAG
=	TokenNameEQUAL	
"feComponentTransfer"	TokenNameStringLiteral	feComponentTransfer
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPOSITE_TAG	TokenNameIdentifier	 SVG  FE  COMPOSITE  TAG
=	TokenNameEQUAL	
"feComposite"	TokenNameStringLiteral	feComposite
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_CONVOLVE_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  CONVOLVE  MATRIX  TAG
=	TokenNameEQUAL	
"feConvolveMatrix"	TokenNameStringLiteral	feConvolveMatrix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DIFFUSE_LIGHTING_TAG	TokenNameIdentifier	 SVG  FE  DIFFUSE  LIGHTING  TAG
=	TokenNameEQUAL	
"feDiffuseLighting"	TokenNameStringLiteral	feDiffuseLighting
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DISPLACEMENT_MAP_TAG	TokenNameIdentifier	 SVG  FE  DISPLACEMENT  MAP  TAG
=	TokenNameEQUAL	
"feDisplacementMap"	TokenNameStringLiteral	feDisplacementMap
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DISTANT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  DISTANT  LIGHT  TAG
=	TokenNameEQUAL	
"feDistantLight"	TokenNameStringLiteral	feDistantLight
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_FLOOD_TAG	TokenNameIdentifier	 SVG  FE  FLOOD  TAG
=	TokenNameEQUAL	
"feFlood"	TokenNameStringLiteral	feFlood
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_FUNC_A_TAG	TokenNameIdentifier	 SVG  FE  FUNC  A  TAG
=	TokenNameEQUAL	
"feFuncA"	TokenNameStringLiteral	feFuncA
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_FUNC_B_TAG	TokenNameIdentifier	 SVG  FE  FUNC  B  TAG
=	TokenNameEQUAL	
"feFuncB"	TokenNameStringLiteral	feFuncB
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_FUNC_G_TAG	TokenNameIdentifier	 SVG  FE  FUNC  G  TAG
=	TokenNameEQUAL	
"feFuncG"	TokenNameStringLiteral	feFuncG
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_FUNC_R_TAG	TokenNameIdentifier	 SVG  FE  FUNC  R  TAG
=	TokenNameEQUAL	
"feFuncR"	TokenNameStringLiteral	feFuncR
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_GAUSSIAN_BLUR_TAG	TokenNameIdentifier	 SVG  FE  GAUSSIAN  BLUR  TAG
=	TokenNameEQUAL	
"feGaussianBlur"	TokenNameStringLiteral	feGaussianBlur
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_IMAGE_TAG	TokenNameIdentifier	 SVG  FE  IMAGE  TAG
=	TokenNameEQUAL	
"feImage"	TokenNameStringLiteral	feImage
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_MERGE_NODE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  NODE  TAG
=	TokenNameEQUAL	
"feMergeNode"	TokenNameStringLiteral	feMergeNode
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_MERGE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  TAG
=	TokenNameEQUAL	
"feMerge"	TokenNameStringLiteral	feMerge
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_MORPHOLOGY_TAG	TokenNameIdentifier	 SVG  FE  MORPHOLOGY  TAG
=	TokenNameEQUAL	
"feMorphology"	TokenNameStringLiteral	feMorphology
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_OFFSET_TAG	TokenNameIdentifier	 SVG  FE  OFFSET  TAG
=	TokenNameEQUAL	
"feOffset"	TokenNameStringLiteral	feOffset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_POINT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  POINT  LIGHT  TAG
=	TokenNameEQUAL	
"fePointLight"	TokenNameStringLiteral	fePointLight
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPECULAR_LIGHTING_TAG	TokenNameIdentifier	 SVG  FE  SPECULAR  LIGHTING  TAG
=	TokenNameEQUAL	
"feSpecularLighting"	TokenNameStringLiteral	feSpecularLighting
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  TAG
=	TokenNameEQUAL	
"feSpotLight"	TokenNameStringLiteral	feSpotLight
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_TILE_TAG	TokenNameIdentifier	 SVG  FE  TILE  TAG
=	TokenNameEQUAL	
"feTile"	TokenNameStringLiteral	feTile
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_TURBULENCE_TAG	TokenNameIdentifier	 SVG  FE  TURBULENCE  TAG
=	TokenNameEQUAL	
"feTurbulence"	TokenNameStringLiteral	feTurbulence
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_TAG	TokenNameIdentifier	 SVG  FILTER  TAG
=	TokenNameEQUAL	
"filter"	TokenNameStringLiteral	filter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_TAG	TokenNameIdentifier	 SVG  FONT  TAG
=	TokenNameEQUAL	
"font"	TokenNameStringLiteral	font
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
=	TokenNameEQUAL	
"font-face"	TokenNameStringLiteral	font-face
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_FORMAT_TAG	TokenNameIdentifier	 SVG  FONT  FACE  FORMAT  TAG
=	TokenNameEQUAL	
"font-face-format"	TokenNameStringLiteral	font-face-format
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_NAME_TAG	TokenNameIdentifier	 SVG  FONT  FACE  NAME  TAG
=	TokenNameEQUAL	
"font-face-name"	TokenNameStringLiteral	font-face-name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_SRC_TAG	TokenNameIdentifier	 SVG  FONT  FACE  SRC  TAG
=	TokenNameEQUAL	
"font-face-src"	TokenNameStringLiteral	font-face-src
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_URI_TAG	TokenNameIdentifier	 SVG  FONT  FACE  URI  TAG
=	TokenNameEQUAL	
"font-face-uri"	TokenNameStringLiteral	font-face-uri
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FOREIGN_OBJECT_TAG	TokenNameIdentifier	 SVG  FOREIGN  OBJECT  TAG
=	TokenNameEQUAL	
"foreignObject"	TokenNameStringLiteral	foreignObject
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
=	TokenNameEQUAL	
"g"	TokenNameStringLiteral	g
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GLYPH_TAG	TokenNameIdentifier	 SVG  GLYPH  TAG
=	TokenNameEQUAL	
"glyph"	TokenNameStringLiteral	glyph
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GLYPH_REF_TAG	TokenNameIdentifier	 SVG  GLYPH  REF  TAG
=	TokenNameEQUAL	
"glyphRef"	TokenNameStringLiteral	glyphRef
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HKERN_TAG	TokenNameIdentifier	 SVG  HKERN  TAG
=	TokenNameEQUAL	
"hkern"	TokenNameStringLiteral	hkern
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IMAGE_TAG	TokenNameIdentifier	 SVG  IMAGE  TAG
=	TokenNameEQUAL	
"image"	TokenNameStringLiteral	image
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINE_TAG	TokenNameIdentifier	 SVG  LINE  TAG
=	TokenNameEQUAL	
"line"	TokenNameStringLiteral	line
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_GRADIENT_TAG	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  TAG
=	TokenNameEQUAL	
"linearGradient"	TokenNameStringLiteral	linearGradient
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_TAG	TokenNameIdentifier	 SVG  MARKER  TAG
=	TokenNameEQUAL	
"marker"	TokenNameStringLiteral	marker
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_TAG	TokenNameIdentifier	 SVG  MASK  TAG
=	TokenNameEQUAL	
"mask"	TokenNameStringLiteral	mask
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_METADATA_TAG	TokenNameIdentifier	 SVG  METADATA  TAG
=	TokenNameEQUAL	
"metadata"	TokenNameStringLiteral	metadata
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MISSING_GLYPH_TAG	TokenNameIdentifier	 SVG  MISSING  GLYPH  TAG
=	TokenNameEQUAL	
"missing-glyph"	TokenNameStringLiteral	missing-glyph
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MPATH_TAG	TokenNameIdentifier	 SVG  MPATH  TAG
=	TokenNameEQUAL	
"mpath"	TokenNameStringLiteral	mpath
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATH_TAG	TokenNameIdentifier	 SVG  PATH  TAG
=	TokenNameEQUAL	
"path"	TokenNameStringLiteral	path
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_TAG	TokenNameIdentifier	 SVG  PATTERN  TAG
=	TokenNameEQUAL	
"pattern"	TokenNameStringLiteral	pattern
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POLYGON_TAG	TokenNameIdentifier	 SVG  POLYGON  TAG
=	TokenNameEQUAL	
"polygon"	TokenNameStringLiteral	polygon
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POLYLINE_TAG	TokenNameIdentifier	 SVG  POLYLINE  TAG
=	TokenNameEQUAL	
"polyline"	TokenNameStringLiteral	polyline
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RADIAL_GRADIENT_TAG	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  TAG
=	TokenNameEQUAL	
"radialGradient"	TokenNameStringLiteral	radialGradient
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
=	TokenNameEQUAL	
"rect"	TokenNameStringLiteral	rect
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SET_TAG	TokenNameIdentifier	 SVG  SET  TAG
=	TokenNameEQUAL	
"set"	TokenNameStringLiteral	set
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TAG	TokenNameIdentifier	 SVG  SCRIPT  TAG
=	TokenNameEQUAL	
"script"	TokenNameStringLiteral	script
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STOP_TAG	TokenNameIdentifier	 SVG  STOP  TAG
=	TokenNameEQUAL	
"stop"	TokenNameStringLiteral	stop
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STYLE_TAG	TokenNameIdentifier	 SVG  STYLE  TAG
=	TokenNameEQUAL	
"style"	TokenNameStringLiteral	style
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG_TAG	TokenNameIdentifier	 SVG  SVG  TAG
=	TokenNameEQUAL	
"svg"	TokenNameStringLiteral	svg
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SWITCH_TAG	TokenNameIdentifier	 SVG  SWITCH  TAG
=	TokenNameEQUAL	
"switch"	TokenNameStringLiteral	switch
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SYMBOL_TAG	TokenNameIdentifier	 SVG  SYMBOL  TAG
=	TokenNameEQUAL	
"symbol"	TokenNameStringLiteral	symbol
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_PATH_TAG	TokenNameIdentifier	 SVG  TEXT  PATH  TAG
=	TokenNameEQUAL	
"textPath"	TokenNameStringLiteral	textPath
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_TAG	TokenNameIdentifier	 SVG  TEXT  TAG
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TITLE_TAG	TokenNameIdentifier	 SVG  TITLE  TAG
=	TokenNameEQUAL	
"title"	TokenNameStringLiteral	title
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TREF_TAG	TokenNameIdentifier	 SVG  TREF  TAG
=	TokenNameEQUAL	
"tref"	TokenNameStringLiteral	tref
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TSPAN_TAG	TokenNameIdentifier	 SVG  TSPAN  TAG
=	TokenNameEQUAL	
"tspan"	TokenNameStringLiteral	tspan
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_USE_TAG	TokenNameIdentifier	 SVG  USE  TAG
=	TokenNameEQUAL	
"use"	TokenNameStringLiteral	use
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VIEW_TAG	TokenNameIdentifier	 SVG  VIEW  TAG
=	TokenNameEQUAL	
"view"	TokenNameStringLiteral	view
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VKERN_TAG	TokenNameIdentifier	 SVG  VKERN  TAG
=	TokenNameEQUAL	
"vkern"	TokenNameStringLiteral	vkern
;	TokenNameSEMICOLON	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG attributes 	TokenNameCOMMENT_LINE	SVG attributes 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
SVG_ACCENT_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  ACCENT  HEIGHT  ATTRIBUTE
=	TokenNameEQUAL	
"accent-height"	TokenNameStringLiteral	accent-height
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ACCUMULATE_ATTRIBUTE	TokenNameIdentifier	 SVG  ACCUMULATE  ATTRIBUTE
=	TokenNameEQUAL	
"accumulate"	TokenNameStringLiteral	accumulate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ADDITIVE_ATTRIBUTE	TokenNameIdentifier	 SVG  ADDITIVE  ATTRIBUTE
=	TokenNameEQUAL	
"additive"	TokenNameStringLiteral	additive
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_AMPLITUDE_ATTRIBUTE	TokenNameIdentifier	 SVG  AMPLITUDE  ATTRIBUTE
=	TokenNameEQUAL	
"amplitude"	TokenNameStringLiteral	amplitude
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ARABIC_FORM_ATTRIBUTE	TokenNameIdentifier	 SVG  ARABIC  FORM  ATTRIBUTE
=	TokenNameEQUAL	
"arabic-form"	TokenNameStringLiteral	arabic-form
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ASCENT_ATTRIBUTE	TokenNameIdentifier	 SVG  ASCENT  ATTRIBUTE
=	TokenNameEQUAL	
"ascent"	TokenNameStringLiteral	ascent
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_AZIMUTH_ATTRIBUTE	TokenNameIdentifier	 SVG  AZIMUTH  ATTRIBUTE
=	TokenNameEQUAL	
"azimuth"	TokenNameStringLiteral	azimuth
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ALPHABETIC_ATTRIBUTE	TokenNameIdentifier	 SVG  ALPHABETIC  ATTRIBUTE
=	TokenNameEQUAL	
"alphabetic"	TokenNameStringLiteral	alphabetic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ATTRIBUTE_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  ATTRIBUTE  NAME  ATTRIBUTE
=	TokenNameEQUAL	
"attributeName"	TokenNameStringLiteral	attributeName
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ATTRIBUTE_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  ATTRIBUTE  TYPE  ATTRIBUTE
=	TokenNameEQUAL	
"attributeType"	TokenNameStringLiteral	attributeType
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BASE_FREQUENCY_ATTRIBUTE	TokenNameIdentifier	 SVG  BASE  FREQUENCY  ATTRIBUTE
=	TokenNameEQUAL	
"baseFrequency"	TokenNameStringLiteral	baseFrequency
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BASE_PROFILE_ATTRIBUTE	TokenNameIdentifier	 SVG  BASE  PROFILE  ATTRIBUTE
=	TokenNameEQUAL	
"baseProfile"	TokenNameStringLiteral	baseProfile
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BEGIN_ATTRIBUTE	TokenNameIdentifier	 SVG  BEGIN  ATTRIBUTE
=	TokenNameEQUAL	
"begin"	TokenNameStringLiteral	begin
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BBOX_ATTRIBUTE	TokenNameIdentifier	 SVG  BBOX  ATTRIBUTE
=	TokenNameEQUAL	
"bbox"	TokenNameStringLiteral	bbox
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BIAS_ATTRIBUTE	TokenNameIdentifier	 SVG  BIAS  ATTRIBUTE
=	TokenNameEQUAL	
"bias"	TokenNameStringLiteral	bias
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BY_ATTRIBUTE	TokenNameIdentifier	 SVG  BY  ATTRIBUTE
=	TokenNameEQUAL	
"by"	TokenNameStringLiteral	by
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CALC_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  CALC  MODE  ATTRIBUTE
=	TokenNameEQUAL	
"calcMode"	TokenNameStringLiteral	calcMode
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CAP_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  CAP  HEIGHT  ATTRIBUTE
=	TokenNameEQUAL	
"cap-height"	TokenNameStringLiteral	cap-height
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CLASS_ATTRIBUTE	TokenNameIdentifier	 SVG  CLASS  ATTRIBUTE
=	TokenNameEQUAL	
"class"	TokenNameStringLiteral	class
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CLIP_PATH_ATTRIBUTE	TokenNameIdentifier	 SVG  CLIP  PATH  ATTRIBUTE
=	TokenNameEQUAL	
CSS_CLIP_PATH_PROPERTY	TokenNameIdentifier	 CSS  CLIP  PATH  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CLIP_PATH_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  CLIP  PATH  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"clipPathUnits"	TokenNameStringLiteral	clipPathUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COLOR_INTERPOLATION_ATTRIBUTE	TokenNameIdentifier	 SVG  COLOR  INTERPOLATION  ATTRIBUTE
=	TokenNameEQUAL	
CSS_COLOR_INTERPOLATION_PROPERTY	TokenNameIdentifier	 CSS  COLOR  INTERPOLATION  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COLOR_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  COLOR  RENDERING  ATTRIBUTE
=	TokenNameEQUAL	
CSS_COLOR_RENDERING_PROPERTY	TokenNameIdentifier	 CSS  COLOR  RENDERING  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CONTENT_SCRIPT_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  CONTENT  SCRIPT  TYPE  ATTRIBUTE
=	TokenNameEQUAL	
"contentScriptType"	TokenNameStringLiteral	contentScriptType
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CONTENT_STYLE_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  CONTENT  STYLE  TYPE  ATTRIBUTE
=	TokenNameEQUAL	
"contentStyleType"	TokenNameStringLiteral	contentStyleType
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CX_ATTRIBUTE	TokenNameIdentifier	 SVG  CX  ATTRIBUTE
=	TokenNameEQUAL	
"cx"	TokenNameStringLiteral	cx
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CY_ATTRIBUTE	TokenNameIdentifier	 SVG  CY  ATTRIBUTE
=	TokenNameEQUAL	
"cy"	TokenNameStringLiteral	cy
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DESCENT_ATTRIBUTE	TokenNameIdentifier	 SVG  DESCENT  ATTRIBUTE
=	TokenNameEQUAL	
"descent"	TokenNameStringLiteral	descent
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DIFFUSE_CONSTANT_ATTRIBUTE	TokenNameIdentifier	 SVG  DIFFUSE  CONSTANT  ATTRIBUTE
=	TokenNameEQUAL	
"diffuseConstant"	TokenNameStringLiteral	diffuseConstant
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DIVISOR_ATTRIBUTE	TokenNameIdentifier	 SVG  DIVISOR  ATTRIBUTE
=	TokenNameEQUAL	
"divisor"	TokenNameStringLiteral	divisor
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DUR_ATTRIBUTE	TokenNameIdentifier	 SVG  DUR  ATTRIBUTE
=	TokenNameEQUAL	
"dur"	TokenNameStringLiteral	dur
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DX_ATTRIBUTE	TokenNameIdentifier	 SVG  DX  ATTRIBUTE
=	TokenNameEQUAL	
"dx"	TokenNameStringLiteral	dx
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DY_ATTRIBUTE	TokenNameIdentifier	 SVG  DY  ATTRIBUTE
=	TokenNameEQUAL	
"dy"	TokenNameStringLiteral	dy
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
=	TokenNameEQUAL	
"d"	TokenNameStringLiteral	d
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EDGE_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  EDGE  MODE  ATTRIBUTE
=	TokenNameEQUAL	
"edgeMode"	TokenNameStringLiteral	edgeMode
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ELEVATION_ATTRIBUTE	TokenNameIdentifier	 SVG  ELEVATION  ATTRIBUTE
=	TokenNameEQUAL	
"elevation"	TokenNameStringLiteral	elevation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ENABLE_BACKGROUND_ATTRIBUTE	TokenNameIdentifier	 SVG  ENABLE  BACKGROUND  ATTRIBUTE
=	TokenNameEQUAL	
CSS_ENABLE_BACKGROUND_PROPERTY	TokenNameIdentifier	 CSS  ENABLE  BACKGROUND  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_END_ATTRIBUTE	TokenNameIdentifier	 SVG  END  ATTRIBUTE
=	TokenNameEQUAL	
"end"	TokenNameStringLiteral	end
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EXPONENT_ATTRIBUTE	TokenNameIdentifier	 SVG  EXPONENT  ATTRIBUTE
=	TokenNameEQUAL	
"exponent"	TokenNameStringLiteral	exponent
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EXTERNAL_RESOURCES_REQUIRED_ATTRIBUTE	TokenNameIdentifier	 SVG  EXTERNAL  RESOURCES  REQUIRED  ATTRIBUTE
=	TokenNameEQUAL	
"externalResourcesRequired"	TokenNameStringLiteral	externalResourcesRequired
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILL_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FILL_PROPERTY	TokenNameIdentifier	 CSS  FILL  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILL_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  OPACITY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FILL_OPACITY_PROPERTY	TokenNameIdentifier	 CSS  FILL  OPACITY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILL_RULE_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  RULE  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FILL_RULE_PROPERTY	TokenNameIdentifier	 CSS  FILL  RULE  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FILTER_PROPERTY	TokenNameIdentifier	 CSS  FILTER  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_RES_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  RES  ATTRIBUTE
=	TokenNameEQUAL	
"filterRes"	TokenNameStringLiteral	filterRes
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"filterUnits"	TokenNameStringLiteral	filterUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FLOOD_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  FLOOD  COLOR  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FLOOD_COLOR_PROPERTY	TokenNameIdentifier	 CSS  FLOOD  COLOR  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FLOOD_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  FLOOD  OPACITY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FLOOD_OPACITY_PROPERTY	TokenNameIdentifier	 CSS  FLOOD  OPACITY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FORMAT_ATTRIBUTE	TokenNameIdentifier	 SVG  FORMAT  ATTRIBUTE
=	TokenNameEQUAL	
"format"	TokenNameStringLiteral	format
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FAMILY_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  FAMILY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FONT_FAMILY_PROPERTY	TokenNameIdentifier	 CSS  FONT  FAMILY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_SIZE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  SIZE  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FONT_SIZE_PROPERTY	TokenNameIdentifier	 CSS  FONT  SIZE  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_STRETCH_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STRETCH  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FONT_STRETCH_PROPERTY	TokenNameIdentifier	 CSS  FONT  STRETCH  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STYLE  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FONT_STYLE_PROPERTY	TokenNameIdentifier	 CSS  FONT  STYLE  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_VARIANT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  VARIANT  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FONT_VARIANT_PROPERTY	TokenNameIdentifier	 CSS  FONT  VARIANT  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_WEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  WEIGHT  ATTRIBUTE
=	TokenNameEQUAL	
CSS_FONT_WEIGHT_PROPERTY	TokenNameIdentifier	 CSS  FONT  WEIGHT  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FROM_ATTRIBUTE	TokenNameIdentifier	 SVG  FROM  ATTRIBUTE
=	TokenNameEQUAL	
"from"	TokenNameStringLiteral	from
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FX_ATTRIBUTE	TokenNameIdentifier	 SVG  FX  ATTRIBUTE
=	TokenNameEQUAL	
"fx"	TokenNameStringLiteral	fx
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FY_ATTRIBUTE	TokenNameIdentifier	 SVG  FY  ATTRIBUTE
=	TokenNameEQUAL	
"fy"	TokenNameStringLiteral	fy
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_G1_ATTRIBUTE	TokenNameIdentifier	 SVG  G1  ATTRIBUTE
=	TokenNameEQUAL	
"g1"	TokenNameStringLiteral	g1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_G2_ATTRIBUTE	TokenNameIdentifier	 SVG  G2  ATTRIBUTE
=	TokenNameEQUAL	
"g2"	TokenNameStringLiteral	g2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GLYPH_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  GLYPH  NAME  ATTRIBUTE
=	TokenNameEQUAL	
"glyph-name"	TokenNameStringLiteral	glyph-name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GLYPH_REF_ATTRIBUTE	TokenNameIdentifier	 SVG  GLYPH  REF  ATTRIBUTE
=	TokenNameEQUAL	
"glyphRef"	TokenNameStringLiteral	glyphRef
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GRADIENT_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  TRANSFORM  ATTRIBUTE
=	TokenNameEQUAL	
"gradientTransform"	TokenNameStringLiteral	gradientTransform
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GRADIENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  GRADIENT  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"gradientUnits"	TokenNameStringLiteral	gradientUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HANGING_ATTRIBUTE	TokenNameIdentifier	 SVG  HANGING  ATTRIBUTE
=	TokenNameEQUAL	
"hanging"	TokenNameStringLiteral	hanging
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
=	TokenNameEQUAL	
"height"	TokenNameStringLiteral	height
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HORIZ_ADV_X_ATTRIBUTE	TokenNameIdentifier	 SVG  HORIZ  ADV  X  ATTRIBUTE
=	TokenNameEQUAL	
"horiz-adv-x"	TokenNameStringLiteral	horiz-adv-x
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HORIZ_ORIGIN_X_ATTRIBUTE	TokenNameIdentifier	 SVG  HORIZ  ORIGIN  X  ATTRIBUTE
=	TokenNameEQUAL	
"horiz-origin-x"	TokenNameStringLiteral	horiz-origin-x
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HORIZ_ORIGIN_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  HORIZ  ORIGIN  Y  ATTRIBUTE
=	TokenNameEQUAL	
"horiz-origin-y"	TokenNameStringLiteral	horiz-origin-y
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
=	TokenNameEQUAL	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_ID_ATTRIBUTE	TokenNameIdentifier	 XML  ID  ATTRIBUTE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IDEOGRAPHIC_ATTRIBUTE	TokenNameIdentifier	 SVG  IDEOGRAPHIC  ATTRIBUTE
=	TokenNameEQUAL	
"ideographic"	TokenNameStringLiteral	ideographic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IMAGE_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  IMAGE  RENDERING  ATTRIBUTE
=	TokenNameEQUAL	
CSS_IMAGE_RENDERING_PROPERTY	TokenNameIdentifier	 CSS  IMAGE  RENDERING  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IN2_ATTRIBUTE	TokenNameIdentifier	 SVG  I N2  ATTRIBUTE
=	TokenNameEQUAL	
"in2"	TokenNameStringLiteral	in2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_INTERCEPT_ATTRIBUTE	TokenNameIdentifier	 SVG  INTERCEPT  ATTRIBUTE
=	TokenNameEQUAL	
"intercept"	TokenNameStringLiteral	intercept
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
=	TokenNameEQUAL	
"in"	TokenNameStringLiteral	in
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_K_ATTRIBUTE	TokenNameIdentifier	 SVG  K  ATTRIBUTE
=	TokenNameEQUAL	
"k"	TokenNameStringLiteral	k
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_K1_ATTRIBUTE	TokenNameIdentifier	 SVG  K1  ATTRIBUTE
=	TokenNameEQUAL	
"k1"	TokenNameStringLiteral	k1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_K2_ATTRIBUTE	TokenNameIdentifier	 SVG  K2  ATTRIBUTE
=	TokenNameEQUAL	
"k2"	TokenNameStringLiteral	k2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_K3_ATTRIBUTE	TokenNameIdentifier	 SVG  K3  ATTRIBUTE
=	TokenNameEQUAL	
"k3"	TokenNameStringLiteral	k3
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_K4_ATTRIBUTE	TokenNameIdentifier	 SVG  K4  ATTRIBUTE
=	TokenNameEQUAL	
"k4"	TokenNameStringLiteral	k4
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KERNEL_MATRIX_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  MATRIX  ATTRIBUTE
=	TokenNameEQUAL	
"kernelMatrix"	TokenNameStringLiteral	kernelMatrix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  UNIT  LENGTH  ATTRIBUTE
=	TokenNameEQUAL	
"kernelUnitLength"	TokenNameStringLiteral	kernelUnitLength
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KERNING_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNING  ATTRIBUTE
=	TokenNameEQUAL	
CSS_KERNING_PROPERTY	TokenNameIdentifier	 CSS  KERNING  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KEY_POINTS_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  POINTS  ATTRIBUTE
=	TokenNameEQUAL	
"keyPoints"	TokenNameStringLiteral	keyPoints
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KEY_SPLINES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  SPLINES  ATTRIBUTE
=	TokenNameEQUAL	
"keySplines"	TokenNameStringLiteral	keySplines
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KEY_TIMES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  TIMES  ATTRIBUTE
=	TokenNameEQUAL	
"keyTimes"	TokenNameStringLiteral	keyTimes
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LANG_ATTRIBUTE	TokenNameIdentifier	 SVG  LANG  ATTRIBUTE
=	TokenNameEQUAL	
"lang"	TokenNameStringLiteral	lang
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LENGTH_ADJUST_ATTRIBUTE	TokenNameIdentifier	 SVG  LENGTH  ADJUST  ATTRIBUTE
=	TokenNameEQUAL	
"lengthAdjust"	TokenNameStringLiteral	lengthAdjust
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LIGHT_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  LIGHT  COLOR  ATTRIBUTE
=	TokenNameEQUAL	
"lightColor"	TokenNameStringLiteral	lightColor
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LIGHTING_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  LIGHTING  COLOR  ATTRIBUTE
=	TokenNameEQUAL	
"lighting-color"	TokenNameStringLiteral	lighting-color
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LIMITING_CONE_ANGLE_ATTRIBUTE	TokenNameIdentifier	 SVG  LIMITING  CONE  ANGLE  ATTRIBUTE
=	TokenNameEQUAL	
"limitingConeAngle"	TokenNameStringLiteral	limitingConeAngle
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LOCAL_ATTRIBUTE	TokenNameIdentifier	 SVG  LOCAL  ATTRIBUTE
=	TokenNameEQUAL	
"local"	TokenNameStringLiteral	local
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  MARKER  HEIGHT  ATTRIBUTE
=	TokenNameEQUAL	
"markerHeight"	TokenNameStringLiteral	markerHeight
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  MARKER  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"markerUnits"	TokenNameStringLiteral	markerUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  MARKER  WIDTH  ATTRIBUTE
=	TokenNameEQUAL	
"markerWidth"	TokenNameStringLiteral	markerWidth
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_ATTRIBUTE	TokenNameIdentifier	 SVG  MASK  ATTRIBUTE
=	TokenNameEQUAL	
CSS_MASK_PROPERTY	TokenNameIdentifier	 CSS  MASK  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_CONTENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  MASK  CONTENT  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"maskContentUnits"	TokenNameStringLiteral	maskContentUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  MASK  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"maskUnits"	TokenNameStringLiteral	maskUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MATHEMATICAL_ATTRIBUTE	TokenNameIdentifier	 SVG  MATHEMATICAL  ATTRIBUTE
=	TokenNameEQUAL	
"mathematical"	TokenNameStringLiteral	mathematical
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MAX_ATTRIBUTE	TokenNameIdentifier	 SVG  MAX  ATTRIBUTE
=	TokenNameEQUAL	
"max"	TokenNameStringLiteral	max
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MEDIA_ATTRIBUTE	TokenNameIdentifier	 SVG  MEDIA  ATTRIBUTE
=	TokenNameEQUAL	
"media"	TokenNameStringLiteral	media
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  METHOD  ATTRIBUTE
=	TokenNameEQUAL	
"method"	TokenNameStringLiteral	method
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MIN_ATTRIBUTE	TokenNameIdentifier	 SVG  MIN  ATTRIBUTE
=	TokenNameEQUAL	
"min"	TokenNameStringLiteral	min
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  MODE  ATTRIBUTE
=	TokenNameEQUAL	
"mode"	TokenNameStringLiteral	mode
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  NAME  ATTRIBUTE
=	TokenNameEQUAL	
"name"	TokenNameStringLiteral	name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NUM_OCTAVES_ATTRIBUTE	TokenNameIdentifier	 SVG  NUM  OCTAVES  ATTRIBUTE
=	TokenNameEQUAL	
"numOctaves"	TokenNameStringLiteral	numOctaves
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  OFFSET  ATTRIBUTE
=	TokenNameEQUAL	
"offset"	TokenNameStringLiteral	offset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  OPACITY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_OPACITY_PROPERTY	TokenNameIdentifier	 CSS  OPACITY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OPERATOR_ATTRIBUTE	TokenNameIdentifier	 SVG  OPERATOR  ATTRIBUTE
=	TokenNameEQUAL	
"operator"	TokenNameStringLiteral	operator
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORDER_ATTRIBUTE	TokenNameIdentifier	 SVG  ORDER  ATTRIBUTE
=	TokenNameEQUAL	
"order"	TokenNameStringLiteral	order
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORDER_X_ATTRIBUTE	TokenNameIdentifier	 SVG  ORDER  X  ATTRIBUTE
=	TokenNameEQUAL	
"orderX"	TokenNameStringLiteral	orderX
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORDER_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  ORDER  Y  ATTRIBUTE
=	TokenNameEQUAL	
"orderY"	TokenNameStringLiteral	orderY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORIENT_ATTRIBUTE	TokenNameIdentifier	 SVG  ORIENT  ATTRIBUTE
=	TokenNameEQUAL	
"orient"	TokenNameStringLiteral	orient
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORIENTATION_ATTRIBUTE	TokenNameIdentifier	 SVG  ORIENTATION  ATTRIBUTE
=	TokenNameEQUAL	
"orientation"	TokenNameStringLiteral	orientation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ORIGIN_ATTRIBUTE	TokenNameIdentifier	 SVG  ORIGIN  ATTRIBUTE
=	TokenNameEQUAL	
"origin"	TokenNameStringLiteral	origin
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OVERLINE_POSITION_ATTRIBUTE	TokenNameIdentifier	 SVG  OVERLINE  POSITION  ATTRIBUTE
=	TokenNameEQUAL	
"overline-position"	TokenNameStringLiteral	overline-position
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OVERLINE_THICKNESS_ATTRIBUTE	TokenNameIdentifier	 SVG  OVERLINE  THICKNESS  ATTRIBUTE
=	TokenNameEQUAL	
"overline-thickness"	TokenNameStringLiteral	overline-thickness
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PANOSE_1_ATTRIBUTE	TokenNameIdentifier	 SVG  PANOSE 1  ATTRIBUTE
=	TokenNameEQUAL	
"panose-1"	TokenNameStringLiteral	panose-1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATH_ATTRIBUTE	TokenNameIdentifier	 SVG  PATH  ATTRIBUTE
=	TokenNameEQUAL	
"path"	TokenNameStringLiteral	path
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATH_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  PATH  LENGTH  ATTRIBUTE
=	TokenNameEQUAL	
"pathLength"	TokenNameStringLiteral	pathLength
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_CONTENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  PATTERN  CONTENT  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"patternContentUnits"	TokenNameStringLiteral	patternContentUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  PATTERN  TRANSFORM  ATTRIBUTE
=	TokenNameEQUAL	
"patternTransform"	TokenNameStringLiteral	patternTransform
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  PATTERN  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"patternUnits"	TokenNameStringLiteral	patternUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POINTS_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  ATTRIBUTE
=	TokenNameEQUAL	
"points"	TokenNameStringLiteral	points
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POINTS_AT_X_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  X  ATTRIBUTE
=	TokenNameEQUAL	
"pointsAtX"	TokenNameStringLiteral	pointsAtX
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POINTS_AT_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Y  ATTRIBUTE
=	TokenNameEQUAL	
"pointsAtY"	TokenNameStringLiteral	pointsAtY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POINTS_AT_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Z  ATTRIBUTE
=	TokenNameEQUAL	
"pointsAtZ"	TokenNameStringLiteral	pointsAtZ
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PRESERVE_ALPHA_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ALPHA  ATTRIBUTE
=	TokenNameEQUAL	
"preserveAlpha"	TokenNameStringLiteral	preserveAlpha
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PRESERVE_ASPECT_RATIO_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ASPECT  RATIO  ATTRIBUTE
=	TokenNameEQUAL	
"preserveAspectRatio"	TokenNameStringLiteral	preserveAspectRatio
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PRIMITIVE_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  PRIMITIVE  UNITS  ATTRIBUTE
=	TokenNameEQUAL	
"primitiveUnits"	TokenNameStringLiteral	primitiveUnits
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RADIUS_ATTRIBUTE	TokenNameIdentifier	 SVG  RADIUS  ATTRIBUTE
=	TokenNameEQUAL	
"radius"	TokenNameStringLiteral	radius
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REF_X_ATTRIBUTE	TokenNameIdentifier	 SVG  REF  X  ATTRIBUTE
=	TokenNameEQUAL	
"refX"	TokenNameStringLiteral	refX
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REF_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  REF  Y  ATTRIBUTE
=	TokenNameEQUAL	
"refY"	TokenNameStringLiteral	refY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
=	TokenNameEQUAL	
"rendering-intent"	TokenNameStringLiteral	rendering-intent
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REPEAT_COUNT_ATTRIBUTE	TokenNameIdentifier	 SVG  REPEAT  COUNT  ATTRIBUTE
=	TokenNameEQUAL	
"repeatCount"	TokenNameStringLiteral	repeatCount
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REPEAT_DUR_ATTRIBUTE	TokenNameIdentifier	 SVG  REPEAT  DUR  ATTRIBUTE
=	TokenNameEQUAL	
"repeatDur"	TokenNameStringLiteral	repeatDur
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REQUIRED_FEATURES_ATTRIBUTE	TokenNameIdentifier	 SVG  REQUIRED  FEATURES  ATTRIBUTE
=	TokenNameEQUAL	
"requiredFeatures"	TokenNameStringLiteral	requiredFeatures
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REQUIRED_EXTENSIONS_ATTRIBUTE	TokenNameIdentifier	 SVG  REQUIRED  EXTENSIONS  ATTRIBUTE
=	TokenNameEQUAL	
"requiredExtensions"	TokenNameStringLiteral	requiredExtensions
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RESULT_ATTRIBUTE	TokenNameIdentifier	 SVG  RESULT  ATTRIBUTE
=	TokenNameEQUAL	
"result"	TokenNameStringLiteral	result
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RESULT_SCALE_ATTRIBUTE	TokenNameIdentifier	 SVG  RESULT  SCALE  ATTRIBUTE
=	TokenNameEQUAL	
"resultScale"	TokenNameStringLiteral	resultScale
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RESTART_ATTRIBUTE	TokenNameIdentifier	 SVG  RESTART  ATTRIBUTE
=	TokenNameEQUAL	
"restart"	TokenNameStringLiteral	restart
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RX_ATTRIBUTE	TokenNameIdentifier	 SVG  RX  ATTRIBUTE
=	TokenNameEQUAL	
"rx"	TokenNameStringLiteral	rx
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RY_ATTRIBUTE	TokenNameIdentifier	 SVG  RY  ATTRIBUTE
=	TokenNameEQUAL	
"ry"	TokenNameStringLiteral	ry
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_R_ATTRIBUTE	TokenNameIdentifier	 SVG  R  ATTRIBUTE
=	TokenNameEQUAL	
"r"	TokenNameStringLiteral	r
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ROTATE_ATTRIBUTE	TokenNameIdentifier	 SVG  ROTATE  ATTRIBUTE
=	TokenNameEQUAL	
"rotate"	TokenNameStringLiteral	rotate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCALE_ATTRIBUTE	TokenNameIdentifier	 SVG  SCALE  ATTRIBUTE
=	TokenNameEQUAL	
"scale"	TokenNameStringLiteral	scale
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SEED_ATTRIBUTE	TokenNameIdentifier	 SVG  SEED  ATTRIBUTE
=	TokenNameEQUAL	
"seed"	TokenNameStringLiteral	seed
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SHAPE_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  SHAPE  RENDERING  ATTRIBUTE
=	TokenNameEQUAL	
CSS_SHAPE_RENDERING_PROPERTY	TokenNameIdentifier	 CSS  SHAPE  RENDERING  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SLOPE_ATTRIBUTE	TokenNameIdentifier	 SVG  SLOPE  ATTRIBUTE
=	TokenNameEQUAL	
"slope"	TokenNameStringLiteral	slope
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SNAPSHOT_TIME_ATTRIBUTE	TokenNameIdentifier	 SVG  SNAPSHOT  TIME  ATTRIBUTE
=	TokenNameEQUAL	
"snapshotTime"	TokenNameStringLiteral	snapshotTime
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPACE_ATTRIBUTE	TokenNameIdentifier	 SVG  SPACE  ATTRIBUTE
=	TokenNameEQUAL	
"space"	TokenNameStringLiteral	space
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPACING_ATTRIBUTE	TokenNameIdentifier	 SVG  SPACING  ATTRIBUTE
=	TokenNameEQUAL	
"spacing"	TokenNameStringLiteral	spacing
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPECULAR_CONSTANT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  CONSTANT  ATTRIBUTE
=	TokenNameEQUAL	
"specularConstant"	TokenNameStringLiteral	specularConstant
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPECULAR_EXPONENT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  EXPONENT  ATTRIBUTE
=	TokenNameEQUAL	
"specularExponent"	TokenNameStringLiteral	specularExponent
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPREAD_METHOD_ATTRIBUTE	TokenNameIdentifier	 SVG  SPREAD  METHOD  ATTRIBUTE
=	TokenNameEQUAL	
"spreadMethod"	TokenNameStringLiteral	spreadMethod
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_START_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  START  OFFSET  ATTRIBUTE
=	TokenNameEQUAL	
"startOffset"	TokenNameStringLiteral	startOffset
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STD_DEVIATION_ATTRIBUTE	TokenNameIdentifier	 SVG  STD  DEVIATION  ATTRIBUTE
=	TokenNameEQUAL	
"stdDeviation"	TokenNameStringLiteral	stdDeviation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STEMH_ATTRIBUTE	TokenNameIdentifier	 SVG  STEMH  ATTRIBUTE
=	TokenNameEQUAL	
"stemh"	TokenNameStringLiteral	stemh
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STEMV_ATTRIBUTE	TokenNameIdentifier	 SVG  STEMV  ATTRIBUTE
=	TokenNameEQUAL	
"stemv"	TokenNameStringLiteral	stemv
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STITCH_TILES_ATTRIBUTE	TokenNameIdentifier	 SVG  STITCH  TILES  ATTRIBUTE
=	TokenNameEQUAL	
"stitchTiles"	TokenNameStringLiteral	stitchTiles
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STOP_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  COLOR  ATTRIBUTE
=	TokenNameEQUAL	
"stop-color"	TokenNameStringLiteral	stop-color
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STOP_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  STOP  OPACITY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STOP_OPACITY_PROPERTY	TokenNameIdentifier	 CSS  STOP  OPACITY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STRIKETHROUGH_POSITION_ATTRIBUTE	TokenNameIdentifier	 SVG  STRIKETHROUGH  POSITION  ATTRIBUTE
=	TokenNameEQUAL	
"strikethrough-position"	TokenNameStringLiteral	strikethrough-position
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STRIKETHROUGH_THICKNESS_ATTRIBUTE	TokenNameIdentifier	 SVG  STRIKETHROUGH  THICKNESS  ATTRIBUTE
=	TokenNameEQUAL	
"strikethrough-thickness"	TokenNameStringLiteral	strikethrough-thickness
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STRING_ATTRIBUTE	TokenNameIdentifier	 SVG  STRING  ATTRIBUTE
=	TokenNameEQUAL	
"string"	TokenNameStringLiteral	string
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_PROPERTY	TokenNameIdentifier	 CSS  STROKE  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_DASHARRAY_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  DASHARRAY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_DASHARRAY_PROPERTY	TokenNameIdentifier	 CSS  STROKE  DASHARRAY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_DASHOFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  DASHOFFSET  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_DASHOFFSET_PROPERTY	TokenNameIdentifier	 CSS  STROKE  DASHOFFSET  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_LINECAP_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  LINECAP  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_LINECAP_PROPERTY	TokenNameIdentifier	 CSS  STROKE  LINECAP  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_LINEJOIN_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  LINEJOIN  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_LINEJOIN_PROPERTY	TokenNameIdentifier	 CSS  STROKE  LINEJOIN  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_MITERLIMIT_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  MITERLIMIT  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_MITERLIMIT_PROPERTY	TokenNameIdentifier	 CSS  STROKE  MITERLIMIT  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  OPACITY  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_OPACITY_PROPERTY	TokenNameIdentifier	 CSS  STROKE  OPACITY  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  WIDTH  ATTRIBUTE
=	TokenNameEQUAL	
CSS_STROKE_WIDTH_PROPERTY	TokenNameIdentifier	 CSS  STROKE  WIDTH  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  STYLE  ATTRIBUTE
=	TokenNameEQUAL	
"style"	TokenNameStringLiteral	style
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SURFACE_SCALE_ATTRIBUTE	TokenNameIdentifier	 SVG  SURFACE  SCALE  ATTRIBUTE
=	TokenNameEQUAL	
"surfaceScale"	TokenNameStringLiteral	surfaceScale
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SYSTEM_LANGUAGE_ATTRIBUTE	TokenNameIdentifier	 SVG  SYSTEM  LANGUAGE  ATTRIBUTE
=	TokenNameEQUAL	
"systemLanguage"	TokenNameStringLiteral	systemLanguage
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TABLE_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  ATTRIBUTE
=	TokenNameEQUAL	
"table"	TokenNameStringLiteral	table
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TABLE_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  TABLE  VALUES  ATTRIBUTE
=	TokenNameEQUAL	
"tableValues"	TokenNameStringLiteral	tableValues
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TARGET_ATTRIBUTE	TokenNameIdentifier	 SVG  TARGET  ATTRIBUTE
=	TokenNameEQUAL	
"target"	TokenNameStringLiteral	target
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TARGET_X_ATTRIBUTE	TokenNameIdentifier	 SVG  TARGET  X  ATTRIBUTE
=	TokenNameEQUAL	
"targetX"	TokenNameStringLiteral	targetX
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TARGET_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  TARGET  Y  ATTRIBUTE
=	TokenNameEQUAL	
"targetY"	TokenNameStringLiteral	targetY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_ANCHOR_ATTRIBUTE	TokenNameIdentifier	 SVG  TEXT  ANCHOR  ATTRIBUTE
=	TokenNameEQUAL	
CSS_TEXT_ANCHOR_PROPERTY	TokenNameIdentifier	 CSS  TEXT  ANCHOR  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  TEXT  LENGTH  ATTRIBUTE
=	TokenNameEQUAL	
"textLength"	TokenNameStringLiteral	textLength
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_RENDERING_ATTRIBUTE	TokenNameIdentifier	 SVG  TEXT  RENDERING  ATTRIBUTE
=	TokenNameEQUAL	
CSS_TEXT_RENDERING_PROPERTY	TokenNameIdentifier	 CSS  TEXT  RENDERING  PROPERTY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TITLE_ATTRIBUTE	TokenNameIdentifier	 SVG  TITLE  ATTRIBUTE
=	TokenNameEQUAL	
"title"	TokenNameStringLiteral	title
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TO_ATTRIBUTE	TokenNameIdentifier	 SVG  TO  ATTRIBUTE
=	TokenNameEQUAL	
"to"	TokenNameStringLiteral	to
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
=	TokenNameEQUAL	
"transform"	TokenNameStringLiteral	transform
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
=	TokenNameEQUAL	
"type"	TokenNameStringLiteral	type
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_U1_ATTRIBUTE	TokenNameIdentifier	 SVG  U1  ATTRIBUTE
=	TokenNameEQUAL	
"u1"	TokenNameStringLiteral	u1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_U2_ATTRIBUTE	TokenNameIdentifier	 SVG  U2  ATTRIBUTE
=	TokenNameEQUAL	
"u2"	TokenNameStringLiteral	u2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_UNDERLINE_POSITION_ATTRIBUTE	TokenNameIdentifier	 SVG  UNDERLINE  POSITION  ATTRIBUTE
=	TokenNameEQUAL	
"underline-position"	TokenNameStringLiteral	underline-position
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_UNDERLINE_THICKNESS_ATTRIBUTE	TokenNameIdentifier	 SVG  UNDERLINE  THICKNESS  ATTRIBUTE
=	TokenNameEQUAL	
"underline-thickness"	TokenNameStringLiteral	underline-thickness
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_UNICODE_ATTRIBUTE	TokenNameIdentifier	 SVG  UNICODE  ATTRIBUTE
=	TokenNameEQUAL	
"unicode"	TokenNameStringLiteral	unicode
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_UNICODE_RANGE_ATTRIBUTE	TokenNameIdentifier	 SVG  UNICODE  RANGE  ATTRIBUTE
=	TokenNameEQUAL	
"unicode-range"	TokenNameStringLiteral	unicode-range
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_UNITS_PER_EM_ATTRIBUTE	TokenNameIdentifier	 SVG  UNITS  PER  EM  ATTRIBUTE
=	TokenNameEQUAL	
"units-per-em"	TokenNameStringLiteral	units-per-em
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_V_ALPHABETIC_ATTRIBUTE	TokenNameIdentifier	 SVG  V  ALPHABETIC  ATTRIBUTE
=	TokenNameEQUAL	
"v-alphabetic"	TokenNameStringLiteral	v-alphabetic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_V_HANGING_ATTRIBUTE	TokenNameIdentifier	 SVG  V  HANGING  ATTRIBUTE
=	TokenNameEQUAL	
"v-hanging"	TokenNameStringLiteral	v-hanging
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_V_IDEOGRAPHIC_ATTRIBUTE	TokenNameIdentifier	 SVG  V  IDEOGRAPHIC  ATTRIBUTE
=	TokenNameEQUAL	
"v-ideographic"	TokenNameStringLiteral	v-ideographic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_V_MATHEMATICAL_ATTRIBUTE	TokenNameIdentifier	 SVG  V  MATHEMATICAL  ATTRIBUTE
=	TokenNameEQUAL	
"v-mathematical"	TokenNameStringLiteral	v-mathematical
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
=	TokenNameEQUAL	
"values"	TokenNameStringLiteral	values
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VERSION_ATTRIBUTE	TokenNameIdentifier	 SVG  VERSION  ATTRIBUTE
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VERT_ADV_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  VERT  ADV  Y  ATTRIBUTE
=	TokenNameEQUAL	
"vert-adv-y"	TokenNameStringLiteral	vert-adv-y
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VERT_ORIGIN_X_ATTRIBUTE	TokenNameIdentifier	 SVG  VERT  ORIGIN  X  ATTRIBUTE
=	TokenNameEQUAL	
"vert-origin-x"	TokenNameStringLiteral	vert-origin-x
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VERT_ORIGIN_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  VERT  ORIGIN  Y  ATTRIBUTE
=	TokenNameEQUAL	
"vert-origin-y"	TokenNameStringLiteral	vert-origin-y
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VIEW_BOX_ATTRIBUTE	TokenNameIdentifier	 SVG  VIEW  BOX  ATTRIBUTE
=	TokenNameEQUAL	
"viewBox"	TokenNameStringLiteral	viewBox
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_VIEW_TARGET_ATTRIBUTE	TokenNameIdentifier	 SVG  VIEW  TARGET  ATTRIBUTE
=	TokenNameEQUAL	
"viewTarget"	TokenNameStringLiteral	viewTarget
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
=	TokenNameEQUAL	
"width"	TokenNameStringLiteral	width
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_WIDTHS_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTHS  ATTRIBUTE
=	TokenNameEQUAL	
"widths"	TokenNameStringLiteral	widths
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
=	TokenNameEQUAL	
"x1"	TokenNameStringLiteral	x1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
=	TokenNameEQUAL	
"x2"	TokenNameStringLiteral	x2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
=	TokenNameEQUAL	
"x"	TokenNameStringLiteral	x
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_X_CHANNEL_SELECTOR_ATTRIBUTE	TokenNameIdentifier	 SVG  X  CHANNEL  SELECTOR  ATTRIBUTE
=	TokenNameEQUAL	
"xChannelSelector"	TokenNameStringLiteral	xChannelSelector
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_X_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  X  HEIGHT  ATTRIBUTE
=	TokenNameEQUAL	
"xHeight"	TokenNameStringLiteral	xHeight
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
=	TokenNameEQUAL	
"y1"	TokenNameStringLiteral	y1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
=	TokenNameEQUAL	
"y2"	TokenNameStringLiteral	y2
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
=	TokenNameEQUAL	
"y"	TokenNameStringLiteral	y
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_Y_CHANNEL_SELECTOR_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  CHANNEL  SELECTOR  ATTRIBUTE
=	TokenNameEQUAL	
"yChannelSelector"	TokenNameStringLiteral	yChannelSelector
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  Z  ATTRIBUTE
=	TokenNameEQUAL	
"z"	TokenNameStringLiteral	z
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ZOOM_AND_PAN_ATTRIBUTE	TokenNameIdentifier	 SVG  ZOOM  AND  PAN  ATTRIBUTE
=	TokenNameEQUAL	
"zoomAndPan"	TokenNameStringLiteral	zoomAndPan
;	TokenNameSEMICOLON	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG attribute value 	TokenNameCOMMENT_LINE	SVG attribute value 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
SVG_100_VALUE	TokenNameIdentifier	 SVG 100  VALUE
=	TokenNameEQUAL	
"100"	TokenNameStringLiteral	100
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_200_VALUE	TokenNameIdentifier	 SVG 200  VALUE
=	TokenNameEQUAL	
"200"	TokenNameStringLiteral	200
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_300_VALUE	TokenNameIdentifier	 SVG 300  VALUE
=	TokenNameEQUAL	
"300"	TokenNameStringLiteral	300
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_400_VALUE	TokenNameIdentifier	 SVG 400  VALUE
=	TokenNameEQUAL	
"400"	TokenNameStringLiteral	400
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_500_VALUE	TokenNameIdentifier	 SVG 500  VALUE
=	TokenNameEQUAL	
"500"	TokenNameStringLiteral	500
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_600_VALUE	TokenNameIdentifier	 SVG 600  VALUE
=	TokenNameEQUAL	
"600"	TokenNameStringLiteral	600
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_700_VALUE	TokenNameIdentifier	 SVG 700  VALUE
=	TokenNameEQUAL	
"700"	TokenNameStringLiteral	700
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_800_VALUE	TokenNameIdentifier	 SVG 800  VALUE
=	TokenNameEQUAL	
"800"	TokenNameStringLiteral	800
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_900_VALUE	TokenNameIdentifier	 SVG 900  VALUE
=	TokenNameEQUAL	
"900"	TokenNameStringLiteral	900
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ABSOLUTE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  ABSOLUTE  COLORIMETRIC  VALUE
=	TokenNameEQUAL	
"absolute-colorimetric"	TokenNameStringLiteral	absolute-colorimetric
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ALIGN_VALUE	TokenNameIdentifier	 SVG  ALIGN  VALUE
=	TokenNameEQUAL	
"align"	TokenNameStringLiteral	align
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ALL_VALUE	TokenNameIdentifier	 SVG  ALL  VALUE
=	TokenNameEQUAL	
"all"	TokenNameStringLiteral	all
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ARITHMETIC_VALUE	TokenNameIdentifier	 SVG  ARITHMETIC  VALUE
=	TokenNameEQUAL	
"arithmetic"	TokenNameStringLiteral	arithmetic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ATOP_VALUE	TokenNameIdentifier	 SVG  ATOP  VALUE
=	TokenNameEQUAL	
"atop"	TokenNameStringLiteral	atop
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
=	TokenNameEQUAL	
"auto"	TokenNameStringLiteral	auto
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_A_VALUE	TokenNameIdentifier	 SVG  A  VALUE
=	TokenNameEQUAL	
"A"	TokenNameStringLiteral	A
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BACKGROUND_ALPHA_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  ALPHA  VALUE
=	TokenNameEQUAL	
"BackgroundAlpha"	TokenNameStringLiteral	BackgroundAlpha
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
=	TokenNameEQUAL	
"BackgroundImage"	TokenNameStringLiteral	BackgroundImage
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BEVEL_VALUE	TokenNameIdentifier	 SVG  BEVEL  VALUE
=	TokenNameEQUAL	
"bevel"	TokenNameStringLiteral	bevel
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BOLDER_VALUE	TokenNameIdentifier	 SVG  BOLDER  VALUE
=	TokenNameEQUAL	
"bolder"	TokenNameStringLiteral	bolder
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BOLD_VALUE	TokenNameIdentifier	 SVG  BOLD  VALUE
=	TokenNameEQUAL	
"bold"	TokenNameStringLiteral	bold
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_BUTT_VALUE	TokenNameIdentifier	 SVG  BUTT  VALUE
=	TokenNameEQUAL	
"butt"	TokenNameStringLiteral	butt
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_B_VALUE	TokenNameIdentifier	 SVG  B  VALUE
=	TokenNameEQUAL	
"B"	TokenNameStringLiteral	B
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPOSITE_VALUE	TokenNameIdentifier	 SVG  COMPOSITE  VALUE
=	TokenNameEQUAL	
"composite"	TokenNameStringLiteral	composite
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CRISP_EDGES_VALUE	TokenNameIdentifier	 SVG  CRISP  EDGES  VALUE
=	TokenNameEQUAL	
"crispEdges"	TokenNameStringLiteral	crispEdges
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CROSSHAIR_VALUE	TokenNameIdentifier	 SVG  CROSSHAIR  VALUE
=	TokenNameEQUAL	
"crosshair"	TokenNameStringLiteral	crosshair
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DARKEN_VALUE	TokenNameIdentifier	 SVG  DARKEN  VALUE
=	TokenNameEQUAL	
"darken"	TokenNameStringLiteral	darken
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DEFAULT_VALUE	TokenNameIdentifier	 SVG  DEFAULT  VALUE
=	TokenNameEQUAL	
"default"	TokenNameStringLiteral	default
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DIGIT_ONE_VALUE	TokenNameIdentifier	 SVG  DIGIT  ONE  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DILATE_VALUE	TokenNameIdentifier	 SVG  DILATE  VALUE
=	TokenNameEQUAL	
"dilate"	TokenNameStringLiteral	dilate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DISABLE_VALUE	TokenNameIdentifier	 SVG  DISABLE  VALUE
=	TokenNameEQUAL	
"disable"	TokenNameStringLiteral	disable
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DISCRETE_VALUE	TokenNameIdentifier	 SVG  DISCRETE  VALUE
=	TokenNameEQUAL	
"discrete"	TokenNameStringLiteral	discrete
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_DUPLICATE_VALUE	TokenNameIdentifier	 SVG  DUPLICATE  VALUE
=	TokenNameEQUAL	
"duplicate"	TokenNameStringLiteral	duplicate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_END_VALUE	TokenNameIdentifier	 SVG  END  VALUE
=	TokenNameEQUAL	
"end"	TokenNameStringLiteral	end
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ERODE_VALUE	TokenNameIdentifier	 SVG  ERODE  VALUE
=	TokenNameEQUAL	
"erode"	TokenNameStringLiteral	erode
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVEN_ODD_VALUE	TokenNameIdentifier	 SVG  EVEN  ODD  VALUE
=	TokenNameEQUAL	
"evenodd"	TokenNameStringLiteral	evenodd
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EXACT_VALUE	TokenNameIdentifier	 SVG  EXACT  VALUE
=	TokenNameEQUAL	
"exact"	TokenNameStringLiteral	exact
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_E_RESIZE_VALUE	TokenNameIdentifier	 SVG  E  RESIZE  VALUE
=	TokenNameEQUAL	
"e-resize"	TokenNameStringLiteral	e-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FALSE_VALUE	TokenNameIdentifier	 SVG  FALSE  VALUE
=	TokenNameEQUAL	
"false"	TokenNameStringLiteral	false
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILL_PAINT_VALUE	TokenNameIdentifier	 SVG  FILL  PAINT  VALUE
=	TokenNameEQUAL	
"FillPaint"	TokenNameStringLiteral	FillPaint
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FLOOD_VALUE	TokenNameIdentifier	 SVG  FLOOD  VALUE
=	TokenNameEQUAL	
"flood"	TokenNameStringLiteral	flood
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FRACTAL_NOISE_VALUE	TokenNameIdentifier	 SVG  FRACTAL  NOISE  VALUE
=	TokenNameEQUAL	
"fractalNoise"	TokenNameStringLiteral	fractalNoise
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GAMMA_VALUE	TokenNameIdentifier	 SVG  GAMMA  VALUE
=	TokenNameEQUAL	
"gamma"	TokenNameStringLiteral	gamma
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_GEOMETRIC_PRECISION_VALUE	TokenNameIdentifier	 SVG  GEOMETRIC  PRECISION  VALUE
=	TokenNameEQUAL	
"geometricPrecision"	TokenNameStringLiteral	geometricPrecision
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_G_VALUE	TokenNameIdentifier	 SVG  G  VALUE
=	TokenNameEQUAL	
"G"	TokenNameStringLiteral	G
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HELP_VALUE	TokenNameIdentifier	 SVG  HELP  VALUE
=	TokenNameEQUAL	
"help"	TokenNameStringLiteral	help
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HUE_ROTATE_VALUE	TokenNameIdentifier	 SVG  HUE  ROTATE  VALUE
=	TokenNameEQUAL	
"hueRotate"	TokenNameStringLiteral	hueRotate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HUNDRED_PERCENT_VALUE	TokenNameIdentifier	 SVG  HUNDRED  PERCENT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_H_VALUE	TokenNameIdentifier	 SVG  H  VALUE
=	TokenNameEQUAL	
"h"	TokenNameStringLiteral	h
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IDENTITY_VALUE	TokenNameIdentifier	 SVG  IDENTITY  VALUE
=	TokenNameEQUAL	
"identity"	TokenNameStringLiteral	identity
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_INITIAL_VALUE	TokenNameIdentifier	 SVG  INITIAL  VALUE
=	TokenNameEQUAL	
"initial"	TokenNameStringLiteral	initial
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IN_VALUE	TokenNameIdentifier	 SVG  IN  VALUE
=	TokenNameEQUAL	
"in"	TokenNameStringLiteral	in
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ISOLATED_VALUE	TokenNameIdentifier	 SVG  ISOLATED  VALUE
=	TokenNameEQUAL	
"isolated"	TokenNameStringLiteral	isolated
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ITALIC_VALUE	TokenNameIdentifier	 SVG  ITALIC  VALUE
=	TokenNameEQUAL	
"italic"	TokenNameStringLiteral	italic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LIGHTEN_VALUE	TokenNameIdentifier	 SVG  LIGHTEN  VALUE
=	TokenNameEQUAL	
"lighten"	TokenNameStringLiteral	lighten
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LIGHTER_VALUE	TokenNameIdentifier	 SVG  LIGHTER  VALUE
=	TokenNameEQUAL	
"lighter"	TokenNameStringLiteral	lighter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_RGB_VALUE	TokenNameIdentifier	 SVG  LINEAR  RGB  VALUE
=	TokenNameEQUAL	
"linearRGB"	TokenNameStringLiteral	linearRGB
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_VALUE	TokenNameIdentifier	 SVG  LINEAR  VALUE
=	TokenNameEQUAL	
"linear"	TokenNameStringLiteral	linear
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LUMINANCE_TO_ALPHA_VALUE	TokenNameIdentifier	 SVG  LUMINANCE  TO  ALPHA  VALUE
=	TokenNameEQUAL	
"luminanceToAlpha"	TokenNameStringLiteral	luminanceToAlpha
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MAGNIFY_VALUE	TokenNameIdentifier	 SVG  MAGNIFY  VALUE
=	TokenNameEQUAL	
"magnify"	TokenNameStringLiteral	magnify
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MATRIX_VALUE	TokenNameIdentifier	 SVG  MATRIX  VALUE
=	TokenNameEQUAL	
"matrix"	TokenNameStringLiteral	matrix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MEDIAL_VALUE	TokenNameIdentifier	 SVG  MEDIAL  VALUE
=	TokenNameEQUAL	
"medial"	TokenNameStringLiteral	medial
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MEET_VALUE	TokenNameIdentifier	 SVG  MEET  VALUE
=	TokenNameEQUAL	
"meet"	TokenNameStringLiteral	meet
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MIDDLE_VALUE	TokenNameIdentifier	 SVG  MIDDLE  VALUE
=	TokenNameEQUAL	
"middle"	TokenNameStringLiteral	middle
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MITER_VALUE	TokenNameIdentifier	 SVG  MITER  VALUE
=	TokenNameEQUAL	
"miter"	TokenNameStringLiteral	miter
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MOVE_VALUE	TokenNameIdentifier	 SVG  MOVE  VALUE
=	TokenNameEQUAL	
"move"	TokenNameStringLiteral	move
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MULTIPLY_VALUE	TokenNameIdentifier	 SVG  MULTIPLY  VALUE
=	TokenNameEQUAL	
"multiply"	TokenNameStringLiteral	multiply
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NEW_VALUE	TokenNameIdentifier	 SVG  NEW  VALUE
=	TokenNameEQUAL	
"new"	TokenNameStringLiteral	new
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NE_RESIZE_VALUE	TokenNameIdentifier	 SVG  NE  RESIZE  VALUE
=	TokenNameEQUAL	
"ne-resize"	TokenNameStringLiteral	ne-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NINETY_VALUE	TokenNameIdentifier	 SVG  NINETY  VALUE
=	TokenNameEQUAL	
"90"	TokenNameStringLiteral	90
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
=	TokenNameEQUAL	
"none"	TokenNameStringLiteral	none
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NON_ZERO_VALUE	TokenNameIdentifier	 SVG  NON  ZERO  VALUE
=	TokenNameEQUAL	
"nonzero"	TokenNameStringLiteral	nonzero
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NORMAL_VALUE	TokenNameIdentifier	 SVG  NORMAL  VALUE
=	TokenNameEQUAL	
"normal"	TokenNameStringLiteral	normal
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NO_STITCH_VALUE	TokenNameIdentifier	 SVG  NO  STITCH  VALUE
=	TokenNameEQUAL	
"noStitch"	TokenNameStringLiteral	noStitch
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_NW_RESIZE_VALUE	TokenNameIdentifier	 SVG  NW  RESIZE  VALUE
=	TokenNameEQUAL	
"nw-resize"	TokenNameStringLiteral	nw-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_N_RESIZE_VALUE	TokenNameIdentifier	 SVG  N  RESIZE  VALUE
=	TokenNameEQUAL	
"n-resize"	TokenNameStringLiteral	n-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OBJECT_BOUNDING_BOX_VALUE	TokenNameIdentifier	 SVG  OBJECT  BOUNDING  BOX  VALUE
=	TokenNameEQUAL	
"objectBoundingBox"	TokenNameStringLiteral	objectBoundingBox
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OBLIQUE_VALUE	TokenNameIdentifier	 SVG  OBLIQUE  VALUE
=	TokenNameEQUAL	
"oblique"	TokenNameStringLiteral	oblique
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ONE_VALUE	TokenNameIdentifier	 SVG  ONE  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OPAQUE_VALUE	TokenNameIdentifier	 SVG  OPAQUE  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OPTIMIZE_LEGIBILITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  LEGIBILITY  VALUE
=	TokenNameEQUAL	
"optimizeLegibility"	TokenNameStringLiteral	optimizeLegibility
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OPTIMIZE_QUALITY_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  QUALITY  VALUE
=	TokenNameEQUAL	
"optimizeQuality"	TokenNameStringLiteral	optimizeQuality
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OPTIMIZE_SPEED_VALUE	TokenNameIdentifier	 SVG  OPTIMIZE  SPEED  VALUE
=	TokenNameEQUAL	
"optimizeSpeed"	TokenNameStringLiteral	optimizeSpeed
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OUT_VALUE	TokenNameIdentifier	 SVG  OUT  VALUE
=	TokenNameEQUAL	
"out"	TokenNameStringLiteral	out
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_OVER_VALUE	TokenNameIdentifier	 SVG  OVER  VALUE
=	TokenNameEQUAL	
"over"	TokenNameStringLiteral	over
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PACED_VALUE	TokenNameIdentifier	 SVG  PACED  VALUE
=	TokenNameEQUAL	
"paced"	TokenNameStringLiteral	paced
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PAD_VALUE	TokenNameIdentifier	 SVG  PAD  VALUE
=	TokenNameEQUAL	
"pad"	TokenNameStringLiteral	pad
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PERCEPTUAL_VALUE	TokenNameIdentifier	 SVG  PERCEPTUAL  VALUE
=	TokenNameEQUAL	
"perceptual"	TokenNameStringLiteral	perceptual
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_POINTER_VALUE	TokenNameIdentifier	 SVG  POINTER  VALUE
=	TokenNameEQUAL	
"pointer"	TokenNameStringLiteral	pointer
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PRESERVE_VALUE	TokenNameIdentifier	 SVG  PRESERVE  VALUE
=	TokenNameEQUAL	
"preserve"	TokenNameStringLiteral	preserve
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REFLECT_VALUE	TokenNameIdentifier	 SVG  REFLECT  VALUE
=	TokenNameEQUAL	
"reflect"	TokenNameStringLiteral	reflect
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RELATIVE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  RELATIVE  COLORIMETRIC  VALUE
=	TokenNameEQUAL	
"relative-colorimetric"	TokenNameStringLiteral	relative-colorimetric
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_REPEAT_VALUE	TokenNameIdentifier	 SVG  REPEAT  VALUE
=	TokenNameEQUAL	
"repeat"	TokenNameStringLiteral	repeat
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ROUND_VALUE	TokenNameIdentifier	 SVG  ROUND  VALUE
=	TokenNameEQUAL	
"round"	TokenNameStringLiteral	round
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_R_VALUE	TokenNameIdentifier	 SVG  R  VALUE
=	TokenNameEQUAL	
"R"	TokenNameStringLiteral	R
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SATURATE_VALUE	TokenNameIdentifier	 SVG  SATURATE  VALUE
=	TokenNameEQUAL	
"saturate"	TokenNameStringLiteral	saturate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SATURATION_VALUE	TokenNameIdentifier	 SVG  SATURATION  VALUE
=	TokenNameEQUAL	
"saturation"	TokenNameStringLiteral	saturation
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCREEN_VALUE	TokenNameIdentifier	 SVG  SCREEN  VALUE
=	TokenNameEQUAL	
"screen"	TokenNameStringLiteral	screen
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SE_RESIZE_VALUE	TokenNameIdentifier	 SVG  SE  RESIZE  VALUE
=	TokenNameEQUAL	
"se-resize"	TokenNameStringLiteral	se-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SLICE_VALUE	TokenNameIdentifier	 SVG  SLICE  VALUE
=	TokenNameEQUAL	
"slice"	TokenNameStringLiteral	slice
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SOURCE_ALPHA_VALUE	TokenNameIdentifier	 SVG  SOURCE  ALPHA  VALUE
=	TokenNameEQUAL	
"SourceAlpha"	TokenNameStringLiteral	SourceAlpha
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
=	TokenNameEQUAL	
"SourceGraphic"	TokenNameStringLiteral	SourceGraphic
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPACING_AND_GLYPHS_VALUE	TokenNameIdentifier	 SVG  SPACING  AND  GLYPHS  VALUE
=	TokenNameEQUAL	
"spacingAndGlyphs"	TokenNameStringLiteral	spacingAndGlyphs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SPACING_VALUE	TokenNameIdentifier	 SVG  SPACING  VALUE
=	TokenNameEQUAL	
"spacing"	TokenNameStringLiteral	spacing
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SQUARE_VALUE	TokenNameIdentifier	 SVG  SQUARE  VALUE
=	TokenNameEQUAL	
"square"	TokenNameStringLiteral	square
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SRGB_VALUE	TokenNameIdentifier	 SVG  SRGB  VALUE
=	TokenNameEQUAL	
"sRGB"	TokenNameStringLiteral	sRGB
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_START_VALUE	TokenNameIdentifier	 SVG  START  VALUE
=	TokenNameEQUAL	
"start"	TokenNameStringLiteral	start
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STITCH_VALUE	TokenNameIdentifier	 SVG  STITCH  VALUE
=	TokenNameEQUAL	
"stitch"	TokenNameStringLiteral	stitch
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STRETCH_VALUE	TokenNameIdentifier	 SVG  STRETCH  VALUE
=	TokenNameEQUAL	
"stretch"	TokenNameStringLiteral	stretch
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_PAINT_VALUE	TokenNameIdentifier	 SVG  STROKE  PAINT  VALUE
=	TokenNameEQUAL	
"StrokePaint"	TokenNameStringLiteral	StrokePaint
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_STROKE_WIDTH_VALUE	TokenNameIdentifier	 SVG  STROKE  WIDTH  VALUE
=	TokenNameEQUAL	
"strokeWidth"	TokenNameStringLiteral	strokeWidth
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SW_RESIZE_VALUE	TokenNameIdentifier	 SVG  SW  RESIZE  VALUE
=	TokenNameEQUAL	
"sw-resize"	TokenNameStringLiteral	sw-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_S_RESIZE_VALUE	TokenNameIdentifier	 SVG  S  RESIZE  VALUE
=	TokenNameEQUAL	
"s-resize"	TokenNameStringLiteral	s-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TABLE_VALUE	TokenNameIdentifier	 SVG  TABLE  VALUE
=	TokenNameEQUAL	
"table"	TokenNameStringLiteral	table
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TERMINAL_VALUE	TokenNameIdentifier	 SVG  TERMINAL  VALUE
=	TokenNameEQUAL	
"terminal"	TokenNameStringLiteral	terminal
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_VALUE	TokenNameIdentifier	 SVG  TEXT  VALUE
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TRANSLATE_VALUE	TokenNameIdentifier	 SVG  TRANSLATE  VALUE
=	TokenNameEQUAL	
"translate"	TokenNameStringLiteral	translate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TRUE_VALUE	TokenNameIdentifier	 SVG  TRUE  VALUE
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TURBULENCE_VALUE	TokenNameIdentifier	 SVG  TURBULENCE  VALUE
=	TokenNameEQUAL	
"turbulence"	TokenNameStringLiteral	turbulence
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
=	TokenNameEQUAL	
"userSpaceOnUse"	TokenNameStringLiteral	userSpaceOnUse
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_V_VALUE	TokenNameIdentifier	 SVG  V  VALUE
=	TokenNameEQUAL	
"v"	TokenNameStringLiteral	v
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_WAIT_VALUE	TokenNameIdentifier	 SVG  WAIT  VALUE
=	TokenNameEQUAL	
"wait"	TokenNameStringLiteral	wait
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_WRAP_VALUE	TokenNameIdentifier	 SVG  WRAP  VALUE
=	TokenNameEQUAL	
"wrap"	TokenNameStringLiteral	wrap
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_W_RESIZE_VALUE	TokenNameIdentifier	 SVG  W  RESIZE  VALUE
=	TokenNameEQUAL	
"w-resize"	TokenNameStringLiteral	w-resize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMAXYMAX_VALUE	TokenNameIdentifier	 SVG  XMAXYMAX  VALUE
=	TokenNameEQUAL	
"xMaxYMax"	TokenNameStringLiteral	xMaxYMax
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMAXYMID_VALUE	TokenNameIdentifier	 SVG  XMAXYMID  VALUE
=	TokenNameEQUAL	
"xMaxYMid"	TokenNameStringLiteral	xMaxYMid
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMAXYMIN_VALUE	TokenNameIdentifier	 SVG  XMAXYMIN  VALUE
=	TokenNameEQUAL	
"xMaxYMin"	TokenNameStringLiteral	xMaxYMin
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMIDYMAX_VALUE	TokenNameIdentifier	 SVG  XMIDYMAX  VALUE
=	TokenNameEQUAL	
"xMidYMax"	TokenNameStringLiteral	xMidYMax
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMIDYMID_VALUE	TokenNameIdentifier	 SVG  XMIDYMID  VALUE
=	TokenNameEQUAL	
"xMidYMid"	TokenNameStringLiteral	xMidYMid
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMIDYMIN_VALUE	TokenNameIdentifier	 SVG  XMIDYMIN  VALUE
=	TokenNameEQUAL	
"xMidYMin"	TokenNameStringLiteral	xMidYMin
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMINYMAX_VALUE	TokenNameIdentifier	 SVG  XMINYMAX  VALUE
=	TokenNameEQUAL	
"xMinYMax"	TokenNameStringLiteral	xMinYMax
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMINYMID_VALUE	TokenNameIdentifier	 SVG  XMINYMID  VALUE
=	TokenNameEQUAL	
"xMinYMid"	TokenNameStringLiteral	xMinYMid
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XMINYMIN_VALUE	TokenNameIdentifier	 SVG  XMINYMIN  VALUE
=	TokenNameEQUAL	
"xMinYMin"	TokenNameStringLiteral	xMinYMin
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_XOR_VALUE	TokenNameIdentifier	 SVG  XOR  VALUE
=	TokenNameEQUAL	
"xor"	TokenNameStringLiteral	xor
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ZERO_PERCENT_VALUE	TokenNameIdentifier	 SVG  ZERO  PERCENT  VALUE
=	TokenNameEQUAL	
"0%"	TokenNameStringLiteral	0%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ZERO_VALUE	TokenNameIdentifier	 SVG  ZERO  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
/////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////// 
// default values for attributes 	TokenNameCOMMENT_LINE	default values for attributes 
/////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
SVG_CIRCLE_CX_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CIRCLE  CX  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CIRCLE_CY_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CIRCLE  CY  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CLIP_PATH_CLIP_PATH_UNITS_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CLIP  PATH  CLIP  PATH  UNITS  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPONENT_TRANSFER_FUNCTION_AMPLITUDE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  COMPONENT  TRANSFER  FUNCTION  AMPLITUDE  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPONENT_TRANSFER_FUNCTION_EXPONENT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  COMPONENT  TRANSFER  FUNCTION  EXPONENT  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPONENT_TRANSFER_FUNCTION_INTERCEPT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  COMPONENT  TRANSFER  FUNCTION  INTERCEPT  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPONENT_TRANSFER_FUNCTION_OFFSET_DEFAULT_VALUE	TokenNameIdentifier	 SVG  COMPONENT  TRANSFER  FUNCTION  OFFSET  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPONENT_TRANSFER_FUNCTION_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  COMPONENT  TRANSFER  FUNCTION  SLOPE  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_COMPONENT_TRANSFER_FUNCTION_TABLE_VALUES_DEFAULT_VALUE	TokenNameIdentifier	 SVG  COMPONENT  TRANSFER  FUNCTION  TABLE  VALUES  DEFAULT  VALUE
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CURSOR_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CURSOR  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_CURSOR_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  CURSOR  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ELLIPSE_CX_DEFAULT_VALUE	TokenNameIdentifier	 SVG  ELLIPSE  CX  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_ELLIPSE_CY_DEFAULT_VALUE	TokenNameIdentifier	 SVG  ELLIPSE  CY  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPOSITE_K1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  COMPOSITE  K1  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPOSITE_K2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  COMPOSITE  K2  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPOSITE_K3_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  COMPOSITE  K3  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPOSITE_K4_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  COMPOSITE  K4  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_COMPOSITE_OPERATOR_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  COMPOSITE  OPERATOR  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_OVER_VALUE	TokenNameIdentifier	 SVG  OVER  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_CONVOLVE_MATRIX_EDGE_MODE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  CONVOLVE  MATRIX  EDGE  MODE  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_DUPLICATE_VALUE	TokenNameIdentifier	 SVG  DUPLICATE  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DIFFUSE_LIGHTING_DIFFUSE_CONSTANT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  DIFFUSE  LIGHTING  DIFFUSE  CONSTANT  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DIFFUSE_LIGHTING_SURFACE_SCALE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  DIFFUSE  LIGHTING  SURFACE  SCALE  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DISPLACEMENT_MAP_SCALE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  DISPLACEMENT  MAP  SCALE  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DISTANT_LIGHT_AZIMUTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  DISTANT  LIGHT  AZIMUTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_DISTANT_LIGHT_ELEVATION_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  DISTANT  LIGHT  ELEVATION  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_POINT_LIGHT_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  POINT  LIGHT  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_POINT_LIGHT_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  POINT  LIGHT  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_POINT_LIGHT_Z_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  POINT  LIGHT  Z  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPECULAR_LIGHTING_SPECULAR_CONSTANT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPECULAR  LIGHTING  SPECULAR  CONSTANT  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPECULAR_LIGHTING_SPECULAR_EXPONENT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPECULAR  LIGHTING  SPECULAR  EXPONENT  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPECULAR_LIGHTING_SURFACE_SCALE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPECULAR  LIGHTING  SURFACE  SCALE  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_LIMITING_CONE_ANGLE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  LIMITING  CONE  ANGLE  DEFAULT  VALUE
=	TokenNameEQUAL	
"90"	TokenNameStringLiteral	90
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_POINTS_AT_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  POINTS  AT  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_POINTS_AT_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  POINTS  AT  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_POINTS_AT_Z_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  POINTS  AT  Z  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_SPECULAR_EXPONENT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  SPECULAR  EXPONENT  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_SPOT_LIGHT_Z_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  Z  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_TURBULENCE_NUM_OCTAVES_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  TURBULENCE  NUM  OCTAVES  DEFAULT  VALUE
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FE_TURBULENCE_SEED_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FE  TURBULENCE  SEED  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_FILTER_UNITS_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  FILTER  UNITS  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"120%"	TokenNameStringLiteral	120%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_PRIMITIVE_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  PRIMITIVE  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0%"	TokenNameStringLiteral	0%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_PRIMITIVE_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  PRIMITIVE  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0%"	TokenNameStringLiteral	0%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_PRIMITIVE_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  PRIMITIVE  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_PRIMITIVE_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  PRIMITIVE  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_PRIMITIVE_UNITS_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  PRIMITIVE  UNITS  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"120%"	TokenNameStringLiteral	120%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"-10%"	TokenNameStringLiteral	-10%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FILTER_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FILTER  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"-10%"	TokenNameStringLiteral	-10%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_FONT_STRETCH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  STRETCH  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_NORMAL_VALUE	TokenNameIdentifier	 SVG  NORMAL  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_FONT_STYLE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  STYLE  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_ALL_VALUE	TokenNameIdentifier	 SVG  ALL  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_FONT_VARIANT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  VARIANT  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_NORMAL_VALUE	TokenNameIdentifier	 SVG  NORMAL  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_FONT_WEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  FONT  WEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_ALL_VALUE	TokenNameIdentifier	 SVG  ALL  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_PANOSE_1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  PANOSE 1  DEFAULT  VALUE
=	TokenNameEQUAL	
"0 0 0 0 0 0 0 0 0 0"	TokenNameStringLiteral	0 0 0 0 0 0 0 0 0 0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_SLOPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  SLOPE  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FONT_FACE_UNITS_PER_EM_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FONT  FACE  UNITS  PER  EM  DEFAULT  VALUE
=	TokenNameEQUAL	
"1000"	TokenNameStringLiteral	1000
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FOREIGN_OBJECT_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FOREIGN  OBJECT  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_FOREIGN_OBJECT_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  FOREIGN  OBJECT  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HORIZ_ORIGIN_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  HORIZ  ORIGIN  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_HORIZ_ORIGIN_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  HORIZ  ORIGIN  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_KERN_K_DEFAULT_VALUE	TokenNameIdentifier	 SVG  KERN  K  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IMAGE_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  IMAGE  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_IMAGE_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  IMAGE  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINE_X1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  X1  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINE_X2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  X2  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINE_Y1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  Y1  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINE_Y2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  Y2  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_GRADIENT_X1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  X1  DEFAULT  VALUE
=	TokenNameEQUAL	
"0%"	TokenNameStringLiteral	0%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_GRADIENT_X2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  X2  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_GRADIENT_Y1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  Y1  DEFAULT  VALUE
=	TokenNameEQUAL	
"0%"	TokenNameStringLiteral	0%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_LINEAR_GRADIENT_Y2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINEAR  GRADIENT  Y2  DEFAULT  VALUE
=	TokenNameEQUAL	
"0%"	TokenNameStringLiteral	0%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_MARKER_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MARKER  MARKER  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"3"	TokenNameStringLiteral	3
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_MARKER_UNITS_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MARKER  MARKER  UNITS  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_STROKE_WIDTH_VALUE	TokenNameIdentifier	 SVG  STROKE  WIDTH  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_MARKER_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MARKER  MARKER  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"3"	TokenNameStringLiteral	3
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_ORIENT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MARKER  ORIENT  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_REF_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MARKER  REF  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MARKER_REF_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MARKER  REF  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MASK  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"120%"	TokenNameStringLiteral	120%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_MASK_UNITS_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MASK  MASK  UNITS  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MASK  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"120%"	TokenNameStringLiteral	120%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MASK  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"-10%"	TokenNameStringLiteral	-10%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_MASK_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  MASK  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"-10%"	TokenNameStringLiteral	-10%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  PATTERN  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  PATTERN  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  PATTERN  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_PATTERN_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  PATTERN  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RADIAL_GRADIENT_CX_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  CX  DEFAULT  VALUE
=	TokenNameEQUAL	
"50%"	TokenNameStringLiteral	50%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RADIAL_GRADIENT_CY_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  CY  DEFAULT  VALUE
=	TokenNameEQUAL	
"50%"	TokenNameStringLiteral	50%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RADIAL_GRADIENT_R_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RADIAL  GRADIENT  R  DEFAULT  VALUE
=	TokenNameEQUAL	
"50%"	TokenNameStringLiteral	50%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RECT_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RECT  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_RECT_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  RECT  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TYPE_ECMASCRIPT	TokenNameIdentifier	 SVG  SCRIPT  TYPE  ECMASCRIPT
=	TokenNameEQUAL	
"text/ecmascript"	TokenNameStringLiteral	text/ecmascript
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TYPE_APPLICATION_ECMASCRIPT	TokenNameIdentifier	 SVG  SCRIPT  TYPE  APPLICATION  ECMASCRIPT
=	TokenNameEQUAL	
"application/ecmascript"	TokenNameStringLiteral	application/ecmascript
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TYPE_JAVASCRIPT	TokenNameIdentifier	 SVG  SCRIPT  TYPE  JAVASCRIPT
=	TokenNameEQUAL	
"text/javascript"	TokenNameStringLiteral	text/javascript
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TYPE_APPLICATION_JAVASCRIPT	TokenNameIdentifier	 SVG  SCRIPT  TYPE  APPLICATION  JAVASCRIPT
=	TokenNameEQUAL	
"application/javascript"	TokenNameStringLiteral	application/javascript
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TYPE_DEFAULT_VALUE	TokenNameIdentifier	 SVG  SCRIPT  TYPE  DEFAULT  VALUE
=	TokenNameEQUAL	
SVG_SCRIPT_TYPE_ECMASCRIPT	TokenNameIdentifier	 SVG  SCRIPT  TYPE  ECMASCRIPT
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SCRIPT_TYPE_JAVA	TokenNameIdentifier	 SVG  SCRIPT  TYPE  JAVA
=	TokenNameEQUAL	
"application/java-archive"	TokenNameStringLiteral	application/java-archive
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  SVG  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  SVG  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  SVG  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_SVG_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  SVG  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_TEXT_PATH_START_OFFSET_DEFAULT_VALUE	TokenNameIdentifier	 SVG  TEXT  PATH  START  OFFSET  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_USE_X_DEFAULT_VALUE	TokenNameIdentifier	 SVG  USE  X  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_USE_Y_DEFAULT_VALUE	TokenNameIdentifier	 SVG  USE  Y  DEFAULT  VALUE
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_USE_WIDTH_DEFAULT_VALUE	TokenNameIdentifier	 SVG  USE  WIDTH  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_USE_HEIGHT_DEFAULT_VALUE	TokenNameIdentifier	 SVG  USE  HEIGHT  DEFAULT  VALUE
=	TokenNameEQUAL	
"100%"	TokenNameStringLiteral	100%
;	TokenNameSEMICOLON	
/////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////// 
// various constants in SVG attributes 	TokenNameCOMMENT_LINE	various constants in SVG attributes 
/////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
TRANSFORM_TRANSLATE	TokenNameIdentifier	 TRANSFORM  TRANSLATE
=	TokenNameEQUAL	
"translate"	TokenNameStringLiteral	translate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
TRANSFORM_ROTATE	TokenNameIdentifier	 TRANSFORM  ROTATE
=	TokenNameEQUAL	
"rotate"	TokenNameStringLiteral	rotate
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
TRANSFORM_SCALE	TokenNameIdentifier	 TRANSFORM  SCALE
=	TokenNameEQUAL	
"scale"	TokenNameStringLiteral	scale
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
TRANSFORM_SKEWX	TokenNameIdentifier	 TRANSFORM  SKEWX
=	TokenNameEQUAL	
"skewX"	TokenNameStringLiteral	skewX
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
TRANSFORM_SKEWY	TokenNameIdentifier	 TRANSFORM  SKEWY
=	TokenNameEQUAL	
"skewY"	TokenNameStringLiteral	skewY
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
TRANSFORM_MATRIX	TokenNameIdentifier	 TRANSFORM  MATRIX
=	TokenNameEQUAL	
"matrix"	TokenNameStringLiteral	matrix
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_ARC	TokenNameIdentifier	 PATH  ARC
=	TokenNameEQUAL	
"A"	TokenNameStringLiteral	A
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_CLOSE	TokenNameIdentifier	 PATH  CLOSE
=	TokenNameEQUAL	
"Z"	TokenNameStringLiteral	Z
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_CUBIC_TO	TokenNameIdentifier	 PATH  CUBIC  TO
=	TokenNameEQUAL	
"C"	TokenNameStringLiteral	C
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_MOVE	TokenNameIdentifier	 PATH  MOVE
=	TokenNameEQUAL	
"M"	TokenNameStringLiteral	M
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_LINE_TO	TokenNameIdentifier	 PATH  LINE  TO
=	TokenNameEQUAL	
"L"	TokenNameStringLiteral	L
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_VERTICAL_LINE_TO	TokenNameIdentifier	 PATH  VERTICAL  LINE  TO
=	TokenNameEQUAL	
"V"	TokenNameStringLiteral	V
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_HORIZONTAL_LINE_TO	TokenNameIdentifier	 PATH  HORIZONTAL  LINE  TO
=	TokenNameEQUAL	
"H"	TokenNameStringLiteral	H
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_QUAD_TO	TokenNameIdentifier	 PATH  QUAD  TO
=	TokenNameEQUAL	
"Q"	TokenNameStringLiteral	Q
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
PATH_SMOOTH_QUAD_TO	TokenNameIdentifier	 PATH  SMOOTH  QUAD  TO
=	TokenNameEQUAL	
"T"	TokenNameStringLiteral	T
;	TokenNameSEMICOLON	
/////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////// 
// event constants 	TokenNameCOMMENT_LINE	event constants 
/////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	///////////////////////////////////////////////////////////////// 
String	TokenNameIdentifier	 String
SVG_EVENT_CLICK	TokenNameIdentifier	 SVG  EVENT  CLICK
=	TokenNameEQUAL	
"click"	TokenNameStringLiteral	click
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_KEYDOWN	TokenNameIdentifier	 SVG  EVENT  KEYDOWN
=	TokenNameEQUAL	
"keydown"	TokenNameStringLiteral	keydown
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_KEYPRESS	TokenNameIdentifier	 SVG  EVENT  KEYPRESS
=	TokenNameEQUAL	
"keypress"	TokenNameStringLiteral	keypress
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_KEYUP	TokenNameIdentifier	 SVG  EVENT  KEYUP
=	TokenNameEQUAL	
"keyup"	TokenNameStringLiteral	keyup
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_MOUSEDOWN	TokenNameIdentifier	 SVG  EVENT  MOUSEDOWN
=	TokenNameEQUAL	
"mousedown"	TokenNameStringLiteral	mousedown
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_MOUSEMOVE	TokenNameIdentifier	 SVG  EVENT  MOUSEMOVE
=	TokenNameEQUAL	
"mousemove"	TokenNameStringLiteral	mousemove
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_MOUSEOUT	TokenNameIdentifier	 SVG  EVENT  MOUSEOUT
=	TokenNameEQUAL	
"mouseout"	TokenNameStringLiteral	mouseout
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_MOUSEOVER	TokenNameIdentifier	 SVG  EVENT  MOUSEOVER
=	TokenNameEQUAL	
"mouseover"	TokenNameStringLiteral	mouseover
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
SVG_EVENT_MOUSEUP	TokenNameIdentifier	 SVG  EVENT  MOUSEUP
=	TokenNameEQUAL	
"mouseup"	TokenNameStringLiteral	mouseup
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

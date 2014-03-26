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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractNode	TokenNameIdentifier	 Abstract Node
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
DOMException	TokenNameIdentifier	 DOM Exception
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGZoomAndPan	TokenNameIdentifier	 SVG Zoom And Pan
;	TokenNameSEMICOLON	
/** * This class provides support for SVGZoomAndPan features. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGZoomAndPanSupport.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for SVGZoomAndPan features. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGZoomAndPanSupport.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGZoomAndPanSupport	TokenNameIdentifier	 SVG Zoom And Pan Support
implements	TokenNameimplements	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
SVGZoomAndPanSupport	TokenNameIdentifier	 SVG Zoom And Pan Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the zoomAndPan attribute value. */	TokenNameCOMMENT_JAVADOC	 Sets the zoomAndPan attribute value. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setZoomAndPan	TokenNameIdentifier	 set Zoom And Pan
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
short	TokenNameshort	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGZoomAndPan	TokenNameIdentifier	 SVG Zoom And Pan
.	TokenNameDOT	
SVG_ZOOMANDPAN_DISABLE	TokenNameIdentifier	 SVG  ZOOMANDPAN  DISABLE
:	TokenNameCOLON	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ZOOM_AND_PAN_ATTRIBUTE	TokenNameIdentifier	 SVG  ZOOM  AND  PAN  ATTRIBUTE
,	TokenNameCOMMA	
SVG_DISABLE_VALUE	TokenNameIdentifier	 SVG  DISABLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGZoomAndPan	TokenNameIdentifier	 SVG Zoom And Pan
.	TokenNameDOT	
SVG_ZOOMANDPAN_MAGNIFY	TokenNameIdentifier	 SVG  ZOOMANDPAN  MAGNIFY
:	TokenNameCOLON	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ZOOM_AND_PAN_ATTRIBUTE	TokenNameIdentifier	 SVG  ZOOM  AND  PAN  ATTRIBUTE
,	TokenNameCOMMA	
SVG_MAGNIFY_VALUE	TokenNameIdentifier	 SVG  MAGNIFY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
)	TokenNameRPAREN	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_MODIFICATION_ERR	TokenNameIdentifier	 INVALID  MODIFICATION  ERR
,	TokenNameCOMMA	
"zoom.and.pan"	TokenNameStringLiteral	zoom.and.pan
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the ZoomAndPan attribute value. */	TokenNameCOMMENT_JAVADOC	 Returns the ZoomAndPan attribute value. 
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
getZoomAndPan	TokenNameIdentifier	 get Zoom And Pan
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ZOOM_AND_PAN_ATTRIBUTE	TokenNameIdentifier	 SVG  ZOOM  AND  PAN  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_MAGNIFY_VALUE	TokenNameIdentifier	 SVG  MAGNIFY  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGZoomAndPan	TokenNameIdentifier	 SVG Zoom And Pan
.	TokenNameDOT	
SVG_ZOOMANDPAN_MAGNIFY	TokenNameIdentifier	 SVG  ZOOMANDPAN  MAGNIFY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SVGZoomAndPan	TokenNameIdentifier	 SVG Zoom And Pan
.	TokenNameDOT	
SVG_ZOOMANDPAN_DISABLE	TokenNameIdentifier	 SVG  ZOOMANDPAN  DISABLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

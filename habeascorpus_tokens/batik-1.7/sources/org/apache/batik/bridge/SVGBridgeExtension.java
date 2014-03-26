/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This is a Service interface for classes that want to extend the * functionality of the Bridge, to support new tags in the rendering tree. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: SVGBridgeExtension.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a Service interface for classes that want to extend the functionality of the Bridge, to support new tags in the rendering tree. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: SVGBridgeExtension.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGBridgeExtension	TokenNameIdentifier	 SVG Bridge Extension
implements	TokenNameimplements	
BridgeExtension	TokenNameIdentifier	 Bridge Extension
{	TokenNameLBRACE	
/** * Return the priority of this Extension. Extensions are * registered from lowest to highest priority. So if for some * reason you need to come before/after another existing extension * make sure your priority is lower/higher than theirs. */	TokenNameCOMMENT_JAVADOC	 Return the priority of this Extension. Extensions are registered from lowest to highest priority. So if for some reason you need to come before/after another existing extension make sure your priority is lower/higher than theirs. 
public	TokenNamepublic	
float	TokenNamefloat	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return the list of extensions implemented * by this BridgeExtension. * @return An iterator containing strings one for each implemented * extension. */	TokenNameCOMMENT_JAVADOC	 This should return the list of extensions implemented by this BridgeExtension. @return An iterator containing strings one for each implemented extension. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getImplementedExtensions	TokenNameIdentifier	 get Implemented Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return the individual or company name responsible * for the this implementation of the extension. */	TokenNameCOMMENT_JAVADOC	 This should return the individual or company name responsible for the this implementation of the extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"The Apache Batik Team."	TokenNameStringLiteral	The Apache Batik Team.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should contain a contact address (usually an e-mail address). */	TokenNameCOMMENT_JAVADOC	 This should contain a contact address (usually an e-mail address). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContactAddress	TokenNameIdentifier	 get Contact Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"batik-dev@xmlgraphics.apache.org"	TokenNameStringLiteral	batik-dev@xmlgraphics.apache.org
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return a URL where information can be obtained on * this extension. */	TokenNameCOMMENT_JAVADOC	 This should return a URL where information can be obtained on this extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"http://xml.apache.org/batik"	TokenNameStringLiteral	http://xml.apache.org/batik
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Human readable description of the extension. * Perhaps that should be a resource for internationalization? * (although I suppose it could be done internally) */	TokenNameCOMMENT_JAVADOC	 Human readable description of the extension. Perhaps that should be a resource for internationalization? (although I suppose it could be done internally) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"The required SVG 1.0 tags"	TokenNameStringLiteral	The required SVG 1.0 tags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method should update the BridgeContext with support * for the tags in this extension. In some rare cases it may * be necessary to replace existing tag handlers, although this * is discouraged. * * @param ctx The BridgeContext instance to be updated */	TokenNameCOMMENT_JAVADOC	 This method should update the BridgeContext with support for the tags in this extension. In some rare cases it may be necessary to replace existing tag handlers, although this is discouraged. * @param ctx The BridgeContext instance to be updated 
public	TokenNamepublic	
void	TokenNamevoid	
registerTags	TokenNameIdentifier	 register Tags
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bridges to handle elements in the SVG namespace 	TokenNameCOMMENT_LINE	bridges to handle elements in the SVG namespace 
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGAElementBridge	TokenNameIdentifier	 SVGA Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGAltGlyphElementBridge	TokenNameIdentifier	 SVG Alt Glyph Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGCircleElementBridge	TokenNameIdentifier	 SVG Circle Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGClipPathElementBridge	TokenNameIdentifier	 SVG Clip Path Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGColorProfileElementBridge	TokenNameIdentifier	 SVG Color Profile Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGDescElementBridge	TokenNameIdentifier	 SVG Desc Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGEllipseElementBridge	TokenNameIdentifier	 SVG Ellipse Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeBlendElementBridge	TokenNameIdentifier	 SVG Fe Blend Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeColorMatrixElementBridge	TokenNameIdentifier	 SVG Fe Color Matrix Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeComponentTransferElementBridge	TokenNameIdentifier	 SVG Fe Component Transfer Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeCompositeElementBridge	TokenNameIdentifier	 SVG Fe Composite Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeComponentTransferElementBridge	TokenNameIdentifier	 SVG Fe Component Transfer Element Bridge
.	TokenNameDOT	
SVGFeFuncAElementBridge	TokenNameIdentifier	 SVG Fe Func A Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeComponentTransferElementBridge	TokenNameIdentifier	 SVG Fe Component Transfer Element Bridge
.	TokenNameDOT	
SVGFeFuncRElementBridge	TokenNameIdentifier	 SVG Fe Func R Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeComponentTransferElementBridge	TokenNameIdentifier	 SVG Fe Component Transfer Element Bridge
.	TokenNameDOT	
SVGFeFuncGElementBridge	TokenNameIdentifier	 SVG Fe Func G Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeComponentTransferElementBridge	TokenNameIdentifier	 SVG Fe Component Transfer Element Bridge
.	TokenNameDOT	
SVGFeFuncBElementBridge	TokenNameIdentifier	 SVG Fe Func B Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeConvolveMatrixElementBridge	TokenNameIdentifier	 SVG Fe Convolve Matrix Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeDiffuseLightingElementBridge	TokenNameIdentifier	 SVG Fe Diffuse Lighting Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeDisplacementMapElementBridge	TokenNameIdentifier	 SVG Fe Displacement Map Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractSVGLightingElementBridge	TokenNameIdentifier	 Abstract SVG Lighting Element Bridge
.	TokenNameDOT	
SVGFeDistantLightElementBridge	TokenNameIdentifier	 SVG Fe Distant Light Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeFloodElementBridge	TokenNameIdentifier	 SVG Fe Flood Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeGaussianBlurElementBridge	TokenNameIdentifier	 SVG Fe Gaussian Blur Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeImageElementBridge	TokenNameIdentifier	 SVG Fe Image Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeMergeElementBridge	TokenNameIdentifier	 SVG Fe Merge Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeMergeElementBridge	TokenNameIdentifier	 SVG Fe Merge Element Bridge
.	TokenNameDOT	
SVGFeMergeNodeElementBridge	TokenNameIdentifier	 SVG Fe Merge Node Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeMorphologyElementBridge	TokenNameIdentifier	 SVG Fe Morphology Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeOffsetElementBridge	TokenNameIdentifier	 SVG Fe Offset Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractSVGLightingElementBridge	TokenNameIdentifier	 Abstract SVG Lighting Element Bridge
.	TokenNameDOT	
SVGFePointLightElementBridge	TokenNameIdentifier	 SVG Fe Point Light Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeSpecularLightingElementBridge	TokenNameIdentifier	 SVG Fe Specular Lighting Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractSVGLightingElementBridge	TokenNameIdentifier	 Abstract SVG Lighting Element Bridge
.	TokenNameDOT	
SVGFeSpotLightElementBridge	TokenNameIdentifier	 SVG Fe Spot Light Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeTileElementBridge	TokenNameIdentifier	 SVG Fe Tile Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFeTurbulenceElementBridge	TokenNameIdentifier	 SVG Fe Turbulence Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFontElementBridge	TokenNameIdentifier	 SVG Font Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFontFaceElementBridge	TokenNameIdentifier	 SVG Font Face Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGFilterElementBridge	TokenNameIdentifier	 SVG Filter Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGGElementBridge	TokenNameIdentifier	 SVGG Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGGlyphElementBridge	TokenNameIdentifier	 SVG Glyph Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGHKernElementBridge	TokenNameIdentifier	 SVGH Kern Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGImageElementBridge	TokenNameIdentifier	 SVG Image Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGLineElementBridge	TokenNameIdentifier	 SVG Line Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGLinearGradientElementBridge	TokenNameIdentifier	 SVG Linear Gradient Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGMarkerElementBridge	TokenNameIdentifier	 SVG Marker Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGMaskElementBridge	TokenNameIdentifier	 SVG Mask Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGMissingGlyphElementBridge	TokenNameIdentifier	 SVG Missing Glyph Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPathElementBridge	TokenNameIdentifier	 SVG Path Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPatternElementBridge	TokenNameIdentifier	 SVG Pattern Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPolylineElementBridge	TokenNameIdentifier	 SVG Polyline Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPolygonElementBridge	TokenNameIdentifier	 SVG Polygon Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGRadialGradientElementBridge	TokenNameIdentifier	 SVG Radial Gradient Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGRectElementBridge	TokenNameIdentifier	 SVG Rect Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractSVGGradientElementBridge	TokenNameIdentifier	 Abstract SVG Gradient Element Bridge
.	TokenNameDOT	
SVGStopElementBridge	TokenNameIdentifier	 SVG Stop Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGSVGElementBridge	TokenNameIdentifier	 SVGSVG Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGSwitchElementBridge	TokenNameIdentifier	 SVG Switch Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGTextElementBridge	TokenNameIdentifier	 SVG Text Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGTextPathElementBridge	TokenNameIdentifier	 SVG Text Path Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGTitleElementBridge	TokenNameIdentifier	 SVG Title Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGUseElementBridge	TokenNameIdentifier	 SVG Use Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGVKernElementBridge	TokenNameIdentifier	 SVGV Kern Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGSetElementBridge	TokenNameIdentifier	 SVG Set Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGAnimateElementBridge	TokenNameIdentifier	 SVG Animate Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGAnimateColorElementBridge	TokenNameIdentifier	 SVG Animate Color Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGAnimateTransformElementBridge	TokenNameIdentifier	 SVG Animate Transform Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
putBridge	TokenNameIdentifier	 put Bridge
(	TokenNameLPAREN	
new	TokenNamenew	
SVGAnimateMotionElementBridge	TokenNameIdentifier	 SVG Animate Motion Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the presence of the specified element should cause * the document to be dynamic. If this element isn't handled * by this BridgeExtension, just return false. * * @param e The element to check. */	TokenNameCOMMENT_JAVADOC	 Whether the presence of the specified element should cause the document to be dynamic. If this element isn't handled by this BridgeExtension, just return false. * @param e The element to check. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDynamicElement	TokenNameIdentifier	 is Dynamic Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SCRIPT_TAG	TokenNameIdentifier	 SVG  SCRIPT  TAG
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"animate"	TokenNameStringLiteral	animate
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ln	TokenNameIdentifier	 ln
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_SET_TAG	TokenNameIdentifier	 SVG  SET  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

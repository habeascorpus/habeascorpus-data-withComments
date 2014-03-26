/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ColorSpace	TokenNameIdentifier	 Color Space
;	TokenNameSEMICOLON	
/** * This is an extension of our Filter interface that adds support for * a color-interpolation specification which indicates what colorspace the * operation should take place in. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: FilterColorInterpolation.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is an extension of our Filter interface that adds support for a color-interpolation specification which indicates what colorspace the operation should take place in. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: FilterColorInterpolation.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** * Returns true if this operation is to be performed in * the linear sRGB colorspace, returns false if the * operation is performed in gamma corrected sRGB. */	TokenNameCOMMENT_JAVADOC	 Returns true if this operation is to be performed in the linear sRGB colorspace, returns false if the operation is performed in gamma corrected sRGB. 
boolean	TokenNameboolean	
isColorSpaceLinear	TokenNameIdentifier	 is Color Space Linear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the colorspace the operation will be performed in. * @param csLinear if true this operation will be performed in the * linear sRGB colorspace, if false the operation will be performed in * gamma corrected sRGB. */	TokenNameCOMMENT_JAVADOC	 Sets the colorspace the operation will be performed in. @param csLinear if true this operation will be performed in the linear sRGB colorspace, if false the operation will be performed in gamma corrected sRGB. 
void	TokenNamevoid	
setColorSpaceLinear	TokenNameIdentifier	 set Color Space Linear
(	TokenNameLPAREN	
boolean	TokenNameboolean	
csLinear	TokenNameIdentifier	 cs Linear
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the ColorSpace that the object will perform * it's work in. */	TokenNameCOMMENT_JAVADOC	 Returns the ColorSpace that the object will perform it's work in. 
ColorSpace	TokenNameIdentifier	 Color Space
getOperationColorSpace	TokenNameIdentifier	 get Operation Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

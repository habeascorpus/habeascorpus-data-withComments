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
/** * Implements a Morphology operation, where the kernel size is * defined by radius along the x and y axis. * * @author <a href="mailto:sheng.pei@eng.sun.com">Sheng Pei</a> * @version $Id: MorphologyRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Implements a Morphology operation, where the kernel size is defined by radius along the x and y axis. * @author <a href="mailto:sheng.pei@eng.sun.com">Sheng Pei</a> @version $Id: MorphologyRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
MorphologyRable	TokenNameIdentifier	 Morphology Rable
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** * Returns the source to be offset. */	TokenNameCOMMENT_JAVADOC	 Returns the source to be offset. 
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the source to be offset. * @param src image to offset. */	TokenNameCOMMENT_JAVADOC	 Sets the source to be offset. @param src image to offset. 
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The radius along the x axis, in user space. * @param radiusX should be greater than zero. */	TokenNameCOMMENT_JAVADOC	 The radius along the x axis, in user space. @param radiusX should be greater than zero. 
void	TokenNamevoid	
setRadiusX	TokenNameIdentifier	 set Radius X
(	TokenNameLPAREN	
double	TokenNamedouble	
radiusX	TokenNameIdentifier	 radius X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The radius along the y axis, in user space. * @param radiusY should be greater than zero. */	TokenNameCOMMENT_JAVADOC	 The radius along the y axis, in user space. @param radiusY should be greater than zero. 
void	TokenNamevoid	
setRadiusY	TokenNameIdentifier	 set Radius Y
(	TokenNameLPAREN	
double	TokenNamedouble	
radiusY	TokenNameIdentifier	 radius Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The switch that determines if the operation * is to "dilate" or "erode". * @param doDilation do "dilation" when true and "erosion" when false */	TokenNameCOMMENT_JAVADOC	 The switch that determines if the operation is to "dilate" or "erode". @param doDilation do "dilation" when true and "erosion" when false 
void	TokenNamevoid	
setDoDilation	TokenNameIdentifier	 set Do Dilation
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doDilation	TokenNameIdentifier	 do Dilation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the operation is "dilation" or not("erosion") */	TokenNameCOMMENT_JAVADOC	 Returns whether the operation is "dilation" or not("erosion") 
boolean	TokenNameboolean	
getDoDilation	TokenNameIdentifier	 get Do Dilation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the radius along the x-axis, in user space. */	TokenNameCOMMENT_JAVADOC	 Returns the radius along the x-axis, in user space. 
double	TokenNamedouble	
getRadiusX	TokenNameIdentifier	 get Radius X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the radius along the y-axis, in user space. */	TokenNameCOMMENT_JAVADOC	 Returns the radius along the y-axis, in user space. 
double	TokenNamedouble	
getRadiusY	TokenNameIdentifier	 get Radius Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

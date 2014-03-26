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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
;	TokenNameSEMICOLON	
/** * Implements a DisplacementMap operation, which takes pixel values from * another image to spatially displace the input image * * @author <a href="mailto:sheng.pei@eng.sun.com">Sheng Pei</a> * @version $Id: DisplacementMapRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Implements a DisplacementMap operation, which takes pixel values from another image to spatially displace the input image * @author <a href="mailto:sheng.pei@eng.sun.com">Sheng Pei</a> @version $Id: DisplacementMapRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
DisplacementMapRable	TokenNameIdentifier	 Displacement Map Rable
extends	TokenNameextends	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
{	TokenNameLBRACE	
int	TokenNameint	
CHANNEL_R	TokenNameIdentifier	 CHANNEL  R
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
CHANNEL_G	TokenNameIdentifier	 CHANNEL  G
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
CHANNEL_B	TokenNameIdentifier	 CHANNEL  B
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
CHANNEL_A	TokenNameIdentifier	 CHANNEL  A
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The sources to be used in the displacement operation * The source at index 0 is displacement by the channels * in source at index 1 defined by the xChannelSelector * and the yChannelSelector. The displacement amount is * defined by the scale attribute. * * @param srcs The list of images used in the operation. */	TokenNameCOMMENT_JAVADOC	 The sources to be used in the displacement operation The source at index 0 is displacement by the channels in source at index 1 defined by the xChannelSelector and the yChannelSelector. The displacement amount is defined by the scale attribute. * @param srcs The list of images used in the operation. 
void	TokenNamevoid	
setSources	TokenNameIdentifier	 set Sources
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The displacement scale factor * @param scale can be any number. */	TokenNameCOMMENT_JAVADOC	 The displacement scale factor @param scale can be any number. 
void	TokenNamevoid	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the displacement scale factor */	TokenNameCOMMENT_JAVADOC	 Returns the displacement scale factor 
double	TokenNamedouble	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Select which component values will be used * for displacement along the X axis * @param xChannelSelector value is among R, * G, B and A. */	TokenNameCOMMENT_JAVADOC	 Select which component values will be used for displacement along the X axis @param xChannelSelector value is among R, G, B and A. 
void	TokenNamevoid	
setXChannelSelector	TokenNameIdentifier	 set X Channel Selector
(	TokenNameLPAREN	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
xChannelSelector	TokenNameIdentifier	 x Channel Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the xChannelSelector */	TokenNameCOMMENT_JAVADOC	 Returns the xChannelSelector 
ARGBChannel	TokenNameIdentifier	 ARGB Channel
getXChannelSelector	TokenNameIdentifier	 get X Channel Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Select which component values will be used * for displacement along the Y axis * @param yChannelSelector value is among R, * G, B and A. */	TokenNameCOMMENT_JAVADOC	 Select which component values will be used for displacement along the Y axis @param yChannelSelector value is among R, G, B and A. 
void	TokenNamevoid	
setYChannelSelector	TokenNameIdentifier	 set Y Channel Selector
(	TokenNameLPAREN	
ARGBChannel	TokenNameIdentifier	 ARGB Channel
yChannelSelector	TokenNameIdentifier	 y Channel Selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the yChannelSelector */	TokenNameCOMMENT_JAVADOC	 Returns the yChannelSelector 
ARGBChannel	TokenNameIdentifier	 ARGB Channel
getYChannelSelector	TokenNameIdentifier	 get Y Channel Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

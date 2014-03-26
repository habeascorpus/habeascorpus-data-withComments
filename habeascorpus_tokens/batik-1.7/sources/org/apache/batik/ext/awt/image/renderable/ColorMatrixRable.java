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
/** * Defines the interface expected from a color matrix * operation * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ColorMatrixRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Defines the interface expected from a color matrix operation * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ColorMatrixRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
extends	TokenNameextends	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
{	TokenNameLBRACE	
/** * Identifier used to refer to predefined matrices */	TokenNameCOMMENT_JAVADOC	 Identifier used to refer to predefined matrices 
int	TokenNameint	
TYPE_MATRIX	TokenNameIdentifier	 TYPE  MATRIX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
TYPE_SATURATE	TokenNameIdentifier	 TYPE  SATURATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
TYPE_HUE_ROTATE	TokenNameIdentifier	 TYPE  HUE  ROTATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
TYPE_LUMINANCE_TO_ALPHA	TokenNameIdentifier	 TYPE  LUMINANCE  TO  ALPHA
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
/** * Returns the type of this color matrix. * @return one of TYPE_MATRIX, TYPE_SATURATE, TYPE_HUE_ROTATE, * TYPE_LUMINANCE_TO_ALPHA */	TokenNameCOMMENT_JAVADOC	 Returns the type of this color matrix. @return one of TYPE_MATRIX, TYPE_SATURATE, TYPE_HUE_ROTATE, TYPE_LUMINANCE_TO_ALPHA 
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the rows of the color matrix. This uses * the same convention as BandCombineOp. */	TokenNameCOMMENT_JAVADOC	 Returns the rows of the color matrix. This uses the same convention as BandCombineOp. 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

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
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
;	TokenNameSEMICOLON	
/** * Defines the interface expected from a component * transfer operation. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ComponentTransferRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Defines the interface expected from a component transfer operation. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ComponentTransferRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ComponentTransferRable	TokenNameIdentifier	 Component Transfer Rable
extends	TokenNameextends	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
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
/** * Returns the transfer function for the alpha channel */	TokenNameCOMMENT_JAVADOC	 Returns the transfer function for the alpha channel 
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getAlphaFunction	TokenNameIdentifier	 get Alpha Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transfer function for the alpha channel */	TokenNameCOMMENT_JAVADOC	 Sets the transfer function for the alpha channel 
void	TokenNamevoid	
setAlphaFunction	TokenNameIdentifier	 set Alpha Function
(	TokenNameLPAREN	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
alphaFunction	TokenNameIdentifier	 alpha Function
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transfer function for the red channel */	TokenNameCOMMENT_JAVADOC	 Returns the transfer function for the red channel 
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getRedFunction	TokenNameIdentifier	 get Red Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transfer function for the red channel */	TokenNameCOMMENT_JAVADOC	 Sets the transfer function for the red channel 
void	TokenNamevoid	
setRedFunction	TokenNameIdentifier	 set Red Function
(	TokenNameLPAREN	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
redFunction	TokenNameIdentifier	 red Function
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transfer function for the green channel */	TokenNameCOMMENT_JAVADOC	 Returns the transfer function for the green channel 
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getGreenFunction	TokenNameIdentifier	 get Green Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transfer function for the green channel */	TokenNameCOMMENT_JAVADOC	 Sets the transfer function for the green channel 
void	TokenNamevoid	
setGreenFunction	TokenNameIdentifier	 set Green Function
(	TokenNameLPAREN	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
greenFunction	TokenNameIdentifier	 green Function
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transfer function for the blue channel */	TokenNameCOMMENT_JAVADOC	 Returns the transfer function for the blue channel 
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getBlueFunction	TokenNameIdentifier	 get Blue Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transfer function for the blue channel */	TokenNameCOMMENT_JAVADOC	 Sets the transfer function for the blue channel 
void	TokenNamevoid	
setBlueFunction	TokenNameIdentifier	 set Blue Function
(	TokenNameLPAREN	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
blueFunction	TokenNameIdentifier	 blue Function
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

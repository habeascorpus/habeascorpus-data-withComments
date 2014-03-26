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
/** * Adjusts the input images coordinate system by dx, dy. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: OffsetRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Adjusts the input images coordinate system by dx, dy. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: OffsetRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
OffsetRable	TokenNameIdentifier	 Offset Rable
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
/** * Set the x offset. * @param dx the amount to offset in the x direction */	TokenNameCOMMENT_JAVADOC	 Set the x offset. @param dx the amount to offset in the x direction 
void	TokenNamevoid	
setXoffset	TokenNameIdentifier	 set Xoffset
(	TokenNameLPAREN	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the x offset. * @return the amount to offset in the x direction */	TokenNameCOMMENT_JAVADOC	 Get the x offset. @return the amount to offset in the x direction 
double	TokenNamedouble	
getXoffset	TokenNameIdentifier	 get Xoffset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the y offset. * @param dy the amount to offset in the y direction */	TokenNameCOMMENT_JAVADOC	 Set the y offset. @param dy the amount to offset in the y direction 
void	TokenNamevoid	
setYoffset	TokenNameIdentifier	 set Yoffset
(	TokenNameLPAREN	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the y offset. * @return the amount to offset in the y direction */	TokenNameCOMMENT_JAVADOC	 Get the y offset. @return the amount to offset in the y direction 
double	TokenNamedouble	
getYoffset	TokenNameIdentifier	 get Yoffset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

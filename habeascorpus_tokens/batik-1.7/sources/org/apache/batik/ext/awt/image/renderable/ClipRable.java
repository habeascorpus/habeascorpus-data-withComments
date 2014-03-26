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
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
/** * Implements a clip operation. This is similar to the mask operation * except it uses a '1 bit' mask (it's normally anti-aliased, but * shouldn't have any fluctions in side the outline of the shape.). * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: ClipRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Implements a clip operation. This is similar to the mask operation except it uses a '1 bit' mask (it's normally anti-aliased, but shouldn't have any fluctions in side the outline of the shape.). * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: ClipRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ClipRable	TokenNameIdentifier	 Clip Rable
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** * Set the default behaviour of anti-aliased clipping. * for this clip object. */	TokenNameCOMMENT_JAVADOC	 Set the default behaviour of anti-aliased clipping. for this clip object. 
void	TokenNamevoid	
setUseAntialiasedClip	TokenNameIdentifier	 set Use Antialiased Clip
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useAA	TokenNameIdentifier	 use AA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Resturns true if the default behaviour should be to use * anti-aliased clipping. */	TokenNameCOMMENT_JAVADOC	 Resturns true if the default behaviour should be to use anti-aliased clipping. 
boolean	TokenNameboolean	
getUseAntialiasedClip	TokenNameIdentifier	 get Use Antialiased Clip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The source to be clipped by the outline of the clip node. * @param src The Image to be clipped. */	TokenNameCOMMENT_JAVADOC	 The source to be clipped by the outline of the clip node. @param src The Image to be clipped. 
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This returns the current image being clipped by the clip node. * @return The image to clip */	TokenNameCOMMENT_JAVADOC	 This returns the current image being clipped by the clip node. @return The image to clip 
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the clip path to use. * The path will be filled with opaque white, to define the * the clipping mask. * @param clipPath The clip path to use */	TokenNameCOMMENT_JAVADOC	 Set the clip path to use. The path will be filled with opaque white, to define the the clipping mask. @param clipPath The clip path to use 
void	TokenNamevoid	
setClipPath	TokenNameIdentifier	 set Clip Path
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
clipPath	TokenNameIdentifier	 clip Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the Shape that the Clip will use to * define the clip path. * @return The shape that defines the clip path. */	TokenNameCOMMENT_JAVADOC	 Returns the Shape that the Clip will use to define the clip path. @return The shape that defines the clip path. 
Shape	TokenNameIdentifier	 Shape
getClipPath	TokenNameIdentifier	 get Clip Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

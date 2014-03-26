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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
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
PadMode	TokenNameIdentifier	 Pad Mode
;	TokenNameSEMICOLON	
/** * Pads image to the given Rectangle (the rect may be smaller than the * image in which case this is actually a crop). The rectangle is * specified in the user coordinate system of this Renderable. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: PadRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Pads image to the given Rectangle (the rect may be smaller than the image in which case this is actually a crop). The rectangle is specified in the user coordinate system of this Renderable. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: PadRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
PadRable	TokenNameIdentifier	 Pad Rable
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** * Returns the source to be padded */	TokenNameCOMMENT_JAVADOC	 Returns the source to be padded 
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the source to be padded * @param src image to offset. */	TokenNameCOMMENT_JAVADOC	 Sets the source to be padded @param src image to offset. 
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the current rectangle for padding. * @param rect the new rectangle to use for pad. */	TokenNameCOMMENT_JAVADOC	 Set the current rectangle for padding. @param rect the new rectangle to use for pad. 
void	TokenNamevoid	
setPadRect	TokenNameIdentifier	 set Pad Rect
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current rectangle for padding * @return Rectangle currently in use for pad. */	TokenNameCOMMENT_JAVADOC	 Get the current rectangle for padding @return Rectangle currently in use for pad. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPadRect	TokenNameIdentifier	 get Pad Rect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the current extension mode for pad * @param mode the new pad mode */	TokenNameCOMMENT_JAVADOC	 Set the current extension mode for pad @param mode the new pad mode 
void	TokenNamevoid	
setPadMode	TokenNameIdentifier	 set Pad Mode
(	TokenNameLPAREN	
PadMode	TokenNameIdentifier	 Pad Mode
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current extension mode for pad * @return Mode currently in use for pad */	TokenNameCOMMENT_JAVADOC	 Get the current extension mode for pad @return Mode currently in use for pad 
PadMode	TokenNameIdentifier	 Pad Mode
getPadMode	TokenNameIdentifier	 get Pad Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

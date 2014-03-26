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
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
/** * Interface for Rable's that can more efficently represent there * action as a paint method instead of a RenderedImage when going to a * Graphics2D anyways. * * @version $Id: PaintRable.java 478363 2006-11-22 23:01:13Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Interface for Rable's that can more efficently represent there action as a paint method instead of a RenderedImage when going to a Graphics2D anyways. * @version $Id: PaintRable.java 478363 2006-11-22 23:01:13Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
PaintRable	TokenNameIdentifier	 Paint Rable
{	TokenNameLBRACE	
/** * Should perform the equivilent action as * createRendering followed by drawing the RenderedImage. * * @param g2d The Graphics2D to draw to. * @return true if the paint call succeeded, false if * for some reason the paint failed (in which * case a createRendering should be used). */	TokenNameCOMMENT_JAVADOC	 Should perform the equivilent action as createRendering followed by drawing the RenderedImage. * @param g2d The Graphics2D to draw to. @return true if the paint call succeeded, false if for some reason the paint failed (in which case a createRendering should be used). 
boolean	TokenNameboolean	
paintRable	TokenNameIdentifier	 paint Rable
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

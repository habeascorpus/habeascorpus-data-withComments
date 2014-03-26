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
Paint	TokenNameIdentifier	 Paint
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
/** * Fills the input image with a given paint * * @author <a href="mailto:dean@w3.org">Dean Jackson</a> * @version $Id: FloodRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Fills the input image with a given paint * @author <a href="mailto:dean@w3.org">Dean Jackson</a> @version $Id: FloodRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
FloodRable	TokenNameIdentifier	 Flood Rable
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
/** * Set the flood paint. * @param paint the flood paint to use when filling */	TokenNameCOMMENT_JAVADOC	 Set the flood paint. @param paint the flood paint to use when filling 
void	TokenNamevoid	
setFloodPaint	TokenNameIdentifier	 set Flood Paint
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
paint	TokenNameIdentifier	 paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the flood paint. * @return The current flood paint for the filter */	TokenNameCOMMENT_JAVADOC	 Get the flood paint. @return The current flood paint for the filter 
Paint	TokenNameIdentifier	 Paint
getFloodPaint	TokenNameIdentifier	 get Flood Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the flood region * @param floodRegion region to flood with floodPaint */	TokenNameCOMMENT_JAVADOC	 Sets the flood region @param floodRegion region to flood with floodPaint 
void	TokenNamevoid	
setFloodRegion	TokenNameIdentifier	 set Flood Region
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
floodRegion	TokenNameIdentifier	 flood Region
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the flood region */	TokenNameCOMMENT_JAVADOC	 Get the flood region 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getFloodRegion	TokenNameIdentifier	 get Flood Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

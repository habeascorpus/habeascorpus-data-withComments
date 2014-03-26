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
CompositeRule	TokenNameIdentifier	 Composite Rule
;	TokenNameSEMICOLON	
/** * Composites a list of images according to a single composite rule. * the image are applied in the order they are in the List given. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: CompositeRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Composites a list of images according to a single composite rule. the image are applied in the order they are in the List given. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: CompositeRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CompositeRable	TokenNameIdentifier	 Composite Rable
extends	TokenNameextends	
FilterColorInterpolation	TokenNameIdentifier	 Filter Color Interpolation
{	TokenNameLBRACE	
/** * The sources to be composited togeather. * @param srcs The list of images to be composited by the composite rule. */	TokenNameCOMMENT_JAVADOC	 The sources to be composited togeather. @param srcs The list of images to be composited by the composite rule. 
void	TokenNamevoid	
setSources	TokenNameIdentifier	 set Sources
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the composite rule to use for combining the sources. * @param cr Composite rule to use. */	TokenNameCOMMENT_JAVADOC	 Set the composite rule to use for combining the sources. @param cr Composite rule to use. 
void	TokenNamevoid	
setCompositeRule	TokenNameIdentifier	 set Composite Rule
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the composite rule in use for combining the sources. * @return Composite rule currently in use. */	TokenNameCOMMENT_JAVADOC	 Get the composite rule in use for combining the sources. @return Composite rule currently in use. 
CompositeRule	TokenNameIdentifier	 Composite Rule
getCompositeRule	TokenNameIdentifier	 get Composite Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

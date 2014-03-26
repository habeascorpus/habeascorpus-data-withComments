/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
media	TokenNameIdentifier	 media
.	TokenNameDOT	
jai	TokenNameIdentifier	 jai
.	TokenNameDOT	
PlanarImage	TokenNameIdentifier	 Planar Image
;	TokenNameSEMICOLON	
/** * * @see org.apache.tools.ant.taskdefs.optional.image.Image */	TokenNameCOMMENT_JAVADOC	 * @see org.apache.tools.ant.taskdefs.optional.image.Image 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TransformOperation	TokenNameIdentifier	 Transform Operation
extends	TokenNameextends	
ImageOperation	TokenNameIdentifier	 Image Operation
{	TokenNameLBRACE	
/** * Performs the transformations. * @param img The image to perform the transformation on. * @return the transformed image. */	TokenNameCOMMENT_JAVADOC	 Performs the transformations. @param img The image to perform the transformation on. @return the transformed image. 
public	TokenNamepublic	
abstract	TokenNameabstract	
PlanarImage	TokenNameIdentifier	 Planar Image
executeTransformOperation	TokenNameIdentifier	 execute Transform Operation
(	TokenNameLPAREN	
PlanarImage	TokenNameIdentifier	 Planar Image
img	TokenNameIdentifier	 img
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
addRectangle	TokenNameIdentifier	 add Rectangle
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
instr	TokenNameIdentifier	 instr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
instr	TokenNameIdentifier	 instr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

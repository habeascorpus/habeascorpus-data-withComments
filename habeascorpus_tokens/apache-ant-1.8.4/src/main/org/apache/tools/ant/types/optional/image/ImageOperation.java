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
DataType	TokenNameIdentifier	 Data Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * * @see org.apache.tools.ant.taskdefs.optional.image.Image */	TokenNameCOMMENT_JAVADOC	 * @see org.apache.tools.ant.taskdefs.optional.image.Image 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ImageOperation	TokenNameIdentifier	 Image Operation
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
instructions	TokenNameIdentifier	 instructions
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Add a rotate to the operation. * @param instr the rotate to add. */	TokenNameCOMMENT_JAVADOC	 Add a rotate to the operation. @param instr the rotate to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addRotate	TokenNameIdentifier	 add Rotate
(	TokenNameLPAREN	
Rotate	TokenNameIdentifier	 Rotate
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
/** * Add a draw to the operation. * @param instr the draw to add. */	TokenNameCOMMENT_JAVADOC	 Add a draw to the operation. @param instr the draw to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addDraw	TokenNameIdentifier	 add Draw
(	TokenNameLPAREN	
Draw	TokenNameIdentifier	 Draw
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
/** * Add a rectangle to the operation. * @param instr the rectangle to add. */	TokenNameCOMMENT_JAVADOC	 Add a rectangle to the operation. @param instr the rectangle to add. 
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
/** * Add text to the operation. * @param instr the text to add. */	TokenNameCOMMENT_JAVADOC	 Add text to the operation. @param instr the text to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
Text	TokenNameIdentifier	 Text
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
/** * Add a scale to the operation. * @param instr the scale to add. */	TokenNameCOMMENT_JAVADOC	 Add a scale to the operation. @param instr the scale to add. 
public	TokenNamepublic	
void	TokenNamevoid	
addScale	TokenNameIdentifier	 add Scale
(	TokenNameLPAREN	
Scale	TokenNameIdentifier	 Scale
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

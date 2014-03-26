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
/** Draw a basic shape */	TokenNameCOMMENT_JAVADOC	 Draw a basic shape 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BasicShape	TokenNameIdentifier	 Basic Shape
extends	TokenNameextends	
ImageOperation	TokenNameIdentifier	 Image Operation
implements	TokenNameimplements	
DrawOperation	TokenNameIdentifier	 Draw Operation
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
// CheckStyle:MemberNameCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:MemberNameCheck OFF - bc 
protected	TokenNameprotected	
int	TokenNameint	
stroke_width	TokenNameIdentifier	 stroke width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// CheckStyle:MemberNameCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:MemberNameCheck ON 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
"transparent"	TokenNameStringLiteral	transparent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
stroke	TokenNameIdentifier	 stroke
=	TokenNameEQUAL	
"black"	TokenNameStringLiteral	black
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Set the fill attribute. * @param col the color value to use. */	TokenNameCOMMENT_JAVADOC	 Set the fill attribute. @param col the color value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setFill	TokenNameIdentifier	 set Fill
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the stroke attribute. * @param col the color value to use. */	TokenNameCOMMENT_JAVADOC	 Set the stroke attribute. @param col the color value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setStroke	TokenNameIdentifier	 set Stroke
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stroke	TokenNameIdentifier	 stroke
=	TokenNameEQUAL	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the stroke width attribute. * @param width the value to use. */	TokenNameCOMMENT_JAVADOC	 Set the stroke width attribute. @param width the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setStrokewidth	TokenNameIdentifier	 set Strokewidth
(	TokenNameLPAREN	
int	TokenNameint	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stroke_width	TokenNameIdentifier	 stroke width
=	TokenNameEQUAL	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

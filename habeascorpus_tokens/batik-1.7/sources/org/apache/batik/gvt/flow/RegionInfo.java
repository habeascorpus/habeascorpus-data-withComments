/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
flow	TokenNameIdentifier	 flow
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
/** * This class holds the neccessary information to render a * &lt;batik:flowRegion> that is defined within the &lt;batik:flowRoot> * element. Namely it holds the bounds of the region and the desired * vertical alignment. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: RegionInfo.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class holds the neccessary information to render a &lt;batik:flowRegion> that is defined within the &lt;batik:flowRoot> element. Namely it holds the bounds of the region and the desired vertical alignment. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: RegionInfo.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RegionInfo	TokenNameIdentifier	 Region Info
{	TokenNameLBRACE	
/** * The shape that defines the region. */	TokenNameCOMMENT_JAVADOC	 The shape that defines the region. 
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
/** * The alignment proportion. */	TokenNameCOMMENT_JAVADOC	 The alignment proportion. 
private	TokenNameprivate	
float	TokenNamefloat	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
;	TokenNameSEMICOLON	
/** * Creates a new RegionInfo with the given shape and alignment. */	TokenNameCOMMENT_JAVADOC	 Creates a new RegionInfo with the given shape and alignment. 
public	TokenNamepublic	
RegionInfo	TokenNameIdentifier	 Region Info
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
float	TokenNamefloat	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
=	TokenNameEQUAL	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the flow region shape. */	TokenNameCOMMENT_JAVADOC	 Returns the flow region shape. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the flow region shape. */	TokenNameCOMMENT_JAVADOC	 Sets the flow region shape. 
public	TokenNamepublic	
void	TokenNamevoid	
setShape	TokenNameIdentifier	 set Shape
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the vertical alignment for this flow region. * @return the vertical alignment for this flow region. * It will be 0.0 for top, 0.5 for middle and 1.0 for bottom. */	TokenNameCOMMENT_JAVADOC	 Gets the vertical alignment for this flow region. @return the vertical alignment for this flow region. It will be 0.0 for top, 0.5 for middle and 1.0 for bottom. 
public	TokenNamepublic	
float	TokenNamefloat	
getVerticalAlignment	TokenNameIdentifier	 get Vertical Alignment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the alignment position of the text within this flow region. * The value must be 0.0 for top, 0.5 for middle and 1.0 for bottom. * @param verticalAlignment the vertical alignment of the text. */	TokenNameCOMMENT_JAVADOC	 Sets the alignment position of the text within this flow region. The value must be 0.0 for top, 0.5 for middle and 1.0 for bottom. @param verticalAlignment the vertical alignment of the text. 
public	TokenNamepublic	
void	TokenNamevoid	
setVerticalAlignment	TokenNameIdentifier	 set Vertical Alignment
(	TokenNameLPAREN	
float	TokenNamefloat	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
=	TokenNameEQUAL	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

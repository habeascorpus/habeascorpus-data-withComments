/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
/** * This class holds the neccessary information to render a * &lt;batik:flowRegion> that is defined within the &lt;batik:flowRoot> * element. Namely it holds the bounds of the region and the desired * vertical alignment. * * @version $Id: RegionInfo.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class holds the neccessary information to render a &lt;batik:flowRegion> that is defined within the &lt;batik:flowRoot> element. Namely it holds the bounds of the region and the desired vertical alignment. * @version $Id: RegionInfo.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RegionInfo	TokenNameIdentifier	 Region Info
extends	TokenNameextends	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
{	TokenNameLBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RegionInfo	TokenNameIdentifier	 Region Info
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
float	TokenNamefloat	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
=	TokenNameEQUAL	
verticalAlignment	TokenNameIdentifier	 vertical Alignment
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

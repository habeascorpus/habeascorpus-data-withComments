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
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
;	TokenNameSEMICOLON	
/** * This class encapsulates the layout information about a single line * in a multi-line flow. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: LineInfo.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class encapsulates the layout information about a single line in a multi-line flow. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: LineInfo.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
LineInfo	TokenNameIdentifier	 Line Info
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
int	TokenNameint	
endIdx	TokenNameIdentifier	 end Idx
;	TokenNameSEMICOLON	
float	TokenNamefloat	
advance	TokenNameIdentifier	 advance
;	TokenNameSEMICOLON	
float	TokenNamefloat	
visualAdvance	TokenNameIdentifier	 visual Advance
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lastCharWidth	TokenNameIdentifier	 last Char Width
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lineWidth	TokenNameIdentifier	 line Width
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
partial	TokenNameIdentifier	 partial
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
LineInfo	TokenNameIdentifier	 Line Info
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
loc	TokenNameIdentifier	 loc
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
,	TokenNameCOMMA	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
,	TokenNameCOMMA	
int	TokenNameint	
endIdx	TokenNameIdentifier	 end Idx
,	TokenNameCOMMA	
float	TokenNamefloat	
advance	TokenNameIdentifier	 advance
,	TokenNameCOMMA	
float	TokenNamefloat	
visualAdvance	TokenNameIdentifier	 visual Advance
,	TokenNameCOMMA	
float	TokenNamefloat	
lastCharWidth	TokenNameIdentifier	 last Char Width
,	TokenNameCOMMA	
float	TokenNamefloat	
lineWidth	TokenNameIdentifier	 line Width
,	TokenNameCOMMA	
boolean	TokenNameboolean	
partial	TokenNameIdentifier	 partial
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endIdx	TokenNameIdentifier	 end Idx
=	TokenNameEQUAL	
endIdx	TokenNameIdentifier	 end Idx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
visualAdvance	TokenNameIdentifier	 visual Advance
=	TokenNameEQUAL	
visualAdvance	TokenNameIdentifier	 visual Advance
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastCharWidth	TokenNameIdentifier	 last Char Width
=	TokenNameEQUAL	
lastCharWidth	TokenNameIdentifier	 last Char Width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lineWidth	TokenNameIdentifier	 line Width
=	TokenNameEQUAL	
lineWidth	TokenNameIdentifier	 line Width
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
partial	TokenNameIdentifier	 partial
=	TokenNameEQUAL	
partial	TokenNameIdentifier	 partial
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
=	TokenNameEQUAL	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
getACI	TokenNameIdentifier	 get ACI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aci	TokenNameIdentifier	 aci
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
getGlyphVector	TokenNameIdentifier	 get Glyph Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStartIdx	TokenNameIdentifier	 get Start Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEndIdx	TokenNameIdentifier	 get End Idx
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endIdx	TokenNameIdentifier	 end Idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
advance	TokenNameIdentifier	 advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getVisualAdvance	TokenNameIdentifier	 get Visual Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
visualAdvance	TokenNameIdentifier	 visual Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getLastCharWidth	TokenNameIdentifier	 get Last Char Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastCharWidth	TokenNameIdentifier	 last Char Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getLineWidth	TokenNameIdentifier	 get Line Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lineWidth	TokenNameIdentifier	 line Width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPartialLine	TokenNameIdentifier	 is Partial Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partial	TokenNameIdentifier	 partial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
getVerticalAlignOffset	TokenNameIdentifier	 get Vertical Align Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[LineInfo loc: "	TokenNameStringLiteral	[LineInfo loc: 
+	TokenNamePLUS	
loc	TokenNameIdentifier	 loc
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
startIdx	TokenNameIdentifier	 start Idx
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
endIdx	TokenNameIdentifier	 end Idx
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
+	TokenNamePLUS	
" LWidth: "	TokenNameStringLiteral	 LWidth: 
+	TokenNamePLUS	
lineWidth	TokenNameIdentifier	 line Width
+	TokenNamePLUS	
" Adv: "	TokenNameStringLiteral	 Adv: 
+	TokenNamePLUS	
advance	TokenNameIdentifier	 advance
+	TokenNamePLUS	
" VAdv: "	TokenNameStringLiteral	 VAdv: 
+	TokenNamePLUS	
visualAdvance	TokenNameIdentifier	 visual Advance
+	TokenNamePLUS	
" LCW: "	TokenNameStringLiteral	 LCW: 
+	TokenNamePLUS	
lastCharWidth	TokenNameIdentifier	 last Char Width
+	TokenNamePLUS	
" Partial: "	TokenNameStringLiteral	 Partial: 
+	TokenNamePLUS	
partial	TokenNameIdentifier	 partial
+	TokenNamePLUS	
" verticalAlignOffset: "	TokenNameStringLiteral	 verticalAlignOffset: 
+	TokenNamePLUS	
verticalAlignOffset	TokenNameIdentifier	 vertical Align Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

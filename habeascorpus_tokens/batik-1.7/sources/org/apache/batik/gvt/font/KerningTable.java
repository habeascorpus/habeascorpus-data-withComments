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
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
/** * The KerningTable class holds a kerning table (a collection of Kern * elements). It provides a more convenient method of looking up kerning values * when laying out glyphs. * * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> * @version $Id: KerningTable.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 The KerningTable class holds a kerning table (a collection of Kern elements). It provides a more convenient method of looking up kerning values when laying out glyphs. * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> @version $Id: KerningTable.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
KerningTable	TokenNameIdentifier	 Kerning Table
{	TokenNameLBRACE	
private	TokenNameprivate	
Kern	TokenNameIdentifier	 Kern
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
/** * Creates a KerningTable from an array of Kern entries. * * @param entries The array of Kern objects that represent the kerning * entries for the font that this kerning table belongs to. */	TokenNameCOMMENT_JAVADOC	 Creates a KerningTable from an array of Kern entries. * @param entries The array of Kern objects that represent the kerning entries for the font that this kerning table belongs to. 
public	TokenNamepublic	
KerningTable	TokenNameIdentifier	 Kerning Table
(	TokenNameLPAREN	
Kern	TokenNameIdentifier	 Kern
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the amount of kerning that should be added between the given * glyphs. Returns 0 if the glyphs should not be kerned. * * @param glyphCode1 The id of the first glyph in the kerning pair * @param glyphCode2 The id of the second glyph in the kerning pair * @param glyphUnicode1 The unicode value of the first glyph in * the kerning pair * @param glyphUnicode2 The unicode vlaue of the second glyph in * the kerning pair * @return The amount of kerning to be added when laying out the glyphs */	TokenNameCOMMENT_JAVADOC	 Returns the amount of kerning that should be added between the given glyphs. Returns 0 if the glyphs should not be kerned. * @param glyphCode1 The id of the first glyph in the kerning pair @param glyphCode2 The id of the second glyph in the kerning pair @param glyphUnicode1 The unicode value of the first glyph in the kerning pair @param glyphUnicode2 The unicode vlaue of the second glyph in the kerning pair @return The amount of kerning to be added when laying out the glyphs 
public	TokenNamepublic	
float	TokenNamefloat	
getKerningValue	TokenNameIdentifier	 get Kerning Value
(	TokenNameLPAREN	
int	TokenNameint	
glyphCode1	TokenNameIdentifier	 glyph Code1
,	TokenNameCOMMA	
int	TokenNameint	
glyphCode2	TokenNameIdentifier	 glyph Code2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
glyphUnicode1	TokenNameIdentifier	 glyph Unicode1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
glyphUnicode2	TokenNameIdentifier	 glyph Unicode2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
matchesFirstGlyph	TokenNameIdentifier	 matches First Glyph
(	TokenNameLPAREN	
glyphCode1	TokenNameIdentifier	 glyph Code1
,	TokenNameCOMMA	
glyphUnicode1	TokenNameIdentifier	 glyph Unicode1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
matchesSecondGlyph	TokenNameIdentifier	 matches Second Glyph
(	TokenNameLPAREN	
glyphCode2	TokenNameIdentifier	 glyph Code2
,	TokenNameCOMMA	
glyphUnicode2	TokenNameIdentifier	 glyph Unicode2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAdjustValue	TokenNameIdentifier	 get Adjust Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

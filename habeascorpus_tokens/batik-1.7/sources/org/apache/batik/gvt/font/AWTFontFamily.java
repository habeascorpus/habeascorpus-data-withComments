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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
;	TokenNameSEMICOLON	
/** * A font family class for AWT fonts. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: AWTFontFamily.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A font family class for AWT fonts. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: AWTFontFamily.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
implements	TokenNameimplements	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
TEXT_COMPOUND_DELIMITER	TokenNameIdentifier	 TEXT  COMPOUND  DELIMITER
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
TEXT_COMPOUND_DELIMITER	TokenNameIdentifier	 TEXT  COMPOUND  DELIMITER
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
fontFace	TokenNameIdentifier	 font Face
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
/** * Constructs an AWTFontFamily with the specified familyName. * * @param fontFace The name of the font family. */	TokenNameCOMMENT_JAVADOC	 Constructs an AWTFontFamily with the specified familyName. * @param fontFace The name of the font family. 
public	TokenNamepublic	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
(	TokenNameLPAREN	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
fontFace	TokenNameIdentifier	 font Face
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fontFace	TokenNameIdentifier	 font Face
=	TokenNameEQUAL	
fontFace	TokenNameIdentifier	 font Face
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an AWTFontFamily with the specified familyName. * * @param familyName The name of the font family. */	TokenNameCOMMENT_JAVADOC	 Constructs an AWTFontFamily with the specified familyName. * @param familyName The name of the font family. 
public	TokenNamepublic	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
(	TokenNameLPAREN	
familyName	TokenNameIdentifier	 family Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an AWTFontFamily with the specified familyName. * * @param fontFace The name of the font family. */	TokenNameCOMMENT_JAVADOC	 Constructs an AWTFontFamily with the specified familyName. * @param fontFace The name of the font family. 
public	TokenNamepublic	
AWTFontFamily	TokenNameIdentifier	 AWT Font Family
(	TokenNameLPAREN	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
fontFace	TokenNameIdentifier	 font Face
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fontFace	TokenNameIdentifier	 font Face
=	TokenNameEQUAL	
fontFace	TokenNameIdentifier	 font Face
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font family name. * * @return The family name. */	TokenNameCOMMENT_JAVADOC	 Returns the font family name. * @return The family name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font-face information for this font family. */	TokenNameCOMMENT_JAVADOC	 Returns the font-face information for this font family. 
public	TokenNamepublic	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
getFontFace	TokenNameIdentifier	 get Font Face
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fontFace	TokenNameIdentifier	 font Face
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Derives a GVTFont object of the correct size. * * @param size The required size of the derived font. * @param aci The character iterator that will be rendered using * the derived font. */	TokenNameCOMMENT_JAVADOC	 Derives a GVTFont object of the correct size. * @param size The required size of the derived font. @param aci The character iterator that will be rendered using the derived font. 
public	TokenNamepublic	
GVTFont	TokenNameIdentifier	 GVT Font
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Derives a GVTFont object of the correct size from an attribute Map. * @param size The required size of the derived font. * @param attrs The Attribute Map to get Values from. */	TokenNameCOMMENT_JAVADOC	 Derives a GVTFont object of the correct size from an attribute Map. @param size The required size of the derived font. @param attrs The Attribute Map to get Values from. 
public	TokenNamepublic	
GVTFont	TokenNameIdentifier	 GVT Font
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
fontAttributes	TokenNameIdentifier	 font Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
FAMILY	TokenNameIdentifier	 FAMILY
,	TokenNameCOMMA	
fontFace	TokenNameIdentifier	 font Face
.	TokenNameDOT	
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
TEXT_COMPOUND_DELIMITER	TokenNameIdentifier	 TEXT  COMPOUND  DELIMITER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
AWTGVTFont	TokenNameIdentifier	 AWTGVT Font
(	TokenNameLPAREN	
fontAttributes	TokenNameIdentifier	 font Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

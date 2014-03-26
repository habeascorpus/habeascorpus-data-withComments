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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * A font family class for unresolved fonts. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: UnresolvedFontFamily.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A font family class for unresolved fonts. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: UnresolvedFontFamily.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
UnresolvedFontFamily	TokenNameIdentifier	 Unresolved Font Family
implements	TokenNameimplements	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
{	TokenNameLBRACE	
protected	TokenNameprotected	
GVTFontFace	TokenNameIdentifier	 GVT Font Face
fontFace	TokenNameIdentifier	 font Face
;	TokenNameSEMICOLON	
/** * Constructs an UnresolvedFontFamily with the specified familyName. * * @param fontFace The name of the font family. */	TokenNameCOMMENT_JAVADOC	 Constructs an UnresolvedFontFamily with the specified familyName. * @param fontFace The name of the font family. 
public	TokenNamepublic	
UnresolvedFontFamily	TokenNameIdentifier	 Unresolved Font Family
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
/** * Constructs an UnresolvedFontFamily with the specified familyName. * * @param familyName The name of the font family. */	TokenNameCOMMENT_JAVADOC	 Constructs an UnresolvedFontFamily with the specified familyName. * @param familyName The name of the font family. 
public	TokenNamepublic	
UnresolvedFontFamily	TokenNameIdentifier	 Unresolved Font Family
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
/** * Returns the font family name. * * @return the family name. */	TokenNameCOMMENT_JAVADOC	 Returns the font family name. * @return the family name. 
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
/** * Derives a GVTFont object of the correct size. As this font family is yet * to be resolved this will always return null. * * @param size The required size of the derived font. * @param aci The character iterator that will be rendered using the derived * font. */	TokenNameCOMMENT_JAVADOC	 Derives a GVTFont object of the correct size. As this font family is yet to be resolved this will always return null. * @param size The required size of the derived font. @param aci The character iterator that will be rendered using the derived font. 
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
return	TokenNamereturn	
null	TokenNamenull	
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
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

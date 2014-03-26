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
/** * An interface for all font family classes. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: GVTFontFamily.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for all font family classes. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: GVTFontFamily.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GVTFontFamily	TokenNameIdentifier	 GVT Font Family
{	TokenNameLBRACE	
/** * Returns the font family name. * * @return The family name. */	TokenNameCOMMENT_JAVADOC	 Returns the font family name. * @return The family name. 
String	TokenNameIdentifier	 String
getFamilyName	TokenNameIdentifier	 get Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the FontFace for this fontFamily instance. */	TokenNameCOMMENT_JAVADOC	 Returns the FontFace for this fontFamily instance. 
GVTFontFace	TokenNameIdentifier	 GVT Font Face
getFontFace	TokenNameIdentifier	 get Font Face
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Derives a GVTFont object of the correct size. * * @param size The required size of the derived font. * @param aci The character iterator that will be rendered using * the derived font. */	TokenNameCOMMENT_JAVADOC	 Derives a GVTFont object of the correct size. * @param size The required size of the derived font. @param aci The character iterator that will be rendered using the derived font. 
GVTFont	TokenNameIdentifier	 GVT Font
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Derives a GVTFont object of the correct size from an attribute Map. * @param size The required size of the derived font. * @param attrs The Attribute Map to get Values from. */	TokenNameCOMMENT_JAVADOC	 Derives a GVTFont object of the correct size from an attribute Map. @param size The required size of the derived font. @param attrs The Attribute Map to get Values from. 
GVTFont	TokenNameIdentifier	 GVT Font
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
float	TokenNamefloat	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

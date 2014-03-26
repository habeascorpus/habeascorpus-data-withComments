/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
/** * TranscodingHint as to what the destination of the drawing is. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ColorSpaceHintKey.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 TranscodingHint as to what the destination of the drawing is. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ColorSpaceHintKey.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ColorSpaceHintKey	TokenNameIdentifier	 Color Space Hint Key
extends	TokenNameextends	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
{	TokenNameLBRACE	
/** * Notice to source that we prefer an Alpha RGB Image. */	TokenNameCOMMENT_JAVADOC	 Notice to source that we prefer an Alpha RGB Image. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
VALUE_COLORSPACE_ARGB	TokenNameIdentifier	 VALUE  COLORSPACE  ARGB
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notice to source that we will not use Alpha Channel but * we still want RGB data. */	TokenNameCOMMENT_JAVADOC	 Notice to source that we will not use Alpha Channel but we still want RGB data. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
VALUE_COLORSPACE_RGB	TokenNameIdentifier	 VALUE  COLORSPACE  RGB
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notice to source that we only want Greyscale data (no Alpha). */	TokenNameCOMMENT_JAVADOC	 Notice to source that we only want Greyscale data (no Alpha). 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
VALUE_COLORSPACE_GREY	TokenNameIdentifier	 VALUE  COLORSPACE  GREY
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notice to source that we only want Greyscale data with * an alpha channel. */	TokenNameCOMMENT_JAVADOC	 Notice to source that we only want Greyscale data with an alpha channel. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
VALUE_COLORSPACE_AGREY	TokenNameIdentifier	 VALUE  COLORSPACE  AGREY
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notice to source that we only want an alpha channel. * The source should simply render alpha (no conversion) */	TokenNameCOMMENT_JAVADOC	 Notice to source that we only want an alpha channel. The source should simply render alpha (no conversion) 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
VALUE_COLORSPACE_ALPHA	TokenNameIdentifier	 VALUE  COLORSPACE  ALPHA
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notice to source that we only want an alpha channel. * The source should follow the SVG spec for how to * convert ARGB, RGB, Grey and AGrey to just an Alpha channel. */	TokenNameCOMMENT_JAVADOC	 Notice to source that we only want an alpha channel. The source should follow the SVG spec for how to convert ARGB, RGB, Grey and AGrey to just an Alpha channel. 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
VALUE_COLORSPACE_ALPHA_CONVERT	TokenNameIdentifier	 VALUE  COLORSPACE  ALPHA  CONVERT
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROPERTY_COLORSPACE	TokenNameIdentifier	 PROPERTY  COLORSPACE
=	TokenNameEQUAL	
"org.apache.batik.gvt.filter.Colorspace"	TokenNameStringLiteral	org.apache.batik.gvt.filter.Colorspace
;	TokenNameSEMICOLON	
/** * Note that this is package private. */	TokenNameCOMMENT_JAVADOC	 Note that this is package private. 
ColorSpaceHintKey	TokenNameIdentifier	 Color Space Hint Key
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleValue	TokenNameIdentifier	 is Compatible Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
VALUE_COLORSPACE_ARGB	TokenNameIdentifier	 VALUE  COLORSPACE  ARGB
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
VALUE_COLORSPACE_RGB	TokenNameIdentifier	 VALUE  COLORSPACE  RGB
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
VALUE_COLORSPACE_GREY	TokenNameIdentifier	 VALUE  COLORSPACE  GREY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
VALUE_COLORSPACE_AGREY	TokenNameIdentifier	 VALUE  COLORSPACE  AGREY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
VALUE_COLORSPACE_ALPHA	TokenNameIdentifier	 VALUE  COLORSPACE  ALPHA
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
VALUE_COLORSPACE_ALPHA_CONVERT	TokenNameIdentifier	 VALUE  COLORSPACE  ALPHA  CONVERT
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

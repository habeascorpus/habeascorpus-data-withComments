/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
SystemColor	TokenNameIdentifier	 System Color
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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
FloatValue	TokenNameIdentifier	 Float Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
RGBColorValue	TokenNameIdentifier	 RGB Color Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CSSConstants	TokenNameIdentifier	 CSS Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
/** * This class provides support for AWT system colors. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SystemColorSupport.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for AWT system colors. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SystemColorSupport.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SystemColorSupport	TokenNameIdentifier	 System Color Support
implements	TokenNameimplements	
CSSConstants	TokenNameIdentifier	 CSS Constants
{	TokenNameLBRACE	
/** * Returns the Value corresponding to the given system color. */	TokenNameCOMMENT_JAVADOC	 Returns the Value corresponding to the given system color. 
public	TokenNamepublic	
static	TokenNamestatic	
Value	TokenNameIdentifier	 Value
getSystemColor	TokenNameIdentifier	 get System Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// todo locale?? 	TokenNameCOMMENT_LINE	todo locale?? 
SystemColor	TokenNameIdentifier	 System Color
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SystemColor	TokenNameIdentifier	 System Color
)	TokenNameRPAREN	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
RGBColorValue	TokenNameIdentifier	 RGB Color Value
(	TokenNameLPAREN	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The color factories. */	TokenNameCOMMENT_JAVADOC	 The color factories. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
factories	TokenNameIdentifier	 factories
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_ACTIVEBORDER_VALUE	TokenNameIdentifier	 CSS  ACTIVEBORDER  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
windowBorder	TokenNameIdentifier	 window Border
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_ACTIVECAPTION_VALUE	TokenNameIdentifier	 CSS  ACTIVECAPTION  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
activeCaption	TokenNameIdentifier	 active Caption
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_APPWORKSPACE_VALUE	TokenNameIdentifier	 CSS  APPWORKSPACE  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
desktop	TokenNameIdentifier	 desktop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_BACKGROUND_VALUE	TokenNameIdentifier	 CSS  BACKGROUND  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
desktop	TokenNameIdentifier	 desktop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_BUTTONFACE_VALUE	TokenNameIdentifier	 CSS  BUTTONFACE  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
control	TokenNameIdentifier	 control
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_BUTTONHIGHLIGHT_VALUE	TokenNameIdentifier	 CSS  BUTTONHIGHLIGHT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlLtHighlight	TokenNameIdentifier	 control Lt Highlight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_BUTTONSHADOW_VALUE	TokenNameIdentifier	 CSS  BUTTONSHADOW  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlDkShadow	TokenNameIdentifier	 control Dk Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_BUTTONTEXT_VALUE	TokenNameIdentifier	 CSS  BUTTONTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlText	TokenNameIdentifier	 control Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_CAPTIONTEXT_VALUE	TokenNameIdentifier	 CSS  CAPTIONTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
activeCaptionText	TokenNameIdentifier	 active Caption Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_GRAYTEXT_VALUE	TokenNameIdentifier	 CSS  GRAYTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
textInactiveText	TokenNameIdentifier	 text Inactive Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_HIGHLIGHT_VALUE	TokenNameIdentifier	 CSS  HIGHLIGHT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
textHighlight	TokenNameIdentifier	 text Highlight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_HIGHLIGHTTEXT_VALUE	TokenNameIdentifier	 CSS  HIGHLIGHTTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
textHighlightText	TokenNameIdentifier	 text Highlight Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_INACTIVEBORDER_VALUE	TokenNameIdentifier	 CSS  INACTIVEBORDER  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
windowBorder	TokenNameIdentifier	 window Border
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_INACTIVECAPTION_VALUE	TokenNameIdentifier	 CSS  INACTIVECAPTION  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
inactiveCaption	TokenNameIdentifier	 inactive Caption
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_INACTIVECAPTIONTEXT_VALUE	TokenNameIdentifier	 CSS  INACTIVECAPTIONTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
inactiveCaptionText	TokenNameIdentifier	 inactive Caption Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_INFOBACKGROUND_VALUE	TokenNameIdentifier	 CSS  INFOBACKGROUND  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_INFOTEXT_VALUE	TokenNameIdentifier	 CSS  INFOTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
infoText	TokenNameIdentifier	 info Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_MENU_VALUE	TokenNameIdentifier	 CSS  MENU  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
menu	TokenNameIdentifier	 menu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_MENUTEXT_VALUE	TokenNameIdentifier	 CSS  MENUTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
menuText	TokenNameIdentifier	 menu Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_SCROLLBAR_VALUE	TokenNameIdentifier	 CSS  SCROLLBAR  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
scrollbar	TokenNameIdentifier	 scrollbar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_THREEDDARKSHADOW_VALUE	TokenNameIdentifier	 CSS  THREEDDARKSHADOW  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlDkShadow	TokenNameIdentifier	 control Dk Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_THREEDFACE_VALUE	TokenNameIdentifier	 CSS  THREEDFACE  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
control	TokenNameIdentifier	 control
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_THREEDHIGHLIGHT_VALUE	TokenNameIdentifier	 CSS  THREEDHIGHLIGHT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlHighlight	TokenNameIdentifier	 control Highlight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_THREEDLIGHTSHADOW_VALUE	TokenNameIdentifier	 CSS  THREEDLIGHTSHADOW  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlLtHighlight	TokenNameIdentifier	 control Lt Highlight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_THREEDSHADOW_VALUE	TokenNameIdentifier	 CSS  THREEDSHADOW  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
controlShadow	TokenNameIdentifier	 control Shadow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_WINDOW_VALUE	TokenNameIdentifier	 CSS  WINDOW  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
window	TokenNameIdentifier	 window
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_WINDOWFRAME_VALUE	TokenNameIdentifier	 CSS  WINDOWFRAME  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
windowBorder	TokenNameIdentifier	 window Border
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSS_WINDOWTEXT_VALUE	TokenNameIdentifier	 CSS  WINDOWTEXT  VALUE
,	TokenNameCOMMA	
SystemColor	TokenNameIdentifier	 System Color
.	TokenNameDOT	
windowText	TokenNameIdentifier	 window Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
SystemColorSupport	TokenNameIdentifier	 System Color Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

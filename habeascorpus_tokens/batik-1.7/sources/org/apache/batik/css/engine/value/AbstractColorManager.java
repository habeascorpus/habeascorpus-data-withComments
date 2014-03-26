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
.	TokenNameDOT	
value	TokenNameIdentifier	 value
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
CSSEngine	TokenNameIdentifier	 CSS Engine
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
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
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
StyleMap	TokenNameIdentifier	 Style Map
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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
/** * This class provides a manager for the property with support for * CSS color values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractColorManager.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the property with support for CSS color values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractColorManager.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractColorManager	TokenNameIdentifier	 Abstract Color Manager
extends	TokenNameextends	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
{	TokenNameLBRACE	
/** * The identifier values. */	TokenNameCOMMENT_JAVADOC	 The identifier values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
StringMap	TokenNameIdentifier	 String Map
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
StringMap	TokenNameIdentifier	 String Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AQUA_VALUE	TokenNameIdentifier	 CSS  AQUA  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
AQUA_VALUE	TokenNameIdentifier	 AQUA  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLACK_VALUE	TokenNameIdentifier	 CSS  BLACK  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BLACK_VALUE	TokenNameIdentifier	 BLACK  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLUE_VALUE	TokenNameIdentifier	 CSS  BLUE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BLUE_VALUE	TokenNameIdentifier	 BLUE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FUCHSIA_VALUE	TokenNameIdentifier	 CSS  FUCHSIA  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
FUCHSIA_VALUE	TokenNameIdentifier	 FUCHSIA  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GRAY_VALUE	TokenNameIdentifier	 CSS  GRAY  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
GRAY_VALUE	TokenNameIdentifier	 GRAY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREEN_VALUE	TokenNameIdentifier	 CSS  GREEN  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
GREEN_VALUE	TokenNameIdentifier	 GREEN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIME_VALUE	TokenNameIdentifier	 CSS  LIME  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
LIME_VALUE	TokenNameIdentifier	 LIME  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MAROON_VALUE	TokenNameIdentifier	 CSS  MAROON  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
MAROON_VALUE	TokenNameIdentifier	 MAROON  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NAVY_VALUE	TokenNameIdentifier	 CSS  NAVY  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
NAVY_VALUE	TokenNameIdentifier	 NAVY  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLIVE_VALUE	TokenNameIdentifier	 CSS  OLIVE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
OLIVE_VALUE	TokenNameIdentifier	 OLIVE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PURPLE_VALUE	TokenNameIdentifier	 CSS  PURPLE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
PURPLE_VALUE	TokenNameIdentifier	 PURPLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_RED_VALUE	TokenNameIdentifier	 CSS  RED  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
RED_VALUE	TokenNameIdentifier	 RED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SILVER_VALUE	TokenNameIdentifier	 CSS  SILVER  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
SILVER_VALUE	TokenNameIdentifier	 SILVER  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TEAL_VALUE	TokenNameIdentifier	 CSS  TEAL  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
TEAL_VALUE	TokenNameIdentifier	 TEAL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHITE_VALUE	TokenNameIdentifier	 CSS  WHITE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
WHITE_VALUE	TokenNameIdentifier	 WHITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_YELLOW_VALUE	TokenNameIdentifier	 CSS  YELLOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
YELLOW_VALUE	TokenNameIdentifier	 YELLOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ACTIVEBORDER_VALUE	TokenNameIdentifier	 CSS  ACTIVEBORDER  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
ACTIVEBORDER_VALUE	TokenNameIdentifier	 ACTIVEBORDER  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ACTIVECAPTION_VALUE	TokenNameIdentifier	 CSS  ACTIVECAPTION  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
ACTIVECAPTION_VALUE	TokenNameIdentifier	 ACTIVECAPTION  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_APPWORKSPACE_VALUE	TokenNameIdentifier	 CSS  APPWORKSPACE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
APPWORKSPACE_VALUE	TokenNameIdentifier	 APPWORKSPACE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BACKGROUND_VALUE	TokenNameIdentifier	 CSS  BACKGROUND  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BACKGROUND_VALUE	TokenNameIdentifier	 BACKGROUND  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BUTTONFACE_VALUE	TokenNameIdentifier	 CSS  BUTTONFACE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BUTTONFACE_VALUE	TokenNameIdentifier	 BUTTONFACE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BUTTONHIGHLIGHT_VALUE	TokenNameIdentifier	 CSS  BUTTONHIGHLIGHT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BUTTONHIGHLIGHT_VALUE	TokenNameIdentifier	 BUTTONHIGHLIGHT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BUTTONSHADOW_VALUE	TokenNameIdentifier	 CSS  BUTTONSHADOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BUTTONSHADOW_VALUE	TokenNameIdentifier	 BUTTONSHADOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BUTTONTEXT_VALUE	TokenNameIdentifier	 CSS  BUTTONTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BUTTONTEXT_VALUE	TokenNameIdentifier	 BUTTONTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CAPTIONTEXT_VALUE	TokenNameIdentifier	 CSS  CAPTIONTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
CAPTIONTEXT_VALUE	TokenNameIdentifier	 CAPTIONTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GRAYTEXT_VALUE	TokenNameIdentifier	 CSS  GRAYTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
GRAYTEXT_VALUE	TokenNameIdentifier	 GRAYTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_HIGHLIGHT_VALUE	TokenNameIdentifier	 CSS  HIGHLIGHT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
HIGHLIGHT_VALUE	TokenNameIdentifier	 HIGHLIGHT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_HIGHLIGHTTEXT_VALUE	TokenNameIdentifier	 CSS  HIGHLIGHTTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
HIGHLIGHTTEXT_VALUE	TokenNameIdentifier	 HIGHLIGHTTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INACTIVEBORDER_VALUE	TokenNameIdentifier	 CSS  INACTIVEBORDER  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
INACTIVEBORDER_VALUE	TokenNameIdentifier	 INACTIVEBORDER  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INACTIVECAPTION_VALUE	TokenNameIdentifier	 CSS  INACTIVECAPTION  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
INACTIVECAPTION_VALUE	TokenNameIdentifier	 INACTIVECAPTION  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INACTIVECAPTIONTEXT_VALUE	TokenNameIdentifier	 CSS  INACTIVECAPTIONTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
INACTIVECAPTIONTEXT_VALUE	TokenNameIdentifier	 INACTIVECAPTIONTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INFOBACKGROUND_VALUE	TokenNameIdentifier	 CSS  INFOBACKGROUND  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
INFOBACKGROUND_VALUE	TokenNameIdentifier	 INFOBACKGROUND  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_INFOTEXT_VALUE	TokenNameIdentifier	 CSS  INFOTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
INFOTEXT_VALUE	TokenNameIdentifier	 INFOTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MENU_VALUE	TokenNameIdentifier	 CSS  MENU  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
MENU_VALUE	TokenNameIdentifier	 MENU  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MENUTEXT_VALUE	TokenNameIdentifier	 CSS  MENUTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
MENUTEXT_VALUE	TokenNameIdentifier	 MENUTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SCROLLBAR_VALUE	TokenNameIdentifier	 CSS  SCROLLBAR  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
SCROLLBAR_VALUE	TokenNameIdentifier	 SCROLLBAR  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THREEDDARKSHADOW_VALUE	TokenNameIdentifier	 CSS  THREEDDARKSHADOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
THREEDDARKSHADOW_VALUE	TokenNameIdentifier	 THREEDDARKSHADOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THREEDFACE_VALUE	TokenNameIdentifier	 CSS  THREEDFACE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
THREEDFACE_VALUE	TokenNameIdentifier	 THREEDFACE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THREEDHIGHLIGHT_VALUE	TokenNameIdentifier	 CSS  THREEDHIGHLIGHT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
THREEDHIGHLIGHT_VALUE	TokenNameIdentifier	 THREEDHIGHLIGHT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THREEDLIGHTSHADOW_VALUE	TokenNameIdentifier	 CSS  THREEDLIGHTSHADOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
THREEDLIGHTSHADOW_VALUE	TokenNameIdentifier	 THREEDLIGHTSHADOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_THREEDSHADOW_VALUE	TokenNameIdentifier	 CSS  THREEDSHADOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
THREEDSHADOW_VALUE	TokenNameIdentifier	 THREEDSHADOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WINDOW_VALUE	TokenNameIdentifier	 CSS  WINDOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
WINDOW_VALUE	TokenNameIdentifier	 WINDOW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WINDOWFRAME_VALUE	TokenNameIdentifier	 CSS  WINDOWFRAME  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
WINDOWFRAME_VALUE	TokenNameIdentifier	 WINDOWFRAME  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WINDOWTEXT_VALUE	TokenNameIdentifier	 CSS  WINDOWTEXT  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
WINDOWTEXT_VALUE	TokenNameIdentifier	 WINDOWTEXT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The computed identifier values. */	TokenNameCOMMENT_JAVADOC	 The computed identifier values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
StringMap	TokenNameIdentifier	 String Map
computedValues	TokenNameIdentifier	 computed Values
=	TokenNameEQUAL	
new	TokenNamenew	
StringMap	TokenNameIdentifier	 String Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLACK_VALUE	TokenNameIdentifier	 CSS  BLACK  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BLACK_RGB_VALUE	TokenNameIdentifier	 BLACK  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SILVER_VALUE	TokenNameIdentifier	 CSS  SILVER  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
SILVER_RGB_VALUE	TokenNameIdentifier	 SILVER  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GRAY_VALUE	TokenNameIdentifier	 CSS  GRAY  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
GRAY_RGB_VALUE	TokenNameIdentifier	 GRAY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_WHITE_VALUE	TokenNameIdentifier	 CSS  WHITE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
WHITE_RGB_VALUE	TokenNameIdentifier	 WHITE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MAROON_VALUE	TokenNameIdentifier	 CSS  MAROON  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
MAROON_RGB_VALUE	TokenNameIdentifier	 MAROON  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_RED_VALUE	TokenNameIdentifier	 CSS  RED  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
RED_RGB_VALUE	TokenNameIdentifier	 RED  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PURPLE_VALUE	TokenNameIdentifier	 CSS  PURPLE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
PURPLE_RGB_VALUE	TokenNameIdentifier	 PURPLE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FUCHSIA_VALUE	TokenNameIdentifier	 CSS  FUCHSIA  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
FUCHSIA_RGB_VALUE	TokenNameIdentifier	 FUCHSIA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_GREEN_VALUE	TokenNameIdentifier	 CSS  GREEN  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
GREEN_RGB_VALUE	TokenNameIdentifier	 GREEN  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_LIME_VALUE	TokenNameIdentifier	 CSS  LIME  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
LIME_RGB_VALUE	TokenNameIdentifier	 LIME  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_OLIVE_VALUE	TokenNameIdentifier	 CSS  OLIVE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
OLIVE_RGB_VALUE	TokenNameIdentifier	 OLIVE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_YELLOW_VALUE	TokenNameIdentifier	 CSS  YELLOW  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
YELLOW_RGB_VALUE	TokenNameIdentifier	 YELLOW  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NAVY_VALUE	TokenNameIdentifier	 CSS  NAVY  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
NAVY_RGB_VALUE	TokenNameIdentifier	 NAVY  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_BLUE_VALUE	TokenNameIdentifier	 CSS  BLUE  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
BLUE_RGB_VALUE	TokenNameIdentifier	 BLUE  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_TEAL_VALUE	TokenNameIdentifier	 CSS  TEAL  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
TEAL_RGB_VALUE	TokenNameIdentifier	 TEAL  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_AQUA_VALUE	TokenNameIdentifier	 CSS  AQUA  VALUE
,	TokenNameCOMMA	
ValueConstants	TokenNameIdentifier	 Value Constants
.	TokenNameDOT	
AQUA_RGB_VALUE	TokenNameIdentifier	 AQUA  RGB  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#createValue(LexicalUnit,CSSEngine)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#createValue(LexicalUnit,CSSEngine)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_RGBCOLOR	TokenNameIdentifier	 SAC  RGBCOLOR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
createColorComponent	TokenNameIdentifier	 create Color Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
createColorComponent	TokenNameIdentifier	 create Color Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lu	TokenNameIdentifier	 lu
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
createColorComponent	TokenNameIdentifier	 create Color Component
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
createRGBColor	TokenNameIdentifier	 create RGB Color
(	TokenNameLPAREN	
red	TokenNameIdentifier	 red
,	TokenNameCOMMA	
green	TokenNameIdentifier	 green
,	TokenNameCOMMA	
blue	TokenNameIdentifier	 blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
engine	TokenNameIdentifier	 engine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * ValueManager#computeValue(CSSStylableElement,String,CSSEngine,int,StyleMap,Value)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#computeValue(CSSStylableElement,String,CSSEngine,int,StyleMap,Value)}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
StyleMap	TokenNameIdentifier	 Style Map
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Search for a direct computed value. 	TokenNameCOMMENT_LINE	Search for a direct computed value. 
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
)	TokenNameRPAREN	
computedValues	TokenNameIdentifier	 computed Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Must be a system color... 	TokenNameCOMMENT_LINE	Must be a system color... 
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Not a system-color:"	TokenNameStringLiteral	Not a system-color:
+	TokenNamePLUS	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
getCSSContext	TokenNameIdentifier	 get CSS Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSystemColor	TokenNameIdentifier	 get System Color
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
computeValue	TokenNameIdentifier	 compute Value
(	TokenNameLPAREN	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudo	TokenNameIdentifier	 pseudo
,	TokenNameCOMMA	
engine	TokenNameIdentifier	 engine
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an RGB color. */	TokenNameCOMMENT_JAVADOC	 Creates an RGB color. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
createRGBColor	TokenNameIdentifier	 create RGB Color
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RGBColorValue	TokenNameIdentifier	 RGB Color Value
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a color component from a lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a color component from a lexical unit. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
createColorComponent	TokenNameIdentifier	 create Color Component
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INTEGER	TokenNameIdentifier	 SAC  INTEGER
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getIntegerValue	TokenNameIdentifier	 get Integer Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_REAL	TokenNameIdentifier	 SAC  REAL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_NUMBER	TokenNameIdentifier	 CSS  NUMBER
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PERCENTAGE	TokenNameIdentifier	 SAC  PERCENTAGE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
FloatValue	TokenNameIdentifier	 Float Value
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_PERCENTAGE	TokenNameIdentifier	 CSS  PERCENTAGE
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
createInvalidRGBComponentUnitDOMException	TokenNameIdentifier	 create Invalid RGB Component Unit DOM Exception
(	TokenNameLPAREN	
lu	TokenNameIdentifier	 lu
.	TokenNameDOT	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link IdentifierManager#getIdentifiers()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link IdentifierManager#getIdentifiers()}. 
public	TokenNamepublic	
StringMap	TokenNameIdentifier	 String Map
getIdentifiers	TokenNameIdentifier	 get Identifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DOMException	TokenNameIdentifier	 DOM Exception
createInvalidRGBComponentUnitDOMException	TokenNameIdentifier	 create Invalid RGB Component Unit DOM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"invalid.rgb.component.unit"	TokenNameStringLiteral	invalid.rgb.component.unit
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

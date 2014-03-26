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
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
AbstractValueFactory	TokenNameIdentifier	 Abstract Value Factory
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
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
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
ValueManager	TokenNameIdentifier	 Value Manager
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
/** * This class represents an object which provide support for the * 'marker' shorthand properties. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: MarkerShorthandManager.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an object which provide support for the 'marker' shorthand properties. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: MarkerShorthandManager.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
MarkerShorthandManager	TokenNameIdentifier	 Marker Shorthand Manager
extends	TokenNameextends	
AbstractValueFactory	TokenNameIdentifier	 Abstract Value Factory
implements	TokenNameimplements	
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
{	TokenNameLBRACE	
/** * Implements {@link ValueManager#getPropertyName()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#getPropertyName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MARKER_PROPERTY	TokenNameIdentifier	 CSS  MARKER  PROPERTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ShorthandManager#isAnimatableProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ShorthandManager#isAnimatableProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnimatableProperty	TokenNameIdentifier	 is Animatable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ShorthandManager#isAdditiveProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ShorthandManager#isAdditiveProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAdditiveProperty	TokenNameIdentifier	 is Additive Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ShorthandManager#setValues(CSSEngine,ShorthandManager.PropertyHandler,LexicalUnit,boolean)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ShorthandManager#setValues(CSSEngine,ShorthandManager.PropertyHandler,LexicalUnit,boolean)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
,	TokenNameCOMMA	
ShorthandManager	TokenNameIdentifier	 Shorthand Manager
.	TokenNameDOT	
PropertyHandler	TokenNameIdentifier	 Property Handler
ph	TokenNameIdentifier	 ph
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
boolean	TokenNameboolean	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MARKER_END_PROPERTY	TokenNameIdentifier	 CSS  MARKER  END  PROPERTY
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MARKER_MID_PROPERTY	TokenNameIdentifier	 CSS  MARKER  MID  PROPERTY
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_MARKER_START_PROPERTY	TokenNameIdentifier	 CSS  MARKER  START  PROPERTY
,	TokenNameCOMMA	
lu	TokenNameIdentifier	 lu
,	TokenNameCOMMA	
imp	TokenNameIdentifier	 imp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

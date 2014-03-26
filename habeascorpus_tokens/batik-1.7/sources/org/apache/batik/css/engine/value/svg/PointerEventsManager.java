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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
IdentifierManager	TokenNameIdentifier	 Identifier Manager
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
StringMap	TokenNameIdentifier	 String Map
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGTypes	TokenNameIdentifier	 SVG Types
;	TokenNameSEMICOLON	
/** * This class provides a manager for the 'pointer-events' property values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: PointerEventsManager.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the 'pointer-events' property values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: PointerEventsManager.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PointerEventsManager	TokenNameIdentifier	 Pointer Events Manager
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
CSS_ALL_VALUE	TokenNameIdentifier	 CSS  ALL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ALL_VALUE	TokenNameIdentifier	 ALL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FILL_VALUE	TokenNameIdentifier	 CSS  FILL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FILL_VALUE	TokenNameIdentifier	 FILL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_FILLSTROKE_VALUE	TokenNameIdentifier	 CSS  FILLSTROKE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
FILLSTROKE_VALUE	TokenNameIdentifier	 FILLSTROKE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NONE_VALUE	TokenNameIdentifier	 CSS  NONE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
NONE_VALUE	TokenNameIdentifier	 NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_PAINTED_VALUE	TokenNameIdentifier	 CSS  PAINTED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
PAINTED_VALUE	TokenNameIdentifier	 PAINTED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_STROKE_VALUE	TokenNameIdentifier	 CSS  STROKE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
STROKE_VALUE	TokenNameIdentifier	 STROKE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VISIBLE_VALUE	TokenNameIdentifier	 CSS  VISIBLE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VISIBLE_VALUE	TokenNameIdentifier	 VISIBLE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VISIBLEFILL_VALUE	TokenNameIdentifier	 CSS  VISIBLEFILL  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VISIBLEFILL_VALUE	TokenNameIdentifier	 VISIBLEFILL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VISIBLEFILLSTROKE_VALUE	TokenNameIdentifier	 CSS  VISIBLEFILLSTROKE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VISIBLEFILLSTROKE_VALUE	TokenNameIdentifier	 VISIBLEFILLSTROKE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VISIBLEPAINTED_VALUE	TokenNameIdentifier	 CSS  VISIBLEPAINTED  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VISIBLEPAINTED_VALUE	TokenNameIdentifier	 VISIBLEPAINTED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_VISIBLESTROKE_VALUE	TokenNameIdentifier	 CSS  VISIBLESTROKE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VISIBLESTROKE_VALUE	TokenNameIdentifier	 VISIBLESTROKE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#isInheritedProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#isInheritedProperty()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInheritedProperty	TokenNameIdentifier	 is Inherited Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link ValueManager#isAnimatableProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#isAnimatableProperty()}. 
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
/** * Implements {@link ValueManager#isAdditiveProperty()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#isAdditiveProperty()}. 
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
/** * Implements {@link ValueManager#getPropertyType()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link ValueManager#getPropertyType()}. 
public	TokenNamepublic	
int	TokenNameint	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_IDENT	TokenNameIdentifier	 TYPE  IDENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#getPropertyName()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#getPropertyName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_POINTER_EVENTS_PROPERTY	TokenNameIdentifier	 CSS  POINTER  EVENTS  PROPERTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.css.engine.value.ValueManager#getDefaultValue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.css.engine.value.ValueManager#getDefaultValue()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
VISIBLEPAINTED_VALUE	TokenNameIdentifier	 VISIBLEPAINTED  VALUE
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
}	TokenNameRBRACE	

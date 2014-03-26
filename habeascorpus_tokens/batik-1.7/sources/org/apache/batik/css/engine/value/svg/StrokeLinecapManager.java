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
/** * This class provides a manager for the 'stroke-linecap' property values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StrokeLinecapManager.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides a manager for the 'stroke-linecap' property values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StrokeLinecapManager.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
StrokeLinecapManager	TokenNameIdentifier	 Stroke Linecap Manager
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
CSS_BUTT_VALUE	TokenNameIdentifier	 CSS  BUTT  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
BUTT_VALUE	TokenNameIdentifier	 BUTT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_ROUND_VALUE	TokenNameIdentifier	 CSS  ROUND  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
ROUND_VALUE	TokenNameIdentifier	 ROUND  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_SQUARE_VALUE	TokenNameIdentifier	 CSS  SQUARE  VALUE
,	TokenNameCOMMA	
SVGValueConstants	TokenNameIdentifier	 SVG Value Constants
.	TokenNameDOT	
SQUARE_VALUE	TokenNameIdentifier	 SQUARE  VALUE
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
CSS_STROKE_LINECAP_PROPERTY	TokenNameIdentifier	 CSS  STROKE  LINECAP  PROPERTY
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
BUTT_VALUE	TokenNameIdentifier	 BUTT  VALUE
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

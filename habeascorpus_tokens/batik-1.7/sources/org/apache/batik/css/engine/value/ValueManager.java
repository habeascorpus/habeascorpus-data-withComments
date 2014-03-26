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
/** * This interface is implemented by objects which manage the values associated * with a property. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ValueManager.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface is implemented by objects which manage the values associated with a property. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ValueManager.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ValueManager	TokenNameIdentifier	 Value Manager
{	TokenNameLBRACE	
/** * Returns the name of the property handled. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the property handled. 
String	TokenNameIdentifier	 String
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the handled property is inherited or not. */	TokenNameCOMMENT_JAVADOC	 Whether the handled property is inherited or not. 
boolean	TokenNameboolean	
isInheritedProperty	TokenNameIdentifier	 is Inherited Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the handled property can be animated. */	TokenNameCOMMENT_JAVADOC	 Whether the handled property can be animated. 
boolean	TokenNameboolean	
isAnimatableProperty	TokenNameIdentifier	 is Animatable Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Whether the handled property can be additively animated. */	TokenNameCOMMENT_JAVADOC	 Whether the handled property can be additively animated. 
boolean	TokenNameboolean	
isAdditiveProperty	TokenNameIdentifier	 is Additive Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the type of value this manager handles. This should be * one of the TYPE_* constants defined in * {@link org.apache.batik.util.SVGTypes}. */	TokenNameCOMMENT_JAVADOC	 Returns the type of value this manager handles. This should be one of the TYPE_* constants defined in {@link org.apache.batik.util.SVGTypes}. 
int	TokenNameint	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the default value for the handled property. */	TokenNameCOMMENT_JAVADOC	 Returns the default value for the handled property. 
Value	TokenNameIdentifier	 Value
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a value from a lexical unit. * @param lu The SAC lexical unit used to create the value. * @param engine The calling CSSEngine. */	TokenNameCOMMENT_JAVADOC	 Creates a value from a lexical unit. @param lu The SAC lexical unit used to create the value. @param engine The calling CSSEngine. 
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
;	TokenNameSEMICOLON	
/** * Creates and returns a new float value. * @param unitType A unit code as defined above. The unit code can only * be a float unit type * @param floatValue The new float value. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new float value. @param unitType A unit code as defined above. The unit code can only be a float unit type @param floatValue The new float value. 
Value	TokenNameIdentifier	 Value
createFloatValue	TokenNameIdentifier	 create Float Value
(	TokenNameLPAREN	
short	TokenNameshort	
unitType	TokenNameIdentifier	 unit Type
,	TokenNameCOMMA	
float	TokenNamefloat	
floatValue	TokenNameIdentifier	 float Value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Creates and returns a new string value. * @param type A string code as defined in CSSPrimitiveValue. The string * code can only be a string unit type. * @param value The new string value. * @param engine The CSS engine. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new string value. @param type A string code as defined in CSSPrimitiveValue. The string code can only be a string unit type. @param value The new string value. @param engine The CSS engine. 
Value	TokenNameIdentifier	 Value
createStringValue	TokenNameIdentifier	 create String Value
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
CSSEngine	TokenNameIdentifier	 CSS Engine
engine	TokenNameIdentifier	 engine
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Computes the given value. * @param elt The owner of the value. * @param pseudo The pseudo element. * @param engine The CSSEngine. * @param idx The property index in the engine. * @param sm The computed style map. * @param value The value to compute. */	TokenNameCOMMENT_JAVADOC	 Computes the given value. @param elt The owner of the value. @param pseudo The pseudo element. @param engine The CSSEngine. @param idx The property index in the engine. @param sm The computed style map. @param value The value to compute. 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

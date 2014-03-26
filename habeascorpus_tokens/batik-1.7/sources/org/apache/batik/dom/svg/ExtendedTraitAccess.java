/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
/** * Interface for SVG DOM classes to expose information about the traits * (XML attributes and CSS properties) their elements support. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: ExtendedTraitAccess.java 479349 2006-11-26 11:54:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface for SVG DOM classes to expose information about the traits (XML attributes and CSS properties) their elements support. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: ExtendedTraitAccess.java 479349 2006-11-26 11:54:23Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ExtendedTraitAccess	TokenNameIdentifier	 Extended Trait Access
extends	TokenNameextends	
TraitAccess	TokenNameIdentifier	 Trait Access
{	TokenNameLBRACE	
/** * Returns whether the given CSS property is available on this element. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given CSS property is available on this element. 
boolean	TokenNameboolean	
hasProperty	TokenNameIdentifier	 has Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given trait is available on this element. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given trait is available on this element. 
boolean	TokenNameboolean	
hasTrait	TokenNameIdentifier	 has Trait
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given CSS property is animatable. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given CSS property is animatable. 
boolean	TokenNameboolean	
isPropertyAnimatable	TokenNameIdentifier	 is Property Animatable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given XML attribute is animatable. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given XML attribute is animatable. 
boolean	TokenNameboolean	
isAttributeAnimatable	TokenNameIdentifier	 is Attribute Animatable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given CSS property is additive. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given CSS property is additive. 
boolean	TokenNameboolean	
isPropertyAdditive	TokenNameIdentifier	 is Property Additive
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given XML attribute is additive. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given XML attribute is additive. 
boolean	TokenNameboolean	
isAttributeAdditive	TokenNameIdentifier	 is Attribute Additive
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given trait is animatable. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given trait is animatable. 
boolean	TokenNameboolean	
isTraitAnimatable	TokenNameIdentifier	 is Trait Animatable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tn	TokenNameIdentifier	 tn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether the given trait is additive. */	TokenNameCOMMENT_JAVADOC	 Returns whether the given trait is additive. 
boolean	TokenNameboolean	
isTraitAdditive	TokenNameIdentifier	 is Trait Additive
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tn	TokenNameIdentifier	 tn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the SVG type of the given CSS property. Must return one of * the TYPE_* constants defined in {@link org.apache.batik.util.SVGTypes}. */	TokenNameCOMMENT_JAVADOC	 Returns the SVG type of the given CSS property. Must return one of the TYPE_* constants defined in {@link org.apache.batik.util.SVGTypes}. 
int	TokenNameint	
getPropertyType	TokenNameIdentifier	 get Property Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the SVG type of the given XML attribute. Must return one of * the TYPE_* constants defined in {@link org.apache.batik.util.SVGTypes}. */	TokenNameCOMMENT_JAVADOC	 Returns the SVG type of the given XML attribute. Must return one of the TYPE_* constants defined in {@link org.apache.batik.util.SVGTypes}. 
int	TokenNameint	
getAttributeType	TokenNameIdentifier	 get Attribute Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ln	TokenNameIdentifier	 ln
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

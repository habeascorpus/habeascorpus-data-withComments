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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGSetElement	TokenNameIdentifier	 SVG Set Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGSetElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMSetElement.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGSetElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMSetElement.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMSetElement	TokenNameIdentifier	 SVGOM Set Element
extends	TokenNameextends	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
implements	TokenNameimplements	
SVGSetElement	TokenNameIdentifier	 SVG Set Element
{	TokenNameLBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Table mapping XML attribute names to TraitInformation objects. 	TokenNameCOMMENT_LINE	* Table mapping XML attribute names to TraitInformation objects. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected static DoublyIndexedTable xmlTraitInformation; 	TokenNameCOMMENT_LINE	protected static DoublyIndexedTable xmlTraitInformation; 
// static { 	TokenNameCOMMENT_LINE	static { 
// DoublyIndexedTable t = 	TokenNameCOMMENT_LINE	DoublyIndexedTable t = 
// new DoublyIndexedTable(SVGOMAnimationElement.xmlTraitInformation); 	TokenNameCOMMENT_LINE	new DoublyIndexedTable(SVGOMAnimationElement.xmlTraitInformation); 
// t.put(null, SVG_ATTRIBUTE_TYPE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ATTRIBUTE_TYPE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_FILL_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FILL_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_RESTART_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_RESTART_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_ATTRIBUTE_NAME_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ATTRIBUTE_NAME_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_MAX_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_MAX_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_MIN_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_MIN_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_TO_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_TO_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_BEGIN_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_BEGIN_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 
// t.put(null, SVG_END_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_END_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 
// t.put(null, SVG_DUR_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_DUR_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIME)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIME)); 
// t.put(null, SVG_REPEAT_DUR_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_REPEAT_DUR_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIME)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIME)); 
// t.put(null, SVG_REPEAT_COUNT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_REPEAT_COUNT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_INTEGER)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_INTEGER)); 
// xmlTraitInformation = t; 	TokenNameCOMMENT_LINE	xmlTraitInformation = t; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Creates a new SVGOMSetElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMSetElement object. 
protected	TokenNameprotected	
SVGOMSetElement	TokenNameIdentifier	 SVGOM Set Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMSetElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMSetElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMSetElement	TokenNameIdentifier	 SVGOM Set Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link Node#getLocalName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link Node#getLocalName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_SET_TAG	TokenNameIdentifier	 SVG  SET  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMSetElement	TokenNameIdentifier	 SVGOM Set Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns the table of TraitInformation objects for this element. 	TokenNameCOMMENT_LINE	* Returns the table of TraitInformation objects for this element. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected DoublyIndexedTable getTraitInformationTable() { 	TokenNameCOMMENT_LINE	protected DoublyIndexedTable getTraitInformationTable() { 
// return xmlTraitInformation; 	TokenNameCOMMENT_LINE	return xmlTraitInformation; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	

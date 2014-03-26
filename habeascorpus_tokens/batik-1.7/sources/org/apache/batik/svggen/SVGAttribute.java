/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Represents an SVG attribute and provides convenience * methods to determine whether or not the attribute applies * to a given element type. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGAttribute.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Represents an SVG attribute and provides convenience methods to determine whether or not the attribute applies to a given element type. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGAttribute.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGAttribute	TokenNameIdentifier	 SVG Attribute
{	TokenNameLBRACE	
/** * SVG syntax for the attribute */	TokenNameCOMMENT_JAVADOC	 SVG syntax for the attribute 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Set of Element tags to which the attribute does or * does not apply. */	TokenNameCOMMENT_JAVADOC	 Set of Element tags to which the attribute does or does not apply. 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
applicabilitySet	TokenNameIdentifier	 applicability Set
;	TokenNameSEMICOLON	
/** * Controls the semantic of applicabilitySet. If * true, then the applicabilitySet contains the elments * to which the attribute applies. If false, the * Set contains the elements to which the attribute * does not apply. */	TokenNameCOMMENT_JAVADOC	 Controls the semantic of applicabilitySet. If true, then the applicabilitySet contains the elments to which the attribute applies. If false, the Set contains the elements to which the attribute does not apply. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isSetInclusive	TokenNameIdentifier	 is Set Inclusive
;	TokenNameSEMICOLON	
/** * @param applicabilitySet Set of Element tags (Strings) to which * the attribute applies * @param isSetInclusive defines whether elements in applicabilitySet * define the list of elements to which the attribute * applies or to which it does not apply */	TokenNameCOMMENT_JAVADOC	 @param applicabilitySet Set of Element tags (Strings) to which the attribute applies @param isSetInclusive defines whether elements in applicabilitySet define the list of elements to which the attribute applies or to which it does not apply 
public	TokenNamepublic	
SVGAttribute	TokenNameIdentifier	 SVG Attribute
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
applicabilitySet	TokenNameIdentifier	 applicability Set
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSetInclusive	TokenNameIdentifier	 is Set Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
applicabilitySet	TokenNameIdentifier	 applicability Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
applicabilitySet	TokenNameIdentifier	 applicability Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
applicabilitySet	TokenNameIdentifier	 applicability Set
=	TokenNameEQUAL	
applicabilitySet	TokenNameIdentifier	 applicability Set
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isSetInclusive	TokenNameIdentifier	 is Set Inclusive
=	TokenNameEQUAL	
isSetInclusive	TokenNameIdentifier	 is Set Inclusive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param tag the tag of the Element to which the attribute * could apply. * @return true if the attribute applies to the given Element */	TokenNameCOMMENT_JAVADOC	 @param tag the tag of the Element to which the attribute could apply. @return true if the attribute applies to the given Element 
public	TokenNamepublic	
boolean	TokenNameboolean	
appliesTo	TokenNameIdentifier	 applies To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
tagInMap	TokenNameIdentifier	 tag In Map
=	TokenNameEQUAL	
applicabilitySet	TokenNameIdentifier	 applicability Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSetInclusive	TokenNameIdentifier	 is Set Inclusive
)	TokenNameRPAREN	
return	TokenNamereturn	
tagInMap	TokenNameIdentifier	 tag In Map
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
!	TokenNameNOT	
tagInMap	TokenNameIdentifier	 tag In Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

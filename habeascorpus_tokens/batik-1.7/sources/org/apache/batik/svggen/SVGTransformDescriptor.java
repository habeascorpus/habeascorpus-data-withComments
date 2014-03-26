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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Describes an SVG transform * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGTransformDescriptor.java 475477 2006-11-15 22:44:28Z cam $ * @see org.apache.batik.ext.awt.g2d.GraphicContext */	TokenNameCOMMENT_JAVADOC	 Describes an SVG transform * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGTransformDescriptor.java 475477 2006-11-15 22:44:28Z cam $ @see org.apache.batik.ext.awt.g2d.GraphicContext 
public	TokenNamepublic	
class	TokenNameclass	
SVGTransformDescriptor	TokenNameIdentifier	 SVG Transform Descriptor
implements	TokenNameimplements	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
,	TokenNameCOMMA	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGTransformDescriptor	TokenNameIdentifier	 SVG Transform Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param attrMap if not null, attribute name/value pairs * for this descriptor should be written in this Map. * Otherwise, a new Map will be created and attribute * name/value pairs will be written into it. * @return a map containing the SVG attributes needed by the * descriptor. */	TokenNameCOMMENT_JAVADOC	 @param attrMap if not null, attribute name/value pairs for this descriptor should be written in this Map. Otherwise, a new Map will be created and attribute name/value pairs will be written into it. @return a map containing the SVG attributes needed by the descriptor. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attrMap	TokenNameIdentifier	 attr Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param defSet if not null, definitions required to provide * targets for the descriptor attribute values will be * copied into defSet. If null, a new Set should be created * and definitions copied into it. The set contains * zero, one or more Elements. * @return a set containing Elements that represent the definition * of the descriptor's attribute values */	TokenNameCOMMENT_JAVADOC	 @param defSet if not null, definitions required to provide targets for the descriptor attribute values will be copied into defSet. If null, a new Set should be created and definitions copied into it. The set contains zero, one or more Elements. @return a set containing Elements that represent the definition of the descriptor's attribute values 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
defSet	TokenNameIdentifier	 def Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defSet	TokenNameIdentifier	 def Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defSet	TokenNameIdentifier	 def Set
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defSet	TokenNameIdentifier	 def Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

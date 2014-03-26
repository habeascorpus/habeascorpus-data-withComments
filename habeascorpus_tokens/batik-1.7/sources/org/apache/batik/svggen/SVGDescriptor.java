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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Defines the interface for a set of SVG attributes and * related definitions. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGDescriptor.java 478176 2006-11-22 14:50:50Z dvholten $ * @see org.apache.batik.ext.awt.g2d.GraphicContext */	TokenNameCOMMENT_JAVADOC	 Defines the interface for a set of SVG attributes and related definitions. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGDescriptor.java 478176 2006-11-22 14:50:50Z dvholten $ @see org.apache.batik.ext.awt.g2d.GraphicContext 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
{	TokenNameLBRACE	
/** * @param attrMap if not null, attribute name/value pairs * for this descriptor should be written in this Map. * Otherwise, a new Map will be created and attribute * name/value pairs will be written into it. * @return a map containing the SVG attributes needed by the * descriptor. */	TokenNameCOMMENT_JAVADOC	 @param attrMap if not null, attribute name/value pairs for this descriptor should be written in this Map. Otherwise, a new Map will be created and attribute name/value pairs will be written into it. @return a map containing the SVG attributes needed by the descriptor. 
Map	TokenNameIdentifier	 Map
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param defSet if not null, definitions required to provide * targets for the descriptor attribute values will be * copied into defSet. If null, a new Set should be created * and definitions copied into it. The set contains * zero, one or more Elements. * @return a set containing Elements that represent the definition * of the descriptor's attribute values */	TokenNameCOMMENT_JAVADOC	 @param defSet if not null, definitions required to provide targets for the descriptor attribute values will be copied into defSet. If null, a new Set should be created and definitions copied into it. The set contains zero, one or more Elements. @return a set containing Elements that represent the definition of the descriptor's attribute values 
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
defSet	TokenNameIdentifier	 def Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

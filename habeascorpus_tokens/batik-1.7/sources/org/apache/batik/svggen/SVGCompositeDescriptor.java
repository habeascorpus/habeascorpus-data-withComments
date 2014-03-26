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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Used to represent an SVG Composite. This can be achieved with * to values: an SVG opacity and a filter * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGCompositeDescriptor.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Used to represent an SVG Composite. This can be achieved with to values: an SVG opacity and a filter * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGCompositeDescriptor.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
implements	TokenNameimplements	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
,	TokenNameCOMMA	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
opacityValue	TokenNameIdentifier	 opacity Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
opacityValue	TokenNameIdentifier	 opacity Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
opacityValue	TokenNameIdentifier	 opacity Value
=	TokenNameEQUAL	
opacityValue	TokenNameIdentifier	 opacity Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filterValue	TokenNameIdentifier	 filter Value
=	TokenNameEQUAL	
filterValue	TokenNameIdentifier	 filter Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
opacityValue	TokenNameIdentifier	 opacity Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
opacityValue	TokenNameIdentifier	 opacity Value
,	TokenNameCOMMA	
filterValue	TokenNameIdentifier	 filter Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOpacityValue	TokenNameIdentifier	 get Opacity Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
opacityValue	TokenNameIdentifier	 opacity Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFilterValue	TokenNameIdentifier	 get Filter Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filterValue	TokenNameIdentifier	 filter Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getDef	TokenNameIdentifier	 get Def
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
SVG_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  OPACITY  ATTRIBUTE
,	TokenNameCOMMA	
opacityValue	TokenNameIdentifier	 opacity Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_FILTER_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  ATTRIBUTE
,	TokenNameCOMMA	
filterValue	TokenNameIdentifier	 filter Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defSet	TokenNameIdentifier	 def Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

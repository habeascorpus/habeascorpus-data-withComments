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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Used to represent an SVG Composite. This can be achieved with * to values: an SVG opacity and a filter * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGFilterDescriptor.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Used to represent an SVG Composite. This can be achieved with to values: an SVG opacity and a filter * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGFilterDescriptor.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
{	TokenNameLBRACE	
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filterValue	TokenNameIdentifier	 filter Value
=	TokenNameEQUAL	
filterValue	TokenNameIdentifier	 filter Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGFilterDescriptor	TokenNameIdentifier	 SVG Filter Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
def	TokenNameIdentifier	 def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
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
}	TokenNameRBRACE	

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
/** * Adapter for the SVGItem interface. * * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> * @version $Id: AbstractSVGItem.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Adapter for the SVGItem interface. * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> @version $Id: AbstractSVGItem.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGItem	TokenNameIdentifier	 Abstract SVG Item
implements	TokenNameimplements	
SVGItem	TokenNameIdentifier	 SVG Item
{	TokenNameLBRACE	
/** * List the item belongs to. */	TokenNameCOMMENT_JAVADOC	 List the item belongs to. 
protected	TokenNameprotected	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * String representation of the item. * This is a cached representation of the item while it is not changed. */	TokenNameCOMMENT_JAVADOC	 String representation of the item. This is a cached representation of the item while it is not changed. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
itemStringValue	TokenNameIdentifier	 item String Value
;	TokenNameSEMICOLON	
/** * Return the string representation of the item. */	TokenNameCOMMENT_JAVADOC	 Return the string representation of the item. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new AbstractSVGList. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractSVGList. 
protected	TokenNameprotected	
AbstractSVGItem	TokenNameIdentifier	 Abstract SVG Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Assigns a parent list to this item. * @param list The list the item belongs. */	TokenNameCOMMENT_JAVADOC	 Assigns a parent list to this item. @param list The list the item belongs. 
public	TokenNamepublic	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parent list of this item. */	TokenNameCOMMENT_JAVADOC	 Returns the parent list of this item. 
public	TokenNamepublic	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Notifies the parent list that the item has changed. * This discards the cached representation of the item. */	TokenNameCOMMENT_JAVADOC	 Notifies the parent list that the item has changed. This discards the cached representation of the item. 
protected	TokenNameprotected	
void	TokenNamevoid	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemStringValue	TokenNameIdentifier	 item String Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
itemChanged	TokenNameIdentifier	 item Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the cached representation of the item if valid, otherwise * recomputes the String representation of the item. */	TokenNameCOMMENT_JAVADOC	 Returns the cached representation of the item if valid, otherwise recomputes the String representation of the item. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
itemStringValue	TokenNameIdentifier	 item String Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemStringValue	TokenNameIdentifier	 item String Value
=	TokenNameEQUAL	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
itemStringValue	TokenNameIdentifier	 item String Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

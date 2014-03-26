/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WhitespaceInfoPaths.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WhitespaceInfoPaths.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
WhitespaceInfoPaths	TokenNameIdentifier	 Whitespace Info Paths
extends	TokenNameextends	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5954766719577516723L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Bean property to allow setPropertiesFromAttributes to * get the elements attribute. */	TokenNameCOMMENT_JAVADOC	 Bean property to allow setPropertiesFromAttributes to get the elements attribute. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_elements	TokenNameIdentifier	 m elements
;	TokenNameSEMICOLON	
/** * Set from the elements attribute. This is a list of * whitespace delimited element qualified names that specify * preservation of whitespace. * * @param elems Should be a non-null reference to a list * of {@link org.apache.xpath.XPath} objects. */	TokenNameCOMMENT_JAVADOC	 Set from the elements attribute. This is a list of whitespace delimited element qualified names that specify preservation of whitespace. * @param elems Should be a non-null reference to a list of {@link org.apache.xpath.XPath} objects. 
public	TokenNamepublic	
void	TokenNamevoid	
setElements	TokenNameIdentifier	 set Elements
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
elems	TokenNameIdentifier	 elems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
elems	TokenNameIdentifier	 elems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the property set by setElements(). This is a list of * whitespace delimited element qualified names that specify * preservation of whitespace. * * @return A reference to a list of {@link org.apache.xpath.XPath} objects, * or null. */	TokenNameCOMMENT_JAVADOC	 Get the property set by setElements(). This is a list of whitespace delimited element qualified names that specify preservation of whitespace. * @return A reference to a list of {@link org.apache.xpath.XPath} objects, or null. 
Vector	TokenNameIdentifier	 Vector
getElements	TokenNameIdentifier	 get Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_elements	TokenNameIdentifier	 m elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clearElements	TokenNameIdentifier	 clear Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor WhitespaceInfoPaths * * @param thisSheet The current stylesheet */	TokenNameCOMMENT_JAVADOC	 Constructor WhitespaceInfoPaths * @param thisSheet The current stylesheet 
public	TokenNamepublic	
WhitespaceInfoPaths	TokenNameIdentifier	 Whitespace Info Paths
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
thisSheet	TokenNameIdentifier	 this Sheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

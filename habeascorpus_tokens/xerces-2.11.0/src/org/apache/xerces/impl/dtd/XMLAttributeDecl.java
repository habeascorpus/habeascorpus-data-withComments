/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @version $Id: XMLAttributeDecl.java 446755 2006-09-15 21:56:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: XMLAttributeDecl.java 446755 2006-09-15 21:56:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLAttributeDecl	TokenNameIdentifier	 XML Attribute Decl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** name */	TokenNameCOMMENT_JAVADOC	 name 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** simpleType */	TokenNameCOMMENT_JAVADOC	 simpleType 
public	TokenNamepublic	
final	TokenNamefinal	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
simpleType	TokenNameIdentifier	 simple Type
=	TokenNameEQUAL	
new	TokenNamenew	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** optional */	TokenNameCOMMENT_JAVADOC	 optional 
public	TokenNamepublic	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Methods 	TokenNameCOMMENT_LINE	Methods 
// 	TokenNameCOMMENT_LINE	 
/** * setValues * * @param name * @param simpleType * @param optional */	TokenNameCOMMENT_JAVADOC	 setValues * @param name @param simpleType @param optional 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLSimpleType	TokenNameIdentifier	 XML Simple Type
simpleType	TokenNameIdentifier	 simple Type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
optional	TokenNameIdentifier	 optional
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
simpleType	TokenNameIdentifier	 simple Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
=	TokenNameEQUAL	
optional	TokenNameIdentifier	 optional
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setValues 	TokenNameCOMMENT_LINE	setValues 
/** * clear */	TokenNameCOMMENT_JAVADOC	 clear 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
simpleType	TokenNameIdentifier	 simple Type
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear 	TokenNameCOMMENT_LINE	clear 
}	TokenNameRBRACE	
// class XMLAttributeDecl 	TokenNameCOMMENT_LINE	class XMLAttributeDecl 

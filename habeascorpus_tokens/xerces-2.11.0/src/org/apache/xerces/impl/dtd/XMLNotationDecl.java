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
/** * @xerces.internal * * @version $Id: XMLNotationDecl.java 446755 2006-09-15 21:56:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: XMLNotationDecl.java 446755 2006-09-15 21:56:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLNotationDecl	TokenNameIdentifier	 XML Notation Decl
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** name */	TokenNameCOMMENT_JAVADOC	 name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** publicId */	TokenNameCOMMENT_JAVADOC	 publicId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
/** systemId */	TokenNameCOMMENT_JAVADOC	 systemId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
/** base systemId */	TokenNameCOMMENT_JAVADOC	 base systemId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Methods 	TokenNameCOMMENT_LINE	Methods 
// 	TokenNameCOMMENT_LINE	 
/** * setValues * * @param name * @param publicId * @param systemId */	TokenNameCOMMENT_JAVADOC	 setValues * @param name @param publicId @param systemId 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseSystemId	TokenNameIdentifier	 base System Id
=	TokenNameEQUAL	
baseSystemId	TokenNameIdentifier	 base System Id
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
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseSystemId	TokenNameIdentifier	 base System Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear 	TokenNameCOMMENT_LINE	clear 
}	TokenNameRBRACE	
// class XMLNotationDecl 	TokenNameCOMMENT_LINE	class XMLNotationDecl 

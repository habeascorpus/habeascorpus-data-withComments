/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemExtensionScript.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemExtensionScript.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
/** * Implement Script extension element * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Implement Script extension element @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ElemExtensionScript	TokenNameIdentifier	 Elem Extension Script
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6995978265966057744L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor ElemExtensionScript * */	TokenNameCOMMENT_JAVADOC	 Constructor ElemExtensionScript 
public	TokenNamepublic	
ElemExtensionScript	TokenNameIdentifier	 Elem Extension Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("ElemExtensionScript ctor"); 	TokenNameCOMMENT_LINE	System.out.println("ElemExtensionScript ctor"); 
}	TokenNameRBRACE	
/** Language used in extension. * @serial */	TokenNameCOMMENT_JAVADOC	 Language used in extension. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_lang	TokenNameIdentifier	 m lang
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set language used by extension * * * @param v Language used by extension */	TokenNameCOMMENT_JAVADOC	 Set language used by extension * @param v Language used by extension 
public	TokenNamepublic	
void	TokenNamevoid	
setLang	TokenNameIdentifier	 set Lang
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lang	TokenNameIdentifier	 m lang
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get language used by extension * * * @return Language used by extension */	TokenNameCOMMENT_JAVADOC	 Get language used by extension * @return Language used by extension 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLang	TokenNameIdentifier	 get Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lang	TokenNameIdentifier	 m lang
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Extension handler. * @serial */	TokenNameCOMMENT_JAVADOC	 Extension handler. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_src	TokenNameIdentifier	 m src
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set Extension handler name for this extension * * * @param v Extension handler name to set */	TokenNameCOMMENT_JAVADOC	 Set Extension handler name for this extension * @param v Extension handler name to set 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_src	TokenNameIdentifier	 m src
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get Extension handler name for this extension * * * @return Extension handler name */	TokenNameCOMMENT_JAVADOC	 Get Extension handler name for this extension * @return Extension handler name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_src	TokenNameIdentifier	 m src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for this element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for this element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_EXTENSIONSCRIPT	TokenNameIdentifier	 ELEMNAME  EXTENSIONSCRIPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

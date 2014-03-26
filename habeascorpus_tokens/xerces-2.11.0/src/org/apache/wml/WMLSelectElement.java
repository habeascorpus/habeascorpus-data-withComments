/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
;	TokenNameSEMICOLON	
/** * <p>The interface is modeled after DOM1 Spec for HTML from W3C. * The DTD used in this DOM model is from * <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> * http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * * <p>'select' element lets user pick from a list of options. * (Section 11.6.2.1, WAP WML Version 16-Jun-1999)</p> * * @version $Id: WMLSelectElement.java 447258 2006-09-18 05:41:23Z mrglavas $ * @author <a href="mailto:david@topware.com.tw">David Li</a> */	TokenNameCOMMENT_JAVADOC	 <p>The interface is modeled after DOM1 Spec for HTML from W3C. The DTD used in this DOM model is from <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * <p>'select' element lets user pick from a list of options. (Section 11.6.2.1, WAP WML Version 16-Jun-1999)</p> * @version $Id: WMLSelectElement.java 447258 2006-09-18 05:41:23Z mrglavas $ @author <a href="mailto:david@topware.com.tw">David Li</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
WMLSelectElement	TokenNameIdentifier	 WML Select Element
extends	TokenNameextends	
WMLElement	TokenNameIdentifier	 WML Element
{	TokenNameLBRACE	
/** * 'tabindex' specifies the tabbing position of the element * (Section 11.6.1, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'tabindex' specifies the tabbing position of the element (Section 11.6.1, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setTabIndex	TokenNameIdentifier	 set Tab Index
(	TokenNameLPAREN	
int	TokenNameint	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getTabIndex	TokenNameIdentifier	 get Tab Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'multiple' indicates whether a list accept multiple selection * (Section 11.6.2.1, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'multiple' indicates whether a list accept multiple selection (Section 11.6.2.1, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setMultiple	TokenNameIdentifier	 set Multiple
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
getMultiple	TokenNameIdentifier	 get Multiple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'name' specifies the name of variable to be set. * (Section 11.6.2.1, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'name' specifies the name of variable to be set. (Section 11.6.2.1, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'value' specifics the default value of the variable of 'name' * (Section 11.6.2.1, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'value' specifics the default value of the variable of 'name' (Section 11.6.2.1, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'title' specifies a title for this element * (Section 11.6.2.1, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'title' specifies a title for this element (Section 11.6.2.1, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'iname' specifies name of variable to be set with the index * result of selection. * (Section 11.6.2.1, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'iname' specifies name of variable to be set with the index result of selection. (Section 11.6.2.1, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setIName	TokenNameIdentifier	 set I Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIName	TokenNameIdentifier	 get I Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'ivalue' specifies the default of the variable 'iname' */	TokenNameCOMMENT_JAVADOC	 'ivalue' specifies the default of the variable 'iname' 
public	TokenNamepublic	
void	TokenNamevoid	
setIValue	TokenNameIdentifier	 set I Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getIValue	TokenNameIdentifier	 get I Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'xml:lang' specifics the natural or formal language in which * the document is written. * (Section 8.8, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'xml:lang' specifics the natural or formal language in which the document is written. (Section 8.8, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setXmlLang	TokenNameIdentifier	 set Xml Lang
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXmlLang	TokenNameIdentifier	 get Xml Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
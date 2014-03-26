/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
;	TokenNameSEMICOLON	
/** * <p>The interface is modeled after DOM1 Spec for HTML from W3C. * The DTD used in this DOM model is from * <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> * http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * * <p>The meta element contains meta-info of an WML deck * (Section 11.3.2, WAP WML Version 16-Jun-1999)</p> * * @version $Id: WMLMetaElement.java 447258 2006-09-18 05:41:23Z mrglavas $ * @author <a href="mailto:david@topware.com.tw">David Li</a> */	TokenNameCOMMENT_JAVADOC	 <p>The interface is modeled after DOM1 Spec for HTML from W3C. The DTD used in this DOM model is from <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * <p>The meta element contains meta-info of an WML deck (Section 11.3.2, WAP WML Version 16-Jun-1999)</p> * @version $Id: WMLMetaElement.java 447258 2006-09-18 05:41:23Z mrglavas $ @author <a href="mailto:david@topware.com.tw">David Li</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
WMLMetaElement	TokenNameIdentifier	 WML Meta Element
extends	TokenNameextends	
WMLElement	TokenNameIdentifier	 WML Element
{	TokenNameLBRACE	
/** * 'name' attribute specific the property name */	TokenNameCOMMENT_JAVADOC	 'name' attribute specific the property name 
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
/** * 'http-equiv' attribute indicates the property should be * interpret as HTTP header. */	TokenNameCOMMENT_JAVADOC	 'http-equiv' attribute indicates the property should be interpret as HTTP header. 
public	TokenNamepublic	
void	TokenNamevoid	
setHttpEquiv	TokenNameIdentifier	 set Http Equiv
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHttpEquiv	TokenNameIdentifier	 get Http Equiv
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'forua' attribute specifies whether a intermediate agent should * remove this meta element. A value of false means the * intermediate agent must remove the element. */	TokenNameCOMMENT_JAVADOC	 'forua' attribute specifies whether a intermediate agent should remove this meta element. A value of false means the intermediate agent must remove the element. 
public	TokenNamepublic	
void	TokenNamevoid	
setForua	TokenNameIdentifier	 set Forua
(	TokenNameLPAREN	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
getForua	TokenNameIdentifier	 get Forua
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'scheme' attribute specifies a form that may be used to * interpret the property value */	TokenNameCOMMENT_JAVADOC	 'scheme' attribute specifies a form that may be used to interpret the property value 
public	TokenNamepublic	
void	TokenNamevoid	
setScheme	TokenNameIdentifier	 set Scheme
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getScheme	TokenNameIdentifier	 get Scheme
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'content' attribute specifies the property value */	TokenNameCOMMENT_JAVADOC	 'content' attribute specifies the property value 
public	TokenNamepublic	
void	TokenNamevoid	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContent	TokenNameIdentifier	 get Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

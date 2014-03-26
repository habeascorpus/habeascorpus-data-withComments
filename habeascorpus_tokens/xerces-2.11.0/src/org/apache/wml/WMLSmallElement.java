/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
;	TokenNameSEMICOLON	
/** * <p>The interface is modeled after DOM1 Spec for HTML from W3C. * The DTD used in this DOM model is from * <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> * http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * * <p>'small' render the text with small font * (Section 11.8.1, WAP WML Version 16-Jun-1999)</p> * * @version $Id: WMLSmallElement.java 450517 2006-09-27 17:48:28Z mrglavas $ * @author <a href="mailto:david@topware.com.tw">David Li</a> */	TokenNameCOMMENT_JAVADOC	 <p>The interface is modeled after DOM1 Spec for HTML from W3C. The DTD used in this DOM model is from <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * <p>'small' render the text with small font (Section 11.8.1, WAP WML Version 16-Jun-1999)</p> * @version $Id: WMLSmallElement.java 450517 2006-09-27 17:48:28Z mrglavas $ @author <a href="mailto:david@topware.com.tw">David Li</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
WMLSmallElement	TokenNameIdentifier	 WML Small Element
extends	TokenNameextends	
WMLElement	TokenNameIdentifier	 WML Element
{	TokenNameLBRACE	
/** * The xml:lang that specifics the natural or formal language in * which the document is written. * (Section 8.8, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 The xml:lang that specifics the natural or formal language in which the document is written. (Section 8.8, WAP WML Version 16-Jun-1999) 
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

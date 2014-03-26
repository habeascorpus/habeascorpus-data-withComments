/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
wml	TokenNameIdentifier	 wml
;	TokenNameSEMICOLON	
/** * <p>The interface is modeled after DOM1 Spec for HTML from W3C. * The DTD used in this DOM model is from * <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> * http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * * <p>'img' specifies an image in a text flow * (Section 11.9, WAP WML Version 16-Jun-1999)</p> * * @version $Id: WMLImgElement.java 447258 2006-09-18 05:41:23Z mrglavas $ * @author <a href="mailto:david@topware.com.tw">David Li</a> */	TokenNameCOMMENT_JAVADOC	 <p>The interface is modeled after DOM1 Spec for HTML from W3C. The DTD used in this DOM model is from <a href="http://www.wapforum.org/DTD/wml_1.1.xml"> http://www.wapforum.org/DTD/wml_1.1.xml</a></p> * <p>'img' specifies an image in a text flow (Section 11.9, WAP WML Version 16-Jun-1999)</p> * @version $Id: WMLImgElement.java 447258 2006-09-18 05:41:23Z mrglavas $ @author <a href="mailto:david@topware.com.tw">David Li</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
WMLImgElement	TokenNameIdentifier	 WML Img Element
extends	TokenNameextends	
WMLElement	TokenNameIdentifier	 WML Element
{	TokenNameLBRACE	
/** * 'alt' specifies an alternative text for the image * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'alt' specifies an alternative text for the image (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setAlt	TokenNameIdentifier	 set Alt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAlt	TokenNameIdentifier	 get Alt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'src' specifies URI for the source images * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'src' specifies URI for the source images (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'localsrc' specifies an alternative internal representation of * the image. * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'localsrc' specifies an alternative internal representation of the image. (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalSrc	TokenNameIdentifier	 set Local Src
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalSrc	TokenNameIdentifier	 get Local Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'vspace' specifies the abount of white space to be inserted * above and below * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'vspace' specifies the abount of white space to be inserted above and below (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setVspace	TokenNameIdentifier	 set Vspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVspace	TokenNameIdentifier	 get Vspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'hspace' specifies the abount of white space to be inserted * left and right * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'hspace' specifies the abount of white space to be inserted left and right (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setHspace	TokenNameIdentifier	 set Hspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHspace	TokenNameIdentifier	 get Hspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'align' specifies the alignment of the image within the text * flow. * (Section 11.8, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'align' specifies the alignment of the image within the text flow. (Section 11.8, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setAlign	TokenNameIdentifier	 set Align
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'width' specifies the width of an image. * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'width' specifies the width of an image. (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * 'height' specifies the height of an image. * (Section 11.9, WAP WML Version 16-Jun-1999) */	TokenNameCOMMENT_JAVADOC	 'height' specifies the height of an image. (Section 11.9, WAP WML Version 16-Jun-1999) 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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

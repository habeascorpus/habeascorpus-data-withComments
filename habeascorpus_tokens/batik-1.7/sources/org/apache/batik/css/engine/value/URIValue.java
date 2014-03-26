/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
/** * This class represents uri values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: URIValue.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents uri values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: URIValue.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
URIValue	TokenNameIdentifier	 URI Value
extends	TokenNameextends	
StringValue	TokenNameIdentifier	 String Value
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cssText	TokenNameIdentifier	 css Text
;	TokenNameSEMICOLON	
/** * Creates a new StringValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new StringValue. 
public	TokenNamepublic	
URIValue	TokenNameIdentifier	 URI Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cssText	TokenNameIdentifier	 css Text
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_URI	TokenNameIdentifier	 CSS  URI
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cssText	TokenNameIdentifier	 css Text
=	TokenNameEQUAL	
cssText	TokenNameIdentifier	 css Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A string representation of the current value. */	TokenNameCOMMENT_JAVADOC	 A string representation of the current value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
cssText	TokenNameIdentifier	 css Text
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

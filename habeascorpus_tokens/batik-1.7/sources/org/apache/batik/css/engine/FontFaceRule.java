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
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * This class represents a @font-face CSS rule. * * This mostly exists to give us a place to store the * URI to be used for 'src' URI resolution. * * @author <a href="mailto:deweese@apache.org">l449433</a> * @version $Id: FontFaceRule.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a @font-face CSS rule. * This mostly exists to give us a place to store the URI to be used for 'src' URI resolution. * @author <a href="mailto:deweese@apache.org">l449433</a> @version $Id: FontFaceRule.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FontFaceRule	TokenNameIdentifier	 Font Face Rule
implements	TokenNameimplements	
Rule	TokenNameIdentifier	 Rule
{	TokenNameLBRACE	
/** * The type constant. */	TokenNameCOMMENT_JAVADOC	 The type constant. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
TYPE	TokenNameIdentifier	 TYPE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StyleMap	TokenNameIdentifier	 Style Map
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FontFaceRule	TokenNameIdentifier	 Font Face Rule
(	TokenNameLPAREN	
StyleMap	TokenNameIdentifier	 Style Map
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
purl	TokenNameIdentifier	 purl
=	TokenNameEQUAL	
purl	TokenNameIdentifier	 purl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a constant identifying the rule type. */	TokenNameCOMMENT_JAVADOC	 Returns a constant identifying the rule type. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TYPE	TokenNameIdentifier	 TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URI of the @font-face rule. */	TokenNameCOMMENT_JAVADOC	 Returns the URI of the @font-face rule. 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
purl	TokenNameIdentifier	 purl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the StyleMap from the @font-face rule. */	TokenNameCOMMENT_JAVADOC	 Returns the StyleMap from the @font-face rule. 
public	TokenNamepublic	
StyleMap	TokenNameIdentifier	 Style Map
getStyleMap	TokenNameIdentifier	 get Style Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this rule. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this rule. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"@font-face { "	TokenNameStringLiteral	@font-face { 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" } "	TokenNameStringLiteral	 } 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

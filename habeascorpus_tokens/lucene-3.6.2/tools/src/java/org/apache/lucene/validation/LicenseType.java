package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A list of accepted licenses. See also http://www.apache.org/legal/3party.html * **/	TokenNameCOMMENT_JAVADOC	 A list of accepted licenses. See also http://www.apache.org/legal/3party.html *
public	TokenNamepublic	
enum	TokenNameenum	
LicenseType	TokenNameIdentifier	 License Type
{	TokenNameLBRACE	
ASL	TokenNameIdentifier	 ASL
(	TokenNameLPAREN	
"Apache Software License 2.0"	TokenNameStringLiteral	Apache Software License 2.0
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BSD	TokenNameIdentifier	 BSD
(	TokenNameLPAREN	
"Berkeley Software Distribution"	TokenNameStringLiteral	Berkeley Software Distribution
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BSD_LIKE	TokenNameIdentifier	 BSD  LIKE
(	TokenNameLPAREN	
"BSD like license"	TokenNameStringLiteral	BSD like license
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
//BSD like just means someone has taken the BSD license and put in their name, copyright, or it's a very similar license. 	TokenNameCOMMENT_LINE	BSD like just means someone has taken the BSD license and put in their name, copyright, or it's a very similar license. 
CDDL	TokenNameIdentifier	 CDDL
(	TokenNameLPAREN	
"Common Development and Distribution License"	TokenNameStringLiteral	Common Development and Distribution License
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CPL	TokenNameIdentifier	 CPL
(	TokenNameLPAREN	
"Common Public License"	TokenNameStringLiteral	Common Public License
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EPL	TokenNameIdentifier	 EPL
(	TokenNameLPAREN	
"Eclipse Public License Version 1.0"	TokenNameStringLiteral	Eclipse Public License Version 1.0
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MIT	TokenNameIdentifier	 MIT
(	TokenNameLPAREN	
"Massachusetts Institute of Tech. License"	TokenNameStringLiteral	Massachusetts Institute of Tech. License
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MPL	TokenNameIdentifier	 MPL
(	TokenNameLPAREN	
"Mozilla Public License"	TokenNameStringLiteral	Mozilla Public License
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
//NOT SURE on the required notice 	TokenNameCOMMENT_LINE	NOT SURE on the required notice 
PD	TokenNameIdentifier	 PD
(	TokenNameLPAREN	
"Public Domain"	TokenNameStringLiteral	Public Domain
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
//SUNBCLA("Sun Binary Code License Agreement"), 	TokenNameCOMMENT_LINE	SUNBCLA("Sun Binary Code License Agreement"), 
SUN	TokenNameIdentifier	 SUN
(	TokenNameLPAREN	
"Sun Open Source License"	TokenNameStringLiteral	Sun Open Source License
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
COMPOUND	TokenNameIdentifier	 COMPOUND
(	TokenNameLPAREN	
"Compound license (see NOTICE)."	TokenNameStringLiteral	Compound license (see NOTICE).
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FAKE	TokenNameIdentifier	 FAKE
(	TokenNameLPAREN	
"FAKE license - not needed"	TokenNameStringLiteral	FAKE license - not needed
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
display	TokenNameIdentifier	 display
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
noticeRequired	TokenNameIdentifier	 notice Required
;	TokenNameSEMICOLON	
LicenseType	TokenNameIdentifier	 License Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
display	TokenNameIdentifier	 display
,	TokenNameCOMMA	
boolean	TokenNameboolean	
noticeRequired	TokenNameIdentifier	 notice Required
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
display	TokenNameIdentifier	 display
=	TokenNameEQUAL	
display	TokenNameIdentifier	 display
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
noticeRequired	TokenNameIdentifier	 notice Required
=	TokenNameEQUAL	
noticeRequired	TokenNameIdentifier	 notice Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNoticeRequired	TokenNameIdentifier	 is Notice Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
noticeRequired	TokenNameIdentifier	 notice Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDisplay	TokenNameIdentifier	 get Display
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
display	TokenNameIdentifier	 display
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"LicenseType{"	TokenNameStringLiteral	LicenseType{
+	TokenNamePLUS	
"display='"	TokenNameStringLiteral	display='
+	TokenNamePLUS	
display	TokenNameIdentifier	 display
+	TokenNamePLUS	
'\''	TokenNameCharacterLiteral	
+	TokenNamePLUS	
'}'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expected license file suffix for a given license type. */	TokenNameCOMMENT_JAVADOC	 Expected license file suffix for a given license type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
licenseFileSuffix	TokenNameIdentifier	 license File Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"-LICENSE-"	TokenNameStringLiteral	-LICENSE-
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".txt"	TokenNameStringLiteral	.txt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expected notice file suffix for a given license type. */	TokenNameCOMMENT_JAVADOC	 Expected notice file suffix for a given license type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
noticeFileSuffix	TokenNameIdentifier	 notice File Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"-NOTICE.txt"	TokenNameStringLiteral	-NOTICE.txt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

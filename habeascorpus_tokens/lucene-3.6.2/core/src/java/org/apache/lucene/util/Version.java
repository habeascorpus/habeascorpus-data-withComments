package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Use by certain classes to match version compatibility * across releases of Lucene. * * <p><b>WARNING</b>: When changing the version parameter * that you supply to components in Lucene, do not simply * change the version at search-time, but instead also adjust * your indexing code to match, and re-index. */	TokenNameCOMMENT_JAVADOC	 Use by certain classes to match version compatibility across releases of Lucene. * <p><b>WARNING</b>: When changing the version parameter that you supply to components in Lucene, do not simply change the version at search-time, but instead also adjust your indexing code to match, and re-index. 
// remove me when java 5 is no longer supported 	TokenNameCOMMENT_LINE	remove me when java 5 is no longer supported 
// this is a workaround for a JDK bug that wrongly emits a warning. 	TokenNameCOMMENT_LINE	this is a workaround for a JDK bug that wrongly emits a warning. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"dep-ann"	TokenNameStringLiteral	dep-ann
)	TokenNameRPAREN	
public	TokenNamepublic	
enum	TokenNameenum	
Version	TokenNameIdentifier	 Version
{	TokenNameLBRACE	
/** Match settings and bugs in Lucene's 2.0 release. * @deprecated (3.1) Use latest */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 2.0 release. @deprecated (3.1) Use latest 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_20	TokenNameIdentifier	 LUCENE 20
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 2.1 release. * @deprecated (3.1) Use latest */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 2.1 release. @deprecated (3.1) Use latest 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_21	TokenNameIdentifier	 LUCENE 21
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 2.2 release. * @deprecated (3.1) Use latest */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 2.2 release. @deprecated (3.1) Use latest 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_22	TokenNameIdentifier	 LUCENE 22
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 2.3 release. * @deprecated (3.1) Use latest */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 2.3 release. @deprecated (3.1) Use latest 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_23	TokenNameIdentifier	 LUCENE 23
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 2.4 release. * @deprecated (3.1) Use latest */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 2.4 release. @deprecated (3.1) Use latest 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_24	TokenNameIdentifier	 LUCENE 24
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 2.9 release. * @deprecated (3.1) Use latest */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 2.9 release. @deprecated (3.1) Use latest 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_29	TokenNameIdentifier	 LUCENE 29
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 3.0 release. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.0 release. 
LUCENE_30	TokenNameIdentifier	 LUCENE 30
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 3.1 release. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.1 release. 
LUCENE_31	TokenNameIdentifier	 LUCENE 31
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 3.2 release. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.2 release. 
LUCENE_32	TokenNameIdentifier	 LUCENE 32
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 3.3 release. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.3 release. 
LUCENE_33	TokenNameIdentifier	 LUCENE 33
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 3.4 release. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.4 release. 
LUCENE_34	TokenNameIdentifier	 LUCENE 34
,	TokenNameCOMMA	
/** Match settings and bugs in Lucene's 3.5 release. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.5 release. 
LUCENE_35	TokenNameIdentifier	 LUCENE 35
,	TokenNameCOMMA	
/** * Match settings and bugs in Lucene's 3.6 release. * <p> * Use this to get the latest &amp; greatest settings, bug * fixes, etc, for Lucene. */	TokenNameCOMMENT_JAVADOC	 Match settings and bugs in Lucene's 3.6 release. <p> Use this to get the latest &amp; greatest settings, bug fixes, etc, for Lucene. 
LUCENE_36	TokenNameIdentifier	 LUCENE 36
,	TokenNameCOMMA	
/* Add new constants for later versions **here** to respect order! */	TokenNameCOMMENT_BLOCK	 Add new constants for later versions **here** to respect order! 
/** * <p><b>WARNING</b>: if you use this setting, and then * upgrade to a newer release of Lucene, sizable changes * may happen. If backwards compatibility is important * then you should instead explicitly specify an actual * version. * <p> * If you use this constant then you may need to * <b>re-index all of your documents</b> when upgrading * Lucene, as the way text is indexed may have changed. * Additionally, you may need to <b>re-test your entire * application</b> to ensure it behaves as expected, as * some defaults may have changed and may break functionality * in your application. * @deprecated Use an actual version instead. */	TokenNameCOMMENT_JAVADOC	 <p><b>WARNING</b>: if you use this setting, and then upgrade to a newer release of Lucene, sizable changes may happen. If backwards compatibility is important then you should instead explicitly specify an actual version. <p> If you use this constant then you may need to <b>re-index all of your documents</b> when upgrading Lucene, as the way text is indexed may have changed. Additionally, you may need to <b>re-test your entire application</b> to ensure it behaves as expected, as some defaults may have changed and may break functionality in your application. @deprecated Use an actual version instead. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

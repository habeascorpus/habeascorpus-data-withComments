/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSortKey.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSortKey.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
/** * Data structure for use by the NodeSorter class. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Data structure for use by the NodeSorter class. @xsl.usage internal 
class	TokenNameclass	
NodeSortKey	TokenNameIdentifier	 Node Sort Key
{	TokenNameLBRACE	
/** Select pattern for this sort key */	TokenNameCOMMENT_JAVADOC	 Select pattern for this sort key 
XPath	TokenNameIdentifier	 X Path
m_selectPat	TokenNameIdentifier	 m select Pat
;	TokenNameSEMICOLON	
/** Flag indicating whether to treat thee result as a number */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether to treat thee result as a number 
boolean	TokenNameboolean	
m_treatAsNumbers	TokenNameIdentifier	 m treat As Numbers
;	TokenNameSEMICOLON	
/** Flag indicating whether to sort in descending order */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether to sort in descending order 
boolean	TokenNameboolean	
m_descending	TokenNameIdentifier	 m descending
;	TokenNameSEMICOLON	
/** Flag indicating by case */	TokenNameCOMMENT_JAVADOC	 Flag indicating by case 
boolean	TokenNameboolean	
m_caseOrderUpper	TokenNameIdentifier	 m case Order Upper
;	TokenNameSEMICOLON	
/** Collator instance */	TokenNameCOMMENT_JAVADOC	 Collator instance 
Collator	TokenNameIdentifier	 Collator
m_col	TokenNameIdentifier	 m col
;	TokenNameSEMICOLON	
/** Locale we're in */	TokenNameCOMMENT_JAVADOC	 Locale we're in 
Locale	TokenNameIdentifier	 Locale
m_locale	TokenNameIdentifier	 m locale
;	TokenNameSEMICOLON	
/** Prefix resolver to use */	TokenNameCOMMENT_JAVADOC	 Prefix resolver to use 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
m_namespaceContext	TokenNameIdentifier	 m namespace Context
;	TokenNameSEMICOLON	
/** Transformer instance */	TokenNameCOMMENT_JAVADOC	 Transformer instance 
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_processor	TokenNameIdentifier	 m processor
;	TokenNameSEMICOLON	
// needed for error reporting. 	TokenNameCOMMENT_LINE	needed for error reporting. 
/** * Constructor NodeSortKey * * * @param transformer non null transformer instance * @param selectPat Select pattern for this key * @param treatAsNumbers Flag indicating whether the result will be a number * @param descending Flag indicating whether to sort in descending order * @param langValue Lang value to use to get locale * @param caseOrderUpper Flag indicating whether case is relevant * @param namespaceContext Prefix resolver * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Constructor NodeSortKey * @param transformer non null transformer instance @param selectPat Select pattern for this key @param treatAsNumbers Flag indicating whether the result will be a number @param descending Flag indicating whether to sort in descending order @param langValue Lang value to use to get locale @param caseOrderUpper Flag indicating whether case is relevant @param namespaceContext Prefix resolver * @throws javax.xml.transform.TransformerException 
NodeSortKey	TokenNameIdentifier	 Node Sort Key
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
selectPat	TokenNameIdentifier	 select Pat
,	TokenNameCOMMA	
boolean	TokenNameboolean	
treatAsNumbers	TokenNameIdentifier	 treat As Numbers
,	TokenNameCOMMA	
boolean	TokenNameboolean	
descending	TokenNameIdentifier	 descending
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
langValue	TokenNameIdentifier	 lang Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
caseOrderUpper	TokenNameIdentifier	 case Order Upper
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
m_namespaceContext	TokenNameIdentifier	 m namespace Context
=	TokenNameEQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
;	TokenNameSEMICOLON	
m_selectPat	TokenNameIdentifier	 m select Pat
=	TokenNameEQUAL	
selectPat	TokenNameIdentifier	 select Pat
;	TokenNameSEMICOLON	
m_treatAsNumbers	TokenNameIdentifier	 m treat As Numbers
=	TokenNameEQUAL	
treatAsNumbers	TokenNameIdentifier	 treat As Numbers
;	TokenNameSEMICOLON	
m_descending	TokenNameIdentifier	 m descending
=	TokenNameEQUAL	
descending	TokenNameIdentifier	 descending
;	TokenNameSEMICOLON	
m_caseOrderUpper	TokenNameIdentifier	 m case Order Upper
=	TokenNameEQUAL	
caseOrderUpper	TokenNameIdentifier	 case Order Upper
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
langValue	TokenNameIdentifier	 lang Value
&&	TokenNameAND_AND	
m_treatAsNumbers	TokenNameIdentifier	 m treat As Numbers
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2851 	TokenNameCOMMENT_LINE	See http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2851 
// The constructor of Locale is defined as 	TokenNameCOMMENT_LINE	The constructor of Locale is defined as 
// public Locale(String language, String country) 	TokenNameCOMMENT_LINE	public Locale(String language, String country) 
// with 	TokenNameCOMMENT_LINE	with 
// language - lowercase two-letter ISO-639 code 	TokenNameCOMMENT_LINE	language - lowercase two-letter ISO-639 code 
// country - uppercase two-letter ISO-3166 code 	TokenNameCOMMENT_LINE	country - uppercase two-letter ISO-3166 code 
// a) language must be provided as a lower-case ISO-code 	TokenNameCOMMENT_LINE	a) language must be provided as a lower-case ISO-code 
// instead of an upper-case code 	TokenNameCOMMENT_LINE	instead of an upper-case code 
// b) country must be provided as an ISO-code 	TokenNameCOMMENT_LINE	b) country must be provided as an ISO-code 
// instead of a full localized country name (e.g. "France") 	TokenNameCOMMENT_LINE	instead of a full localized country name (e.g. "France") 
m_locale	TokenNameIdentifier	 m locale
=	TokenNameEQUAL	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
langValue	TokenNameIdentifier	 lang Value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCountry	TokenNameIdentifier	 get Country
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// (old, before bug report 2851). 	TokenNameCOMMENT_LINE	(old, before bug report 2851). 
// m_locale = new Locale(langValue.toUpperCase(), 	TokenNameCOMMENT_LINE	m_locale = new Locale(langValue.toUpperCase(), 
// Locale.getDefault().getDisplayCountry()); 	TokenNameCOMMENT_LINE	Locale.getDefault().getDisplayCountry()); 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_locale	TokenNameIdentifier	 m locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_processor.warn("Could not find locale for <sort xml:lang="+langValue); 	TokenNameCOMMENT_LINE	m_processor.warn("Could not find locale for <sort xml:lang="+langValue); 
m_locale	TokenNameIdentifier	 m locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_locale	TokenNameIdentifier	 m locale
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_col	TokenNameIdentifier	 m col
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
m_locale	TokenNameIdentifier	 m locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_col	TokenNameIdentifier	 m col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_CANNOT_FIND_COLLATOR	TokenNameIdentifier	 WG  CANNOT  FIND  COLLATOR
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
langValue	TokenNameIdentifier	 lang Value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not find Collator for <sort xml:lang="+langValue); 	TokenNameCOMMENT_LINE	"Could not find Collator for <sort xml:lang="+langValue); 
m_col	TokenNameIdentifier	 m col
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

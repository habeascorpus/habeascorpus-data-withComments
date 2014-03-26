/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * EncodingMap is a convenience class which handles conversions between * IANA encoding names and Java encoding names, and vice versa. The * encoding names used in XML instance documents <strong>must</strong> * be the IANA encoding names specified or one of the aliases for those names * which IANA defines. * <p> * <TABLE BORDER="0" WIDTH="100%"> * <TR> * <TD WIDTH="33%"> * <P ALIGN="CENTER"><B>Common Name</B> * </TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER"><B>Use this name in XML files</B> * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER"><B>Name Type</B> * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER"><B>Xerces converts to this Java Encoder Name</B> * </TD> * </TR> * <TR> * <TD WIDTH="33%">8 bit Unicode</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">UTF-8 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">UTF8 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin 1</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-1 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-1 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin 2</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-2 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-2 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin 3</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-3 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-3 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin 4</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-4 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-4 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin Cyrillic</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-5 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-5 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin Arabic</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-6 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-6 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin Greek</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-7 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-7 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin Hebrew</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-8 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-8 * </TD> * </TR> * <TR> * <TD WIDTH="33%">ISO Latin 5</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ISO-8859-9 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">ISO-8859-9 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: US</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-us * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp037 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Canada</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-ca * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp037 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Netherlands</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-nl * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp037 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Denmark</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-dk * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp277 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Norway</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-no * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp277 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Finland</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-fi * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp278 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Sweden</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-se * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp278 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Italy</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-it * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp280 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Spain, Latin America</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-es * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp284 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Great Britain</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-gb * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp285 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: France</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-fr * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp297 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Arabic</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-ar1 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp420 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Hebrew</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-he * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp424 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Switzerland</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-ch * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp500 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Roece</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-roece * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp870 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Yugoslavia</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-yu * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp870 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Iceland</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-is * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp871 * </TD> * </TR> * <TR> * <TD WIDTH="33%">EBCDIC: Urdu</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">ebcdic-cp-ar2 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">IANA * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">cp918 * </TD> * </TR> * <TR> * <TD WIDTH="33%">Chinese for PRC, mixed 1/2 byte</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">gb2312 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">GB2312 * </TD> * </TR> * <TR> * <TD WIDTH="33%">Extended Unix Code, packed for Japanese</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">euc-jp * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">eucjis * </TD> * </TR> * <TR> * <TD WIDTH="33%">Japanese: iso-2022-jp</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">iso-2020-jp * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">JIS * </TD> * </TR> * <TR> * <TD WIDTH="33%">Japanese: Shift JIS</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">Shift_JIS * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">SJIS * </TD> * </TR> * <TR> * <TD WIDTH="33%">Chinese: Big5</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">Big5 * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">Big5 * </TD> * </TR> * <TR> * <TD WIDTH="33%">Extended Unix Code, packed for Korean</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">euc-kr * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">iso2022kr * </TD> * </TR> * <TR> * <TD WIDTH="33%">Cyrillic</TD> * <TD WIDTH="15%"> * <P ALIGN="CENTER">koi8-r * </TD> * <TD WIDTH="12%"> * <P ALIGN="CENTER">MIME * </TD> * <TD WIDTH="31%"> * <P ALIGN="CENTER">koi8-r * </TD> * </TR> * </TABLE> * * @author TAMURA Kent, IBM * @author Andy Clark, IBM * * @version $Id: EncodingMap.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 EncodingMap is a convenience class which handles conversions between IANA encoding names and Java encoding names, and vice versa. The encoding names used in XML instance documents <strong>must</strong> be the IANA encoding names specified or one of the aliases for those names which IANA defines. <p> <TABLE BORDER="0" WIDTH="100%"> <TR> <TD WIDTH="33%"> <P ALIGN="CENTER"><B>Common Name</B> </TD> <TD WIDTH="15%"> <P ALIGN="CENTER"><B>Use this name in XML files</B> </TD> <TD WIDTH="12%"> <P ALIGN="CENTER"><B>Name Type</B> </TD> <TD WIDTH="31%"> <P ALIGN="CENTER"><B>Xerces converts to this Java Encoder Name</B> </TD> </TR> <TR> <TD WIDTH="33%">8 bit Unicode</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">UTF-8 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">UTF8 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin 1</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-1 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-1 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin 2</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-2 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-2 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin 3</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-3 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-3 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin 4</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-4 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-4 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin Cyrillic</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-5 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-5 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin Arabic</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-6 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-6 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin Greek</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-7 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-7 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin Hebrew</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-8 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-8 </TD> </TR> <TR> <TD WIDTH="33%">ISO Latin 5</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ISO-8859-9 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">ISO-8859-9 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: US</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-us </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp037 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Canada</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-ca </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp037 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Netherlands</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-nl </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp037 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Denmark</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-dk </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp277 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Norway</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-no </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp277 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Finland</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-fi </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp278 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Sweden</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-se </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp278 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Italy</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-it </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp280 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Spain, Latin America</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-es </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp284 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Great Britain</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-gb </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp285 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: France</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-fr </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp297 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Arabic</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-ar1 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp420 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Hebrew</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-he </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp424 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Switzerland</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-ch </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp500 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Roece</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-roece </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp870 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Yugoslavia</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-yu </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp870 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Iceland</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-is </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp871 </TD> </TR> <TR> <TD WIDTH="33%">EBCDIC: Urdu</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">ebcdic-cp-ar2 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">IANA </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">cp918 </TD> </TR> <TR> <TD WIDTH="33%">Chinese for PRC, mixed 1/2 byte</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">gb2312 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">GB2312 </TD> </TR> <TR> <TD WIDTH="33%">Extended Unix Code, packed for Japanese</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">euc-jp </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">eucjis </TD> </TR> <TR> <TD WIDTH="33%">Japanese: iso-2022-jp</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">iso-2020-jp </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">JIS </TD> </TR> <TR> <TD WIDTH="33%">Japanese: Shift JIS</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">Shift_JIS </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">SJIS </TD> </TR> <TR> <TD WIDTH="33%">Chinese: Big5</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">Big5 </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">Big5 </TD> </TR> <TR> <TD WIDTH="33%">Extended Unix Code, packed for Korean</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">euc-kr </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">iso2022kr </TD> </TR> <TR> <TD WIDTH="33%">Cyrillic</TD> <TD WIDTH="15%"> <P ALIGN="CENTER">koi8-r </TD> <TD WIDTH="12%"> <P ALIGN="CENTER">MIME </TD> <TD WIDTH="31%"> <P ALIGN="CENTER">koi8-r </TD> </TR> </TABLE> * @author TAMURA Kent, IBM @author Andy Clark, IBM * @version $Id: EncodingMap.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
EncodingMap	TokenNameIdentifier	 Encoding Map
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** fIANA2JavaMap */	TokenNameCOMMENT_JAVADOC	 fIANA2JavaMap 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** fJava2IANAMap */	TokenNameCOMMENT_JAVADOC	 fJava2IANAMap 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Static initialization 	TokenNameCOMMENT_LINE	Static initialization 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
{	TokenNameLBRACE	
// add IANA to Java encoding mappings. 	TokenNameCOMMENT_LINE	add IANA to Java encoding mappings. 
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"BIG5"	TokenNameStringLiteral	BIG5
,	TokenNameCOMMA	
"Big5"	TokenNameStringLiteral	Big5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSBIG5"	TokenNameStringLiteral	CSBIG5
,	TokenNameCOMMA	
"Big5"	TokenNameStringLiteral	Big5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP037"	TokenNameStringLiteral	CP037
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM037"	TokenNameStringLiteral	IBM037
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM037"	TokenNameStringLiteral	CSIBM037
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-US"	TokenNameStringLiteral	EBCDIC-CP-US
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-CA"	TokenNameStringLiteral	EBCDIC-CP-CA
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-NL"	TokenNameStringLiteral	EBCDIC-CP-NL
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-WT"	TokenNameStringLiteral	EBCDIC-CP-WT
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM273"	TokenNameStringLiteral	IBM273
,	TokenNameCOMMA	
"CP273"	TokenNameStringLiteral	CP273
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP273"	TokenNameStringLiteral	CP273
,	TokenNameCOMMA	
"CP273"	TokenNameStringLiteral	CP273
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM273"	TokenNameStringLiteral	CSIBM273
,	TokenNameCOMMA	
"CP273"	TokenNameStringLiteral	CP273
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM277"	TokenNameStringLiteral	IBM277
,	TokenNameCOMMA	
"CP277"	TokenNameStringLiteral	CP277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP277"	TokenNameStringLiteral	CP277
,	TokenNameCOMMA	
"CP277"	TokenNameStringLiteral	CP277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM277"	TokenNameStringLiteral	CSIBM277
,	TokenNameCOMMA	
"CP277"	TokenNameStringLiteral	CP277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-DK"	TokenNameStringLiteral	EBCDIC-CP-DK
,	TokenNameCOMMA	
"CP277"	TokenNameStringLiteral	CP277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-NO"	TokenNameStringLiteral	EBCDIC-CP-NO
,	TokenNameCOMMA	
"CP277"	TokenNameStringLiteral	CP277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM278"	TokenNameStringLiteral	IBM278
,	TokenNameCOMMA	
"CP278"	TokenNameStringLiteral	CP278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP278"	TokenNameStringLiteral	CP278
,	TokenNameCOMMA	
"CP278"	TokenNameStringLiteral	CP278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM278"	TokenNameStringLiteral	CSIBM278
,	TokenNameCOMMA	
"CP278"	TokenNameStringLiteral	CP278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-FI"	TokenNameStringLiteral	EBCDIC-CP-FI
,	TokenNameCOMMA	
"CP278"	TokenNameStringLiteral	CP278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-SE"	TokenNameStringLiteral	EBCDIC-CP-SE
,	TokenNameCOMMA	
"CP278"	TokenNameStringLiteral	CP278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM280"	TokenNameStringLiteral	IBM280
,	TokenNameCOMMA	
"CP280"	TokenNameStringLiteral	CP280
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP280"	TokenNameStringLiteral	CP280
,	TokenNameCOMMA	
"CP280"	TokenNameStringLiteral	CP280
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM280"	TokenNameStringLiteral	CSIBM280
,	TokenNameCOMMA	
"CP280"	TokenNameStringLiteral	CP280
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-IT"	TokenNameStringLiteral	EBCDIC-CP-IT
,	TokenNameCOMMA	
"CP280"	TokenNameStringLiteral	CP280
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM284"	TokenNameStringLiteral	IBM284
,	TokenNameCOMMA	
"CP284"	TokenNameStringLiteral	CP284
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP284"	TokenNameStringLiteral	CP284
,	TokenNameCOMMA	
"CP284"	TokenNameStringLiteral	CP284
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM284"	TokenNameStringLiteral	CSIBM284
,	TokenNameCOMMA	
"CP284"	TokenNameStringLiteral	CP284
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-ES"	TokenNameStringLiteral	EBCDIC-CP-ES
,	TokenNameCOMMA	
"CP284"	TokenNameStringLiteral	CP284
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-GB"	TokenNameStringLiteral	EBCDIC-CP-GB
,	TokenNameCOMMA	
"CP285"	TokenNameStringLiteral	CP285
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM285"	TokenNameStringLiteral	IBM285
,	TokenNameCOMMA	
"CP285"	TokenNameStringLiteral	CP285
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP285"	TokenNameStringLiteral	CP285
,	TokenNameCOMMA	
"CP285"	TokenNameStringLiteral	CP285
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM285"	TokenNameStringLiteral	CSIBM285
,	TokenNameCOMMA	
"CP285"	TokenNameStringLiteral	CP285
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-JP-KANA"	TokenNameStringLiteral	EBCDIC-JP-KANA
,	TokenNameCOMMA	
"CP290"	TokenNameStringLiteral	CP290
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM290"	TokenNameStringLiteral	IBM290
,	TokenNameCOMMA	
"CP290"	TokenNameStringLiteral	CP290
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP290"	TokenNameStringLiteral	CP290
,	TokenNameCOMMA	
"CP290"	TokenNameStringLiteral	CP290
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM290"	TokenNameStringLiteral	CSIBM290
,	TokenNameCOMMA	
"CP290"	TokenNameStringLiteral	CP290
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-FR"	TokenNameStringLiteral	EBCDIC-CP-FR
,	TokenNameCOMMA	
"CP297"	TokenNameStringLiteral	CP297
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM297"	TokenNameStringLiteral	IBM297
,	TokenNameCOMMA	
"CP297"	TokenNameStringLiteral	CP297
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP297"	TokenNameStringLiteral	CP297
,	TokenNameCOMMA	
"CP297"	TokenNameStringLiteral	CP297
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM297"	TokenNameStringLiteral	CSIBM297
,	TokenNameCOMMA	
"CP297"	TokenNameStringLiteral	CP297
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-AR1"	TokenNameStringLiteral	EBCDIC-CP-AR1
,	TokenNameCOMMA	
"CP420"	TokenNameStringLiteral	CP420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM420"	TokenNameStringLiteral	IBM420
,	TokenNameCOMMA	
"CP420"	TokenNameStringLiteral	CP420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP420"	TokenNameStringLiteral	CP420
,	TokenNameCOMMA	
"CP420"	TokenNameStringLiteral	CP420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM420"	TokenNameStringLiteral	CSIBM420
,	TokenNameCOMMA	
"CP420"	TokenNameStringLiteral	CP420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-HE"	TokenNameStringLiteral	EBCDIC-CP-HE
,	TokenNameCOMMA	
"CP424"	TokenNameStringLiteral	CP424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM424"	TokenNameStringLiteral	IBM424
,	TokenNameCOMMA	
"CP424"	TokenNameStringLiteral	CP424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP424"	TokenNameStringLiteral	CP424
,	TokenNameCOMMA	
"CP424"	TokenNameStringLiteral	CP424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM424"	TokenNameStringLiteral	CSIBM424
,	TokenNameCOMMA	
"CP424"	TokenNameStringLiteral	CP424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM437"	TokenNameStringLiteral	IBM437
,	TokenNameCOMMA	
"CP437"	TokenNameStringLiteral	CP437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"437"	TokenNameStringLiteral	437
,	TokenNameCOMMA	
"CP437"	TokenNameStringLiteral	CP437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP437"	TokenNameStringLiteral	CP437
,	TokenNameCOMMA	
"CP437"	TokenNameStringLiteral	CP437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSPC8CODEPAGE437"	TokenNameStringLiteral	CSPC8CODEPAGE437
,	TokenNameCOMMA	
"CP437"	TokenNameStringLiteral	CP437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-CH"	TokenNameStringLiteral	EBCDIC-CP-CH
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM500"	TokenNameStringLiteral	IBM500
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP500"	TokenNameStringLiteral	CP500
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM500"	TokenNameStringLiteral	CSIBM500
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-CH"	TokenNameStringLiteral	EBCDIC-CP-CH
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-BE"	TokenNameStringLiteral	EBCDIC-CP-BE
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM775"	TokenNameStringLiteral	IBM775
,	TokenNameCOMMA	
"CP775"	TokenNameStringLiteral	CP775
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP775"	TokenNameStringLiteral	CP775
,	TokenNameCOMMA	
"CP775"	TokenNameStringLiteral	CP775
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSPC775BALTIC"	TokenNameStringLiteral	CSPC775BALTIC
,	TokenNameCOMMA	
"CP775"	TokenNameStringLiteral	CP775
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM850"	TokenNameStringLiteral	IBM850
,	TokenNameCOMMA	
"CP850"	TokenNameStringLiteral	CP850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"850"	TokenNameStringLiteral	850
,	TokenNameCOMMA	
"CP850"	TokenNameStringLiteral	CP850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP850"	TokenNameStringLiteral	CP850
,	TokenNameCOMMA	
"CP850"	TokenNameStringLiteral	CP850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSPC850MULTILINGUAL"	TokenNameStringLiteral	CSPC850MULTILINGUAL
,	TokenNameCOMMA	
"CP850"	TokenNameStringLiteral	CP850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM852"	TokenNameStringLiteral	IBM852
,	TokenNameCOMMA	
"CP852"	TokenNameStringLiteral	CP852
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"852"	TokenNameStringLiteral	852
,	TokenNameCOMMA	
"CP852"	TokenNameStringLiteral	CP852
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP852"	TokenNameStringLiteral	CP852
,	TokenNameCOMMA	
"CP852"	TokenNameStringLiteral	CP852
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSPCP852"	TokenNameStringLiteral	CSPCP852
,	TokenNameCOMMA	
"CP852"	TokenNameStringLiteral	CP852
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM855"	TokenNameStringLiteral	IBM855
,	TokenNameCOMMA	
"CP855"	TokenNameStringLiteral	CP855
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"855"	TokenNameStringLiteral	855
,	TokenNameCOMMA	
"CP855"	TokenNameStringLiteral	CP855
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP855"	TokenNameStringLiteral	CP855
,	TokenNameCOMMA	
"CP855"	TokenNameStringLiteral	CP855
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM855"	TokenNameStringLiteral	CSIBM855
,	TokenNameCOMMA	
"CP855"	TokenNameStringLiteral	CP855
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM857"	TokenNameStringLiteral	IBM857
,	TokenNameCOMMA	
"CP857"	TokenNameStringLiteral	CP857
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"857"	TokenNameStringLiteral	857
,	TokenNameCOMMA	
"CP857"	TokenNameStringLiteral	CP857
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP857"	TokenNameStringLiteral	CP857
,	TokenNameCOMMA	
"CP857"	TokenNameStringLiteral	CP857
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM857"	TokenNameStringLiteral	CSIBM857
,	TokenNameCOMMA	
"CP857"	TokenNameStringLiteral	CP857
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM00858"	TokenNameStringLiteral	IBM00858
,	TokenNameCOMMA	
"CP858"	TokenNameStringLiteral	CP858
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP00858"	TokenNameStringLiteral	CP00858
,	TokenNameCOMMA	
"CP858"	TokenNameStringLiteral	CP858
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID00858"	TokenNameStringLiteral	CCSID00858
,	TokenNameCOMMA	
"CP858"	TokenNameStringLiteral	CP858
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM860"	TokenNameStringLiteral	IBM860
,	TokenNameCOMMA	
"CP860"	TokenNameStringLiteral	CP860
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"860"	TokenNameStringLiteral	860
,	TokenNameCOMMA	
"CP860"	TokenNameStringLiteral	CP860
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP860"	TokenNameStringLiteral	CP860
,	TokenNameCOMMA	
"CP860"	TokenNameStringLiteral	CP860
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM860"	TokenNameStringLiteral	CSIBM860
,	TokenNameCOMMA	
"CP860"	TokenNameStringLiteral	CP860
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM861"	TokenNameStringLiteral	IBM861
,	TokenNameCOMMA	
"CP861"	TokenNameStringLiteral	CP861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"861"	TokenNameStringLiteral	861
,	TokenNameCOMMA	
"CP861"	TokenNameStringLiteral	CP861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP861"	TokenNameStringLiteral	CP861
,	TokenNameCOMMA	
"CP861"	TokenNameStringLiteral	CP861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP-IS"	TokenNameStringLiteral	CP-IS
,	TokenNameCOMMA	
"CP861"	TokenNameStringLiteral	CP861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM861"	TokenNameStringLiteral	CSIBM861
,	TokenNameCOMMA	
"CP861"	TokenNameStringLiteral	CP861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM862"	TokenNameStringLiteral	IBM862
,	TokenNameCOMMA	
"CP862"	TokenNameStringLiteral	CP862
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"862"	TokenNameStringLiteral	862
,	TokenNameCOMMA	
"CP862"	TokenNameStringLiteral	CP862
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP862"	TokenNameStringLiteral	CP862
,	TokenNameCOMMA	
"CP862"	TokenNameStringLiteral	CP862
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSPC862LATINHEBREW"	TokenNameStringLiteral	CSPC862LATINHEBREW
,	TokenNameCOMMA	
"CP862"	TokenNameStringLiteral	CP862
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM863"	TokenNameStringLiteral	IBM863
,	TokenNameCOMMA	
"CP863"	TokenNameStringLiteral	CP863
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"863"	TokenNameStringLiteral	863
,	TokenNameCOMMA	
"CP863"	TokenNameStringLiteral	CP863
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP863"	TokenNameStringLiteral	CP863
,	TokenNameCOMMA	
"CP863"	TokenNameStringLiteral	CP863
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM863"	TokenNameStringLiteral	CSIBM863
,	TokenNameCOMMA	
"CP863"	TokenNameStringLiteral	CP863
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM864"	TokenNameStringLiteral	IBM864
,	TokenNameCOMMA	
"CP864"	TokenNameStringLiteral	CP864
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP864"	TokenNameStringLiteral	CP864
,	TokenNameCOMMA	
"CP864"	TokenNameStringLiteral	CP864
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM864"	TokenNameStringLiteral	CSIBM864
,	TokenNameCOMMA	
"CP864"	TokenNameStringLiteral	CP864
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM865"	TokenNameStringLiteral	IBM865
,	TokenNameCOMMA	
"CP865"	TokenNameStringLiteral	CP865
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"865"	TokenNameStringLiteral	865
,	TokenNameCOMMA	
"CP865"	TokenNameStringLiteral	CP865
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP865"	TokenNameStringLiteral	CP865
,	TokenNameCOMMA	
"CP865"	TokenNameStringLiteral	CP865
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM865"	TokenNameStringLiteral	CSIBM865
,	TokenNameCOMMA	
"CP865"	TokenNameStringLiteral	CP865
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM866"	TokenNameStringLiteral	IBM866
,	TokenNameCOMMA	
"CP866"	TokenNameStringLiteral	CP866
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"866"	TokenNameStringLiteral	866
,	TokenNameCOMMA	
"CP866"	TokenNameStringLiteral	CP866
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP866"	TokenNameStringLiteral	CP866
,	TokenNameCOMMA	
"CP866"	TokenNameStringLiteral	CP866
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM866"	TokenNameStringLiteral	CSIBM866
,	TokenNameCOMMA	
"CP866"	TokenNameStringLiteral	CP866
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM868"	TokenNameStringLiteral	IBM868
,	TokenNameCOMMA	
"CP868"	TokenNameStringLiteral	CP868
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP868"	TokenNameStringLiteral	CP868
,	TokenNameCOMMA	
"CP868"	TokenNameStringLiteral	CP868
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM868"	TokenNameStringLiteral	CSIBM868
,	TokenNameCOMMA	
"CP868"	TokenNameStringLiteral	CP868
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP-AR"	TokenNameStringLiteral	CP-AR
,	TokenNameCOMMA	
"CP868"	TokenNameStringLiteral	CP868
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM869"	TokenNameStringLiteral	IBM869
,	TokenNameCOMMA	
"CP869"	TokenNameStringLiteral	CP869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP869"	TokenNameStringLiteral	CP869
,	TokenNameCOMMA	
"CP869"	TokenNameStringLiteral	CP869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM869"	TokenNameStringLiteral	CSIBM869
,	TokenNameCOMMA	
"CP869"	TokenNameStringLiteral	CP869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP-GR"	TokenNameStringLiteral	CP-GR
,	TokenNameCOMMA	
"CP869"	TokenNameStringLiteral	CP869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM870"	TokenNameStringLiteral	IBM870
,	TokenNameCOMMA	
"CP870"	TokenNameStringLiteral	CP870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP870"	TokenNameStringLiteral	CP870
,	TokenNameCOMMA	
"CP870"	TokenNameStringLiteral	CP870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM870"	TokenNameStringLiteral	CSIBM870
,	TokenNameCOMMA	
"CP870"	TokenNameStringLiteral	CP870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-ROECE"	TokenNameStringLiteral	EBCDIC-CP-ROECE
,	TokenNameCOMMA	
"CP870"	TokenNameStringLiteral	CP870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-YU"	TokenNameStringLiteral	EBCDIC-CP-YU
,	TokenNameCOMMA	
"CP870"	TokenNameStringLiteral	CP870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM871"	TokenNameStringLiteral	IBM871
,	TokenNameCOMMA	
"CP871"	TokenNameStringLiteral	CP871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP871"	TokenNameStringLiteral	CP871
,	TokenNameCOMMA	
"CP871"	TokenNameStringLiteral	CP871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM871"	TokenNameStringLiteral	CSIBM871
,	TokenNameCOMMA	
"CP871"	TokenNameStringLiteral	CP871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-IS"	TokenNameStringLiteral	EBCDIC-CP-IS
,	TokenNameCOMMA	
"CP871"	TokenNameStringLiteral	CP871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM918"	TokenNameStringLiteral	IBM918
,	TokenNameCOMMA	
"CP918"	TokenNameStringLiteral	CP918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP918"	TokenNameStringLiteral	CP918
,	TokenNameCOMMA	
"CP918"	TokenNameStringLiteral	CP918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM918"	TokenNameStringLiteral	CSIBM918
,	TokenNameCOMMA	
"CP918"	TokenNameStringLiteral	CP918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-CP-AR2"	TokenNameStringLiteral	EBCDIC-CP-AR2
,	TokenNameCOMMA	
"CP918"	TokenNameStringLiteral	CP918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM00924"	TokenNameStringLiteral	IBM00924
,	TokenNameCOMMA	
"CP924"	TokenNameStringLiteral	CP924
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP00924"	TokenNameStringLiteral	CP00924
,	TokenNameCOMMA	
"CP924"	TokenNameStringLiteral	CP924
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID00924"	TokenNameStringLiteral	CCSID00924
,	TokenNameCOMMA	
"CP924"	TokenNameStringLiteral	CP924
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is this an error??? 	TokenNameCOMMENT_LINE	is this an error??? 
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EBCDIC-LATIN9--EURO"	TokenNameStringLiteral	EBCDIC-LATIN9--EURO
,	TokenNameCOMMA	
"CP924"	TokenNameStringLiteral	CP924
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM1026"	TokenNameStringLiteral	IBM1026
,	TokenNameCOMMA	
"CP1026"	TokenNameStringLiteral	CP1026
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1026"	TokenNameStringLiteral	CP1026
,	TokenNameCOMMA	
"CP1026"	TokenNameStringLiteral	CP1026
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSIBM1026"	TokenNameStringLiteral	CSIBM1026
,	TokenNameCOMMA	
"CP1026"	TokenNameStringLiteral	CP1026
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01140"	TokenNameStringLiteral	IBM01140
,	TokenNameCOMMA	
"Cp1140"	TokenNameStringLiteral	Cp1140
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01140"	TokenNameStringLiteral	CP01140
,	TokenNameCOMMA	
"Cp1140"	TokenNameStringLiteral	Cp1140
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01140"	TokenNameStringLiteral	CCSID01140
,	TokenNameCOMMA	
"Cp1140"	TokenNameStringLiteral	Cp1140
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01141"	TokenNameStringLiteral	IBM01141
,	TokenNameCOMMA	
"Cp1141"	TokenNameStringLiteral	Cp1141
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01141"	TokenNameStringLiteral	CP01141
,	TokenNameCOMMA	
"Cp1141"	TokenNameStringLiteral	Cp1141
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01141"	TokenNameStringLiteral	CCSID01141
,	TokenNameCOMMA	
"Cp1141"	TokenNameStringLiteral	Cp1141
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01142"	TokenNameStringLiteral	IBM01142
,	TokenNameCOMMA	
"Cp1142"	TokenNameStringLiteral	Cp1142
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01142"	TokenNameStringLiteral	CP01142
,	TokenNameCOMMA	
"Cp1142"	TokenNameStringLiteral	Cp1142
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01142"	TokenNameStringLiteral	CCSID01142
,	TokenNameCOMMA	
"Cp1142"	TokenNameStringLiteral	Cp1142
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01143"	TokenNameStringLiteral	IBM01143
,	TokenNameCOMMA	
"Cp1143"	TokenNameStringLiteral	Cp1143
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01143"	TokenNameStringLiteral	CP01143
,	TokenNameCOMMA	
"Cp1143"	TokenNameStringLiteral	Cp1143
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01143"	TokenNameStringLiteral	CCSID01143
,	TokenNameCOMMA	
"Cp1143"	TokenNameStringLiteral	Cp1143
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01144"	TokenNameStringLiteral	IBM01144
,	TokenNameCOMMA	
"Cp1144"	TokenNameStringLiteral	Cp1144
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01144"	TokenNameStringLiteral	CP01144
,	TokenNameCOMMA	
"Cp1144"	TokenNameStringLiteral	Cp1144
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01144"	TokenNameStringLiteral	CCSID01144
,	TokenNameCOMMA	
"Cp1144"	TokenNameStringLiteral	Cp1144
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01145"	TokenNameStringLiteral	IBM01145
,	TokenNameCOMMA	
"Cp1145"	TokenNameStringLiteral	Cp1145
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01145"	TokenNameStringLiteral	CP01145
,	TokenNameCOMMA	
"Cp1145"	TokenNameStringLiteral	Cp1145
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01145"	TokenNameStringLiteral	CCSID01145
,	TokenNameCOMMA	
"Cp1145"	TokenNameStringLiteral	Cp1145
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01146"	TokenNameStringLiteral	IBM01146
,	TokenNameCOMMA	
"Cp1146"	TokenNameStringLiteral	Cp1146
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01146"	TokenNameStringLiteral	CP01146
,	TokenNameCOMMA	
"Cp1146"	TokenNameStringLiteral	Cp1146
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01146"	TokenNameStringLiteral	CCSID01146
,	TokenNameCOMMA	
"Cp1146"	TokenNameStringLiteral	Cp1146
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01147"	TokenNameStringLiteral	IBM01147
,	TokenNameCOMMA	
"Cp1147"	TokenNameStringLiteral	Cp1147
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01147"	TokenNameStringLiteral	CP01147
,	TokenNameCOMMA	
"Cp1147"	TokenNameStringLiteral	Cp1147
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01147"	TokenNameStringLiteral	CCSID01147
,	TokenNameCOMMA	
"Cp1147"	TokenNameStringLiteral	Cp1147
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01148"	TokenNameStringLiteral	IBM01148
,	TokenNameCOMMA	
"Cp1148"	TokenNameStringLiteral	Cp1148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01148"	TokenNameStringLiteral	CP01148
,	TokenNameCOMMA	
"Cp1148"	TokenNameStringLiteral	Cp1148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01148"	TokenNameStringLiteral	CCSID01148
,	TokenNameCOMMA	
"Cp1148"	TokenNameStringLiteral	Cp1148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM01149"	TokenNameStringLiteral	IBM01149
,	TokenNameCOMMA	
"Cp1149"	TokenNameStringLiteral	Cp1149
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP01149"	TokenNameStringLiteral	CP01149
,	TokenNameCOMMA	
"Cp1149"	TokenNameStringLiteral	Cp1149
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CCSID01149"	TokenNameStringLiteral	CCSID01149
,	TokenNameCOMMA	
"Cp1149"	TokenNameStringLiteral	Cp1149
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EUC-JP"	TokenNameStringLiteral	EUC-JP
,	TokenNameCOMMA	
"EUCJIS"	TokenNameStringLiteral	EUCJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSEUCPKDFMTJAPANESE"	TokenNameStringLiteral	CSEUCPKDFMTJAPANESE
,	TokenNameCOMMA	
"EUCJIS"	TokenNameStringLiteral	EUCJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EXTENDED_UNIX_CODE_PACKED_FORMAT_FOR_JAPANESE"	TokenNameStringLiteral	EXTENDED_UNIX_CODE_PACKED_FORMAT_FOR_JAPANESE
,	TokenNameCOMMA	
"EUCJIS"	TokenNameStringLiteral	EUCJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EUC-KR"	TokenNameStringLiteral	EUC-KR
,	TokenNameCOMMA	
"KSC5601"	TokenNameStringLiteral	KSC5601
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSEUCKR"	TokenNameStringLiteral	CSEUCKR
,	TokenNameCOMMA	
"KSC5601"	TokenNameStringLiteral	KSC5601
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-149"	TokenNameStringLiteral	ISO-IR-149
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KS_C_5601-1989"	TokenNameStringLiteral	KS_C_5601-1989
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KSC_5601"	TokenNameStringLiteral	KSC_5601
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KOREAN"	TokenNameStringLiteral	KOREAN
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSKSC56011987"	TokenNameStringLiteral	CSKSC56011987
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GB2312"	TokenNameStringLiteral	GB2312
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSGB2312"	TokenNameStringLiteral	CSGB2312
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-2022-JP"	TokenNameStringLiteral	ISO-2022-JP
,	TokenNameCOMMA	
"JIS"	TokenNameStringLiteral	JIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISO2022JP"	TokenNameStringLiteral	CSISO2022JP
,	TokenNameCOMMA	
"JIS"	TokenNameStringLiteral	JIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-2022-KR"	TokenNameStringLiteral	ISO-2022-KR
,	TokenNameCOMMA	
"ISO2022KR"	TokenNameStringLiteral	ISO2022KR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISO2022KR"	TokenNameStringLiteral	CSISO2022KR
,	TokenNameCOMMA	
"ISO2022KR"	TokenNameStringLiteral	ISO2022KR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-2022-CN"	TokenNameStringLiteral	ISO-2022-CN
,	TokenNameCOMMA	
"ISO2022CN"	TokenNameStringLiteral	ISO2022CN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"X0201"	TokenNameStringLiteral	X0201
,	TokenNameCOMMA	
"JIS0201"	TokenNameStringLiteral	JIS0201
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISO13JISC6220JP"	TokenNameStringLiteral	CSISO13JISC6220JP
,	TokenNameCOMMA	
"JIS0201"	TokenNameStringLiteral	JIS0201
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"X0208"	TokenNameStringLiteral	X0208
,	TokenNameCOMMA	
"JIS0208"	TokenNameStringLiteral	JIS0208
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-87"	TokenNameStringLiteral	ISO-IR-87
,	TokenNameCOMMA	
"JIS0208"	TokenNameStringLiteral	JIS0208
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"X0208dbiJIS_X0208-1983"	TokenNameStringLiteral	X0208dbiJIS_X0208-1983
,	TokenNameCOMMA	
"JIS0208"	TokenNameStringLiteral	JIS0208
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISO87JISX0208"	TokenNameStringLiteral	CSISO87JISX0208
,	TokenNameCOMMA	
"JIS0208"	TokenNameStringLiteral	JIS0208
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"X0212"	TokenNameStringLiteral	X0212
,	TokenNameCOMMA	
"JIS0212"	TokenNameStringLiteral	JIS0212
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-159"	TokenNameStringLiteral	ISO-IR-159
,	TokenNameCOMMA	
"JIS0212"	TokenNameStringLiteral	JIS0212
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISO159JISX02121990"	TokenNameStringLiteral	CSISO159JISX02121990
,	TokenNameCOMMA	
"JIS0212"	TokenNameStringLiteral	JIS0212
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GB18030"	TokenNameStringLiteral	GB18030
,	TokenNameCOMMA	
"GB18030"	TokenNameStringLiteral	GB18030
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GBK"	TokenNameStringLiteral	GBK
,	TokenNameCOMMA	
"GBK"	TokenNameStringLiteral	GBK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP936"	TokenNameStringLiteral	CP936
,	TokenNameCOMMA	
"GBK"	TokenNameStringLiteral	GBK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"MS936"	TokenNameStringLiteral	MS936
,	TokenNameCOMMA	
"GBK"	TokenNameStringLiteral	GBK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-936"	TokenNameStringLiteral	WINDOWS-936
,	TokenNameCOMMA	
"GBK"	TokenNameStringLiteral	GBK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SHIFT_JIS"	TokenNameStringLiteral	SHIFT_JIS
,	TokenNameCOMMA	
"SJIS"	TokenNameStringLiteral	SJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSSHIFTJIS"	TokenNameStringLiteral	CSSHIFTJIS
,	TokenNameCOMMA	
"SJIS"	TokenNameStringLiteral	SJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"MS_KANJI"	TokenNameStringLiteral	MS_KANJI
,	TokenNameCOMMA	
"SJIS"	TokenNameStringLiteral	SJIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-31J"	TokenNameStringLiteral	WINDOWS-31J
,	TokenNameCOMMA	
"MS932"	TokenNameStringLiteral	MS932
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSWINDOWS31J"	TokenNameStringLiteral	CSWINDOWS31J
,	TokenNameCOMMA	
"MS932"	TokenNameStringLiteral	MS932
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add support for Cp1252 and its friends 	TokenNameCOMMENT_LINE	Add support for Cp1252 and its friends 
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1250"	TokenNameStringLiteral	WINDOWS-1250
,	TokenNameCOMMA	
"Cp1250"	TokenNameStringLiteral	Cp1250
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1251"	TokenNameStringLiteral	WINDOWS-1251
,	TokenNameCOMMA	
"Cp1251"	TokenNameStringLiteral	Cp1251
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1252"	TokenNameStringLiteral	WINDOWS-1252
,	TokenNameCOMMA	
"Cp1252"	TokenNameStringLiteral	Cp1252
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1253"	TokenNameStringLiteral	WINDOWS-1253
,	TokenNameCOMMA	
"Cp1253"	TokenNameStringLiteral	Cp1253
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1254"	TokenNameStringLiteral	WINDOWS-1254
,	TokenNameCOMMA	
"Cp1254"	TokenNameStringLiteral	Cp1254
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1255"	TokenNameStringLiteral	WINDOWS-1255
,	TokenNameCOMMA	
"Cp1255"	TokenNameStringLiteral	Cp1255
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1256"	TokenNameStringLiteral	WINDOWS-1256
,	TokenNameCOMMA	
"Cp1256"	TokenNameStringLiteral	Cp1256
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1257"	TokenNameStringLiteral	WINDOWS-1257
,	TokenNameCOMMA	
"Cp1257"	TokenNameStringLiteral	Cp1257
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"WINDOWS-1258"	TokenNameStringLiteral	WINDOWS-1258
,	TokenNameCOMMA	
"Cp1258"	TokenNameStringLiteral	Cp1258
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TIS-620"	TokenNameStringLiteral	TIS-620
,	TokenNameCOMMA	
"TIS620"	TokenNameStringLiteral	TIS620
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-100"	TokenNameStringLiteral	ISO-IR-100
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-1"	TokenNameStringLiteral	ISO_8859-1
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LATIN1"	TokenNameStringLiteral	LATIN1
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATIN1"	TokenNameStringLiteral	CSISOLATIN1
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"L1"	TokenNameStringLiteral	L1
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM819"	TokenNameStringLiteral	IBM819
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP819"	TokenNameStringLiteral	CP819
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-2"	TokenNameStringLiteral	ISO-8859-2
,	TokenNameCOMMA	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-101"	TokenNameStringLiteral	ISO-IR-101
,	TokenNameCOMMA	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-2"	TokenNameStringLiteral	ISO_8859-2
,	TokenNameCOMMA	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LATIN2"	TokenNameStringLiteral	LATIN2
,	TokenNameCOMMA	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATIN2"	TokenNameStringLiteral	CSISOLATIN2
,	TokenNameCOMMA	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"L2"	TokenNameStringLiteral	L2
,	TokenNameCOMMA	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-3"	TokenNameStringLiteral	ISO-8859-3
,	TokenNameCOMMA	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-109"	TokenNameStringLiteral	ISO-IR-109
,	TokenNameCOMMA	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-3"	TokenNameStringLiteral	ISO_8859-3
,	TokenNameCOMMA	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LATIN3"	TokenNameStringLiteral	LATIN3
,	TokenNameCOMMA	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATIN3"	TokenNameStringLiteral	CSISOLATIN3
,	TokenNameCOMMA	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"L3"	TokenNameStringLiteral	L3
,	TokenNameCOMMA	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-4"	TokenNameStringLiteral	ISO-8859-4
,	TokenNameCOMMA	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-110"	TokenNameStringLiteral	ISO-IR-110
,	TokenNameCOMMA	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-4"	TokenNameStringLiteral	ISO_8859-4
,	TokenNameCOMMA	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LATIN4"	TokenNameStringLiteral	LATIN4
,	TokenNameCOMMA	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATIN4"	TokenNameStringLiteral	CSISOLATIN4
,	TokenNameCOMMA	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"L4"	TokenNameStringLiteral	L4
,	TokenNameCOMMA	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-5"	TokenNameStringLiteral	ISO-8859-5
,	TokenNameCOMMA	
"ISO8859_5"	TokenNameStringLiteral	ISO8859_5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-144"	TokenNameStringLiteral	ISO-IR-144
,	TokenNameCOMMA	
"ISO8859_5"	TokenNameStringLiteral	ISO8859_5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-5"	TokenNameStringLiteral	ISO_8859-5
,	TokenNameCOMMA	
"ISO8859_5"	TokenNameStringLiteral	ISO8859_5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CYRILLIC"	TokenNameStringLiteral	CYRILLIC
,	TokenNameCOMMA	
"ISO8859_5"	TokenNameStringLiteral	ISO8859_5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATINCYRILLIC"	TokenNameStringLiteral	CSISOLATINCYRILLIC
,	TokenNameCOMMA	
"ISO8859_5"	TokenNameStringLiteral	ISO8859_5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-6"	TokenNameStringLiteral	ISO-8859-6
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-127"	TokenNameStringLiteral	ISO-IR-127
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-6"	TokenNameStringLiteral	ISO_8859-6
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ECMA-114"	TokenNameStringLiteral	ECMA-114
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ASMO-708"	TokenNameStringLiteral	ASMO-708
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ARABIC"	TokenNameStringLiteral	ARABIC
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATINARABIC"	TokenNameStringLiteral	CSISOLATINARABIC
,	TokenNameCOMMA	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-7"	TokenNameStringLiteral	ISO-8859-7
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-126"	TokenNameStringLiteral	ISO-IR-126
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-7"	TokenNameStringLiteral	ISO_8859-7
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ELOT_928"	TokenNameStringLiteral	ELOT_928
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ECMA-118"	TokenNameStringLiteral	ECMA-118
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GREEK"	TokenNameStringLiteral	GREEK
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATINGREEK"	TokenNameStringLiteral	CSISOLATINGREEK
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GREEK8"	TokenNameStringLiteral	GREEK8
,	TokenNameCOMMA	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-8"	TokenNameStringLiteral	ISO-8859-8
,	TokenNameCOMMA	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-8-I"	TokenNameStringLiteral	ISO-8859-8-I
,	TokenNameCOMMA	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// added since this encoding only differs w.r.t. presentation 	TokenNameCOMMENT_LINE	added since this encoding only differs w.r.t. presentation 
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-138"	TokenNameStringLiteral	ISO-IR-138
,	TokenNameCOMMA	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-8"	TokenNameStringLiteral	ISO_8859-8
,	TokenNameCOMMA	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"HEBREW"	TokenNameStringLiteral	HEBREW
,	TokenNameCOMMA	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATINHEBREW"	TokenNameStringLiteral	CSISOLATINHEBREW
,	TokenNameCOMMA	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-9"	TokenNameStringLiteral	ISO-8859-9
,	TokenNameCOMMA	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-148"	TokenNameStringLiteral	ISO-IR-148
,	TokenNameCOMMA	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-9"	TokenNameStringLiteral	ISO_8859-9
,	TokenNameCOMMA	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LATIN5"	TokenNameStringLiteral	LATIN5
,	TokenNameCOMMA	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSISOLATIN5"	TokenNameStringLiteral	CSISOLATIN5
,	TokenNameCOMMA	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"L5"	TokenNameStringLiteral	L5
,	TokenNameCOMMA	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-13"	TokenNameStringLiteral	ISO-8859-13
,	TokenNameCOMMA	
"ISO8859_13"	TokenNameStringLiteral	ISO8859_13
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-8859-15"	TokenNameStringLiteral	ISO-8859-15
,	TokenNameCOMMA	
"ISO8859_15_FDIS"	TokenNameStringLiteral	ISO8859_15_FDIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_8859-15"	TokenNameStringLiteral	ISO_8859-15
,	TokenNameCOMMA	
"ISO8859_15_FDIS"	TokenNameStringLiteral	ISO8859_15_FDIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"LATIN-9"	TokenNameStringLiteral	LATIN-9
,	TokenNameCOMMA	
"ISO8859_15_FDIS"	TokenNameStringLiteral	ISO8859_15_FDIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KOI8-R"	TokenNameStringLiteral	KOI8-R
,	TokenNameCOMMA	
"KOI8_R"	TokenNameStringLiteral	KOI8_R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSKOI8R"	TokenNameStringLiteral	CSKOI8R
,	TokenNameCOMMA	
"KOI8_R"	TokenNameStringLiteral	KOI8_R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO-IR-6"	TokenNameStringLiteral	ISO-IR-6
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ANSI_X3.4-1968"	TokenNameStringLiteral	ANSI_X3.4-1968
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ANSI_X3.4-1986"	TokenNameStringLiteral	ANSI_X3.4-1986
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO_646.IRV:1991"	TokenNameStringLiteral	ISO_646.IRV:1991
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ASCII"	TokenNameStringLiteral	ASCII
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CSASCII"	TokenNameStringLiteral	CSASCII
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO646-US"	TokenNameStringLiteral	ISO646-US
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"US"	TokenNameStringLiteral	US
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM367"	TokenNameStringLiteral	IBM367
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP367"	TokenNameStringLiteral	CP367
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
,	TokenNameCOMMA	
"UTF8"	TokenNameStringLiteral	UTF8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-16"	TokenNameStringLiteral	UTF-16
,	TokenNameCOMMA	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-16BE"	TokenNameStringLiteral	UTF-16BE
,	TokenNameCOMMA	
"UnicodeBig"	TokenNameStringLiteral	UnicodeBig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF-16LE"	TokenNameStringLiteral	UTF-16LE
,	TokenNameCOMMA	
"UnicodeLittle"	TokenNameStringLiteral	UnicodeLittle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// support for 1047, as proposed to be added to the 	TokenNameCOMMENT_LINE	support for 1047, as proposed to be added to the 
// IANA registry in 	TokenNameCOMMENT_LINE	IANA registry in 
// http://lists.w3.org/Archives/Public/ietf-charset/2002JulSep/0049.html 	TokenNameCOMMENT_LINE	http://lists.w3.org/Archives/Public/ietf-charset/2002JulSep/0049.html 
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1047"	TokenNameStringLiteral	IBM-1047
,	TokenNameCOMMA	
"Cp1047"	TokenNameStringLiteral	Cp1047
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM1047"	TokenNameStringLiteral	IBM1047
,	TokenNameCOMMA	
"Cp1047"	TokenNameStringLiteral	Cp1047
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1047"	TokenNameStringLiteral	CP1047
,	TokenNameCOMMA	
"Cp1047"	TokenNameStringLiteral	Cp1047
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adding new aliases as proposed in 	TokenNameCOMMENT_LINE	Adding new aliases as proposed in 
// http://lists.w3.org/Archives/Public/ietf-charset/2002JulSep/0058.html 	TokenNameCOMMENT_LINE	http://lists.w3.org/Archives/Public/ietf-charset/2002JulSep/0058.html 
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-37"	TokenNameStringLiteral	IBM-37
,	TokenNameCOMMA	
"CP037"	TokenNameStringLiteral	CP037
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-273"	TokenNameStringLiteral	IBM-273
,	TokenNameCOMMA	
"CP273"	TokenNameStringLiteral	CP273
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-277"	TokenNameStringLiteral	IBM-277
,	TokenNameCOMMA	
"CP277"	TokenNameStringLiteral	CP277
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-278"	TokenNameStringLiteral	IBM-278
,	TokenNameCOMMA	
"CP278"	TokenNameStringLiteral	CP278
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-280"	TokenNameStringLiteral	IBM-280
,	TokenNameCOMMA	
"CP280"	TokenNameStringLiteral	CP280
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-284"	TokenNameStringLiteral	IBM-284
,	TokenNameCOMMA	
"CP284"	TokenNameStringLiteral	CP284
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-285"	TokenNameStringLiteral	IBM-285
,	TokenNameCOMMA	
"CP285"	TokenNameStringLiteral	CP285
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-290"	TokenNameStringLiteral	IBM-290
,	TokenNameCOMMA	
"CP290"	TokenNameStringLiteral	CP290
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-297"	TokenNameStringLiteral	IBM-297
,	TokenNameCOMMA	
"CP297"	TokenNameStringLiteral	CP297
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-420"	TokenNameStringLiteral	IBM-420
,	TokenNameCOMMA	
"CP420"	TokenNameStringLiteral	CP420
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-424"	TokenNameStringLiteral	IBM-424
,	TokenNameCOMMA	
"CP424"	TokenNameStringLiteral	CP424
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-437"	TokenNameStringLiteral	IBM-437
,	TokenNameCOMMA	
"CP437"	TokenNameStringLiteral	CP437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-500"	TokenNameStringLiteral	IBM-500
,	TokenNameCOMMA	
"CP500"	TokenNameStringLiteral	CP500
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-775"	TokenNameStringLiteral	IBM-775
,	TokenNameCOMMA	
"CP775"	TokenNameStringLiteral	CP775
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-850"	TokenNameStringLiteral	IBM-850
,	TokenNameCOMMA	
"CP850"	TokenNameStringLiteral	CP850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-852"	TokenNameStringLiteral	IBM-852
,	TokenNameCOMMA	
"CP852"	TokenNameStringLiteral	CP852
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-855"	TokenNameStringLiteral	IBM-855
,	TokenNameCOMMA	
"CP855"	TokenNameStringLiteral	CP855
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-857"	TokenNameStringLiteral	IBM-857
,	TokenNameCOMMA	
"CP857"	TokenNameStringLiteral	CP857
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-858"	TokenNameStringLiteral	IBM-858
,	TokenNameCOMMA	
"CP858"	TokenNameStringLiteral	CP858
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-860"	TokenNameStringLiteral	IBM-860
,	TokenNameCOMMA	
"CP860"	TokenNameStringLiteral	CP860
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-861"	TokenNameStringLiteral	IBM-861
,	TokenNameCOMMA	
"CP861"	TokenNameStringLiteral	CP861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-862"	TokenNameStringLiteral	IBM-862
,	TokenNameCOMMA	
"CP862"	TokenNameStringLiteral	CP862
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-863"	TokenNameStringLiteral	IBM-863
,	TokenNameCOMMA	
"CP863"	TokenNameStringLiteral	CP863
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-864"	TokenNameStringLiteral	IBM-864
,	TokenNameCOMMA	
"CP864"	TokenNameStringLiteral	CP864
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-865"	TokenNameStringLiteral	IBM-865
,	TokenNameCOMMA	
"CP865"	TokenNameStringLiteral	CP865
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-866"	TokenNameStringLiteral	IBM-866
,	TokenNameCOMMA	
"CP866"	TokenNameStringLiteral	CP866
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-868"	TokenNameStringLiteral	IBM-868
,	TokenNameCOMMA	
"CP868"	TokenNameStringLiteral	CP868
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-869"	TokenNameStringLiteral	IBM-869
,	TokenNameCOMMA	
"CP869"	TokenNameStringLiteral	CP869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-870"	TokenNameStringLiteral	IBM-870
,	TokenNameCOMMA	
"CP870"	TokenNameStringLiteral	CP870
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-871"	TokenNameStringLiteral	IBM-871
,	TokenNameCOMMA	
"CP871"	TokenNameStringLiteral	CP871
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-918"	TokenNameStringLiteral	IBM-918
,	TokenNameCOMMA	
"CP918"	TokenNameStringLiteral	CP918
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-924"	TokenNameStringLiteral	IBM-924
,	TokenNameCOMMA	
"CP924"	TokenNameStringLiteral	CP924
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1026"	TokenNameStringLiteral	IBM-1026
,	TokenNameCOMMA	
"CP1026"	TokenNameStringLiteral	CP1026
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1140"	TokenNameStringLiteral	IBM-1140
,	TokenNameCOMMA	
"Cp1140"	TokenNameStringLiteral	Cp1140
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1141"	TokenNameStringLiteral	IBM-1141
,	TokenNameCOMMA	
"Cp1141"	TokenNameStringLiteral	Cp1141
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1142"	TokenNameStringLiteral	IBM-1142
,	TokenNameCOMMA	
"Cp1142"	TokenNameStringLiteral	Cp1142
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1143"	TokenNameStringLiteral	IBM-1143
,	TokenNameCOMMA	
"Cp1143"	TokenNameStringLiteral	Cp1143
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1144"	TokenNameStringLiteral	IBM-1144
,	TokenNameCOMMA	
"Cp1144"	TokenNameStringLiteral	Cp1144
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1145"	TokenNameStringLiteral	IBM-1145
,	TokenNameCOMMA	
"Cp1145"	TokenNameStringLiteral	Cp1145
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1146"	TokenNameStringLiteral	IBM-1146
,	TokenNameCOMMA	
"Cp1146"	TokenNameStringLiteral	Cp1146
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1147"	TokenNameStringLiteral	IBM-1147
,	TokenNameCOMMA	
"Cp1147"	TokenNameStringLiteral	Cp1147
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1148"	TokenNameStringLiteral	IBM-1148
,	TokenNameCOMMA	
"Cp1148"	TokenNameStringLiteral	Cp1148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-1149"	TokenNameStringLiteral	IBM-1149
,	TokenNameCOMMA	
"Cp1149"	TokenNameStringLiteral	Cp1149
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-819"	TokenNameStringLiteral	IBM-819
,	TokenNameCOMMA	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"IBM-367"	TokenNameStringLiteral	IBM-367
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: 	TokenNameCOMMENT_LINE	REVISIT: 
// j:CNS11643 -> EUC-TW? 	TokenNameCOMMENT_LINE	j:CNS11643 -> EUC-TW? 
// ISO-2022-CN? ISO-2022-CN-EXT? 	TokenNameCOMMENT_LINE	ISO-2022-CN? ISO-2022-CN-EXT? 
// add Java to IANA encoding mappings 	TokenNameCOMMENT_LINE	add Java to IANA encoding mappings 
//fJava2IANAMap.put("8859_1", "US-ASCII"); // ? 	TokenNameCOMMENT_LINE	fJava2IANAMap.put("8859_1", "US-ASCII"); // ? 
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_1"	TokenNameStringLiteral	ISO8859_1
,	TokenNameCOMMA	
"ISO-8859-1"	TokenNameStringLiteral	ISO-8859-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_2"	TokenNameStringLiteral	ISO8859_2
,	TokenNameCOMMA	
"ISO-8859-2"	TokenNameStringLiteral	ISO-8859-2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_3"	TokenNameStringLiteral	ISO8859_3
,	TokenNameCOMMA	
"ISO-8859-3"	TokenNameStringLiteral	ISO-8859-3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_4"	TokenNameStringLiteral	ISO8859_4
,	TokenNameCOMMA	
"ISO-8859-4"	TokenNameStringLiteral	ISO-8859-4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_5"	TokenNameStringLiteral	ISO8859_5
,	TokenNameCOMMA	
"ISO-8859-5"	TokenNameStringLiteral	ISO-8859-5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_6"	TokenNameStringLiteral	ISO8859_6
,	TokenNameCOMMA	
"ISO-8859-6"	TokenNameStringLiteral	ISO-8859-6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_7"	TokenNameStringLiteral	ISO8859_7
,	TokenNameCOMMA	
"ISO-8859-7"	TokenNameStringLiteral	ISO-8859-7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_8"	TokenNameStringLiteral	ISO8859_8
,	TokenNameCOMMA	
"ISO-8859-8"	TokenNameStringLiteral	ISO-8859-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_9"	TokenNameStringLiteral	ISO8859_9
,	TokenNameCOMMA	
"ISO-8859-9"	TokenNameStringLiteral	ISO-8859-9
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_13"	TokenNameStringLiteral	ISO8859_13
,	TokenNameCOMMA	
"ISO-8859-13"	TokenNameStringLiteral	ISO-8859-13
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_15"	TokenNameStringLiteral	ISO8859_15
,	TokenNameCOMMA	
"ISO-8859-15"	TokenNameStringLiteral	ISO-8859-15
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO8859_15_FDIS"	TokenNameStringLiteral	ISO8859_15_FDIS
,	TokenNameCOMMA	
"ISO-8859-15"	TokenNameStringLiteral	ISO-8859-15
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Big5"	TokenNameStringLiteral	Big5
,	TokenNameCOMMA	
"BIG5"	TokenNameStringLiteral	BIG5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP037"	TokenNameStringLiteral	CP037
,	TokenNameCOMMA	
"EBCDIC-CP-US"	TokenNameStringLiteral	EBCDIC-CP-US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP273"	TokenNameStringLiteral	CP273
,	TokenNameCOMMA	
"IBM273"	TokenNameStringLiteral	IBM273
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP277"	TokenNameStringLiteral	CP277
,	TokenNameCOMMA	
"EBCDIC-CP-DK"	TokenNameStringLiteral	EBCDIC-CP-DK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP278"	TokenNameStringLiteral	CP278
,	TokenNameCOMMA	
"EBCDIC-CP-FI"	TokenNameStringLiteral	EBCDIC-CP-FI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP280"	TokenNameStringLiteral	CP280
,	TokenNameCOMMA	
"EBCDIC-CP-IT"	TokenNameStringLiteral	EBCDIC-CP-IT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP284"	TokenNameStringLiteral	CP284
,	TokenNameCOMMA	
"EBCDIC-CP-ES"	TokenNameStringLiteral	EBCDIC-CP-ES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP285"	TokenNameStringLiteral	CP285
,	TokenNameCOMMA	
"EBCDIC-CP-GB"	TokenNameStringLiteral	EBCDIC-CP-GB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP290"	TokenNameStringLiteral	CP290
,	TokenNameCOMMA	
"EBCDIC-JP-KANA"	TokenNameStringLiteral	EBCDIC-JP-KANA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP297"	TokenNameStringLiteral	CP297
,	TokenNameCOMMA	
"EBCDIC-CP-FR"	TokenNameStringLiteral	EBCDIC-CP-FR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP420"	TokenNameStringLiteral	CP420
,	TokenNameCOMMA	
"EBCDIC-CP-AR1"	TokenNameStringLiteral	EBCDIC-CP-AR1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP424"	TokenNameStringLiteral	CP424
,	TokenNameCOMMA	
"EBCDIC-CP-HE"	TokenNameStringLiteral	EBCDIC-CP-HE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP437"	TokenNameStringLiteral	CP437
,	TokenNameCOMMA	
"IBM437"	TokenNameStringLiteral	IBM437
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP500"	TokenNameStringLiteral	CP500
,	TokenNameCOMMA	
"EBCDIC-CP-CH"	TokenNameStringLiteral	EBCDIC-CP-CH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP775"	TokenNameStringLiteral	CP775
,	TokenNameCOMMA	
"IBM775"	TokenNameStringLiteral	IBM775
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP850"	TokenNameStringLiteral	CP850
,	TokenNameCOMMA	
"IBM850"	TokenNameStringLiteral	IBM850
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP852"	TokenNameStringLiteral	CP852
,	TokenNameCOMMA	
"IBM852"	TokenNameStringLiteral	IBM852
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP855"	TokenNameStringLiteral	CP855
,	TokenNameCOMMA	
"IBM855"	TokenNameStringLiteral	IBM855
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP857"	TokenNameStringLiteral	CP857
,	TokenNameCOMMA	
"IBM857"	TokenNameStringLiteral	IBM857
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP858"	TokenNameStringLiteral	CP858
,	TokenNameCOMMA	
"IBM00858"	TokenNameStringLiteral	IBM00858
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP860"	TokenNameStringLiteral	CP860
,	TokenNameCOMMA	
"IBM860"	TokenNameStringLiteral	IBM860
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP861"	TokenNameStringLiteral	CP861
,	TokenNameCOMMA	
"IBM861"	TokenNameStringLiteral	IBM861
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP862"	TokenNameStringLiteral	CP862
,	TokenNameCOMMA	
"IBM862"	TokenNameStringLiteral	IBM862
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP863"	TokenNameStringLiteral	CP863
,	TokenNameCOMMA	
"IBM863"	TokenNameStringLiteral	IBM863
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP864"	TokenNameStringLiteral	CP864
,	TokenNameCOMMA	
"IBM864"	TokenNameStringLiteral	IBM864
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP865"	TokenNameStringLiteral	CP865
,	TokenNameCOMMA	
"IBM865"	TokenNameStringLiteral	IBM865
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP866"	TokenNameStringLiteral	CP866
,	TokenNameCOMMA	
"IBM866"	TokenNameStringLiteral	IBM866
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP868"	TokenNameStringLiteral	CP868
,	TokenNameCOMMA	
"IBM868"	TokenNameStringLiteral	IBM868
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP869"	TokenNameStringLiteral	CP869
,	TokenNameCOMMA	
"IBM869"	TokenNameStringLiteral	IBM869
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP870"	TokenNameStringLiteral	CP870
,	TokenNameCOMMA	
"EBCDIC-CP-ROECE"	TokenNameStringLiteral	EBCDIC-CP-ROECE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP871"	TokenNameStringLiteral	CP871
,	TokenNameCOMMA	
"EBCDIC-CP-IS"	TokenNameStringLiteral	EBCDIC-CP-IS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP918"	TokenNameStringLiteral	CP918
,	TokenNameCOMMA	
"EBCDIC-CP-AR2"	TokenNameStringLiteral	EBCDIC-CP-AR2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP924"	TokenNameStringLiteral	CP924
,	TokenNameCOMMA	
"IBM00924"	TokenNameStringLiteral	IBM00924
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1026"	TokenNameStringLiteral	CP1026
,	TokenNameCOMMA	
"IBM1026"	TokenNameStringLiteral	IBM1026
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1140"	TokenNameStringLiteral	CP1140
,	TokenNameCOMMA	
"IBM01140"	TokenNameStringLiteral	IBM01140
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1141"	TokenNameStringLiteral	CP1141
,	TokenNameCOMMA	
"IBM01141"	TokenNameStringLiteral	IBM01141
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1142"	TokenNameStringLiteral	CP1142
,	TokenNameCOMMA	
"IBM01142"	TokenNameStringLiteral	IBM01142
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1143"	TokenNameStringLiteral	CP1143
,	TokenNameCOMMA	
"IBM01143"	TokenNameStringLiteral	IBM01143
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1144"	TokenNameStringLiteral	CP1144
,	TokenNameCOMMA	
"IBM01144"	TokenNameStringLiteral	IBM01144
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1145"	TokenNameStringLiteral	CP1145
,	TokenNameCOMMA	
"IBM01145"	TokenNameStringLiteral	IBM01145
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1146"	TokenNameStringLiteral	CP1146
,	TokenNameCOMMA	
"IBM01146"	TokenNameStringLiteral	IBM01146
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1147"	TokenNameStringLiteral	CP1147
,	TokenNameCOMMA	
"IBM01147"	TokenNameStringLiteral	IBM01147
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1148"	TokenNameStringLiteral	CP1148
,	TokenNameCOMMA	
"IBM01148"	TokenNameStringLiteral	IBM01148
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1149"	TokenNameStringLiteral	CP1149
,	TokenNameCOMMA	
"IBM01149"	TokenNameStringLiteral	IBM01149
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"EUCJIS"	TokenNameStringLiteral	EUCJIS
,	TokenNameCOMMA	
"EUC-JP"	TokenNameStringLiteral	EUC-JP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
,	TokenNameCOMMA	
"KS_C_5601-1987"	TokenNameStringLiteral	KS_C_5601-1987
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GB2312"	TokenNameStringLiteral	GB2312
,	TokenNameCOMMA	
"GB2312"	TokenNameStringLiteral	GB2312
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO2022KR"	TokenNameStringLiteral	ISO2022KR
,	TokenNameCOMMA	
"ISO-2022-KR"	TokenNameStringLiteral	ISO-2022-KR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ISO2022CN"	TokenNameStringLiteral	ISO2022CN
,	TokenNameCOMMA	
"ISO-2022-CN"	TokenNameStringLiteral	ISO-2022-CN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"JIS"	TokenNameStringLiteral	JIS
,	TokenNameCOMMA	
"ISO-2022-JP"	TokenNameStringLiteral	ISO-2022-JP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KOI8_R"	TokenNameStringLiteral	KOI8_R
,	TokenNameCOMMA	
"KOI8-R"	TokenNameStringLiteral	KOI8-R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"KSC5601"	TokenNameStringLiteral	KSC5601
,	TokenNameCOMMA	
"EUC-KR"	TokenNameStringLiteral	EUC-KR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GB18030"	TokenNameStringLiteral	GB18030
,	TokenNameCOMMA	
"GB18030"	TokenNameStringLiteral	GB18030
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"GBK"	TokenNameStringLiteral	GBK
,	TokenNameCOMMA	
"GBK"	TokenNameStringLiteral	GBK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"SJIS"	TokenNameStringLiteral	SJIS
,	TokenNameCOMMA	
"SHIFT_JIS"	TokenNameStringLiteral	SHIFT_JIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"MS932"	TokenNameStringLiteral	MS932
,	TokenNameCOMMA	
"WINDOWS-31J"	TokenNameStringLiteral	WINDOWS-31J
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UTF8"	TokenNameStringLiteral	UTF8
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Unicode"	TokenNameStringLiteral	Unicode
,	TokenNameCOMMA	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UnicodeBig"	TokenNameStringLiteral	UnicodeBig
,	TokenNameCOMMA	
"UTF-16BE"	TokenNameStringLiteral	UTF-16BE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"UnicodeLittle"	TokenNameStringLiteral	UnicodeLittle
,	TokenNameCOMMA	
"UTF-16LE"	TokenNameStringLiteral	UTF-16LE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"JIS0201"	TokenNameStringLiteral	JIS0201
,	TokenNameCOMMA	
"X0201"	TokenNameStringLiteral	X0201
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"JIS0208"	TokenNameStringLiteral	JIS0208
,	TokenNameCOMMA	
"X0208"	TokenNameStringLiteral	X0208
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"JIS0212"	TokenNameStringLiteral	JIS0212
,	TokenNameCOMMA	
"ISO-IR-159"	TokenNameStringLiteral	ISO-IR-159
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// proposed addition (see above for details): 	TokenNameCOMMENT_LINE	proposed addition (see above for details): 
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"CP1047"	TokenNameStringLiteral	CP1047
,	TokenNameCOMMA	
"IBM1047"	TokenNameStringLiteral	IBM1047
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <clinit>() 	TokenNameCOMMENT_LINE	<clinit>() 
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
EncodingMap	TokenNameIdentifier	 Encoding Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public static methods 	TokenNameCOMMENT_LINE	Public static methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds an IANA to Java encoding name mapping. * * @param ianaEncoding The IANA encoding name. * @param javaEncoding The Java encoding name. * * @deprecated Use of this method is not recommended. Its * effect is JVM wide and may cause unforeseen behaviour * for other applications running in the system. */	TokenNameCOMMENT_JAVADOC	 Adds an IANA to Java encoding name mapping. * @param ianaEncoding The IANA encoding name. @param javaEncoding The Java encoding name. * @deprecated Use of this method is not recommended. Its effect is JVM wide and may cause unforeseen behaviour for other applications running in the system. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
putIANA2JavaMapping	TokenNameIdentifier	 put IAN A2 Java Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ianaEncoding	TokenNameIdentifier	 iana Encoding
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ianaEncoding	TokenNameIdentifier	 iana Encoding
,	TokenNameCOMMA	
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putIANA2JavaMapping(String,String) 	TokenNameCOMMENT_LINE	putIANA2JavaMapping(String,String) 
/** * Returns the Java encoding name for the specified IANA encoding name. * * @param ianaEncoding The IANA encoding name. */	TokenNameCOMMENT_JAVADOC	 Returns the Java encoding name for the specified IANA encoding name. * @param ianaEncoding The IANA encoding name. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getIANA2JavaMapping	TokenNameIdentifier	 get IAN A2 Java Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getIANA2JavaMapping(String):String 	TokenNameCOMMENT_LINE	getIANA2JavaMapping(String):String 
/** * Removes an IANA to Java encoding name mapping. * * @param ianaEncoding The IANA encoding name. * * @deprecated Use of this method is not recommended. Its * effect is JVM wide and may cause unforeseen behaviour * for other applications running in the system. */	TokenNameCOMMENT_JAVADOC	 Removes an IANA to Java encoding name mapping. * @param ianaEncoding The IANA encoding name. * @deprecated Use of this method is not recommended. Its effect is JVM wide and may cause unforeseen behaviour for other applications running in the system. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
removeIANA2JavaMapping	TokenNameIdentifier	 remove IAN A2 Java Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fIANA2JavaMap	TokenNameIdentifier	 f IAN A2 Java Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeIANA2JavaMapping(String):String 	TokenNameCOMMENT_LINE	removeIANA2JavaMapping(String):String 
/** * Adds a Java to IANA encoding name mapping. * * @param javaEncoding The Java encoding name. * @param ianaEncoding The IANA encoding name. * * @deprecated Use of this method is not recommended. Its * effect is JVM wide and may cause unforeseen behaviour * for other applications running in the system. */	TokenNameCOMMENT_JAVADOC	 Adds a Java to IANA encoding name mapping. * @param javaEncoding The Java encoding name. @param ianaEncoding The IANA encoding name. * @deprecated Use of this method is not recommended. Its effect is JVM wide and may cause unforeseen behaviour for other applications running in the system. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
putJava2IANAMapping	TokenNameIdentifier	 put Java2 IANA Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
,	TokenNameCOMMA	
ianaEncoding	TokenNameIdentifier	 iana Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// putJava2IANAMapping(String,String) 	TokenNameCOMMENT_LINE	putJava2IANAMapping(String,String) 
/** * Returns the IANA encoding name for the specified Java encoding name. * * @param javaEncoding The Java encoding name. */	TokenNameCOMMENT_JAVADOC	 Returns the IANA encoding name for the specified Java encoding name. * @param javaEncoding The Java encoding name. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getJava2IANAMapping	TokenNameIdentifier	 get Java2 IANA Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getJava2IANAMapping(String):String 	TokenNameCOMMENT_LINE	getJava2IANAMapping(String):String 
/** * Removes a Java to IANA encoding name mapping. * * @param javaEncoding The Java encoding name. * * @deprecated Use of this method is not recommended. Its * effect is JVM wide and may cause unforeseen behaviour * for other applications running in the system. */	TokenNameCOMMENT_JAVADOC	 Removes a Java to IANA encoding name mapping. * @param javaEncoding The Java encoding name. * @deprecated Use of this method is not recommended. Its effect is JVM wide and may cause unforeseen behaviour for other applications running in the system. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
removeJava2IANAMapping	TokenNameIdentifier	 remove Java2 IANA Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fJava2IANAMap	TokenNameIdentifier	 f Java2 IANA Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
javaEncoding	TokenNameIdentifier	 java Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// removeJava2IANAMapping 	TokenNameCOMMENT_LINE	removeJava2IANAMapping 
}	TokenNameRBRACE	
// class EncodingMap 	TokenNameCOMMENT_LINE	class EncodingMap 

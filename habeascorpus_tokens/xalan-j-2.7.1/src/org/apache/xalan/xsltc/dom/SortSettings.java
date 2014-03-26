/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SortSettings.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SortSettings.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
;	TokenNameSEMICOLON	
/** * Class for carrying settings that are to be used for a particular set * of <code>xsl:sort</code> elements. */	TokenNameCOMMENT_JAVADOC	 Class for carrying settings that are to be used for a particular set of <code>xsl:sort</code> elements. 
final	TokenNamefinal	
class	TokenNameclass	
SortSettings	TokenNameIdentifier	 Sort Settings
{	TokenNameLBRACE	
/** * A reference to the translet object for the transformation. */	TokenNameCOMMENT_JAVADOC	 A reference to the translet object for the transformation. 
private	TokenNameprivate	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
/** * The sort order (ascending or descending) for each level of * <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 The sort order (ascending or descending) for each level of <code>xsl:sort</code> 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_sortOrders	TokenNameIdentifier	 sort Orders
;	TokenNameSEMICOLON	
/** * The type of comparison (text or number) for each level of * <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 The type of comparison (text or number) for each level of <code>xsl:sort</code> 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
/** * The Locale for each level of <code>xsl:sort</code>, based on any lang * attribute or the default Locale. */	TokenNameCOMMENT_JAVADOC	 The Locale for each level of <code>xsl:sort</code>, based on any lang attribute or the default Locale. 
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_locales	TokenNameIdentifier	 locales
;	TokenNameSEMICOLON	
/** * The Collator object in effect for each level of <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 The Collator object in effect for each level of <code>xsl:sort</code> 
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_collators	TokenNameIdentifier	 collators
;	TokenNameSEMICOLON	
/** * Case ordering for each level of <code>xsl:sort</code>. */	TokenNameCOMMENT_JAVADOC	 Case ordering for each level of <code>xsl:sort</code>. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_caseOrders	TokenNameIdentifier	 case Orders
;	TokenNameSEMICOLON	
/** * Create an instance of <code>SortSettings</code>. * @param translet {@link org.apache.xalan.xsltc.runtime.AbstractTranslet} * object for the transformation * @param sortOrders an array specifying the sort order for each sort level * @param types an array specifying the type of comparison for each sort * level (text or number) * @param locales an array specifying the Locale for each sort level * @param collators an array specifying the Collation in effect for each * sort level * @param caseOrders an array specifying whether upper-case, lower-case * or neither is to take precedence for each sort level. * The value of each element is equal to one of * <code>"upper-first", "lower-first", or ""</code>. */	TokenNameCOMMENT_JAVADOC	 Create an instance of <code>SortSettings</code>. @param translet {@link org.apache.xalan.xsltc.runtime.AbstractTranslet} object for the transformation @param sortOrders an array specifying the sort order for each sort level @param types an array specifying the type of comparison for each sort level (text or number) @param locales an array specifying the Locale for each sort level @param collators an array specifying the Collation in effect for each sort level @param caseOrders an array specifying whether upper-case, lower-case or neither is to take precedence for each sort level. The value of each element is equal to one of <code>"upper-first", "lower-first", or ""</code>. 
SortSettings	TokenNameIdentifier	 Sort Settings
(	TokenNameLPAREN	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortOrders	TokenNameIdentifier	 sort Orders
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
types	TokenNameIdentifier	 types
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locales	TokenNameIdentifier	 locales
,	TokenNameCOMMA	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
collators	TokenNameIdentifier	 collators
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
caseOrders	TokenNameIdentifier	 case Orders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
_sortOrders	TokenNameIdentifier	 sort Orders
=	TokenNameEQUAL	
sortOrders	TokenNameIdentifier	 sort Orders
;	TokenNameSEMICOLON	
_types	TokenNameIdentifier	 types
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
_locales	TokenNameIdentifier	 locales
=	TokenNameEQUAL	
locales	TokenNameIdentifier	 locales
;	TokenNameSEMICOLON	
_collators	TokenNameIdentifier	 collators
=	TokenNameEQUAL	
collators	TokenNameIdentifier	 collators
;	TokenNameSEMICOLON	
_caseOrders	TokenNameIdentifier	 case Orders
=	TokenNameEQUAL	
caseOrders	TokenNameIdentifier	 case Orders
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A reference to the translet object for the transformation. */	TokenNameCOMMENT_JAVADOC	 @return A reference to the translet object for the transformation. 
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
getTranslet	TokenNameIdentifier	 get Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return An array containing the sort order (ascending or descending) * for each level of <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 @return An array containing the sort order (ascending or descending) for each level of <code>xsl:sort</code> 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSortOrders	TokenNameIdentifier	 get Sort Orders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_sortOrders	TokenNameIdentifier	 sort Orders
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return An array containing the type of comparison (text or number) * to perform for each level of <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 @return An array containing the type of comparison (text or number) to perform for each level of <code>xsl:sort</code> 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return An array containing the Locale object in effect for each level * of <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 @return An array containing the Locale object in effect for each level of <code>xsl:sort</code> 
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocales	TokenNameIdentifier	 get Locales
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_locales	TokenNameIdentifier	 locales
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return An array containing the Collator object in effect for each level * of <code>xsl:sort</code> */	TokenNameCOMMENT_JAVADOC	 @return An array containing the Collator object in effect for each level of <code>xsl:sort</code> 
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCollators	TokenNameIdentifier	 get Collators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_collators	TokenNameIdentifier	 collators
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return An array specifying the case ordering for each level of * <code>xsl:sort</code>. */	TokenNameCOMMENT_JAVADOC	 @return An array specifying the case ordering for each level of <code>xsl:sort</code>. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCaseOrders	TokenNameIdentifier	 get Case Orders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_caseOrders	TokenNameIdentifier	 case Orders
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

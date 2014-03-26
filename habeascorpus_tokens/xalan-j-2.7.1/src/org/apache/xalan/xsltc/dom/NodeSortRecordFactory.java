/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSortRecordFactory.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSortRecordFactory.java 468651 2006-10-28 07:04:25Z minchau $ 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
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
Translet	TokenNameIdentifier	 Translet
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
TransletException	TokenNameIdentifier	 Translet Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
LocaleUtility	TokenNameIdentifier	 Locale Utility
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
NodeSortRecordFactory	TokenNameIdentifier	 Node Sort Record Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
DESCENDING	TokenNameIdentifier	 DESCENDING
=	TokenNameEQUAL	
"descending"	TokenNameStringLiteral	descending
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
NUMBER	TokenNameIdentifier	 NUMBER
=	TokenNameEQUAL	
"number"	TokenNameStringLiteral	number
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DOM	TokenNameIdentifier	 DOM
_dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
_className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
_class	TokenNameIdentifier	 class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortSettings	TokenNameIdentifier	 Sort Settings
_sortSettings	TokenNameIdentifier	 sort Settings
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
Collator	TokenNameIdentifier	 Collator
_collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
/** * Creates a NodeSortRecord producing object. The DOM specifies which tree * to get the nodes to sort from, the class name specifies what auxillary * class to use to sort the nodes (this class is generated by the Sort * class), and the translet parameter is needed for methods called by * this object. * * @deprecated This constructor is no longer used in generated code. It * exists only for backwards compatibility. */	TokenNameCOMMENT_JAVADOC	 Creates a NodeSortRecord producing object. The DOM specifies which tree to get the nodes to sort from, the class name specifies what auxillary class to use to sort the nodes (this class is generated by the Sort class), and the translet parameter is needed for methods called by this object. * @deprecated This constructor is no longer used in generated code. It exists only for backwards compatibility. 
public	TokenNamepublic	
NodeSortRecordFactory	TokenNameIdentifier	 Node Sort Record Factory
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
order	TokenNameIdentifier	 order
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a NodeSortRecord producing object. The DOM specifies which tree * to get the nodes to sort from, the class name specifies what auxillary * class to use to sort the nodes (this class is generated by the Sort * class), and the translet parameter is needed for methods called by * this object. */	TokenNameCOMMENT_JAVADOC	 Creates a NodeSortRecord producing object. The DOM specifies which tree to get the nodes to sort from, the class name specifies what auxillary class to use to sort the nodes (this class is generated by the Sort class), and the translet parameter is needed for methods called by this object. 
public	TokenNamepublic	
NodeSortRecordFactory	TokenNameIdentifier	 Node Sort Record Factory
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
caseOrder	TokenNameIdentifier	 case Order
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
_className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
// This should return a Class definition if using TrAX 	TokenNameCOMMENT_LINE	This should return a Class definition if using TrAX 
_class	TokenNameIdentifier	 class
=	TokenNameEQUAL	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
getAuxiliaryClass	TokenNameIdentifier	 get Auxiliary Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This code is only run when the native API is used 	TokenNameCOMMENT_LINE	This code is only run when the native API is used 
if	TokenNameif	
(	TokenNameLPAREN	
_class	TokenNameIdentifier	 class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_class	TokenNameIdentifier	 class
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
iOrder	TokenNameIdentifier	 i Order
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
levels	TokenNameIdentifier	 levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
iType	TokenNameIdentifier	 i Type
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
levels	TokenNameIdentifier	 levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
levels	TokenNameIdentifier	 levels
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DESCENDING	TokenNameIdentifier	 DESCENDING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iOrder	TokenNameIdentifier	 i Order
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
.	TokenNameDOT	
COMPARE_DESCENDING	TokenNameIdentifier	 COMPARE  DESCENDING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iType	TokenNameIdentifier	 i Type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
.	TokenNameDOT	
COMPARE_NUMERIC	TokenNameIdentifier	 COMPARE  NUMERIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Old NodeSortRecordFactory constructor had no lang or case_order 	TokenNameCOMMENT_LINE	Old NodeSortRecordFactory constructor had no lang or case_order 
// arguments. Provide default values in that case for binary 	TokenNameCOMMENT_LINE	arguments. Provide default values in that case for binary 
// compatibility. 	TokenNameCOMMENT_LINE	compatibility. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
emptyStringArray	TokenNameIdentifier	 empty String Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
caseOrder	TokenNameIdentifier	 case Order
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numSortKeys	TokenNameIdentifier	 num Sort Keys
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
emptyStringArray	TokenNameIdentifier	 empty String Array
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numSortKeys	TokenNameIdentifier	 num Sort Keys
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Set up array of zero-length strings as default values 	TokenNameCOMMENT_LINE	Set up array of zero-length strings as default values 
// of lang and case_order 	TokenNameCOMMENT_LINE	of lang and case_order 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numSortKeys	TokenNameIdentifier	 num Sort Keys
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
emptyStringArray	TokenNameIdentifier	 empty String Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
emptyStringArray	TokenNameIdentifier	 empty String Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
caseOrder	TokenNameIdentifier	 case Order
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseOrder	TokenNameIdentifier	 case Order
=	TokenNameEQUAL	
emptyStringArray	TokenNameIdentifier	 empty String Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locales	TokenNameIdentifier	 locales
=	TokenNameEQUAL	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
collators	TokenNameIdentifier	 collators
=	TokenNameEQUAL	
new	TokenNamenew	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locales	TokenNameIdentifier	 locales
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LocaleUtility	TokenNameIdentifier	 Locale Utility
.	TokenNameDOT	
langToLocale	TokenNameIdentifier	 lang To Locale
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collators	TokenNameIdentifier	 collators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
locales	TokenNameIdentifier	 locales
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_sortSettings	TokenNameIdentifier	 sort Settings
=	TokenNameEQUAL	
new	TokenNamenew	
SortSettings	TokenNameIdentifier	 Sort Settings
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
)	TokenNameRPAREN	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
iOrder	TokenNameIdentifier	 i Order
,	TokenNameCOMMA	
iType	TokenNameIdentifier	 i Type
,	TokenNameCOMMA	
locales	TokenNameIdentifier	 locales
,	TokenNameCOMMA	
collators	TokenNameIdentifier	 collators
,	TokenNameCOMMA	
caseOrder	TokenNameIdentifier	 case Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransletException	TokenNameIdentifier	 Translet Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create an instance of a sub-class of NodeSortRecord. The name of this * sub-class is passed to us in the constructor. */	TokenNameCOMMENT_JAVADOC	 Create an instance of a sub-class of NodeSortRecord. The name of this sub-class is passed to us in the constructor. 
public	TokenNamepublic	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
makeNodeSortRecord	TokenNameIdentifier	 make Node Sort Record
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
throws	TokenNamethrows	
ExceptionInInitializerError	TokenNameIdentifier	 Exception In Initializer Error
,	TokenNameCOMMA	
LinkageError	TokenNameIdentifier	 Linkage Error
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
,	TokenNameCOMMA	
SecurityException	TokenNameIdentifier	 Security Exception
,	TokenNameCOMMA	
TransletException	TokenNameIdentifier	 Translet Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
sortRecord	TokenNameIdentifier	 sort Record
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
)	TokenNameRPAREN	
_class	TokenNameIdentifier	 class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortRecord	TokenNameIdentifier	 sort Record
.	TokenNameDOT	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
_dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
_sortSettings	TokenNameIdentifier	 sort Settings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sortRecord	TokenNameIdentifier	 sort Record
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
setLang	TokenNameIdentifier	 set Lang
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

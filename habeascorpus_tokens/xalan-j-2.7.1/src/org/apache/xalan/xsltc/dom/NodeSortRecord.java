/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSortRecord.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSortRecord.java 468651 2006-10-28 07:04:25Z minchau $ 
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
CollationKey	TokenNameIdentifier	 Collation Key
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
CollatorFactory	TokenNameIdentifier	 Collator Factory
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
StringComparable	TokenNameIdentifier	 String Comparable
;	TokenNameSEMICOLON	
/** * Base class for sort records containing application specific sort keys */	TokenNameCOMMENT_JAVADOC	 Base class for sort records containing application specific sort keys 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPARE_STRING	TokenNameIdentifier	 COMPARE  STRING
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPARE_NUMERIC	TokenNameIdentifier	 COMPARE  NUMERIC
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPARE_ASCENDING	TokenNameIdentifier	 COMPARE  ASCENDING
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMPARE_DESCENDING	TokenNameIdentifier	 COMPARE  DESCENDING
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A reference to a collator. May be updated by subclass if the stylesheet * specifies a different language (will be updated iff _locale is updated). * @deprecated This field continues to exist for binary compatibility. * New code should not refer to it. */	TokenNameCOMMENT_JAVADOC	 A reference to a collator. May be updated by subclass if the stylesheet specifies a different language (will be updated iff _locale is updated). @deprecated This field continues to exist for binary compatibility. New code should not refer to it. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Collator	TokenNameIdentifier	 Collator
DEFAULT_COLLATOR	TokenNameIdentifier	 DEFAULT  COLLATOR
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A reference to the first Collator * @deprecated This field continues to exist for binary compatibility. * New code should not refer to it. */	TokenNameCOMMENT_JAVADOC	 A reference to the first Collator @deprecated This field continues to exist for binary compatibility. New code should not refer to it. 
protected	TokenNameprotected	
Collator	TokenNameIdentifier	 Collator
_collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
DEFAULT_COLLATOR	TokenNameIdentifier	 DEFAULT  COLLATOR
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_collators	TokenNameIdentifier	 collators
;	TokenNameSEMICOLON	
/** * A locale field that might be set by an instance of a subclass. * @deprecated This field continues to exist for binary compatibility. * New code should not refer to it. */	TokenNameCOMMENT_JAVADOC	 A locale field that might be set by an instance of a subclass. @deprecated This field continues to exist for binary compatibility. New code should not refer to it. 
protected	TokenNameprotected	
Locale	TokenNameIdentifier	 Locale
_locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
CollatorFactory	TokenNameIdentifier	 Collator Factory
_collatorFactory	TokenNameIdentifier	 collator Factory
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SortSettings	TokenNameIdentifier	 Sort Settings
_settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DOM	TokenNameIdentifier	 DOM
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// The position in the current iterator 	TokenNameCOMMENT_LINE	The position in the current iterator 
private	TokenNameprivate	
int	TokenNameint	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Number of nodes in the current iterator 	TokenNameCOMMENT_LINE	Number of nodes in the current iterator 
private	TokenNameprivate	
int	TokenNameint	
_scanned	TokenNameIdentifier	 scanned
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Number of key levels extracted from DOM 	TokenNameCOMMENT_LINE	Number of key levels extracted from DOM 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
// Contains Comparable objects 	TokenNameCOMMENT_LINE	Contains Comparable objects 
/** * This constructor is run by a call to ClassLoader in the * makeNodeSortRecord method in the NodeSortRecordFactory class. Since we * cannot pass any parameters to the constructor in that case we just set * the default values here and wait for new values through initialize(). */	TokenNameCOMMENT_JAVADOC	 This constructor is run by a call to ClassLoader in the makeNodeSortRecord method in the NodeSortRecordFactory class. Since we cannot pass any parameters to the constructor in that case we just set the default values here and wait for new values through initialize(). 
public	TokenNamepublic	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method allows the caller to set the values that could not be passed * to the default constructor. */	TokenNameCOMMENT_JAVADOC	 This method allows the caller to set the values that could not be passed to the default constructor. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
SortSettings	TokenNameIdentifier	 Sort Settings
settings	TokenNameIdentifier	 settings
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
_settings	TokenNameIdentifier	 settings
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
;	TokenNameSEMICOLON	
int	TokenNameint	
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getSortOrders	TokenNameIdentifier	 get Sort Orders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
_values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
levels	TokenNameIdentifier	 levels
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// -- W. Eliot Kimber (eliot@isogen.com) 	TokenNameCOMMENT_LINE	-- W. Eliot Kimber (eliot@isogen.com) 
String	TokenNameIdentifier	 String
colFactClassname	TokenNameIdentifier	 col Fact Classname
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"org.apache.xalan.xsltc.COLLATOR_FACTORY"	TokenNameStringLiteral	org.apache.xalan.xsltc.COLLATOR_FACTORY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colFactClassname	TokenNameIdentifier	 col Fact Classname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
candObj	TokenNameIdentifier	 cand Obj
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
colFactClassname	TokenNameIdentifier	 col Fact Classname
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
_collatorFactory	TokenNameIdentifier	 collator Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CollatorFactory	TokenNameIdentifier	 Collator Factory
)	TokenNameRPAREN	
candObj	TokenNameIdentifier	 cand Obj
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
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locales	TokenNameIdentifier	 locales
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getLocales	TokenNameIdentifier	 get Locales
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_collators	TokenNameIdentifier	 collators
=	TokenNameEQUAL	
new	TokenNamenew	
Collator	TokenNameIdentifier	 Collator
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
_collators	TokenNameIdentifier	 collators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_collatorFactory	TokenNameIdentifier	 collator Factory
.	TokenNameDOT	
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
locales	TokenNameIdentifier	 locales
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
_collators	TokenNameIdentifier	 collators
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_collators	TokenNameIdentifier	 collators
=	TokenNameEQUAL	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getCollators	TokenNameIdentifier	 get Collators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
_collators	TokenNameIdentifier	 collators
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the node for this sort object */	TokenNameCOMMENT_JAVADOC	 Returns the node for this sort object 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
compareDocOrder	TokenNameIdentifier	 compare Doc Order
(	TokenNameLPAREN	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_node	TokenNameIdentifier	 node
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string or numeric value of a specific level key for this sort * element. The value is extracted from the DOM if it is not already in * our sort key vector. */	TokenNameCOMMENT_JAVADOC	 Get the string or numeric value of a specific level key for this sort element. The value is extracted from the DOM if it is not already in our sort key vector. 
private	TokenNameprivate	
final	TokenNamefinal	
Comparable	TokenNameIdentifier	 Comparable
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get value from our array if possible 	TokenNameCOMMENT_LINE	Get value from our array if possible 
if	TokenNameif	
(	TokenNameLPAREN	
_scanned	TokenNameIdentifier	 scanned
<=	TokenNameLESS_EQUAL	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getTranslet	TokenNameIdentifier	 get Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locales	TokenNameIdentifier	 locales
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getLocales	TokenNameIdentifier	 get Locales
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
caseOrder	TokenNameIdentifier	 case Order
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getCaseOrders	TokenNameIdentifier	 get Case Orders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get value from DOM if accessed for the first time 	TokenNameCOMMENT_LINE	Get value from DOM if accessed for the first time 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
extractValueFromDOM	TokenNameIdentifier	 extract Value From DOM
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
_node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
_last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Comparable	TokenNameIdentifier	 Comparable
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
StringComparable	TokenNameIdentifier	 String Comparable
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
locales	TokenNameIdentifier	 locales
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
_collators	TokenNameIdentifier	 collators
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
caseOrder	TokenNameIdentifier	 case Order
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
_scanned	TokenNameIdentifier	 scanned
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Comparable	TokenNameIdentifier	 Comparable
)	TokenNameRPAREN	
_values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Double	TokenNameIdentifier	 Double
numericValue	TokenNameIdentifier	 numeric Value
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get value from our vector if possible 	TokenNameCOMMENT_LINE	Get value from our vector if possible 
if	TokenNameif	
(	TokenNameLPAREN	
_scanned	TokenNameIdentifier	 scanned
<=	TokenNameLESS_EQUAL	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getTranslet	TokenNameIdentifier	 get Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get value from DOM if accessed for the first time 	TokenNameCOMMENT_LINE	Get value from DOM if accessed for the first time 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
extractValueFromDOM	TokenNameIdentifier	 extract Value From DOM
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
_node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
_last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Treat number as NaN if it cannot be parsed as a double 	TokenNameCOMMENT_LINE	Treat number as NaN if it cannot be parsed as a double 
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
_scanned	TokenNameIdentifier	 scanned
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
_values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare this sort element to another. The first level is checked first, * and we proceed to the next level only if the first level keys are * identical (and so the key values may not even be extracted from the DOM) * * !!!!MUST OPTIMISE - THIS IS REALLY, REALLY SLOW!!!! */	TokenNameCOMMENT_JAVADOC	 Compare this sort element to another. The first level is checked first, and we proceed to the next level only if the first level keys are identical (and so the key values may not even be extracted from the DOM) * !!!!MUST OPTIMISE - THIS IS REALLY, REALLY SLOW!!!! 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
NodeSortRecord	TokenNameIdentifier	 Node Sort Record
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortOrder	TokenNameIdentifier	 sort Order
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getSortOrders	TokenNameIdentifier	 get Sort Orders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getSortOrders	TokenNameIdentifier	 get Sort Orders
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compareTypes	TokenNameIdentifier	 compare Types
=	TokenNameEQUAL	
_settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
<	TokenNameLESS	
levels	TokenNameIdentifier	 levels
;	TokenNameSEMICOLON	
level	TokenNameIdentifier	 level
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compare the two nodes either as numeric or text values 	TokenNameCOMMENT_LINE	Compare the two nodes either as numeric or text values 
if	TokenNameif	
(	TokenNameLPAREN	
compareTypes	TokenNameIdentifier	 compare Types
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
COMPARE_NUMERIC	TokenNameIdentifier	 COMPARE  NUMERIC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Double	TokenNameIdentifier	 Double
our	TokenNameIdentifier	 our
=	TokenNameEQUAL	
numericValue	TokenNameIdentifier	 numeric Value
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Double	TokenNameIdentifier	 Double
their	TokenNameIdentifier	 their
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
numericValue	TokenNameIdentifier	 numeric Value
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
our	TokenNameIdentifier	 our
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
their	TokenNameIdentifier	 their
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Comparable	TokenNameIdentifier	 Comparable
our	TokenNameIdentifier	 our
=	TokenNameEQUAL	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Comparable	TokenNameIdentifier	 Comparable
their	TokenNameIdentifier	 their
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
our	TokenNameIdentifier	 our
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
their	TokenNameIdentifier	 their
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return inverse compare value if inverse sort order 	TokenNameCOMMENT_LINE	Return inverse compare value if inverse sort order 
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortOrder	TokenNameIdentifier	 sort Order
[	TokenNameLBRACKET	
level	TokenNameIdentifier	 level
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
COMPARE_DESCENDING	TokenNameIdentifier	 COMPARE  DESCENDING
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
-	TokenNameMINUS	
cmp	TokenNameIdentifier	 cmp
:	TokenNameCOLON	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Compare based on document order if all sort keys are equal 	TokenNameCOMMENT_LINE	Compare based on document order if all sort keys are equal 
return	TokenNamereturn	
(	TokenNameLPAREN	
_node	TokenNameIdentifier	 node
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the array of Collators used for text comparisons in this object. * May be overridden by inheriting classes */	TokenNameCOMMENT_JAVADOC	 Returns the array of Collators used for text comparisons in this object. May be overridden by inheriting classes 
public	TokenNamepublic	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_collators	TokenNameIdentifier	 collators
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extract the sort value for a level of this key. */	TokenNameCOMMENT_JAVADOC	 Extract the sort value for a level of this key. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
extractValueFromDOM	TokenNameIdentifier	 extract Value From DOM
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

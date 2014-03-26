/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
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
XSLMessages	TokenNameIdentifier	 XSL Messages
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
/** * A sample implementation of NamespaceContext, with support for * EXSLT extension functions and Java extension functions. */	TokenNameCOMMENT_JAVADOC	 A sample implementation of NamespaceContext, with support for EXSLT extension functions and Java extension functions. 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
implements	TokenNameimplements	
NamespaceContext	TokenNameIdentifier	 Namespace Context
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_PREFIX	TokenNameIdentifier	 EXSLT  PREFIX
=	TokenNameEQUAL	
"exslt"	TokenNameStringLiteral	exslt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_URI	TokenNameIdentifier	 EXSLT  URI
=	TokenNameEQUAL	
"http://exslt.org/common"	TokenNameStringLiteral	http://exslt.org/common
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_MATH_PREFIX	TokenNameIdentifier	 EXSLT  MATH  PREFIX
=	TokenNameEQUAL	
"math"	TokenNameStringLiteral	math
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_MATH_URI	TokenNameIdentifier	 EXSLT  MATH  URI
=	TokenNameEQUAL	
"http://exslt.org/math"	TokenNameStringLiteral	http://exslt.org/math
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_SET_PREFIX	TokenNameIdentifier	 EXSLT  SET  PREFIX
=	TokenNameEQUAL	
"set"	TokenNameStringLiteral	set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_SET_URI	TokenNameIdentifier	 EXSLT  SET  URI
=	TokenNameEQUAL	
"http://exslt.org/sets"	TokenNameStringLiteral	http://exslt.org/sets
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_STRING_PREFIX	TokenNameIdentifier	 EXSLT  STRING  PREFIX
=	TokenNameEQUAL	
"str"	TokenNameStringLiteral	str
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_STRING_URI	TokenNameIdentifier	 EXSLT  STRING  URI
=	TokenNameEQUAL	
"http://exslt.org/strings"	TokenNameStringLiteral	http://exslt.org/strings
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_DATETIME_PREFIX	TokenNameIdentifier	 EXSLT  DATETIME  PREFIX
=	TokenNameEQUAL	
"datetime"	TokenNameStringLiteral	datetime
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_DATETIME_URI	TokenNameIdentifier	 EXSLT  DATETIME  URI
=	TokenNameEQUAL	
"http://exslt.org/dates-and-times"	TokenNameStringLiteral	http://exslt.org/dates-and-times
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_DYNAMIC_PREFIX	TokenNameIdentifier	 EXSLT  DYNAMIC  PREFIX
=	TokenNameEQUAL	
"dyn"	TokenNameStringLiteral	dyn
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXSLT_DYNAMIC_URI	TokenNameIdentifier	 EXSLT  DYNAMIC  URI
=	TokenNameEQUAL	
"http://exslt.org/dynamic"	TokenNameStringLiteral	http://exslt.org/dynamic
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_EXT_PREFIX	TokenNameIdentifier	 JAVA  EXT  PREFIX
=	TokenNameEQUAL	
"java"	TokenNameStringLiteral	java
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_EXT_URI	TokenNameIdentifier	 JAVA  EXT  URI
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/java"	TokenNameStringLiteral	http://xml.apache.org/xalan/java
;	TokenNameSEMICOLON	
/** * Return the namespace uri for a given prefix */	TokenNameCOMMENT_JAVADOC	 Return the namespace uri for a given prefix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NAMESPACE_CONTEXT_NULL_PREFIX	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  PREFIX
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
DEFAULT_NS_PREFIX	TokenNameIdentifier	 DEFAULT  NS  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
NULL_NS_URI	TokenNameIdentifier	 NULL  NS  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_NS_PREFIX	TokenNameIdentifier	 XML  NS  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_NS_URI	TokenNameIdentifier	 XML  NS  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE	TokenNameIdentifier	 XMLNS  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE_NS_URI	TokenNameIdentifier	 XMLNS  ATTRIBUTE  NS  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_PREFIX	TokenNameIdentifier	 EXSLT  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_URI	TokenNameIdentifier	 EXSLT  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_MATH_PREFIX	TokenNameIdentifier	 EXSLT  MATH  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_MATH_URI	TokenNameIdentifier	 EXSLT  MATH  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_SET_PREFIX	TokenNameIdentifier	 EXSLT  SET  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_SET_URI	TokenNameIdentifier	 EXSLT  SET  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_STRING_PREFIX	TokenNameIdentifier	 EXSLT  STRING  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_STRING_URI	TokenNameIdentifier	 EXSLT  STRING  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_DATETIME_PREFIX	TokenNameIdentifier	 EXSLT  DATETIME  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_DATETIME_URI	TokenNameIdentifier	 EXSLT  DATETIME  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_DYNAMIC_PREFIX	TokenNameIdentifier	 EXSLT  DYNAMIC  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_DYNAMIC_URI	TokenNameIdentifier	 EXSLT  DYNAMIC  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
JAVA_EXT_PREFIX	TokenNameIdentifier	 JAVA  EXT  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
JAVA_EXT_URI	TokenNameIdentifier	 JAVA  EXT  URI
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
NULL_NS_URI	TokenNameIdentifier	 NULL  NS  URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the prefix for a given namespace uri. */	TokenNameCOMMENT_JAVADOC	 Return the prefix for a given namespace uri. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NAMESPACE_CONTEXT_NULL_NAMESPACE	TokenNameIdentifier	 ER  NAMESPACE  CONTEXT  NULL  NAMESPACE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_NS_URI	TokenNameIdentifier	 XML  NS  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XML_NS_PREFIX	TokenNameIdentifier	 XML  NS  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE_NS_URI	TokenNameIdentifier	 XMLNS  ATTRIBUTE  NS  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
XMLNS_ATTRIBUTE	TokenNameIdentifier	 XMLNS  ATTRIBUTE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_URI	TokenNameIdentifier	 EXSLT  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_PREFIX	TokenNameIdentifier	 EXSLT  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_MATH_URI	TokenNameIdentifier	 EXSLT  MATH  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_MATH_PREFIX	TokenNameIdentifier	 EXSLT  MATH  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_SET_URI	TokenNameIdentifier	 EXSLT  SET  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_SET_PREFIX	TokenNameIdentifier	 EXSLT  SET  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_STRING_URI	TokenNameIdentifier	 EXSLT  STRING  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_STRING_PREFIX	TokenNameIdentifier	 EXSLT  STRING  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_DATETIME_URI	TokenNameIdentifier	 EXSLT  DATETIME  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_DATETIME_PREFIX	TokenNameIdentifier	 EXSLT  DATETIME  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
EXSLT_DYNAMIC_URI	TokenNameIdentifier	 EXSLT  DYNAMIC  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EXSLT_DYNAMIC_PREFIX	TokenNameIdentifier	 EXSLT  DYNAMIC  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
JAVA_EXT_URI	TokenNameIdentifier	 JAVA  EXT  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
JAVA_EXT_PREFIX	TokenNameIdentifier	 JAVA  EXT  PREFIX
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getPrefixes	TokenNameIdentifier	 get Prefixes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isFirstIteration	TokenNameIdentifier	 is First Iteration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isFirstIteration	TokenNameIdentifier	 is First Iteration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFirstIteration	TokenNameIdentifier	 is First Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFirstIteration	TokenNameIdentifier	 is First Iteration
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

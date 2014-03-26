/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Constants.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Constants.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * Primary constants used by the XSLT Processor * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Primary constants used by the XSLT Processor @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
/** * Mnemonics for standard XML Namespace URIs, as Java Strings: * <ul> * <li>S_XMLNAMESPACEURI (http://www.w3.org/XML/1998/namespace) is the * URI permanantly assigned to the "xml:" prefix. This is used for some * features built into the XML specification itself, such as xml:space * and xml:lang. It was defined by the W3C's XML Namespaces spec.</li> * <li>S_XSLNAMESPACEURL (http://www.w3.org/1999/XSL/Transform) is the * URI which indicates that a name may be an XSLT directive. In most * XSLT stylesheets, this is bound to the "xsl:" prefix. It's defined * by the W3C's XSLT Recommendation.</li> * <li>S_OLDXSLNAMESPACEURL (http://www.w3.org/XSL/Transform/1.0) was * used in early prototypes of XSLT processors for much the same purpose * as S_XSLNAMESPACEURL. It is now considered obsolete, and the version * of XSLT which it signified is not fully compatable with the final * XSLT Recommendation, so what it really signifies is a badly obsolete * stylesheet.</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Mnemonics for standard XML Namespace URIs, as Java Strings: <ul> <li>S_XMLNAMESPACEURI (http://www.w3.org/XML/1998/namespace) is the URI permanantly assigned to the "xml:" prefix. This is used for some features built into the XML specification itself, such as xml:space and xml:lang. It was defined by the W3C's XML Namespaces spec.</li> <li>S_XSLNAMESPACEURL (http://www.w3.org/1999/XSL/Transform) is the URI which indicates that a name may be an XSLT directive. In most XSLT stylesheets, this is bound to the "xsl:" prefix. It's defined by the W3C's XSLT Recommendation.</li> <li>S_OLDXSLNAMESPACEURL (http://www.w3.org/XSL/Transform/1.0) was used in early prototypes of XSLT processors for much the same purpose as S_XSLNAMESPACEURL. It is now considered obsolete, and the version of XSLT which it signified is not fully compatable with the final XSLT Recommendation, so what it really signifies is a badly obsolete stylesheet.</li> </ul> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
,	TokenNameCOMMA	
S_XSLNAMESPACEURL	TokenNameIdentifier	 S  XSLNAMESPACEURL
=	TokenNameEQUAL	
"http://www.w3.org/1999/XSL/Transform"	TokenNameStringLiteral	http://www.w3.org/1999/XSL/Transform
,	TokenNameCOMMA	
S_OLDXSLNAMESPACEURL	TokenNameIdentifier	 S  OLDXSLNAMESPACEURL
=	TokenNameEQUAL	
"http://www.w3.org/XSL/Transform/1.0"	TokenNameStringLiteral	http://www.w3.org/XSL/Transform/1.0
;	TokenNameSEMICOLON	
/** Authorship mnemonics, as Java Strings. Not standardized, * as far as I know. * <ul> * <li>S_VENDOR -- the name of the organization/individual who published * this XSLT processor. </li> * <li>S_VENDORURL -- URL where one can attempt to retrieve more * information about this publisher and product.</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Authorship mnemonics, as Java Strings. Not standardized, as far as I know. <ul> <li>S_VENDOR -- the name of the organization/individual who published this XSLT processor. </li> <li>S_VENDORURL -- URL where one can attempt to retrieve more information about this publisher and product.</li> </ul> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_VENDOR	TokenNameIdentifier	 S  VENDOR
=	TokenNameEQUAL	
"Apache Software Foundation"	TokenNameStringLiteral	Apache Software Foundation
,	TokenNameCOMMA	
S_VENDORURL	TokenNameIdentifier	 S  VENDORURL
=	TokenNameEQUAL	
"http://xml.apache.org"	TokenNameStringLiteral	http://xml.apache.org
;	TokenNameSEMICOLON	
/** S_BUILTIN_EXTENSIONS_URL is a mnemonic for the XML Namespace *(http://xml.apache.org/xalan) predefined to signify Xalan's * built-in XSLT Extensions. When used in stylesheets, this is often * bound to the "xalan:" prefix. */	TokenNameCOMMENT_JAVADOC	 S_BUILTIN_EXTENSIONS_URL is a mnemonic for the XML Namespace *(http://xml.apache.org/xalan) predefined to signify Xalan's built-in XSLT Extensions. When used in stylesheets, this is often bound to the "xalan:" prefix. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan"	TokenNameStringLiteral	http://xml.apache.org/xalan
;	TokenNameSEMICOLON	
/** * The old built-in extension url. It is still supported for * backward compatibility. */	TokenNameCOMMENT_JAVADOC	 The old built-in extension url. It is still supported for backward compatibility. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_BUILTIN_OLD_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xslt"	TokenNameStringLiteral	http://xml.apache.org/xslt
;	TokenNameSEMICOLON	
/** * Xalan extension namespaces. */	TokenNameCOMMENT_JAVADOC	 Xalan extension namespaces. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
// The old namespace for Java extension 	TokenNameCOMMENT_LINE	The old namespace for Java extension 
S_EXTENSIONS_OLD_JAVA_URL	TokenNameIdentifier	 S  EXTENSIONS  OLD  JAVA  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xslt/java"	TokenNameStringLiteral	http://xml.apache.org/xslt/java
,	TokenNameCOMMA	
// The new namespace for Java extension 	TokenNameCOMMENT_LINE	The new namespace for Java extension 
S_EXTENSIONS_JAVA_URL	TokenNameIdentifier	 S  EXTENSIONS  JAVA  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/java"	TokenNameStringLiteral	http://xml.apache.org/xalan/java
,	TokenNameCOMMA	
S_EXTENSIONS_LOTUSXSL_JAVA_URL	TokenNameIdentifier	 S  EXTENSIONS  LOTUSXSL  JAVA  URL
=	TokenNameEQUAL	
"http://xsl.lotus.com/java"	TokenNameStringLiteral	http://xsl.lotus.com/java
,	TokenNameCOMMA	
S_EXTENSIONS_XALANLIB_URL	TokenNameIdentifier	 S  EXTENSIONS  XALANLIB  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan"	TokenNameStringLiteral	http://xml.apache.org/xalan
,	TokenNameCOMMA	
S_EXTENSIONS_REDIRECT_URL	TokenNameIdentifier	 S  EXTENSIONS  REDIRECT  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/redirect"	TokenNameStringLiteral	http://xml.apache.org/xalan/redirect
,	TokenNameCOMMA	
S_EXTENSIONS_PIPE_URL	TokenNameIdentifier	 S  EXTENSIONS  PIPE  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/PipeDocument"	TokenNameStringLiteral	http://xml.apache.org/xalan/PipeDocument
,	TokenNameCOMMA	
S_EXTENSIONS_SQL_URL	TokenNameIdentifier	 S  EXTENSIONS  SQL  URL
=	TokenNameEQUAL	
"http://xml.apache.org/xalan/sql"	TokenNameStringLiteral	http://xml.apache.org/xalan/sql
;	TokenNameSEMICOLON	
/** * EXSLT extension namespaces. */	TokenNameCOMMENT_JAVADOC	 EXSLT extension namespaces. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_EXSLT_COMMON_URL	TokenNameIdentifier	 S  EXSLT  COMMON  URL
=	TokenNameEQUAL	
"http://exslt.org/common"	TokenNameStringLiteral	http://exslt.org/common
,	TokenNameCOMMA	
S_EXSLT_MATH_URL	TokenNameIdentifier	 S  EXSLT  MATH  URL
=	TokenNameEQUAL	
"http://exslt.org/math"	TokenNameStringLiteral	http://exslt.org/math
,	TokenNameCOMMA	
S_EXSLT_SETS_URL	TokenNameIdentifier	 S  EXSLT  SETS  URL
=	TokenNameEQUAL	
"http://exslt.org/sets"	TokenNameStringLiteral	http://exslt.org/sets
,	TokenNameCOMMA	
S_EXSLT_DATETIME_URL	TokenNameIdentifier	 S  EXSLT  DATETIME  URL
=	TokenNameEQUAL	
"http://exslt.org/dates-and-times"	TokenNameStringLiteral	http://exslt.org/dates-and-times
,	TokenNameCOMMA	
S_EXSLT_FUNCTIONS_URL	TokenNameIdentifier	 S  EXSLT  FUNCTIONS  URL
=	TokenNameEQUAL	
"http://exslt.org/functions"	TokenNameStringLiteral	http://exslt.org/functions
,	TokenNameCOMMA	
S_EXSLT_DYNAMIC_URL	TokenNameIdentifier	 S  EXSLT  DYNAMIC  URL
=	TokenNameEQUAL	
"http://exslt.org/dynamic"	TokenNameStringLiteral	http://exslt.org/dynamic
,	TokenNameCOMMA	
S_EXSLT_STRINGS_URL	TokenNameIdentifier	 S  EXSLT  STRINGS  URL
=	TokenNameEQUAL	
"http://exslt.org/strings"	TokenNameStringLiteral	http://exslt.org/strings
;	TokenNameSEMICOLON	
/** * The minimum version of XSLT supported by this processor. */	TokenNameCOMMENT_JAVADOC	 The minimum version of XSLT supported by this processor. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
XSLTVERSUPPORTED	TokenNameIdentifier	 XSLTVERSUPPORTED
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

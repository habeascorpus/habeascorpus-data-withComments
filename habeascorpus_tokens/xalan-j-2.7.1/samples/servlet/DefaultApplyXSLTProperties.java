/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DefaultApplyXSLTProperties.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DefaultApplyXSLTProperties.java 470245 2006-11-02 06:34:33Z minchau $ 
package	TokenNamepackage	
servlet	TokenNameIdentifier	 servlet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
servlet	TokenNameIdentifier	 servlet
.	TokenNameDOT	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/***************************************************************************************************** * * DefaultApplyXSLTProperties contains operational parameters for DefaultApplyXSLT based * on program defaults and configuration. * <p>This class is also used to return values for request-time parameters.</p> * * @author Spencer Shepard (sshepard@us.ibm.com) * @author R. Adam King (rak@us.ibm.com) * @author Tom Rowe (trowe@us.ibm.com) * *****************************************************************************************************/	TokenNameCOMMENT_JAVADOC	*************************************************************************************************** * DefaultApplyXSLTProperties contains operational parameters for DefaultApplyXSLT based on program defaults and configuration. <p>This class is also used to return values for request-time parameters.</p> * @author Spencer Shepard (sshepard@us.ibm.com) @author R. Adam King (rak@us.ibm.com) @author Tom Rowe (trowe@us.ibm.com) ****************************************************************************************************
public	TokenNamepublic	
class	TokenNameclass	
DefaultApplyXSLTProperties	TokenNameIdentifier	 Default Apply XSLT Properties
extends	TokenNameextends	
ApplyXSLTProperties	TokenNameIdentifier	 Apply XSLT Properties
{	TokenNameLBRACE	
/** * Program default for parameter "catalog". * @see #getCatalog */	TokenNameCOMMENT_JAVADOC	 Program default for parameter "catalog". @see #getCatalog 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
;	TokenNameSEMICOLON	
/** * Host used for local context comparisons. * @see #getLocalHost * @see #setLocalHost */	TokenNameCOMMENT_JAVADOC	 Host used for local context comparisons. @see #getLocalHost @see #setLocalHost 
protected	TokenNameprotected	
transient	TokenNametransient	
String	TokenNameIdentifier	 String
localHost	TokenNameIdentifier	 local Host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Server port. Used in toSafeURL() -- fix submitted by Ritesh Kumar. */	TokenNameCOMMENT_JAVADOC	 Server port. Used in toSafeURL() -- fix submitted by Ritesh Kumar. 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructor to use program defaults. */	TokenNameCOMMENT_JAVADOC	 Constructor to use program defaults. 
public	TokenNamepublic	
DefaultApplyXSLTProperties	TokenNameIdentifier	 Default Apply XSLT Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
setLocalHost	TokenNameIdentifier	 set Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setSystemProperties(); 	TokenNameCOMMENT_LINE	setSystemProperties(); 
}	TokenNameRBRACE	
/** * Constructor to use to override program defaults. * @param config Servlet configuration * @see #setLocalHost */	TokenNameCOMMENT_JAVADOC	 Constructor to use to override program defaults. @param config Servlet configuration @see #setLocalHost 
public	TokenNamepublic	
DefaultApplyXSLTProperties	TokenNameIdentifier	 Default Apply XSLT Properties
(	TokenNameLPAREN	
ServletConfig	TokenNameIdentifier	 Servlet Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getInitParameter	TokenNameIdentifier	 get Init Parameter
(	TokenNameLPAREN	
"catalog"	TokenNameStringLiteral	catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
=	TokenNameEQUAL	
cat	TokenNameIdentifier	 cat
;	TokenNameSEMICOLON	
else	TokenNameelse	
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
setLocalHost	TokenNameIdentifier	 set Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name of the local IP host name; this value will be used to constrain untrusted * XML document and XSL stylesheet URLs to this trusted host. * @see #getLocalHost */	TokenNameCOMMENT_JAVADOC	 Sets the name of the local IP host name; this value will be used to constrain untrusted XML document and XSL stylesheet URLs to this trusted host. @see #getLocalHost 
protected	TokenNameprotected	
void	TokenNamevoid	
setLocalHost	TokenNameIdentifier	 set Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
localHost	TokenNameIdentifier	 local Host
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getLocalHost	TokenNameIdentifier	 get Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
uhe	TokenNameIdentifier	 uhe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localHost	TokenNameIdentifier	 local Host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the name of trusted IP host. * @return Name of trusted host * @see #setLocalHost */	TokenNameCOMMENT_JAVADOC	 Returns the name of trusted IP host. @return Name of trusted host @see #setLocalHost 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalHost	TokenNameIdentifier	 get Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localHost	TokenNameIdentifier	 local Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a URL which is constrained to a trusted IP host. * @param xURL URL or file path to be made safe * @return Safe URL * @exception MalformedURLException Thrown when xURL is not a valid URL * @see #setLocalHost * @see #getLocalHost */	TokenNameCOMMENT_JAVADOC	 Returns a URL which is constrained to a trusted IP host. @param xURL URL or file path to be made safe @return Safe URL @exception MalformedURLException Thrown when xURL is not a valid URL @see #setLocalHost @see #getLocalHost 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
toSafeURL	TokenNameIdentifier	 to Safe URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xURL	TokenNameIdentifier	 x URL
,	TokenNameCOMMA	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
// Fix submitted by Ritesh Kumar. Port is included in construction of URL that is returned. 	TokenNameCOMMENT_LINE	Fix submitted by Ritesh Kumar. Port is included in construction of URL that is returned. 
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getServerPort	TokenNameIdentifier	 get Server Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xURL	TokenNameIdentifier	 x URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xURL	TokenNameIdentifier	 x URL
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"http"	TokenNameStringLiteral	http
,	TokenNameCOMMA	
localHost	TokenNameIdentifier	 local Host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
xURL	TokenNameIdentifier	 x URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
(	TokenNameLPAREN	
"toSafeURL(): "	TokenNameStringLiteral	toSafeURL(): 
+	TokenNamePLUS	
xURL	TokenNameIdentifier	 x URL
+	TokenNamePLUS	
" did not map to local"	TokenNameStringLiteral	 did not map to local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
URL	TokenNameIdentifier	 URL
tempURL	TokenNameIdentifier	 temp URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
tempURL	TokenNameIdentifier	 temp URL
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
xURL	TokenNameIdentifier	 x URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
(	TokenNameLPAREN	
"toSafeURL(): "	TokenNameStringLiteral	toSafeURL(): 
+	TokenNamePLUS	
xURL	TokenNameIdentifier	 x URL
+	TokenNamePLUS	
" not a valid URL"	TokenNameStringLiteral	 not a valid URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
tempURL	TokenNameIdentifier	 temp URL
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
localHost	TokenNameIdentifier	 local Host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
tempURL	TokenNameIdentifier	 temp URL
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
(	TokenNameLPAREN	
"toSafeURL(): "	TokenNameStringLiteral	toSafeURL(): 
+	TokenNamePLUS	
xURL	TokenNameIdentifier	 x URL
+	TokenNamePLUS	
" could not be converted to local host"	TokenNameStringLiteral	 could not be converted to local host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a string representing the constrained URL for the XML document. * If there is no request parameter for the XML document, return the configured default. * @param request May contain an XML document URL parameter * @return String form of XML URL * @exception MalformedURLException Thrown when request URL is not a valid URL or path * @see #toSafeURL */	TokenNameCOMMENT_JAVADOC	 Returns a string representing the constrained URL for the XML document. If there is no request parameter for the XML document, return the configured default. @param request May contain an XML document URL parameter @return String form of XML URL @exception MalformedURLException Thrown when request URL is not a valid URL or path @see #toSafeURL 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLurl	TokenNameIdentifier	 get XM Lurl
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
toSafeURL	TokenNameIdentifier	 to Safe URL
(	TokenNameLPAREN	
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"URL"	TokenNameStringLiteral	URL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getXMLurl	TokenNameIdentifier	 get XM Lurl
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representing the constrained URL for the XSL stylesheet * from the request. * @param request May contain an XSL stylesheet URL parameter * @return String form of request XSL URL, or null if request contains no xslURL parameter * @exception MalformedURLException Thrown when request URL is not a valid URL or path * @see #toSafeURL */	TokenNameCOMMENT_JAVADOC	 Returns a string representing the constrained URL for the XSL stylesheet from the request. @param request May contain an XSL stylesheet URL parameter @return String form of request XSL URL, or null if request contains no xslURL parameter @exception MalformedURLException Thrown when request URL is not a valid URL or path @see #toSafeURL 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXSLRequestURL	TokenNameIdentifier	 get XSL Request URL
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
toSafeURL	TokenNameIdentifier	 to Safe URL
(	TokenNameLPAREN	
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"xslURL"	TokenNameStringLiteral	xslURL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representing the constrained request URL for the XSL stylesheet. * If there is no request parameter for the XSL stylesheet, return the configured default. * @param request May contain an XSL stylesheet URL parameter * @return String form of XSL URL * @exception MalformedURLException Thrown when request URL is not a valid URL or path * @see #toSafeURL */	TokenNameCOMMENT_JAVADOC	 Returns a string representing the constrained request URL for the XSL stylesheet. If there is no request parameter for the XSL stylesheet, return the configured default. @param request May contain an XSL stylesheet URL parameter @return String form of XSL URL @exception MalformedURLException Thrown when request URL is not a valid URL or path @see #toSafeURL 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXSLurl	TokenNameIdentifier	 get XS Lurl
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
reqURL	TokenNameIdentifier	 req URL
=	TokenNameEQUAL	
getXSLRequestURL	TokenNameIdentifier	 get XSL Request URL
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reqURL	TokenNameIdentifier	 req URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
reqURL	TokenNameIdentifier	 req URL
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
toSafeURL	TokenNameIdentifier	 to Safe URL
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getXSLurl	TokenNameIdentifier	 get XS Lurl
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns URLs for all <a href="http://www.ccil.org/~cowan/XML/XCatalog.html">XCatalogs</a> * that are to be used to process the request. Catalogs are used to resolve XML public identifiers * into system identifiers. * <p>A single XCatalog can be configured as a default, * but multiple XCatalogs can be specified at request time to augment the configured default. * @param request May contain one or more XCatalog parameters * @return Array of strings for all catalog URLs */	TokenNameCOMMENT_JAVADOC	 Returns URLs for all <a href="http://www.ccil.org/~cowan/XML/XCatalog.html">XCatalogs</a> that are to be used to process the request. Catalogs are used to resolve XML public identifiers into system identifiers. <p>A single XCatalog can be configured as a default, but multiple XCatalogs can be specified at request time to augment the configured default. @param request May contain one or more XCatalog parameters @return Array of strings for all catalog URLs 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCatalog	TokenNameIdentifier	 get Catalog
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameterValues	TokenNameIdentifier	 get Parameter Values
(	TokenNameLPAREN	
"catalog"	TokenNameStringLiteral	catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
defaultArray	TokenNameIdentifier	 default Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
defaultArray	TokenNameIdentifier	 default Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defaultArray	TokenNameIdentifier	 default Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newCatalogs	TokenNameIdentifier	 new Catalogs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newCatalogs	TokenNameIdentifier	 new Catalogs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DEFAULT_catalog	TokenNameIdentifier	 DEFAULT catalog
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newCatalogs	TokenNameIdentifier	 new Catalogs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newCatalogs	TokenNameIdentifier	 new Catalogs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * I think we no longer need this. Sets the 3 jaxp core system properties. */	TokenNameCOMMENT_JAVADOC	 I think we no longer need this. Sets the 3 jaxp core system properties. 
protected	TokenNameprotected	
void	TokenNamevoid	
setSystemProperties	TokenNameIdentifier	 set System Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"javax.xml.transform.TransformerFactory"	TokenNameStringLiteral	javax.xml.transform.TransformerFactory
,	TokenNameCOMMA	
"org.apache.xalan.processor.TransformerFactoryImpl"	TokenNameStringLiteral	org.apache.xalan.processor.TransformerFactoryImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"javax.xml.parsers.DocumentBuilderFactory"	TokenNameStringLiteral	javax.xml.parsers.DocumentBuilderFactory
,	TokenNameCOMMA	
"org.apache.xerces.jaxp.DocumentBuilderFactoryImpl"	TokenNameStringLiteral	org.apache.xerces.jaxp.DocumentBuilderFactoryImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"javax.xml.parsers.SAXParserFactory"	TokenNameStringLiteral	javax.xml.parsers.SAXParserFactory
,	TokenNameCOMMA	
"org.apache.xerces.jaxp.SAXParserFactoryImpl"	TokenNameStringLiteral	org.apache.xerces.jaxp.SAXParserFactoryImpl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
systemProps	TokenNameIdentifier	 system Props
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
propEnum	TokenNameIdentifier	 prop Enum
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
propEnum	TokenNameIdentifier	 prop Enum
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
propEnum	TokenNameIdentifier	 prop Enum
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
systemProps	TokenNameIdentifier	 system Props
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
systemProps	TokenNameIdentifier	 system Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
systemProps	TokenNameIdentifier	 system Props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

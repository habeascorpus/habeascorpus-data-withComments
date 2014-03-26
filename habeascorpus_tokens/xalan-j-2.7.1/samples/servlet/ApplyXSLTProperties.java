/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ApplyXSLTProperties.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ApplyXSLTProperties.java 470245 2006-11-02 06:34:33Z minchau $ 
package	TokenNamepackage	
servlet	TokenNameIdentifier	 servlet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
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
/***************************************************************************************************** * * ApplyXSLTProperties contains operational parameters for ApplyXSLT based * on program defaults and configuration. * <p>This class is also used to return values for request-time parameters.</p> * * @author Spencer Shepard (sshepard@us.ibm.com) * @author R. Adam King (rak@us.ibm.com) * @author Tom Rowe (trowe@us.ibm.com) * *****************************************************************************************************/	TokenNameCOMMENT_JAVADOC	*************************************************************************************************** * ApplyXSLTProperties contains operational parameters for ApplyXSLT based on program defaults and configuration. <p>This class is also used to return values for request-time parameters.</p> * @author Spencer Shepard (sshepard@us.ibm.com) @author R. Adam King (rak@us.ibm.com) @author Tom Rowe (trowe@us.ibm.com) ****************************************************************************************************
public	TokenNamepublic	
class	TokenNameclass	
ApplyXSLTProperties	TokenNameIdentifier	 Apply XSLT Properties
{	TokenNameLBRACE	
/** * Program default for parameter "URL" */	TokenNameCOMMENT_JAVADOC	 Program default for parameter "URL" 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_URL	TokenNameIdentifier	 DEFAULT  URL
;	TokenNameSEMICOLON	
/** * Program default for parameter "xslURL" */	TokenNameCOMMENT_JAVADOC	 Program default for parameter "xslURL" 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_xslURL	TokenNameIdentifier	 DEFAULT xsl URL
;	TokenNameSEMICOLON	
/** * Program default for parameter "debug" */	TokenNameCOMMENT_JAVADOC	 Program default for parameter "debug" 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_debug	TokenNameIdentifier	 DEFAULT debug
;	TokenNameSEMICOLON	
/** * Program default for parameter "noConflictWarnings" */	TokenNameCOMMENT_JAVADOC	 Program default for parameter "noConflictWarnings" 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_noCW	TokenNameIdentifier	 DEFAULT no CW
;	TokenNameSEMICOLON	
/** * Constructor to use program defaults. */	TokenNameCOMMENT_JAVADOC	 Constructor to use program defaults. 
public	TokenNamepublic	
ApplyXSLTProperties	TokenNameIdentifier	 Apply XSLT Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DEFAULT_URL	TokenNameIdentifier	 DEFAULT  URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DEFAULT_xslURL	TokenNameIdentifier	 DEFAULT xsl URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
DEFAULT_debug	TokenNameIdentifier	 DEFAULT debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
DEFAULT_noCW	TokenNameIdentifier	 DEFAULT no CW
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor to use to override program defaults. * @param config Servlet configuration */	TokenNameCOMMENT_JAVADOC	 Constructor to use to override program defaults. @param config Servlet configuration 
public	TokenNamepublic	
ApplyXSLTProperties	TokenNameIdentifier	 Apply XSLT Properties
(	TokenNameLPAREN	
ServletConfig	TokenNameIdentifier	 Servlet Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xm	TokenNameIdentifier	 xm
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getInitParameter	TokenNameIdentifier	 get Init Parameter
(	TokenNameLPAREN	
"URL"	TokenNameStringLiteral	URL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xu	TokenNameIdentifier	 xu
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getInitParameter	TokenNameIdentifier	 get Init Parameter
(	TokenNameLPAREN	
"xslURL"	TokenNameStringLiteral	xslURL
)	TokenNameRPAREN	
,	TokenNameCOMMA	
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getInitParameter	TokenNameIdentifier	 get Init Parameter
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cw	TokenNameIdentifier	 cw
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getInitParameter	TokenNameIdentifier	 get Init Parameter
(	TokenNameLPAREN	
"noConflictWarnings"	TokenNameStringLiteral	noConflictWarnings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xm	TokenNameIdentifier	 xm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
DEFAULT_URL	TokenNameIdentifier	 DEFAULT  URL
=	TokenNameEQUAL	
xm	TokenNameIdentifier	 xm
;	TokenNameSEMICOLON	
else	TokenNameelse	
DEFAULT_URL	TokenNameIdentifier	 DEFAULT  URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xu	TokenNameIdentifier	 xu
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
DEFAULT_xslURL	TokenNameIdentifier	 DEFAULT xsl URL
=	TokenNameEQUAL	
xu	TokenNameIdentifier	 xu
;	TokenNameSEMICOLON	
else	TokenNameelse	
DEFAULT_xslURL	TokenNameIdentifier	 DEFAULT xsl URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
DEFAULT_debug	TokenNameIdentifier	 DEFAULT debug
=	TokenNameEQUAL	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
DEFAULT_debug	TokenNameIdentifier	 DEFAULT debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cw	TokenNameIdentifier	 cw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
DEFAULT_noCW	TokenNameIdentifier	 DEFAULT no CW
=	TokenNameEQUAL	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
cw	TokenNameIdentifier	 cw
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
DEFAULT_noCW	TokenNameIdentifier	 DEFAULT no CW
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a parameter name, returns the HTTP request's String value; * if not present in request, returns default String value. * @param request Request to check for default override * @param param Name of the parameter * @return String value of named parameter */	TokenNameCOMMENT_JAVADOC	 Given a parameter name, returns the HTTP request's String value; if not present in request, returns default String value. @param request Request to check for default override @param param Name of the parameter @return String value of named parameter 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
paramVals	TokenNameIdentifier	 param Vals
=	TokenNameEQUAL	
request	TokenNameIdentifier	 request
.	TokenNameDOT	
getParameterValues	TokenNameIdentifier	 get Parameter Values
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paramVals	TokenNameIdentifier	 param Vals
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
paramVals	TokenNameIdentifier	 param Vals
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current setting for "URL". * @param request Request to check for parameter value * @return String value for "URL" * @exception MalformedURLException Will not be thrown */	TokenNameCOMMENT_JAVADOC	 Returns the current setting for "URL". @param request Request to check for parameter value @return String value for "URL" @exception MalformedURLException Will not be thrown 
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
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"URL"	TokenNameStringLiteral	URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DEFAULT_URL	TokenNameIdentifier	 DEFAULT  URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current setting for "xslURL". * @param request Request to check for parameter value * @return String value for "xslURL" * @exception MalformedURLException Will not be thrown */	TokenNameCOMMENT_JAVADOC	 Returns the current setting for "xslURL". @param request Request to check for parameter value @return String value for "xslURL" @exception MalformedURLException Will not be thrown 
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
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"xslURL"	TokenNameStringLiteral	xslURL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DEFAULT_xslURL	TokenNameIdentifier	 DEFAULT xsl URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current setting for "debug". * @param request Request to check for parameter value * @return Boolean value for "debug" */	TokenNameCOMMENT_JAVADOC	 Returns the current setting for "debug". @param request Request to check for parameter value @return Boolean value for "debug" 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDebug	TokenNameIdentifier	 is Debug
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DEFAULT_debug	TokenNameIdentifier	 DEFAULT debug
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current setting for "noConflictWarnings". * @param request Request to check for parameter value * @return Boolean value for "noConflictWarnings" */	TokenNameCOMMENT_JAVADOC	 Returns the current setting for "noConflictWarnings". @param request Request to check for parameter value @return Boolean value for "noConflictWarnings" 
boolean	TokenNameboolean	
isNoCW	TokenNameIdentifier	 is No CW
(	TokenNameLPAREN	
HttpServletRequest	TokenNameIdentifier	 Http Servlet Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
getRequestParmString	TokenNameIdentifier	 get Request Parm String
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
"noConflictWarnings"	TokenNameStringLiteral	noConflictWarnings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DEFAULT_noCW	TokenNameIdentifier	 DEFAULT no CW
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

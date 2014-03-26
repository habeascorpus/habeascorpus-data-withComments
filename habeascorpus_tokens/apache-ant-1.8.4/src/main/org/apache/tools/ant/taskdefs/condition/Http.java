/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
ProjectComponent	TokenNameIdentifier	 Project Component
;	TokenNameSEMICOLON	
/** * Condition to wait for a HTTP request to succeed. Its attribute(s) are: * url - the URL of the request. * errorsBeginAt - number at which errors begin at; default=400. * requestMethod - HTTP request method to use; GET, HEAD, etc. default=GET * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Condition to wait for a HTTP request to succeed. Its attribute(s) are: url - the URL of the request. errorsBeginAt - number at which errors begin at; default=400. requestMethod - HTTP request method to use; GET, HEAD, etc. default=GET @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
Http	TokenNameIdentifier	 Http
extends	TokenNameextends	
ProjectComponent	TokenNameIdentifier	 Project Component
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ERROR_BEGINS	TokenNameIdentifier	 ERROR  BEGINS
=	TokenNameEQUAL	
400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_REQUEST_METHOD	TokenNameIdentifier	 DEFAULT  REQUEST  METHOD
=	TokenNameEQUAL	
"GET"	TokenNameStringLiteral	GET
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
requestMethod	TokenNameIdentifier	 request Method
=	TokenNameEQUAL	
DEFAULT_REQUEST_METHOD	TokenNameIdentifier	 DEFAULT  REQUEST  METHOD
;	TokenNameSEMICOLON	
/** * Set the url attribute * @param url the url of the request */	TokenNameCOMMENT_JAVADOC	 Set the url attribute @param url the url of the request 
public	TokenNamepublic	
void	TokenNamevoid	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spec	TokenNameIdentifier	 spec
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
errorsBeginAt	TokenNameIdentifier	 errors Begin At
=	TokenNameEQUAL	
ERROR_BEGINS	TokenNameIdentifier	 ERROR  BEGINS
;	TokenNameSEMICOLON	
/** * Set the errorsBeginAt attribute * @param errorsBeginAt number at which errors begin at, default is * 400 */	TokenNameCOMMENT_JAVADOC	 Set the errorsBeginAt attribute @param errorsBeginAt number at which errors begin at, default is 400 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorsBeginAt	TokenNameIdentifier	 set Errors Begin At
(	TokenNameLPAREN	
int	TokenNameint	
errorsBeginAt	TokenNameIdentifier	 errors Begin At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorsBeginAt	TokenNameIdentifier	 errors Begin At
=	TokenNameEQUAL	
errorsBeginAt	TokenNameIdentifier	 errors Begin At
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the method to be used when issuing the HTTP request. * * @param method The HTTP request method to use. Valid values are * the same as those accepted by the * HttpURLConnection.setRequestMetho d() method, * such as "GET", "HEAD", "TRACE", etc. The default * if not specified is "GET". * * @see java.net.HttpURLConnection#setRequestMethod * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the method to be used when issuing the HTTP request. * @param method The HTTP request method to use. Valid values are the same as those accepted by the HttpURLConnection.setRequestMetho d() method, such as "GET", "HEAD", "TRACE", etc. The default if not specified is "GET". * @see java.net.HttpURLConnection#setRequestMethod @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setRequestMethod	TokenNameIdentifier	 set Request Method
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
requestMethod	TokenNameIdentifier	 request Method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DEFAULT_REQUEST_METHOD	TokenNameIdentifier	 DEFAULT  REQUEST  METHOD
:	TokenNameCOLON	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the HTTP request succeeds * @exception BuildException if an error occurs */	TokenNameCOMMENT_JAVADOC	 @return true if the HTTP request succeeds @exception BuildException if an error occurs 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"No url specified in http condition"	TokenNameStringLiteral	No url specified in http condition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Checking for "	TokenNameStringLiteral	Checking for 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
spec	TokenNameIdentifier	 spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
URLConnection	TokenNameIdentifier	 URL Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
conn	TokenNameIdentifier	 conn
instanceof	TokenNameinstanceof	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
http	TokenNameIdentifier	 http
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
)	TokenNameRPAREN	
conn	TokenNameIdentifier	 conn
;	TokenNameSEMICOLON	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
setRequestMethod	TokenNameIdentifier	 set Request Method
(	TokenNameLPAREN	
requestMethod	TokenNameIdentifier	 request Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
http	TokenNameIdentifier	 http
.	TokenNameDOT	
getResponseCode	TokenNameIdentifier	 get Response Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Result code for "	TokenNameStringLiteral	Result code for 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
+	TokenNamePLUS	
" was "	TokenNameStringLiteral	 was 
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
errorsBeginAt	TokenNameIdentifier	 errors Begin At
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ProtocolException	TokenNameIdentifier	 Protocol Exception
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid HTTP protocol: "	TokenNameStringLiteral	Invalid HTTP protocol: 
+	TokenNamePLUS	
requestMethod	TokenNameIdentifier	 request Method
,	TokenNameCOMMA	
pe	TokenNameIdentifier	 pe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Badly formed URL: "	TokenNameStringLiteral	Badly formed URL: 
+	TokenNamePLUS	
spec	TokenNameIdentifier	 spec
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
/** * Protocol Handler for the 'jar' protocol. * This appears to have the format: * jar:<URL for jar file>!<path in jar file> * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ParsedURLJarProtocolHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Protocol Handler for the 'jar' protocol. This appears to have the format: jar:<URL for jar file>!<path in jar file> * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ParsedURLJarProtocolHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ParsedURLJarProtocolHandler	TokenNameIdentifier	 Parsed URL Jar Protocol Handler
extends	TokenNameextends	
ParsedURLDefaultProtocolHandler	TokenNameIdentifier	 Parsed URL Default Protocol Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAR	TokenNameIdentifier	 JAR
=	TokenNameEQUAL	
"jar"	TokenNameStringLiteral	jar
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParsedURLJarProtocolHandler	TokenNameIdentifier	 Parsed URL Jar Protocol Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
JAR	TokenNameIdentifier	 JAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We mostly use the base class parse methods (that leverage 	TokenNameCOMMENT_LINE	We mostly use the base class parse methods (that leverage 
// java.net.URL. But we take care to ignore the baseURL if urlStr 	TokenNameCOMMENT_LINE	java.net.URL. But we take care to ignore the baseURL if urlStr 
// is an absolute URL. 	TokenNameCOMMENT_LINE	is an absolute URL. 
public	TokenNamepublic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
JAR	TokenNameIdentifier	 JAR
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// urlStr is absolute... 	TokenNameCOMMENT_LINE	urlStr is absolute... 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
JAR	TokenNameIdentifier	 JAR
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It's relative so base it off baseURL. 	TokenNameCOMMENT_LINE	It's relative so base it off baseURL. 
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
constructParsedURLData	TokenNameIdentifier	 construct Parsed URL Data
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

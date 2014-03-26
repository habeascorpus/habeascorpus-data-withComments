/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
psibt	TokenNameIdentifier	 psibt
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * This interface defines all methods that have to be implemented for a HTTPRequestHandler for the * PluggableHTTPServer. * * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> */	TokenNameCOMMENT_JAVADOC	 This interface defines all methods that have to be implemented for a HTTPRequestHandler for the PluggableHTTPServer. * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> 
public	TokenNamepublic	
interface	TokenNameinterface	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
{	TokenNameLBRACE	
/** * Gets the title for html page */	TokenNameCOMMENT_JAVADOC	 Gets the title for html page 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the title for html page */	TokenNameCOMMENT_JAVADOC	 Sets the title for html page 
public	TokenNamepublic	
void	TokenNamevoid	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the description for html page */	TokenNameCOMMENT_JAVADOC	 Gets the description for html page 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the description for html page */	TokenNameCOMMENT_JAVADOC	 Sets the description for html page 
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the virtual path in the HTTP server that ist handled in this HTTPRequestHandler. * So the root path handler will return "/" (without brackets) because it handles the path * "http://servername/" or a handler for "http://servername/somepath/" will return "/somepath/" * It is important to include the trailing "/" because all HTTPRequestHandler have to serve a path! */	TokenNameCOMMENT_JAVADOC	 Gets the virtual path in the HTTP server that ist handled in this HTTPRequestHandler. So the root path handler will return "/" (without brackets) because it handles the path "http://servername/" or a handler for "http://servername/somepath/" will return "/somepath/" It is important to include the trailing "/" because all HTTPRequestHandler have to serve a path! 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHandledPath	TokenNameIdentifier	 get Handled Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the virtual path in the HTTP server that ist handled in this HTTPRequestHandler. * So set the path to "/" for the root path handler because it handles the path * "http://servername/" or set it to "/somepath/" for a handler for "http://servername/somepath/". * It is important to include the trailing "/" because all HTTPRequestHandler have to serve a path! */	TokenNameCOMMENT_JAVADOC	 Sets the virtual path in the HTTP server that ist handled in this HTTPRequestHandler. So set the path to "/" for the root path handler because it handles the path "http://servername/" or set it to "/somepath/" for a handler for "http://servername/somepath/". It is important to include the trailing "/" because all HTTPRequestHandler have to serve a path! 
public	TokenNamepublic	
void	TokenNamevoid	
setHandledPath	TokenNameIdentifier	 set Handled Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Handles the given request and writes the reply to the given out-stream. Every handler has to check * the request for the right path info. * * @param request - client browser request * @param out - Out stream for sending data to client browser * @return if the request was handled by this handler : true, else : false */	TokenNameCOMMENT_JAVADOC	 Handles the given request and writes the reply to the given out-stream. Every handler has to check the request for the right path info. * @param request - client browser request @param out - Out stream for sending data to client browser @return if the request was handled by this handler : true, else : false 
public	TokenNamepublic	
boolean	TokenNameboolean	
handleRequest	TokenNameIdentifier	 handle Request
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

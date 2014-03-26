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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * This class implements a RequestHandler for the root path "/" in the PluggableHTTPServer. * A simple HTML message will be replied to the client. * * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> */	TokenNameCOMMENT_JAVADOC	 This class implements a RequestHandler for the root path "/" in the PluggableHTTPServer. A simple HTML message will be replied to the client. * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> 
public	TokenNamepublic	
class	TokenNameclass	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
implements	TokenNameimplements	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
handledPath	TokenNameIdentifier	 handled Path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ReplyType	TokenNameIdentifier	 Reply Type
=	TokenNameEQUAL	
"Content-type: text/html "	TokenNameStringLiteral	Content-type: text/html 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ReplyHTML	TokenNameIdentifier	 Reply HTML
=	TokenNameEQUAL	
"<HTML><HEAD><TITLE>Root</TITLE></HEAD> "	TokenNameStringLiteral	<HTML><HEAD><TITLE>Root</TITLE></HEAD> 
+	TokenNamePLUS	
"<BODY><H1>Root</H1> "	TokenNameStringLiteral	<BODY><H1>Root</H1> 
+	TokenNamePLUS	
"</BODY></HTML> "	TokenNameStringLiteral	</BODY></HTML> 
;	TokenNameSEMICOLON	
/** * Creates a new RootRequestHandler object */	TokenNameCOMMENT_JAVADOC	 Creates a new RootRequestHandler object 
public	TokenNamepublic	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
"root page"	TokenNameStringLiteral	root page
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"root page"	TokenNameStringLiteral	root page
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setHandledPath	TokenNameIdentifier	 set Handled Path
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the content type of the reply HTTP message * * @return content type as String */	TokenNameCOMMENT_JAVADOC	 Gets the content type of the reply HTTP message * @return content type as String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReplyType	TokenNameIdentifier	 get Reply Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
ReplyType	TokenNameIdentifier	 Reply Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the content type of the reply HTTP message * * @param ReplyType - content type as String */	TokenNameCOMMENT_JAVADOC	 Sets the content type of the reply HTTP message * @param ReplyType - content type as String 
public	TokenNamepublic	
void	TokenNamevoid	
setReplyType	TokenNameIdentifier	 set Reply Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ReplyType	TokenNameIdentifier	 Reply Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ReplyType	TokenNameIdentifier	 Reply Type
=	TokenNameEQUAL	
ReplyType	TokenNameIdentifier	 Reply Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the HTML data of the reply HTTP message * * @return HTML message as String */	TokenNameCOMMENT_JAVADOC	 Gets the HTML data of the reply HTTP message * @return HTML message as String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReplyHTML	TokenNameIdentifier	 get Reply HTML
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
ReplyHTML	TokenNameIdentifier	 Reply HTML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the HTML data of the reply HTTP message * * @param ReplyHTML - HTML message as String */	TokenNameCOMMENT_JAVADOC	 Sets the HTML data of the reply HTTP message * @param ReplyHTML - HTML message as String 
public	TokenNamepublic	
void	TokenNamevoid	
setReplyHTML	TokenNameIdentifier	 set Reply HTML
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ReplyHTML	TokenNameIdentifier	 Reply HTML
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ReplyHTML	TokenNameIdentifier	 Reply HTML
=	TokenNameEQUAL	
ReplyHTML	TokenNameIdentifier	 Reply HTML
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the title for html page */	TokenNameCOMMENT_JAVADOC	 Gets the title for html page 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the title for html page */	TokenNameCOMMENT_JAVADOC	 Sets the title for html page 
public	TokenNamepublic	
void	TokenNamevoid	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the description for html page */	TokenNameCOMMENT_JAVADOC	 Gets the description for html page 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the description for html page */	TokenNameCOMMENT_JAVADOC	 Sets the description for html page 
public	TokenNamepublic	
void	TokenNamevoid	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
description	TokenNameIdentifier	 description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
description	TokenNameIdentifier	 description
=	TokenNameEQUAL	
description	TokenNameIdentifier	 description
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the server path * * @return the server path */	TokenNameCOMMENT_JAVADOC	 Gets the server path * @return the server path 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHandledPath	TokenNameIdentifier	 get Handled Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
handledPath	TokenNameIdentifier	 handled Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the server path * * @param path - the server path */	TokenNameCOMMENT_JAVADOC	 Sets the server path * @param path - the server path 
public	TokenNamepublic	
void	TokenNamevoid	
setHandledPath	TokenNameIdentifier	 set Handled Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
handledPath	TokenNameIdentifier	 handled Path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles the given request and writes the reply to the given out-stream. * * @param request - client browser request * @param out - Out stream for sending data to client browser * @return if the request was handled by this handler : true, else : false */	TokenNameCOMMENT_JAVADOC	 Handles the given request and writes the reply to the given out-stream. * @param request - client browser request @param out - Out stream for sending data to client browser @return if the request was handled by this handler : true, else : false 
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
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
"http://localhost"	TokenNameStringLiteral	http://localhost
+	TokenNamePLUS	
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
handledPath	TokenNameIdentifier	 handled Path
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"HTTP/1.0 200 OK "	TokenNameStringLiteral	HTTP/1.0 200 OK 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ReplyType	TokenNameIdentifier	 Reply Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ReplyType	TokenNameIdentifier	 Reply Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ReplyHTML	TokenNameIdentifier	 Reply HTML
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ReplyHTML	TokenNameIdentifier	 Reply HTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

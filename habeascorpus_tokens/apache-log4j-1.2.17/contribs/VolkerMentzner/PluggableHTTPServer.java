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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * This class implements a HTTP-server frame. All HTTP-requests are handled by HTTPRequestHandler * classes which implement the <code>HTTPRequestHandler</code> interface. Every RequestHandler has * to be registered in the PluggableHTTPServer with the <code>addRequestHandler</code> method. * A new thread is created for each connection to handle the request. If all reply data are sent * to the client the connection is closed and the thread ends. * An example how to use the PluggableHTTPServer class can be found in the <code>main</code> method * at the end of the source file. * * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> */	TokenNameCOMMENT_JAVADOC	 This class implements a HTTP-server frame. All HTTP-requests are handled by HTTPRequestHandler classes which implement the <code>HTTPRequestHandler</code> interface. Every RequestHandler has to be registered in the PluggableHTTPServer with the <code>addRequestHandler</code> method. A new thread is created for each connection to handle the request. If all reply data are sent to the client the connection is closed and the thread ends. An example how to use the PluggableHTTPServer class can be found in the <code>main</code> method at the end of the source file. * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> 
public	TokenNamepublic	
class	TokenNameclass	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
=	TokenNameEQUAL	
80	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"PluggableHTTPServer"	TokenNameStringLiteral	PluggableHTTPServer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ServerSocket	TokenNameIdentifier	 Server Socket
server	TokenNameIdentifier	 server
;	TokenNameSEMICOLON	
/** * Creates a new server object on the given TCP port. * If the port is occupied by another process a IOException (java.net.BindException) is thrown. * * @param port - TCP port number to listen on for requests */	TokenNameCOMMENT_JAVADOC	 Creates a new server object on the given TCP port. If the port is occupied by another process a IOException (java.net.BindException) is thrown. * @param port - TCP port number to listen on for requests 
public	TokenNamepublic	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerSocket	TokenNameIdentifier	 Server Socket
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new server object on the default TCP port 80 * If the port is occupied by another process a IOException (java.net.BindException) is thrown. */	TokenNameCOMMENT_JAVADOC	 Creates a new server object on the default TCP port 80 If the port is occupied by another process a IOException (java.net.BindException) is thrown. 
public	TokenNamepublic	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers the given HTTPRequestHandler * * @param h - the HTTPRequestHandler to register */	TokenNameCOMMENT_JAVADOC	 Registers the given HTTPRequestHandler * @param h - the HTTPRequestHandler to register 
public	TokenNamepublic	
void	TokenNamevoid	
addRequestHandler	TokenNameIdentifier	 add Request Handler
(	TokenNameLPAREN	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unregisters the given HTTPRequestHandler * * @param h - the HTTPRequestHandler to unregister */	TokenNameCOMMENT_JAVADOC	 Unregisters the given HTTPRequestHandler * @param h - the HTTPRequestHandler to unregister 
public	TokenNamepublic	
void	TokenNamevoid	
removeRequestHandler	TokenNameIdentifier	 remove Request Handler
(	TokenNameLPAREN	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sends the HTTP message 404 - File Not Found * see RFC2616 for details * * @param out - Out stream for sending data to client browser */	TokenNameCOMMENT_JAVADOC	 Sends the HTTP message 404 - File Not Found see RFC2616 for details * @param out - Out stream for sending data to client browser 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
replyNotFound	TokenNameIdentifier	 reply Not Found
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"HTTP/1.0 404 Not Found "	TokenNameStringLiteral	HTTP/1.0 404 Not Found 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<HTML><HEAD><TITLE>Not Found</TITLE></HEAD> "	TokenNameStringLiteral	<HTML><HEAD><TITLE>Not Found</TITLE></HEAD> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<BODY><H1>Not Found</H1> "	TokenNameStringLiteral	<BODY><H1>Not Found</H1> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"</BODY></HTML> "	TokenNameStringLiteral	</BODY></HTML> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end try 	TokenNameCOMMENT_LINE	end try 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sends the HTTP message 405 - Method Not Allowed * see RFC2616 for details * * @param out - Out stream for sending data to client browser */	TokenNameCOMMENT_JAVADOC	 Sends the HTTP message 405 - Method Not Allowed see RFC2616 for details * @param out - Out stream for sending data to client browser 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
replyMethodNotAllowed	TokenNameIdentifier	 reply Method Not Allowed
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"HTTP/1.1 405 Method Not Allowed "	TokenNameStringLiteral	HTTP/1.1 405 Method Not Allowed 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"Allow: GET, PUT "	TokenNameStringLiteral	Allow: GET, PUT 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<HTML><HEAD><TITLE>Method Not Allowed</TITLE></HEAD> "	TokenNameStringLiteral	<HTML><HEAD><TITLE>Method Not Allowed</TITLE></HEAD> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<BODY><H1>Method Not Allowed</H1> "	TokenNameStringLiteral	<BODY><H1>Method Not Allowed</H1> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"</BODY></HTML> "	TokenNameStringLiteral	</BODY></HTML> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end try 	TokenNameCOMMENT_LINE	end try 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates the ReplyHTML data for the root page * * @param index - index of the RootRequestHandler */	TokenNameCOMMENT_JAVADOC	 Creates the ReplyHTML data for the root page * @param index - index of the RootRequestHandler 
public	TokenNamepublic	
void	TokenNamevoid	
autoCreateRootPage	TokenNameIdentifier	 auto Create Root Page
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
html	TokenNameIdentifier	 html
=	TokenNameEQUAL	
"<HTML><HEAD><TITLE>"	TokenNameStringLiteral	<HTML><HEAD><TITLE>
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</TITLE></HEAD> "	TokenNameStringLiteral	</TITLE></HEAD> 
;	TokenNameSEMICOLON	
html	TokenNameIdentifier	 html
=	TokenNameEQUAL	
html	TokenNameIdentifier	 html
+	TokenNamePLUS	
"<BODY><H1>"	TokenNameStringLiteral	<BODY><H1>
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</H1> "	TokenNameStringLiteral	</H1> 
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
html	TokenNameIdentifier	 html
=	TokenNameEQUAL	
html	TokenNameIdentifier	 html
+	TokenNamePLUS	
"<a href=""	TokenNameStringLiteral	<a href="
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHandledPath	TokenNameIdentifier	 get Handled Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
html	TokenNameIdentifier	 html
=	TokenNameEQUAL	
html	TokenNameIdentifier	 html
+	TokenNamePLUS	
"">"	TokenNameStringLiteral	">
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</a><br>"	TokenNameStringLiteral	</a><br>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
html	TokenNameIdentifier	 html
=	TokenNameEQUAL	
html	TokenNameIdentifier	 html
+	TokenNamePLUS	
"</BODY></HTML> "	TokenNameStringLiteral	</BODY></HTML> 
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setReplyHTML	TokenNameIdentifier	 set Reply HTML
(	TokenNameLPAREN	
html	TokenNameIdentifier	 html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Main loop of the PluggableHTTPServer */	TokenNameCOMMENT_JAVADOC	 Main loop of the PluggableHTTPServer 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Socket	TokenNameIdentifier	 Socket
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class handles the incomming connection for one request. */	TokenNameCOMMENT_JAVADOC	 This class handles the incomming connection for one request. 
class	TokenNameclass	
ServerThread	TokenNameIdentifier	 Server Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
Socket	TokenNameIdentifier	 Socket
connection	TokenNameIdentifier	 connection
;	TokenNameSEMICOLON	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
Socket	TokenNameIdentifier	 Socket
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serves the HTTP request. */	TokenNameCOMMENT_JAVADOC	 Serves the HTTP request. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Writer	TokenNameIdentifier	 Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"ASCII"	TokenNameStringLiteral	ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the first line only; that's all we need 	TokenNameCOMMENT_LINE	read the first line only; that's all we need 
StringBuffer	TokenNameIdentifier	 String Buffer
req	TokenNameIdentifier	 req
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
req	TokenNameIdentifier	 req
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
get	TokenNameIdentifier	 get
=	TokenNameEQUAL	
req	TokenNameIdentifier	 req
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
get	TokenNameIdentifier	 get
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
get	TokenNameIdentifier	 get
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
request	TokenNameIdentifier	 request
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"GET"	TokenNameStringLiteral	GET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
served	TokenNameIdentifier	 served
=	TokenNameEQUAL	
false	TokenNamefalse	
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HTTPRequestHandler	TokenNameIdentifier	 HTTP Request Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
handleRequest	TokenNameIdentifier	 handle Request
(	TokenNameLPAREN	
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
served	TokenNameIdentifier	 served
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
served	TokenNameIdentifier	 served
)	TokenNameRPAREN	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
.	TokenNameDOT	
replyNotFound	TokenNameIdentifier	 reply Not Found
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
.	TokenNameDOT	
replyMethodNotAllowed	TokenNameIdentifier	 reply Method Not Allowed
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end try 	TokenNameCOMMENT_LINE	end try 
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
connection	TokenNameIdentifier	 connection
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end run 	TokenNameCOMMENT_LINE	end run 
}	TokenNameRBRACE	
// end class ServerThread 	TokenNameCOMMENT_LINE	end class ServerThread 
/** * Demo how to use the PluggableHTTPServer. */	TokenNameCOMMENT_JAVADOC	 Demo how to use the PluggableHTTPServer. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
thePort	TokenNameIdentifier	 the Port
;	TokenNameSEMICOLON	
// create some logging stuff 	TokenNameCOMMENT_LINE	create some logging stuff 
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Category	TokenNameIdentifier	 Category
cat1	TokenNameIdentifier	 cat1
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"cat1"	TokenNameStringLiteral	cat1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat1	TokenNameIdentifier	 cat1
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m%n"	TokenNameStringLiteral	%m%n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Category	TokenNameIdentifier	 Category
cat2	TokenNameIdentifier	 cat2
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
"cat2"	TokenNameStringLiteral	cat2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat2	TokenNameIdentifier	 cat2
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat2	TokenNameIdentifier	 cat2
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%c - %m%n"	TokenNameStringLiteral	%c - %m%n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set TCP port number 	TokenNameCOMMENT_LINE	set TCP port number 
try	TokenNametry	
{	TokenNameLBRACE	
thePort	TokenNameIdentifier	 the Port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thePort	TokenNameIdentifier	 the Port
=	TokenNameEQUAL	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
.	TokenNameDOT	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
PluggableHTTPServer	TokenNameIdentifier	 Pluggable HTTP Server
(	TokenNameLPAREN	
thePort	TokenNameIdentifier	 the Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
addRequestHandler	TokenNameIdentifier	 add Request Handler
(	TokenNameLPAREN	
new	TokenNamenew	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
addRequestHandler	TokenNameIdentifier	 add Request Handler
(	TokenNameLPAREN	
new	TokenNamenew	
Log4jRequestHandler	TokenNameIdentifier	 Log4j Request Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
addRequestHandler	TokenNameIdentifier	 add Request Handler
(	TokenNameLPAREN	
new	TokenNamenew	
UserDialogRequestHandler	TokenNameIdentifier	 User Dialog Request Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
autoCreateRootPage	TokenNameIdentifier	 auto Create Root Page
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
server	TokenNameIdentifier	 server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
thePort	TokenNameIdentifier	 the Port
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end main 	TokenNameCOMMENT_LINE	end main 
}	TokenNameRBRACE	

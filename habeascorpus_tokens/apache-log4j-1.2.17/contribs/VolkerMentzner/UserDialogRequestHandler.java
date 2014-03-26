/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Title: PSI Java Framework: UserDialogRequestHandler<p> * Copyright: PSI-BT AG<p> * History: * Date Author What's new * 16.04.2001 VMentzner Created */	TokenNameCOMMENT_JAVADOC	 Title: PSI Java Framework: UserDialogRequestHandler<p> Copyright: PSI-BT AG<p> History: Date Author What's new 16.04.2001 VMentzner Created 
package	TokenNamepackage	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
psibt	TokenNameIdentifier	 psibt
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
/** * This class implements a RequestHandler for the path "/userdialog/" in the PluggableHTTPServer. * A simple input form is presented in the browser where you can enter a message. This message will be sent * to the PluggableHTTPServer and shown in a JOptionPane MessageDialog. * * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> */	TokenNameCOMMENT_JAVADOC	 This class implements a RequestHandler for the path "/userdialog/" in the PluggableHTTPServer. A simple input form is presented in the browser where you can enter a message. This message will be sent to the PluggableHTTPServer and shown in a JOptionPane MessageDialog. * @author <a HREF="mailto:V.Mentzner@psi-bt.de">Volker Mentzner</a> 
public	TokenNamepublic	
class	TokenNameclass	
UserDialogRequestHandler	TokenNameIdentifier	 User Dialog Request Handler
extends	TokenNameextends	
RootRequestHandler	TokenNameIdentifier	 Root Request Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
Component	TokenNameIdentifier	 Component
parentComponent	TokenNameIdentifier	 parent Component
;	TokenNameSEMICOLON	
/** * Creates a new UserDialogRequestHandler object */	TokenNameCOMMENT_JAVADOC	 Creates a new UserDialogRequestHandler object 
public	TokenNamepublic	
UserDialogRequestHandler	TokenNameIdentifier	 User Dialog Request Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new UserDialogRequestHandler object with a parentComponent reference */	TokenNameCOMMENT_JAVADOC	 Creates a new UserDialogRequestHandler object with a parentComponent reference 
public	TokenNamepublic	
UserDialogRequestHandler	TokenNameIdentifier	 User Dialog Request Handler
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
parentComponent	TokenNameIdentifier	 parent Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
"user dialog"	TokenNameStringLiteral	user dialog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"show user dialog"	TokenNameStringLiteral	show user dialog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setHandledPath	TokenNameIdentifier	 set Handled Path
(	TokenNameLPAREN	
"/userdialog/"	TokenNameStringLiteral	/userdialog/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentComponent	TokenNameIdentifier	 parent Component
=	TokenNameEQUAL	
parentComponent	TokenNameIdentifier	 parent Component
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
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getHandledPath	TokenNameIdentifier	 get Handled Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"Content-type: text/html "	TokenNameStringLiteral	Content-type: text/html 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<HTML><HEAD><TITLE>"	TokenNameStringLiteral	<HTML><HEAD><TITLE>
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</TITLE></HEAD> "	TokenNameStringLiteral	</TITLE></HEAD> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<BODY><H1>"	TokenNameStringLiteral	<BODY><H1>
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</H1> "	TokenNameStringLiteral	</H1> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// replace '+' by space 	TokenNameCOMMENT_LINE	replace '+' by space 
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// replace hex strings starting with '%' by their values 	TokenNameCOMMENT_LINE	replace hex strings starting with '%' by their values 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"%"	TokenNameStringLiteral	%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
sl	TokenNameIdentifier	 sl
+	TokenNamePLUS	
sm	TokenNameIdentifier	 sm
+	TokenNamePLUS	
sr	TokenNameIdentifier	 sr
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"%"	TokenNameStringLiteral	%
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// show message in a new thread 	TokenNameCOMMENT_LINE	show message in a new thread 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
DialogThread	TokenNameIdentifier	 Dialog Thread
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<form name="Formular" ACTION=""	TokenNameStringLiteral	<form name="Formular" ACTION="
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getHandledPath	TokenNameIdentifier	 get Handled Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"+" METHOD="PUT">"	TokenNameStringLiteral	+" METHOD="PUT">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<table> "	TokenNameStringLiteral	<table> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" <tr><td>Send message to user</td></tr> "	TokenNameStringLiteral	 <tr><td>Send message to user</td></tr> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" <tr><td><textarea name="message" rows=10 cols=50></textarea></td></tr> "	TokenNameStringLiteral	 <tr><td><textarea name="message" rows=10 cols=50></textarea></td></tr> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"</table> "	TokenNameStringLiteral	</table> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<input type=submit value="Submit">"	TokenNameStringLiteral	<input type=submit value="Submit">
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"</form>"	TokenNameStringLiteral	</form>
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
/** * Internal class to start the user dialog in a new thread. This makes the RequestHandler return * immediatly */	TokenNameCOMMENT_JAVADOC	 Internal class to start the user dialog in a new thread. This makes the RequestHandler return immediatly 
class	TokenNameclass	
DialogThread	TokenNameIdentifier	 Dialog Thread
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
Component	TokenNameIdentifier	 Component
parentComponent	TokenNameIdentifier	 parent Component
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DialogThread	TokenNameIdentifier	 Dialog Thread
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentComponent	TokenNameIdentifier	 parent Component
=	TokenNameEQUAL	
parentComponent	TokenNameIdentifier	 parent Component
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showMessageDialog	TokenNameIdentifier	 show Message Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

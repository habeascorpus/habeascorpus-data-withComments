/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * The original version of this class was donated by Jason Hunter, * who wrote the class as part of the com.oreilly.servlet * package for his book "Java Servlet Programming" (O'Reilly). * See http://www.servlets.com. * */	TokenNameCOMMENT_BLOCK	 The original version of this class was donated by Jason Hunter, who wrote the class as part of the com.oreilly.servlet package for his book "Java Servlet Programming" (O'Reilly). See http://www.servlets.com. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
mail	TokenNameIdentifier	 mail
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** * A class to help send SMTP email. * This class is an improvement on the sun.net.smtp.SmtpClient class * found in the JDK. This version has extra functionality, and can be used * with JVMs that did not extend from the JDK. It's not as robust as * the JavaMail Standard Extension classes, but it's easier to use and * easier to install, and has an Open Source license. * <p> * It can be used like this: * <blockquote><pre> * String mailhost = "localhost"; // or another mail host * String from = "Mail Message Servlet &lt;MailMessage@server.com&gt;"; * String to = "to@you.com"; * String cc1 = "cc1@you.com"; * String cc2 = "cc2@you.com"; * String bcc = "bcc@you.com"; * &nbsp; * MailMessage msg = new MailMessage(mailhost); * msg.setPort(25); * msg.from(from); * msg.to(to); * msg.cc(cc1); * msg.cc(cc2); * msg.bcc(bcc); * msg.setSubject("Test subject"); * PrintStream out = msg.getPrintStream(); * &nbsp; * Enumeration enum = req.getParameterNames(); * while (enum.hasMoreElements()) { * String name = (String)enum.nextElement(); * String value = req.getParameter(name); * out.println(name + " = " + value); * } * &nbsp; * msg.sendAndClose(); * </pre></blockquote> * <p> * Be sure to set the from address, then set the recepient * addresses, then set the subject and other headers, then get the * PrintStream, then write the message, and finally send and close. * The class does minimal error checking internally; it counts on the mail * host to complain if there's any malformatted input or out of order * execution. * <p> * An attachment mechanism based on RFC 1521 could be implemented on top of * this class. In the meanwhile, JavaMail is the best solution for sending * email with attachments. * <p> * Still to do: * <ul> * <li>Figure out how to close the connection in case of error * </ul> * * @version 1.1, 2000/03/19, added angle brackets to address, helps some servers * version 1.0, 1999/12/29 */	TokenNameCOMMENT_JAVADOC	 A class to help send SMTP email. This class is an improvement on the sun.net.smtp.SmtpClient class found in the JDK. This version has extra functionality, and can be used with JVMs that did not extend from the JDK. It's not as robust as the JavaMail Standard Extension classes, but it's easier to use and easier to install, and has an Open Source license. <p> It can be used like this: <blockquote><pre> String mailhost = "localhost"; // or another mail host String from = "Mail Message Servlet &lt;MailMessage@server.com&gt;"; String to = "to@you.com"; String cc1 = "cc1@you.com"; String cc2 = "cc2@you.com"; String bcc = "bcc@you.com"; &nbsp; MailMessage msg = new MailMessage(mailhost); msg.setPort(25); msg.from(from); msg.to(to); msg.cc(cc1); msg.cc(cc2); msg.bcc(bcc); msg.setSubject("Test subject"); PrintStream out = msg.getPrintStream(); &nbsp; Enumeration enum = req.getParameterNames(); while (enum.hasMoreElements()) { String name = (String)enum.nextElement(); String value = req.getParameter(name); out.println(name + " = " + value); } &nbsp; msg.sendAndClose(); </pre></blockquote> <p> Be sure to set the from address, then set the recepient addresses, then set the subject and other headers, then get the PrintStream, then write the message, and finally send and close. The class does minimal error checking internally; it counts on the mail host to complain if there's any malformatted input or out of order execution. <p> An attachment mechanism based on RFC 1521 could be implemented on top of this class. In the meanwhile, JavaMail is the best solution for sending email with attachments. <p> Still to do: <ul> <li>Figure out how to close the connection in case of error </ul> * @version 1.1, 2000/03/19, added angle brackets to address, helps some servers version 1.0, 1999/12/29 
public	TokenNamepublic	
class	TokenNameclass	
MailMessage	TokenNameIdentifier	 Mail Message
{	TokenNameLBRACE	
/** default mailhost */	TokenNameCOMMENT_JAVADOC	 default mailhost 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
=	TokenNameEQUAL	
"localhost"	TokenNameStringLiteral	localhost
;	TokenNameSEMICOLON	
/** default port for SMTP: 25 */	TokenNameCOMMENT_JAVADOC	 default port for SMTP: 25 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** host name for the mail server */	TokenNameCOMMENT_JAVADOC	 host name for the mail server 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
/** host port for the mail server */	TokenNameCOMMENT_JAVADOC	 host port for the mail server 
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
;	TokenNameSEMICOLON	
/** sender email address */	TokenNameCOMMENT_JAVADOC	 sender email address 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
/** list of email addresses to reply to */	TokenNameCOMMENT_JAVADOC	 list of email addresses to reply to 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
replyto	TokenNameIdentifier	 replyto
;	TokenNameSEMICOLON	
/** list of email addresses to send to */	TokenNameCOMMENT_JAVADOC	 list of email addresses to send to 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
/** list of email addresses to cc to */	TokenNameCOMMENT_JAVADOC	 list of email addresses to cc to 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
/** headers to send in the mail */	TokenNameCOMMENT_JAVADOC	 headers to send in the mail 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
headersKeys	TokenNameIdentifier	 headers Keys
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
headersValues	TokenNameIdentifier	 headers Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MailPrintStream	TokenNameIdentifier	 Mail Print Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SmtpResponseReader	TokenNameIdentifier	 Smtp Response Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Socket	TokenNameIdentifier	 Socket
socket	TokenNameIdentifier	 socket
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_READY	TokenNameIdentifier	 OK  READY
=	TokenNameEQUAL	
220	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_HELO	TokenNameIdentifier	 OK  HELO
=	TokenNameEQUAL	
250	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_FROM	TokenNameIdentifier	 OK  FROM
=	TokenNameEQUAL	
250	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_RCPT_1	TokenNameIdentifier	 OK  RCPT 1
=	TokenNameEQUAL	
250	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_RCPT_2	TokenNameIdentifier	 OK  RCPT 2
=	TokenNameEQUAL	
251	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_DATA	TokenNameIdentifier	 OK  DATA
=	TokenNameEQUAL	
354	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_DOT	TokenNameIdentifier	 OK  DOT
=	TokenNameEQUAL	
250	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OK_QUIT	TokenNameIdentifier	 OK  QUIT
=	TokenNameEQUAL	
221	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a new MailMessage to send an email. * Use localhost as the mail server with port 25. * * @exception IOException if there's any problem contacting the mail server */	TokenNameCOMMENT_JAVADOC	 Constructs a new MailMessage to send an email. Use localhost as the mail server with port 25. * @exception IOException if there's any problem contacting the mail server 
public	TokenNamepublic	
MailMessage	TokenNameIdentifier	 Mail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_HOST	TokenNameIdentifier	 DEFAULT  HOST
,	TokenNameCOMMA	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new MailMessage to send an email. * Use the given host as the mail server with port 25. * * @param host the mail server to use * @exception IOException if there's any problem contacting the mail server */	TokenNameCOMMENT_JAVADOC	 Constructs a new MailMessage to send an email. Use the given host as the mail server with port 25. * @param host the mail server to use @exception IOException if there's any problem contacting the mail server 
public	TokenNamepublic	
MailMessage	TokenNameIdentifier	 Mail Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
DEFAULT_PORT	TokenNameIdentifier	 DEFAULT  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new MailMessage to send an email. * Use the given host and port as the mail server. * * @param host the mail server to use * @param port the port to connect to * @exception IOException if there's any problem contacting the mail server */	TokenNameCOMMENT_JAVADOC	 Constructs a new MailMessage to send an email. Use the given host and port as the mail server. * @param host the mail server to use @param port the port to connect to @exception IOException if there's any problem contacting the mail server 
public	TokenNamepublic	
MailMessage	TokenNameIdentifier	 Mail Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
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
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
replyto	TokenNameIdentifier	 replyto
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
headersKeys	TokenNameIdentifier	 headers Keys
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
headersValues	TokenNameIdentifier	 headers Values
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendHelo	TokenNameIdentifier	 send Helo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the port to connect to the SMTP host. * @param port the port to use for connection. * @see #DEFAULT_PORT */	TokenNameCOMMENT_JAVADOC	 Set the port to connect to the SMTP host. @param port the port to use for connection. @see #DEFAULT_PORT 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
int	TokenNameint	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the from address. Also sets the "From" header. This method should * be called only once. * @param from the from address * @exception IOException if there's any problem reported by the mail server */	TokenNameCOMMENT_JAVADOC	 Sets the from address. Also sets the "From" header. This method should be called only once. @param from the from address @exception IOException if there's any problem reported by the mail server 
public	TokenNamepublic	
void	TokenNamevoid	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
sendFrom	TokenNameIdentifier	 send From
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the replyto address * This method may be * called multiple times. * @param rto the replyto address * */	TokenNameCOMMENT_JAVADOC	 Sets the replyto address This method may be called multiple times. @param rto the replyto address 
public	TokenNamepublic	
void	TokenNamevoid	
replyto	TokenNameIdentifier	 replyto
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rto	TokenNameIdentifier	 rto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
replyto	TokenNameIdentifier	 replyto
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
rto	TokenNameIdentifier	 rto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the to address. Also sets the "To" header. This method may be * called multiple times. * * @param to the to address * @exception IOException if there's any problem reported by the mail server */	TokenNameCOMMENT_JAVADOC	 Sets the to address. Also sets the "To" header. This method may be called multiple times. * @param to the to address @exception IOException if there's any problem reported by the mail server 
public	TokenNamepublic	
void	TokenNamevoid	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
sendRcpt	TokenNameIdentifier	 send Rcpt
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the cc address. Also sets the "Cc" header. This method may be * called multiple times. * * @param cc the cc address * @exception IOException if there's any problem reported by the mail server */	TokenNameCOMMENT_JAVADOC	 Sets the cc address. Also sets the "Cc" header. This method may be called multiple times. * @param cc the cc address @exception IOException if there's any problem reported by the mail server 
public	TokenNamepublic	
void	TokenNamevoid	
cc	TokenNameIdentifier	 cc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
sendRcpt	TokenNameIdentifier	 send Rcpt
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the bcc address. Does NOT set any header since it's a *blind* copy. * This method may be called multiple times. * * @param bcc the bcc address * @exception IOException if there's any problem reported by the mail server */	TokenNameCOMMENT_JAVADOC	 Sets the bcc address. Does NOT set any header since it's a *blind* copy. This method may be called multiple times. * @param bcc the bcc address @exception IOException if there's any problem reported by the mail server 
public	TokenNamepublic	
void	TokenNamevoid	
bcc	TokenNameIdentifier	 bcc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
bcc	TokenNameIdentifier	 bcc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
sendRcpt	TokenNameIdentifier	 send Rcpt
(	TokenNameLPAREN	
bcc	TokenNameIdentifier	 bcc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No need to keep track of Bcc'd addresses 	TokenNameCOMMENT_LINE	No need to keep track of Bcc'd addresses 
}	TokenNameRBRACE	
/** * Sets the subject of the mail message. Actually sets the "Subject" * header. * @param subj the subject of the mail message */	TokenNameCOMMENT_JAVADOC	 Sets the subject of the mail message. Actually sets the "Subject" header. @param subj the subject of the mail message 
public	TokenNamepublic	
void	TokenNamevoid	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
subj	TokenNameIdentifier	 subj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
"Subject"	TokenNameStringLiteral	Subject
,	TokenNameCOMMA	
subj	TokenNameIdentifier	 subj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the named header to the given value. RFC 822 provides the rules for * what text may constitute a header name and value. * @param name name of the header * @param value contents of the header */	TokenNameCOMMENT_JAVADOC	 Sets the named header to the given value. RFC 822 provides the rules for what text may constitute a header name and value. @param name name of the header @param value contents of the header 
public	TokenNamepublic	
void	TokenNamevoid	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Blindly trust the user doesn't set any invalid headers 	TokenNameCOMMENT_LINE	Blindly trust the user doesn't set any invalid headers 
headersKeys	TokenNameIdentifier	 headers Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
headersValues	TokenNameIdentifier	 headers Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a PrintStream that can be used to write the body of the message. * A stream is used since email bodies are byte-oriented. A writer can * be wrapped on top if necessary for internationalization. * This is actually done in Message.java * * @return a printstream containing the data and the headers of the email * @exception IOException if there's any problem reported by the mail server * @see org.apache.tools.ant.taskdefs.email.Message */	TokenNameCOMMENT_JAVADOC	 Returns a PrintStream that can be used to write the body of the message. A stream is used since email bodies are byte-oriented. A writer can be wrapped on top if necessary for internationalization. This is actually done in Message.java * @return a printstream containing the data and the headers of the email @exception IOException if there's any problem reported by the mail server @see org.apache.tools.ant.taskdefs.email.Message 
public	TokenNamepublic	
PrintStream	TokenNameIdentifier	 Print Stream
getPrintStream	TokenNameIdentifier	 get Print Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
setFromHeader	TokenNameIdentifier	 set From Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setReplyToHeader	TokenNameIdentifier	 set Reply To Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToHeader	TokenNameIdentifier	 set To Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCcHeader	TokenNameIdentifier	 set Cc Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
"X-Mailer"	TokenNameStringLiteral	X-Mailer
,	TokenNameCOMMA	
"org.apache.tools.mail.MailMessage (ant.apache.org)"	TokenNameStringLiteral	org.apache.tools.mail.MailMessage (ant.apache.org)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendData	TokenNameIdentifier	 send Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flushHeaders	TokenNameIdentifier	 flush Headers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// RFC 822 s4.1: "From:" header must be sent 	TokenNameCOMMENT_LINE	RFC 822 s4.1: "From:" header must be sent 
// We rely on error checking by the MTA 	TokenNameCOMMENT_LINE	We rely on error checking by the MTA 
void	TokenNamevoid	
setFromHeader	TokenNameIdentifier	 set From Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
"From"	TokenNameStringLiteral	From
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// RFC 822 s4.1: "Reply-To:" header is optional 	TokenNameCOMMENT_LINE	RFC 822 s4.1: "Reply-To:" header is optional 
void	TokenNamevoid	
setReplyToHeader	TokenNameIdentifier	 set Reply To Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
replyto	TokenNameIdentifier	 replyto
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
"Reply-To"	TokenNameStringLiteral	Reply-To
,	TokenNameCOMMA	
vectorToList	TokenNameIdentifier	 vector To List
(	TokenNameLPAREN	
replyto	TokenNameIdentifier	 replyto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
setToHeader	TokenNameIdentifier	 set To Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
"To"	TokenNameStringLiteral	To
,	TokenNameCOMMA	
vectorToList	TokenNameIdentifier	 vector To List
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
setCcHeader	TokenNameIdentifier	 set Cc Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cc	TokenNameIdentifier	 cc
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
"Cc"	TokenNameStringLiteral	Cc
,	TokenNameCOMMA	
vectorToList	TokenNameIdentifier	 vector To List
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
vectorToList	TokenNameIdentifier	 vector To List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
flushHeaders	TokenNameIdentifier	 flush Headers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// RFC 822 s4.1: 	TokenNameCOMMENT_LINE	RFC 822 s4.1: 
// "Header fields are NOT required to occur in any particular order, 	TokenNameCOMMENT_LINE	"Header fields are NOT required to occur in any particular order, 
// except that the message body MUST occur AFTER the headers" 	TokenNameCOMMENT_LINE	except that the message body MUST occur AFTER the headers" 
// (the same section specifies a reccommended order, which we ignore) 	TokenNameCOMMENT_LINE	(the same section specifies a reccommended order, which we ignore) 
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
headersKeys	TokenNameIdentifier	 headers Keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
headersKeys	TokenNameIdentifier	 headers Keys
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
headersValues	TokenNameIdentifier	 headers Values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sends the message and closes the connection to the server. * The MailMessage object cannot be reused. * * @exception IOException if there's any problem reported by the mail server */	TokenNameCOMMENT_JAVADOC	 Sends the message and closes the connection to the server. The MailMessage object cannot be reused. * @exception IOException if there's any problem reported by the mail server 
public	TokenNamepublic	
void	TokenNamevoid	
sendAndClose	TokenNameIdentifier	 send And Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sendDot	TokenNameIdentifier	 send Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendQuit	TokenNameIdentifier	 send Quit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Make a limited attempt to extract a sanitized email address 	TokenNameCOMMENT_LINE	Make a limited attempt to extract a sanitized email address 
// Prefer text in <brackets>, ignore anything in (parentheses) 	TokenNameCOMMENT_LINE	Prefer text in <brackets>, ignore anything in (parentheses) 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
sanitizeAddress	TokenNameIdentifier	 sanitize Address
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
paramDepth	TokenNameIdentifier	 param Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paramDepth	TokenNameIdentifier	 param Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// support "address (name)" 	TokenNameCOMMENT_LINE	support "address (name)" 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
paramDepth	TokenNameIdentifier	 param Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// support "(name) address" 	TokenNameCOMMENT_LINE	support "(name) address" 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
paramDepth	TokenNameIdentifier	 param Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
paramDepth	TokenNameIdentifier	 param Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// * * * * * Raw protocol methods below here * * * * * 	TokenNameCOMMENT_LINE	* * * * * Raw protocol methods below here * * * * * 
void	TokenNamevoid	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
=	TokenNameEQUAL	
new	TokenNamenew	
Socket	TokenNameIdentifier	 Socket
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
MailPrintStream	TokenNameIdentifier	 Mail Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
SmtpResponseReader	TokenNameIdentifier	 Smtp Response Reader
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getReady	TokenNameIdentifier	 get Ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
getReady	TokenNameIdentifier	 get Ready
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getResponse	TokenNameIdentifier	 get Response
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_READY	TokenNameIdentifier	 OK  READY
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isResponseOK	TokenNameIdentifier	 is Response OK
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Didn't get introduction from server: "	TokenNameStringLiteral	Didn't get introduction from server: 
+	TokenNamePLUS	
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
sendHelo	TokenNameIdentifier	 send Helo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_HELO	TokenNameIdentifier	 OK  HELO
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
sendFrom	TokenNameIdentifier	 send From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_FROM	TokenNameIdentifier	 OK  FROM
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"MAIL FROM: "	TokenNameStringLiteral	MAIL FROM: 
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
sanitizeAddress	TokenNameIdentifier	 sanitize Address
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
sendRcpt	TokenNameIdentifier	 send Rcpt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rcpt	TokenNameIdentifier	 rcpt
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_RCPT_1	TokenNameIdentifier	 OK  RCPT 1
,	TokenNameCOMMA	
OK_RCPT_2	TokenNameIdentifier	 OK  RCPT 2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"RCPT TO: "	TokenNameStringLiteral	RCPT TO: 
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
sanitizeAddress	TokenNameIdentifier	 sanitize Address
(	TokenNameLPAREN	
rcpt	TokenNameIdentifier	 rcpt
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
sendData	TokenNameIdentifier	 send Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_DATA	TokenNameIdentifier	 OK  DATA
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"DATA"	TokenNameStringLiteral	DATA
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
sendDot	TokenNameIdentifier	 send Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_DOT	TokenNameIdentifier	 OK  DOT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
" ."	TokenNameStringLiteral	 .
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure dot is on new line 	TokenNameCOMMENT_LINE	make sure dot is on new line 
}	TokenNameRBRACE	
void	TokenNamevoid	
sendQuit	TokenNameIdentifier	 send Quit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
{	TokenNameLBRACE	
OK_QUIT	TokenNameIdentifier	 OK  QUIT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"QUIT"	TokenNameStringLiteral	QUIT
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ErrorInQuitException	TokenNameIdentifier	 Error In Quit Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
rawPrint	TokenNameIdentifier	 raw Print
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// raw supports <CRLF>.<CRLF> 	TokenNameCOMMENT_LINE	raw supports <CRLF>.<CRLF> 
String	TokenNameIdentifier	 String
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getResponse	TokenNameIdentifier	 get Response
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isResponseOK	TokenNameIdentifier	 is Response OK
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unexpected reply to command: "	TokenNameStringLiteral	Unexpected reply to command: 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
response	TokenNameIdentifier	 response
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isResponseOK	TokenNameIdentifier	 is Response OK
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
response	TokenNameIdentifier	 response
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check that the response is one of the valid codes 	TokenNameCOMMENT_LINE	Check that the response is one of the valid codes 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ok	TokenNameIdentifier	 ok
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
ok	TokenNameIdentifier	 ok
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
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
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
socket	TokenNameIdentifier	 socket
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
socket	TokenNameIdentifier	 socket
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
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This PrintStream subclass makes sure that <CRLF>. becomes <CRLF>.. * per RFC 821. It also ensures that new lines are always \r\n. */	TokenNameCOMMENT_JAVADOC	 This PrintStream subclass makes sure that <CRLF>. becomes <CRLF>.. per RFC 821. It also ensures that new lines are always \r\n. 
class	TokenNameclass	
MailPrintStream	TokenNameIdentifier	 Mail Print Stream
extends	TokenNameextends	
PrintStream	TokenNameIdentifier	 Print Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
lastChar	TokenNameIdentifier	 last Char
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MailPrintStream	TokenNameIdentifier	 Mail Print Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deprecated, but email is byte-oriented 	TokenNameCOMMENT_LINE	deprecated, but email is byte-oriented 
}	TokenNameRBRACE	
// Mac does \n\r, but that's tough to distinguish from Windows \r\n\r\n. 	TokenNameCOMMENT_LINE	Mac does \n\r, but that's tough to distinguish from Windows \r\n\r\n. 
// Don't tackle that problem right now. 	TokenNameCOMMENT_LINE	Don't tackle that problem right now. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
lastChar	TokenNameIdentifier	 last Char
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensure always \r\n 	TokenNameCOMMENT_LINE	ensure always \r\n 
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
lastChar	TokenNameIdentifier	 last Char
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add extra dot 	TokenNameCOMMENT_LINE	add extra dot 
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastChar	TokenNameIdentifier	 last Char
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
[	TokenNameLBRACKET	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
rawPrint	TokenNameIdentifier	 raw Print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rawWrite	TokenNameIdentifier	 raw Write
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

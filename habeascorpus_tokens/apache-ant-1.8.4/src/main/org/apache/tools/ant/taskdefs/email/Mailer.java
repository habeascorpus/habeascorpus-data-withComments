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
email	TokenNameIdentifier	 email
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Task	TokenNameIdentifier	 Task
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DateUtils	TokenNameIdentifier	 Date Utils
;	TokenNameSEMICOLON	
/** * Base class for the various emailing implementations. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Base class for the various emailing implementations. * @since Ant 1.5 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Mailer	TokenNameIdentifier	 Mailer
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:MemberNameCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:MemberNameCheck OFF - bc 
protected	TokenNameprotected	
boolean	TokenNameboolean	
SSL	TokenNameIdentifier	 SSL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// CheckStyle:MemberNameCheck ON 	TokenNameCOMMENT_LINE	CheckStyle:MemberNameCheck ON 
protected	TokenNameprotected	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
EmailAddress	TokenNameIdentifier	 Email Address
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
replyToList	TokenNameIdentifier	 reply To List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
toList	TokenNameIdentifier	 to List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
ccList	TokenNameIdentifier	 cc List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
bccList	TokenNameIdentifier	 bcc List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
subject	TokenNameIdentifier	 subject
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
includeFileNames	TokenNameIdentifier	 include File Names
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
headers	TokenNameIdentifier	 headers
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreInvalidRecipients	TokenNameIdentifier	 ignore Invalid Recipients
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
starttls	TokenNameIdentifier	 starttls
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
portExplicitlySpecified	TokenNameIdentifier	 port Explicitly Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the mail server. * * @param host the mail server name. */	TokenNameCOMMENT_JAVADOC	 Set the mail server. * @param host the mail server name. 
public	TokenNamepublic	
void	TokenNamevoid	
setHost	TokenNameIdentifier	 set Host
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the smtp port. * * @param port the SMTP port. */	TokenNameCOMMENT_JAVADOC	 Set the smtp port. * @param port the SMTP port. 
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
/** * Whether the port has been explicitly specified by the user. * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Whether the port has been explicitly specified by the user. @since Ant 1.8.2 
public	TokenNamepublic	
void	TokenNamevoid	
setPortExplicitlySpecified	TokenNameIdentifier	 set Port Explicitly Specified
(	TokenNameLPAREN	
boolean	TokenNameboolean	
explicit	TokenNameIdentifier	 explicit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
portExplicitlySpecified	TokenNameIdentifier	 port Explicitly Specified
=	TokenNameEQUAL	
explicit	TokenNameIdentifier	 explicit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether the port has been explicitly specified by the user. * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Whether the port has been explicitly specified by the user. @since Ant 1.8.2 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isPortExplicitlySpecified	TokenNameIdentifier	 is Port Explicitly Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
portExplicitlySpecified	TokenNameIdentifier	 port Explicitly Specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user for smtp auth. * * @param user the username. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Set the user for smtp auth. * @param user the username. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setUser	TokenNameIdentifier	 set User
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
user	TokenNameIdentifier	 user
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the password for smtp auth. * * @param password the authentication password. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Set the password for smtp auth. * @param password the authentication password. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to send the mail through SSL. * * @param ssl if true use SSL transport. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Set whether to send the mail through SSL. * @param ssl if true use SSL transport. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setSSL	TokenNameIdentifier	 set SSL
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ssl	TokenNameIdentifier	 ssl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
SSL	TokenNameIdentifier	 SSL
=	TokenNameEQUAL	
ssl	TokenNameIdentifier	 ssl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to allow authentication to switch to a TLS * connection via STARTTLS. * @param b boolean; if true STARTTLS will be supported. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set whether to allow authentication to switch to a TLS connection via STARTTLS. @param b boolean; if true STARTTLS will be supported. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setEnableStartTLS	TokenNameIdentifier	 set Enable Start TLS
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
starttls	TokenNameIdentifier	 starttls
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isStartTLSEnabled	TokenNameIdentifier	 is Start TLS Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
starttls	TokenNameIdentifier	 starttls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the message. * * @param m the message content. */	TokenNameCOMMENT_JAVADOC	 Set the message. * @param m the message content. 
public	TokenNamepublic	
void	TokenNamevoid	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the address to send from. * * @param from the sender. */	TokenNameCOMMENT_JAVADOC	 Set the address to send from. * @param from the sender. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
EmailAddress	TokenNameIdentifier	 Email Address
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the replyto addresses. * * @param list a vector of reployTo addresses. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Set the replyto addresses. * @param list a vector of reployTo addresses. @since Ant 1.6 
public	TokenNamepublic	
void	TokenNamevoid	
setReplyToList	TokenNameIdentifier	 set Reply To List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
replyToList	TokenNameIdentifier	 reply To List
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the to addresses. * * @param list a vector of recipient addresses. */	TokenNameCOMMENT_JAVADOC	 Set the to addresses. * @param list a vector of recipient addresses. 
public	TokenNamepublic	
void	TokenNamevoid	
setToList	TokenNameIdentifier	 set To List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
toList	TokenNameIdentifier	 to List
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the cc addresses. * * @param list a vector of cc addresses. */	TokenNameCOMMENT_JAVADOC	 Set the cc addresses. * @param list a vector of cc addresses. 
public	TokenNamepublic	
void	TokenNamevoid	
setCcList	TokenNameIdentifier	 set Cc List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ccList	TokenNameIdentifier	 cc List
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the bcc addresses. * * @param list a vector of the bcc addresses. */	TokenNameCOMMENT_JAVADOC	 Set the bcc addresses. * @param list a vector of the bcc addresses. 
public	TokenNamepublic	
void	TokenNamevoid	
setBccList	TokenNameIdentifier	 set Bcc List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bccList	TokenNameIdentifier	 bcc List
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the files to attach. * * @param files list of files to attach to the email. */	TokenNameCOMMENT_JAVADOC	 Set the files to attach. * @param files list of files to attach to the email. 
public	TokenNamepublic	
void	TokenNamevoid	
setFiles	TokenNameIdentifier	 set Files
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the subject. * * @param subject the subject line. */	TokenNameCOMMENT_JAVADOC	 Set the subject. * @param subject the subject line. 
public	TokenNamepublic	
void	TokenNamevoid	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
subject	TokenNameIdentifier	 subject
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subject	TokenNameIdentifier	 subject
=	TokenNameEQUAL	
subject	TokenNameIdentifier	 subject
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the owning task. * * @param task the owning task instance. */	TokenNameCOMMENT_JAVADOC	 Set the owning task. * @param task the owning task instance. 
public	TokenNamepublic	
void	TokenNamevoid	
setTask	TokenNameIdentifier	 set Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate whether filenames should be listed in the body. * * @param b if true list attached file names in the body content. */	TokenNameCOMMENT_JAVADOC	 Indicate whether filenames should be listed in the body. * @param b if true list attached file names in the body content. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludeFileNames	TokenNameIdentifier	 set Include File Names
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includeFileNames	TokenNameIdentifier	 include File Names
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the generic headers to add to the email. * @param v a Vector presumed to contain Header objects. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Set the generic headers to add to the email. @param v a Vector presumed to contain Header objects. @since Ant 1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setHeaders	TokenNameIdentifier	 set Headers
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
headers	TokenNameIdentifier	 headers
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Send the email. * * @throws BuildException if the email can't be sent. */	TokenNameCOMMENT_JAVADOC	 Send the email. * @throws BuildException if the email can't be sent. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Whether invalid recipients should be ignored (but a warning * will be logged) instead of making the task fail. * * <p>Even with this property set to true the task will still fail * if the mail couldn't be sent to any recipient at all.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether invalid recipients should be ignored (but a warning will be logged) instead of making the task fail. * <p>Even with this property set to true the task will still fail if the mail couldn't be sent to any recipient at all.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoreInvalidRecipients	TokenNameIdentifier	 set Ignore Invalid Recipients
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ignoreInvalidRecipients	TokenNameIdentifier	 ignore Invalid Recipients
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether invalid recipients should be ignored. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Whether invalid recipients should be ignored. * @since Ant 1.8.0 
protected	TokenNameprotected	
boolean	TokenNameboolean	
shouldIgnoreInvalidRecipients	TokenNameIdentifier	 should Ignore Invalid Recipients
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ignoreInvalidRecipients	TokenNameIdentifier	 ignore Invalid Recipients
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the current Date in a format suitable for a SMTP date * header. * * @return the current date in SMTP suitable format. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Return the current Date in a format suitable for a SMTP date header. * @return the current date in SMTP suitable format. * @since Ant 1.5 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DateUtils	TokenNameIdentifier	 Date Utils
.	TokenNameDOT	
getDateForHeader	TokenNameIdentifier	 get Date For Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

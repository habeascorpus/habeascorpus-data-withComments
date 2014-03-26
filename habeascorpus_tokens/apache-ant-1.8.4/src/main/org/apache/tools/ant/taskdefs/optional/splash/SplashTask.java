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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
splash	TokenNameIdentifier	 splash
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInputStream	TokenNameIdentifier	 Data Input Stream
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
InputStream	TokenNameIdentifier	 Input Stream
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
ImageIcon	TokenNameIdentifier	 Image Icon
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
Base64Converter	TokenNameIdentifier	 Base64 Converter
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SetProxy	TokenNameIdentifier	 Set Proxy
;	TokenNameSEMICOLON	
/** * Creates a splash screen. The splash screen is displayed * for the duration of the build and includes a handy progress bar as * well. Use in conjunction with the sound task to provide interest * whilst waiting for your builds to complete... * @since Ant1.5 */	TokenNameCOMMENT_JAVADOC	 Creates a splash screen. The splash screen is displayed for the duration of the build and includes a handy progress bar as well. Use in conjunction with the sound task to provide interest whilst waiting for your builds to complete... @since Ant1.5 
public	TokenNamepublic	
class	TokenNameclass	
SplashTask	TokenNameIdentifier	 Splash Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_SHOW_DURATION	TokenNameIdentifier	 DEFAULT  SHOW  DURATION
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
imgurl	TokenNameIdentifier	 imgurl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
proxy	TokenNameIdentifier	 proxy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
"80"	TokenNameStringLiteral	80
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
showDuration	TokenNameIdentifier	 show Duration
=	TokenNameEQUAL	
DEFAULT_SHOW_DURATION	TokenNameIdentifier	 DEFAULT  SHOW  DURATION
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
useProxy	TokenNameIdentifier	 use Proxy
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
progressRegExp	TokenNameIdentifier	 progress Reg Exp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
displayText	TokenNameIdentifier	 display Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
SplashScreen	TokenNameIdentifier	 Splash Screen
splash	TokenNameIdentifier	 splash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A URL pointing to an image to display; optional, default antlogo.gif * from the classpath. * @param imgurl the url string pointing to the image */	TokenNameCOMMENT_JAVADOC	 A URL pointing to an image to display; optional, default antlogo.gif from the classpath. @param imgurl the url string pointing to the image 
public	TokenNamepublic	
void	TokenNamevoid	
setImageURL	TokenNameIdentifier	 set Image URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
imgurl	TokenNameIdentifier	 imgurl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
imgurl	TokenNameIdentifier	 imgurl
=	TokenNameEQUAL	
imgurl	TokenNameIdentifier	 imgurl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * flag to enable proxy settings; optional, deprecated : consider * using &lt;setproxy&gt; instead * @param useProxy if ture, enable proxy settings * @deprecated since 1.5.x. * Use org.apache.tools.ant.taskdefs.optional.net.SetProxy */	TokenNameCOMMENT_JAVADOC	 flag to enable proxy settings; optional, deprecated : consider using &lt;setproxy&gt; instead @param useProxy if ture, enable proxy settings @deprecated since 1.5.x. Use org.apache.tools.ant.taskdefs.optional.net.SetProxy 
public	TokenNamepublic	
void	TokenNamevoid	
setUseproxy	TokenNameIdentifier	 set Useproxy
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useProxy	TokenNameIdentifier	 use Proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
useProxy	TokenNameIdentifier	 use Proxy
=	TokenNameEQUAL	
useProxy	TokenNameIdentifier	 use Proxy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * name of proxy; optional. * @param proxy the name of the proxy host * @deprecated since 1.5.x. * Use org.apache.tools.ant.taskdefs.optional.net.SetProxy */	TokenNameCOMMENT_JAVADOC	 name of proxy; optional. @param proxy the name of the proxy host @deprecated since 1.5.x. Use org.apache.tools.ant.taskdefs.optional.net.SetProxy 
public	TokenNamepublic	
void	TokenNamevoid	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
proxy	TokenNameIdentifier	 proxy
=	TokenNameEQUAL	
proxy	TokenNameIdentifier	 proxy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Proxy port; optional, default 80. * @param port the proxy port * @deprecated since 1.5.x. * Use org.apache.tools.ant.taskdefs.optional.net.SetProxy */	TokenNameCOMMENT_JAVADOC	 Proxy port; optional, default 80. @param port the proxy port @deprecated since 1.5.x. Use org.apache.tools.ant.taskdefs.optional.net.SetProxy 
public	TokenNamepublic	
void	TokenNamevoid	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
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
/** * Proxy user; optional, default =none. * @param user the proxy user * @deprecated since 1.5.x. * Use org.apache.tools.ant.taskdefs.optional.net.SetProxy */	TokenNameCOMMENT_JAVADOC	 Proxy user; optional, default =none. @param user the proxy user @deprecated since 1.5.x. Use org.apache.tools.ant.taskdefs.optional.net.SetProxy 
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
/** * Proxy password; required if <tt>user</tt> is set. * @param password the proxy password * @deprecated since 1.5.x. * Use org.apache.tools.ant.taskdefs.optional.net.SetProxy */	TokenNameCOMMENT_JAVADOC	 Proxy password; required if <tt>user</tt> is set. @param password the proxy password @deprecated since 1.5.x. Use org.apache.tools.ant.taskdefs.optional.net.SetProxy 
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
/** * how long to show the splash screen in milliseconds, * optional; default 5000 ms. * @param duration the spash duration in milliseconds */	TokenNameCOMMENT_JAVADOC	 how long to show the splash screen in milliseconds, optional; default 5000 ms. @param duration the spash duration in milliseconds 
public	TokenNamepublic	
void	TokenNamevoid	
setShowduration	TokenNameIdentifier	 set Showduration
(	TokenNameLPAREN	
int	TokenNameint	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
showDuration	TokenNameIdentifier	 show Duration
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Progress regular expression which is used to parse the output * and dig out current progress optional; if not provided, * progress is increased every action and log output line * @param progressRegExp Progress regular expression, exactly one * group pattern must exists, and it represents the progress * number (0-100) (i.e "Progress: (.*)%") * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Progress regular expression which is used to parse the output and dig out current progress optional; if not provided, progress is increased every action and log output line @param progressRegExp Progress regular expression, exactly one group pattern must exists, and it represents the progress number (0-100) (i.e "Progress: (.*)%") @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setProgressRegExp	TokenNameIdentifier	 set Progress Reg Exp
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
progressRegExp	TokenNameIdentifier	 progress Reg Exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
progressRegExp	TokenNameIdentifier	 progress Reg Exp
=	TokenNameEQUAL	
progressRegExp	TokenNameIdentifier	 progress Reg Exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the display text presented in the splash window. * optional; defaults to "Building ..." * @param displayText the display text presented the splash window * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the display text presented in the splash window. optional; defaults to "Building ..." @param displayText the display text presented the splash window @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setDisplayText	TokenNameIdentifier	 set Display Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
displayText	TokenNameIdentifier	 display Text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
displayText	TokenNameIdentifier	 display Text
=	TokenNameEQUAL	
displayText	TokenNameIdentifier	 display Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the task. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Execute the task. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
splash	TokenNameIdentifier	 splash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splash	TokenNameIdentifier	 splash
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeBuildListener	TokenNameIdentifier	 remove Build Listener
(	TokenNameLPAREN	
splash	TokenNameIdentifier	 splash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splash	TokenNameIdentifier	 splash
.	TokenNameDOT	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splash	TokenNameIdentifier	 splash
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Creating new SplashScreen"	TokenNameStringLiteral	Creating new SplashScreen
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
imgurl	TokenNameIdentifier	 imgurl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URLConnection	TokenNameIdentifier	 URL Connection
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
SetProxy	TokenNameIdentifier	 Set Proxy
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
new	TokenNamenew	
SetProxy	TokenNameIdentifier	 Set Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
setProxyHost	TokenNameIdentifier	 set Proxy Host
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
setProxyPort	TokenNameIdentifier	 set Proxy Port
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
setProxyUser	TokenNameIdentifier	 set Proxy User
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
setProxyPassword	TokenNameIdentifier	 set Proxy Password
(	TokenNameLPAREN	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
applyWebProxySettings	TokenNameIdentifier	 apply Web Proxy Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useProxy	TokenNameIdentifier	 use Proxy
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
proxy	TokenNameIdentifier	 proxy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
proxy	TokenNameIdentifier	 proxy
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
port	TokenNameIdentifier	 port
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using proxied Connection"	TokenNameStringLiteral	Using proxied Connection
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"http.proxySet"	TokenNameStringLiteral	http.proxySet
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
imgurl	TokenNameIdentifier	 imgurl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
user	TokenNameIdentifier	 user
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
user	TokenNameIdentifier	 user
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// converted from sun internal classes to 	TokenNameCOMMENT_LINE	converted from sun internal classes to 
// new Base64Converter 	TokenNameCOMMENT_LINE	new Base64Converter 
// utility class extracted from Get task 	TokenNameCOMMENT_LINE	utility class extracted from Get task 
String	TokenNameIdentifier	 String
encodedcreds	TokenNameIdentifier	 encodedcreds
=	TokenNameEQUAL	
new	TokenNamenew	
Base64Converter	TokenNameIdentifier	 Base64 Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
user	TokenNameIdentifier	 user
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
setRequestProperty	TokenNameIdentifier	 set Request Property
(	TokenNameLPAREN	
"Proxy-Authorization"	TokenNameStringLiteral	Proxy-Authorization
,	TokenNameCOMMA	
encodedcreds	TokenNameIdentifier	 encodedcreds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"http.proxySet"	TokenNameStringLiteral	http.proxySet
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Using Direction HTTP Connection"	TokenNameStringLiteral	Using Direction HTTP Connection
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
imgurl	TokenNameIdentifier	 imgurl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conn	TokenNameIdentifier	 conn
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
setDoInput	TokenNameIdentifier	 set Do Input
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
setDoOutput	TokenNameIdentifier	 set Do Output
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
conn	TokenNameIdentifier	 conn
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Catch everything - some of the above return nulls, 	TokenNameCOMMENT_LINE	Catch everything - some of the above return nulls, 
// throw exceptions or generally misbehave 	TokenNameCOMMENT_LINE	throw exceptions or generally misbehave 
// in the event of a problem etc 	TokenNameCOMMENT_LINE	in the event of a problem etc 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to download image, trying default Ant Logo"	TokenNameStringLiteral	Unable to download image, trying default Ant Logo
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"(Exception was ""	TokenNameStringLiteral	(Exception was "
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
SplashTask	TokenNameIdentifier	 Splash Task
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"images/ant_logo_large.gif"	TokenNameStringLiteral	images/ant_logo_large.gif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResourceAsStream	TokenNameIdentifier	 get System Resource As Stream
(	TokenNameLPAREN	
"images/ant_logo_large.gif"	TokenNameStringLiteral	images/ant_logo_large.gif
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
din	TokenNameIdentifier	 din
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
bout	TokenNameIdentifier	 bout
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
din	TokenNameIdentifier	 din
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bout	TokenNameIdentifier	 bout
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Got ByteArray, creating splash"	TokenNameStringLiteral	Got ByteArray, creating splash
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ImageIcon	TokenNameIdentifier	 Image Icon
img	TokenNameIdentifier	 img
=	TokenNameEQUAL	
new	TokenNamenew	
ImageIcon	TokenNameIdentifier	 Image Icon
(	TokenNameLPAREN	
bout	TokenNameIdentifier	 bout
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splash	TokenNameIdentifier	 splash
=	TokenNameEQUAL	
new	TokenNamenew	
SplashScreen	TokenNameIdentifier	 Splash Screen
(	TokenNameLPAREN	
img	TokenNameIdentifier	 img
,	TokenNameCOMMA	
progressRegExp	TokenNameIdentifier	 progress Reg Exp
,	TokenNameCOMMA	
displayText	TokenNameIdentifier	 display Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logHeadless	TokenNameIdentifier	 log Headless
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
din	TokenNameIdentifier	 din
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow if there was an error before so that 	TokenNameCOMMENT_LINE	swallow if there was an error before so that 
// original error will be passed up 	TokenNameCOMMENT_LINE	original error will be passed up 
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
splash	TokenNameIdentifier	 splash
=	TokenNameEQUAL	
new	TokenNamenew	
SplashScreen	TokenNameIdentifier	 Splash Screen
(	TokenNameLPAREN	
"Image Unavailable."	TokenNameStringLiteral	Image Unavailable.
,	TokenNameCOMMA	
progressRegExp	TokenNameIdentifier	 progress Reg Exp
,	TokenNameCOMMA	
displayText	TokenNameIdentifier	 display Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logHeadless	TokenNameIdentifier	 log Headless
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splash	TokenNameIdentifier	 splash
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splash	TokenNameIdentifier	 splash
.	TokenNameDOT	
toFront	TokenNameIdentifier	 to Front
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
splash	TokenNameIdentifier	 splash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
showDuration	TokenNameIdentifier	 show Duration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore Exception 	TokenNameCOMMENT_LINE	Ignore Exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
logHeadless	TokenNameIdentifier	 log Headless
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"failed to display SplashScreen, caught "	TokenNameStringLiteral	failed to display SplashScreen, caught 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" with message: "	TokenNameStringLiteral	 with message: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

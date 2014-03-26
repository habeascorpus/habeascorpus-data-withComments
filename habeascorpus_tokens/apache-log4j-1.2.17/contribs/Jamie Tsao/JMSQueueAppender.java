/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ErrorCode	TokenNameIdentifier	 Error Code
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
InitialContext	TokenNameIdentifier	 Initial Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
NameNotFoundException	TokenNameIdentifier	 Name Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
naming	TokenNameIdentifier	 naming
.	TokenNameDOT	
NamingException	TokenNameIdentifier	 Naming Exception
;	TokenNameSEMICOLON	
/** * A Simple JMS (P2P) Queue Appender. * * @author Ceki G&uuml;lc&uuml; * @author Jamie Tsao */	TokenNameCOMMENT_JAVADOC	 A Simple JMS (P2P) Queue Appender. * @author Ceki G&uuml;lc&uuml; @author Jamie Tsao 
public	TokenNamepublic	
class	TokenNameclass	
JMSQueueAppender	TokenNameIdentifier	 JMS Queue Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
protected	TokenNameprotected	
QueueConnection	TokenNameIdentifier	 Queue Connection
queueConnection	TokenNameIdentifier	 queue Connection
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QueueSession	TokenNameIdentifier	 Queue Session
queueSession	TokenNameIdentifier	 queue Session
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QueueSender	TokenNameIdentifier	 Queue Sender
queueSender	TokenNameIdentifier	 queue Sender
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Queue	TokenNameIdentifier	 Queue
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
initialContextFactory	TokenNameIdentifier	 initial Context Factory
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
providerUrl	TokenNameIdentifier	 provider Url
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
queueBindingName	TokenNameIdentifier	 queue Binding Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
queueConnectionFactoryBindingName	TokenNameIdentifier	 queue Connection Factory Binding Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JMSQueueAppender	TokenNameIdentifier	 JMS Queue Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The <b>InitialContextFactory</b> option takes a string value. * Its value, along with the <b>ProviderUrl</b> option will be used * to get the InitialContext. */	TokenNameCOMMENT_JAVADOC	 The <b>InitialContextFactory</b> option takes a string value. Its value, along with the <b>ProviderUrl</b> option will be used to get the InitialContext. 
public	TokenNamepublic	
void	TokenNamevoid	
setInitialContextFactory	TokenNameIdentifier	 set Initial Context Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
initialContextFactory	TokenNameIdentifier	 initial Context Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initialContextFactory	TokenNameIdentifier	 initial Context Factory
=	TokenNameEQUAL	
initialContextFactory	TokenNameIdentifier	 initial Context Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the <b>InitialContextFactory</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>InitialContextFactory</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInitialContextFactory	TokenNameIdentifier	 get Initial Context Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
initialContextFactory	TokenNameIdentifier	 initial Context Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <b>ProviderUrl</b> option takes a string value. * Its value, along with the <b>InitialContextFactory</b> option will be used * to get the InitialContext. */	TokenNameCOMMENT_JAVADOC	 The <b>ProviderUrl</b> option takes a string value. Its value, along with the <b>InitialContextFactory</b> option will be used to get the InitialContext. 
public	TokenNamepublic	
void	TokenNamevoid	
setProviderUrl	TokenNameIdentifier	 set Provider Url
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
providerUrl	TokenNameIdentifier	 provider Url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
providerUrl	TokenNameIdentifier	 provider Url
=	TokenNameEQUAL	
providerUrl	TokenNameIdentifier	 provider Url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the <b>ProviderUrl</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>ProviderUrl</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProviderUrl	TokenNameIdentifier	 get Provider Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
providerUrl	TokenNameIdentifier	 provider Url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <b>QueueConnectionFactoryBindingName</b> option takes a * string value. Its value will be used to lookup the appropriate * <code>QueueConnectionFactory</code> from the JNDI context. */	TokenNameCOMMENT_JAVADOC	 The <b>QueueConnectionFactoryBindingName</b> option takes a string value. Its value will be used to lookup the appropriate <code>QueueConnectionFactory</code> from the JNDI context. 
public	TokenNamepublic	
void	TokenNamevoid	
setQueueConnectionFactoryBindingName	TokenNameIdentifier	 set Queue Connection Factory Binding Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queueConnectionFactoryBindingName	TokenNameIdentifier	 queue Connection Factory Binding Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queueConnectionFactoryBindingName	TokenNameIdentifier	 queue Connection Factory Binding Name
=	TokenNameEQUAL	
queueConnectionFactoryBindingName	TokenNameIdentifier	 queue Connection Factory Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value of the <b>QueueConnectionFactoryBindingName</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>QueueConnectionFactoryBindingName</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQueueConnectionFactoryBindingName	TokenNameIdentifier	 get Queue Connection Factory Binding Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queueConnectionFactoryBindingName	TokenNameIdentifier	 queue Connection Factory Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <b>QueueBindingName</b> option takes a * string value. Its value will be used to lookup the appropriate * destination <code>Queue</code> from the JNDI context. */	TokenNameCOMMENT_JAVADOC	 The <b>QueueBindingName</b> option takes a string value. Its value will be used to lookup the appropriate destination <code>Queue</code> from the JNDI context. 
public	TokenNamepublic	
void	TokenNamevoid	
setQueueBindingName	TokenNameIdentifier	 set Queue Binding Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queueBindingName	TokenNameIdentifier	 queue Binding Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queueBindingName	TokenNameIdentifier	 queue Binding Name
=	TokenNameEQUAL	
queueBindingName	TokenNameIdentifier	 queue Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>QueueBindingName</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>QueueBindingName</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQueueBindingName	TokenNameIdentifier	 get Queue Binding Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queueBindingName	TokenNameIdentifier	 queue Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overriding this method to activate the options for this class * i.e. Looking up the Connection factory ... */	TokenNameCOMMENT_JAVADOC	 Overriding this method to activate the options for this class i.e. Looking up the Connection factory ... 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueueConnectionFactory	TokenNameIdentifier	 Queue Connection Factory
queueConnectionFactory	TokenNameIdentifier	 queue Connection Factory
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
getInitialContext	TokenNameIdentifier	 get Initial Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueConnectionFactory	TokenNameIdentifier	 queue Connection Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QueueConnectionFactory	TokenNameIdentifier	 Queue Connection Factory
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
queueConnectionFactoryBindingName	TokenNameIdentifier	 queue Connection Factory Binding Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueConnection	TokenNameIdentifier	 queue Connection
=	TokenNameEQUAL	
queueConnectionFactory	TokenNameIdentifier	 queue Connection Factory
.	TokenNameDOT	
createQueueConnection	TokenNameIdentifier	 create Queue Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueSession	TokenNameIdentifier	 queue Session
=	TokenNameEQUAL	
queueConnection	TokenNameIdentifier	 queue Connection
.	TokenNameDOT	
createQueueSession	TokenNameIdentifier	 create Queue Session
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
.	TokenNameDOT	
AUTO_ACKNOWLEDGE	TokenNameIdentifier	 AUTO  ACKNOWLEDGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Queue	TokenNameIdentifier	 Queue
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Queue	TokenNameIdentifier	 Queue
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
queueBindingName	TokenNameIdentifier	 queue Binding Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueSender	TokenNameIdentifier	 queue Sender
=	TokenNameEQUAL	
queueSession	TokenNameIdentifier	 queue Session
.	TokenNameDOT	
createSender	TokenNameIdentifier	 create Sender
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueConnection	TokenNameIdentifier	 queue Connection
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error while activating options for appender named ["	TokenNameStringLiteral	Error while activating options for appender named [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
GENERIC_FAILURE	TokenNameIdentifier	 GENERIC  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
InitialContext	TokenNameIdentifier	 Initial Context
getInitialContext	TokenNameIdentifier	 get Initial Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NamingException	TokenNameIdentifier	 Naming Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Populate property hashtable with data to retrieve the context. 	TokenNameCOMMENT_LINE	Populate property hashtable with data to retrieve the context. 
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
INITIAL_CONTEXT_FACTORY	TokenNameIdentifier	 INITIAL  CONTEXT  FACTORY
,	TokenNameCOMMA	
initialContextFactory	TokenNameIdentifier	 initial Context Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
PROVIDER_URL	TokenNameIdentifier	 PROVIDER  URL
,	TokenNameCOMMA	
providerUrl	TokenNameIdentifier	 provider Url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
InitialContext	TokenNameIdentifier	 Initial Context
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NamingException	TokenNameIdentifier	 Naming Exception
ne	TokenNameIdentifier	 ne
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not get initial context with ["	TokenNameStringLiteral	Could not get initial context with [
+	TokenNamePLUS	
initialContextFactory	TokenNameIdentifier	 initial Context Factory
+	TokenNamePLUS	
"] and ["	TokenNameStringLiteral	] and [
+	TokenNamePLUS	
providerUrl	TokenNameIdentifier	 provider Url
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ne	TokenNameIdentifier	 ne
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
checkEntryConditions	TokenNameIdentifier	 check Entry Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queueConnection	TokenNameIdentifier	 queue Connection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
"No QueueConnection"	TokenNameStringLiteral	No QueueConnection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queueSession	TokenNameIdentifier	 queue Session
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
"No QueueSession"	TokenNameStringLiteral	No QueueSession
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queueSender	TokenNameIdentifier	 queue Sender
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
"No QueueSender"	TokenNameStringLiteral	No QueueSender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
+	TokenNamePLUS	
" for JMSQueueAppender named ["	TokenNameStringLiteral	 for JMSQueueAppender named [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Close this JMSQueueAppender. Closing releases all resources used by the * appender. A closed appender cannot be re-opened. */	TokenNameCOMMENT_JAVADOC	 Close this JMSQueueAppender. Closing releases all resources used by the appender. A closed appender cannot be re-opened. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
// avoid concurrent append and close operations 	TokenNameCOMMENT_LINE	avoid concurrent append and close operations 
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Closing appender ["	TokenNameStringLiteral	Closing appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queueSession	TokenNameIdentifier	 queue Session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
queueSession	TokenNameIdentifier	 queue Session
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
queueConnection	TokenNameIdentifier	 queue Connection
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
queueConnection	TokenNameIdentifier	 queue Connection
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error while closing JMSQueueAppender ["	TokenNameStringLiteral	Error while closing JMSQueueAppender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Help garbage collection 	TokenNameCOMMENT_LINE	Help garbage collection 
queueSender	TokenNameIdentifier	 queue Sender
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
queueSession	TokenNameIdentifier	 queue Session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
queueConnection	TokenNameIdentifier	 queue Connection
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method called by {@link AppenderSkeleton#doAppend} method to * do most of the real appending work. The LoggingEvent will be * be wrapped in an ObjectMessage to be put on the JMS queue. */	TokenNameCOMMENT_JAVADOC	 This method called by {@link AppenderSkeleton#doAppend} method to do most of the real appending work. The LoggingEvent will be be wrapped in an ObjectMessage to be put on the JMS queue. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkEntryConditions	TokenNameIdentifier	 check Entry Conditions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ObjectMessage	TokenNameIdentifier	 Object Message
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
queueSession	TokenNameIdentifier	 queue Session
.	TokenNameDOT	
createObjectMessage	TokenNameIdentifier	 create Object Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queueSender	TokenNameIdentifier	 queue Sender
.	TokenNameDOT	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not send message in JMSQueueAppender ["	TokenNameStringLiteral	Could not send message in JMSQueueAppender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
GENERIC_FAILURE	TokenNameIdentifier	 GENERIC  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

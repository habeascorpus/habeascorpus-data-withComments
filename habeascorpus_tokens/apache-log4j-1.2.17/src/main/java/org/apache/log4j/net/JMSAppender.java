/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
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
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
JMSException	TokenNameIdentifier	 JMS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
ObjectMessage	TokenNameIdentifier	 Object Message
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
Session	TokenNameIdentifier	 Session
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
Topic	TokenNameIdentifier	 Topic
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
TopicConnection	TokenNameIdentifier	 Topic Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
TopicConnectionFactory	TokenNameIdentifier	 Topic Connection Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
TopicPublisher	TokenNameIdentifier	 Topic Publisher
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
TopicSession	TokenNameIdentifier	 Topic Session
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
InitialContext	TokenNameIdentifier	 Initial Context
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * A simple appender that publishes events to a JMS Topic. The events * are serialized and transmitted as JMS message type {@link * ObjectMessage}. * <p>JMS {@link Topic topics} and {@link TopicConnectionFactory topic * connection factories} are administered objects that are retrieved * using JNDI messaging which in turn requires the retrieval of a JNDI * {@link Context}. * <p>There are two common methods for retrieving a JNDI {@link * Context}. If a file resource named <em>jndi.properties</em> is * available to the JNDI API, it will use the information found * therein to retrieve an initial JNDI context. To obtain an initial * context, your code will simply call: <pre> InitialContext jndiContext = new InitialContext(); </pre> * <p>Calling the no-argument <code>InitialContext()</code> method * will also work from within Enterprise Java Beans (EJBs) because it * is part of the EJB contract for application servers to provide each * bean an environment naming context (ENC). * <p>In the second approach, several predetermined properties are set * and these properties are passed to the <code>InitialContext</code> * constructor to connect to the naming service provider. For example, * to connect to JBoss naming service one would write: <pre> Properties env = new Properties( ); env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory"); env.put(Context.PROVIDER_URL, "jnp://hostname:1099"); env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces"); InitialContext jndiContext = new InitialContext(env); </pre> * where <em>hostname</em> is the host where the JBoss application * server is running. * * <p>To connect to the the naming service of Weblogic application * server one would write: <pre> Properties env = new Properties( ); env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory"); env.put(Context.PROVIDER_URL, "t3://localhost:7001"); InitialContext jndiContext = new InitialContext(env); </pre> * <p>Other JMS providers will obviously require different values. * * The initial JNDI context can be obtained by calling the * no-argument <code>InitialContext()</code> method in EJBs. Only * clients running in a separate JVM need to be concerned about the * <em>jndi.properties</em> file and calling {@link * InitialContext#InitialContext()} or alternatively correctly * setting the different properties before calling {@link * InitialContext#InitialContext(java.util.Hashtable)} method. @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 A simple appender that publishes events to a JMS Topic. The events are serialized and transmitted as JMS message type {@link ObjectMessage}. <p>JMS {@link Topic topics} and {@link TopicConnectionFactory topic connection factories} are administered objects that are retrieved using JNDI messaging which in turn requires the retrieval of a JNDI {@link Context}. <p>There are two common methods for retrieving a JNDI {@link Context}. If a file resource named <em>jndi.properties</em> is available to the JNDI API, it will use the information found therein to retrieve an initial JNDI context. To obtain an initial context, your code will simply call: <pre> InitialContext jndiContext = new InitialContext(); </pre> <p>Calling the no-argument <code>InitialContext()</code> method will also work from within Enterprise Java Beans (EJBs) because it is part of the EJB contract for application servers to provide each bean an environment naming context (ENC). <p>In the second approach, several predetermined properties are set and these properties are passed to the <code>InitialContext</code> constructor to connect to the naming service provider. For example, to connect to JBoss naming service one would write: <pre> Properties env = new Properties( ); env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory"); env.put(Context.PROVIDER_URL, "jnp://hostname:1099"); env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces"); InitialContext jndiContext = new InitialContext(env); </pre> where <em>hostname</em> is the host where the JBoss application server is running. * <p>To connect to the the naming service of Weblogic application server one would write: <pre> Properties env = new Properties( ); env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory"); env.put(Context.PROVIDER_URL, "t3://localhost:7001"); InitialContext jndiContext = new InitialContext(env); </pre> <p>Other JMS providers will obviously require different values. * The initial JNDI context can be obtained by calling the no-argument <code>InitialContext()</code> method in EJBs. Only clients running in a separate JVM need to be concerned about the <em>jndi.properties</em> file and calling {@link InitialContext#InitialContext()} or alternatively correctly setting the different properties before calling {@link InitialContext#InitialContext(java.util.Hashtable)} method. @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
JMSAppender	TokenNameIdentifier	 JMS Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
securityPrincipalName	TokenNameIdentifier	 security Principal Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
securityCredentials	TokenNameIdentifier	 security Credentials
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
providerURL	TokenNameIdentifier	 provider URL
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
topicBindingName	TokenNameIdentifier	 topic Binding Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
TopicConnection	TokenNameIdentifier	 Topic Connection
topicConnection	TokenNameIdentifier	 topic Connection
;	TokenNameSEMICOLON	
TopicSession	TokenNameIdentifier	 Topic Session
topicSession	TokenNameIdentifier	 topic Session
;	TokenNameSEMICOLON	
TopicPublisher	TokenNameIdentifier	 Topic Publisher
topicPublisher	TokenNameIdentifier	 topic Publisher
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JMSAppender	TokenNameIdentifier	 JMS Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** The <b>TopicConnectionFactoryBindingName</b> option takes a string value. Its value will be used to lookup the appropriate <code>TopicConnectionFactory</code> from the JNDI context. */	TokenNameCOMMENT_JAVADOC	 The <b>TopicConnectionFactoryBindingName</b> option takes a string value. Its value will be used to lookup the appropriate <code>TopicConnectionFactory</code> from the JNDI context. 
public	TokenNamepublic	
void	TokenNamevoid	
setTopicConnectionFactoryBindingName	TokenNameIdentifier	 set Topic Connection Factory Binding Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
=	TokenNameEQUAL	
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>TopicConnectionFactoryBindingName</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>TopicConnectionFactoryBindingName</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTopicConnectionFactoryBindingName	TokenNameIdentifier	 get Topic Connection Factory Binding Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>TopicBindingName</b> option takes a string value. Its value will be used to lookup the appropriate <code>Topic</code> from the JNDI context. */	TokenNameCOMMENT_JAVADOC	 The <b>TopicBindingName</b> option takes a string value. Its value will be used to lookup the appropriate <code>Topic</code> from the JNDI context. 
public	TokenNamepublic	
void	TokenNamevoid	
setTopicBindingName	TokenNameIdentifier	 set Topic Binding Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
topicBindingName	TokenNameIdentifier	 topic Binding Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
topicBindingName	TokenNameIdentifier	 topic Binding Name
=	TokenNameEQUAL	
topicBindingName	TokenNameIdentifier	 topic Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>TopicBindingName</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>TopicBindingName</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTopicBindingName	TokenNameIdentifier	 get Topic Binding Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
topicBindingName	TokenNameIdentifier	 topic Binding Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns value of the <b>LocationInfo</b> property which determines whether location (stack) info is sent to the remote subscriber. */	TokenNameCOMMENT_JAVADOC	 Returns value of the <b>LocationInfo</b> property which determines whether location (stack) info is sent to the remote subscriber. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Options are activated and become effective only after calling * this method.*/	TokenNameCOMMENT_JAVADOC	 Options are activated and become effective only after calling this method.
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TopicConnectionFactory	TokenNameIdentifier	 Topic Connection Factory
topicConnectionFactory	TokenNameIdentifier	 topic Connection Factory
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Context	TokenNameIdentifier	 Context
jndi	TokenNameIdentifier	 jndi
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Getting initial context."	TokenNameStringLiteral	Getting initial context.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
env	TokenNameIdentifier	 env
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
INITIAL_CONTEXT_FACTORY	TokenNameIdentifier	 INITIAL  CONTEXT  FACTORY
,	TokenNameCOMMA	
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
providerURL	TokenNameIdentifier	 provider URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
PROVIDER_URL	TokenNameIdentifier	 PROVIDER  URL
,	TokenNameCOMMA	
providerURL	TokenNameIdentifier	 provider URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"You have set InitialContextFactoryName option but not the "	TokenNameStringLiteral	You have set InitialContextFactoryName option but not the 
+	TokenNamePLUS	
"ProviderURL. This is likely to cause problems."	TokenNameStringLiteral	ProviderURL. This is likely to cause problems.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
URL_PKG_PREFIXES	TokenNameIdentifier	 URL  PKG  PREFIXES
,	TokenNameCOMMA	
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
securityPrincipalName	TokenNameIdentifier	 security Principal Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
SECURITY_PRINCIPAL	TokenNameIdentifier	 SECURITY  PRINCIPAL
,	TokenNameCOMMA	
securityPrincipalName	TokenNameIdentifier	 security Principal Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
securityCredentials	TokenNameIdentifier	 security Credentials
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
env	TokenNameIdentifier	 env
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
.	TokenNameDOT	
SECURITY_CREDENTIALS	TokenNameIdentifier	 SECURITY  CREDENTIALS
,	TokenNameCOMMA	
securityCredentials	TokenNameIdentifier	 security Credentials
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"You have set SecurityPrincipalName option but not the "	TokenNameStringLiteral	You have set SecurityPrincipalName option but not the 
+	TokenNamePLUS	
"SecurityCredentials. This is likely to cause problems."	TokenNameStringLiteral	SecurityCredentials. This is likely to cause problems.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
jndi	TokenNameIdentifier	 jndi
=	TokenNameEQUAL	
new	TokenNamenew	
InitialContext	TokenNameIdentifier	 Initial Context
(	TokenNameLPAREN	
env	TokenNameIdentifier	 env
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
jndi	TokenNameIdentifier	 jndi
=	TokenNameEQUAL	
new	TokenNamenew	
InitialContext	TokenNameIdentifier	 Initial Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Looking up ["	TokenNameStringLiteral	Looking up [
+	TokenNamePLUS	
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topicConnectionFactory	TokenNameIdentifier	 topic Connection Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopicConnectionFactory	TokenNameIdentifier	 Topic Connection Factory
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
jndi	TokenNameIdentifier	 jndi
,	TokenNameCOMMA	
tcfBindingName	TokenNameIdentifier	 tcf Binding Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"About to create TopicConnection."	TokenNameStringLiteral	About to create TopicConnection.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
userName	TokenNameIdentifier	 user Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
topicConnection	TokenNameIdentifier	 topic Connection
=	TokenNameEQUAL	
topicConnectionFactory	TokenNameIdentifier	 topic Connection Factory
.	TokenNameDOT	
createTopicConnection	TokenNameIdentifier	 create Topic Connection
(	TokenNameLPAREN	
userName	TokenNameIdentifier	 user Name
,	TokenNameCOMMA	
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
topicConnection	TokenNameIdentifier	 topic Connection
=	TokenNameEQUAL	
topicConnectionFactory	TokenNameIdentifier	 topic Connection Factory
.	TokenNameDOT	
createTopicConnection	TokenNameIdentifier	 create Topic Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Creating TopicSession, non-transactional, "	TokenNameStringLiteral	Creating TopicSession, non-transactional, 
+	TokenNamePLUS	
"in AUTO_ACKNOWLEDGE mode."	TokenNameStringLiteral	in AUTO_ACKNOWLEDGE mode.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topicSession	TokenNameIdentifier	 topic Session
=	TokenNameEQUAL	
topicConnection	TokenNameIdentifier	 topic Connection
.	TokenNameDOT	
createTopicSession	TokenNameIdentifier	 create Topic Session
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
Session	TokenNameIdentifier	 Session
.	TokenNameDOT	
AUTO_ACKNOWLEDGE	TokenNameIdentifier	 AUTO  ACKNOWLEDGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Looking up topic name ["	TokenNameStringLiteral	Looking up topic name [
+	TokenNamePLUS	
topicBindingName	TokenNameIdentifier	 topic Binding Name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Topic	TokenNameIdentifier	 Topic
topic	TokenNameIdentifier	 topic
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Topic	TokenNameIdentifier	 Topic
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
jndi	TokenNameIdentifier	 jndi
,	TokenNameCOMMA	
topicBindingName	TokenNameIdentifier	 topic Binding Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Creating TopicPublisher."	TokenNameStringLiteral	Creating TopicPublisher.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topicPublisher	TokenNameIdentifier	 topic Publisher
=	TokenNameEQUAL	
topicSession	TokenNameIdentifier	 topic Session
.	TokenNameDOT	
createPublisher	TokenNameIdentifier	 create Publisher
(	TokenNameLPAREN	
topic	TokenNameIdentifier	 topic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Starting TopicConnection."	TokenNameStringLiteral	Starting TopicConnection.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topicConnection	TokenNameIdentifier	 topic Connection
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jndi	TokenNameIdentifier	 jndi
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JMSException	TokenNameIdentifier	 JMS Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
NamingException	TokenNameIdentifier	 Naming Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
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
Object	TokenNameIdentifier	 Object
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
NamingException	TokenNameIdentifier	 Naming Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NameNotFoundException	TokenNameIdentifier	 Name Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not find name ["	TokenNameStringLiteral	Could not find name [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
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
topicConnection	TokenNameIdentifier	 topic Connection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
"No TopicConnection"	TokenNameStringLiteral	No TopicConnection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
topicSession	TokenNameIdentifier	 topic Session
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
"No TopicSession"	TokenNameStringLiteral	No TopicSession
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
topicPublisher	TokenNameIdentifier	 topic Publisher
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
"No TopicPublisher"	TokenNameStringLiteral	No TopicPublisher
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
" for JMSAppender named ["	TokenNameStringLiteral	 for JMSAppender named [
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
/** Close this JMSAppender. Closing releases all resources used by the appender. A closed appender cannot be re-opened. */	TokenNameCOMMENT_JAVADOC	 Close this JMSAppender. Closing releases all resources used by the appender. A closed appender cannot be re-opened. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The synchronized modifier avoids concurrent append and close operations 	TokenNameCOMMENT_LINE	The synchronized modifier avoids concurrent append and close operations 
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
topicSession	TokenNameIdentifier	 topic Session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
topicSession	TokenNameIdentifier	 topic Session
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
topicConnection	TokenNameIdentifier	 topic Connection
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
topicConnection	TokenNameIdentifier	 topic Connection
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JMSException	TokenNameIdentifier	 JMS Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error while closing JMSAppender ["	TokenNameStringLiteral	Error while closing JMSAppender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error while closing JMSAppender ["	TokenNameStringLiteral	Error while closing JMSAppender [
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
topicPublisher	TokenNameIdentifier	 topic Publisher
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
topicSession	TokenNameIdentifier	 topic Session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
topicConnection	TokenNameIdentifier	 topic Connection
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method called by {@link AppenderSkeleton#doAppend} method to do most of the real appending work. */	TokenNameCOMMENT_JAVADOC	 This method called by {@link AppenderSkeleton#doAppend} method to do most of the real appending work. 
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
topicSession	TokenNameIdentifier	 topic Session
.	TokenNameDOT	
createObjectMessage	TokenNameIdentifier	 create Object Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topicPublisher	TokenNameIdentifier	 topic Publisher
.	TokenNameDOT	
publish	TokenNameIdentifier	 publish
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JMSException	TokenNameIdentifier	 JMS Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not publish message in JMSAppender ["	TokenNameStringLiteral	Could not publish message in JMSAppender [
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not publish message in JMSAppender ["	TokenNameStringLiteral	Could not publish message in JMSAppender [
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
/** * Returns the value of the <b>InitialContextFactoryName</b> option. * See {@link #setInitialContextFactoryName} for more details on the * meaning of this option. * */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>InitialContextFactoryName</b> option. See {@link #setInitialContextFactoryName} for more details on the meaning of this option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInitialContextFactoryName	TokenNameIdentifier	 get Initial Context Factory Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setting the <b>InitialContextFactoryName</b> method will cause * this <code>JMSAppender</code> instance to use the {@link * InitialContext#InitialContext(Hashtable)} method instead of the * no-argument constructor. If you set this option, you should also * at least set the <b>ProviderURL</b> option. * * <p>See also {@link #setProviderURL(String)}. * */	TokenNameCOMMENT_JAVADOC	 Setting the <b>InitialContextFactoryName</b> method will cause this <code>JMSAppender</code> instance to use the {@link InitialContext#InitialContext(Hashtable)} method instead of the no-argument constructor. If you set this option, you should also at least set the <b>ProviderURL</b> option. * <p>See also {@link #setProviderURL(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setInitialContextFactoryName	TokenNameIdentifier	 set Initial Context Factory Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
=	TokenNameEQUAL	
initialContextFactoryName	TokenNameIdentifier	 initial Context Factory Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProviderURL	TokenNameIdentifier	 get Provider URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
providerURL	TokenNameIdentifier	 provider URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setProviderURL	TokenNameIdentifier	 set Provider URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
providerURL	TokenNameIdentifier	 provider URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
providerURL	TokenNameIdentifier	 provider URL
=	TokenNameEQUAL	
providerURL	TokenNameIdentifier	 provider URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getURLPkgPrefixes	TokenNameIdentifier	 get URL Pkg Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setURLPkgPrefixes	TokenNameIdentifier	 set URL Pkg Prefixes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
=	TokenNameEQUAL	
urlPkgPrefixes	TokenNameIdentifier	 url Pkg Prefixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSecurityCredentials	TokenNameIdentifier	 get Security Credentials
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
securityCredentials	TokenNameIdentifier	 security Credentials
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSecurityCredentials	TokenNameIdentifier	 set Security Credentials
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
securityCredentials	TokenNameIdentifier	 security Credentials
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
securityCredentials	TokenNameIdentifier	 security Credentials
=	TokenNameEQUAL	
securityCredentials	TokenNameIdentifier	 security Credentials
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSecurityPrincipalName	TokenNameIdentifier	 get Security Principal Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
securityPrincipalName	TokenNameIdentifier	 security Principal Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSecurityPrincipalName	TokenNameIdentifier	 set Security Principal Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
securityPrincipalName	TokenNameIdentifier	 security Principal Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
securityPrincipalName	TokenNameIdentifier	 security Principal Name
=	TokenNameEQUAL	
securityPrincipalName	TokenNameIdentifier	 security Principal Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The user name to use when {@link * TopicConnectionFactory#createTopicConnection(String, String) * creating a topic session}. If you set this option, you should * also set the <b>Password</b> option. See {@link * #setPassword(String)}. * */	TokenNameCOMMENT_JAVADOC	 The user name to use when {@link TopicConnectionFactory#createTopicConnection(String, String) creating a topic session}. If you set this option, you should also set the <b>Password</b> option. See {@link #setPassword(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The paswword to use when creating a topic session. */	TokenNameCOMMENT_JAVADOC	 The paswword to use when creating a topic session. 
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
/** If true, the information sent to the remote subscriber will include caller's location information. By default no location information is sent to the subscriber. */	TokenNameCOMMENT_JAVADOC	 If true, the information sent to the remote subscriber will include caller's location information. By default no location information is sent to the subscriber. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
boolean	TokenNameboolean	
locationInfo	TokenNameIdentifier	 location Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
locationInfo	TokenNameIdentifier	 location Info
=	TokenNameEQUAL	
locationInfo	TokenNameIdentifier	 location Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the TopicConnection used for this appender. Only valid after * activateOptions() method has been invoked. */	TokenNameCOMMENT_JAVADOC	 Returns the TopicConnection used for this appender. Only valid after activateOptions() method has been invoked. 
protected	TokenNameprotected	
TopicConnection	TokenNameIdentifier	 Topic Connection
getTopicConnection	TokenNameIdentifier	 get Topic Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
topicConnection	TokenNameIdentifier	 topic Connection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the TopicSession used for this appender. Only valid after * activateOptions() method has been invoked. */	TokenNameCOMMENT_JAVADOC	 Returns the TopicSession used for this appender. Only valid after activateOptions() method has been invoked. 
protected	TokenNameprotected	
TopicSession	TokenNameIdentifier	 Topic Session
getTopicSession	TokenNameIdentifier	 get Topic Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
topicSession	TokenNameIdentifier	 topic Session
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the TopicPublisher used for this appender. Only valid after * activateOptions() method has been invoked. */	TokenNameCOMMENT_JAVADOC	 Returns the TopicPublisher used for this appender. Only valid after activateOptions() method has been invoked. 
protected	TokenNameprotected	
TopicPublisher	TokenNameIdentifier	 Topic Publisher
getTopicPublisher	TokenNameIdentifier	 get Topic Publisher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
topicPublisher	TokenNameIdentifier	 topic Publisher
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The JMSAppender sends serialized events and consequently does not * require a layout. */	TokenNameCOMMENT_JAVADOC	 The JMSAppender sends serialized events and consequently does not require a layout. 
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

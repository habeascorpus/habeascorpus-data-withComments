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
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Policy	TokenNameIdentifier	 Policy
;	TokenNameSEMICOLON	
/** * This is a helper class which helps applications enforce secure * script execution. * <br /> * It is used by the Squiggle browser as well as the rasterizer. * <br /> * This class can install a <tt>SecurityManager</tt> for an application * and resolves whether the application runs in a development * environment or from a jar file (in other words, it resolves code-base * issues for the application). * <br /> * * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: ApplicationSecurityEnforcer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is a helper class which helps applications enforce secure script execution. <br /> It is used by the Squiggle browser as well as the rasterizer. <br /> This class can install a <tt>SecurityManager</tt> for an application and resolves whether the application runs in a development environment or from a jar file (in other words, it resolves code-base issues for the application). <br /> * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: ApplicationSecurityEnforcer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ApplicationSecurityEnforcer	TokenNameIdentifier	 Application Security Enforcer
{	TokenNameLBRACE	
/** * Message for the SecurityException thrown when there is already * a SecurityManager installed at the time Squiggle tries * to install its own security settings. */	TokenNameCOMMENT_JAVADOC	 Message for the SecurityException thrown when there is already a SecurityManager installed at the time Squiggle tries to install its own security settings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXCEPTION_ALIEN_SECURITY_MANAGER	TokenNameIdentifier	 EXCEPTION  ALIEN  SECURITY  MANAGER
=	TokenNameEQUAL	
"ApplicationSecurityEnforcer.message.security.exception.alien.security.manager"	TokenNameStringLiteral	ApplicationSecurityEnforcer.message.security.exception.alien.security.manager
;	TokenNameSEMICOLON	
/** * Message for the NullPointerException thrown when no policy * file can be found. */	TokenNameCOMMENT_JAVADOC	 Message for the NullPointerException thrown when no policy file can be found. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EXCEPTION_NO_POLICY_FILE	TokenNameIdentifier	 EXCEPTION  NO  POLICY  FILE
=	TokenNameEQUAL	
"ApplicationSecurityEnforcer.message.null.pointer.exception.no.policy.file"	TokenNameStringLiteral	ApplicationSecurityEnforcer.message.null.pointer.exception.no.policy.file
;	TokenNameSEMICOLON	
/** * System property for specifying an additional policy file. */	TokenNameCOMMENT_JAVADOC	 System property for specifying an additional policy file. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROPERTY_JAVA_SECURITY_POLICY	TokenNameIdentifier	 PROPERTY  JAVA  SECURITY  POLICY
=	TokenNameEQUAL	
"java.security.policy"	TokenNameStringLiteral	java.security.policy
;	TokenNameSEMICOLON	
/** * Files in a jar file have a URL with the jar protocol */	TokenNameCOMMENT_JAVADOC	 Files in a jar file have a URL with the jar protocol 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAR_PROTOCOL	TokenNameIdentifier	 JAR  PROTOCOL
=	TokenNameEQUAL	
"jar:"	TokenNameStringLiteral	jar:
;	TokenNameSEMICOLON	
/** * Used in jar file urls to separate the jar file name * from the referenced file */	TokenNameCOMMENT_JAVADOC	 Used in jar file urls to separate the jar file name from the referenced file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAR_URL_FILE_SEPARATOR	TokenNameIdentifier	 JAR  URL  FILE  SEPARATOR
=	TokenNameEQUAL	
"!/"	TokenNameStringLiteral	!/
;	TokenNameSEMICOLON	
/** * System property for App's development base directory */	TokenNameCOMMENT_JAVADOC	 System property for App's development base directory 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROPERTY_APP_DEV_BASE	TokenNameIdentifier	 PROPERTY  APP  DEV  BASE
=	TokenNameEQUAL	
"app.dev.base"	TokenNameStringLiteral	app.dev.base
;	TokenNameSEMICOLON	
/** * System property for App's jars base directory */	TokenNameCOMMENT_JAVADOC	 System property for App's jars base directory 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROPERTY_APP_JAR_BASE	TokenNameIdentifier	 PROPERTY  APP  JAR  BASE
=	TokenNameEQUAL	
"app.jar.base"	TokenNameStringLiteral	app.jar.base
;	TokenNameSEMICOLON	
/** * Directory where classes are expanded in the development * version */	TokenNameCOMMENT_JAVADOC	 Directory where classes are expanded in the development version 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
APP_MAIN_CLASS_DIR	TokenNameIdentifier	 APP  MAIN  CLASS  DIR
=	TokenNameEQUAL	
"classes/"	TokenNameStringLiteral	classes/
;	TokenNameSEMICOLON	
/** * The application's main entry point */	TokenNameCOMMENT_JAVADOC	 The application's main entry point 
protected	TokenNameprotected	
Class	TokenNameIdentifier	 Class
appMainClass	TokenNameIdentifier	 app Main Class
;	TokenNameSEMICOLON	
/** * The application's security policy */	TokenNameCOMMENT_JAVADOC	 The application's security policy 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
securityPolicy	TokenNameIdentifier	 security Policy
;	TokenNameSEMICOLON	
/** * The resource name for the application's main class */	TokenNameCOMMENT_JAVADOC	 The resource name for the application's main class 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
appMainClassRelativeURL	TokenNameIdentifier	 app Main Class Relative URL
;	TokenNameSEMICOLON	
/** * Keeps track of the last SecurityManager installed */	TokenNameCOMMENT_JAVADOC	 Keeps track of the last SecurityManager installed 
protected	TokenNameprotected	
BatikSecurityManager	TokenNameIdentifier	 Batik Security Manager
lastSecurityManagerInstalled	TokenNameIdentifier	 last Security Manager Installed
;	TokenNameSEMICOLON	
/** * Creates a new ApplicationSecurityEnforcer. * @param appMainClass class of the applications's main entry point * @param securityPolicy resource for the security policy which * should be enforced for the application. * @param appJarFile the Jar file into which the application is * packaged. * @deprecated This constructor is now deprecated. Use the two * argument constructor instead as this version will * be removed after the 1.5beta4 release. */	TokenNameCOMMENT_JAVADOC	 Creates a new ApplicationSecurityEnforcer. @param appMainClass class of the applications's main entry point @param securityPolicy resource for the security policy which should be enforced for the application. @param appJarFile the Jar file into which the application is packaged. @deprecated This constructor is now deprecated. Use the two argument constructor instead as this version will be removed after the 1.5beta4 release. 
public	TokenNamepublic	
ApplicationSecurityEnforcer	TokenNameIdentifier	 Application Security Enforcer
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
appMainClass	TokenNameIdentifier	 app Main Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
securityPolicy	TokenNameIdentifier	 security Policy
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
appJarFile	TokenNameIdentifier	 app Jar File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
appMainClass	TokenNameIdentifier	 app Main Class
,	TokenNameCOMMA	
securityPolicy	TokenNameIdentifier	 security Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new ApplicationSecurityEnforcer. * @param appMainClass class of the applications's main entry point * @param securityPolicy resource for the security policy which * should be enforced for the application. */	TokenNameCOMMENT_JAVADOC	 Creates a new ApplicationSecurityEnforcer. @param appMainClass class of the applications's main entry point @param securityPolicy resource for the security policy which should be enforced for the application. 
public	TokenNamepublic	
ApplicationSecurityEnforcer	TokenNameIdentifier	 Application Security Enforcer
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
appMainClass	TokenNameIdentifier	 app Main Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
securityPolicy	TokenNameIdentifier	 security Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appMainClass	TokenNameIdentifier	 app Main Class
=	TokenNameEQUAL	
appMainClass	TokenNameIdentifier	 app Main Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
securityPolicy	TokenNameIdentifier	 security Policy
=	TokenNameEQUAL	
securityPolicy	TokenNameIdentifier	 security Policy
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
appMainClassRelativeURL	TokenNameIdentifier	 app Main Class Relative URL
=	TokenNameEQUAL	
appMainClass	TokenNameIdentifier	 app Main Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enforces security by installing a <tt>SecurityManager</tt>. * This will throw a <tt>SecurityException</tt> if installing * a <tt>SecurityManager</tt> requires overriding an existing * <tt>SecurityManager</tt>. In other words, this method will * not install a new <tt>SecurityManager</tt> if there is * already one it did not install in place. */	TokenNameCOMMENT_JAVADOC	 Enforces security by installing a <tt>SecurityManager</tt>. This will throw a <tt>SecurityException</tt> if installing a <tt>SecurityManager</tt> requires overriding an existing <tt>SecurityManager</tt>. In other words, this method will not install a new <tt>SecurityManager</tt> if there is already one it did not install in place. 
public	TokenNamepublic	
void	TokenNamevoid	
enforceSecurity	TokenNameIdentifier	 enforce Security
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enforce	TokenNameIdentifier	 enforce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SecurityManager	TokenNameIdentifier	 Security Manager
sm	TokenNameIdentifier	 sm
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getSecurityManager	TokenNameIdentifier	 get Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sm	TokenNameIdentifier	 sm
!=	TokenNameNOT_EQUAL	
lastSecurityManagerInstalled	TokenNameIdentifier	 last Security Manager Installed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Throw a Security exception: we do not want to override 	TokenNameCOMMENT_LINE	Throw a Security exception: we do not want to override 
// an 'alien' SecurityManager with either null or 	TokenNameCOMMENT_LINE	an 'alien' SecurityManager with either null or 
// a new SecurityManager. 	TokenNameCOMMENT_LINE	a new SecurityManager. 
throw	TokenNamethrow	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
EXCEPTION_ALIEN_SECURITY_MANAGER	TokenNameIdentifier	 EXCEPTION  ALIEN  SECURITY  MANAGER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
enforce	TokenNameIdentifier	 enforce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We first set the security manager to null to 	TokenNameCOMMENT_LINE	We first set the security manager to null to 
// force reloading of the policy file in case there 	TokenNameCOMMENT_LINE	force reloading of the policy file in case there 
// has been a change since it was last enforced (this 	TokenNameCOMMENT_LINE	has been a change since it was last enforced (this 
// may happen with dynamically generated policy files). 	TokenNameCOMMENT_LINE	may happen with dynamically generated policy files). 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
installSecurityManager	TokenNameIdentifier	 install Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sm	TokenNameIdentifier	 sm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastSecurityManagerInstalled	TokenNameIdentifier	 last Security Manager Installed
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the url for the default policy. This never * returns null, but it may throw a NullPointerException */	TokenNameCOMMENT_JAVADOC	 Returns the url for the default policy. This never returns null, but it may throw a NullPointerException 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getPolicyURL	TokenNameIdentifier	 get Policy URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
appMainClass	TokenNameIdentifier	 app Main Class
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
policyURL	TokenNameIdentifier	 policy URL
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
securityPolicy	TokenNameIdentifier	 security Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
policyURL	TokenNameIdentifier	 policy URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
EXCEPTION_NO_POLICY_FILE	TokenNameIdentifier	 EXCEPTION  NO  POLICY  FILE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
securityPolicy	TokenNameIdentifier	 security Policy
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
policyURL	TokenNameIdentifier	 policy URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Installs a SecurityManager on behalf of the application */	TokenNameCOMMENT_JAVADOC	 Installs a SecurityManager on behalf of the application 
public	TokenNamepublic	
void	TokenNamevoid	
installSecurityManager	TokenNameIdentifier	 install Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Policy	TokenNameIdentifier	 Policy
policy	TokenNameIdentifier	 policy
=	TokenNameEQUAL	
Policy	TokenNameIdentifier	 Policy
.	TokenNameDOT	
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BatikSecurityManager	TokenNameIdentifier	 Batik Security Manager
securityManager	TokenNameIdentifier	 security Manager
=	TokenNameEQUAL	
new	TokenNamenew	
BatikSecurityManager	TokenNameIdentifier	 Batik Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// If there is a java.security.policy property defined, 	TokenNameCOMMENT_LINE	If there is a java.security.policy property defined, 
// it takes precedence over the one passed to this object. 	TokenNameCOMMENT_LINE	it takes precedence over the one passed to this object. 
// Otherwise, we default to the one passed to the constructor 	TokenNameCOMMENT_LINE	Otherwise, we default to the one passed to the constructor 
// 	TokenNameCOMMENT_LINE	 
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
appMainClass	TokenNameIdentifier	 app Main Class
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
securityPolicyProperty	TokenNameIdentifier	 security Policy Property
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROPERTY_JAVA_SECURITY_POLICY	TokenNameIdentifier	 PROPERTY  JAVA  SECURITY  POLICY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
securityPolicyProperty	TokenNameIdentifier	 security Policy Property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
securityPolicyProperty	TokenNameIdentifier	 security Policy Property
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Specify app's security policy in the 	TokenNameCOMMENT_LINE	Specify app's security policy in the 
// system property. 	TokenNameCOMMENT_LINE	system property. 
URL	TokenNameIdentifier	 URL
policyURL	TokenNameIdentifier	 policy URL
=	TokenNameEQUAL	
getPolicyURL	TokenNameIdentifier	 get Policy URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROPERTY_JAVA_SECURITY_POLICY	TokenNameIdentifier	 PROPERTY  JAVA  SECURITY  POLICY
,	TokenNameCOMMA	
policyURL	TokenNameIdentifier	 policy URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// The following detects whether the application is running in the 	TokenNameCOMMENT_LINE	The following detects whether the application is running in the 
// development environment, in which case it will set the 	TokenNameCOMMENT_LINE	development environment, in which case it will set the 
// app.dev.base property or if it is running in the binary 	TokenNameCOMMENT_LINE	app.dev.base property or if it is running in the binary 
// distribution, in which case it will set the app.jar.base 	TokenNameCOMMENT_LINE	distribution, in which case it will set the app.jar.base 
// property. These properties are expanded in the security 	TokenNameCOMMENT_LINE	property. These properties are expanded in the security 
// policy files. 	TokenNameCOMMENT_LINE	policy files. 
// Property expansion is used to provide portability of the 	TokenNameCOMMENT_LINE	Property expansion is used to provide portability of the 
// policy files between various code bases (e.g., file base, 	TokenNameCOMMENT_LINE	policy files between various code bases (e.g., file base, 
// server base, etc..). 	TokenNameCOMMENT_LINE	server base, etc..). 
// 	TokenNameCOMMENT_LINE	 
URL	TokenNameIdentifier	 URL
mainClassURL	TokenNameIdentifier	 main Class URL
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
appMainClassRelativeURL	TokenNameIdentifier	 app Main Class Relative URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mainClassURL	TokenNameIdentifier	 main Class URL
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Something is really wrong: we would be running a class 	TokenNameCOMMENT_LINE	Something is really wrong: we would be running a class 
// which can't be found.... 	TokenNameCOMMENT_LINE	which can't be found.... 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
appMainClassRelativeURL	TokenNameIdentifier	 app Main Class Relative URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
=	TokenNameEQUAL	
mainClassURL	TokenNameIdentifier	 main Class URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
JAR_PROTOCOL	TokenNameIdentifier	 JAR  PROTOCOL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setJarBase	TokenNameIdentifier	 set Jar Base
(	TokenNameLPAREN	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setDevBase	TokenNameIdentifier	 set Dev Base
(	TokenNameLPAREN	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Install new security manager 	TokenNameCOMMENT_LINE	Install new security manager 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
securityManager	TokenNameIdentifier	 security Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastSecurityManagerInstalled	TokenNameIdentifier	 last Security Manager Installed
=	TokenNameEQUAL	
securityManager	TokenNameIdentifier	 security Manager
;	TokenNameSEMICOLON	
// Forces re-loading of the security policy 	TokenNameCOMMENT_LINE	Forces re-loading of the security policy 
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
securityPolicyProperty	TokenNameIdentifier	 security Policy Property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
securityPolicyProperty	TokenNameIdentifier	 security Policy Property
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROPERTY_JAVA_SECURITY_POLICY	TokenNameIdentifier	 PROPERTY  JAVA  SECURITY  POLICY
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setJarBase	TokenNameIdentifier	 set Jar Base
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Only set the app.jar.base if it is not already defined 	TokenNameCOMMENT_LINE	Only set the app.jar.base if it is not already defined 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
curAppJarBase	TokenNameIdentifier	 cur App Jar Base
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROPERTY_APP_JAR_BASE	TokenNameIdentifier	 PROPERTY  APP  JAR  BASE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curAppJarBase	TokenNameIdentifier	 cur App Jar Base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
=	TokenNameEQUAL	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
JAR_PROTOCOL	TokenNameIdentifier	 JAR  PROTOCOL
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
codeBaseEnd	TokenNameIdentifier	 code Base End
=	TokenNameEQUAL	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
JAR_URL_FILE_SEPARATOR	TokenNameIdentifier	 JAR  URL  FILE  SEPARATOR
+	TokenNamePLUS	
appMainClassRelativeURL	TokenNameIdentifier	 app Main Class Relative URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codeBaseEnd	TokenNameIdentifier	 code Base End
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Something is seriously wrong. This should *never* happen 	TokenNameCOMMENT_LINE	Something is seriously wrong. This should *never* happen 
// as the APP_SECURITY_POLICY_URL is such that it will be 	TokenNameCOMMENT_LINE	as the APP_SECURITY_POLICY_URL is such that it will be 
// a substring of its corresponding URL value 	TokenNameCOMMENT_LINE	a substring of its corresponding URL value 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
appCodeBase	TokenNameIdentifier	 app Code Base
=	TokenNameEQUAL	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
codeBaseEnd	TokenNameIdentifier	 code Base End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// At this point appCodeBase contains the JAR file name 	TokenNameCOMMENT_LINE	At this point appCodeBase contains the JAR file name 
// Now, we extract it. 	TokenNameCOMMENT_LINE	Now, we extract it. 
codeBaseEnd	TokenNameIdentifier	 code Base End
=	TokenNameEQUAL	
appCodeBase	TokenNameIdentifier	 app Code Base
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codeBaseEnd	TokenNameIdentifier	 code Base End
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
appCodeBase	TokenNameIdentifier	 app Code Base
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
appCodeBase	TokenNameIdentifier	 app Code Base
=	TokenNameEQUAL	
appCodeBase	TokenNameIdentifier	 app Code Base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
codeBaseEnd	TokenNameIdentifier	 code Base End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROPERTY_APP_JAR_BASE	TokenNameIdentifier	 PROPERTY  APP  JAR  BASE
,	TokenNameCOMMA	
appCodeBase	TokenNameIdentifier	 app Code Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Position the app.dev.base property for expansion in * the policy file used when App is running in its * development version */	TokenNameCOMMENT_JAVADOC	 Position the app.dev.base property for expansion in the policy file used when App is running in its development version 
private	TokenNameprivate	
void	TokenNamevoid	
setDevBase	TokenNameIdentifier	 set Dev Base
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Only set the app.code.base property if it is not already 	TokenNameCOMMENT_LINE	Only set the app.code.base property if it is not already 
// defined. 	TokenNameCOMMENT_LINE	defined. 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
curAppCodeBase	TokenNameIdentifier	 cur App Code Base
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PROPERTY_APP_DEV_BASE	TokenNameIdentifier	 PROPERTY  APP  DEV  BASE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curAppCodeBase	TokenNameIdentifier	 cur App Code Base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
codeBaseEnd	TokenNameIdentifier	 code Base End
=	TokenNameEQUAL	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
APP_MAIN_CLASS_DIR	TokenNameIdentifier	 APP  MAIN  CLASS  DIR
+	TokenNamePLUS	
appMainClassRelativeURL	TokenNameIdentifier	 app Main Class Relative URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codeBaseEnd	TokenNameIdentifier	 code Base End
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Something is seriously wrong. This should *never* happen 	TokenNameCOMMENT_LINE	Something is seriously wrong. This should *never* happen 
// as the APP_SECURITY_POLICY_URL is such that it will be 	TokenNameCOMMENT_LINE	as the APP_SECURITY_POLICY_URL is such that it will be 
// a substring of its corresponding URL value 	TokenNameCOMMENT_LINE	a substring of its corresponding URL value 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
appCodeBase	TokenNameIdentifier	 app Code Base
=	TokenNameEQUAL	
expandedMainClassName	TokenNameIdentifier	 expanded Main Class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
codeBaseEnd	TokenNameIdentifier	 code Base End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
PROPERTY_APP_DEV_BASE	TokenNameIdentifier	 PROPERTY  APP  DEV  BASE
,	TokenNameCOMMA	
appCodeBase	TokenNameIdentifier	 app Code Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

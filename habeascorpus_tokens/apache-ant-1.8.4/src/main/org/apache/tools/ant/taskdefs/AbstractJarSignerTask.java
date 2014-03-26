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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Environment	TokenNameIdentifier	 Environment
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
FileSet	TokenNameIdentifier	 File Set
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Path	TokenNameIdentifier	 Path
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
RedirectorElement	TokenNameIdentifier	 Redirector Element
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
RegularExpression	TokenNameIdentifier	 Regular Expression
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
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
/** * This is factored out from {@link SignJar}; a base class that can be used * for both signing and verifying JAR files using jarsigner */	TokenNameCOMMENT_JAVADOC	 This is factored out from {@link SignJar}; a base class that can be used for both signing and verifying JAR files using jarsigner 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractJarSignerTask	TokenNameIdentifier	 Abstract Jar Signer Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
/** * The name of the jar file. */	TokenNameCOMMENT_JAVADOC	 The name of the jar file. 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
jar	TokenNameIdentifier	 jar
;	TokenNameSEMICOLON	
/** * The alias of signer. */	TokenNameCOMMENT_JAVADOC	 The alias of signer. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
;	TokenNameSEMICOLON	
/** * The url or path of keystore file. */	TokenNameCOMMENT_JAVADOC	 The url or path of keystore file. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keystore	TokenNameIdentifier	 keystore
;	TokenNameSEMICOLON	
/** * password for the store */	TokenNameCOMMENT_JAVADOC	 password for the store 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
storepass	TokenNameIdentifier	 storepass
;	TokenNameSEMICOLON	
/** * type of store,-storetype param */	TokenNameCOMMENT_JAVADOC	 type of store,-storetype param 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
storetype	TokenNameIdentifier	 storetype
;	TokenNameSEMICOLON	
/** * password for the key in the store */	TokenNameCOMMENT_JAVADOC	 password for the key in the store 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
keypass	TokenNameIdentifier	 keypass
;	TokenNameSEMICOLON	
/** * verbose output */	TokenNameCOMMENT_JAVADOC	 verbose output 
protected	TokenNameprotected	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
/** * The maximum amount of memory to use for Jar signer */	TokenNameCOMMENT_JAVADOC	 The maximum amount of memory to use for Jar signer 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
maxMemory	TokenNameIdentifier	 max Memory
;	TokenNameSEMICOLON	
/** * the filesets of the jars to sign */	TokenNameCOMMENT_JAVADOC	 the filesets of the jars to sign 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
filesets	TokenNameIdentifier	 filesets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * name of JDK program we are looking for */	TokenNameCOMMENT_JAVADOC	 name of JDK program we are looking for 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JARSIGNER_COMMAND	TokenNameIdentifier	 JARSIGNER  COMMAND
=	TokenNameEQUAL	
"jarsigner"	TokenNameStringLiteral	jarsigner
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * redirector used to talk to the jarsigner program */	TokenNameCOMMENT_JAVADOC	 redirector used to talk to the jarsigner program 
private	TokenNameprivate	
RedirectorElement	TokenNameIdentifier	 Redirector Element
redirector	TokenNameIdentifier	 redirector
;	TokenNameSEMICOLON	
/** * Java declarations -J-Dname=value */	TokenNameCOMMENT_JAVADOC	 Java declarations -J-Dname=value 
private	TokenNameprivate	
Environment	TokenNameIdentifier	 Environment
sysProperties	TokenNameIdentifier	 sys Properties
=	TokenNameEQUAL	
new	TokenNamenew	
Environment	TokenNameIdentifier	 Environment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * error string for unit test verification: {@value} */	TokenNameCOMMENT_JAVADOC	 error string for unit test verification: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NO_SOURCE	TokenNameIdentifier	 ERROR  NO  SOURCE
=	TokenNameEQUAL	
"jar must be set through jar attribute "	TokenNameStringLiteral	jar must be set through jar attribute 
+	TokenNamePLUS	
"or nested filesets"	TokenNameStringLiteral	or nested filesets
;	TokenNameSEMICOLON	
/** * Path holding all non-filesets of filesystem resources we want to sign. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Path holding all non-filesets of filesystem resources we want to sign. * @since Ant 1.7 
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The executable to use instead of jarsigner. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 The executable to use instead of jarsigner. * @since Ant 1.8.0 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
executable	TokenNameIdentifier	 executable
;	TokenNameSEMICOLON	
/** * Set the maximum memory to be used by the jarsigner process * * @param max a string indicating the maximum memory according to the JVM * conventions (e.g. 128m is 128 Megabytes) */	TokenNameCOMMENT_JAVADOC	 Set the maximum memory to be used by the jarsigner process * @param max a string indicating the maximum memory according to the JVM conventions (e.g. 128m is 128 Megabytes) 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxmemory	TokenNameIdentifier	 set Maxmemory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxMemory	TokenNameIdentifier	 max Memory
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the jar file to sign; required * * @param jar the jar file to sign */	TokenNameCOMMENT_JAVADOC	 the jar file to sign; required * @param jar the jar file to sign 
public	TokenNamepublic	
void	TokenNamevoid	
setJar	TokenNameIdentifier	 set Jar
(	TokenNameLPAREN	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
jar	TokenNameIdentifier	 jar
=	TokenNameEQUAL	
jar	TokenNameIdentifier	 jar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * the alias to sign under; required * * @param alias the alias to sign under */	TokenNameCOMMENT_JAVADOC	 the alias to sign under; required * @param alias the alias to sign under 
public	TokenNamepublic	
void	TokenNamevoid	
setAlias	TokenNameIdentifier	 set Alias
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
alias	TokenNameIdentifier	 alias
=	TokenNameEQUAL	
alias	TokenNameIdentifier	 alias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * keystore location; required * * @param keystore the keystore location */	TokenNameCOMMENT_JAVADOC	 keystore location; required * @param keystore the keystore location 
public	TokenNamepublic	
void	TokenNamevoid	
setKeystore	TokenNameIdentifier	 set Keystore
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keystore	TokenNameIdentifier	 keystore
=	TokenNameEQUAL	
keystore	TokenNameIdentifier	 keystore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * password for keystore integrity; required * * @param storepass the password for the keystore */	TokenNameCOMMENT_JAVADOC	 password for keystore integrity; required * @param storepass the password for the keystore 
public	TokenNamepublic	
void	TokenNamevoid	
setStorepass	TokenNameIdentifier	 set Storepass
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storepass	TokenNameIdentifier	 storepass
=	TokenNameEQUAL	
storepass	TokenNameIdentifier	 storepass
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * keystore type; optional * * @param storetype the keystore type */	TokenNameCOMMENT_JAVADOC	 keystore type; optional * @param storetype the keystore type 
public	TokenNamepublic	
void	TokenNamevoid	
setStoretype	TokenNameIdentifier	 set Storetype
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
storetype	TokenNameIdentifier	 storetype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storetype	TokenNameIdentifier	 storetype
=	TokenNameEQUAL	
storetype	TokenNameIdentifier	 storetype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * password for private key (if different); optional * * @param keypass the password for the key (if different) */	TokenNameCOMMENT_JAVADOC	 password for private key (if different); optional * @param keypass the password for the key (if different) 
public	TokenNamepublic	
void	TokenNamevoid	
setKeypass	TokenNameIdentifier	 set Keypass
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keypass	TokenNameIdentifier	 keypass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keypass	TokenNameIdentifier	 keypass
=	TokenNameEQUAL	
keypass	TokenNameIdentifier	 keypass
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Enable verbose output when signing ; optional: default false * * @param verbose if true enable verbose output */	TokenNameCOMMENT_JAVADOC	 Enable verbose output when signing ; optional: default false * @param verbose if true enable verbose output 
public	TokenNamepublic	
void	TokenNamevoid	
setVerbose	TokenNameIdentifier	 set Verbose
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
verbose	TokenNameIdentifier	 verbose
=	TokenNameEQUAL	
verbose	TokenNameIdentifier	 verbose
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a set of files to sign * * @param set a set of files to sign * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 Adds a set of files to sign * @param set a set of files to sign @since Ant 1.4 
public	TokenNamepublic	
void	TokenNamevoid	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
final	TokenNamefinal	
FileSet	TokenNameIdentifier	 File Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a system property. * * @param sysp system property. */	TokenNameCOMMENT_JAVADOC	 Add a system property. * @param sysp system property. 
public	TokenNamepublic	
void	TokenNamevoid	
addSysproperty	TokenNameIdentifier	 add Sysproperty
(	TokenNameLPAREN	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
addVariable	TokenNameIdentifier	 add Variable
(	TokenNameLPAREN	
sysp	TokenNameIdentifier	 sysp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a path of files to sign. * * @return a path of files to sign. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Adds a path of files to sign. * @return a path of files to sign. @since Ant 1.7 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * init processing logic; this is retained through our execution(s) */	TokenNameCOMMENT_JAVADOC	 init processing logic; this is retained through our execution(s) 
protected	TokenNameprotected	
void	TokenNamevoid	
beginExecution	TokenNameIdentifier	 begin Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
=	TokenNameEQUAL	
createRedirector	TokenNameIdentifier	 create Redirector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * any cleanup logic */	TokenNameCOMMENT_JAVADOC	 any cleanup logic 
protected	TokenNameprotected	
void	TokenNamevoid	
endExecution	TokenNameIdentifier	 end Execution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redirector	TokenNameIdentifier	 redirector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create the redirector to use, if any. * * @return a configured RedirectorElement. */	TokenNameCOMMENT_JAVADOC	 Create the redirector to use, if any. * @return a configured RedirectorElement. 
private	TokenNameprivate	
RedirectorElement	TokenNameIdentifier	 Redirector Element
createRedirector	TokenNameIdentifier	 create Redirector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RedirectorElement	TokenNameIdentifier	 Redirector Element
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
RedirectorElement	TokenNameIdentifier	 Redirector Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storepass	TokenNameIdentifier	 storepass
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
storepass	TokenNameIdentifier	 storepass
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keypass	TokenNameIdentifier	 keypass
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
keypass	TokenNameIdentifier	 keypass
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setInputString	TokenNameIdentifier	 set Input String
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setLogInputString	TokenNameIdentifier	 set Log Input String
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try to avoid showing password prompts on log output, as they would be confusing. 	TokenNameCOMMENT_LINE	Try to avoid showing password prompts on log output, as they would be confusing. 
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
LineContainsRegExp	TokenNameIdentifier	 Line Contains Reg Exp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RegularExpression	TokenNameIdentifier	 Regular Expression
rx	TokenNameIdentifier	 rx
=	TokenNameEQUAL	
new	TokenNamenew	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX only handles English locale, not ja or zh_CN 	TokenNameCOMMENT_LINE	XXX only handles English locale, not ja or zh_CN 
rx	TokenNameIdentifier	 rx
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"^(Enter Passphrase for keystore: |Enter key password for .+: )$"	TokenNameStringLiteral	^(Enter Passphrase for keystore: |Enter key password for .+: )$
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
addConfiguredRegexp	TokenNameIdentifier	 add Configured Regexp
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
setNegate	TokenNameIdentifier	 set Negate
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
createErrorFilterChain	TokenNameIdentifier	 create Error Filter Chain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addLineContainsRegExp	TokenNameIdentifier	 add Line Contains Reg Exp
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get the redirector. Non-null between invocations of * {@link #beginExecution()} and {@link #endExecution()} * @return a redirector or null */	TokenNameCOMMENT_JAVADOC	 get the redirector. Non-null between invocations of {@link #beginExecution()} and {@link #endExecution()} @return a redirector or null 
public	TokenNamepublic	
RedirectorElement	TokenNameIdentifier	 Redirector Element
getRedirector	TokenNameIdentifier	 get Redirector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
redirector	TokenNameIdentifier	 redirector
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the actual executable command to invoke, instead of the binary * <code>jarsigner</code> found in Ant's JDK. * @param executable the command to invoke. * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets the actual executable command to invoke, instead of the binary <code>jarsigner</code> found in Ant's JDK. @param executable the command to invoke. @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
executable	TokenNameIdentifier	 executable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
executable	TokenNameIdentifier	 executable
=	TokenNameEQUAL	
executable	TokenNameIdentifier	 executable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * these are options common to signing and verifying * @param cmd command to configure */	TokenNameCOMMENT_JAVADOC	 these are options common to signing and verifying @param cmd command to configure 
protected	TokenNameprotected	
void	TokenNamevoid	
setCommonOptions	TokenNameIdentifier	 set Common Options
(	TokenNameLPAREN	
final	TokenNamefinal	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxMemory	TokenNameIdentifier	 max Memory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-J-Xmx"	TokenNameStringLiteral	-J-Xmx
+	TokenNamePLUS	
maxMemory	TokenNameIdentifier	 max Memory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-verbose"	TokenNameStringLiteral	-verbose
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//now patch in all system properties 	TokenNameCOMMENT_LINE	now patch in all system properties 
Vector	TokenNameIdentifier	 Vector
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
sysProperties	TokenNameIdentifier	 sys Properties
.	TokenNameDOT	
getVariablesVector	TokenNameIdentifier	 get Variables Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
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
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
variable	TokenNameIdentifier	 variable
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
declareSysProperty	TokenNameIdentifier	 declare Sys Property
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
variable	TokenNameIdentifier	 variable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * @param cmd command to configure * @param property property to set * @throws BuildException if the property is not correctly defined. */	TokenNameCOMMENT_JAVADOC	 * @param cmd command to configure @param property property to set @throws BuildException if the property is not correctly defined. 
protected	TokenNameprotected	
void	TokenNamevoid	
declareSysProperty	TokenNameIdentifier	 declare Sys Property
(	TokenNameLPAREN	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
Environment	TokenNameIdentifier	 Environment
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-J-D"	TokenNameStringLiteral	-J-D
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
.	TokenNameDOT	
getContent	TokenNameIdentifier	 get Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * bind to a keystore if the attributes are there * @param cmd command to configure */	TokenNameCOMMENT_JAVADOC	 bind to a keystore if the attributes are there @param cmd command to configure 
protected	TokenNameprotected	
void	TokenNamevoid	
bindToKeystore	TokenNameIdentifier	 bind To Keystore
(	TokenNameLPAREN	
final	TokenNamefinal	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is the keystore a file 	TokenNameCOMMENT_LINE	is the keystore a file 
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-keystore"	TokenNameStringLiteral	-keystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
keystoreFile	TokenNameIdentifier	 keystore File
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
keystore	TokenNameIdentifier	 keystore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keystoreFile	TokenNameIdentifier	 keystore File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
keystoreFile	TokenNameIdentifier	 keystore File
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// must be a URL - just pass as is 	TokenNameCOMMENT_LINE	must be a URL - just pass as is 
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
keystore	TokenNameIdentifier	 keystore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
storetype	TokenNameIdentifier	 storetype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
"-storetype"	TokenNameStringLiteral	-storetype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
storetype	TokenNameIdentifier	 storetype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * create the jarsigner executable task * @return a task set up with the executable of jarsigner, failonerror=true * and bound to our redirector */	TokenNameCOMMENT_JAVADOC	 create the jarsigner executable task @return a task set up with the executable of jarsigner, failonerror=true and bound to our redirector 
protected	TokenNameprotected	
ExecTask	TokenNameIdentifier	 Exec Task
createJarSigner	TokenNameIdentifier	 create Jar Signer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
ExecTask	TokenNameIdentifier	 Exec Task
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
executable	TokenNameIdentifier	 executable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJdkExecutable	TokenNameIdentifier	 get Jdk Executable
(	TokenNameLPAREN	
JARSIGNER_COMMAND	TokenNameIdentifier	 JARSIGNER  COMMAND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
executable	TokenNameIdentifier	 executable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setTaskType	TokenNameIdentifier	 set Task Type
(	TokenNameLPAREN	
JARSIGNER_COMMAND	TokenNameIdentifier	 JARSIGNER  COMMAND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
addConfiguredRedirector	TokenNameIdentifier	 add Configured Redirector
(	TokenNameLPAREN	
redirector	TokenNameIdentifier	 redirector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * clone our filesets vector, and patch in the jar attribute as a new * fileset, if is defined * @return a vector of FileSet instances */	TokenNameCOMMENT_JAVADOC	 clone our filesets vector, and patch in the jar attribute as a new fileset, if is defined @return a vector of FileSet instances 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
createUnifiedSources	TokenNameIdentifier	 create Unified Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//we create a fileset with the source file. 	TokenNameCOMMENT_LINE	we create a fileset with the source file. 
//this lets us combine our logic for handling output directories, 	TokenNameCOMMENT_LINE	this lets us combine our logic for handling output directories, 
//mapping etc. 	TokenNameCOMMENT_LINE	mapping etc. 
FileSet	TokenNameIdentifier	 File Set
sourceJar	TokenNameIdentifier	 source Jar
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceJar	TokenNameIdentifier	 source Jar
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceJar	TokenNameIdentifier	 source Jar
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceJar	TokenNameIdentifier	 source Jar
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
jar	TokenNameIdentifier	 jar
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sourceJar	TokenNameIdentifier	 source Jar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sources	TokenNameIdentifier	 sources
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * clone our path and add all explicitly specified FileSets as * well, patch in the jar attribute as a new fileset if it is * defined. * @return a path that contains all files to sign * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 clone our path and add all explicitly specified FileSets as well, patch in the jar attribute as a new fileset if it is defined. @return a path that contains all files to sign @since Ant 1.7 
protected	TokenNameprotected	
Path	TokenNameIdentifier	 Path
createUnifiedSourcePath	TokenNameIdentifier	 create Unified Source Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
createUnifiedSources	TokenNameIdentifier	 create Unified Sources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
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
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Has either a path or a fileset been specified? * @return true if a path or fileset has been specified. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Has either a path or a fileset been specified? @return true if a path or fileset has been specified. @since Ant 1.7 
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasResources	TokenNameIdentifier	 has Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
filesets	TokenNameIdentifier	 filesets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add a value argument to a command * @param cmd command to manipulate * @param value value to add */	TokenNameCOMMENT_JAVADOC	 add a value argument to a command @param cmd command to manipulate @param value value to add 
protected	TokenNameprotected	
void	TokenNamevoid	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
final	TokenNamefinal	
ExecTask	TokenNameIdentifier	 Exec Task
cmd	TokenNameIdentifier	 cmd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

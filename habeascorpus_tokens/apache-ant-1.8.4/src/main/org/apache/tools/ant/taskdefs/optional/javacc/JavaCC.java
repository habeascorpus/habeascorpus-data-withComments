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
javacc	TokenNameIdentifier	 javacc
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
Hashtable	TokenNameIdentifier	 Hashtable
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
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Execute	TokenNameIdentifier	 Execute
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
Commandline	TokenNameIdentifier	 Commandline
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
CommandlineJava	TokenNameIdentifier	 Commandline Java
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
;	TokenNameSEMICOLON	
/** * JavaCC compiler compiler task. * */	TokenNameCOMMENT_JAVADOC	 JavaCC compiler compiler task. 
public	TokenNamepublic	
class	TokenNameclass	
JavaCC	TokenNameIdentifier	 Java CC
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
// keys to optional attributes 	TokenNameCOMMENT_LINE	keys to optional attributes 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
=	TokenNameEQUAL	
"LOOKAHEAD"	TokenNameStringLiteral	LOOKAHEAD
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHOICE_AMBIGUITY_CHECK	TokenNameIdentifier	 CHOICE  AMBIGUITY  CHECK
=	TokenNameEQUAL	
"CHOICE_AMBIGUITY_CHECK"	TokenNameStringLiteral	CHOICE_AMBIGUITY_CHECK
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OTHER_AMBIGUITY_CHECK	TokenNameIdentifier	 OTHER  AMBIGUITY  CHECK
=	TokenNameEQUAL	
"OTHER_AMBIGUITY_CHECK"	TokenNameStringLiteral	OTHER_AMBIGUITY_CHECK
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STATIC	TokenNameIdentifier	 STATIC
=	TokenNameEQUAL	
"STATIC"	TokenNameStringLiteral	STATIC
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEBUG_PARSER	TokenNameIdentifier	 DEBUG  PARSER
=	TokenNameEQUAL	
"DEBUG_PARSER"	TokenNameStringLiteral	DEBUG_PARSER
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEBUG_LOOKAHEAD	TokenNameIdentifier	 DEBUG  LOOKAHEAD
=	TokenNameEQUAL	
"DEBUG_LOOKAHEAD"	TokenNameStringLiteral	DEBUG_LOOKAHEAD
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEBUG_TOKEN_MANAGER	TokenNameIdentifier	 DEBUG  TOKEN  MANAGER
=	TokenNameEQUAL	
"DEBUG_TOKEN_MANAGER"	TokenNameStringLiteral	DEBUG_TOKEN_MANAGER
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OPTIMIZE_TOKEN_MANAGER	TokenNameIdentifier	 OPTIMIZE  TOKEN  MANAGER
=	TokenNameEQUAL	
"OPTIMIZE_TOKEN_MANAGER"	TokenNameStringLiteral	OPTIMIZE_TOKEN_MANAGER
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_REPORTING	TokenNameIdentifier	 ERROR  REPORTING
=	TokenNameEQUAL	
"ERROR_REPORTING"	TokenNameStringLiteral	ERROR_REPORTING
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_UNICODE_ESCAPE	TokenNameIdentifier	 JAVA  UNICODE  ESCAPE
=	TokenNameEQUAL	
"JAVA_UNICODE_ESCAPE"	TokenNameStringLiteral	JAVA_UNICODE_ESCAPE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNICODE_INPUT	TokenNameIdentifier	 UNICODE  INPUT
=	TokenNameEQUAL	
"UNICODE_INPUT"	TokenNameStringLiteral	UNICODE_INPUT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
=	TokenNameEQUAL	
"IGNORE_CASE"	TokenNameStringLiteral	IGNORE_CASE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMON_TOKEN_ACTION	TokenNameIdentifier	 COMMON  TOKEN  ACTION
=	TokenNameEQUAL	
"COMMON_TOKEN_ACTION"	TokenNameStringLiteral	COMMON_TOKEN_ACTION
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_TOKEN_MANAGER	TokenNameIdentifier	 USER  TOKEN  MANAGER
=	TokenNameEQUAL	
"USER_TOKEN_MANAGER"	TokenNameStringLiteral	USER_TOKEN_MANAGER
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USER_CHAR_STREAM	TokenNameIdentifier	 USER  CHAR  STREAM
=	TokenNameEQUAL	
"USER_CHAR_STREAM"	TokenNameStringLiteral	USER_CHAR_STREAM
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_PARSER	TokenNameIdentifier	 BUILD  PARSER
=	TokenNameEQUAL	
"BUILD_PARSER"	TokenNameStringLiteral	BUILD_PARSER
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_TOKEN_MANAGER	TokenNameIdentifier	 BUILD  TOKEN  MANAGER
=	TokenNameEQUAL	
"BUILD_TOKEN_MANAGER"	TokenNameStringLiteral	BUILD_TOKEN_MANAGER
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SANITY_CHECK	TokenNameIdentifier	 SANITY  CHECK
=	TokenNameEQUAL	
"SANITY_CHECK"	TokenNameStringLiteral	SANITY_CHECK
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FORCE_LA_CHECK	TokenNameIdentifier	 FORCE  LA  CHECK
=	TokenNameEQUAL	
"FORCE_LA_CHECK"	TokenNameStringLiteral	FORCE_LA_CHECK
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CACHE_TOKENS	TokenNameIdentifier	 CACHE  TOKENS
=	TokenNameEQUAL	
"CACHE_TOKENS"	TokenNameStringLiteral	CACHE_TOKENS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KEEP_LINE_COLUMN	TokenNameIdentifier	 KEEP  LINE  COLUMN
=	TokenNameEQUAL	
"KEEP_LINE_COLUMN"	TokenNameStringLiteral	KEEP_LINE_COLUMN
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JDK_VERSION	TokenNameIdentifier	 JDK  VERSION
=	TokenNameEQUAL	
"JDK_VERSION"	TokenNameStringLiteral	JDK_VERSION
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
optionalAttrs	TokenNameIdentifier	 optional Attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// required attributes 	TokenNameCOMMENT_LINE	required attributes 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outputDirectory	TokenNameIdentifier	 output Directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
targetFile	TokenNameIdentifier	 target File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
javaccHome	TokenNameIdentifier	 javacc Home
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandlineJava	TokenNameIdentifier	 Commandline Java
cmdl	TokenNameIdentifier	 cmdl
=	TokenNameEQUAL	
new	TokenNamenew	
CommandlineJava	TokenNameIdentifier	 Commandline Java
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TASKDEF_TYPE_JAVACC	TokenNameIdentifier	 TASKDEF  TYPE  JAVACC
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TASKDEF_TYPE_JJTREE	TokenNameIdentifier	 TASKDEF  TYPE  JJTREE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TASKDEF_TYPE_JJDOC	TokenNameIdentifier	 TASKDEF  TYPE  JJDOC
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ARCHIVE_LOCATIONS	TokenNameIdentifier	 ARCHIVE  LOCATIONS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"JavaCC.zip"	TokenNameStringLiteral	JavaCC.zip
,	TokenNameCOMMA	
"bin/lib/JavaCC.zip"	TokenNameStringLiteral	bin/lib/JavaCC.zip
,	TokenNameCOMMA	
"bin/lib/javacc.jar"	TokenNameStringLiteral	bin/lib/javacc.jar
,	TokenNameCOMMA	
"javacc.jar"	TokenNameStringLiteral	javacc.jar
,	TokenNameCOMMA	
// used by jpackage for JavaCC 3.x 	TokenNameCOMMENT_LINE	used by jpackage for JavaCC 3.x 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ARCHIVE_LOCATIONS_VS_MAJOR_VERSION	TokenNameIdentifier	 ARCHIVE  LOCATIONS  VS  MAJOR  VERSION
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COM_PACKAGE	TokenNameIdentifier	 COM  PACKAGE
=	TokenNameEQUAL	
"COM.sun.labs."	TokenNameStringLiteral	COM.sun.labs.
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COM_JAVACC_CLASS	TokenNameIdentifier	 COM  JAVACC  CLASS
=	TokenNameEQUAL	
"javacc.Main"	TokenNameStringLiteral	javacc.Main
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COM_JJTREE_CLASS	TokenNameIdentifier	 COM  JJTREE  CLASS
=	TokenNameEQUAL	
"jjtree.Main"	TokenNameStringLiteral	jjtree.Main
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COM_JJDOC_CLASS	TokenNameIdentifier	 COM  JJDOC  CLASS
=	TokenNameEQUAL	
"jjdoc.JJDocMain"	TokenNameStringLiteral	jjdoc.JJDocMain
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORG_PACKAGE_3_0	TokenNameIdentifier	 ORG  PACKAGE 3 0
=	TokenNameEQUAL	
"org.netbeans.javacc."	TokenNameStringLiteral	org.netbeans.javacc.
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORG_PACKAGE_3_1	TokenNameIdentifier	 ORG  PACKAGE 3 1
=	TokenNameEQUAL	
"org.javacc."	TokenNameStringLiteral	org.javacc.
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORG_JAVACC_CLASS	TokenNameIdentifier	 ORG  JAVACC  CLASS
=	TokenNameEQUAL	
"parser.Main"	TokenNameStringLiteral	parser.Main
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORG_JJTREE_CLASS	TokenNameIdentifier	 ORG  JJTREE  CLASS
=	TokenNameEQUAL	
COM_JJTREE_CLASS	TokenNameIdentifier	 COM  JJTREE  CLASS
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ORG_JJDOC_CLASS	TokenNameIdentifier	 ORG  JJDOC  CLASS
=	TokenNameEQUAL	
COM_JJDOC_CLASS	TokenNameIdentifier	 COM  JJDOC  CLASS
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
maxMemory	TokenNameIdentifier	 max Memory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Sets the LOOKAHEAD grammar option. * @param lookahead an <code>int</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the LOOKAHEAD grammar option. @param lookahead an <code>int</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setLookahead	TokenNameIdentifier	 set Lookahead
(	TokenNameLPAREN	
int	TokenNameint	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
lookahead	TokenNameIdentifier	 lookahead
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the CHOICE_AMBIGUITY_CHECK grammar option. * @param choiceAmbiguityCheck an <code>int</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the CHOICE_AMBIGUITY_CHECK grammar option. @param choiceAmbiguityCheck an <code>int</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setChoiceambiguitycheck	TokenNameIdentifier	 set Choiceambiguitycheck
(	TokenNameLPAREN	
int	TokenNameint	
choiceAmbiguityCheck	TokenNameIdentifier	 choice Ambiguity Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CHOICE_AMBIGUITY_CHECK	TokenNameIdentifier	 CHOICE  AMBIGUITY  CHECK
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
choiceAmbiguityCheck	TokenNameIdentifier	 choice Ambiguity Check
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the OTHER_AMBIGUITY_CHECK grammar option. * @param otherAmbiguityCheck an <code>int</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the OTHER_AMBIGUITY_CHECK grammar option. @param otherAmbiguityCheck an <code>int</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setOtherambiguityCheck	TokenNameIdentifier	 set Otherambiguity Check
(	TokenNameLPAREN	
int	TokenNameint	
otherAmbiguityCheck	TokenNameIdentifier	 other Ambiguity Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
OTHER_AMBIGUITY_CHECK	TokenNameIdentifier	 OTHER  AMBIGUITY  CHECK
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
otherAmbiguityCheck	TokenNameIdentifier	 other Ambiguity Check
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the STATIC grammar option. * @param staticParser a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the STATIC grammar option. @param staticParser a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setStatic	TokenNameIdentifier	 set Static
(	TokenNameLPAREN	
boolean	TokenNameboolean	
staticParser	TokenNameIdentifier	 static Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
STATIC	TokenNameIdentifier	 STATIC
,	TokenNameCOMMA	
staticParser	TokenNameIdentifier	 static Parser
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the DEBUG_PARSER grammar option. * @param debugParser a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the DEBUG_PARSER grammar option. @param debugParser a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebugparser	TokenNameIdentifier	 set Debugparser
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debugParser	TokenNameIdentifier	 debug Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DEBUG_PARSER	TokenNameIdentifier	 DEBUG  PARSER
,	TokenNameCOMMA	
debugParser	TokenNameIdentifier	 debug Parser
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the DEBUG_LOOKAHEAD grammar option. * @param debugLookahead a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the DEBUG_LOOKAHEAD grammar option. @param debugLookahead a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebuglookahead	TokenNameIdentifier	 set Debuglookahead
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debugLookahead	TokenNameIdentifier	 debug Lookahead
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DEBUG_LOOKAHEAD	TokenNameIdentifier	 DEBUG  LOOKAHEAD
,	TokenNameCOMMA	
debugLookahead	TokenNameIdentifier	 debug Lookahead
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the DEBUG_TOKEN_MANAGER grammar option. * @param debugTokenManager a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the DEBUG_TOKEN_MANAGER grammar option. @param debugTokenManager a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setDebugtokenmanager	TokenNameIdentifier	 set Debugtokenmanager
(	TokenNameLPAREN	
boolean	TokenNameboolean	
debugTokenManager	TokenNameIdentifier	 debug Token Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DEBUG_TOKEN_MANAGER	TokenNameIdentifier	 DEBUG  TOKEN  MANAGER
,	TokenNameCOMMA	
debugTokenManager	TokenNameIdentifier	 debug Token Manager
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the OPTIMIZE_TOKEN_MANAGER grammar option. * @param optimizeTokenManager a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the OPTIMIZE_TOKEN_MANAGER grammar option. @param optimizeTokenManager a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setOptimizetokenmanager	TokenNameIdentifier	 set Optimizetokenmanager
(	TokenNameLPAREN	
boolean	TokenNameboolean	
optimizeTokenManager	TokenNameIdentifier	 optimize Token Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
OPTIMIZE_TOKEN_MANAGER	TokenNameIdentifier	 OPTIMIZE  TOKEN  MANAGER
,	TokenNameCOMMA	
optimizeTokenManager	TokenNameIdentifier	 optimize Token Manager
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the ERROR_REPORTING grammar option. * @param errorReporting a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the ERROR_REPORTING grammar option. @param errorReporting a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorreporting	TokenNameIdentifier	 set Errorreporting
(	TokenNameLPAREN	
boolean	TokenNameboolean	
errorReporting	TokenNameIdentifier	 error Reporting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ERROR_REPORTING	TokenNameIdentifier	 ERROR  REPORTING
,	TokenNameCOMMA	
errorReporting	TokenNameIdentifier	 error Reporting
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the JAVA_UNICODE_ESCAPE grammar option. * @param javaUnicodeEscape a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the JAVA_UNICODE_ESCAPE grammar option. @param javaUnicodeEscape a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setJavaunicodeescape	TokenNameIdentifier	 set Javaunicodeescape
(	TokenNameLPAREN	
boolean	TokenNameboolean	
javaUnicodeEscape	TokenNameIdentifier	 java Unicode Escape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
JAVA_UNICODE_ESCAPE	TokenNameIdentifier	 JAVA  UNICODE  ESCAPE
,	TokenNameCOMMA	
javaUnicodeEscape	TokenNameIdentifier	 java Unicode Escape
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the UNICODE_INPUT grammar option. * @param unicodeInput a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the UNICODE_INPUT grammar option. @param unicodeInput a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setUnicodeinput	TokenNameIdentifier	 set Unicodeinput
(	TokenNameLPAREN	
boolean	TokenNameboolean	
unicodeInput	TokenNameIdentifier	 unicode Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
UNICODE_INPUT	TokenNameIdentifier	 UNICODE  INPUT
,	TokenNameCOMMA	
unicodeInput	TokenNameIdentifier	 unicode Input
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the IGNORE_CASE grammar option. * @param ignoreCase a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the IGNORE_CASE grammar option. @param ignoreCase a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnorecase	TokenNameIdentifier	 set Ignorecase
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
,	TokenNameCOMMA	
ignoreCase	TokenNameIdentifier	 ignore Case
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the COMMON_TOKEN_ACTION grammar option. * @param commonTokenAction a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the COMMON_TOKEN_ACTION grammar option. @param commonTokenAction a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setCommontokenaction	TokenNameIdentifier	 set Commontokenaction
(	TokenNameLPAREN	
boolean	TokenNameboolean	
commonTokenAction	TokenNameIdentifier	 common Token Action
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
COMMON_TOKEN_ACTION	TokenNameIdentifier	 COMMON  TOKEN  ACTION
,	TokenNameCOMMA	
commonTokenAction	TokenNameIdentifier	 common Token Action
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the USER_TOKEN_MANAGER grammar option. * @param userTokenManager a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the USER_TOKEN_MANAGER grammar option. @param userTokenManager a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setUsertokenmanager	TokenNameIdentifier	 set Usertokenmanager
(	TokenNameLPAREN	
boolean	TokenNameboolean	
userTokenManager	TokenNameIdentifier	 user Token Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
USER_TOKEN_MANAGER	TokenNameIdentifier	 USER  TOKEN  MANAGER
,	TokenNameCOMMA	
userTokenManager	TokenNameIdentifier	 user Token Manager
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the USER_CHAR_STREAM grammar option. * @param userCharStream a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the USER_CHAR_STREAM grammar option. @param userCharStream a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setUsercharstream	TokenNameIdentifier	 set Usercharstream
(	TokenNameLPAREN	
boolean	TokenNameboolean	
userCharStream	TokenNameIdentifier	 user Char Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
USER_CHAR_STREAM	TokenNameIdentifier	 USER  CHAR  STREAM
,	TokenNameCOMMA	
userCharStream	TokenNameIdentifier	 user Char Stream
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the BUILD_PARSER grammar option. * @param buildParser a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the BUILD_PARSER grammar option. @param buildParser a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setBuildparser	TokenNameIdentifier	 set Buildparser
(	TokenNameLPAREN	
boolean	TokenNameboolean	
buildParser	TokenNameIdentifier	 build Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BUILD_PARSER	TokenNameIdentifier	 BUILD  PARSER
,	TokenNameCOMMA	
buildParser	TokenNameIdentifier	 build Parser
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the BUILD_TOKEN_MANAGER grammar option. * @param buildTokenManager a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the BUILD_TOKEN_MANAGER grammar option. @param buildTokenManager a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setBuildtokenmanager	TokenNameIdentifier	 set Buildtokenmanager
(	TokenNameLPAREN	
boolean	TokenNameboolean	
buildTokenManager	TokenNameIdentifier	 build Token Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BUILD_TOKEN_MANAGER	TokenNameIdentifier	 BUILD  TOKEN  MANAGER
,	TokenNameCOMMA	
buildTokenManager	TokenNameIdentifier	 build Token Manager
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the SANITY_CHECK grammar option. * @param sanityCheck a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the SANITY_CHECK grammar option. @param sanityCheck a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setSanitycheck	TokenNameIdentifier	 set Sanitycheck
(	TokenNameLPAREN	
boolean	TokenNameboolean	
sanityCheck	TokenNameIdentifier	 sanity Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SANITY_CHECK	TokenNameIdentifier	 SANITY  CHECK
,	TokenNameCOMMA	
sanityCheck	TokenNameIdentifier	 sanity Check
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the FORCE_LA_CHECK grammar option. * @param forceLACheck a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the FORCE_LA_CHECK grammar option. @param forceLACheck a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setForcelacheck	TokenNameIdentifier	 set Forcelacheck
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forceLACheck	TokenNameIdentifier	 force LA Check
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FORCE_LA_CHECK	TokenNameIdentifier	 FORCE  LA  CHECK
,	TokenNameCOMMA	
forceLACheck	TokenNameIdentifier	 force LA Check
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the CACHE_TOKENS grammar option. * @param cacheTokens a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the CACHE_TOKENS grammar option. @param cacheTokens a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setCachetokens	TokenNameIdentifier	 set Cachetokens
(	TokenNameLPAREN	
boolean	TokenNameboolean	
cacheTokens	TokenNameIdentifier	 cache Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CACHE_TOKENS	TokenNameIdentifier	 CACHE  TOKENS
,	TokenNameCOMMA	
cacheTokens	TokenNameIdentifier	 cache Tokens
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the KEEP_LINE_COLUMN grammar option. * @param keepLineColumn a <code>boolean</code> value. */	TokenNameCOMMENT_JAVADOC	 Sets the KEEP_LINE_COLUMN grammar option. @param keepLineColumn a <code>boolean</code> value. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeeplinecolumn	TokenNameIdentifier	 set Keeplinecolumn
(	TokenNameLPAREN	
boolean	TokenNameboolean	
keepLineColumn	TokenNameIdentifier	 keep Line Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
KEEP_LINE_COLUMN	TokenNameIdentifier	 KEEP  LINE  COLUMN
,	TokenNameCOMMA	
keepLineColumn	TokenNameIdentifier	 keep Line Column
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the JDK_VERSION option. * @param jdkVersion the version to use. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Sets the JDK_VERSION option. @param jdkVersion the version to use. @since Ant1.7 
public	TokenNamepublic	
void	TokenNamevoid	
setJDKversion	TokenNameIdentifier	 set JD Kversion
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
jdkVersion	TokenNameIdentifier	 jdk Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
JDK_VERSION	TokenNameIdentifier	 JDK  VERSION
,	TokenNameCOMMA	
jdkVersion	TokenNameIdentifier	 jdk Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The directory to write the generated files to. * If not set, the files are written to the directory * containing the grammar file. * @param outputDirectory the output directory. */	TokenNameCOMMENT_JAVADOC	 The directory to write the generated files to. If not set, the files are written to the directory containing the grammar file. @param outputDirectory the output directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputdirectory	TokenNameIdentifier	 set Outputdirectory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
outputDirectory	TokenNameIdentifier	 output Directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outputDirectory	TokenNameIdentifier	 output Directory
=	TokenNameEQUAL	
outputDirectory	TokenNameIdentifier	 output Directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The grammar file to process. * @param targetFile the grammar file. */	TokenNameCOMMENT_JAVADOC	 The grammar file to process. @param targetFile the grammar file. 
public	TokenNamepublic	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
targetFile	TokenNameIdentifier	 target File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
targetFile	TokenNameIdentifier	 target File
=	TokenNameEQUAL	
targetFile	TokenNameIdentifier	 target File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The directory containing the JavaCC distribution. * @param javaccHome the directory. */	TokenNameCOMMENT_JAVADOC	 The directory containing the JavaCC distribution. @param javaccHome the directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setJavacchome	TokenNameIdentifier	 set Javacchome
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
javaccHome	TokenNameIdentifier	 javacc Home
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
javaccHome	TokenNameIdentifier	 javacc Home
=	TokenNameEQUAL	
javaccHome	TokenNameIdentifier	 javacc Home
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Corresponds -Xmx. * * @param max max memory parameter. * @since Ant 1.8.3 */	TokenNameCOMMENT_JAVADOC	 Corresponds -Xmx. * @param max max memory parameter. @since Ant 1.8.3 
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
/** * Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
JavaCC	TokenNameIdentifier	 Java CC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
setVm	TokenNameIdentifier	 set Vm
(	TokenNameLPAREN	
JavaEnvUtils	TokenNameIdentifier	 Java Env Utils
.	TokenNameDOT	
getJreExecutable	TokenNameIdentifier	 get Jre Executable
(	TokenNameLPAREN	
"java"	TokenNameStringLiteral	java
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the task. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Run the task. @throws BuildException on error. 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
// load command line with optional attributes 	TokenNameCOMMENT_LINE	load command line with optional attributes 
Enumeration	TokenNameIdentifier	 Enumeration
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
optionalAttrs	TokenNameIdentifier	 optional Attrs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check the target is a file 	TokenNameCOMMENT_LINE	check the target is a file 
if	TokenNameif	
(	TokenNameLPAREN	
targetFile	TokenNameIdentifier	 target File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
targetFile	TokenNameIdentifier	 target File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid target: "	TokenNameStringLiteral	Invalid target: 
+	TokenNamePLUS	
targetFile	TokenNameIdentifier	 target File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// use the directory containing the target as the output directory 	TokenNameCOMMENT_LINE	use the directory containing the target as the output directory 
if	TokenNameif	
(	TokenNameLPAREN	
outputDirectory	TokenNameIdentifier	 output Directory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputDirectory	TokenNameIdentifier	 output Directory
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
targetFile	TokenNameIdentifier	 target File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
outputDirectory	TokenNameIdentifier	 output Directory
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Outputdir not a directory."	TokenNameStringLiteral	Outputdir not a directory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-OUTPUT_DIRECTORY:"	TokenNameStringLiteral	-OUTPUT_DIRECTORY:
+	TokenNamePLUS	
outputDirectory	TokenNameIdentifier	 output Directory
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// determine if the generated java file is up-to-date 	TokenNameCOMMENT_LINE	determine if the generated java file is up-to-date 
final	TokenNamefinal	
File	TokenNameIdentifier	 File
javaFile	TokenNameIdentifier	 java File
=	TokenNameEQUAL	
getOutputJavaFile	TokenNameIdentifier	 get Output Java File
(	TokenNameLPAREN	
outputDirectory	TokenNameIdentifier	 output Directory
,	TokenNameCOMMA	
targetFile	TokenNameIdentifier	 target File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaFile	TokenNameIdentifier	 java File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
targetFile	TokenNameIdentifier	 target File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
javaFile	TokenNameIdentifier	 java File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Target is already built - skipping ("	TokenNameStringLiteral	Target is already built - skipping (
+	TokenNamePLUS	
targetFile	TokenNameIdentifier	 target File
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
targetFile	TokenNameIdentifier	 target File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createClasspath	TokenNameIdentifier	 create Classpath
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
javaccJar	TokenNameIdentifier	 javacc Jar
=	TokenNameEQUAL	
JavaCC	TokenNameIdentifier	 Java CC
.	TokenNameDOT	
getArchiveFile	TokenNameIdentifier	 get Archive File
(	TokenNameLPAREN	
javaccHome	TokenNameIdentifier	 javacc Home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
createPathElement	TokenNameIdentifier	 create Path Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
javaccJar	TokenNameIdentifier	 javacc Jar
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
addJavaRuntime	TokenNameIdentifier	 add Java Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
JavaCC	TokenNameIdentifier	 Java CC
.	TokenNameDOT	
getMainClass	TokenNameIdentifier	 get Main Class
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
,	TokenNameCOMMA	
JavaCC	TokenNameIdentifier	 Java CC
.	TokenNameDOT	
TASKDEF_TYPE_JAVACC	TokenNameIdentifier	 TASKDEF  TYPE  JAVACC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
setMaxmemory	TokenNameIdentifier	 set Maxmemory
(	TokenNameLPAREN	
maxMemory	TokenNameIdentifier	 max Memory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
createVmArgument	TokenNameIdentifier	 create Vm Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-Dinstall.root="	TokenNameStringLiteral	-Dinstall.root=
+	TokenNamePLUS	
javaccHome	TokenNameIdentifier	 javacc Home
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Execute	TokenNameIdentifier	 Execute
.	TokenNameDOT	
runCommand	TokenNameIdentifier	 run Command
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
cmdl	TokenNameIdentifier	 cmdl
.	TokenNameDOT	
getCommandline	TokenNameIdentifier	 get Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to retrieve the path used to store the JavaCC.zip * or javacc.jar which is different from versions. * * @param home the javacc home path directory. * @throws BuildException thrown if the home directory is invalid * or if the archive could not be found despite attempts to do so. * @return the file object pointing to the JavaCC archive. */	TokenNameCOMMENT_JAVADOC	 Helper method to retrieve the path used to store the JavaCC.zip or javacc.jar which is different from versions. * @param home the javacc home path directory. @throws BuildException thrown if the home directory is invalid or if the archive could not be found despite attempts to do so. @return the file object pointing to the JavaCC archive. 
protected	TokenNameprotected	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getArchiveFile	TokenNameIdentifier	 get Archive File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
home	TokenNameIdentifier	 home
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
home	TokenNameIdentifier	 home
,	TokenNameCOMMA	
ARCHIVE_LOCATIONS	TokenNameIdentifier	 ARCHIVE  LOCATIONS
[	TokenNameLBRACKET	
getArchiveLocationIndex	TokenNameIdentifier	 get Archive Location Index
(	TokenNameLPAREN	
home	TokenNameIdentifier	 home
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to retrieve main class which is different from versions. * @param home the javacc home path directory. * @param type the taskdef. * @throws BuildException thrown if the home directory is invalid * or if the archive could not be found despite attempts to do so. * @return the main class for the taskdef. */	TokenNameCOMMENT_JAVADOC	 Helper method to retrieve main class which is different from versions. @param home the javacc home path directory. @param type the taskdef. @throws BuildException thrown if the home directory is invalid or if the archive could not be found despite attempts to do so. @return the main class for the taskdef. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getMainClass	TokenNameIdentifier	 get Main Class
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
home	TokenNameIdentifier	 home
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createPathElement	TokenNameIdentifier	 create Path Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
getArchiveFile	TokenNameIdentifier	 get Archive File
(	TokenNameLPAREN	
home	TokenNameIdentifier	 home
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addJavaRuntime	TokenNameIdentifier	 add Java Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getMainClass	TokenNameIdentifier	 get Main Class
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to retrieve main class which is different from versions. * @param path classpath to search in. * @param type the taskdef. * @throws BuildException thrown if the home directory is invalid * or if the archive could not be found despite attempts to do so. * @return the main class for the taskdef. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Helper method to retrieve main class which is different from versions. @param path classpath to search in. @param type the taskdef. @throws BuildException thrown if the home directory is invalid or if the archive could not be found despite attempts to do so. @return the main class for the taskdef. @since Ant 1.7 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getMainClass	TokenNameIdentifier	 get Main Class
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
packagePrefix	TokenNameIdentifier	 package Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
AntClassLoader	TokenNameIdentifier	 Ant Class Loader
.	TokenNameDOT	
newAntClassLoader	TokenNameIdentifier	 new Ant Class Loader
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
javaccClass	TokenNameIdentifier	 javacc Class
=	TokenNameEQUAL	
COM_PACKAGE	TokenNameIdentifier	 COM  PACKAGE
+	TokenNamePLUS	
COM_JAVACC_CLASS	TokenNameIdentifier	 COM  JAVACC  CLASS
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
javaccClass	TokenNameIdentifier	 javacc Class
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packagePrefix	TokenNameIdentifier	 package Prefix
=	TokenNameEQUAL	
COM_PACKAGE	TokenNameIdentifier	 COM  PACKAGE
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TASKDEF_TYPE_JAVACC	TokenNameIdentifier	 TASKDEF  TYPE  JAVACC
:	TokenNameCOLON	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
COM_JAVACC_CLASS	TokenNameIdentifier	 COM  JAVACC  CLASS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TASKDEF_TYPE_JJTREE	TokenNameIdentifier	 TASKDEF  TYPE  JJTREE
:	TokenNameCOLON	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
COM_JJTREE_CLASS	TokenNameIdentifier	 COM  JJTREE  CLASS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TASKDEF_TYPE_JJDOC	TokenNameIdentifier	 TASKDEF  TYPE  JJDOC
:	TokenNameCOLON	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
COM_JJDOC_CLASS	TokenNameIdentifier	 COM  JJDOC  CLASS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall Through 	TokenNameCOMMENT_LINE	Fall Through 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
javaccClass	TokenNameIdentifier	 javacc Class
=	TokenNameEQUAL	
ORG_PACKAGE_3_1	TokenNameIdentifier	 ORG  PACKAGE 3 1
+	TokenNamePLUS	
ORG_JAVACC_CLASS	TokenNameIdentifier	 ORG  JAVACC  CLASS
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
javaccClass	TokenNameIdentifier	 javacc Class
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packagePrefix	TokenNameIdentifier	 package Prefix
=	TokenNameEQUAL	
ORG_PACKAGE_3_1	TokenNameIdentifier	 ORG  PACKAGE 3 1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
javaccClass	TokenNameIdentifier	 javacc Class
=	TokenNameEQUAL	
ORG_PACKAGE_3_0	TokenNameIdentifier	 ORG  PACKAGE 3 0
+	TokenNamePLUS	
ORG_JAVACC_CLASS	TokenNameIdentifier	 ORG  JAVACC  CLASS
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
javaccClass	TokenNameIdentifier	 javacc Class
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packagePrefix	TokenNameIdentifier	 package Prefix
=	TokenNameEQUAL	
ORG_PACKAGE_3_0	TokenNameIdentifier	 ORG  PACKAGE 3 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TASKDEF_TYPE_JAVACC	TokenNameIdentifier	 TASKDEF  TYPE  JAVACC
:	TokenNameCOLON	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
ORG_JAVACC_CLASS	TokenNameIdentifier	 ORG  JAVACC  CLASS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TASKDEF_TYPE_JJTREE	TokenNameIdentifier	 TASKDEF  TYPE  JJTREE
:	TokenNameCOLON	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
ORG_JJTREE_CLASS	TokenNameIdentifier	 ORG  JJTREE  CLASS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TASKDEF_TYPE_JJDOC	TokenNameIdentifier	 TASKDEF  TYPE  JJDOC
:	TokenNameCOLON	
mainClass	TokenNameIdentifier	 main Class
=	TokenNameEQUAL	
ORG_JJDOC_CLASS	TokenNameIdentifier	 ORG  JJDOC  CLASS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Fall Through 	TokenNameCOMMENT_LINE	Fall Through 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
packagePrefix	TokenNameIdentifier	 package Prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"failed to load JavaCC"	TokenNameStringLiteral	failed to load JavaCC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mainClass	TokenNameIdentifier	 main Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"unknown task type "	TokenNameStringLiteral	unknown task type 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
packagePrefix	TokenNameIdentifier	 package Prefix
+	TokenNamePLUS	
mainClass	TokenNameIdentifier	 main Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper method to determine the archive location index. * * @param home the javacc home path directory. * @throws BuildException thrown if the home directory is invalid * or if the archive could not be found despite attempts to do so. * @return the archive location index */	TokenNameCOMMENT_JAVADOC	 Helper method to determine the archive location index. * @param home the javacc home path directory. @throws BuildException thrown if the home directory is invalid or if the archive could not be found despite attempts to do so. @return the archive location index 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
getArchiveLocationIndex	TokenNameIdentifier	 get Archive Location Index
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
home	TokenNameIdentifier	 home
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
home	TokenNameIdentifier	 home
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
home	TokenNameIdentifier	 home
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"JavaCC home must be a valid directory."	TokenNameStringLiteral	JavaCC home must be a valid directory.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ARCHIVE_LOCATIONS	TokenNameIdentifier	 ARCHIVE  LOCATIONS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
home	TokenNameIdentifier	 home
,	TokenNameCOMMA	
ARCHIVE_LOCATIONS	TokenNameIdentifier	 ARCHIVE  LOCATIONS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Could not find a path to JavaCC.zip "	TokenNameStringLiteral	Could not find a path to JavaCC.zip 
+	TokenNamePLUS	
"or javacc.jar from '"	TokenNameStringLiteral	or javacc.jar from '
+	TokenNamePLUS	
home	TokenNameIdentifier	 home
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to determine the major version number of JavaCC. * * @param home the javacc home path directory. * @throws BuildException thrown if the home directory is invalid * or if the archive could not be found despite attempts to do so. * @return a the major version number */	TokenNameCOMMENT_JAVADOC	 Helper method to determine the major version number of JavaCC. * @param home the javacc home path directory. @throws BuildException thrown if the home directory is invalid or if the archive could not be found despite attempts to do so. @return a the major version number 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
getMajorVersionNumber	TokenNameIdentifier	 get Major Version Number
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
home	TokenNameIdentifier	 home
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
ARCHIVE_LOCATIONS_VS_MAJOR_VERSION	TokenNameIdentifier	 ARCHIVE  LOCATIONS  VS  MAJOR  VERSION
[	TokenNameLBRACKET	
getArchiveLocationIndex	TokenNameIdentifier	 get Archive Location Index
(	TokenNameLPAREN	
home	TokenNameIdentifier	 home
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines the output Java file to be generated by the given grammar * file. * */	TokenNameCOMMENT_JAVADOC	 Determines the output Java file to be generated by the given grammar file. 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
getOutputJavaFile	TokenNameIdentifier	 get Output Java File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
outputdir	TokenNameIdentifier	 outputdir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcfile	TokenNameIdentifier	 srcfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
srcfile	TokenNameIdentifier	 srcfile
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Extract file's base-name 	TokenNameCOMMENT_LINE	Extract file's base-name 
int	TokenNameint	
startBasename	TokenNameIdentifier	 start Basename
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startBasename	TokenNameIdentifier	 start Basename
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startBasename	TokenNameIdentifier	 start Basename
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Replace the file's extension with '.java' 	TokenNameCOMMENT_LINE	Replace the file's extension with '.java' 
int	TokenNameint	
startExtn	TokenNameIdentifier	 start Extn
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startExtn	TokenNameIdentifier	 start Extn
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startExtn	TokenNameIdentifier	 start Extn
)	TokenNameRPAREN	
+	TokenNamePLUS	
".java"	TokenNameStringLiteral	.java
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
+=	TokenNamePLUS_EQUAL	
".java"	TokenNameStringLiteral	.java
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Change the directory 	TokenNameCOMMENT_LINE	Change the directory 
if	TokenNameif	
(	TokenNameLPAREN	
outputdir	TokenNameIdentifier	 outputdir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
outputdir	TokenNameIdentifier	 outputdir
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

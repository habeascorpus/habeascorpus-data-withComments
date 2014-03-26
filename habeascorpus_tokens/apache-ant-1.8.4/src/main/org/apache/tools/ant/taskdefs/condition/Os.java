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
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
/** * Condition that tests the OS type. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 Condition that tests the OS type. * @since Ant 1.4 
public	TokenNamepublic	
class	TokenNameclass	
Os	TokenNameIdentifier	 Os
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OS_NAME	TokenNameIdentifier	 OS  NAME
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OS_ARCH	TokenNameIdentifier	 OS  ARCH
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.arch"	TokenNameStringLiteral	os.arch
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OS_VERSION	TokenNameIdentifier	 OS  VERSION
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.version"	TokenNameStringLiteral	os.version
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PATH_SEP	TokenNameIdentifier	 PATH  SEP
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"path.separator"	TokenNameStringLiteral	path.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * OS family to look for */	TokenNameCOMMENT_JAVADOC	 OS family to look for 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
family	TokenNameIdentifier	 family
;	TokenNameSEMICOLON	
/** * Name of OS */	TokenNameCOMMENT_JAVADOC	 Name of OS 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * version of OS */	TokenNameCOMMENT_JAVADOC	 version of OS 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
/** * OS architecture */	TokenNameCOMMENT_JAVADOC	 OS architecture 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
arch	TokenNameIdentifier	 arch
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_WINDOWS	TokenNameIdentifier	 FAMILY  WINDOWS
=	TokenNameEQUAL	
"windows"	TokenNameStringLiteral	windows
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_9X	TokenNameIdentifier	 FAMILY 9 X
=	TokenNameEQUAL	
"win9x"	TokenNameStringLiteral	win9x
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_NT	TokenNameIdentifier	 FAMILY  NT
=	TokenNameEQUAL	
"winnt"	TokenNameStringLiteral	winnt
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_OS2	TokenNameIdentifier	 FAMILY  O S2
=	TokenNameEQUAL	
"os/2"	TokenNameStringLiteral	os/2
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_NETWARE	TokenNameIdentifier	 FAMILY  NETWARE
=	TokenNameEQUAL	
"netware"	TokenNameStringLiteral	netware
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_DOS	TokenNameIdentifier	 FAMILY  DOS
=	TokenNameEQUAL	
"dos"	TokenNameStringLiteral	dos
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_MAC	TokenNameIdentifier	 FAMILY  MAC
=	TokenNameEQUAL	
"mac"	TokenNameStringLiteral	mac
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_TANDEM	TokenNameIdentifier	 FAMILY  TANDEM
=	TokenNameEQUAL	
"tandem"	TokenNameStringLiteral	tandem
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_UNIX	TokenNameIdentifier	 FAMILY  UNIX
=	TokenNameEQUAL	
"unix"	TokenNameStringLiteral	unix
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_VMS	TokenNameIdentifier	 FAMILY  VMS
=	TokenNameEQUAL	
"openvms"	TokenNameStringLiteral	openvms
;	TokenNameSEMICOLON	
/** * OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_ZOS	TokenNameIdentifier	 FAMILY  ZOS
=	TokenNameEQUAL	
"z/os"	TokenNameStringLiteral	z/os
;	TokenNameSEMICOLON	
/** OS family that can be tested for. {@value} */	TokenNameCOMMENT_JAVADOC	 OS family that can be tested for. {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAMILY_OS400	TokenNameIdentifier	 FAMILY  O S400
=	TokenNameEQUAL	
"os/400"	TokenNameStringLiteral	os/400
;	TokenNameSEMICOLON	
/** * OpenJDK is reported to call MacOS X "Darwin" * @see https://issues.apache.org/bugzilla/show_bug.cgi?id=44889 * @see https://issues.apache.org/jira/browse/HADOOP-3318 */	TokenNameCOMMENT_JAVADOC	 OpenJDK is reported to call MacOS X "Darwin" @see https://issues.apache.org/bugzilla/show_bug.cgi?id=44889 @see https://issues.apache.org/jira/browse/HADOOP-3318 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DARWIN	TokenNameIdentifier	 DARWIN
=	TokenNameEQUAL	
"darwin"	TokenNameStringLiteral	darwin
;	TokenNameSEMICOLON	
/** * Default constructor * */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
Os	TokenNameIdentifier	 Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//default 	TokenNameCOMMENT_LINE	default 
}	TokenNameRBRACE	
/** * Constructor that sets the family attribute * @param family a String value */	TokenNameCOMMENT_JAVADOC	 Constructor that sets the family attribute @param family a String value 
public	TokenNamepublic	
Os	TokenNameIdentifier	 Os
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
family	TokenNameIdentifier	 family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFamily	TokenNameIdentifier	 set Family
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired OS family type * * @param f The OS family type desired<br /> * Possible values:<br /> * <ul> * <li>dos</li> * <li>mac</li> * <li>netware</li> * <li>os/2</li> * <li>tandem</li> * <li>unix</li> * <li>windows</li> * <li>win9x</li> * <li>z/os</li> * <li>os/400</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Sets the desired OS family type * @param f The OS family type desired<br /> Possible values:<br /> <ul> <li>dos</li> <li>mac</li> <li>netware</li> <li>os/2</li> <li>tandem</li> <li>unix</li> <li>windows</li> <li>win9x</li> <li>z/os</li> <li>os/400</li> </ul> 
public	TokenNamepublic	
void	TokenNamevoid	
setFamily	TokenNameIdentifier	 set Family
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
family	TokenNameIdentifier	 family
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired OS name * * @param name The OS name */	TokenNameCOMMENT_JAVADOC	 Sets the desired OS name * @param name The OS name 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired OS architecture * * @param arch The OS architecture */	TokenNameCOMMENT_JAVADOC	 Sets the desired OS architecture * @param arch The OS architecture 
public	TokenNamepublic	
void	TokenNamevoid	
setArch	TokenNameIdentifier	 set Arch
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arch	TokenNameIdentifier	 arch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
arch	TokenNameIdentifier	 arch
=	TokenNameEQUAL	
arch	TokenNameIdentifier	 arch
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the desired OS version * * @param version The OS version */	TokenNameCOMMENT_JAVADOC	 Sets the desired OS version * @param version The OS version 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the OS on which Ant is executing matches the type of * that set in setFamily. * @return true if the os matches. * @throws BuildException if there is an error. * @see Os#setFamily(String) */	TokenNameCOMMENT_JAVADOC	 Determines if the OS on which Ant is executing matches the type of that set in setFamily. @return true if the os matches. @throws BuildException if there is an error. @see Os#setFamily(String) 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
isOs	TokenNameIdentifier	 is Os
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
arch	TokenNameIdentifier	 arch
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the OS on which Ant is executing matches the * given OS family. * @param family the family to check for * @return true if the OS matches * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 Determines if the OS on which Ant is executing matches the given OS family. @param family the family to check for @return true if the OS matches @since 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
family	TokenNameIdentifier	 family
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isOs	TokenNameIdentifier	 is Os
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the OS on which Ant is executing matches the * given OS name. * * @param name the OS name to check for * @return true if the OS matches * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Determines if the OS on which Ant is executing matches the given OS name. * @param name the OS name to check for @return true if the OS matches @since 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isOs	TokenNameIdentifier	 is Os
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the OS on which Ant is executing matches the * given OS architecture. * * @param arch the OS architecture to check for * @return true if the OS matches * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Determines if the OS on which Ant is executing matches the given OS architecture. * @param arch the OS architecture to check for @return true if the OS matches @since 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isArch	TokenNameIdentifier	 is Arch
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arch	TokenNameIdentifier	 arch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isOs	TokenNameIdentifier	 is Os
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
arch	TokenNameIdentifier	 arch
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the OS on which Ant is executing matches the * given OS version. * * @param version the OS version to check for * @return true if the OS matches * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Determines if the OS on which Ant is executing matches the given OS version. * @param version the OS version to check for @return true if the OS matches @since 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isVersion	TokenNameIdentifier	 is Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isOs	TokenNameIdentifier	 is Os
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the OS on which Ant is executing matches the * given OS family, name, architecture and version * * @param family The OS family * @param name The OS name * @param arch The OS architecture * @param version The OS version * @return true if the OS matches * @since 1.7 */	TokenNameCOMMENT_JAVADOC	 Determines if the OS on which Ant is executing matches the given OS family, name, architecture and version * @param family The OS family @param name The OS name @param arch The OS architecture @param version The OS version @return true if the OS matches @since 1.7 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isOs	TokenNameIdentifier	 is Os
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
family	TokenNameIdentifier	 family
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
arch	TokenNameIdentifier	 arch
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
arch	TokenNameIdentifier	 arch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isName	TokenNameIdentifier	 is Name
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isArch	TokenNameIdentifier	 is Arch
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isVersion	TokenNameIdentifier	 is Version
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//windows probing logic relies on the word 'windows' in 	TokenNameCOMMENT_LINE	windows probing logic relies on the word 'windows' in 
//the OS 	TokenNameCOMMENT_LINE	the OS 
boolean	TokenNameboolean	
isWindows	TokenNameIdentifier	 is Windows
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_WINDOWS	TokenNameIdentifier	 FAMILY  WINDOWS
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
is9x	TokenNameIdentifier	 is9x
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isNT	TokenNameIdentifier	 is NT
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isWindows	TokenNameIdentifier	 is Windows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//there are only four 9x platforms that we look for 	TokenNameCOMMENT_LINE	there are only four 9x platforms that we look for 
is9x	TokenNameIdentifier	 is9x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"95"	TokenNameStringLiteral	95
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"98"	TokenNameStringLiteral	98
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"me"	TokenNameStringLiteral	me
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
//wince isn't really 9x, but crippled enough to 	TokenNameCOMMENT_LINE	wince isn't really 9x, but crippled enough to 
//be a muchness. Ant doesnt run on CE, anyway. 	TokenNameCOMMENT_LINE	be a muchness. Ant doesnt run on CE, anyway. 
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"ce"	TokenNameStringLiteral	ce
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isNT	TokenNameIdentifier	 is NT
=	TokenNameEQUAL	
!	TokenNameNOT	
is9x	TokenNameIdentifier	 is9x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_WINDOWS	TokenNameIdentifier	 FAMILY  WINDOWS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
isWindows	TokenNameIdentifier	 is Windows
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_9X	TokenNameIdentifier	 FAMILY 9 X
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
isWindows	TokenNameIdentifier	 is Windows
&&	TokenNameAND_AND	
is9x	TokenNameIdentifier	 is9x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_NT	TokenNameIdentifier	 FAMILY  NT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
isWindows	TokenNameIdentifier	 is Windows
&&	TokenNameAND_AND	
isNT	TokenNameIdentifier	 is NT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_OS2	TokenNameIdentifier	 FAMILY  O S2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_OS2	TokenNameIdentifier	 FAMILY  O S2
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_NETWARE	TokenNameIdentifier	 FAMILY  NETWARE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_NETWARE	TokenNameIdentifier	 FAMILY  NETWARE
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_DOS	TokenNameIdentifier	 FAMILY  DOS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
PATH_SEP	TokenNameIdentifier	 PATH  SEP
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
FAMILY_NETWARE	TokenNameIdentifier	 FAMILY  NETWARE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_MAC	TokenNameIdentifier	 FAMILY  MAC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_MAC	TokenNameIdentifier	 FAMILY  MAC
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DARWIN	TokenNameIdentifier	 DARWIN
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_TANDEM	TokenNameIdentifier	 FAMILY  TANDEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"nonstop_kernel"	TokenNameStringLiteral	nonstop_kernel
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_UNIX	TokenNameIdentifier	 FAMILY  UNIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
PATH_SEP	TokenNameIdentifier	 PATH  SEP
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
FAMILY_VMS	TokenNameIdentifier	 FAMILY  VMS
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
FAMILY_MAC	TokenNameIdentifier	 FAMILY  MAC
)	TokenNameRPAREN	
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DARWIN	TokenNameIdentifier	 DARWIN
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_ZOS	TokenNameIdentifier	 FAMILY  ZOS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_ZOS	TokenNameIdentifier	 FAMILY  ZOS
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"os/390"	TokenNameStringLiteral	os/390
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_OS400	TokenNameIdentifier	 FAMILY  O S400
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_OS400	TokenNameIdentifier	 FAMILY  O S400
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
family	TokenNameIdentifier	 family
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
FAMILY_VMS	TokenNameIdentifier	 FAMILY  VMS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isFamily	TokenNameIdentifier	 is Family
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
FAMILY_VMS	TokenNameIdentifier	 FAMILY  VMS
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Don't know how to detect os family ""	TokenNameStringLiteral	Don't know how to detect os family "
+	TokenNamePLUS	
family	TokenNameIdentifier	 family
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isName	TokenNameIdentifier	 is Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OS_NAME	TokenNameIdentifier	 OS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arch	TokenNameIdentifier	 arch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isArch	TokenNameIdentifier	 is Arch
=	TokenNameEQUAL	
arch	TokenNameIdentifier	 arch
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OS_ARCH	TokenNameIdentifier	 OS  ARCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isVersion	TokenNameIdentifier	 is Version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OS_VERSION	TokenNameIdentifier	 OS  VERSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
isFamily	TokenNameIdentifier	 is Family
&&	TokenNameAND_AND	
isName	TokenNameIdentifier	 is Name
&&	TokenNameAND_AND	
isArch	TokenNameIdentifier	 is Arch
&&	TokenNameAND_AND	
isVersion	TokenNameIdentifier	 is Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retValue	TokenNameIdentifier	 ret Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

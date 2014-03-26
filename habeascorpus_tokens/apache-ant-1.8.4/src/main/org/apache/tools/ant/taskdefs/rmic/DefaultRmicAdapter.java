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
rmic	TokenNameIdentifier	 rmic
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
Random	TokenNameIdentifier	 Random
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Rmic	TokenNameIdentifier	 Rmic
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
FileNameMapper	TokenNameIdentifier	 File Name Mapper
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
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * This is the default implementation for the RmicAdapter interface. * Currently, this is a cut-and-paste of the original rmic task and * DefaultCopmpilerAdapter. * * @since Ant 1.4 */	TokenNameCOMMENT_JAVADOC	 This is the default implementation for the RmicAdapter interface. Currently, this is a cut-and-paste of the original rmic task and DefaultCopmpilerAdapter. * @since Ant 1.4 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DefaultRmicAdapter	TokenNameIdentifier	 Default Rmic Adapter
implements	TokenNameimplements	
RmicAdapter	TokenNameIdentifier	 Rmic Adapter
{	TokenNameLBRACE	
private	TokenNameprivate	
Rmic	TokenNameIdentifier	 Rmic
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
RAND	TokenNameIdentifier	 RAND
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** suffix denoting a stub file: {@value} */	TokenNameCOMMENT_JAVADOC	 suffix denoting a stub file: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RMI_STUB_SUFFIX	TokenNameIdentifier	 RMI  STUB  SUFFIX
=	TokenNameEQUAL	
"_Stub"	TokenNameStringLiteral	_Stub
;	TokenNameSEMICOLON	
/** suffix denoting a skel file: {@value} */	TokenNameCOMMENT_JAVADOC	 suffix denoting a skel file: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RMI_SKEL_SUFFIX	TokenNameIdentifier	 RMI  SKEL  SUFFIX
=	TokenNameEQUAL	
"_Skel"	TokenNameStringLiteral	_Skel
;	TokenNameSEMICOLON	
/** suffix denoting a tie file: {@value} */	TokenNameCOMMENT_JAVADOC	 suffix denoting a tie file: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RMI_TIE_SUFFIX	TokenNameIdentifier	 RMI  TIE  SUFFIX
=	TokenNameEQUAL	
"_Tie"	TokenNameStringLiteral	_Tie
;	TokenNameSEMICOLON	
/** arg for compat: {@value} */	TokenNameCOMMENT_JAVADOC	 arg for compat: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STUB_COMPAT	TokenNameIdentifier	 STUB  COMPAT
=	TokenNameEQUAL	
"-vcompat"	TokenNameStringLiteral	-vcompat
;	TokenNameSEMICOLON	
/** arg for 1.1: {@value} */	TokenNameCOMMENT_JAVADOC	 arg for 1.1: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STUB_1_1	TokenNameIdentifier	 STUB 1 1
=	TokenNameEQUAL	
"-v1.1"	TokenNameStringLiteral	-v1.1
;	TokenNameSEMICOLON	
/** arg for 1.2: {@value} */	TokenNameCOMMENT_JAVADOC	 arg for 1.2: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STUB_1_2	TokenNameIdentifier	 STUB 1 2
=	TokenNameEQUAL	
"-v1.2"	TokenNameStringLiteral	-v1.2
;	TokenNameSEMICOLON	
/** * option for stub 1.1 in the rmic task: {@value} */	TokenNameCOMMENT_JAVADOC	 option for stub 1.1 in the rmic task: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STUB_OPTION_1_1	TokenNameIdentifier	 STUB  OPTION 1 1
=	TokenNameEQUAL	
"1.1"	TokenNameStringLiteral	1.1
;	TokenNameSEMICOLON	
/** * option for stub 1.2 in the rmic task: {@value} */	TokenNameCOMMENT_JAVADOC	 option for stub 1.2 in the rmic task: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STUB_OPTION_1_2	TokenNameIdentifier	 STUB  OPTION 1 2
=	TokenNameEQUAL	
"1.2"	TokenNameStringLiteral	1.2
;	TokenNameSEMICOLON	
/** * option for stub compat in the rmic task: {@value} */	TokenNameCOMMENT_JAVADOC	 option for stub compat in the rmic task: {@value} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STUB_OPTION_COMPAT	TokenNameIdentifier	 STUB  OPTION  COMPAT
=	TokenNameEQUAL	
"compat"	TokenNameStringLiteral	compat
;	TokenNameSEMICOLON	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
DefaultRmicAdapter	TokenNameIdentifier	 Default Rmic Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets Rmic attributes * @param attributes the rmic attributes */	TokenNameCOMMENT_JAVADOC	 Sets Rmic attributes @param attributes the rmic attributes 
public	TokenNamepublic	
void	TokenNamevoid	
setRmic	TokenNameIdentifier	 set Rmic
(	TokenNameLPAREN	
final	TokenNamefinal	
Rmic	TokenNameIdentifier	 Rmic
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
new	TokenNamenew	
RmicFileNameMapper	TokenNameIdentifier	 Rmic File Name Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Rmic attributes * @return the attributes as a Rmic taskdef */	TokenNameCOMMENT_JAVADOC	 Get the Rmic attributes @return the attributes as a Rmic taskdef 
public	TokenNamepublic	
Rmic	TokenNameIdentifier	 Rmic
getRmic	TokenNameIdentifier	 get Rmic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the stub class suffix * @return the stub suffix &quot;_Stub&quot; */	TokenNameCOMMENT_JAVADOC	 Gets the stub class suffix @return the stub suffix &quot;_Stub&quot; 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RMI_STUB_SUFFIX	TokenNameIdentifier	 RMI  STUB  SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the skeleton class suffix * @return the skeleton suffix &quot;_Skel&quot; */	TokenNameCOMMENT_JAVADOC	 Gets the skeleton class suffix @return the skeleton suffix &quot;_Skel&quot; 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSkelClassSuffix	TokenNameIdentifier	 get Skel Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RMI_SKEL_SUFFIX	TokenNameIdentifier	 RMI  SKEL  SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the tie class suffix * @return the tie suffix &quot;_Tie&quot; */	TokenNameCOMMENT_JAVADOC	 Gets the tie class suffix @return the tie suffix &quot;_Tie&quot; 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getTieClassSuffix	TokenNameIdentifier	 get Tie Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RMI_TIE_SUFFIX	TokenNameIdentifier	 RMI  TIE  SUFFIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This implementation returns a mapper that may return up to two * file names. * * <ul> * <li>for JRMP it will return *_getStubClassSuffix (and * *_getSkelClassSuffix if JDK 1.1 is used)</li> * * <li>for IDL it will return a random name, causing &lt;rmic&gt; to * always recompile.</li> * * <li>for IIOP it will return _*_getStubClassSuffix for * interfaces and _*_getStubClassSuffix for non-interfaces (and * determine the interface and create _*_Stub from that).</li> * </ul> * @return a <code>FileNameMapper</code> */	TokenNameCOMMENT_JAVADOC	 This implementation returns a mapper that may return up to two file names. * <ul> <li>for JRMP it will return *_getStubClassSuffix (and *_getSkelClassSuffix if JDK 1.1 is used)</li> * <li>for IDL it will return a random name, causing &lt;rmic&gt; to always recompile.</li> * <li>for IIOP it will return _*_getStubClassSuffix for interfaces and _*_getStubClassSuffix for non-interfaces (and determine the interface and create _*_Stub from that).</li> </ul> @return a <code>FileNameMapper</code> 
public	TokenNamepublic	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
getMapper	TokenNameIdentifier	 get Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mapper	TokenNameIdentifier	 mapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the CLASSPATH this rmic process will use. * @return the classpath */	TokenNameCOMMENT_JAVADOC	 Gets the CLASSPATH this rmic process will use. @return the classpath 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCompileClasspath	TokenNameIdentifier	 get Compile Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Builds the compilation classpath. * @return the classpath */	TokenNameCOMMENT_JAVADOC	 Builds the compilation classpath. @return the classpath 
protected	TokenNameprotected	
Path	TokenNameIdentifier	 Path
getCompileClasspath	TokenNameIdentifier	 get Compile Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add dest dir to classpath so that previously compiled and 	TokenNameCOMMENT_LINE	add dest dir to classpath so that previously compiled and 
// untouched classes are on classpath 	TokenNameCOMMENT_LINE	untouched classes are on classpath 
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getBase	TokenNameIdentifier	 get Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Combine the build classpath with the system classpath, in an 	TokenNameCOMMENT_LINE	Combine the build classpath with the system classpath, in an 
// order determined by the value of build.sysclasspath 	TokenNameCOMMENT_LINE	order determined by the value of build.sysclasspath 
Path	TokenNameIdentifier	 Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getClasspath	TokenNameIdentifier	 get Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIncludeantruntime	TokenNameIdentifier	 get Includeantruntime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
addExisting	TokenNameIdentifier	 add Existing
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"last"	TokenNameStringLiteral	last
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
addExisting	TokenNameIdentifier	 add Existing
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
concatSystemClasspath	TokenNameIdentifier	 concat System Classpath
(	TokenNameLPAREN	
"ignore"	TokenNameStringLiteral	ignore
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIncludejavaruntime	TokenNameIdentifier	 get Includejavaruntime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classpath	TokenNameIdentifier	 classpath
.	TokenNameDOT	
addJavaRuntime	TokenNameIdentifier	 add Java Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classpath	TokenNameIdentifier	 classpath
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setup rmic argument for rmic. * @return the command line */	TokenNameCOMMENT_JAVADOC	 Setup rmic argument for rmic. @return the command line 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
setupRmicCommand	TokenNameIdentifier	 setup Rmic Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
setupRmicCommand	TokenNameIdentifier	 setup Rmic Command
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setup rmic argument for rmic. * @param options additional parameters needed by a specific * implementation. * @return the command line */	TokenNameCOMMENT_JAVADOC	 Setup rmic argument for rmic. @param options additional parameters needed by a specific implementation. @return the command line 
protected	TokenNameprotected	
Commandline	TokenNameIdentifier	 Commandline
setupRmicCommand	TokenNameIdentifier	 setup Rmic Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
Commandline	TokenNameIdentifier	 Commandline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
options	TokenNameIdentifier	 options
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Path	TokenNameIdentifier	 Path
classpath	TokenNameIdentifier	 classpath
=	TokenNameEQUAL	
getCompileClasspath	TokenNameIdentifier	 get Compile Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-d"	TokenNameStringLiteral	-d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getOutputDir	TokenNameIdentifier	 get Output Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getExtdirs	TokenNameIdentifier	 get Extdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-extdirs"	TokenNameStringLiteral	-extdirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getExtdirs	TokenNameIdentifier	 get Extdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-classpath"	TokenNameStringLiteral	-classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
classpath	TokenNameIdentifier	 classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
stubOption	TokenNameIdentifier	 stub Option
=	TokenNameEQUAL	
addStubVersionOptions	TokenNameIdentifier	 add Stub Version Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stubOption	TokenNameIdentifier	 stub Option
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//set the non-null stubOption 	TokenNameCOMMENT_LINE	set the non-null stubOption 
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
stubOption	TokenNameIdentifier	 stub Option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getSourceBase	TokenNameIdentifier	 get Source Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-keepgenerated"	TokenNameStringLiteral	-keepgenerated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIiop	TokenNameIdentifier	 get Iiop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"IIOP has been turned on."	TokenNameStringLiteral	IIOP has been turned on.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-iiop"	TokenNameStringLiteral	-iiop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIiopopts	TokenNameIdentifier	 get Iiopopts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"IIOP Options: "	TokenNameStringLiteral	IIOP Options: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIiopopts	TokenNameIdentifier	 get Iiopopts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIiopopts	TokenNameIdentifier	 get Iiopopts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdl	TokenNameIdentifier	 get Idl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-idl"	TokenNameStringLiteral	-idl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"IDL has been turned on."	TokenNameStringLiteral	IDL has been turned on.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdlopts	TokenNameIdentifier	 get Idlopts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdlopts	TokenNameIdentifier	 get Idlopts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"IDL Options: "	TokenNameStringLiteral	IDL Options: 
+	TokenNamePLUS	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdlopts	TokenNameIdentifier	 get Idlopts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"-g"	TokenNameStringLiteral	-g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compilerArgs	TokenNameIdentifier	 compiler Args
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getCurrentCompilerArgs	TokenNameIdentifier	 get Current Compiler Args
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compilerArgs	TokenNameIdentifier	 compiler Args
=	TokenNameEQUAL	
preprocessCompilerArgs	TokenNameIdentifier	 preprocess Compiler Args
(	TokenNameLPAREN	
compilerArgs	TokenNameIdentifier	 compiler Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
addArguments	TokenNameIdentifier	 add Arguments
(	TokenNameLPAREN	
compilerArgs	TokenNameIdentifier	 compiler Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logAndAddFilesToCompile	TokenNameIdentifier	 log And Add Files To Compile
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is an override point; get the stub version off the rmic command and * translate that into a compiler-specific argument * @return a string to use for the stub version; can be null * @since Ant1.7.1 */	TokenNameCOMMENT_JAVADOC	 This is an override point; get the stub version off the rmic command and translate that into a compiler-specific argument @return a string to use for the stub version; can be null @since Ant1.7.1 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
addStubVersionOptions	TokenNameIdentifier	 add Stub Version Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//handle the many different stub options. 	TokenNameCOMMENT_LINE	handle the many different stub options. 
String	TokenNameIdentifier	 String
stubVersion	TokenNameIdentifier	 stub Version
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getStubVersion	TokenNameIdentifier	 get Stub Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//default is compatibility 	TokenNameCOMMENT_LINE	default is compatibility 
String	TokenNameIdentifier	 String
stubOption	TokenNameIdentifier	 stub Option
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
stubVersion	TokenNameIdentifier	 stub Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
STUB_OPTION_1_1	TokenNameIdentifier	 STUB  OPTION 1 1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
stubVersion	TokenNameIdentifier	 stub Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stubOption	TokenNameIdentifier	 stub Option
=	TokenNameEQUAL	
STUB_1_1	TokenNameIdentifier	 STUB 1 1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
STUB_OPTION_1_2	TokenNameIdentifier	 STUB  OPTION 1 2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
stubVersion	TokenNameIdentifier	 stub Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stubOption	TokenNameIdentifier	 stub Option
=	TokenNameEQUAL	
STUB_1_2	TokenNameIdentifier	 STUB 1 2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
STUB_OPTION_COMPAT	TokenNameIdentifier	 STUB  OPTION  COMPAT
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
stubVersion	TokenNameIdentifier	 stub Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stubOption	TokenNameIdentifier	 stub Option
=	TokenNameEQUAL	
STUB_COMPAT	TokenNameIdentifier	 STUB  COMPAT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//anything else 	TokenNameCOMMENT_LINE	anything else 
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unknown stub option "	TokenNameStringLiteral	Unknown stub option 
+	TokenNamePLUS	
stubVersion	TokenNameIdentifier	 stub Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//do nothing with the value? or go -v+stubVersion?? 	TokenNameCOMMENT_LINE	do nothing with the value? or go -v+stubVersion?? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//for java1.5+, we generate compatible stubs, that is, unless 	TokenNameCOMMENT_LINE	for java1.5+, we generate compatible stubs, that is, unless 
//the caller asked for IDL or IIOP support. 	TokenNameCOMMENT_LINE	the caller asked for IDL or IIOP support. 
if	TokenNameif	
(	TokenNameLPAREN	
stubOption	TokenNameIdentifier	 stub Option
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIiop	TokenNameIdentifier	 get Iiop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdl	TokenNameIdentifier	 get Idl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stubOption	TokenNameIdentifier	 stub Option
=	TokenNameEQUAL	
STUB_COMPAT	TokenNameIdentifier	 STUB  COMPAT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stubOption	TokenNameIdentifier	 stub Option
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Preprocess the compiler arguments in any way you see fit. * This is to allow compiler adapters to validate or filter the arguments. * The base implementation returns the original compiler arguments unchanged. * @param compilerArgs the original compiler arguments * @return the filtered set. */	TokenNameCOMMENT_JAVADOC	 Preprocess the compiler arguments in any way you see fit. This is to allow compiler adapters to validate or filter the arguments. The base implementation returns the original compiler arguments unchanged. @param compilerArgs the original compiler arguments @return the filtered set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preprocessCompilerArgs	TokenNameIdentifier	 preprocess Compiler Args
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compilerArgs	TokenNameIdentifier	 compiler Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compilerArgs	TokenNameIdentifier	 compiler Args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Strip out all -J args from the command list. Invoke this from * {@link #preprocessCompilerArgs(String[])} if you have a non-forking * compiler. * @param compilerArgs the original compiler arguments * @return the filtered set. */	TokenNameCOMMENT_JAVADOC	 Strip out all -J args from the command list. Invoke this from {@link #preprocessCompilerArgs(String[])} if you have a non-forking compiler. @param compilerArgs the original compiler arguments @return the filtered set. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
filterJvmCompilerArgs	TokenNameIdentifier	 filter Jvm Compiler Args
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
compilerArgs	TokenNameIdentifier	 compiler Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
compilerArgs	TokenNameIdentifier	 compiler Args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
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
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
compilerArgs	TokenNameIdentifier	 compiler Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-J"	TokenNameStringLiteral	-J
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Dropping "	TokenNameStringLiteral	Dropping 
+	TokenNamePLUS	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
" from compiler arguments"	TokenNameStringLiteral	 from compiler arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs the compilation parameters, adds the files to compile and logs the * &quot;niceSourceList&quot; * @param cmd the commandline args */	TokenNameCOMMENT_JAVADOC	 Logs the compilation parameters, adds the files to compile and logs the &quot;niceSourceList&quot; @param cmd the commandline args 
protected	TokenNameprotected	
void	TokenNamevoid	
logAndAddFilesToCompile	TokenNameIdentifier	 log And Add Files To Compile
(	TokenNameLPAREN	
Commandline	TokenNameIdentifier	 Commandline
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
compileList	TokenNameIdentifier	 compile List
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getCompileList	TokenNameIdentifier	 get Compile List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Compilation "	TokenNameStringLiteral	Compilation 
+	TokenNamePLUS	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
describeArguments	TokenNameIdentifier	 describe Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
niceSourceList	TokenNameIdentifier	 nice Source List
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"File"	TokenNameStringLiteral	File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cListSize	TokenNameIdentifier	 c List Size
=	TokenNameEQUAL	
compileList	TokenNameIdentifier	 compile List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cListSize	TokenNameIdentifier	 c List Size
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" to be compiled:"	TokenNameStringLiteral	 to be compiled:
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
cListSize	TokenNameIdentifier	 c List Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
compileList	TokenNameIdentifier	 compile List
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
createArgument	TokenNameIdentifier	 create Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
niceSourceList	TokenNameIdentifier	 nice Source List
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mapper that may return up to two file names. * * <ul> * <li>for JRMP it will return *_getStubClassSuffix (and * *_getSkelClassSuffix if JDK 1.1 is used)</li> * * <li>for IDL it will return a random name, causing <rmic> to * always recompile.</li> * * <li>for IIOP it will return _*_getStubClassSuffix for * interfaces and _*_getStubClassSuffix for non-interfaces (and * determine the interface and create _*_Stub from that).</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Mapper that may return up to two file names. * <ul> <li>for JRMP it will return *_getStubClassSuffix (and *_getSkelClassSuffix if JDK 1.1 is used)</li> * <li>for IDL it will return a random name, causing <rmic> to always recompile.</li> * <li>for IIOP it will return _*_getStubClassSuffix for interfaces and _*_getStubClassSuffix for non-interfaces (and determine the interface and create _*_Stub from that).</li> </ul> 
private	TokenNameprivate	
class	TokenNameclass	
RmicFileNameMapper	TokenNameIdentifier	 Rmic File Name Mapper
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
RmicFileNameMapper	TokenNameIdentifier	 Rmic File Name Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation. */	TokenNameCOMMENT_JAVADOC	 Empty implementation. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation. */	TokenNameCOMMENT_JAVADOC	 Empty implementation. 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
getSkelClassSuffix	TokenNameIdentifier	 get Skel Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
||	TokenNameOR_OR	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
getTieClassSuffix	TokenNameIdentifier	 get Tie Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not a .class file or the one we'd generate 	TokenNameCOMMENT_LINE	Not a .class file or the one we'd generate 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// we know that name.endsWith(".class") 	TokenNameCOMMENT_LINE	we know that name.endsWith(".class") 
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
removeSuffix	TokenNameIdentifier	 remove Suffix
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getVerify	TokenNameIdentifier	 get Verify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
isValidRmiRemote	TokenNameIdentifier	 is Valid Rmi Remote
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * fallback in case we have trouble loading the class or * don't know how to handle it (there is no easy way to * know what IDL mode would generate. * * This is supposed to make Ant always recompile the * class, as a file of that name should not exist. */	TokenNameCOMMENT_BLOCK	 fallback in case we have trouble loading the class or don't know how to handle it (there is no easy way to know what IDL mode would generate. * This is supposed to make Ant always recompile the class, as a file of that name should not exist. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
".tmp."	TokenNameStringLiteral	.tmp.
+	TokenNamePLUS	
RAND	TokenNameIdentifier	 RAND
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIiop	TokenNameIdentifier	 get Iiop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdl	TokenNameIdentifier	 get Idl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JRMP with simple naming convention 	TokenNameCOMMENT_LINE	JRMP with simple naming convention 
if	TokenNameif	
(	TokenNameLPAREN	
STUB_OPTION_1_2	TokenNameIdentifier	 STUB  OPTION 1 2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getStubVersion	TokenNameIdentifier	 get Stub Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
getSkelClassSuffix	TokenNameIdentifier	 get Skel Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getIdl	TokenNameIdentifier	 get Idl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastSlash	TokenNameIdentifier	 last Slash
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dirname	TokenNameIdentifier	 dirname
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/* * I know, this is not necessary, but I prefer it explicit (SB) */	TokenNameCOMMENT_BLOCK	 I know, this is not necessary, but I prefer it explicit (SB) 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastSlash	TokenNameIdentifier	 last Slash
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no package 	TokenNameCOMMENT_LINE	no package 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
lastSlash	TokenNameIdentifier	 last Slash
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dirname	TokenNameIdentifier	 dirname
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLoader	TokenNameIdentifier	 get Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isInterface	TokenNameIdentifier	 is Interface
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only stub, no tie 	TokenNameCOMMENT_LINE	only stub, no tie 
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dirname	TokenNameIdentifier	 dirname
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * stub is derived from implementation, * tie from interface name. */	TokenNameCOMMENT_BLOCK	 stub is derived from implementation, tie from interface name. 
Class	TokenNameIdentifier	 Class
interf	TokenNameIdentifier	 interf
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getRemoteInterface	TokenNameIdentifier	 get Remote Interface
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
iName	TokenNameIdentifier	 i Name
=	TokenNameEQUAL	
interf	TokenNameIdentifier	 interf
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
iDir	TokenNameIdentifier	 i Dir
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
iIndex	TokenNameIdentifier	 i Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDot	TokenNameIdentifier	 last Dot
=	TokenNameEQUAL	
iName	TokenNameIdentifier	 i Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastDot	TokenNameIdentifier	 last Dot
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no package 	TokenNameCOMMENT_LINE	no package 
iIndex	TokenNameIdentifier	 i Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
iIndex	TokenNameIdentifier	 i Index
=	TokenNameEQUAL	
lastDot	TokenNameIdentifier	 last Dot
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iDir	TokenNameIdentifier	 i Dir
=	TokenNameEQUAL	
iName	TokenNameIdentifier	 i Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
iIndex	TokenNameIdentifier	 i Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iDir	TokenNameIdentifier	 i Dir
=	TokenNameEQUAL	
iDir	TokenNameIdentifier	 i Dir
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
dirname	TokenNameIdentifier	 dirname
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
getTieClassSuffix	TokenNameIdentifier	 get Tie Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
,	TokenNameCOMMA	
iDir	TokenNameIdentifier	 i Dir
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
iName	TokenNameIdentifier	 i Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
iIndex	TokenNameIdentifier	 i Index
)	TokenNameRPAREN	
+	TokenNamePLUS	
getStubClassSuffix	TokenNameIdentifier	 get Stub Class Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to verify class "	TokenNameStringLiteral	Unable to verify class 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
". It could not be found."	TokenNameStringLiteral	. It could not be found.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to verify class "	TokenNameStringLiteral	Unable to verify class 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
". It is not defined."	TokenNameStringLiteral	. It is not defined.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Unable to verify class "	TokenNameStringLiteral	Unable to verify class 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
". Loading caused Exception: "	TokenNameStringLiteral	. Loading caused Exception: 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
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
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
junit	TokenNameIdentifier	 junit
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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
PropertyHelper	TokenNameIdentifier	 Property Helper
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
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
KeepAliveOutputStream	TokenNameIdentifier	 Keep Alive Output Stream
;	TokenNameSEMICOLON	
/** * <p> A wrapper for the implementations of <code>JUnitResultFormatter</code>. * In particular, used as a nested <code>&lt;formatter&gt;</code> element in * a <code>&lt;junit&gt;</code> task. * <p> For example, * <code><pre> * &lt;junit printsummary="no" haltonfailure="yes" fork="false"&gt; * &lt;formatter type="plain" usefile="false" /&gt; * &lt;test name="org.apache.ecs.InternationalCharTest" /&gt; * &lt;/junit&gt;</pre></code> * adds a <code>plain</code> type implementation * (<code>PlainJUnitResultFormatter</code>) to display the results of the test. * * <p> Either the <code>type</code> or the <code>classname</code> attribute * must be set. * * @see JUnitTask * @see XMLJUnitResultFormatter * @see BriefJUnitResultFormatter * @see PlainJUnitResultFormatter * @see FailureRecorder * @see JUnitResultFormatter */	TokenNameCOMMENT_JAVADOC	 <p> A wrapper for the implementations of <code>JUnitResultFormatter</code>. In particular, used as a nested <code>&lt;formatter&gt;</code> element in a <code>&lt;junit&gt;</code> task. <p> For example, <code><pre> &lt;junit printsummary="no" haltonfailure="yes" fork="false"&gt; &lt;formatter type="plain" usefile="false" /&gt; &lt;test name="org.apache.ecs.InternationalCharTest" /&gt; &lt;/junit&gt;</pre></code> adds a <code>plain</code> type implementation (<code>PlainJUnitResultFormatter</code>) to display the results of the test. * <p> Either the <code>type</code> or the <code>classname</code> attribute must be set. * @see JUnitTask @see XMLJUnitResultFormatter @see BriefJUnitResultFormatter @see PlainJUnitResultFormatter @see FailureRecorder @see JUnitResultFormatter 
public	TokenNamepublic	
class	TokenNameclass	
FormatterElement	TokenNameIdentifier	 Formatter Element
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
KeepAliveOutputStream	TokenNameIdentifier	 Keep Alive Output Stream
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outFile	TokenNameIdentifier	 out File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
useFile	TokenNameIdentifier	 use File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
ifCond	TokenNameIdentifier	 if Cond
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
unlessCond	TokenNameIdentifier	 unless Cond
;	TokenNameSEMICOLON	
/** * Store the project reference for passing it to nested components. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Store the project reference for passing it to nested components. @since Ant 1.8 
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** xml formatter class */	TokenNameCOMMENT_JAVADOC	 xml formatter class 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_FORMATTER_CLASS_NAME	TokenNameIdentifier	 XML  FORMATTER  CLASS  NAME
=	TokenNameEQUAL	
"org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter"	TokenNameStringLiteral	org.apache.tools.ant.taskdefs.optional.junit.XMLJUnitResultFormatter
;	TokenNameSEMICOLON	
/** brief formatter class */	TokenNameCOMMENT_JAVADOC	 brief formatter class 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BRIEF_FORMATTER_CLASS_NAME	TokenNameIdentifier	 BRIEF  FORMATTER  CLASS  NAME
=	TokenNameEQUAL	
"org.apache.tools.ant.taskdefs.optional.junit.BriefJUnitResultFormatter"	TokenNameStringLiteral	org.apache.tools.ant.taskdefs.optional.junit.BriefJUnitResultFormatter
;	TokenNameSEMICOLON	
/** plain formatter class */	TokenNameCOMMENT_JAVADOC	 plain formatter class 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PLAIN_FORMATTER_CLASS_NAME	TokenNameIdentifier	 PLAIN  FORMATTER  CLASS  NAME
=	TokenNameEQUAL	
"org.apache.tools.ant.taskdefs.optional.junit.PlainJUnitResultFormatter"	TokenNameStringLiteral	org.apache.tools.ant.taskdefs.optional.junit.PlainJUnitResultFormatter
;	TokenNameSEMICOLON	
/** failure recorder class */	TokenNameCOMMENT_JAVADOC	 failure recorder class 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FAILURE_RECORDER_CLASS_NAME	TokenNameIdentifier	 FAILURE  RECORDER  CLASS  NAME
=	TokenNameEQUAL	
"org.apache.tools.ant.taskdefs.optional.junit.FailureRecorder"	TokenNameStringLiteral	org.apache.tools.ant.taskdefs.optional.junit.FailureRecorder
;	TokenNameSEMICOLON	
/** * <p> Quick way to use a standard formatter. * * <p> At the moment, there are three supported standard formatters. * <ul> * <li> The <code>xml</code> type uses a <code>XMLJUnitResultFormatter</code>. * <li> The <code>brief</code> type uses a <code>BriefJUnitResultFormatter</code>. * <li> The <code>plain</code> type (the default) uses a <code>PlainJUnitResultFormatter</code>. * <li> The <code>failure</code> type uses a <code>FailureRecorder</code>. * </ul> * * <p> Sets <code>classname</code> attribute - so you can't use that * attribute if you use this one. * @param type the enumerated value to use. */	TokenNameCOMMENT_JAVADOC	 <p> Quick way to use a standard formatter. * <p> At the moment, there are three supported standard formatters. <ul> <li> The <code>xml</code> type uses a <code>XMLJUnitResultFormatter</code>. <li> The <code>brief</code> type uses a <code>BriefJUnitResultFormatter</code>. <li> The <code>plain</code> type (the default) uses a <code>PlainJUnitResultFormatter</code>. <li> The <code>failure</code> type uses a <code>FailureRecorder</code>. </ul> * <p> Sets <code>classname</code> attribute - so you can't use that attribute if you use this one. @param type the enumerated value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
XML_FORMATTER_CLASS_NAME	TokenNameIdentifier	 XML  FORMATTER  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"brief"	TokenNameStringLiteral	brief
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
BRIEF_FORMATTER_CLASS_NAME	TokenNameIdentifier	 BRIEF  FORMATTER  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"failure"	TokenNameStringLiteral	failure
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
FAILURE_RECORDER_CLASS_NAME	TokenNameIdentifier	 FAILURE  RECORDER  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// must be plain, ensured by TypeAttribute 	TokenNameCOMMENT_LINE	must be plain, ensured by TypeAttribute 
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
PLAIN_FORMATTER_CLASS_NAME	TokenNameIdentifier	 PLAIN  FORMATTER  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p> Set name of class to be used as the formatter. * * <p> This class must implement <code>JUnitResultFormatter</code> * @param classname the name of the formatter class. */	TokenNameCOMMENT_JAVADOC	 <p> Set name of class to be used as the formatter. * <p> This class must implement <code>JUnitResultFormatter</code> @param classname the name of the formatter class. 
public	TokenNamepublic	
void	TokenNamevoid	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classname	TokenNameIdentifier	 classname
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XML_FORMATTER_CLASS_NAME	TokenNameIdentifier	 XML  FORMATTER  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExtension	TokenNameIdentifier	 set Extension
(	TokenNameLPAREN	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
PLAIN_FORMATTER_CLASS_NAME	TokenNameIdentifier	 PLAIN  FORMATTER  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExtension	TokenNameIdentifier	 set Extension
(	TokenNameLPAREN	
".txt"	TokenNameStringLiteral	.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
BRIEF_FORMATTER_CLASS_NAME	TokenNameIdentifier	 BRIEF  FORMATTER  CLASS  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExtension	TokenNameIdentifier	 set Extension
(	TokenNameLPAREN	
".txt"	TokenNameStringLiteral	.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get name of class to be used as the formatter. * @return the name of the class. */	TokenNameCOMMENT_JAVADOC	 Get name of class to be used as the formatter. @return the name of the class. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassname	TokenNameIdentifier	 get Classname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the extension to use for the report file. * @param ext the extension to use. */	TokenNameCOMMENT_JAVADOC	 Set the extension to use for the report file. @param ext the extension to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setExtension	TokenNameIdentifier	 set Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ext	TokenNameIdentifier	 ext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
ext	TokenNameIdentifier	 ext
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the extension used for the report file. * @return the extension. */	TokenNameCOMMENT_JAVADOC	 Get the extension used for the report file. @return the extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> Set the file which the formatte should log to. * * <p> Note that logging to file must be enabled . */	TokenNameCOMMENT_JAVADOC	 <p> Set the file which the formatte should log to. * <p> Note that logging to file must be enabled . 
void	TokenNamevoid	
setOutfile	TokenNameIdentifier	 set Outfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outFile	TokenNameIdentifier	 out File
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> Set output stream for formatter to use. * * <p> Defaults to standard out. * @param out the output stream to use. */	TokenNameCOMMENT_JAVADOC	 <p> Set output stream for formatter to use. * <p> Defaults to standard out. @param out the output stream to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
||	TokenNameOR_OR	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
KeepAliveOutputStream	TokenNameIdentifier	 Keep Alive Output Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether the formatter should log to file. * @param useFile if true use a file, if false send * to standard out. */	TokenNameCOMMENT_JAVADOC	 Set whether the formatter should log to file. @param useFile if true use a file, if false send to standard out. 
public	TokenNamepublic	
void	TokenNamevoid	
setUseFile	TokenNameIdentifier	 set Use File
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useFile	TokenNameIdentifier	 use File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
useFile	TokenNameIdentifier	 use File
=	TokenNameEQUAL	
useFile	TokenNameIdentifier	 use File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether the formatter should log to file. */	TokenNameCOMMENT_JAVADOC	 Get whether the formatter should log to file. 
boolean	TokenNameboolean	
getUseFile	TokenNameIdentifier	 get Use File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useFile	TokenNameIdentifier	 use File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether this formatter should be used. It will be used if * the expression evaluates to true or the name of a property * which has been set, otherwise it won't. * @param ifCond name of property * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set whether this formatter should be used. It will be used if the expression evaluates to true or the name of a property which has been set, otherwise it won't. @param ifCond name of property @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
ifCond	TokenNameIdentifier	 if Cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ifCond	TokenNameIdentifier	 if Cond
=	TokenNameEQUAL	
ifCond	TokenNameIdentifier	 if Cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether this formatter should be used. It will be used if * the expression evaluates to true or the name of a property * which has been set, otherwise it won't. * @param ifCond name of property */	TokenNameCOMMENT_JAVADOC	 Set whether this formatter should be used. It will be used if the expression evaluates to true or the name of a property which has been set, otherwise it won't. @param ifCond name of property 
public	TokenNamepublic	
void	TokenNamevoid	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ifCond	TokenNameIdentifier	 if Cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIf	TokenNameIdentifier	 set If
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
ifCond	TokenNameIdentifier	 if Cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether this formatter should NOT be used. It will be used * if the expression evaluates to false or the name of a property * which has not been set, orthwise it will not be used. * @param unlessCond name of property * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Set whether this formatter should NOT be used. It will be used if the expression evaluates to false or the name of a property which has not been set, orthwise it will not be used. @param unlessCond name of property @since Ant 1.8.0 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
unlessCond	TokenNameIdentifier	 unless Cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unlessCond	TokenNameIdentifier	 unless Cond
=	TokenNameEQUAL	
unlessCond	TokenNameIdentifier	 unless Cond
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether this formatter should NOT be used. It will be used * if the expression evaluates to false or the name of a property * which has not been set, orthwise it will not be used. * @param unlessCond name of property */	TokenNameCOMMENT_JAVADOC	 Set whether this formatter should NOT be used. It will be used if the expression evaluates to false or the name of a property which has not been set, orthwise it will not be used. @param unlessCond name of property 
public	TokenNamepublic	
void	TokenNamevoid	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
unlessCond	TokenNameIdentifier	 unless Cond
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUnless	TokenNameIdentifier	 set Unless
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
unlessCond	TokenNameIdentifier	 unless Cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures that the selector passes the conditions placed * on it with <code>if</code> and <code>unless</code> properties. * @param t the task the this formatter is used in. * @return true if the formatter should be used. */	TokenNameCOMMENT_JAVADOC	 Ensures that the selector passes the conditions placed on it with <code>if</code> and <code>unless</code> properties. @param t the task the this formatter is used in. @return true if the formatter should be used. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldUse	TokenNameIdentifier	 should Use
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
ifCond	TokenNameIdentifier	 if Cond
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
unlessCond	TokenNameIdentifier	 unless Cond
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.2 
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
createFormatter	TokenNameIdentifier	 create Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
createFormatter	TokenNameIdentifier	 create Formatter
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Store the project reference for passing it to nested components. * @param project the reference * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Store the project reference for passing it to nested components. @param project the reference @since Ant 1.8 
public	TokenNamepublic	
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.6 
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
createFormatter	TokenNameIdentifier	 create Formatter
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"you must specify type or classname"	TokenNameStringLiteral	you must specify type or classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//although this code appears to duplicate that of ClasspathUtils.newInstance, 	TokenNameCOMMENT_LINE	although this code appears to duplicate that of ClasspathUtils.newInstance, 
//we cannot use that because this formatter may run in a forked process, 	TokenNameCOMMENT_LINE	we cannot use that because this formatter may run in a forked process, 
//without that class. 	TokenNameCOMMENT_LINE	without that class. 
Class	TokenNameIdentifier	 Class
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Using loader "	TokenNameStringLiteral	Using loader 
+	TokenNamePLUS	
loader	TokenNameIdentifier	 loader
+	TokenNamePLUS	
" on class "	TokenNameStringLiteral	 on class 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Using loader "	TokenNameStringLiteral	Using loader 
+	TokenNamePLUS	
loader	TokenNameIdentifier	 loader
+	TokenNamePLUS	
" on class "	TokenNameStringLiteral	 on class 
+	TokenNamePLUS	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
classname	TokenNameIdentifier	 classname
+	TokenNamePLUS	
" is not a JUnitResultFormatter"	TokenNameStringLiteral	 is not a JUnitResultFormatter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useFile	TokenNameIdentifier	 use File
&&	TokenNameAND_AND	
outFile	TokenNameIdentifier	 out File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
outFile	TokenNameIdentifier	 out File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to open file "	TokenNameStringLiteral	Unable to open file 
+	TokenNamePLUS	
outFile	TokenNameIdentifier	 out File
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
needToSetProjectReference	TokenNameIdentifier	 need To Set Project Reference
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"project"	TokenNameStringLiteral	project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Project	TokenNameIdentifier	 Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is already a project reference so dont overwrite this 	TokenNameCOMMENT_LINE	there is already a project reference so dont overwrite this 
needToSetProjectReference	TokenNameIdentifier	 need To Set Project Reference
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchFieldException	TokenNameIdentifier	 No Such Field Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no field present, so no previous reference exists 	TokenNameCOMMENT_LINE	no field present, so no previous reference exists 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
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
if	TokenNameif	
(	TokenNameLPAREN	
needToSetProjectReference	TokenNameIdentifier	 need To Set Project Reference
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
setter	TokenNameIdentifier	 setter
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setter	TokenNameIdentifier	 setter
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setProject"	TokenNameStringLiteral	setProject
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setter	TokenNameIdentifier	 setter
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no setProject to invoke; just ignore 	TokenNameCOMMENT_LINE	no setProject to invoke; just ignore 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
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
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> Enumerated attribute with the values "plain", "xml", "brief" and "failure". * * <p> Use to enumerate options for <code>type</code> attribute. */	TokenNameCOMMENT_JAVADOC	 <p> Enumerated attribute with the values "plain", "xml", "brief" and "failure". * <p> Use to enumerate options for <code>type</code> attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TypeAttribute	TokenNameIdentifier	 Type Attribute
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"plain"	TokenNameStringLiteral	plain
,	TokenNameCOMMA	
"xml"	TokenNameStringLiteral	xml
,	TokenNameCOMMA	
"brief"	TokenNameStringLiteral	brief
,	TokenNameCOMMA	
"failure"	TokenNameStringLiteral	failure
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

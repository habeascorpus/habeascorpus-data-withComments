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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ChainReaderHelper	TokenNameIdentifier	 Chain Reader Helper
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
FilterChain	TokenNameIdentifier	 Filter Chain
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
Resource	TokenNameIdentifier	 Resource
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
ResourceCollection	TokenNameIdentifier	 Resource Collection
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Load a resource into a property * * @since Ant 1.7 * @ant.task category="utility" */	TokenNameCOMMENT_JAVADOC	 Load a resource into a property * @since Ant 1.7 @ant.task category="utility" 
public	TokenNamepublic	
class	TokenNameclass	
LoadResource	TokenNameIdentifier	 Load Resource
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
/** * The resource to load. */	TokenNameCOMMENT_JAVADOC	 The resource to load. 
private	TokenNameprivate	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
/** * what to do when it goes pear-shaped */	TokenNameCOMMENT_JAVADOC	 what to do when it goes pear-shaped 
private	TokenNameprivate	
boolean	TokenNameboolean	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * suppress error message if it goes pear-shaped, sets failOnError=false */	TokenNameCOMMENT_JAVADOC	 suppress error message if it goes pear-shaped, sets failOnError=false 
private	TokenNameprivate	
boolean	TokenNameboolean	
quiet	TokenNameIdentifier	 quiet
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Encoding to use for filenames, defaults to the platform's default * encoding. */	TokenNameCOMMENT_JAVADOC	 Encoding to use for filenames, defaults to the platform's default encoding. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * name of property */	TokenNameCOMMENT_JAVADOC	 name of property 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Holds FilterChains */	TokenNameCOMMENT_JAVADOC	 Holds FilterChains 
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
filterChains	TokenNameIdentifier	 filter Chains
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Encoding to use for input, defaults to the platform's default * encoding. <p> * * For a list of possible values see * <a href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html"> * http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html * </a>.</p> * * @param encoding The new Encoding value */	TokenNameCOMMENT_JAVADOC	 Encoding to use for input, defaults to the platform's default encoding. <p> * For a list of possible values see <a href="http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html"> http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html </a>.</p> * @param encoding The new Encoding value 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Property name to save to. * * @param property The new Property value */	TokenNameCOMMENT_JAVADOC	 Property name to save to. * @param property The new Property value 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, fail on load error. * * @param fail The new Failonerror value */	TokenNameCOMMENT_JAVADOC	 If true, fail on load error. * @param fail The new Failonerror value 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setFailonerror	TokenNameIdentifier	 set Failonerror
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
fail	TokenNameIdentifier	 fail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, suppress the load error report and set the * the failonerror value to false. * @param quiet The new Quiet value */	TokenNameCOMMENT_JAVADOC	 If true, suppress the load error report and set the the failonerror value to false. @param quiet The new Quiet value 
public	TokenNamepublic	
void	TokenNamevoid	
setQuiet	TokenNameIdentifier	 set Quiet
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
quiet	TokenNameIdentifier	 quiet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
quiet	TokenNameIdentifier	 quiet
=	TokenNameEQUAL	
quiet	TokenNameIdentifier	 quiet
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
quiet	TokenNameIdentifier	 quiet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failOnError	TokenNameIdentifier	 fail On Error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * read in a source file to a property * * @exception BuildException if something goes wrong with the build */	TokenNameCOMMENT_JAVADOC	 read in a source file to a property * @exception BuildException if something goes wrong with the build 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
//validation 	TokenNameCOMMENT_LINE	validation 
if	TokenNameif	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"source resource not defined"	TokenNameStringLiteral	source resource not defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"output property not defined"	TokenNameStringLiteral	output property not defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quiet	TokenNameIdentifier	 quiet
&&	TokenNameAND_AND	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"quiet and failonerror cannot both be "	TokenNameStringLiteral	quiet and failonerror cannot both be 
+	TokenNamePLUS	
"set to true"	TokenNameStringLiteral	set to true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
isExists	TokenNameIdentifier	 is Exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
quiet	TokenNameIdentifier	 quiet
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
bis	TokenNameIdentifier	 bis
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
instream	TokenNameIdentifier	 instream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"loading "	TokenNameStringLiteral	loading 
+	TokenNamePLUS	
src	TokenNameIdentifier	 src
+	TokenNamePLUS	
" into property "	TokenNameStringLiteral	 into property 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"resource size = "	TokenNameStringLiteral	resource size = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
Resource	TokenNameIdentifier	 Resource
.	TokenNameDOT	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
?	TokenNameQUESTION	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
:	TokenNameCOLON	
"unknown"	TokenNameStringLiteral	unknown
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//discard most of really big resources 	TokenNameCOMMENT_LINE	discard most of really big resources 
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
//open up the resource 	TokenNameCOMMENT_LINE	open up the resource 
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bis	TokenNameIdentifier	 bis
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instream	TokenNameIdentifier	 instream
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
bis	TokenNameIdentifier	 bis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
instream	TokenNameIdentifier	 instream
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
bis	TokenNameIdentifier	 bis
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ChainReaderHelper	TokenNameIdentifier	 Chain Reader Helper
crh	TokenNameIdentifier	 crh
=	TokenNameEQUAL	
new	TokenNamenew	
ChainReaderHelper	TokenNameIdentifier	 Chain Reader Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
!=	TokenNameNOT_EQUAL	
Resource	TokenNameIdentifier	 Resource
.	TokenNameDOT	
UNKNOWN_SIZE	TokenNameIdentifier	 UNKNOWN  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
crh	TokenNameIdentifier	 crh
.	TokenNameDOT	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
crh	TokenNameIdentifier	 crh
.	TokenNameDOT	
setPrimaryReader	TokenNameIdentifier	 set Primary Reader
(	TokenNameLPAREN	
instream	TokenNameIdentifier	 instream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crh	TokenNameIdentifier	 crh
.	TokenNameDOT	
setFilterChains	TokenNameIdentifier	 set Filter Chains
(	TokenNameLPAREN	
filterChains	TokenNameIdentifier	 filter Chains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crh	TokenNameIdentifier	 crh
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instream	TokenNameIdentifier	 instream
=	TokenNameEQUAL	
crh	TokenNameIdentifier	 crh
.	TokenNameDOT	
getAssembledReader	TokenNameIdentifier	 get Assembled Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
crh	TokenNameIdentifier	 crh
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
instream	TokenNameIdentifier	 instream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Do not set property "	TokenNameStringLiteral	Do not set property 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
" as its length is 0."	TokenNameStringLiteral	 as its length is 0.
,	TokenNameCOMMA	
quiet	TokenNameIdentifier	 quiet
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNewProperty	TokenNameIdentifier	 set New Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"loaded "	TokenNameStringLiteral	loaded 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" characters"	TokenNameStringLiteral	 characters
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
" := "	TokenNameStringLiteral	 := 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Unable to load resource: "	TokenNameStringLiteral	Unable to load resource: 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
quiet	TokenNameIdentifier	 quiet
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
final	TokenNamefinal	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
failOnError	TokenNameIdentifier	 fail On Error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
be	TokenNameIdentifier	 be
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
quiet	TokenNameIdentifier	 quiet
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add the FilterChain element. * @param filter the filter to add */	TokenNameCOMMENT_JAVADOC	 Add the FilterChain element. @param filter the filter to add 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addFilterChain	TokenNameIdentifier	 add Filter Chain
(	TokenNameLPAREN	
FilterChain	TokenNameIdentifier	 Filter Chain
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterChains	TokenNameIdentifier	 filter Chains
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the source resource. * @param a the resource to load as a single element Resource collection. */	TokenNameCOMMENT_JAVADOC	 Set the source resource. @param a the resource to load as a single element Resource collection. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"only single argument resource collections"	TokenNameStringLiteral	only single argument resource collections
+	TokenNamePLUS	
" are supported"	TokenNameStringLiteral	 are supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

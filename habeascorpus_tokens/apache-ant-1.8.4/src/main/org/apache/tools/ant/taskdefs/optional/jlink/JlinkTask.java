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
jlink	TokenNameIdentifier	 jlink
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
MatchingTask	TokenNameIdentifier	 Matching Task
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
/** * This class defines objects that can link together various jar and * zip files. * * <p>It is basically a wrapper for the jlink code written originally * by <a href="mailto:beard@netscape.com">Patrick Beard</a>. The * classes org.apache.tools.ant.taskdefs.optional.jlink.Jlink and * org.apache.tools.ant.taskdefs.optional.jlink.ClassNameReader * support this class.</p> * * <p>For example: * <code> * <pre> * &lt;jlink compress=&quot;false&quot; outfile=&quot;out.jar&quot;/&gt; * &lt;mergefiles&gt; * &lt;pathelement path=&quot;${build.dir}/mergefoo.jar&quot;/&gt; * &lt;pathelement path=&quot;${build.dir}/mergebar.jar&quot;/&gt; * &lt;/mergefiles&gt; * &lt;addfiles&gt; * &lt;pathelement path=&quot;${build.dir}/mac.jar&quot;/&gt; * &lt;pathelement path=&quot;${build.dir}/pc.zip&quot;/&gt; * &lt;/addfiles&gt; * &lt;/jlink&gt; * </pre> * </code> * * @ant.task ignore="true" */	TokenNameCOMMENT_JAVADOC	 This class defines objects that can link together various jar and zip files. * <p>It is basically a wrapper for the jlink code written originally by <a href="mailto:beard@netscape.com">Patrick Beard</a>. The classes org.apache.tools.ant.taskdefs.optional.jlink.Jlink and org.apache.tools.ant.taskdefs.optional.jlink.ClassNameReader support this class.</p> * <p>For example: <code> <pre> &lt;jlink compress=&quot;false&quot; outfile=&quot;out.jar&quot;/&gt; &lt;mergefiles&gt; &lt;pathelement path=&quot;${build.dir}/mergefoo.jar&quot;/&gt; &lt;pathelement path=&quot;${build.dir}/mergebar.jar&quot;/&gt; &lt;/mergefiles&gt; &lt;addfiles&gt; &lt;pathelement path=&quot;${build.dir}/mac.jar&quot;/&gt; &lt;pathelement path=&quot;${build.dir}/pc.zip&quot;/&gt; &lt;/addfiles&gt; &lt;/jlink&gt; </pre> </code> * @ant.task ignore="true" 
public	TokenNamepublic	
class	TokenNameclass	
JlinkTask	TokenNameIdentifier	 Jlink Task
extends	TokenNameextends	
MatchingTask	TokenNameIdentifier	 Matching Task
{	TokenNameLBRACE	
/** * The output file for this run of jlink. Usually a jar or zip file. * @param outfile the output file */	TokenNameCOMMENT_JAVADOC	 The output file for this run of jlink. Usually a jar or zip file. @param outfile the output file 
public	TokenNamepublic	
void	TokenNamevoid	
setOutfile	TokenNameIdentifier	 set Outfile
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
outfile	TokenNameIdentifier	 outfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outfile	TokenNameIdentifier	 outfile
=	TokenNameEQUAL	
outfile	TokenNameIdentifier	 outfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Establishes the object that contains the files to * be merged into the output. * @return a path to be configured */	TokenNameCOMMENT_JAVADOC	 Establishes the object that contains the files to be merged into the output. @return a path to be configured 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createMergefiles	TokenNameIdentifier	 create Mergefiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mergefiles	TokenNameIdentifier	 mergefiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mergefiles	TokenNameIdentifier	 mergefiles
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
this	TokenNamethis	
.	TokenNameDOT	
mergefiles	TokenNameIdentifier	 mergefiles
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the files to be merged into the output. * @param mergefiles a path */	TokenNameCOMMENT_JAVADOC	 Sets the files to be merged into the output. @param mergefiles a path 
public	TokenNamepublic	
void	TokenNamevoid	
setMergefiles	TokenNameIdentifier	 set Mergefiles
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
mergefiles	TokenNameIdentifier	 mergefiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mergefiles	TokenNameIdentifier	 mergefiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mergefiles	TokenNameIdentifier	 mergefiles
=	TokenNameEQUAL	
mergefiles	TokenNameIdentifier	 mergefiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mergefiles	TokenNameIdentifier	 mergefiles
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
mergefiles	TokenNameIdentifier	 mergefiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Establishes the object that contains the files to * be added to the output. * @return a path to be configured */	TokenNameCOMMENT_JAVADOC	 Establishes the object that contains the files to be added to the output. @return a path to be configured 
public	TokenNamepublic	
Path	TokenNameIdentifier	 Path
createAddfiles	TokenNameIdentifier	 create Addfiles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
addfiles	TokenNameIdentifier	 addfiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
addfiles	TokenNameIdentifier	 addfiles
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
this	TokenNamethis	
.	TokenNameDOT	
addfiles	TokenNameIdentifier	 addfiles
.	TokenNameDOT	
createPath	TokenNameIdentifier	 create Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the files to be added into the output. * @param addfiles a path */	TokenNameCOMMENT_JAVADOC	 Sets the files to be added into the output. @param addfiles a path 
public	TokenNamepublic	
void	TokenNamevoid	
setAddfiles	TokenNameIdentifier	 set Addfiles
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
addfiles	TokenNameIdentifier	 addfiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
addfiles	TokenNameIdentifier	 addfiles
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
addfiles	TokenNameIdentifier	 addfiles
=	TokenNameEQUAL	
addfiles	TokenNameIdentifier	 addfiles
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
addfiles	TokenNameIdentifier	 addfiles
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
addfiles	TokenNameIdentifier	 addfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines whether or not the output should be compacted. * @param compress a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Defines whether or not the output should be compacted. @param compress a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setCompress	TokenNameIdentifier	 set Compress
(	TokenNameLPAREN	
boolean	TokenNameboolean	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
=	TokenNameEQUAL	
compress	TokenNameIdentifier	 compress
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Does the adding and merging. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Does the adding and merging. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
//Be sure everything has been set. 	TokenNameCOMMENT_LINE	Be sure everything has been set. 
if	TokenNameif	
(	TokenNameLPAREN	
outfile	TokenNameIdentifier	 outfile
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"outfile attribute is required! "	TokenNameStringLiteral	outfile attribute is required! 
+	TokenNamePLUS	
"Please set."	TokenNameStringLiteral	Please set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
haveAddFiles	TokenNameIdentifier	 have Add Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
haveMergeFiles	TokenNameIdentifier	 have Merge Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"addfiles or mergefiles required! "	TokenNameStringLiteral	addfiles or mergefiles required! 
+	TokenNamePLUS	
"Please set."	TokenNameStringLiteral	Please set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"linking: "	TokenNameStringLiteral	linking: 
+	TokenNamePLUS	
outfile	TokenNameIdentifier	 outfile
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"compression: "	TokenNameStringLiteral	compression: 
+	TokenNamePLUS	
compress	TokenNameIdentifier	 compress
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jlink	TokenNameIdentifier	 jlink
linker	TokenNameIdentifier	 linker
=	TokenNameEQUAL	
new	TokenNamenew	
jlink	TokenNameIdentifier	 jlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
setOutfile	TokenNameIdentifier	 set Outfile
(	TokenNameLPAREN	
outfile	TokenNameIdentifier	 outfile
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
setCompression	TokenNameIdentifier	 set Compression
(	TokenNameLPAREN	
compress	TokenNameIdentifier	 compress
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
haveMergeFiles	TokenNameIdentifier	 have Merge Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"merge files: "	TokenNameStringLiteral	merge files: 
+	TokenNamePLUS	
mergefiles	TokenNameIdentifier	 mergefiles
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
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
addMergeFiles	TokenNameIdentifier	 add Merge Files
(	TokenNameLPAREN	
mergefiles	TokenNameIdentifier	 mergefiles
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
haveAddFiles	TokenNameIdentifier	 have Add Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"add files: "	TokenNameStringLiteral	add files: 
+	TokenNamePLUS	
addfiles	TokenNameIdentifier	 addfiles
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
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
addAddFiles	TokenNameIdentifier	 add Add Files
(	TokenNameLPAREN	
addfiles	TokenNameIdentifier	 addfiles
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
linker	TokenNameIdentifier	 linker
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveAddFiles	TokenNameIdentifier	 have Add Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
haveEntries	TokenNameIdentifier	 have Entries
(	TokenNameLPAREN	
addfiles	TokenNameIdentifier	 addfiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveMergeFiles	TokenNameIdentifier	 have Merge Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
haveEntries	TokenNameIdentifier	 have Entries
(	TokenNameLPAREN	
mergefiles	TokenNameIdentifier	 mergefiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveEntries	TokenNameIdentifier	 have Entries
(	TokenNameLPAREN	
Path	TokenNameIdentifier	 Path
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outfile	TokenNameIdentifier	 outfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
mergefiles	TokenNameIdentifier	 mergefiles
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Path	TokenNameIdentifier	 Path
addfiles	TokenNameIdentifier	 addfiles
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
compress	TokenNameIdentifier	 compress
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

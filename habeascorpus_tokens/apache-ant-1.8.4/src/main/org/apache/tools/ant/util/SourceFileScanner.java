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
util	TokenNameIdentifier	 util
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
ResourceFactory	TokenNameIdentifier	 Resource Factory
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResource	TokenNameIdentifier	 File Resource
;	TokenNameSEMICOLON	
/** * Utility class that collects the functionality of the various * scanDir methods that have been scattered in several tasks before. * * <p>The only method returns an array of source files. The array is a * subset of the files given as a parameter and holds only those that * are newer than their corresponding target files.</p> * */	TokenNameCOMMENT_JAVADOC	 Utility class that collects the functionality of the various scanDir methods that have been scattered in several tasks before. * <p>The only method returns an array of source files. The array is a subset of the files given as a parameter and holds only those that are newer than their corresponding target files.</p> 
public	TokenNamepublic	
class	TokenNameclass	
SourceFileScanner	TokenNameIdentifier	 Source File Scanner
implements	TokenNameimplements	
ResourceFactory	TokenNameIdentifier	 Resource Factory
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
;	TokenNameSEMICOLON	
// base directory of the fileset 	TokenNameCOMMENT_LINE	base directory of the fileset 
/** * Construct a new SourceFileScanner. * @param task The task we should log messages through. */	TokenNameCOMMENT_JAVADOC	 Construct a new SourceFileScanner. @param task The task we should log messages through. 
public	TokenNamepublic	
SourceFileScanner	TokenNameIdentifier	 Source File Scanner
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restrict the given set of files to those that are newer than * their corresponding target files. * * @param files the original set of files. * @param srcDir all files are relative to this directory. * @param destDir target files live here. if null file names * returned by the mapper are assumed to be absolute. * @param mapper knows how to construct a target file names from * source file names. * @return an array of filenames. */	TokenNameCOMMENT_JAVADOC	 Restrict the given set of files to those that are newer than their corresponding target files. * @param files the original set of files. @param srcDir all files are relative to this directory. @param destDir target files live here. if null file names returned by the mapper are assumed to be absolute. @param mapper knows how to construct a target file names from source file names. @return an array of filenames. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restrict the given set of files to those that are newer than * their corresponding target files. * * @param files the original set of files. * @param srcDir all files are relative to this directory. * @param destDir target files live here. If null file names * returned by the mapper are assumed to be absolute. * @param mapper knows how to construct a target file names from * source file names. * @param granularity The number of milliseconds leeway to give * before deciding a target is out of date. * @return an array of filenames. * * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Restrict the given set of files to those that are newer than their corresponding target files. * @param files the original set of files. @param srcDir all files are relative to this directory. @param destDir target files live here. If null file names returned by the mapper are assumed to be absolute. @param mapper knows how to construct a target file names from source file names. @param granularity The number of milliseconds leeway to give before deciding a target is out of date. @return an array of filenames. * @since Ant 1.6.2 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// record destdir for later use in getResource 	TokenNameCOMMENT_LINE	record destdir for later use in getResource 
this	TokenNamethis	
.	TokenNameDOT	
destDir	TokenNameIdentifier	 dest Dir
=	TokenNameEQUAL	
destDir	TokenNameIdentifier	 dest Dir
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
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
files	TokenNameIdentifier	 files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sourceresources	TokenNameIdentifier	 sourceresources
=	TokenNameEQUAL	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
sourceresources	TokenNameIdentifier	 sourceresources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build the list of sources which are out of date with 	TokenNameCOMMENT_LINE	build the list of sources which are out of date with 
// respect to the target 	TokenNameCOMMENT_LINE	respect to the target 
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outofdate	TokenNameIdentifier	 outofdate
=	TokenNameEQUAL	
ResourceUtils	TokenNameIdentifier	 Resource Utils
.	TokenNameDOT	
selectOutOfDateSources	TokenNameIdentifier	 select Out Of Date Sources
(	TokenNameLPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
sourceresources	TokenNameIdentifier	 sourceresources
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
outofdate	TokenNameIdentifier	 outofdate
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
outofdate	TokenNameIdentifier	 outofdate
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
outofdate	TokenNameIdentifier	 outofdate
[	TokenNameLBRACKET	
counter	TokenNameIdentifier	 counter
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience layer on top of restrict that returns the source * files as File objects (containing absolute paths if srcDir is * absolute). * @param files the original set of files. * @param srcDir all files are relative to this directory. * @param destDir target files live here. If null file names * returned by the mapper are assumed to be absolute. * @param mapper knows how to construct a target file names from * source file names. * @return an array of files. */	TokenNameCOMMENT_JAVADOC	 Convenience layer on top of restrict that returns the source files as File objects (containing absolute paths if srcDir is absolute). @param files the original set of files. @param srcDir all files are relative to this directory. @param destDir target files live here. If null file names returned by the mapper are assumed to be absolute. @param mapper knows how to construct a target file names from source file names. @return an array of files. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
restrictAsFiles	TokenNameIdentifier	 restrict As Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
restrictAsFiles	TokenNameIdentifier	 restrict As Files
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience layer on top of restrict that returns the source * files as File objects (containing absolute paths if srcDir is * absolute). * * @param files the original set of files. * @param srcDir all files are relative to this directory. * @param destDir target files live here. If null file names * returned by the mapper are assumed to be absolute. * @param mapper knows how to construct a target file names from * source file names. * @param granularity The number of milliseconds leeway to give * before deciding a target is out of date. * @return an array of files. * @since Ant 1.6.2 */	TokenNameCOMMENT_JAVADOC	 Convenience layer on top of restrict that returns the source files as File objects (containing absolute paths if srcDir is absolute). * @param files the original set of files. @param srcDir all files are relative to this directory. @param destDir target files live here. If null file names returned by the mapper are assumed to be absolute. @param mapper knows how to construct a target file names from source file names. @param granularity The number of milliseconds leeway to give before deciding a target is out of date. @return an array of files. @since Ant 1.6.2 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
restrictAsFiles	TokenNameIdentifier	 restrict As Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
long	TokenNamelong	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
restrict	TokenNameIdentifier	 restrict
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
,	TokenNameCOMMA	
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
granularity	TokenNameIdentifier	 granularity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
srcDir	TokenNameIdentifier	 src Dir
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns resource information for a file at destination. * @param name relative path of file at destination. * @return data concerning a file whose relative path to destDir is name. * * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 Returns resource information for a file at destination. @param name relative path of file at destination. @return data concerning a file whose relative path to destDir is name. * @since Ant 1.5.2 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
destDir	TokenNameIdentifier	 dest Dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

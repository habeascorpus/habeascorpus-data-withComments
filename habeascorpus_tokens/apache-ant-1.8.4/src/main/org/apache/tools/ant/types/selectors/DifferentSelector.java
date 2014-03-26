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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This selector selects files against a mapped set of target files, selecting * all those files which are different. * Files with different lengths are deemed different * automatically * Files with identical timestamps are viewed as matching by * default, unless you specify otherwise. * Contents are compared if the lengths are the same * and the timestamps are ignored or the same, * except if you decide to ignore contents to gain speed. * <p> * This is a useful selector to work with programs and tasks that don't handle * dependency checking properly; Even if a predecessor task always creates its * output files, followup tasks can be driven off copies made with a different * selector, so their dependencies are driven on the absolute state of the * files, not a timestamp. * <p> * Clearly, however, bulk file comparisons is inefficient; anything that can * use timestamps is to be preferred. If this selector must be used, use it * over as few files as possible, perhaps following it with an &lt;uptodate;&gt * to keep the descendent routines conditional. * */	TokenNameCOMMENT_JAVADOC	 This selector selects files against a mapped set of target files, selecting all those files which are different. Files with different lengths are deemed different automatically Files with identical timestamps are viewed as matching by default, unless you specify otherwise. Contents are compared if the lengths are the same and the timestamps are ignored or the same, except if you decide to ignore contents to gain speed. <p> This is a useful selector to work with programs and tasks that don't handle dependency checking properly; Even if a predecessor task always creates its output files, followup tasks can be driven off copies made with a different selector, so their dependencies are driven on the absolute state of the files, not a timestamp. <p> Clearly, however, bulk file comparisons is inefficient; anything that can use timestamps is to be preferred. If this selector must be used, use it over as few files as possible, perhaps following it with an &lt;uptodate;&gt to keep the descendent routines conditional. 
public	TokenNamepublic	
class	TokenNameclass	
DifferentSelector	TokenNameIdentifier	 Different Selector
extends	TokenNameextends	
MappingSelector	TokenNameIdentifier	 Mapping Selector
{	TokenNameLBRACE	
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
boolean	TokenNameboolean	
ignoreFileTimes	TokenNameIdentifier	 ignore File Times
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreContents	TokenNameIdentifier	 ignore Contents
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * This flag tells the selector to ignore file times in the comparison * @param ignoreFileTimes if true ignore file times */	TokenNameCOMMENT_JAVADOC	 This flag tells the selector to ignore file times in the comparison @param ignoreFileTimes if true ignore file times 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoreFileTimes	TokenNameIdentifier	 set Ignore File Times
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreFileTimes	TokenNameIdentifier	 ignore File Times
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreFileTimes	TokenNameIdentifier	 ignore File Times
=	TokenNameEQUAL	
ignoreFileTimes	TokenNameIdentifier	 ignore File Times
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This flag tells the selector to ignore contents * @param ignoreContents if true ignore contents * @since ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 This flag tells the selector to ignore contents @param ignoreContents if true ignore contents @since ant 1.6.3 
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoreContents	TokenNameIdentifier	 set Ignore Contents
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreContents	TokenNameIdentifier	 ignore Contents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreContents	TokenNameIdentifier	 ignore Contents
=	TokenNameEQUAL	
ignoreContents	TokenNameIdentifier	 ignore Contents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * this test is our selection test that compared the file with the destfile * @param srcfile the source file * @param destfile the destination file * @return true if the files are different */	TokenNameCOMMENT_JAVADOC	 this test is our selection test that compared the file with the destfile @param srcfile the source file @param destfile the destination file @return true if the files are different 
protected	TokenNameprotected	
boolean	TokenNameboolean	
selectionTest	TokenNameIdentifier	 selection Test
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
srcfile	TokenNameIdentifier	 srcfile
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destfile	TokenNameIdentifier	 destfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if either of them is missing, they are different 	TokenNameCOMMENT_LINE	if either of them is missing, they are different 
if	TokenNameif	
(	TokenNameLPAREN	
srcfile	TokenNameIdentifier	 srcfile
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
destfile	TokenNameIdentifier	 destfile
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcfile	TokenNameIdentifier	 srcfile
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
destfile	TokenNameIdentifier	 destfile
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// different size =>different files 	TokenNameCOMMENT_LINE	different size =>different files 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoreFileTimes	TokenNameIdentifier	 ignore File Times
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//same date if dest timestamp is within granularity of the srcfile 	TokenNameCOMMENT_LINE	same date if dest timestamp is within granularity of the srcfile 
boolean	TokenNameboolean	
sameDate	TokenNameIdentifier	 same Date
;	TokenNameSEMICOLON	
sameDate	TokenNameIdentifier	 same Date
=	TokenNameEQUAL	
destfile	TokenNameIdentifier	 destfile
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
srcfile	TokenNameIdentifier	 srcfile
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
granularity	TokenNameIdentifier	 granularity
&&	TokenNameAND_AND	
destfile	TokenNameIdentifier	 destfile
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
srcfile	TokenNameIdentifier	 srcfile
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
granularity	TokenNameIdentifier	 granularity
;	TokenNameSEMICOLON	
// different dates => different files 	TokenNameCOMMENT_LINE	different dates => different files 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sameDate	TokenNameIdentifier	 same Date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoreContents	TokenNameIdentifier	 ignore Contents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//here do a bulk comparison 	TokenNameCOMMENT_LINE	here do a bulk comparison 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
srcfile	TokenNameIdentifier	 srcfile
,	TokenNameCOMMA	
destfile	TokenNameIdentifier	 destfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"while comparing "	TokenNameStringLiteral	while comparing 
+	TokenNamePLUS	
srcfile	TokenNameIdentifier	 srcfile
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
destfile	TokenNameIdentifier	 destfile
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * Compares two files for equality based on size and * content. Timestamps are not at all looked at. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Compares two files for equality based on size and content. Timestamps are not at all looked at. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
FilesMatch	TokenNameIdentifier	 Files Match
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
/** * Helper that provides the file comparison method. */	TokenNameCOMMENT_JAVADOC	 Helper that provides the file comparison method. 
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
/** * files to compare */	TokenNameCOMMENT_JAVADOC	 files to compare 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file1	TokenNameIdentifier	 file1
,	TokenNameCOMMA	
file2	TokenNameIdentifier	 file2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
textfile	TokenNameIdentifier	 textfile
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Sets the File1 attribute * * @param file1 The new File1 value */	TokenNameCOMMENT_JAVADOC	 Sets the File1 attribute * @param file1 The new File1 value 
public	TokenNamepublic	
void	TokenNamevoid	
setFile1	TokenNameIdentifier	 set File1
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file1	TokenNameIdentifier	 file1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file1	TokenNameIdentifier	 file1
=	TokenNameEQUAL	
file1	TokenNameIdentifier	 file1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the File2 attribute * * @param file2 The new File2 value */	TokenNameCOMMENT_JAVADOC	 Sets the File2 attribute * @param file2 The new File2 value 
public	TokenNamepublic	
void	TokenNamevoid	
setFile2	TokenNameIdentifier	 set File2
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file2	TokenNameIdentifier	 file2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file2	TokenNameIdentifier	 file2
=	TokenNameEQUAL	
file2	TokenNameIdentifier	 file2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set whether to ignore line endings when comparing files. * @param textfile whether to ignore line endings. */	TokenNameCOMMENT_JAVADOC	 Set whether to ignore line endings when comparing files. @param textfile whether to ignore line endings. 
public	TokenNamepublic	
void	TokenNamevoid	
setTextfile	TokenNameIdentifier	 set Textfile
(	TokenNameLPAREN	
boolean	TokenNameboolean	
textfile	TokenNameIdentifier	 textfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
textfile	TokenNameIdentifier	 textfile
=	TokenNameEQUAL	
textfile	TokenNameIdentifier	 textfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * comparison method of the interface * * @return true if the files are equal * @exception BuildException if it all went pear-shaped */	TokenNameCOMMENT_JAVADOC	 comparison method of the interface * @return true if the files are equal @exception BuildException if it all went pear-shaped 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
//validate 	TokenNameCOMMENT_LINE	validate 
if	TokenNameif	
(	TokenNameLPAREN	
file1	TokenNameIdentifier	 file1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
file2	TokenNameIdentifier	 file2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"both file1 and file2 are required in "	TokenNameStringLiteral	both file1 and file2 are required in 
+	TokenNamePLUS	
"filesmatch"	TokenNameStringLiteral	filesmatch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//#now match the files 	TokenNameCOMMENT_LINE	#now match the files 
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
contentEquals	TokenNameIdentifier	 content Equals
(	TokenNameLPAREN	
file1	TokenNameIdentifier	 file1
,	TokenNameCOMMA	
file2	TokenNameIdentifier	 file2
,	TokenNameCOMMA	
textfile	TokenNameIdentifier	 textfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"when comparing files: "	TokenNameStringLiteral	when comparing files: 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
matches	TokenNameIdentifier	 matches
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

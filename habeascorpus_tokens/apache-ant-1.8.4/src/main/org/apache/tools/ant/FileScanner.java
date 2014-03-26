/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * An interface used to describe the actions required of any type of * directory scanner. * */	TokenNameCOMMENT_JAVADOC	 An interface used to describe the actions required of any type of directory scanner. 
public	TokenNamepublic	
interface	TokenNameinterface	
FileScanner	TokenNameIdentifier	 File Scanner
{	TokenNameLBRACE	
/** * Adds default exclusions to the current exclusions set. */	TokenNameCOMMENT_JAVADOC	 Adds default exclusions to the current exclusions set. 
void	TokenNamevoid	
addDefaultExcludes	TokenNameIdentifier	 add Default Excludes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the base directory to be scanned. * This is the directory which is scanned recursively. * * @return the base directory to be scanned */	TokenNameCOMMENT_JAVADOC	 Returns the base directory to be scanned. This is the directory which is scanned recursively. * @return the base directory to be scanned 
File	TokenNameIdentifier	 File
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the names of the directories which matched at least one of the * include patterns and at least one of the exclude patterns. * The names are relative to the base directory. * * @return the names of the directories which matched at least one of the * include patterns and at least one of the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the directories which matched at least one of the include patterns and at least one of the exclude patterns. The names are relative to the base directory. * @return the names of the directories which matched at least one of the include patterns and at least one of the exclude patterns. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExcludedDirectories	TokenNameIdentifier	 get Excluded Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the names of the files which matched at least one of the * include patterns and at least one of the exclude patterns. * The names are relative to the base directory. * * @return the names of the files which matched at least one of the * include patterns and at least one of the exclude patterns. * */	TokenNameCOMMENT_JAVADOC	 Returns the names of the files which matched at least one of the include patterns and at least one of the exclude patterns. The names are relative to the base directory. * @return the names of the files which matched at least one of the include patterns and at least one of the exclude patterns. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExcludedFiles	TokenNameIdentifier	 get Excluded Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the names of the directories which matched at least one of the * include patterns and none of the exclude patterns. * The names are relative to the base directory. * * @return the names of the directories which matched at least one of the * include patterns and none of the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the directories which matched at least one of the include patterns and none of the exclude patterns. The names are relative to the base directory. * @return the names of the directories which matched at least one of the include patterns and none of the exclude patterns. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludedDirectories	TokenNameIdentifier	 get Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the names of the files which matched at least one of the * include patterns and none of the exclude patterns. * The names are relative to the base directory. * * @return the names of the files which matched at least one of the * include patterns and none of the exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the files which matched at least one of the include patterns and none of the exclude patterns. The names are relative to the base directory. * @return the names of the files which matched at least one of the include patterns and none of the exclude patterns. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getIncludedFiles	TokenNameIdentifier	 get Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the names of the directories which matched none of the include * patterns. The names are relative to the base directory. * * @return the names of the directories which matched none of the include * patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the directories which matched none of the include patterns. The names are relative to the base directory. * @return the names of the directories which matched none of the include patterns. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNotIncludedDirectories	TokenNameIdentifier	 get Not Included Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the names of the files which matched none of the include * patterns. The names are relative to the base directory. * * @return the names of the files which matched none of the include * patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the names of the files which matched none of the include patterns. The names are relative to the base directory. * @return the names of the files which matched none of the include patterns. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNotIncludedFiles	TokenNameIdentifier	 get Not Included Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Scans the base directory for files which match at least one include * pattern and don't match any exclude patterns. * * @exception IllegalStateException if the base directory was set * incorrectly (i.e. if it is <code>null</code>, doesn't exist, * or isn't a directory). */	TokenNameCOMMENT_JAVADOC	 Scans the base directory for files which match at least one include pattern and don't match any exclude patterns. * @exception IllegalStateException if the base directory was set incorrectly (i.e. if it is <code>null</code>, doesn't exist, or isn't a directory). 
void	TokenNamevoid	
scan	TokenNameIdentifier	 scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
;	TokenNameSEMICOLON	
/** * Sets the base directory to be scanned. This is the directory which is * scanned recursively. All '/' and '\' characters should be replaced by * <code>File.separatorChar</code>, so the separator used need not match * <code>File.separatorChar</code>. * * @param basedir The base directory to scan. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the base directory to be scanned. This is the directory which is scanned recursively. All '/' and '\' characters should be replaced by <code>File.separatorChar</code>, so the separator used need not match <code>File.separatorChar</code>. * @param basedir The base directory to scan. Must not be <code>null</code>. 
void	TokenNamevoid	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the base directory to be scanned. This is the directory which is * scanned recursively. * * @param basedir The base directory for scanning. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the base directory to be scanned. This is the directory which is scanned recursively. * @param basedir The base directory for scanning. Should not be <code>null</code>. 
void	TokenNamevoid	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the list of exclude patterns to use. * * @param excludes A list of exclude patterns. * May be <code>null</code>, indicating that no files * should be excluded. If a non-<code>null</code> list is * given, all elements must be non-<code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the list of exclude patterns to use. * @param excludes A list of exclude patterns. May be <code>null</code>, indicating that no files should be excluded. If a non-<code>null</code> list is given, all elements must be non-<code>null</code>. 
void	TokenNamevoid	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excludes	TokenNameIdentifier	 excludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the list of include patterns to use. * * @param includes A list of include patterns. * May be <code>null</code>, indicating that all files * should be included. If a non-<code>null</code> * list is given, all elements must be * non-<code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the list of include patterns to use. * @param includes A list of include patterns. May be <code>null</code>, indicating that all files should be included. If a non-<code>null</code> list is given, all elements must be non-<code>null</code>. 
void	TokenNamevoid	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
includes	TokenNameIdentifier	 includes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets whether or not the file system should be regarded as case sensitive. * * @param isCaseSensitive whether or not the file system should be * regarded as a case sensitive one */	TokenNameCOMMENT_JAVADOC	 Sets whether or not the file system should be regarded as case sensitive. * @param isCaseSensitive whether or not the file system should be regarded as a case sensitive one 
void	TokenNamevoid	
setCaseSensitive	TokenNameIdentifier	 set Case Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isCaseSensitive	TokenNameIdentifier	 is Case Sensitive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

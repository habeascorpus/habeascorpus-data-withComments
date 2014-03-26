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
/** * An interface used to describe the actions required by any type of * directory scanner that supports Selecters. * * @since 1.5 */	TokenNameCOMMENT_JAVADOC	 An interface used to describe the actions required by any type of directory scanner that supports Selecters. * @since 1.5 
public	TokenNamepublic	
interface	TokenNameinterface	
SelectorScanner	TokenNameIdentifier	 Selector Scanner
{	TokenNameLBRACE	
/** * Sets the selectors the scanner should use. * * @param selectors the list of selectors */	TokenNameCOMMENT_JAVADOC	 Sets the selectors the scanner should use. * @param selectors the list of selectors 
void	TokenNamevoid	
setSelectors	TokenNameIdentifier	 set Selectors
(	TokenNameLPAREN	
FileSelector	TokenNameIdentifier	 File Selector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
selectors	TokenNameIdentifier	 selectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Directories which were selected out of a scan. * * @return list of directories not selected */	TokenNameCOMMENT_JAVADOC	 Directories which were selected out of a scan. * @return list of directories not selected 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDeselectedDirectories	TokenNameIdentifier	 get Deselected Directories
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Files which were selected out of a scan. * * @return list of files not selected */	TokenNameCOMMENT_JAVADOC	 Files which were selected out of a scan. * @return list of files not selected 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDeselectedFiles	TokenNameIdentifier	 get Deselected Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

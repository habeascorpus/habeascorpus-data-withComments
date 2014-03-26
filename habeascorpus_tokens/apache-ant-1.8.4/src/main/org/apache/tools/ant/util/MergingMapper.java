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
/** * Implementation of FileNameMapper that always returns the same * target file name. * * <p>This is the default FileNameMapper for the archiving tasks and * uptodate.</p> * */	TokenNameCOMMENT_JAVADOC	 Implementation of FileNameMapper that always returns the same target file name. * <p>This is the default FileNameMapper for the archiving tasks and uptodate.</p> 
public	TokenNamepublic	
class	TokenNameclass	
MergingMapper	TokenNameIdentifier	 Merging Mapper
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mergedFile	TokenNameIdentifier	 merged File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
public	TokenNamepublic	
MergingMapper	TokenNameIdentifier	 Merging Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.8.0 
public	TokenNamepublic	
MergingMapper	TokenNameIdentifier	 Merging Mapper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ignored. * @param from ignored. */	TokenNameCOMMENT_JAVADOC	 Ignored. @param from ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the name of the merged file. * @param to the name of the merged file. */	TokenNameCOMMENT_JAVADOC	 Sets the name of the merged file. @param to the name of the merged file. 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedFile	TokenNameIdentifier	 merged File
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
to	TokenNameIdentifier	 to
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an one-element array containing the file name set via setTo. * @param sourceFileName ignored. * @return a one-element array containing the merged filename. */	TokenNameCOMMENT_JAVADOC	 Returns an one-element array containing the file name set via setTo. @param sourceFileName ignored. @return a one-element array containing the merged filename. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mergedFile	TokenNameIdentifier	 merged File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

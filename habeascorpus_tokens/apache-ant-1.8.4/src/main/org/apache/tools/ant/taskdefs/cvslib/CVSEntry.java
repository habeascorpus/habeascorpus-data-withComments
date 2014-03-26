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
cvslib	TokenNameIdentifier	 cvslib
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * CVS Entry. * */	TokenNameCOMMENT_JAVADOC	 CVS Entry. 
public	TokenNamepublic	
class	TokenNameclass	
CVSEntry	TokenNameIdentifier	 CVS Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new instance of a CVSEntry * @param date the date * @param author the author * @param comment a comment to be added to the revision */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of a CVSEntry @param date the date @param author the author @param comment a comment to be added to the revision 
public	TokenNamepublic	
CVSEntry	TokenNameIdentifier	 CVS Entry
(	TokenNameLPAREN	
final	TokenNamefinal	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
author	TokenNameIdentifier	 author
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
author	TokenNameIdentifier	 author
=	TokenNameEQUAL	
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a file to the CVSEntry * @param file the file to add * @param revision the revision */	TokenNameCOMMENT_JAVADOC	 Adds a file to the CVSEntry @param file the file to add @param revision the revision 
public	TokenNamepublic	
void	TokenNamevoid	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
RCSFile	TokenNameIdentifier	 RCS File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
revision	TokenNameIdentifier	 revision
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a file to the CVSEntry * @param file the file to add * @param revision the revision * @param previousRevision the previous revision */	TokenNameCOMMENT_JAVADOC	 Adds a file to the CVSEntry @param file the file to add @param revision the revision @param previousRevision the previous revision 
public	TokenNamepublic	
void	TokenNamevoid	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
previousRevision	TokenNameIdentifier	 previous Revision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
RCSFile	TokenNameIdentifier	 RCS File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
revision	TokenNameIdentifier	 revision
,	TokenNameCOMMA	
previousRevision	TokenNameIdentifier	 previous Revision
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the date of the CVSEntry * @return the date */	TokenNameCOMMENT_JAVADOC	 Gets the date of the CVSEntry @return the date 
public	TokenNamepublic	
Date	TokenNameIdentifier	 Date
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the author of the CVSEntry * @param author the author */	TokenNameCOMMENT_JAVADOC	 Sets the author of the CVSEntry @param author the author 
public	TokenNamepublic	
void	TokenNamevoid	
setAuthor	TokenNameIdentifier	 set Author
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
author	TokenNameIdentifier	 author
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
author	TokenNameIdentifier	 author
=	TokenNameEQUAL	
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the author of the CVSEntry * @return the author */	TokenNameCOMMENT_JAVADOC	 Gets the author of the CVSEntry @return the author 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the comment for the CVSEntry * @return the comment */	TokenNameCOMMENT_JAVADOC	 Gets the comment for the CVSEntry @return the comment 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the files in this CVSEntry * @return the files */	TokenNameCOMMENT_JAVADOC	 Gets the files in this CVSEntry @return the files 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a String containing author, date, files and comment * @return a string representation of this CVSEntry */	TokenNameCOMMENT_JAVADOC	 Gets a String containing author, date, files and comment @return a string representation of this CVSEntry 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

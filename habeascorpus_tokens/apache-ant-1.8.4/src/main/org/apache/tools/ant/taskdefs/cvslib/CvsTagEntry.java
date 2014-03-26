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
/** * Holds the information of a line of rdiff */	TokenNameCOMMENT_JAVADOC	 Holds the information of a line of rdiff 
public	TokenNamepublic	
class	TokenNameclass	
CvsTagEntry	TokenNameIdentifier	 Cvs Tag Entry
{	TokenNameLBRACE	
/** the filename */	TokenNameCOMMENT_JAVADOC	 the filename 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
/** the previous revision */	TokenNameCOMMENT_JAVADOC	 the previous revision 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prevRevision	TokenNameIdentifier	 prev Revision
;	TokenNameSEMICOLON	
/** the revision */	TokenNameCOMMENT_JAVADOC	 the revision 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
/** * Creates a new CvsTagEntry * @param filename the filename to add */	TokenNameCOMMENT_JAVADOC	 Creates a new CvsTagEntry @param filename the filename to add 
public	TokenNamepublic	
CvsTagEntry	TokenNameIdentifier	 Cvs Tag Entry
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new CvsTagEntry * @param filename the filename to add * @param revision the revision */	TokenNameCOMMENT_JAVADOC	 Creates a new CvsTagEntry @param filename the filename to add @param revision the revision 
public	TokenNamepublic	
CvsTagEntry	TokenNameIdentifier	 Cvs Tag Entry
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
revision	TokenNameIdentifier	 revision
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new CvsTagEntry * @param filename the filename to add * @param revision the revision * @param prevRevision the previous revision */	TokenNameCOMMENT_JAVADOC	 Creates a new CvsTagEntry @param filename the filename to add @param revision the revision @param prevRevision the previous revision 
public	TokenNamepublic	
CvsTagEntry	TokenNameIdentifier	 Cvs Tag Entry
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prevRevision	TokenNameIdentifier	 prev Revision
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
revision	TokenNameIdentifier	 revision
=	TokenNameEQUAL	
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevRevision	TokenNameIdentifier	 prev Revision
=	TokenNameEQUAL	
prevRevision	TokenNameIdentifier	 prev Revision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the filename for this CvsTagEntry * @return the filename */	TokenNameCOMMENT_JAVADOC	 Gets the filename for this CvsTagEntry @return the filename 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the revision for this CvsTagEntry * @return the revision */	TokenNameCOMMENT_JAVADOC	 Gets the revision for this CvsTagEntry @return the revision 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRevision	TokenNameIdentifier	 get Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the previous revision for this CvsTagEntry * @return the previous revision */	TokenNameCOMMENT_JAVADOC	 Gets the previous revision for this CvsTagEntry @return the previous revision 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPreviousRevision	TokenNameIdentifier	 get Previous Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prevRevision	TokenNameIdentifier	 prev Revision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a String containing filename and difference from previous version * @return a string representation of this CVSTagEntry */	TokenNameCOMMENT_JAVADOC	 Gets a String containing filename and difference from previous version @return a string representation of this CVSTagEntry 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
revision	TokenNameIdentifier	 revision
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" was removed"	TokenNameStringLiteral	 was removed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevRevision	TokenNameIdentifier	 prev Revision
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; previous revision was "	TokenNameStringLiteral	; previous revision was 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prevRevision	TokenNameIdentifier	 prev Revision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prevRevision	TokenNameIdentifier	 prev Revision
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" is new; current revision is "	TokenNameStringLiteral	 is new; current revision is 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
revision	TokenNameIdentifier	 revision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" has changed from "	TokenNameStringLiteral	 has changed from 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prevRevision	TokenNameIdentifier	 prev Revision
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" to "	TokenNameStringLiteral	 to 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
revision	TokenNameIdentifier	 revision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

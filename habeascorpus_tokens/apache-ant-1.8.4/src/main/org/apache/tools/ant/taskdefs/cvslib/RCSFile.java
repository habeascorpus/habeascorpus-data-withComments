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
/** * Represents a RCS File change. * */	TokenNameCOMMENT_JAVADOC	 Represents a RCS File change. 
class	TokenNameclass	
RCSFile	TokenNameIdentifier	 RCS File
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
previousRevision	TokenNameIdentifier	 previous Revision
;	TokenNameSEMICOLON	
RCSFile	TokenNameIdentifier	 RCS File
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
rev	TokenNameIdentifier	 rev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
rev	TokenNameIdentifier	 rev
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RCSFile	TokenNameIdentifier	 RCS File
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
revision	TokenNameIdentifier	 revision
=	TokenNameEQUAL	
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
revision	TokenNameIdentifier	 revision
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
previousRevision	TokenNameIdentifier	 previous Revision
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
previousRevision	TokenNameIdentifier	 previous Revision
=	TokenNameEQUAL	
previousRevision	TokenNameIdentifier	 previous Revision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the name of the RCSFile * @return name of the file */	TokenNameCOMMENT_JAVADOC	 Gets the name of the RCSFile @return name of the file 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the revision number of the RCSFile * @return the revision number (as String) */	TokenNameCOMMENT_JAVADOC	 Gets the revision number of the RCSFile @return the revision number (as String) 
String	TokenNameIdentifier	 String
getRevision	TokenNameIdentifier	 get Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the previous revision of the RCSFile * @return the previous revision number (as String) */	TokenNameCOMMENT_JAVADOC	 Gets the previous revision of the RCSFile @return the previous revision number (as String) 
String	TokenNameIdentifier	 String
getPreviousRevision	TokenNameIdentifier	 get Previous Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
previousRevision	TokenNameIdentifier	 previous Revision
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

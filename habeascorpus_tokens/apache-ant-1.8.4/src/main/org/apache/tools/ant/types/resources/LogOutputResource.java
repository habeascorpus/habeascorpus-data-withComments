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
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
ProjectComponent	TokenNameIdentifier	 Project Component
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
LogOutputStream	TokenNameIdentifier	 Log Output Stream
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
/** * Output-only Resource that always appends to Ant's log. * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Output-only Resource that always appends to Ant's log. @since Ant 1.8 
public	TokenNamepublic	
class	TokenNameclass	
LogOutputResource	TokenNameIdentifier	 Log Output Resource
extends	TokenNameextends	
Resource	TokenNameIdentifier	 Resource
implements	TokenNameimplements	
Appendable	TokenNameIdentifier	 Appendable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAME	TokenNameIdentifier	 NAME
=	TokenNameEQUAL	
"[Ant log]"	TokenNameStringLiteral	[Ant log]
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
outputStream	TokenNameIdentifier	 output Stream
;	TokenNameSEMICOLON	
/** * Create a new LogOutputResource. * @param managingComponent */	TokenNameCOMMENT_JAVADOC	 Create a new LogOutputResource. @param managingComponent 
public	TokenNamepublic	
LogOutputResource	TokenNameIdentifier	 Log Output Resource
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
managingComponent	TokenNameIdentifier	 managing Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputStream	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
managingComponent	TokenNameIdentifier	 managing Component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new LogOutputResource. * @param managingComponent owning log content * @param level log level */	TokenNameCOMMENT_JAVADOC	 Create a new LogOutputResource. @param managingComponent owning log content @param level log level 
public	TokenNamepublic	
LogOutputResource	TokenNameIdentifier	 Log Output Resource
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
managingComponent	TokenNameIdentifier	 managing Component
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
NAME	TokenNameIdentifier	 NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputStream	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
managingComponent	TokenNameIdentifier	 managing Component
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getAppendOutputStream	TokenNameIdentifier	 get Append Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
outputStream	TokenNameIdentifier	 output Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
OutputStream	TokenNameIdentifier	 Output Stream
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
outputStream	TokenNameIdentifier	 output Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

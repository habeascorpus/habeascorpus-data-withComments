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
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
;	TokenNameSEMICOLON	
/** * Type file/dir ResourceSelector. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Type file/dir ResourceSelector. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Type	TokenNameIdentifier	 Type
implements	TokenNameimplements	
ResourceSelector	TokenNameIdentifier	 Resource Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILE_ATTR	TokenNameIdentifier	 FILE  ATTR
=	TokenNameEQUAL	
"file"	TokenNameStringLiteral	file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DIR_ATTR	TokenNameIdentifier	 DIR  ATTR
=	TokenNameEQUAL	
"dir"	TokenNameStringLiteral	dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ANY_ATTR	TokenNameIdentifier	 ANY  ATTR
=	TokenNameEQUAL	
"any"	TokenNameStringLiteral	any
;	TokenNameSEMICOLON	
/** Static file type selector. */	TokenNameCOMMENT_JAVADOC	 Static file type selector. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
FILE	TokenNameIdentifier	 FILE
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
new	TokenNamenew	
FileDir	TokenNameIdentifier	 File Dir
(	TokenNameLPAREN	
FILE_ATTR	TokenNameIdentifier	 FILE  ATTR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Static dir type selector. */	TokenNameCOMMENT_JAVADOC	 Static dir type selector. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
DIR	TokenNameIdentifier	 DIR
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
new	TokenNamenew	
FileDir	TokenNameIdentifier	 File Dir
(	TokenNameLPAREN	
DIR_ATTR	TokenNameIdentifier	 DIR  ATTR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Static any type selector. Since Ant 1.8. */	TokenNameCOMMENT_JAVADOC	 Static any type selector. Since Ant 1.8. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
ANY	TokenNameIdentifier	 ANY
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
new	TokenNamenew	
FileDir	TokenNameIdentifier	 File Dir
(	TokenNameLPAREN	
ANY_ATTR	TokenNameIdentifier	 ANY  ATTR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Implements the type attribute. */	TokenNameCOMMENT_JAVADOC	 Implements the type attribute. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
FileDir	TokenNameIdentifier	 File Dir
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALUES	TokenNameIdentifier	 VALUES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
FILE_ATTR	TokenNameIdentifier	 FILE  ATTR
,	TokenNameCOMMA	
DIR_ATTR	TokenNameIdentifier	 DIR  ATTR
,	TokenNameCOMMA	
ANY_ATTR	TokenNameIdentifier	 ANY  ATTR
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
FileDir	TokenNameIdentifier	 File Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Convenience constructor. * @param value the String EnumeratedAttribute value. */	TokenNameCOMMENT_JAVADOC	 Convenience constructor. @param value the String EnumeratedAttribute value. 
public	TokenNamepublic	
FileDir	TokenNameIdentifier	 File Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the possible values. * @return a String array. */	TokenNameCOMMENT_JAVADOC	 Return the possible values. @return a String array. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALUES	TokenNameIdentifier	 VALUES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
FileDir	TokenNameIdentifier	 File Dir
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Convenience constructor. * @param fd the FileDir type. */	TokenNameCOMMENT_JAVADOC	 Convenience constructor. @param fd the FileDir type. 
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
FileDir	TokenNameIdentifier	 File Dir
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set type; file|dir. * @param fd a FileDir object. */	TokenNameCOMMENT_JAVADOC	 Set type; file|dir. @param fd a FileDir object. 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
FileDir	TokenNameIdentifier	 File Dir
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if this Resource is selected. * @param r the Resource to check. * @return whether the Resource was selected. */	TokenNameCOMMENT_JAVADOC	 Return true if this Resource is selected. @param r the Resource to check. @return whether the Resource was selected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The type attribute is required."	TokenNameStringLiteral	The type attribute is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

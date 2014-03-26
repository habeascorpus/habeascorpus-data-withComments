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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
windows	TokenNameIdentifier	 windows
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
ExecuteOn	TokenNameIdentifier	 Execute On
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
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Attrib equivalent for Win32 environments. * Note: Attrib parameters /S and /D are not handled. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Attrib equivalent for Win32 environments. Note: Attrib parameters /S and /D are not handled. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
Attrib	TokenNameIdentifier	 Attrib
extends	TokenNameextends	
ExecuteOn	TokenNameIdentifier	 Execute On
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTR_READONLY	TokenNameIdentifier	 ATTR  READONLY
=	TokenNameEQUAL	
"R"	TokenNameStringLiteral	R
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTR_ARCHIVE	TokenNameIdentifier	 ATTR  ARCHIVE
=	TokenNameEQUAL	
"A"	TokenNameStringLiteral	A
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTR_SYSTEM	TokenNameIdentifier	 ATTR  SYSTEM
=	TokenNameEQUAL	
"S"	TokenNameStringLiteral	S
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTR_HIDDEN	TokenNameIdentifier	 ATTR  HIDDEN
=	TokenNameEQUAL	
"H"	TokenNameStringLiteral	H
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SET	TokenNameIdentifier	 SET
=	TokenNameEQUAL	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNSET	TokenNameIdentifier	 UNSET
=	TokenNameEQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveAttr	TokenNameIdentifier	 have Attr
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Constructor for Attrib. */	TokenNameCOMMENT_JAVADOC	 Constructor for Attrib. 
public	TokenNamepublic	
Attrib	TokenNameIdentifier	 Attrib
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
"attrib"	TokenNameStringLiteral	attrib
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setParallel	TokenNameIdentifier	 set Parallel
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A file to be attribed. * @param src a file */	TokenNameCOMMENT_JAVADOC	 A file to be attribed. @param src a file 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileSet	TokenNameIdentifier	 File Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the ReadOnly file attribute. * @param value a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Set the ReadOnly file attribute. @param value a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ATTR_READONLY	TokenNameIdentifier	 ATTR  READONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Archive file attribute. * @param value a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Set the Archive file attribute. @param value a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setArchive	TokenNameIdentifier	 set Archive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ATTR_ARCHIVE	TokenNameIdentifier	 ATTR  ARCHIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the System file attribute. * @param value a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Set the System file attribute. @param value a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setSystem	TokenNameIdentifier	 set System
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ATTR_SYSTEM	TokenNameIdentifier	 ATTR  SYSTEM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the Hidden file attribute. * @param value a <code>boolean</code> value */	TokenNameCOMMENT_JAVADOC	 Set the Hidden file attribute. @param value a <code>boolean</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
setHidden	TokenNameIdentifier	 set Hidden
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ATTR_HIDDEN	TokenNameIdentifier	 ATTR  HIDDEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check the attributes. */	TokenNameCOMMENT_JAVADOC	 Check the attributes. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
haveAttr	TokenNameIdentifier	 have Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing attribute parameter"	TokenNameStringLiteral	Missing attribute parameter
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
checkConfiguration	TokenNameIdentifier	 check Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the executable. * This is not allowed, and it always throws a BuildException. * @param e ignored * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set the executable. This is not allowed, and it always throws a BuildException. @param e ignored @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setExecutable	TokenNameIdentifier	 set Executable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the executable attribute"	TokenNameStringLiteral	 doesn't support the executable attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the executable. * This is not allowed, and it always throws a BuildException. * @param e ignored * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set the executable. This is not allowed, and it always throws a BuildException. @param e ignored @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setCommand	TokenNameIdentifier	 set Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the command attribute"	TokenNameStringLiteral	 doesn't support the command attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add source file. * This is not allowed, and it always throws a BuildException. * @param b ignored * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Add source file. This is not allowed, and it always throws a BuildException. @param b ignored @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setAddsourcefile	TokenNameIdentifier	 set Addsourcefile
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the addsourcefile attribute"	TokenNameStringLiteral	 doesn't support the addsourcefile attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set skip empty file sets. * This is not allowed, and it always throws a BuildException. * @param skip ignored * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set skip empty file sets. This is not allowed, and it always throws a BuildException. @param skip ignored @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setSkipEmptyFilesets	TokenNameIdentifier	 set Skip Empty Filesets
(	TokenNameLPAREN	
boolean	TokenNameboolean	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the "	TokenNameStringLiteral	 doesn't support the 
+	TokenNamePLUS	
"skipemptyfileset attribute"	TokenNameStringLiteral	skipemptyfileset attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set parallel. * This is not allowed, and it always throws a BuildException. * @param parallel ignored * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set parallel. This is not allowed, and it always throws a BuildException. @param parallel ignored @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setParallel	TokenNameIdentifier	 set Parallel
(	TokenNameLPAREN	
boolean	TokenNameboolean	
parallel	TokenNameIdentifier	 parallel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the parallel attribute"	TokenNameStringLiteral	 doesn't support the parallel attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set max parallel. * This is not allowed, and it always throws a BuildException. * @param max ignored * @ant.attribute ignore="true" */	TokenNameCOMMENT_JAVADOC	 Set max parallel. This is not allowed, and it always throws a BuildException. @param max ignored @ant.attribute ignore="true" 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxParallel	TokenNameIdentifier	 set Max Parallel
(	TokenNameLPAREN	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
getTaskType	TokenNameIdentifier	 get Task Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't support the maxparallel attribute"	TokenNameStringLiteral	 doesn't support the maxparallel attribute
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if the os is valid. * Defauls is to allow windows * @return true if the os is valid. */	TokenNameCOMMENT_JAVADOC	 Check if the os is valid. Defauls is to allow windows @return true if the os is valid. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOs	TokenNameIdentifier	 get Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getOsFamily	TokenNameIdentifier	 get Os Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
FAMILY_WINDOWS	TokenNameIdentifier	 FAMILY  WINDOWS
)	TokenNameRPAREN	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
isValidOs	TokenNameIdentifier	 is Valid Os
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSignString	TokenNameIdentifier	 get Sign String
(	TokenNameLPAREN	
boolean	TokenNameboolean	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
?	TokenNameQUESTION	
SET	TokenNameIdentifier	 SET
:	TokenNameCOLON	
UNSET	TokenNameIdentifier	 UNSET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addArg	TokenNameIdentifier	 add Arg
(	TokenNameLPAREN	
boolean	TokenNameboolean	
sign	TokenNameIdentifier	 sign
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createArg	TokenNameIdentifier	 create Arg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getSignString	TokenNameIdentifier	 get Sign String
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
+	TokenNamePLUS	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveAttr	TokenNameIdentifier	 have Attr
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveAttr	TokenNameIdentifier	 have Attr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
haveAttr	TokenNameIdentifier	 have Attr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

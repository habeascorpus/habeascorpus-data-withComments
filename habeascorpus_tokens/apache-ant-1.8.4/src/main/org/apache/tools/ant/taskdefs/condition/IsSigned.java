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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
Project	TokenNameIdentifier	 Project
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
ManifestTask	TokenNameIdentifier	 Manifest Task
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
DataType	TokenNameIdentifier	 Data Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
;	TokenNameSEMICOLON	
/** * Checks whether a jarfile is signed: if the name of the * signature is passed, the file is checked for presence of that * particular signature; otherwise the file is checked for the * existence of any signature. */	TokenNameCOMMENT_JAVADOC	 Checks whether a jarfile is signed: if the name of the signature is passed, the file is checked for presence of that particular signature; otherwise the file is checked for the existence of any signature. 
public	TokenNamepublic	
class	TokenNameclass	
IsSigned	TokenNameIdentifier	 Is Signed
extends	TokenNameextends	
DataType	TokenNameIdentifier	 Data Type
implements	TokenNameimplements	
Condition	TokenNameIdentifier	 Condition
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SIG_START	TokenNameIdentifier	 SIG  START
=	TokenNameEQUAL	
"META-INF/"	TokenNameStringLiteral	META-INF/
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SIG_END	TokenNameIdentifier	 SIG  END
=	TokenNameEQUAL	
".SF"	TokenNameStringLiteral	.SF
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SHORT_SIG_LIMIT	TokenNameIdentifier	 SHORT  SIG  LIMIT
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
/** * The jarfile that is to be tested for the presence * of a signature. * @param file jarfile to be tested. */	TokenNameCOMMENT_JAVADOC	 The jarfile that is to be tested for the presence of a signature. @param file jarfile to be tested. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The signature name to check jarfile for. * @param name signature to look for. */	TokenNameCOMMENT_JAVADOC	 The signature name to check jarfile for. @param name signature to look for. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if the file exists and is signed with * the signature specified, or, if <code>name</code> wasn't * specified, if the file contains a signature. * @param zipFile the zipfile to check * @param name the signature to check (may be killed) * @return true if the file is signed. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the file exists and is signed with the signature specified, or, if <code>name</code> wasn't specified, if the file contains a signature. @param zipFile the zipfile to check @param name the signature to check (may be killed) @return true if the file is signed. @throws IOException on error 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
zipFile	TokenNameIdentifier	 zip File
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
zipFile	TokenNameIdentifier	 zip File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
getEntries	TokenNameIdentifier	 get Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
eName	TokenNameIdentifier	 e Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eName	TokenNameIdentifier	 e Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
SIG_START	TokenNameIdentifier	 SIG  START
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
eName	TokenNameIdentifier	 e Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
SIG_END	TokenNameIdentifier	 SIG  END
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
replaceInvalidChars	TokenNameIdentifier	 replace Invalid Chars
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shortSig	TokenNameIdentifier	 short Sig
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
SIG_START	TokenNameIdentifier	 SIG  START
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
SIG_END	TokenNameIdentifier	 SIG  END
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
longSig	TokenNameIdentifier	 long Sig
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
SHORT_SIG_LIMIT	TokenNameIdentifier	 SHORT  SIG  LIMIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longSig	TokenNameIdentifier	 long Sig
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
SIG_START	TokenNameIdentifier	 SIG  START
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
SHORT_SIG_LIMIT	TokenNameIdentifier	 SHORT  SIG  LIMIT
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
SIG_END	TokenNameIdentifier	 SIG  END
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
shortSig	TokenNameIdentifier	 short Sig
||	TokenNameOR_OR	
longSig	TokenNameIdentifier	 long Sig
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
jarFile	TokenNameIdentifier	 jar File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns <code>true</code> if the file exists and is signed with * the signature specified, or, if <code>name</code> wasn't * specified, if the file contains a signature. * @return true if the file is signed. */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> if the file exists and is signed with the signature specified, or, if <code>name</code> wasn't specified, if the file contains a signature. @return true if the file is signed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"The file attribute must be set."	TokenNameStringLiteral	The file attribute must be set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"The file ""	TokenNameStringLiteral	The file "
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" does not exist."	TokenNameStringLiteral	" does not exist.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
isSigned	TokenNameIdentifier	 is Signed
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"Got IOException reading file ""	TokenNameStringLiteral	Got IOException reading file "
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"File ""	TokenNameStringLiteral	File "
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"" is signed."	TokenNameStringLiteral	" is signed.
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_VERBOSE	TokenNameIdentifier	 MSG  VERBOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replaceInvalidChars	TokenNameIdentifier	 replace Invalid Chars
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
changes	TokenNameIdentifier	 changes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ManifestTask	TokenNameIdentifier	 Manifest Task
.	TokenNameDOT	
VALID_ATTRIBUTE_CHARS	TokenNameIdentifier	 VALID  ATTRIBUTE  CHARS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"_"	TokenNameStringLiteral	_
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
changes	TokenNameIdentifier	 changes
?	TokenNameQUESTION	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

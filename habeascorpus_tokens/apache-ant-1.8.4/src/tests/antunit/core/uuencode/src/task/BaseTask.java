/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
task	TokenNameIdentifier	 task
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
Task	TokenNameIdentifier	 Task
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Base class for the uuencode/decode test tasks. */	TokenNameCOMMENT_JAVADOC	 Base class for the uuencode/decode test tasks. 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
BaseTask	TokenNameIdentifier	 Base Task
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
inFile	TokenNameIdentifier	 in File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
outFile	TokenNameIdentifier	 out File
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setInFile	TokenNameIdentifier	 set In File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
inFile	TokenNameIdentifier	 in File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inFile	TokenNameIdentifier	 in File
=	TokenNameEQUAL	
inFile	TokenNameIdentifier	 in File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
getInFile	TokenNameIdentifier	 get In File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inFile	TokenNameIdentifier	 in File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutFile	TokenNameIdentifier	 set Out File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
outFile	TokenNameIdentifier	 out File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outFile	TokenNameIdentifier	 out File
=	TokenNameEQUAL	
outFile	TokenNameIdentifier	 out File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
getOutFile	TokenNameIdentifier	 get Out File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outFile	TokenNameIdentifier	 out File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertAttribute	TokenNameIdentifier	 assert Attribute
(	TokenNameLPAREN	
inFile	TokenNameIdentifier	 in File
,	TokenNameCOMMA	
"inFile"	TokenNameStringLiteral	inFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttribute	TokenNameIdentifier	 assert Attribute
(	TokenNameLPAREN	
outFile	TokenNameIdentifier	 out File
,	TokenNameCOMMA	
"outFile"	TokenNameStringLiteral	outFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
inputStream	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
OutputStream	TokenNameIdentifier	 Output Stream
outputStream	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
inputStream	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
getInFile	TokenNameIdentifier	 get In File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputStream	TokenNameIdentifier	 output Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
getOutFile	TokenNameIdentifier	 get Out File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doit	TokenNameIdentifier	 doit
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
outputStream	TokenNameIdentifier	 output Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
outputStream	TokenNameIdentifier	 output Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
abstract	TokenNameabstract	
protected	TokenNameprotected	
void	TokenNamevoid	
doit	TokenNameIdentifier	 doit
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
assertAttribute	TokenNameIdentifier	 assert Attribute
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
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
"Required attribute "	TokenNameStringLiteral	Required attribute 
+	TokenNamePLUS	
attributeName	TokenNameIdentifier	 attribute Name
+	TokenNamePLUS	
" not set"	TokenNameStringLiteral	 not set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

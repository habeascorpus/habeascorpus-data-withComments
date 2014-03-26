package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Build	TokenNameIdentifier	 Build
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Reporting	TokenNameIdentifier	 Reporting
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
PathTranslator	TokenNameIdentifier	 Path Translator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultPathTranslator	TokenNameIdentifier	 Default Path Translator
implements	TokenNameimplements	
PathTranslator	TokenNameIdentifier	 Path Translator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
BASEDIR_EXPRESSIONS	TokenNameIdentifier	 BASEDIR  EXPRESSIONS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"${basedir}"	TokenNameStringLiteral	${basedir}
,	TokenNameCOMMA	
"${pom.basedir}"	TokenNameStringLiteral	${pom.basedir}
,	TokenNameCOMMA	
"${project.basedir}"	TokenNameStringLiteral	${project.basedir}
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setSourceDirectory	TokenNameIdentifier	 set Source Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getSourceDirectory	TokenNameIdentifier	 get Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setTestSourceDirectory	TokenNameIdentifier	 set Test Source Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestSourceDirectory	TokenNameIdentifier	 get Test Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestResources	TokenNameIdentifier	 get Test Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setFilters	TokenNameIdentifier	 set Filters
(	TokenNameLPAREN	
filters	TokenNameIdentifier	 filters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setOutputDirectory	TokenNameIdentifier	 set Output Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getOutputDirectory	TokenNameIdentifier	 get Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setTestOutputDirectory	TokenNameIdentifier	 set Test Output Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestOutputDirectory	TokenNameIdentifier	 get Test Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Reporting	TokenNameIdentifier	 Reporting
reporting	TokenNameIdentifier	 reporting
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getReporting	TokenNameIdentifier	 get Reporting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
setOutputDirectory	TokenNameIdentifier	 set Output Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
getOutputDirectory	TokenNameIdentifier	 get Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stripBasedirToken	TokenNameIdentifier	 strip Basedir Token
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// path was already absolute, just normalize file separator and we're done 	TokenNameCOMMENT_LINE	path was already absolute, just normalize file separator and we're done 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// drive-relative Windows path, don't align with project directory but with drive root 	TokenNameCOMMENT_LINE	drive-relative Windows path, don't align with project directory but with drive root 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// an ordinary relative path, align with project directory 	TokenNameCOMMENT_LINE	an ordinary relative path, align with project directory 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stripBasedirToken	TokenNameIdentifier	 strip Basedir Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
basedirExpr	TokenNameIdentifier	 basedir Expr
=	TokenNameEQUAL	
null	TokenNamenull	
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
BASEDIR_EXPRESSIONS	TokenNameIdentifier	 BASEDIR  EXPRESSIONS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
basedirExpr	TokenNameIdentifier	 basedir Expr
=	TokenNameEQUAL	
BASEDIR_EXPRESSIONS	TokenNameIdentifier	 BASEDIR  EXPRESSIONS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
basedirExpr	TokenNameIdentifier	 basedir Expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
basedirExpr	TokenNameIdentifier	 basedir Expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
basedirExpr	TokenNameIdentifier	 basedir Expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
basedirExpr	TokenNameIdentifier	 basedir Expr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Take out basedir expression and the leading slash 	TokenNameCOMMENT_LINE	Take out basedir expression and the leading slash 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
chopLeadingFileSeparator	TokenNameIdentifier	 chop Leading File Separator
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
basedirExpr	TokenNameIdentifier	 basedir Expr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the leading directory separator from the specified filesystem path (if any). For platform-independent * behavior, this method accepts both the forward slash and the backward slash as separator. * * @param path The filesystem path, may be <code>null</code>. * @return The altered filesystem path or <code>null</code> if the input path was <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Removes the leading directory separator from the specified filesystem path (if any). For platform-independent behavior, this method accepts both the forward slash and the backward slash as separator. * @param path The filesystem path, may be <code>null</code>. @return The altered filesystem path or <code>null</code> if the input path was <code>null</code>. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
chopLeadingFileSeparator	TokenNameIdentifier	 chop Leading File Separator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
||	TokenNameOR_OR	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"\"	TokenNameStringLiteral	\
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setSourceDirectory	TokenNameIdentifier	 set Source Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getSourceDirectory	TokenNameIdentifier	 get Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setTestSourceDirectory	TokenNameIdentifier	 set Test Source Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestSourceDirectory	TokenNameIdentifier	 get Test Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestResources	TokenNameIdentifier	 get Test Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setFilters	TokenNameIdentifier	 set Filters
(	TokenNameLPAREN	
filters	TokenNameIdentifier	 filters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setOutputDirectory	TokenNameIdentifier	 set Output Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getOutputDirectory	TokenNameIdentifier	 get Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setTestOutputDirectory	TokenNameIdentifier	 set Test Output Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestOutputDirectory	TokenNameIdentifier	 get Test Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Reporting	TokenNameIdentifier	 Reporting
reporting	TokenNameIdentifier	 reporting
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getReporting	TokenNameIdentifier	 get Reporting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
setOutputDirectory	TokenNameIdentifier	 set Output Directory
(	TokenNameLPAREN	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
getOutputDirectory	TokenNameIdentifier	 get Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
basedir	TokenNameIdentifier	 basedir
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
chopLeadingFileSeparator	TokenNameIdentifier	 chop Leading File Separator
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
.	TokenNameDOT	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

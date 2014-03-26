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
mappers	TokenNameIdentifier	 mappers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
FileNameMapper	TokenNameIdentifier	 File Name Mapper
;	TokenNameSEMICOLON	
/** * A mapper that strips of the a configurable number of leading * directories from a file name. * * <p>This mapper was inspired by a user-list thread that mentioned * wget's --cut-dirs option.</p> * * @see <a href="http://mail-archives.apache.org/mod_mbox/ant-user/201009.mbox/%3C51772743BEA5D44A9EA5BF52AADDD6FB010E96F6@hammai008.delphi.local%3E"> * simplify copy with regexpmapper</a> */	TokenNameCOMMENT_JAVADOC	 A mapper that strips of the a configurable number of leading directories from a file name. * <p>This mapper was inspired by a user-list thread that mentioned wget's --cut-dirs option.</p> * @see <a href="http://mail-archives.apache.org/mod_mbox/ant-user/201009.mbox/%3C51772743BEA5D44A9EA5BF52AADDD6FB010E96F6@hammai008.delphi.local%3E"> simplify copy with regexpmapper</a> 
public	TokenNamepublic	
class	TokenNameclass	
CutDirsMapper	TokenNameIdentifier	 Cut Dirs Mapper
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The number of leading directories to cut. */	TokenNameCOMMENT_JAVADOC	 The number of leading directories to cut. 
public	TokenNamepublic	
void	TokenNamevoid	
setDirs	TokenNameIdentifier	 set Dirs
(	TokenNameLPAREN	
int	TokenNameint	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dirs	TokenNameIdentifier	 dirs
=	TokenNameEQUAL	
dirs	TokenNameIdentifier	 dirs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empty implementation. * @param ignore ignored. */	TokenNameCOMMENT_JAVADOC	 Empty implementation. @param ignore ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty implementation. * @param ignore ignored. */	TokenNameCOMMENT_JAVADOC	 Empty implementation. @param ignore ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"dirs must be set to a positive number"	TokenNameStringLiteral	dirs must be set to a positive number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
fileSep	TokenNameIdentifier	 file Sep
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileSepCorrected	TokenNameIdentifier	 file Sep Corrected
=	TokenNameEQUAL	
sourceFileName	TokenNameIdentifier	 source File Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
fileSep	TokenNameIdentifier	 file Sep
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
fileSep	TokenNameIdentifier	 file Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nthMatch	TokenNameIdentifier	 nth Match
=	TokenNameEQUAL	
fileSepCorrected	TokenNameIdentifier	 file Sep Corrected
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
fileSep	TokenNameIdentifier	 file Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nthMatch	TokenNameIdentifier	 nth Match
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
dirs	TokenNameIdentifier	 dirs
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nthMatch	TokenNameIdentifier	 nth Match
=	TokenNameEQUAL	
fileSepCorrected	TokenNameIdentifier	 file Sep Corrected
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
fileSep	TokenNameIdentifier	 file Sep
,	TokenNameCOMMA	
nthMatch	TokenNameIdentifier	 nth Match
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nthMatch	TokenNameIdentifier	 nth Match
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
sourceFileName	TokenNameIdentifier	 source File Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
nthMatch	TokenNameIdentifier	 nth Match
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

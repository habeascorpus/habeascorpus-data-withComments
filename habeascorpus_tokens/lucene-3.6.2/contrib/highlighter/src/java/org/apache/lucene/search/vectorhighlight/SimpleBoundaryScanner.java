package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SimpleBoundaryScanner	TokenNameIdentifier	 Simple Boundary Scanner
implements	TokenNameimplements	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_SCAN	TokenNameIdentifier	 DEFAULT  MAX  SCAN
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Character	TokenNameIdentifier	 Character
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DEFAULT_BOUNDARY_CHARS	TokenNameIdentifier	 DEFAULT  BOUNDARY  CHARS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'!'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\t'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'\n'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
maxScan	TokenNameIdentifier	 max Scan
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
boundaryChars	TokenNameIdentifier	 boundary Chars
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleBoundaryScanner	TokenNameIdentifier	 Simple Boundary Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_MAX_SCAN	TokenNameIdentifier	 DEFAULT  MAX  SCAN
,	TokenNameCOMMA	
DEFAULT_BOUNDARY_CHARS	TokenNameIdentifier	 DEFAULT  BOUNDARY  CHARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleBoundaryScanner	TokenNameIdentifier	 Simple Boundary Scanner
(	TokenNameLPAREN	
int	TokenNameint	
maxScan	TokenNameIdentifier	 max Scan
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
maxScan	TokenNameIdentifier	 max Scan
,	TokenNameCOMMA	
DEFAULT_BOUNDARY_CHARS	TokenNameIdentifier	 DEFAULT  BOUNDARY  CHARS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleBoundaryScanner	TokenNameIdentifier	 Simple Boundary Scanner
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
boundaryChars	TokenNameIdentifier	 boundary Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_MAX_SCAN	TokenNameIdentifier	 DEFAULT  MAX  SCAN
,	TokenNameCOMMA	
boundaryChars	TokenNameIdentifier	 boundary Chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleBoundaryScanner	TokenNameIdentifier	 Simple Boundary Scanner
(	TokenNameLPAREN	
int	TokenNameint	
maxScan	TokenNameIdentifier	 max Scan
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
boundaryChars	TokenNameIdentifier	 boundary Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxScan	TokenNameIdentifier	 max Scan
=	TokenNameEQUAL	
maxScan	TokenNameIdentifier	 max Scan
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
boundaryChars	TokenNameIdentifier	 boundary Chars
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
boundaryChars	TokenNameIdentifier	 boundary Chars
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
boundaryChars	TokenNameIdentifier	 boundary Chars
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleBoundaryScanner	TokenNameIdentifier	 Simple Boundary Scanner
(	TokenNameLPAREN	
int	TokenNameint	
maxScan	TokenNameIdentifier	 max Scan
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
boundaryChars	TokenNameIdentifier	 boundary Chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxScan	TokenNameIdentifier	 max Scan
=	TokenNameEQUAL	
maxScan	TokenNameIdentifier	 max Scan
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
boundaryChars	TokenNameIdentifier	 boundary Chars
=	TokenNameEQUAL	
boundaryChars	TokenNameIdentifier	 boundary Chars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
findStartOffset	TokenNameIdentifier	 find Start Offset
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid illegal start offset 	TokenNameCOMMENT_LINE	avoid illegal start offset 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
maxScan	TokenNameIdentifier	 max Scan
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found? 	TokenNameCOMMENT_LINE	found? 
if	TokenNameif	
(	TokenNameLPAREN	
boundaryChars	TokenNameIdentifier	 boundary Chars
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we scanned up to the start of the text, return it, its a "boundary" 	TokenNameCOMMENT_LINE	if we scanned up to the start of the text, return it, its a "boundary" 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
findEndOffset	TokenNameIdentifier	 find End Offset
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// avoid illegal start offset 	TokenNameCOMMENT_LINE	avoid illegal start offset 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
maxScan	TokenNameIdentifier	 max Scan
;	TokenNameSEMICOLON	
//for( offset = start; offset <= buffer.length() && count > 0; count-- ){ 	TokenNameCOMMENT_LINE	for( offset = start; offset <= buffer.length() && count > 0; count-- ){ 
for	TokenNamefor	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found? 	TokenNameCOMMENT_LINE	found? 
if	TokenNameif	
(	TokenNameLPAREN	
boundaryChars	TokenNameIdentifier	 boundary Chars
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not found 	TokenNameCOMMENT_LINE	not found 
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

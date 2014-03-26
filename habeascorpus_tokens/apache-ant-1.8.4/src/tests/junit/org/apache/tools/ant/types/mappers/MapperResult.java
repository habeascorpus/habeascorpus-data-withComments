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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Mapper	TokenNameIdentifier	 Mapper
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
/** * This is a test task to show the result of a mapper * on a specific input. * (Test is not in the name of the class, to make sure that * it is not treated as a unit test. */	TokenNameCOMMENT_JAVADOC	 This is a test task to show the result of a mapper on a specific input. (Test is not in the name of the class, to make sure that it is not treated as a unit test. 
public	TokenNamepublic	
class	TokenNameclass	
MapperResult	TokenNameIdentifier	 Mapper Result
extends	TokenNameextends	
Task	TokenNameIdentifier	 Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
failMessage	TokenNameIdentifier	 fail Message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
;	TokenNameSEMICOLON	
/** * The output on an empty string array */	TokenNameCOMMENT_JAVADOC	 The output on an empty string array 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NULL_MAPPER_RESULT	TokenNameIdentifier	 NULL  MAPPER  RESULT
=	TokenNameEQUAL	
"<NULL>"	TokenNameStringLiteral	<NULL>
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setFailMessage	TokenNameIdentifier	 set Fail Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
failMessage	TokenNameIdentifier	 fail Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
failMessage	TokenNameIdentifier	 fail Message
=	TokenNameEQUAL	
failMessage	TokenNameIdentifier	 fail Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredMapper	TokenNameIdentifier	 add Configured Mapper
(	TokenNameLPAREN	
Mapper	TokenNameIdentifier	 Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Only one mapper type nested element allowed"	TokenNameStringLiteral	Only one mapper type nested element allowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
=	TokenNameEQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing attribute 'input'"	TokenNameStringLiteral	Missing attribute 'input'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing attribute 'output'"	TokenNameStringLiteral	Missing attribute 'output'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Missing a nested file name mapper type element"	TokenNameStringLiteral	Missing a nested file name mapper type element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
flattened	TokenNameIdentifier	 flattened
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flattened	TokenNameIdentifier	 flattened
=	TokenNameEQUAL	
NULL_MAPPER_RESULT	TokenNameIdentifier	 NULL  MAPPER  RESULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
flattened	TokenNameIdentifier	 flattened
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
flattened	TokenNameIdentifier	 flattened
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
failMessage	TokenNameIdentifier	 fail Message
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"got "	TokenNameStringLiteral	got 
+	TokenNamePLUS	
flattened	TokenNameIdentifier	 flattened
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

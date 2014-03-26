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
optional	TokenNameIdentifier	 optional
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * Script support at map time. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Script support at map time. @since Ant1.7 
public	TokenNamepublic	
class	TokenNameclass	
ScriptMapper	TokenNameIdentifier	 Script Mapper
extends	TokenNameextends	
AbstractScriptComponent	TokenNameIdentifier	 Abstract Script Component
implements	TokenNameimplements	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
files	TokenNameIdentifier	 files
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_STRING_ARRAY	TokenNameIdentifier	 EMPTY  STRING  ARRAY
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Sets the from part of the transformation rule. * * @param from a string. */	TokenNameCOMMENT_JAVADOC	 Sets the from part of the transformation rule. * @param from a string. 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the to part of the transformation rule. * * @param to a string. */	TokenNameCOMMENT_JAVADOC	 Sets the to part of the transformation rule. * @param to a string. 
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Reset the list of files */	TokenNameCOMMENT_JAVADOC	 Reset the list of files 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a mapped name * @param mapping the value to use. */	TokenNameCOMMENT_JAVADOC	 Add a mapped name @param mapping the value to use. 
public	TokenNamepublic	
void	TokenNamevoid	
addMappedName	TokenNameIdentifier	 add Mapped Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mapping	TokenNameIdentifier	 mapping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapping	TokenNameIdentifier	 mapping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array containing the target filename(s) for the given source * file. * <p/> * <p>if the given rule doesn't apply to the source file, implementation * must return null. SourceFileScanner will then omit the source file in * question.</p> * * @param sourceFileName the name of the source file relative to some given * basedirectory. * @return an array of strings if the rule applies to the source file, or * null if it does not. */	TokenNameCOMMENT_JAVADOC	 Returns an array containing the target filename(s) for the given source file. <p/> <p>if the given rule doesn't apply to the source file, implementation must return null. SourceFileScanner will then omit the source file in question.</p> * @param sourceFileName the name of the source file relative to some given basedirectory. @return an array of strings if the rule applies to the source file, or null if it does not. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initScriptRunner	TokenNameIdentifier	 init Script Runner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getRunner	TokenNameIdentifier	 get Runner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addBean	TokenNameIdentifier	 add Bean
(	TokenNameLPAREN	
"source"	TokenNameStringLiteral	source
,	TokenNameCOMMA	
sourceFileName	TokenNameIdentifier	 source File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeScript	TokenNameIdentifier	 execute Script
(	TokenNameLPAREN	
"ant_mapper"	TokenNameStringLiteral	ant_mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
EMPTY_STRING_ARRAY	TokenNameIdentifier	 EMPTY  STRING  ARRAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

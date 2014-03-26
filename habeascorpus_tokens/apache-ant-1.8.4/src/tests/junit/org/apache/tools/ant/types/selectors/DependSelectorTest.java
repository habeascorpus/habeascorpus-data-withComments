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
Mapper	TokenNameIdentifier	 Mapper
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Tests Depend Selectors * */	TokenNameCOMMENT_JAVADOC	 Tests Depend Selectors 
public	TokenNamepublic	
class	TokenNameclass	
DependSelectorTest	TokenNameIdentifier	 Depend Selector Test
extends	TokenNameextends	
BaseSelectorTest	TokenNameIdentifier	 Base Selector Test
{	TokenNameLBRACE	
public	TokenNamepublic	
DependSelectorTest	TokenNameIdentifier	 Depend Selector Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Factory method from base class. This is overriden in child * classes to return a specific Selector class. */	TokenNameCOMMENT_JAVADOC	 Factory method from base class. This is overriden in child classes to return a specific Selector class. 
public	TokenNamepublic	
BaseSelector	TokenNameIdentifier	 Base Selector
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DependSelector	TokenNameIdentifier	 Depend Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test the code that validates the selector. */	TokenNameCOMMENT_JAVADOC	 Test the code that validates the selector. 
public	TokenNamepublic	
void	TokenNamevoid	
testValidate	TokenNameIdentifier	 test Validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DependSelector	TokenNameIdentifier	 Depend Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"DependSelector allowed more than one nested mapper."	TokenNameStringLiteral	DependSelector allowed more than one nested mapper.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be1	TokenNameIdentifier	 be1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Cannot define more than one mapper"	TokenNameStringLiteral	Cannot define more than one mapper
,	TokenNameCOMMA	
be1	TokenNameIdentifier	 be1
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
filenames	TokenNameIdentifier	 filenames
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
files	TokenNameIdentifier	 files
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"DependSelector did not check for required fields"	TokenNameStringLiteral	DependSelector did not check for required fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be2	TokenNameIdentifier	 be2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The targetdir attribute is required."	TokenNameStringLiteral	The targetdir attribute is required.
,	TokenNameCOMMA	
be2	TokenNameIdentifier	 be2
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests to make sure that the selector is selecting files correctly. */	TokenNameCOMMENT_JAVADOC	 Tests to make sure that the selector is selecting files correctly. 
public	TokenNamepublic	
void	TokenNamevoid	
testSelectionBehaviour	TokenNameIdentifier	 test Selection Behaviour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DependSelector	TokenNameIdentifier	 Depend Selector
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
subdir	TokenNameIdentifier	 subdir
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"identity"	TokenNameStringLiteral	identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
glob	TokenNameIdentifier	 glob
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
glob	TokenNameIdentifier	 glob
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"glob"	TokenNameStringLiteral	glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
merge	TokenNameIdentifier	 merge
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"merge"	TokenNameStringLiteral	merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
makeBed	TokenNameIdentifier	 make Bed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFFFFFFFFFFF"	TokenNameStringLiteral	FFFFFFFFFFFF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFFFFFFFFFFF"	TokenNameStringLiteral	FFFFFFFFFFFF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"asf-logo.gif.gz"	TokenNameStringLiteral	asf-logo.gif.gz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TFFFFTTTFFF"	TokenNameStringLiteral	TFFFFTTTFFF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"asf-logo.gif.bz2"	TokenNameStringLiteral	asf-logo.gif.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TTFTTTTTTTTT"	TokenNameStringLiteral	TTFTTTTTTTTT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Test for path relative to project base directory 	TokenNameCOMMENT_LINE	Test for path relative to project base directory 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subdir	TokenNameIdentifier	 subdir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"selectortest/tar/bz2"	TokenNameStringLiteral	selectortest/tar/bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
subdir	TokenNameIdentifier	 subdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
glob	TokenNameIdentifier	 glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*.bz2"	TokenNameStringLiteral	*.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"*.tar.bz2"	TokenNameStringLiteral	*.tar.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFTFFFFFFTTF"	TokenNameStringLiteral	FFTFFFFFFTTF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subdir	TokenNameIdentifier	 subdir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
beddir	TokenNameIdentifier	 beddir
,	TokenNameCOMMA	
"tar/bz2"	TokenNameStringLiteral	tar/bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
subdir	TokenNameIdentifier	 subdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
glob	TokenNameIdentifier	 glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*.bz2"	TokenNameStringLiteral	*.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"*.tar.bz2"	TokenNameStringLiteral	*.tar.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFFFFFFFFTTF"	TokenNameStringLiteral	FFFFFFFFFTTF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
makeMirror	TokenNameIdentifier	 make Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
testdir	TokenNameIdentifier	 testdir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"selectortest2"	TokenNameStringLiteral	selectortest2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
testdir	TokenNameIdentifier	 testdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFFTTFFFFFFF"	TokenNameStringLiteral	FFFTTFFFFFFF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DependSelector	TokenNameIdentifier	 Depend Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testdir	TokenNameIdentifier	 testdir
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"selectortest2/tar/bz2"	TokenNameStringLiteral	selectortest2/tar/bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setTargetdir	TokenNameIdentifier	 set Targetdir
(	TokenNameLPAREN	
testdir	TokenNameIdentifier	 testdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
createMapper	TokenNameIdentifier	 create Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
glob	TokenNameIdentifier	 glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*.bz2"	TokenNameStringLiteral	*.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"*.tar.bz2"	TokenNameStringLiteral	*.tar.bz2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
mirrorSelectionString	TokenNameIdentifier	 mirror Selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFFFFFFFFTTF"	TokenNameStringLiteral	FFFFFFFFFTTF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
selectionString	TokenNameIdentifier	 selection String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FFFFFFFFFTTF"	TokenNameStringLiteral	FFFFFFFFFTTF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
cleanupMirror	TokenNameIdentifier	 cleanup Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
cleanupBed	TokenNameIdentifier	 cleanup Bed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

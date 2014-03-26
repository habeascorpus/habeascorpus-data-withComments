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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * Tests Contains Selectors. * */	TokenNameCOMMENT_JAVADOC	 Tests Contains Selectors. 
public	TokenNamepublic	
class	TokenNameclass	
ContainsSelectorTest	TokenNameIdentifier	 Contains Selector Test
extends	TokenNameextends	
BaseSelectorTest	TokenNameIdentifier	 Base Selector Test
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ContainsSelectorTest	TokenNameIdentifier	 Contains Selector Test
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
ContainsSelector	TokenNameIdentifier	 Contains Selector
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
ContainsSelector	TokenNameIdentifier	 Contains Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
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
"ContainsSelector did not check for required field 'text'"	TokenNameStringLiteral	ContainsSelector did not check for required field 'text'
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
"The text attribute is required"	TokenNameStringLiteral	The text attribute is required
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
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Parameter	TokenNameIdentifier	 Parameter
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
new	TokenNamenew	
Parameter	TokenNameIdentifier	 Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"garbage in"	TokenNameStringLiteral	garbage in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"garbage out"	TokenNameStringLiteral	garbage out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
{	TokenNameLBRACE	
param	TokenNameIdentifier	 param
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
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
"ContainsSelector did not check for valid parameter element"	TokenNameStringLiteral	ContainsSelector did not check for valid parameter element
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
"Invalid parameter garbage in"	TokenNameStringLiteral	Invalid parameter garbage in
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
ContainsSelector	TokenNameIdentifier	 Contains Selector
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
results	TokenNameIdentifier	 results
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
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"no such string in test files"	TokenNameStringLiteral	no such string in test files
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
"TFFFFFFFFFFT"	TokenNameStringLiteral	TFFFFFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"Apache Ant"	TokenNameStringLiteral	Apache Ant
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
"TFFFTFFFFFFT"	TokenNameStringLiteral	TFFFTFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"apache ant"	TokenNameStringLiteral	apache ant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
true	TokenNametrue	
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
"TFFFFFFFFFFT"	TokenNameStringLiteral	TFFFFFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"apache ant"	TokenNameStringLiteral	apache ant
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
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
"TFFFTFFFFFFT"	TokenNameStringLiteral	TFFFTFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"ApacheAnt"	TokenNameStringLiteral	ApacheAnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setIgnorewhitespace	TokenNameIdentifier	 set Ignorewhitespace
(	TokenNameLPAREN	
true	TokenNametrue	
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
"TFFFTFFFFFFT"	TokenNameStringLiteral	TFFFTFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ContainsSelector	TokenNameIdentifier	 Contains Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"A p a c h e A n t"	TokenNameStringLiteral	A p a c h e A n t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setIgnorewhitespace	TokenNameIdentifier	 set Ignorewhitespace
(	TokenNameLPAREN	
true	TokenNametrue	
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
"TFFFTFFFFFFT"	TokenNameStringLiteral	TFFFTFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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

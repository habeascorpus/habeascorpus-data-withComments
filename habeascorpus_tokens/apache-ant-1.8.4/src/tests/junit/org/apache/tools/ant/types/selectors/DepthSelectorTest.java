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
Parameter	TokenNameIdentifier	 Parameter
;	TokenNameSEMICOLON	
/** * Tests Depth Selectors * */	TokenNameCOMMENT_JAVADOC	 Tests Depth Selectors 
public	TokenNamepublic	
class	TokenNameclass	
DepthSelectorTest	TokenNameIdentifier	 Depth Selector Test
extends	TokenNameextends	
BaseSelectorTest	TokenNameIdentifier	 Base Selector Test
{	TokenNameLBRACE	
public	TokenNamepublic	
DepthSelectorTest	TokenNameIdentifier	 Depth Selector Test
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
DepthSelector	TokenNameIdentifier	 Depth Selector
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
DepthSelector	TokenNameIdentifier	 Depth Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DepthSelector	TokenNameIdentifier	 Depth Selector
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
"DepthSelector did not check for required fields"	TokenNameStringLiteral	DepthSelector did not check for required fields
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
"You must set at least one of the min or the "	TokenNameStringLiteral	You must set at least one of the min or the 
+	TokenNamePLUS	
"max levels."	TokenNameStringLiteral	max levels.
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
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
"DepthSelector did not check for maximum being higher "	TokenNameStringLiteral	DepthSelector did not check for maximum being higher 
+	TokenNamePLUS	
"than minimum"	TokenNameStringLiteral	than minimum
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
"The maximum depth is lower than the minimum."	TokenNameStringLiteral	The maximum depth is lower than the minimum.
,	TokenNameCOMMA	
be2	TokenNameIdentifier	 be2
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
DepthSelector	TokenNameIdentifier	 Depth Selector
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
new	TokenNamenew	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
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
"DepthSelector did not check for valid parameter element"	TokenNameStringLiteral	DepthSelector did not check for valid parameter element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be3	TokenNameIdentifier	 be3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid parameter garbage in"	TokenNameStringLiteral	Invalid parameter garbage in
,	TokenNameCOMMA	
be3	TokenNameIdentifier	 be3
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
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"min"	TokenNameStringLiteral	min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"garbage out"	TokenNameStringLiteral	garbage out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
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
"DepthSelector accepted bad minimum as parameter"	TokenNameStringLiteral	DepthSelector accepted bad minimum as parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be4	TokenNameIdentifier	 be4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid minimum value garbage out"	TokenNameStringLiteral	Invalid minimum value garbage out
,	TokenNameCOMMA	
be4	TokenNameIdentifier	 be4
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
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"max"	TokenNameStringLiteral	max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"garbage out"	TokenNameStringLiteral	garbage out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
params	TokenNameIdentifier	 params
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
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
"DepthSelector accepted bad maximum as parameter"	TokenNameStringLiteral	DepthSelector accepted bad maximum as parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be5	TokenNameIdentifier	 be5
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid maximum value garbage out"	TokenNameStringLiteral	Invalid maximum value garbage out
,	TokenNameCOMMA	
be5	TokenNameIdentifier	 be5
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
DepthSelector	TokenNameIdentifier	 Depth Selector
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
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
25	TokenNameIntegerLiteral	
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
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
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
"TTTTTTTTTTTT"	TokenNameStringLiteral	TTTTTTTTTTTT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
"FFFFFTTTTTTT"	TokenNameStringLiteral	FFFFFTTTTTTT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
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
"TTTTTFFFFFFF"	TokenNameStringLiteral	TTTTTFFFFFFF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DepthSelector	TokenNameIdentifier	 Depth Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMin	TokenNameIdentifier	 set Min
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMax	TokenNameIdentifier	 set Max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
"FFFFFTTTFFFT"	TokenNameStringLiteral	FFFFFTTTFFFT
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

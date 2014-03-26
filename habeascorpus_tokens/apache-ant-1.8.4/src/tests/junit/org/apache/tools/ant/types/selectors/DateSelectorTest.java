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
/** * Tests Date Selectors. * */	TokenNameCOMMENT_JAVADOC	 Tests Date Selectors. 
public	TokenNamepublic	
class	TokenNameclass	
DateSelectorTest	TokenNameIdentifier	 Date Selector Test
extends	TokenNameextends	
BaseSelectorTest	TokenNameIdentifier	 Base Selector Test
{	TokenNameLBRACE	
public	TokenNamepublic	
DateSelectorTest	TokenNameIdentifier	 Date Selector Test
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
DateSelector	TokenNameIdentifier	 Date Selector
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
DateSelector	TokenNameIdentifier	 Date Selector
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
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
"DateSelector did not check for required fields"	TokenNameStringLiteral	DateSelector did not check for required fields
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
"You must provide a datetime or the number of "	TokenNameStringLiteral	You must provide a datetime or the number of 
+	TokenNamePLUS	
"milliseconds."	TokenNameStringLiteral	milliseconds.
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
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"01/01/1969 01:01 AM"	TokenNameStringLiteral	01/01/1969 01:01 AM
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
"DateSelector did not check for Datetime being in the "	TokenNameStringLiteral	DateSelector did not check for Datetime being in the 
+	TokenNamePLUS	
"allowable range"	TokenNameStringLiteral	allowable range
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
"Date of 01/01/1969 01:01 AM results in negative "	TokenNameStringLiteral	Date of 01/01/1969 01:01 AM results in negative 
+	TokenNamePLUS	
"milliseconds value relative to epoch (January 1, "	TokenNameStringLiteral	milliseconds value relative to epoch (January 1, 
+	TokenNamePLUS	
"1970, 00:00:00 GMT)."	TokenNameStringLiteral	1970, 00:00:00 GMT).
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
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"this is not a date"	TokenNameStringLiteral	this is not a date
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
"DateSelector did not check for Datetime being in a "	TokenNameStringLiteral	DateSelector did not check for Datetime being in a 
+	TokenNamePLUS	
"valid format"	TokenNameStringLiteral	valid format
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
"Date of this is not a date"	TokenNameStringLiteral	Date of this is not a date
+	TokenNamePLUS	
" Cannot be parsed correctly. It should be in"	TokenNameStringLiteral	 Cannot be parsed correctly. It should be in
+	TokenNamePLUS	
" MM/DD/YYYY HH:MM AM_PM format."	TokenNameStringLiteral	 MM/DD/YYYY HH:MM AM_PM format.
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
DateSelector	TokenNameIdentifier	 Date Selector
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
"DateSelector did not check for valid parameter element"	TokenNameStringLiteral	DateSelector did not check for valid parameter element
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
"Invalid parameter garbage in"	TokenNameStringLiteral	Invalid parameter garbage in
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
DateSelector	TokenNameIdentifier	 Date Selector
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
"millis"	TokenNameStringLiteral	millis
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
"DateSelector did not check for valid millis parameter"	TokenNameStringLiteral	DateSelector did not check for valid millis parameter
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
"Invalid millisecond setting garbage out"	TokenNameStringLiteral	Invalid millisecond setting garbage out
,	TokenNameCOMMA	
be5	TokenNameIdentifier	 be5
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
DateSelector	TokenNameIdentifier	 Date Selector
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
"granularity"	TokenNameStringLiteral	granularity
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
"DateSelector did not check for valid granularity parameter"	TokenNameStringLiteral	DateSelector did not check for valid granularity parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be6	TokenNameIdentifier	 be6
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid granularity setting garbage out"	TokenNameStringLiteral	Invalid granularity setting garbage out
,	TokenNameCOMMA	
be6	TokenNameIdentifier	 be6
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
DateSelector	TokenNameIdentifier	 Date Selector
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
DateSelector	TokenNameIdentifier	 Date Selector
.	TokenNameDOT	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
new	TokenNamenew	
DateSelector	TokenNameIdentifier	 Date Selector
.	TokenNameDOT	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
before	TokenNameIdentifier	 before
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"before"	TokenNameStringLiteral	before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateSelector	TokenNameIdentifier	 Date Selector
.	TokenNameDOT	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
equal	TokenNameIdentifier	 equal
=	TokenNameEQUAL	
new	TokenNamenew	
DateSelector	TokenNameIdentifier	 Date Selector
.	TokenNameDOT	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
equal	TokenNameIdentifier	 equal
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"equal"	TokenNameStringLiteral	equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DateSelector	TokenNameIdentifier	 Date Selector
.	TokenNameDOT	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
new	TokenNamenew	
DateSelector	TokenNameIdentifier	 Date Selector
.	TokenNameDOT	
TimeComparisons	TokenNameIdentifier	 Time Comparisons
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"after"	TokenNameStringLiteral	after
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
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"10/10/1999 1:45 PM"	TokenNameStringLiteral	10/10/1999 1:45 PM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
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
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"10/10/1999 1:45 PM"	TokenNameStringLiteral	10/10/1999 1:45 PM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setCheckdirs	TokenNameIdentifier	 set Checkdirs
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
"FFFFFFFFFFFF"	TokenNameStringLiteral	FFFFFFFFFFFF
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"10/10/1999 1:45 PM"	TokenNameStringLiteral	10/10/1999 1:45 PM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
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
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"11/21/2001 4:54 AM"	TokenNameStringLiteral	11/21/2001 4:54 AM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
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
"TFTFFFFFFFFT"	TokenNameStringLiteral	TFTFFFFFFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"11/21/2001 4:55 AM"	TokenNameStringLiteral	11/21/2001 4:55 AM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
milliseconds	TokenNameIdentifier	 milliseconds
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
equal	TokenNameIdentifier	 equal
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
"TTFFTFFFTTTT"	TokenNameStringLiteral	TTFFTFFFTTTT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
milliseconds	TokenNameIdentifier	 milliseconds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
equal	TokenNameIdentifier	 equal
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
"TTFFTFFFTTTT"	TokenNameStringLiteral	TTFFTFFFTTTT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setDatetime	TokenNameIdentifier	 set Datetime
(	TokenNameLPAREN	
"11/21/2001 4:56 AM"	TokenNameStringLiteral	11/21/2001 4:56 AM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
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
"TFFTFTTTFFFT"	TokenNameStringLiteral	TFFTFTTTFFFT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Parameter	TokenNameIdentifier	 Parameter
param1	TokenNameIdentifier	 param1
=	TokenNameEQUAL	
new	TokenNamenew	
Parameter	TokenNameIdentifier	 Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Parameter	TokenNameIdentifier	 Parameter
param2	TokenNameIdentifier	 param2
=	TokenNameEQUAL	
new	TokenNamenew	
Parameter	TokenNameIdentifier	 Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param1	TokenNameIdentifier	 param1
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"datetime"	TokenNameStringLiteral	datetime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param1	TokenNameIdentifier	 param1
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"11/21/2001 4:56 AM"	TokenNameStringLiteral	11/21/2001 4:56 AM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param2	TokenNameIdentifier	 param2
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"when"	TokenNameStringLiteral	when
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param2	TokenNameIdentifier	 param2
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"after"	TokenNameStringLiteral	after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Parameter	TokenNameIdentifier	 Parameter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
params	TokenNameIdentifier	 params
=	TokenNameEQUAL	
{	TokenNameLBRACE	
param1	TokenNameIdentifier	 param1
,	TokenNameCOMMA	
param2	TokenNameIdentifier	 param2
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
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
"TFFTFTTTFFFT"	TokenNameStringLiteral	TFFTFTTTFFFT
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
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
testtime	TokenNameIdentifier	 testtime
=	TokenNameEQUAL	
mirrorfiles	TokenNameIdentifier	 mirrorfiles
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
testtime	TokenNameIdentifier	 testtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
"TFFFFTTTTTTT"	TokenNameStringLiteral	TFFFFTTTTTTT
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateSelector	TokenNameIdentifier	 Date Selector
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testtime	TokenNameIdentifier	 testtime
=	TokenNameEQUAL	
mirrorfiles	TokenNameIdentifier	 mirrorfiles
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setMillis	TokenNameIdentifier	 set Millis
(	TokenNameLPAREN	
testtime	TokenNameIdentifier	 testtime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setGranularity	TokenNameIdentifier	 set Granularity
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
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
"TTTTTTTFFFFT"	TokenNameStringLiteral	TTTTTTTFFFFT
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

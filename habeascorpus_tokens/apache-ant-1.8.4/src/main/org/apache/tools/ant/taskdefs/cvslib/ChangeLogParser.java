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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
cvslib	TokenNameIdentifier	 cvslib
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
AbstractCvsTask	TokenNameIdentifier	 Abstract Cvs Task
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
CollectionUtils	TokenNameIdentifier	 Collection Utils
;	TokenNameSEMICOLON	
/** * A class used to parse the output of the CVS log command. * */	TokenNameCOMMENT_JAVADOC	 A class used to parse the output of the CVS log command. 
class	TokenNameclass	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
{	TokenNameLBRACE	
//private static final int GET_ENTRY = 0; 	TokenNameCOMMENT_LINE	private static final int GET_ENTRY = 0; 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GET_FILE	TokenNameIdentifier	 GET  FILE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GET_DATE	TokenNameIdentifier	 GET  DATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GET_COMMENT	TokenNameIdentifier	 GET  COMMENT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GET_REVISION	TokenNameIdentifier	 GET  REVISION
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
GET_PREVIOUS_REV	TokenNameIdentifier	 GET  PREVIOUS  REV
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// FIXME formatters are not thread-safe 	TokenNameCOMMENT_LINE	FIXME formatters are not thread-safe 
/** input format for dates read in from cvs log */	TokenNameCOMMENT_JAVADOC	 input format for dates read in from cvs log 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
INPUT_DATE	TokenNameIdentifier	 INPUT  DATE
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy/MM/dd HH:mm:ss"	TokenNameStringLiteral	yyyy/MM/dd HH:mm:ss
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * New formatter used to parse CVS date/timestamp. */	TokenNameCOMMENT_JAVADOC	 New formatter used to parse CVS date/timestamp. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
CVS1129_INPUT_DATE	TokenNameIdentifier	 CV S1129  INPUT  DATE
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd HH:mm:ss Z"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ss Z
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
TimeZone	TokenNameIdentifier	 Time Zone
utc	TokenNameIdentifier	 utc
=	TokenNameEQUAL	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"UTC"	TokenNameStringLiteral	UTC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
INPUT_DATE	TokenNameIdentifier	 INPUT  DATE
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CVS1129_INPUT_DATE	TokenNameIdentifier	 CV S1129  INPUT  DATE
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//The following is data used while processing stdout of CVS command 	TokenNameCOMMENT_LINE	The following is data used while processing stdout of CVS command 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
author	TokenNameIdentifier	 author
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
revision	TokenNameIdentifier	 revision
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
previousRevision	TokenNameIdentifier	 previous Revision
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_FILE	TokenNameIdentifier	 GET  FILE
;	TokenNameSEMICOLON	
/** rcs entries */	TokenNameCOMMENT_JAVADOC	 rcs entries 
private	TokenNameprivate	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
remote	TokenNameIdentifier	 remote
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moduleNames	TokenNameIdentifier	 module Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
moduleNameLengths	TokenNameIdentifier	 module Name Lengths
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
CollectionUtils	TokenNameIdentifier	 Collection Utils
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
(	TokenNameLPAREN	
boolean	TokenNameboolean	
remote	TokenNameIdentifier	 remote
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
packageName	TokenNameIdentifier	 package Name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
modules	TokenNameIdentifier	 modules
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remote	TokenNameIdentifier	 remote
=	TokenNameEQUAL	
remote	TokenNameIdentifier	 remote
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
names	TokenNameIdentifier	 names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
packageName	TokenNameIdentifier	 package Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
packageName	TokenNameIdentifier	 package Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
modules	TokenNameIdentifier	 modules
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractCvsTask	TokenNameIdentifier	 Abstract Cvs Task
.	TokenNameDOT	
Module	TokenNameIdentifier	 Module
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractCvsTask	TokenNameIdentifier	 Abstract Cvs Task
.	TokenNameDOT	
Module	TokenNameIdentifier	 Module
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
moduleNames	TokenNameIdentifier	 module Names
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
names	TokenNameIdentifier	 names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
moduleNameLengths	TokenNameIdentifier	 module Name Lengths
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
moduleNames	TokenNameIdentifier	 module Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
moduleNames	TokenNameIdentifier	 module Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
moduleNameLengths	TokenNameIdentifier	 module Name Lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
moduleNames	TokenNameIdentifier	 module Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a list of rcs entries as an array. * * @return a list of rcs entries as an array */	TokenNameCOMMENT_JAVADOC	 Get a list of rcs entries as an array. * @return a list of rcs entries as an array 
public	TokenNamepublic	
CVSEntry	TokenNameIdentifier	 CVS Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEntrySetAsArray	TokenNameIdentifier	 get Entry Set As Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CVSEntry	TokenNameIdentifier	 CVS Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
CVSEntry	TokenNameIdentifier	 CVS Entry
[	TokenNameLBRACKET	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CVSEntry	TokenNameIdentifier	 CVS Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification about the process writing * to standard output. * @param line the line to process */	TokenNameCOMMENT_JAVADOC	 Receive notification about the process writing to standard output. @param line the line to process 
public	TokenNamepublic	
void	TokenNamevoid	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
GET_FILE	TokenNameIdentifier	 GET  FILE
:	TokenNameCOLON	
// make sure attributes are reset when 	TokenNameCOMMENT_LINE	make sure attributes are reset when 
// working on a 'new' file. 	TokenNameCOMMENT_LINE	working on a 'new' file. 
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processFile	TokenNameIdentifier	 process File
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GET_REVISION	TokenNameIdentifier	 GET  REVISION
:	TokenNameCOLON	
processRevision	TokenNameIdentifier	 process Revision
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GET_DATE	TokenNameIdentifier	 GET  DATE
:	TokenNameCOLON	
processDate	TokenNameIdentifier	 process Date
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GET_COMMENT	TokenNameIdentifier	 GET  COMMENT
:	TokenNameCOLON	
processComment	TokenNameIdentifier	 process Comment
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
GET_PREVIOUS_REV	TokenNameIdentifier	 GET  PREVIOUS  REV
:	TokenNameCOLON	
processGetPreviousRevision	TokenNameIdentifier	 process Get Previous Revision
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a line while in "GET_COMMENT" state. * * @param line the line */	TokenNameCOMMENT_JAVADOC	 Process a line while in "GET_COMMENT" state. * @param line the line 
private	TokenNameprivate	
void	TokenNamevoid	
processComment	TokenNameIdentifier	 process Comment
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lineSeparator	TokenNameIdentifier	 line Separator
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"============================================================================="	TokenNameStringLiteral	=============================================================================
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//We have ended changelog for that particular file 	TokenNameCOMMENT_LINE	We have ended changelog for that particular file 
//so we can save it 	TokenNameCOMMENT_LINE	so we can save it 
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lineSeparator	TokenNameIdentifier	 line Separator
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//was -1 	TokenNameCOMMENT_LINE	was -1 
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saveEntry	TokenNameIdentifier	 save Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_FILE	TokenNameIdentifier	 GET  FILE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"----------------------------"	TokenNameStringLiteral	----------------------------
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lineSeparator	TokenNameIdentifier	 line Separator
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//was -1 	TokenNameCOMMENT_LINE	was -1 
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
comment	TokenNameIdentifier	 comment
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_PREVIOUS_REV	TokenNameIdentifier	 GET  PREVIOUS  REV
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
comment	TokenNameIdentifier	 comment
+=	TokenNamePLUS_EQUAL	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
lineSeparator	TokenNameIdentifier	 line Separator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a line while in "GET_FILE" state. * * @param line the line to process */	TokenNameCOMMENT_JAVADOC	 Process a line while in "GET_FILE" state. * @param line the line to process 
private	TokenNameprivate	
void	TokenNamevoid	
processFile	TokenNameIdentifier	 process File
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
remote	TokenNameIdentifier	 remote
&&	TokenNameAND_AND	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Working file:"	TokenNameStringLiteral	Working file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_REVISION	TokenNameIdentifier	 GET  REVISION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
remote	TokenNameIdentifier	 remote
&&	TokenNameAND_AND	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"RCS file:"	TokenNameStringLiteral	RCS file:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// exclude the part of the RCS filename up to and 	TokenNameCOMMENT_LINE	exclude the part of the RCS filename up to and 
// including the module name (and the path separator) 	TokenNameCOMMENT_LINE	including the module name (and the path separator) 
int	TokenNameint	
startOfFileName	TokenNameIdentifier	 start Of File Name
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
moduleNames	TokenNameIdentifier	 module Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
moduleNames	TokenNameIdentifier	 module Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startOfFileName	TokenNameIdentifier	 start Of File Name
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
moduleNameLengths	TokenNameIdentifier	 module Name Lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
endOfFileName	TokenNameIdentifier	 end Of File Name
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
",v"	TokenNameStringLiteral	,v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endOfFileName	TokenNameIdentifier	 end Of File Name
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOfFileName	TokenNameIdentifier	 start Of File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startOfFileName	TokenNameIdentifier	 start Of File Name
,	TokenNameCOMMA	
endOfFileName	TokenNameIdentifier	 end Of File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_REVISION	TokenNameIdentifier	 GET  REVISION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a line while in "REVISION" state. * * @param line the line to process */	TokenNameCOMMENT_JAVADOC	 Process a line while in "REVISION" state. * @param line the line to process 
private	TokenNameprivate	
void	TokenNamevoid	
processRevision	TokenNameIdentifier	 process Revision
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"revision"	TokenNameStringLiteral	revision
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
revision	TokenNameIdentifier	 revision
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_DATE	TokenNameIdentifier	 GET  DATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"======"	TokenNameStringLiteral	======
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//There were no revisions in this changelog 	TokenNameCOMMENT_LINE	There were no revisions in this changelog 
//entry so lets move onto next file 	TokenNameCOMMENT_LINE	entry so lets move onto next file 
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_FILE	TokenNameIdentifier	 GET  FILE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a line while in "DATE" state. * * @param line the line to process */	TokenNameCOMMENT_JAVADOC	 Process a line while in "DATE" state. * @param line the line to process 
private	TokenNameprivate	
void	TokenNamevoid	
processDate	TokenNameIdentifier	 process Date
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"date:"	TokenNameStringLiteral	date:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The date format is using a - format since 1.12.9 so we have: 	TokenNameCOMMENT_LINE	The date format is using a - format since 1.12.9 so we have: 
// 1.12.9-: 'date: YYYY/mm/dd HH:mm:ss; author: name;' 	TokenNameCOMMENT_LINE	1.12.9-: 'date: YYYY/mm/dd HH:mm:ss; author: name;' 
// 1.12.9+: 'date: YYYY-mm-dd HH:mm:ss Z; author: name' 	TokenNameCOMMENT_LINE	1.12.9+: 'date: YYYY-mm-dd HH:mm:ss Z; author: name' 
int	TokenNameint	
endOfDateIndex	TokenNameIdentifier	 end Of Date Index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"date: "	TokenNameStringLiteral	date: 
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
endOfDateIndex	TokenNameIdentifier	 end Of Date Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOfAuthorIndex	TokenNameIdentifier	 start Of Author Index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"author: "	TokenNameStringLiteral	author: 
,	TokenNameCOMMA	
endOfDateIndex	TokenNameIdentifier	 end Of Date Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOfAuthorIndex	TokenNameIdentifier	 end Of Author Index
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
startOfAuthorIndex	TokenNameIdentifier	 start Of Author Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
author	TokenNameIdentifier	 author
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"author: "	TokenNameStringLiteral	author: 
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
startOfAuthorIndex	TokenNameIdentifier	 start Of Author Index
,	TokenNameCOMMA	
endOfAuthorIndex	TokenNameIdentifier	 end Of Author Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_COMMENT	TokenNameIdentifier	 GET  COMMENT
;	TokenNameSEMICOLON	
//Reset comment to empty here as we can accumulate multiple lines 	TokenNameCOMMENT_LINE	Reset comment to empty here as we can accumulate multiple lines 
//in the processComment method 	TokenNameCOMMENT_LINE	in the processComment method 
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a line while in "GET_PREVIOUS_REVISION" state. * * @param line the line to process */	TokenNameCOMMENT_JAVADOC	 Process a line while in "GET_PREVIOUS_REVISION" state. * @param line the line to process 
private	TokenNameprivate	
void	TokenNamevoid	
processGetPreviousRevision	TokenNameIdentifier	 process Get Previous Revision
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"revision "	TokenNameStringLiteral	revision 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unexpected line from CVS: "	TokenNameStringLiteral	Unexpected line from CVS: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
previousRevision	TokenNameIdentifier	 previous Revision
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"revision "	TokenNameStringLiteral	revision 
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
saveEntry	TokenNameIdentifier	 save Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revision	TokenNameIdentifier	 revision
=	TokenNameEQUAL	
previousRevision	TokenNameIdentifier	 previous Revision
;	TokenNameSEMICOLON	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
GET_DATE	TokenNameIdentifier	 GET  DATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method that saves the current entry. */	TokenNameCOMMENT_JAVADOC	 Utility method that saves the current entry. 
private	TokenNameprivate	
void	TokenNamevoid	
saveEntry	TokenNameIdentifier	 save Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
entryKey	TokenNameIdentifier	 entry Key
=	TokenNameEQUAL	
date	TokenNameIdentifier	 date
+	TokenNamePLUS	
author	TokenNameIdentifier	 author
+	TokenNamePLUS	
comment	TokenNameIdentifier	 comment
;	TokenNameSEMICOLON	
CVSEntry	TokenNameIdentifier	 CVS Entry
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
entryKey	TokenNameIdentifier	 entry Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
dateObject	TokenNameIdentifier	 date Object
=	TokenNameEQUAL	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
CVSEntry	TokenNameIdentifier	 CVS Entry
(	TokenNameLPAREN	
dateObject	TokenNameIdentifier	 date Object
,	TokenNameCOMMA	
author	TokenNameIdentifier	 author
,	TokenNameCOMMA	
comment	TokenNameIdentifier	 comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entryKey	TokenNameIdentifier	 entry Key
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CVSEntry	TokenNameIdentifier	 CVS Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entryKey	TokenNameIdentifier	 entry Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
addFile	TokenNameIdentifier	 add File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
revision	TokenNameIdentifier	 revision
,	TokenNameCOMMA	
previousRevision	TokenNameIdentifier	 previous Revision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse date out from expected format. * * @param date the string holding date * @return the date object or null if unknown date format */	TokenNameCOMMENT_JAVADOC	 Parse date out from expected format. * @param date the string holding date @return the date object or null if unknown date format 
private	TokenNameprivate	
Date	TokenNameIdentifier	 Date
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
INPUT_DATE	TokenNameIdentifier	 INPUT  DATE
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
CVS1129_INPUT_DATE	TokenNameIdentifier	 CV S1129  INPUT  DATE
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Invalid date format: "	TokenNameStringLiteral	Invalid date format: 
+	TokenNamePLUS	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset all internal attributes except status. */	TokenNameCOMMENT_JAVADOC	 Reset all internal attributes except status. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
author	TokenNameIdentifier	 author
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
revision	TokenNameIdentifier	 revision
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
previousRevision	TokenNameIdentifier	 previous Revision
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

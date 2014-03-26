/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * LogTableColumn * * @author Michael J. Sikorsky * @author Brad Marlborough */	TokenNameCOMMENT_JAVADOC	 LogTableColumn * @author Michael J. Sikorsky @author Brad Marlborough 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LogTableColumn	TokenNameIdentifier	 Log Table Column
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4275827753626456547L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// log4j table columns. 	TokenNameCOMMENT_LINE	log4j table columns. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
DATE	TokenNameIdentifier	 DATE
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Date"	TokenNameStringLiteral	Date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
THREAD	TokenNameIdentifier	 THREAD
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Thread"	TokenNameStringLiteral	Thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
MESSAGE_NUM	TokenNameIdentifier	 MESSAGE  NUM
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Message #"	TokenNameStringLiteral	Message #
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
LEVEL	TokenNameIdentifier	 LEVEL
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Level"	TokenNameStringLiteral	Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
NDC	TokenNameIdentifier	 NDC
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"NDC"	TokenNameStringLiteral	NDC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
CATEGORY	TokenNameIdentifier	 CATEGORY
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Category"	TokenNameStringLiteral	Category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
MESSAGE	TokenNameIdentifier	 MESSAGE
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Message"	TokenNameStringLiteral	Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
LOCATION	TokenNameIdentifier	 LOCATION
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Location"	TokenNameStringLiteral	Location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
THROWN	TokenNameIdentifier	 THROWN
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
"Thrown"	TokenNameStringLiteral	Thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_log4JColumns	TokenNameIdentifier	 log4 J Columns
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
_logTableColumnMap	TokenNameIdentifier	 log Table Column Map
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
static	TokenNamestatic	
{	TokenNameLBRACE	
_log4JColumns	TokenNameIdentifier	 log4 J Columns
=	TokenNameEQUAL	
new	TokenNamenew	
LogTableColumn	TokenNameIdentifier	 Log Table Column
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
THREAD	TokenNameIdentifier	 THREAD
,	TokenNameCOMMA	
MESSAGE_NUM	TokenNameIdentifier	 MESSAGE  NUM
,	TokenNameCOMMA	
LEVEL	TokenNameIdentifier	 LEVEL
,	TokenNameCOMMA	
NDC	TokenNameIdentifier	 NDC
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
MESSAGE	TokenNameIdentifier	 MESSAGE
,	TokenNameCOMMA	
LOCATION	TokenNameIdentifier	 LOCATION
,	TokenNameCOMMA	
THROWN	TokenNameIdentifier	 THROWN
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
_logTableColumnMap	TokenNameIdentifier	 log Table Column Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
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
_log4JColumns	TokenNameIdentifier	 log4 J Columns
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_logTableColumnMap	TokenNameIdentifier	 log Table Column Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_log4JColumns	TokenNameIdentifier	 log4 J Columns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_log4JColumns	TokenNameIdentifier	 log4 J Columns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Return the Label of the LogLevel. */	TokenNameCOMMENT_JAVADOC	 Return the Label of the LogLevel. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a column label into a LogTableColumn object. * * @param column The label of a level to be converted into a LogTableColumn. * @return LogTableColumn The LogTableColumn with a label equal to column. * @throws LogTableColumnFormatException Is thrown when the column can not be * converted into a LogTableColumn. */	TokenNameCOMMENT_JAVADOC	 Convert a column label into a LogTableColumn object. * @param column The label of a level to be converted into a LogTableColumn. @return LogTableColumn The LogTableColumn with a label equal to column. @throws LogTableColumnFormatException Is thrown when the column can not be converted into a LogTableColumn. 
public	TokenNamepublic	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
throws	TokenNamethrows	
LogTableColumnFormatException	TokenNameIdentifier	 Log Table Column Format Exception
{	TokenNameLBRACE	
LogTableColumn	TokenNameIdentifier	 Log Table Column
tableColumn	TokenNameIdentifier	 table Column
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tableColumn	TokenNameIdentifier	 table Column
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogTableColumn	TokenNameIdentifier	 Log Table Column
)	TokenNameRPAREN	
_logTableColumnMap	TokenNameIdentifier	 log Table Column Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tableColumn	TokenNameIdentifier	 table Column
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Error while trying to parse ("	TokenNameStringLiteral	Error while trying to parse (
+	TokenNamePLUS	
column	TokenNameIdentifier	 column
+	TokenNamePLUS	
") into"	TokenNameStringLiteral	) into
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" a LogTableColumn."	TokenNameStringLiteral	 a LogTableColumn.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
LogTableColumnFormatException	TokenNameIdentifier	 Log Table Column Format Exception
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tableColumn	TokenNameIdentifier	 table Column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
LogTableColumn	TokenNameIdentifier	 Log Table Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogTableColumn	TokenNameIdentifier	 Log Table Column
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
equals	TokenNameIdentifier	 equals
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_label	TokenNameIdentifier	 label
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A <code>List</code> of <code>LogTableColumn/code> objects that map * to log4j <code>Column</code> objects. */	TokenNameCOMMENT_JAVADOC	 @return A <code>List</code> of <code>LogTableColumn/code> objects that map to log4j <code>Column</code> objects. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
getLogTableColumns	TokenNameIdentifier	 get Log Table Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
_log4JColumns	TokenNameIdentifier	 log4 J Columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
LogTableColumn	TokenNameIdentifier	 Log Table Column
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLogTableColumnArray	TokenNameIdentifier	 get Log Table Column Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_log4JColumns	TokenNameIdentifier	 log4 J Columns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	

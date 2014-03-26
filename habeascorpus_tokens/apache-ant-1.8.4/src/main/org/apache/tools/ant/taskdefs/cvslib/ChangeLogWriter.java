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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
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
Enumeration	TokenNameIdentifier	 Enumeration
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
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
DOMUtils	TokenNameIdentifier	 DOM Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Class used to generate an XML changelog. * */	TokenNameCOMMENT_JAVADOC	 Class used to generate an XML changelog. 
public	TokenNamepublic	
class	TokenNameclass	
ChangeLogWriter	TokenNameIdentifier	 Change Log Writer
{	TokenNameLBRACE	
/** output format for dates written to xml file */	TokenNameCOMMENT_JAVADOC	 output format for dates written to xml file 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
OUTPUT_DATE	TokenNameIdentifier	 OUTPUT  DATE
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd"	TokenNameStringLiteral	yyyy-MM-dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** output format for times written to xml file */	TokenNameCOMMENT_JAVADOC	 output format for times written to xml file 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
OUTPUT_TIME	TokenNameIdentifier	 OUTPUT  TIME
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm"	TokenNameStringLiteral	HH:mm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** stateless helper for writing the XML document */	TokenNameCOMMENT_JAVADOC	 stateless helper for writing the XML document 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
DOM_WRITER	TokenNameIdentifier	 DOM  WRITER
=	TokenNameEQUAL	
new	TokenNamenew	
DOMElementWriter	TokenNameIdentifier	 DOM Element Writer
(	TokenNameLPAREN	
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
OUTPUT_DATE	TokenNameIdentifier	 OUTPUT  DATE
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OUTPUT_TIME	TokenNameIdentifier	 OUTPUT  TIME
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
utc	TokenNameIdentifier	 utc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print out the specified entries. * * @param output writer to which to send output. * @param entries the entries to be written. */	TokenNameCOMMENT_JAVADOC	 Print out the specified entries. * @param output writer to which to send output. @param entries the entries to be written. 
public	TokenNamepublic	
void	TokenNamevoid	
printChangeLog	TokenNameIdentifier	 print Change Log
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
final	TokenNamefinal	
CVSEntry	TokenNameIdentifier	 CVS Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<?xml version="1.0" encoding="UTF-8"?>"	TokenNameStringLiteral	<?xml version="1.0" encoding="UTF-8"?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"changelog"	TokenNameStringLiteral	changelog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOM_WRITER	TokenNameIdentifier	 DOM  WRITER
.	TokenNameDOT	
openElement	TokenNameIdentifier	 open Element
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
println	TokenNameIdentifier	 println
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
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CVSEntry	TokenNameIdentifier	 CVS Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
printEntry	TokenNameIdentifier	 print Entry
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DOM_WRITER	TokenNameIdentifier	 DOM  WRITER
.	TokenNameDOT	
closeElement	TokenNameIdentifier	 close Element
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print out an individual entry in changelog. * * @param doc Document used to create elements. * @param entry the entry to print * @param output writer to which to send output. */	TokenNameCOMMENT_JAVADOC	 Print out an individual entry in changelog. * @param doc Document used to create elements. @param entry the entry to print @param output writer to which to send output. 
private	TokenNameprivate	
void	TokenNamevoid	
printEntry	TokenNameIdentifier	 print Entry
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
final	TokenNamefinal	
CVSEntry	TokenNameIdentifier	 CVS Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
ent	TokenNameIdentifier	 ent
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
"entry"	TokenNameStringLiteral	entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendTextElement	TokenNameIdentifier	 append Text Element
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
,	TokenNameCOMMA	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
OUTPUT_DATE	TokenNameIdentifier	 OUTPUT  DATE
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendTextElement	TokenNameIdentifier	 append Text Element
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
,	TokenNameCOMMA	
"time"	TokenNameStringLiteral	time
,	TokenNameCOMMA	
OUTPUT_TIME	TokenNameIdentifier	 OUTPUT  TIME
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendCDATAElement	TokenNameIdentifier	 append CDATA Element
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
,	TokenNameCOMMA	
"author"	TokenNameStringLiteral	author
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getFiles	TokenNameIdentifier	 get Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
RCSFile	TokenNameIdentifier	 RCS File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RCSFile	TokenNameIdentifier	 RCS File
)	TokenNameRPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
createChildElement	TokenNameIdentifier	 create Child Element
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
,	TokenNameCOMMA	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendCDATAElement	TokenNameIdentifier	 append CDATA Element
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendTextElement	TokenNameIdentifier	 append Text Element
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"revision"	TokenNameStringLiteral	revision
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getRevision	TokenNameIdentifier	 get Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
previousRevision	TokenNameIdentifier	 previous Revision
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPreviousRevision	TokenNameIdentifier	 get Previous Revision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
previousRevision	TokenNameIdentifier	 previous Revision
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendTextElement	TokenNameIdentifier	 append Text Element
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"prevrevision"	TokenNameStringLiteral	prevrevision
,	TokenNameCOMMA	
previousRevision	TokenNameIdentifier	 previous Revision
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
appendCDATAElement	TokenNameIdentifier	 append CDATA Element
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
,	TokenNameCOMMA	
"msg"	TokenNameStringLiteral	msg
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getComment	TokenNameIdentifier	 get Comment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOM_WRITER	TokenNameIdentifier	 DOM  WRITER
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ent	TokenNameIdentifier	 ent
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

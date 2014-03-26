/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
chainsaw	TokenNameIdentifier	 chainsaw
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MessageFormat	TokenNameIdentifier	 Message Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
BorderFactory	TokenNameIdentifier	 Border Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JEditorPane	TokenNameIdentifier	 J Editor Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTable	TokenNameIdentifier	 J Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ListSelectionEvent	TokenNameIdentifier	 List Selection Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ListSelectionListener	TokenNameIdentifier	 List Selection Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * A panel for showing a stack trace. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> */	TokenNameCOMMENT_JAVADOC	 A panel for showing a stack trace. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> 
class	TokenNameclass	
DetailPanel	TokenNameIdentifier	 Detail Panel
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
implements	TokenNameimplements	
ListSelectionListener	TokenNameIdentifier	 List Selection Listener
{	TokenNameLBRACE	
/** used to log events **/	TokenNameCOMMENT_JAVADOC	 used to log events *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
DetailPanel	TokenNameIdentifier	 Detail Panel
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** used to format the logging event **/	TokenNameCOMMENT_JAVADOC	 used to format the logging event *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
MessageFormat	TokenNameIdentifier	 Message Format
FORMATTER	TokenNameIdentifier	 FORMATTER
=	TokenNameEQUAL	
new	TokenNamenew	
MessageFormat	TokenNameIdentifier	 Message Format
(	TokenNameLPAREN	
"<b>Time:</b> <code>{0,time,medium}</code>"	TokenNameStringLiteral	<b>Time:</b> <code>{0,time,medium}</code>
+	TokenNamePLUS	
"&nbsp;&nbsp;<b>Priority:</b> <code>{1}</code>"	TokenNameStringLiteral	&nbsp;&nbsp;<b>Priority:</b> <code>{1}</code>
+	TokenNamePLUS	
"&nbsp;&nbsp;<b>Thread:</b> <code>{2}</code>"	TokenNameStringLiteral	&nbsp;&nbsp;<b>Thread:</b> <code>{2}</code>
+	TokenNamePLUS	
"&nbsp;&nbsp;<b>NDC:</b> <code>{3}</code>"	TokenNameStringLiteral	&nbsp;&nbsp;<b>NDC:</b> <code>{3}</code>
+	TokenNamePLUS	
"<br><b>Logger:</b> <code>{4}</code>"	TokenNameStringLiteral	<br><b>Logger:</b> <code>{4}</code>
+	TokenNamePLUS	
"<br><b>Location:</b> <code>{5}</code>"	TokenNameStringLiteral	<br><b>Location:</b> <code>{5}</code>
+	TokenNamePLUS	
"<br><b>Message:</b>"	TokenNameStringLiteral	<br><b>Message:</b>
+	TokenNamePLUS	
"<pre>{6}</pre>"	TokenNameStringLiteral	<pre>{6}</pre>
+	TokenNamePLUS	
"<b>Throwable:</b>"	TokenNameStringLiteral	<b>Throwable:</b>
+	TokenNamePLUS	
"<pre>{7}</pre>"	TokenNameStringLiteral	<pre>{7}</pre>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** the model for the data to render **/	TokenNameCOMMENT_JAVADOC	 the model for the data to render *
private	TokenNameprivate	
final	TokenNamefinal	
MyTableModel	TokenNameIdentifier	 My Table Model
mModel	TokenNameIdentifier	 m Model
;	TokenNameSEMICOLON	
/** pane for rendering detail **/	TokenNameCOMMENT_JAVADOC	 pane for rendering detail *
private	TokenNameprivate	
final	TokenNamefinal	
JEditorPane	TokenNameIdentifier	 J Editor Pane
mDetails	TokenNameIdentifier	 m Details
;	TokenNameSEMICOLON	
/** * Creates a new <code>DetailPanel</code> instance. * * @param aTable the table to listen for selections on * @param aModel the model backing the table */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>DetailPanel</code> instance. * @param aTable the table to listen for selections on @param aModel the model backing the table 
DetailPanel	TokenNameIdentifier	 Detail Panel
(	TokenNameLPAREN	
JTable	TokenNameIdentifier	 J Table
aTable	TokenNameIdentifier	 a Table
,	TokenNameCOMMA	
final	TokenNamefinal	
MyTableModel	TokenNameIdentifier	 My Table Model
aModel	TokenNameIdentifier	 a Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mModel	TokenNameIdentifier	 m Model
=	TokenNameEQUAL	
aModel	TokenNameIdentifier	 a Model
;	TokenNameSEMICOLON	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
BorderFactory	TokenNameIdentifier	 Border Factory
.	TokenNameDOT	
createTitledBorder	TokenNameIdentifier	 create Titled Border
(	TokenNameLPAREN	
"Details: "	TokenNameStringLiteral	Details: 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mDetails	TokenNameIdentifier	 m Details
=	TokenNameEQUAL	
new	TokenNamenew	
JEditorPane	TokenNameIdentifier	 J Editor Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mDetails	TokenNameIdentifier	 m Details
.	TokenNameDOT	
setEditable	TokenNameIdentifier	 set Editable
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mDetails	TokenNameIdentifier	 m Details
.	TokenNameDOT	
setContentType	TokenNameIdentifier	 set Content Type
(	TokenNameLPAREN	
"text/html"	TokenNameStringLiteral	text/html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
mDetails	TokenNameIdentifier	 m Details
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
rowSM	TokenNameIdentifier	 row SM
=	TokenNameEQUAL	
aTable	TokenNameIdentifier	 a Table
.	TokenNameDOT	
getSelectionModel	TokenNameIdentifier	 get Selection Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rowSM	TokenNameIdentifier	 row SM
.	TokenNameDOT	
addListSelectionListener	TokenNameIdentifier	 add List Selection Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see ListSelectionListener **/	TokenNameCOMMENT_JAVADOC	 @see ListSelectionListener *
public	TokenNamepublic	
void	TokenNamevoid	
valueChanged	TokenNameIdentifier	 value Changed
(	TokenNameLPAREN	
ListSelectionEvent	TokenNameIdentifier	 List Selection Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Ignore extra messages. 	TokenNameCOMMENT_LINE	Ignore extra messages. 
if	TokenNameif	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getValueIsAdjusting	TokenNameIdentifier	 get Value Is Adjusting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
lsm	TokenNameIdentifier	 lsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
)	TokenNameRPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lsm	TokenNameIdentifier	 lsm
.	TokenNameDOT	
isSelectionEmpty	TokenNameIdentifier	 is Selection Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mDetails	TokenNameIdentifier	 m Details
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"Nothing selected"	TokenNameStringLiteral	Nothing selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
selectedRow	TokenNameIdentifier	 selected Row
=	TokenNameEQUAL	
lsm	TokenNameIdentifier	 lsm
.	TokenNameDOT	
getMinSelectionIndex	TokenNameIdentifier	 get Min Selection Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
mModel	TokenNameIdentifier	 m Model
.	TokenNameDOT	
getEventDetails	TokenNameIdentifier	 get Event Details
(	TokenNameLPAREN	
selectedRow	TokenNameIdentifier	 selected Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCategoryName	TokenNameIdentifier	 get Category Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocationDetails	TokenNameIdentifier	 get Location Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
mDetails	TokenNameIdentifier	 m Details
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
FORMATTER	TokenNameIdentifier	 FORMATTER
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mDetails	TokenNameIdentifier	 m Details
.	TokenNameDOT	
setCaretPosition	TokenNameIdentifier	 set Caret Position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
/** * Returns a string representation of a throwable. * * @param aEvent contains the throwable information * @return a <code>String</code> value */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of a throwable. * @param aEvent contains the throwable information @return a <code>String</code> value 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strs	TokenNameIdentifier	 strs
=	TokenNameEQUAL	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strs	TokenNameIdentifier	 strs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
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
strs	TokenNameIdentifier	 strs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
strs	TokenNameIdentifier	 strs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Escape &lt;, &gt; &amp; and &quot; as their entities. It is very * dumb about &amp; handling. * @param aStr the String to escape. * @return the escaped String */	TokenNameCOMMENT_JAVADOC	 Escape &lt;, &gt; &amp; and &quot; as their entities. It is very dumb about &amp; handling. @param aStr the String to escape. @return the escaped String 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aStr	TokenNameIdentifier	 a Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aStr	TokenNameIdentifier	 a Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
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
aStr	TokenNameIdentifier	 a Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
aStr	TokenNameIdentifier	 a Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'\"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

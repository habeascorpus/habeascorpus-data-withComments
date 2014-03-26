/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Image	TokenNameIdentifier	 Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Toolkit	TokenNameIdentifier	 Toolkit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
StyledDocument	TokenNameIdentifier	 Styled Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
StyleConstants	TokenNameIdentifier	 Style Constants
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
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LogTextPanel	TokenNameIdentifier	 Log Text Panel
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
{	TokenNameLBRACE	
private	TokenNameprivate	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
scrollBar	TokenNameIdentifier	 scroll Bar
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JTextPane	TokenNameIdentifier	 J Text Pane
textPane	TokenNameIdentifier	 text Pane
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JCheckBox	TokenNameIdentifier	 J Check Box
cbxTail	TokenNameIdentifier	 cbx Tail
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StyledDocument	TokenNameIdentifier	 Styled Document
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
fontAttributes	TokenNameIdentifier	 font Attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
eventBufferMaxSize	TokenNameIdentifier	 event Buffer Max Size
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
eventBuffer	TokenNameIdentifier	 event Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
eventBufferMaxSize	TokenNameIdentifier	 event Buffer Max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
eventViewIndex	TokenNameIdentifier	 event View Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogTextPanel	TokenNameIdentifier	 Log Text Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
constructComponents	TokenNameIdentifier	 construct Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createDefaultFontAttributes	TokenNameIdentifier	 create Default Font Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
constructComponents	TokenNameIdentifier	 construct Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// setup the panel's additional components... 	TokenNameCOMMENT_LINE	setup the panel's additional components... 
this	TokenNamethis	
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cbxTail	TokenNameIdentifier	 cbx Tail
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cbxTail	TokenNameIdentifier	 cbx Tail
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cbxTail	TokenNameIdentifier	 cbx Tail
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"Tail log events"	TokenNameStringLiteral	Tail log events
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
bottomPanel	TokenNameIdentifier	 bottom Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bottomPanel	TokenNameIdentifier	 bottom Panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cbxTail	TokenNameIdentifier	 cbx Tail
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textPane	TokenNameIdentifier	 text Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JTextPane	TokenNameIdentifier	 J Text Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
setEditable	TokenNameIdentifier	 set Editable
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
getStyledDocument	TokenNameIdentifier	 get Styled Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scrollBar	TokenNameIdentifier	 scroll Bar
=	TokenNameEQUAL	
new	TokenNamenew	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
(	TokenNameLPAREN	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
.	TokenNameDOT	
VERTICAL	TokenNameIdentifier	 VERTICAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bottomPanel	TokenNameIdentifier	 bottom Panel
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
SOUTH	TokenNameIdentifier	 SOUTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
scrollBar	TokenNameIdentifier	 scroll Bar
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
EAST	TokenNameIdentifier	 EAST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
textPane	TokenNameIdentifier	 text Pane
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTextBackground	TokenNameIdentifier	 set Text Background
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
setBackground	TokenNameIdentifier	 set Background
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTextBackground	TokenNameIdentifier	 set Text Background
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
setBackground	TokenNameIdentifier	 set Background
(	TokenNameLPAREN	
parseColor	TokenNameIdentifier	 parse Color
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createDefaultFontAttributes	TokenNameIdentifier	 create Default Font Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Priority	TokenNameIdentifier	 Priority
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prio	TokenNameIdentifier	 prio
=	TokenNameEQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
getAllPossiblePriorities	TokenNameIdentifier	 get All Possible Priorities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontAttributes	TokenNameIdentifier	 font Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
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
prio	TokenNameIdentifier	 prio
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//StyleConstants.setFontSize(att,11); 	TokenNameCOMMENT_LINE	StyleConstants.setFontSize(att,11); 
}	TokenNameRBRACE	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
red	TokenNameIdentifier	 red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
magenta	TokenNameIdentifier	 magenta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
orange	TokenNameIdentifier	 orange
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Color	TokenNameIdentifier	 Color
parseColor	TokenNameIdentifier	 parse Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StyleConstants	TokenNameIdentifier	 Style Constants
.	TokenNameDOT	
setForeground	TokenNameIdentifier	 set Foreground
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
)	TokenNameRPAREN	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseColor	TokenNameIdentifier	 parse Color
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTextColor	TokenNameIdentifier	 set Text Color
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StyleConstants	TokenNameIdentifier	 Style Constants
.	TokenNameDOT	
setForeground	TokenNameIdentifier	 set Foreground
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
)	TokenNameRPAREN	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTextFontSize	TokenNameIdentifier	 set Text Font Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StyleConstants	TokenNameIdentifier	 Style Constants
.	TokenNameDOT	
setFontSize	TokenNameIdentifier	 set Font Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTextFontName	TokenNameIdentifier	 set Text Font Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StyleConstants	TokenNameIdentifier	 Style Constants
.	TokenNameDOT	
setFontFamily	TokenNameIdentifier	 set Font Family
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setEventBufferSize	TokenNameIdentifier	 set Event Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventBufferMaxSize	TokenNameIdentifier	 event Buffer Max Size
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
newEvents	TokenNameIdentifier	 new Events
(	TokenNameLPAREN	
EventBufferElement	TokenNameIdentifier	 Event Buffer Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
evts	TokenNameIdentifier	 evts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
evts	TokenNameIdentifier	 evts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
eventBufferMaxSize	TokenNameIdentifier	 event Buffer Max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
evts	TokenNameIdentifier	 evts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
eventViewIndex	TokenNameIdentifier	 event View Index
-=	TokenNameMINUS_EQUAL	
evts	TokenNameIdentifier	 evts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eventViewIndex	TokenNameIdentifier	 event View Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
eventViewIndex	TokenNameIdentifier	 event View Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
evts	TokenNameIdentifier	 evts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
evts	TokenNameIdentifier	 evts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxR	TokenNameIdentifier	 max R
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cbxTail	TokenNameIdentifier	 cbx Tail
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventViewIndex	TokenNameIdentifier	 event View Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
maxR	TokenNameIdentifier	 max R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only redraw if new line is visible... 	TokenNameCOMMENT_LINE	only redraw if new line is visible... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxR	TokenNameIdentifier	 max R
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
eventViewIndex	TokenNameIdentifier	 event View Index
&&	TokenNameAND_AND	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
eventViewIndex	TokenNameIdentifier	 event View Index
+	TokenNamePLUS	
maxR	TokenNameIdentifier	 max R
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
drawText	TokenNameIdentifier	 draw Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
maxR	TokenNameIdentifier	 max R
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
drawText	TokenNameIdentifier	 draw Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxR	TokenNameIdentifier	 max R
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
maxR	TokenNameIdentifier	 max R
=	TokenNameEQUAL	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
getFontMetrics	TokenNameIdentifier	 get Font Metrics
(	TokenNameLPAREN	
textPane	TokenNameIdentifier	 text Pane
.	TokenNameDOT	
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
eventViewIndex	TokenNameIdentifier	 event View Index
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
eventViewIndex	TokenNameIdentifier	 event View Index
+	TokenNamePLUS	
maxR	TokenNameIdentifier	 max R
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
EventBufferElement	TokenNameIdentifier	 Event Buffer Element
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventBufferElement	TokenNameIdentifier	 Event Buffer Element
)	TokenNameRPAREN	
eventBuffer	TokenNameIdentifier	 event Buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
insertString	TokenNameIdentifier	 insert String
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
(	TokenNameLPAREN	
MutableAttributeSet	TokenNameIdentifier	 Mutable Attribute Set
)	TokenNameRPAREN	
fontAttributes	TokenNameIdentifier	 font Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
prio	TokenNameIdentifier	 prio
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

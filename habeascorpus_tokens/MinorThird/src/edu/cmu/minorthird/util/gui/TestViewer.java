package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Some test cases for viewers. * * @author William cohen * */	TokenNameCOMMENT_JAVADOC	 Some test cases for viewers. * @author William cohen 
public	TokenNamepublic	
class	TokenNameclass	
TestViewer	TokenNameIdentifier	 Test Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Viewer	TokenNameIdentifier	 Viewer
parallelStringViewer	TokenNameIdentifier	 parallel String Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
lc	TokenNameIdentifier	 lc
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentViewer	TokenNameIdentifier	 Component Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"converting "	TokenNameStringLiteral	converting 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" to lower case!"	TokenNameStringLiteral	 to lower case!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JTextArea	TokenNameIdentifier	 J Text Area
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
uc	TokenNameIdentifier	 uc
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentViewer	TokenNameIdentifier	 Component Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"converting "	TokenNameStringLiteral	converting 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" to upper case!"	TokenNameStringLiteral	 to upper case!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JTextArea	TokenNameIdentifier	 J Text Area
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
van	TokenNameIdentifier	 van
=	TokenNameEQUAL	
new	TokenNamenew	
VanillaViewer	TokenNameIdentifier	 Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
par	TokenNameIdentifier	 par
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Original"	TokenNameStringLiteral	Original
,	TokenNameCOMMA	
van	TokenNameIdentifier	 van
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"LowerCase"	TokenNameStringLiteral	LowerCase
,	TokenNameCOMMA	
lc	TokenNameIdentifier	 lc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
par	TokenNameIdentifier	 par
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"UpperCase"	TokenNameStringLiteral	UpperCase
,	TokenNameCOMMA	
uc	TokenNameIdentifier	 uc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
par	TokenNameIdentifier	 par
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Viewer	TokenNameIdentifier	 Viewer
indexViewer	TokenNameIdentifier	 index Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Hurst"	TokenNameStringLiteral	Hurst
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Matthew"	TokenNameStringLiteral	Matthew
,	TokenNameCOMMA	
"Wakako"	TokenNameStringLiteral	Wakako
,	TokenNameCOMMA	
"Hannah"	TokenNameStringLiteral	Hannah
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Cohen"	TokenNameStringLiteral	Cohen
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"William"	TokenNameStringLiteral	William
,	TokenNameCOMMA	
"Susan"	TokenNameStringLiteral	Susan
,	TokenNameCOMMA	
"Joshua"	TokenNameStringLiteral	Joshua
,	TokenNameCOMMA	
"Charlie"	TokenNameStringLiteral	Charlie
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"Tomikoyo"	TokenNameStringLiteral	Tomikoyo
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Takashi"	TokenNameStringLiteral	Takashi
,	TokenNameCOMMA	
"Laura"	TokenNameStringLiteral	Laura
,	TokenNameCOMMA	
"Makoto"	TokenNameStringLiteral	Makoto
,	TokenNameCOMMA	
"TBA"	TokenNameStringLiteral	TBA
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
indexViewer	TokenNameIdentifier	 index Viewer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexedViewer	TokenNameIdentifier	 Indexed Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
TEXT_MESSAGE	TokenNameIdentifier	 TEXT  MESSAGE
,	TokenNameCOMMA	
"displaying the "	TokenNameStringLiteral	displaying the 
+	TokenNamePLUS	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" family"	TokenNameStringLiteral	 family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
lnameListViewer	TokenNameIdentifier	 lname List Viewer
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentViewer	TokenNameIdentifier	 Component Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
JList	TokenNameIdentifier	 J List
jlist	TokenNameIdentifier	 jlist
=	TokenNameEQUAL	
new	TokenNamenew	
JList	TokenNameIdentifier	 J List
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
jlist	TokenNameIdentifier	 jlist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
jlist	TokenNameIdentifier	 jlist
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
lnameListViewer	TokenNameIdentifier	 lname List Viewer
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
familyViewer	TokenNameIdentifier	 family Viewer
=	TokenNameEQUAL	
new	TokenNamenew	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
(	TokenNameLPAREN	
indexViewer	TokenNameIdentifier	 index Viewer
,	TokenNameCOMMA	
parallelStringViewer	TokenNameIdentifier	 parallel String Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
familyViewer	TokenNameIdentifier	 family Viewer
.	TokenNameDOT	
setHorizontal	TokenNameIdentifier	 set Horizontal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MessageViewer	TokenNameIdentifier	 Message Viewer
(	TokenNameLPAREN	
new	TokenNamenew	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
(	TokenNameLPAREN	
lnameListViewer	TokenNameIdentifier	 lname List Viewer
,	TokenNameCOMMA	
familyViewer	TokenNameIdentifier	 family Viewer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
indexViewer	TokenNameIdentifier	 index Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* TransformedViewer v = new TransformedViewer() { public Object transform(Object o) { System.out.println("transforming "+o); return "hello, "+o; } }; v.setSubView( parallelStringViewer() ); v.receiveContent( "world" ); */	TokenNameCOMMENT_BLOCK	 TransformedViewer v = new TransformedViewer() { public Object transform(Object o) { System.out.println("transforming "+o); return "hello, "+o; } }; v.setSubView( parallelStringViewer() ); v.receiveContent( "world" ); 
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
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

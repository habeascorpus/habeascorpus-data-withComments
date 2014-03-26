package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
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
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JLabel	TokenNameIdentifier	 J Label
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
JTextField	TokenNameIdentifier	 J Text Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtil	TokenNameIdentifier	 String Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ComponentViewer	TokenNameIdentifier	 Component Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
Viewer	TokenNameIdentifier	 Viewer
;	TokenNameSEMICOLON	
/** * Support routines for building GUI's to view datasets, instances, and * etc. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Support routines for building GUI's to view datasets, instances, and etc. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
GUI	TokenNameIdentifier	 GUI
{	TokenNameLBRACE	
/** A JComponent holding a very concise rendering of an example. */	TokenNameCOMMENT_JAVADOC	 A JComponent holding a very concise rendering of an example. 
public	TokenNamepublic	
static	TokenNamestatic	
JComponent	TokenNameIdentifier	 J Component
conciseExampleRendererComponent	TokenNameIdentifier	 concise Example Renderer Component
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
boolean	TokenNameboolean	
emphasized	TokenNameIdentifier	 emphasized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
"[null example]"	TokenNameStringLiteral	[null example]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sourceString	TokenNameIdentifier	 source String
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"[null]"	TokenNameStringLiteral	[null]
:	TokenNameCOLON	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JTextField	TokenNameIdentifier	 J Text Field
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
sourceString	TokenNameIdentifier	 source String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Color	TokenNameIdentifier	 Color
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
emphasized	TokenNameIdentifier	 emphasized
?	TokenNameQUESTION	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
blue	TokenNameIdentifier	 blue
:	TokenNameCOLON	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
BorderFactory	TokenNameIdentifier	 Border Factory
.	TokenNameDOT	
createLineBorder	TokenNameIdentifier	 create Line Border
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tf	TokenNameIdentifier	 tf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create and return a viewer which shows features of * an example, plus it's source in another window. */	TokenNameCOMMENT_JAVADOC	 Create and return a viewer which shows features of an example, plus it's source in another window. 
public	TokenNamepublic	
static	TokenNamestatic	
Viewer	TokenNameIdentifier	 Viewer
newSourcedExampleViewer	TokenNameIdentifier	 new Sourced Example Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Features"	TokenNameStringLiteral	Features
,	TokenNameCOMMA	
new	TokenNamenew	
ExampleViewer	TokenNameIdentifier	 Example Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Source"	TokenNameStringLiteral	Source
,	TokenNameCOMMA	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Subpopulation"	TokenNameStringLiteral	Subpopulation
,	TokenNameCOMMA	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Subpopulation ID='"	TokenNameStringLiteral	Subpopulation ID='
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
main	TokenNameIdentifier	 main
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A viewer for examples. */	TokenNameCOMMENT_JAVADOC	 A viewer for examples. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ExampleViewer	TokenNameIdentifier	 Example Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExampleViewer	TokenNameIdentifier	 Example Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExampleViewer	TokenNameIdentifier	 Example Viewer
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
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
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"Class label: "	TokenNameStringLiteral	Class label: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toDetails	TokenNameIdentifier	 to Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
instanceComponent	TokenNameIdentifier	 instance Component
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A viewer for instances */	TokenNameCOMMENT_JAVADOC	 A viewer for instances 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InstanceViewer	TokenNameIdentifier	 Instance Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InstanceViewer	TokenNameIdentifier	 Instance Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstanceViewer	TokenNameIdentifier	 Instance Viewer
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Instance	TokenNameIdentifier	 Instance
)	TokenNameRPAREN	
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
return	TokenNamereturn	
instanceComponent	TokenNameIdentifier	 instance Component
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
JComponent	TokenNameIdentifier	 J Component
instanceComponent	TokenNameIdentifier	 instance Component
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numRows	TokenNameIdentifier	 num Rows
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numRows	TokenNameIdentifier	 num Rows
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableData	TokenNameIdentifier	 table Data
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
numRows	TokenNameIdentifier	 num Rows
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tableData	TokenNameIdentifier	 table Data
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
tableData	TokenNameIdentifier	 table Data
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
columnNames	TokenNameIdentifier	 column Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Feature Name"	TokenNameStringLiteral	Feature Name
,	TokenNameCOMMA	
"Weight"	TokenNameStringLiteral	Weight
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
JTable	TokenNameIdentifier	 J Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
JTable	TokenNameIdentifier	 J Table
(	TokenNameLPAREN	
tableData	TokenNameIdentifier	 table Data
,	TokenNameCOMMA	
columnNames	TokenNameIdentifier	 column Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

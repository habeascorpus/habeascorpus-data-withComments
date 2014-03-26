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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jfree	TokenNameIdentifier	 jfree
.	TokenNameDOT	
chart	TokenNameIdentifier	 chart
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jfree	TokenNameIdentifier	 jfree
.	TokenNameDOT	
chart	TokenNameIdentifier	 chart
.	TokenNameDOT	
plot	TokenNameIdentifier	 plot
.	TokenNameDOT	
PlotOrientation	TokenNameIdentifier	 Plot Orientation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jfree	TokenNameIdentifier	 jfree
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
XYSeries	TokenNameIdentifier	 XY Series
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
jfree	TokenNameIdentifier	 jfree
.	TokenNameDOT	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
XYSeriesCollection	TokenNameIdentifier	 XY Series Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Wraps JFreeChart's XY line graph capability. * * @author William cohen */	TokenNameCOMMENT_JAVADOC	 Wraps JFreeChart's XY line graph capability. * @author William cohen 
public	TokenNamepublic	
class	TokenNameclass	
LineCharter	TokenNameIdentifier	 Line Charter
{	TokenNameLBRACE	
private	TokenNameprivate	
XYSeriesCollection	TokenNameIdentifier	 XY Series Collection
collection	TokenNameIdentifier	 collection
=	TokenNameEQUAL	
new	TokenNamenew	
XYSeriesCollection	TokenNameIdentifier	 XY Series Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XYSeries	TokenNameIdentifier	 XY Series
currentSeries	TokenNameIdentifier	 current Series
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Start a new curve with a given label. */	TokenNameCOMMENT_JAVADOC	 Start a new curve with a given label. 
public	TokenNamepublic	
void	TokenNamevoid	
startCurve	TokenNameIdentifier	 start Curve
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentSeries	TokenNameIdentifier	 current Series
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
addSeries	TokenNameIdentifier	 add Series
(	TokenNameLPAREN	
currentSeries	TokenNameIdentifier	 current Series
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"#begin "	TokenNameStringLiteral	#begin 
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentSeries	TokenNameIdentifier	 current Series
=	TokenNameEQUAL	
new	TokenNamenew	
XYSeries	TokenNameIdentifier	 XY Series
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a point to the current curve. * @param mayDuplicate - there may be points x,y1 and x,y2 in the curve, ie * it might nont be a function. */	TokenNameCOMMENT_JAVADOC	 Add a point to the current curve. @param mayDuplicate - there may be points x,y1 and x,y2 in the curve, ie it might nont be a function. 
public	TokenNamepublic	
void	TokenNamevoid	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mayDuplicate	TokenNameIdentifier	 may Duplicate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentSeries	TokenNameIdentifier	 current Series
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"need to start series before adding points"	TokenNameStringLiteral	need to start series before adding points
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mayDuplicate	TokenNameIdentifier	 may Duplicate
)	TokenNameRPAREN	
currentSeries	TokenNameIdentifier	 current Series
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
0.00001	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
numPoints	TokenNameIdentifier	 num Points
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
currentSeries	TokenNameIdentifier	 current Series
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPoints	TokenNameIdentifier	 num Points
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a point to the current curve. */	TokenNameCOMMENT_JAVADOC	 Add a point to the current curve. 
public	TokenNamepublic	
void	TokenNamevoid	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get a panel showing the curves, with the given axis labels and title. */	TokenNameCOMMENT_JAVADOC	 Get a panel showing the curves, with the given axis labels and title. 
public	TokenNamepublic	
JPanel	TokenNameIdentifier	 J Panel
getPanel	TokenNameIdentifier	 get Panel
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
xlabel	TokenNameIdentifier	 xlabel
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ylabel	TokenNameIdentifier	 ylabel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentSeries	TokenNameIdentifier	 current Series
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
addSeries	TokenNameIdentifier	 add Series
(	TokenNameLPAREN	
currentSeries	TokenNameIdentifier	 current Series
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JPanel	TokenNameIdentifier	 J Panel
mainPanel	TokenNameIdentifier	 main Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
tabbedPane	TokenNameIdentifier	 tabbed Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JFreeChart	TokenNameIdentifier	 J Free Chart
chart	TokenNameIdentifier	 chart
=	TokenNameEQUAL	
ChartFactory	TokenNameIdentifier	 Chart Factory
.	TokenNameDOT	
createXYLineChart	TokenNameIdentifier	 create XY Line Chart
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
xlabel	TokenNameIdentifier	 xlabel
,	TokenNameCOMMA	
ylabel	TokenNameIdentifier	 ylabel
,	TokenNameCOMMA	
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
PlotOrientation	TokenNameIdentifier	 Plot Orientation
.	TokenNameDOT	
VERTICAL	TokenNameIdentifier	 VERTICAL
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tabbedPane	TokenNameIdentifier	 tabbed Pane
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Graphics"	TokenNameStringLiteral	Graphics
,	TokenNameCOMMA	
new	TokenNamenew	
ChartPanel	TokenNameIdentifier	 Chart Panel
(	TokenNameLPAREN	
chart	TokenNameIdentifier	 chart
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tabbedPane	TokenNameIdentifier	 tabbed Pane
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Text"	TokenNameStringLiteral	Text
,	TokenNameCOMMA	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
new	TokenNamenew	
JTextArea	TokenNameIdentifier	 J Text Area
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
xlabel	TokenNameIdentifier	 xlabel
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
ylabel	TokenNameIdentifier	 ylabel
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainPanel	TokenNameIdentifier	 main Panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tabbedPane	TokenNameIdentifier	 tabbed Pane
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mainPanel	TokenNameIdentifier	 main Panel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

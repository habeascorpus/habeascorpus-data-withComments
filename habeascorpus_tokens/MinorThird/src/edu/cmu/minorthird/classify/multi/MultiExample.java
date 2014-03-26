package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
multi	TokenNameIdentifier	 multi
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
ClassLabel	TokenNameIdentifier	 Class Label
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Example	TokenNameIdentifier	 Example
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Instance	TokenNameIdentifier	 Instance
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
/** * An instance that is associated with a ClassLabel. Implements the Instance * interface by delegating to a wrapped Instance, so subclasses just need to * attach the right label construct. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 An instance that is associated with a ClassLabel. Implements the Instance interface by delegating to a wrapped Instance, so subclasses just need to attach the right label construct. * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
MultiExample	TokenNameIdentifier	 Multi Example
extends	TokenNameextends	
Example	TokenNameIdentifier	 Example
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080125L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// overwrites Example.label 	TokenNameCOMMENT_LINE	overwrites Example.label 
protected	TokenNameprotected	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiExample	TokenNameIdentifier	 Multi Example
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MultiExample	TokenNameIdentifier	 Multi Example
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the first label */	TokenNameCOMMENT_JAVADOC	 Returns the first label 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the label associated with the underlying object */	TokenNameCOMMENT_JAVADOC	 get the label associated with the underlying object 
public	TokenNamepublic	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
getMultiLabel	TokenNameIdentifier	 get Multi Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns this MultiExample as separate Example's */	TokenNameCOMMENT_JAVADOC	 Returns this MultiExample as separate Example's 
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExamples	TokenNameIdentifier	 get Examples
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
examples	TokenNameIdentifier	 examples
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
labels	TokenNameIdentifier	 labels
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
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
examples	TokenNameIdentifier	 examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
examples	TokenNameIdentifier	 examples
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a viewer */	TokenNameCOMMENT_JAVADOC	 Create a viewer 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GUI	TokenNameIdentifier	 GUI
.	TokenNameDOT	
MultiExampleViewer	TokenNameIdentifier	 Multi Example Viewer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

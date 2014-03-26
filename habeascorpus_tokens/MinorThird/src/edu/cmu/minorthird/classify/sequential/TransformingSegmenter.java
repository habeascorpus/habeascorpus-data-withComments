package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
sequential	TokenNameIdentifier	 sequential
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
BoxLayout	TokenNameIdentifier	 Box Layout
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
border	TokenNameIdentifier	 border
.	TokenNameDOT	
TitledBorder	TokenNameIdentifier	 Titled Border
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
InstanceTransform	TokenNameIdentifier	 Instance Transform
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
Viewer	TokenNameIdentifier	 Viewer
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
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/*package*/	TokenNameCOMMENT_BLOCK	package
class	TokenNameclass	
TransformingSegmenter	TokenNameIdentifier	 Transforming Segmenter
implements	TokenNameimplements	
Segmenter	TokenNameIdentifier	 Segmenter
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InstanceTransform	TokenNameIdentifier	 Instance Transform
instanceTransform	TokenNameIdentifier	 instance Transform
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Segmenter	TokenNameIdentifier	 Segmenter
segmenter	TokenNameIdentifier	 segmenter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TransformingSegmenter	TokenNameIdentifier	 Transforming Segmenter
(	TokenNameLPAREN	
InstanceTransform	TokenNameIdentifier	 Instance Transform
instanceTransform	TokenNameIdentifier	 instance Transform
,	TokenNameCOMMA	
Segmenter	TokenNameIdentifier	 Segmenter
segmenter	TokenNameIdentifier	 segmenter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
instanceTransform	TokenNameIdentifier	 instance Transform
=	TokenNameEQUAL	
instanceTransform	TokenNameIdentifier	 instance Transform
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segmenter	TokenNameIdentifier	 segmenter
=	TokenNameEQUAL	
segmenter	TokenNameIdentifier	 segmenter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Segmentation	TokenNameIdentifier	 Segmentation
segmentation	TokenNameIdentifier	 segmentation
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmenter	TokenNameIdentifier	 segmenter
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
(	TokenNameLPAREN	
new	TokenNamenew	
SegmentTransform	TokenNameIdentifier	 Segment Transform
(	TokenNameLPAREN	
instanceTransform	TokenNameIdentifier	 instance Transform
)	TokenNameRPAREN	
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"not implemented"	TokenNameStringLiteral	not implemented
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
v	TokenNameIdentifier	 v
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
20080207L	TokenNameLongLiteral	
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
TransformingSegmenter	TokenNameIdentifier	 Transforming Segmenter
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformingSegmenter	TokenNameIdentifier	 Transforming Segmenter
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
mainPanel	TokenNameIdentifier	 main Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainPanel	TokenNameIdentifier	 main Panel
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
BoxLayout	TokenNameIdentifier	 Box Layout
(	TokenNameLPAREN	
mainPanel	TokenNameIdentifier	 main Panel
,	TokenNameCOMMA	
BoxLayout	TokenNameIdentifier	 Box Layout
.	TokenNameDOT	
Y_AXIS	TokenNameIdentifier	 Y  AXIS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainPanel	TokenNameIdentifier	 main Panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"TransformingSegmenter"	TokenNameStringLiteral	TransformingSegmenter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JLabel	TokenNameIdentifier	 J Label
subView1	TokenNameIdentifier	 sub View1
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
instanceTransform	TokenNameIdentifier	 instance Transform
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
subView2	TokenNameIdentifier	 sub View2
=	TokenNameEQUAL	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
segmenter	TokenNameIdentifier	 segmenter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//subView1.setSuperView(this); 	TokenNameCOMMENT_LINE	subView1.setSuperView(this); 
subView2	TokenNameIdentifier	 sub View2
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainPanel	TokenNameIdentifier	 main Panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subView1	TokenNameIdentifier	 sub View1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainPanel	TokenNameIdentifier	 main Panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subView2	TokenNameIdentifier	 sub View2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
mainPanel	TokenNameIdentifier	 main Panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

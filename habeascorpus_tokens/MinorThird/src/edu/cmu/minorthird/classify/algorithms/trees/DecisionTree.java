package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
trees	TokenNameIdentifier	 trees
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
JComponent	TokenNameIdentifier	 J Component
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
JTree	TokenNameIdentifier	 J Tree
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
TreeSelectionEvent	TokenNameIdentifier	 Tree Selection Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
TreeSelectionListener	TokenNameIdentifier	 Tree Selection Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
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
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
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
Explanation	TokenNameIdentifier	 Explanation
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
Feature	TokenNameIdentifier	 Feature
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
/** * A decision tree. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A decision tree. * @author William Cohen 
/* package */	TokenNameCOMMENT_BLOCK	 package 
abstract	TokenNameabstract	
class	TokenNameclass	
DecisionTree	TokenNameIdentifier	 Decision Tree
extends	TokenNameextends	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080609L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Print routine */	TokenNameCOMMENT_JAVADOC	 Print routine 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
tab	TokenNameIdentifier	 tab
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
tab	TokenNameIdentifier	 tab
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"| "	TokenNameStringLiteral	| 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
instanceof	TokenNameinstanceof	
InternalNode	TokenNameIdentifier	 Internal Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InternalNode	TokenNameIdentifier	 Internal Node
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InternalNode	TokenNameIdentifier	 Internal Node
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
">="	TokenNameStringLiteral	>=
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// in.getTrueBranch().toString(buf,tab+1); 	TokenNameCOMMENT_LINE	in.getTrueBranch().toString(buf,tab+1); 
// in.getFalseBranch().toString(buf,tab+1); 	TokenNameCOMMENT_LINE	in.getFalseBranch().toString(buf,tab+1); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Leaf	TokenNameIdentifier	 Leaf
leaf	TokenNameIdentifier	 leaf
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An internal node of a decision tree. */	TokenNameCOMMENT_JAVADOC	 An internal node of a decision tree. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InternalNode	TokenNameIdentifier	 Internal Node
extends	TokenNameextends	
DecisionTree	TokenNameIdentifier	 Decision Tree
implements	TokenNameimplements	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080609L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Feature	TokenNameIdentifier	 Feature
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DecisionTree	TokenNameIdentifier	 Decision Tree
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
ifFalse	TokenNameIdentifier	 if False
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InternalNode	TokenNameIdentifier	 Internal Node
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
DecisionTree	TokenNameIdentifier	 Decision Tree
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
DecisionTree	TokenNameIdentifier	 Decision Tree
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InternalNode	TokenNameIdentifier	 Internal Node
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
,	TokenNameCOMMA	
DecisionTree	TokenNameIdentifier	 Decision Tree
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
DecisionTree	TokenNameIdentifier	 Decision Tree
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ifTrue	TokenNameIdentifier	 if True
=	TokenNameEQUAL	
ifTrue	TokenNameIdentifier	 if True
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ifFalse	TokenNameIdentifier	 if False
=	TokenNameEQUAL	
ifFalse	TokenNameIdentifier	 if False
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
+	TokenNamePLUS	
">="	TokenNameStringLiteral	>=
+	TokenNamePLUS	
threshold	TokenNameIdentifier	 threshold
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
ifTrue	TokenNameIdentifier	 if True
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
threshold	TokenNameIdentifier	 threshold
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
ifFalse	TokenNameIdentifier	 if False
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"DecisionTree Explanation"	TokenNameStringLiteral	DecisionTree Explanation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
+	TokenNamePLUS	
">="	TokenNameStringLiteral	>=
+	TokenNamePLUS	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
childEx	TokenNameIdentifier	 child Ex
=	TokenNameEQUAL	
ifTrue	TokenNameIdentifier	 if True
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
childEx	TokenNameIdentifier	 child Ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
childEx	TokenNameIdentifier	 child Ex
=	TokenNameEQUAL	
ifFalse	TokenNameIdentifier	 if False
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
childEx	TokenNameIdentifier	 child Ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
return	TokenNamereturn	
ifTrue	TokenNameIdentifier	 if True
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
ifFalse	TokenNameIdentifier	 if False
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecisionTree	TokenNameIdentifier	 Decision Tree
getTrueBranch	TokenNameIdentifier	 get True Branch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ifTrue	TokenNameIdentifier	 if True
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecisionTree	TokenNameIdentifier	 Decision Tree
getFalseBranch	TokenNameIdentifier	 get False Branch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ifFalse	TokenNameIdentifier	 if False
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
TreeViewer	TokenNameIdentifier	 Tree Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * A decision tree leaf. */	TokenNameCOMMENT_JAVADOC	 A decision tree leaf. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Leaf	TokenNameIdentifier	 Leaf
extends	TokenNameextends	
DecisionTree	TokenNameIdentifier	 Decision Tree
implements	TokenNameimplements	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080609L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
myScore	TokenNameIdentifier	 my Score
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
double	TokenNamedouble	
myScore	TokenNameIdentifier	 my Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
myScore	TokenNameIdentifier	 my Score
=	TokenNameEQUAL	
myScore	TokenNameIdentifier	 my Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"leaf: "	TokenNameStringLiteral	leaf: 
+	TokenNamePLUS	
myScore	TokenNameIdentifier	 my Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"leaf: "	TokenNameStringLiteral	leaf: 
+	TokenNamePLUS	
myScore	TokenNameIdentifier	 my Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
myScore	TokenNameIdentifier	 my Score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
myScore	TokenNameIdentifier	 my Score
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
TreeViewer	TokenNameIdentifier	 Tree Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TreeViewer	TokenNameIdentifier	 Tree Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080609L	TokenNameLongLiteral	
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
DecisionTree	TokenNameIdentifier	 Decision Tree
dtree	TokenNameIdentifier	 dtree
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DecisionTree	TokenNameIdentifier	 Decision Tree
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
dtree	TokenNameIdentifier	 dtree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JTree	TokenNameIdentifier	 J Tree
jtree	TokenNameIdentifier	 jtree
=	TokenNameEQUAL	
new	TokenNamenew	
JTree	TokenNameIdentifier	 J Tree
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
jtree	TokenNameIdentifier	 jtree
.	TokenNameDOT	
addTreeSelectionListener	TokenNameIdentifier	 add Tree Selection Listener
(	TokenNameLPAREN	
new	TokenNamenew	
TreeSelectionListener	TokenNameIdentifier	 Tree Selection Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
valueChanged	TokenNameIdentifier	 value Changed
(	TokenNameLPAREN	
TreeSelectionEvent	TokenNameIdentifier	 Tree Selection Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
)	TokenNameRPAREN	
jtree	TokenNameIdentifier	 jtree
.	TokenNameDOT	
getLastSelectedPathComponent	TokenNameIdentifier	 get Last Selected Path Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
nodeInfo	TokenNameIdentifier	 node Info
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getUserObject	TokenNameIdentifier	 get User Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeInfo	TokenNameIdentifier	 node Info
instanceof	TokenNameinstanceof	
InternalNode	TokenNameIdentifier	 Internal Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
InternalNode	TokenNameIdentifier	 Internal Node
)	TokenNameRPAREN	
nodeInfo	TokenNameIdentifier	 node Info
)	TokenNameRPAREN	
.	TokenNameDOT	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
jtree	TokenNameIdentifier	 jtree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
DecisionTree	TokenNameIdentifier	 Decision Tree
dtree	TokenNameIdentifier	 dtree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dtree	TokenNameIdentifier	 dtree
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
(	TokenNameLPAREN	
dtree	TokenNameIdentifier	 dtree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
InternalNode	TokenNameIdentifier	 Internal Node
internal	TokenNameIdentifier	 internal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InternalNode	TokenNameIdentifier	 Internal Node
)	TokenNameRPAREN	
dtree	TokenNameIdentifier	 dtree
;	TokenNameSEMICOLON	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
ifTrue	TokenNameIdentifier	 if True
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

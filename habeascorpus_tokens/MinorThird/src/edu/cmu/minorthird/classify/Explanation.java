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
*	TokenNameMULTIPLY	
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
JTree	TokenNameIdentifier	 J Tree
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Provides a facitlity for constructing and displaying explanations for classification. * An explanation may be constructed using a String or by giving it the top Node of a tree. * * @author Cameron Williams * Date: Aug 18, 2005 */	TokenNameCOMMENT_JAVADOC	 Provides a facitlity for constructing and displaying explanations for classification. An explanation may be constructed using a String or by giving it the top Node of a tree. * @author Cameron Williams Date: Aug 18, 2005 
public	TokenNamepublic	
class	TokenNameclass	
Explanation	TokenNameIdentifier	 Explanation
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stringEx	TokenNameIdentifier	 string Ex
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JTree	TokenNameIdentifier	 J Tree
treeEx	TokenNameIdentifier	 tree Ex
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
explanation	TokenNameIdentifier	 explanation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringEx	TokenNameIdentifier	 string Ex
=	TokenNameEQUAL	
explanation	TokenNameIdentifier	 explanation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
treeEx	TokenNameIdentifier	 tree Ex
=	TokenNameEQUAL	
new	TokenNamenew	
JTree	TokenNameIdentifier	 J Tree
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the component to be displayed in the Explanation Panel of the Result. * A simple VanillaViewer if only the String explanation is defined or a Tree if * a tree is defined */	TokenNameCOMMENT_JAVADOC	 Returns the component to be displayed in the Explanation Panel of the Result. A simple VanillaViewer if only the String explanation is defined or a Tree if a tree is defined 
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stringEx	TokenNameIdentifier	 string Ex
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VanillaViewer	TokenNameIdentifier	 Vanilla Viewer
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
new	TokenNamenew	
VanillaViewer	TokenNameIdentifier	 Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
stringEx	TokenNameIdentifier	 string Ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
treeEx	TokenNameIdentifier	 tree Ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the top node of the explanation tree or creates a Node from the string explanation */	TokenNameCOMMENT_JAVADOC	 Returns the top node of the explanation tree or creates a Node from the string explanation 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
simple	TokenNameIdentifier	 simple
=	TokenNameEQUAL	
new	TokenNamenew	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
stringEx	TokenNameIdentifier	 string Ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
simple	TokenNameIdentifier	 simple
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A Node in the Explanation Tree */	TokenNameCOMMENT_JAVADOC	 A Node in the Explanation Tree 
static	TokenNamestatic	
public	TokenNamepublic	
class	TokenNameclass	
Node	TokenNameIdentifier	 Node
extends	TokenNameextends	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

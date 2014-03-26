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
/** * Transforms selected objects by running them through an 'index', * which maps them to a list, the items of which can be selected. * For instance, selected features might be transformed to * a list of examples which contain them. * * @author William cohen */	TokenNameCOMMENT_JAVADOC	 Transforms selected objects by running them through an 'index', which maps them to a list, the items of which can be selected. For instance, selected features might be transformed to a list of examples which contain them. * @author William cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
IndexedViewer	TokenNameIdentifier	 Indexed Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20081125L	TokenNameLongLiteral	
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
JList	TokenNameIdentifier	 J List
jList	TokenNameIdentifier	 j List
=	TokenNameEQUAL	
new	TokenNamenew	
JList	TokenNameIdentifier	 J List
(	TokenNameLPAREN	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
jList	TokenNameIdentifier	 j List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
jList	TokenNameIdentifier	 j List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Transform the object to a list. */	TokenNameCOMMENT_JAVADOC	 Transform the object to a list. 
abstract	TokenNameabstract	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

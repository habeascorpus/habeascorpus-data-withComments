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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
JComponent	TokenNameIdentifier	 J Component
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
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
.	TokenNameDOT	
Hyperplane	TokenNameIdentifier	 Hyperplane
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
/** * Wrap a hyperplane to that it supports the Instance interface. */	TokenNameCOMMENT_JAVADOC	 Wrap a hyperplane to that it supports the Instance interface. 
public	TokenNamepublic	
class	TokenNameclass	
HyperplaneInstance	TokenNameIdentifier	 Hyperplane Instance
implements	TokenNameimplements	
Instance	TokenNameIdentifier	 Instance
{	TokenNameLBRACE	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
hyperplane	TokenNameIdentifier	 hyperplane
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
subpopulationId	TokenNameIdentifier	 subpopulation Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
HyperplaneInstance	TokenNameIdentifier	 Hyperplane Instance
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
hyperplane	TokenNameIdentifier	 hyperplane
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
subpopulationId	TokenNameIdentifier	 subpopulation Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// compensate for automatic increment of bias term by linear learners 	TokenNameCOMMENT_LINE	compensate for automatic increment of bias term by linear learners 
// for some reason it seems to work better to have the bias be linear in length 	TokenNameCOMMENT_LINE	for some reason it seems to work better to have the bias be linear in length 
// than always zero 	TokenNameCOMMENT_LINE	than always zero 
hyperplane	TokenNameIdentifier	 hyperplane
.	TokenNameDOT	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hyperplane	TokenNameIdentifier	 hyperplane
=	TokenNameEQUAL	
hyperplane	TokenNameIdentifier	 hyperplane
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subpopulationId	TokenNameIdentifier	 subpopulation Id
=	TokenNameEQUAL	
subpopulationId	TokenNameIdentifier	 subpopulation Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
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
20080202L	TokenNameLongLiteral	
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
HyperplaneInstance	TokenNameIdentifier	 Hyperplane Instance
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HyperplaneInstance	TokenNameIdentifier	 Hyperplane Instance
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hi	TokenNameIdentifier	 hi
.	TokenNameDOT	
hyperplane	TokenNameIdentifier	 hyperplane
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hyperplane	TokenNameIdentifier	 hyperplane
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hyperplane	TokenNameIdentifier	 hyperplane
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hyperplane	TokenNameIdentifier	 hyperplane
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subpopulationId	TokenNameIdentifier	 subpopulation Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// iterate over all hyperplane features except the bias feature 	TokenNameCOMMENT_LINE	iterate over all hyperplane features except the bias feature 
// where is it used? - frank 	TokenNameCOMMENT_LINE	where is it used? - frank 
// private class MyIterator implements Iterator<Feature> 	TokenNameCOMMENT_LINE	private class MyIterator implements Iterator<Feature> 
// { 	TokenNameCOMMENT_LINE	{ 
// private Iterator<Feature> i; 	TokenNameCOMMENT_LINE	private Iterator<Feature> i; 
// private Feature myNext = null; // buffers the next nonbias feature produced by i 	TokenNameCOMMENT_LINE	private Feature myNext = null; // buffers the next nonbias feature produced by i 
// public MyIterator() { this.i = hyperplane.featureIterator(); advance(); } 	TokenNameCOMMENT_LINE	public MyIterator() { this.i = hyperplane.featureIterator(); advance(); } 
// private void advance() 	TokenNameCOMMENT_LINE	private void advance() 
// { 	TokenNameCOMMENT_LINE	{ 
// if (!i.hasNext()) myNext = null; 	TokenNameCOMMENT_LINE	if (!i.hasNext()) myNext = null; 
// else { 	TokenNameCOMMENT_LINE	else { 
// myNext = i.next(); 	TokenNameCOMMENT_LINE	myNext = i.next(); 
// if (myNext.equals(Hyperplane.BIAS_TERM)) advance(); 	TokenNameCOMMENT_LINE	if (myNext.equals(Hyperplane.BIAS_TERM)) advance(); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// public void remove() { throw new UnsupportedOperationException("can't remove"); } 	TokenNameCOMMENT_LINE	public void remove() { throw new UnsupportedOperationException("can't remove"); } 
// public boolean hasNext() { return myNext!=null; } 	TokenNameCOMMENT_LINE	public boolean hasNext() { return myNext!=null; } 
// public Feature next() { Feature result=myNext; advance(); return result; } 	TokenNameCOMMENT_LINE	public Feature next() { Feature result=myNext; advance(); return result; } 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	

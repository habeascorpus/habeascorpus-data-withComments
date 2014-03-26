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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
/** An instance that is associated with a ClassLabel. Implements the * Instance interface by delegating to a wrapped Instance, so * subclasses just need to attach the right label construct. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 An instance that is associated with a ClassLabel. Implements the Instance interface by delegating to a wrapped Instance, so subclasses just need to attach the right label construct. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
Example	TokenNameIdentifier	 Example
implements	TokenNameimplements	
Instance	TokenNameIdentifier	 Instance
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080125L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
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
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the label associated with the underlying object */	TokenNameCOMMENT_JAVADOC	 get the label associated with the underlying object 
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the underlying object */	TokenNameCOMMENT_JAVADOC	 Get the underlying object 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the weight assigned to a feature in the instance. */	TokenNameCOMMENT_JAVADOC	 Get the weight assigned to a feature in the instance. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return an iterator over all binary features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all binary features 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
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
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return an iterator over all numeric features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all numeric features 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
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
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return an iterator over all features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all features 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
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
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the number of all features */	TokenNameCOMMENT_JAVADOC	 Return the number of all features 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
numFeatures	TokenNameIdentifier	 num Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the weight of this example. */	TokenNameCOMMENT_JAVADOC	 Get the weight of this example. 
final	TokenNamefinal	
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Change the weight of this example. */	TokenNameCOMMENT_JAVADOC	 Change the weight of this example. 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setWeight	TokenNameIdentifier	 set Weight
(	TokenNameLPAREN	
double	TokenNamedouble	
newWeight	TokenNameIdentifier	 new Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
newWeight	TokenNameIdentifier	 new Weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the subpopulation Id of the instance. **/	TokenNameCOMMENT_JAVADOC	 Return the subpopulation Id of the instance. *
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return an unlabeled version of the example (an Instance) */	TokenNameCOMMENT_JAVADOC	 Return an unlabeled version of the example (an Instance) 
final	TokenNamefinal	
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[example: "	TokenNameStringLiteral	[example: 
+	TokenNamePLUS	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
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
ExampleViewer	TokenNameIdentifier	 Example Viewer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

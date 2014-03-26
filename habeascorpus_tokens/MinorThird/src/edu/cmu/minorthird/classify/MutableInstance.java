/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
UnionIterator	TokenNameIdentifier	 Union Iterator
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
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/** * A single instance for a learner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A single instance for a learner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MutableInstance	TokenNameIdentifier	 Mutable Instance
extends	TokenNameextends	
AbstractInstance	TokenNameIdentifier	 Abstract Instance
{	TokenNameLBRACE	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
binarySet	TokenNameIdentifier	 binary Set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
WeightedSet	TokenNameIdentifier	 Weighted Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
numericSet	TokenNameIdentifier	 numeric Set
=	TokenNameEQUAL	
new	TokenNamenew	
WeightedSet	TokenNameIdentifier	 Weighted Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
subpopulationId	TokenNameIdentifier	 subpopulation Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subpopulationId	TokenNameIdentifier	 subpopulation Id
=	TokenNameEQUAL	
subpopulationId	TokenNameIdentifier	 subpopulation Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
"_unknownSource_"	TokenNameStringLiteral	_unknownSource_
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a numeric feature. This also deletes the binary version of * feature, if it exists. */	TokenNameCOMMENT_JAVADOC	 Add a numeric feature. This also deletes the binary version of feature, if it exists. 
public	TokenNamepublic	
void	TokenNamevoid	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binarySet	TokenNameIdentifier	 binary Set
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numericSet	TokenNameIdentifier	 numeric Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a binary feature. */	TokenNameCOMMENT_JAVADOC	 Add a binary feature. 
public	TokenNamepublic	
void	TokenNamevoid	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binarySet	TokenNameIdentifier	 binary Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the weight assigned to a feature in this instance. */	TokenNameCOMMENT_JAVADOC	 Get the weight assigned to a feature in this instance. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
binarySet	TokenNameIdentifier	 binary Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
numericSet	TokenNameIdentifier	 numeric Set
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return an iterator over all binary features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all binary features 
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
binarySet	TokenNameIdentifier	 binary Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return an iterator over all numeric features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all numeric features 
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
numericSet	TokenNameIdentifier	 numeric Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return an iterator over all features */	TokenNameCOMMENT_JAVADOC	 Return an iterator over all features 
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
new	TokenNamenew	
UnionIterator	TokenNameIdentifier	 Union Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
binarySet	TokenNameIdentifier	 binary Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
numericSet	TokenNameIdentifier	 numeric Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
"William Cohen"	TokenNameStringLiteral	William Cohen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"token lc william"	TokenNameStringLiteral	token lc william
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addBinary	TokenNameIdentifier	 add Binary
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"token lc cohen"	TokenNameStringLiteral	token lc cohen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"iq"	TokenNameStringLiteral	iq
)	TokenNameRPAREN	
,	TokenNameCOMMA	
250	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"office"	TokenNameStringLiteral	office
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5317	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"TestInstance Viewer"	TokenNameStringLiteral	TestInstance Viewer
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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

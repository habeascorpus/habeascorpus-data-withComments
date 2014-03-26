/* Copyright 2003-2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003-2004, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
BasicStringWrapper	TokenNameIdentifier	 Basic String Wrapper
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
api	TokenNameIdentifier	 api
.	TokenNameDOT	
StringDistance	TokenNameIdentifier	 String Distance
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
api	TokenNameIdentifier	 api
.	TokenNameDOT	
StringWrapper	TokenNameIdentifier	 String Wrapper
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
wcohen	TokenNameIdentifier	 wcohen
.	TokenNameDOT	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
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
ExampleSchema	TokenNameIdentifier	 Example Schema
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
public	TokenNamepublic	
class	TokenNameclass	
DictionaryTransform	TokenNameIdentifier	 Dictionary Transform
extends	TokenNameextends	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
softDict	TokenNameIdentifier	 soft Dict
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newFeatureNames	TokenNameIdentifier	 new Feature Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newFeatureValues	TokenNameIdentifier	 new Feature Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringDistance	TokenNameIdentifier	 String Distance
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numDistances	TokenNameIdentifier	 num Distances
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DictionaryTransform	TokenNameIdentifier	 Dictionary Transform
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
SoftDictionary	TokenNameIdentifier	 Soft Dictionary
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
softDict	TokenNameIdentifier	 soft Dict
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
StringDistance	TokenNameIdentifier	 String Distance
dists	TokenNameIdentifier	 dists
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
softDict	TokenNameIdentifier	 soft Dict
=	TokenNameEQUAL	
softDict	TokenNameIdentifier	 soft Dict
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
featurePattern	TokenNameIdentifier	 feature Pattern
=	TokenNameEQUAL	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
distances	TokenNameIdentifier	 distances
=	TokenNameEQUAL	
dists	TokenNameIdentifier	 dists
;	TokenNameSEMICOLON	
numDistances	TokenNameIdentifier	 num Distances
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
newFeatureNames	TokenNameIdentifier	 new Feature Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
numDistances	TokenNameIdentifier	 num Distances
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newFeatureValues	TokenNameIdentifier	 new Feature Values
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
newFeatureNames	TokenNameIdentifier	 new Feature Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newFeatureNames	TokenNameIdentifier	 new Feature Names
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"_"	TokenNameStringLiteral	_
+	TokenNamePLUS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
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
newFeatureValues	TokenNameIdentifier	 new Feature Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
newFeatureValues	TokenNameIdentifier	 new Feature Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("transforming "+instance); 	TokenNameCOMMENT_LINE	System.out.println("transforming "+instance); 
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getFeatureValue	TokenNameIdentifier	 get Feature Value
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
featurePattern	TokenNameIdentifier	 feature Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
nonZeroFeatureAdded	TokenNameIdentifier	 non Zero Feature Added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
StringWrapper	TokenNameIdentifier	 String Wrapper
spanString	TokenNameIdentifier	 span String
=	TokenNameEQUAL	
new	TokenNamenew	
BasicStringWrapper	TokenNameIdentifier	 Basic String Wrapper
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
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
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("looking up text in dict "+i); 	TokenNameCOMMENT_LINE	System.out.println("looking up text in dict "+i); 
Object	TokenNameIdentifier	 Object
closestMatch	TokenNameIdentifier	 closest Match
=	TokenNameEQUAL	
softDict	TokenNameIdentifier	 soft Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
spanString	TokenNameIdentifier	 span String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
closestMatch	TokenNameIdentifier	 closest Match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create various types of similarity measures. 	TokenNameCOMMENT_LINE	create various types of similarity measures. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
distances	TokenNameIdentifier	 distances
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
spanString	TokenNameIdentifier	 span String
,	TokenNameCOMMA	
(	TokenNameLPAREN	
StringWrapper	TokenNameIdentifier	 String Wrapper
)	TokenNameRPAREN	
closestMatch	TokenNameIdentifier	 closest Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nonZeroFeatureAdded	TokenNameIdentifier	 non Zero Feature Added
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
newFeatureValues	TokenNameIdentifier	 new Feature Values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
numDistances	TokenNameIdentifier	 num Distances
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nonZeroFeatureAdded	TokenNameIdentifier	 non Zero Feature Added
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
augmentedInstance	TokenNameIdentifier	 augmented Instance
=	TokenNameEQUAL	
new	TokenNamenew	
AugmentedInstance	TokenNameIdentifier	 Augmented Instance
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
newFeatureNames	TokenNameIdentifier	 new Feature Names
,	TokenNameCOMMA	
newFeatureValues	TokenNameIdentifier	 new Feature Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("transformed to "+augmentedInstance); 	TokenNameCOMMENT_LINE	System.out.println("transformed to "+augmentedInstance); 
// Feature f = new Feature(newFeatureNames[ schema.getClassIndex(ExampleSchema.POS_CLASS_NAME) ]); 	TokenNameCOMMENT_LINE	Feature f = new Feature(newFeatureNames[ schema.getClassIndex(ExampleSchema.POS_CLASS_NAME) ]); 
//System.out.println("weight of "+f+" is "+augmentedInstance.getWeight(f)+" in "+augmentedInstance); 	TokenNameCOMMENT_LINE	System.out.println("weight of "+f+" is "+augmentedInstance.getWeight(f)+" in "+augmentedInstance); 
return	TokenNamereturn	
augmentedInstance	TokenNameIdentifier	 augmented Instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"[DictionaryTransform: dictSize"	TokenNameStringLiteral	[DictionaryTransform: dictSize
)	TokenNameRPAREN	
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
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
softDict	TokenNameIdentifier	 soft Dict
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
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
/** * If feature pattern is of the form x.y.z and there is a feature of * the form x.y.z.a, return the string "a". */	TokenNameCOMMENT_JAVADOC	 If feature pattern is of the form x.y.z and there is a feature of the form x.y.z.a, return the string "a". 
static	TokenNamestatic	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFeatureValue	TokenNameIdentifier	 get Feature Value
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("looking for "+StringUtil.toString(featurePattern)+" in "+instance); 	TokenNameCOMMENT_LINE	System.out.println("looking for "+StringUtil.toString(featurePattern)+" in "+instance); 
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
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
featurePattern	TokenNameIdentifier	 feature Pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
featurePattern	TokenNameIdentifier	 feature Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
featurePattern	TokenNameIdentifier	 feature Pattern
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
featurePattern	TokenNameIdentifier	 feature Pattern
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

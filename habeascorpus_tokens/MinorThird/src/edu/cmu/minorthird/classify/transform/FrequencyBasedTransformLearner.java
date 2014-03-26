/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * @author William Cohen * Date: Nov 21, 2003 * @author Edoardo Airoldi * Date: Feb 05, 2004 */	TokenNameCOMMENT_JAVADOC	 @author William Cohen Date: Nov 21, 2003 @author Edoardo Airoldi Date: Feb 05, 2004 
/** * A simple feature filter based on their frequency of occurrence. * The frequency model is resposible for deciding 'what to count'. If set to * "document" this filter counts the number of documents which contain a Feature; * if set to "word" this filter counts the number of times a Feature appears in * the whole dataset. */	TokenNameCOMMENT_JAVADOC	 A simple feature filter based on their frequency of occurrence. The frequency model is resposible for deciding 'what to count'. If set to "document" this filter counts the number of documents which contain a Feature; if set to "word" this filter counts the number of times a Feature appears in the whole dataset. 
public	TokenNamepublic	
class	TokenNameclass	
FrequencyBasedTransformLearner	TokenNameIdentifier	 Frequency Based Transform Learner
implements	TokenNameimplements	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
frequencyModel	TokenNameIdentifier	 frequency Model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default constructor, for use in gui. */	TokenNameCOMMENT_JAVADOC	 Default constructor, for use in gui. 
public	TokenNamepublic	
FrequencyBasedTransformLearner	TokenNameIdentifier	 Frequency Based Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This will "learn" an InstanceTransform that discards instances * which appear in minimumFrequency or fewer examples. */	TokenNameCOMMENT_JAVADOC	 This will "learn" an InstanceTransform that discards instances which appear in minimumFrequency or fewer examples. 
public	TokenNamepublic	
FrequencyBasedTransformLearner	TokenNameIdentifier	 Frequency Based Transform Learner
(	TokenNameLPAREN	
int	TokenNameint	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
frequencyModel	TokenNameIdentifier	 frequency Model
=	TokenNameEQUAL	
"document"	TokenNameStringLiteral	document
;	TokenNameSEMICOLON	
// Default 	TokenNameCOMMENT_LINE	Default 
this	TokenNamethis	
.	TokenNameDOT	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
=	TokenNameEQUAL	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FrequencyBasedTransformLearner	TokenNameIdentifier	 Frequency Based Transform Learner
(	TokenNameLPAREN	
int	TokenNameint	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
frequencyModel	TokenNameIdentifier	 frequency Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
frequencyModel	TokenNameIdentifier	 frequency Model
=	TokenNameEQUAL	
frequencyModel	TokenNameIdentifier	 frequency Model
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
=	TokenNameEQUAL	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The schema's not used here... */	TokenNameCOMMENT_JAVADOC	 The schema's not used here... 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
InstanceTransform	TokenNameIdentifier	 Instance Transform
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// figure out what features are high-frequency 	TokenNameCOMMENT_LINE	figure out what features are high-frequency 
DatasetIndex	TokenNameIdentifier	 Dataset Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetIndex	TokenNameIdentifier	 Dataset Index
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frequencyModel	TokenNameIdentifier	 frequency Model
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
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
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
frequencyModel	TokenNameIdentifier	 frequency Model
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"word"	TokenNameStringLiteral	word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
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
double	TokenNamedouble	
totalCounts	TokenNameIdentifier	 total Counts
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalCounts	TokenNameIdentifier	 total Counts
+=	TokenNamePLUS_EQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
totalCounts	TokenNameIdentifier	 total Counts
>=	TokenNameGREATER_EQUAL	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
)	TokenNameRPAREN	
{	TokenNameLBRACE	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: "	TokenNameStringLiteral	warning: 
+	TokenNamePLUS	
frequencyModel	TokenNameIdentifier	 frequency Model
+	TokenNamePLUS	
" is an unknown model for frequency!"	TokenNameStringLiteral	 is an unknown model for frequency!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build an InstanceTransform that removes low-frequency features 	TokenNameCOMMENT_LINE	build an InstanceTransform that removes low-frequency features 
return	TokenNamereturn	
new	TokenNamenew	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
return	TokenNamereturn	
new	TokenNamenew	
MaskedInstance	TokenNameIdentifier	 Masked Instance
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
activeFeatureSet	TokenNameIdentifier	 active Feature Set
)	TokenNameRPAREN	
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
"[InstanceTransform: model = "	TokenNameStringLiteral	[InstanceTransform: model = 
+	TokenNamePLUS	
frequencyModel	TokenNameIdentifier	 frequency Model
+	TokenNamePLUS	
", features appear >= "	TokenNameStringLiteral	, features appear >= 
+	TokenNamePLUS	
minimumFrequency	TokenNameIdentifier	 minimum Frequency
+	TokenNamePLUS	
" times]"	TokenNameStringLiteral	 times]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

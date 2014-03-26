package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
experiments	TokenNameIdentifier	 experiments
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
Splitter	TokenNameIdentifier	 Splitter
;	TokenNameSEMICOLON	
/** * Variant of cross-validation in which not all training data is used. * Splits data into k separate disjoint folds, then return k * train/test splits where each train set a sample of the union of k-1 * folds, and the test set is the k-th fold. Preserves subpopulation * information. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Variant of cross-validation in which not all training data is used. Splits data into k separate disjoint folds, then return k train/test splits where each train set a sample of the union of k-1 folds, and the test set is the k-th fold. Preserves subpopulation information. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SubsamplingCrossValSplitter	TokenNameIdentifier	 Subsampling Cross Val Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
trainIt	TokenNameIdentifier	 train It
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
testIt	TokenNameIdentifier	 test It
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
cvs	TokenNameIdentifier	 cvs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RandomSplitter	TokenNameIdentifier	 Random Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rs	TokenNameIdentifier	 rs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SubsamplingCrossValSplitter	TokenNameIdentifier	 Subsampling Cross Val Splitter
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
int	TokenNameint	
folds	TokenNameIdentifier	 folds
,	TokenNameCOMMA	
double	TokenNamedouble	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
folds	TokenNameIdentifier	 folds
=	TokenNameEQUAL	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
=	TokenNameEQUAL	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SubsamplingCrossValSplitter	TokenNameIdentifier	 Subsampling Cross Val Splitter
(	TokenNameLPAREN	
int	TokenNameint	
folds	TokenNameIdentifier	 folds
,	TokenNameCOMMA	
double	TokenNamedouble	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
folds	TokenNameIdentifier	 folds
,	TokenNameCOMMA	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SubsamplingCrossValSplitter	TokenNameIdentifier	 Subsampling Cross Val Splitter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumberOfFolds	TokenNameIdentifier	 get Number Of Folds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumberOfFolds	TokenNameIdentifier	 set Number Of Folds
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
folds	TokenNameIdentifier	 folds
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getSubsampleFraction	TokenNameIdentifier	 get Subsample Fraction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSubsampleFraction	TokenNameIdentifier	 set Subsample Fraction
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cvs	TokenNameIdentifier	 cvs
=	TokenNameEQUAL	
new	TokenNamenew	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
folds	TokenNameIdentifier	 folds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rs	TokenNameIdentifier	 rs
=	TokenNameEQUAL	
new	TokenNamenew	
RandomSplitter	TokenNameIdentifier	 Random Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testIt	TokenNameIdentifier	 test It
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
folds	TokenNameIdentifier	 folds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trainIt	TokenNameIdentifier	 train It
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
folds	TokenNameIdentifier	 folds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testIt	TokenNameIdentifier	 test It
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trainIt	TokenNameIdentifier	 train It
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rs	TokenNameIdentifier	 rs
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
trainIt	TokenNameIdentifier	 train It
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//public Iterator getTest(int k) { return testIt[k]; } 	TokenNameCOMMENT_LINE	public Iterator getTest(int k) { return testIt[k]; } 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cvs	TokenNameIdentifier	 cvs
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
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
"[SubCV "	TokenNameStringLiteral	[SubCV 
+	TokenNamePLUS	
folds	TokenNameIdentifier	 folds
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
subsampleFraction	TokenNameIdentifier	 subsample Fraction
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

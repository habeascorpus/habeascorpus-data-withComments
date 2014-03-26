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
/** * @author Vitor R. Carvalho * Date: March 2005 * * A simple feature filter based on Chi-squared statistic. */	TokenNameCOMMENT_JAVADOC	 @author Vitor R. Carvalho Date: March 2005 * A simple feature filter based on Chi-squared statistic. 
public	TokenNamepublic	
class	TokenNameclass	
ChiSquareInstanceTransform	TokenNameIdentifier	 Chi Square Instance Transform
extends	TokenNameextends	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
>	TokenNameGREATER	
featValues	TokenNameIdentifier	 feat Values
;	TokenNameSEMICOLON	
//keeps all features 	TokenNameCOMMENT_LINE	keeps all features 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
availableFeatures	TokenNameIdentifier	 available Features
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//keeps high score features 	TokenNameCOMMENT_LINE	keeps high score features 
private	TokenNameprivate	
boolean	TokenNameboolean	
isSorted	TokenNameIdentifier	 is Sorted
;	TokenNameSEMICOLON	
/** Default Constructor - numFeatures=100 */	TokenNameCOMMENT_JAVADOC	 Default Constructor - numFeatures=100 
public	TokenNamepublic	
ChiSquareInstanceTransform	TokenNameIdentifier	 Chi Square Instance Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// default 	TokenNameCOMMENT_LINE	default 
this	TokenNamethis	
.	TokenNameDOT	
featValues	TokenNameIdentifier	 feat Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructor - parameter is number of features */	TokenNameCOMMENT_JAVADOC	 Constructor - parameter is number of features 
public	TokenNamepublic	
ChiSquareInstanceTransform	TokenNameIdentifier	 Chi Square Instance Transform
(	TokenNameLPAREN	
int	TokenNameint	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
=	TokenNameEQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
// number of top ranked features 	TokenNameCOMMENT_LINE	number of top ranked features 
this	TokenNamethis	
.	TokenNameDOT	
featValues	TokenNameIdentifier	 feat Values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Transform an instance according to Info-Gain criterion */	TokenNameCOMMENT_JAVADOC	 Transform an instance according to Info-Gain criterion 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// collect features to keep 	TokenNameCOMMENT_LINE	collect features to keep 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSorted	TokenNameIdentifier	 is Sorted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
,	TokenNameCOMMA	
VAL_COMPARATOR	TokenNameIdentifier	 VAL  COMPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isSorted	TokenNameIdentifier	 is Sorted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxIndex	TokenNameIdentifier	 max Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// availableFeatures = new HashSet(); 	TokenNameCOMMENT_LINE	availableFeatures = new HashSet(); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
maxIndex	TokenNameIdentifier	 max Index
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
availableFeatures	TokenNameIdentifier	 available Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MaskedInstance	TokenNameIdentifier	 Masked Instance
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
,	TokenNameCOMMA	
availableFeatures	TokenNameIdentifier	 available Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A class that we use to sort a TreeMap by values */	TokenNameCOMMENT_JAVADOC	 A class that we use to sort a TreeMap by values 
private	TokenNameprivate	
class	TokenNameclass	
Pair	TokenNameIdentifier	 Pair
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
{	TokenNameLBRACE	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
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
"[ "	TokenNameStringLiteral	[ 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
+	TokenNamePLUS	
" ]"	TokenNameStringLiteral	 ]
;	TokenNameSEMICOLON	
//this.key + " ]"; 	TokenNameCOMMENT_LINE	this.key + " ]"; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
>	TokenNameGREATER	
VAL_COMPARATOR	TokenNameIdentifier	 VAL  COMPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
ig1	TokenNameIdentifier	 ig1
,	TokenNameCOMMA	
Pair	TokenNameIdentifier	 Pair
ig2	TokenNameIdentifier	 ig2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ig1	TokenNameIdentifier	 ig1
.	TokenNameDOT	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
ig2	TokenNameIdentifier	 ig2
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ig1	TokenNameIdentifier	 ig1
.	TokenNameDOT	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
ig2	TokenNameIdentifier	 ig2
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
ig1	TokenNameIdentifier	 ig1
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ig2	TokenNameIdentifier	 ig2
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** displays the top ranked features and their scores*/	TokenNameCOMMENT_JAVADOC	 displays the top ranked features and their scores
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
,	TokenNameCOMMA	
VAL_COMPARATOR	TokenNameIdentifier	 VAL  COMPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxIndex	TokenNameIdentifier	 max Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
maxIndex	TokenNameIdentifier	 max Index
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
;	TokenNameSEMICOLON	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" , "	TokenNameStringLiteral	 , 
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get top ranked features*/	TokenNameCOMMENT_JAVADOC	 get top ranked features
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTopFeatures	TokenNameIdentifier	 get Top Features
(	TokenNameLPAREN	
int	TokenNameint	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
,	TokenNameCOMMA	
VAL_COMPARATOR	TokenNameIdentifier	 VAL  COMPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxIndex	TokenNameIdentifier	 max Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ff	TokenNameIdentifier	 ff
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
maxIndex	TokenNameIdentifier	 max Index
]	TokenNameRBRACKET	
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
maxIndex	TokenNameIdentifier	 max Index
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ff	TokenNameIdentifier	 ff
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ff	TokenNameIdentifier	 ff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Number of features with the highest scores to keep in the dataset */	TokenNameCOMMENT_JAVADOC	 Number of features with the highest scores to keep in the dataset 
public	TokenNamepublic	
void	TokenNamevoid	
setNumberOfFeatures	TokenNameIdentifier	 set Number Of Features
(	TokenNameLPAREN	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
isSorted	TokenNameIdentifier	 is Sorted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds a score of feature f to the InstanceTransform */	TokenNameCOMMENT_JAVADOC	 Adds a score of feature f to the InstanceTransform 
public	TokenNamepublic	
void	TokenNamevoid	
addFeature	TokenNameIdentifier	 add Feature
(	TokenNameLPAREN	
double	TokenNamedouble	
infoGain	TokenNameIdentifier	 info Gain
,	TokenNameCOMMA	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Pair	TokenNameIdentifier	 Pair
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Pair	TokenNameIdentifier	 Pair
(	TokenNameLPAREN	
infoGain	TokenNameIdentifier	 info Gain
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featValues	TokenNameIdentifier	 feat Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isSorted	TokenNameIdentifier	 is Sorted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

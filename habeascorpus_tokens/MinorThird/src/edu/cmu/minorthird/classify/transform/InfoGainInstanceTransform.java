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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
Set	TokenNameIdentifier	 Set
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
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
Dataset	TokenNameIdentifier	 Dataset
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
Example	TokenNameIdentifier	 Example
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
/** * @author Edoardo M. Airoldi * Date: Feb 6, 2004 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo M. Airoldi Date: Feb 6, 2004 
public	TokenNamepublic	
class	TokenNameclass	
InfoGainInstanceTransform	TokenNameIdentifier	 Info Gain Instance Transform
implements	TokenNameimplements	
InstanceTransform	TokenNameIdentifier	 Instance Transform
{	TokenNameLBRACE	
// static private Logger log=Logger.getLogger(InfoGainInstanceTransform.class); 	TokenNameCOMMENT_LINE	static private Logger log=Logger.getLogger(InfoGainInstanceTransform.class); 
private	TokenNameprivate	
int	TokenNameint	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
>	TokenNameGREATER	
igValues	TokenNameIdentifier	 ig Values
;	TokenNameSEMICOLON	
/** Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
InfoGainInstanceTransform	TokenNameIdentifier	 Info Gain Instance Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// or max number of features if < 100 	TokenNameCOMMENT_LINE	or max number of features if < 100 
this	TokenNamethis	
.	TokenNameDOT	
igValues	TokenNameIdentifier	 ig Values
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
/** Not used */	TokenNameCOMMENT_JAVADOC	 Not used 
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: cannot transform instance with Info-Gain!"	TokenNameStringLiteral	Warning: cannot transform instance with Info-Gain!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Not used */	TokenNameCOMMENT_JAVADOC	 Not used 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: cannot transform example with Info-Gain!"	TokenNameStringLiteral	Warning: cannot transform example with Info-Gain!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Transform a dataset according to Info-Gain criterion */	TokenNameCOMMENT_JAVADOC	 Transform a dataset according to Info-Gain criterion 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Dataset	TokenNameIdentifier	 Dataset
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
(	TokenNameLPAREN	
ig1	TokenNameIdentifier	 ig1
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
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
// collect features to keep 	TokenNameCOMMENT_LINE	collect features to keep 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
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
igValues	TokenNameIdentifier	 ig Values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TOP_FEATURES	TokenNameIdentifier	 TOP  FEATURES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
//System.out.println( ((Pair)igValues.get(j)).feature+" "+((Pair)igValues.get(j)).value ); // DEBUG 	TokenNameCOMMENT_LINE	System.out.println( ((Pair)igValues.get(j)).feature+" "+((Pair)igValues.get(j)).value ); // DEBUG 
availableFeatures	TokenNameIdentifier	 available Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
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
// create masked dataset 	TokenNameCOMMENT_LINE	create masked dataset 
BasicDataset	TokenNameIdentifier	 Basic Dataset
maskeDataset	TokenNameIdentifier	 maske Dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
new	TokenNamenew	
MaskedInstance	TokenNameIdentifier	 Masked Instance
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
availableFeatures	TokenNameIdentifier	 available Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maskeDataset	TokenNameIdentifier	 maske Dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
maskeDataset	TokenNameIdentifier	 maske Dataset
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
// Accessory Methods 	TokenNameCOMMENT_LINE	Accessory Methods 
/** Number of features with the highest Info-Gain scores to keep in the dataset */	TokenNameCOMMENT_JAVADOC	 Number of features with the highest Info-Gain scores to keep in the dataset 
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
}	TokenNameRBRACE	
/** Adds the Info-Gain score of feature f to the InstanceTransform */	TokenNameCOMMENT_JAVADOC	 Adds the Info-Gain score of feature f to the InstanceTransform 
public	TokenNamepublic	
void	TokenNamevoid	
addFeatureIG	TokenNameIdentifier	 add Feature IG
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
igValues	TokenNameIdentifier	 ig Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get top ranked features*/	TokenNameCOMMENT_JAVADOC	 get top ranked features
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maxIndex	TokenNameIdentifier	 max Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
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
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
feature	TokenNameIdentifier	 feature
;	TokenNameSEMICOLON	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
igValues	TokenNameIdentifier	 ig Values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	

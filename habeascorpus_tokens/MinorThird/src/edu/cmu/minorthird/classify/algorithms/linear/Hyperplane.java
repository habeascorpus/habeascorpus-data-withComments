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
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MathUtil	TokenNameIdentifier	 Math Util
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
gnu	TokenNameIdentifier	 gnu
.	TokenNameDOT	
trove	TokenNameIdentifier	 trove
.	TokenNameDOT	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
gnu	TokenNameIdentifier	 gnu
.	TokenNameDOT	
trove	TokenNameIdentifier	 trove
.	TokenNameDOT	
TObjectDoubleIterator	TokenNameIdentifier	 T Object Double Iterator
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** A weighted combination of features. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A weighted combination of features. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
Hyperplane	TokenNameIdentifier	 Hyperplane
extends	TokenNameextends	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
implements	TokenNameimplements	
Visible	TokenNameIdentifier	 Visible
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080128L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Weight for an invisible 'bias feature' which is considered to be * present in every instance. In otherwords, as a classifier, the * score of a hyperplane h on an instance x is sum_{feature f} * x.score(f)*h.featureScore(f) + h.featureScore(BIAS_TERM). */	TokenNameCOMMENT_JAVADOC	 Weight for an invisible 'bias feature' which is considered to be present in every instance. In otherwords, as a classifier, the score of a hyperplane h on an instance x is sum_{feature f} x.score(f)*h.featureScore(f) + h.featureScore(BIAS_TERM). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Feature	TokenNameIdentifier	 Feature
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"_hyperplaneBias"	TokenNameStringLiteral	_hyperplaneBias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
protected	TokenNameprotected	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
=	TokenNameEQUAL	
new	TokenNamenew	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreWeights	TokenNameIdentifier	 ignore Weights
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// mystic incantations to implement a non-default serialization strategy 	TokenNameCOMMENT_LINE	mystic incantations to implement a non-default serialization strategy 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
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
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeDouble	TokenNameIdentifier	 write Double
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("wrote weight: "+f+" => "+w); 	TokenNameCOMMENT_LINE	System.out.println("wrote weight: "+f+" => "+w); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeDouble	TokenNameIdentifier	 write Double
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
ignoreWeights	TokenNameIdentifier	 ignore Weights
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//System.out.println("reading new object"); 	TokenNameCOMMENT_LINE	System.out.println("reading new object"); 
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
=	TokenNameEQUAL	
new	TokenNamenew	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("read weight: "+f+" => "+w); 	TokenNameCOMMENT_LINE	System.out.println("read weight: "+f+" => "+w); 
}	TokenNameRBRACE	
ignoreWeights	TokenNameIdentifier	 ignore Weights
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StreamCorruptedException	TokenNameIdentifier	 Stream Corrupted Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("reading old object"); 	TokenNameCOMMENT_LINE	System.out.println("reading old object"); 
in	TokenNameIdentifier	 in
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** After this call is made, the hyperplane will assume that all * feature weights are one in instances. Specifically in calls to * increment(instance,delta) or increment(hyperplane,delta), feature * weights will be assumed to be one. For backward compatibility * with an old buggy version. */	TokenNameCOMMENT_JAVADOC	 After this call is made, the hyperplane will assume that all feature weights are one in instances. Specifically in calls to increment(instance,delta) or increment(hyperplane,delta), feature weights will be assumed to be one. For backward compatibility with an old buggy version. 
public	TokenNamepublic	
void	TokenNamevoid	
startIgnoringWeights	TokenNameIdentifier	 start Ignoring Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreWeights	TokenNameIdentifier	 ignore Weights
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Inner product of hyperplane and instance weights. */	TokenNameCOMMENT_JAVADOC	 Inner product of hyperplane and instance weights. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Justify inner product of hyperplane and instance weights. */	TokenNameCOMMENT_JAVADOC	 Justify inner product of hyperplane and instance weights. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" + "	TokenNameStringLiteral	 + 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
"*"	TokenNameStringLiteral	*
+	TokenNamePLUS	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" + bias<"	TokenNameStringLiteral	 + bias<
+	TokenNamePLUS	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"Hyperplane Explanation"	TokenNameStringLiteral	Hyperplane Explanation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"Tokens:"	TokenNameStringLiteral	Tokens:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
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
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
ftr	TokenNameIdentifier	 ftr
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
"*"	TokenNameStringLiteral	*
+	TokenNamePLUS	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
bias	TokenNameIdentifier	 bias
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"bias<"	TokenNameStringLiteral	bias<
+	TokenNamePLUS	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bias	TokenNameIdentifier	 bias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Increment one feature from the hyperplane by delta */	TokenNameCOMMENT_JAVADOC	 Increment one feature from the hyperplane by delta 
public	TokenNamepublic	
void	TokenNamevoid	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Increment the bias term for the hyperplane by delta */	TokenNameCOMMENT_JAVADOC	 Increment the bias term for the hyperplane by delta 
public	TokenNamepublic	
void	TokenNamevoid	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the bias term for the hyperplane to delta */	TokenNameCOMMENT_JAVADOC	 Set the bias term for the hyperplane to delta 
public	TokenNamepublic	
void	TokenNamevoid	
setBias	TokenNameIdentifier	 set Bias
(	TokenNameLPAREN	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
BIAS_TERM	TokenNameIdentifier	 BIAS  TERM
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add the value of the features in the instance to this hyperplane. */	TokenNameCOMMENT_JAVADOC	 Add the value of the features in the instance to this hyperplane. 
public	TokenNamepublic	
void	TokenNamevoid	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
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
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
ignoreWeights	TokenNameIdentifier	 ignore Weights
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Multiply all weights by a factor */	TokenNameCOMMENT_JAVADOC	 Multiply all weights by a factor 
public	TokenNamepublic	
void	TokenNamevoid	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
double	TokenNamedouble	
factor	TokenNameIdentifier	 factor
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
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
factor	TokenNameIdentifier	 factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Multiply one feature from the hyperplane by delta */	TokenNameCOMMENT_JAVADOC	 Multiply one feature from the hyperplane by delta 
public	TokenNamepublic	
void	TokenNamevoid	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
*	TokenNameMULTIPLY	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/**Checks the presence of a feature in hyperplane */	TokenNameCOMMENT_JAVADOC	Checks the presence of a feature in hyperplane 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feat	TokenNameIdentifier	 feat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
feat	TokenNameIdentifier	 feat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add hyperplane b*delta to this hyperplane. */	TokenNameCOMMENT_JAVADOC	 Add hyperplane b*delta to this hyperplane. 
public	TokenNamepublic	
void	TokenNamevoid	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
TObjectDoubleIterator	TokenNameIdentifier	 T Object Double Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
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
i	TokenNameIdentifier	 i
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Add hyperplane b to this hyperplane. */	TokenNameCOMMENT_JAVADOC	 Add hyperplane b to this hyperplane. 
public	TokenNamepublic	
void	TokenNamevoid	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Weight for a feature in the hyperplane. */	TokenNameCOMMENT_JAVADOC	 Weight for a feature in the hyperplane. 
public	TokenNamepublic	
double	TokenNamedouble	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Iterate over all features with non-zero weight. */	TokenNameCOMMENT_JAVADOC	 Iterate over all features with non-zero weight. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
TObjectDoubleIterator	TokenNameIdentifier	 T Object Double Iterator
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Feature	TokenNameIdentifier	 Feature
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// UI stuff 	TokenNameCOMMENT_LINE	UI stuff 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
gui	TokenNameIdentifier	 gui
=	TokenNameEQUAL	
new	TokenNamenew	
ControlledViewer	TokenNameIdentifier	 Controlled Viewer
(	TokenNameLPAREN	
new	TokenNamenew	
MyViewer	TokenNameIdentifier	 My Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
HyperplaneControls	TokenNameIdentifier	 Hyperplane Controls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
class	TokenNameclass	
HyperplaneControls	TokenNameIdentifier	 Hyperplane Controls
extends	TokenNameextends	
ViewerControls	TokenNameIdentifier	 Viewer Controls
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080128L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// how to sort 	TokenNameCOMMENT_LINE	how to sort 
//private JRadioButton absoluteValueButton; 	TokenNameCOMMENT_LINE	private JRadioButton absoluteValueButton; 
private	TokenNameprivate	
JRadioButton	TokenNameIdentifier	 J Radio Button
valueButton	TokenNameIdentifier	 value Button
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JRadioButton	TokenNameIdentifier	 J Radio Button
nameButton	TokenNameIdentifier	 name Button
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JRadioButton	TokenNameIdentifier	 J Radio Button
treeButton	TokenNameIdentifier	 tree Button
;	TokenNameSEMICOLON	
//private JRadioButton noneButton; 	TokenNameCOMMENT_LINE	private JRadioButton noneButton; 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ButtonGroup	TokenNameIdentifier	 Button Group
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
new	TokenNamenew	
ButtonGroup	TokenNameIdentifier	 Button Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
treeButton	TokenNameIdentifier	 tree Button
=	TokenNameEQUAL	
addButton	TokenNameIdentifier	 add Button
(	TokenNameLPAREN	
"Tree view"	TokenNameStringLiteral	Tree view
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
" OR "	TokenNameStringLiteral	 OR 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
" Sort by"	TokenNameStringLiteral	 Sort by
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nameButton	TokenNameIdentifier	 name Button
=	TokenNameEQUAL	
addButton	TokenNameIdentifier	 add Button
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valueButton	TokenNameIdentifier	 value Button
=	TokenNameEQUAL	
addButton	TokenNameIdentifier	 add Button
(	TokenNameLPAREN	
"weight"	TokenNameStringLiteral	weight
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//absoluteValueButton=addButton("|weight|",group,false); 	TokenNameCOMMENT_LINE	absoluteValueButton=addButton("|weight|",group,false); 
}	TokenNameRBRACE	
private	TokenNameprivate	
JRadioButton	TokenNameIdentifier	 J Radio Button
addButton	TokenNameIdentifier	 add Button
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ButtonGroup	TokenNameIdentifier	 Button Group
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JRadioButton	TokenNameIdentifier	 J Radio Button
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButton	TokenNameIdentifier	 J Radio Button
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
button	TokenNameIdentifier	 button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
button	TokenNameIdentifier	 button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
button	TokenNameIdentifier	 button
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
button	TokenNameIdentifier	 button
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
class	TokenNameclass	
MyViewer	TokenNameIdentifier	 My Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
implements	TokenNameimplements	
Controllable	TokenNameIdentifier	 Controllable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080128L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HyperplaneControls	TokenNameIdentifier	 Hyperplane Controls
controls	TokenNameIdentifier	 controls
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//private Vector features = new Vector(); 	TokenNameCOMMENT_LINE	private Vector features = new Vector(); 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
applyControls	TokenNameIdentifier	 apply Controls
(	TokenNameLPAREN	
ViewerControls	TokenNameIdentifier	 Viewer Controls
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
controls	TokenNameIdentifier	 controls
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HyperplaneControls	TokenNameIdentifier	 Hyperplane Controls
)	TokenNameRPAREN	
controls	TokenNameIdentifier	 controls
;	TokenNameSEMICOLON	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Hyperplane	TokenNameIdentifier	 Hyperplane
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//DefaultMutableTreeNode node = top; 	TokenNameCOMMENT_LINE	DefaultMutableTreeNode node = top; 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//String whole=((Feature)data[start][0]).toString(); 	TokenNameCOMMENT_LINE	String whole=((Feature)data[start][0]).toString(); 
double	TokenNamedouble	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
<=	TokenNameLESS_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPart	TokenNameIdentifier	 get Part
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nextTok	TokenNameIdentifier	 next Tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPart	TokenNameIdentifier	 get Part
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextTok	TokenNameIdentifier	 next Tok
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
nextTok	TokenNameIdentifier	 next Tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPart	TokenNameIdentifier	 get Part
(	TokenNameLPAREN	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flag	TokenNameIdentifier	 flag
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
JTree	TokenNameIdentifier	 J Tree
createTree	TokenNameIdentifier	 create Tree
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JTree	TokenNameIdentifier	 J Tree
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultMutableTreeNode	TokenNameIdentifier	 Default Mutable Tree Node
(	TokenNameLPAREN	
"Features Tree"	TokenNameStringLiteral	Features Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createNodes	TokenNameIdentifier	 create Nodes
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
new	TokenNamenew	
JTree	TokenNameIdentifier	 J Tree
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
hyperplaneWeights	TokenNameIdentifier	 hyperplane Weights
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableData	TokenNameIdentifier	 table Data
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
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
tableData	TokenNameIdentifier	 table Data
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
tableData	TokenNameIdentifier	 table Data
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
tableData	TokenNameIdentifier	 table Data
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ra	TokenNameIdentifier	 ra
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rb	TokenNameIdentifier	 rb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
nameButton	TokenNameIdentifier	 name Button
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
treeButton	TokenNameIdentifier	 tree Button
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ra	TokenNameIdentifier	 ra
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
rb	TokenNameIdentifier	 rb
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
da	TokenNameIdentifier	 da
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
ra	TokenNameIdentifier	 ra
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Double	TokenNameIdentifier	 Double
db	TokenNameIdentifier	 db
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
rb	TokenNameIdentifier	 rb
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
valueButton	TokenNameIdentifier	 value Button
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
MathUtil	TokenNameIdentifier	 Math Util
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
da	TokenNameIdentifier	 da
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
MathUtil	TokenNameIdentifier	 Math Util
.	TokenNameDOT	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
da	TokenNameIdentifier	 da
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JTree	TokenNameIdentifier	 J Tree
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
treeButton	TokenNameIdentifier	 tree Button
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
createTree	TokenNameIdentifier	 create Tree
(	TokenNameLPAREN	
tableData	TokenNameIdentifier	 table Data
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
columnNames	TokenNameIdentifier	 column Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Feature Name"	TokenNameStringLiteral	Feature Name
,	TokenNameCOMMA	
"Weight"	TokenNameStringLiteral	Weight
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
JTable	TokenNameIdentifier	 J Table
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
JTable	TokenNameIdentifier	 J Table
(	TokenNameLPAREN	
tableData	TokenNameIdentifier	 table Data
,	TokenNameCOMMA	
columnNames	TokenNameIdentifier	 column Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"[Hyperplane:"	TokenNameStringLiteral	[Hyperplane:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
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
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
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
}	TokenNameRBRACE	

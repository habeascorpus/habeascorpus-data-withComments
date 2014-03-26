/* Copyright 2006, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2006, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
ranking	TokenNameIdentifier	 ranking
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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
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
Instance	TokenNameIdentifier	 Instance
;	TokenNameSEMICOLON	
/** * Learns to rank sets of examples, rather than to classify individual examples. * * Data is presented to a BatchRankingLearner as an ordinary binary * dataset. Examples from the same subpopulation are comparable, and * should be ranked so that positive examples have a higher score than * negative examples. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Learns to rank sets of examples, rather than to classify individual examples. * Data is presented to a BatchRankingLearner as an ordinary binary dataset. Examples from the same subpopulation are comparable, and should be ranked so that positive examples have a higher score than negative examples. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BatchRankingLearner	TokenNameIdentifier	 Batch Ranking Learner
extends	TokenNameextends	
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
{	TokenNameLBRACE	
/** Sort a dataset into 'rankings'. Each ranking is a List of * Examples such that all positive examples in the list should be * ranked above all negative examples. Returns a map so that * map.get(key) is an ArrayList of examples. */	TokenNameCOMMENT_JAVADOC	 Sort a dataset into 'rankings'. Each ranking is a List of Examples such that all positive examples in the list should be ranked above all negative examples. Returns a map so that map.get(key) is an ArrayList of examples. 
static	TokenNamestatic	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
splitIntoRankings	TokenNameIdentifier	 split Into Rankings
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
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
data	TokenNameIdentifier	 data
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
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Split a Map output by splitIntoRankings into lists that contain * exactly one positive example each. */	TokenNameCOMMENT_JAVADOC	 Split a Map output by splitIntoRankings into lists that contain exactly one positive example each. 
static	TokenNamestatic	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
listsWithOneExampleEach	TokenNameIdentifier	 lists With One Example Each
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
rankingLists	TokenNameIdentifier	 ranking Lists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
map1	TokenNameIdentifier	 map1
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
rankingLists	TokenNameIdentifier	 ranking Lists
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
posExamples	TokenNameIdentifier	 pos Examples
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
negExamples	TokenNameIdentifier	 neg Examples
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ranking	TokenNameIdentifier	 ranking
=	TokenNameEQUAL	
rankingLists	TokenNameIdentifier	 ranking Lists
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
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
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
exi	TokenNameIdentifier	 exi
=	TokenNameEQUAL	
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exi	TokenNameIdentifier	 exi
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posExamples	TokenNameIdentifier	 pos Examples
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
exi	TokenNameIdentifier	 exi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
negExamples	TokenNameIdentifier	 neg Examples
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
exi	TokenNameIdentifier	 exi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
posExamples	TokenNameIdentifier	 pos Examples
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
exi	TokenNameIdentifier	 exi
=	TokenNameEQUAL	
posExamples	TokenNameIdentifier	 pos Examples
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ranking1	TokenNameIdentifier	 ranking1
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranking1	TokenNameIdentifier	 ranking1
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
negExamples	TokenNameIdentifier	 neg Examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ranking1	TokenNameIdentifier	 ranking1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
exi	TokenNameIdentifier	 exi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map1	TokenNameIdentifier	 map1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
ranking1	TokenNameIdentifier	 ranking1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
map1	TokenNameIdentifier	 map1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sort a List of Instances by score according to the classifier. */	TokenNameCOMMENT_JAVADOC	 Sort a List of Instances by score according to the classifier. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
sortByScore	TokenNameIdentifier	 sort By Score
(	TokenNameLPAREN	
final	TokenNamefinal	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
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
Example	TokenNameIdentifier	 Example
instA	TokenNameIdentifier	 inst A
,	TokenNameCOMMA	
Example	TokenNameIdentifier	 Example
instB	TokenNameIdentifier	 inst B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instB	TokenNameIdentifier	 inst B
)	TokenNameRPAREN	
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instA	TokenNameIdentifier	 inst A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
// rather than be random, sort negative examples 	TokenNameCOMMENT_LINE	rather than be random, sort negative examples 
// above positive if scores are the same 	TokenNameCOMMENT_LINE	above positive if scores are the same 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
instA	TokenNameIdentifier	 inst A
instanceof	TokenNameinstanceof	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
instB	TokenNameIdentifier	 inst B
instanceof	TokenNameinstanceof	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
exA	TokenNameIdentifier	 ex A
=	TokenNameEQUAL	
instA	TokenNameIdentifier	 inst A
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
exB	TokenNameIdentifier	 ex B
=	TokenNameEQUAL	
instB	TokenNameIdentifier	 inst B
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
exA	TokenNameIdentifier	 ex A
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
exB	TokenNameIdentifier	 ex B
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

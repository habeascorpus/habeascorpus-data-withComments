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
svm	TokenNameIdentifier	 svm
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
libsvm	TokenNameIdentifier	 libsvm
.	TokenNameDOT	
svm_node	TokenNameIdentifier	 svm node
;	TokenNameSEMICOLON	
import	TokenNameimport	
libsvm	TokenNameIdentifier	 libsvm
.	TokenNameDOT	
svm_problem	TokenNameIdentifier	 svm problem
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
FeatureFactory	TokenNameIdentifier	 Feature Factory
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
MutableInstance	TokenNameIdentifier	 Mutable Instance
;	TokenNameSEMICOLON	
/** * Provides some basic utilities for dealing with libsvm. * It can convert Features to nodes, instances to node arrays and Datasets to problems. * * @author ksteppe, Frank Lin */	TokenNameCOMMENT_JAVADOC	 Provides some basic utilities for dealing with libsvm. It can convert Features to nodes, instances to node arrays and Datasets to problems. * @author ksteppe, Frank Lin 
public	TokenNamepublic	
class	TokenNameclass	
SVMUtils	TokenNameIdentifier	 SVM Utils
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SVMUtils	TokenNameIdentifier	 SVM Utils
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
svm_node	TokenNameIdentifier	 svm node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
svm_node	TokenNameIdentifier	 svm node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
svm_problem	TokenNameIdentifier	 svm problem
problem	TokenNameIdentifier	 problem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
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
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
y	TokenNameIdentifier	 y
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" : "	TokenNameStringLiteral	 : 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
svm_node	TokenNameIdentifier	 svm node
>	TokenNameGREATER	
NODE_COMPARATOR	TokenNameIdentifier	 NODE  COMPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
svm_node	TokenNameIdentifier	 svm node
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
svm_node	TokenNameIdentifier	 svm node
n1	TokenNameIdentifier	 n1
,	TokenNameCOMMA	
svm_node	TokenNameIdentifier	 svm node
n2	TokenNameIdentifier	 n2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n1	TokenNameIdentifier	 n1
.	TokenNameDOT	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
n2	TokenNameIdentifier	 n2
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * converts the feature into an svm_node * * @param feature Feature to convert into a node * @param instance Instance feature is in - used to retrieve the weight of the feature * @return svm_node */	TokenNameCOMMENT_JAVADOC	 converts the feature into an svm_node * @param feature Feature to convert into a node @param instance Instance feature is in - used to retrieve the weight of the feature @return svm_node 
public	TokenNamepublic	
static	TokenNamestatic	
svm_node	TokenNameIdentifier	 svm node
featureToNode	TokenNameIdentifier	 feature To Node
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svm_node	TokenNameIdentifier	 svm node
svm_node	TokenNameIdentifier	 svm node
=	TokenNameEQUAL	
new	TokenNamenew	
svm_node	TokenNameIdentifier	 svm node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// important: LIBSVM feature index starts at 1, not 0 	TokenNameCOMMENT_LINE	important: LIBSVM feature index starts at 1, not 0 
svm_node	TokenNameIdentifier	 svm node
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
svm_node	TokenNameIdentifier	 svm node
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svm_node	TokenNameIdentifier	 svm node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * creates the node array from an instance * * @param instance Instance to convert * @return node array with all the features from the instance */	TokenNameCOMMENT_JAVADOC	 creates the node array from an instance * @param instance Instance to convert @return node array with all the features from the instance 
public	TokenNamepublic	
static	TokenNamestatic	
svm_node	TokenNameIdentifier	 svm node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
instanceToNodeArray	TokenNameIdentifier	 instance To Node Array
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
svm_node	TokenNameIdentifier	 svm node
>	TokenNameGREATER	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
svm_node	TokenNameIdentifier	 svm node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
featureToNode	TokenNameIdentifier	 feature To Node
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sorting in ascending order is required by LIBSVM 	TokenNameCOMMENT_LINE	sorting in ascending order is required by LIBSVM 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
,	TokenNameCOMMA	
NODE_COMPARATOR	TokenNameIdentifier	 NODE  COMPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
svm_node	TokenNameIdentifier	 svm node
[	TokenNameLBRACKET	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert the given dataset into a svm_problem object by looping * through the examples and features - features are resorted numericly * * @param dataset - must contain features with integer names * @return a fully loaded svm_problem object */	TokenNameCOMMENT_JAVADOC	 convert the given dataset into a svm_problem object by looping through the examples and features - features are resorted numericly * @param dataset - must contain features with integer names @return a fully loaded svm_problem object 
public	TokenNamepublic	
static	TokenNamestatic	
svm_problem	TokenNameIdentifier	 svm problem
convertToSVMProblem	TokenNameIdentifier	 convert To SVM Problem
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create the problem data structure 	TokenNameCOMMENT_LINE	create the problem data structure 
svm_problem	TokenNameIdentifier	 svm problem
problem	TokenNameIdentifier	 problem
=	TokenNameEQUAL	
new	TokenNamenew	
svm_problem	TokenNameIdentifier	 svm problem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
new	TokenNamenew	
svm_node	TokenNameIdentifier	 svm node
[	TokenNameLBRACKET	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
l	TokenNameIdentifier	 l
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// fill it with instance information 	TokenNameCOMMENT_LINE	fill it with instance information 
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// call different label index methods depending on schema 	TokenNameCOMMENT_LINE	call different label index methods depending on schema 
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
problem	TokenNameIdentifier	 problem
.	TokenNameDOT	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
instanceToNodeArray	TokenNameIdentifier	 instance To Node Array
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
problem	TokenNameIdentifier	 problem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert a svm_node to a feature * * @param node svm_node from LIBSVM * @param featureFactory FeatureIdFactory object holds feature and its id information. * @return Feature Feature converted from svm_node */	TokenNameCOMMENT_JAVADOC	 convert a svm_node to a feature * @param node svm_node from LIBSVM @param featureFactory FeatureIdFactory object holds feature and its id information. @return Feature Feature converted from svm_node 
public	TokenNamepublic	
static	TokenNamestatic	
Feature	TokenNameIdentifier	 Feature
nodeToFeature	TokenNameIdentifier	 node To Feature
(	TokenNameLPAREN	
svm_node	TokenNameIdentifier	 svm node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
FeatureFactory	TokenNameIdentifier	 Feature Factory
featureFactory	TokenNameIdentifier	 feature Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// important: LIBSVM feature index starts at 1, not 0 	TokenNameCOMMENT_LINE	important: LIBSVM feature index starts at 1, not 0 
return	TokenNamereturn	
featureFactory	TokenNameIdentifier	 feature Factory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * creates an instance from the node array * * @param nodes svm_node array from LIBSVM * @param featureFactory FeatureFactory object holds feature and its id * @return Instance Instance with the Features converted from input node array */	TokenNameCOMMENT_JAVADOC	 creates an instance from the node array * @param nodes svm_node array from LIBSVM @param featureFactory FeatureFactory object holds feature and its id @return Instance Instance with the Features converted from input node array 
public	TokenNamepublic	
static	TokenNamestatic	
Instance	TokenNameIdentifier	 Instance
nodeArrayToInstance	TokenNameIdentifier	 node Array To Instance
(	TokenNameLPAREN	
svm_node	TokenNameIdentifier	 svm node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nodes	TokenNameIdentifier	 nodes
,	TokenNameCOMMA	
FeatureFactory	TokenNameIdentifier	 Feature Factory
featureFactory	TokenNameIdentifier	 feature Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
nodeToFeature	TokenNameIdentifier	 node To Feature
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
featureFactory	TokenNameIdentifier	 feature Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

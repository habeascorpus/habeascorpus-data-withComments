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
LinkedList	TokenNameIdentifier	 Linked List
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
ListIterator	TokenNameIdentifier	 List Iterator
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
Classifier	TokenNameIdentifier	 Classifier
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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
;	TokenNameSEMICOLON	
/** * A budgeted version of binary MIRA. * * Status: this doesn't seem to work too well in tests. * The algorithm might be buggy. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A budgeted version of binary MIRA. * Status: this doesn't seem to work too well in tests. The algorithm might be buggy. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
BBMira	TokenNameIdentifier	 BB Mira
extends	TokenNameextends	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
BBMira	TokenNameIdentifier	 BB Mira
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//private static final boolean DEBUG = false; 	TokenNameCOMMENT_LINE	private static final boolean DEBUG = false; 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedExample	TokenNameIdentifier	 Weighted Example
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
minimalMargin	TokenNameIdentifier	 minimal Margin
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
useBudget	TokenNameIdentifier	 use Budget
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
usedFeatures	TokenNameIdentifier	 used Features
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BBMira	TokenNameIdentifier	 BB Mira
(	TokenNameLPAREN	
boolean	TokenNameboolean	
useBudget	TokenNameIdentifier	 use Budget
,	TokenNameCOMMA	
double	TokenNamedouble	
minimalMargin	TokenNameIdentifier	 minimal Margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
useBudget	TokenNameIdentifier	 use Budget
=	TokenNameEQUAL	
useBudget	TokenNameIdentifier	 use Budget
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minimalMargin	TokenNameIdentifier	 minimal Margin
=	TokenNameEQUAL	
minimalMargin	TokenNameIdentifier	 minimal Margin
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BBMira	TokenNameIdentifier	 BB Mira
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeightedExample	TokenNameIdentifier	 Weighted Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usedFeatures	TokenNameIdentifier	 used Features
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
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
Instance	TokenNameIdentifier	 Instance
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// simulate initialization of w_t to unit values for each feature 	TokenNameCOMMENT_LINE	simulate initialization of w_t to unit values for each feature 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
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
usedFeatures	TokenNameIdentifier	 used Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"y="	TokenNameStringLiteral	y=
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
" s="	TokenNameStringLiteral	 s=
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" for "	TokenNameStringLiteral	 for 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
<=	TokenNameLESS_EQUAL	
minimalMargin	TokenNameIdentifier	 minimal Margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tau_t	TokenNameIdentifier	 tau t
=	TokenNameEQUAL	
truncateG	TokenNameIdentifier	 truncate G
(	TokenNameLPAREN	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
/	TokenNameDIVIDE	
kernel	TokenNameIdentifier	 kernel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"update: y*s = "	TokenNameStringLiteral	update: y*s = 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" ||x||^2 = "	TokenNameStringLiteral	 ||x||^2 = 
+	TokenNamePLUS	
kernel	TokenNameIdentifier	 kernel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
" tau_t = "	TokenNameStringLiteral	 tau_t = 
+	TokenNamePLUS	
tau_t	TokenNameIdentifier	 tau t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tau_t	TokenNameIdentifier	 tau t
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
tau_t	TokenNameIdentifier	 tau t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedExample	TokenNameIdentifier	 Weighted Example
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
tau_t	TokenNameIdentifier	 tau t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"into cache, useBudget="	TokenNameStringLiteral	into cache, useBudget=
+	TokenNamePLUS	
useBudget	TokenNameIdentifier	 use Budget
+	TokenNamePLUS	
" tau="	TokenNameStringLiteral	 tau=
+	TokenNamePLUS	
tau_t	TokenNameIdentifier	 tau t
+	TokenNamePLUS	
" :"	TokenNameStringLiteral	 :
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useBudget	TokenNameIdentifier	 use Budget
)	TokenNameRPAREN	
distillCache	TokenNameIdentifier	 distill Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inner product of x1 and x2 	TokenNameCOMMENT_LINE	inner product of x1 and x2 
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
kernel	TokenNameIdentifier	 kernel
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
result	TokenNameIdentifier	 result
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
x1	TokenNameIdentifier	 x1
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
result	TokenNameIdentifier	 result
+=	TokenNamePLUS_EQUAL	
x1	TokenNameIdentifier	 x1
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
x2	TokenNameIdentifier	 x2
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// correction of +1 is for the hyperplaneBias feature, which is 	TokenNameCOMMENT_LINE	correction of +1 is for the hyperplaneBias feature, which is 
// always invisibly present 	TokenNameCOMMENT_LINE	always invisibly present 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Crammer & Singer's G function 	TokenNameCOMMENT_LINE	Crammer & Singer's G function 
private	TokenNameprivate	
double	TokenNamedouble	
truncateG	TokenNameIdentifier	 truncate G
(	TokenNameLPAREN	
double	TokenNamedouble	
z	TokenNameIdentifier	 z
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
z	TokenNameIdentifier	 z
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// the cache 	TokenNameCOMMENT_LINE	the cache 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
WeightedExample	TokenNameIdentifier	 Weighted Example
{	TokenNameLBRACE	
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
public	TokenNamepublic	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WeightedExample	TokenNameIdentifier	 Weighted Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
alpha	TokenNameIdentifier	 alpha
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
"[WX: "	TokenNameStringLiteral	[WX: 
+	TokenNamePLUS	
example	TokenNameIdentifier	 example
+	TokenNamePLUS	
" alpha="	TokenNameStringLiteral	 alpha=
+	TokenNamePLUS	
alpha	TokenNameIdentifier	 alpha
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
distillCache	TokenNameIdentifier	 distill Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"distilling cache, size="	TokenNameStringLiteral	distilling cache, size=
+	TokenNamePLUS	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
somethingRemoved	TokenNameIdentifier	 something Removed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
somethingRemoved	TokenNameIdentifier	 something Removed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
somethingRemoved	TokenNameIdentifier	 something Removed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
<	TokenNameLESS	
WeightedExample	TokenNameIdentifier	 Weighted Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
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
WeightedExample	TokenNameIdentifier	 Weighted Example
wx	TokenNameIdentifier	 wx
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
wx	TokenNameIdentifier	 wx
.	TokenNameDOT	
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
Instance	TokenNameIdentifier	 Instance
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
wx	TokenNameIdentifier	 wx
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//double currentPrediction = cacheScore(cache,x); 	TokenNameCOMMENT_LINE	double currentPrediction = cacheScore(cache,x); 
double	TokenNamedouble	
currentPrediction	TokenNameIdentifier	 current Prediction
=	TokenNameEQUAL	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
wxContribution	TokenNameIdentifier	 wx Contribution
=	TokenNameEQUAL	
kernel	TokenNameIdentifier	 kernel
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
wx	TokenNameIdentifier	 wx
.	TokenNameDOT	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentPrediction	TokenNameIdentifier	 current Prediction
-	TokenNameMINUS	
wxContribution	TokenNameIdentifier	 wx Contribution
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
minimalMargin	TokenNameIdentifier	 minimal Margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
somethingRemoved	TokenNameIdentifier	 something Removed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
wx	TokenNameIdentifier	 wx
.	TokenNameDOT	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"reduced cache to "	TokenNameStringLiteral	reduced cache to 
+	TokenNamePLUS	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" entries"	TokenNameStringLiteral	 entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
"[BBMira "	TokenNameStringLiteral	[BBMira 
+	TokenNamePLUS	
useBudget	TokenNameIdentifier	 use Budget
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
minimalMargin	TokenNameIdentifier	 minimal Margin
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

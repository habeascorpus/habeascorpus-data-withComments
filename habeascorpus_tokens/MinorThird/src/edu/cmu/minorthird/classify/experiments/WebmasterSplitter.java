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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
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
Map	TokenNameIdentifier	 Map
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
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtil	TokenNameIdentifier	 String Util
;	TokenNameSEMICOLON	
/** * A complicated splitter that stratifies samples according to an * arbitrary "profile" property, and restricts train/test splits to * not cross boundaries defined by "user" and "request" properties. * This will do a random split according to users, then a stratified * split according to requests (with the stratification done * according to profiles). * * <p>Constraints on splitting are defined by a file with * multiple lines of the form * <code><pre> * msgId userId requestId profileId * </pre></code>. * where each Id is a String. * * <p>The main purpose is of this is to split webmaster data, hence * the name. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A complicated splitter that stratifies samples according to an arbitrary "profile" property, and restricts train/test splits to not cross boundaries defined by "user" and "request" properties. This will do a random split according to users, then a stratified split according to requests (with the stratification done according to profiles). * <p>Constraints on splitting are defined by a file with multiple lines of the form <code><pre> msgId userId requestId profileId </pre></code>. where each Id is a String. * <p>The main purpose is of this is to split webmaster data, hence the name. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
WebmasterSplitter	TokenNameIdentifier	 Webmaster Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
WebmasterSplitter	TokenNameIdentifier	 Webmaster Splitter
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// number of cross-validation splits for the r-th population 	TokenNameCOMMENT_LINE	number of cross-validation splits for the r-th population 
private	TokenNameprivate	
int	TokenNameint	
folds	TokenNameIdentifier	 folds
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// how to split the first r-1 populations 	TokenNameCOMMENT_LINE	how to split the first r-1 populations 
private	TokenNameprivate	
double	TokenNamedouble	
fraction	TokenNameIdentifier	 fraction
=	TokenNameEQUAL	
0.7	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// map subpopulationId -> user 	TokenNameCOMMENT_LINE	map subpopulationId -> user 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
userMap	TokenNameIdentifier	 user Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// map subpopulationId -> request 	TokenNameCOMMENT_LINE	map subpopulationId -> request 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
requestMap	TokenNameIdentifier	 request Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// map subpopulationId -> profile 	TokenNameCOMMENT_LINE	map subpopulationId -> profile 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
profileMap	TokenNameIdentifier	 profile Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// map request -> profile 	TokenNameCOMMENT_LINE	map request -> profile 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
req2ProfileMap	TokenNameIdentifier	 req2 Profile Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// trainList[k] is training list for fold k 	TokenNameCOMMENT_LINE	trainList[k] is training list for fold k 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
trainList	TokenNameIdentifier	 train List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// testList[k] is test list for fold k 	TokenNameCOMMENT_LINE	testList[k] is test list for fold k 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
testList	TokenNameIdentifier	 test List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WebmasterSplitter	TokenNameIdentifier	 Webmaster Splitter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
constraintFileName	TokenNameIdentifier	 constraint File Name
,	TokenNameCOMMA	
double	TokenNamedouble	
fraction	TokenNameIdentifier	 fraction
,	TokenNameCOMMA	
int	TokenNameint	
folds	TokenNameIdentifier	 folds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
folds	TokenNameIdentifier	 folds
=	TokenNameEQUAL	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fraction	TokenNameIdentifier	 fraction
=	TokenNameEQUAL	
fraction	TokenNameIdentifier	 fraction
;	TokenNameSEMICOLON	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
constraintFileName	TokenNameIdentifier	 constraint File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
constraintFileName	TokenNameIdentifier	 constraint File Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// read in constraints 	TokenNameCOMMENT_LINE	read in constraints 
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
constraintFileName	TokenNameIdentifier	 constraint File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
badInput	TokenNameIdentifier	 bad Input
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
constraintFileName	TokenNameIdentifier	 constraint File Name
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("userMap: '"+f[0]+"' -> "+f[1]); 	TokenNameCOMMENT_LINE	System.out.println("userMap: '"+f[0]+"' -> "+f[1]); 
requestMap	TokenNameIdentifier	 request Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
profileMap	TokenNameIdentifier	 profile Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldProfForRequest	TokenNameIdentifier	 old Prof For Request
=	TokenNameEQUAL	
req2ProfileMap	TokenNameIdentifier	 req2 Profile Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldProfForRequest	TokenNameIdentifier	 old Prof For Request
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
oldProfForRequest	TokenNameIdentifier	 old Prof For Request
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"request "	TokenNameStringLiteral	request 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" associated with two profiles: "	TokenNameStringLiteral	 associated with two profiles: 
+	TokenNamePLUS	
oldProfForRequest	TokenNameIdentifier	 old Prof For Request
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
badInput	TokenNameIdentifier	 bad Input
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
constraintFileName	TokenNameIdentifier	 constraint File Name
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
req2ProfileMap	TokenNameIdentifier	 req2 Profile Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't load from "	TokenNameStringLiteral	can't load from 
+	TokenNamePLUS	
constraintFileName	TokenNameIdentifier	 constraint File Name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
badInput	TokenNameIdentifier	 bad Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Bad input at "	TokenNameStringLiteral	Bad input at 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
" line "	TokenNameStringLiteral	 line 
+	TokenNamePLUS	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
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
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// collect set of users, and also set of requests 	TokenNameCOMMENT_LINE	collect set of users, and also set of requests 
// maintaining list of all examples with each request 	TokenNameCOMMENT_LINE	maintaining list of all examples with each request 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
inputList	TokenNameIdentifier	 input List
=	TokenNameEQUAL	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
users	TokenNameIdentifier	 users
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
requests	TokenNameIdentifier	 requests
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
inputList	TokenNameIdentifier	 input List
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
T	TokenNameIdentifier	 T
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
instanceof	TokenNameinstanceof	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
badExample	TokenNameIdentifier	 bad Example
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
"doesn't have a subpopulationId"	TokenNameStringLiteral	doesn't have a subpopulationId
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
hsi	TokenNameIdentifier	 hsi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
subpop	TokenNameIdentifier	 subpop
=	TokenNameEQUAL	
hsi	TokenNameIdentifier	 hsi
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
userMap	TokenNameIdentifier	 user Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
userId	TokenNameIdentifier	 user Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
badExample	TokenNameIdentifier	 bad Example
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
"no userId for "	TokenNameStringLiteral	no userId for 
+	TokenNamePLUS	
subpop	TokenNameIdentifier	 subpop
+	TokenNamePLUS	
" in the constraint file"	TokenNameStringLiteral	 in the constraint file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
users	TokenNameIdentifier	 users
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
userId	TokenNameIdentifier	 user Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
reqId	TokenNameIdentifier	 req Id
=	TokenNameEQUAL	
requestMap	TokenNameIdentifier	 request Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
requests	TokenNameIdentifier	 requests
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reqId	TokenNameIdentifier	 req Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//split users 	TokenNameCOMMENT_LINE	split users 
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
userSplitter	TokenNameIdentifier	 user Splitter
=	TokenNameEQUAL	
new	TokenNamenew	
RandomSplitter	TokenNameIdentifier	 Random Splitter
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
fraction	TokenNameIdentifier	 fraction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userSplitter	TokenNameIdentifier	 user Splitter
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
users	TokenNameIdentifier	 users
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
testUsers	TokenNameIdentifier	 test Users
=	TokenNameEQUAL	
asSet	TokenNameIdentifier	 as Set
(	TokenNameLPAREN	
userSplitter	TokenNameIdentifier	 user Splitter
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
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
"testUsers = "	TokenNameStringLiteral	testUsers = 
+	TokenNamePLUS	
testUsers	TokenNameIdentifier	 test Users
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do cross-val split of requests stratified by profile 	TokenNameCOMMENT_LINE	do cross-val split of requests stratified by profile 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
requestList	TokenNameIdentifier	 request List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
requests	TokenNameIdentifier	 requests
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
requestList	TokenNameIdentifier	 request List
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
requests	TokenNameIdentifier	 requests
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
byProfile	TokenNameIdentifier	 by Profile
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
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
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("comparing "+o1+" and "+o2); 	TokenNameCOMMENT_LINE	System.out.println("comparing "+o1+" and "+o2); 
String	TokenNameIdentifier	 String
prof1	TokenNameIdentifier	 prof1
=	TokenNameEQUAL	
req2ProfileMap	TokenNameIdentifier	 req2 Profile Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prof2	TokenNameIdentifier	 prof2
=	TokenNameEQUAL	
req2ProfileMap	TokenNameIdentifier	 req2 Profile Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
prof1	TokenNameIdentifier	 prof1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
prof2	TokenNameIdentifier	 prof2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
requestList	TokenNameIdentifier	 request List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
requestList	TokenNameIdentifier	 request List
,	TokenNameCOMMA	
byProfile	TokenNameIdentifier	 by Profile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
partition	TokenNameIdentifier	 partition
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
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
partition	TokenNameIdentifier	 partition
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
requestList	TokenNameIdentifier	 request List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
partition	TokenNameIdentifier	 partition
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
folds	TokenNameIdentifier	 folds
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
requestList	TokenNameIdentifier	 request List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
profilesForPartition	TokenNameIdentifier	 profiles For Partition
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
partition	TokenNameIdentifier	 partition
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
profilesForPartition	TokenNameIdentifier	 profiles For Partition
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
req2ProfileMap	TokenNameIdentifier	 req2 Profile Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"partition "	TokenNameStringLiteral	partition 
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
partition	TokenNameIdentifier	 partition
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
+	TokenNamePLUS	
" profiles: "	TokenNameStringLiteral	 profiles: 
+	TokenNamePLUS	
profilesForPartition	TokenNameIdentifier	 profiles For Partition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// allocate the test and training lists 	TokenNameCOMMENT_LINE	allocate the test and training lists 
trainList	TokenNameIdentifier	 train List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
folds	TokenNameIdentifier	 folds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testList	TokenNameIdentifier	 test List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
List	TokenNameIdentifier	 List
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
trainList	TokenNameIdentifier	 train List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// populate them 	TokenNameCOMMENT_LINE	populate them 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
inputList	TokenNameIdentifier	 input List
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
T	TokenNameIdentifier	 T
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
hsi	TokenNameIdentifier	 hsi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
subpop	TokenNameIdentifier	 subpop
=	TokenNameEQUAL	
hsi	TokenNameIdentifier	 hsi
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
userId	TokenNameIdentifier	 user Id
=	TokenNameEQUAL	
userMap	TokenNameIdentifier	 user Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
reqId	TokenNameIdentifier	 req Id
=	TokenNameEQUAL	
requestMap	TokenNameIdentifier	 request Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
partitionContaining	TokenNameIdentifier	 partition Containing
(	TokenNameLPAREN	
partition	TokenNameIdentifier	 partition
,	TokenNameCOMMA	
reqId	TokenNameIdentifier	 req Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testUsers	TokenNameIdentifier	 test Users
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
userId	TokenNameIdentifier	 user Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
trainList	TokenNameIdentifier	 train List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
verifySplit	TokenNameIdentifier	 verify Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
badExample	TokenNameIdentifier	 bad Example
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" on input "	TokenNameStringLiteral	 on input 
+	TokenNamePLUS	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
partitionContaining	TokenNameIdentifier	 partition Containing
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
partition	TokenNameIdentifier	 partition
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
req	TokenNameIdentifier	 req
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
partition	TokenNameIdentifier	 partition
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
partition	TokenNameIdentifier	 partition
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
req	TokenNameIdentifier	 req
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"request id "	TokenNameStringLiteral	request id 
+	TokenNamePLUS	
req	TokenNameIdentifier	 req
+	TokenNamePLUS	
" not found in partition???"	TokenNameStringLiteral	 not found in partition???
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check correctness of split 	TokenNameCOMMENT_LINE	check correctness of split 
private	TokenNameprivate	
void	TokenNamevoid	
verifySplit	TokenNameIdentifier	 verify Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
trainList	TokenNameIdentifier	 train List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
oi	TokenNameIdentifier	 oi
=	TokenNameEQUAL	
trainList	TokenNameIdentifier	 train List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
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
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
oj	TokenNameIdentifier	 oj
=	TokenNameEQUAL	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
similarTo	TokenNameIdentifier	 similar To
(	TokenNameLPAREN	
oi	TokenNameIdentifier	 oi
,	TokenNameCOMMA	
oj	TokenNameIdentifier	 oj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"bad split for train/test "	TokenNameStringLiteral	bad split for train/test 
+	TokenNamePLUS	
oi	TokenNameIdentifier	 oi
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
oj	TokenNameIdentifier	 oj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
<	TokenNameLESS	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
<	TokenNameLESS	
folds	TokenNameIdentifier	 folds
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
!=	TokenNameNOT_EQUAL	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j1	TokenNameIdentifier	 j1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j1	TokenNameIdentifier	 j1
<	TokenNameLESS	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j1	TokenNameIdentifier	 j1
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j2	TokenNameIdentifier	 j2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j2	TokenNameIdentifier	 j2
<	TokenNameLESS	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j2	TokenNameIdentifier	 j2
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j1	TokenNameIdentifier	 j1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j2	TokenNameIdentifier	 j2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"overlapping test cases for lists "	TokenNameStringLiteral	overlapping test cases for lists 
+	TokenNamePLUS	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
similarTo	TokenNameIdentifier	 similar To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
subpop1	TokenNameIdentifier	 subpop1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
subpop2	TokenNameIdentifier	 subpop2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
userMap	TokenNameIdentifier	 user Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop1	TokenNameIdentifier	 subpop1
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
userMap	TokenNameIdentifier	 user Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop2	TokenNameIdentifier	 subpop2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
requestMap	TokenNameIdentifier	 request Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop1	TokenNameIdentifier	 subpop1
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
requestMap	TokenNameIdentifier	 request Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop2	TokenNameIdentifier	 subpop2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
trainList	TokenNameIdentifier	 train List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
"[WebmasterSplitter "	TokenNameStringLiteral	[WebmasterSplitter 
+	TokenNamePLUS	
folds	TokenNameIdentifier	 folds
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
WebmasterSplitter	TokenNameIdentifier	 Webmaster Splitter
<	TokenNameLESS	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
=	TokenNameEQUAL	
new	TokenNamenew	
WebmasterSplitter	TokenNameIdentifier	 Webmaster Splitter
<	TokenNameLESS	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
>	TokenNameGREATER	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
0.7	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
atoi	TokenNameIdentifier	 atoi
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
subpop	TokenNameIdentifier	 subpop
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[Ex "	TokenNameStringLiteral	[Ex 
+	TokenNamePLUS	
subpop	TokenNameIdentifier	 subpop
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subpop	TokenNameIdentifier	 subpop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
totTestSize	TokenNameIdentifier	 tot Test Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
totTrainSize	TokenNameIdentifier	 tot Train Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totTestSize	TokenNameIdentifier	 tot Test Size
+=	TokenNamePLUS_EQUAL	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totTrainSize	TokenNameIdentifier	 tot Train Size
+=	TokenNamePLUS_EQUAL	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"fold "	TokenNameStringLiteral	fold 
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"test: "	TokenNameStringLiteral	test: 
+	TokenNamePLUS	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
testList	TokenNameIdentifier	 test List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"train: "	TokenNameStringLiteral	train: 
+	TokenNamePLUS	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
trainList	TokenNameIdentifier	 train List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"data.size = "	TokenNameStringLiteral	data.size = 
+	TokenNamePLUS	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"total test size="	TokenNameStringLiteral	total test size=
+	TokenNamePLUS	
totTestSize	TokenNameIdentifier	 tot Test Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"total train size="	TokenNameStringLiteral	total train size=
+	TokenNamePLUS	
totTrainSize	TokenNameIdentifier	 tot Train Size
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: WebmasterSplitter constraint-file #folds"	TokenNameStringLiteral	usage: WebmasterSplitter constraint-file #folds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
accum	TokenNameIdentifier	 accum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
asSet	TokenNameIdentifier	 as Set
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
accum	TokenNameIdentifier	 accum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

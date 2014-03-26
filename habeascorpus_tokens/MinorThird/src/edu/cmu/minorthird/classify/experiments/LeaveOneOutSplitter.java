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
Random	TokenNameIdentifier	 Random
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
/** * Do N-fold cross-validation, where N is the number of different * subpopulations. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Do N-fold cross-validation, where N is the number of different subpopulations. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
LeaveOneOutSplitter	TokenNameIdentifier	 Leave One Out Splitter
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
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
crossValSplitter	TokenNameIdentifier	 cross Val Splitter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LeaveOneOutSplitter	TokenNameIdentifier	 Leave One Out Splitter
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
random	TokenNameIdentifier	 random
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LeaveOneOutSplitter	TokenNameIdentifier	 Leave One Out Splitter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
subpops	TokenNameIdentifier	 subpops
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
{	TokenNameLBRACE	
T	TokenNameIdentifier	 T
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find subpop id, and record it 	TokenNameCOMMENT_LINE	find subpop id, and record it 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
"youNeeekID#"	TokenNameStringLiteral	youNeeekID#
+	TokenNamePLUS	
subpops	TokenNameIdentifier	 subpops
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subpops	TokenNameIdentifier	 subpops
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
crossValSplitter	TokenNameIdentifier	 cross Val Splitter
=	TokenNameEQUAL	
new	TokenNamenew	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
subpops	TokenNameIdentifier	 subpops
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crossValSplitter	TokenNameIdentifier	 cross Val Splitter
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
crossValSplitter	TokenNameIdentifier	 cross Val Splitter
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
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
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
crossValSplitter	TokenNameIdentifier	 cross Val Splitter
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
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
crossValSplitter	TokenNameIdentifier	 cross Val Splitter
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
"[LeaveOneOutSplitter]"	TokenNameStringLiteral	[LeaveOneOutSplitter]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

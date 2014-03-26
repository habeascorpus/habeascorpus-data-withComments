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
relational	TokenNameIdentifier	 relational
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
Serializable	TokenNameIdentifier	 Serializable
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
DatasetLoader	TokenNameIdentifier	 Dataset Loader
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
SGMExample	TokenNameIdentifier	 SGM Example
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
Saveable	TokenNameIdentifier	 Saveable
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
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** * A real set of examples for stacked graphical learning -- coreset + relational * template. Currently the legalAggregators include EXISTS and COUNT * * @author Zhenzhen Kou */	TokenNameCOMMENT_JAVADOC	 A real set of examples for stacked graphical learning -- coreset + relational template. Currently the legalAggregators include EXISTS and COUNT * @author Zhenzhen Kou 
public	TokenNamepublic	
class	TokenNameclass	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
extends	TokenNameextends	
CoreRelationalDataset	TokenNameIdentifier	 Core Relational Dataset
implements	TokenNameimplements	
Visible	TokenNameIdentifier	 Visible
,	TokenNameCOMMA	
Saveable	TokenNameIdentifier	 Saveable
,	TokenNameCOMMA	
Dataset	TokenNameIdentifier	 Dataset
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080128L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
aggregators	TokenNameIdentifier	 aggregators
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
legalAggregators	TokenNameIdentifier	 legal Aggregators
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
legalAggregators	TokenNameIdentifier	 legal Aggregators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"EXISTS"	TokenNameStringLiteral	EXISTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalAggregators	TokenNameIdentifier	 legal Aggregators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"COUNT"	TokenNameStringLiteral	COUNT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an aggregator, i.e., save the info. in RelTemp sccript * * @param oper * @param L_type */	TokenNameCOMMENT_JAVADOC	 Add an aggregator, i.e., save the info. in RelTemp sccript * @param oper @param L_type 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
addAggregator	TokenNameIdentifier	 add Aggregator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
oper	TokenNameIdentifier	 oper
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
L_type	TokenNameIdentifier	 L type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
legalAggregators	TokenNameIdentifier	 legal Aggregators
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
oper	TokenNameIdentifier	 oper
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aggregators	TokenNameIdentifier	 aggregators
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
L_type	TokenNameIdentifier	 L type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aggregators	TokenNameIdentifier	 aggregators
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
L_type	TokenNameIdentifier	 L type
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
oper	TokenNameIdentifier	 oper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
oper	TokenNameIdentifier	 oper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// why o why clone? - frank 	TokenNameCOMMENT_LINE	why o why clone? - frank 
aggregators	TokenNameIdentifier	 aggregators
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
L_type	TokenNameIdentifier	 L type
,	TokenNameCOMMA	
(	TokenNameLPAREN	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
)	TokenNameRPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
oper	TokenNameIdentifier	 oper
+	TokenNamePLUS	
" is not a legal aggregator"	TokenNameStringLiteral	 is not a legal aggregator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
getAggregators	TokenNameIdentifier	 get Aggregators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aggregators	TokenNameIdentifier	 aggregators
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setAggregators	TokenNameIdentifier	 set Aggregators
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
aggregators	TokenNameIdentifier	 aggregators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
.	TokenNameDOT	
aggregators	TokenNameIdentifier	 aggregators
=	TokenNameEQUAL	
aggregators	TokenNameIdentifier	 aggregators
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public Iterator<Example> iterator(){ 	TokenNameCOMMENT_LINE	public Iterator<Example> iterator(){ 
// final Iterator<Example> inner=examples.iterator(); 	TokenNameCOMMENT_LINE	final Iterator<Example> inner=examples.iterator(); 
// return new Iterator<Example>(){ 	TokenNameCOMMENT_LINE	return new Iterator<Example>(){ 
// public boolean hasNext(){ 	TokenNameCOMMENT_LINE	public boolean hasNext(){ 
// return inner.hasNext(); 	TokenNameCOMMENT_LINE	return inner.hasNext(); 
// } 	TokenNameCOMMENT_LINE	} 
// public Example next(){ 	TokenNameCOMMENT_LINE	public Example next(){ 
// return inner.next(); 	TokenNameCOMMENT_LINE	return inner.next(); 
// } 	TokenNameCOMMENT_LINE	} 
// public void remove(){ 	TokenNameCOMMENT_LINE	public void remove(){ 
// inner.remove(); 	TokenNameCOMMENT_LINE	inner.remove(); 
// } 	TokenNameCOMMENT_LINE	} 
// }; 	TokenNameCOMMENT_LINE	}; 
// } 	TokenNameCOMMENT_LINE	} 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Split	TokenNameIdentifier	 Split
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
final	TokenNamefinal	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Split	TokenNameIdentifier	 Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Dataset	TokenNameIdentifier	 Dataset
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
invertIteration	TokenNameIdentifier	 invert Iteration
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Dataset	TokenNameIdentifier	 Dataset
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
invertIteration	TokenNameIdentifier	 invert Iteration
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
invertIteration	TokenNameIdentifier	 invert Iteration
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
new	TokenNamenew	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
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
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
addSGM	TokenNameIdentifier	 add SGM
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SGMExample	TokenNameIdentifier	 SGM Example
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public Split splitSGM(final Splitter<SGMExample> splitter){ 	TokenNameCOMMENT_LINE	public Split splitSGM(final Splitter<SGMExample> splitter){ 
// splitter.split(iteratorSGM()); 	TokenNameCOMMENT_LINE	splitter.split(iteratorSGM()); 
// return new Split(){ 	TokenNameCOMMENT_LINE	return new Split(){ 
// 	TokenNameCOMMENT_LINE	 
// public int getNumPartitions(){ 	TokenNameCOMMENT_LINE	public int getNumPartitions(){ 
// return splitter.getNumPartitions(); 	TokenNameCOMMENT_LINE	return splitter.getNumPartitions(); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public Dataset getTrain(int k){ 	TokenNameCOMMENT_LINE	public Dataset getTrain(int k){ 
// return invertIterationSGM(splitter.getTrain(k)); 	TokenNameCOMMENT_LINE	return invertIterationSGM(splitter.getTrain(k)); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// public Dataset getTest(int k){ 	TokenNameCOMMENT_LINE	public Dataset getTest(int k){ 
// return invertIterationSGM(splitter.getTest(k)); 	TokenNameCOMMENT_LINE	return invertIterationSGM(splitter.getTest(k)); 
// } 	TokenNameCOMMENT_LINE	} 
// }; 	TokenNameCOMMENT_LINE	}; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// private RealRelationalDataset invertIterationSGM(Iterator<SGMExample> i){ 	TokenNameCOMMENT_LINE	private RealRelationalDataset invertIterationSGM(Iterator<SGMExample> i){ 
// RealRelationalDataset copy=new RealRelationalDataset(); 	TokenNameCOMMENT_LINE	RealRelationalDataset copy=new RealRelationalDataset(); 
// while(i.hasNext()){ 	TokenNameCOMMENT_LINE	while(i.hasNext()){ 
// copy.addSGM(i.next()); 	TokenNameCOMMENT_LINE	copy.addSGM(i.next()); 
// } 	TokenNameCOMMENT_LINE	} 
// return copy; 	TokenNameCOMMENT_LINE	return copy; 
// } 	TokenNameCOMMENT_LINE	} 
// test routine 	TokenNameCOMMENT_LINE	test routine 
/** Simple test routine */	TokenNameCOMMENT_JAVADOC	 Simple test routine 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatasetLoader	TokenNameIdentifier	 Dataset Loader
.	TokenNameDOT	
loadRelFile	TokenNameIdentifier	 load Rel File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test.osf"	TokenNameStringLiteral	test.osf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatasetLoader	TokenNameIdentifier	 Dataset Loader
.	TokenNameDOT	
loadLinkFile	TokenNameIdentifier	 load Link File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test.lsf"	TokenNameStringLiteral	test.lsf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatasetLoader	TokenNameIdentifier	 Dataset Loader
.	TokenNameDOT	
loadRelTempFile	TokenNameIdentifier	 load Rel Temp File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"relTemp.txt"	TokenNameStringLiteral	relTemp.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
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
"Aggregators: "	TokenNameStringLiteral	Aggregators: 
+	TokenNamePLUS	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
.	TokenNameDOT	
getAggregators	TokenNameIdentifier	 get Aggregators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
examples	TokenNameIdentifier	 examples
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
SGMExample	TokenNameIdentifier	 SGM Example
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SGMExample	TokenNameIdentifier	 SGM Example
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

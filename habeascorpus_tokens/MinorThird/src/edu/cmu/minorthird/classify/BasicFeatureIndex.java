package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * @author Edoardo Airoldi * Date: Nov 24, 2003 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo Airoldi Date: Nov 24, 2003 
public	TokenNamepublic	
class	TokenNameclass	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
extends	TokenNameextends	
DatasetIndex	TokenNameIdentifier	 Dataset Index
implements	TokenNameimplements	
FeatureIndex	TokenNameIdentifier	 Feature Index
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
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
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Number of examples with label l containing non-zero values for feature f. */	TokenNameCOMMENT_JAVADOC	 Number of examples with label l containing non-zero values for feature f. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get counts of feature f in i-th example containing feature f */	TokenNameCOMMENT_JAVADOC	 Get counts of feature f in i-th example containing feature f 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
featureIndex	TokenNameIdentifier	 feature Index
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get counts of feature f in examples with label l */	TokenNameCOMMENT_JAVADOC	 Get counts of feature f in examples with label l 
public	TokenNamepublic	
double	TokenNamedouble	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println( getExample(f,j).getLabel().bestClassName() ); 	TokenNameCOMMENT_LINE	System.out.println( getExample(f,j).getLabel().bestClassName() ); 
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
featureIndex	TokenNameIdentifier	 feature Index
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get number of documents which contain feature f with label l */	TokenNameCOMMENT_JAVADOC	 Get number of documents which contain feature f with label l 
public	TokenNamepublic	
double	TokenNamedouble	
getDocCounts	TokenNameIdentifier	 get Doc Counts
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println( getExample(f,j).getLabel().bestClassName() ); 	TokenNameCOMMENT_LINE	System.out.println( getExample(f,j).getLabel().bestClassName() ); 
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
total	TokenNameIdentifier	 total
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
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"[index"	TokenNameStringLiteral	[index
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
":"	TokenNameStringLiteral	:
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//buf.append("\n\t"+"feature:"+f+" counts:"+getCounts(f,j)); 	TokenNameCOMMENT_LINE	buf.append("\n\t"+"feature:"+f+" counts:"+getCounts(f,j)); 
//buf.append(" label:"+getExample(f,j).getLabel().bestClassName()); 	TokenNameCOMMENT_LINE	buf.append(" label:"+getExample(f,j).getLabel().bestClassName()); 
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"feature:"	TokenNameStringLiteral	feature:
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" posCounts:"	TokenNameStringLiteral	 posCounts:
+	TokenNamePLUS	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
+	TokenNamePLUS	
" negCouns:"	TokenNameStringLiteral	 negCouns:
+	TokenNamePLUS	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" index]"	TokenNameStringLiteral	 index]
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
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
"bayes"	TokenNameStringLiteral	bayes
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

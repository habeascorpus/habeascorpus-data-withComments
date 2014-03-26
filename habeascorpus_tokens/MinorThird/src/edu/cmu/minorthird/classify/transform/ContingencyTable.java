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
/** * @author Vitor Carvalho * March 2005 * * A 2-by-2 matrix indicating the association between 2 variables. * Useful in feature selection or feature association experiments. * * Contains scores for Chi-Squared, Pointwise Mutual-Information, * Compensated Pointwise Mutual Info * * Given 2 variables X and Y, the matrix is * [a b] a = X and Y ; b = X and Not Y * [c d] c = Not X and Y; d = Not X and Not Y * * */	TokenNameCOMMENT_JAVADOC	 @author Vitor Carvalho March 2005 * A 2-by-2 matrix indicating the association between 2 variables. Useful in feature selection or feature association experiments. * Contains scores for Chi-Squared, Pointwise Mutual-Information, Compensated Pointwise Mutual Info * Given 2 variables X and Y, the matrix is [a b] a = X and Y ; b = X and Not Y [c d] c = Not X and Y; d = Not X and Not Y * 
public	TokenNamepublic	
class	TokenNameclass	
ContingencyTable	TokenNameIdentifier	 Contingency Table
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ContingencyTable	TokenNameIdentifier	 Contingency Table
(	TokenNameLPAREN	
long	TokenNamelong	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
long	TokenNamelong	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
long	TokenNamelong	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
long	TokenNamelong	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//in log scale to avoid overflow 	TokenNameCOMMENT_LINE	in log scale to avoid overflow 
public	TokenNamepublic	
double	TokenNamedouble	
getChiSquared	TokenNameIdentifier	 get Chi Squared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
*	TokenNameMULTIPLY	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
*	TokenNameMULTIPLY	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
den	TokenNameIdentifier	 den
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
num	TokenNameIdentifier	 num
-	TokenNameMINUS	
den	TokenNameIdentifier	 den
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Pointwise Mutual Information 	TokenNameCOMMENT_LINE	Pointwise Mutual Information 
public	TokenNamepublic	
double	TokenNamedouble	
getPMutualInfo	TokenNameIdentifier	 get P Mutual Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
denon	TokenNameIdentifier	 denon
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
denon	TokenNameIdentifier	 denon
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
tmp2	TokenNameIdentifier	 tmp2
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Compensated Pointwise Mutual Information 	TokenNameCOMMENT_LINE	Compensated Pointwise Mutual Information 
// Basically, count(feature1,feature2)*PointwiseMutualInfo 	TokenNameCOMMENT_LINE	Basically, count(feature1,feature2)*PointwiseMutualInfo 
//it should compensate for low frequency bias in original PMutualInfo 	TokenNameCOMMENT_LINE	it should compensate for low frequency bias in original PMutualInfo 
public	TokenNamepublic	
double	TokenNamedouble	
getCompensatedPMutualInfo	TokenNameIdentifier	 get Compensated P Mutual Info
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tmp2	TokenNameIdentifier	 tmp2
=	TokenNameEQUAL	
getPMutualInfo	TokenNameIdentifier	 get P Mutual Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tmp2	TokenNameIdentifier	 tmp2
*	TokenNameMULTIPLY	
count	TokenNameIdentifier	 count
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
"CTable: [ "	TokenNameStringLiteral	CTable: [ 
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
" , "	TokenNameStringLiteral	 , 
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
" , "	TokenNameStringLiteral	 , 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
" , "	TokenNameStringLiteral	 , 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
" ]"	TokenNameStringLiteral	 ]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
total	TokenNameIdentifier	 total
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
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
"Usage: java ContingencyTable a_value b_value c_value d_value"	TokenNameStringLiteral	Usage: java ContingencyTable a_value b_value c_value d_value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ContingencyTable	TokenNameIdentifier	 Contingency Table
ct	TokenNameIdentifier	 ct
=	TokenNameEQUAL	
new	TokenNamenew	
ContingencyTable	TokenNameIdentifier	 Contingency Table
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Score chi = "	TokenNameStringLiteral	Score chi = 
+	TokenNamePLUS	
ct	TokenNameIdentifier	 ct
.	TokenNameDOT	
getChiSquared	TokenNameIdentifier	 get Chi Squared
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
"Score PMI = "	TokenNameStringLiteral	Score PMI = 
+	TokenNamePLUS	
ct	TokenNameIdentifier	 ct
.	TokenNameDOT	
getPMutualInfo	TokenNameIdentifier	 get P Mutual Info
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
"Score PMI comp = "	TokenNameStringLiteral	Score PMI comp = 
+	TokenNamePLUS	
ct	TokenNameIdentifier	 ct
.	TokenNameDOT	
getCompensatedPMutualInfo	TokenNameIdentifier	 get Compensated P Mutual Info
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

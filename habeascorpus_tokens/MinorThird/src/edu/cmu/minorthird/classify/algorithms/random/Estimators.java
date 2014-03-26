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
random	TokenNameIdentifier	 random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
/** * @author Edoardo Airoldi * Date: Dec 11, 2004 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo Airoldi Date: Dec 11, 2004 
public	TokenNamepublic	
class	TokenNameclass	
Estimators	TokenNameIdentifier	 Estimators
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimateBinomialPN	TokenNameIdentifier	 estimate Binomial PN
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vCnt	TokenNameIdentifier	 v Cnt
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vWgt	TokenNameIdentifier	 v Wgt
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute mean 	TokenNameCOMMENT_LINE	compute mean 
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt	TokenNameIdentifier	 sum Wgt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxCnt	TokenNameIdentifier	 max Cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
vCnt	TokenNameIdentifier	 v Cnt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt	TokenNameIdentifier	 sum Wgt
+=	TokenNamePLUS_EQUAL	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
maxCnt	TokenNameIdentifier	 max Cnt
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxCnt	TokenNameIdentifier	 max Cnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
estimateMean	TokenNameIdentifier	 estimate Mean
(	TokenNameLPAREN	
vCnt	TokenNameIdentifier	 v Cnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
estimateVar	TokenNameIdentifier	 estimate Var
(	TokenNameLPAREN	
vCnt	TokenNameIdentifier	 v Cnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//p = (mean - var)/mean; 	TokenNameCOMMENT_LINE	p = (mean - var)/mean; 
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxCnt	TokenNameIdentifier	 max Cnt
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
25.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
-	TokenNameMINUS	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// also use p instead of mean 	TokenNameCOMMENT_LINE	also use p instead of mean 
//N = Math.round( Math.max( maxCnt,Math.pow(mean,2)/(mean-var) )); // +1; also use p instead of mean 	TokenNameCOMMENT_LINE	N = Math.round( Math.max( maxCnt,Math.pow(mean,2)/(mean-var) )); // +1; also use p instead of mean 
//System.out.println("p="+p+" N="+N); 	TokenNameCOMMENT_LINE	System.out.println("p="+p+" N="+N); 
//System.out.println("len="+wgt.length); 	TokenNameCOMMENT_LINE	System.out.println("len="+wgt.length); 
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
pn	TokenNameIdentifier	 pn
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pn	TokenNameIdentifier	 pn
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"p"	TokenNameStringLiteral	p
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pn	TokenNameIdentifier	 pn
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"N"	TokenNameStringLiteral	N
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("p="+p+" N="+N); 	TokenNameCOMMENT_LINE	System.out.println("p="+p+" N="+N); 
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Binomial"	TokenNameStringLiteral	Binomial
,	TokenNameCOMMA	
"p/N"	TokenNameStringLiteral	p/N
,	TokenNameCOMMA	
pn	TokenNameIdentifier	 pn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimateBinomialMuDelta	TokenNameIdentifier	 estimate Binomial Mu Delta
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vCnt	TokenNameIdentifier	 v Cnt
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vWgt	TokenNameIdentifier	 v Wgt
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute mean 	TokenNameCOMMENT_LINE	compute mean 
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
vCnt	TokenNameIdentifier	 v Cnt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt	TokenNameIdentifier	 sum Wgt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt2	TokenNameIdentifier	 sum Wgt2
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt	TokenNameIdentifier	 sum Wgt
+=	TokenNamePLUS_EQUAL	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt2	TokenNameIdentifier	 sum Wgt2
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute intermediate 	TokenNameCOMMENT_LINE	compute intermediate 
double	TokenNamedouble	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
-	TokenNameMINUS	
sumWgt2	TokenNameIdentifier	 sum Wgt2
/	TokenNameDIVIDE	
sumWgt	TokenNameIdentifier	 sum Wgt
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//v += ( vWgt[i] * Math.pow( vCnt[i]/vWgt[i]-0.0,2 ) ) / (N-1.0); 	TokenNameCOMMENT_LINE	v += ( vWgt[i] * Math.pow( vCnt[i]/vWgt[i]-0.0,2 ) ) / (N-1.0); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// compute variance 	TokenNameCOMMENT_LINE	compute variance 
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
-	TokenNameMINUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
mudelta	TokenNameIdentifier	 mudelta
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mudelta	TokenNameIdentifier	 mudelta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"mu"	TokenNameStringLiteral	mu
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mudelta	TokenNameIdentifier	 mudelta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("m="+m+" d="+d); 	TokenNameCOMMENT_LINE	System.out.println("m="+m+" d="+d); 
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Binomial"	TokenNameStringLiteral	Binomial
,	TokenNameCOMMA	
"mu/delta"	TokenNameStringLiteral	mu/delta
,	TokenNameCOMMA	
mudelta	TokenNameIdentifier	 mudelta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimateNegativeBinomialMuDelta	TokenNameIdentifier	 estimate Negative Binomial Mu Delta
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vCnt	TokenNameIdentifier	 v Cnt
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vWgt	TokenNameIdentifier	 v Wgt
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute mean 	TokenNameCOMMENT_LINE	compute mean 
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
vCnt	TokenNameIdentifier	 v Cnt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt	TokenNameIdentifier	 sum Wgt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt2	TokenNameIdentifier	 sum Wgt2
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt	TokenNameIdentifier	 sum Wgt
+=	TokenNamePLUS_EQUAL	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
sumWgt2	TokenNameIdentifier	 sum Wgt2
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*StringBuffer str = new StringBuffer(""+vCnt[0]); for(int i=1; i<vCnt.length; i++) { str.append(" "+vCnt[i]); } System.out.println("["+str+"]"); */	TokenNameCOMMENT_BLOCK	StringBuffer str = new StringBuffer(""+vCnt[0]); for(int i=1; i<vCnt.length; i++) { str.append(" "+vCnt[i]); } System.out.println("["+str+"]"); 
//System.out.println(". sumX="+sumX+",sumWgt="+sumWgt+",m="+m+",d="+d); 	TokenNameCOMMENT_LINE	System.out.println(". sumX="+sumX+",sumWgt="+sumWgt+",m="+m+",d="+d); 
// compute intermediate 	TokenNameCOMMENT_LINE	compute intermediate 
double	TokenNamedouble	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
-	TokenNameMINUS	
sumWgt2	TokenNameIdentifier	 sum Wgt2
/	TokenNameDIVIDE	
sumWgt	TokenNameIdentifier	 sum Wgt
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//v += ( vWgt[i] * Math.pow( vCnt[i]/vWgt[i]-0.0,2 ) ) / (N-1.0); 	TokenNameCOMMENT_LINE	v += ( vWgt[i] * Math.pow( vCnt[i]/vWgt[i]-0.0,2 ) ) / (N-1.0); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// compute variance 	TokenNameCOMMENT_LINE	compute variance 
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
1e-7	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
mudelta	TokenNameIdentifier	 mudelta
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mudelta	TokenNameIdentifier	 mudelta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"mu"	TokenNameStringLiteral	mu
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mudelta	TokenNameIdentifier	 mudelta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("m="+m+" d="+d); 	TokenNameCOMMENT_LINE	System.out.println("m="+m+" d="+d); 
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Negative-Binomial"	TokenNameStringLiteral	Negative-Binomial
,	TokenNameCOMMA	
"mu/delta"	TokenNameStringLiteral	mu/delta
,	TokenNameCOMMA	
mudelta	TokenNameIdentifier	 mudelta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimatePoissonLambda	TokenNameIdentifier	 estimate Poisson Lambda
(	TokenNameLPAREN	
double	TokenNamedouble	
classPrior	TokenNameIdentifier	 class Prior
,	TokenNameCOMMA	
double	TokenNamedouble	
numberOfClasses	TokenNameIdentifier	 number Of Classes
,	TokenNameCOMMA	
double	TokenNamedouble	
observedCounts	TokenNameIdentifier	 observed Counts
,	TokenNameCOMMA	
double	TokenNamedouble	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//double lambda = (classPrior+observedCounts)/(numberOfClasses+totalCounts); 	TokenNameCOMMENT_LINE	double lambda = (classPrior+observedCounts)/(numberOfClasses+totalCounts); 
double	TokenNamedouble	
lambda	TokenNameIdentifier	 lambda
=	TokenNameEQUAL	
(	TokenNameLPAREN	
classPrior	TokenNameIdentifier	 class Prior
/	TokenNameDIVIDE	
numberOfClasses	TokenNameIdentifier	 number Of Classes
+	TokenNamePLUS	
observedCounts	TokenNameIdentifier	 observed Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
classPrior	TokenNameIdentifier	 class Prior
+	TokenNamePLUS	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"lambda"	TokenNameStringLiteral	lambda
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Poisson"	TokenNameStringLiteral	Poisson
,	TokenNameCOMMA	
"lambda"	TokenNameStringLiteral	lambda
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimatePoissonWeightedLambda	TokenNameIdentifier	 estimate Poisson Weighted Lambda
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vCnt	TokenNameIdentifier	 v Cnt
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vWgt	TokenNameIdentifier	 v Wgt
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
lambda	TokenNameIdentifier	 lambda
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute mean 	TokenNameCOMMENT_LINE	compute mean 
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
vCnt	TokenNameIdentifier	 v Cnt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt	TokenNameIdentifier	 sum Wgt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt	TokenNameIdentifier	 sum Wgt
+=	TokenNamePLUS_EQUAL	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lambda	TokenNameIdentifier	 lambda
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"lambda"	TokenNameStringLiteral	lambda
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Poisson"	TokenNameStringLiteral	Poisson
,	TokenNameCOMMA	
"weighted-lambda"	TokenNameStringLiteral	weighted-lambda
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimateNaiveBayesMean	TokenNameIdentifier	 estimate Naive Bayes Mean
(	TokenNameLPAREN	
double	TokenNamedouble	
classPrior	TokenNameIdentifier	 class Prior
,	TokenNameCOMMA	
double	TokenNamedouble	
numberOfClasses	TokenNameIdentifier	 number Of Classes
,	TokenNameCOMMA	
double	TokenNamedouble	
observedCounts	TokenNameIdentifier	 observed Counts
,	TokenNameCOMMA	
double	TokenNamedouble	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//double mean = (classPrior+observedCounts)/(numberOfClasses+totalCounts); // 	TokenNameCOMMENT_LINE	double mean = (classPrior+observedCounts)/(numberOfClasses+totalCounts); // 
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
(	TokenNameLPAREN	
classPrior	TokenNameIdentifier	 class Prior
/	TokenNameDIVIDE	
numberOfClasses	TokenNameIdentifier	 number Of Classes
+	TokenNamePLUS	
observedCounts	TokenNameIdentifier	 observed Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"mean"	TokenNameStringLiteral	mean
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Naive-Bayes"	TokenNameStringLiteral	Naive-Bayes
,	TokenNameCOMMA	
"mean"	TokenNameStringLiteral	mean
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
estimateNaiveBayesWeightedMean	TokenNameIdentifier	 estimate Naive Bayes Weighted Mean
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vCnt	TokenNameIdentifier	 v Cnt
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vWgt	TokenNameIdentifier	 v Wgt
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute mean 	TokenNameCOMMENT_LINE	compute mean 
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
vCnt	TokenNameIdentifier	 v Cnt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt	TokenNameIdentifier	 sum Wgt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt	TokenNameIdentifier	 sum Wgt
+=	TokenNamePLUS_EQUAL	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// package results 	TokenNameCOMMENT_LINE	package results 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"mean"	TokenNameStringLiteral	mean
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Naive-Bayes"	TokenNameStringLiteral	Naive-Bayes
,	TokenNameCOMMA	
"weighted-mean"	TokenNameStringLiteral	weighted-mean
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Probabilities for the Dirichlet-Poisson model (Airoldi, Cohen & Fienberg 2005) 	TokenNameCOMMENT_LINE	Probabilities for the Dirichlet-Poisson model (Airoldi, Cohen & Fienberg 2005) 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mcmcEstimateDirichletPoissonTauSigma	TokenNameIdentifier	 mcmc Estimate Dirichlet Poisson Tau Sigma
(	TokenNameLPAREN	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vlow	TokenNameIdentifier	 vlow
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vup	TokenNameIdentifier	 vup
,	TokenNameCOMMA	
double	TokenNamedouble	
xr	TokenNameIdentifier	 xr
,	TokenNameCOMMA	
double	TokenNamedouble	
xp	TokenNameIdentifier	 xp
,	TokenNameCOMMA	
double	TokenNamedouble	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
double	TokenNamedouble	
wp	TokenNameIdentifier	 wp
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vbeta	TokenNameIdentifier	 vbeta
,	TokenNameCOMMA	
double	TokenNamedouble	
tauSD	TokenNameIdentifier	 tau SD
,	TokenNameCOMMA	
double	TokenNamedouble	
sigmaSD	TokenNameIdentifier	 sigma SD
,	TokenNameCOMMA	
int	TokenNameint	
numIterations	TokenNameIdentifier	 num Iterations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// initialize a Probability Factory 	TokenNameCOMMENT_LINE	initialize a Probability Factory 
// ProbabilityFactory pr = new ProbabilityFactory(); 	TokenNameCOMMENT_LINE	ProbabilityFactory pr = new ProbabilityFactory(); 
// initialize variables fo MCMC 	TokenNameCOMMENT_LINE	initialize variables fo MCMC 
int	TokenNameint	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tau	TokenNameIdentifier	 tau
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
numIterations	TokenNameIdentifier	 num Iterations
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sig	TokenNameIdentifier	 sig
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numIterations	TokenNameIdentifier	 num Iterations
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tauAcceptRate	TokenNameIdentifier	 tau Accept Rate
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sigAcceptRate	TokenNameIdentifier	 sig Accept Rate
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute starting guesses from Lambda estimates 	TokenNameCOMMENT_LINE	compute starting guesses from Lambda estimates 
String	TokenNameIdentifier	 String
parameterization	TokenNameIdentifier	 parameterization
=	TokenNameEQUAL	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParameterization	TokenNameIdentifier	 get Parameterization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tauSigmaEstimate	TokenNameIdentifier	 tau Sigma Estimate
=	TokenNameEQUAL	
ReparametrizeLambdas2TauSig	TokenNameIdentifier	 Reparametrize Lambdas2 Tau Sig
(	TokenNameLPAREN	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// StringBuffer buf; 	TokenNameCOMMENT_LINE	StringBuffer buf; 
//buf = new StringBuffer("initial values ::"); 	TokenNameCOMMENT_LINE	buf = new StringBuffer("initial values ::"); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tauSigmaEstimate	TokenNameIdentifier	 tau Sigma Estimate
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPms	TokenNameIdentifier	 get Pms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"tau"	TokenNameStringLiteral	tau
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//buf.append(" tau["+i+"] = "+tau[i][0]+","); 	TokenNameCOMMENT_LINE	buf.append(" tau["+i+"] = "+tau[i][0]+","); 
}	TokenNameRBRACE	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tauSigmaEstimate	TokenNameIdentifier	 tau Sigma Estimate
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPms	TokenNameIdentifier	 get Pms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"sigma"	TokenNameStringLiteral	sigma
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//buf.append(" sigma = "+sig[0]); 	TokenNameCOMMENT_LINE	buf.append(" sigma = "+sig[0]); 
//System.out.println(buf); 	TokenNameCOMMENT_LINE	System.out.println(buf); 
// iterate MCMC 	TokenNameCOMMENT_LINE	iterate MCMC 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
<	TokenNameLESS	
numIterations	TokenNameIdentifier	 num Iterations
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
//in 1:iter 	TokenNameCOMMENT_LINE	in 1:iter 
{	TokenNameLBRACE	
// print current values to screen 	TokenNameCOMMENT_LINE	print current values to screen 
/*buf = new StringBuffer("chain :: "); for (int i=0; i<(K-1); i++) { buf.append( "tau="+tau[i][(it-1)]+" " ); } buf.append("sigma="+sig[(it-1)]); System.out.println(buf);*/	TokenNameCOMMENT_BLOCK	buf = new StringBuffer("chain :: "); for (int i=0; i<(K-1); i++) { buf.append( "tau="+tau[i][(it-1)]+" " ); } buf.append("sigma="+sig[(it-1)]); System.out.println(buf);
double	TokenNamedouble	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
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
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// sample from tau 	TokenNameCOMMENT_LINE	sample from tau 
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1e-7	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
.	TokenNameDOT	
rnorm	TokenNameIdentifier	 rnorm
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tauSD	TokenNameIdentifier	 tau SD
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
.	TokenNameDOT	
runif	TokenNameIdentifier	 runif
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
.	TokenNameDOT	
AlphaTau	TokenNameIdentifier	 Alpha Tau
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vlow	TokenNameIdentifier	 vlow
,	TokenNameCOMMA	
vup	TokenNameIdentifier	 vup
,	TokenNameCOMMA	
xr	TokenNameIdentifier	 xr
,	TokenNameCOMMA	
xp	TokenNameIdentifier	 xp
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
wp	TokenNameIdentifier	 wp
,	TokenNameCOMMA	
vbeta	TokenNameIdentifier	 vbeta
,	TokenNameCOMMA	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tauSD	TokenNameIdentifier	 tau SD
,	TokenNameCOMMA	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("tau["+i+"]: candidate="+candidate+" u="+u+" p="+p); 	TokenNameCOMMENT_LINE	System.out.println("tau["+i+"]: candidate="+candidate+" u="+u+" p="+p); 
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
<=	TokenNameLESS_EQUAL	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
candidate	TokenNameIdentifier	 candidate
;	TokenNameSEMICOLON	
tauAcceptRate	TokenNameIdentifier	 tau Accept Rate
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
numIterations	TokenNameIdentifier	 num Iterations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// sample from sigma 	TokenNameCOMMENT_LINE	sample from sigma 
candidate	TokenNameIdentifier	 candidate
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1e-7	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
.	TokenNameDOT	
rnorm	TokenNameIdentifier	 rnorm
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sigmaSD	TokenNameIdentifier	 sigma SD
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
.	TokenNameDOT	
runif	TokenNameIdentifier	 runif
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
.	TokenNameDOT	
AlphaSigma	TokenNameIdentifier	 Alpha Sigma
(	TokenNameLPAREN	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
vlow	TokenNameIdentifier	 vlow
,	TokenNameCOMMA	
vup	TokenNameIdentifier	 vup
,	TokenNameCOMMA	
xr	TokenNameIdentifier	 xr
,	TokenNameCOMMA	
xp	TokenNameIdentifier	 xp
,	TokenNameCOMMA	
wr	TokenNameIdentifier	 wr
,	TokenNameCOMMA	
wp	TokenNameIdentifier	 wp
,	TokenNameCOMMA	
vbeta	TokenNameIdentifier	 vbeta
,	TokenNameCOMMA	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sigmaSD	TokenNameIdentifier	 sigma SD
,	TokenNameCOMMA	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// modify for K>2 	TokenNameCOMMENT_LINE	modify for K>2 
//System.out.println("sig: candidate="+candidate+" u="+u+" p="+p); 	TokenNameCOMMENT_LINE	System.out.println("sig: candidate="+candidate+" u="+u+" p="+p); 
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
<=	TokenNameLESS_EQUAL	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
candidate	TokenNameIdentifier	 candidate
;	TokenNameSEMICOLON	
sigAcceptRate	TokenNameIdentifier	 sig Accept Rate
+=	TokenNamePLUS_EQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
numIterations	TokenNameIdentifier	 num Iterations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sig	TokenNameIdentifier	 sig
[	TokenNameLBRACKET	
it	TokenNameIdentifier	 it
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// compute posterior means 	TokenNameCOMMENT_LINE	compute posterior means 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tauPost	TokenNameIdentifier	 tau Post
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sigmaPost	TokenNameIdentifier	 sigma Post
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//double perc = 0.95; // controls % of iterations to return 	TokenNameCOMMENT_LINE	double perc = 0.95; // controls % of iterations to return 
//int tail = (int) Math.floor(numIterations*(1-perc)); // return [,tail:iter] 	TokenNameCOMMENT_LINE	int tail = (int) Math.floor(numIterations*(1-perc)); // return [,tail:iter] 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*double[] v = new double[ tau[i].length-tail+1 ]; for (int j=tail; j<tau[i].length; j++) { v[j]=tau[i][j-tail]; } tauPost[i] = estimateMean(v);*/	TokenNameCOMMENT_BLOCK	double[] v = new double[ tau[i].length-tail+1 ]; for (int j=tail; j<tau[i].length; j++) { v[j]=tau[i][j-tail]; } tauPost[i] = estimateMean(v);
tauPost	TokenNameIdentifier	 tau Post
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
estimateMean	TokenNameIdentifier	 estimate Mean
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sigmaPost	TokenNameIdentifier	 sigma Post
=	TokenNameEQUAL	
estimateMean	TokenNameIdentifier	 estimate Mean
(	TokenNameLPAREN	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*buf = new StringBuffer("final values ::"); for (int i=0; i<(K-1); i++) { buf.append( " tau["+i+"] = "+tauPost[i]+"," ); } buf.append("sigma = "+sigmaPost); System.out.println(buf);*/	TokenNameCOMMENT_BLOCK	buf = new StringBuffer("final values ::"); for (int i=0; i<(K-1); i++) { buf.append( " tau["+i+"] = "+tauPost[i]+"," ); } buf.append("sigma = "+sigmaPost); System.out.println(buf);
// report acceptance rates 	TokenNameCOMMENT_LINE	report acceptance rates 
/*buf = new StringBuffer("acceptance rates ::"); for (int i=0; i<(K-1); i++) { buf.append( " tau["+i+"] = "+tauAcceptRate[i]+"," ); } buf.append(" sigma = "+sigAcceptRate); System.out.println(buf);*/	TokenNameCOMMENT_BLOCK	buf = new StringBuffer("acceptance rates ::"); for (int i=0; i<(K-1); i++) { buf.append( " tau["+i+"] = "+tauAcceptRate[i]+"," ); } buf.append(" sigma = "+sigAcceptRate); System.out.println(buf);
// package results 	TokenNameCOMMENT_LINE	package results 
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tauSigma	TokenNameIdentifier	 tau Sigma
=	TokenNameEQUAL	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"tau"	TokenNameStringLiteral	tau
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
tauPost	TokenNameIdentifier	 tau Post
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sigma"	TokenNameStringLiteral	sigma
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
sigmaPost	TokenNameIdentifier	 sigma Post
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tauSigma	TokenNameIdentifier	 tau Sigma
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Dirichlet-Poisson MCMC"	TokenNameStringLiteral	Dirichlet-Poisson MCMC
,	TokenNameCOMMA	
"tau/sigma"	TokenNameStringLiteral	tau/sigma
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ReparametrizeTauSig2Lambdas	TokenNameIdentifier	 Reparametrize Tau Sig2 Lambdas
(	TokenNameLPAREN	
tauSigma	TokenNameIdentifier	 tau Sigma
,	TokenNameCOMMA	
parameterization	TokenNameIdentifier	 parameterization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ReparametrizeLambdas2TauSig	TokenNameIdentifier	 Reparametrize Lambdas2 Tau Sig
(	TokenNameLPAREN	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lambda	TokenNameIdentifier	 lambda
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tau	TokenNameIdentifier	 tau
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sigma	TokenNameIdentifier	 sigma
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
lambdaSum	TokenNameIdentifier	 lambda Sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
K	TokenNameIdentifier	 K
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPms	TokenNameIdentifier	 get Pms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"lambda"	TokenNameStringLiteral	lambda
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lambdaSum	TokenNameIdentifier	 lambda Sum
+=	TokenNamePLUS_EQUAL	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
K	TokenNameIdentifier	 K
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
lambdaSum	TokenNameIdentifier	 lambda Sum
;	TokenNameSEMICOLON	
sigma	TokenNameIdentifier	 sigma
+=	TokenNamePLUS_EQUAL	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// package results 	TokenNameCOMMENT_LINE	package results 
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tauSigma	TokenNameIdentifier	 tau Sigma
=	TokenNameEQUAL	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
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
K	TokenNameIdentifier	 K
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"tau"	TokenNameStringLiteral	tau
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sigma"	TokenNameStringLiteral	sigma
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
sigma	TokenNameIdentifier	 sigma
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tauSigma	TokenNameIdentifier	 tau Sigma
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Dirichlet-Poisson MCMC"	TokenNameStringLiteral	Dirichlet-Poisson MCMC
,	TokenNameCOMMA	
"tau/sigma"	TokenNameStringLiteral	tau/sigma
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tauSigma	TokenNameIdentifier	 tau Sigma
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ReparametrizeTauSig2Lambdas	TokenNameIdentifier	 Reparametrize Tau Sig2 Lambdas
(	TokenNameLPAREN	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tauSigEstimateVec	TokenNameIdentifier	 tau Sig Estimate Vec
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
parameterization	TokenNameIdentifier	 parameterization
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
K	TokenNameIdentifier	 K
=	TokenNameEQUAL	
tauSigEstimateVec	TokenNameIdentifier	 tau Sig Estimate Vec
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lambda	TokenNameIdentifier	 lambda
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tau	TokenNameIdentifier	 tau
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sigma	TokenNameIdentifier	 sigma
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tauSum	TokenNameIdentifier	 tau Sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
K	TokenNameIdentifier	 K
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tauSigEstimateVec	TokenNameIdentifier	 tau Sig Estimate Vec
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPms	TokenNameIdentifier	 get Pms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"tau"	TokenNameStringLiteral	tau
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tauSum	TokenNameIdentifier	 tau Sum
=	TokenNameEQUAL	
+	TokenNamePLUS	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sigma	TokenNameIdentifier	 sigma
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tauSigEstimateVec	TokenNameIdentifier	 tau Sig Estimate Vec
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPms	TokenNameIdentifier	 get Pms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"sigma"	TokenNameStringLiteral	sigma
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
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
K	TokenNameIdentifier	 K
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tau	TokenNameIdentifier	 tau
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
sigma	TokenNameIdentifier	 sigma
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
tauSum	TokenNameIdentifier	 tau Sum
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sigma	TokenNameIdentifier	 sigma
;	TokenNameSEMICOLON	
// package results 	TokenNameCOMMENT_LINE	package results 
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
=	TokenNameEQUAL	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
[	TokenNameLBRACKET	
K	TokenNameIdentifier	 K
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
tm	TokenNameIdentifier	 tm
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tm	TokenNameIdentifier	 tm
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"lambda"	TokenNameStringLiteral	lambda
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
lambda	TokenNameIdentifier	 lambda
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Estimate	TokenNameIdentifier	 Estimate
(	TokenNameLPAREN	
"Dirichlet-Poisson MCMC"	TokenNameStringLiteral	Dirichlet-Poisson MCMC
,	TokenNameCOMMA	
parameterization	TokenNameIdentifier	 parameterization
,	TokenNameCOMMA	
tm	TokenNameIdentifier	 tm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lambdaEstimateVec	TokenNameIdentifier	 lambda Estimate Vec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Auxiliary Functions 	TokenNameCOMMENT_LINE	Auxiliary Functions 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
estimateMean	TokenNameIdentifier	 estimate Mean
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wgt	TokenNameIdentifier	 wgt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
wgt	TokenNameIdentifier	 wgt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
wgt	TokenNameIdentifier	 wgt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
+=	TokenNamePLUS_EQUAL	
wgt	TokenNameIdentifier	 wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
/	TokenNameDIVIDE	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
estimateVar	TokenNameIdentifier	 estimate Var
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wgt	TokenNameIdentifier	 wgt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
wgt	TokenNameIdentifier	 wgt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
wgt	TokenNameIdentifier	 wgt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
+=	TokenNamePLUS_EQUAL	
wgt	TokenNameIdentifier	 wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m2	TokenNameIdentifier	 m2
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
wgt	TokenNameIdentifier	 wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
/	TokenNameDIVIDE	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
m2	TokenNameIdentifier	 m2
/	TokenNameDIVIDE	
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m2	TokenNameIdentifier	 m2
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
N	TokenNameIdentifier	 N
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if no variability v=NaN at this point 	TokenNameCOMMENT_LINE	if no variability v=NaN at this point 
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
Sum	TokenNameIdentifier	 Sum
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wgt	TokenNameIdentifier	 wgt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//double N = (double)wgt.length; 	TokenNameCOMMENT_LINE	double N = (double)wgt.length; 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
wgt	TokenNameIdentifier	 wgt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
wgt	TokenNameIdentifier	 wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
Max	TokenNameIdentifier	 Max
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
maxCnt	TokenNameIdentifier	 max Cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxCnt	TokenNameIdentifier	 max Cnt
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
maxCnt	TokenNameIdentifier	 max Cnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
maxCnt	TokenNameIdentifier	 max Cnt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

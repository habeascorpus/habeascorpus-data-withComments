package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Math utilities. * */	TokenNameCOMMENT_JAVADOC	 Math utilities. 
public	TokenNamepublic	
class	TokenNameclass	
MathUtil	TokenNameIdentifier	 Math Util
{	TokenNameLBRACE	
/** Sign function. */	TokenNameCOMMENT_JAVADOC	 Sign function. 
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
sign	TokenNameIdentifier	 sign
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Absolute value function. */	TokenNameCOMMENT_JAVADOC	 Absolute value function. 
static	TokenNamestatic	
public	TokenNamepublic	
double	TokenNamedouble	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Logistic function. */	TokenNameCOMMENT_JAVADOC	 Logistic function. 
static	TokenNamestatic	
public	TokenNamepublic	
double	TokenNamedouble	
logistic	TokenNameIdentifier	 logistic
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Accumulate a list of numbers, then report on mean, standard deviation, and * other common statistics. */	TokenNameCOMMENT_JAVADOC	 Accumulate a list of numbers, then report on mean, standard deviation, and other common statistics. 
static	TokenNamestatic	
public	TokenNamepublic	
class	TokenNameclass	
Accumulator	TokenNameIdentifier	 Accumulator
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cov	TokenNameIdentifier	 cov
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isBinomial	TokenNameIdentifier	 is Binomial
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Clear the accumulator **/	TokenNameCOMMENT_JAVADOC	 Clear the accumulator *
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
cov	TokenNameIdentifier	 cov
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isBinomial	TokenNameIdentifier	 is Binomial
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a new number to the accumulator. */	TokenNameCOMMENT_JAVADOC	 Add a new number to the accumulator. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
cov	TokenNameIdentifier	 cov
+=	TokenNamePLUS_EQUAL	
d	TokenNameIdentifier	 d
*	TokenNameMULTIPLY	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
isBinomial	TokenNameIdentifier	 is Binomial
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Combine two accumulators. Result will be be as if every call b.add(x) had been followed by a call to this.add(x). **/	TokenNameCOMMENT_JAVADOC	 Combine two accumulators. Result will be be as if every call b.add(x) had been followed by a call to this.add(x). *
public	TokenNamepublic	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Accumulator	TokenNameIdentifier	 Accumulator
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
cov	TokenNameIdentifier	 cov
+=	TokenNamePLUS_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
cov	TokenNameIdentifier	 cov
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
isBinomial	TokenNameIdentifier	 is Binomial
=	TokenNameEQUAL	
isBinomial	TokenNameIdentifier	 is Binomial
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
isBinomial	TokenNameIdentifier	 is Binomial
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The mean of accumulated values. */	TokenNameCOMMENT_JAVADOC	 The mean of accumulated values. 
public	TokenNamepublic	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
/	TokenNameDIVIDE	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The number of accumulated values. */	TokenNameCOMMENT_JAVADOC	 The number of accumulated values. 
public	TokenNamepublic	
double	TokenNamedouble	
numberOfValues	TokenNameIdentifier	 number Of Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The variance of the accumulated values. */	TokenNameCOMMENT_JAVADOC	 The variance of the accumulated values. 
public	TokenNamepublic	
double	TokenNamedouble	
variance	TokenNameIdentifier	 variance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
avg	TokenNameIdentifier	 avg
=	TokenNameEQUAL	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cov	TokenNameIdentifier	 cov
/	TokenNameDIVIDE	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
avg	TokenNameIdentifier	 avg
*	TokenNameMULTIPLY	
avg	TokenNameIdentifier	 avg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The population standard devation of the accumulated values. */	TokenNameCOMMENT_JAVADOC	 The population standard devation of the accumulated values. 
public	TokenNamepublic	
double	TokenNamedouble	
populationStdDev	TokenNameIdentifier	 population Std Dev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
variance	TokenNameIdentifier	 variance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The sample standard devation of the accumulated values. */	TokenNameCOMMENT_JAVADOC	 The sample standard devation of the accumulated values. 
public	TokenNamepublic	
double	TokenNamedouble	
stdDev	TokenNameIdentifier	 std Dev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
populationStdDev	TokenNameIdentifier	 population Std Dev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The sample standard error of the accumulated values. */	TokenNameCOMMENT_JAVADOC	 The sample standard error of the accumulated values. 
public	TokenNamepublic	
double	TokenNamedouble	
stdErr	TokenNameIdentifier	 std Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stdDev	TokenNameIdentifier	 std Dev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The standard error of binomially distributed values. */	TokenNameCOMMENT_JAVADOC	 The standard error of binomially distributed values. 
public	TokenNamepublic	
double	TokenNamedouble	
binomialStdErr	TokenNameIdentifier	 binomial Std Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isBinomial	TokenNameIdentifier	 is Binomial
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numbers in accumulator are not binomial!"	TokenNameStringLiteral	numbers in accumulator are not binomial!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The Z statistic. */	TokenNameCOMMENT_JAVADOC	 The Z statistic. 
public	TokenNamepublic	
double	TokenNamedouble	
z	TokenNameIdentifier	 z
(	TokenNameLPAREN	
double	TokenNamedouble	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
expected	TokenNameIdentifier	 expected
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
stdErr	TokenNameIdentifier	 std Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
/** * Gamma distribution; <A HREF="http://wwwinfo.cern.ch/asdoc/shortwrupsdir/g106/top.html"> math definition</A>, * <A HREF="http://www.cern.ch/RD11/rkb/AN16pp/node96.html#SECTION000960000000000000000"> definition of gamma function</A> * and <A HREF="http://www.statsoft.com/textbook/glosf.html#Gamma Distribution"> animated definition</A>. * <p> * <tt>p(x) = k * x^(alpha-1) * e^(-x/beta)</tt> with <tt>k = 1/(g(alpha) * b^a))</tt> and <tt>g(a)</tt> being the gamma function. * <p> * Valid parameter ranges: <tt>alpha &gt; 0</tt>. * <p> * Note: For a Gamma distribution to have the mean <tt>mean</tt> and variance <tt>variance</tt>, set the parameters as follows: * <pre> * alpha = mean*mean / variance; lambda = 1 / (variance / mean); * </pre> * <p> * Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. * <dt> * Static methods operate on a default uniform random number generator; they are synchronized. * <p> * <b>Implementation:</b> * <dt> * Method: Acceptance Rejection combined with Acceptance Complement. * <dt> * High performance implementation. This is a port of <A HREF="http://wwwinfo.cern.ch/asd/lhc++/clhep/manual/RefGuide/Random/RandGamma.html">RandGamma</A> used in <A HREF="http://wwwinfo.cern.ch/asd/lhc++/clhep">CLHEP 1.4.0</A> (C++). * CLHEP's implementation, in turn, is based on <tt>gds.c</tt> from the <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">C-RAND / WIN-RAND</A> library. * C-RAND's implementation, in turn, is based upon * <p> * J.H. Ahrens, U. Dieter (1974): Computer methods for sampling from gamma, beta, Poisson and binomial distributions, * Computing 12, 223-246. * <p> * and * <p> * J.H. Ahrens, U. Dieter (1982): Generating gamma variates by a modified rejection technique, * Communications of the ACM 25, 47-54. * * @author wolfgang.hoschek@cern.ch * @version 1.0, 09/24/99 * @author Edoardo Airoldi */	TokenNameCOMMENT_JAVADOC	 Gamma distribution; <A HREF="http://wwwinfo.cern.ch/asdoc/shortwrupsdir/g106/top.html"> math definition</A>, <A HREF="http://www.cern.ch/RD11/rkb/AN16pp/node96.html#SECTION000960000000000000000"> definition of gamma function</A> and <A HREF="http://www.statsoft.com/textbook/glosf.html#Gamma Distribution"> animated definition</A>. <p> <tt>p(x) = k x^(alpha-1) e^(-x/beta)</tt> with <tt>k = 1/(g(alpha) b^a))</tt> and <tt>g(a)</tt> being the gamma function. <p> Valid parameter ranges: <tt>alpha &gt; 0</tt>. <p> Note: For a Gamma distribution to have the mean <tt>mean</tt> and variance <tt>variance</tt>, set the parameters as follows: <pre> alpha = mean*mean / variance; lambda = 1 / (variance / mean); </pre> <p> Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. <dt> Static methods operate on a default uniform random number generator; they are synchronized. <p> <b>Implementation:</b> <dt> Method: Acceptance Rejection combined with Acceptance Complement. <dt> High performance implementation. This is a port of <A HREF="http://wwwinfo.cern.ch/asd/lhc++/clhep/manual/RefGuide/Random/RandGamma.html">RandGamma</A> used in <A HREF="http://wwwinfo.cern.ch/asd/lhc++/clhep">CLHEP 1.4.0</A> (C++). CLHEP's implementation, in turn, is based on <tt>gds.c</tt> from the <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">C-RAND / WIN-RAND</A> library. C-RAND's implementation, in turn, is based upon <p> J.H. Ahrens, U. Dieter (1974): Computer methods for sampling from gamma, beta, Poisson and binomial distributions, Computing 12, 223-246. <p> and <p> J.H. Ahrens, U. Dieter (1982): Generating gamma variates by a modified rejection technique, Communications of the ACM 25, 47-54. * @author wolfgang.hoschek@cern.ch @version 1.0, 09/24/99 @author Edoardo Airoldi 
public	TokenNamepublic	
class	TokenNameclass	
Gamma	TokenNameIdentifier	 Gamma
{	TokenNameLBRACE	
protected	TokenNameprotected	
RandomElement	TokenNameIdentifier	 Random Element
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
new	TokenNamenew	
RandomElement	TokenNameIdentifier	 Random Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
lambda	TokenNameIdentifier	 lambda
;	TokenNameSEMICOLON	
/** * Constructs a Gamma distribution. * Example: alpha=1.0, lambda=1.0. * @throws IllegalArgumentException if <tt>alpha &lt;= 0.0 || lambda &lt;= 0.0</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a Gamma distribution. Example: alpha=1.0, lambda=1.0. @throws IllegalArgumentException if <tt>alpha &lt;= 0.0 || lambda &lt;= 0.0</tt>. 
public	TokenNamepublic	
Gamma	TokenNameIdentifier	 Gamma
(	TokenNameLPAREN	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
,	TokenNameCOMMA	
double	TokenNamedouble	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setState	TokenNameIdentifier	 set State
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
,	TokenNameCOMMA	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a random number from the distribution. */	TokenNameCOMMENT_JAVADOC	 Returns a random number from the distribution. 
public	TokenNamepublic	
double	TokenNamedouble	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
,	TokenNameCOMMA	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a random number from the distribution; bypasses the internal state. */	TokenNameCOMMENT_JAVADOC	 Returns a random number from the distribution; bypasses the internal state. 
public	TokenNamepublic	
double	TokenNamedouble	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
,	TokenNameCOMMA	
double	TokenNamedouble	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/****************************************************************** * * * Gamma Distribution - Acceptance Rejection combined with * * Acceptance Complement * * * ****************************************************************** * * * FUNCTION: - gds samples a random number from the standard * * gamma distribution with parameter a > 0. * * Acceptance Rejection gs for a < 1 , * * Acceptance Complement gd for a >= 1 . * * REFERENCES: - J.H. Ahrens, U. Dieter (1974): Computer methods * * for sampling from gamma, beta, Poisson and * * binomial distributions, Computing 12, 223-246. * * - J.H. Ahrens, U. Dieter (1982): Generating gamma * * variates by a modified rejection technique, * * Communications of the ACM 25, 47-54. * * SUBPROGRAMS: - drand(seed) ... (0,1)-Uniform generator with * * unsigned long integer *seed * * - NORMAL(seed) ... Normal generator N(0,1). * * * ******************************************************************/	TokenNameCOMMENT_JAVADOC	**************************************************************** * Gamma Distribution - Acceptance Rejection combined with * Acceptance Complement * ****************************************************************** * FUNCTION: - gds samples a random number from the standard * gamma distribution with parameter a > 0. * Acceptance Rejection gs for a < 1 , * Acceptance Complement gd for a >= 1 . * REFERENCES: - J.H. Ahrens, U. Dieter (1974): Computer methods * for sampling from gamma, beta, Poisson and * binomial distributions, Computing 12, 223-246. * - J.H. Ahrens, U. Dieter (1982): Generating gamma * variates by a modified rejection technique, * Communications of the ACM 25, 47-54. * SUBPROGRAMS: - drand(seed) ... (0,1)-Uniform generator with * unsigned long integer *seed * - NORMAL(seed) ... Normal generator N(0,1). * *****************************************************************
double	TokenNamedouble	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
double	TokenNamedouble	
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
aaa	TokenNameIdentifier	 aaa
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
0.0416666664	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
0.0208333723	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q3	TokenNameIdentifier	 q3
=	TokenNameEQUAL	
0.0079849875	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q4	TokenNameIdentifier	 q4
=	TokenNameEQUAL	
0.0015746717	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q5	TokenNameIdentifier	 q5
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.0003349403	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q6	TokenNameIdentifier	 q6
=	TokenNameEQUAL	
0.0003340332	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q7	TokenNameIdentifier	 q7
=	TokenNameEQUAL	
0.0006053049	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q8	TokenNameIdentifier	 q8
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.0004701849	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
q9	TokenNameIdentifier	 q9
=	TokenNameEQUAL	
0.0001710320	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
0.333333333	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a2	TokenNameIdentifier	 a2
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.249999949	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a3	TokenNameIdentifier	 a3
=	TokenNameEQUAL	
0.199999867	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a4	TokenNameIdentifier	 a4
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.166677482	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a5	TokenNameIdentifier	 a5
=	TokenNameEQUAL	
0.142873973	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a6	TokenNameIdentifier	 a6
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.124385581	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a7	TokenNameIdentifier	 a7
=	TokenNameEQUAL	
0.110368310	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a8	TokenNameIdentifier	 a8
=	TokenNameEQUAL	
-	TokenNameMINUS	
0.112750886	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
a9	TokenNameIdentifier	 a9
=	TokenNameEQUAL	
0.104089866	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e1	TokenNameIdentifier	 e1
=	TokenNameEQUAL	
1.000000000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
0.499999994	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e3	TokenNameIdentifier	 e3
=	TokenNameEQUAL	
0.166666848	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e4	TokenNameIdentifier	 e4
=	TokenNameEQUAL	
0.041664508	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e5	TokenNameIdentifier	 e5
=	TokenNameEQUAL	
0.008345522	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e6	TokenNameIdentifier	 e6
=	TokenNameEQUAL	
0.001353826	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
e7	TokenNameIdentifier	 e7
=	TokenNameEQUAL	
0.000247453	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
gds	TokenNameIdentifier	 gds
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
sign_u	TokenNameIdentifier	 sign u
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
v12	TokenNameIdentifier	 v12
;	TokenNameSEMICOLON	
// Check for invalid input values 	TokenNameCOMMENT_LINE	Check for invalid input values 
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lambda	TokenNameIdentifier	 lambda
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CASE A: Acceptance rejection algorithm gs 	TokenNameCOMMENT_LINE	CASE A: Acceptance rejection algorithm gs 
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
0.36788794412	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
// Step 1 	TokenNameCOMMENT_LINE	Step 1 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
*	TokenNameMULTIPLY	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step 2. Case gds <= 1 	TokenNameCOMMENT_LINE	Step 2. Case gds <= 1 
gds	TokenNameIdentifier	 gds
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
gds	TokenNameIdentifier	 gds
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
gds	TokenNameIdentifier	 gds
/	TokenNameDIVIDE	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Step 3. Case gds > 1 	TokenNameCOMMENT_LINE	Step 3. Case gds > 1 
gds	TokenNameIdentifier	 gds
=	TokenNameEQUAL	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
-	TokenNameMINUS	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
gds	TokenNameIdentifier	 gds
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
gds	TokenNameIdentifier	 gds
/	TokenNameDIVIDE	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// CASE B: Acceptance complement algorithm gd (gaussian distribution, box muller transformation) 	TokenNameCOMMENT_LINE	CASE B: Acceptance complement algorithm gd (gaussian distribution, box muller transformation) 
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
!=	TokenNameNOT_EQUAL	
aa	TokenNameIdentifier	 aa
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step 1. Preparations 	TokenNameCOMMENT_LINE	Step 1. Preparations 
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
5.656854249	TokenNameDoubleLiteral	
-	TokenNameMINUS	
12.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Step 2. Normal deviate 	TokenNameCOMMENT_LINE	Step 2. Normal deviate 
do	TokenNamedo	
{	TokenNameLBRACE	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
v12	TokenNameIdentifier	 v12
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
*	TokenNameMULTIPLY	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
*	TokenNameMULTIPLY	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
v12	TokenNameIdentifier	 v12
>	TokenNameGREATER	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
-	TokenNameMINUS	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
v12	TokenNameIdentifier	 v12
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
v12	TokenNameIdentifier	 v12
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
gds	TokenNameIdentifier	 gds
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
>=	TokenNameGREATER_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
gds	TokenNameIdentifier	 gds
/	TokenNameDIVIDE	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Immediate acceptance 	TokenNameCOMMENT_LINE	Immediate acceptance 
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step 3. Uniform random number 	TokenNameCOMMENT_LINE	Step 3. Uniform random number 
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
*	TokenNameMULTIPLY	
u	TokenNameIdentifier	 u
<=	TokenNameLESS_EQUAL	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
gds	TokenNameIdentifier	 gds
/	TokenNameDIVIDE	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Squeeze acceptance 	TokenNameCOMMENT_LINE	Squeeze acceptance 
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
!=	TokenNameNOT_EQUAL	
aaa	TokenNameIdentifier	 aaa
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step 4. Set-up for hat case 	TokenNameCOMMENT_LINE	Step 4. Set-up for hat case 
aaa	TokenNameIdentifier	 aaa
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
q9	TokenNameIdentifier	 q9
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q8	TokenNameIdentifier	 q8
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q7	TokenNameIdentifier	 q7
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q6	TokenNameIdentifier	 q6
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q5	TokenNameIdentifier	 q5
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q4	TokenNameIdentifier	 q4
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q3	TokenNameIdentifier	 q3
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
>	TokenNameGREATER	
3.686	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
>	TokenNameGREATER	
13.022	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
1.77	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
0.75	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0.1515	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
1.654	TokenNameDoubleLiteral	
+	TokenNamePLUS	
0.0076	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
1.68	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
0.275	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0.062	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
0.024	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0.463	TokenNameDoubleLiteral	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
0.178	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
1.235	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0.195	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
0.079	TokenNameDoubleLiteral	
+	TokenNamePLUS	
0.016	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step 5. Calculation of q 	TokenNameCOMMENT_LINE	Step 5. Calculation of q 
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step 6. 	TokenNameCOMMENT_LINE	Step 6. 
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
>	TokenNameGREATER	
0.25	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q0	TokenNameIdentifier	 q0
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
0.25	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
+	TokenNamePLUS	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q0	TokenNameIdentifier	 q0
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a9	TokenNameIdentifier	 a9
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a8	TokenNameIdentifier	 a8
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a7	TokenNameIdentifier	 a7
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a6	TokenNameIdentifier	 a6
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a5	TokenNameIdentifier	 a5
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a4	TokenNameIdentifier	 a4
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a3	TokenNameIdentifier	 a3
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Step 7. Quotient acceptance 	TokenNameCOMMENT_LINE	Step 7. Quotient acceptance 
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
u	TokenNameIdentifier	 u
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
gds	TokenNameIdentifier	 gds
/	TokenNameDIVIDE	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step 8. Double exponential deviate t 	TokenNameCOMMENT_LINE	Step 8. Double exponential deviate t 
do	TokenNamedo	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
u	TokenNameIdentifier	 u
+	TokenNamePLUS	
u	TokenNameIdentifier	 u
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
sign_u	TokenNameIdentifier	 sign u
=	TokenNameEQUAL	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1.0	TokenNameDoubleLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
*	TokenNameMULTIPLY	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sign_u	TokenNameIdentifier	 sign u
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<=	TokenNameLESS_EQUAL	
-	TokenNameMINUS	
0.71874483771719	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step 9. Rejection of t 	TokenNameCOMMENT_LINE	Step 9. Rejection of t 
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step 10. New q(t) 	TokenNameCOMMENT_LINE	Step 10. New q(t) 
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
>	TokenNameGREATER	
0.25	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q0	TokenNameIdentifier	 q0
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
0.25	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
+	TokenNamePLUS	
ss	TokenNameIdentifier	 ss
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q0	TokenNameIdentifier	 q0
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a9	TokenNameIdentifier	 a9
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a8	TokenNameIdentifier	 a8
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a7	TokenNameIdentifier	 a7
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a6	TokenNameIdentifier	 a6
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a5	TokenNameIdentifier	 a5
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a4	TokenNameIdentifier	 a4
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a3	TokenNameIdentifier	 a3
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Step 11. 	TokenNameCOMMENT_LINE	Step 11. 
if	TokenNameif	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
>	TokenNameGREATER	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e7	TokenNameIdentifier	 e7
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
e6	TokenNameIdentifier	 e6
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
e5	TokenNameIdentifier	 e5
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
e4	TokenNameIdentifier	 e4
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Step 12. Hat acceptance 	TokenNameCOMMENT_LINE	Step 12. Hat acceptance 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
*	TokenNameMULTIPLY	
u	TokenNameIdentifier	 u
*	TokenNameMULTIPLY	
sign_u	TokenNameIdentifier	 sign u
<=	TokenNameLESS_EQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
/	TokenNameDIVIDE	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the mean and variance. * @throws IllegalArgumentException if <tt>alpha &lt;= 0.0 || lambda &lt;= 0.0</tt>. */	TokenNameCOMMENT_JAVADOC	 Sets the mean and variance. @throws IllegalArgumentException if <tt>alpha &lt;= 0.0 || lambda &lt;= 0.0</tt>. 
public	TokenNamepublic	
void	TokenNamevoid	
setState	TokenNameIdentifier	 set State
(	TokenNameLPAREN	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
,	TokenNameCOMMA	
double	TokenNamedouble	
lambda	TokenNameIdentifier	 lambda
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lambda	TokenNameIdentifier	 lambda
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lambda	TokenNameIdentifier	 lambda
=	TokenNameEQUAL	
lambda	TokenNameIdentifier	 lambda
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a String representation of the receiver. */	TokenNameCOMMENT_JAVADOC	 Returns a String representation of the receiver. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
alpha	TokenNameIdentifier	 alpha
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
lambda	TokenNameIdentifier	 lambda
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

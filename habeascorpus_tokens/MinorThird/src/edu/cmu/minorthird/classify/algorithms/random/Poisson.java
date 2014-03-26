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
/** * Poisson distribution (quick); See the <A HREF="http://www.cern.ch/RD11/rkb/AN16pp/node208.html#SECTION0002080000000000000000"> math definition</A> * and <A HREF="http://www.statsoft.com/textbook/glosp.html#Poisson Distribution"> animated definition</A>. * <p> * <tt>p(k) = (mean^k / k!) * exp(-mean)</tt> for <tt>k &gt;= 0</tt>. * <p> * Valid parameter ranges: <tt>mean &gt; 0</tt>. * Note: if <tt>mean &lt;= 0.0</tt> then always returns zero. * <p> * Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. * <dt> * Static methods operate on a default uniform random number generator; they are synchronized. * <p> * <b>Implementation:</b> High performance implementation. * Patchwork Rejection/Inversion method. * <dt>This is a port of <tt>pprsc.c</tt> from the <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">C-RAND / WIN-RAND</A> library. * C-RAND's implementation, in turn, is based upon * <p> * H. Zechner (1994): Efficient sampling from continuous and discrete unimodal distributions, * Doctoral Dissertation, 156 pp., Technical University Graz, Austria. * <p> * Also see * <p> * Stadlober E., H. Zechner (1999), <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">The patchwork rejection method for sampling from unimodal distributions</A>, * to appear in ACM Transactions on Modelling and Simulation. * * @author wolfgang.hoschek@cern.ch * @version 1.0, 09/24/99 * @author Edoardo Airoldi */	TokenNameCOMMENT_JAVADOC	 Poisson distribution (quick); See the <A HREF="http://www.cern.ch/RD11/rkb/AN16pp/node208.html#SECTION0002080000000000000000"> math definition</A> and <A HREF="http://www.statsoft.com/textbook/glosp.html#Poisson Distribution"> animated definition</A>. <p> <tt>p(k) = (mean^k / k!) exp(-mean)</tt> for <tt>k &gt;= 0</tt>. <p> Valid parameter ranges: <tt>mean &gt; 0</tt>. Note: if <tt>mean &lt;= 0.0</tt> then always returns zero. <p> Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. <dt> Static methods operate on a default uniform random number generator; they are synchronized. <p> <b>Implementation:</b> High performance implementation. Patchwork Rejection/Inversion method. <dt>This is a port of <tt>pprsc.c</tt> from the <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">C-RAND / WIN-RAND</A> library. C-RAND's implementation, in turn, is based upon <p> H. Zechner (1994): Efficient sampling from continuous and discrete unimodal distributions, Doctoral Dissertation, 156 pp., Technical University Graz, Austria. <p> Also see <p> Stadlober E., H. Zechner (1999), <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">The patchwork rejection method for sampling from unimodal distributions</A>, to appear in ACM Transactions on Modelling and Simulation. * @author wolfgang.hoschek@cern.ch @version 1.0, 09/24/99 @author Edoardo Airoldi 
public	TokenNamepublic	
class	TokenNameclass	
Poisson	TokenNameIdentifier	 Poisson
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
mean	TokenNameIdentifier	 mean
;	TokenNameSEMICOLON	
// precomputed and cached values (for performance only) 	TokenNameCOMMENT_LINE	precomputed and cached values (for performance only) 
// cache for < SWITCH_MEAN 	TokenNameCOMMENT_LINE	cache for < SWITCH_MEAN 
protected	TokenNameprotected	
double	TokenNamedouble	
my_old	TokenNameIdentifier	 my old
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
p0	TokenNameIdentifier	 p0
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
36	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
llll	TokenNameIdentifier	 llll
;	TokenNameSEMICOLON	
// cache for >= SWITCH_MEAN 	TokenNameCOMMENT_LINE	cache for >= SWITCH_MEAN 
protected	TokenNameprotected	
double	TokenNamedouble	
my_last	TokenNameIdentifier	 my last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k5	TokenNameIdentifier	 k5
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
dl	TokenNameIdentifier	 dl
,	TokenNameCOMMA	
dr	TokenNameIdentifier	 dr
,	TokenNameCOMMA	
r1	TokenNameIdentifier	 r1
,	TokenNameCOMMA	
r2	TokenNameIdentifier	 r2
,	TokenNameCOMMA	
r4	TokenNameIdentifier	 r4
,	TokenNameCOMMA	
r5	TokenNameIdentifier	 r5
,	TokenNameCOMMA	
lr	TokenNameIdentifier	 lr
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
f1	TokenNameIdentifier	 f1
,	TokenNameCOMMA	
f2	TokenNameIdentifier	 f2
,	TokenNameCOMMA	
f4	TokenNameIdentifier	 f4
,	TokenNameCOMMA	
f5	TokenNameIdentifier	 f5
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
,	TokenNameCOMMA	
p5	TokenNameIdentifier	 p5
,	TokenNameCOMMA	
p6	TokenNameIdentifier	 p6
;	TokenNameSEMICOLON	
// cache for both; 	TokenNameCOMMENT_LINE	cache for both; 
protected	TokenNameprotected	
int	TokenNameint	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MEAN_MAX	TokenNameIdentifier	 MEAN  MAX
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// for all means larger than that, we don't try to compute a poisson deviation, but return the mean. 	TokenNameCOMMENT_LINE	for all means larger than that, we don't try to compute a poisson deviation, but return the mean. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
SWITCH_MEAN	TokenNameIdentifier	 SWITCH  MEAN
=	TokenNameEQUAL	
10.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// switch from method A to method B 	TokenNameCOMMENT_LINE	switch from method A to method B 
/** * Constructs a poisson distribution. * Example: mean=1.0. */	TokenNameCOMMENT_JAVADOC	 Constructs a poisson distribution. Example: mean=1.0. 
public	TokenNamepublic	
Poisson	TokenNameIdentifier	 Poisson
(	TokenNameLPAREN	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMean	TokenNameIdentifier	 set Mean
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
double	TokenNamedouble	
l_nu	TokenNameIdentifier	 l nu
,	TokenNameCOMMA	
double	TokenNamedouble	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
l_nu	TokenNameIdentifier	 l nu
-	TokenNameMINUS	
Arithmetic	TokenNameIdentifier	 Arithmetic
.	TokenNameDOT	
logFactorial	TokenNameIdentifier	 log Factorial
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
-	TokenNameMINUS	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a random number from the distribution. */	TokenNameCOMMENT_JAVADOC	 Returns a random number from the distribution. 
public	TokenNamepublic	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a random number from the distribution. */	TokenNameCOMMENT_JAVADOC	 Returns a random number from the distribution. 
public	TokenNamepublic	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
double	TokenNamedouble	
theMean	TokenNameIdentifier	 the Mean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/****************************************************************** * * * Poisson Distribution - Patchwork Rejection/Inversion * * * ****************************************************************** * * * For parameter my < 10 Tabulated Inversion is applied. * * For my >= 10 Patchwork Rejection is employed: * * The area below the histogram function f(x) is rearranged in * * its body by certain point reflections. Within a large center * * interval variates are sampled efficiently by rejection from * * uniform hats. Rectangular immediate acceptance regions speed * * up the generation. The remaining tails are covered by * * exponential functions. * * * *****************************************************************/	TokenNameCOMMENT_JAVADOC	**************************************************************** * Poisson Distribution - Patchwork Rejection/Inversion * ****************************************************************** * For parameter my < 10 Tabulated Inversion is applied. * For my >= 10 Patchwork Rejection is employed: * The area below the histogram function f(x) is rearranged in * its body by certain point reflections. Within a large center * interval variates are sampled efficiently by rejection from * uniform hats. Rectangular immediate acceptance regions speed * up the generation. The remaining tails are covered by * exponential functions. * ****************************************************************
double	TokenNamedouble	
my	TokenNameIdentifier	 my
=	TokenNameEQUAL	
theMean	TokenNameIdentifier	 the Mean
;	TokenNameSEMICOLON	
// double t,g,my_k; 	TokenNameCOMMENT_LINE	double t,g,my_k; 
// 	TokenNameCOMMENT_LINE	 
// double gx,gy,px,py,e,x,xx,delta,v; 	TokenNameCOMMENT_LINE	double gx,gy,px,py,e,x,xx,delta,v; 
// int sign; 	TokenNameCOMMENT_LINE	int sign; 
double	TokenNamedouble	
u	TokenNameIdentifier	 u
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
<	TokenNameLESS	
SWITCH_MEAN	TokenNameIdentifier	 SWITCH  MEAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CASE B: Inversion- start new table and calculate p0 	TokenNameCOMMENT_LINE	CASE B: Inversion- start new table and calculate p0 
if	TokenNameif	
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
!=	TokenNameNOT_EQUAL	
my_old	TokenNameIdentifier	 my old
)	TokenNameRPAREN	
{	TokenNameLBRACE	
my_old	TokenNameIdentifier	 my old
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
;	TokenNameSEMICOLON	
llll	TokenNameIdentifier	 llll
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
-	TokenNameMINUS	
my	TokenNameIdentifier	 my
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p0	TokenNameIdentifier	 p0
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
>	TokenNameGREATER	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
my	TokenNameIdentifier	 my
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Step U. Uniform sample 	TokenNameCOMMENT_LINE	Step U. Uniform sample 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
<=	TokenNameLESS_EQUAL	
p0	TokenNameIdentifier	 p0
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
llll	TokenNameIdentifier	 llll
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step T. Table comparison 	TokenNameCOMMENT_LINE	Step T. Table comparison 
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
>	TokenNameGREATER	
0.458	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
llll	TokenNameIdentifier	 llll
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
llll	TokenNameIdentifier	 llll
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
<=	TokenNameLESS_EQUAL	
pp	TokenNameIdentifier	 pp
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
llll	TokenNameIdentifier	 llll
==	TokenNameEQUAL_EQUAL	
35	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
llll	TokenNameIdentifier	 llll
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Step C. Creation of new prob. 	TokenNameCOMMENT_LINE	Step C. Creation of new prob. 
p	TokenNameIdentifier	 p
*=	TokenNameMULTIPLY_EQUAL	
my	TokenNameIdentifier	 my
/	TokenNameDIVIDE	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
+=	TokenNamePLUS_EQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
<=	TokenNameLESS_EQUAL	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
llll	TokenNameIdentifier	 llll
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
llll	TokenNameIdentifier	 llll
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end my < SWITCH_MEAN 	TokenNameCOMMENT_LINE	end my < SWITCH_MEAN 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
<	TokenNameLESS	
MEAN_MAX	TokenNameIdentifier	 MEAN  MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// CASE A: acceptance complement 	TokenNameCOMMENT_LINE	CASE A: acceptance complement 
int	TokenNameint	
Dk	TokenNameIdentifier	 Dk
,	TokenNameCOMMA	
X	TokenNameIdentifier	 X
,	TokenNameCOMMA	
Y	TokenNameIdentifier	 Y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
Ds	TokenNameIdentifier	 Ds
,	TokenNameCOMMA	
U	TokenNameIdentifier	 U
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
,	TokenNameCOMMA	
W	TokenNameIdentifier	 W
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
my	TokenNameIdentifier	 my
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
!=	TokenNameNOT_EQUAL	
my_last	TokenNameIdentifier	 my last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set-up 	TokenNameCOMMENT_LINE	set-up 
my_last	TokenNameIdentifier	 my last
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
;	TokenNameSEMICOLON	
// approximate deviation of reflection points k2, k4 from my - 1/2 	TokenNameCOMMENT_LINE	approximate deviation of reflection points k2, k4 from my - 1/2 
Ds	TokenNameIdentifier	 Ds
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
+	TokenNamePLUS	
0.25	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// mode m, reflection points k2 and k4, and points k1 and k5, which 	TokenNameCOMMENT_LINE	mode m, reflection points k2 and k4, and points k1 and k5, which 
// delimit the centre region of h(x) 	TokenNameCOMMENT_LINE	delimit the centre region of h(x) 
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
-	TokenNameMINUS	
Ds	TokenNameIdentifier	 Ds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
-	TokenNameMINUS	
0.5	TokenNameDoubleLiteral	
+	TokenNamePLUS	
Ds	TokenNameIdentifier	 Ds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k5	TokenNameIdentifier	 k5
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
// range width of the critical left and right centre region 	TokenNameCOMMENT_LINE	range width of the critical left and right centre region 
dl	TokenNameIdentifier	 dl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
-	TokenNameMINUS	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dr	TokenNameIdentifier	 dr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
k5	TokenNameIdentifier	 k5
-	TokenNameMINUS	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// recurrence constants r(k) = p(k)/p(k-1) at k = k1, k2, k4+1, k5+1 	TokenNameCOMMENT_LINE	recurrence constants r(k) = p(k)/p(k-1) at k = k1, k2, k4+1, k5+1 
r1	TokenNameIdentifier	 r1
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
/	TokenNameDIVIDE	
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
r2	TokenNameIdentifier	 r2
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
/	TokenNameDIVIDE	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
r4	TokenNameIdentifier	 r4
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
k4	TokenNameIdentifier	 k4
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r5	TokenNameIdentifier	 r5
=	TokenNameEQUAL	
my	TokenNameIdentifier	 my
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
k5	TokenNameIdentifier	 k5
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reciprocal values of the scale parameters of expon. tail envelopes 	TokenNameCOMMENT_LINE	reciprocal values of the scale parameters of expon. tail envelopes 
ll	TokenNameIdentifier	 ll
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// expon. tail left 	TokenNameCOMMENT_LINE	expon. tail left 
lr	TokenNameIdentifier	 lr
=	TokenNameEQUAL	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
r5	TokenNameIdentifier	 r5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// expon. tail right 	TokenNameCOMMENT_LINE	expon. tail right 
// Poisson constants, necessary for computing function values f(k) 	TokenNameCOMMENT_LINE	Poisson constants, necessary for computing function values f(k) 
l_my	TokenNameIdentifier	 l my
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
my	TokenNameIdentifier	 my
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c_pm	TokenNameIdentifier	 c pm
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
*	TokenNameMULTIPLY	
l_my	TokenNameIdentifier	 l my
-	TokenNameMINUS	
Arithmetic	TokenNameIdentifier	 Arithmetic
.	TokenNameDOT	
logFactorial	TokenNameIdentifier	 log Factorial
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// function values f(k) = p(k)/p(m) at k = k2, k4, k1, k5 	TokenNameCOMMENT_LINE	function values f(k) = p(k)/p(m) at k = k2, k4, k1, k5 
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f4	TokenNameIdentifier	 f4
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
k4	TokenNameIdentifier	 k4
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f1	TokenNameIdentifier	 f1
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f5	TokenNameIdentifier	 f5
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
k5	TokenNameIdentifier	 k5
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// area of the two centre and the two exponential tail regions 	TokenNameCOMMENT_LINE	area of the two centre and the two exponential tail regions 
// area of the two immediate acceptance regions between k2, k4 	TokenNameCOMMENT_LINE	area of the two immediate acceptance regions between k2, k4 
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
f2	TokenNameIdentifier	 f2
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
dl	TokenNameIdentifier	 dl
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// immed. left 	TokenNameCOMMENT_LINE	immed. left 
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
f2	TokenNameIdentifier	 f2
*	TokenNameMULTIPLY	
dl	TokenNameIdentifier	 dl
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
// centre left 	TokenNameCOMMENT_LINE	centre left 
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
f4	TokenNameIdentifier	 f4
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
// immed. right 	TokenNameCOMMENT_LINE	immed. right 
p4	TokenNameIdentifier	 p4
=	TokenNameEQUAL	
f4	TokenNameIdentifier	 f4
*	TokenNameMULTIPLY	
dr	TokenNameIdentifier	 dr
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
;	TokenNameSEMICOLON	
// centre right 	TokenNameCOMMENT_LINE	centre right 
p5	TokenNameIdentifier	 p5
=	TokenNameEQUAL	
f1	TokenNameIdentifier	 f1
/	TokenNameDIVIDE	
ll	TokenNameIdentifier	 ll
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
;	TokenNameSEMICOLON	
// expon. tail left 	TokenNameCOMMENT_LINE	expon. tail left 
p6	TokenNameIdentifier	 p6
=	TokenNameEQUAL	
f5	TokenNameIdentifier	 f5
/	TokenNameDIVIDE	
lr	TokenNameIdentifier	 lr
+	TokenNamePLUS	
p5	TokenNameIdentifier	 p5
;	TokenNameSEMICOLON	
// expon. tail right 	TokenNameCOMMENT_LINE	expon. tail right 
}	TokenNameRBRACE	
// end set-up 	TokenNameCOMMENT_LINE	end set-up 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// generate uniform number U -- U(0, p6) 	TokenNameCOMMENT_LINE	generate uniform number U -- U(0, p6) 
// case distinction corresponding to U 	TokenNameCOMMENT_LINE	case distinction corresponding to U 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p6	TokenNameIdentifier	 p6
)	TokenNameRPAREN	
<	TokenNameLESS	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// centre left 	TokenNameCOMMENT_LINE	centre left 
// immediate acceptance region R2 = [k2, m) *[0, f2), X = k2, ... m -1 	TokenNameCOMMENT_LINE	immediate acceptance region R2 = [k2, m) *[0, f2), X = k2, ... m -1 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
U	TokenNameIdentifier	 U
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
/	TokenNameDIVIDE	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// immediate acceptance region R1 = [k1, k2)*[0, f1), X = k1, ... k2-1 	TokenNameCOMMENT_LINE	immediate acceptance region R1 = [k1, k2)*[0, f1), X = k1, ... k2-1 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
=	TokenNameEQUAL	
V	TokenNameIdentifier	 V
/	TokenNameDIVIDE	
dl	TokenNameIdentifier	 dl
)	TokenNameRPAREN	
<	TokenNameLESS	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
/	TokenNameDIVIDE	
f1	TokenNameIdentifier	 f1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// computation of candidate X < k2, and its counterpart Y > k2 	TokenNameCOMMENT_LINE	computation of candidate X < k2, and its counterpart Y > k2 
// either squeeze-acceptance of X or acceptance-rejection of Y 	TokenNameCOMMENT_LINE	either squeeze-acceptance of X or acceptance-rejection of Y 
Dk	TokenNameIdentifier	 Dk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dl	TokenNameIdentifier	 dl
*	TokenNameMULTIPLY	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
<=	TokenNameLESS_EQUAL	
f2	TokenNameIdentifier	 f2
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
f2	TokenNameIdentifier	 f2
-	TokenNameMINUS	
f2	TokenNameIdentifier	 f2
/	TokenNameDIVIDE	
r2	TokenNameIdentifier	 r2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// quick accept of 	TokenNameCOMMENT_LINE	quick accept of 
return	TokenNamereturn	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// X = k2 - Dk 	TokenNameCOMMENT_LINE	X = k2 - Dk 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
f2	TokenNameIdentifier	 f2
+	TokenNamePLUS	
f2	TokenNameIdentifier	 f2
-	TokenNameMINUS	
W	TokenNameIdentifier	 W
)	TokenNameRPAREN	
<	TokenNameLESS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// quick reject of Y 	TokenNameCOMMENT_LINE	quick reject of Y 
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
Dk	TokenNameIdentifier	 Dk
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
<=	TokenNameLESS_EQUAL	
f2	TokenNameIdentifier	 f2
+	TokenNamePLUS	
Dk	TokenNameIdentifier	 Dk
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dl	TokenNameIdentifier	 dl
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// quick accept of 	TokenNameCOMMENT_LINE	quick accept of 
return	TokenNamereturn	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Y = k2 + Dk 	TokenNameCOMMENT_LINE	Y = k2 + Dk 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
<=	TokenNameLESS_EQUAL	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final accept of Y 	TokenNameCOMMENT_LINE	final accept of Y 
}	TokenNameRBRACE	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
<	TokenNameLESS	
p4	TokenNameIdentifier	 p4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// centre right 	TokenNameCOMMENT_LINE	centre right 
// immediate acceptance region R3 = [m, k4+1)*[0, f4), X = m, ... k4 	TokenNameCOMMENT_LINE	immediate acceptance region R3 = [m, k4+1)*[0, f4), X = m, ... k4 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
U	TokenNameIdentifier	 U
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
)	TokenNameRPAREN	
<	TokenNameLESS	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
k4	TokenNameIdentifier	 k4
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
f4	TokenNameIdentifier	 f4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// immediate acceptance region R4 = [k4+1, k5+1)*[0, f5) 	TokenNameCOMMENT_LINE	immediate acceptance region R4 = [k4+1, k5+1)*[0, f5) 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
=	TokenNameEQUAL	
V	TokenNameIdentifier	 V
/	TokenNameDIVIDE	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
<	TokenNameLESS	
f5	TokenNameIdentifier	 f5
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
k5	TokenNameIdentifier	 k5
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
/	TokenNameDIVIDE	
f5	TokenNameIdentifier	 f5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// computation of candidate X > k4, and its counterpart Y < k4 	TokenNameCOMMENT_LINE	computation of candidate X > k4, and its counterpart Y < k4 
// either squeeze-acceptance of X or acceptance-rejection of Y 	TokenNameCOMMENT_LINE	either squeeze-acceptance of X or acceptance-rejection of Y 
Dk	TokenNameIdentifier	 Dk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
dr	TokenNameIdentifier	 dr
*	TokenNameMULTIPLY	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
<=	TokenNameLESS_EQUAL	
f4	TokenNameIdentifier	 f4
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
f4	TokenNameIdentifier	 f4
-	TokenNameMINUS	
f4	TokenNameIdentifier	 f4
*	TokenNameMULTIPLY	
r4	TokenNameIdentifier	 r4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// quick accept of 	TokenNameCOMMENT_LINE	quick accept of 
return	TokenNamereturn	
(	TokenNameLPAREN	
k4	TokenNameIdentifier	 k4
+	TokenNamePLUS	
Dk	TokenNameIdentifier	 Dk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// X = k4 + Dk 	TokenNameCOMMENT_LINE	X = k4 + Dk 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
=	TokenNameEQUAL	
f4	TokenNameIdentifier	 f4
+	TokenNamePLUS	
f4	TokenNameIdentifier	 f4
-	TokenNameMINUS	
W	TokenNameIdentifier	 W
)	TokenNameRPAREN	
<	TokenNameLESS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// quick reject of Y 	TokenNameCOMMENT_LINE	quick reject of Y 
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
<=	TokenNameLESS_EQUAL	
f4	TokenNameIdentifier	 f4
+	TokenNamePLUS	
Dk	TokenNameIdentifier	 Dk
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
f4	TokenNameIdentifier	 f4
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
dr	TokenNameIdentifier	 dr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// quick accept of 	TokenNameCOMMENT_LINE	quick accept of 
return	TokenNamereturn	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Y = k4 - Dk 	TokenNameCOMMENT_LINE	Y = k4 - Dk 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
V	TokenNameIdentifier	 V
<=	TokenNameLESS_EQUAL	
f	TokenNameIdentifier	 f
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
,	TokenNameCOMMA	
l_my	TokenNameIdentifier	 l my
,	TokenNameCOMMA	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Y	TokenNameIdentifier	 Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final accept of Y 	TokenNameCOMMENT_LINE	final accept of Y 
}	TokenNameRBRACE	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
+	TokenNamePLUS	
Dk	TokenNameIdentifier	 Dk
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
W	TokenNameIdentifier	 W
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
<	TokenNameLESS	
p5	TokenNameIdentifier	 p5
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expon. tail left 	TokenNameCOMMENT_LINE	expon. tail left 
Dk	TokenNameIdentifier	 Dk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
ll	TokenNameIdentifier	 ll
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// 0 <= X <= k1 - 1 	TokenNameCOMMENT_LINE	0 <= X <= k1 - 1 
W	TokenNameIdentifier	 W
*=	TokenNameMULTIPLY_EQUAL	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
-	TokenNameMINUS	
p4	TokenNameIdentifier	 p4
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
ll	TokenNameIdentifier	 ll
;	TokenNameSEMICOLON	
// W -- U(0, h(x)) 	TokenNameCOMMENT_LINE	W -- U(0, h(x)) 
if	TokenNameif	
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
<=	TokenNameLESS_EQUAL	
f1	TokenNameIdentifier	 f1
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
f1	TokenNameIdentifier	 f1
-	TokenNameMINUS	
f1	TokenNameIdentifier	 f1
/	TokenNameDIVIDE	
r1	TokenNameIdentifier	 r1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// quick accept of X 	TokenNameCOMMENT_LINE	quick accept of X 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// expon. tail right 	TokenNameCOMMENT_LINE	expon. tail right 
Dk	TokenNameIdentifier	 Dk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
lr	TokenNameIdentifier	 lr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
k5	TokenNameIdentifier	 k5
+	TokenNamePLUS	
Dk	TokenNameIdentifier	 Dk
;	TokenNameSEMICOLON	
// X >= k5 + 1 	TokenNameCOMMENT_LINE	X >= k5 + 1 
W	TokenNameIdentifier	 W
*=	TokenNameMULTIPLY_EQUAL	
(	TokenNameLPAREN	
U	TokenNameIdentifier	 U
-	TokenNameMINUS	
p5	TokenNameIdentifier	 p5
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
lr	TokenNameIdentifier	 lr
;	TokenNameSEMICOLON	
// W -- U(0, h(x)) 	TokenNameCOMMENT_LINE	W -- U(0, h(x)) 
if	TokenNameif	
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
<=	TokenNameLESS_EQUAL	
f5	TokenNameIdentifier	 f5
-	TokenNameMINUS	
Dk	TokenNameIdentifier	 Dk
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
f5	TokenNameIdentifier	 f5
-	TokenNameMINUS	
f5	TokenNameIdentifier	 f5
*	TokenNameMULTIPLY	
r5	TokenNameIdentifier	 r5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// quick accept of X 	TokenNameCOMMENT_LINE	quick accept of X 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// acceptance-rejection test of candidate X from the original area 	TokenNameCOMMENT_LINE	acceptance-rejection test of candidate X from the original area 
// test, whether W <= f(k), with W = U*h(x) and U -- U(0, 1) 	TokenNameCOMMENT_LINE	test, whether W <= f(k), with W = U*h(x) and U -- U(0, 1) 
// log f(X) = (X - m)*log(my) - log X! + log m! 	TokenNameCOMMENT_LINE	log f(X) = (X - m)*log(my) - log X! + log m! 
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
W	TokenNameIdentifier	 W
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
X	TokenNameIdentifier	 X
*	TokenNameMULTIPLY	
l_my	TokenNameIdentifier	 l my
-	TokenNameMINUS	
Arithmetic	TokenNameIdentifier	 Arithmetic
.	TokenNameDOT	
logFactorial	TokenNameIdentifier	 log Factorial
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
-	TokenNameMINUS	
c_pm	TokenNameIdentifier	 c pm
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
X	TokenNameIdentifier	 X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// mean is too large 	TokenNameCOMMENT_LINE	mean is too large 
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
my	TokenNameIdentifier	 my
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the mean. */	TokenNameCOMMENT_JAVADOC	 Sets the mean. 
public	TokenNamepublic	
void	TokenNamevoid	
setMean	TokenNameIdentifier	 set Mean
(	TokenNameLPAREN	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
mean	TokenNameIdentifier	 mean
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
mean	TokenNameIdentifier	 mean
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

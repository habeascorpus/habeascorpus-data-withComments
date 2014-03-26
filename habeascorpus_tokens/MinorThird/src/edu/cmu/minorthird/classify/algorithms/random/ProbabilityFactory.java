/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
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
/** * @author Edoardo Airoldi * Date: Jan 10, 2005 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo Airoldi Date: Jan 10, 2005 
public	TokenNamepublic	
class	TokenNameclass	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
FLAG	TokenNameIdentifier	 FLAG
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
RWrapper	TokenNameIdentifier	 R Wrapper
rw	TokenNameIdentifier	 rw
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
rwShadow	TokenNameIdentifier	 rw Shadow
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProbabilityFactory	TokenNameIdentifier	 Probability Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
FLAG	TokenNameIdentifier	 FLAG
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
rwShadow	TokenNameIdentifier	 rw Shadow
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"eairoldi.random.BasicRWrapper"	TokenNameStringLiteral	eairoldi.random.BasicRWrapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rw	TokenNameIdentifier	 rw
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RWrapper	TokenNameIdentifier	 R Wrapper
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
)	TokenNameRPAREN	
rwShadow	TokenNameIdentifier	 rw Shadow
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: initialized once at the first call! 	TokenNameCOMMENT_LINE	Note: initialized once at the first call! 
FLAG	TokenNameIdentifier	 FLAG
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: R in Minorthird is not properly installed!"	TokenNameStringLiteral	error: R in Minorthird is not properly installed!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" See R_quickstart.txt in apps/edo/doc/ for more information."	TokenNameStringLiteral	 See R_quickstart.txt in apps/edo/doc/ for more information.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
-	TokenNameMINUS	
99	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Random Number Generators 	TokenNameCOMMENT_LINE	Random Number Generators 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rnorm	TokenNameIdentifier	 rnorm
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
double	TokenNamedouble	
sd	TokenNameIdentifier	 sd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rw	TokenNameIdentifier	 rw
.	TokenNameDOT	
rnorm	TokenNameIdentifier	 rnorm
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
runif	TokenNameIdentifier	 runif
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
double	TokenNamedouble	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rw	TokenNameIdentifier	 rw
.	TokenNameDOT	
runif	TokenNameIdentifier	 runif
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Probabilities for the Dirichlet-Poisson model (Airoldi, Cohen & Fienberg 2005) 	TokenNameCOMMENT_LINE	Probabilities for the Dirichlet-Poisson model (Airoldi, Cohen & Fienberg 2005) 
// 	TokenNameCOMMENT_LINE	 
// P(tau|sigma,X) 	TokenNameCOMMENT_LINE	P(tau|sigma,X) 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
ProbTauGivenSigmaX	TokenNameIdentifier	 Prob Tau Given Sigma X
(	TokenNameLPAREN	
double	TokenNamedouble	
tau	TokenNameIdentifier	 tau
,	TokenNameCOMMA	
double	TokenNamedouble	
sig	TokenNameIdentifier	 sig
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
vbeta	TokenNameIdentifier	 vbeta
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
vbeta	TokenNameIdentifier	 vbeta
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
<	TokenNameLESS	
vlow	TokenNameIdentifier	 vlow
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
sig	TokenNameIdentifier	 sig
<	TokenNameLESS	
vlow	TokenNameIdentifier	 vlow
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
tau	TokenNameIdentifier	 tau
>	TokenNameGREATER	
vup	TokenNameIdentifier	 vup
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
sig	TokenNameIdentifier	 sig
>	TokenNameGREATER	
vup	TokenNameIdentifier	 vup
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
//System.out.println(". out of bounds!"); 	TokenNameCOMMENT_LINE	System.out.println(". out of bounds!"); 
//System.out.println(". "+vlow[0]+"<"+tau+"<"+vup[0]+" "+vlow[1]+"<"+sig+"<"+vup[1]); 	TokenNameCOMMENT_LINE	System.out.println(". "+vlow[0]+"<"+tau+"<"+vup[0]+" "+vlow[1]+"<"+sig+"<"+vup[1]); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
*	TokenNameMULTIPLY	
tau	TokenNameIdentifier	 tau
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
-	TokenNameMINUS	
wp	TokenNameIdentifier	 wp
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tau	TokenNameIdentifier	 tau
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
+	TokenNamePLUS	
xr	TokenNameIdentifier	 xr
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
*	TokenNameMULTIPLY	
tau	TokenNameIdentifier	 tau
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
+	TokenNamePLUS	
xp	TokenNameIdentifier	 xp
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
wp	TokenNameIdentifier	 wp
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tau	TokenNameIdentifier	 tau
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
b2	TokenNameIdentifier	 b2
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tau	TokenNameIdentifier	 tau
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
prob	TokenNameIdentifier	 prob
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// probability of acceptance for tau - Metropolis step //// CHECK p1 UNUSED ?? 	TokenNameCOMMENT_LINE	probability of acceptance for tau - Metropolis step //// CHECK p1 UNUSED ?? 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
AlphaTau	TokenNameIdentifier	 Alpha Tau
(	TokenNameLPAREN	
double	TokenNamedouble	
tau	TokenNameIdentifier	 tau
,	TokenNameCOMMA	
double	TokenNamedouble	
sig	TokenNameIdentifier	 sig
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
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
double	TokenNamedouble	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
double	TokenNamedouble	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("p(cand|s,x)="+ProbTauGivenSigmaX(candidate,sig,vlow,vup,xr,xp,wr,wp,vbeta)+" p(tau|s,x)="+ProbTauGivenSigmaX(tau,sig,vlow,vup,xr,xp,wr,wp,vbeta)+" pi(tau)="+rw.dnorm(tau, candidate,p2,"TRUE")+" pi(cand)="+rw.dnorm(candidate, tau,p2,"TRUE")); 	TokenNameCOMMENT_LINE	System.out.println("p(cand|s,x)="+ProbTauGivenSigmaX(candidate,sig,vlow,vup,xr,xp,wr,wp,vbeta)+" p(tau|s,x)="+ProbTauGivenSigmaX(tau,sig,vlow,vup,xr,xp,wr,wp,vbeta)+" pi(tau)="+rw.dnorm(tau, candidate,p2,"TRUE")+" pi(cand)="+rw.dnorm(candidate, tau,p2,"TRUE")); 
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
ProbTauGivenSigmaX	TokenNameIdentifier	 Prob Tau Given Sigma X
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
sig	TokenNameIdentifier	 sig
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
)	TokenNameRPAREN	
-	TokenNameMINUS	
ProbTauGivenSigmaX	TokenNameIdentifier	 Prob Tau Given Sigma X
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
,	TokenNameCOMMA	
sig	TokenNameIdentifier	 sig
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
)	TokenNameRPAREN	
+	TokenNamePLUS	
rw	TokenNameIdentifier	 rw
.	TokenNameDOT	
dnorm	TokenNameIdentifier	 dnorm
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
,	TokenNameCOMMA	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
"TRUE"	TokenNameStringLiteral	TRUE
)	TokenNameRPAREN	
-	TokenNameMINUS	
rw	TokenNameIdentifier	 rw
.	TokenNameDOT	
dnorm	TokenNameIdentifier	 dnorm
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
tau	TokenNameIdentifier	 tau
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
"TRUE"	TokenNameStringLiteral	TRUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
prob	TokenNameIdentifier	 prob
)	TokenNameRPAREN	
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prob	TokenNameIdentifier	 prob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// P(sigma|tau,X) 	TokenNameCOMMENT_LINE	P(sigma|tau,X) 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
ProbSigmaGivenTauX	TokenNameIdentifier	 Prob Sigma Given Tau X
(	TokenNameLPAREN	
double	TokenNamedouble	
sig	TokenNameIdentifier	 sig
,	TokenNameCOMMA	
double	TokenNamedouble	
tau	TokenNameIdentifier	 tau
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b1	TokenNameIdentifier	 b1
=	TokenNameEQUAL	
vbeta	TokenNameIdentifier	 vbeta
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b2	TokenNameIdentifier	 b2
=	TokenNameEQUAL	
vbeta	TokenNameIdentifier	 vbeta
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
<	TokenNameLESS	
vlow	TokenNameIdentifier	 vlow
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
sig	TokenNameIdentifier	 sig
<	TokenNameLESS	
vlow	TokenNameIdentifier	 vlow
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
tau	TokenNameIdentifier	 tau
>	TokenNameGREATER	
vup	TokenNameIdentifier	 vup
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
|	TokenNameOR	
sig	TokenNameIdentifier	 sig
>	TokenNameGREATER	
vup	TokenNameIdentifier	 vup
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
//System.out.println(". out of bounds!"); 	TokenNameCOMMENT_LINE	System.out.println(". out of bounds!"); 
//System.out.println(". "+vlow[0]+"<"+tau+"<"+vup[0]+" "+vlow[1]+"<"+sig+"<"+vup[1]); 	TokenNameCOMMENT_LINE	System.out.println(". "+vlow[0]+"<"+tau+"<"+vup[0]+" "+vlow[1]+"<"+sig+"<"+vup[1]); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
-	TokenNameMINUS	
wr	TokenNameIdentifier	 wr
*	TokenNameMULTIPLY	
tau	TokenNameIdentifier	 tau
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
-	TokenNameMINUS	
wp	TokenNameIdentifier	 wp
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tau	TokenNameIdentifier	 tau
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
+	TokenNamePLUS	
xr	TokenNameIdentifier	 xr
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
*	TokenNameMULTIPLY	
tau	TokenNameIdentifier	 tau
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
+	TokenNamePLUS	
xp	TokenNameIdentifier	 xp
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
wp	TokenNameIdentifier	 wp
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tau	TokenNameIdentifier	 tau
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
b2	TokenNameIdentifier	 b2
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
tau	TokenNameIdentifier	 tau
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tau	TokenNameIdentifier	 tau
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
Arithmetic	TokenNameIdentifier	 Arithmetic
.	TokenNameDOT	
logGamma	TokenNameIdentifier	 log Gamma
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
b2	TokenNameIdentifier	 b2
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
Arithmetic	TokenNameIdentifier	 Arithmetic
.	TokenNameDOT	
logGamma	TokenNameIdentifier	 log Gamma
(	TokenNameLPAREN	
b1	TokenNameIdentifier	 b1
+	TokenNamePLUS	
b2	TokenNameIdentifier	 b2
*	TokenNameMULTIPLY	
sig	TokenNameIdentifier	 sig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
prob	TokenNameIdentifier	 prob
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// probability of acceptance for sig - Metropolis step //// CHECK p1 UNUSED ?? 	TokenNameCOMMENT_LINE	probability of acceptance for sig - Metropolis step //// CHECK p1 UNUSED ?? 
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
AlphaSigma	TokenNameIdentifier	 Alpha Sigma
(	TokenNameLPAREN	
double	TokenNamedouble	
sig	TokenNameIdentifier	 sig
,	TokenNameCOMMA	
double	TokenNamedouble	
tau	TokenNameIdentifier	 tau
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
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
double	TokenNamedouble	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
double	TokenNamedouble	
candidate	TokenNameIdentifier	 candidate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("p(cand|t,x)="+ProbSigmaGivenTauX(candidate,tau,vlow,vup,xr,xp,wr,wp,vbeta)+" p(sig|t,x)="+ProbSigmaGivenTauX(sig,tau,vlow,vup,xr,xp,wr,wp,vbeta)+" pi(sig)="+rw.dnorm(sig, candidate,p2,"TRUE")+" pi(cand)="+rw.dnorm(candidate, sig,p2,"TRUE")); 	TokenNameCOMMENT_LINE	System.out.println("p(cand|t,x)="+ProbSigmaGivenTauX(candidate,tau,vlow,vup,xr,xp,wr,wp,vbeta)+" p(sig|t,x)="+ProbSigmaGivenTauX(sig,tau,vlow,vup,xr,xp,wr,wp,vbeta)+" pi(sig)="+rw.dnorm(sig, candidate,p2,"TRUE")+" pi(cand)="+rw.dnorm(candidate, sig,p2,"TRUE")); 
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
ProbSigmaGivenTauX	TokenNameIdentifier	 Prob Sigma Given Tau X
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
tau	TokenNameIdentifier	 tau
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
)	TokenNameRPAREN	
-	TokenNameMINUS	
ProbSigmaGivenTauX	TokenNameIdentifier	 Prob Sigma Given Tau X
(	TokenNameLPAREN	
sig	TokenNameIdentifier	 sig
,	TokenNameCOMMA	
tau	TokenNameIdentifier	 tau
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
)	TokenNameRPAREN	
+	TokenNamePLUS	
rw	TokenNameIdentifier	 rw
.	TokenNameDOT	
dnorm	TokenNameIdentifier	 dnorm
(	TokenNameLPAREN	
sig	TokenNameIdentifier	 sig
,	TokenNameCOMMA	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
"TRUE"	TokenNameStringLiteral	TRUE
)	TokenNameRPAREN	
-	TokenNameMINUS	
rw	TokenNameIdentifier	 rw
.	TokenNameDOT	
dnorm	TokenNameIdentifier	 dnorm
(	TokenNameLPAREN	
candidate	TokenNameIdentifier	 candidate
,	TokenNameCOMMA	
sig	TokenNameIdentifier	 sig
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
"TRUE"	TokenNameStringLiteral	TRUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
prob	TokenNameIdentifier	 prob
)	TokenNameRPAREN	
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prob	TokenNameIdentifier	 prob
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prob	TokenNameIdentifier	 prob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

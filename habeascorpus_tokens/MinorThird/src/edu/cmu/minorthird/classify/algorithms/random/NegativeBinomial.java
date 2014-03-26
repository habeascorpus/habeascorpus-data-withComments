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
/*= * Negative Binomial distribution; See the <A HREF="http://www.statlets.com/usermanual/glossary2.htm"> math definition</A>. * <p> * Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. * <dt> * Static methods operate on a default uniform random number generator; they are synchronized. * <p> * <b>Implementation:</b> High performance implementation. Compound method. * <dt> * This is a port of <tt>nbp.c</tt> from the <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">C-RAND / WIN-RAND</A> library. * C-RAND's implementation, in turn, is based upon * <p> * J.H. Ahrens, U. Dieter (1974): Computer methods for sampling from gamma, beta, Poisson and binomial distributions, Computing 12, 223--246. * * @author wolfgang.hoschek@cern.ch * @version 1.0, 09/24/99 * @author Edoardo Airoldi */	TokenNameCOMMENT_BLOCK	= Negative Binomial distribution; See the <A HREF="http://www.statlets.com/usermanual/glossary2.htm"> math definition</A>. <p> Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. <dt> Static methods operate on a default uniform random number generator; they are synchronized. <p> <b>Implementation:</b> High performance implementation. Compound method. <dt> This is a port of <tt>nbp.c</tt> from the <A HREF="http://www.cis.tu-graz.ac.at/stat/stadl/random.html">C-RAND / WIN-RAND</A> library. C-RAND's implementation, in turn, is based upon <p> J.H. Ahrens, U. Dieter (1974): Computer methods for sampling from gamma, beta, Poisson and binomial distributions, Computing 12, 223--246. * @author wolfgang.hoschek@cern.ch @version 1.0, 09/24/99 @author Edoardo Airoldi 
public	TokenNamepublic	
class	TokenNameclass	
NegativeBinomial	TokenNameIdentifier	 Negative Binomial
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Gamma	TokenNameIdentifier	 Gamma
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Poisson	TokenNameIdentifier	 Poisson
poisson	TokenNameIdentifier	 poisson
;	TokenNameSEMICOLON	
/*= * Constructs a Negative Binomial distribution. * Example: n=1, p=0.5. * @param n the number of trials. * @param p the probability of success. */	TokenNameCOMMENT_BLOCK	= Constructs a Negative Binomial distribution. Example: n=1, p=0.5. @param n the number of trials. @param p the probability of success. 
public	TokenNamepublic	
NegativeBinomial	TokenNameIdentifier	 Negative Binomial
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNandP	TokenNameIdentifier	 set Nand P
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
new	TokenNamenew	
Gamma	TokenNameIdentifier	 Gamma
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
poisson	TokenNameIdentifier	 poisson
=	TokenNameEQUAL	
new	TokenNamenew	
Poisson	TokenNameIdentifier	 Poisson
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns a random number from the distribution. */	TokenNameCOMMENT_BLOCK	= Returns a random number from the distribution. 
public	TokenNamepublic	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns a random number from the distribution; bypasses the internal state. */	TokenNameCOMMENT_BLOCK	= Returns a random number from the distribution; bypasses the internal state. 
public	TokenNamepublic	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*=**************************************************************** * * * Negative Binomial Distribution - Compound method * * * ****************************************************************** * * * FUNCTION: - nbp samples a random number from the Negative * * Binomial distribution with parameters r (no. of * * failures given) and p (probability of success) * * valid for r > 0, 0 < p < 1. * * If G from Gamma(r) then K from Poiss(pG/(1-p)) * * is NB(r,p)--distributed. * * REFERENCE: - J.H. Ahrens, U. Dieter (1974): Computer methods * * for sampling from gamma, beta, Poisson and * * binomial distributions, Computing 12, 223--246. * * SUBPROGRAMS: - drand(seed) ... (0,1)-Uniform generator with * * unsigned long integer *seed * * - Gamma(seed,a) ... Gamma generator for a > 0 * * unsigned long *seed, double a * * - Poisson(seed,a) ...Poisson generator for a > 0 * * unsigned long *seed, double a. * * * ******************************************************************/	TokenNameCOMMENT_BLOCK	=**************************************************************** * Negative Binomial Distribution - Compound method * ****************************************************************** * FUNCTION: - nbp samples a random number from the Negative * Binomial distribution with parameters r (no. of * failures given) and p (probability of success) * valid for r > 0, 0 < p < 1. * If G from Gamma(r) then K from Poiss(pG/(1-p)) * is NB(r,p)--distributed. * REFERENCE: - J.H. Ahrens, U. Dieter (1974): Computer methods * for sampling from gamma, beta, Poisson and * binomial distributions, Computing 12, 223--246. * SUBPROGRAMS: - drand(seed) ... (0,1)-Uniform generator with * unsigned long integer *seed * - Gamma(seed,a) ... Gamma generator for a > 0 * unsigned long *seed, double a * - Poisson(seed,a) ...Poisson generator for a > 0 * unsigned long *seed, double a. * *****************************************************************
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//double p1 = p; 	TokenNameCOMMENT_LINE	double p1 = p; 
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
poisson	TokenNameIdentifier	 poisson
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Sets the parameters number of trials and the probability of success. * @param n the number of trials * @param p the probability of success. */	TokenNameCOMMENT_BLOCK	= Sets the parameters number of trials and the probability of success. @param n the number of trials @param p the probability of success. 
public	TokenNamepublic	
void	TokenNamevoid	
setNandP	TokenNameIdentifier	 set Nand P
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * Returns a String representation of the receiver. */	TokenNameCOMMENT_BLOCK	= Returns a String representation of the receiver. 
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
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

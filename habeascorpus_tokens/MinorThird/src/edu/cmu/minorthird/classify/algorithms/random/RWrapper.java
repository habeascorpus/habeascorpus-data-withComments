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
/** * User: Edoardo M. Airoldi (eairoldi@cs.cmu.edu) * Date: Feb 22, 2005 */	TokenNameCOMMENT_JAVADOC	 User: Edoardo M. Airoldi (eairoldi@cs.cmu.edu) Date: Feb 22, 2005 
public	TokenNamepublic	
interface	TokenNameinterface	
RWrapper	TokenNameIdentifier	 R Wrapper
{	TokenNameLBRACE	
/** Teminates the REngine */	TokenNameCOMMENT_JAVADOC	 Teminates the REngine 
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Random Number Generators 	TokenNameCOMMENT_LINE	Random Number Generators 
// 	TokenNameCOMMENT_LINE	 
/** Genrates a vector of n doubles distributed according to a * Gaussian with: mean = mu and standard deviation = sd */	TokenNameCOMMENT_JAVADOC	 Genrates a vector of n doubles distributed according to a Gaussian with: mean = mu and standard deviation = sd 
public	TokenNamepublic	
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
;	TokenNameSEMICOLON	
/** Genrates a vector of n doubles distributed according to a * Uniform with range: min = min and max = max */	TokenNameCOMMENT_JAVADOC	 Genrates a vector of n doubles distributed according to a Uniform with range: min = min and max = max 
public	TokenNamepublic	
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
;	TokenNameSEMICOLON	
/** Genrates a vector of n doubles distributed according to a * Binomial with parameters: mu = mu and delta = delta */	TokenNameCOMMENT_JAVADOC	 Genrates a vector of n doubles distributed according to a Binomial with parameters: mu = mu and delta = delta 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rbinom	TokenNameIdentifier	 rbinom
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Genrates a vector of n doubles distributed according to a * Negative-Binomial with parameters: mu = mu and delta = delta */	TokenNameCOMMENT_JAVADOC	 Genrates a vector of n doubles distributed according to a Negative-Binomial with parameters: mu = mu and delta = delta 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rnbinom	TokenNameIdentifier	 rnbinom
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Densities 	TokenNameCOMMENT_LINE	Densities 
// 	TokenNameCOMMENT_LINE	 
/** Evasluates a Gaussian density (mean = mu, standard deviation = sd) * at each element of the vector t */	TokenNameCOMMENT_JAVADOC	 Evasluates a Gaussian density (mean = mu, standard deviation = sd) at each element of the vector t 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dnorm	TokenNameIdentifier	 dnorm
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
double	TokenNamedouble	
sd	TokenNameIdentifier	 sd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Evasluates a Gaussian density (mean = mu, standard deviation = sd) * at t */	TokenNameCOMMENT_JAVADOC	 Evasluates a Gaussian density (mean = mu, standard deviation = sd) at t 
public	TokenNamepublic	
double	TokenNamedouble	
dnorm	TokenNameIdentifier	 dnorm
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
double	TokenNamedouble	
sd	TokenNameIdentifier	 sd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

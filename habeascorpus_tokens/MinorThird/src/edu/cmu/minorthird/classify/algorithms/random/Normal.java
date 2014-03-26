/* Copyright 1999 CERN - European Organization for Nuclear Research. Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose is hereby granted without fee, provided that the above copyright notice appear in all copies and that both that copyright notice and this permission notice appear in supporting documentation. CERN makes no representations about the suitability of this software for any purpose. It is provided "as is" without expressed or implied warranty. */	TokenNameCOMMENT_BLOCK	 Copyright 1999 CERN - European Organization for Nuclear Research. Permission to use, copy, modify, distribute and sell this software and its documentation for any purpose is hereby granted without fee, provided that the above copyright notice appear in all copies and that both that copyright notice and this permission notice appear in supporting documentation. CERN makes no representations about the suitability of this software for any purpose. It is provided "as is" without expressed or implied warranty. 
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
/** Normal (aka Gaussian) distribution; See the <A HREF="http://www.cern.ch/RD11/rkb/AN16pp/node188.html#SECTION0001880000000000000000"> math definition</A> and <A HREF="http://www.statsoft.com/textbook/glosn.html#Normal Distribution"> animated definition</A>. <pre> 1 2 pdf(x) = --------- exp( - (x-mean) / 2v ) sqrt(2pi*v) x - 1 | | 2 cdf(x) = --------- | exp( - (t-mean) / 2v ) dt sqrt(2pi*v)| | - -inf. </pre> where <tt>v = variance = standardDeviation^2</tt>. <p> Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. <dt> Static methods operate on a default uniform random number generator; they are synchronized. <p> <b>Implementation:</b> Polar Box-Muller transformation. See G.E.P. Box, M.E. Muller (1958): A note on the generation of random normal deviates, Annals Math. Statist. 29, 610-611. <p> @author wolfgang.hoschek@cern.ch @version 1.0, 09/24/99 */	TokenNameCOMMENT_JAVADOC	 Normal (aka Gaussian) distribution; See the <A HREF="http://www.cern.ch/RD11/rkb/AN16pp/node188.html#SECTION0001880000000000000000"> math definition</A> and <A HREF="http://www.statsoft.com/textbook/glosn.html#Normal Distribution"> animated definition</A>. <pre> 1 2 pdf(x) = --------- exp( - (x-mean) / 2v ) sqrt(2pi*v) x - 1 | | 2 cdf(x) = --------- | exp( - (t-mean) / 2v ) dt sqrt(2pi*v)| | - -inf. </pre> where <tt>v = variance = standardDeviation^2</tt>. <p> Instance methods operate on a user supplied uniform random number generator; they are unsynchronized. <dt> Static methods operate on a default uniform random number generator; they are synchronized. <p> <b>Implementation:</b> Polar Box-Muller transformation. See G.E.P. Box, M.E. Muller (1958): A note on the generation of random normal deviates, Annals Math. Statist. 29, 610-611. <p> @author wolfgang.hoschek@cern.ch @version 1.0, 09/24/99 
public	TokenNamepublic	
class	TokenNameclass	
Normal	TokenNameIdentifier	 Normal
{	TokenNameLBRACE	
protected	TokenNameprotected	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
variance	TokenNameIdentifier	 variance
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
standardDeviation	TokenNameIdentifier	 standard Deviation
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
// cache for Box-Mueller algorithm 	TokenNameCOMMENT_LINE	cache for Box-Mueller algorithm 
protected	TokenNameprotected	
boolean	TokenNameboolean	
cacheFilled	TokenNameIdentifier	 cache Filled
;	TokenNameSEMICOLON	
// Box-Mueller 	TokenNameCOMMENT_LINE	Box-Mueller 
protected	TokenNameprotected	
double	TokenNamedouble	
SQRT_INV	TokenNameIdentifier	 SQRT  INV
;	TokenNameSEMICOLON	
// performance cache 	TokenNameCOMMENT_LINE	performance cache 
// The uniform random number generated shared by all <b>static</b> methods. 	TokenNameCOMMENT_LINE	The uniform random number generated shared by all <b>static</b> methods. 
protected	TokenNameprotected	
RandomElement	TokenNameIdentifier	 Random Element
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
new	TokenNamenew	
RandomElement	TokenNameIdentifier	 Random Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
this	TokenNamethis	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
standardDeviation	TokenNameIdentifier	 standard Deviation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a random number from the distribution; bypasses the internal state. */	TokenNameCOMMENT_JAVADOC	 Returns a random number from the distribution; bypasses the internal state. 
public	TokenNamepublic	
double	TokenNamedouble	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
,	TokenNameCOMMA	
double	TokenNamedouble	
standardDeviation	TokenNameIdentifier	 standard Deviation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Uses polar Box-Muller transformation. 	TokenNameCOMMENT_LINE	Uses polar Box-Muller transformation. 
if	TokenNameif	
(	TokenNameLPAREN	
cacheFilled	TokenNameIdentifier	 cache Filled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheFilled	TokenNameIdentifier	 cache Filled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
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
y	TokenNameIdentifier	 y
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
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>=	TokenNameGREATER_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
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
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
mean	TokenNameIdentifier	 mean
+	TokenNamePLUS	
standardDeviation	TokenNameIdentifier	 standard Deviation
*	TokenNameMULTIPLY	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
cacheFilled	TokenNameIdentifier	 cache Filled
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mean	TokenNameIdentifier	 mean
+	TokenNamePLUS	
standardDeviation	TokenNameIdentifier	 standard Deviation
*	TokenNameMULTIPLY	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
z	TokenNameIdentifier	 z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the mean and variance. */	TokenNameCOMMENT_JAVADOC	 Sets the mean and variance. 
public	TokenNamepublic	
void	TokenNamevoid	
setState	TokenNameIdentifier	 set State
(	TokenNameLPAREN	
double	TokenNamedouble	
mean	TokenNameIdentifier	 mean
,	TokenNameCOMMA	
double	TokenNamedouble	
standardDeviation	TokenNameIdentifier	 standard Deviation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mean	TokenNameIdentifier	 mean
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
||	TokenNameOR_OR	
standardDeviation	TokenNameIdentifier	 standard Deviation
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
standardDeviation	TokenNameIdentifier	 standard Deviation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
=	TokenNameEQUAL	
mean	TokenNameIdentifier	 mean
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
standardDeviation	TokenNameIdentifier	 standard Deviation
=	TokenNameEQUAL	
standardDeviation	TokenNameIdentifier	 standard Deviation
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
variance	TokenNameIdentifier	 variance
=	TokenNameEQUAL	
standardDeviation	TokenNameIdentifier	 standard Deviation
*	TokenNameMULTIPLY	
standardDeviation	TokenNameIdentifier	 standard Deviation
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cacheFilled	TokenNameIdentifier	 cache Filled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
SQRT_INV	TokenNameIdentifier	 SQRT  INV
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
2.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
*	TokenNameMULTIPLY	
variance	TokenNameIdentifier	 variance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
standardDeviation	TokenNameIdentifier	 standard Deviation
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

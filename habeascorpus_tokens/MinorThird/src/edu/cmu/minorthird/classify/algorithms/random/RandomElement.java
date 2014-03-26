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
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
/*= * * Ranecu is an advanced multiplicative linear congruential random number * generator with a period of aproximately 10<SUP>18</SUP>. * Ranecu is a direct translation from Fortran of the <B>RANECU</B> * subroutine * published in the paper * <BR> * F. James, <CITE>Comp. Phys. Comm.</CITE> <STRONG>60</STRONG> (1990) p 329-344 * <BR> * The algorithm was originally described in * <BR> * P. L'Ecuyer, <CITE>Commun. ACM.</CITE> <STRONG>1988</STRONG> (1988) p 742 * <BR> * <A HREF="http://nhse.npac.syr.edu:8015/nhse-rw/catalog/random/RANECU.html"> More info </A>. * * @author Paul Houle * @version 1.0 */	TokenNameCOMMENT_BLOCK	= * Ranecu is an advanced multiplicative linear congruential random number generator with a period of aproximately 10<SUP>18</SUP>. Ranecu is a direct translation from Fortran of the <B>RANECU</B> subroutine published in the paper <BR> F. James, <CITE>Comp. Phys. Comm.</CITE> <STRONG>60</STRONG> (1990) p 329-344 <BR> The algorithm was originally described in <BR> P. L'Ecuyer, <CITE>Commun. ACM.</CITE> <STRONG>1988</STRONG> (1988) p 742 <BR> <A HREF="http://nhse.npac.syr.edu:8015/nhse-rw/catalog/random/RANECU.html"> More info </A>. * @author Paul Houle @version 1.0 
public	TokenNamepublic	
class	TokenNameclass	
RandomElement	TokenNameIdentifier	 Random Element
{	TokenNameLBRACE	
int	TokenNameint	
iseed1	TokenNameIdentifier	 iseed1
,	TokenNameCOMMA	
iseed2	TokenNameIdentifier	 iseed2
;	TokenNameSEMICOLON	
/*= * default iseed1 = 12345 */	TokenNameCOMMENT_BLOCK	= default iseed1 = 12345 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
DEFSEED1	TokenNameIdentifier	 DEFSEE D1
=	TokenNameEQUAL	
12345	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/*= * default iseed2 = 67890 */	TokenNameCOMMENT_BLOCK	= default iseed2 = 67890 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
DEFSEED2	TokenNameIdentifier	 DEFSEE D2
=	TokenNameEQUAL	
67890	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/*= * * Initialize <BOLD>RANECU</BOLD> with the default seeds * */	TokenNameCOMMENT_BLOCK	= * Initialize <BOLD>RANECU</BOLD> with the default seeds 
public	TokenNamepublic	
RandomElement	TokenNameIdentifier	 Random Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iseed1	TokenNameIdentifier	 iseed1
=	TokenNameEQUAL	
DEFSEED1	TokenNameIdentifier	 DEFSEE D1
;	TokenNameSEMICOLON	
iseed2	TokenNameIdentifier	 iseed2
=	TokenNameEQUAL	
DEFSEED2	TokenNameIdentifier	 DEFSEE D2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * * Initialize <BOLD>RANECU</BOLD> with two specified integer seeds. Use * this to introduce repeatable seeds. Equivalent to * * <CODE>Ranecu(s1*(long) Integer.MAX_VALUE)+s2)</CODE> * * @param s1 seed integer 1 (MSW) * @param s2 seed integer 2 (LSW) * */	TokenNameCOMMENT_BLOCK	= * Initialize <BOLD>RANECU</BOLD> with two specified integer seeds. Use this to introduce repeatable seeds. Equivalent to * <CODE>Ranecu(s1*(long) Integer.MAX_VALUE)+s2)</CODE> * @param s1 seed integer 1 (MSW) @param s2 seed integer 2 (LSW) 
public	TokenNamepublic	
RandomElement	TokenNameIdentifier	 Random Element
(	TokenNameLPAREN	
int	TokenNameint	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
int	TokenNameint	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iseed1	TokenNameIdentifier	 iseed1
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
iseed2	TokenNameIdentifier	 iseed2
=	TokenNameEQUAL	
s2	TokenNameIdentifier	 s2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * * Initialize <TT>RANECU</TT> with a long seed. * * @param l long integer seed */	TokenNameCOMMENT_BLOCK	 * Initialize <TT>RANECU</TT> with a long seed. * @param l long integer seed 
public	TokenNamepublic	
RandomElement	TokenNameIdentifier	 Random Element
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iseed1	TokenNameIdentifier	 iseed1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
l	TokenNameIdentifier	 l
/	TokenNameDIVIDE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
iseed2	TokenNameIdentifier	 iseed2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
l	TokenNameIdentifier	 l
%	TokenNameREMAINDER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * * Initialize <TT>RANECU</TT> from the clock without saving a copy * of the seed. Example: * * <PRE> * RandomElement e = new Ranecu(new Date()); * </PRE> * * to save the seed for future restarts, see the <CODE>ClockSeed()</CODE> * method defined in RandomSeedable. * * @param d a date, typically <CODE>new Date()</CODE> * @see RandomSeedable#ClockSeed() */	TokenNameCOMMENT_BLOCK	 * Initialize <TT>RANECU</TT> from the clock without saving a copy of the seed. Example: * <PRE> RandomElement e = new Ranecu(new Date()); </PRE> * to save the seed for future restarts, see the <CODE>ClockSeed()</CODE> method defined in RandomSeedable. * @param d a date, typically <CODE>new Date()</CODE> @see RandomSeedable#ClockSeed() 
public	TokenNamepublic	
RandomElement	TokenNameIdentifier	 Random Element
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iseed1	TokenNameIdentifier	 iseed1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
iseed2	TokenNameIdentifier	 iseed2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * * @return the current generator state as a long. Can be used to * restart the generator where one left off. * */	TokenNameCOMMENT_BLOCK	= * @return the current generator state as a long. Can be used to restart the generator where one left off. 
public	TokenNamepublic	
long	TokenNamelong	
getSeed	TokenNameIdentifier	 get Seed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iseed1	TokenNameIdentifier	 iseed1
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
+	TokenNamePLUS	
iseed2	TokenNameIdentifier	 iseed2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * returns a uniformly distributed pseudo-random double in the range (0,1). */	TokenNameCOMMENT_BLOCK	= returns a uniformly distributed pseudo-random double in the range (0,1). 
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
final	TokenNamefinal	
public	TokenNamepublic	
double	TokenNamedouble	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
iz	TokenNameIdentifier	 iz
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
iseed1	TokenNameIdentifier	 iseed1
/	TokenNameDIVIDE	
53688	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iseed1	TokenNameIdentifier	 iseed1
=	TokenNameEQUAL	
40014	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
iseed1	TokenNameIdentifier	 iseed1
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
53668	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
12211	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iseed1	TokenNameIdentifier	 iseed1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iseed1	TokenNameIdentifier	 iseed1
+=	TokenNamePLUS_EQUAL	
2147483563	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
//if (iseed1<0) iseed1=iseed1+2147483563; 	TokenNameCOMMENT_LINE	if (iseed1<0) iseed1=iseed1+2147483563; 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
iseed2	TokenNameIdentifier	 iseed2
/	TokenNameDIVIDE	
52774	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iseed2	TokenNameIdentifier	 iseed2
=	TokenNameEQUAL	
40692	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
iseed2	TokenNameIdentifier	 iseed2
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
52774	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
3791	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iseed2	TokenNameIdentifier	 iseed2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iseed2	TokenNameIdentifier	 iseed2
+=	TokenNamePLUS_EQUAL	
2147483399	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
//if (iseed2<0) iseed2=iseed2+2147483399; 	TokenNameCOMMENT_LINE	if (iseed2<0) iseed2=iseed2+2147483399; 
iz	TokenNameIdentifier	 iz
=	TokenNameEQUAL	
iseed1	TokenNameIdentifier	 iseed1
-	TokenNameMINUS	
iseed2	TokenNameIdentifier	 iseed2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iz	TokenNameIdentifier	 iz
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iz	TokenNameIdentifier	 iz
+=	TokenNamePLUS_EQUAL	
2147483562	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
//if(iz<1) iz=iz+2147483562; 	TokenNameCOMMENT_LINE	if(iz<1) iz=iz+2147483562; 
return	TokenNamereturn	
(	TokenNameLPAREN	
iz	TokenNameIdentifier	 iz
*	TokenNameMULTIPLY	
4.656613e-10	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*= * This is an inline version that returns an array of doubles for speed. */	TokenNameCOMMENT_BLOCK	= This is an inline version that returns an array of doubles for speed. 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
raw	TokenNameIdentifier	 raw
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
iz	TokenNameIdentifier	 iz
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
iseed1	TokenNameIdentifier	 iseed1
/	TokenNameDIVIDE	
53688	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iseed1	TokenNameIdentifier	 iseed1
=	TokenNameEQUAL	
40014	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
iseed1	TokenNameIdentifier	 iseed1
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
53668	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
12211	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iseed1	TokenNameIdentifier	 iseed1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iseed1	TokenNameIdentifier	 iseed1
+=	TokenNamePLUS_EQUAL	
2147483563	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
//if (iseed1<0) iseed1=iseed1+2147483563; 	TokenNameCOMMENT_LINE	if (iseed1<0) iseed1=iseed1+2147483563; 
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
iseed2	TokenNameIdentifier	 iseed2
/	TokenNameDIVIDE	
52774	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iseed2	TokenNameIdentifier	 iseed2
=	TokenNameEQUAL	
40692	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
iseed2	TokenNameIdentifier	 iseed2
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
52774	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
*	TokenNameMULTIPLY	
3791	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iseed2	TokenNameIdentifier	 iseed2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iseed2	TokenNameIdentifier	 iseed2
+=	TokenNamePLUS_EQUAL	
2147483399	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
//if (iseed2<0) iseed2=iseed2+2147483399; 	TokenNameCOMMENT_LINE	if (iseed2<0) iseed2=iseed2+2147483399; 
iz	TokenNameIdentifier	 iz
=	TokenNameEQUAL	
iseed1	TokenNameIdentifier	 iseed1
-	TokenNameMINUS	
iseed2	TokenNameIdentifier	 iseed2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iz	TokenNameIdentifier	 iz
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
iz	TokenNameIdentifier	 iz
+=	TokenNamePLUS_EQUAL	
2147483562	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// _WH_ 	TokenNameCOMMENT_LINE	_WH_ 
//if(iz<1) iz=iz+2147483562; 	TokenNameCOMMENT_LINE	if(iz<1) iz=iz+2147483562; 
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iz	TokenNameIdentifier	 iz
*	TokenNameMULTIPLY	
4.656613e-10	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

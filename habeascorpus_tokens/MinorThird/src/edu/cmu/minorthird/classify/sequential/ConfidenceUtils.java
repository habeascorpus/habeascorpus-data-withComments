package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
sequential	TokenNameIdentifier	 sequential
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A hack for computing approximate confidences over a sequence. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A hack for computing approximate confidences over a sequence. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ConfidenceUtils	TokenNameIdentifier	 Confidence Utils
{	TokenNameLBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
double	TokenNamedouble	
sumPredictedWeights	TokenNameIdentifier	 sum Predicted Weights
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
predictedClasses	TokenNameIdentifier	 predicted Classes
,	TokenNameCOMMA	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
conf	TokenNameIdentifier	 conf
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
conf	TokenNameIdentifier	 conf
+=	TokenNamePLUS_EQUAL	
predictedClasses	TokenNameIdentifier	 predicted Classes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestWeight	TokenNameIdentifier	 best Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
conf	TokenNameIdentifier	 conf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

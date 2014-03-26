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
public	TokenNamepublic	
class	TokenNameclass	
HMMAlgo	TokenNameIdentifier	 HMM Algo
{	TokenNameLBRACE	
HMM	TokenNameIdentifier	 HMM
hmm	TokenNameIdentifier	 hmm
;	TokenNameSEMICOLON	
// the hidden Markov model 	TokenNameCOMMENT_LINE	the hidden Markov model 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
// the observed sequence of emissions 	TokenNameCOMMENT_LINE	the observed sequence of emissions 
public	TokenNamepublic	
HMMAlgo	TokenNameIdentifier	 HMM Algo
(	TokenNameLPAREN	
HMM	TokenNameIdentifier	 HMM
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hmm	TokenNameIdentifier	 hmm
=	TokenNameEQUAL	
hmm	TokenNameIdentifier	 hmm
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compute log(p+q) from plog = log p and qlog = log q, using that 	TokenNameCOMMENT_LINE	Compute log(p+q) from plog = log p and qlog = log q, using that 
// log (p + q) = log (p(1 + q/p)) = log p + log(1 + q/p) 	TokenNameCOMMENT_LINE	log (p + q) = log (p(1 + q/p)) = log p + log(1 + q/p) 
// = log p + log(1 + exp(log q - log p)) = plog + log(1 + exp(logq - logp)) 	TokenNameCOMMENT_LINE	= log p + log(1 + exp(log q - log p)) = plog + log(1 + exp(logq - logp)) 
// and that log(1 + exp(d)) < 1E-17 for d < -37. 	TokenNameCOMMENT_LINE	and that log(1 + exp(d)) < 1E-17 for d < -37. 
static	TokenNamestatic	
double	TokenNamedouble	
logplus	TokenNameIdentifier	 logplus
(	TokenNameLPAREN	
double	TokenNamedouble	
plog	TokenNameIdentifier	 plog
,	TokenNameCOMMA	
double	TokenNamedouble	
qlog	TokenNameIdentifier	 qlog
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
plog	TokenNameIdentifier	 plog
>	TokenNameGREATER	
qlog	TokenNameIdentifier	 qlog
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qlog	TokenNameIdentifier	 qlog
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
return	TokenNamereturn	
plog	TokenNameIdentifier	 plog
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
plog	TokenNameIdentifier	 plog
;	TokenNameSEMICOLON	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
qlog	TokenNameIdentifier	 qlog
-	TokenNameMINUS	
plog	TokenNameIdentifier	 plog
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
plog	TokenNameIdentifier	 plog
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
return	TokenNamereturn	
qlog	TokenNameIdentifier	 qlog
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
qlog	TokenNameIdentifier	 qlog
;	TokenNameSEMICOLON	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
plog	TokenNameIdentifier	 plog
-	TokenNameMINUS	
qlog	TokenNameIdentifier	 qlog
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now diff <= 0 so Math.exp(diff) will not overflow 	TokenNameCOMMENT_LINE	Now diff <= 0 so Math.exp(diff) will not overflow 
return	TokenNamereturn	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
-	TokenNameMINUS	
37	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

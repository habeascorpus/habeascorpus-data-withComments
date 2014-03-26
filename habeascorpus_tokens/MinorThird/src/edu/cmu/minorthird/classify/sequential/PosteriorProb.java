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
// Compute posterior probabilities using Forward and Backward 	TokenNameCOMMENT_LINE	Compute posterior probabilities using Forward and Backward 
public	TokenNamepublic	
class	TokenNameclass	
PosteriorProb	TokenNameIdentifier	 Posterior Prob
{	TokenNameLBRACE	
Forward	TokenNameIdentifier	 Forward
fwd	TokenNameIdentifier	 fwd
;	TokenNameSEMICOLON	
// result of the forward algorithm 	TokenNameCOMMENT_LINE	result of the forward algorithm 
Backward	TokenNameIdentifier	 Backward
bwd	TokenNameIdentifier	 bwd
;	TokenNameSEMICOLON	
// result of the backward algorithm 	TokenNameCOMMENT_LINE	result of the backward algorithm 
private	TokenNameprivate	
double	TokenNamedouble	
logprob	TokenNameIdentifier	 logprob
;	TokenNameSEMICOLON	
PosteriorProb	TokenNameIdentifier	 Posterior Prob
(	TokenNameLPAREN	
Forward	TokenNameIdentifier	 Forward
fwd	TokenNameIdentifier	 fwd
,	TokenNameCOMMA	
Backward	TokenNameIdentifier	 Backward
bwd	TokenNameIdentifier	 bwd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fwd	TokenNameIdentifier	 fwd
=	TokenNameEQUAL	
fwd	TokenNameIdentifier	 fwd
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bwd	TokenNameIdentifier	 bwd
=	TokenNameEQUAL	
bwd	TokenNameIdentifier	 bwd
;	TokenNameSEMICOLON	
logprob	TokenNameIdentifier	 logprob
=	TokenNameEQUAL	
fwd	TokenNameIdentifier	 fwd
.	TokenNameDOT	
logprob	TokenNameIdentifier	 logprob
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// should equal bwd.logprob() 	TokenNameCOMMENT_LINE	should equal bwd.logprob() 
}	TokenNameRBRACE	
double	TokenNamedouble	
posterior	TokenNameIdentifier	 posterior
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
// i=index into the seq; k=the HMM state 	TokenNameCOMMENT_LINE	i=index into the seq; k=the HMM state 
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
fwd	TokenNameIdentifier	 fwd
.	TokenNameDOT	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
bwd	TokenNameIdentifier	 bwd
.	TokenNameDOT	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
-	TokenNameMINUS	
logprob	TokenNameIdentifier	 logprob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

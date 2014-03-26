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
// The `Forward algorithm': find the probability of an observed sequence x 	TokenNameCOMMENT_LINE	The `Forward algorithm': find the probability of an observed sequence x 
public	TokenNamepublic	
class	TokenNameclass	
Forward	TokenNameIdentifier	 Forward
extends	TokenNameextends	
HMMAlgo	TokenNameIdentifier	 HMM Algo
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
// the matrix used to find the decoding 	TokenNameCOMMENT_LINE	the matrix used to find the decoding 
// f[i][k] = f_k(i) = log(P(x1..xi, pi_i=k)) 	TokenNameCOMMENT_LINE	f[i][k] = f_k(i) = log(P(x1..xi, pi_i=k)) 
private	TokenNameprivate	
int	TokenNameint	
L	TokenNameIdentifier	 L
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Forward	TokenNameIdentifier	 Forward
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
super	TokenNamesuper	
(	TokenNameLPAREN	
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
L	TokenNameIdentifier	 L
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// = log(1) 	TokenNameCOMMENT_LINE	= log(1) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
// = log(0) 	TokenNameCOMMENT_LINE	= log(0) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
L	TokenNameIdentifier	 L
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
// = log(0) 	TokenNameCOMMENT_LINE	= log(0) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
L	TokenNameIdentifier	 L
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ell	TokenNameIdentifier	 ell
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
<	TokenNameLESS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
// = log(0) 	TokenNameCOMMENT_LINE	= log(0) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
logplus	TokenNameIdentifier	 logplus
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
+	TokenNamePLUS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loge	TokenNameIdentifier	 loge
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
logprob	TokenNameIdentifier	 logprob
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
// = log(0) 	TokenNameCOMMENT_LINE	= log(0) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
logplus	TokenNameIdentifier	 logplus
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
L	TokenNameIdentifier	 L
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*public void print(Output out) { for (int j=0; j<hmm.nstate; j++) { for (int i=0; i<f.length; i++) out.print(HMM.fmtlog(f[i][j])); out.println(); } }*/	TokenNameCOMMENT_BLOCK	public void print(Output out) { for (int j=0; j<hmm.nstate; j++) { for (int i=0; i<f.length; i++) out.print(HMM.fmtlog(f[i][j])); out.println(); } }
}	TokenNameRBRACE	

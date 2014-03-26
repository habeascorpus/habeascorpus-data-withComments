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
// The `Backward algorithm': find the probability of an observed sequence x 	TokenNameCOMMENT_LINE	The `Backward algorithm': find the probability of an observed sequence x 
public	TokenNamepublic	
class	TokenNameclass	
Backward	TokenNameIdentifier	 Backward
extends	TokenNameextends	
HMMAlgo	TokenNameIdentifier	 HMM Algo
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
// the matrix used to find the decoding 	TokenNameCOMMENT_LINE	the matrix used to find the decoding 
// b[i][k] = b_k(i) = log(P(x(i+1)..xL, pi_i=k)) 	TokenNameCOMMENT_LINE	b[i][k] = b_k(i) = log(P(x(i+1)..xL, pi_i=k)) 
public	TokenNamepublic	
Backward	TokenNameIdentifier	 Backward
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
int	TokenNameint	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
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
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
L	TokenNameIdentifier	 L
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// = log(1) // should be hmm.loga[k][0] 	TokenNameCOMMENT_LINE	= log(1) // should be hmm.loga[k][0] 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
L	TokenNameIdentifier	 L
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
logplus	TokenNameIdentifier	 logplus
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
,	TokenNameCOMMA	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
+	TokenNamePLUS	
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
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
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
ell	TokenNameIdentifier	 ell
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
logplus	TokenNameIdentifier	 logplus
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
,	TokenNameCOMMA	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
+	TokenNamePLUS	
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
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*public void print(Output out) { for (int j=0; j<hmm.nstate; j++) { for (int i=0; i<b.length; i++) out.print(HMM.fmtlog(b[i][j])); out.println(); } }*/	TokenNameCOMMENT_BLOCK	public void print(Output out) { for (int j=0; j<hmm.nstate; j++) { for (int i=0; i<b.length; i++) out.print(HMM.fmtlog(b[i][j])); out.println(); } }
}	TokenNameRBRACE	

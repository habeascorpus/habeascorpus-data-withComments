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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
// The Viterbi algorithm: find the most probable state path producing 	TokenNameCOMMENT_LINE	The Viterbi algorithm: find the most probable state path producing 
// the observed outputs x 	TokenNameCOMMENT_LINE	the observed outputs x 
public	TokenNamepublic	
class	TokenNameclass	
Viterbi	TokenNameIdentifier	 Viterbi
extends	TokenNameextends	
HMMAlgo	TokenNameIdentifier	 HMM Algo
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
// the matrix used to find the decoding 	TokenNameCOMMENT_LINE	the matrix used to find the decoding 
// v[i][k] = v_k(i) = 	TokenNameCOMMENT_LINE	v[i][k] = v_k(i) = 
// log(max(P(pi in state k has sym i | path pi))) 	TokenNameCOMMENT_LINE	log(max(P(pi in state k has sym i | path pi))) 
Traceback2	TokenNameIdentifier	 Traceback2
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
B	TokenNameIdentifier	 B
;	TokenNameSEMICOLON	
// the traceback matrix 	TokenNameCOMMENT_LINE	the traceback matrix 
Traceback2	TokenNameIdentifier	 Traceback2
B0	TokenNameIdentifier	 B0
;	TokenNameSEMICOLON	
// the start of the traceback 	TokenNameCOMMENT_LINE	the start of the traceback 
public	TokenNamepublic	
Viterbi	TokenNameIdentifier	 Viterbi
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
final	TokenNamefinal	
int	TokenNameint	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
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
B	TokenNameIdentifier	 B
=	TokenNameEQUAL	
new	TokenNamenew	
Traceback2	TokenNameIdentifier	 Traceback2
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
v	TokenNameIdentifier	 v
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
v	TokenNameIdentifier	 v
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
v	TokenNameIdentifier	 v
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
{	TokenNameLBRACE	
int	TokenNameint	
kmax	TokenNameIdentifier	 kmax
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxprod	TokenNameIdentifier	 maxprod
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
kmax	TokenNameIdentifier	 kmax
]	TokenNameRBRACKET	
+	TokenNamePLUS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
kmax	TokenNameIdentifier	 kmax
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
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
{	TokenNameLBRACE	
double	TokenNamedouble	
prod	TokenNameIdentifier	 prod
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
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
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prod	TokenNameIdentifier	 prod
>	TokenNameGREATER	
maxprod	TokenNameIdentifier	 maxprod
)	TokenNameRPAREN	
{	TokenNameLBRACE	
kmax	TokenNameIdentifier	 kmax
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
maxprod	TokenNameIdentifier	 maxprod
=	TokenNameEQUAL	
prod	TokenNameIdentifier	 prod
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("x[i-1] is "+x[i-1]); 	TokenNameCOMMENT_LINE	System.out.println("x[i-1] is "+x[i-1]); 
// System.out.println(" and Integer.parseInt(x[i-1]) is "+Integer.parseInt(x[i-1])); 	TokenNameCOMMENT_LINE	System.out.println(" and Integer.parseInt(x[i-1]) is "+Integer.parseInt(x[i-1])); 
v	TokenNameIdentifier	 v
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
maxprod	TokenNameIdentifier	 maxprod
;	TokenNameSEMICOLON	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Traceback2	TokenNameIdentifier	 Traceback2
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
kmax	TokenNameIdentifier	 kmax
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
kmax	TokenNameIdentifier	 kmax
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
L	TokenNameIdentifier	 L
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
kmax	TokenNameIdentifier	 kmax
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
L	TokenNameIdentifier	 L
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
kmax	TokenNameIdentifier	 kmax
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
L	TokenNameIdentifier	 L
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
B0	TokenNameIdentifier	 B0
=	TokenNameEQUAL	
new	TokenNamenew	
Traceback2	TokenNameIdentifier	 Traceback2
(	TokenNameLPAREN	
L	TokenNameIdentifier	 L
,	TokenNameCOMMA	
kmax	TokenNameIdentifier	 kmax
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
StringBuffer	TokenNameIdentifier	 String Buffer
>	TokenNameGREATER	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
StringBuffer	TokenNameIdentifier	 String Buffer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Traceback2	TokenNameIdentifier	 Traceback2
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
B0	TokenNameIdentifier	 B0
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tb	TokenNameIdentifier	 tb
=	TokenNameEQUAL	
B	TokenNameIdentifier	 B
[	TokenNameLBRACKET	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
tt	TokenNameIdentifier	 tt
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
state	TokenNameIdentifier	 state
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
tb	TokenNameIdentifier	 tb
.	TokenNameDOT	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("i is "+i+ " and p.size() is "+p.size()+" and p.get is "+p.get(i)); 	TokenNameCOMMENT_LINE	System.out.println("i is "+i+ " and p.size() is "+p.size()+" and p.get is "+p.get(i)); 
// y[i] = ""+p.get(i); 	TokenNameCOMMENT_LINE	y[i] = ""+p.get(i); 
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"y["	TokenNameStringLiteral	y[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"] is now "	TokenNameStringLiteral	] is now 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*public void print(Output out) { for (int j=0; j<hmm.nstate; j++) { for (int i=0; i<v.length; i++) out.print(HMM.fmtlog(v[i][j])); out.println(); } }*/	TokenNameCOMMENT_BLOCK	public void print(Output out) { for (int j=0; j<hmm.nstate; j++) { for (int i=0; i<v.length; i++) out.print(HMM.fmtlog(v[i][j])); out.println(); } }
}	TokenNameRBRACE	

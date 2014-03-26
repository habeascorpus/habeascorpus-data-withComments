// Some algorithms for Hidden Markov Models (Chapter 3): Viterbi, 	TokenNameCOMMENT_LINE	Some algorithms for Hidden Markov Models (Chapter 3): Viterbi, 
// Forward, Backward, Baum-Welch. We compute with log probabilities. 	TokenNameCOMMENT_LINE	Forward, Backward, Baum-Welch. We compute with log probabilities. 
// Notational conventions: 	TokenNameCOMMENT_LINE	Notational conventions: 
// i = 1,...,L indexes x, the observed string, x_0 not a symbol 	TokenNameCOMMENT_LINE	i = 1,...,L indexes x, the observed string, x_0 not a symbol 
// k,ell = 0,...,hmm.nstate-1 indexes hmm.state(k) a_0 is the start state 	TokenNameCOMMENT_LINE	k,ell = 0,...,hmm.nstate-1 indexes hmm.state(k) a_0 is the start state 
//Zhenzhen Kou 	TokenNameCOMMENT_LINE	Zhenzhen Kou 
// Notational conventions: 	TokenNameCOMMENT_LINE	Notational conventions: 
// i = 1,...,L indexes x, the observed string, x_0 not a symbol 	TokenNameCOMMENT_LINE	i = 1,...,L indexes x, the observed string, x_0 not a symbol 
// k,ell = 0,...,hmm.nstate-1 indexes hmm.state(k) a_0 is the start state 	TokenNameCOMMENT_LINE	k,ell = 0,...,hmm.nstate-1 indexes hmm.state(k) a_0 is the start state 
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
// Some algorithms for Hidden Markov Models (Chapter 3): Viterbi, 	TokenNameCOMMENT_LINE	Some algorithms for Hidden Markov Models (Chapter 3): Viterbi, 
// Forward, Backward, Baum-Welch. We compute with log probabilities. 	TokenNameCOMMENT_LINE	Forward, Backward, Baum-Welch. We compute with log probabilities. 
public	TokenNamepublic	
class	TokenNameclass	
HMM	TokenNameIdentifier	 HMM
{	TokenNameLBRACE	
// State names and state-to-state transition probabilities 	TokenNameCOMMENT_LINE	State names and state-to-state transition probabilities 
int	TokenNameint	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
// number of states (incl initial state) 	TokenNameCOMMENT_LINE	number of states (incl initial state) 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
// names of the states 	TokenNameCOMMENT_LINE	names of the states 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
amat	TokenNameIdentifier	 amat
;	TokenNameSEMICOLON	
// transition matrix 	TokenNameCOMMENT_LINE	transition matrix 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
loga	TokenNameIdentifier	 loga
;	TokenNameSEMICOLON	
// loga[k][ell] = log(P(k -> ell)) 	TokenNameCOMMENT_LINE	loga[k][ell] = log(P(k -> ell)) 
// Emission names and emission probabilities 	TokenNameCOMMENT_LINE	Emission names and emission probabilities 
int	TokenNameint	
nesym	TokenNameIdentifier	 nesym
;	TokenNameSEMICOLON	
// number of emission symbols 	TokenNameCOMMENT_LINE	number of emission symbols 
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
esym	TokenNameIdentifier	 esym
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the emission symbols e1,...,eL (characters) 	TokenNameCOMMENT_LINE	the emission symbols e1,...,eL (characters) 
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
esym_idx2tok	TokenNameIdentifier	 esym idx2tok
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
emat	TokenNameIdentifier	 emat
;	TokenNameSEMICOLON	
// emision matrix 	TokenNameCOMMENT_LINE	emision matrix 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
loge	TokenNameIdentifier	 loge
;	TokenNameSEMICOLON	
// loge[k][ei] = log(P(emit ei in state k)) 	TokenNameCOMMENT_LINE	loge[k][ei] = log(P(emit ei in state k)) 
// Input: 	TokenNameCOMMENT_LINE	Input: 
// state = array of state names (except initial state) 	TokenNameCOMMENT_LINE	state = array of state names (except initial state) 
// amat = matrix of transition probabilities (except initial state) 	TokenNameCOMMENT_LINE	amat = matrix of transition probabilities (except initial state) 
// esym = string of emission names 	TokenNameCOMMENT_LINE	esym = string of emission names 
// emat = matrix of emission probabilities 	TokenNameCOMMENT_LINE	emat = matrix of emission probabilities 
public	TokenNamepublic	
HMM	TokenNameIdentifier	 HMM
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
amat	TokenNameIdentifier	 amat
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
esym	TokenNameIdentifier	 esym
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
emat	TokenNameIdentifier	 emat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
amat	TokenNameIdentifier	 amat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HMM: state and amat disagree"	TokenNameStringLiteral	HMM: state and amat disagree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
amat	TokenNameIdentifier	 amat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
emat	TokenNameIdentifier	 emat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HMM: amat and emat disagree"	TokenNameStringLiteral	HMM: amat and emat disagree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
amat	TokenNameIdentifier	 amat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
amat	TokenNameIdentifier	 amat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HMM: amat non-square"	TokenNameStringLiteral	HMM: amat non-square
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
esym	TokenNameIdentifier	 esym
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
emat	TokenNameIdentifier	 emat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"HMM: esym and emat disagree"	TokenNameStringLiteral	HMM: esym and emat disagree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set up the transition matrix 	TokenNameCOMMENT_LINE	Set up the transition matrix 
nstate	TokenNameIdentifier	 nstate
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
loga	TokenNameIdentifier	 loga
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
state	TokenNameIdentifier	 state
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"S"	TokenNameStringLiteral	S
;	TokenNameSEMICOLON	
// initial state 	TokenNameCOMMENT_LINE	initial state 
// P(start -> start) = 0 	TokenNameCOMMENT_LINE	P(start -> start) = 0 
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
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
// P(start -> other) = 1.0/state.length 	TokenNameCOMMENT_LINE	P(start -> other) = 1.0/state.length 
double	TokenNamedouble	
fromstart	TokenNameIdentifier	 fromstart
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fromstart	TokenNameIdentifier	 fromstart
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reverse state names for efficient backwards concatenation 	TokenNameCOMMENT_LINE	Reverse state names for efficient backwards concatenation 
this	TokenNamethis	
.	TokenNameDOT	
state	TokenNameIdentifier	 state
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("state["+i+"] is "+this.state[i]); 	TokenNameCOMMENT_LINE	System.out.println("state["+i+"] is "+this.state[i]); 
// P(other -> start) = 0 	TokenNameCOMMENT_LINE	P(other -> start) = 0 
loga	TokenNameIdentifier	 loga
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
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
amat	TokenNameIdentifier	 amat
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
esym	TokenNameIdentifier	 esym
=	TokenNameEQUAL	
esym	TokenNameIdentifier	 esym
;	TokenNameSEMICOLON	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
esym_idx2tok	TokenNameIdentifier	 esym idx2tok
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
e_keys	TokenNameIdentifier	 e keys
=	TokenNameEQUAL	
esym	TokenNameIdentifier	 esym
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e_keys	TokenNameIdentifier	 e keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e_keys	TokenNameIdentifier	 e keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
esym_idx2tok	TokenNameIdentifier	 esym idx2tok
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
e_keys	TokenNameIdentifier	 e keys
=	TokenNameEQUAL	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e_keys	TokenNameIdentifier	 e keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e_keys	TokenNameIdentifier	 e keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"in esym_tok2idx: "	TokenNameStringLiteral	in esym_tok2idx: 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
"<--->"	TokenNameStringLiteral	<--->
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set up the emission matrix 	TokenNameCOMMENT_LINE	Set up the emission matrix 
nesym	TokenNameIdentifier	 nesym
=	TokenNameEQUAL	
esym	TokenNameIdentifier	 esym
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loge	TokenNameIdentifier	 loge
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nesym	TokenNameIdentifier	 nesym
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
nesym	TokenNameIdentifier	 nesym
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loge	TokenNameIdentifier	 loge
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
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
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
emat	TokenNameIdentifier	 emat
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
loge	TokenNameIdentifier	 loge
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
emat	TokenNameIdentifier	 emat
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*public void print(Output out) { printa(out); printe(out); } public void printa(Output out) { out.println("Transition probabilities:"); for (int i=1; i<nstate; i++) { for (int j=1; j<nstate; j++) out.print(fmtlog(loga[i][j])); out.println(); } }*/	TokenNameCOMMENT_BLOCK	public void print(Output out) { printa(out); printe(out); } public void printa(Output out) { out.println("Transition probabilities:"); for (int i=1; i<nstate; i++) { for (int j=1; j<nstate; j++) out.print(fmtlog(loga[i][j])); out.println(); } }
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convert_Ob_seq	TokenNameIdentifier	 convert  Ob seq
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
esym_tok2idx	TokenNameIdentifier	 esym tok2idx
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"UNSEEN"	TokenNameStringLiteral	UNSEEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"string "	TokenNameStringLiteral	string 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" corresponds to state idx "	TokenNameStringLiteral	 corresponds to state idx 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*public void printe(Output out) { out.println("Emission probabilities:"); for (int b=0; b<esym_idx2tok.size(); b++) out.print((String)esym_idx2tok.get(String.valueOf(b)) + hdrpad); out.println(); for (int i=1; i<loge.length; i++) { for (int b=0; b<nesym; b++) out.print(fmtlog(loge[i][b])); out.println(); } }*/	TokenNameCOMMENT_BLOCK	public void printe(Output out) { out.println("Emission probabilities:"); for (int b=0; b<esym_idx2tok.size(); b++) out.print((String)esym_idx2tok.get(String.valueOf(b)) + hdrpad); out.println(); for (int i=1; i<loge.length; i++) { for (int b=0; b<nesym; b++) out.print(fmtlog(loge[i][b])); out.println(); } }
private	TokenNameprivate	
static	TokenNamestatic	
DecimalFormat	TokenNameIdentifier	 Decimal Format
fmt	TokenNameIdentifier	 fmt
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.000000 "	TokenNameStringLiteral	0.000000 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private static String hdrpad = " "; 	TokenNameCOMMENT_LINE	private static String hdrpad = " "; 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fmtlog	TokenNameIdentifier	 fmtlog
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
return	TokenNamereturn	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The Baum-Welch algorithm for estimating HMM parameters for a 	TokenNameCOMMENT_LINE	The Baum-Welch algorithm for estimating HMM parameters for a 
// given model topology and a family of observed sequences. 	TokenNameCOMMENT_LINE	given model topology and a family of observed sequences. 
// Often gets stuck at a non-global minimum; depends on initial guess. 	TokenNameCOMMENT_LINE	Often gets stuck at a non-global minimum; depends on initial guess. 
// xs is the set of training sequences, here one training sequence is the sequence of index reprensenting tokens 	TokenNameCOMMENT_LINE	xs is the set of training sequences, here one training sequence is the sequence of index reprensenting tokens 
// state is the set of HMM state names 	TokenNameCOMMENT_LINE	state is the set of HMM state names 
// esym is the set of emissible symbols 	TokenNameCOMMENT_LINE	esym is the set of emissible symbols 
public	TokenNamepublic	
static	TokenNamestatic	
HMM	TokenNameIdentifier	 HMM
baumwelch	TokenNameIdentifier	 baumwelch
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
xs	TokenNameIdentifier	 xs
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
esym	TokenNameIdentifier	 esym
,	TokenNameCOMMA	
final	TokenNamefinal	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nstate	TokenNameIdentifier	 nstate
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
nseqs	TokenNameIdentifier	 nseqs
=	TokenNameEQUAL	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nesym	TokenNameIdentifier	 nesym
=	TokenNameEQUAL	
esym	TokenNameIdentifier	 esym
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Forward	TokenNameIdentifier	 Forward
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fwds	TokenNameIdentifier	 fwds
=	TokenNameEQUAL	
new	TokenNamenew	
Forward	TokenNameIdentifier	 Forward
[	TokenNameLBRACKET	
nseqs	TokenNameIdentifier	 nseqs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Backward	TokenNameIdentifier	 Backward
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bwds	TokenNameIdentifier	 bwds
=	TokenNameEQUAL	
new	TokenNamenew	
Backward	TokenNameIdentifier	 Backward
[	TokenNameLBRACKET	
nseqs	TokenNameIdentifier	 nseqs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logP	TokenNameIdentifier	 log P
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nseqs	TokenNameIdentifier	 nseqs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
amat	TokenNameIdentifier	 amat
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
emat	TokenNameIdentifier	 emat
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Initially use random transition and emission matrices 	TokenNameCOMMENT_LINE	Initially use random transition and emission matrices 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
amat	TokenNameIdentifier	 amat
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
randomdiscrete	TokenNameIdentifier	 randomdiscrete
(	TokenNameLPAREN	
nstate	TokenNameIdentifier	 nstate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
emat	TokenNameIdentifier	 emat
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
randomdiscrete	TokenNameIdentifier	 randomdiscrete
(	TokenNameLPAREN	
nesym	TokenNameIdentifier	 nesym
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
HMM	TokenNameIdentifier	 HMM
hmm	TokenNameIdentifier	 hmm
=	TokenNameEQUAL	
new	TokenNamenew	
HMM	TokenNameIdentifier	 HMM
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
amat	TokenNameIdentifier	 amat
,	TokenNameCOMMA	
esym	TokenNameIdentifier	 esym
,	TokenNameCOMMA	
emat	TokenNameIdentifier	 emat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
oldloglikelihood	TokenNameIdentifier	 oldloglikelihood
;	TokenNameSEMICOLON	
// Compute Forward and Backward tables for the sequences 	TokenNameCOMMENT_LINE	Compute Forward and Backward tables for the sequences 
double	TokenNamedouble	
loglikelihood	TokenNameIdentifier	 loglikelihood
=	TokenNameEQUAL	
fwdbwd	TokenNameIdentifier	 fwdbwd
(	TokenNameLPAREN	
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
xs	TokenNameIdentifier	 xs
,	TokenNameCOMMA	
fwds	TokenNameIdentifier	 fwds
,	TokenNameCOMMA	
bwds	TokenNameIdentifier	 bwds
,	TokenNameCOMMA	
logP	TokenNameIdentifier	 log P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"log likelihood = "	TokenNameStringLiteral	log likelihood = 
+	TokenNamePLUS	
loglikelihood	TokenNameIdentifier	 loglikelihood
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hmm.print(new SystemOut()); 	TokenNameCOMMENT_LINE	hmm.print(new SystemOut()); 
do	TokenNamedo	
{	TokenNameLBRACE	
oldloglikelihood	TokenNameIdentifier	 oldloglikelihood
=	TokenNameEQUAL	
loglikelihood	TokenNameIdentifier	 loglikelihood
;	TokenNameSEMICOLON	
// Compute estimates for A and E 	TokenNameCOMMENT_LINE	Compute estimates for A and E 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
E	TokenNameIdentifier	 E
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
nstate	TokenNameIdentifier	 nstate
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nesym	TokenNameIdentifier	 nesym
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
nseqs	TokenNameIdentifier	 nseqs
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Forward	TokenNameIdentifier	 Forward
fwd	TokenNameIdentifier	 fwd
=	TokenNameEQUAL	
fwds	TokenNameIdentifier	 fwds
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Backward	TokenNameIdentifier	 Backward
bwd	TokenNameIdentifier	 bwd
=	TokenNameEQUAL	
bwds	TokenNameIdentifier	 bwds
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
L	TokenNameIdentifier	 L
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
P	TokenNameIdentifier	 P
=	TokenNameEQUAL	
logP	TokenNameIdentifier	 log P
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// NOT exp. Fixed 2001-08-20 	TokenNameCOMMENT_LINE	NOT exp. Fixed 2001-08-20 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
L	TokenNameIdentifier	 L
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
E	TokenNameIdentifier	 E
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
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
+=	TokenNamePLUS_EQUAL	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
fwd	TokenNameIdentifier	 fwd
.	TokenNameDOT	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
bwd	TokenNameIdentifier	 bwd
.	TokenNameDOT	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
P	TokenNameIdentifier	 P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
L	TokenNameIdentifier	 L
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
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
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
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
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
fwd	TokenNameIdentifier	 fwd
.	TokenNameDOT	
f	TokenNameIdentifier	 f
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loga	TokenNameIdentifier	 loga
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
loge	TokenNameIdentifier	 loge
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
bwd	TokenNameIdentifier	 bwd
.	TokenNameDOT	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
P	TokenNameIdentifier	 P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Estimate new model parameters, i.e. normalize 	TokenNameCOMMENT_LINE	Estimate new model parameters, i.e. normalize 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
Aksum	TokenNameIdentifier	 Aksum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ell	TokenNameIdentifier	 ell
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
Aksum	TokenNameIdentifier	 Aksum
+=	TokenNamePLUS_EQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ell	TokenNameIdentifier	 ell
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
<	TokenNameLESS	
nstate	TokenNameIdentifier	 nstate
;	TokenNameSEMICOLON	
ell	TokenNameIdentifier	 ell
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
amat	TokenNameIdentifier	 amat
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ell	TokenNameIdentifier	 ell
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
Aksum	TokenNameIdentifier	 Aksum
;	TokenNameSEMICOLON	
double	TokenNamedouble	
Eksum	TokenNameIdentifier	 Eksum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
nesym	TokenNameIdentifier	 nesym
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
Eksum	TokenNameIdentifier	 Eksum
+=	TokenNamePLUS_EQUAL	
E	TokenNameIdentifier	 E
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
nesym	TokenNameIdentifier	 nesym
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
emat	TokenNameIdentifier	 emat
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
E	TokenNameIdentifier	 E
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
b	TokenNameIdentifier	 b
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
Eksum	TokenNameIdentifier	 Eksum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create new model 	TokenNameCOMMENT_LINE	Create new model 
hmm	TokenNameIdentifier	 hmm
=	TokenNameEQUAL	
new	TokenNamenew	
HMM	TokenNameIdentifier	 HMM
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
amat	TokenNameIdentifier	 amat
,	TokenNameCOMMA	
esym	TokenNameIdentifier	 esym
,	TokenNameCOMMA	
emat	TokenNameIdentifier	 emat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loglikelihood	TokenNameIdentifier	 loglikelihood
=	TokenNameEQUAL	
fwdbwd	TokenNameIdentifier	 fwdbwd
(	TokenNameLPAREN	
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
xs	TokenNameIdentifier	 xs
,	TokenNameCOMMA	
fwds	TokenNameIdentifier	 fwds
,	TokenNameCOMMA	
bwds	TokenNameIdentifier	 bwds
,	TokenNameCOMMA	
logP	TokenNameIdentifier	 log P
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"log likelihood = "	TokenNameStringLiteral	log likelihood = 
+	TokenNamePLUS	
loglikelihood	TokenNameIdentifier	 loglikelihood
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hmm.print(new SystemOut()); 	TokenNameCOMMENT_LINE	hmm.print(new SystemOut()); 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
oldloglikelihood	TokenNameIdentifier	 oldloglikelihood
-	TokenNameMINUS	
loglikelihood	TokenNameIdentifier	 loglikelihood
)	TokenNameRPAREN	
>	TokenNameGREATER	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hmm	TokenNameIdentifier	 hmm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
fwdbwd	TokenNameIdentifier	 fwdbwd
(	TokenNameLPAREN	
HMM	TokenNameIdentifier	 HMM
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
xs	TokenNameIdentifier	 xs
,	TokenNameCOMMA	
Forward	TokenNameIdentifier	 Forward
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fwds	TokenNameIdentifier	 fwds
,	TokenNameCOMMA	
Backward	TokenNameIdentifier	 Backward
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bwds	TokenNameIdentifier	 bwds
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logP	TokenNameIdentifier	 log P
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
loglikelihood	TokenNameIdentifier	 loglikelihood
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fwds	TokenNameIdentifier	 fwds
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Forward	TokenNameIdentifier	 Forward
(	TokenNameLPAREN	
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bwds	TokenNameIdentifier	 bwds
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Backward	TokenNameIdentifier	 Backward
(	TokenNameLPAREN	
hmm	TokenNameIdentifier	 hmm
,	TokenNameCOMMA	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logP	TokenNameIdentifier	 log P
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fwds	TokenNameIdentifier	 fwds
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
.	TokenNameDOT	
logprob	TokenNameIdentifier	 logprob
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loglikelihood	TokenNameIdentifier	 loglikelihood
+=	TokenNamePLUS_EQUAL	
logP	TokenNameIdentifier	 log P
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
loglikelihood	TokenNameIdentifier	 loglikelihood
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private static double[] uniformdiscrete(int n) { 	TokenNameCOMMENT_LINE	private static double[] uniformdiscrete(int n) { 
// double[] ps = new double[n]; 	TokenNameCOMMENT_LINE	double[] ps = new double[n]; 
// for (int i=0; i<n; i++) 	TokenNameCOMMENT_LINE	for (int i=0; i<n; i++) 
// ps[i] = 1.0/n; 	TokenNameCOMMENT_LINE	ps[i] = 1.0/n; 
// return ps; 	TokenNameCOMMENT_LINE	return ps; 
// } 	TokenNameCOMMENT_LINE	} 
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
randomdiscrete	TokenNameIdentifier	 randomdiscrete
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Generate random numbers 	TokenNameCOMMENT_LINE	Generate random numbers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
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
ps	TokenNameIdentifier	 ps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
ps	TokenNameIdentifier	 ps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Scale to obtain a discrete probability distribution 	TokenNameCOMMENT_LINE	Scale to obtain a discrete probability distribution 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
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
ps	TokenNameIdentifier	 ps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

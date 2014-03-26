package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
Mixup	TokenNameIdentifier	 Mixup
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
MixupProgram	TokenNameIdentifier	 Mixup Program
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** Some sample inputs to facilitate testing. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Some sample inputs to facilitate testing. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SampleTextBases	TokenNameIdentifier	 Sample Text Bases
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testStrings	TokenNameIdentifier	 test Strings
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Zhone Technologies Acquires NEC eLUMINANT"	TokenNameStringLiteral	Zhone Technologies Acquires NEC eLUMINANT
,	TokenNameCOMMA	
"Reuters to Acquire Multex"	TokenNameStringLiteral	Reuters to Acquire Multex
,	TokenNameCOMMA	
"Tumbleweed and Valicert Announce Merger Agreement"	TokenNameStringLiteral	Tumbleweed and Valicert Announce Merger Agreement
,	TokenNameCOMMA	
"TruSecure Corporation Acquires Vigilinx"	TokenNameStringLiteral	TruSecure Corporation Acquires Vigilinx
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
testProgram	TokenNameIdentifier	 test Program
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"defDict companyWord = Reuters, Multex, TruSecure, Vigilinx "	TokenNameStringLiteral	defDict companyWord = Reuters, Multex, TruSecure, Vigilinx 
,	TokenNameCOMMA	
"defSpanType company =: ... [a(companyWord)] ... "	TokenNameStringLiteral	defSpanType company =: ... [a(companyWord)] ... 
,	TokenNameCOMMA	
"defTokenProp vp:t =: ( ... ['to'? re('^Acquires?') ] ... || ... ['Announce'] ...)"	TokenNameStringLiteral	defTokenProp vp:t =: ( ... ['to'? re('^Acquires?') ] ... || ... ['Announce'] ...)
,	TokenNameCOMMA	
"defSpanType subj =: [!vp:t+] vp:t ..."	TokenNameStringLiteral	defSpanType subj =: [!vp:t+] vp:t ...
,	TokenNameCOMMA	
"defSpanType obj =: !vp:t+ vp:t+ [!vp:t+]"	TokenNameStringLiteral	defSpanType obj =: !vp:t+ vp:t+ [!vp:t+]
,	TokenNameCOMMA	
"defSpanType start =top: ( [any{5}] any+ || [any{,5}])"	TokenNameStringLiteral	defSpanType start =top: ( [any{5}] any+ || [any{,5}])
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
truthLabels	TokenNameIdentifier	 truth Labels
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
guessLabels	TokenNameIdentifier	 guess Labels
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
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
testStrings	TokenNameIdentifier	 test Strings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
"testStrings["	TokenNameStringLiteral	testStrings[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
testStrings	TokenNameIdentifier	 test Strings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
truthLabels	TokenNameIdentifier	 truth Labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MixupProgram	TokenNameIdentifier	 Mixup Program
prog	TokenNameIdentifier	 prog
=	TokenNameEQUAL	
new	TokenNamenew	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
testProgram	TokenNameIdentifier	 test Program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
new	TokenNamenew	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
(	TokenNameLPAREN	
prog	TokenNameIdentifier	 prog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
truthLabels	TokenNameIdentifier	 truth Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
guessLabels	TokenNameIdentifier	 guess Labels
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
truthLabels	TokenNameIdentifier	 truth Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MixupProgram	TokenNameIdentifier	 Mixup Program
guessProg	TokenNameIdentifier	 guess Prog
=	TokenNameEQUAL	
new	TokenNamenew	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"defSpanType guess =: [ any{2} ] ..."	TokenNameStringLiteral	defSpanType guess =: [ any{2} ] ...
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
setProgram	TokenNameIdentifier	 set Program
(	TokenNameLPAREN	
guessProg	TokenNameIdentifier	 guess Prog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
guessLabels	TokenNameIdentifier	 guess Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
TextBase	TokenNameIdentifier	 Text Base
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
getTruthLabels	TokenNameIdentifier	 get Truth Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
truthLabels	TokenNameIdentifier	 truth Labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
getGuessLabels	TokenNameIdentifier	 get Guess Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
guessLabels	TokenNameIdentifier	 guess Labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
showLabels	TokenNameIdentifier	 show Labels
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"labels has "	TokenNameStringLiteral	labels has 
+	TokenNamePLUS	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" types"	TokenNameStringLiteral	 types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

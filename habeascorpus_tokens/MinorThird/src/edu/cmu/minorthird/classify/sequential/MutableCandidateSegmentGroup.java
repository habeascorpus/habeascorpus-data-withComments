/* Copyright 2003-2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003-2004, Carnegie Mellon, All Rights Reserved 
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A group of sliding windows associated with a sequence. * * <p>In more detail: just as a SequenceDataset holds a set of * Example[] objects, a SegmentDataset holds a set of * CandidateSegmentGroup objects. Each CandidateSegmentGroup is * derived from a sequence of source objects s1....sN. The * CandidateSegmentGroup holds an instance for each subsequence of up * to K adjacent source objects (the subsequence is called a * <i>segment</i>, or a <i>sliding window</i>). Here K is the "maxWindowSize", and N * is the "sequenceLength". * *<p>To illustrate, suppose the original sequence is a,b,c,d,e and K=3. * Then the sliding window will hold instances created from these * subsequences: a,b,c,d,e,ab,bc,cd,de,abc,bcd,cde. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A group of sliding windows associated with a sequence. * <p>In more detail: just as a SequenceDataset holds a set of Example[] objects, a SegmentDataset holds a set of CandidateSegmentGroup objects. Each CandidateSegmentGroup is derived from a sequence of source objects s1....sN. The CandidateSegmentGroup holds an instance for each subsequence of up to K adjacent source objects (the subsequence is called a <i>segment</i>, or a <i>sliding window</i>). Here K is the "maxWindowSize", and N is the "sequenceLength". *<p>To illustrate, suppose the original sequence is a,b,c,d,e and K=3. Then the sliding window will hold instances created from these subsequences: a,b,c,d,e,ab,bc,cd,de,abc,bcd,cde. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MutableCandidateSegmentGroup	TokenNameIdentifier	 Mutable Candidate Segment Group
implements	TokenNameimplements	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
maxWindowSize	TokenNameIdentifier	 max Window Size
,	TokenNameCOMMA	
sequenceLength	TokenNameIdentifier	 sequence Length
;	TokenNameSEMICOLON	
// the segment from start to start+L is window[start][L-1]. 	TokenNameCOMMENT_LINE	the segment from start to start+L is window[start][L-1]. 
private	TokenNameprivate	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
window	TokenNameIdentifier	 window
;	TokenNameSEMICOLON	
// parallel to window 	TokenNameCOMMENT_LINE	parallel to window 
private	TokenNameprivate	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
totalSize	TokenNameIdentifier	 total Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
subPopId	TokenNameIdentifier	 sub Pop Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Creates a new holder for sliding-window instances. * @param maxWindowSize the maximum length of any sliding window * @param sequenceLength the length of the original sequence */	TokenNameCOMMENT_JAVADOC	 Creates a new holder for sliding-window instances. @param maxWindowSize the maximum length of any sliding window @param sequenceLength the length of the original sequence 
public	TokenNamepublic	
MutableCandidateSegmentGroup	TokenNameIdentifier	 Mutable Candidate Segment Group
(	TokenNameLPAREN	
int	TokenNameint	
maxWindowSize	TokenNameIdentifier	 max Window Size
,	TokenNameCOMMA	
int	TokenNameint	
sequenceLength	TokenNameIdentifier	 sequence Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sequenceLength	TokenNameIdentifier	 sequence Length
=	TokenNameEQUAL	
sequenceLength	TokenNameIdentifier	 sequence Length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxWindowSize	TokenNameIdentifier	 max Window Size
=	TokenNameEQUAL	
maxWindowSize	TokenNameIdentifier	 max Window Size
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
=	TokenNameEQUAL	
new	TokenNamenew	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
sequenceLength	TokenNameIdentifier	 sequence Length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxWindowSize	TokenNameIdentifier	 max Window Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
sequenceLength	TokenNameIdentifier	 sequence Length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxWindowSize	TokenNameIdentifier	 max Window Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
totalSize	TokenNameIdentifier	 total Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Specify the Instance associated with positions start...end, and associate * the label with that Instance. * @param start starting position of segment in the original * sequence from which newInstance was derived. * @param end ending position, using Java conventions--e.g., start=2 and end=3 is a * segment containing one element, which had index 2 in the original sequence. */	TokenNameCOMMENT_JAVADOC	 Specify the Instance associated with positions start...end, and associate the label with that Instance. @param start starting position of segment in the original sequence from which newInstance was derived. @param end ending position, using Java conventions--e.g., start=2 and end=3 is a segment containing one element, which had index 2 in the original sequence. 
public	TokenNamepublic	
void	TokenNamevoid	
setSubsequence	TokenNameIdentifier	 set Subsequence
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
newInstance	TokenNameIdentifier	 new Instance
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
newLabel	TokenNameIdentifier	 new Label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSubPopId	TokenNameIdentifier	 set Sub Pop Id
(	TokenNameLPAREN	
newInstance	TokenNameIdentifier	 new Instance
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
totalSize	TokenNameIdentifier	 total Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newLabel	TokenNameIdentifier	 new Label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Specify the Instance associated with positions start...end. */	TokenNameCOMMENT_JAVADOC	 Specify the Instance associated with positions start...end. 
public	TokenNamepublic	
void	TokenNamevoid	
setSubsequence	TokenNameIdentifier	 set Subsequence
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
newInstance	TokenNameIdentifier	 new Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSubPopId	TokenNameIdentifier	 set Sub Pop Id
(	TokenNameLPAREN	
newInstance	TokenNameIdentifier	 new Instance
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newInstance	TokenNameIdentifier	 new Instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// helper to check for different subPopId's in instances added to group... 	TokenNameCOMMENT_LINE	helper to check for different subPopId's in instances added to group... 
private	TokenNameprivate	
void	TokenNamevoid	
setSubPopId	TokenNameIdentifier	 set Sub Pop Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newSubpopId	TokenNameIdentifier	 new Subpop Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subPopId	TokenNameIdentifier	 sub Pop Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
subPopId	TokenNameIdentifier	 sub Pop Id
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
newSubpopId	TokenNameIdentifier	 new Subpop Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"grouping instances with different subPopId?"	TokenNameStringLiteral	grouping instances with different subPopId?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subPopId	TokenNameIdentifier	 sub Pop Id
=	TokenNameEQUAL	
newSubpopId	TokenNameIdentifier	 new Subpop Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// implement the rest of the interface... 	TokenNameCOMMENT_LINE	implement the rest of the interface... 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
getSubsequenceExample	TokenNameIdentifier	 get Subsequence Example
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the class label associated with getSubsequenceExample(start,end). */	TokenNameCOMMENT_JAVADOC	 Return the class label associated with getSubsequenceExample(start,end). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
getSubsequenceLabel	TokenNameIdentifier	 get Subsequence Label
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the instance corresponding to the segment from positions start...end. */	TokenNameCOMMENT_JAVADOC	 Return the instance corresponding to the segment from positions start...end. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sequenceLength	TokenNameIdentifier	 sequence Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxWindowSize	TokenNameIdentifier	 max Window Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subPopId	TokenNameIdentifier	 sub Pop Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalSize	TokenNameIdentifier	 total Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
classNameSet	TokenNameIdentifier	 class Name Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
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
label	TokenNameIdentifier	 label
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
possibleLabels	TokenNameIdentifier	 possible Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// debug output 	TokenNameCOMMENT_LINE	debug output 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
window	TokenNameIdentifier	 window
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
maxWindowSize	TokenNameIdentifier	 max Window Size
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
".."	TokenNameStringLiteral	..
+	TokenNamePLUS	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"NULL"	TokenNameStringLiteral	NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
window	TokenNameIdentifier	 window
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

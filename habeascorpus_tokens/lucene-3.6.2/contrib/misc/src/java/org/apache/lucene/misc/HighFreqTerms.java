package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
misc	TokenNameIdentifier	 misc
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermDocs	TokenNameIdentifier	 Term Docs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermEnum	TokenNameIdentifier	 Term Enum
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
FSDirectory	TokenNameIdentifier	 FS Directory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * <code>HighFreqTerms</code> class extracts the top n most frequent terms * (by document frequency ) from an existing Lucene index and reports their * document frequency. If used with the -t flag it also reports their * total tf (total number of occurences) in order of highest total tf */	TokenNameCOMMENT_JAVADOC	 <code>HighFreqTerms</code> class extracts the top n most frequent terms (by document frequency ) from an existing Lucene index and reports their document frequency. If used with the -t flag it also reports their total tf (total number of occurences) in order of highest total tf 
public	TokenNamepublic	
class	TokenNameclass	
HighFreqTerms	TokenNameIdentifier	 High Freq Terms
{	TokenNameLBRACE	
// The top numTerms will be displayed 	TokenNameCOMMENT_LINE	The top numTerms will be displayed 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULTnumTerms	TokenNameIdentifier	 DEFAUL Tnum Terms
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
DEFAULTnumTerms	TokenNameIdentifier	 DEFAUL Tnum Terms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FSDirectory	TokenNameIdentifier	 FS Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
IncludeTermFreqs	TokenNameIdentifier	 Include Term Freqs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
FSDirectory	TokenNameIdentifier	 FS Directory
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-t"	TokenNameStringLiteral	-t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IncludeTermFreqs	TokenNameIdentifier	 Include Term Freqs
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
getHighFreqTerms	TokenNameIdentifier	 get High Freq Terms
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Insert logic so it will only lookup totaltf if right arg * also change names as in flex */	TokenNameCOMMENT_BLOCK	 Insert logic so it will only lookup totaltf if right arg also change names as in flex 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
IncludeTermFreqs	TokenNameIdentifier	 Include Term Freqs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//default HighFreqTerms behavior 	TokenNameCOMMENT_LINE	default HighFreqTerms behavior 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
printf	TokenNameIdentifier	 printf
(	TokenNameLPAREN	
"%s %,d "	TokenNameStringLiteral	%s %,d 
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termsWithTF	TokenNameIdentifier	 terms With TF
=	TokenNameEQUAL	
sortByTotalTermFreq	TokenNameIdentifier	 sort By Total Term Freq
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
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
termsWithTF	TokenNameIdentifier	 terms With TF
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
printf	TokenNameIdentifier	 printf
(	TokenNameLPAREN	
"%s total_tf = %,d doc freq = %,d "	TokenNameStringLiteral	%s total_tf = %,d doc freq = %,d 
,	TokenNameCOMMA	
termsWithTF	TokenNameIdentifier	 terms With TF
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
termsWithTF	TokenNameIdentifier	 terms With TF
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
totalTermFreq	TokenNameIdentifier	 total Term Freq
,	TokenNameCOMMA	
termsWithTF	TokenNameIdentifier	 terms With TF
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"java org.apache.lucene.misc.HighFreqTerms <index dir> [-t] [number_terms] [field] -t: include totalTermFreq "	TokenNameStringLiteral	java org.apache.lucene.misc.HighFreqTerms <index dir> [-t] [number_terms] [field] -t: include totalTermFreq 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @param reader * @param numTerms * @param field * @return TermStats[] ordered by terms with highest docFreq first. * @throws Exception */	TokenNameCOMMENT_JAVADOC	 * @param reader @param numTerms @param field @return TermStats[] ordered by terms with highest docFreq first. @throws Exception 
public	TokenNamepublic	
static	TokenNamestatic	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHighFreqTerms	TokenNameIdentifier	 get High Freq Terms
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TermInfoWiTFQueue	TokenNameIdentifier	 Term Info Wi TF Queue
tiq	TokenNameIdentifier	 tiq
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfoWiTFQueue	TokenNameIdentifier	 Term Info Wi TF Queue
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tiq	TokenNameIdentifier	 tiq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
new	TokenNamenew	
TermStats	TokenNameIdentifier	 Term Stats
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"No terms for field ""	TokenNameStringLiteral	No terms for field "
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tiq	TokenNameIdentifier	 tiq
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
new	TokenNamenew	
TermStats	TokenNameIdentifier	 Term Stats
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
tiq	TokenNameIdentifier	 tiq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// we want highest first so we read the queue and populate the array 	TokenNameCOMMENT_LINE	we want highest first so we read the queue and populate the array 
// starting at the end and work backwards 	TokenNameCOMMENT_LINE	starting at the end and work backwards 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
tiq	TokenNameIdentifier	 tiq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tiq	TokenNameIdentifier	 tiq
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tiq	TokenNameIdentifier	 tiq
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Takes array of TermStats. For each term looks up the tf for each doc * containing the term and stores the total in the output array of TermStats. * Output array is sorted by highest total tf. * * @param reader * @param terms * TermStats[] * @return TermStats[] * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Takes array of TermStats. For each term looks up the tf for each doc containing the term and stores the total in the output array of TermStats. Output array is sorted by highest total tf. * @param reader @param terms TermStats[] @return TermStats[] @throws Exception 
public	TokenNamepublic	
static	TokenNamestatic	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortByTotalTermFreq	TokenNameIdentifier	 sort By Total Term Freq
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
TermStats	TokenNameIdentifier	 Term Stats
[	TokenNameLBRACKET	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// array for sorting 	TokenNameCOMMENT_LINE	array for sorting 
long	TokenNamelong	
totalTF	TokenNameIdentifier	 total TF
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalTF	TokenNameIdentifier	 total TF
=	TokenNameEQUAL	
getTotalTermFreq	TokenNameIdentifier	 get Total Term Freq
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ts	TokenNameIdentifier	 ts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TermStats	TokenNameIdentifier	 Term Stats
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
,	TokenNameCOMMA	
totalTF	TokenNameIdentifier	 total TF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
TermStats	TokenNameIdentifier	 Term Stats
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
TotalTermFreqComparatorSortDescending	TokenNameIdentifier	 Total Term Freq Comparator Sort Descending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
ts	TokenNameIdentifier	 ts
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ts	TokenNameIdentifier	 ts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
getTotalTermFreq	TokenNameIdentifier	 get Total Term Freq
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
long	TokenNamelong	
totalTF	TokenNameIdentifier	 total TF
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalTF	TokenNameIdentifier	 total TF
+=	TokenNamePLUS_EQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
totalTF	TokenNameIdentifier	 total TF
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
class	TokenNameclass	
TermStats	TokenNameIdentifier	 Term Stats
{	TokenNameLBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
totalTermFreq	TokenNameIdentifier	 total Term Freq
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermStats	TokenNameIdentifier	 Term Stats
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TermStats	TokenNameIdentifier	 Term Stats
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
long	TokenNamelong	
tf	TokenNameIdentifier	 tf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalTermFreq	TokenNameIdentifier	 total Term Freq
=	TokenNameEQUAL	
tf	TokenNameIdentifier	 tf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Priority queue for TermStats objects ordered by TermStats.docFreq **/	TokenNameCOMMENT_JAVADOC	 Priority queue for TermStats objects ordered by TermStats.docFreq *
final	TokenNamefinal	
class	TokenNameclass	
TermInfoWiTFQueue	TokenNameIdentifier	 Term Info Wi TF Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
TermStats	TokenNameIdentifier	 Term Stats
>	TokenNameGREATER	
{	TokenNameLBRACE	
TermInfoWiTFQueue	TokenNameIdentifier	 Term Info Wi TF Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
TermStats	TokenNameIdentifier	 Term Stats
termInfoA	TokenNameIdentifier	 term Info A
,	TokenNameCOMMA	
TermStats	TokenNameIdentifier	 Term Stats
termInfoB	TokenNameIdentifier	 term Info B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termInfoA	TokenNameIdentifier	 term Info A
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
<	TokenNameLESS	
termInfoB	TokenNameIdentifier	 term Info B
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Comparator * * Reverse of normal Comparator. i.e. returns 1 if a.totalTermFreq is less than * b.totalTermFreq So we can sort in descending order of totalTermFreq */	TokenNameCOMMENT_JAVADOC	 Comparator * Reverse of normal Comparator. i.e. returns 1 if a.totalTermFreq is less than b.totalTermFreq So we can sort in descending order of totalTermFreq 
final	TokenNamefinal	
class	TokenNameclass	
TotalTermFreqComparatorSortDescending	TokenNameIdentifier	 Total Term Freq Comparator Sort Descending
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
TermStats	TokenNameIdentifier	 Term Stats
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
TermStats	TokenNameIdentifier	 Term Stats
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
TermStats	TokenNameIdentifier	 Term Stats
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
totalTermFreq	TokenNameIdentifier	 total Term Freq
<	TokenNameLESS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
totalTermFreq	TokenNameIdentifier	 total Term Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
totalTermFreq	TokenNameIdentifier	 total Term Freq
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
totalTermFreq	TokenNameIdentifier	 total Term Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

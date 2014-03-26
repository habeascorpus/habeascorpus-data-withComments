package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
/** * Try to build a suggester from a large data set. The input is a simple text * file, newline-delimited. */	TokenNameCOMMENT_JAVADOC	 Try to build a suggester from a large data set. The input is a simple text file, newline-delimited. 
public	TokenNamepublic	
class	TokenNameclass	
LargeInputFST	TokenNameIdentifier	 Large Input FST
{	TokenNameLBRACE	
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
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/home/dweiss/tmp/shuffled.dict"	TokenNameStringLiteral	/home/dweiss/tmp/shuffled.dict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
shareMaxTail	TokenNameIdentifier	 share Max Tail
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ExternalRefSorter	TokenNameIdentifier	 External Ref Sorter
sorter	TokenNameIdentifier	 sorter
=	TokenNameEQUAL	
new	TokenNamenew	
ExternalRefSorter	TokenNameIdentifier	 External Ref Sorter
(	TokenNameLPAREN	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
FSTCompletionBuilder	TokenNameIdentifier	 FST Completion Builder
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
,	TokenNameCOMMA	
sorter	TokenNameIdentifier	 sorter
,	TokenNameCOMMA	
shareMaxTail	TokenNameIdentifier	 share Max Tail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
%	TokenNameREMAINDER	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
%	TokenNameREMAINDER	
100000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Line: "	TokenNameStringLiteral	Line: 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Building FSTCompletion."	TokenNameStringLiteral	Building FSTCompletion.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FSTCompletion	TokenNameIdentifier	 FST Completion
completion	TokenNameIdentifier	 completion
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
fstFile	TokenNameIdentifier	 fst File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"completion.fst"	TokenNameStringLiteral	completion.fst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Done. Writing automaton: "	TokenNameStringLiteral	Done. Writing automaton: 
+	TokenNamePLUS	
fstFile	TokenNameIdentifier	 fst File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
completion	TokenNameIdentifier	 completion
.	TokenNameDOT	
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
fstFile	TokenNameIdentifier	 fst File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sorter	TokenNameIdentifier	 sorter
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

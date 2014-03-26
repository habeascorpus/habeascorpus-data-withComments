package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
Directory	TokenNameIdentifier	 Directory
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
IndexWriter	TokenNameIdentifier	 Index Writer
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestThreadSafe	TokenNameIdentifier	 Test Thread Safe
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
ir1	TokenNameIdentifier	 ir1
;	TokenNameSEMICOLON	
class	TokenNameclass	
Thr	TokenNameIdentifier	 Thr
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
failed	TokenNameIdentifier	 failed
;	TokenNameSEMICOLON	
// pass in random in case we want to make things reproducable 	TokenNameCOMMENT_LINE	pass in random in case we want to make things reproducable 
public	TokenNamepublic	
Thr	TokenNameIdentifier	 Thr
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
failed	TokenNameIdentifier	 failed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rand	TokenNameIdentifier	 rand
=	TokenNameEQUAL	
rand	TokenNameIdentifier	 rand
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
failed	TokenNameIdentifier	 failed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*** future // pick a random index reader... a shared one, or create your own IndexReader ir; ***/	TokenNameCOMMENT_JAVADOC	* future // pick a random index reader... a shared one, or create your own IndexReader ir; **
switch	TokenNameswitch	
(	TokenNameLPAREN	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
loadDoc	TokenNameIdentifier	 load Doc
(	TokenNameLPAREN	
ir1	TokenNameIdentifier	 ir1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
{	TokenNameLBRACE	
failed	TokenNameIdentifier	 failed
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
loadDoc	TokenNameIdentifier	 load Doc
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
ir	TokenNameIdentifier	 ir
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// beware of deleted docs in the future 	TokenNameCOMMENT_LINE	beware of deleted docs in the future 
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
FieldSelector	TokenNameIdentifier	 Field Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LAZY_LOAD	TokenNameIdentifier	 LAZY  LOAD
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
;	TokenNameSEMICOLON	
// TODO: add other options 	TokenNameCOMMENT_LINE	TODO: add other options 
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateField	TokenNameIdentifier	 validate Field
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
validateField	TokenNameIdentifier	 validate Field
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"^"	TokenNameStringLiteral	^
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"$"	TokenNameStringLiteral	$
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Invalid field:"	TokenNameStringLiteral	Invalid field:
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" val="	TokenNameStringLiteral	 val=
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
words	TokenNameIdentifier	 words
=	TokenNameEQUAL	
"now is the time for all good men to come to the aid of their country"	TokenNameStringLiteral	now is the time for all good men to come to the aid of their country
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
buildDir	TokenNameIdentifier	 build Dir
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
int	TokenNameint	
nDocs	TokenNameIdentifier	 n Docs
,	TokenNameCOMMA	
int	TokenNameint	
maxFields	TokenNameIdentifier	 max Fields
,	TokenNameCOMMA	
int	TokenNameint	
maxFieldLen	TokenNameIdentifier	 max Field Len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
iw	TokenNameIdentifier	 iw
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nDocs	TokenNameIdentifier	 n Docs
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nFields	TokenNameIdentifier	 n Fields
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxFields	TokenNameIdentifier	 max Fields
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
nFields	TokenNameIdentifier	 n Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
flen	TokenNameIdentifier	 flen
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
maxFieldLen	TokenNameIdentifier	 max Field Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"^ "	TokenNameStringLiteral	^ 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
flen	TokenNameIdentifier	 flen
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" $"	TokenNameStringLiteral	 $
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
=	TokenNameEQUAL	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
;	TokenNameSEMICOLON	
// make random later 	TokenNameCOMMENT_LINE	make random later 
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
;	TokenNameSEMICOLON	
// make random later 	TokenNameCOMMENT_LINE	make random later 
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
nThreads	TokenNameIdentifier	 n Threads
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Thr	TokenNameIdentifier	 Thr
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tarr	TokenNameIdentifier	 tarr
=	TokenNameEQUAL	
new	TokenNamenew	
Thr	TokenNameIdentifier	 Thr
[	TokenNameLBRACKET	
nThreads	TokenNameIdentifier	 n Threads
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
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
nThreads	TokenNameIdentifier	 n Threads
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tarr	TokenNameIdentifier	 tarr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Thr	TokenNameIdentifier	 Thr
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
failed	TokenNameIdentifier	 failed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tarr	TokenNameIdentifier	 tarr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
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
nThreads	TokenNameIdentifier	 n Threads
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tarr	TokenNameIdentifier	 tarr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
failed	TokenNameIdentifier	 failed
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLazyLoadThreadSafety	TokenNameIdentifier	 test Lazy Load Thread Safety
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test w/ field sizes bigger than the buffer of an index input 	TokenNameCOMMENT_LINE	test w/ field sizes bigger than the buffer of an index input 
buildDir	TokenNameIdentifier	 build Dir
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do many small tests so the thread locals go away inbetween 	TokenNameCOMMENT_LINE	do many small tests so the thread locals go away inbetween 
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
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
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ir1	TokenNameIdentifier	 ir1
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTest	TokenNameIdentifier	 do Test
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ir1	TokenNameIdentifier	 ir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

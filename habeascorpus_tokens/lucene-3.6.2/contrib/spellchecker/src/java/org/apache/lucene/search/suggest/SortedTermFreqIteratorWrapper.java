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
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spell	TokenNameIdentifier	 spell
.	TokenNameDOT	
TermFreqIterator	TokenNameIdentifier	 Term Freq Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Sort	TokenNameIdentifier	 Sort
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
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
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
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
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
/** * This wrapper buffers incoming elements and makes sure they are sorted based on given comparator. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This wrapper buffers incoming elements and makes sure they are sorted based on given comparator. @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SortedTermFreqIteratorWrapper	TokenNameIdentifier	 Sorted Term Freq Iterator Wrapper
implements	TokenNameimplements	
TermFreqIterator	TokenNameIdentifier	 Term Freq Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TermFreqIterator	TokenNameIdentifier	 Term Freq Iterator
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
tempInput	TokenNameIdentifier	 temp Input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
tempSorted	TokenNameIdentifier	 temp Sorted
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SortedTermFreqIteratorWrapper	TokenNameIdentifier	 Sorted Term Freq Iterator Wrapper
(	TokenNameLPAREN	
TermFreqIterator	TokenNameIdentifier	 Term Freq Iterator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SortedTermFreqIteratorWrapper	TokenNameIdentifier	 Sorted Term Freq Iterator Wrapper
(	TokenNameLPAREN	
TermFreqIterator	TokenNameIdentifier	 Term Freq Iterator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compareRawBytes	TokenNameIdentifier	 compare Raw Bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
compareRawBytes	TokenNameIdentifier	 compare Raw Bytes
?	TokenNameQUESTION	
comparator	TokenNameIdentifier	 comparator
:	TokenNameCOLON	
new	TokenNamenew	
BytesOnlyComparator	TokenNameIdentifier	 Bytes Only Comparator
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scratch	TokenNameIdentifier	 scratch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
long	TokenNamelong	
weight	TokenNameIdentifier	 weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
defaultTempDir	TokenNameIdentifier	 default Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempInput	TokenNameIdentifier	 temp Input
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
".input"	TokenNameStringLiteral	.input
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempSorted	TokenNameIdentifier	 temp Sorted
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
".sorted"	TokenNameStringLiteral	.sorted
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
(	TokenNameLPAREN	
tempInput	TokenNameIdentifier	 temp Input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
spare	TokenNameIdentifier	 spare
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
spare	TokenNameIdentifier	 spare
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
tempInput	TokenNameIdentifier	 temp Input
,	TokenNameCOMMA	
tempSorted	TokenNameIdentifier	 temp Sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
(	TokenNameLPAREN	
tempSorted	TokenNameIdentifier	 temp Sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempInput	TokenNameIdentifier	 temp Input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempInput	TokenNameIdentifier	 temp Input
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tempSorted	TokenNameIdentifier	 temp Sorted
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempSorted	TokenNameIdentifier	 temp Sorted
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
BytesOnlyComparator	TokenNameIdentifier	 Bytes Only Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
leftScratch	TokenNameIdentifier	 left Scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
rightScratch	TokenNameIdentifier	 right Scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BytesOnlyComparator	TokenNameIdentifier	 Bytes Only Comparator
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
leftScratch	TokenNameIdentifier	 left Scratch
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
rightScratch	TokenNameIdentifier	 right Scratch
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
leftScratch	TokenNameIdentifier	 left Scratch
,	TokenNameCOMMA	
rightScratch	TokenNameIdentifier	 right Scratch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
wrapper	TokenNameIdentifier	 wrapper
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
wrapper	TokenNameIdentifier	 wrapper
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
ByteArrayDataOutput	TokenNameIdentifier	 Byte Array Data Output
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
spare	TokenNameIdentifier	 spare
,	TokenNameCOMMA	
long	TokenNamelong	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
,	TokenNameCOMMA	
ByteArrayDataInput	TokenNameIdentifier	 Byte Array Data Input
tmpInput	TokenNameIdentifier	 tmp Input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpInput	TokenNameIdentifier	 tmp Input
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmpInput	TokenNameIdentifier	 tmp Input
.	TokenNameDOT	
skipBytes	TokenNameIdentifier	 skip Bytes
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// suggestion + separator 	TokenNameCOMMENT_LINE	suggestion + separator 
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// sep + long 	TokenNameCOMMENT_LINE	sep + long 
return	TokenNamereturn	
tmpInput	TokenNameIdentifier	 tmp Input
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

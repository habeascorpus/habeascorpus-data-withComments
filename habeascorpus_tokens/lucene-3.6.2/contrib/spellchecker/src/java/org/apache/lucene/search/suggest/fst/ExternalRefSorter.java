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
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
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
/** * Builds and iterates over sequences stored on disk. * @lucene.experimental * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Builds and iterates over sequences stored on disk. @lucene.experimental @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
ExternalRefSorter	TokenNameIdentifier	 External Ref Sorter
implements	TokenNameimplements	
BytesRefSorter	TokenNameIdentifier	 Bytes Ref Sorter
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
sorted	TokenNameIdentifier	 sorted
;	TokenNameSEMICOLON	
/** * Will buffer all sequences to a temporary file and then sort (all on-disk). */	TokenNameCOMMENT_JAVADOC	 Will buffer all sequences to a temporary file and then sort (all on-disk). 
public	TokenNamepublic	
ExternalRefSorter	TokenNameIdentifier	 External Ref Sorter
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
=	TokenNameEQUAL	
sort	TokenNameIdentifier	 sort
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"RefSorter-"	TokenNameStringLiteral	RefSorter-
,	TokenNameCOMMA	
".raw"	TokenNameStringLiteral	.raw
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
defaultTempDir	TokenNameIdentifier	 default Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sorted	TokenNameIdentifier	 sorted
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"RefSorter-"	TokenNameStringLiteral	RefSorter-
,	TokenNameCOMMA	
".sorted"	TokenNameStringLiteral	.sorted
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
defaultTempDir	TokenNameIdentifier	 default Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
sorted	TokenNameIdentifier	 sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ByteSequenceIterator	TokenNameIdentifier	 Byte Sequence Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
Sort	TokenNameIdentifier	 Sort
.	TokenNameDOT	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes any written temporary files. */	TokenNameCOMMENT_JAVADOC	 Removes any written temporary files. 
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Iterate over byte refs in a file. */	TokenNameCOMMENT_JAVADOC	 Iterate over byte refs in a file. 
class	TokenNameclass	
ByteSequenceIterator	TokenNameIdentifier	 Byte Sequence Iterator
implements	TokenNameimplements	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
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
ByteSequenceIterator	TokenNameIdentifier	 Byte Sequence Iterator
(	TokenNameLPAREN	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
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
if	TokenNameif	
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scratch	TokenNameIdentifier	 scratch
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
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
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
sort	TokenNameIdentifier	 sort
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

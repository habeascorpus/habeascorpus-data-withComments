package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
IndexOutput	TokenNameIdentifier	 Index Output
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtils	TokenNameIdentifier	 IO Utils
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
UnicodeUtil	TokenNameIdentifier	 Unicode Util
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
/** This stores a monotonically increasing set of <Term, TermInfo> pairs in a Directory. A TermInfos can be written once, in order. */	TokenNameCOMMENT_JAVADOC	 This stores a monotonically increasing set of <Term, TermInfo> pairs in a Directory. A TermInfos can be written once, in order. 
final	TokenNamefinal	
class	TokenNameclass	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
/** The file format version, a negative number. */	TokenNameCOMMENT_JAVADOC	 The file format version, a negative number. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT	TokenNameIdentifier	 FORMAT
=	TokenNameEQUAL	
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Changed strings to true utf8 with length-in-bytes not 	TokenNameCOMMENT_LINE	Changed strings to true utf8 with length-in-bytes not 
// length-in-chars 	TokenNameCOMMENT_LINE	length-in-chars 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_VERSION_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  VERSION  UT F8  LENGTH  IN  BYTES
=	TokenNameEQUAL	
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// NOTE: always change this if you switch to a new format! 	TokenNameCOMMENT_LINE	NOTE: always change this if you switch to a new format! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
=	TokenNameEQUAL	
FORMAT_VERSION_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  VERSION  UT F8  LENGTH  IN  BYTES
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermInfo	TokenNameIdentifier	 Term Info
lastTi	TokenNameIdentifier	 last Ti
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
// TODO: the default values for these two parameters should be settable from 	TokenNameCOMMENT_LINE	TODO: the default values for these two parameters should be settable from 
// IndexWriter. However, once that's done, folks will start setting them to 	TokenNameCOMMENT_LINE	IndexWriter. However, once that's done, folks will start setting them to 
// ridiculous values and complaining that things don't work well, as with 	TokenNameCOMMENT_LINE	ridiculous values and complaining that things don't work well, as with 
// mergeFactor. So, let's wait until a number of folks find that alternate 	TokenNameCOMMENT_LINE	mergeFactor. So, let's wait until a number of folks find that alternate 
// values work better. Note that both of these values are stored in the 	TokenNameCOMMENT_LINE	values work better. Note that both of these values are stored in the 
// segment, so that it's safe to change these w/o rebuilding all indexes. 	TokenNameCOMMENT_LINE	segment, so that it's safe to change these w/o rebuilding all indexes. 
/** Expert: The fraction of terms in the "dictionary" which should be stored * in RAM. Smaller values use more memory, but make searching slightly * faster, while larger values use less memory and make searching slightly * slower. Searching is typically not dominated by dictionary lookup, so * tweaking this is rarely useful.*/	TokenNameCOMMENT_JAVADOC	 Expert: The fraction of terms in the "dictionary" which should be stored in RAM. Smaller values use more memory, but make searching slightly faster, while larger values use less memory and make searching slightly slower. Searching is typically not dominated by dictionary lookup, so tweaking this is rarely useful.
int	TokenNameint	
indexInterval	TokenNameIdentifier	 index Interval
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Expert: The fraction of {@link TermDocs} entries stored in skip tables, * used to accelerate {@link TermDocs#skipTo(int)}. Larger values result in * smaller indexes, greater acceleration, but fewer accelerable cases, while * smaller values result in bigger indexes, less acceleration and more * accelerable cases. More detailed experiments would be useful here. */	TokenNameCOMMENT_JAVADOC	 Expert: The fraction of {@link TermDocs} entries stored in skip tables, used to accelerate {@link TermDocs#skipTo(int)}. Larger values result in smaller indexes, greater acceleration, but fewer accelerable cases, while smaller values result in bigger indexes, less acceleration and more accelerable cases. More detailed experiments would be useful here. 
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Expert: The maximum number of skip levels. Smaller values result in * slightly smaller indexes, but slower skipping in big posting lists. */	TokenNameCOMMENT_JAVADOC	 Expert: The maximum number of skip levels. Smaller values result in slightly smaller indexes, but slower skipping in big posting lists. 
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastIndexPointer	TokenNameIdentifier	 last Index Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isIndex	TokenNameIdentifier	 is Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastFieldNumber	TokenNameIdentifier	 last Field Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8Result	TokenNameIdentifier	 utf8 Result
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
int	TokenNameint	
interval	TokenNameIdentifier	 interval
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
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
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
int	TokenNameint	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
int	TokenNameint	
interval	TokenNameIdentifier	 interval
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isi	TokenNameIdentifier	 isi
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
indexInterval	TokenNameIdentifier	 index Interval
=	TokenNameEQUAL	
interval	TokenNameIdentifier	 interval
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fis	TokenNameIdentifier	 fis
;	TokenNameSEMICOLON	
isIndex	TokenNameIdentifier	 is Index
=	TokenNameEQUAL	
isi	TokenNameIdentifier	 isi
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
+	TokenNamePLUS	
(	TokenNameLPAREN	
isIndex	TokenNameIdentifier	 is Index
?	TokenNameQUESTION	
".tii"	TokenNameStringLiteral	.tii
:	TokenNameCOLON	
".tis"	TokenNameStringLiteral	.tis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write format 	TokenNameCOMMENT_LINE	write format 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// leave space for size 	TokenNameCOMMENT_LINE	leave space for size 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
indexInterval	TokenNameIdentifier	 index Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write indexInterval 	TokenNameCOMMENT_LINE	write indexInterval 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write skipInterval 	TokenNameCOMMENT_LINE	write skipInterval 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write maxSkipLevels 	TokenNameCOMMENT_LINE	write maxSkipLevels 
assert	TokenNameassert	
initUTF16Results	TokenNameIdentifier	 init UT F16 Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
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
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
utf8Result	TokenNameIdentifier	 utf8 Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldNumber	TokenNameIdentifier	 field Number
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
,	TokenNameCOMMA	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
utf8Result	TokenNameIdentifier	 utf8 Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Currently used only by assert statements 	TokenNameCOMMENT_LINE	Currently used only by assert statements 
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
utf16Result1	TokenNameIdentifier	 utf16 Result1
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
utf16Result2	TokenNameIdentifier	 utf16 Result2
;	TokenNameSEMICOLON	
// Currently used only by assert statements 	TokenNameCOMMENT_LINE	Currently used only by assert statements 
private	TokenNameprivate	
boolean	TokenNameboolean	
initUTF16Results	TokenNameIdentifier	 init UT F16 Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
utf16Result1	TokenNameIdentifier	 utf16 Result1
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
utf16Result2	TokenNameIdentifier	 utf16 Result2
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Currently used only by assert statement 	TokenNameCOMMENT_LINE	Currently used only by assert statement 
private	TokenNameprivate	
int	TokenNameint	
compareToLastTerm	TokenNameIdentifier	 compare To Last Term
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
int	TokenNameint	
termBytesLength	TokenNameIdentifier	 term Bytes Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastFieldNumber	TokenNameIdentifier	 last Field Number
!=	TokenNameNOT_EQUAL	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
lastFieldNumber	TokenNameIdentifier	 last Field Number
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there is a field named "" (empty string) then we 	TokenNameCOMMENT_LINE	If there is a field named "" (empty string) then we 
// will get 0 on this comparison, yet, it's "OK". But 	TokenNameCOMMENT_LINE	will get 0 on this comparison, yet, it's "OK". But 
// it's not OK if two different field numbers map to 	TokenNameCOMMENT_LINE	it's not OK if two different field numbers map to 
// the same name. 	TokenNameCOMMENT_LINE	the same name. 
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
lastFieldNumber	TokenNameIdentifier	 last Field Number
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
,	TokenNameCOMMA	
utf16Result1	TokenNameIdentifier	 utf16 Result1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termBytesLength	TokenNameIdentifier	 term Bytes Length
,	TokenNameCOMMA	
utf16Result2	TokenNameIdentifier	 utf16 Result2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
utf16Result1	TokenNameIdentifier	 utf16 Result1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
utf16Result2	TokenNameIdentifier	 utf16 Result2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
utf16Result1	TokenNameIdentifier	 utf16 Result1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
else	TokenNameelse	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
utf16Result2	TokenNameIdentifier	 utf16 Result2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
utf16Result1	TokenNameIdentifier	 utf16 Result1
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
utf16Result2	TokenNameIdentifier	 utf16 Result2
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
!=	TokenNameNOT_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
return	TokenNamereturn	
ch1	TokenNameIdentifier	 ch1
-	TokenNameMINUS	
ch2	TokenNameIdentifier	 ch2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
utf16Result1	TokenNameIdentifier	 utf16 Result1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lastFieldNumber	TokenNameIdentifier	 last Field Number
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If there is a field named "" (empty string) with a term text of "" (empty string) then we 	TokenNameCOMMENT_LINE	If there is a field named "" (empty string) with a term text of "" (empty string) then we 
// will get 0 on this comparison, yet, it's "OK". 	TokenNameCOMMENT_LINE	will get 0 on this comparison, yet, it's "OK". 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
utf16Result1	TokenNameIdentifier	 utf16 Result1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
utf16Result2	TokenNameIdentifier	 utf16 Result2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds a new <<fieldNumber, termBytes>, TermInfo> pair to the set. Term must be lexicographically greater than all previous Terms added. TermInfo pointers must be positive and greater than all previous.*/	TokenNameCOMMENT_JAVADOC	 Adds a new <<fieldNumber, termBytes>, TermInfo> pair to the set. Term must be lexicographically greater than all previous Terms added. TermInfo pointers must be positive and greater than all previous.
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
int	TokenNameint	
termBytesLength	TokenNameIdentifier	 term Bytes Length
,	TokenNameCOMMA	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
compareToLastTerm	TokenNameIdentifier	 compare To Last Term
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
,	TokenNameCOMMA	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
termBytesLength	TokenNameIdentifier	 term Bytes Length
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
isIndex	TokenNameIdentifier	 is Index
&&	TokenNameAND_AND	
termBytesLength	TokenNameIdentifier	 term Bytes Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Terms are out of order: field="	TokenNameStringLiteral	Terms are out of order: field=
+	TokenNamePLUS	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (number "	TokenNameStringLiteral	 (number 
+	TokenNamePLUS	
fieldNumber	TokenNameIdentifier	 field Number
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
" lastField="	TokenNameStringLiteral	 lastField=
+	TokenNamePLUS	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
(	TokenNameLPAREN	
lastFieldNumber	TokenNameIdentifier	 last Field Number
)	TokenNameRPAREN	
+	TokenNamePLUS	
" (number "	TokenNameStringLiteral	 (number 
+	TokenNamePLUS	
lastFieldNumber	TokenNameIdentifier	 last Field Number
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
" text="	TokenNameStringLiteral	 text=
+	TokenNamePLUS	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termBytesLength	TokenNameIdentifier	 term Bytes Length
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
+	TokenNamePLUS	
" lastText="	TokenNameStringLiteral	 lastText=
+	TokenNamePLUS	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
>=	TokenNameGREATER_EQUAL	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
:	TokenNameCOLON	
"freqPointer out of order ("	TokenNameStringLiteral	freqPointer out of order (
+	TokenNamePLUS	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
+	TokenNamePLUS	
" < "	TokenNameStringLiteral	 < 
+	TokenNamePLUS	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
>=	TokenNameGREATER_EQUAL	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
:	TokenNameCOLON	
"proxPointer out of order ("	TokenNameStringLiteral	proxPointer out of order (
+	TokenNamePLUS	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
+	TokenNamePLUS	
" < "	TokenNameStringLiteral	 < 
+	TokenNamePLUS	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isIndex	TokenNameIdentifier	 is Index
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
%	TokenNameREMAINDER	
indexInterval	TokenNameIdentifier	 index Interval
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lastFieldNumber	TokenNameIdentifier	 last Field Number
,	TokenNameCOMMA	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
,	TokenNameCOMMA	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
,	TokenNameCOMMA	
lastTi	TokenNameIdentifier	 last Ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add an index term 	TokenNameCOMMENT_LINE	add an index term 
writeTerm	TokenNameIdentifier	 write Term
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
,	TokenNameCOMMA	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
termBytesLength	TokenNameIdentifier	 term Bytes Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write term 	TokenNameCOMMENT_LINE	write term 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write doc freq 	TokenNameCOMMENT_LINE	write doc freq 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
-	TokenNameMINUS	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write pointers 	TokenNameCOMMENT_LINE	write pointers 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
-	TokenNameMINUS	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>=	TokenNameGREATER_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVLong	TokenNameIdentifier	 write V Long
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastIndexPointer	TokenNameIdentifier	 last Index Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastIndexPointer	TokenNameIdentifier	 last Index Pointer
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write pointer 	TokenNameCOMMENT_LINE	write pointer 
}	TokenNameRBRACE	
lastFieldNumber	TokenNameIdentifier	 last Field Number
=	TokenNameEQUAL	
fieldNumber	TokenNameIdentifier	 field Number
;	TokenNameSEMICOLON	
lastTi	TokenNameIdentifier	 last Ti
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeTerm	TokenNameIdentifier	 write Term
(	TokenNameLPAREN	
int	TokenNameint	
fieldNumber	TokenNameIdentifier	 field Number
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
int	TokenNameint	
termBytesLength	TokenNameIdentifier	 term Bytes Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO: UTF16toUTF8 could tell us this prefix 	TokenNameCOMMENT_LINE	TODO: UTF16toUTF8 could tell us this prefix 
// Compute prefix in common with last term: 	TokenNameCOMMENT_LINE	Compute prefix in common with last term: 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
termBytesLength	TokenNameIdentifier	 term Bytes Length
<	TokenNameLESS	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
?	TokenNameQUESTION	
termBytesLength	TokenNameIdentifier	 term Bytes Length
:	TokenNameCOLON	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termBytes	TokenNameIdentifier	 term Bytes
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
termBytesLength	TokenNameIdentifier	 term Bytes Length
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write shared prefix length 	TokenNameCOMMENT_LINE	write shared prefix length 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write delta length 	TokenNameCOMMENT_LINE	write delta length 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write delta bytes 	TokenNameCOMMENT_LINE	write delta bytes 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
fieldNumber	TokenNameIdentifier	 field Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write field num 	TokenNameCOMMENT_LINE	write field num 
if	TokenNameif	
(	TokenNameLPAREN	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
termBytesLength	TokenNameIdentifier	 term Bytes Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
,	TokenNameCOMMA	
termBytesLength	TokenNameIdentifier	 term Bytes Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
termBytes	TokenNameIdentifier	 term Bytes
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
lastTermBytes	TokenNameIdentifier	 last Term Bytes
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastTermBytesLength	TokenNameIdentifier	 last Term Bytes Length
=	TokenNameEQUAL	
termBytesLength	TokenNameIdentifier	 term Bytes Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called to complete TermInfos creation. */	TokenNameCOMMENT_JAVADOC	 Called to complete TermInfos creation. 
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
output	TokenNameIdentifier	 output
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write size after format 	TokenNameCOMMENT_LINE	write size after format 
output	TokenNameIdentifier	 output
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

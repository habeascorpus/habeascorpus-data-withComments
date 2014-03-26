package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
FieldInfo	TokenNameIdentifier	 Field Info
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
FieldInfos	TokenNameIdentifier	 Field Infos
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
/** * Common util methods for dealing with {@link IndexReader}s. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Common util methods for dealing with {@link IndexReader}s. * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ReaderUtil	TokenNameIdentifier	 Reader Util
{	TokenNameLBRACE	
private	TokenNameprivate	
ReaderUtil	TokenNameIdentifier	 Reader Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance 	TokenNameCOMMENT_LINE	no instance 
/** * Gathers sub-readers from reader into a List. * * @param allSubReaders * @param reader */	TokenNameCOMMENT_JAVADOC	 Gathers sub-readers from reader into a List. * @param allSubReaders @param reader 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
gatherSubReaders	TokenNameIdentifier	 gather Sub Readers
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
allSubReaders	TokenNameIdentifier	 all Sub Readers
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Add the reader itself, and do not recurse 	TokenNameCOMMENT_LINE	Add the reader itself, and do not recurse 
allSubReaders	TokenNameIdentifier	 all Sub Readers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gatherSubReaders	TokenNameIdentifier	 gather Sub Readers
(	TokenNameLPAREN	
allSubReaders	TokenNameIdentifier	 all Sub Readers
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Recursively visits all sub-readers of a reader. You * should subclass this and override the add method to * gather what you need. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Recursively visits all sub-readers of a reader. You should subclass this and override the add method to gather what you need. * @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Gather	TokenNameIdentifier	 Gather
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
topReader	TokenNameIdentifier	 top Reader
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Gather	TokenNameIdentifier	 Gather
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
topReader	TokenNameIdentifier	 top Reader
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
topReader	TokenNameIdentifier	 top Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
docBase	TokenNameIdentifier	 doc Base
,	TokenNameCOMMA	
topReader	TokenNameIdentifier	 top Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// atomic reader 	TokenNameCOMMENT_LINE	atomic reader 
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// composite reader 	TokenNameCOMMENT_LINE	composite reader 
int	TokenNameint	
newBase	TokenNameIdentifier	 new Base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
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
subReaders	TokenNameIdentifier	 sub Readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newBase	TokenNameIdentifier	 new Base
=	TokenNameEQUAL	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
newBase	TokenNameIdentifier	 new Base
,	TokenNameCOMMA	
subReaders	TokenNameIdentifier	 sub Readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
newBase	TokenNameIdentifier	 new Base
==	TokenNameEQUAL_EQUAL	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newBase	TokenNameIdentifier	 new Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns index of the searcher/reader for document <code>n</code> in the * array used to construct this searcher/reader. */	TokenNameCOMMENT_JAVADOC	 Returns index of the searcher/reader for document <code>n</code> in the array used to construct this searcher/reader. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
subIndex	TokenNameIdentifier	 sub Index
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docStarts	TokenNameIdentifier	 doc Starts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find 	TokenNameCOMMENT_LINE	find 
// searcher/reader for doc n: 	TokenNameCOMMENT_LINE	searcher/reader for doc n: 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
docStarts	TokenNameIdentifier	 doc Starts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// search starts array 	TokenNameCOMMENT_LINE	search starts array 
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for first element less than n, return its index 	TokenNameCOMMENT_LINE	for first element less than n, return its index 
while	TokenNamewhile	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
midValue	TokenNameIdentifier	 mid Value
=	TokenNameEQUAL	
docStarts	TokenNameIdentifier	 doc Starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// found a match 	TokenNameCOMMENT_LINE	found a match 
while	TokenNamewhile	
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
docStarts	TokenNameIdentifier	 doc Starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// scan to last match 	TokenNameCOMMENT_LINE	scan to last match 
}	TokenNameRBRACE	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getIndexedFields	TokenNameIdentifier	 get Indexed Fields
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
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
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
:	TokenNameCOLON	
getMergedFieldInfos	TokenNameIdentifier	 get Merged Field Infos
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Call this to get the (merged) FieldInfos for a * composite reader */	TokenNameCOMMENT_JAVADOC	 Call this to get the (merged) FieldInfos for a composite reader 
public	TokenNamepublic	
static	TokenNamestatic	
FieldInfos	TokenNameIdentifier	 Field Infos
getMergedFieldInfos	TokenNameIdentifier	 get Merged Field Infos
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
subReaders	TokenNameIdentifier	 sub Readers
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
IndexReader	TokenNameIdentifier	 Index Reader
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReaderUtil	TokenNameIdentifier	 Reader Util
.	TokenNameDOT	
gatherSubReaders	TokenNameIdentifier	 gather Sub Readers
(	TokenNameLPAREN	
subReaders	TokenNameIdentifier	 sub Readers
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
subReader	TokenNameIdentifier	 sub Reader
:	TokenNameCOLON	
subReaders	TokenNameIdentifier	 sub Readers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subReader	TokenNameIdentifier	 sub Reader
.	TokenNameDOT	
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

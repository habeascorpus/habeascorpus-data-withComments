/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
Column	TokenNameIdentifier	 Column
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamily	TokenNameIdentifier	 Column Family
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
DecoratedKey	TokenNameIdentifier	 Decorated Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
DeletionInfo	TokenNameIdentifier	 Deletion Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
IColumn	TokenNameIdentifier	 I Column
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableUtils	TokenNameIdentifier	 SS Table Utils
{	TokenNameLBRACE	
// first configured table and cf 	TokenNameCOMMENT_LINE	first configured table and cf 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TABLENAME	TokenNameIdentifier	 TABLENAME
=	TokenNameEQUAL	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CFNAME	TokenNameIdentifier	 CFNAME
=	TokenNameEQUAL	
"Standard1"	TokenNameStringLiteral	Standard1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
ColumnFamily	TokenNameIdentifier	 Column Family
createCF	TokenNameIdentifier	 create CF
(	TokenNameLPAREN	
long	TokenNamelong	
mfda	TokenNameIdentifier	 mfda
,	TokenNameCOMMA	
int	TokenNameint	
ldt	TokenNameIdentifier	 ldt
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
...	TokenNameELLIPSIS	
cols	TokenNameIdentifier	 cols
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
TABLENAME	TokenNameIdentifier	 TABLENAME
,	TokenNameCOMMA	
CFNAME	TokenNameIdentifier	 CFNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
new	TokenNamenew	
DeletionInfo	TokenNameIdentifier	 Deletion Info
(	TokenNameLPAREN	
mfda	TokenNameIdentifier	 mfda
,	TokenNameCOMMA	
ldt	TokenNameIdentifier	 ldt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
col	TokenNameIdentifier	 col
:	TokenNameCOLON	
cols	TokenNameIdentifier	 cols
)	TokenNameRPAREN	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
tempSSTableFile	TokenNameIdentifier	 temp SS Table File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
tempSSTableFile	TokenNameIdentifier	 temp SS Table File
(	TokenNameLPAREN	
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
tempSSTableFile	TokenNameIdentifier	 temp SS Table File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
tempdir	TokenNameIdentifier	 tempdir
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tempdir	TokenNameIdentifier	 tempdir
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
tempdir	TokenNameIdentifier	 tempdir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Temporary directory creation failed."	TokenNameStringLiteral	Temporary directory creation failed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempdir	TokenNameIdentifier	 tempdir
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tabledir	TokenNameIdentifier	 tabledir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tempdir	TokenNameIdentifier	 tempdir
,	TokenNameCOMMA	
tablename	TokenNameIdentifier	 tablename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tabledir	TokenNameIdentifier	 tabledir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tabledir	TokenNameIdentifier	 tabledir
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
datafile	TokenNameIdentifier	 datafile
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
tabledir	TokenNameIdentifier	 tabledir
,	TokenNameCOMMA	
tablename	TokenNameIdentifier	 tablename
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
"Data.db"	TokenNameStringLiteral	Data.db
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
datafile	TokenNameIdentifier	 datafile
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unable to create file "	TokenNameStringLiteral	unable to create file 
+	TokenNamePLUS	
datafile	TokenNameIdentifier	 datafile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
datafile	TokenNameIdentifier	 datafile
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
datafile	TokenNameIdentifier	 datafile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertContentEquals	TokenNameIdentifier	 assert Content Equals
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
lhs	TokenNameIdentifier	 lhs
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SSTableScanner	TokenNameIdentifier	 SS Table Scanner
slhs	TokenNameIdentifier	 slhs
=	TokenNameEQUAL	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getDirectScanner	TokenNameIdentifier	 get Direct Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableScanner	TokenNameIdentifier	 SS Table Scanner
srhs	TokenNameIdentifier	 srhs
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getDirectScanner	TokenNameIdentifier	 get Direct Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
slhs	TokenNameIdentifier	 slhs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
ilhs	TokenNameIdentifier	 ilhs
=	TokenNameEQUAL	
slhs	TokenNameIdentifier	 slhs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
srhs	TokenNameIdentifier	 srhs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"LHS contained more rows than RHS"	TokenNameStringLiteral	LHS contained more rows than RHS
;	TokenNameSEMICOLON	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
irhs	TokenNameIdentifier	 irhs
=	TokenNameEQUAL	
srhs	TokenNameIdentifier	 srhs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertContentEquals	TokenNameIdentifier	 assert Content Equals
(	TokenNameLPAREN	
ilhs	TokenNameIdentifier	 ilhs
,	TokenNameCOMMA	
irhs	TokenNameIdentifier	 irhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
srhs	TokenNameIdentifier	 srhs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"RHS contained more rows than LHS"	TokenNameStringLiteral	RHS contained more rows than LHS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertContentEquals	TokenNameIdentifier	 assert Content Equals
(	TokenNameLPAREN	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
lhs	TokenNameIdentifier	 lhs
,	TokenNameCOMMA	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
rhs	TokenNameIdentifier	 rhs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check metadata 	TokenNameCOMMENT_LINE	check metadata 
ColumnFamily	TokenNameIdentifier	 Column Family
lcf	TokenNameIdentifier	 lcf
=	TokenNameEQUAL	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
rcf	TokenNameIdentifier	 rcf
=	TokenNameEQUAL	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lcf	TokenNameIdentifier	 lcf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rcf	TokenNameIdentifier	 rcf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"LHS had no content for "	TokenNameStringLiteral	LHS had no content for 
+	TokenNamePLUS	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rcf	TokenNameIdentifier	 rcf
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"RHS had no content for "	TokenNameStringLiteral	RHS had no content for 
+	TokenNamePLUS	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
lcf	TokenNameIdentifier	 lcf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rcf	TokenNameIdentifier	 rcf
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// iterate columns 	TokenNameCOMMENT_LINE	iterate columns 
while	TokenNamewhile	
(	TokenNameLPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IColumn	TokenNameIdentifier	 I Column
clhs	TokenNameIdentifier	 clhs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"LHS contained more columns than RHS for "	TokenNameStringLiteral	LHS contained more columns than RHS for 
+	TokenNamePLUS	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IColumn	TokenNameIdentifier	 I Column
crhs	TokenNameIdentifier	 crhs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Mismatched columns for "	TokenNameStringLiteral	Mismatched columns for 
+	TokenNamePLUS	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clhs	TokenNameIdentifier	 clhs
,	TokenNameCOMMA	
crhs	TokenNameIdentifier	 crhs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"RHS contained more columns than LHS for "	TokenNameStringLiteral	RHS contained more columns than LHS for 
+	TokenNamePLUS	
lhs	TokenNameIdentifier	 lhs
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A Context with chainable methods to configure and write a SSTable. */	TokenNameCOMMENT_JAVADOC	 @return A Context with chainable methods to configure and write a SSTable. 
public	TokenNamepublic	
static	TokenNamestatic	
Context	TokenNameIdentifier	 Context
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Context	TokenNameIdentifier	 Context
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
=	TokenNameEQUAL	
TABLENAME	TokenNameIdentifier	 TABLENAME
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
=	TokenNameEQUAL	
CFNAME	TokenNameIdentifier	 CFNAME
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Descriptor	TokenNameIdentifier	 Descriptor
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
cleanup	TokenNameIdentifier	 cleanup
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Context	TokenNameIdentifier	 Context
ks	TokenNameIdentifier	 ks
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
=	TokenNameEQUAL	
ksname	TokenNameIdentifier	 ksname
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Context	TokenNameIdentifier	 Context
cf	TokenNameIdentifier	 cf
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
=	TokenNameEQUAL	
cfname	TokenNameIdentifier	 cfname
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an alternate path for the written SSTable: if unset, the SSTable will * be cleaned up on JVM exit. */	TokenNameCOMMENT_JAVADOC	 Set an alternate path for the written SSTable: if unset, the SSTable will be cleaned up on JVM exit. 
public	TokenNamepublic	
Context	TokenNameIdentifier	 Context
dest	TokenNameIdentifier	 dest
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cleanup	TokenNameIdentifier	 cleanup
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the generation number for the generated SSTable. Ignored if "dest()" is set. */	TokenNameCOMMENT_JAVADOC	 Sets the generation number for the generated SSTable. Ignored if "dest()" is set. 
public	TokenNamepublic	
Context	TokenNameIdentifier	 Context
generation	TokenNameIdentifier	 generation
(	TokenNameLPAREN	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
:	TokenNameCOLON	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
new	TokenNamenew	
Column	TokenNameIdentifier	 Column
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
sorted	TokenNameIdentifier	 sorted
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>>	TokenNameRIGHT_SHIFT	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Appender	TokenNameIdentifier	 Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
sorted	TokenNameIdentifier	 sorted
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ColumnFamily	TokenNameIdentifier	 Column Family
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sorted	TokenNameIdentifier	 sorted
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
dk	TokenNameIdentifier	 dk
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableReader	TokenNameIdentifier	 SS Table Reader
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
expectedSize	TokenNameIdentifier	 expected Size
,	TokenNameCOMMA	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
datafile	TokenNameIdentifier	 datafile
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tempSSTableFile	TokenNameIdentifier	 temp SS Table File
(	TokenNameLPAREN	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
(	TokenNameLPAREN	
datafile	TokenNameIdentifier	 datafile
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expectedSize	TokenNameIdentifier	 expected Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* pass */	TokenNameCOMMENT_BLOCK	 pass 
}	TokenNameRBRACE	
SSTableReader	TokenNameIdentifier	 SS Table Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
closeAndOpenReader	TokenNameIdentifier	 close And Open Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// mark all components for removal 	TokenNameCOMMENT_LINE	mark all components for removal 
if	TokenNameif	
(	TokenNameLPAREN	
cleanup	TokenNameIdentifier	 cleanup
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
component	TokenNameIdentifier	 component
:	TokenNameCOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Appender	TokenNameIdentifier	 Appender
{	TokenNameLBRACE	
/** Called with an open writer until it returns false. */	TokenNameCOMMENT_JAVADOC	 Called with an open writer until it returns false. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SSTableWriter	TokenNameIdentifier	 SS Table Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

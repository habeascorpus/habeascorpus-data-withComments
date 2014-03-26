package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
.	TokenNameDOT	
DiskOrdinalMap	TokenNameIdentifier	 Disk Ordinal Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
.	TokenNameDOT	
MemoryOrdinalMap	TokenNameIdentifier	 Memory Ordinal Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
.	TokenNameDOT	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestAddTaxonomy	TokenNameIdentifier	 Test Add Taxonomy
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
dotest	TokenNameIdentifier	 dotest
(	TokenNameLPAREN	
int	TokenNameint	
ncats	TokenNameIdentifier	 ncats
,	TokenNameCOMMA	
int	TokenNameint	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Directory	TokenNameIdentifier	 Directory
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
dirs	TokenNameIdentifier	 dirs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
ncats	TokenNameIdentifier	 ncats
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw	TokenNameIdentifier	 tw
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tw	TokenNameIdentifier	 tw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
randomOrdinalMap	TokenNameIdentifier	 random Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw	TokenNameIdentifier	 tw
.	TokenNameDOT	
addTaxonomy	TokenNameIdentifier	 add Taxonomy
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw	TokenNameIdentifier	 tw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
dirs	TokenNameIdentifier	 dirs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
dirs	TokenNameIdentifier	 dirs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
randomOrdinalMap	TokenNameIdentifier	 random Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DiskOrdinalMap	TokenNameIdentifier	 Disk Ordinal Map
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"taxoMap"	TokenNameStringLiteral	taxoMap
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
TEMP_DIR	TokenNameIdentifier	 TEMP  DIR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MemoryOrdinalMap	TokenNameIdentifier	 Memory Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
Directory	TokenNameIdentifier	 Directory
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
Directory	TokenNameIdentifier	 Directory
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
ordMap	TokenNameIdentifier	 ord Map
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
destTR	TokenNameIdentifier	 dest TR
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
destSize	TokenNameIdentifier	 dest Size
=	TokenNameEQUAL	
destTR	TokenNameIdentifier	 dest TR
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
srcTR	TokenNameIdentifier	 src TR
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
ordMap	TokenNameIdentifier	 ord Map
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// validate taxo sizes 	TokenNameCOMMENT_LINE	validate taxo sizes 
int	TokenNameint	
srcSize	TokenNameIdentifier	 src Size
=	TokenNameEQUAL	
srcTR	TokenNameIdentifier	 src TR
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"destination taxonomy expected to be larger than source; dest="	TokenNameStringLiteral	destination taxonomy expected to be larger than source; dest=
+	TokenNamePLUS	
destSize	TokenNameIdentifier	 dest Size
+	TokenNamePLUS	
" src="	TokenNameStringLiteral	 src=
+	TokenNamePLUS	
srcSize	TokenNameIdentifier	 src Size
,	TokenNameCOMMA	
destSize	TokenNameIdentifier	 dest Size
>=	TokenNameGREATER_EQUAL	
srcSize	TokenNameIdentifier	 src Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// validate that all source categories exist in destination, and their 	TokenNameCOMMENT_LINE	validate that all source categories exist in destination, and their 
// ordinals are as expected. 	TokenNameCOMMENT_LINE	ordinals are as expected. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
srcSize	TokenNameIdentifier	 src Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcTR	TokenNameIdentifier	 src TR
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
destOrdinal	TokenNameIdentifier	 dest Ordinal
=	TokenNameEQUAL	
destTR	TokenNameIdentifier	 dest TR
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
+	TokenNamePLUS	
" not found in destination"	TokenNameStringLiteral	 not found in destination
,	TokenNameCOMMA	
destOrdinal	TokenNameIdentifier	 dest Ordinal
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
destOrdinal	TokenNameIdentifier	 dest Ordinal
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
srcTR	TokenNameIdentifier	 src TR
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
destTR	TokenNameIdentifier	 dest TR
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAddEmpty	TokenNameIdentifier	 test Add Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
destTW	TokenNameIdentifier	 dest TW
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Author"	TokenNameStringLiteral	Author
,	TokenNameCOMMA	
"Rob Pike"	TokenNameStringLiteral	Rob Pike
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Aardvarks"	TokenNameStringLiteral	Aardvarks
,	TokenNameCOMMA	
"Bob"	TokenNameStringLiteral	Bob
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create an empty taxonomy 	TokenNameCOMMENT_LINE	create an empty taxonomy 
OrdinalMap	TokenNameIdentifier	 Ordinal Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
randomOrdinalMap	TokenNameIdentifier	 random Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
addTaxonomy	TokenNameIdentifier	 add Taxonomy
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAddToEmpty	TokenNameIdentifier	 test Add To Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
srcTW	TokenNameIdentifier	 src TW
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcTW	TokenNameIdentifier	 src TW
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Author"	TokenNameStringLiteral	Author
,	TokenNameCOMMA	
"Rob Pike"	TokenNameStringLiteral	Rob Pike
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcTW	TokenNameIdentifier	 src TW
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Aardvarks"	TokenNameStringLiteral	Aardvarks
,	TokenNameCOMMA	
"Bob"	TokenNameStringLiteral	Bob
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcTW	TokenNameIdentifier	 src TW
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
destTW	TokenNameIdentifier	 dest TW
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
randomOrdinalMap	TokenNameIdentifier	 random Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
addTaxonomy	TokenNameIdentifier	 add Taxonomy
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// A more comprehensive and big random test. 	TokenNameCOMMENT_LINE	A more comprehensive and big random test. 
@	TokenNameAT	
Nightly	TokenNameIdentifier	 Nightly
public	TokenNamepublic	
void	TokenNamevoid	
testBig	TokenNameIdentifier	 test Big
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
dotest	TokenNameIdentifier	 dotest
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dotest	TokenNameIdentifier	 dotest
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// really big 	TokenNameCOMMENT_LINE	really big 
dotest	TokenNameIdentifier	 dotest
(	TokenNameLPAREN	
400000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// a reasonable random test 	TokenNameCOMMENT_LINE	a reasonable random test 
public	TokenNamepublic	
void	TokenNamevoid	
testMedium	TokenNameIdentifier	 test Medium
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
numTests	TokenNameIdentifier	 num Tests
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
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
numTests	TokenNameIdentifier	 num Tests
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dotest	TokenNameIdentifier	 dotest
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
tw1	TokenNameIdentifier	 tw1
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw1	TokenNameIdentifier	 tw1
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Author"	TokenNameStringLiteral	Author
,	TokenNameCOMMA	
"Mark Twain"	TokenNameStringLiteral	Mark Twain
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw1	TokenNameIdentifier	 tw1
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Animals"	TokenNameStringLiteral	Animals
,	TokenNameCOMMA	
"Dog"	TokenNameStringLiteral	Dog
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw1	TokenNameIdentifier	 tw1
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Author"	TokenNameStringLiteral	Author
,	TokenNameCOMMA	
"Rob Pike"	TokenNameStringLiteral	Rob Pike
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
tw2	TokenNameIdentifier	 tw2
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw2	TokenNameIdentifier	 tw2
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Author"	TokenNameStringLiteral	Author
,	TokenNameCOMMA	
"Rob Pike"	TokenNameStringLiteral	Rob Pike
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw2	TokenNameIdentifier	 tw2
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"Aardvarks"	TokenNameStringLiteral	Aardvarks
,	TokenNameCOMMA	
"Bob"	TokenNameStringLiteral	Bob
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw2	TokenNameIdentifier	 tw2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
randomOrdinalMap	TokenNameIdentifier	 random Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw1	TokenNameIdentifier	 tw1
.	TokenNameDOT	
addTaxonomy	TokenNameIdentifier	 add Taxonomy
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tw1	TokenNameIdentifier	 tw1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConcurrency	TokenNameIdentifier	 test Concurrency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// tests that addTaxonomy and addCategory work in parallel 	TokenNameCOMMENT_LINE	tests that addTaxonomy and addCategory work in parallel 
final	TokenNamefinal	
int	TokenNameint	
numCategories	TokenNameIdentifier	 num Categories
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build an input taxonomy index 	TokenNameCOMMENT_LINE	build an input taxonomy index 
Directory	TokenNameIdentifier	 Directory
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
tw	TokenNameIdentifier	 tw
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
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
numCategories	TokenNameIdentifier	 num Categories
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tw	TokenNameIdentifier	 tw
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tw	TokenNameIdentifier	 tw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now add the taxonomy to an empty taxonomy, while adding the categories 	TokenNameCOMMENT_LINE	now add the taxonomy to an empty taxonomy, while adding the categories 
// again, in parallel -- in the end, no duplicate categories should exist. 	TokenNameCOMMENT_LINE	again, in parallel -- in the end, no duplicate categories should exist. 
Directory	TokenNameIdentifier	 Directory
dest	TokenNameIdentifier	 dest
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
destTW	TokenNameIdentifier	 dest TW
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyWriter	TokenNameIdentifier	 Directory Taxonomy Writer
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
numCategories	TokenNameIdentifier	 num Categories
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shouldn't happen - if it does, let the test fail on uncaught exception. 	TokenNameCOMMENT_LINE	shouldn't happen - if it does, let the test fail on uncaught exception. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OrdinalMap	TokenNameIdentifier	 Ordinal Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
MemoryOrdinalMap	TokenNameIdentifier	 Memory Ordinal Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
addTaxonomy	TokenNameIdentifier	 add Taxonomy
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destTW	TokenNameIdentifier	 dest TW
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now validate 	TokenNameCOMMENT_LINE	now validate 
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
dtr	TokenNameIdentifier	 dtr
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// +2 to account for the root category + "a" 	TokenNameCOMMENT_LINE	+2 to account for the root category + "a" 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
numCategories	TokenNameIdentifier	 num Categories
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dtr	TokenNameIdentifier	 dtr
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
categories	TokenNameIdentifier	 categories
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
dtr	TokenNameIdentifier	 dtr
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
dtr	TokenNameIdentifier	 dtr
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"category "	TokenNameStringLiteral	category 
+	TokenNamePLUS	
cat	TokenNameIdentifier	 cat
+	TokenNamePLUS	
" already existed"	TokenNameStringLiteral	 already existed
,	TokenNameCOMMA	
categories	TokenNameIdentifier	 categories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cat	TokenNameIdentifier	 cat
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dtr	TokenNameIdentifier	 dtr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

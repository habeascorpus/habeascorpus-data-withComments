/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.zip.ZipEntry. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.zip.ZipEntry. 
public	TokenNamepublic	
class	TokenNameclass	
ZipEntryTest	TokenNameIdentifier	 Zip Entry Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
ZipEntryTest	TokenNameIdentifier	 Zip Entry Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test handling of extra fields */	TokenNameCOMMENT_JAVADOC	 test handling of extra fields 
public	TokenNamepublic	
void	TokenNamevoid	
testExtraFields	TokenNameIdentifier	 test Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
0755	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"test/"	TokenNameStringLiteral	test/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data1	TokenNameIdentifier	 data1
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"first pass"	TokenNameStringLiteral	first pass
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
u	TokenNameIdentifier	 u
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u2	TokenNameIdentifier	 u2
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"second pass"	TokenNameStringLiteral	second pass
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"length second pass"	TokenNameStringLiteral	length second pass
,	TokenNameCOMMA	
data1	TokenNameIdentifier	 data1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u3	TokenNameIdentifier	 u3
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u3	TokenNameIdentifier	 u3
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u3	TokenNameIdentifier	 u3
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
u3	TokenNameIdentifier	 u3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"third pass"	TokenNameStringLiteral	third pass
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
removeExtraField	TokenNameIdentifier	 remove Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data3	TokenNameIdentifier	 data3
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"fourth pass"	TokenNameStringLiteral	fourth pass
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
u3	TokenNameIdentifier	 u3
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"length fourth pass"	TokenNameStringLiteral	length fourth pass
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
data3	TokenNameIdentifier	 data3
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
removeExtraField	TokenNameIdentifier	 remove Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should be no such element"	TokenNameStringLiteral	should be no such element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
nse	TokenNameIdentifier	 nse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * test handling of extra fields via central directory */	TokenNameCOMMENT_JAVADOC	 test handling of extra fields via central directory 
public	TokenNamepublic	
void	TokenNamevoid	
testExtraFieldMerging	TokenNameIdentifier	 test Extra Field Merging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
0755	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"test/"	TokenNameStringLiteral	test/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// merge 	TokenNameCOMMENT_LINE	merge 
// Header-ID 1 + length 1 + one byte of data 	TokenNameCOMMENT_LINE	Header-ID 1 + length 1 + one byte of data 
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setCentralDirectoryExtra	TokenNameIdentifier	 set Central Directory Extra
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"first pass"	TokenNameStringLiteral	first pass
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add new 	TokenNameCOMMENT_LINE	add new 
// Header-ID 2 + length 0 	TokenNameCOMMENT_LINE	Header-ID 2 + length 0 
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setCentralDirectoryExtra	TokenNameIdentifier	 set Central Directory Extra
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"second pass"	TokenNameStringLiteral	second pass
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// merge 	TokenNameCOMMENT_LINE	merge 
// Header-ID 2 + length 1 + one byte of data 	TokenNameCOMMENT_LINE	Header-ID 2 + length 1 + one byte of data 
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setExtra	TokenNameIdentifier	 set Extra
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
127	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"third pass"	TokenNameStringLiteral	third pass
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test handling of extra fields */	TokenNameCOMMENT_JAVADOC	 test handling of extra fields 
public	TokenNamepublic	
void	TokenNamevoid	
testAddAsFirstExtraField	TokenNameIdentifier	 test Add As First Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
0755	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u	TokenNameIdentifier	 u
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u	TokenNameIdentifier	 u
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"test/"	TokenNameStringLiteral	test/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setExtraFields	TokenNameIdentifier	 set Extra Fields
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
u	TokenNameIdentifier	 u
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data1	TokenNameIdentifier	 data1
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u2	TokenNameIdentifier	 u2
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u2	TokenNameIdentifier	 u2
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addAsFirstExtraField	TokenNameIdentifier	 add As First Extra Field
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtra	TokenNameIdentifier	 get Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"second pass"	TokenNameStringLiteral	second pass
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"length second pass"	TokenNameStringLiteral	length second pass
,	TokenNameCOMMA	
data1	TokenNameIdentifier	 data1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
u3	TokenNameIdentifier	 u3
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u3	TokenNameIdentifier	 u3
.	TokenNameDOT	
setHeaderId	TokenNameIdentifier	 set Header Id
(	TokenNameLPAREN	
new	TokenNamenew	
ZipShort	TokenNameIdentifier	 Zip Short
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
u3	TokenNameIdentifier	 u3
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addAsFirstExtraField	TokenNameIdentifier	 add As First Extra Field
(	TokenNameLPAREN	
u3	TokenNameIdentifier	 u3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraFields	TokenNameIdentifier	 get Extra Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"third pass"	TokenNameStringLiteral	third pass
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
u3	TokenNameIdentifier	 u3
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
u2	TokenNameIdentifier	 u2
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnixMode	TokenNameIdentifier	 test Unix Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setUnixMode	TokenNameIdentifier	 set Unix Mode
(	TokenNameLPAREN	
0755	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0755	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setUnixMode	TokenNameIdentifier	 set Unix Mode
(	TokenNameLPAREN	
0444	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0444	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"foo/"	TokenNameStringLiteral	foo/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setUnixMode	TokenNameIdentifier	 set Unix Mode
(	TokenNameLPAREN	
0777	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0777	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0x10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
setUnixMode	TokenNameIdentifier	 set Unix Mode
(	TokenNameLPAREN	
0577	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getPlatform	TokenNameIdentifier	 get Platform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0577	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0x11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExternalAttributes	TokenNameIdentifier	 get External Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test case for * <a href="https://issues.apache.org/jira/browse/COMPRESS-94" * >COMPRESS-94</a>. */	TokenNameCOMMENT_JAVADOC	 Test case for <a href="https://issues.apache.org/jira/browse/COMPRESS-94" >COMPRESS-94</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
testNotEquals	TokenNameIdentifier	 test Not Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry1	TokenNameIdentifier	 entry1
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry2	TokenNameIdentifier	 entry2
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
entry1	TokenNameIdentifier	 entry1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry2	TokenNameIdentifier	 entry2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

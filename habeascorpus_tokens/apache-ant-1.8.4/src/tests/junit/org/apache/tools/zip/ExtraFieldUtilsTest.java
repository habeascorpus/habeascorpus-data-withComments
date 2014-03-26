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
/** * JUnit 3 testcases for org.apache.tools.zip.ExtraFieldUtils. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.zip.ExtraFieldUtils. 
public	TokenNamepublic	
class	TokenNameclass	
ExtraFieldUtilsTest	TokenNameIdentifier	 Extra Field Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
implements	TokenNameimplements	
UnixStat	TokenNameIdentifier	 Unix Stat
{	TokenNameLBRACE	
public	TokenNamepublic	
ExtraFieldUtilsTest	TokenNameIdentifier	 Extra Field Utils Test
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
private	TokenNameprivate	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
private	TokenNameprivate	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
dummy	TokenNameIdentifier	 dummy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aLocal	TokenNameIdentifier	 a Local
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
0755	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dummy	TokenNameIdentifier	 dummy
=	TokenNameEQUAL	
new	TokenNamenew	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dummy	TokenNameIdentifier	 dummy
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
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
setLocalFileDataData	TokenNameIdentifier	 set Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
setCentralDirectoryData	TokenNameIdentifier	 set Central Directory Data
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aLocal	TokenNameIdentifier	 a Local
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dummyLocal	TokenNameIdentifier	 dummy Local
=	TokenNameEQUAL	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
dummyLocal	TokenNameIdentifier	 dummy Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
aLocal	TokenNameIdentifier	 a Local
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
getHeaderId	TokenNameIdentifier	 get Header Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
dummyLocal	TokenNameIdentifier	 dummy Local
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dummyLocal	TokenNameIdentifier	 dummy Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test parser. */	TokenNameCOMMENT_JAVADOC	 test parser. 
public	TokenNamepublic	
void	TokenNamevoid	
testParse	TokenNameIdentifier	 test Parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"number of fields"	TokenNameStringLiteral	number of fields
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 1"	TokenNameStringLiteral	type field 1
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mode field 1"	TokenNameStringLiteral	mode field 1
,	TokenNameCOMMA	
040755	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 2"	TokenNameStringLiteral	type field 2
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"data length field 2"	TokenNameStringLiteral	data length field 2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data2	TokenNameIdentifier	 data2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"data should be invalid"	TokenNameStringLiteral	data should be invalid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"message"	TokenNameStringLiteral	message
,	TokenNameCOMMA	
"bad extra field starting at "	TokenNameStringLiteral	bad extra field starting at 
+	TokenNamePLUS	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
". Block length of 1 bytes exceeds remaining data of 0 bytes."	TokenNameStringLiteral	. Block length of 1 bytes exceeds remaining data of 0 bytes.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParseWithRead	TokenNameIdentifier	 test Parse With Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"number of fields"	TokenNameStringLiteral	number of fields
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 1"	TokenNameStringLiteral	type field 1
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mode field 1"	TokenNameStringLiteral	mode field 1
,	TokenNameCOMMA	
040755	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 2"	TokenNameStringLiteral	type field 2
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"data length field 2"	TokenNameStringLiteral	data length field 2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
READ	TokenNameIdentifier	 READ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"number of fields"	TokenNameStringLiteral	number of fields
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 1"	TokenNameStringLiteral	type field 1
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mode field 1"	TokenNameStringLiteral	mode field 1
,	TokenNameCOMMA	
040755	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 2"	TokenNameStringLiteral	type field 2
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"data length field 2"	TokenNameStringLiteral	data length field 2
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"byte number "	TokenNameStringLiteral	byte number 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataData	TokenNameIdentifier	 get Local File Data Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testParseWithSkip	TokenNameIdentifier	 test Parse With Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
SKIP	TokenNameIdentifier	 SKIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"number of fields"	TokenNameStringLiteral	number of fields
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 1"	TokenNameStringLiteral	type field 1
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mode field 1"	TokenNameStringLiteral	mode field 1
,	TokenNameCOMMA	
040755	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 2"	TokenNameStringLiteral	type field 2
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
UnrecognizedExtraField	TokenNameIdentifier	 Unrecognized Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"data length field 2"	TokenNameStringLiteral	data length field 2
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalFileDataLength	TokenNameIdentifier	 get Local File Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
UnparseableExtraField	TokenNameIdentifier	 Unparseable Extra Field
.	TokenNameDOT	
SKIP	TokenNameIdentifier	 SKIP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"number of fields"	TokenNameStringLiteral	number of fields
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"type field 1"	TokenNameStringLiteral	type field 1
,	TokenNameCOMMA	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mode field 1"	TokenNameStringLiteral	mode field 1
,	TokenNameCOMMA	
040755	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AsiExtraField	TokenNameIdentifier	 Asi Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test merge methods */	TokenNameCOMMENT_JAVADOC	 Test merge methods 
public	TokenNamepublic	
void	TokenNamevoid	
testMerge	TokenNameIdentifier	 test Merge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
mergeLocalFileDataData	TokenNameIdentifier	 merge Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
dummy	TokenNameIdentifier	 dummy
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"local length"	TokenNameStringLiteral	local length
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"local byte "	TokenNameStringLiteral	local byte 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dummyCentral	TokenNameIdentifier	 dummy Central
=	TokenNameEQUAL	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
dummyCentral	TokenNameIdentifier	 dummy Central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
getCentralDirectoryLength	TokenNameIdentifier	 get Central Directory Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
dummyCentral	TokenNameIdentifier	 dummy Central
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dummyCentral	TokenNameIdentifier	 dummy Central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
central	TokenNameIdentifier	 central
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
mergeCentralDirectoryData	TokenNameIdentifier	 merge Central Directory Data
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
dummy	TokenNameIdentifier	 dummy
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"central length"	TokenNameStringLiteral	central length
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
central	TokenNameIdentifier	 central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
central	TokenNameIdentifier	 central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"central byte "	TokenNameStringLiteral	central byte 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
central	TokenNameIdentifier	 central
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMergeWithUnparseableData	TokenNameIdentifier	 test Merge With Unparseable Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
UnparseableExtraFieldData	TokenNameIdentifier	 Unparseable Extra Field Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
parseFromLocalFileData	TokenNameIdentifier	 parse From Local File Data
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
}	TokenNameRBRACE	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
mergeLocalFileDataData	TokenNameIdentifier	 merge Local File Data Data
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"local length"	TokenNameStringLiteral	local length
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
local	TokenNameIdentifier	 local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"local byte "	TokenNameStringLiteral	local byte 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dCentral	TokenNameIdentifier	 d Central
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getCentralDirectoryData	TokenNameIdentifier	 get Central Directory Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data2	TokenNameIdentifier	 data2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
dCentral	TokenNameIdentifier	 d Central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
dCentral	TokenNameIdentifier	 d Central
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
+	TokenNamePLUS	
aLocal	TokenNameIdentifier	 a Local
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
dCentral	TokenNameIdentifier	 d Central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
central	TokenNameIdentifier	 central
=	TokenNameEQUAL	
ExtraFieldUtils	TokenNameIdentifier	 Extra Field Utils
.	TokenNameDOT	
mergeCentralDirectoryData	TokenNameIdentifier	 merge Central Directory Data
(	TokenNameLPAREN	
new	TokenNamenew	
ZipExtraField	TokenNameIdentifier	 Zip Extra Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"central length"	TokenNameStringLiteral	central length
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
central	TokenNameIdentifier	 central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
central	TokenNameIdentifier	 central
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"central byte "	TokenNameStringLiteral	central byte 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
data2	TokenNameIdentifier	 data2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
central	TokenNameIdentifier	 central
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writable	TokenNameIdentifier	 Writable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapreduce	TokenNameIdentifier	 mapreduce
.	TokenNameDOT	
InputSplit	TokenNameIdentifier	 Input Split
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
extends	TokenNameextends	
InputSplit	TokenNameIdentifier	 Input Split
implements	TokenNameimplements	
Writable	TokenNameIdentifier	 Writable
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapred	TokenNameIdentifier	 mapred
.	TokenNameDOT	
InputSplit	TokenNameIdentifier	 Input Split
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
startToken	TokenNameIdentifier	 start Token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataNodes	TokenNameIdentifier	 data Nodes
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
startToken	TokenNameIdentifier	 start Token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
endToken	TokenNameIdentifier	 end Token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataNodes	TokenNameIdentifier	 data Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
startToken	TokenNameIdentifier	 start Token
,	TokenNameCOMMA	
endToken	TokenNameIdentifier	 end Token
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
dataNodes	TokenNameIdentifier	 data Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
startToken	TokenNameIdentifier	 start Token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
endToken	TokenNameIdentifier	 end Token
,	TokenNameCOMMA	
long	TokenNamelong	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataNodes	TokenNameIdentifier	 data Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
startToken	TokenNameIdentifier	 start Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
endToken	TokenNameIdentifier	 end Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startToken	TokenNameIdentifier	 start Token
=	TokenNameEQUAL	
startToken	TokenNameIdentifier	 start Token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataNodes	TokenNameIdentifier	 data Nodes
=	TokenNameEQUAL	
dataNodes	TokenNameIdentifier	 data Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStartToken	TokenNameIdentifier	 get Start Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startToken	TokenNameIdentifier	 start Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEndToken	TokenNameIdentifier	 get End Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endToken	TokenNameIdentifier	 end Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLength and getLocations satisfy the InputSplit abstraction 	TokenNameCOMMENT_LINE	getLength and getLocations satisfy the InputSplit abstraction 
public	TokenNamepublic	
long	TokenNamelong	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocations	TokenNameIdentifier	 get Locations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataNodes	TokenNameIdentifier	 data Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This should only be used by KeyspaceSplit.read(); 	TokenNameCOMMENT_LINE	This should only be used by KeyspaceSplit.read(); 
protected	TokenNameprotected	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// These three methods are for serializing and deserializing 	TokenNameCOMMENT_LINE	These three methods are for serializing and deserializing 
// KeyspaceSplits as needed by the Writable interface. 	TokenNameCOMMENT_LINE	KeyspaceSplits as needed by the Writable interface. 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
startToken	TokenNameIdentifier	 start Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
endToken	TokenNameIdentifier	 end Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
dataNodes	TokenNameIdentifier	 data Nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
endpoint	TokenNameIdentifier	 endpoint
:	TokenNameCOLON	
dataNodes	TokenNameIdentifier	 data Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
readFields	TokenNameIdentifier	 read Fields
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
startToken	TokenNameIdentifier	 start Token
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endToken	TokenNameIdentifier	 end Token
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numOfEndpoints	TokenNameIdentifier	 num Of Endpoints
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataNodes	TokenNameIdentifier	 data Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numOfEndpoints	TokenNameIdentifier	 num Of Endpoints
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
numOfEndpoints	TokenNameIdentifier	 num Of Endpoints
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataNodes	TokenNameIdentifier	 data Nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"ColumnFamilySplit("	TokenNameStringLiteral	ColumnFamilySplit(
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
startToken	TokenNameIdentifier	 start Token
+	TokenNamePLUS	
", '"	TokenNameStringLiteral	, '
+	TokenNamePLUS	
endToken	TokenNameIdentifier	 end Token
+	TokenNamePLUS	
']'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
" @"	TokenNameStringLiteral	 @
+	TokenNamePLUS	
(	TokenNameLPAREN	
dataNodes	TokenNameIdentifier	 data Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
dataNodes	TokenNameIdentifier	 data Nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnFamilySplit	TokenNameIdentifier	 Column Family Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
readFields	TokenNameIdentifier	 read Fields
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

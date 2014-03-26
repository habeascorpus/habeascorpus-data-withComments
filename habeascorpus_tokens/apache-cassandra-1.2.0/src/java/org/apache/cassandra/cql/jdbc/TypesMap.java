/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
.	TokenNameDOT	
jdbc	TokenNameIdentifier	 jdbc
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TypesMap	TokenNameIdentifier	 Types Map
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
AbstractJdbcType	TokenNameIdentifier	 Abstract Jdbc Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
AbstractJdbcType	TokenNameIdentifier	 Abstract Jdbc Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.AsciiType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.AsciiType
,	TokenNameCOMMA	
JdbcAscii	TokenNameIdentifier	 Jdbc Ascii
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.BooleanType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.BooleanType
,	TokenNameCOMMA	
JdbcBoolean	TokenNameIdentifier	 Jdbc Boolean
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.BytesType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.BytesType
,	TokenNameCOMMA	
JdbcBytes	TokenNameIdentifier	 Jdbc Bytes
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.CounterColumnType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.CounterColumnType
,	TokenNameCOMMA	
JdbcCounterColumn	TokenNameIdentifier	 Jdbc Counter Column
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.DateType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.DateType
,	TokenNameCOMMA	
JdbcDate	TokenNameIdentifier	 Jdbc Date
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.DecimalType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.DecimalType
,	TokenNameCOMMA	
JdbcDecimal	TokenNameIdentifier	 Jdbc Decimal
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.DoubleType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.DoubleType
,	TokenNameCOMMA	
JdbcDouble	TokenNameIdentifier	 Jdbc Double
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.FloatType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.FloatType
,	TokenNameCOMMA	
JdbcFloat	TokenNameIdentifier	 Jdbc Float
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.Int32Type"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.Int32Type
,	TokenNameCOMMA	
JdbcInt32	TokenNameIdentifier	 Jdbc Int32
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.InetAddressType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.InetAddressType
,	TokenNameCOMMA	
JdbcInetAddress	TokenNameIdentifier	 Jdbc Inet Address
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.IntegerType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.IntegerType
,	TokenNameCOMMA	
JdbcInteger	TokenNameIdentifier	 Jdbc Integer
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.LexicalUUIDType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.LexicalUUIDType
,	TokenNameCOMMA	
JdbcLexicalUUID	TokenNameIdentifier	 Jdbc Lexical UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.LongType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.LongType
,	TokenNameCOMMA	
JdbcLong	TokenNameIdentifier	 Jdbc Long
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.TimeUUIDType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.TimeUUIDType
,	TokenNameCOMMA	
JdbcTimeUUID	TokenNameIdentifier	 Jdbc Time UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.UTF8Type"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.UTF8Type
,	TokenNameCOMMA	
JdbcUTF8	TokenNameIdentifier	 Jdbc UT F8
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal.UUIDType"	TokenNameStringLiteral	org.apache.cassandra.db.marshal.UUIDType
,	TokenNameCOMMA	
JdbcUUID	TokenNameIdentifier	 Jdbc UUID
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
AbstractJdbcType	TokenNameIdentifier	 Abstract Jdbc Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getTypeForComparator	TokenNameIdentifier	 get Type For Comparator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If not fully qualified, assume it's the short name for a built-in. 	TokenNameCOMMENT_LINE	If not fully qualified, assume it's the short name for a built-in. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"org.apache.cassandra.db.marshal."	TokenNameStringLiteral	org.apache.cassandra.db.marshal.
+	TokenNamePLUS	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

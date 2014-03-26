/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
SchemaLoader	TokenNameIdentifier	 Schema Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
EmbeddedCassandraService	TokenNameIdentifier	 Embedded Cassandra Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
TException	TokenNameIdentifier	 T Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
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
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CliTest	TokenNameIdentifier	 Cli Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
// please add new statements here so they could be auto-runned by this test. 	TokenNameCOMMENT_LINE	please add new statements here so they could be auto-runned by this test. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
statements	TokenNameIdentifier	 statements
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"use TestKeySpace;"	TokenNameStringLiteral	use TestKeySpace;
,	TokenNameCOMMA	
"create column family SecondaryIndicesWithoutIdxName"	TokenNameStringLiteral	create column family SecondaryIndicesWithoutIdxName
+	TokenNamePLUS	
" with comparator = UTF8Type"	TokenNameStringLiteral	 with comparator = UTF8Type
+	TokenNamePLUS	
" and default_validation_class = UTF8Type"	TokenNameStringLiteral	 and default_validation_class = UTF8Type
+	TokenNamePLUS	
" and column_metadata = [{column_name: profileId, validation_class: UTF8Type, index_type: KEYS}];"	TokenNameStringLiteral	 and column_metadata = [{column_name: profileId, validation_class: UTF8Type, index_type: KEYS}];
,	TokenNameCOMMA	
"update column family SecondaryIndicesWithoutIdxName"	TokenNameStringLiteral	update column family SecondaryIndicesWithoutIdxName
+	TokenNamePLUS	
" with column_metadata = "	TokenNameStringLiteral	 with column_metadata = 
+	TokenNamePLUS	
"[{column_name: profileId, validation_class: UTF8Type, index_type: KEYS},"	TokenNameStringLiteral	[{column_name: profileId, validation_class: UTF8Type, index_type: KEYS},
+	TokenNamePLUS	
"{column_name: postedDate, validation_class: LongType}];"	TokenNameStringLiteral	{column_name: postedDate, validation_class: LongType}];
,	TokenNameCOMMA	
"create column family 123 with comparator=UTF8Type and column_metadata=[{ column_name:world, validation_class:IntegerType, index_type:0, index_name:IdxName }, "	TokenNameStringLiteral	create column family 123 with comparator=UTF8Type and column_metadata=[{ column_name:world, validation_class:IntegerType, index_type:0, index_name:IdxName }, 
+	TokenNamePLUS	
"{ column_name:world2, validation_class:LongType, index_type:KEYS, index_name:LongIdxName}, "	TokenNameStringLiteral	{ column_name:world2, validation_class:LongType, index_type:KEYS, index_name:LongIdxName}, 
+	TokenNamePLUS	
"{ column_name:617070, validation_class:UTF8Type, index_type:KEYS }, "	TokenNameStringLiteral	{ column_name:617070, validation_class:UTF8Type, index_type:KEYS }, 
+	TokenNamePLUS	
"{ column_name:28292, validation_class:UTF8Type, index_type:CUSTOM, index_options:{class_name:'org.apache.cassandra.db.index.keys.KeysIndex', foo:bar}},"	TokenNameStringLiteral	{ column_name:28292, validation_class:UTF8Type, index_type:CUSTOM, index_options:{class_name:'org.apache.cassandra.db.index.keys.KeysIndex', foo:bar}},
+	TokenNamePLUS	
"{ column_name:'-617071', validation_class:UTF8Type, index_type:KEYS },"	TokenNameStringLiteral	{ column_name:'-617071', validation_class:UTF8Type, index_type:KEYS },
+	TokenNamePLUS	
"{ column_name:time_spent_uuid, validation_class:TimeUUIDType}] and default_validation_class=UTF8Type;"	TokenNameStringLiteral	{ column_name:time_spent_uuid, validation_class:TimeUUIDType}] and default_validation_class=UTF8Type;
,	TokenNameCOMMA	
"assume 123 keys as utf8;"	TokenNameStringLiteral	assume 123 keys as utf8;
,	TokenNameCOMMA	
"set 123[hello][world] = 123848374878933948398384;"	TokenNameStringLiteral	set 123[hello][world] = 123848374878933948398384;
,	TokenNameCOMMA	
"set 123[hello][test_quote] = 'value\'';"	TokenNameStringLiteral	set 123[hello][test_quote] = 'value\'';
,	TokenNameCOMMA	
"set 123['k\'ey'][VALUE] = 'VAL';"	TokenNameStringLiteral	set 123['k\'ey'][VALUE] = 'VAL';
,	TokenNameCOMMA	
"set 123['k\'ey'][VALUE] = 'VAL\'';"	TokenNameStringLiteral	set 123['k\'ey'][VALUE] = 'VAL\'';
,	TokenNameCOMMA	
"set 123[hello][-31337] = 'some string value';"	TokenNameStringLiteral	set 123[hello][-31337] = 'some string value';
,	TokenNameCOMMA	
"list 123;"	TokenNameStringLiteral	list 123;
,	TokenNameCOMMA	
"list 123[:];"	TokenNameStringLiteral	list 123[:];
,	TokenNameCOMMA	
"list 123[456:];"	TokenNameStringLiteral	list 123[456:];
,	TokenNameCOMMA	
"list 123 limit 5;"	TokenNameStringLiteral	list 123 limit 5;
,	TokenNameCOMMA	
"list 123[12:15] limit 20;"	TokenNameStringLiteral	list 123[12:15] limit 20;
,	TokenNameCOMMA	
"list 123[12:15] columns 2;"	TokenNameStringLiteral	list 123[12:15] columns 2;
,	TokenNameCOMMA	
"list 123 columns 2 reversed;"	TokenNameStringLiteral	list 123 columns 2 reversed;
,	TokenNameCOMMA	
"list 123 limit 10 columns 2 reversed;"	TokenNameStringLiteral	list 123 limit 10 columns 2 reversed;
,	TokenNameCOMMA	
"get 123[hello][-31337];"	TokenNameStringLiteral	get 123[hello][-31337];
,	TokenNameCOMMA	
"get 123[hello][world];"	TokenNameStringLiteral	get 123[hello][world];
,	TokenNameCOMMA	
"get 123[hello][test_quote];"	TokenNameStringLiteral	get 123[hello][test_quote];
,	TokenNameCOMMA	
"get 123['k\'ey'][VALUE]"	TokenNameStringLiteral	get 123['k\'ey'][VALUE]
,	TokenNameCOMMA	
"set 123[hello][-31337] = -23876;"	TokenNameStringLiteral	set 123[hello][-31337] = -23876;
,	TokenNameCOMMA	
"set 123[hello][world2] = 15;"	TokenNameStringLiteral	set 123[hello][world2] = 15;
,	TokenNameCOMMA	
"get 123 where world2 = long(15);"	TokenNameStringLiteral	get 123 where world2 = long(15);
,	TokenNameCOMMA	
"get 123 where world2 = long(15);"	TokenNameStringLiteral	get 123 where world2 = long(15);
,	TokenNameCOMMA	
"get 123 where world2 = long(15);"	TokenNameStringLiteral	get 123 where world2 = long(15);
,	TokenNameCOMMA	
"del 123[utf8('hello')][utf8('world')];"	TokenNameStringLiteral	del 123[utf8('hello')][utf8('world')];
,	TokenNameCOMMA	
"del 123[hello][world2];"	TokenNameStringLiteral	del 123[hello][world2];
,	TokenNameCOMMA	
"set 123['hello'][time_spent_uuid] = timeuuid(a8098c1a-f86e-11da-bd1a-00112444be1e);"	TokenNameStringLiteral	set 123['hello'][time_spent_uuid] = timeuuid(a8098c1a-f86e-11da-bd1a-00112444be1e);
,	TokenNameCOMMA	
"create column family CF2 with comparator=IntegerType and default_validation_class=AsciiType;"	TokenNameStringLiteral	create column family CF2 with comparator=IntegerType and default_validation_class=AsciiType;
,	TokenNameCOMMA	
"assume CF2 keys as utf8;"	TokenNameStringLiteral	assume CF2 keys as utf8;
,	TokenNameCOMMA	
"set CF2['key'][98349387493847748398334] = 'some text';"	TokenNameStringLiteral	set CF2['key'][98349387493847748398334] = 'some text';
,	TokenNameCOMMA	
"get CF2['key'][98349387493847748398334];"	TokenNameStringLiteral	get CF2['key'][98349387493847748398334];
,	TokenNameCOMMA	
"set CF2['key'][98349387493] = 'some text other';"	TokenNameStringLiteral	set CF2['key'][98349387493] = 'some text other';
,	TokenNameCOMMA	
"get CF2['key'][98349387493];"	TokenNameStringLiteral	get CF2['key'][98349387493];
,	TokenNameCOMMA	
"create column family CF3 with comparator=UTF8Type and column_metadata=[{column_name:'big world', validation_class:LongType, index_type:KEYS, index_name:WorldIdx}];"	TokenNameStringLiteral	create column family CF3 with comparator=UTF8Type and column_metadata=[{column_name:'big world', validation_class:LongType, index_type:KEYS, index_name:WorldIdx}];
,	TokenNameCOMMA	
"assume CF3 keys as utf8;"	TokenNameStringLiteral	assume CF3 keys as utf8;
,	TokenNameCOMMA	
"set CF3['hello']['big world'] = 3748;"	TokenNameStringLiteral	set CF3['hello']['big world'] = 3748;
,	TokenNameCOMMA	
"get CF3['hello']['big world'];"	TokenNameStringLiteral	get CF3['hello']['big world'];
,	TokenNameCOMMA	
"list CF3;"	TokenNameStringLiteral	list CF3;
,	TokenNameCOMMA	
"list CF3[:];"	TokenNameStringLiteral	list CF3[:];
,	TokenNameCOMMA	
"list CF3[h:];"	TokenNameStringLiteral	list CF3[h:];
,	TokenNameCOMMA	
"list CF3 limit 10;"	TokenNameStringLiteral	list CF3 limit 10;
,	TokenNameCOMMA	
"list CF3[h:] limit 10;"	TokenNameStringLiteral	list CF3[h:] limit 10;
,	TokenNameCOMMA	
"create column family CF4 with comparator=IntegerType and column_metadata=[{column_name:9999, validation_class:LongType}];"	TokenNameStringLiteral	create column family CF4 with comparator=IntegerType and column_metadata=[{column_name:9999, validation_class:LongType}];
,	TokenNameCOMMA	
"assume CF4 keys as utf8;"	TokenNameStringLiteral	assume CF4 keys as utf8;
,	TokenNameCOMMA	
"set CF4['hello'][9999] = 1234;"	TokenNameStringLiteral	set CF4['hello'][9999] = 1234;
,	TokenNameCOMMA	
"get CF4['hello'][9999];"	TokenNameStringLiteral	get CF4['hello'][9999];
,	TokenNameCOMMA	
"get CF4['hello'][9999] as Long;"	TokenNameStringLiteral	get CF4['hello'][9999] as Long;
,	TokenNameCOMMA	
"get CF4['hello'][9999] as Bytes;"	TokenNameStringLiteral	get CF4['hello'][9999] as Bytes;
,	TokenNameCOMMA	
"set CF4['hello'][9999] = Long(1234);"	TokenNameStringLiteral	set CF4['hello'][9999] = Long(1234);
,	TokenNameCOMMA	
"get CF4['hello'][9999];"	TokenNameStringLiteral	get CF4['hello'][9999];
,	TokenNameCOMMA	
"get CF4['hello'][9999] as Long;"	TokenNameStringLiteral	get CF4['hello'][9999] as Long;
,	TokenNameCOMMA	
"del CF4['hello'][9999];"	TokenNameStringLiteral	del CF4['hello'][9999];
,	TokenNameCOMMA	
"get CF4['hello'][9999];"	TokenNameStringLiteral	get CF4['hello'][9999];
,	TokenNameCOMMA	
"create column family sCf1 with column_type=Super and comparator=IntegerType and subcomparator=LongType and column_metadata=[{column_name:9999, validation_class:LongType}];"	TokenNameStringLiteral	create column family sCf1 with column_type=Super and comparator=IntegerType and subcomparator=LongType and column_metadata=[{column_name:9999, validation_class:LongType}];
,	TokenNameCOMMA	
"assume sCf1 keys as utf8;"	TokenNameStringLiteral	assume sCf1 keys as utf8;
,	TokenNameCOMMA	
"set sCf1['hello'][1][9999] = 1234;"	TokenNameStringLiteral	set sCf1['hello'][1][9999] = 1234;
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral	get sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999] as Long;"	TokenNameStringLiteral	get sCf1['hello'][1][9999] as Long;
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999] as Bytes;"	TokenNameStringLiteral	get sCf1['hello'][1][9999] as Bytes;
,	TokenNameCOMMA	
"set sCf1['hello'][1][9999] = Long(1234);"	TokenNameStringLiteral	set sCf1['hello'][1][9999] = Long(1234);
,	TokenNameCOMMA	
"set sCf1['hello'][-1][-12] = Long(5678);"	TokenNameStringLiteral	set sCf1['hello'][-1][-12] = Long(5678);
,	TokenNameCOMMA	
"get sCf1['hello'][-1][-12];"	TokenNameStringLiteral	get sCf1['hello'][-1][-12];
,	TokenNameCOMMA	
"set sCf1['hello'][-1][-12] = -340897;"	TokenNameStringLiteral	set sCf1['hello'][-1][-12] = -340897;
,	TokenNameCOMMA	
"set sCf1['hello'][-1][-12] = integer(-340897);"	TokenNameStringLiteral	set sCf1['hello'][-1][-12] = integer(-340897);
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral	get sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999] as Long;"	TokenNameStringLiteral	get sCf1['hello'][1][9999] as Long;
,	TokenNameCOMMA	
"del sCf1['hello'][1][9999];"	TokenNameStringLiteral	del sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral	get sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"set sCf1['hello'][1][9999] = Long(1234);"	TokenNameStringLiteral	set sCf1['hello'][1][9999] = Long(1234);
,	TokenNameCOMMA	
"del sCf1['hello'][9999];"	TokenNameStringLiteral	del sCf1['hello'][9999];
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral	get sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"create column family 'Counter1' with comparator=UTF8Type and default_validation_class=CounterColumnType;"	TokenNameStringLiteral	create column family 'Counter1' with comparator=UTF8Type and default_validation_class=CounterColumnType;
,	TokenNameCOMMA	
"assume Counter1 keys as utf8;"	TokenNameStringLiteral	assume Counter1 keys as utf8;
,	TokenNameCOMMA	
"incr Counter1['hello']['cassandra'];"	TokenNameStringLiteral	incr Counter1['hello']['cassandra'];
,	TokenNameCOMMA	
"incr Counter1['hello']['cassandra'] by 3;"	TokenNameStringLiteral	incr Counter1['hello']['cassandra'] by 3;
,	TokenNameCOMMA	
"incr Counter1['hello']['cassandra'] by -2;"	TokenNameStringLiteral	incr Counter1['hello']['cassandra'] by -2;
,	TokenNameCOMMA	
"decr Counter1['hello']['cassandra'];"	TokenNameStringLiteral	decr Counter1['hello']['cassandra'];
,	TokenNameCOMMA	
"decr Counter1['hello']['cassandra'] by 3;"	TokenNameStringLiteral	decr Counter1['hello']['cassandra'] by 3;
,	TokenNameCOMMA	
"decr Counter1['hello']['cassandra'] by -2;"	TokenNameStringLiteral	decr Counter1['hello']['cassandra'] by -2;
,	TokenNameCOMMA	
"get Counter1['hello']['cassandra'];"	TokenNameStringLiteral	get Counter1['hello']['cassandra'];
,	TokenNameCOMMA	
"get Counter1['hello'];"	TokenNameStringLiteral	get Counter1['hello'];
,	TokenNameCOMMA	
"truncate 123;"	TokenNameStringLiteral	truncate 123;
,	TokenNameCOMMA	
"drop index on '123'.world2;"	TokenNameStringLiteral	drop index on '123'.world2;
,	TokenNameCOMMA	
"drop index on '123'.617070;"	TokenNameStringLiteral	drop index on '123'.617070;
,	TokenNameCOMMA	
"drop index on '123'.'-617071';"	TokenNameStringLiteral	drop index on '123'.'-617071';
,	TokenNameCOMMA	
"drop index on CF3.'big world';"	TokenNameStringLiteral	drop index on CF3.'big world';
,	TokenNameCOMMA	
"update keyspace TestKeySpace with durable_writes = false;"	TokenNameStringLiteral	update keyspace TestKeySpace with durable_writes = false;
,	TokenNameCOMMA	
"assume 123 comparator as utf8;"	TokenNameStringLiteral	assume 123 comparator as utf8;
,	TokenNameCOMMA	
"assume 123 sub_comparator as integer;"	TokenNameStringLiteral	assume 123 sub_comparator as integer;
,	TokenNameCOMMA	
"assume 123 validator as lexicaluuid;"	TokenNameStringLiteral	assume 123 validator as lexicaluuid;
,	TokenNameCOMMA	
"assume 123 keys as timeuuid;"	TokenNameStringLiteral	assume 123 keys as timeuuid;
,	TokenNameCOMMA	
"create column family CF7;"	TokenNameStringLiteral	create column family CF7;
,	TokenNameCOMMA	
"assume CF7 keys as utf8;"	TokenNameStringLiteral	assume CF7 keys as utf8;
,	TokenNameCOMMA	
"set CF7[1][timeuuid()] = utf8(test1);"	TokenNameStringLiteral	set CF7[1][timeuuid()] = utf8(test1);
,	TokenNameCOMMA	
"set CF7[2][lexicaluuid()] = utf8('hello world!');"	TokenNameStringLiteral	set CF7[2][lexicaluuid()] = utf8('hello world!');
,	TokenNameCOMMA	
"set CF7[3][lexicaluuid(550e8400-e29b-41d4-a716-446655440000)] = utf8(test2);"	TokenNameStringLiteral	set CF7[3][lexicaluuid(550e8400-e29b-41d4-a716-446655440000)] = utf8(test2);
,	TokenNameCOMMA	
"set CF7[key2][timeuuid()] = utf8(test3);"	TokenNameStringLiteral	set CF7[key2][timeuuid()] = utf8(test3);
,	TokenNameCOMMA	
"assume CF7 comparator as lexicaluuid;"	TokenNameStringLiteral	assume CF7 comparator as lexicaluuid;
,	TokenNameCOMMA	
"assume CF7 keys as utf8;"	TokenNameStringLiteral	assume CF7 keys as utf8;
,	TokenNameCOMMA	
"list CF7;"	TokenNameStringLiteral	list CF7;
,	TokenNameCOMMA	
"get CF7[3];"	TokenNameStringLiteral	get CF7[3];
,	TokenNameCOMMA	
"get CF7[3][lexicaluuid(550e8400-e29b-41d4-a716-446655440000)];"	TokenNameStringLiteral	get CF7[3][lexicaluuid(550e8400-e29b-41d4-a716-446655440000)];
,	TokenNameCOMMA	
"get sCf1['hello'][1][9999];"	TokenNameStringLiteral	get sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"set sCf1['hello'][1][9999] = 938;"	TokenNameStringLiteral	set sCf1['hello'][1][9999] = 938;
,	TokenNameCOMMA	
"set sCf1['hello'][1][9999] = 938 with ttl = 30;"	TokenNameStringLiteral	set sCf1['hello'][1][9999] = 938 with ttl = 30;
,	TokenNameCOMMA	
"set sCf1['hello'][1][9999] = 938 with ttl = 560;"	TokenNameStringLiteral	set sCf1['hello'][1][9999] = 938 with ttl = 560;
,	TokenNameCOMMA	
"count sCf1[hello];"	TokenNameStringLiteral	count sCf1[hello];
,	TokenNameCOMMA	
"count sCf1[utf8('hello')];"	TokenNameStringLiteral	count sCf1[utf8('hello')];
,	TokenNameCOMMA	
"count sCf1[utf8('hello')][integer(1)];"	TokenNameStringLiteral	count sCf1[utf8('hello')][integer(1)];
,	TokenNameCOMMA	
"count sCf1[hello][1];"	TokenNameStringLiteral	count sCf1[hello][1];
,	TokenNameCOMMA	
"list sCf1;"	TokenNameStringLiteral	list sCf1;
,	TokenNameCOMMA	
"del sCf1['hello'][1][9999];"	TokenNameStringLiteral	del sCf1['hello'][1][9999];
,	TokenNameCOMMA	
"assume sCf1 comparator as utf8;"	TokenNameStringLiteral	assume sCf1 comparator as utf8;
,	TokenNameCOMMA	
"create column family CF8;"	TokenNameStringLiteral	create column family CF8;
,	TokenNameCOMMA	
"drop column family cF8;"	TokenNameStringLiteral	drop column family cF8;
,	TokenNameCOMMA	
"create keyspace TESTIN;"	TokenNameStringLiteral	create keyspace TESTIN;
,	TokenNameCOMMA	
"drop keyspace tesTIN;"	TokenNameStringLiteral	drop keyspace tesTIN;
,	TokenNameCOMMA	
"update column family 123 with comparator=UTF8Type and column_metadata=[];"	TokenNameStringLiteral	update column family 123 with comparator=UTF8Type and column_metadata=[];
,	TokenNameCOMMA	
"drop column family 123;"	TokenNameStringLiteral	drop column family 123;
,	TokenNameCOMMA	
"create column family myCF with column_type='Super' and comparator='UTF8Type' AND subcomparator='UTF8Type' AND default_validation_class=AsciiType;"	TokenNameStringLiteral	create column family myCF with column_type='Super' and comparator='UTF8Type' AND subcomparator='UTF8Type' AND default_validation_class=AsciiType;
,	TokenNameCOMMA	
"assume myCF keys as utf8;"	TokenNameStringLiteral	assume myCF keys as utf8;
,	TokenNameCOMMA	
"create column family Countries with comparator=UTF8Type and column_metadata=[ {column_name: name, validation_class: UTF8Type} ];"	TokenNameStringLiteral	create column family Countries with comparator=UTF8Type and column_metadata=[ {column_name: name, validation_class: UTF8Type} ];
,	TokenNameCOMMA	
"set Countries[11][name] = USA;"	TokenNameStringLiteral	set Countries[11][name] = USA;
,	TokenNameCOMMA	
"get Countries[11][name];"	TokenNameStringLiteral	get Countries[11][name];
,	TokenNameCOMMA	
"update column family Countries with compaction_strategy = 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy';"	TokenNameStringLiteral	update column family Countries with compaction_strategy = 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy';
,	TokenNameCOMMA	
"create column family Cities with compaction_strategy = 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy' and compaction_strategy_options = {min_sstable_size:1024};"	TokenNameStringLiteral	create column family Cities with compaction_strategy = 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy' and compaction_strategy_options = {min_sstable_size:1024};
,	TokenNameCOMMA	
"set myCF['key']['scName']['firstname'] = 'John';"	TokenNameStringLiteral	set myCF['key']['scName']['firstname'] = 'John';
,	TokenNameCOMMA	
"get myCF['key']['scName']"	TokenNameStringLiteral	get myCF['key']['scName']
,	TokenNameCOMMA	
"assume CF3 keys as utf8;"	TokenNameStringLiteral	assume CF3 keys as utf8;
,	TokenNameCOMMA	
"use TestKEYSpace;"	TokenNameStringLiteral	use TestKEYSpace;
,	TokenNameCOMMA	
"update keyspace TestKeySpace with placement_strategy='org.apache.cassandra.locator.NetworkTopologyStrategy';"	TokenNameStringLiteral	update keyspace TestKeySpace with placement_strategy='org.apache.cassandra.locator.NetworkTopologyStrategy';
,	TokenNameCOMMA	
"update keyspace TestKeySpace with strategy_options=[{DC1:3, DC2:4, DC5:1}];"	TokenNameStringLiteral	update keyspace TestKeySpace with strategy_options=[{DC1:3, DC2:4, DC5:1}];
,	TokenNameCOMMA	
"describe cluster;"	TokenNameStringLiteral	describe cluster;
,	TokenNameCOMMA	
"help describe cluster;"	TokenNameStringLiteral	help describe cluster;
,	TokenNameCOMMA	
"show cluster name"	TokenNameStringLiteral	show cluster name
,	TokenNameCOMMA	
"show api version"	TokenNameStringLiteral	show api version
,	TokenNameCOMMA	
"help help"	TokenNameStringLiteral	help help
,	TokenNameCOMMA	
"help connect"	TokenNameStringLiteral	help connect
,	TokenNameCOMMA	
"help use"	TokenNameStringLiteral	help use
,	TokenNameCOMMA	
"help describe"	TokenNameStringLiteral	help describe
,	TokenNameCOMMA	
"HELP exit"	TokenNameStringLiteral	HELP exit
,	TokenNameCOMMA	
"help QUIT"	TokenNameStringLiteral	help QUIT
,	TokenNameCOMMA	
"help show cluster name"	TokenNameStringLiteral	help show cluster name
,	TokenNameCOMMA	
"help show keyspaces"	TokenNameStringLiteral	help show keyspaces
,	TokenNameCOMMA	
"help show schema"	TokenNameStringLiteral	help show schema
,	TokenNameCOMMA	
"help show api version"	TokenNameStringLiteral	help show api version
,	TokenNameCOMMA	
"help create keyspace"	TokenNameStringLiteral	help create keyspace
,	TokenNameCOMMA	
"HELP update KEYSPACE"	TokenNameStringLiteral	HELP update KEYSPACE
,	TokenNameCOMMA	
"HELP CREATE column FAMILY"	TokenNameStringLiteral	HELP CREATE column FAMILY
,	TokenNameCOMMA	
"HELP UPDATE COLUMN family"	TokenNameStringLiteral	HELP UPDATE COLUMN family
,	TokenNameCOMMA	
"HELP drop keyspace"	TokenNameStringLiteral	HELP drop keyspace
,	TokenNameCOMMA	
"help drop column family"	TokenNameStringLiteral	help drop column family
,	TokenNameCOMMA	
"HELP GET"	TokenNameStringLiteral	HELP GET
,	TokenNameCOMMA	
"HELP set"	TokenNameStringLiteral	HELP set
,	TokenNameCOMMA	
"HELP DEL"	TokenNameStringLiteral	HELP DEL
,	TokenNameCOMMA	
"HELP count"	TokenNameStringLiteral	HELP count
,	TokenNameCOMMA	
"HELP list"	TokenNameStringLiteral	HELP list
,	TokenNameCOMMA	
"HELP TRUNCATE"	TokenNameStringLiteral	HELP TRUNCATE
,	TokenNameCOMMA	
"help assume"	TokenNameStringLiteral	help assume
,	TokenNameCOMMA	
"HELP"	TokenNameStringLiteral	HELP
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"show schema"	TokenNameStringLiteral	show schema
,	TokenNameCOMMA	
"show schema TestKeySpace"	TokenNameStringLiteral	show schema TestKeySpace
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testCli	TokenNameIdentifier	 test Cli
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
TException	TokenNameIdentifier	 T Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
,	TokenNameCOMMA	
TimedOutException	TokenNameIdentifier	 Timed Out Exception
,	TokenNameCOMMA	
NotFoundException	TokenNameIdentifier	 Not Found Exception
,	TokenNameCOMMA	
SchemaDisagreementException	TokenNameIdentifier	 Schema Disagreement Exception
,	TokenNameCOMMA	
NoSuchFieldException	TokenNameIdentifier	 No Such Field Exception
,	TokenNameCOMMA	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
,	TokenNameCOMMA	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
{	TokenNameLBRACE	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Schema are now written on disk and will be reloaded 	TokenNameCOMMENT_LINE	Schema are now written on disk and will be reloaded 
new	TokenNamenew	
EmbeddedCassandraService	TokenNameIdentifier	 Embedded Cassandra Service
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// new error/output streams for CliSessionState 	TokenNameCOMMENT_LINE	new error/output streams for CliSessionState 
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
errStream	TokenNameIdentifier	 err Stream
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
outStream	TokenNameIdentifier	 out Stream
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// checking if we can connect to the running cassandra node on localhost 	TokenNameCOMMENT_LINE	checking if we can connect to the running cassandra node on localhost 
CliMain	TokenNameIdentifier	 Cli Main
.	TokenNameDOT	
connect	TokenNameIdentifier	 connect
(	TokenNameLPAREN	
"127.0.0.1"	TokenNameStringLiteral	127.0.0.1
,	TokenNameCOMMA	
9170	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// setting new output stream 	TokenNameCOMMENT_LINE	setting new output stream 
CliMain	TokenNameIdentifier	 Cli Main
.	TokenNameDOT	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
outStream	TokenNameIdentifier	 out Stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CliMain	TokenNameIdentifier	 Cli Main
.	TokenNameDOT	
sessionState	TokenNameIdentifier	 session State
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
errStream	TokenNameIdentifier	 err Stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// re-creating keyspace for tests 	TokenNameCOMMENT_LINE	re-creating keyspace for tests 
try	TokenNametry	
{	TokenNameLBRACE	
// dropping in case it exists e.g. could be left from previous run 	TokenNameCOMMENT_LINE	dropping in case it exists e.g. could be left from previous run 
CliMain	TokenNameIdentifier	 Cli Main
.	TokenNameDOT	
processStatement	TokenNameIdentifier	 process Statement
(	TokenNameLPAREN	
"drop keyspace TestKeySpace;"	TokenNameStringLiteral	drop keyspace TestKeySpace;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO check before drop so we don't have this fragile ignored exception block 	TokenNameCOMMENT_LINE	TODO check before drop so we don't have this fragile ignored exception block 
}	TokenNameRBRACE	
CliMain	TokenNameIdentifier	 Cli Main
.	TokenNameDOT	
processStatement	TokenNameIdentifier	 process Statement
(	TokenNameLPAREN	
"create keyspace TestKeySpace;"	TokenNameStringLiteral	create keyspace TestKeySpace;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
statement	TokenNameIdentifier	 statement
:	TokenNameCOLON	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errStream	TokenNameIdentifier	 err Stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Executing statement: " + statement); 	TokenNameCOMMENT_LINE	System.out.println("Executing statement: " + statement); 
CliMain	TokenNameIdentifier	 Cli Main
.	TokenNameDOT	
processStatement	TokenNameIdentifier	 process Statement
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Result:\n" + result); 	TokenNameCOMMENT_LINE	System.out.println("Result:\n" + result); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
errStream	TokenNameIdentifier	 err Stream
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" processing "	TokenNameStringLiteral	 processing 
+	TokenNamePLUS	
statement	TokenNameIdentifier	 statement
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
errStream	TokenNameIdentifier	 err Stream
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"drop "	TokenNameStringLiteral	drop 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"create "	TokenNameStringLiteral	create 
)	TokenNameRPAREN	
||	TokenNameOR_OR	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"update "	TokenNameStringLiteral	update 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"(.{8})-(.{4})-(.{4})-(.{4})-(.{12}).*"	TokenNameStringLiteral	(.{8})-(.{4})-(.{4})-(.{4})-(.{12}).*
,	TokenNameCOMMA	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
DOTALL	TokenNameIdentifier	 DOTALL
)	TokenNameRPAREN	
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
""%s" failed: %s"	TokenNameStringLiteral	"%s" failed: %s
,	TokenNameCOMMA	
statement	TokenNameIdentifier	 statement
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"set "	TokenNameStringLiteral	set 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Value inserted."	TokenNameStringLiteral	Value inserted.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Elapsed time:"	TokenNameStringLiteral	Elapsed time:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"incr "	TokenNameStringLiteral	incr 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Value incremented."	TokenNameStringLiteral	Value incremented.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"decr "	TokenNameStringLiteral	decr 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Value decremented."	TokenNameStringLiteral	Value decremented.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"get "	TokenNameStringLiteral	get 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"where"	TokenNameStringLiteral	where
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-------------------"	TokenNameStringLiteral	-------------------
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
+	TokenNamePLUS	
"RowKey:"	TokenNameStringLiteral	RowKey:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Counter"	TokenNameStringLiteral	Counter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"=> (counter="	TokenNameStringLiteral	=> (counter=
)	TokenNameRPAREN	
||	TokenNameOR_OR	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Value was not found"	TokenNameStringLiteral	Value was not found
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"=> (column="	TokenNameStringLiteral	=> (column=
)	TokenNameRPAREN	
||	TokenNameOR_OR	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Value was not found"	TokenNameStringLiteral	Value was not found
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"Elapsed time:"	TokenNameStringLiteral	Elapsed time:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"truncate "	TokenNameStringLiteral	truncate 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
" truncated."	TokenNameStringLiteral	 truncated.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"assume "	TokenNameStringLiteral	assume 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"successfully."	TokenNameStringLiteral	successfully.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
outStream	TokenNameIdentifier	 out Stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset stream so we have only output from next statement all the time 	TokenNameCOMMENT_LINE	reset stream so we have only output from next statement all the time 
errStream	TokenNameIdentifier	 err Stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no errors to the end user. 	TokenNameCOMMENT_LINE	no errors to the end user. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEscape	TokenNameIdentifier	 test Escape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//escaped is the string read from the cli. 	TokenNameCOMMENT_LINE	escaped is the string read from the cli. 
String	TokenNameIdentifier	 String
escaped	TokenNameIdentifier	 escaped
=	TokenNameEQUAL	
"backspace \b tab \t linefeed \n form feed \f carriage return \r duble quote \" "	TokenNameStringLiteral	backspace \b tab \t linefeed \n form feed \f carriage return \r duble quote \" 
+	TokenNamePLUS	
"single quote \' backslash \\"	TokenNameStringLiteral	single quote \' backslash \\
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
unescaped	TokenNameIdentifier	 unescaped
=	TokenNameEQUAL	
"backspace  tab linefeed form feed carriage return duble quote " "	TokenNameStringLiteral	backspace  tab linefeed form feed carriage return duble quote " 
+	TokenNamePLUS	
"single quote ' backslash \"	TokenNameStringLiteral	single quote ' backslash \
;	TokenNameSEMICOLON	
// when read from the cli may have single quotes around it 	TokenNameCOMMENT_LINE	when read from the cli may have single quotes around it 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
unescaped	TokenNameIdentifier	 unescaped
,	TokenNameCOMMA	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
unescapeSQLString	TokenNameIdentifier	 unescape SQL String
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
escaped	TokenNameIdentifier	 escaped
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
escaped	TokenNameIdentifier	 escaped
,	TokenNameCOMMA	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
escapeSQLString	TokenNameIdentifier	 escape SQL String
(	TokenNameLPAREN	
unescaped	TokenNameIdentifier	 unescaped
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
IMutation	TokenNameIdentifier	 I Mutation
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
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
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
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
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
ThriftClientState	TokenNameIdentifier	 Thrift Client State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractModification	TokenNameIdentifier	 Abstract Modification
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
defaultConsistency	TokenNameIdentifier	 default Consistency
=	TokenNameEQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyName	TokenNameIdentifier	 key Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractModification	TokenNameIdentifier	 Abstract Modification
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyAlias	TokenNameIdentifier	 key Alias
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
keyAlias	TokenNameIdentifier	 key Alias
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractModification	TokenNameIdentifier	 Abstract Modification
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyAlias	TokenNameIdentifier	 key Alias
,	TokenNameCOMMA	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
int	TokenNameint	
timeToLive	TokenNameIdentifier	 time To Live
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cLevel	TokenNameIdentifier	 c Level
=	TokenNameEQUAL	
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timeToLive	TokenNameIdentifier	 time To Live
=	TokenNameEQUAL	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keyName	TokenNameIdentifier	 key Name
=	TokenNameEQUAL	
keyAlias	TokenNameIdentifier	 key Alias
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
cLevel	TokenNameIdentifier	 c Level
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
cLevel	TokenNameIdentifier	 c Level
:	TokenNameCOLON	
defaultConsistency	TokenNameIdentifier	 default Consistency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if an explicit consistency level was parsed from the statement. * * @return true if a consistency was parsed, false otherwise. */	TokenNameCOMMENT_JAVADOC	 True if an explicit consistency level was parsed from the statement. * @return true if a consistency was parsed, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSetConsistencyLevel	TokenNameIdentifier	 is Set Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cLevel	TokenNameIdentifier	 c Level
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
clientState	TokenNameIdentifier	 client State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
clientState	TokenNameIdentifier	 client State
.	TokenNameDOT	
getQueryState	TokenNameIdentifier	 get Query State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSetTimestamp	TokenNameIdentifier	 is Set Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert statement into a list of mutations to apply on the server * * @param keyspace The working keyspace * @param clientState current client status * * @return list of the mutations * * @throws InvalidRequestException on the wrong request */	TokenNameCOMMENT_JAVADOC	 Convert statement into a list of mutations to apply on the server * @param keyspace The working keyspace @param clientState current client status * @return list of the mutations * @throws InvalidRequestException on the wrong request 
public	TokenNamepublic	
abstract	TokenNameabstract	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
prepareRowMutations	TokenNameIdentifier	 prepare Row Mutations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
clientState	TokenNameIdentifier	 client State
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
;	TokenNameSEMICOLON	
/** * Convert statement into a list of mutations to apply on the server * * @param keyspace The working keyspace * @param clientState current client status * @param timestamp global timestamp to use for all mutations * * @return list of the mutations * * @throws InvalidRequestException on the wrong request */	TokenNameCOMMENT_JAVADOC	 Convert statement into a list of mutations to apply on the server * @param keyspace The working keyspace @param clientState current client status @param timestamp global timestamp to use for all mutations * @return list of the mutations * @throws InvalidRequestException on the wrong request 
public	TokenNamepublic	
abstract	TokenNameabstract	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
IMutation	TokenNameIdentifier	 I Mutation
>	TokenNameGREATER	
prepareRowMutations	TokenNameIdentifier	 prepare Row Mutations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
ThriftClientState	TokenNameIdentifier	 Thrift Client State
clientState	TokenNameIdentifier	 client State
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
,	TokenNameCOMMA	
UnauthorizedException	TokenNameIdentifier	 Unauthorized Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

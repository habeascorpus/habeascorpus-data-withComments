/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageOut	TokenNameIdentifier	 Message Out
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
/** * A truncate operation descriptor */	TokenNameCOMMENT_JAVADOC	 A truncate operation descriptor 
public	TokenNamepublic	
class	TokenNameclass	
Truncation	TokenNameIdentifier	 Truncation
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
Truncation	TokenNameIdentifier	 Truncation
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
TruncationSerializer	TokenNameIdentifier	 Truncation Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Truncation	TokenNameIdentifier	 Truncation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
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
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
Truncation	TokenNameIdentifier	 Truncation
>	TokenNameGREATER	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MessageOut	TokenNameIdentifier	 Message Out
<	TokenNameLESS	
Truncation	TokenNameIdentifier	 Truncation
>	TokenNameGREATER	
(	TokenNameLPAREN	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
Verb	TokenNameIdentifier	 Verb
.	TokenNameDOT	
TRUNCATE	TokenNameIdentifier	 TRUNCATE
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
serializer	TokenNameIdentifier	 serializer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Truncation("	TokenNameStringLiteral	Truncation(
+	TokenNamePLUS	
"keyspace='"	TokenNameStringLiteral	keyspace='
+	TokenNamePLUS	
keyspace	TokenNameIdentifier	 keyspace
+	TokenNamePLUS	
'\''	TokenNameCharacterLiteral	
+	TokenNamePLUS	
", cf='"	TokenNameStringLiteral	, cf='
+	TokenNamePLUS	
columnFamily	TokenNameIdentifier	 column Family
+	TokenNamePLUS	
"')"	TokenNameStringLiteral	')
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
TruncationSerializer	TokenNameIdentifier	 Truncation Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
Truncation	TokenNameIdentifier	 Truncation
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Truncation	TokenNameIdentifier	 Truncation
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Truncation	TokenNameIdentifier	 Truncation
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Truncation	TokenNameIdentifier	 Truncation
(	TokenNameLPAREN	
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
Truncation	TokenNameIdentifier	 Truncation
truncation	TokenNameIdentifier	 truncation
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
truncation	TokenNameIdentifier	 truncation
.	TokenNameDOT	
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
truncation	TokenNameIdentifier	 truncation
.	TokenNameDOT	
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

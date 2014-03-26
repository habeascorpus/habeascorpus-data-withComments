/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CFName	TokenNameIdentifier	 CF Name
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setKeyspace	TokenNameIdentifier	 set Keyspace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ks	TokenNameIdentifier	 ks
,	TokenNameCOMMA	
boolean	TokenNameboolean	
keepCase	TokenNameIdentifier	 keep Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ksName	TokenNameIdentifier	 ks Name
=	TokenNameEQUAL	
keepCase	TokenNameIdentifier	 keep Case
?	TokenNameQUESTION	
ks	TokenNameIdentifier	 ks
:	TokenNameCOLON	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setColumnFamily	TokenNameIdentifier	 set Column Family
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
boolean	TokenNameboolean	
keepCase	TokenNameIdentifier	 keep Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfName	TokenNameIdentifier	 cf Name
=	TokenNameEQUAL	
keepCase	TokenNameIdentifier	 keep Case
?	TokenNameQUESTION	
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasKeyspace	TokenNameIdentifier	 has Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ksName	TokenNameIdentifier	 ks Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyspace	TokenNameIdentifier	 get Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ksName	TokenNameIdentifier	 ks Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
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
(	TokenNameLPAREN	
hasKeyspace	TokenNameIdentifier	 has Keyspace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

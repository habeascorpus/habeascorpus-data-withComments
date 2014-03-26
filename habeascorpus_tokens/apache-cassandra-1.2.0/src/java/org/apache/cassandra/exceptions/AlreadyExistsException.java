/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
extends	TokenNameextends	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
ALREADY_EXISTS	TokenNameIdentifier	 ALREADY  EXISTS
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
=	TokenNameEQUAL	
ksName	TokenNameIdentifier	 ks Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
=	TokenNameEQUAL	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Cannot add already existing column family "%s" to keyspace "%s""	TokenNameStringLiteral	Cannot add already existing column family "%s" to keyspace "%s"
,	TokenNameCOMMA	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AlreadyExistsException	TokenNameIdentifier	 Already Exists Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Cannot add existing keyspace "%s""	TokenNameStringLiteral	Cannot add existing keyspace "%s"
,	TokenNameCOMMA	
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

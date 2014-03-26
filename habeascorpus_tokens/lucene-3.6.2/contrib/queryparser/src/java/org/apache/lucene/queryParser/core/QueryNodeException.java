package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
Message	TokenNameIdentifier	 Message
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
MessageImpl	TokenNameIdentifier	 Message Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
NLS	TokenNameIdentifier	 NLS
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
NLSException	TokenNameIdentifier	 NLS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
QueryNode	TokenNameIdentifier	 Query Node
;	TokenNameSEMICOLON	
/** * <p> * This exception should be thrown if something wrong happens when dealing with * {@link QueryNode}s. * </p> * <p> * It also supports NLS messages. * </p> * * @see Message * @see NLS * @see NLSException * @see QueryNode */	TokenNameCOMMENT_JAVADOC	 <p> This exception should be thrown if something wrong happens when dealing with {@link QueryNode}s. </p> <p> It also supports NLS messages. </p> * @see Message @see NLS @see NLSException @see QueryNode 
public	TokenNamepublic	
class	TokenNameclass	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
implements	TokenNameimplements	
NLSException	TokenNameIdentifier	 NLS Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5962648855261624214L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
EMPTY_MESSAGE	TokenNameIdentifier	 EMPTY  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Message	TokenNameIdentifier	 Message
getMessageObject	TokenNameIdentifier	 get Message Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

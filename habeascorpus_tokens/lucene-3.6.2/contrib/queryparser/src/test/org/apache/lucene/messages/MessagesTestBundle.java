package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with this * work for additional information regarding copyright ownership. The ASF * licenses this file to You under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
=	TokenNameEQUAL	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should never be instantiated 	TokenNameCOMMENT_LINE	should never be instantiated 
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
// register all string ids with NLS class and initialize static string 	TokenNameCOMMENT_LINE	register all string ids with NLS class and initialize static string 
// values 	TokenNameCOMMENT_LINE	values 
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
initializeMessages	TokenNameIdentifier	 initialize Messages
(	TokenNameLPAREN	
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
,	TokenNameCOMMA	
MessagesTestBundle	TokenNameIdentifier	 Messages Test Bundle
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// static string must match the strings in the property files. 	TokenNameCOMMENT_LINE	static string must match the strings in the property files. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
Q0001E_INVALID_SYNTAX	TokenNameIdentifier	 Q0001 E  INVALID  SYNTAX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
Q0004E_INVALID_SYNTAX_ESCAPE_UNICODE_TRUNCATION	TokenNameIdentifier	 Q0004 E  INVALID  SYNTAX  ESCAPE  UNICODE  TRUNCATION
;	TokenNameSEMICOLON	
// this message is missing from the properties file 	TokenNameCOMMENT_LINE	this message is missing from the properties file 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
Q0005E_MESSAGE_NOT_IN_BUNDLE	TokenNameIdentifier	 Q0005 E  MESSAGE  NOT  IN  BUNDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

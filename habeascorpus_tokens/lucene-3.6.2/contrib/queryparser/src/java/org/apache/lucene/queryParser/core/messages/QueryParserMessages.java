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
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Flexible Query Parser message bundle class */	TokenNameCOMMENT_JAVADOC	 Flexible Query Parser message bundle class 
public	TokenNamepublic	
class	TokenNameclass	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
extends	TokenNameextends	
NLS	TokenNameIdentifier	 NLS
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUNDLE_NAME	TokenNameIdentifier	 BUNDLE  NAME
=	TokenNameEQUAL	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do not instantiate 	TokenNameCOMMENT_LINE	Do not instantiate 
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
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// static string must match the strings in the property files. 	TokenNameCOMMENT_LINE	static string must match the strings in the property files. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INVALID_SYNTAX	TokenNameIdentifier	 INVALID  SYNTAX
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INVALID_SYNTAX_CANNOT_PARSE	TokenNameIdentifier	 INVALID  SYNTAX  CANNOT  PARSE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INVALID_SYNTAX_FUZZY_LIMITS	TokenNameIdentifier	 INVALID  SYNTAX  FUZZY  LIMITS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INVALID_SYNTAX_ESCAPE_UNICODE_TRUNCATION	TokenNameIdentifier	 INVALID  SYNTAX  ESCAPE  UNICODE  TRUNCATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INVALID_SYNTAX_ESCAPE_CHARACTER	TokenNameIdentifier	 INVALID  SYNTAX  ESCAPE  CHARACTER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INVALID_SYNTAX_ESCAPE_NONE_HEX_UNICODE	TokenNameIdentifier	 INVALID  SYNTAX  ESCAPE  NONE  HEX  UNICODE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NODE_ACTION_NOT_SUPPORTED	TokenNameIdentifier	 NODE  ACTION  NOT  SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PARAMETER_VALUE_NOT_SUPPORTED	TokenNameIdentifier	 PARAMETER  VALUE  NOT  SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LUCENE_QUERY_CONVERSION_ERROR	TokenNameIdentifier	 LUCENE  QUERY  CONVERSION  ERROR
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
EMPTY_MESSAGE	TokenNameIdentifier	 EMPTY  MESSAGE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
WILDCARD_NOT_SUPPORTED	TokenNameIdentifier	 WILDCARD  NOT  SUPPORTED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TOO_MANY_BOOLEAN_CLAUSES	TokenNameIdentifier	 TOO  MANY  BOOLEAN  CLAUSES
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
LEADING_WILDCARD_NOT_ALLOWED	TokenNameIdentifier	 LEADING  WILDCARD  NOT  ALLOWED
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
COULD_NOT_PARSE_NUMBER	TokenNameIdentifier	 COULD  NOT  PARSE  NUMBER
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NUMBER_CLASS_NOT_SUPPORTED_BY_NUMERIC_RANGE_QUERY	TokenNameIdentifier	 NUMBER  CLASS  NOT  SUPPORTED  BY  NUMERIC  RANGE  QUERY
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
UNSUPPORTED_NUMERIC_DATA_TYPE	TokenNameIdentifier	 UNSUPPORTED  NUMERIC  DATA  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	

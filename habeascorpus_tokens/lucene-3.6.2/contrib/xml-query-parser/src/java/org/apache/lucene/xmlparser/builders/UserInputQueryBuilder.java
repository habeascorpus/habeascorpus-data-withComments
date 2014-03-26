package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
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
ParseException	TokenNameIdentifier	 Parse Exception
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
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
DOMUtils	TokenNameIdentifier	 DOM Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
ParserException	TokenNameIdentifier	 Parser Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
QueryBuilder	TokenNameIdentifier	 Query Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * UserInputQueryBuilder uses 1 of 2 strategies for thread-safe parsing: * 1) Synchronizing access to "parse" calls on a previously supplied QueryParser * or.. * 2) creating a new QueryParser object for each parse request */	TokenNameCOMMENT_JAVADOC	 UserInputQueryBuilder uses 1 of 2 strategies for thread-safe parsing: 1) Synchronizing access to "parse" calls on a previously supplied QueryParser or.. 2) creating a new QueryParser object for each parse request 
public	TokenNamepublic	
class	TokenNameclass	
UserInputQueryBuilder	TokenNameIdentifier	 User Input Query Builder
implements	TokenNameimplements	
QueryBuilder	TokenNameIdentifier	 Query Builder
{	TokenNameLBRACE	
QueryParser	TokenNameIdentifier	 Query Parser
unSafeParser	TokenNameIdentifier	 un Safe Parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
;	TokenNameSEMICOLON	
/** * This constructor has the disadvantage of not being able to change choice of default field name * @param parser thread un-safe query parser */	TokenNameCOMMENT_JAVADOC	 This constructor has the disadvantage of not being able to change choice of default field name @param parser thread un-safe query parser 
public	TokenNamepublic	
UserInputQueryBuilder	TokenNameIdentifier	 User Input Query Builder
(	TokenNameLPAREN	
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
unSafeParser	TokenNameIdentifier	 un Safe Parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
UserInputQueryBuilder	TokenNameIdentifier	 User Input Query Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultField	TokenNameIdentifier	 default Field
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
analyzer	TokenNameIdentifier	 analyzer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defaultField	TokenNameIdentifier	 default Field
=	TokenNameEQUAL	
defaultField	TokenNameIdentifier	 default Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.xmlparser.QueryObjectBuilder#process(org.w3c.dom.Element) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.xmlparser.QueryObjectBuilder#process(org.w3c.dom.Element) 
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unSafeParser	TokenNameIdentifier	 un Safe Parser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//synchronize on unsafe parser 	TokenNameCOMMENT_LINE	synchronize on unsafe parser 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
unSafeParser	TokenNameIdentifier	 un Safe Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
unSafeParser	TokenNameIdentifier	 un Safe Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"fieldName"	TokenNameStringLiteral	fieldName
,	TokenNameCOMMA	
defaultField	TokenNameIdentifier	 default Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Create new parser 	TokenNameCOMMENT_LINE	Create new parser 
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
createQueryParser	TokenNameIdentifier	 create Query Parser
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// use the boost of the original query here, too and multiply (which may be != 1.0f): 	TokenNameCOMMENT_LINE	use the boost of the original query here, too and multiply (which may be != 1.0f): 
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"boost"	TokenNameStringLiteral	boost
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Method to create a QueryParser - designed to be overridden * @param fieldName * @param analyzer * @return QueryParser */	TokenNameCOMMENT_JAVADOC	 Method to create a QueryParser - designed to be overridden @param fieldName @param analyzer @return QueryParser 
protected	TokenNameprotected	
QueryParser	TokenNameIdentifier	 Query Parser
createQueryParser	TokenNameIdentifier	 create Query Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

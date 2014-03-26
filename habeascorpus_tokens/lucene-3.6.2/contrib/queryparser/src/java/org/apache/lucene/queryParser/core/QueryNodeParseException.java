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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
SyntaxParser	TokenNameIdentifier	 Syntax Parser
;	TokenNameSEMICOLON	
/** * This should be thrown when an exception happens during the query parsing from * string to the query node tree. * * @see QueryNodeException * @see SyntaxParser * @see QueryNode */	TokenNameCOMMENT_JAVADOC	 This should be thrown when an exception happens during the query parsing from string to the query node tree. * @see QueryNodeException @see SyntaxParser @see QueryNode 
public	TokenNamepublic	
class	TokenNameclass	
QueryNodeParseException	TokenNameIdentifier	 Query Node Parse Exception
extends	TokenNameextends	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8197535103538766773L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
beginColumn	TokenNameIdentifier	 begin Column
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
beginLine	TokenNameIdentifier	 begin Line
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
errorToken	TokenNameIdentifier	 error Token
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryNodeParseException	TokenNameIdentifier	 Query Node Parse Exception
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNodeParseException	TokenNameIdentifier	 Query Node Parse Exception
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
QueryNodeParseException	TokenNameIdentifier	 Query Node Parse Exception
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
,	TokenNameCOMMA	
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setQuery	TokenNameIdentifier	 set Query
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
INVALID_SYNTAX_CANNOT_PARSE	TokenNameIdentifier	 INVALID  SYNTAX  CANNOT  PARSE
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param errorToken * the errorToken in the query */	TokenNameCOMMENT_JAVADOC	 @param errorToken the errorToken in the query 
protected	TokenNameprotected	
void	TokenNamevoid	
setErrorToken	TokenNameIdentifier	 set Error Token
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorToken	TokenNameIdentifier	 error Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
errorToken	TokenNameIdentifier	 error Token
=	TokenNameEQUAL	
errorToken	TokenNameIdentifier	 error Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getErrorToken	TokenNameIdentifier	 get Error Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
errorToken	TokenNameIdentifier	 error Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNonLocalizedMessage	TokenNameIdentifier	 set Non Localized Message
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For EndOfLine and EndOfFile ("<EOF>") parsing problems the last char in the * string is returned For the case where the parser is not able to figure out * the line and column number -1 will be returned * * @return line where the problem was found */	TokenNameCOMMENT_JAVADOC	 For EndOfLine and EndOfFile ("<EOF>") parsing problems the last char in the string is returned For the case where the parser is not able to figure out the line and column number -1 will be returned * @return line where the problem was found 
public	TokenNamepublic	
int	TokenNameint	
getBeginLine	TokenNameIdentifier	 get Begin Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
beginLine	TokenNameIdentifier	 begin Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For EndOfLine and EndOfFile ("<EOF>") parsing problems the last char in the * string is returned For the case where the parser is not able to figure out * the line and column number -1 will be returned * * @return column of the first char where the problem was found */	TokenNameCOMMENT_JAVADOC	 For EndOfLine and EndOfFile ("<EOF>") parsing problems the last char in the string is returned For the case where the parser is not able to figure out the line and column number -1 will be returned * @return column of the first char where the problem was found 
public	TokenNamepublic	
int	TokenNameint	
getBeginColumn	TokenNameIdentifier	 get Begin Column
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
beginColumn	TokenNameIdentifier	 begin Column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param beginLine * the beginLine to set */	TokenNameCOMMENT_JAVADOC	 @param beginLine the beginLine to set 
protected	TokenNameprotected	
void	TokenNamevoid	
setBeginLine	TokenNameIdentifier	 set Begin Line
(	TokenNameLPAREN	
int	TokenNameint	
beginLine	TokenNameIdentifier	 begin Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
beginLine	TokenNameIdentifier	 begin Line
=	TokenNameEQUAL	
beginLine	TokenNameIdentifier	 begin Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param beginColumn * the beginColumn to set */	TokenNameCOMMENT_JAVADOC	 @param beginColumn the beginColumn to set 
protected	TokenNameprotected	
void	TokenNamevoid	
setBeginColumn	TokenNameIdentifier	 set Begin Column
(	TokenNameLPAREN	
int	TokenNameint	
beginColumn	TokenNameIdentifier	 begin Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
beginColumn	TokenNameIdentifier	 begin Column
=	TokenNameEQUAL	
beginColumn	TokenNameIdentifier	 begin Column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

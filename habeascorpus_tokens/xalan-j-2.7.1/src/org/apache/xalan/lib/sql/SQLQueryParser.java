/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SQLQueryParser.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SQLQueryParser.java 468638 2006-10-28 06:52:06Z minchau $ 
/** * This is used by the SQLDocumentHandler for processing JDBC queries. * This prepares JDBC PreparedStatement or CallableStatements and the * input/output of parameters from/to variables. * */	TokenNameCOMMENT_JAVADOC	 This is used by the SQLDocumentHandler for processing JDBC queries. This prepares JDBC PreparedStatement or CallableStatements and the input/output of parameters from/to variables. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
lib	TokenNameIdentifier	 lib
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExpressionContext	TokenNameIdentifier	 Expression Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
{	TokenNameLBRACE	
/** * If the parser used inline parser to pull out variables then * this will be true. The default is not to use the Inline Parser. */	TokenNameCOMMENT_JAVADOC	 If the parser used inline parser to pull out variables then this will be true. The default is not to use the Inline Parser. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_IsCallable	TokenNameIdentifier	 m  Is Callable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_OrigQuery	TokenNameIdentifier	 m  Orig Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_Parameters	TokenNameIdentifier	 m  Parameters
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_hasOutput	TokenNameIdentifier	 m has Output
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_HasParameters	TokenNameIdentifier	 m  Has Parameters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_OVERRIDE	TokenNameIdentifier	 NO  OVERRIDE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NO_INLINE_PARSER	TokenNameIdentifier	 NO  INLINE  PARSER
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INLINE_PARSER	TokenNameIdentifier	 INLINE  PARSER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The SQLStatement Parser will be created as a psuedo SINGLETON per * XConnection. Since we are only caching the Query and its parsed results * we may be able to use this as a real SINGLETON. It all depends on how * Statement Caching will play out. */	TokenNameCOMMENT_JAVADOC	 The SQLStatement Parser will be created as a psuedo SINGLETON per XConnection. Since we are only caching the Query and its parsed results we may be able to use this as a real SINGLETON. It all depends on how Statement Caching will play out. 
public	TokenNamepublic	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor, used to create a new parser entry */	TokenNameCOMMENT_JAVADOC	 Constructor, used to create a new parser entry 
private	TokenNameprivate	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_OrigQuery	TokenNameIdentifier	 m  Orig Query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * On a per Xconnection basis, we will create a SQLStatemenetParser, from * this parser, individual parsers will be created. The Init method is defined * to initialize all the internal structures that maintains the pool of parsers. */	TokenNameCOMMENT_JAVADOC	 On a per Xconnection basis, we will create a SQLStatemenetParser, from this parser, individual parsers will be created. The Init method is defined to initialize all the internal structures that maintains the pool of parsers. 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Do nothing for now. 	TokenNameCOMMENT_LINE	Do nothing for now. 
}	TokenNameRBRACE	
/** * Produce an SQL Statement Parser based on the incomming query. * * For now we will just create a new object, in the future we may have this * interface cache the queries so that we can take advantage of a preparsed * String. * * If the Inline Parser is not enabled in the Options, no action will be * taken on the parser. This option can be set by the Stylesheet. If the * option is not set or cleared, a default value will be set determined * by the way variables were passed into the system. */	TokenNameCOMMENT_JAVADOC	 Produce an SQL Statement Parser based on the incomming query. * For now we will just create a new object, in the future we may have this interface cache the queries so that we can take advantage of a preparsed String. * If the Inline Parser is not enabled in the Options, no action will be taken on the parser. This option can be set by the Stylesheet. If the option is not set or cleared, a default value will be set determined by the way variables were passed into the system. 
public	TokenNamepublic	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
XConnection	TokenNameIdentifier	 X Connection
xconn	TokenNameIdentifier	 xconn
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
override	TokenNameIdentifier	 override
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
SQLQueryParser	TokenNameIdentifier	 SQL Query Parser
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Try to implement caching here, if we found a parser in the cache 	TokenNameCOMMENT_LINE	Try to implement caching here, if we found a parser in the cache 
// then just return the instance otherwise 	TokenNameCOMMENT_LINE	then just return the instance otherwise 
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
xconn	TokenNameIdentifier	 xconn
,	TokenNameCOMMA	
override	TokenNameIdentifier	 override
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Produce an SQL Statement Parser based on the incomming query. * * For now we will just create a new object, in the future we may have this * interface cache the queries so that we can take advantage of a preparsed * String. * * If the Inline Parser is not enabled in the Options, no action will be * taken on the parser. This option can be set by the Stylesheet. If the * option is not set or cleared, a default value will be set determined * by the way variables were passed into the system. */	TokenNameCOMMENT_JAVADOC	 Produce an SQL Statement Parser based on the incomming query. * For now we will just create a new object, in the future we may have this interface cache the queries so that we can take advantage of a preparsed String. * If the Inline Parser is not enabled in the Options, no action will be taken on the parser. This option can be set by the Stylesheet. If the option is not set or cleared, a default value will be set determined by the way variables were passed into the system. 
private	TokenNameprivate	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
XConnection	TokenNameIdentifier	 X Connection
xconn	TokenNameIdentifier	 xconn
,	TokenNameCOMMA	
int	TokenNameint	
override	TokenNameIdentifier	 override
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Grab the Feature here. We could maintain it from the Parent Parser 	TokenNameCOMMENT_LINE	Grab the Feature here. We could maintain it from the Parent Parser 
// but that may cause problems if a single XConnection wants to maintain 	TokenNameCOMMENT_LINE	but that may cause problems if a single XConnection wants to maintain 
// both Inline Variable Statemens along with NON inline variable statements. 	TokenNameCOMMENT_LINE	both Inline Variable Statemens along with NON inline variable statements. 
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
=	TokenNameEQUAL	
"true"	TokenNameStringLiteral	true
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
xconn	TokenNameIdentifier	 xconn
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
"inline-variables"	TokenNameStringLiteral	inline-variables
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
override	TokenNameIdentifier	 override
==	TokenNameEQUAL_EQUAL	
NO_INLINE_PARSER	TokenNameIdentifier	 NO  INLINE  PARSER
)	TokenNameRPAREN	
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
override	TokenNameIdentifier	 override
==	TokenNameEQUAL_EQUAL	
INLINE_PARSER	TokenNameIdentifier	 INLINE  PARSER
)	TokenNameRPAREN	
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
)	TokenNameRPAREN	
inlineParser	TokenNameIdentifier	 inline Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If a SQL Statement does not have any parameters, then it can be executed * directly. Most SQL Servers use this as a performance advantage since no * parameters need to be parsed then bound. */	TokenNameCOMMENT_JAVADOC	 If a SQL Statement does not have any parameters, then it can be executed directly. Most SQL Servers use this as a performance advantage since no parameters need to be parsed then bound. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasParameters	TokenNameIdentifier	 has Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_HasParameters	TokenNameIdentifier	 m  Has Parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the Inline Parser is used, the parser will note if this stastement is * a plain SQL Statement or a Called Procedure. Called Procudures generally * have output parameters and require special handling. * * Called Procudures that are not processed with the Inline Parser will * still be executed but under the context of a PreparedStatement and * not a CallableStatement. Called Procudures that have output parameters * MUST be handled with the Inline Parser. */	TokenNameCOMMENT_JAVADOC	 If the Inline Parser is used, the parser will note if this stastement is a plain SQL Statement or a Called Procedure. Called Procudures generally have output parameters and require special handling. * Called Procudures that are not processed with the Inline Parser will still be executed but under the context of a PreparedStatement and not a CallableStatement. Called Procudures that have output parameters MUST be handled with the Inline Parser. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCallable	TokenNameIdentifier	 is Callable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_IsCallable	TokenNameIdentifier	 m  Is Callable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_Parameters	TokenNameIdentifier	 m  Parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The XConnection will use this method to store the Parameters * that were supplied by the style sheet in the case where the * inline parser was not used */	TokenNameCOMMENT_JAVADOC	 The XConnection will use this method to store the Parameters that were supplied by the style sheet in the case where the inline parser was not used 
public	TokenNamepublic	
void	TokenNamevoid	
setParameters	TokenNameIdentifier	 set Parameters
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_HasParameters	TokenNameIdentifier	 m  Has Parameters
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_Parameters	TokenNameIdentifier	 m  Parameters
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a copy of the parsed SQL query that will be set to the * Database system to execute. If the inline parser was not used, * then the original query will be returned. */	TokenNameCOMMENT_JAVADOC	 Return a copy of the parsed SQL query that will be set to the Database system to execute. If the inline parser was not used, then the original query will be returned. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSQLQuery	TokenNameIdentifier	 get SQL Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
)	TokenNameRPAREN	
return	TokenNamereturn	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_OrigQuery	TokenNameIdentifier	 m  Orig Query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The SQL Statement Parser, when an Inline Parser is used, tracks the XSL * variables used to populate a statement. The data use to popoulate a * can also be provided. If the data is provided, it will overide the * populastion using XSL variables. When the Inline PArser is not used, then * the Data will always be provided. * */	TokenNameCOMMENT_JAVADOC	 The SQL Statement Parser, when an Inline Parser is used, tracks the XSL variables used to populate a statement. The data use to popoulate a can also be provided. If the data is provided, it will overide the populastion using XSL variables. When the Inline PArser is not used, then the Data will always be provided. 
public	TokenNamepublic	
void	TokenNamevoid	
populateStatement	TokenNameIdentifier	 populate Statement
(	TokenNameLPAREN	
PreparedStatement	TokenNameIdentifier	 Prepared Statement
stmt	TokenNameIdentifier	 stmt
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set input parameters from variables. 	TokenNameCOMMENT_LINE	Set input parameters from variables. 
// for ( int indx = returnParm ? 1 : 0 ; indx < m_Parameters.size() ; indx++ ) 	TokenNameCOMMENT_LINE	for ( int indx = returnParm ? 1 : 0 ; indx < m_Parameters.size() ; indx++ ) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
indx	TokenNameIdentifier	 indx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indx	TokenNameIdentifier	 indx
<	TokenNameLESS	
m_Parameters	TokenNameIdentifier	 m  Parameters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indx	TokenNameIdentifier	 indx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParameter	TokenNameIdentifier	 Query Parameter
parm	TokenNameIdentifier	 parm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QueryParameter	TokenNameIdentifier	 Query Parameter
)	TokenNameRPAREN	
m_Parameters	TokenNameIdentifier	 m  Parameters
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_InlineVariables	TokenNameIdentifier	 m  Inline Variables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Currently defaulting scale to 4 - should read this! 	TokenNameCOMMENT_LINE	Currently defaulting scale to 4 - should read this! 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
setNull	TokenNameIdentifier	 set Null
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Currently defaulting scale to 4 - should read this! 	TokenNameCOMMENT_LINE	Currently defaulting scale to 4 - should read this! 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stmt	TokenNameIdentifier	 stmt
.	TokenNameDOT	
setNull	TokenNameIdentifier	 set Null
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if ( ! parm.isOutput() ) throw new SQLException(tx.toString()); 	TokenNameCOMMENT_LINE	if ( ! parm.isOutput() ) throw new SQLException(tx.toString()); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
registerOutputParameters	TokenNameIdentifier	 register Output Parameters
(	TokenNameLPAREN	
CallableStatement	TokenNameIdentifier	 Callable Statement
cstmt	TokenNameIdentifier	 cstmt
)	TokenNameRPAREN	
throws	TokenNamethrows	
SQLException	TokenNameIdentifier	 SQL Exception
{	TokenNameLBRACE	
// Register output parameters if call. 	TokenNameCOMMENT_LINE	Register output parameters if call. 
if	TokenNameif	
(	TokenNameLPAREN	
m_IsCallable	TokenNameIdentifier	 m  Is Callable
&&	TokenNameAND_AND	
m_hasOutput	TokenNameIdentifier	 m has Output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
indx	TokenNameIdentifier	 indx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indx	TokenNameIdentifier	 indx
<	TokenNameLESS	
m_Parameters	TokenNameIdentifier	 m  Parameters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indx	TokenNameIdentifier	 indx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParameter	TokenNameIdentifier	 Query Parameter
parm	TokenNameIdentifier	 parm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QueryParameter	TokenNameIdentifier	 Query Parameter
)	TokenNameRPAREN	
m_Parameters	TokenNameIdentifier	 m  Parameters
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
isOutput	TokenNameIdentifier	 is Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("chrysalisSQLStatement() Registering output parameter for parm " + indx); 	TokenNameCOMMENT_LINE	System.out.println("chrysalisSQLStatement() Registering output parameter for parm " + indx); 
cstmt	TokenNameIdentifier	 cstmt
.	TokenNameDOT	
registerOutParameter	TokenNameIdentifier	 register Out Parameter
(	TokenNameLPAREN	
indx	TokenNameIdentifier	 indx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parm	TokenNameIdentifier	 parm
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
inlineParser	TokenNameIdentifier	 inline Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryParameter	TokenNameIdentifier	 Query Parameter
curParm	TokenNameIdentifier	 cur Parm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstword	TokenNameIdentifier	 firstword
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_Parameters	TokenNameIdentifier	 m  Parameters
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_Parameters	TokenNameIdentifier	 m  Parameters
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
m_OrigQuery	TokenNameIdentifier	 m  Orig Query
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
m_OrigQuery	TokenNameIdentifier	 m  Orig Query
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Normal 	TokenNameCOMMENT_LINE	Normal 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
firstword	TokenNameIdentifier	 firstword
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// In String 	TokenNameCOMMENT_LINE	In String 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// In escape 	TokenNameCOMMENT_LINE	In escape 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// First word 	TokenNameCOMMENT_LINE	First word 
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"call"	TokenNameStringLiteral	call
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_IsCallable	TokenNameIdentifier	 m  Is Callable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curParm	TokenNameIdentifier	 cur Parm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// returnParm = true; 	TokenNameCOMMENT_LINE	returnParm = true; 
curParm	TokenNameIdentifier	 cur Parm
.	TokenNameDOT	
setIsOutput	TokenNameIdentifier	 set Is Output
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hasOutput = true; 	TokenNameCOMMENT_LINE	hasOutput = true; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
firstword	TokenNameIdentifier	 firstword
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Get variable definition 	TokenNameCOMMENT_LINE	Get variable definition 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Read variable type. 	TokenNameCOMMENT_LINE	Read variable type. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OK we have at least one parameter. 	TokenNameCOMMENT_LINE	OK we have at least one parameter. 
m_HasParameters	TokenNameIdentifier	 m  Has Parameters
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
curParm	TokenNameIdentifier	 cur Parm
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParameter	TokenNameIdentifier	 Query Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curParm	TokenNameIdentifier	 cur Parm
.	TokenNameDOT	
setTypeName	TokenNameIdentifier	 set Type Name
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// curParm.type = map_type(curParm.typeName); 	TokenNameCOMMENT_LINE	curParm.type = map_type(curParm.typeName); 
m_Parameters	TokenNameIdentifier	 m  Parameters
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
curParm	TokenNameIdentifier	 cur Parm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Look for '=' 	TokenNameCOMMENT_LINE	Look for '=' 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Read variable name. 	TokenNameCOMMENT_LINE	Read variable name. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curParm	TokenNameIdentifier	 cur Parm
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//param_output.addElement(new Boolean(false)); 	TokenNameCOMMENT_LINE	param_output.addElement(new Boolean(false)); 
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// Look for "OUTput. 	TokenNameCOMMENT_LINE	Look for "OUTput. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"OUT"	TokenNameStringLiteral	OUT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curParm	TokenNameIdentifier	 cur Parm
.	TokenNameDOT	
setIsOutput	TokenNameIdentifier	 set Is Output
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_hasOutput	TokenNameIdentifier	 m has Output
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Prepare statement or call. 	TokenNameCOMMENT_LINE	Prepare statement or call. 
if	TokenNameif	
(	TokenNameLPAREN	
m_IsCallable	TokenNameIdentifier	 m  Is Callable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ParsedQuery	TokenNameIdentifier	 m  Parsed Query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

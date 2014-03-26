/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SQLErrorDocument.java 468638 2006-10-28 06:52:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SQLErrorDocument.java 468638 2006-10-28 06:52:06Z minchau $ 
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
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
SQLException	TokenNameIdentifier	 SQL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
sql	TokenNameIdentifier	 sql
.	TokenNameDOT	
SQLWarning	TokenNameIdentifier	 SQL Warning
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
;	TokenNameSEMICOLON	
/** * * A base class that will convert an exception into an XML stream * that can be returned in place of the standard result. The XML * format returned is a follows. * * <ext-error> * <message> The Message for a generic error </message> * <sql-error> * <message> SQL Message from the Exception thrown </message> * <code> SQL Error Code </stack> * </sql-error> * <ext-error> * */	TokenNameCOMMENT_JAVADOC	 * A base class that will convert an exception into an XML stream that can be returned in place of the standard result. The XML format returned is a follows. * <ext-error> <message> The Message for a generic error </message> <sql-error> <message> SQL Message from the Exception thrown </message> <code> SQL Error Code </stack> </sql-error> <ext-error> 
/** * The SQL Document is the main controlling class the executesa SQL Query */	TokenNameCOMMENT_JAVADOC	 The SQL Document is the main controlling class the executesa SQL Query 
public	TokenNamepublic	
class	TokenNameclass	
SQLErrorDocument	TokenNameIdentifier	 SQL Error Document
extends	TokenNameextends	
DTMDocument	TokenNameIdentifier	 DTM Document
{	TokenNameLBRACE	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_EXT_ERROR	TokenNameIdentifier	 S  EXT  ERROR
=	TokenNameEQUAL	
"ext-error"	TokenNameStringLiteral	ext-error
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_SQL_ERROR	TokenNameIdentifier	 S  SQL  ERROR
=	TokenNameEQUAL	
"sql-error"	TokenNameStringLiteral	sql-error
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_MESSAGE	TokenNameIdentifier	 S  MESSAGE
=	TokenNameEQUAL	
"message"	TokenNameStringLiteral	message
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_CODE	TokenNameIdentifier	 S  CODE
=	TokenNameEQUAL	
"code"	TokenNameStringLiteral	code
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_STATE	TokenNameIdentifier	 S  STATE
=	TokenNameEQUAL	
"state"	TokenNameStringLiteral	state
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_SQL_WARNING	TokenNameIdentifier	 S  SQL  WARNING
=	TokenNameEQUAL	
"sql-warning"	TokenNameStringLiteral	sql-warning
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_ErrorExt_TypeID	TokenNameIdentifier	 m  Error Ext  Type ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_Message_TypeID	TokenNameIdentifier	 m  Message  Type ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_Code_TypeID	TokenNameIdentifier	 m  Code  Type ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_State_TypeID	TokenNameIdentifier	 m  State  Type ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_SQLWarning_TypeID	TokenNameIdentifier	 m  SQL Warning  Type ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_SQLError_TypeID	TokenNameIdentifier	 m  SQL Error  Type ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_rootID	TokenNameIdentifier	 m root ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_extErrorID	TokenNameIdentifier	 m ext Error ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
int	TokenNameint	
m_MainMessageID	TokenNameIdentifier	 m  Main Message ID
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * Build up an SQLErrorDocument that includes the basic error information * along with the Extended SQL Error information. * @param mgr * @param ident * @param error */	TokenNameCOMMENT_JAVADOC	 Build up an SQLErrorDocument that includes the basic error information along with the Extended SQL Error information. @param mgr @param ident @param error 
public	TokenNamepublic	
SQLErrorDocument	TokenNameIdentifier	 SQL Error Document
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
int	TokenNameint	
ident	TokenNameIdentifier	 ident
,	TokenNameCOMMA	
SQLException	TokenNameIdentifier	 SQL Exception
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildBasicStructure	TokenNameIdentifier	 build Basic Structure
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sqlError	TokenNameIdentifier	 sql Error
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_SQLError_TypeID	TokenNameIdentifier	 m  SQL Error  Type ID
,	TokenNameCOMMA	
m_extErrorID	TokenNameIdentifier	 m ext Error ID
,	TokenNameCOMMA	
m_MainMessageID	TokenNameIdentifier	 m  Main Message ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getErrorCode	TokenNameIdentifier	 get Error Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Code_TypeID	TokenNameIdentifier	 m  Code  Type ID
,	TokenNameCOMMA	
sqlError	TokenNameIdentifier	 sql Error
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Message_TypeID	TokenNameIdentifier	 m  Message  Type ID
,	TokenNameCOMMA	
sqlError	TokenNameIdentifier	 sql Error
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this.dumpDTM(); 	TokenNameCOMMENT_LINE	this.dumpDTM(); 
}	TokenNameRBRACE	
/** * Build up an Error Exception with just the Standard Error Information * @param mgr * @param ident * @param error */	TokenNameCOMMENT_JAVADOC	 Build up an Error Exception with just the Standard Error Information @param mgr @param ident @param error 
public	TokenNamepublic	
SQLErrorDocument	TokenNameIdentifier	 SQL Error Document
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
int	TokenNameint	
ident	TokenNameIdentifier	 ident
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildBasicStructure	TokenNameIdentifier	 build Basic Structure
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Build up an Error Exception with just the Standard Error Information * @param mgr * @param ident * @param error */	TokenNameCOMMENT_JAVADOC	 Build up an Error Exception with just the Standard Error Information @param mgr @param ident @param error 
public	TokenNamepublic	
SQLErrorDocument	TokenNameIdentifier	 SQL Error Document
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
int	TokenNameint	
ident	TokenNameIdentifier	 ident
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
SQLWarning	TokenNameIdentifier	 SQL Warning
warning	TokenNameIdentifier	 warning
,	TokenNameCOMMA	
boolean	TokenNameboolean	
full	TokenNameIdentifier	 full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildBasicStructure	TokenNameIdentifier	 build Basic Structure
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SQLException	TokenNameIdentifier	 SQL Exception
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
m_MainMessageID	TokenNameIdentifier	 m  Main Message ID
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inWarnings	TokenNameIdentifier	 in Warnings
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
error	TokenNameIdentifier	 error
instanceof	TokenNameinstanceof	
SQLException	TokenNameIdentifier	 SQL Exception
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SQLException	TokenNameIdentifier	 SQL Exception
)	TokenNameRPAREN	
error	TokenNameIdentifier	 error
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
full	TokenNameIdentifier	 full
&&	TokenNameAND_AND	
warning	TokenNameIdentifier	 warning
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
warning	TokenNameIdentifier	 warning
;	TokenNameSEMICOLON	
inWarnings	TokenNameIdentifier	 in Warnings
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sqlError	TokenNameIdentifier	 sql Error
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
inWarnings	TokenNameIdentifier	 in Warnings
?	TokenNameQUESTION	
m_SQLWarning_TypeID	TokenNameIdentifier	 m  SQL Warning  Type ID
:	TokenNameCOLON	
m_SQLError_TypeID	TokenNameIdentifier	 m  SQL Error  Type ID
,	TokenNameCOMMA	
m_extErrorID	TokenNameIdentifier	 m ext Error ID
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
sqlError	TokenNameIdentifier	 sql Error
;	TokenNameSEMICOLON	
int	TokenNameint	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getErrorCode	TokenNameIdentifier	 get Error Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Code_TypeID	TokenNameIdentifier	 m  Code  Type ID
,	TokenNameCOMMA	
sqlError	TokenNameIdentifier	 sql Error
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Message_TypeID	TokenNameIdentifier	 m  Message  Type ID
,	TokenNameCOMMA	
sqlError	TokenNameIdentifier	 sql Error
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
full	TokenNameIdentifier	 full
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getSQLState	TokenNameIdentifier	 get SQL State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_State_TypeID	TokenNameIdentifier	 m  State  Type ID
,	TokenNameCOMMA	
sqlError	TokenNameIdentifier	 sql Error
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inWarnings	TokenNameIdentifier	 in Warnings
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SQLWarning	TokenNameIdentifier	 SQL Warning
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
.	TokenNameDOT	
getNextWarning	TokenNameIdentifier	 get Next Warning
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getNextException	TokenNameIdentifier	 get Next Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Build up the basic structure that is common for each error. * @param e * @return */	TokenNameCOMMENT_JAVADOC	 Build up the basic structure that is common for each error. @param e @return 
private	TokenNameprivate	
void	TokenNamevoid	
buildBasicStructure	TokenNameIdentifier	 build Basic Structure
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_rootID	TokenNameIdentifier	 m root ID
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Document_TypeID	TokenNameIdentifier	 m  Document  Type ID
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_extErrorID	TokenNameIdentifier	 m ext Error ID
=	TokenNameEQUAL	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ErrorExt_TypeID	TokenNameIdentifier	 m  Error Ext  Type ID
,	TokenNameCOMMA	
m_rootID	TokenNameIdentifier	 m root ID
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_MainMessageID	TokenNameIdentifier	 m  Main Message ID
=	TokenNameEQUAL	
addElementWithData	TokenNameIdentifier	 add Element With Data
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"SQLWarning"	TokenNameStringLiteral	SQLWarning
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_Message_TypeID	TokenNameIdentifier	 m  Message  Type ID
,	TokenNameCOMMA	
m_extErrorID	TokenNameIdentifier	 m ext Error ID
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Populate the Expanded Name Table with the Node that we will use. * Keep a reference of each of the types for access speed. * @return */	TokenNameCOMMENT_JAVADOC	 Populate the Expanded Name Table with the Node that we will use. Keep a reference of each of the types for access speed. @return 
protected	TokenNameprotected	
void	TokenNamevoid	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
createExpandedNameTable	TokenNameIdentifier	 create Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ErrorExt_TypeID	TokenNameIdentifier	 m  Error Ext  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_EXT_ERROR	TokenNameIdentifier	 S  EXT  ERROR
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_SQLError_TypeID	TokenNameIdentifier	 m  SQL Error  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_SQL_ERROR	TokenNameIdentifier	 S  SQL  ERROR
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Message_TypeID	TokenNameIdentifier	 m  Message  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_MESSAGE	TokenNameIdentifier	 S  MESSAGE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_Code_TypeID	TokenNameIdentifier	 m  Code  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_CODE	TokenNameIdentifier	 S  CODE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_State_TypeID	TokenNameIdentifier	 m  State  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_STATE	TokenNameIdentifier	 S  STATE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_SQLWarning_TypeID	TokenNameIdentifier	 m  SQL Warning  Type ID
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
S_NAMESPACE	TokenNameIdentifier	 S  NAMESPACE
,	TokenNameCOMMA	
S_SQL_WARNING	TokenNameIdentifier	 S  SQL  WARNING
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

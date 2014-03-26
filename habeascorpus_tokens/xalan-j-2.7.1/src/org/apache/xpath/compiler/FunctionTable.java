/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FunctionTable.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FunctionTable.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
Function	TokenNameIdentifier	 Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
/** * The function table for XPath. */	TokenNameCOMMENT_JAVADOC	 The function table for XPath. 
public	TokenNamepublic	
class	TokenNameclass	
FunctionTable	TokenNameIdentifier	 Function Table
{	TokenNameLBRACE	
/** The 'current()' id. */	TokenNameCOMMENT_JAVADOC	 The 'current()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_CURRENT	TokenNameIdentifier	 FUNC  CURRENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'last()' id. */	TokenNameCOMMENT_JAVADOC	 The 'last()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_LAST	TokenNameIdentifier	 FUNC  LAST
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'position()' id. */	TokenNameCOMMENT_JAVADOC	 The 'position()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_POSITION	TokenNameIdentifier	 FUNC  POSITION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'count()' id. */	TokenNameCOMMENT_JAVADOC	 The 'count()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_COUNT	TokenNameIdentifier	 FUNC  COUNT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'id()' id. */	TokenNameCOMMENT_JAVADOC	 The 'id()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_ID	TokenNameIdentifier	 FUNC  ID
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'key()' id (XSLT). */	TokenNameCOMMENT_JAVADOC	 The 'key()' id (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_KEY	TokenNameIdentifier	 FUNC  KEY
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'local-name()' id. */	TokenNameCOMMENT_JAVADOC	 The 'local-name()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_LOCAL_PART	TokenNameIdentifier	 FUNC  LOCAL  PART
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'namespace-uri()' id. */	TokenNameCOMMENT_JAVADOC	 The 'namespace-uri()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_NAMESPACE	TokenNameIdentifier	 FUNC  NAMESPACE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'name()' id. */	TokenNameCOMMENT_JAVADOC	 The 'name()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_QNAME	TokenNameIdentifier	 FUNC  QNAME
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'generate-id()' id. */	TokenNameCOMMENT_JAVADOC	 The 'generate-id()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_GENERATE_ID	TokenNameIdentifier	 FUNC  GENERATE  ID
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'not()' id. */	TokenNameCOMMENT_JAVADOC	 The 'not()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_NOT	TokenNameIdentifier	 FUNC  NOT
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'true()' id. */	TokenNameCOMMENT_JAVADOC	 The 'true()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_TRUE	TokenNameIdentifier	 FUNC  TRUE
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'false()' id. */	TokenNameCOMMENT_JAVADOC	 The 'false()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_FALSE	TokenNameIdentifier	 FUNC  FALSE
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'boolean()' id. */	TokenNameCOMMENT_JAVADOC	 The 'boolean()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_BOOLEAN	TokenNameIdentifier	 FUNC  BOOLEAN
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'number()' id. */	TokenNameCOMMENT_JAVADOC	 The 'number()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_NUMBER	TokenNameIdentifier	 FUNC  NUMBER
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'floor()' id. */	TokenNameCOMMENT_JAVADOC	 The 'floor()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_FLOOR	TokenNameIdentifier	 FUNC  FLOOR
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'ceiling()' id. */	TokenNameCOMMENT_JAVADOC	 The 'ceiling()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_CEILING	TokenNameIdentifier	 FUNC  CEILING
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'round()' id. */	TokenNameCOMMENT_JAVADOC	 The 'round()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_ROUND	TokenNameIdentifier	 FUNC  ROUND
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'sum()' id. */	TokenNameCOMMENT_JAVADOC	 The 'sum()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_SUM	TokenNameIdentifier	 FUNC  SUM
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'string()' id. */	TokenNameCOMMENT_JAVADOC	 The 'string()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_STRING	TokenNameIdentifier	 FUNC  STRING
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'starts-with()' id. */	TokenNameCOMMENT_JAVADOC	 The 'starts-with()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_STARTS_WITH	TokenNameIdentifier	 FUNC  STARTS  WITH
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'contains()' id. */	TokenNameCOMMENT_JAVADOC	 The 'contains()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_CONTAINS	TokenNameIdentifier	 FUNC  CONTAINS
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'substring-before()' id. */	TokenNameCOMMENT_JAVADOC	 The 'substring-before()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_SUBSTRING_BEFORE	TokenNameIdentifier	 FUNC  SUBSTRING  BEFORE
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'substring-after()' id. */	TokenNameCOMMENT_JAVADOC	 The 'substring-after()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_SUBSTRING_AFTER	TokenNameIdentifier	 FUNC  SUBSTRING  AFTER
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'normalize-space()' id. */	TokenNameCOMMENT_JAVADOC	 The 'normalize-space()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_NORMALIZE_SPACE	TokenNameIdentifier	 FUNC  NORMALIZE  SPACE
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'translate()' id. */	TokenNameCOMMENT_JAVADOC	 The 'translate()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_TRANSLATE	TokenNameIdentifier	 FUNC  TRANSLATE
=	TokenNameEQUAL	
26	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'concat()' id. */	TokenNameCOMMENT_JAVADOC	 The 'concat()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_CONCAT	TokenNameIdentifier	 FUNC  CONCAT
=	TokenNameEQUAL	
27	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'substring()' id. */	TokenNameCOMMENT_JAVADOC	 The 'substring()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_SUBSTRING	TokenNameIdentifier	 FUNC  SUBSTRING
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'string-length()' id. */	TokenNameCOMMENT_JAVADOC	 The 'string-length()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_STRING_LENGTH	TokenNameIdentifier	 FUNC  STRING  LENGTH
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'system-property()' id. */	TokenNameCOMMENT_JAVADOC	 The 'system-property()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_SYSTEM_PROPERTY	TokenNameIdentifier	 FUNC  SYSTEM  PROPERTY
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'lang()' id. */	TokenNameCOMMENT_JAVADOC	 The 'lang()' id. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_LANG	TokenNameIdentifier	 FUNC  LANG
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'function-available()' id (XSLT). */	TokenNameCOMMENT_JAVADOC	 The 'function-available()' id (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_EXT_FUNCTION_AVAILABLE	TokenNameIdentifier	 FUNC  EXT  FUNCTION  AVAILABLE
=	TokenNameEQUAL	
33	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'element-available()' id (XSLT). */	TokenNameCOMMENT_JAVADOC	 The 'element-available()' id (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_EXT_ELEM_AVAILABLE	TokenNameIdentifier	 FUNC  EXT  ELEM  AVAILABLE
=	TokenNameEQUAL	
34	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The 'unparsed-entity-uri()' id (XSLT). */	TokenNameCOMMENT_JAVADOC	 The 'unparsed-entity-uri()' id (XSLT). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_UNPARSED_ENTITY_URI	TokenNameIdentifier	 FUNC  UNPARSED  ENTITY  URI
=	TokenNameEQUAL	
36	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Proprietary 	TokenNameCOMMENT_LINE	Proprietary 
/** The 'document-location()' id (Proprietary). */	TokenNameCOMMENT_JAVADOC	 The 'document-location()' id (Proprietary). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FUNC_DOCLOCATION	TokenNameIdentifier	 FUNC  DOCLOCATION
=	TokenNameEQUAL	
35	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The function table. */	TokenNameCOMMENT_JAVADOC	 The function table. 
private	TokenNameprivate	
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Table of function name to function ID associations. */	TokenNameCOMMENT_JAVADOC	 Table of function name to function ID associations. 
private	TokenNameprivate	
static	TokenNamestatic	
HashMap	TokenNameIdentifier	 Hash Map
m_functionID	TokenNameIdentifier	 m function ID
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The function table contains customized functions */	TokenNameCOMMENT_JAVADOC	 The function table contains customized functions 
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
m_functions_customer	TokenNameIdentifier	 m functions customer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
NUM_ALLOWABLE_ADDINS	TokenNameIdentifier	 NUM  ALLOWABLE  ADDINS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Table of function name to function ID associations for customized functions */	TokenNameCOMMENT_JAVADOC	 Table of function name to function ID associations for customized functions 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
m_functionID_customer	TokenNameIdentifier	 m function ID customer
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Number of built in functions. Be sure to update this as * built-in functions are added. */	TokenNameCOMMENT_JAVADOC	 Number of built in functions. Be sure to update this as built-in functions are added. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
=	TokenNameEQUAL	
37	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Number of built-in functions that may be added. */	TokenNameCOMMENT_JAVADOC	 Number of built-in functions that may be added. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUM_ALLOWABLE_ADDINS	TokenNameIdentifier	 NUM  ALLOWABLE  ADDINS
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The index to the next free function index. */	TokenNameCOMMENT_JAVADOC	 The index to the next free function index. 
private	TokenNameprivate	
int	TokenNameint	
m_funcNextFreeIndex	TokenNameIdentifier	 m func Next Free Index
=	TokenNameEQUAL	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
m_functions	TokenNameIdentifier	 m functions
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_CURRENT	TokenNameIdentifier	 FUNC  CURRENT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncCurrent	TokenNameIdentifier	 Func Current
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_LAST	TokenNameIdentifier	 FUNC  LAST
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncLast	TokenNameIdentifier	 Func Last
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_POSITION	TokenNameIdentifier	 FUNC  POSITION
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncPosition	TokenNameIdentifier	 Func Position
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_COUNT	TokenNameIdentifier	 FUNC  COUNT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncCount	TokenNameIdentifier	 Func Count
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_ID	TokenNameIdentifier	 FUNC  ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncId	TokenNameIdentifier	 Func Id
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_KEY	TokenNameIdentifier	 FUNC  KEY
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
FuncKey	TokenNameIdentifier	 Func Key
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_LOCAL_PART	TokenNameIdentifier	 FUNC  LOCAL  PART
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncLocalPart	TokenNameIdentifier	 Func Local Part
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_NAMESPACE	TokenNameIdentifier	 FUNC  NAMESPACE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncNamespace	TokenNameIdentifier	 Func Namespace
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_QNAME	TokenNameIdentifier	 FUNC  QNAME
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncQname	TokenNameIdentifier	 Func Qname
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_GENERATE_ID	TokenNameIdentifier	 FUNC  GENERATE  ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncGenerateId	TokenNameIdentifier	 Func Generate Id
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_NOT	TokenNameIdentifier	 FUNC  NOT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncNot	TokenNameIdentifier	 Func Not
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_TRUE	TokenNameIdentifier	 FUNC  TRUE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncTrue	TokenNameIdentifier	 Func True
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_FALSE	TokenNameIdentifier	 FUNC  FALSE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncFalse	TokenNameIdentifier	 Func False
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_BOOLEAN	TokenNameIdentifier	 FUNC  BOOLEAN
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncBoolean	TokenNameIdentifier	 Func Boolean
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_LANG	TokenNameIdentifier	 FUNC  LANG
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncLang	TokenNameIdentifier	 Func Lang
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_NUMBER	TokenNameIdentifier	 FUNC  NUMBER
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncNumber	TokenNameIdentifier	 Func Number
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_FLOOR	TokenNameIdentifier	 FUNC  FLOOR
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncFloor	TokenNameIdentifier	 Func Floor
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_CEILING	TokenNameIdentifier	 FUNC  CEILING
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncCeiling	TokenNameIdentifier	 Func Ceiling
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_ROUND	TokenNameIdentifier	 FUNC  ROUND
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncRound	TokenNameIdentifier	 Func Round
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_SUM	TokenNameIdentifier	 FUNC  SUM
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncSum	TokenNameIdentifier	 Func Sum
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_STRING	TokenNameIdentifier	 FUNC  STRING
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncString	TokenNameIdentifier	 Func String
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_STARTS_WITH	TokenNameIdentifier	 FUNC  STARTS  WITH
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncStartsWith	TokenNameIdentifier	 Func Starts With
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_CONTAINS	TokenNameIdentifier	 FUNC  CONTAINS
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncContains	TokenNameIdentifier	 Func Contains
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_SUBSTRING_BEFORE	TokenNameIdentifier	 FUNC  SUBSTRING  BEFORE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncSubstringBefore	TokenNameIdentifier	 Func Substring Before
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_SUBSTRING_AFTER	TokenNameIdentifier	 FUNC  SUBSTRING  AFTER
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncSubstringAfter	TokenNameIdentifier	 Func Substring After
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_NORMALIZE_SPACE	TokenNameIdentifier	 FUNC  NORMALIZE  SPACE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncNormalizeSpace	TokenNameIdentifier	 Func Normalize Space
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_TRANSLATE	TokenNameIdentifier	 FUNC  TRANSLATE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncTranslate	TokenNameIdentifier	 Func Translate
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_CONCAT	TokenNameIdentifier	 FUNC  CONCAT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncConcat	TokenNameIdentifier	 Func Concat
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_SYSTEM_PROPERTY	TokenNameIdentifier	 FUNC  SYSTEM  PROPERTY
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncSystemProperty	TokenNameIdentifier	 Func System Property
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_EXT_FUNCTION_AVAILABLE	TokenNameIdentifier	 FUNC  EXT  FUNCTION  AVAILABLE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncExtFunctionAvailable	TokenNameIdentifier	 Func Ext Function Available
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_EXT_ELEM_AVAILABLE	TokenNameIdentifier	 FUNC  EXT  ELEM  AVAILABLE
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncExtElementAvailable	TokenNameIdentifier	 Func Ext Element Available
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_SUBSTRING	TokenNameIdentifier	 FUNC  SUBSTRING
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncSubstring	TokenNameIdentifier	 Func Substring
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_STRING_LENGTH	TokenNameIdentifier	 FUNC  STRING  LENGTH
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncStringLength	TokenNameIdentifier	 Func String Length
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_DOCLOCATION	TokenNameIdentifier	 FUNC  DOCLOCATION
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncDoclocation	TokenNameIdentifier	 Func Doclocation
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
FUNC_UNPARSED_ENTITY_URI	TokenNameIdentifier	 FUNC  UNPARSED  ENTITY  URI
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncUnparsedEntityURI	TokenNameIdentifier	 Func Unparsed Entity URI
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_CURRENT_STRING	TokenNameIdentifier	 FUNC  CURRENT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_CURRENT	TokenNameIdentifier	 FUNC  CURRENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_LAST_STRING	TokenNameIdentifier	 FUNC  LAST  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_LAST	TokenNameIdentifier	 FUNC  LAST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_POSITION_STRING	TokenNameIdentifier	 FUNC  POSITION  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_POSITION	TokenNameIdentifier	 FUNC  POSITION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_COUNT_STRING	TokenNameIdentifier	 FUNC  COUNT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_COUNT	TokenNameIdentifier	 FUNC  COUNT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_ID_STRING	TokenNameIdentifier	 FUNC  ID  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_ID	TokenNameIdentifier	 FUNC  ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_KEY_STRING	TokenNameIdentifier	 FUNC  KEY  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_KEY	TokenNameIdentifier	 FUNC  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_LOCAL_PART_STRING	TokenNameIdentifier	 FUNC  LOCAL  PART  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_LOCAL_PART	TokenNameIdentifier	 FUNC  LOCAL  PART
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_NAMESPACE_STRING	TokenNameIdentifier	 FUNC  NAMESPACE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_NAMESPACE	TokenNameIdentifier	 FUNC  NAMESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_NAME_STRING	TokenNameIdentifier	 FUNC  NAME  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_QNAME	TokenNameIdentifier	 FUNC  QNAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_GENERATE_ID_STRING	TokenNameIdentifier	 FUNC  GENERATE  ID  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_GENERATE_ID	TokenNameIdentifier	 FUNC  GENERATE  ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_NOT_STRING	TokenNameIdentifier	 FUNC  NOT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_NOT	TokenNameIdentifier	 FUNC  NOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_TRUE_STRING	TokenNameIdentifier	 FUNC  TRUE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_TRUE	TokenNameIdentifier	 FUNC  TRUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_FALSE_STRING	TokenNameIdentifier	 FUNC  FALSE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_FALSE	TokenNameIdentifier	 FUNC  FALSE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_BOOLEAN_STRING	TokenNameIdentifier	 FUNC  BOOLEAN  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_BOOLEAN	TokenNameIdentifier	 FUNC  BOOLEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_LANG_STRING	TokenNameIdentifier	 FUNC  LANG  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_LANG	TokenNameIdentifier	 FUNC  LANG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_NUMBER_STRING	TokenNameIdentifier	 FUNC  NUMBER  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_NUMBER	TokenNameIdentifier	 FUNC  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_FLOOR_STRING	TokenNameIdentifier	 FUNC  FLOOR  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_FLOOR	TokenNameIdentifier	 FUNC  FLOOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_CEILING_STRING	TokenNameIdentifier	 FUNC  CEILING  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_CEILING	TokenNameIdentifier	 FUNC  CEILING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_ROUND_STRING	TokenNameIdentifier	 FUNC  ROUND  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_ROUND	TokenNameIdentifier	 FUNC  ROUND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_SUM_STRING	TokenNameIdentifier	 FUNC  SUM  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_SUM	TokenNameIdentifier	 FUNC  SUM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_STRING_STRING	TokenNameIdentifier	 FUNC  STRING  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_STRING	TokenNameIdentifier	 FUNC  STRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_STARTS_WITH_STRING	TokenNameIdentifier	 FUNC  STARTS  WITH  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_STARTS_WITH	TokenNameIdentifier	 FUNC  STARTS  WITH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_CONTAINS_STRING	TokenNameIdentifier	 FUNC  CONTAINS  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_CONTAINS	TokenNameIdentifier	 FUNC  CONTAINS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_SUBSTRING_BEFORE_STRING	TokenNameIdentifier	 FUNC  SUBSTRING  BEFORE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_SUBSTRING_BEFORE	TokenNameIdentifier	 FUNC  SUBSTRING  BEFORE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_SUBSTRING_AFTER_STRING	TokenNameIdentifier	 FUNC  SUBSTRING  AFTER  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_SUBSTRING_AFTER	TokenNameIdentifier	 FUNC  SUBSTRING  AFTER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_NORMALIZE_SPACE_STRING	TokenNameIdentifier	 FUNC  NORMALIZE  SPACE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_NORMALIZE_SPACE	TokenNameIdentifier	 FUNC  NORMALIZE  SPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_TRANSLATE_STRING	TokenNameIdentifier	 FUNC  TRANSLATE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_TRANSLATE	TokenNameIdentifier	 FUNC  TRANSLATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_CONCAT_STRING	TokenNameIdentifier	 FUNC  CONCAT  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_CONCAT	TokenNameIdentifier	 FUNC  CONCAT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_SYSTEM_PROPERTY_STRING	TokenNameIdentifier	 FUNC  SYSTEM  PROPERTY  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_SYSTEM_PROPERTY	TokenNameIdentifier	 FUNC  SYSTEM  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_EXT_FUNCTION_AVAILABLE_STRING	TokenNameIdentifier	 FUNC  EXT  FUNCTION  AVAILABLE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_EXT_FUNCTION_AVAILABLE	TokenNameIdentifier	 FUNC  EXT  FUNCTION  AVAILABLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_EXT_ELEM_AVAILABLE_STRING	TokenNameIdentifier	 FUNC  EXT  ELEM  AVAILABLE  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_EXT_ELEM_AVAILABLE	TokenNameIdentifier	 FUNC  EXT  ELEM  AVAILABLE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_SUBSTRING_STRING	TokenNameIdentifier	 FUNC  SUBSTRING  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_SUBSTRING	TokenNameIdentifier	 FUNC  SUBSTRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_STRING_LENGTH_STRING	TokenNameIdentifier	 FUNC  STRING  LENGTH  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_STRING_LENGTH	TokenNameIdentifier	 FUNC  STRING  LENGTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_UNPARSED_ENTITY_URI_STRING	TokenNameIdentifier	 FUNC  UNPARSED  ENTITY  URI  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_UNPARSED_ENTITY_URI	TokenNameIdentifier	 FUNC  UNPARSED  ENTITY  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Keywords	TokenNameIdentifier	 Keywords
.	TokenNameDOT	
FUNC_DOCLOCATION_STRING	TokenNameIdentifier	 FUNC  DOCLOCATION  STRING
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
FunctionTable	TokenNameIdentifier	 Function Table
.	TokenNameDOT	
FUNC_DOCLOCATION	TokenNameIdentifier	 FUNC  DOCLOCATION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FunctionTable	TokenNameIdentifier	 Function Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Return the name of the a function in the static table. Needed to avoid * making the table publicly available. */	TokenNameCOMMENT_JAVADOC	 Return the name of the a function in the static table. Needed to avoid making the table publicly available. 
String	TokenNameIdentifier	 String
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
int	TokenNameint	
funcID	TokenNameIdentifier	 func ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
funcID	TokenNameIdentifier	 func ID
<	TokenNameLESS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
)	TokenNameRPAREN	
return	TokenNamereturn	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
funcID	TokenNameIdentifier	 func ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_functions_customer	TokenNameIdentifier	 m functions customer
[	TokenNameLBRACKET	
funcID	TokenNameIdentifier	 func ID
-	TokenNameMINUS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
]	TokenNameRBRACKET	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain a new Function object from a function ID. * * @param which The function ID, which may correspond to one of the FUNC_XXX * values found in {@link org.apache.xpath.compiler.FunctionTable}, but may * be a value installed by an external module. * * @return a a new Function instance. * * @throws javax.xml.transform.TransformerException if ClassNotFoundException, * IllegalAccessException, or InstantiationException is thrown. */	TokenNameCOMMENT_JAVADOC	 Obtain a new Function object from a function ID. * @param which The function ID, which may correspond to one of the FUNC_XXX values found in {@link org.apache.xpath.compiler.FunctionTable}, but may be a value installed by an external module. * @return a a new Function instance. * @throws javax.xml.transform.TransformerException if ClassNotFoundException, IllegalAccessException, or InstantiationException is thrown. 
Function	TokenNameIdentifier	 Function
getFunction	TokenNameIdentifier	 get Function
(	TokenNameLPAREN	
int	TokenNameint	
which	TokenNameIdentifier	 which
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
which	TokenNameIdentifier	 which
<	TokenNameLESS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
m_functions	TokenNameIdentifier	 m functions
[	TokenNameLBRACKET	
which	TokenNameIdentifier	 which
]	TokenNameRBRACKET	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
Function	TokenNameIdentifier	 Function
)	TokenNameRPAREN	
m_functions_customer	TokenNameIdentifier	 m functions customer
[	TokenNameLBRACKET	
which	TokenNameIdentifier	 which
-	TokenNameMINUS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
]	TokenNameRBRACKET	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Obtain a function ID from a given function name * @param key the function name in a java.lang.String format. * @return a function ID, which may correspond to one of the FUNC_XXX values * found in {@link org.apache.xpath.compiler.FunctionTable}, but may be a * value installed by an external module. */	TokenNameCOMMENT_JAVADOC	 Obtain a function ID from a given function name @param key the function name in a java.lang.String format. @return a function ID, which may correspond to one of the FUNC_XXX values found in {@link org.apache.xpath.compiler.FunctionTable}, but may be a value installed by an external module. 
Object	TokenNameIdentifier	 Object
getFunctionID	TokenNameIdentifier	 get Function ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
m_functionID_customer	TokenNameIdentifier	 m function ID customer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Install a built-in function. * @param name The unqualified name of the function, must not be null * @param func A Implementation of an XPath Function object. * @return the position of the function in the internal index. */	TokenNameCOMMENT_JAVADOC	 Install a built-in function. @param name The unqualified name of the function, must not be null @param func A Implementation of an XPath Function object. @return the position of the function in the internal index. 
public	TokenNamepublic	
int	TokenNameint	
installFunction	TokenNameIdentifier	 install Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
funcIndex	TokenNameIdentifier	 func Index
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
funcIndexObj	TokenNameIdentifier	 func Index Obj
=	TokenNameEQUAL	
getFunctionID	TokenNameIdentifier	 get Function ID
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
funcIndexObj	TokenNameIdentifier	 func Index Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
funcIndex	TokenNameIdentifier	 func Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
funcIndexObj	TokenNameIdentifier	 func Index Obj
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
funcIndex	TokenNameIdentifier	 func Index
<	TokenNameLESS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
funcIndex	TokenNameIdentifier	 func Index
=	TokenNameEQUAL	
m_funcNextFreeIndex	TokenNameIdentifier	 m func Next Free Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
m_functionID_customer	TokenNameIdentifier	 m function ID customer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
funcIndex	TokenNameIdentifier	 func Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_functions_customer	TokenNameIdentifier	 m functions customer
[	TokenNameLBRACKET	
funcIndex	TokenNameIdentifier	 func Index
-	TokenNameMINUS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
func	TokenNameIdentifier	 func
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
funcIndex	TokenNameIdentifier	 func Index
=	TokenNameEQUAL	
m_funcNextFreeIndex	TokenNameIdentifier	 m func Next Free Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
m_functions_customer	TokenNameIdentifier	 m functions customer
[	TokenNameLBRACKET	
funcIndex	TokenNameIdentifier	 func Index
-	TokenNameMINUS	
NUM_BUILT_IN_FUNCS	TokenNameIdentifier	 NUM  BUILT  IN  FUNCS
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
func	TokenNameIdentifier	 func
;	TokenNameSEMICOLON	
m_functionID_customer	TokenNameIdentifier	 m function ID customer
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
funcIndex	TokenNameIdentifier	 func Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
funcIndex	TokenNameIdentifier	 func Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if a built-in, non-namespaced function is available. * * @param methName The local name of the function. * * @return True if the function can be executed. */	TokenNameCOMMENT_JAVADOC	 Tell if a built-in, non-namespaced function is available. * @param methName The local name of the function. * @return True if the function can be executed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
functionAvailable	TokenNameIdentifier	 function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
methName	TokenNameIdentifier	 meth Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
tblEntry	TokenNameIdentifier	 tbl Entry
=	TokenNameEQUAL	
m_functionID	TokenNameIdentifier	 m function ID
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
methName	TokenNameIdentifier	 meth Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
tblEntry	TokenNameIdentifier	 tbl Entry
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
tblEntry	TokenNameIdentifier	 tbl Entry
=	TokenNameEQUAL	
m_functionID_customer	TokenNameIdentifier	 m function ID customer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
methName	TokenNameIdentifier	 meth Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
tblEntry	TokenNameIdentifier	 tbl Entry
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

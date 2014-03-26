/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
antlr	TokenNameIdentifier	 antlr
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
ANTLRStringStream	TokenNameIdentifier	 ANTLR String Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
antlr	TokenNameIdentifier	 antlr
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
CharStream	TokenNameIdentifier	 Char Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
antlr	TokenNameIdentifier	 antlr
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
CommonTokenStream	TokenNameIdentifier	 Common Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
antlr	TokenNameIdentifier	 antlr
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
Tree	TokenNameIdentifier	 Tree
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
CfDef	TokenNameIdentifier	 Cf Def
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
.	TokenNameDOT	
KsDef	TokenNameIdentifier	 Ks Def
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CliCompiler	TokenNameIdentifier	 Cli Compiler
{	TokenNameLBRACE	
// ANTLR does not provide case-insensitive tokenization support 	TokenNameCOMMENT_LINE	ANTLR does not provide case-insensitive tokenization support 
// out of the box. So we override the LA (lookahead) function 	TokenNameCOMMENT_LINE	out of the box. So we override the LA (lookahead) function 
// of the ANTLRStringStream class. Note: This doesn't change the 	TokenNameCOMMENT_LINE	of the ANTLRStringStream class. Note: This doesn't change the 
// token text-- but just relaxes the matching rules to match 	TokenNameCOMMENT_LINE	token text-- but just relaxes the matching rules to match 
// in upper case. [Logic borrowed from Hive code.] 	TokenNameCOMMENT_LINE	in upper case. [Logic borrowed from Hive code.] 
// 	TokenNameCOMMENT_LINE	 
// Also see discussion on this topic in: 	TokenNameCOMMENT_LINE	Also see discussion on this topic in: 
// http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782. 	TokenNameCOMMENT_LINE	http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ANTLRNoCaseStringStream	TokenNameIdentifier	 ANTLR No Case String Stream
extends	TokenNameextends	
ANTLRStringStream	TokenNameIdentifier	 ANTLR String Stream
{	TokenNameLBRACE	
public	TokenNamepublic	
ANTLRNoCaseStringStream	TokenNameIdentifier	 ANTLR No Case String Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
returnChar	TokenNameIdentifier	 return Char
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
LA	TokenNameIdentifier	 LA
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
returnChar	TokenNameIdentifier	 return Char
==	TokenNameEQUAL_EQUAL	
CharStream	TokenNameIdentifier	 Char Stream
.	TokenNameDOT	
EOF	TokenNameIdentifier	 EOF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnChar	TokenNameIdentifier	 return Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
returnChar	TokenNameIdentifier	 return Char
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnChar	TokenNameIdentifier	 return Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
returnChar	TokenNameIdentifier	 return Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Tree	TokenNameIdentifier	 Tree
compileQuery	TokenNameIdentifier	 compile Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tree	TokenNameIdentifier	 Tree
queryTree	TokenNameIdentifier	 query Tree
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ANTLRStringStream	TokenNameIdentifier	 ANTLR String Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
ANTLRNoCaseStringStream	TokenNameIdentifier	 ANTLR No Case String Stream
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CliLexer	TokenNameIdentifier	 Cli Lexer
lexer	TokenNameIdentifier	 lexer
=	TokenNameEQUAL	
new	TokenNamenew	
CliLexer	TokenNameIdentifier	 Cli Lexer
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CommonTokenStream	TokenNameIdentifier	 Common Token Stream
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
CommonTokenStream	TokenNameIdentifier	 Common Token Stream
(	TokenNameLPAREN	
lexer	TokenNameIdentifier	 lexer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CliParser	TokenNameIdentifier	 Cli Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
CliParser	TokenNameIdentifier	 Cli Parser
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// start parsing... 	TokenNameCOMMENT_LINE	start parsing... 
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Tree	TokenNameIdentifier	 Tree
)	TokenNameRPAREN	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
root	TokenNameIdentifier	 root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTree	TokenNameIdentifier	 get Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// semantic analysis if any... 	TokenNameCOMMENT_LINE	semantic analysis if any... 
// [tbd] 	TokenNameCOMMENT_LINE	[tbd] 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if there was an exception we don't want to process request any further 	TokenNameCOMMENT_LINE	if there was an exception we don't want to process request any further 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
queryTree	TokenNameIdentifier	 query Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * NODE_COLUMN_ACCESS related functions. */	TokenNameCOMMENT_BLOCK	 NODE_COLUMN_ACCESS related functions. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
Tree	TokenNameIdentifier	 Tree
astNode	TokenNameIdentifier	 ast Node
,	TokenNameCOMMA	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CfDef	TokenNameIdentifier	 Cf Def
>	TokenNameGREATER	
cfDefs	TokenNameIdentifier	 cf Defs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
unescapeSQLString	TokenNameIdentifier	 unescape SQL String
(	TokenNameLPAREN	
astNode	TokenNameIdentifier	 ast Node
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfDefs	TokenNameIdentifier	 cf Defs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CfDef	TokenNameIdentifier	 Cf Def
>	TokenNameGREATER	
cfDefs	TokenNameIdentifier	 cf Defs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lastMatchedName	TokenNameIdentifier	 last Matched Name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CfDef	TokenNameIdentifier	 Cf Def
cfDef	TokenNameIdentifier	 cf Def
:	TokenNameCOLON	
cfDefs	TokenNameIdentifier	 cf Defs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cfDef	TokenNameIdentifier	 cf Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfName	TokenNameIdentifier	 cf Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cfDef	TokenNameIdentifier	 cf Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
cfName	TokenNameIdentifier	 cf Name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastMatchedName	TokenNameIdentifier	 last Matched Name
=	TokenNameEQUAL	
cfDef	TokenNameIdentifier	 cf Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
matches	TokenNameIdentifier	 matches
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
matches	TokenNameIdentifier	 matches
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
cfName	TokenNameIdentifier	 cf Name
+	TokenNamePLUS	
" not found in current keyspace."	TokenNameStringLiteral	 not found in current keyspace.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastMatchedName	TokenNameIdentifier	 last Matched Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getKeySpace	TokenNameIdentifier	 get Key Space
(	TokenNameLPAREN	
Tree	TokenNameIdentifier	 Tree
statement	TokenNameIdentifier	 statement
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
KsDef	TokenNameIdentifier	 Ks Def
>	TokenNameGREATER	
keyspaces	TokenNameIdentifier	 keyspaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getKeySpace	TokenNameIdentifier	 get Key Space
(	TokenNameLPAREN	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
unescapeSQLString	TokenNameIdentifier	 unescape SQL String
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
keyspaces	TokenNameIdentifier	 keyspaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getKeySpace	TokenNameIdentifier	 get Key Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
KsDef	TokenNameIdentifier	 Ks Def
>	TokenNameGREATER	
keyspaces	TokenNameIdentifier	 keyspaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lastMatchedName	TokenNameIdentifier	 last Matched Name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
KsDef	TokenNameIdentifier	 Ks Def
ksDef	TokenNameIdentifier	 ks Def
:	TokenNameCOLON	
keyspaces	TokenNameIdentifier	 keyspaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ksDef	TokenNameIdentifier	 ks Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ksName	TokenNameIdentifier	 ks Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ksDef	TokenNameIdentifier	 ks Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastMatchedName	TokenNameIdentifier	 last Matched Name
=	TokenNameEQUAL	
ksDef	TokenNameIdentifier	 ks Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
matches	TokenNameIdentifier	 matches
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matches	TokenNameIdentifier	 matches
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
matches	TokenNameIdentifier	 matches
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Keyspace '"	TokenNameStringLiteral	Keyspace '
+	TokenNamePLUS	
ksName	TokenNameIdentifier	 ks Name
+	TokenNamePLUS	
"' not found."	TokenNameStringLiteral	' not found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastMatchedName	TokenNameIdentifier	 last Matched Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
Tree	TokenNameIdentifier	 Tree
astNode	TokenNameIdentifier	 ast Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
unescapeSQLString	TokenNameIdentifier	 unescape SQL String
(	TokenNameLPAREN	
astNode	TokenNameIdentifier	 ast Node
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
numColumnSpecifiers	TokenNameIdentifier	 num Column Specifiers
(	TokenNameLPAREN	
Tree	TokenNameIdentifier	 Tree
astNode	TokenNameIdentifier	 ast Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Skip over table, column family and rowKey 	TokenNameCOMMENT_LINE	Skip over table, column family and rowKey 
return	TokenNamereturn	
astNode	TokenNameIdentifier	 ast Node
.	TokenNameDOT	
getChildCount	TokenNameIdentifier	 get Child Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Returns the pos'th (0-based index) column specifier in the astNode 	TokenNameCOMMENT_LINE	Returns the pos'th (0-based index) column specifier in the astNode 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
Tree	TokenNameIdentifier	 Tree
astNode	TokenNameIdentifier	 ast Node
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Skip over table, column family and rowKey 	TokenNameCOMMENT_LINE	Skip over table, column family and rowKey 
return	TokenNamereturn	
CliUtils	TokenNameIdentifier	 Cli Utils
.	TokenNameDOT	
unescapeSQLString	TokenNameIdentifier	 unescape SQL String
(	TokenNameLPAREN	
astNode	TokenNameIdentifier	 ast Node
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	

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
jline	TokenNameIdentifier	 jline
.	TokenNameDOT	
SimpleCompletor	TokenNameIdentifier	 Simple Completor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CliCompleter	TokenNameIdentifier	 Cli Completer
extends	TokenNameextends	
SimpleCompletor	TokenNameIdentifier	 Simple Completor
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
commands	TokenNameIdentifier	 commands
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"connect"	TokenNameStringLiteral	connect
,	TokenNameCOMMA	
"describe keyspace"	TokenNameStringLiteral	describe keyspace
,	TokenNameCOMMA	
"exit"	TokenNameStringLiteral	exit
,	TokenNameCOMMA	
"help"	TokenNameStringLiteral	help
,	TokenNameCOMMA	
"quit"	TokenNameStringLiteral	quit
,	TokenNameCOMMA	
"show cluster name"	TokenNameStringLiteral	show cluster name
,	TokenNameCOMMA	
"show keyspaces"	TokenNameStringLiteral	show keyspaces
,	TokenNameCOMMA	
"show schema"	TokenNameStringLiteral	show schema
,	TokenNameCOMMA	
"show api version"	TokenNameStringLiteral	show api version
,	TokenNameCOMMA	
"create keyspace"	TokenNameStringLiteral	create keyspace
,	TokenNameCOMMA	
"create column family"	TokenNameStringLiteral	create column family
,	TokenNameCOMMA	
"drop keyspace"	TokenNameStringLiteral	drop keyspace
,	TokenNameCOMMA	
"drop column family"	TokenNameStringLiteral	drop column family
,	TokenNameCOMMA	
"rename keyspace"	TokenNameStringLiteral	rename keyspace
,	TokenNameCOMMA	
"rename column family"	TokenNameStringLiteral	rename column family
,	TokenNameCOMMA	
"consistencylevel"	TokenNameStringLiteral	consistencylevel
,	TokenNameCOMMA	
"help connect"	TokenNameStringLiteral	help connect
,	TokenNameCOMMA	
"help describe keyspace"	TokenNameStringLiteral	help describe keyspace
,	TokenNameCOMMA	
"help exit"	TokenNameStringLiteral	help exit
,	TokenNameCOMMA	
"help help"	TokenNameStringLiteral	help help
,	TokenNameCOMMA	
"help quit"	TokenNameStringLiteral	help quit
,	TokenNameCOMMA	
"help show cluster name"	TokenNameStringLiteral	help show cluster name
,	TokenNameCOMMA	
"help show keyspaces"	TokenNameStringLiteral	help show keyspaces
,	TokenNameCOMMA	
"help show schema"	TokenNameStringLiteral	help show schema
,	TokenNameCOMMA	
"help show api version"	TokenNameStringLiteral	help show api version
,	TokenNameCOMMA	
"help create keyspace"	TokenNameStringLiteral	help create keyspace
,	TokenNameCOMMA	
"help create column family"	TokenNameStringLiteral	help create column family
,	TokenNameCOMMA	
"help drop keyspace"	TokenNameStringLiteral	help drop keyspace
,	TokenNameCOMMA	
"help drop column family"	TokenNameStringLiteral	help drop column family
,	TokenNameCOMMA	
"help rename keyspace"	TokenNameStringLiteral	help rename keyspace
,	TokenNameCOMMA	
"help rename column family"	TokenNameStringLiteral	help rename column family
,	TokenNameCOMMA	
"help get"	TokenNameStringLiteral	help get
,	TokenNameCOMMA	
"help set"	TokenNameStringLiteral	help set
,	TokenNameCOMMA	
"help del"	TokenNameStringLiteral	help del
,	TokenNameCOMMA	
"help count"	TokenNameStringLiteral	help count
,	TokenNameCOMMA	
"help list"	TokenNameStringLiteral	help list
,	TokenNameCOMMA	
"help truncate"	TokenNameStringLiteral	help truncate
,	TokenNameCOMMA	
"help consistencylevel"	TokenNameStringLiteral	help consistencylevel
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keyspaceCommands	TokenNameIdentifier	 keyspace Commands
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"get"	TokenNameStringLiteral	get
,	TokenNameCOMMA	
"set"	TokenNameStringLiteral	set
,	TokenNameCOMMA	
"count"	TokenNameStringLiteral	count
,	TokenNameCOMMA	
"del"	TokenNameStringLiteral	del
,	TokenNameCOMMA	
"list"	TokenNameStringLiteral	list
,	TokenNameCOMMA	
"truncate"	TokenNameStringLiteral	truncate
,	TokenNameCOMMA	
"incr"	TokenNameStringLiteral	incr
,	TokenNameCOMMA	
"decr"	TokenNameStringLiteral	decr
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CliCompleter	TokenNameIdentifier	 Cli Completer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
commands	TokenNameIdentifier	 commands
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getKeyspaceCommands	TokenNameIdentifier	 get Keyspace Commands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyspaceCommands	TokenNameIdentifier	 keyspace Commands
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
